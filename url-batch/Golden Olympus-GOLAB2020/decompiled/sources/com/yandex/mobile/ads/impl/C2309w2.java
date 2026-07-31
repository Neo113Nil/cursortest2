package com.yandex.mobile.ads.impl;

import androidx.annotation.NonNull;

/* renamed from: com.yandex.mobile.ads.impl.w2, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2309w2 {

    /* renamed from: a, reason: collision with root package name */
    private final ln2 f33901a;

    private C2309w2(ln2 ln2Var) {
        this.f33901a = ln2Var;
    }

    public static C2309w2 a(ln2 ln2Var) {
        if (ln2Var.j().c() != null) {
            throw new IllegalStateException("AdEvents already exists for AdSession");
        }
        if (ln2Var.k()) {
            throw new IllegalStateException("AdSession is finished");
        }
        C2309w2 c2309w2 = new C2309w2(ln2Var);
        ln2Var.j().a(c2309w2);
        return c2309w2;
    }

    public final void a() {
        if (!this.f33901a.k()) {
            if (this.f33901a.l()) {
                if (!this.f33901a.g()) {
                    try {
                        this.f33901a.b();
                    } catch (Exception unused) {
                    }
                }
                if (this.f33901a.g()) {
                    this.f33901a.e();
                    return;
                }
                return;
            }
            throw new IllegalStateException("Impression event is not expected from the Native AdSession");
        }
        throw new IllegalStateException("AdSession is finished");
    }

    public final void a(@NonNull v92 v92Var) {
        no2.a(this.f33901a);
        if (this.f33901a.l()) {
            this.f33901a.a(v92Var.a());
            return;
        }
        throw new IllegalStateException("Impression event is not expected from the Native AdSession");
    }
}
