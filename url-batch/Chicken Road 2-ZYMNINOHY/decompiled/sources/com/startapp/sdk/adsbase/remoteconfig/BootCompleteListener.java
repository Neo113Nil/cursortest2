package com.startapp.sdk.adsbase.remoteconfig;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.startapp.sdk.internal.gh;

/* loaded from: classes.dex */
public class BootCompleteListener extends BroadcastReceiver {
    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        gh.c(context);
    }
}
