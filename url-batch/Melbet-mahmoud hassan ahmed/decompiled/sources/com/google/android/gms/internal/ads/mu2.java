package com.google.android.gms.internal.ads;

import java.util.ArrayDeque;

/* loaded from: classes.dex */
final class mu2 implements nb3<Void> {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ pu2 f8730a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ qu2 f8731b;

    mu2(qu2 qu2Var, pu2 pu2Var) {
        this.f8731b = qu2Var;
        this.f8730a = pu2Var;
    }

    @Override // com.google.android.gms.internal.ads.nb3
    public final /* bridge */ /* synthetic */ void a(Void r32) {
        ArrayDeque arrayDeque;
        int i7;
        synchronized (this.f8731b) {
            this.f8731b.f10832e = null;
            arrayDeque = this.f8731b.f10831d;
            arrayDeque.addFirst(this.f8730a);
            i7 = this.f8731b.f10833f;
            if (i7 == 1) {
                this.f8731b.h();
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.nb3
    public final void b(Throwable th) {
        synchronized (this.f8731b) {
            this.f8731b.f10832e = null;
        }
    }
}
