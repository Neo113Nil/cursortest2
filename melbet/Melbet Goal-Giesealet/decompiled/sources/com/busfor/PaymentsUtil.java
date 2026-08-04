package com.busfor;

import android.app.Activity;
import com.facebook.react.bridge.ReadableMap;
import com.google.android.gms.wallet.PaymentsClient;
import com.google.android.gms.wallet.Wallet;
import java.util.ArrayList;
import java.util.Collection;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class PaymentsUtil {
    private PaymentsUtil() {
    }

    private static JSONObject getBaseRequest() throws JSONException {
        return new JSONObject().put("apiVersion", 2).put("apiVersionMinor", 0);
    }

    private static JSONObject getBaseCardPaymentMethod(ArrayList arrayList, ArrayList arrayList2) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("type", "CARD");
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put("allowedAuthMethods", new JSONArray((Collection) arrayList2));
        jSONObject2.put("allowedCardNetworks", new JSONArray((Collection) arrayList));
        jSONObject.put("parameters", jSONObject2);
        return jSONObject;
    }

    public static PaymentsClient createPaymentsClient(int i, Activity activity) {
        return Wallet.getPaymentsClient(activity, new Wallet.WalletOptions.Builder().setEnvironment(i).build());
    }

    public static JSONObject getIsReadyToPayRequest(ArrayList arrayList, ArrayList arrayList2) {
        try {
            JSONObject baseRequest = getBaseRequest();
            baseRequest.put("allowedPaymentMethods", new JSONArray().put(getBaseCardPaymentMethod(arrayList, arrayList2)));
            return baseRequest;
        } catch (JSONException unused) {
            return null;
        }
    }

    private static JSONObject getTransactionInfo(ReadableMap readableMap) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("totalPrice", readableMap.getString("totalPrice"));
        jSONObject.put("totalPriceStatus", readableMap.getString("totalPriceStatus"));
        jSONObject.put("currencyCode", readableMap.getString("currencyCode"));
        return jSONObject;
    }

    private static JSONObject getMerchantInfo(String str) throws JSONException {
        return new JSONObject().put("merchantName", str);
    }

    private static JSONObject getTokenizationSpecification(ReadableMap readableMap) throws JSONException {
        return new JSONObject() { // from class: com.busfor.PaymentsUtil.1
            {
                put("type", ReadableMap.this.getString("type"));
                put("parameters", new JSONObject() { // from class: com.busfor.PaymentsUtil.1.1
                    {
                        if (ReadableMap.this.hasKey("gateway")) {
                            put("gateway", ReadableMap.this.getString("gateway"));
                        }
                        if (ReadableMap.this.hasKey("gatewayMerchantId")) {
                            put("gatewayMerchantId", ReadableMap.this.getString("gatewayMerchantId"));
                        }
                        if (ReadableMap.this.hasKey("publicKey")) {
                            put("protocolVersion", "ECv2");
                            put("publicKey", ReadableMap.this.getString("publicKey"));
                        }
                        if (ReadableMap.this.hasKey("stripe")) {
                            ReadableMap map = ReadableMap.this.getMap("stripe");
                            put("stripe:publishableKey", map.getString("publishableKey"));
                            put("stripe:version", map.getString("version"));
                        }
                    }
                });
            }
        };
    }

    private static JSONObject getCardPaymentMethod(ReadableMap readableMap) throws JSONException {
        JSONObject baseCardPaymentMethod = getBaseCardPaymentMethod(readableMap.getArray("allowedCardNetworks").toArrayList(), readableMap.getArray("allowedCardAuthMethods").toArrayList());
        baseCardPaymentMethod.put("tokenizationSpecification", getTokenizationSpecification(readableMap.getMap("tokenizationSpecification")));
        return baseCardPaymentMethod;
    }

    public static JSONObject getPaymentDataRequest(ReadableMap readableMap) {
        try {
            JSONObject baseRequest = getBaseRequest();
            baseRequest.put("allowedPaymentMethods", new JSONArray().put(getCardPaymentMethod(readableMap.getMap("cardPaymentMethod"))));
            baseRequest.put("transactionInfo", getTransactionInfo(readableMap.getMap("transaction")));
            baseRequest.put("merchantInfo", getMerchantInfo(readableMap.getString("merchantName")));
            return baseRequest;
        } catch (JSONException unused) {
            return null;
        }
    }
}
