package l;

import G.C0192d;
import G.C0197f0;
import W2.InterfaceC0302y;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import y2.AbstractC1343r;

/* renamed from: l.L, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0767L extends E2.j implements Function2 {

    /* renamed from: k, reason: collision with root package name */
    public e3.c f7592k;

    /* renamed from: l, reason: collision with root package name */
    public U f7593l;

    /* renamed from: m, reason: collision with root package name */
    public int f7594m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ U f7595n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ Object f7596o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ m0 f7597p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0799z f7598q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0767L(C2.a aVar, Object obj, InterfaceC0799z interfaceC0799z, U u4, m0 m0Var) {
        super(2, aVar);
        this.f7595n = u4;
        this.f7596o = obj;
        this.f7597p = m0Var;
        this.f7598q = interfaceC0799z;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object h(Object obj, Object obj2) {
        return ((C0767L) j((C2.a) obj2, (InterfaceC0302y) obj)).l(Unit.f7487a);
    }

    @Override // E2.a
    public final C2.a j(C2.a aVar, Object obj) {
        m0 m0Var = this.f7597p;
        return new C0767L(aVar, this.f7596o, this.f7598q, this.f7595n, m0Var);
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0199 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x019a  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0144  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0168  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x018c A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x016d  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00bc A[RETURN] */
    @Override // E2.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object l(Object obj) {
        e3.c cVar;
        U u4;
        Object v4;
        Object obj2;
        z0 z0Var;
        C0789o c0789o;
        float f4;
        D2.a aVar = D2.a.f2163d;
        int i2 = this.f7594m;
        Object obj3 = this.f7596o;
        U u5 = this.f7595n;
        try {
            if (i2 == 0) {
                AbstractC1343r.b(obj);
                Object value = u5.f7634b.getValue();
                if (!Intrinsics.a(obj3, value)) {
                    U.q(u5);
                    u5.z(0.0f);
                    m0 m0Var = this.f7597p;
                    m0Var.q(obj3);
                    m0Var.o(0L);
                    u5.n(value);
                    u5.f7634b.setValue(obj3);
                }
                e3.c cVar2 = u5.f7642j;
                this.f7592k = cVar2;
                this.f7593l = u5;
                this.f7594m = 1;
                if (cVar2.c(null, this) == aVar) {
                    return aVar;
                }
                cVar = cVar2;
                u4 = u5;
            } else {
                if (i2 != 1) {
                    if (i2 == 2) {
                        AbstractC1343r.b(obj);
                        this.f7594m = 3;
                        if (U.u(u5, this) == aVar) {
                            return aVar;
                        }
                        if (!Intrinsics.a(u5.f7635c.getValue(), obj3)) {
                        }
                        return Unit.f7487a;
                    }
                    if (i2 != 3) {
                        if (i2 != 4) {
                            if (i2 != 5) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            AbstractC1343r.b(obj);
                            f4 = 0.0f;
                            u5.z(f4);
                            return Unit.f7487a;
                        }
                        AbstractC1343r.b(obj);
                        obj2 = obj3;
                        u5.n(obj2);
                        this.f7594m = 5;
                        if (U.t(u5, this) != aVar) {
                            return aVar;
                        }
                        f4 = 0.0f;
                        u5.z(f4);
                        return Unit.f7487a;
                    }
                    AbstractC1343r.b(obj);
                    if (!Intrinsics.a(u5.f7635c.getValue(), obj3)) {
                        C0197f0 c0197f0 = u5.f7640h;
                        if (c0197f0.d() < 1.0f) {
                            C0765J c0765j = u5.f7646n;
                            InterfaceC0799z interfaceC0799z = this.f7598q;
                            if (interfaceC0799z != null) {
                                v0 v0Var = w0.f7856a;
                                z0Var = interfaceC0799z.e();
                            } else {
                                z0Var = null;
                            }
                            if (c0765j == null || !Intrinsics.a(z0Var, c0765j.f7583b)) {
                                z0 z0Var2 = c0765j != null ? c0765j.f7583b : null;
                                C0789o c0789o2 = U.f7633s;
                                C0789o c0789o3 = U.f7632r;
                                if (z0Var2 != null) {
                                    long j4 = c0765j.f7582a;
                                    C0789o c0789o4 = c0765j.f7587f;
                                    c0789o3 = (C0789o) z0Var2.g(j4, c0765j.f7586e, c0789o2, c0789o4 == null ? c0789o3 : c0789o4);
                                } else if (c0765j != null && c0765j.f7582a != 0) {
                                    long j5 = c0765j.f7588g;
                                    if (j5 == Long.MIN_VALUE) {
                                        j5 = u5.f7638f;
                                    }
                                    float f5 = j5 / 1.0E9f;
                                    if (f5 > 0.0f) {
                                        c0789o = new C0789o(1.0f / f5);
                                        if (c0765j == null) {
                                            c0765j = new C0765J();
                                        }
                                        c0765j.f7583b = z0Var;
                                        c0765j.f7584c = false;
                                        c0765j.f7585d = c0197f0.d();
                                        float d4 = c0197f0.d();
                                        C0789o c0789o5 = c0765j.f7586e;
                                        c0789o5.e(d4, 0);
                                        obj2 = obj3;
                                        long j6 = u5.f7638f;
                                        c0765j.f7588g = j6;
                                        c0765j.f7582a = 0L;
                                        c0765j.f7587f = c0789o;
                                        c0765j.f7589h = z0Var == null ? z0Var.b(c0789o5, c0789o2, c0789o) : O2.c.b((1.0d - c0197f0.d()) * j6);
                                        u5.f7646n = c0765j;
                                        this.f7592k = null;
                                        this.f7593l = null;
                                        this.f7594m = 4;
                                        if (U.s(u5, this) == aVar) {
                                            return aVar;
                                        }
                                        u5.n(obj2);
                                        this.f7594m = 5;
                                        if (U.t(u5, this) != aVar) {
                                        }
                                    }
                                }
                                c0789o = c0789o3;
                                if (c0765j == null) {
                                }
                                c0765j.f7583b = z0Var;
                                c0765j.f7584c = false;
                                c0765j.f7585d = c0197f0.d();
                                float d42 = c0197f0.d();
                                C0789o c0789o52 = c0765j.f7586e;
                                c0789o52.e(d42, 0);
                                obj2 = obj3;
                                long j62 = u5.f7638f;
                                c0765j.f7588g = j62;
                                c0765j.f7582a = 0L;
                                c0765j.f7587f = c0789o;
                                c0765j.f7589h = z0Var == null ? z0Var.b(c0789o52, c0789o2, c0789o) : O2.c.b((1.0d - c0197f0.d()) * j62);
                                u5.f7646n = c0765j;
                                this.f7592k = null;
                                this.f7593l = null;
                                this.f7594m = 4;
                                if (U.s(u5, this) == aVar) {
                                }
                                u5.n(obj2);
                                this.f7594m = 5;
                                if (U.t(u5, this) != aVar) {
                                }
                            }
                        }
                        obj2 = obj3;
                        this.f7592k = null;
                        this.f7593l = null;
                        this.f7594m = 4;
                        if (U.s(u5, this) == aVar) {
                        }
                        u5.n(obj2);
                        this.f7594m = 5;
                        if (U.t(u5, this) != aVar) {
                        }
                    }
                    return Unit.f7487a;
                }
                u4 = this.f7593l;
                cVar = this.f7592k;
                AbstractC1343r.b(obj);
            }
            Object obj4 = u4.f7636d;
            cVar.e(null);
            if (!Intrinsics.a(obj3, obj4)) {
                this.f7592k = null;
                this.f7593l = null;
                this.f7594m = 2;
                if (u5.f7644l == Long.MIN_VALUE) {
                    v4 = C0192d.F(p()).f(u5.f7647o, this);
                    if (v4 != aVar) {
                        v4 = Unit.f7487a;
                    }
                } else {
                    v4 = u5.v(this);
                    if (v4 != aVar) {
                        v4 = Unit.f7487a;
                    }
                }
                if (v4 == aVar) {
                    return aVar;
                }
                this.f7594m = 3;
                if (U.u(u5, this) == aVar) {
                }
            }
            if (!Intrinsics.a(u5.f7635c.getValue(), obj3)) {
            }
            return Unit.f7487a;
        } catch (Throwable th) {
            cVar.e(null);
            throw th;
        }
    }
}
