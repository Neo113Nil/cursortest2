package com.chicken.road.whale.plate;

import a2.q;
import b1.b;
import c7.x;
import d6.l;
import d6.z;
import h6.d;
import j6.i;
import p7.c;
import q6.e;
import s7.p;
import s7.s;
import s7.u;
import w7.g;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class a extends i implements e {

    /* renamed from: g, reason: collision with root package name */
    public /* synthetic */ Object f1767g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ b f1768h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ q f1769i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(b bVar, q qVar, d dVar) {
        super(2, dVar);
        this.f1768h = bVar;
        this.f1769i = qVar;
    }

    @Override // j6.a
    public final d create(Object obj, d dVar) {
        a aVar = new a(this.f1768h, this.f1769i, dVar);
        aVar.f1767g = obj;
        return aVar;
    }

    @Override // q6.e
    public final Object d(Object obj, Object obj2) {
        return ((a) create((x) obj, (d) obj2)).invokeSuspend(z.f2639a);
    }

    @Override // j6.a
    public final Object invokeSuspend(Object obj) {
        Object b9;
        u uVar;
        Object b10;
        d6.a.e(obj);
        b bVar = this.f1768h;
        q qVar = this.f1769i;
        try {
            p pVar = (p) bVar.f1232i;
            pVar.getClass();
            s c4 = new g(pVar, qVar).c();
            try {
                int i7 = c4.f8686i;
                if (200 > i7 || i7 >= 300 || (uVar = c4.f8689l) == null) {
                    b9 = null;
                } else {
                    try {
                        b10 = (PlateReply) ((c) bVar.f1231h).a(uVar.n(), PlateReply.Companion.serializer());
                    } catch (Throwable th) {
                        b10 = d6.a.b(th);
                    }
                    if (b10 instanceof l) {
                        b10 = null;
                    }
                    b9 = (PlateReply) b10;
                }
                c4.close();
            } finally {
            }
        } catch (Throwable th2) {
            b9 = d6.a.b(th2);
        }
        if (b9 instanceof l) {
            return null;
        }
        return b9;
    }
}
