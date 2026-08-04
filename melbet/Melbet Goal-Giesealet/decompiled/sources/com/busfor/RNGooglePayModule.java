package com.busfor;

import android.app.Activity;
import android.content.Intent;
import android.util.Log;
import com.facebook.react.bridge.ActivityEventListener;
import com.facebook.react.bridge.BaseActivityEventListener;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.wallet.AutoResolveHelper;
import com.google.android.gms.wallet.IsReadyToPayRequest;
import com.google.android.gms.wallet.PaymentData;
import com.google.android.gms.wallet.PaymentDataRequest;
import com.google.android.gms.wallet.PaymentsClient;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class RNGooglePayModule extends ReactContextBaseJavaModule {
    private static final String ENVIRONMENT_PRODUCTION_KEY = "ENVIRONMENT_PRODUCTION";
    private static final String ENVIRONMENT_TEST_KEY = "ENVIRONMENT_TEST";
    private static final int LOAD_PAYMENT_DATA_REQUEST_CODE = 991;
    private static final String TAG = "ReactNative";
    private final ActivityEventListener activityEventListener;
    private PaymentsClient mPaymentsClient;
    private final ReactApplicationContext reactContext;
    private Promise requestPaymentPromise;

    public RNGooglePayModule(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
        this.requestPaymentPromise = null;
        BaseActivityEventListener baseActivityEventListener = new BaseActivityEventListener() { // from class: com.busfor.RNGooglePayModule.1
            @Override // com.facebook.react.bridge.BaseActivityEventListener, com.facebook.react.bridge.ActivityEventListener
            public void onActivityResult(Activity activity, int i, int i2, Intent intent) {
                if (i != RNGooglePayModule.LOAD_PAYMENT_DATA_REQUEST_CODE) {
                    return;
                }
                if (i2 == -1) {
                    RNGooglePayModule.this.handlePaymentSuccess(PaymentData.getFromIntent(intent));
                } else if (i2 == 0) {
                    RNGooglePayModule.this.requestPaymentPromise.reject("PAYMENT_RESULT_CANCELED", "Payment has been canceled");
                } else {
                    if (i2 != 1) {
                        return;
                    }
                    String format = String.format("loadPaymentData failed. Error code: %d", Integer.valueOf(AutoResolveHelper.getStatusFromIntent(intent).getStatusCode()));
                    Log.w("ReactNative", "[GooglePay] " + format);
                    RNGooglePayModule.this.requestPaymentPromise.reject("PAYMENT_RESULT_ERROR", format);
                }
            }
        };
        this.activityEventListener = baseActivityEventListener;
        this.reactContext = reactApplicationContext;
        reactApplicationContext.addActivityEventListener(baseActivityEventListener);
    }

    @Override // com.facebook.react.bridge.BaseJavaModule
    public Map<String, Object> getConstants() {
        HashMap hashMap = new HashMap();
        hashMap.put(ENVIRONMENT_PRODUCTION_KEY, 1);
        hashMap.put(ENVIRONMENT_TEST_KEY, 3);
        return hashMap;
    }

    @ReactMethod
    public void setEnvironment(int i) {
        Activity currentActivity = getCurrentActivity();
        if (currentActivity == null) {
            return;
        }
        this.mPaymentsClient = PaymentsUtil.createPaymentsClient(i, currentActivity);
    }

    @ReactMethod
    public void isReadyToPay(ReadableArray readableArray, ReadableArray readableArray2, final Promise promise) {
        Activity currentActivity = getCurrentActivity();
        if (currentActivity == null) {
            Log.w("ReactNative", "[GooglePay] activity is null");
            promise.resolve(false);
            return;
        }
        JSONObject isReadyToPayRequest = PaymentsUtil.getIsReadyToPayRequest(readableArray.toArrayList(), readableArray2.toArrayList());
        if (isReadyToPayRequest == null) {
            Log.w("ReactNative", "[GooglePay] isReadyToPayJson == null");
            promise.resolve(false);
            return;
        }
        IsReadyToPayRequest fromJson = IsReadyToPayRequest.fromJson(isReadyToPayRequest.toString());
        if (fromJson == null) {
            Log.w("ReactNative", "[GooglePay] IsReadyToPayRequest == null");
            promise.resolve(false);
        } else {
            this.mPaymentsClient.isReadyToPay(fromJson).addOnCompleteListener(currentActivity, new OnCompleteListener<Boolean>() { // from class: com.busfor.RNGooglePayModule.2
                @Override // com.google.android.gms.tasks.OnCompleteListener
                public void onComplete(Task<Boolean> task) {
                    if (!task.isSuccessful()) {
                        Log.w("ReactNative", "[GooglePay] isReadyToPay failed");
                        promise.resolve(false);
                    } else if (!task.getResult().booleanValue()) {
                        Log.w("ReactNative", "[GooglePay] Not available");
                        promise.resolve(false);
                    } else {
                        promise.resolve(true);
                    }
                }
            });
        }
    }

    @ReactMethod
    public void requestPayment(ReadableMap readableMap, Promise promise) {
        Activity currentActivity = getCurrentActivity();
        if (currentActivity == null) {
            Log.w("ReactNative", "[GooglePay] activity is null");
            promise.reject("NO_ACTIVITY", "activity is null");
            return;
        }
        JSONObject paymentDataRequest = PaymentsUtil.getPaymentDataRequest(readableMap);
        if (paymentDataRequest == null) {
            promise.reject("PAYMENT_DATA_REQUEST_JSON", "paymentDataRequestJson is null");
            return;
        }
        this.requestPaymentPromise = promise;
        PaymentDataRequest fromJson = PaymentDataRequest.fromJson(paymentDataRequest.toString());
        if (fromJson != null) {
            AutoResolveHelper.resolveTask(this.mPaymentsClient.loadPaymentData(fromJson), currentActivity, LOAD_PAYMENT_DATA_REQUEST_CODE);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void handlePaymentSuccess(PaymentData paymentData) {
        String json = paymentData.toJson();
        if (json == null) {
            this.requestPaymentPromise.reject("NULL_PAYMENT_INFORMATION", "paymentInformation is null");
            return;
        }
        try {
            this.requestPaymentPromise.resolve(new JSONObject(json).getJSONObject("paymentMethodData").getJSONObject("tokenizationData").getString("token"));
        } catch (JSONException e) {
            Log.e("ReactNative", "[GooglePay] handlePaymentSuccess error: " + e.toString());
        }
    }

    @Override // com.facebook.react.bridge.NativeModule
    public String getName() {
        return "RNGooglePay";
    }
}
