package com.crrepa.band.my.device.appmarket.openharmony.service;

import android.util.Log;
import com.crrepa.band.my.device.appmarket.openharmony.service.GetAlgorithmAndPublicKeyService;
import com.google.gson.JsonObject;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes2.dex */
public class GetAlgorithmAndPublicKeyService {
    private static final String TAG = "tagWatchConnectApp";

    public interface GetAlgorithmAndPublicKeyListener {
        void onGetAlgorithmAndPublicKeyResult(String str, String str2, String str3, List<String> list);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$getAlgorithmAndPublicKey$0(GetAlgorithmAndPublicKeyListener getAlgorithmAndPublicKeyListener) {
        ArrayList arrayList = new ArrayList();
        arrayList.add("xxxx-xxxx-xxxx-xxxx");
        arrayList.add("xxxx-xxxx-xxxx-xxxx");
        arrayList.add("xxxx-xxxx-xxxx-xxxx");
        getAlgorithmAndPublicKeyListener.onGetAlgorithmAndPublicKeyResult("ECP_DP_BP256R1", "ECC", "publicKey", arrayList);
    }

    public void getAlgorithmAndPublicKey(JsonObject jsonObject, final GetAlgorithmAndPublicKeyListener getAlgorithmAndPublicKeyListener) {
        Log.i(TAG, "GetAlgorithmAndPublicKeyService::getAlgorithmAndPublicKey in");
        new Thread(new Runnable() { // from class: com.crrepa.band.my.device.appmarket.openharmony.service.a
            @Override // java.lang.Runnable
            public final void run() {
                GetAlgorithmAndPublicKeyService.lambda$getAlgorithmAndPublicKey$0(GetAlgorithmAndPublicKeyService.GetAlgorithmAndPublicKeyListener.this);
            }
        }).start();
        Log.i(TAG, "GetAlgorithmAndPublicKeyService::getAlgorithmAndPublicKey out");
    }
}
