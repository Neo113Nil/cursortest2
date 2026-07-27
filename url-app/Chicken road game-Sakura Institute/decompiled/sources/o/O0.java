package o;

import W2.InterfaceC0302y;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import l0.C0800A;
import l0.C0813k;
import l0.EnumC0812j;
import y2.AbstractC1343r;

/* loaded from: classes.dex */
public final class O0 extends E2.i implements Function2 {

    /* renamed from: i, reason: collision with root package name */
    public Object f8679i;

    /* renamed from: j, reason: collision with root package name */
    public Object f8680j;

    /* renamed from: k, reason: collision with root package name */
    public M2.E f8681k;

    /* renamed from: l, reason: collision with root package name */
    public long f8682l;

    /* renamed from: m, reason: collision with root package name */
    public int f8683m;

    /* renamed from: n, reason: collision with root package name */
    public /* synthetic */ Object f8684n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0302y f8685o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ L2.c f8686p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ Function1 f8687q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ Function1 f8688r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ Function1 f8689s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ Q f8690t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public O0(InterfaceC0302y interfaceC0302y, L2.c cVar, Function1 function1, Function1 function12, Function1 function13, Q q2, C2.a aVar) {
        super(2, aVar);
        this.f8685o = interfaceC0302y;
        this.f8686p = cVar;
        this.f8687q = function1;
        this.f8688r = function12;
        this.f8689s = function13;
        this.f8690t = q2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object h(Object obj, Object obj2) {
        return ((O0) j((C2.a) obj2, (C0800A) obj)).l(Unit.f7487a);
    }

    @Override // E2.a
    public final C2.a j(C2.a aVar, Object obj) {
        O0 o0 = new O0(this.f8685o, this.f8686p, this.f8687q, this.f8688r, this.f8689s, this.f8690t, aVar);
        o0.f8684n = obj;
        return o0;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x01de  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x01f0  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x020c A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0179  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x018b  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0136  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00ee A[Catch: k -> 0x00f7, TryCatch #0 {k -> 0x00f7, blocks: (B:59:0x00e8, B:61:0x00ee, B:64:0x00fb), top: B:58:0x00e8 }] */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00fb A[Catch: k -> 0x00f7, TRY_LEAVE, TryCatch #0 {k -> 0x00f7, blocks: (B:59:0x00e8, B:61:0x00ee, B:64:0x00fb), top: B:58:0x00e8 }] */
    /* JADX WARN: Removed duplicated region for block: B:67:0x010b  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0127 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x00e4 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:86:0x00e5  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x00c2  */
    /* JADX WARN: Type inference failed for: r2v38 */
    /* JADX WARN: Type inference failed for: r2v43, types: [C2.a, W2.z, kotlin.coroutines.a] */
    /* JADX WARN: Type inference failed for: r2v44 */
    @Override // E2.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object l(Object obj) {
        C0800A c0800a;
        Object b4;
        C0800A c0800a2;
        l0.s sVar;
        long f4;
        M2.E e4;
        Object f5;
        C0800A c0800a3;
        l0.s sVar2;
        M2.E e5;
        C0800A c0800a4;
        Object obj2;
        Object obj3;
        Object g4;
        C0800A c0800a5;
        M2.E e6;
        long j4;
        l0.s sVar3;
        C0800A c0800a6;
        InterfaceC0302y interfaceC0302y;
        Function1 function1;
        Function1 function12;
        M2.E e7;
        M2.E e8;
        C0800A c0800a7;
        ?? r2;
        D2.a aVar = D2.a.f2163d;
        int i2 = this.f8683m;
        Q q2 = this.f8690t;
        InterfaceC0302y interfaceC0302y2 = this.f8685o;
        L2.c cVar = this.f8686p;
        Function1 function13 = this.f8689s;
        Function1 function14 = this.f8687q;
        switch (i2) {
            case 0:
                AbstractC1343r.b(obj);
                c0800a = (C0800A) this.f8684n;
                this.f8684n = c0800a;
                this.f8683m = 1;
                b4 = R0.b(c0800a, (r3 & 1) != 0, EnumC0812j.f7911e, this);
                if (b4 == aVar) {
                    return aVar;
                }
                c0800a2 = c0800a;
                sVar = (l0.s) b4;
                sVar.a();
                W2.B.m(interfaceC0302y2, null, null, new D0(q2, null), 3);
                if (cVar != R0.f8710a) {
                    W2.B.m(interfaceC0302y2, null, null, new E0(cVar, q2, sVar, null), 3);
                }
                f4 = function14 == null ? c0800a2.d().f() : 4611686018427387903L;
                e4 = new M2.E();
                try {
                    F0 f02 = new F0(2, null);
                    this.f8684n = c0800a2;
                    this.f8679i = sVar;
                    this.f8680j = e4;
                    this.f8681k = e4;
                    this.f8682l = f4;
                    this.f8683m = 2;
                    f5 = c0800a2.f(f4, f02, this);
                } catch (C0813k unused) {
                    c0800a4 = c0800a2;
                    if (function14 != null) {
                    }
                    this.f8684n = c0800a4;
                    this.f8679i = e4;
                    this.f8680j = null;
                    this.f8681k = null;
                    this.f8682l = f4;
                    this.f8683m = 3;
                    if (R0.a(c0800a4, this) == aVar) {
                    }
                    W2.B.m(interfaceC0302y2, null, null, new I0(q2, null), 3);
                    e5 = e4;
                    c0800a3 = c0800a4;
                    obj3 = e5.f3580d;
                    if (obj3 != null) {
                    }
                    return Unit.f7487a;
                }
                if (f5 != aVar) {
                    return aVar;
                }
                c0800a3 = c0800a2;
                sVar2 = sVar;
                e5 = e4;
                try {
                    e4.f3580d = f5;
                    obj2 = e5.f3580d;
                    if (obj2 != null) {
                        W2.B.m(interfaceC0302y2, null, null, new G0(q2, null), 3);
                    } else {
                        ((l0.s) obj2).a();
                        W2.B.m(interfaceC0302y2, null, null, new H0(q2, null), 3);
                    }
                } catch (C0813k unused2) {
                    e4 = e5;
                    sVar = sVar2;
                    c0800a4 = c0800a3;
                    if (function14 != null) {
                        function14.invoke(new Y.c(sVar.f7925c));
                    }
                    this.f8684n = c0800a4;
                    this.f8679i = e4;
                    this.f8680j = null;
                    this.f8681k = null;
                    this.f8682l = f4;
                    this.f8683m = 3;
                    if (R0.a(c0800a4, this) == aVar) {
                        return aVar;
                    }
                    W2.B.m(interfaceC0302y2, null, null, new I0(q2, null), 3);
                    e5 = e4;
                    c0800a3 = c0800a4;
                    obj3 = e5.f3580d;
                    if (obj3 != null) {
                    }
                    return Unit.f7487a;
                }
                obj3 = e5.f3580d;
                if (obj3 != null) {
                    if (this.f8688r != null) {
                        this.f8684n = c0800a3;
                        this.f8679i = e5;
                        this.f8680j = null;
                        this.f8681k = null;
                        this.f8682l = f4;
                        this.f8683m = 4;
                        C0910s0 c0910s0 = R0.f8710a;
                        long j5 = f4;
                        g4 = c0800a3.g(c0800a3.d().e(), new C0914u0((l0.s) obj3, null), this);
                        if (g4 == aVar) {
                            return aVar;
                        }
                        c0800a5 = c0800a3;
                        e6 = e5;
                        j4 = j5;
                        sVar3 = (l0.s) g4;
                        if (sVar3 == null) {
                            W2.B.m(interfaceC0302y2, null, null, new J0(q2, null), 3);
                            if (cVar != R0.f8710a) {
                                W2.B.m(interfaceC0302y2, null, null, new K0(cVar, q2, sVar3, null), 3);
                            }
                            try {
                                function1 = function13;
                                function12 = function14;
                                long j6 = j4;
                                c0800a6 = c0800a5;
                                interfaceC0302y = interfaceC0302y2;
                                e7 = e6;
                                try {
                                    N0 n02 = new N0(this.f8685o, this.f8688r, this.f8689s, e6, q2, null);
                                    this.f8684n = c0800a6;
                                    this.f8679i = e7;
                                    this.f8680j = sVar3;
                                    this.f8683m = 5;
                                    if (c0800a6.f(j6, n02, this) == aVar) {
                                        return aVar;
                                    }
                                } catch (C0813k unused3) {
                                    e8 = e7;
                                    c0800a7 = c0800a6;
                                    if (function1 != null) {
                                        function1.invoke(new Y.c(((l0.s) e8.f3580d).f7925c));
                                    }
                                    if (function12 != null) {
                                        function12.invoke(new Y.c(sVar3.f7925c));
                                    }
                                    r2 = 0;
                                    this.f8684n = null;
                                    this.f8679i = null;
                                    this.f8680j = null;
                                    this.f8683m = 6;
                                    if (R0.a(c0800a7, this) == aVar) {
                                        return aVar;
                                    }
                                    W2.B.m(interfaceC0302y, r2, r2, new C0(q2, r2), 3);
                                    return Unit.f7487a;
                                }
                            } catch (C0813k unused4) {
                                c0800a6 = c0800a5;
                                interfaceC0302y = interfaceC0302y2;
                                function1 = function13;
                                function12 = function14;
                                e7 = e6;
                            }
                        } else if (function13 != null) {
                            function13.invoke(new Y.c(((l0.s) e6.f3580d).f7925c));
                        }
                    } else if (function13 != null) {
                        function13.invoke(new Y.c(((l0.s) obj3).f7925c));
                    }
                }
                return Unit.f7487a;
            case 1:
                c0800a = (C0800A) this.f8684n;
                AbstractC1343r.b(obj);
                b4 = obj;
                c0800a2 = c0800a;
                sVar = (l0.s) b4;
                sVar.a();
                W2.B.m(interfaceC0302y2, null, null, new D0(q2, null), 3);
                if (cVar != R0.f8710a) {
                }
                if (function14 == null) {
                }
                e4 = new M2.E();
                F0 f022 = new F0(2, null);
                this.f8684n = c0800a2;
                this.f8679i = sVar;
                this.f8680j = e4;
                this.f8681k = e4;
                this.f8682l = f4;
                this.f8683m = 2;
                f5 = c0800a2.f(f4, f022, this);
                if (f5 != aVar) {
                }
                break;
            case 2:
                f4 = this.f8682l;
                e4 = this.f8681k;
                M2.E e9 = (M2.E) this.f8680j;
                sVar = (l0.s) this.f8679i;
                c0800a2 = (C0800A) this.f8684n;
                try {
                    AbstractC1343r.b(obj);
                    c0800a3 = c0800a2;
                    sVar2 = sVar;
                    e5 = e9;
                    f5 = obj;
                    e4.f3580d = f5;
                    obj2 = e5.f3580d;
                    if (obj2 != null) {
                    }
                } catch (C0813k unused5) {
                    e4 = e9;
                    c0800a4 = c0800a2;
                    if (function14 != null) {
                    }
                    this.f8684n = c0800a4;
                    this.f8679i = e4;
                    this.f8680j = null;
                    this.f8681k = null;
                    this.f8682l = f4;
                    this.f8683m = 3;
                    if (R0.a(c0800a4, this) == aVar) {
                    }
                    W2.B.m(interfaceC0302y2, null, null, new I0(q2, null), 3);
                    e5 = e4;
                    c0800a3 = c0800a4;
                    obj3 = e5.f3580d;
                    if (obj3 != null) {
                    }
                    return Unit.f7487a;
                }
                obj3 = e5.f3580d;
                if (obj3 != null) {
                }
                return Unit.f7487a;
            case 3:
                f4 = this.f8682l;
                e4 = (M2.E) this.f8679i;
                c0800a4 = (C0800A) this.f8684n;
                AbstractC1343r.b(obj);
                W2.B.m(interfaceC0302y2, null, null, new I0(q2, null), 3);
                e5 = e4;
                c0800a3 = c0800a4;
                obj3 = e5.f3580d;
                if (obj3 != null) {
                }
                return Unit.f7487a;
            case 4:
                long j7 = this.f8682l;
                M2.E e10 = (M2.E) this.f8679i;
                C0800A c0800a8 = (C0800A) this.f8684n;
                AbstractC1343r.b(obj);
                e6 = e10;
                c0800a5 = c0800a8;
                g4 = obj;
                j4 = j7;
                sVar3 = (l0.s) g4;
                if (sVar3 == null) {
                }
                return Unit.f7487a;
            case 5:
                sVar3 = (l0.s) this.f8680j;
                e8 = (M2.E) this.f8679i;
                c0800a7 = (C0800A) this.f8684n;
                try {
                    AbstractC1343r.b(obj);
                } catch (C0813k unused6) {
                    interfaceC0302y = interfaceC0302y2;
                    function1 = function13;
                    function12 = function14;
                    if (function1 != null) {
                    }
                    if (function12 != null) {
                    }
                    r2 = 0;
                    this.f8684n = null;
                    this.f8679i = null;
                    this.f8680j = null;
                    this.f8683m = 6;
                    if (R0.a(c0800a7, this) == aVar) {
                    }
                    W2.B.m(interfaceC0302y, r2, r2, new C0(q2, r2), 3);
                    return Unit.f7487a;
                }
                return Unit.f7487a;
            case 6:
                AbstractC1343r.b(obj);
                interfaceC0302y = interfaceC0302y2;
                r2 = 0;
                W2.B.m(interfaceC0302y, r2, r2, new C0(q2, r2), 3);
                return Unit.f7487a;
            default:
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }
}
