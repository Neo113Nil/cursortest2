package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.DeadObjectException;
import r3.c;

/* loaded from: classes.dex */
final class gq implements c.a {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ iq f5711a;

    gq(iq iqVar) {
        this.f5711a = iqVar;
    }

    @Override // r3.c.a
    public final void O0(Bundle bundle) {
        Object obj;
        Object obj2;
        lq lqVar;
        lq lqVar2;
        obj = this.f5711a.f6741b;
        synchronized (obj) {
            try {
                lqVar = this.f5711a.f6742c;
                if (lqVar != null) {
                    iq iqVar = this.f5711a;
                    lqVar2 = iqVar.f6742c;
                    iqVar.f6744e = lqVar2.j0();
                }
            } catch (DeadObjectException e7) {
                io0.e("Unable to obtain a cache service instance.", e7);
                iq.h(this.f5711a);
            }
            obj2 = this.f5711a.f6741b;
            obj2.notifyAll();
        }
    }

    @Override // r3.c.a
    public final void q0(int i7) {
        Object obj;
        Object obj2;
        obj = this.f5711a.f6741b;
        synchronized (obj) {
            this.f5711a.f6744e = null;
            obj2 = this.f5711a.f6741b;
            obj2.notifyAll();
        }
    }
}
