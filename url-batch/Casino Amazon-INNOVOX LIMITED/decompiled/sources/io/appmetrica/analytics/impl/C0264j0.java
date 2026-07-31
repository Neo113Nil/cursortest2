package io.appmetrica.analytics.impl;

import android.util.Pair;

/* renamed from: io.appmetrica.analytics.impl.j0, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C0264j0 {

    /* renamed from: a, reason: collision with root package name */
    public Gc f1313a;
    public long b;
    public boolean c;
    public final C0511sl d;

    public C0264j0(String str, long j, C0511sl c0511sl) {
        this.b = j;
        try {
            this.f1313a = new Gc(str);
        } catch (Throwable unused) {
            this.f1313a = new Gc();
        }
        this.d = c0511sl;
    }

    public final synchronized void a(Pair pair) {
        if (this.d.b(this.f1313a, (String) pair.first, (String) pair.second)) {
            this.c = true;
        }
    }

    public final synchronized String toString() {
        return "Map size " + this.f1313a.size() + ". Is changed " + this.c + ". Current revision " + this.b;
    }

    public final synchronized C0239i0 a() {
        if (this.c) {
            this.b++;
            this.c = false;
        }
        return new C0239i0(AbstractC0224hb.b(this.f1313a), this.b);
    }
}
