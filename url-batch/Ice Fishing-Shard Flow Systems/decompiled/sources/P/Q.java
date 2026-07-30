package P;

import R5.C0164d;
import i.C0511M;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import n6.AbstractC0792z;
import n6.C0781n;
import n6.C0784q;
import n6.C0787u;
import n6.InterfaceC0780m;

/* loaded from: classes.dex */
public final class Q implements InterfaceC0144i {

    /* renamed from: d, reason: collision with root package name */
    public final W f2017d;

    /* renamed from: e, reason: collision with root package name */
    public final InterfaceC0138c f2018e;

    /* renamed from: i, reason: collision with root package name */
    public final s6.c f2019i;

    /* renamed from: l, reason: collision with root package name */
    public final C0511M f2020l;

    /* renamed from: m, reason: collision with root package name */
    public final v6.c f2021m;

    /* renamed from: n, reason: collision with root package name */
    public int f2022n;

    /* renamed from: o, reason: collision with root package name */
    public n6.l0 f2023o;

    /* renamed from: p, reason: collision with root package name */
    public final B.f f2024p;

    /* renamed from: q, reason: collision with root package name */
    public final P0.n f2025q;

    /* renamed from: r, reason: collision with root package name */
    public final R5.q f2026r;

    /* renamed from: s, reason: collision with root package name */
    public final R5.q f2027s;

    /* renamed from: t, reason: collision with root package name */
    public final com.google.firebase.messaging.z f2028t;

