package com.realsil.sdk.core.compat;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Build;

/* loaded from: classes4.dex */
public final class RtkContextCompat {
    public static final int RECEIVER_EXPORTED = 2;

    public static Intent registerReceiver(Context context, BroadcastReceiver broadcastReceiver, IntentFilter intentFilter) {
        return registerReceiver(context, broadcastReceiver, intentFilter, 2);
    }

    public static Intent registerReceiver(Context context, BroadcastReceiver broadcastReceiver, IntentFilter intentFilter, int i8) {
        Intent registerReceiver;
        if (Build.VERSION.SDK_INT < 26) {
            return context.registerReceiver(broadcastReceiver, intentFilter);
        }
        registerReceiver = context.registerReceiver(broadcastReceiver, intentFilter, i8);
        return registerReceiver;
    }
}
