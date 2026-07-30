package y4;

import P.C0151p;
import kotlin.Unit;
import r6.C0853a;

/* renamed from: y4.o, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1046o implements q6.e {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f8607d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ q6.e f8608e;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ Object f8609i;

    public /* synthetic */ C1046o(q6.e eVar, T.d dVar, int i2) {
        this.f8607d = i2;
        this.f8608e = eVar;
        this.f8609i = dVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0027  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00eb  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0135  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0143  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x017f  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x018d  */
    @Override // q6.e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(Object obj, V5.b bVar) {
        C1045n c1045n;
        int i2;
        t tVar;
        int i5;
        x xVar;
        int i7;
        z zVar;
        int i8;
        q6.n nVar;
        int i9;
        boolean z7;
        Object obj2;
        Object obj3;
        C1046o c1046o;
        switch (this.f8607d) {
            case 0:
                if (bVar instanceof C1045n) {
                    c1045n = (C1045n) bVar;
                    int i10 = c1045n.f8605e;
                    if ((i10 & Integer.MIN_VALUE) != 0) {
                        c1045n.f8605e = i10 - Integer.MIN_VALUE;
                        Object obj4 = c1045n.f8604d;
                        W5.a aVar = W5.a.f2787d;
                        i2 = c1045n.f8605e;
                        if (i2 != 0) {
                            V6.b.P(obj4);
                            Object c7 = ((T.b) obj).c((T.d) this.f8609i);
                            c1045n.f8605e = 1;
                            if (this.f8608e.a(c7, c1045n) == aVar) {
                                return aVar;
                            }
                        } else {
                            if (i2 != 1) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            V6.b.P(obj4);
                        }
                        return Unit.f6114a;
                    }
                }
                c1045n = new C1045n(this, bVar);
                Object obj42 = c1045n.f8604d;
                W5.a aVar2 = W5.a.f2787d;
                i2 = c1045n.f8605e;
                if (i2 != 0) {
                }
                return Unit.f6114a;
            case 1:
                if (bVar instanceof t) {
                    tVar = (t) bVar;
                    int i11 = tVar.f8627e;
                    if ((i11 & Integer.MIN_VALUE) != 0) {
                        tVar.f8627e = i11 - Integer.MIN_VALUE;
                        Object obj5 = tVar.f8626d;
                        W5.a aVar3 = W5.a.f2787d;
                        i5 = tVar.f8627e;
                        if (i5 != 0) {
                            V6.b.P(obj5);
                            Object c8 = ((T.b) obj).c((T.d) this.f8609i);
                            tVar.f8627e = 1;
                            if (this.f8608e.a(c8, tVar) == aVar3) {
                                return aVar3;
                            }
                        } else {
                            if (i5 != 1) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            V6.b.P(obj5);
                        }
                        return Unit.f6114a;
                    }
                }
                tVar = new t(this, bVar);
                Object obj52 = tVar.f8626d;
                W5.a aVar32 = W5.a.f2787d;
                i5 = tVar.f8627e;
                if (i5 != 0) {
                }
                return Unit.f6114a;
            case 2:
                if (bVar instanceof x) {
                    xVar = (x) bVar;
                    int i12 = xVar.f8646e;
                    if ((i12 & Integer.MIN_VALUE) != 0) {
                        xVar.f8646e = i12 - Integer.MIN_VALUE;
                        Object obj6 = xVar.f8645d;
                        W5.a aVar4 = W5.a.f2787d;
                        i7 = xVar.f8646e;
                        if (i7 != 0) {
                            V6.b.P(obj6);
                            Object c9 = ((T.b) obj).c((T.d) this.f8609i);
                            xVar.f8646e = 1;
                            if (this.f8608e.a(c9, xVar) == aVar4) {
                                return aVar4;
                            }
                        } else {
                            if (i7 != 1) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            V6.b.P(obj6);
                        }
                        return Unit.f6114a;
                    }
                }
                xVar = new x(this, bVar);
                Object obj62 = xVar.f8645d;
                W5.a aVar42 = W5.a.f2787d;
                i7 = xVar.f8646e;
                if (i7 != 0) {
                }
                return Unit.f6114a;
            case 3:
                if (bVar instanceof z) {
                    zVar = (z) bVar;
                    int i13 = zVar.f8654e;
                    if ((i13 & Integer.MIN_VALUE) != 0) {
                        zVar.f8654e = i13 - Integer.MIN_VALUE;
                        Object obj7 = zVar.f8653d;
                        W5.a aVar5 = W5.a.f2787d;
                        i8 = zVar.f8654e;
                        if (i8 != 0) {
                            V6.b.P(obj7);
                            Object c10 = ((T.b) obj).c((T.d) this.f8609i);
                            zVar.f8654e = 1;
                            if (this.f8608e.a(c10, zVar) == aVar5) {
                                return aVar5;
                            }
                        } else {
                            if (i8 != 1) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            V6.b.P(obj7);
                        }
                        return Unit.f6114a;
                    }
                }
                zVar = new z(this, bVar);
                Object obj72 = zVar.f8653d;
                W5.a aVar52 = W5.a.f2787d;
                i8 = zVar.f8654e;
                if (i8 != 0) {
                }
                return Unit.f6114a;
            default:
                if (bVar instanceof q6.n) {
                    nVar = (q6.n) bVar;
                    int i14 = nVar.f7399i;
                    if ((i14 & Integer.MIN_VALUE) != 0) {
                        nVar.f7399i = i14 - Integer.MIN_VALUE;
                        Object obj8 = nVar.f7398e;
                        W5.a aVar6 = W5.a.f2787d;
                        i9 = nVar.f7399i;
                        z7 = true;
                        if (i9 != 0) {
                            V6.b.P(obj8);
                            C0151p c0151p = (C0151p) this.f8609i;
                            nVar.f7397d = this;
                            nVar.f7401m = obj;
                            nVar.f7399i = 1;
                            Object invoke = c0151p.invoke(obj, nVar);
                            if (invoke == aVar6) {
                                return aVar6;
                            }
                            obj2 = invoke;
                            obj3 = obj;
                            c1046o = this;
                        } else {
                            if (i9 != 1) {
                                if (i9 != 2) {
                                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                }
                                c1046o = nVar.f7397d;
                                V6.b.P(obj8);
                                if (z7) {
                                    return Unit.f6114a;
                                }
                                throw new C0853a(c1046o);
                            }
                            Object obj9 = nVar.f7401m;
                            C1046o c1046o2 = nVar.f7397d;
                            V6.b.P(obj8);
                            obj3 = obj9;
                            c1046o = c1046o2;
                            obj2 = obj8;
                        }
                        if (((Boolean) obj2).booleanValue()) {
                            z7 = false;
                        } else {
                            q6.e eVar = c1046o.f8608e;
                            nVar.f7397d = c1046o;
                            nVar.f7401m = null;
                            nVar.f7399i = 2;
                            if (eVar.a(obj3, nVar) == aVar6) {
                                return aVar6;
                            }
                        }
                        if (z7) {
                        }
                    }
                }
                nVar = new q6.n(this, bVar);
                Object obj82 = nVar.f7398e;
                W5.a aVar62 = W5.a.f2787d;
                i9 = nVar.f7399i;
                z7 = true;
                if (i9 != 0) {
                }
                if (((Boolean) obj2).booleanValue()) {
                }
                if (z7) {
                }
        }
    }

    public C1046o(C0151p c0151p, q6.e eVar) {
        this.f8607d = 4;
        this.f8609i = c0151p;
        this.f8608e = eVar;
    }
}
