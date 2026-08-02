package io.appmetrica.analytics.impl;

import android.util.Pair;

/* renamed from: io.appmetrica.analytics.impl.j0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0581j0 {

    /* renamed from: a, reason: collision with root package name */
    public Mc f7580a;

    /* renamed from: b, reason: collision with root package name */
    public long f7581b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f7582c;

    /* renamed from: d, reason: collision with root package name */
    public final C0913vl f7583d;

    public C0581j0(String str, long j3, C0913vl c0913vl) {
        this.f7581b = j3;
        try {
            this.f7580a = new Mc(str);
        } catch (Throwable unused) {
            this.f7580a = new Mc();
        }
        this.f7583d = c0913vl;
    }

    public final synchronized void a(Pair pair) {
        if (this.f7583d.b(this.f7580a, (String) pair.first, (String) pair.second)) {
            this.f7582c = true;
        }
    }

    public final synchronized String toString() {
        return "Map size " + this.f7580a.size() + ". Is changed " + this.f7582c + ". Current revision " + this.f7581b;
    }

    public final synchronized C0556i0 a() {
        try {
            if (this.f7582c) {
                this.f7581b++;
                this.f7582c = false;
            }
        } catch (Throwable th) {
            throw th;
        }
        return new C0556i0(AbstractC0696nb.b(this.f7580a), this.f7581b);
    }
}