    public Q(W storage, List initTasksList, InterfaceC0138c corruptionHandler, s6.c scope) {
        Intrinsics.checkNotNullParameter(storage, "storage");
        Intrinsics.checkNotNullParameter(initTasksList, "initTasksList");
        Intrinsics.checkNotNullParameter(corruptionHandler, "corruptionHandler");
        Intrinsics.checkNotNullParameter(scope, "scope");
        this.f2017d = storage;
        this.f2018e = corruptionHandler;
        this.f2019i = scope;
        this.f2020l = new C0511M(new C0155u(this, null));
        this.f2021m = new v6.c();
        this.f2024p = new B.f(11);
        this.f2025q = new P0.n(this, initTasksList);
        this.f2026r = R5.i.b(new C0149n(this, 1));
        this.f2027s = R5.i.b(new C0149n(this, 0));
        G0.l onComplete = new G0.l(2, this);
        N consumeMessage = new N(this, null);
        Intrinsics.checkNotNullParameter(scope, "scope");
        Intrinsics.checkNotNullParameter(onComplete, "onComplete");
        M onUndeliveredElement = M.f2002d;
        Intrinsics.checkNotNullParameter(onUndeliveredElement, "onUndeliveredElement");
        Intrinsics.checkNotNullParameter(consumeMessage, "consumeMessage");
        com.google.firebase.messaging.z zVar = new com.google.firebase.messaging.z();
        zVar.f4535d = scope;
        zVar.f4536e = consumeMessage;
        zVar.f4537i = p6.j.a(Integer.MAX_VALUE, null, 6);
        zVar.f4538l = new B.f(10);
        n6.X x7 = (n6.X) scope.f7823d.g(C0787u.f7085e);
        if (x7 != null) {
            ((n6.f0) x7).F(true, new n6.I(1, new g0(onComplete, zVar)));
        }
        this.f2028t = zVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0050 A[Catch: all -> 0x0058, TryCatch #0 {all -> 0x0058, blocks: (B:12:0x0048, B:14:0x0050, B:16:0x0054, B:17:0x005a, B:18:0x005c), top: B:11:0x0048 }] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object b(Q q4, X5.c cVar) {
        C0156v c0156v;
        int i2;
        v6.c cVar2;
        int i5;
        try {
            if (cVar instanceof C0156v) {
                c0156v = (C0156v) cVar;
                int i7 = c0156v.f2167m;
                if ((i7 & Integer.MIN_VALUE) != 0) {
                    c0156v.f2167m = i7 - Integer.MIN_VALUE;
                    Object obj = c0156v.f2165i;
                    W5.a aVar = W5.a.f2787d;
                    i2 = c0156v.f2167m;
                    if (i2 != 0) {
                        V6.b.P(obj);
                        cVar2 = q4.f2021m;
                        c0156v.f2163d = q4;
                        c0156v.f2164e = cVar2;
                        c0156v.f2167m = 1;
                        if (cVar2.c(c0156v) == aVar) {
                            return aVar;
                        }
                    } else {
                        if (i2 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        v6.c cVar3 = c0156v.f2164e;
                        Q q7 = c0156v.f2163d;
                        V6.b.P(obj);
                        cVar2 = cVar3;
                        q4 = q7;
                    }
                    i5 = q4.f2022n - 1;
                    q4.f2022n = i5;
                    if (i5 == 0) {
                        n6.l0 l0Var = q4.f2023o;
                        if (l0Var != null) {
                            l0Var.d(null);
                        }
                        q4.f2023o = null;
                    }
                    Unit unit = Unit.f6114a;
                    cVar2.e(null);
                    return Unit.f6114a;
                }
            }
            i5 = q4.f2022n - 1;
            q4.f2022n = i5;
            if (i5 == 0) {
            }
            Unit unit2 = Unit.f6114a;
            cVar2.e(null);
            return Unit.f6114a;
        } catch (Throwable th) {
            cVar2.e(null);
            throw th;
        }
        c0156v = new C0156v(q4, cVar);
        Object obj2 = c0156v.f2165i;
        W5.a aVar2 = W5.a.f2787d;
        i2 = c0156v.f2167m;
        if (i2 != 0) {
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(11:0|1|(2:3|(7:5|6|7|(7:(1:(1:(1:12)(2:23|24))(3:25|26|27))(1:39)|13|14|15|(1:17)(1:21)|18|19)(5:40|41|42|(3:44|45|46)(3:50|(1:52)(1:67)|(2:54|(2:56|(1:58))(2:59|60))(2:61|(2:63|64)(2:65|66)))|33)|28|29|30))|70|6|7|(0)(0)|28|29|30|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x00bc, code lost:
    
        if (r9 != r1) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x007b, code lost:
    
        r8 = r11;
        r11 = r9;
        r9 = r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00c2, code lost:
    
        r9 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x0078, code lost:
    
        if (r9 == r1) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x0033, code lost:
    
        r10 = th;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:17:0x00eb  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00ef  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0024  */
    /* JADX WARN: Type inference failed for: r2v7, types: [X5.j, kotlin.jvm.functions.Function2] */
    /* JADX WARN: Type inference failed for: r2v8, types: [X5.j, kotlin.jvm.functions.Function2] */
    /* JADX WARN: Type inference failed for: r9v0, types: [P.Q] */
    /* JADX WARN: Type inference failed for: r9v1 */
    /* JADX WARN: Type inference failed for: r9v13 */
    /* JADX WARN: Type inference failed for: r9v16 */
    /* JADX WARN: Type inference failed for: r9v2 */
    /* JADX WARN: Type inference failed for: r9v20 */
    /* JADX WARN: Type inference failed for: r9v31 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object c(Q q4, d0 d0Var, X5.c cVar) {
        C0158x c0158x;
        int i2;
        C0781n c0781n;
        Throwable a7;
        C0781n c0781n2;
        Object b7;
        Q q7;
        InterfaceC0780m interfaceC0780m;
        if (cVar instanceof C0158x) {
            c0158x = (C0158x) cVar;
            int i5 = c0158x.f2175n;
            if ((i5 & Integer.MIN_VALUE) != 0) {
                c0158x.f2175n = i5 - Integer.MIN_VALUE;
                Object obj = c0158x.f2173l;
                W5.a aVar = W5.a.f2787d;
                i2 = c0158x.f2175n;
                boolean z7 = true;
                if (i2 == 0) {
                    if (i2 == 1) {
                        interfaceC0780m = (InterfaceC0780m) c0158x.f2170d;
                    } else if (i2 == 2) {
                        C0781n c0781n3 = c0158x.f2172i;
                        Q q8 = c0158x.f2171e;
                        d0 d0Var2 = (d0) c0158x.f2170d;
                        V6.b.P(obj);
                        c0781n2 = c0781n3;
                        q7 = q8;
                        d0Var = d0Var2;
                    } else {
                        if (i2 != 3) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        interfaceC0780m = (InterfaceC0780m) c0158x.f2170d;
                    }
                    V6.b.P(obj);
                    q4 = interfaceC0780m;
                    R5.l lVar = R5.n.f2421d;
                    c0781n = q4;
                    a7 = R5.n.a(obj);
                    C0781n c0781n4 = c0781n;
                    if (a7 != null) {
                        c0781n4.J(obj);
                    } else {
                        c0781n4.getClass();
                        c0781n4.J(new C0784q(a7, false));
                    }
                    return Unit.f6114a;
                }
                V6.b.P(obj);
                c0781n2 = d0Var.f2069b;
                try {
                    R5.l lVar2 = R5.n.f2421d;
                    m0 k7 = q4.f2024p.k();
                    if (k7 instanceof C0139d) {
                        ?? r22 = d0Var.f2068a;
                        CoroutineContext coroutineContext = d0Var.f2071d;
                        c0158x.f2170d = c0781n2;
                        c0158x.f2175n = 1;
                        try {
                            b7 = q4.g().b(new K(q4, coroutineContext, r22, null), c0158x);
                        } catch (Throwable th) {
                            th = th;
                            th = th;
                            q4 = c0781n2;
                            R5.l lVar3 = R5.n.f2421d;
                            obj = V6.b.n(th);
                            c0781n = q4;
                            a7 = R5.n.a(obj);
                            C0781n c0781n42 = c0781n;
                            if (a7 != null) {
                            }
                            return Unit.f6114a;
                        }
                    } else {
                        if (!(k7 instanceof e0)) {
                            z7 = k7 instanceof n0;
                        }
                        if (!z7) {
                            if (k7 instanceof c0) {
                                throw ((c0) k7).f2065b;
                            }
                            throw new R5.k();
                        }
                        if (k7 != d0Var.f2070c) {
                            Intrinsics.c(k7, "null cannot be cast to non-null type androidx.datastore.core.ReadException<T of androidx.datastore.core.DataStoreImpl.handleUpdate$lambda$2>");
                            throw ((e0) k7).f2075b;
                        }
                        c0158x.f2170d = d0Var;
                        c0158x.f2171e = q4;
                        c0158x.f2172i = c0781n2;
                        c0158x.f2175n = 2;
                        Object h7 = q4.h(c0158x);
                        q7 = q4;
                        if (h7 == aVar) {
                        }
                    }
                    return aVar;
                } catch (Throwable th2) {
                    th = th2;
                    q4 = c0781n2;
                    R5.l lVar32 = R5.n.f2421d;
                    obj = V6.b.n(th);
                    c0781n = q4;
                    a7 = R5.n.a(obj);
                    C0781n c0781n422 = c0781n;
                    if (a7 != null) {
                    }
                    return Unit.f6114a;
                }
                ?? r23 = d0Var.f2068a;
                CoroutineContext coroutineContext2 = d0Var.f2071d;
                c0158x.f2170d = c0781n2;
                c0158x.f2171e = null;
                c0158x.f2172i = null;
                c0158x.f2175n = 3;
                b7 = q7.g().b(new K(q7, coroutineContext2, r23, null), c0158x);
            }
        }
        c0158x = new C0158x(q4, cVar);
        Object obj2 = c0158x.f2173l;
        W5.a aVar2 = W5.a.f2787d;
        i2 = c0158x.f2175n;
        boolean z72 = true;
        if (i2 == 0) {
        }
        ?? r232 = d0Var.f2068a;
        CoroutineContext coroutineContext22 = d0Var.f2071d;
        c0158x.f2170d = c0781n2;
        c0158x.f2171e = null;
        c0158x.f2172i = null;
        c0158x.f2175n = 3;
        b7 = q7.g().b(new K(q7, coroutineContext22, r232, null), c0158x);
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x004f A[Catch: all -> 0x005e, TryCatch #0 {all -> 0x005e, blocks: (B:12:0x0048, B:14:0x004f, B:15:0x0060), top: B:11:0x0048 }] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object d(Q q4, X5.c cVar) {
        C0159y c0159y;
        int i2;
        v6.c cVar2;
        int i5;
        try {
            if (cVar instanceof C0159y) {
                c0159y = (C0159y) cVar;
                int i7 = c0159y.f2180m;
                if ((i7 & Integer.MIN_VALUE) != 0) {
                    c0159y.f2180m = i7 - Integer.MIN_VALUE;
                    Object obj = c0159y.f2178i;
                    W5.a aVar = W5.a.f2787d;
                    i2 = c0159y.f2180m;
                    if (i2 != 0) {
                        V6.b.P(obj);
                        cVar2 = q4.f2021m;
                        c0159y.f2176d = q4;
                        c0159y.f2177e = cVar2;
                        c0159y.f2180m = 1;
                        if (cVar2.c(c0159y) == aVar) {
                            return aVar;
                        }
                    } else {
                        if (i2 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        v6.c cVar3 = c0159y.f2177e;
                        Q q7 = c0159y.f2176d;
                        V6.b.P(obj);
                        cVar2 = cVar3;
                        q4 = q7;
                    }
                    i5 = q4.f2022n + 1;
                    q4.f2022n = i5;
                    if (i5 == 1) {
                        q4.f2023o = AbstractC0792z.l(q4.f2019i, null, new A(q4, null), 3);
                    }
                    Unit unit = Unit.f6114a;
                    cVar2.e(null);
                    return Unit.f6114a;
                }
            }
            i5 = q4.f2022n + 1;
            q4.f2022n = i5;
            if (i5 == 1) {
            }
            Unit unit2 = Unit.f6114a;
            cVar2.e(null);
            return Unit.f6114a;
        } catch (Throwable th) {
            cVar2.e(null);
            throw th;
        }
        c0159y = new C0159y(q4, cVar);
        Object obj2 = c0159y.f2178i;
        W5.a aVar2 = W5.a.f2787d;
        i2 = c0159y.f2180m;
        if (i2 != 0) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object e(Q q4, boolean z7, V5.b bVar) {
        C c7;
        W5.a aVar;
        int i2;
        Q q7;
        m0 m0Var;
        boolean z8;
        Q q8;
        Pair pair;
        if (bVar instanceof C) {
            c7 = (C) bVar;
            int i5 = c7.f1960n;
            if ((i5 & Integer.MIN_VALUE) != 0) {
                c7.f1960n = i5 - Integer.MIN_VALUE;
                Object obj = c7.f1958l;
                aVar = W5.a.f2787d;
                i2 = c7.f1960n;
                if (i2 != 0) {
                    V6.b.P(obj);
                    m0 k7 = q4.f2024p.k();
                    if (k7 instanceof n0) {
                        throw new IllegalStateException("This is a bug in DataStore. Please file a bug at: https://issuetracker.google.com/issues/new?component=907884&template=1466542");
                    }
                    l0 g7 = q4.g();
                    c7.f1955d = q4;
                    c7.f1956e = k7;
                    c7.f1957i = z7;
                    c7.f1960n = 1;
                    Integer a7 = g7.a();
                    if (a7 != aVar) {
                        q7 = q4;
                        m0Var = k7;
                        obj = a7;
                    }
                    return aVar;
                }
                if (i2 != 1) {
                    if (i2 == 2) {
                        q8 = c7.f1955d;
                        V6.b.P(obj);
                        pair = (Pair) obj;
                        m0 m0Var2 = (m0) pair.f6112d;
                        if (((Boolean) pair.f6113e).booleanValue()) {
                        }
                        return m0Var2;
                    }
                    if (i2 != 3) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    q8 = c7.f1955d;
                    V6.b.P(obj);
                    pair = (Pair) obj;
                    m0 m0Var22 = (m0) pair.f6112d;
                    if (((Boolean) pair.f6113e).booleanValue()) {
                        q8.f2024p.w(m0Var22);
                    }
                    return m0Var22;
                }
                z7 = c7.f1957i;
                m0Var = c7.f1956e;
                q7 = c7.f1955d;
                V6.b.P(obj);
                int intValue = ((Number) obj).intValue();
                z8 = m0Var instanceof C0139d;
                int i7 = !z8 ? m0Var.f2137a : -1;
                if (!z8 && intValue == i7) {
                    return m0Var;
                }
                if (z7) {
                    l0 g8 = q7.g();
                    E e7 = new E(q7, i7, null);
                    c7.f1955d = q7;
                    c7.f1956e = null;
                    c7.f1960n = 3;
                    obj = g8.c(e7, c7);
                    if (obj != aVar) {
                        q8 = q7;
                        pair = (Pair) obj;
                        m0 m0Var222 = (m0) pair.f6112d;
                        if (((Boolean) pair.f6113e).booleanValue()) {
                        }
                        return m0Var222;
                    }
                } else {
                    l0 g9 = q7.g();
                    D d7 = new D(q7, null);
                    c7.f1955d = q7;
                    c7.f1956e = null;
                    c7.f1960n = 2;
                    obj = g9.b(d7, c7);
                    if (obj != aVar) {
                        q8 = q7;
                        pair = (Pair) obj;
                        m0 m0Var2222 = (m0) pair.f6112d;
                        if (((Boolean) pair.f6113e).booleanValue()) {
                        }
                        return m0Var2222;
                    }
                }
                return aVar;
            }
        }
        c7 = new C(q4, bVar);
        Object obj2 = c7.f1958l;
        aVar = W5.a.f2787d;
        i2 = c7.f1960n;
        if (i2 != 0) {
        }
        int intValue2 = ((Number) obj2).intValue();
        z8 = m0Var instanceof C0139d;
        if (!z8) {
        }
        if (!z8) {
        }
        if (z7) {
        }
        return aVar;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(8:0|1|(2:3|(4:5|6|7|8))|72|6|7|8|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x005f, code lost:
    
        r11 = e;
     */
    /* JADX WARN: Removed duplicated region for block: B:12:0x002b  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x015b  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x013b A[Catch: all -> 0x0167, TryCatch #0 {all -> 0x0167, blocks: (B:27:0x0129, B:29:0x013b, B:32:0x0143), top: B:26:0x0129 }] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0153  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0143 A[Catch: all -> 0x0167, TRY_LEAVE, TryCatch #0 {all -> 0x0167, blocks: (B:27:0x0129, B:29:0x013b, B:32:0x0143), top: B:26:0x0129 }] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00fc  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x009f A[Catch: b -> 0x005f, TryCatch #1 {b -> 0x005f, blocks: (B:36:0x005a, B:37:0x00fe, B:40:0x0068, B:41:0x00e0, B:56:0x0085, B:58:0x009f, B:59:0x00a5, B:65:0x008e, B:68:0x00cd), top: B:7:0x0020 }] */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object f(Q q4, boolean z7, X5.c cVar) {
        F f7;
        kotlin.jvm.internal.D d7;
        C0137b c0137b;
        Q q7;
        boolean z8;
        kotlin.jvm.internal.D d8;
        C0137b c0137b2;
        Object b7;
        kotlin.jvm.internal.C c7;
        kotlin.jvm.internal.D d9;
        Integer a7;
        Q q8;
        int i2;
        Object obj;
        if (cVar instanceof F) {
            f7 = (F) cVar;
            int i5 = f7.f1977q;
            if ((i5 & Integer.MIN_VALUE) != 0) {
                f7.f1977q = i5 - Integer.MIN_VALUE;
                Object obj2 = f7.f1975o;
                Object obj3 = W5.a.f2787d;
                switch (f7.f1977q) {
                    case 0:
                        V6.b.P(obj2);
                        if (!z7) {
                            l0 g7 = q4.g();
                            f7.f1969d = q4;
                            f7.f1973m = z7;
                            f7.f1977q = 3;
                            obj2 = g7.a();
                            if (obj2 == obj3) {
                            }
                            int intValue = ((Number) obj2).intValue();
                            l0 g8 = q4.g();
                            G g9 = new G(q4, intValue, null);
                            f7.f1969d = q4;
                            f7.f1973m = z7;
                            f7.f1977q = 4;
                            obj2 = g8.c(g9, f7);
                            if (obj2 == obj3) {
                            }
                            return (C0139d) obj2;
                        }
                        f7.f1969d = q4;
                        f7.f1973m = z7;
                        f7.f1977q = 1;
                        obj2 = q4.i(f7);
                        if (obj2 == obj3) {
                        }
                        int hashCode = obj2 == null ? obj2.hashCode() : 0;
                        l0 g10 = q4.g();
                        f7.f1969d = q4;
                        f7.f1970e = obj2;
                        f7.f1973m = z7;
                        f7.f1974n = hashCode;
                        f7.f1977q = 2;
                        a7 = g10.a();
                        if (a7 != obj3) {
                            q8 = q4;
                            i2 = hashCode;
                            obj = obj2;
                            obj2 = a7;
                            return new C0139d(obj, i2, ((Number) obj2).intValue());
                        }
                        return obj3;
                    case 1:
                        z7 = f7.f1973m;
                        q4 = (Q) f7.f1969d;
                        V6.b.P(obj2);
                        if (obj2 == null) {
                        }
                        l0 g102 = q4.g();
                        f7.f1969d = q4;
                        f7.f1970e = obj2;
                        f7.f1973m = z7;
                        f7.f1974n = hashCode;
                        f7.f1977q = 2;
                        a7 = g102.a();
                        if (a7 != obj3) {
                        }
                        return obj3;
                    case 2:
                        i2 = f7.f1974n;
                        z7 = f7.f1973m;
                        obj = f7.f1970e;
                        q8 = (Q) f7.f1969d;
                        try {
                            V6.b.P(obj2);
                            return new C0139d(obj, i2, ((Number) obj2).intValue());
                        } catch (C0137b e7) {
                            e = e7;
                            q4 = q8;
                            d7 = new kotlin.jvm.internal.D();
                            InterfaceC0138c interfaceC0138c = q4.f2018e;
                            f7.f1969d = q4;
                            f7.f1970e = e;
                            f7.f1971i = d7;
                            f7.f1972l = d7;
                            f7.f1973m = z7;
                            f7.f1977q = 5;
                            Object f8 = interfaceC0138c.f(e);
                            if (f8 != obj3) {
                                c0137b = e;
                                obj2 = f8;
                                q7 = q4;
                                z8 = z7;
                                d8 = d7;
                                d8.f6152d = obj2;
                                kotlin.jvm.internal.C c8 = new kotlin.jvm.internal.C();
                                try {
                                    H h7 = new H(d7, q7, c8, null);
                                    f7.f1969d = c0137b;
                                    f7.f1970e = d7;
                                    f7.f1971i = c8;
                                    f7.f1972l = null;
                                    f7.f1977q = 6;
                                    if (z8) {
                                    }
                                    if (b7 != obj3) {
                                    }
                                } catch (Throwable th) {
                                    th = th;
                                    c0137b2 = c0137b;
                                    C0164d.a(c0137b2, th);
                                    throw c0137b2;
                                }
                            }
                            return obj3;
                        }
                    case 3:
                        z7 = f7.f1973m;
                        q4 = (Q) f7.f1969d;
                        V6.b.P(obj2);
                        int intValue2 = ((Number) obj2).intValue();
                        l0 g82 = q4.g();
                        G g92 = new G(q4, intValue2, null);
                        f7.f1969d = q4;
                        f7.f1973m = z7;
                        f7.f1977q = 4;
                        obj2 = g82.c(g92, f7);
                        if (obj2 == obj3) {
                        }
                        return (C0139d) obj2;
                    case 4:
                        boolean z9 = f7.f1973m;
                        V6.b.P(obj2);
                        return (C0139d) obj2;
                    case 5:
                        z8 = f7.f1973m;
                        d8 = f7.f1972l;
                        d7 = (kotlin.jvm.internal.D) f7.f1971i;
                        c0137b = (C0137b) f7.f1970e;
                        q7 = (Q) f7.f1969d;
                        V6.b.P(obj2);
                        d8.f6152d = obj2;
                        kotlin.jvm.internal.C c82 = new kotlin.jvm.internal.C();
                        H h72 = new H(d7, q7, c82, null);
                        f7.f1969d = c0137b;
                        f7.f1970e = d7;
                        f7.f1971i = c82;
                        f7.f1972l = null;
                        f7.f1977q = 6;
                        if (z8) {
                            b7 = q7.g().b(new C0157w(h72, null), f7);
                        } else {
                            q7.getClass();
                            b7 = h72.invoke(f7);
                        }
                        if (b7 != obj3) {
                            c7 = c82;
                            d9 = d7;
                            Object obj4 = d9.f6152d;
                            obj3 = new C0139d(obj4, obj4 != null ? obj4.hashCode() : 0, c7.f6151d);
                        }
                        return obj3;
                    case 6:
                        c7 = (kotlin.jvm.internal.C) f7.f1971i;
                        d9 = (kotlin.jvm.internal.D) f7.f1970e;
                        c0137b2 = (C0137b) f7.f1969d;
                        try {
                            V6.b.P(obj2);
                            Object obj42 = d9.f6152d;
                            obj3 = new C0139d(obj42, obj42 != null ? obj42.hashCode() : 0, c7.f6151d);
                            return obj3;
                        } catch (Throwable th2) {
                            th = th2;
                            C0164d.a(c0137b2, th);
                            throw c0137b2;
                        }
                    default:
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            }
        }
        f7 = new F(q4, cVar);
        Object obj22 = f7.f1975o;
        Object obj32 = W5.a.f2787d;
        switch (f7.f1977q) {
        }
    }

    @Override // P.InterfaceC0144i
    public final Object a(Function2 function2, X5.j jVar) {
        q0 q0Var = (q0) jVar.getContext().g(p0.f2146d);
        if (q0Var != null) {
            q0Var.b(this);
        }
        return AbstractC0792z.t(new q0(q0Var, this), new L(this, function2, null), jVar);
    }

    public final l0 g() {
        return (l0) this.f2027s.getValue();
    }

    @Override // P.InterfaceC0144i
    public final q6.d getData() {
        return this.f2020l;
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x0063, code lost:
    
        if (r4.i(r0) != r1) goto L28;
     */
    /* JADX WARN: Removed duplicated region for block: B:31:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object h(X5.c cVar) {
        B b7;
        int i2;
        Q q4;
        int intValue;
        int i5;
        Throwable th;
        Q q7;
        try {
            if (cVar instanceof B) {
                b7 = (B) cVar;
                int i7 = b7.f1954m;
                if ((i7 & Integer.MIN_VALUE) != 0) {
                    b7.f1954m = i7 - Integer.MIN_VALUE;
                    Object obj = b7.f1952i;
                    Object obj2 = W5.a.f2787d;
                    i2 = b7.f1954m;
                    if (i2 != 0) {
                        V6.b.P(obj);
                        l0 g7 = g();
                        b7.f1950d = this;
                        b7.f1954m = 1;
                        obj = g7.a();
                        if (obj != obj2) {
                            q4 = this;
                        }
                        return obj2;
                    }
                    if (i2 != 1) {
                        if (i2 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        i5 = b7.f1951e;
                        q7 = b7.f1950d;
                        try {
                            V6.b.P(obj);
                            return Unit.f6114a;
                        } catch (Throwable th2) {
                            th = th2;
                            q7.f2024p.w(new e0(th, i5));
                            throw th;
                        }
                    }
                    q4 = b7.f1950d;
                    V6.b.P(obj);
                    intValue = ((Number) obj).intValue();
                    P0.n nVar = q4.f2025q;
                    b7.f1950d = q4;
                    b7.f1951e = intValue;
                    b7.f1954m = 2;
                }
            }
            P0.n nVar2 = q4.f2025q;
            b7.f1950d = q4;
            b7.f1951e = intValue;
            b7.f1954m = 2;
        } catch (Throwable th3) {
            i5 = intValue;
            th = th3;
            q7 = q4;
            q7.f2024p.w(new e0(th, i5));
            throw th;
        }
        b7 = new B(this, cVar);
        Object obj3 = b7.f1952i;
        Object obj22 = W5.a.f2787d;
        i2 = b7.f1954m;
        if (i2 != 0) {
        }
        intValue = ((Number) obj3).intValue();
    }

    public final Object i(X5.c cVar) {
        return ((Z) this.f2026r.getValue()).a(new r(3, (V5.b) null), cVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object j(Object obj, boolean z7, X5.c cVar) {
        O o7;
        int i2;
        kotlin.jvm.internal.C c7;
        if (cVar instanceof O) {
            o7 = (O) cVar;
            int i5 = o7.f2009l;
            if ((i5 & Integer.MIN_VALUE) != 0) {
                o7.f2009l = i5 - Integer.MIN_VALUE;
                Object obj2 = o7.f2007e;
                W5.a aVar = W5.a.f2787d;
                i2 = o7.f2009l;
                if (i2 != 0) {
                    V6.b.P(obj2);
                    kotlin.jvm.internal.C c8 = new kotlin.jvm.internal.C();
                    Z z8 = (Z) this.f2026r.getValue();
                    P p7 = new P(c8, this, obj, z7, null);
                    o7.f2006d = c8;
                    o7.f2009l = 1;
                    if (z8.b(p7, o7) == aVar) {
                        return aVar;
                    }
                    c7 = c8;
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    c7 = o7.f2006d;
                    V6.b.P(obj2);
                }
                return new Integer(c7.f6151d);
            }
        }
        o7 = new O(this, cVar);
        Object obj22 = o7.f2007e;
        W5.a aVar2 = W5.a.f2787d;
        i2 = o7.f2009l;
        if (i2 != 0) {
        }
        return new Integer(c7.f6151d);
    }
}
