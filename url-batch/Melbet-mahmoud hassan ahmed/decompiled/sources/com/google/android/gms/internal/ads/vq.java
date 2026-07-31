package com.google.android.gms.internal.ads;

import r3.c;

/* loaded from: classes.dex */
final class vq implements c.b {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ bp0 f13473a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ wq f13474b;

    vq(wq wqVar, bp0 bp0Var) {
        this.f13474b = wqVar;
        this.f13473a = bp0Var;
    }

    @Override // r3.c.b
    public final void E(o3.b bVar) {
        Object obj;
        obj = this.f13474b.f13916d;
        synchronized (obj) {
            this.f13473a.f(new RuntimeException("Connection failed."));
        }
    }
}
