package com.facebook;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.facebook.internal.NativeProtocol;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public class FacebookBroadcastReceiver extends BroadcastReceiver {
    public void onFailedAppCall(String str, String str2, Bundle bundle) {
        str.getClass();
        str2.getClass();
        bundle.getClass();
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        context.getClass();
        intent.getClass();
        String stringExtra = intent.getStringExtra(NativeProtocol.EXTRA_PROTOCOL_CALL_ID);
        String stringExtra2 = intent.getStringExtra(NativeProtocol.EXTRA_PROTOCOL_ACTION);
        Bundle extras = intent.getExtras();
        if (stringExtra == null || stringExtra2 == null || extras == null) {
            return;
        }
        if (NativeProtocol.isErrorResult(intent)) {
            onFailedAppCall(stringExtra, stringExtra2, extras);
        } else {
            onSuccessfulAppCall(stringExtra, stringExtra2, extras);
        }
    }

    public void onSuccessfulAppCall(String str, String str2, Bundle bundle) {
        str.getClass();
        str2.getClass();
        bundle.getClass();
    }
}
