package com.facebook;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class CurrentAccessTokenExpirationBroadcastReceiver extends BroadcastReceiver {
    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        context.getClass();
        intent.getClass();
        if (AccessTokenManager.ACTION_CURRENT_ACCESS_TOKEN_CHANGED.equals(intent.getAction()) && FacebookSdk.isInitialized()) {
            AccessTokenManager.Companion.getInstance().currentAccessTokenChanged();
        }
    }
}
