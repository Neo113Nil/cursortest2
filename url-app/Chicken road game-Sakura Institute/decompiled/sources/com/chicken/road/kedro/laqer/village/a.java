package com.chicken.road.kedro.laqer.village;

import A0.q;
import B1.C0097d;
import E2.j;
import W2.InterfaceC0302y;
import j3.AbstractC0724c;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import m3.r;
import m3.w;
import m3.x;
import q3.g;
import y2.AbstractC1341p;
import y2.AbstractC1343r;
import y2.C1342q;

/* loaded from: classes.dex */
public final class a extends j implements Function2 {

    /* renamed from: k, reason: collision with root package name */
    public /* synthetic */ Object f6022k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ C0097d f6023l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ q f6024m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(C0097d c0097d, q qVar, C2.a aVar) {
        super(2, aVar);
        this.f6023l = c0097d;
        this.f6024m = qVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object h(Object obj, Object obj2) {
        return ((a) j((C2.a) obj2, (InterfaceC0302y) obj)).l(Unit.f7487a);
    }

    @Override // E2.a
    public final C2.a j(C2.a aVar, Object obj) {
        a aVar2 = new a(this.f6023l, this.f6024m, aVar);
        aVar2.f6022k = obj;
        return aVar2;
    }

    @Override // E2.a
    public final Object l(Object obj) {
        Object a4;
        x xVar;
        Object a5;
        D2.a aVar = D2.a.f2163d;
        AbstractC1343r.b(obj);
        C0097d c0097d = this.f6023l;
        q request = this.f6024m;
        try {
            AbstractC1341p.a aVar2 = AbstractC1341p.f11673d;
            r rVar = (r) c0097d.f989j;
            rVar.getClass();
            Intrinsics.checkNotNullParameter(request, "request");
            w c4 = new g(rVar, request).c();
            try {
                int i2 = c4.f8476j;
                if (200 > i2 || i2 >= 300 || (xVar = c4.f8479m) == null) {
                    a4 = null;
                } else {
                    try {
                        a5 = (VillageReply) ((AbstractC0724c) c0097d.f988i).a(xVar.d(), VillageReply.Companion.serializer());
                    } catch (Throwable th) {
                        AbstractC1341p.a aVar3 = AbstractC1341p.f11673d;
                        a5 = AbstractC1343r.a(th);
                    }
                    if (a5 instanceof C1342q) {
                        a5 = null;
                    }
                    a4 = (VillageReply) a5;
                }
                J2.q.a(c4, null);
            } finally {
            }
        } catch (Throwable th2) {
            AbstractC1341p.a aVar4 = AbstractC1341p.f11673d;
            a4 = AbstractC1343r.a(th2);
        }
        if (a4 instanceof C1342q) {
            return null;
        }
        return a4;
    }
}
