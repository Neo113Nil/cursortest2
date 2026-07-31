package com.google.android.gms.internal.ads;

import r3.c;

/* loaded from: classes.dex */
final class hq implements c.b {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ iq f6379a;

    hq(iq iqVar) {
        this.f6379a = iqVar;
    }

    @Override // r3.c.b
    public final void E(o3.b bVar) {
        Object obj;
        lq lqVar;
        Object obj2;
        obj = this.f6379a.f6741b;
        synchronized (obj) {
            this.f6379a.f6744e = null;
            lqVar = this.f6379a.f6742c;
            if (lqVar != null) {
                this.f6379a.f6742c = null;
            }
            obj2 = this.f6379a.f6741b;
            obj2.notifyAll();
        }
    }
}
