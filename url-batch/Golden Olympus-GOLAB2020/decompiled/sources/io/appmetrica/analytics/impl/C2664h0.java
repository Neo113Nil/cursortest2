package io.appmetrica.analytics.impl;

import android.util.Pair;

/* renamed from: io.appmetrica.analytics.impl.h0, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2664h0 {

    /* renamed from: a, reason: collision with root package name */
    public C2490ad f39114a;

    /* renamed from: b, reason: collision with root package name */
    public long f39115b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f39116c;

    /* renamed from: d, reason: collision with root package name */
    public final C2943rl f39117d;

    public C2664h0(String str, long j4, C2943rl c2943rl) {
        this.f39115b = j4;
        try {
            this.f39114a = new C2490ad(str);
        } catch (Throwable unused) {
            this.f39114a = new C2490ad();
        }
        this.f39117d = c2943rl;
    }

    public final synchronized void a(Pair pair) {
        if (this.f39117d.b(this.f39114a, (String) pair.first, (String) pair.second)) {
            this.f39116c = true;
        }
    }

    public final synchronized String toString() {
        return "Map size " + this.f39114a.size() + ". Is changed " + this.f39116c + ". Current revision " + this.f39115b;
    }

    public final synchronized C2638g0 a() {
        try {
            if (this.f39116c) {
                this.f39115b++;
                this.f39116c = false;
            }
        } catch (Throwable th) {
            throw th;
        }
        return new C2638g0(Bb.b(this.f39114a), this.f39115b);
    }
}
