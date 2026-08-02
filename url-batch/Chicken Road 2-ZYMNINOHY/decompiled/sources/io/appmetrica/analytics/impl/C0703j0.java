package io.appmetrica.analytics.impl;

import android.util.Pair;

/* renamed from: io.appmetrica.analytics.impl.j0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0703j0 {

    /* renamed from: a, reason: collision with root package name */
    public Fc f12084a;

    /* renamed from: b, reason: collision with root package name */
    public long f12085b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f12086c;

    /* renamed from: d, reason: collision with root package name */
    public final C0931rl f12087d;

    public C0703j0(String str, long j4, C0931rl c0931rl) {
        this.f12085b = j4;
        try {
            this.f12084a = new Fc(str);
        } catch (Throwable unused) {
            this.f12084a = new Fc();
        }
        this.f12087d = c0931rl;
    }

    public final synchronized void a(Pair pair) {
        if (this.f12087d.b(this.f12084a, (String) pair.first, (String) pair.second)) {
            this.f12086c = true;
        }
    }

    public final synchronized String toString() {
        return "Map size " + this.f12084a.size() + ". Is changed " + this.f12086c + ". Current revision " + this.f12085b;
    }

    public final synchronized C0678i0 a() {
        try {
            if (this.f12086c) {
                this.f12085b++;
                this.f12086c = false;
            }
        } catch (Throwable th) {
            throw th;
        }
        return new C0678i0(AbstractC0637gb.b(this.f12084a), this.f12085b);
    }
}
