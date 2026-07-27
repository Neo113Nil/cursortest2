package E;

import A.M;
import D.C0127e0;
import M2.A;
import Z2.C;
import Z2.C0336l;
import Z2.C0338n;
import Z2.InterfaceC0330f;
import Z2.InterfaceC0331g;
import Z2.N;
import Z2.S;
import a3.C0423a;
import f1.C0621o;
import f1.C0626u;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.Intrinsics;
import y2.AbstractC1343r;

/* loaded from: classes.dex */
public final class e implements InterfaceC0330f {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f2184d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f2185e;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ Object f2186i;

    public /* synthetic */ e(Object obj, int i2, Object obj2) {
        this.f2184d = i2;
        this.f2185e = obj;
        this.f2186i = obj2;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0026  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:56:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00b9  */
    @Override // Z2.InterfaceC0330f
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object e(InterfaceC0331g interfaceC0331g, C2.a aVar) {
        C0336l c0336l;
        D2.a aVar2;
        int i2;
        Throwable th;
        a3.t tVar;
        e eVar;
        InterfaceC0331g interfaceC0331g2;
        C c4;
        C0338n c0338n;
        int i4;
        M m4;
        switch (this.f2184d) {
            case 0:
                Object e4 = ((InterfaceC0330f) this.f2185e).e(new M(interfaceC0331g, 4, (f) this.f2186i), aVar);
                return e4 == D2.a.f2163d ? e4 : Unit.f7487a;
            case 1:
                if (aVar instanceof C0336l) {
                    c0336l = (C0336l) aVar;
                    int i5 = c0336l.f4692k;
                    if ((i5 & Integer.MIN_VALUE) != 0) {
                        c0336l.f4692k = i5 - Integer.MIN_VALUE;
                        Object obj = c0336l.f4691j;
                        aVar2 = D2.a.f2163d;
                        i2 = c0336l.f4692k;
                        if (i2 != 0) {
                            AbstractC1343r.b(obj);
                            CoroutineContext coroutineContext = c0336l.f2311e;
                            Intrinsics.c(coroutineContext);
                            a3.t tVar2 = new a3.t(interfaceC0331g, coroutineContext);
                            try {
                                C0621o c0621o = (C0621o) this.f2185e;
                                c0336l.f4694m = this;
                                c0336l.f4695n = interfaceC0331g;
                                c0336l.f4696o = tVar2;
                                c0336l.f4692k = 1;
                                if (c0621o.h(tVar2, c0336l) == aVar2) {
                                    return aVar2;
                                }
                                eVar = this;
                                interfaceC0331g2 = interfaceC0331g;
                                tVar = tVar2;
                            } catch (Throwable th2) {
                                th = th2;
                                tVar = tVar2;
                                tVar.m();
                                throw th;
                            }
                        } else {
                            if (i2 != 1) {
                                if (i2 != 2) {
                                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                }
                                AbstractC1343r.b(obj);
                                return Unit.f7487a;
                            }
                            tVar = c0336l.f4696o;
                            interfaceC0331g2 = c0336l.f4695n;
                            eVar = c0336l.f4694m;
                            try {
                                AbstractC1343r.b(obj);
                            } catch (Throwable th3) {
                                th = th3;
                                tVar.m();
                                throw th;
                            }
                        }
                        tVar.m();
                        c4 = (C) eVar.f2186i;
                        c0336l.f4694m = null;
                        c0336l.f4695n = null;
                        c0336l.f4696o = null;
                        c0336l.f4692k = 2;
                        if (c4.e(interfaceC0331g2, c0336l) == aVar2) {
                            return aVar2;
                        }
                        return Unit.f7487a;
                    }
                }
                c0336l = new C0336l(this, aVar);
                Object obj2 = c0336l.f4691j;
                aVar2 = D2.a.f2163d;
                i2 = c0336l.f4692k;
                if (i2 != 0) {
                }
                tVar.m();
                c4 = (C) eVar.f2186i;
                c0336l.f4694m = null;
                c0336l.f4695n = null;
                c0336l.f4696o = null;
                c0336l.f4692k = 2;
                if (c4.e(interfaceC0331g2, c0336l) == aVar2) {
                }
                return Unit.f7487a;
            case 2:
                Object e5 = ((a3.o) this.f2185e).e(new C0127e0(new A(), interfaceC0331g, (N) this.f2186i), aVar);
                return e5 == D2.a.f2163d ? e5 : Unit.f7487a;
            default:
                if (aVar instanceof C0338n) {
                    c0338n = (C0338n) aVar;
                    int i6 = c0338n.f4703k;
                    if ((i6 & Integer.MIN_VALUE) != 0) {
                        c0338n.f4703k = i6 - Integer.MIN_VALUE;
                        Object obj3 = c0338n.f4702j;
                        D2.a aVar3 = D2.a.f2163d;
                        i4 = c0338n.f4703k;
                        if (i4 == 0) {
                            if (i4 != 1) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            m4 = c0338n.f4705m;
                            try {
                                AbstractC1343r.b(obj3);
                            } catch (C0423a e6) {
                                e = e6;
                            }
                            return Unit.f7487a;
                        }
                        AbstractC1343r.b(obj3);
                        S s4 = (S) this.f2185e;
                        M m5 = new M((C0626u) this.f2186i, 5, interfaceC0331g);
                        try {
                            c0338n.f4705m = m5;
                            c0338n.f4703k = 1;
                            s4.e(m5, c0338n);
                            return aVar3;
                        } catch (C0423a e7) {
                            e = e7;
                            m4 = m5;
                        }
                        if (e.f4941d != m4) {
                            throw e;
                        }
                        return Unit.f7487a;
                    }
                }
                c0338n = new C0338n(this, aVar);
                Object obj32 = c0338n.f4702j;
                D2.a aVar32 = D2.a.f2163d;
                i4 = c0338n.f4703k;
                if (i4 == 0) {
                }
                if (e.f4941d != m4) {
                }
                return Unit.f7487a;
        }
    }
}
