package A;

import C.C0106a;
import C.C0113h;
import D.S1;
import G.C0197f0;
import G.InterfaceC0191c0;
import W2.InterfaceC0302y;
import Z.C0323u;
import Z2.C0339o;
import Z2.C0342s;
import Z2.InterfaceC0331g;
import a.AbstractC0345a;
import a3.C0423a;
import b.C0487b;
import f1.C0626u;
import java.util.ArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import l.C0778d;
import p.C0928d;
import p.C0929e;
import p.C0936l;
import p.C0937m;
import p.C0938n;
import p.InterfaceC0933i;
import p.InterfaceC0939o;
import r0.AbstractC1065f;
import y2.AbstractC1343r;

/* loaded from: classes.dex */
public final class M implements InterfaceC0331g {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f38d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f39e;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ Object f40i;

    public /* synthetic */ M(Object obj, int i2, Object obj2) {
        this.f38d = i2;
        this.f40i = obj;
        this.f39e = obj2;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x011c  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x011f  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0107  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0119  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0146  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0155  */
    /* JADX WARN: Type inference failed for: r14v51, types: [E2.j, kotlin.jvm.functions.Function2] */
    @Override // Z2.InterfaceC0331g
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object d(Object obj, C2.a aVar) {
        E.d dVar;
        int i2;
        InterfaceC0933i interfaceC0933i;
        C0339o c0339o;
        int i4;
        boolean z4;
        Object obj2;
        Object obj3;
        M m4;
        C0342s c0342s;
        Object obj4;
        int i5;
        M m5;
        switch (this.f38d) {
            case 0:
                long j4 = ((Y.c) obj).f4372a;
                C0778d c0778d = (C0778d) this.f40i;
                if (AbstractC0345a.z(((Y.c) c0778d.d()).f4372a) && AbstractC0345a.z(j4) && Y.c.e(((Y.c) c0778d.d()).f4372a) != Y.c.e(j4)) {
                    W2.B.m((InterfaceC0302y) this.f39e, null, null, new L(c0778d, j4, null), 3);
                    return Unit.f7487a;
                }
                Object e4 = c0778d.e(aVar, new Y.c(j4));
                return e4 == D2.a.f2163d ? e4 : Unit.f7487a;
            case 1:
                InterfaceC0933i interfaceC0933i2 = (InterfaceC0933i) obj;
                boolean z5 = interfaceC0933i2 instanceof C0937m;
                C0106a c0106a = (C0106a) this.f40i;
                if (z5) {
                    C0937m c0937m = (C0937m) interfaceC0933i2;
                    C.r rVar = c0106a.f1068n;
                    if (rVar == null) {
                        rVar = C.C.a(c0106a.f1067m);
                        c0106a.f1068n = rVar;
                        Intrinsics.c(rVar);
                    }
                    C.u a4 = rVar.a(c0106a);
                    a4.b(c0937m, c0106a.f1063i, c0106a.f1071q, c0106a.f1072r, ((C0323u) c0106a.f1065k.getValue()).f4549a, ((C0113h) c0106a.f1066l.getValue()).f1092d, c0106a.f1073s);
                    c0106a.f1069o.setValue(a4);
                } else if (interfaceC0933i2 instanceof C0938n) {
                    C0937m c0937m2 = ((C0938n) interfaceC0933i2).f8975a;
                    C.u uVar = (C.u) c0106a.f1069o.getValue();
                    if (uVar != null) {
                        uVar.d();
                    }
                } else if (interfaceC0933i2 instanceof C0936l) {
                    C0937m c0937m3 = ((C0936l) interfaceC0933i2).f8973a;
                    C.u uVar2 = (C.u) c0106a.f1069o.getValue();
                    if (uVar2 != null) {
                        uVar2.d();
                    }
                } else {
                    c0106a.f1062e.c(interfaceC0933i2, (InterfaceC0302y) this.f39e);
                }
                return Unit.f7487a;
            case 2:
                InterfaceC0933i interfaceC0933i3 = (InterfaceC0933i) obj;
                boolean z6 = interfaceC0933i3 instanceof InterfaceC0939o;
                C.y yVar = (C.y) this.f40i;
                if (!z6) {
                    C.F f4 = yVar.f1148y;
                    if (f4 == null) {
                        f4 = new C.F(yVar.f1147x, yVar.f1144u);
                        AbstractC1065f.n(yVar);
                        yVar.f1148y = f4;
                    }
                    f4.c(interfaceC0933i3, (InterfaceC0302y) this.f39e);
                } else if (yVar.B) {
                    yVar.D0((InterfaceC0939o) interfaceC0933i3);
                } else {
                    yVar.f1142C.a(interfaceC0933i3);
                }
                return Unit.f7487a;
            case 3:
                InterfaceC0933i interfaceC0933i4 = (InterfaceC0933i) obj;
                boolean z7 = interfaceC0933i4 instanceof C0937m;
                M2.C c4 = (M2.C) this.f40i;
                if (z7) {
                    c4.f3578d++;
                } else if (interfaceC0933i4 instanceof C0938n) {
                    c4.f3578d--;
                } else if (interfaceC0933i4 instanceof C0936l) {
                    c4.f3578d--;
                }
                boolean z8 = c4.f3578d > 0;
                S1 s12 = (S1) this.f39e;
                if (s12.f1621v != z8) {
                    s12.f1621v = z8;
                    AbstractC1065f.o(s12);
                }
                return Unit.f7487a;
            case 4:
                if (aVar instanceof E.d) {
                    dVar = (E.d) aVar;
                    int i6 = dVar.f2182k;
                    if ((i6 & Integer.MIN_VALUE) != 0) {
                        dVar.f2182k = i6 - Integer.MIN_VALUE;
                        Object obj5 = dVar.f2181j;
                        D2.a aVar2 = D2.a.f2163d;
                        i2 = dVar.f2182k;
                        if (i2 != 0) {
                            AbstractC1343r.b(obj5);
                            InterfaceC0933i interfaceC0933i5 = (InterfaceC0933i) obj;
                            boolean z9 = interfaceC0933i5 instanceof C0937m;
                            E.f fVar = (E.f) this.f39e;
                            if (z9) {
                                fVar.getClass();
                                C0937m c0937m4 = new C0937m(Y.c.g(((C0937m) interfaceC0933i5).f8974a, fVar.f2187a));
                                fVar.f2188b.put(interfaceC0933i5, c0937m4);
                                interfaceC0933i = c0937m4;
                            } else if (interfaceC0933i5 instanceof C0936l) {
                                C0936l c0936l = (C0936l) interfaceC0933i5;
                                C0937m c0937m5 = (C0937m) fVar.f2188b.remove(c0936l.f8973a);
                                interfaceC0933i = c0936l;
                                if (c0937m5 != null) {
                                    interfaceC0933i = new C0936l(c0937m5);
                                }
                            } else {
                                boolean z10 = interfaceC0933i5 instanceof C0938n;
                                interfaceC0933i = interfaceC0933i5;
                                if (z10) {
                                    C0938n c0938n = (C0938n) interfaceC0933i5;
                                    C0937m c0937m6 = (C0937m) fVar.f2188b.remove(c0938n.f8975a);
                                    interfaceC0933i = c0938n;
                                    if (c0937m6 != null) {
                                        interfaceC0933i = new C0938n(c0937m6);
                                    }
                                }
                            }
                            dVar.f2182k = 1;
                            if (((InterfaceC0331g) this.f40i).d(interfaceC0933i, dVar) == aVar2) {
                                return aVar2;
                            }
                        } else {
                            if (i2 != 1) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            AbstractC1343r.b(obj5);
                        }
                        return Unit.f7487a;
                    }
                }
                dVar = new E.d(this, aVar);
                Object obj52 = dVar.f2181j;
                D2.a aVar22 = D2.a.f2163d;
                i2 = dVar.f2182k;
                if (i2 != 0) {
                }
                return Unit.f7487a;
            case 5:
                if (aVar instanceof C0339o) {
                    c0339o = (C0339o) aVar;
                    int i7 = c0339o.f4708l;
                    if ((i7 & Integer.MIN_VALUE) != 0) {
                        c0339o.f4708l = i7 - Integer.MIN_VALUE;
                        Object obj6 = c0339o.f4707k;
                        D2.a aVar3 = D2.a.f2163d;
                        i4 = c0339o.f4708l;
                        z4 = true;
                        if (i4 != 0) {
                            AbstractC1343r.b(obj6);
                            c0339o.f4706j = this;
                            c0339o.f4710n = obj;
                            c0339o.f4708l = 1;
                            Object h4 = ((C0626u) this.f40i).h(obj, c0339o);
                            if (h4 == aVar3) {
                                return aVar3;
                            }
                            obj2 = h4;
                            obj3 = obj;
                            m4 = this;
                        } else {
                            if (i4 != 1) {
                                if (i4 != 2) {
                                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                }
                                m4 = c0339o.f4706j;
                                AbstractC1343r.b(obj6);
                                if (z4) {
                                    return Unit.f7487a;
                                }
                                throw new C0423a(m4);
                            }
                            Object obj7 = c0339o.f4710n;
                            M m6 = c0339o.f4706j;
                            AbstractC1343r.b(obj6);
                            obj3 = obj7;
                            m4 = m6;
                            obj2 = obj6;
                        }
                        if (((Boolean) obj2).booleanValue()) {
                            z4 = false;
                        } else {
                            InterfaceC0331g interfaceC0331g = (InterfaceC0331g) m4.f39e;
                            c0339o.f4706j = m4;
                            c0339o.f4710n = null;
                            c0339o.f4708l = 2;
                            if (interfaceC0331g.d(obj3, c0339o) == aVar3) {
                                return aVar3;
                            }
                        }
                        if (z4) {
                        }
                    }
                }
                c0339o = new C0339o(this, aVar);
                Object obj62 = c0339o.f4707k;
                D2.a aVar32 = D2.a.f2163d;
                i4 = c0339o.f4708l;
                z4 = true;
                if (i4 != 0) {
                }
                if (((Boolean) obj2).booleanValue()) {
                }
                if (z4) {
                }
            case 6:
                if (aVar instanceof C0342s) {
                    c0342s = (C0342s) aVar;
                    int i8 = c0342s.f4720l;
                    if ((i8 & Integer.MIN_VALUE) != 0) {
                        c0342s.f4720l = i8 - Integer.MIN_VALUE;
                        obj4 = c0342s.f4719k;
                        D2.a aVar4 = D2.a.f2163d;
                        i5 = c0342s.f4720l;
                        if (i5 != 0) {
                            AbstractC1343r.b(obj4);
                            c0342s.f4718j = this;
                            c0342s.f4722n = obj;
                            c0342s.f4720l = 1;
                            obj4 = ((E2.j) this.f40i).h(obj, c0342s);
                            if (obj4 == aVar4) {
                                return aVar4;
                            }
                            m5 = this;
                        } else {
                            if (i5 != 1) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            obj = c0342s.f4722n;
                            m5 = c0342s.f4718j;
                            AbstractC1343r.b(obj4);
                        }
                        if (((Boolean) obj4).booleanValue()) {
                            return Unit.f7487a;
                        }
                        ((M2.E) m5.f39e).f3580d = obj;
                        throw new C0423a(m5);
                    }
                }
                c0342s = new C0342s(this, aVar);
                obj4 = c0342s.f4719k;
                D2.a aVar42 = D2.a.f2163d;
                i5 = c0342s.f4720l;
                if (i5 != 0) {
                }
                if (((Boolean) obj4).booleanValue()) {
                }
            case i1.i.DOUBLE_FIELD_NUMBER /* 7 */:
                InterfaceC0933i interfaceC0933i6 = (InterfaceC0933i) obj;
                boolean z11 = interfaceC0933i6 instanceof C0928d;
                ArrayList arrayList = (ArrayList) this.f40i;
                if (z11) {
                    arrayList.add(interfaceC0933i6);
                } else if (interfaceC0933i6 instanceof C0929e) {
                    arrayList.remove(((C0929e) interfaceC0933i6).f8967a);
                }
                ((InterfaceC0191c0) this.f39e).setValue(Boolean.valueOf(!arrayList.isEmpty()));
                return Unit.f7487a;
            default:
                ((InterfaceC0191c0) this.f40i).setValue(Boolean.TRUE);
                ((C0197f0) this.f39e).f(((C0487b) obj).f5531c);
                return Unit.f7487a;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public M(Function2 function2, M2.E e4) {
        this.f38d = 6;
        this.f40i = (E2.j) function2;
        this.f39e = e4;
    }
}
