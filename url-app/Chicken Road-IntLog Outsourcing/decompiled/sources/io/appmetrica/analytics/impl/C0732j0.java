package io.appmetrica.analytics.impl;

import android.util.Pair;

/* renamed from: io.appmetrica.analytics.impl.j0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0732j0 {

    /* renamed from: a, reason: collision with root package name */
    public Mc f8469a;

    /* renamed from: b, reason: collision with root package name */
    public long f8470b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f8471c;

    /* renamed from: d, reason: collision with root package name */
    public final C1064vl f8472d;

    public C0732j0(String str, long j2, C1064vl c1064vl) {
        this.f8470b = j2;
        try {
            this.f8469a = new Mc(str);
        } catch (Throwable unused) {
            this.f8469a = new Mc();
        }
        this.f8472d = c1064vl;
    }

    public final synchronized void a(Pair pair) {
        if (this.f8472d.b(this.f8469a, (String) pair.first, (String) pair.second)) {
            this.f8471c = true;
        }
    }

    public final synchronized String toString() {
        return "Map size " + this.f8469a.size() + ". Is changed " + this.f8471c + ". Current revision " + this.f8470b;
    }

    public final synchronized C0707i0 a() {
        try {
            if (this.f8471c) {
                this.f8470b++;
                this.f8471c = false;
            }
        } catch (Throwable th) {
            throw th;
        }
        return new C0707i0(AbstractC0847nb.b(this.f8469a), this.f8470b);
    }
}
