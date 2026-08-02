package com.google.android.gms.internal.play_billing;

import a.AbstractC0124a;
import android.os.SystemClock;

/* renamed from: com.google.android.gms.internal.play_billing.j, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0325j extends AbstractC0124a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f5957a;

    @Override // a.AbstractC0124a
    public final long U() {
        switch (this.f5957a) {
            case 0:
                return SystemClock.elapsedRealtimeNanos();
            default:
                return SystemClock.elapsedRealtime() * 1000000;
        }
    }
}
