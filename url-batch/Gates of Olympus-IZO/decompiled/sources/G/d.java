package G;

import E.C0025g;
import I2.l;
import L1.z;
import Z1.p;
import e1.C0365n;
import e1.C0370t;
import h1.C0438i;
import l.q;
import n2.C0677B;
import n2.C0688M;
import n2.C0692Q;
import n2.C0706l;
import n2.C0708n;
import n2.InterfaceC0700f;
import n2.InterfaceC0701g;
import o2.C0752a;
import o2.n;
import o2.s;

/* loaded from: classes.dex */
public final class d implements InterfaceC0700f {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f1512d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f1513e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f1514f;

    public /* synthetic */ d(Object obj, int i3, Object obj2) {
        this.f1512d = i3;
        this.f1513e = obj;
        this.f1514f = obj2;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0026  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:56:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00bb  */
    @Override // n2.InterfaceC0700f
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object collect(InterfaceC0701g interfaceC0701g, P1.d dVar) {
        C0706l c0706l;
        Q1.a aVar;
        int i3;
        Throwable th;
        s sVar;
        d dVar2;
        InterfaceC0701g interfaceC0701g2;
        C0677B c0677b;
        C0708n c0708n;
        int i4;
        C0025g c0025g;
        switch (this.f1512d) {
            case 0:
                Object collect = ((InterfaceC0700f) this.f1513e).collect(new C0025g(interfaceC0701g, 2, (e) this.f1514f), dVar);
                return collect == Q1.a.f3113d ? collect : z.f2729a;
            case 1:
                if (dVar instanceof C0706l) {
                    c0706l = (C0706l) dVar;
                    int i5 = c0706l.f6353e;
                    if ((i5 & Integer.MIN_VALUE) != 0) {
                        c0706l.f6353e = i5 - Integer.MIN_VALUE;
                        Object obj = c0706l.f6352d;
                        aVar = Q1.a.f3113d;
                        i3 = c0706l.f6353e;
                        z zVar = z.f2729a;
                        if (i3 != 0) {
                            l.Q(obj);
                            s sVar2 = new s(interfaceC0701g, c0706l.getContext());
                            try {
                                C0365n c0365n = (C0365n) this.f1513e;
                                c0706l.f6355g = this;
                                c0706l.f6356h = interfaceC0701g;
                                c0706l.f6357i = sVar2;
                                c0706l.f6353e = 1;
                                c0365n.g(sVar2, c0706l);
                                if (zVar == aVar) {
                                    return aVar;
                                }
                                dVar2 = this;
                                interfaceC0701g2 = interfaceC0701g;
                                sVar = sVar2;
                            } catch (Throwable th2) {
                                th = th2;
                                sVar = sVar2;
                                sVar.releaseIntercepted();
                                throw th;
                            }
                        } else {
                            if (i3 != 1) {
                                if (i3 != 2) {
                                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                }
                                l.Q(obj);
                                return zVar;
                            }
                            sVar = c0706l.f6357i;
                            interfaceC0701g2 = c0706l.f6356h;
                            dVar2 = c0706l.f6355g;
                            try {
                                l.Q(obj);
                            } catch (Throwable th3) {
                                th = th3;
                                sVar.releaseIntercepted();
                                throw th;
                            }
                        }
                        sVar.releaseIntercepted();
                        c0677b = (C0677B) dVar2.f1514f;
                        c0706l.f6355g = null;
                        c0706l.f6356h = null;
                        c0706l.f6357i = null;
                        c0706l.f6353e = 2;
                        if (c0677b.collect(interfaceC0701g2, c0706l) == aVar) {
                            return aVar;
                        }
                        return zVar;
                    }
                }
                c0706l = new C0706l(this, dVar);
                Object obj2 = c0706l.f6352d;
                aVar = Q1.a.f3113d;
                i3 = c0706l.f6353e;
                z zVar2 = z.f2729a;
                if (i3 != 0) {
                }
                sVar.releaseIntercepted();
                c0677b = (C0677B) dVar2.f1514f;
                c0706l.f6355g = null;
                c0706l.f6356h = null;
                c0706l.f6357i = null;
                c0706l.f6353e = 2;
                if (c0677b.collect(interfaceC0701g2, c0706l) == aVar) {
                }
                return zVar2;
            case C0438i.FLOAT_FIELD_NUMBER /* 2 */:
                Object collect2 = ((n) this.f1513e).collect(new q(new p(), interfaceC0701g, (C0688M) this.f1514f), dVar);
                return collect2 == Q1.a.f3113d ? collect2 : z.f2729a;
            default:
                if (dVar instanceof C0708n) {
                    c0708n = (C0708n) dVar;
                    int i6 = c0708n.f6364e;
                    if ((i6 & Integer.MIN_VALUE) != 0) {
                        c0708n.f6364e = i6 - Integer.MIN_VALUE;
                        Object obj3 = c0708n.f6363d;
                        Q1.a aVar2 = Q1.a.f3113d;
                        i4 = c0708n.f6364e;
                        if (i4 == 0) {
                            if (i4 != 1) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            c0025g = c0708n.f6366g;
                            try {
                                l.Q(obj3);
                            } catch (C0752a e3) {
                                e = e3;
                            }
                            return z.f2729a;
                        }
                        l.Q(obj3);
                        C0692Q c0692q = (C0692Q) this.f1513e;
                        C0025g c0025g2 = new C0025g((C0370t) this.f1514f, 3, interfaceC0701g);
                        try {
                            c0708n.f6366g = c0025g2;
                            c0708n.f6364e = 1;
                            c0692q.collect(c0025g2, c0708n);
                            return aVar2;
                        } catch (C0752a e4) {
                            e = e4;
                            c0025g = c0025g2;
                        }
                        if (e.f6693d != c0025g) {
                            throw e;
                        }
                        return z.f2729a;
                    }
                }
                c0708n = new C0708n(this, dVar);
                Object obj32 = c0708n.f6363d;
                Q1.a aVar22 = Q1.a.f3113d;
                i4 = c0708n.f6364e;
                if (i4 == 0) {
                }
                if (e.f6693d != c0025g) {
                }
                return z.f2729a;
        }
    }
}
