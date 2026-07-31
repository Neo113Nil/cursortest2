package l;

import I.C0112o0;
import I.InterfaceC0088c0;
import h1.C0438i;
import m.s0;
import n2.C0698d;
import n2.C0699e;
import n2.C0707m;
import n2.InterfaceC0701g;
import o2.AbstractC0754c;

/* loaded from: classes.dex */
public final class q implements InterfaceC0701g {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f5495d;

    /* renamed from: e, reason: collision with root package name */
    public final Object f5496e;

    /* renamed from: f, reason: collision with root package name */
    public final Object f5497f;

    /* renamed from: g, reason: collision with root package name */
    public final Object f5498g;

    /* JADX WARN: Multi-variable type inference failed */
    public q(Z1.p pVar, InterfaceC0701g interfaceC0701g, Y1.e eVar) {
        this.f5495d = 2;
        this.f5496e = pVar;
        this.f5497f = interfaceC0701g;
        this.f5498g = (R1.i) eVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00d8  */
    /* JADX WARN: Type inference failed for: r9v20, types: [R1.i, Y1.e] */
    @Override // n2.InterfaceC0701g
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, P1.d dVar) {
        boolean z3;
        C0698d c0698d;
        int i3;
        C0707m c0707m;
        int i4;
        q qVar;
        switch (this.f5495d) {
            case 0:
                if (((Boolean) obj).booleanValue()) {
                    Y1.e eVar = (Y1.e) ((InterfaceC0088c0) this.f5498g).getValue();
                    s0 s0Var = (s0) this.f5497f;
                    z3 = ((Boolean) eVar.g(s0Var.f5841a.a(), s0Var.f5844d.getValue())).booleanValue();
                } else {
                    z3 = false;
                }
                ((C0112o0) this.f5496e).setValue(Boolean.valueOf(z3));
                return L1.z.f2729a;
            case 1:
                if (dVar instanceof C0698d) {
                    c0698d = (C0698d) dVar;
                    int i5 = c0698d.f6334f;
                    if ((i5 & Integer.MIN_VALUE) != 0) {
                        c0698d.f6334f = i5 - Integer.MIN_VALUE;
                        Object obj2 = c0698d.f6332d;
                        Q1.a aVar = Q1.a.f3113d;
                        i3 = c0698d.f6334f;
                        L1.z zVar = L1.z.f2729a;
                        if (i3 != 0) {
                            I2.l.Q(obj2);
                            ((C0699e) this.f5496e).getClass();
                            Z1.t tVar = (Z1.t) this.f5497f;
                            Object obj3 = tVar.f3480d;
                            if (obj3 == AbstractC0754c.f6699b || !Z1.i.a(obj3, obj)) {
                                tVar.f3480d = obj;
                                c0698d.f6334f = 1;
                                if (((InterfaceC0701g) this.f5498g).emit(obj, c0698d) == aVar) {
                                    return aVar;
                                }
                            }
                        } else {
                            if (i3 != 1) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            I2.l.Q(obj2);
                        }
                        return zVar;
                    }
                }
                c0698d = new C0698d(this, dVar);
                Object obj22 = c0698d.f6332d;
                Q1.a aVar2 = Q1.a.f3113d;
                i3 = c0698d.f6334f;
                L1.z zVar2 = L1.z.f2729a;
                if (i3 != 0) {
                }
                return zVar2;
            case C0438i.FLOAT_FIELD_NUMBER /* 2 */:
                if (dVar instanceof C0707m) {
                    c0707m = (C0707m) dVar;
                    int i6 = c0707m.f6362h;
                    if ((i6 & Integer.MIN_VALUE) != 0) {
                        c0707m.f6362h = i6 - Integer.MIN_VALUE;
                        Object obj4 = c0707m.f6360f;
                        Q1.a aVar3 = Q1.a.f3113d;
                        i4 = c0707m.f6362h;
                        L1.z zVar3 = L1.z.f2729a;
                        if (i4 != 0) {
                            I2.l.Q(obj4);
                            if (((Z1.p) this.f5496e).f3476d) {
                                c0707m.f6362h = 1;
                                if (((InterfaceC0701g) this.f5497f).emit(obj, c0707m) == aVar3) {
                                    return aVar3;
                                }
                                return zVar3;
                            }
                            c0707m.f6358d = this;
                            c0707m.f6359e = obj;
                            c0707m.f6362h = 2;
                            obj4 = ((R1.i) this.f5498g).g(obj, c0707m);
                            if (obj4 == aVar3) {
                                return aVar3;
                            }
                            qVar = this;
                            if (!((Boolean) obj4).booleanValue()) {
                            }
                            return zVar3;
                        }
                        if (i4 != 1) {
                            if (i4 == 2) {
                                obj = c0707m.f6359e;
                                qVar = c0707m.f6358d;
                                I2.l.Q(obj4);
                                if (!((Boolean) obj4).booleanValue()) {
                                    ((Z1.p) qVar.f5496e).f3476d = true;
                                    c0707m.f6358d = null;
                                    c0707m.f6359e = null;
                                    c0707m.f6362h = 3;
                                    if (((InterfaceC0701g) qVar.f5497f).emit(obj, c0707m) == aVar3) {
                                        return aVar3;
                                    }
                                }
                                return zVar3;
                            }
                            if (i4 != 3) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                        }
                        I2.l.Q(obj4);
                        return zVar3;
                    }
                }
                c0707m = new C0707m(this, dVar);
                Object obj42 = c0707m.f6360f;
                Q1.a aVar32 = Q1.a.f3113d;
                i4 = c0707m.f6362h;
                L1.z zVar32 = L1.z.f2729a;
                if (i4 != 0) {
                }
            default:
                Object a3 = AbstractC0754c.a((P1.i) this.f5496e, obj, this.f5497f, (o2.z) this.f5498g, dVar);
                return a3 == Q1.a.f3113d ? a3 : L1.z.f2729a;
        }
    }

    public /* synthetic */ q(Object obj, Object obj2, Object obj3, int i3) {
        this.f5495d = i3;
        this.f5496e = obj;
        this.f5497f = obj2;
        this.f5498g = obj3;
    }

    public q(InterfaceC0701g interfaceC0701g, P1.i iVar) {
        this.f5495d = 3;
        this.f5496e = iVar;
        this.f5497f = p2.a.m(iVar);
        this.f5498g = new o2.z(interfaceC0701g, null);
    }
}
