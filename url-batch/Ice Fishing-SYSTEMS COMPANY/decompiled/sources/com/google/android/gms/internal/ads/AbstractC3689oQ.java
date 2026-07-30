package com.google.android.gms.internal.ads;

import android.os.Handler;
import java.util.HashMap;
import java.util.Iterator;

/* renamed from: com.google.android.gms.internal.ads.oQ, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC3689oQ extends AbstractC3473kQ {
    public final HashMap i = new HashMap();

    /* renamed from: j, reason: collision with root package name */
    public Handler f33143j;

    @Override // com.google.android.gms.internal.ads.AbstractC3473kQ
    public final void g() {
        for (C3635nQ c3635nQ : this.i.values()) {
            c3635nQ.f32862a.o(c3635nQ.f32863b);
        }
    }

    @Override // com.google.android.gms.internal.ads.AbstractC3473kQ
    public final void i() {
        for (C3635nQ c3635nQ : this.i.values()) {
            c3635nQ.f32862a.p(c3635nQ.f32863b);
        }
    }

    @Override // com.google.android.gms.internal.ads.AbstractC3473kQ
    public void j() {
        HashMap hashMap = this.i;
        for (C3635nQ c3635nQ : hashMap.values()) {
            AbstractC3473kQ abstractC3473kQ = c3635nQ.f32862a;
            abstractC3473kQ.q(c3635nQ.f32863b);
            C3581mQ c3581mQ = c3635nQ.f32864c;
            abstractC3473kQ.l(c3581mQ);
            abstractC3473kQ.m(c3581mQ);
        }
        hashMap.clear();
    }

    @Override // com.google.android.gms.internal.ads.AbstractC3473kQ
    public void r() {
        Iterator it = this.i.values().iterator();
        while (it.hasNext()) {
            ((C3635nQ) it.next()).f32862a.r();
        }
    }

    public abstract void s(Integer num, AbstractC3473kQ abstractC3473kQ, AbstractC3832r8 abstractC3832r8);

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v2, types: [com.google.android.gms.internal.ads.CQ, com.google.android.gms.internal.ads.lQ] */
    public final void t(final Integer num, AbstractC3473kQ abstractC3473kQ) {
        HashMap hashMap = this.i;
        PA.n(!hashMap.containsKey(num));
        ?? r12 = new CQ() { // from class: com.google.android.gms.internal.ads.lQ
            @Override // com.google.android.gms.internal.ads.CQ
            public final /* synthetic */ void a(AbstractC3473kQ abstractC3473kQ2, AbstractC3832r8 abstractC3832r8) {
                AbstractC3689oQ.this.s(num, abstractC3473kQ2, abstractC3832r8);
            }
        };
        C3581mQ c3581mQ = new C3581mQ(this, num);
        hashMap.put(num, new C3635nQ(abstractC3473kQ, r12, c3581mQ));
        Handler handler = this.f33143j;
        handler.getClass();
        NP np = abstractC3473kQ.f32301c;
        np.getClass();
        np.f26544b.add(new DQ(handler, c3581mQ));
        this.f33143j.getClass();
        NP np2 = abstractC3473kQ.f32302d;
        np2.getClass();
        np2.f26544b.add(new MP(c3581mQ));
        VO vo = this.f32305g;
        vo.getClass();
        InterfaceC4147x interfaceC4147x = this.f32306h;
        interfaceC4147x.getClass();
        abstractC3473kQ.n(r12, vo, interfaceC4147x);
        if (this.f32300b.isEmpty()) {
            abstractC3473kQ.p(r12);
        }
    }

    public abstract BQ v(Integer num, BQ bq);

    public void u(Integer num) {
    }

    public void w(Integer num, long j9) {
    }
}
