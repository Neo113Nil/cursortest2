package com.gates.olympus.miruv.tenon;

import A2.u;
import A2.w;
import A2.y;
import D1.C0014b;
import E2.h;
import I2.l;
import L1.z;
import P1.d;
import R1.i;
import Y1.e;
import k2.InterfaceC0550w;
import x2.c;

/* loaded from: classes.dex */
public final class a extends i implements e {

    /* renamed from: e, reason: collision with root package name */
    public /* synthetic */ Object f4434e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ C0014b f4435f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ w f4436g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(C0014b c0014b, w wVar, d dVar) {
        super(2, dVar);
        this.f4435f = c0014b;
        this.f4436g = wVar;
    }

    @Override // R1.a
    public final d create(Object obj, d dVar) {
        a aVar = new a(this.f4435f, this.f4436g, dVar);
        aVar.f4434e = obj;
        return aVar;
    }

    @Override // Y1.e
    public final Object g(Object obj, Object obj2) {
        return ((a) create((InterfaceC0550w) obj, (d) obj2)).invokeSuspend(z.f2729a);
    }

    @Override // R1.a
    public final Object invokeSuspend(Object obj) {
        Object t3;
        A2.z zVar;
        Object t4;
        Q1.a aVar = Q1.a.f3113d;
        l.Q(obj);
        C0014b c0014b = this.f4435f;
        w wVar = this.f4436g;
        try {
            u uVar = (u) c0014b.f538d;
            uVar.getClass();
            y c3 = new h(uVar, wVar).c();
            try {
                int i3 = c3.f214g;
                if (200 > i3 || i3 >= 300 || (zVar = c3.f217j) == null) {
                    t3 = null;
                } else {
                    try {
                        t4 = (TenonReply) ((c) c0014b.f537c).a(zVar.e(), TenonReply.Companion.serializer());
                    } catch (Throwable th) {
                        t4 = l.t(th);
                    }
                    if (t4 instanceof L1.l) {
                        t4 = null;
                    }
                    t3 = (TenonReply) t4;
                }
                I2.d.u(c3, null);
            } finally {
            }
        } catch (Throwable th2) {
            t3 = l.t(th2);
        }
        if (t3 instanceof L1.l) {
            return null;
        }
        return t3;
    }
}
