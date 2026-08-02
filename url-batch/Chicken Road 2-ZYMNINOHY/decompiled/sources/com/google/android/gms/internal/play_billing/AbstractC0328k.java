package com.google.android.gms.internal.play_billing;

import a.AbstractC0124a;
import android.os.SystemClock;

/* renamed from: com.google.android.gms.internal.play_billing.k, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0328k {

    /* renamed from: a, reason: collision with root package name */
    public static final AbstractC0124a f5959a;

    static {
        C0325j c0325j;
        try {
            SystemClock.elapsedRealtimeNanos();
            c0325j = new C0325j(0);
        } catch (Throwable unused) {
            SystemClock.elapsedRealtime();
            c0325j = new C0325j(1);
        }
        f5959a = c0325j;
    }
}
