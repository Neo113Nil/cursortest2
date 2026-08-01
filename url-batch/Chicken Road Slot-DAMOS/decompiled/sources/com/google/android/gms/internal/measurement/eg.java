package com.google.android.gms.internal.measurement;

import android.os.SystemClock;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public abstract class eg {

    /* renamed from: a, reason: collision with root package name */
    public static final a.a f2265a;

    static {
        dg dgVar;
        try {
            SystemClock.elapsedRealtimeNanos();
            dgVar = new dg(0);
        } catch (Throwable unused) {
            SystemClock.elapsedRealtime();
            dgVar = new dg(1);
        }
        f2265a = dgVar;
    }
}
