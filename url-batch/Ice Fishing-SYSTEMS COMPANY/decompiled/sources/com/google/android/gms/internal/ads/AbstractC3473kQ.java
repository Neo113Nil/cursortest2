package com.google.android.gms.internal.ads;

import android.os.Looper;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* renamed from: com.google.android.gms.internal.ads.kQ, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC3473kQ {

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f32299a = new ArrayList(1);

    /* renamed from: b, reason: collision with root package name */
    public final HashSet f32300b = new HashSet(1);

    /* renamed from: c, reason: collision with root package name */
    public final NP f32301c;

    /* renamed from: d, reason: collision with root package name */
    public final NP f32302d;

    /* renamed from: e, reason: collision with root package name */
    public Looper f32303e;

    /* renamed from: f, reason: collision with root package name */
    public AbstractC3832r8 f32304f;

    /* renamed from: g, reason: collision with root package name */
    public VO f32305g;

    /* renamed from: h, reason: collision with root package name */
    public InterfaceC4147x f32306h;

    public AbstractC3473kQ() {
        BQ bq = null;
        this.f32301c = new NP(new CopyOnWriteArrayList(), bq);
        this.f32302d = new NP(new CopyOnWriteArrayList(), bq);
    }

    public abstract void a(C3235g2 c3235g2);

    public abstract void b(AQ aq);

    public abstract AQ c(BQ bq, InterfaceC3985u interfaceC3985u, long j9);

    public abstract C3235g2 f();

    public void g() {
    }

    public abstract void h(A a9);

    public void i() {
    }

    public abstract void j();

    public final void k(AbstractC3832r8 abstractC3832r8) {
        this.f32304f = abstractC3832r8;
        ArrayList arrayList = this.f32299a;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((CQ) arrayList.get(i)).a(this, abstractC3832r8);
        }
    }

    public final void l(EQ eq) {
        CopyOnWriteArrayList copyOnWriteArrayList = this.f32301c.f26544b;
        Iterator it = copyOnWriteArrayList.iterator();
        while (it.hasNext()) {
            DQ dq = (DQ) it.next();
            if (dq.f24442b == eq) {
                copyOnWriteArrayList.remove(dq);
            }
        }
    }

    public final void m(OP op) {
        CopyOnWriteArrayList copyOnWriteArrayList = this.f32302d.f26544b;
        Iterator it = copyOnWriteArrayList.iterator();
        while (it.hasNext()) {
            MP mp = (MP) it.next();
            if (mp.f26338a == op) {
                copyOnWriteArrayList.remove(mp);
            }
        }
    }

    public final void n(CQ cq, VO vo, InterfaceC4147x interfaceC4147x) {
        Looper myLooper = Looper.myLooper();
        Looper looper = this.f32303e;
        boolean z8 = true;
        if (looper != null && looper != myLooper) {
            z8 = false;
        }
        PA.n(z8);
        this.f32305g = vo;
        this.f32306h = interfaceC4147x;
        AbstractC3832r8 abstractC3832r8 = this.f32304f;
        this.f32299a.add(cq);
        if (this.f32303e != null) {
            if (abstractC3832r8 != null) {
                o(cq);
                cq.a(this, abstractC3832r8);
                return;
            }
            return;
        }
        this.f32303e = myLooper;
        this.f32300b.add(cq);
        A a9 = (A) interfaceC4147x;
        a9.getClass();
        h(a9);
    }

    public final void o(CQ cq) {
        this.f32303e.getClass();
        HashSet hashSet = this.f32300b;
        boolean isEmpty = hashSet.isEmpty();
        hashSet.add(cq);
        if (isEmpty) {
            g();
        }
    }

    public final void p(CQ cq) {
        HashSet hashSet = this.f32300b;
        boolean isEmpty = hashSet.isEmpty();
        hashSet.remove(cq);
        if (isEmpty || !hashSet.isEmpty()) {
            return;
        }
        i();
    }

    public final void q(CQ cq) {
        ArrayList arrayList = this.f32299a;
        arrayList.remove(cq);
        if (!arrayList.isEmpty()) {
            p(cq);
            return;
        }
        this.f32303e = null;
        this.f32304f = null;
        this.f32305g = null;
        this.f32300b.clear();
        j();
    }

    public abstract void r();

    public void d() {
    }

    public void e() {
    }
}
