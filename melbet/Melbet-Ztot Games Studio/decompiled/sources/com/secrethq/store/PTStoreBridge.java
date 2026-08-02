package com.secrethq.store;

import android.app.ProgressDialog;
import android.util.Log;
import android.widget.Toast;
import com.secrethq.store.PTStoreBridge;
import com.secrethq.store.util.BillingDataSource;
import java.lang.ref.WeakReference;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.GlobalScope;
import org.cocos2dx.lib.Cocos2dxActivity;

/* loaded from: classes3.dex */
public class PTStoreBridge {
    private static final String TAG = "PTStoreBridge";
    private static Cocos2dxActivity activity = null;
    private static boolean inProgress = false;
    private static boolean readyToPurchase = false;
    private static WeakReference<Cocos2dxActivity> s_activity;
    private static BillingDataSource s_billingDataSource;

    public static native boolean isProductConsumable(String str);

    private static native String licenseKey();

    public static native void purchaseDidComplete(String str);

    public static native void purchaseDidCompleteRestoring(String str);

    public static void initBridge(Cocos2dxActivity cocos2dxActivity) {
        Log.i(TAG, "PTStoreBridge -- INIT");
        activity = cocos2dxActivity;
        s_activity = new WeakReference<>(activity);
        BillingDataSource billingDataSource = new BillingDataSource(activity, GlobalScope.INSTANCE);
        s_billingDataSource = billingDataSource;
        billingDataSource.initialize();
    }

    public static void beginLoadingProductDetails() {
        s_activity.get().runOnUiThread(new Runnable() { // from class: com.secrethq.store.PTStoreBridge$$ExternalSyntheticLambda5
            @Override // java.lang.Runnable
            public final void run() {
                PTStoreBridge.s_billingDataSource.loadProductDetails(PTStoreBridge.activity, new Function2() { // from class: com.secrethq.store.PTStoreBridge$$ExternalSyntheticLambda4
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return PTStoreBridge.lambda$beginLoadingProductDetails$1((Integer) obj, (String) obj2);
                    }
                });
            }
        });
    }

    static /* synthetic */ Void lambda$beginLoadingProductDetails$1(Integer num, final String str) {
        if (num.intValue() == s_billingDataSource.getBILLING_RESPONSE_RESULT_OK()) {
            readyToPurchase = true;
            return null;
        }
        s_activity.get().runOnUiThread(new Runnable() { // from class: com.secrethq.store.PTStoreBridge$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                Toast.makeText(PTStoreBridge.activity, str, 0).show();
            }
        });
        return null;
    }

    public static void purchase(final String str, final boolean z) {
        if (inProgress) {
            s_activity.get().runOnUiThread(new Runnable() { // from class: com.secrethq.store.PTStoreBridge$$ExternalSyntheticLambda2
                @Override // java.lang.Runnable
                public final void run() {
                    Toast.makeText(PTStoreBridge.activity, "An In-app purchase flow is already in progress.", 0).show();
                }
            });
        } else {
            inProgress = true;
            s_activity.get().runOnUiThread(new Runnable() { // from class: com.secrethq.store.PTStoreBridge$$ExternalSyntheticLambda3
                @Override // java.lang.Runnable
                public final void run() {
                    PTStoreBridge.s_billingDataSource.launchBillingFlow(PTStoreBridge.activity, r0, z, new Function2() { // from class: com.secrethq.store.PTStoreBridge$$ExternalSyntheticLambda1
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return PTStoreBridge.lambda$purchase$5(r1, (Integer) obj, (String) obj2);
                        }
                    });
                }
            });
        }
    }

    static /* synthetic */ Void lambda$purchase$5(String str, Integer num, final String str2) {
        if (num.intValue() == s_billingDataSource.getBILLING_RESPONSE_RESULT_OK() || num.intValue() == s_billingDataSource.getBILLING_RESPONSE_RESULT_ITEM_ALREADY_OWNED()) {
            purchaseDidComplete(str);
        } else {
            s_activity.get().runOnUiThread(new Runnable() { // from class: com.secrethq.store.PTStoreBridge$$ExternalSyntheticLambda6
                @Override // java.lang.Runnable
                public final void run() {
                    PTStoreBridge.lambda$purchase$4(str2);
                }
            });
        }
        inProgress = false;
        return null;
    }

    static /* synthetic */ void lambda$purchase$4(String str) {
        if (str != null) {
            Toast.makeText(activity, str, 0).show();
        } else {
            Toast.makeText(activity, "Unable to process the request. Please try again later.", 0).show();
        }
    }

    /* renamed from: com.secrethq.store.PTStoreBridge$1, reason: invalid class name */
    class AnonymousClass1 implements Runnable {
        AnonymousClass1() {
        }

        @Override // java.lang.Runnable
        public void run() {
            final ProgressDialog show = ProgressDialog.show(PTStoreBridge.activity, null, "Restoring purchases...", true);
            PTStoreBridge.s_billingDataSource.restorePreviousIAPs(PTStoreBridge.activity, new Function2() { // from class: com.secrethq.store.PTStoreBridge$1$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return PTStoreBridge.AnonymousClass1.lambda$run$1(show, (Integer) obj, (String) obj2);
                }
            });
        }

        static /* synthetic */ Void lambda$run$1(ProgressDialog progressDialog, Integer num, String str) {
            if (num.intValue() == PTStoreBridge.s_billingDataSource.getBILLING_RESPONSE_RESULT_OK()) {
                PTStoreBridge.purchaseDidCompleteRestoring(str);
                return null;
            }
            if (num.intValue() == PTStoreBridge.s_billingDataSource.getBILLING_RESPONSE_RESULT_RESTORE_COMPLETED()) {
                progressDialog.dismiss();
                Toast.makeText(PTStoreBridge.activity, "Successfully restored all the purchases.", 0).show();
                return null;
            }
            progressDialog.dismiss();
            ((Cocos2dxActivity) PTStoreBridge.s_activity.get()).runOnUiThread(new Runnable() { // from class: com.secrethq.store.PTStoreBridge$1$$ExternalSyntheticLambda0
                @Override // java.lang.Runnable
                public final void run() {
                    Toast.makeText(PTStoreBridge.activity, "Unable to restore purchases. Try again later.", 0).show();
                }
            });
            return null;
        }
    }

    public static void restorePurchases() {
        s_activity.get().runOnUiThread(new AnonymousClass1());
    }
}
