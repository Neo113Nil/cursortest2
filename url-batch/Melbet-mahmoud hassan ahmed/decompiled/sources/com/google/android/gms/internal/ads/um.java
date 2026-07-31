package com.google.android.gms.internal.ads;

import android.os.SystemClock;

/* loaded from: classes.dex */
public final class um implements nm {

    /* renamed from: a, reason: collision with root package name */
    private boolean f12847a;

    /* renamed from: b, reason: collision with root package name */
    private long f12848b;

    /* renamed from: c, reason: collision with root package name */
    private long f12849c;

    /* renamed from: d, reason: collision with root package name */
    private bf f12850d = bf.f3385d;

    @Override // com.google.android.gms.internal.ads.nm
    public final long L() {
        long j7 = this.f12848b;
        if (!this.f12847a) {
            return j7;
        }
        long elapsedRealtime = SystemClock.elapsedRealtime() - this.f12849c;
        bf bfVar = this.f12850d;
        return j7 + (bfVar.f3386a == 1.0f ? he.a(elapsedRealtime) : bfVar.a(elapsedRealtime));
    }

    public final void a(long j7) {
        this.f12848b = j7;
        if (this.f12847a) {
            this.f12849c = SystemClock.elapsedRealtime();
        }
    }

    public final void b() {
        if (this.f12847a) {
            return;
        }
        this.f12849c = SystemClock.elapsedRealtime();
        this.f12847a = true;
    }

    public final void c() {
        if (this.f12847a) {
            a(L());
            this.f12847a = false;
        }
    }

    public final void d(nm nmVar) {
        a(nmVar.L());
        this.f12850d = nmVar.v();
    }

    @Override // com.google.android.gms.internal.ads.nm
    public final bf e(bf bfVar) {
        if (this.f12847a) {
            a(L());
        }
        this.f12850d = bfVar;
        return bfVar;
    }

    @Override // com.google.android.gms.internal.ads.nm
    public final bf v() {
        throw null;
    }
}
