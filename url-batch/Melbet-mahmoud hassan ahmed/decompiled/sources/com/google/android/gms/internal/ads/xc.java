package com.google.android.gms.internal.ads;

import java.util.concurrent.Callable;

/* loaded from: classes.dex */
public final class xc implements Callable {

    /* renamed from: a, reason: collision with root package name */
    private final gc f14120a;

    /* renamed from: b, reason: collision with root package name */
    private final j8 f14121b;

    public xc(gc gcVar, j8 j8Var) {
        this.f14120a = gcVar;
        this.f14121b = j8Var;
    }

    @Override // java.util.concurrent.Callable
    public final /* bridge */ /* synthetic */ Object call() {
        if (this.f14120a.l() != null) {
            this.f14120a.l().get();
        }
        a9 c7 = this.f14120a.c();
        if (c7 == null) {
            return null;
        }
        try {
            synchronized (this.f14121b) {
                j8 j8Var = this.f14121b;
                byte[] d7 = c7.d();
                j8Var.n(d7, 0, d7.length, mp3.a());
            }
            return null;
        } catch (mq3 | NullPointerException unused) {
            return null;
        }
    }
}
