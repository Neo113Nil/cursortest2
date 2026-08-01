package i0;

import a2.r;
import a3.t;
import c2.k;
import ge.a0;
import ge.x;
import java.util.ArrayList;
import je.h0;
import je.p;
import je.s;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.i0;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import n0.f1;
import n0.z0;
import v.a1;
import v.o;
import wd.b0;
import z.j;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class g implements je.f {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f4572d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f4573e;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ Object f4574i;

    public g(je.d dVar, b0 b0Var, je.f fVar) {
        this.f4572d = 1;
        this.f4573e = b0Var;
        this.f4574i = fVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00f7  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x010c  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0137  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0144  */
    @Override // je.f
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(Object obj, ld.a aVar) {
        je.c cVar;
        int i3;
        p pVar;
        Object obj2;
        int i10;
        int i11;
        s sVar;
        Object obj3;
        int i12;
        switch (this.f4572d) {
            case 0:
                z.e eVar = (z.e) obj;
                boolean z10 = eVar instanceof j;
                a aVar2 = (a) this.f4573e;
                if (!z10) {
                    x xVar = (x) this.f4574i;
                    b7.h hVar = aVar2.H;
                    if (hVar == null) {
                        boolean z11 = aVar2.D;
                        j0.e eVar2 = aVar2.G;
                        hVar = new b7.h();
                        hVar.f1292a = z11;
                        hVar.f1293b = eVar2;
                        hVar.f1294c = new v.b(Float.valueOf(0.0f), Float.valueOf(0.01f));
                        hVar.f1295d = new ArrayList();
                        k.l(aVar2);
                        aVar2.H = hVar;
                    }
                    ArrayList arrayList = (ArrayList) hVar.f1295d;
                    if (eVar instanceof z.c) {
                        arrayList.add(eVar);
                    } else if (eVar instanceof z.d) {
                        arrayList.remove(((z.d) eVar).f10687a);
                    } else if (eVar instanceof z.a) {
                        arrayList.add(eVar);
                    } else if (eVar instanceof z.b) {
                        arrayList.remove(((z.b) eVar).f10686a);
                    }
                    z.e eVar3 = (z.e) CollectionsKt.D(arrayList);
                    if (!Intrinsics.a((z.e) hVar.f1296e, eVar3)) {
                        ld.a aVar3 = null;
                        if (eVar3 != null) {
                            ((j0.e) hVar.f1293b).invoke();
                            boolean z12 = eVar3 instanceof z.c;
                            float f3 = z12 ? 0.08f : eVar3 instanceof z.a ? 0.1f : 0.0f;
                            a1 a1Var = f.f4571a;
                            if (!z12 && (eVar3 instanceof z.a)) {
                                a1Var = new a1(45, 0, o.f9850b);
                            }
                            a0.s(xVar, null, new h(hVar, f3, a1Var, (ld.a) null), 3);
                        } else {
                            a0.s(xVar, null, new t(hVar, f.f4571a, aVar3, 10), 3);
                        }
                        hVar.f1296e = eVar3;
                    }
                } else if (aVar2.K) {
                    aVar2.I((j) eVar);
                } else {
                    aVar2.L.a(eVar);
                }
                return Unit.f5554a;
            case 1:
                b0 b0Var = (b0) this.f4573e;
                if (aVar instanceof je.c) {
                    cVar = (je.c) aVar;
                    int i13 = cVar.f5146i;
                    if ((i13 & Integer.MIN_VALUE) != 0) {
                        cVar.f5146i = i13 - Integer.MIN_VALUE;
                        Object obj4 = cVar.f5144d;
                        md.a aVar4 = md.a.f6622d;
                        i3 = cVar.f5146i;
                        if (i3 != 0) {
                            cf.c.M(obj4);
                            Object obj5 = b0Var.f10141d;
                            if (obj5 == ke.c.f5511b || !Intrinsics.a(obj5, obj)) {
                                b0Var.f10141d = obj;
                                je.f fVar = (je.f) this.f4574i;
                                cVar.f5146i = 1;
                                if (fVar.b(obj, cVar) == aVar4) {
                                    return aVar4;
                                }
                            }
                        } else {
                            if (i3 != 1) {
                                i0.l("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            cf.c.M(obj4);
                        }
                        return Unit.f5554a;
                    }
                }
                cVar = new je.c(this, aVar);
                Object obj42 = cVar.f5144d;
                md.a aVar42 = md.a.f6622d;
                i3 = cVar.f5146i;
                if (i3 != 0) {
                }
                return Unit.f5554a;
            case 2:
                if (aVar instanceof p) {
                    pVar = (p) aVar;
                    int i14 = pVar.f5215e;
                    if ((i14 & Integer.MIN_VALUE) != 0) {
                        pVar.f5215e = i14 - Integer.MIN_VALUE;
                        obj2 = pVar.f5214d;
                        md.a aVar5 = md.a.f6622d;
                        i10 = pVar.f5215e;
                        if (i10 != 0) {
                            cf.c.M(obj2);
                            h0 h0Var = (h0) this.f4573e;
                            pVar.f5217r = obj;
                            i11 = 0;
                            pVar.f5218s = 0;
                            pVar.f5215e = 1;
                            obj2 = h0Var.invoke(obj, pVar);
                            if (obj2 == aVar5) {
                                return aVar5;
                            }
                        } else {
                            if (i10 != 1) {
                                if (i10 == 2) {
                                    cf.c.M(obj2);
                                    return Unit.f5554a;
                                }
                                i0.l("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            int i15 = pVar.f5218s;
                            Object obj6 = pVar.f5217r;
                            cf.c.M(obj2);
                            i11 = i15;
                            obj = obj6;
                        }
                        if (((Boolean) obj2).booleanValue()) {
                            throw new ke.a(this);
                        }
                        je.f fVar2 = (je.f) this.f4574i;
                        pVar.f5217r = null;
                        pVar.f5218s = i11;
                        pVar.f5215e = 2;
                        if (fVar2.b(obj, pVar) == aVar5) {
                            return aVar5;
                        }
                        return Unit.f5554a;
                    }
                }
                pVar = new p(this, aVar);
                obj2 = pVar.f5214d;
                md.a aVar52 = md.a.f6622d;
                i10 = pVar.f5215e;
                if (i10 != 0) {
                }
                if (((Boolean) obj2).booleanValue()) {
                }
            case a4.j.INTEGER_FIELD_NUMBER /* 3 */:
                if (aVar instanceof s) {
                    sVar = (s) aVar;
                    int i16 = sVar.f5226e;
                    if ((i16 & Integer.MIN_VALUE) != 0) {
                        sVar.f5226e = i16 - Integer.MIN_VALUE;
                        obj3 = sVar.f5225d;
                        md.a aVar6 = md.a.f6622d;
                        i12 = sVar.f5226e;
                        if (i12 != 0) {
                            cf.c.M(obj3);
                            Function2 function2 = (Function2) this.f4573e;
                            sVar.f5228r = obj;
                            sVar.f5226e = 1;
                            obj3 = function2.invoke(obj, sVar);
                            if (obj3 == aVar6) {
                                return aVar6;
                            }
                        } else {
                            if (i12 != 1) {
                                i0.l("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            obj = sVar.f5228r;
                            cf.c.M(obj3);
                        }
                        if (((Boolean) obj3).booleanValue()) {
                            return Unit.f5554a;
                        }
                        ((b0) this.f4574i).f10141d = obj;
                        throw new ke.a(this);
                    }
                }
                sVar = new s(this, aVar);
                obj3 = sVar.f5225d;
                md.a aVar62 = md.a.f6622d;
                i12 = sVar.f5226e;
                if (i12 != 0) {
                }
                if (((Boolean) obj3).booleanValue()) {
                }
            case a4.j.LONG_FIELD_NUMBER /* 4 */:
                ((z0) this.f4573e).setValue(Boolean.TRUE);
                ((f1) this.f4574i).i(((d.a) obj).f3206c);
                return Unit.f5554a;
            default:
                t9.f fVar3 = (t9.f) obj;
                if (Intrinsics.a(fVar3, t9.d.f9330a)) {
                    ((Function0) this.f4573e).invoke();
                } else {
                    if (!Intrinsics.a(fVar3, t9.e.f9331a)) {
                        r.p();
                        return null;
                    }
                    ((Function0) this.f4574i).invoke();
                }
                return Unit.f5554a;
        }
    }

    public /* synthetic */ g(int i3, Object obj, Object obj2) {
        this.f4572d = i3;
        this.f4573e = obj;
        this.f4574i = obj2;
    }
}
