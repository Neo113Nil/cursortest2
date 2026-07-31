package com.gatesof.olympus.martu.marku.salon;

import C0.q;
import D2.c;
import G1.m;
import G2.r;
import G2.u;
import G2.v;
import K2.g;
import R1.k;
import R1.y;
import V1.d;
import X1.i;
import e2.InterfaceC0426e;
import q2.InterfaceC0835w;

/* loaded from: classes.dex */
public final class a extends i implements InterfaceC0426e {

    /* renamed from: h, reason: collision with root package name */
    public /* synthetic */ Object f5639h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ m f5640i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ q f5641j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(m mVar, q qVar, d dVar) {
        super(2, dVar);
        this.f5640i = mVar;
        this.f5641j = qVar;
    }

    @Override // e2.InterfaceC0426e
    public final Object h(Object obj, Object obj2) {
        return ((a) o((d) obj2, (InterfaceC0835w) obj)).q(y.f4171a);
    }

    @Override // X1.a
    public final d o(d dVar, Object obj) {
        a aVar = new a(this.f5640i, this.f5641j, dVar);
        aVar.f5639h = obj;
        return aVar;
    }

    @Override // X1.a
    public final Object q(Object obj) {
        Object b3;
        v vVar;
        Object b4;
        R1.a.e(obj);
        m mVar = this.f5640i;
        q qVar = this.f5641j;
        try {
            r rVar = (r) mVar.f2118d;
            rVar.getClass();
            u c2 = new g(rVar, qVar).c();
            try {
                int i3 = c2.f2297g;
                if (200 > i3 || i3 >= 300 || (vVar = c2.f2300j) == null) {
                    b3 = null;
                } else {
                    try {
                        b4 = (SalonReply) ((c) mVar.f2117c).a(vVar.d(), SalonReply.Companion.serializer());
                    } catch (Throwable th) {
                        b4 = R1.a.b(th);
                    }
                    if (b4 instanceof k) {
                        b4 = null;
                    }
                    b3 = (SalonReply) b4;
                }
                O2.d.t(c2, null);
            } finally {
            }
        } catch (Throwable th2) {
            b3 = R1.a.b(th2);
        }
        if (b3 instanceof k) {
            return null;
        }
        return b3;
    }
}
