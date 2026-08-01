package com.google.android.gms.internal.measurement;

import android.os.SystemClock;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class dg extends a.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2241a;

    public /* synthetic */ dg(int i3) {
        this.f2241a = i3;
    }

    @Override // a.a
    public final long V() {
        switch (this.f2241a) {
            case 0:
                return SystemClock.elapsedRealtimeNanos();
            default:
                return SystemClock.elapsedRealtime() * 1000000;
        }
    }
}
