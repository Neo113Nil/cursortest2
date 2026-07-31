package com.my.tracker.obfuscated;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import com.google.firebase.analytics.FirebaseAnalytics;

/* renamed from: com.my.tracker.obfuscated.p, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1670p {

    /* renamed from: a, reason: collision with root package name */
    int f21478a = 1;

    /* renamed from: b, reason: collision with root package name */
    int f21479b = -1;

    public C1666o a(Context context) {
        Intent registerReceiver = context.registerReceiver(null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
        if (registerReceiver == null) {
            return null;
        }
        int intExtra = registerReceiver.getIntExtra("status", 1);
        int i4 = -1;
        int intExtra2 = registerReceiver.getIntExtra(FirebaseAnalytics.Param.LEVEL, -1);
        int intExtra3 = registerReceiver.getIntExtra("scale", -1);
        if (intExtra2 >= 0 && intExtra3 > 0) {
            i4 = (intExtra2 * 100) / intExtra3;
        }
        return new C1666o(intExtra, i4);
    }
}
