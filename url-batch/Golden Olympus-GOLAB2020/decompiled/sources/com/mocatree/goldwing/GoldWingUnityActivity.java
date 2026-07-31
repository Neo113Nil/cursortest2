package com.mocatree.goldwing;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import com.unity3d.player.UnityPlayerActivity;
import ru.rustore.unitysdk.billingclient.RuStoreUnityBillingClient;

/* loaded from: classes2.dex */
public class GoldWingUnityActivity extends UnityPlayerActivity {
    @Override // com.unity3d.player.UnityPlayerActivity, android.app.Activity
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
    }

    @Override // com.unity3d.player.UnityPlayerActivity, android.app.Activity
    protected void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        setIntent(intent);
        try {
            RuStoreUnityBillingClient.onNewIntent(intent);
        } catch (Throwable th) {
            Log.e("GoldWingUnityActivity", "RuStore onNewIntent failed", th);
        }
    }
}
