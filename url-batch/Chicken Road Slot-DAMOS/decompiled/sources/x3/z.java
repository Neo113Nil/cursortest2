package x3;

import ge.r1;
import java.io.File;
import java.util.LinkedHashSet;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import v.c1;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class z implements f {

    /* renamed from: d, reason: collision with root package name */
    public final e0 f10495d;

    /* renamed from: e, reason: collision with root package name */
    public final c1 f10496e;

    /* renamed from: i, reason: collision with root package name */
    public final ge.x f10497i;

    /* renamed from: r, reason: collision with root package name */
    public final je.x f10498r;

    /* renamed from: s, reason: collision with root package name */
    public final oe.c f10499s;

    /* renamed from: t, reason: collision with root package name */
    public int f10500t;

    /* renamed from: u, reason: collision with root package name */
    public r1 f10501u;

    /* renamed from: v, reason: collision with root package name */
    public final a0 f10502v;

    /* renamed from: w, reason: collision with root package name */
    public final c6.n f10503w;

    /* renamed from: x, reason: collision with root package name */
    public final hd.q f10504x;

    /* renamed from: y, reason: collision with root package name */
    public final hd.q f10505y;

    /* renamed from: z, reason: collision with root package name */
    public final com.google.firebase.messaging.v f10506z;

    public z(e0 e0Var, List list, c1 c1Var, ge.x xVar) {
        list.getClass();
        this.f10495d = e0Var;
        this.f10496e = c1Var;
        this.f10497i = xVar;
        ld.a aVar = null;
        this.f10498r = new je.x(new b5.t(this, aVar, 16));
        this.f10499s = new oe.c();
        this.f10502v = new a0();
        this.f10503w = new c6.n(this, list);
        final int i3 = 0;
        this.f10504x = hd.h.b(new Function0(this) { // from class: x3.g

            /* renamed from: e, reason: collision with root package name */
            public final /* synthetic */ z f10362e;

            {
                this.f10362e = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i3) {
                    case 0:
                        e0 e0Var2 = this.f10362e.f10495d;
                        File canonicalFile = ((File) e0Var2.f10355b.invoke()).getCanonicalFile();
                        synchronized (e0.f10353d) {
                            String absolutePath = canonicalFile.getAbsolutePath();
                            LinkedHashSet linkedHashSet = e0.f10352c;
                            if (linkedHashSet.contains(absolutePath)) {
                                throw new IllegalStateException(("There are multiple DataStores active for the same file: " + absolutePath + ". You should either maintain your DataStore as a singleton or confirm that there is no two DataStore's active on the same file (by confirming that the scope is cancelled).").toString());
                            }
                            absolutePath.getClass();
                            linkedHashSet.add(absolutePath);
                        }
                        return new h0(canonicalFile, (s0) e0Var2.f10354a.invoke(canonicalFile), new a1.b(27, canonicalFile));
                    default:
                        return ((h0) this.f10362e.f10504x.getValue()).f10373b;
                }
            }
        });
        final int i10 = 1;
        this.f10505y = hd.h.b(new Function0(this) { // from class: x3.g

            /* renamed from: e, reason: collision with root package name */
            public final /* synthetic */ z f10362e;

            {
                this.f10362e = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i10) {
                    case 0:
                        e0 e0Var2 = this.f10362e.f10495d;
                        File canonicalFile = ((File) e0Var2.f10355b.invoke()).getCanonicalFile();
                        synchronized (e0.f10353d) {
                            String absolutePath = canonicalFile.getAbsolutePath();
                            LinkedHashSet linkedHashSet = e0.f10352c;
                            if (linkedHashSet.contains(absolutePath)) {
                                throw new IllegalStateException(("There are multiple DataStores active for the same file: " + absolutePath + ". You should either maintain your DataStore as a singleton or confirm that there is no two DataStore's active on the same file (by confirming that the scope is cancelled).").toString());
                            }
                            absolutePath.getClass();
                            linkedHashSet.add(absolutePath);
                        }
                        return new h0(canonicalFile, (s0) e0Var2.f10354a.invoke(canonicalFile), new a1.b(27, canonicalFile));
                    default:
                        return ((h0) this.f10362e.f10504x.getValue()).f10373b;
                }
            }
        });
        a1.d dVar = new a1.d(21, this);
        m2.t tVar = new m2.t(29);
        a3.t tVar2 = new a3.t(this, aVar, 25);
        com.google.firebase.messaging.v vVar = new com.google.firebase.messaging.v();
        vVar.f3175d = xVar;
        vVar.f3176e = tVar2;
        vVar.f3177i = ie.j.a(Integer.MAX_VALUE, 6, null);
        vVar.f3178r = new c1(5);
        ge.c1 c1Var2 = (ge.c1) xVar.h().m(ge.u.f4403e);
        if (c1Var2 != null) {
            c1Var2.o(new a1.g(dVar, vVar, tVar, 5));
        }
        this.f10506z = vVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x004a A[Catch: all -> 0x0052, TryCatch #0 {all -> 0x0052, blocks: (B:12:0x0042, B:14:0x004a, B:16:0x004e, B:17:0x0054), top: B:11:0x0042 }] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object a(z zVar, nd.c cVar) {
        o oVar;
        int i3;
        oe.c cVar2;
        int i10;
        try {
            if (cVar instanceof o) {
                oVar = (o) cVar;
                int i11 = oVar.f10418r;
                if ((i11 & Integer.MIN_VALUE) != 0) {
                    oVar.f10418r = i11 - Integer.MIN_VALUE;
                    Object obj = oVar.f10416e;
                    md.a aVar = md.a.f6622d;
                    i3 = oVar.f10418r;
                    if (i3 != 0) {
                        cf.c.M(obj);
                        oe.c cVar3 = zVar.f10499s;
                        oVar.f10415d = cVar3;
                        oVar.f10418r = 1;
                        if (cVar3.a(oVar) == aVar) {
                            return aVar;
                        }
                        cVar2 = cVar3;
                    } else {
                        if (i3 != 1) {
                            kotlin.collections.i0.l("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        cVar2 = oVar.f10415d;
                        cf.c.M(obj);
                    }
                    i10 = zVar.f10500t - 1;
                    zVar.f10500t = i10;
                    if (i10 == 0) {
                        r1 r1Var = zVar.f10501u;
                        if (r1Var != null) {
                            r1Var.a(null);
                        }
                        zVar.f10501u = null;
                    }
                    cVar2.d(null);
                    return Unit.f5554a;
                }
            }
            i10 = zVar.f10500t - 1;
            zVar.f10500t = i10;
            if (i10 == 0) {
            }
            cVar2.d(null);
            return Unit.f5554a;
        } catch (Throwable th) {
            cVar2.d(null);
            throw th;
        }
        oVar = new o(zVar, cVar);
        Object obj2 = oVar.f10416e;
        md.a aVar2 = md.a.f6622d;
        i3 = oVar.f10418r;
        if (i3 != 0) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object b(z zVar, m0 m0Var, nd.c cVar) {
        p pVar;
        int i3;
        ge.n nVar;
        Throwable a9;
        if (cVar instanceof p) {
            pVar = (p) cVar;
            int i10 = pVar.f10423r;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                pVar.f10423r = i10 - Integer.MIN_VALUE;
                Object obj = pVar.f10421e;
                md.a aVar = md.a.f6622d;
                i3 = pVar.f10423r;
                ld.a aVar2 = null;
                if (i3 != 0) {
                    cf.c.M(obj);
                    ge.n nVar2 = m0Var.f10409b;
                    try {
                        hd.l lVar = hd.n.f4511e;
                        CoroutineContext p4 = m0Var.f10411d.p(pVar.getContext());
                        a3.t tVar = new a3.t(zVar, m0Var, aVar2, 23);
                        pVar.f10420d = nVar2;
                        pVar.f10423r = 1;
                        Object B = ge.a0.B(p4, tVar, pVar);
                        if (B == aVar) {
                            return aVar;
                        }
                        obj = B;
                        nVar = nVar2;
                    } catch (Throwable th) {
                        th = th;
                        nVar = nVar2;
                        hd.l lVar2 = hd.n.f4511e;
                        obj = new hd.m(th);
                        a9 = hd.n.a(obj);
                        if (a9 != null) {
                        }
                        return Unit.f5554a;
                    }
                } else {
                    if (i3 != 1) {
                        kotlin.collections.i0.l("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    nVar = pVar.f10420d;
                    try {
                        cf.c.M(obj);
                    } catch (Throwable th2) {
                        th = th2;
                        hd.l lVar22 = hd.n.f4511e;
                        obj = new hd.m(th);
                        a9 = hd.n.a(obj);
                        if (a9 != null) {
                        }
                        return Unit.f5554a;
                    }
                }
                hd.l lVar3 = hd.n.f4511e;
                a9 = hd.n.a(obj);
                if (a9 != null) {
                    nVar.S(obj);
                } else {
                    nVar.getClass();
                    nVar.S(new ge.q(a9, false));
                }
                return Unit.f5554a;
            }
        }
        pVar = new p(zVar, cVar);
        Object obj2 = pVar.f10421e;
        md.a aVar3 = md.a.f6622d;
        i3 = pVar.f10423r;
        ld.a aVar22 = null;
        if (i3 != 0) {
        }
        hd.l lVar32 = hd.n.f4511e;
        a9 = hd.n.a(obj2);
        if (a9 != null) {
        }
        return Unit.f5554a;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0049 A[Catch: all -> 0x0059, TRY_LEAVE, TryCatch #0 {all -> 0x0059, blocks: (B:12:0x0042, B:14:0x0049), top: B:11:0x0042 }] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object d(z zVar, nd.c cVar) {
        q qVar;
        int i3;
        oe.c cVar2;
        int i10;
        try {
            if (cVar instanceof q) {
                qVar = (q) cVar;
                int i11 = qVar.f10431r;
                if ((i11 & Integer.MIN_VALUE) != 0) {
                    qVar.f10431r = i11 - Integer.MIN_VALUE;
                    Object obj = qVar.f10429e;
                    md.a aVar = md.a.f6622d;
                    i3 = qVar.f10431r;
                    if (i3 != 0) {
                        cf.c.M(obj);
                        oe.c cVar3 = zVar.f10499s;
                        qVar.f10428d = cVar3;
                        qVar.f10431r = 1;
                        if (cVar3.a(qVar) == aVar) {
                            return aVar;
                        }
                        cVar2 = cVar3;
                    } else {
                        if (i3 != 1) {
                            kotlin.collections.i0.l("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        cVar2 = qVar.f10428d;
                        cf.c.M(obj);
                    }
                    ld.a aVar2 = null;
                    i10 = zVar.f10500t + 1;
                    zVar.f10500t = i10;
                    if (i10 == 1) {
                        zVar.f10501u = ge.a0.s(zVar.f10497i, null, new l(zVar, aVar2, 1), 3);
                    }
                    cVar2.d(null);
                    return Unit.f5554a;
                }
            }
            i10 = zVar.f10500t + 1;
            zVar.f10500t = i10;
            if (i10 == 1) {
            }
            cVar2.d(null);
            return Unit.f5554a;
        } catch (Throwable th) {
            cVar2.d(null);
            throw th;
        }
        qVar = new q(zVar, cVar);
        Object obj2 = qVar.f10429e;
        md.a aVar3 = md.a.f6622d;
        i3 = qVar.f10431r;
        if (i3 != 0) {
        }
        ld.a aVar22 = null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x0059, code lost:
    
        if (r2.c(r0) != r1) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x005b, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0046, code lost:
    
        if (r7 == r1) goto L26;
     */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object e(z zVar, nd.c cVar) {
        r rVar;
        int i3;
        int intValue;
        int i10;
        Throwable th;
        try {
            if (cVar instanceof r) {
                rVar = (r) cVar;
                int i11 = rVar.f10440r;
                if ((i11 & Integer.MIN_VALUE) != 0) {
                    rVar.f10440r = i11 - Integer.MIN_VALUE;
                    Object obj = rVar.f10438e;
                    Object obj2 = md.a.f6622d;
                    i3 = rVar.f10440r;
                    if (i3 != 0) {
                        cf.c.M(obj);
                        s0 i12 = zVar.i();
                        rVar.f10440r = 1;
                        obj = i12.a();
                    } else {
                        if (i3 != 1) {
                            if (i3 != 2) {
                                kotlin.collections.i0.l("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            i10 = rVar.f10437d;
                            try {
                                cf.c.M(obj);
                                return Unit.f5554a;
                            } catch (Throwable th2) {
                                th = th2;
                                zVar.f10502v.b(new o0(th, i10));
                                throw th;
                            }
                        }
                        cf.c.M(obj);
                    }
                    intValue = ((Number) obj).intValue();
                    c6.n nVar = zVar.f10503w;
                    rVar.f10437d = intValue;
                    rVar.f10440r = 2;
                }
            }
            c6.n nVar2 = zVar.f10503w;
            rVar.f10437d = intValue;
            rVar.f10440r = 2;
        } catch (Throwable th3) {
            i10 = intValue;
            th = th3;
            zVar.f10502v.b(new o0(th, i10));
            throw th;
        }
        rVar = new r(zVar, cVar);
        Object obj3 = rVar.f10438e;
        Object obj22 = md.a.f6622d;
        i3 = rVar.f10440r;
        if (i3 != 0) {
        }
        intValue = ((Number) obj3).intValue();
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x008a, code lost:
    
        if (r10 == r2) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00a2, code lost:
    
        if (r10 == r2) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x005c, code lost:
    
        if (r10 == r2) goto L39;
     */
    /* JADX WARN: Removed duplicated region for block: B:15:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object f(z zVar, boolean z10, ld.a aVar) {
        s sVar;
        int i3;
        t0 a9;
        boolean z11;
        Pair pair;
        a0 a0Var = zVar.f10502v;
        if (aVar instanceof s) {
            sVar = (s) aVar;
            int i10 = sVar.f10450s;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                sVar.f10450s = i10 - Integer.MIN_VALUE;
                Object obj = sVar.f10448i;
                md.a aVar2 = md.a.f6622d;
                i3 = sVar.f10450s;
                if (i3 != 0) {
                    cf.c.M(obj);
                    a9 = a0Var.a();
                    if (a9 instanceof u0) {
                        kotlin.collections.i0.l("This is a bug in DataStore. Please file a bug at: https://issuetracker.google.com/issues/new?component=907884&template=1466542");
                        return null;
                    }
                    s0 i11 = zVar.i();
                    sVar.f10447e = a9;
                    sVar.f10446d = z10;
                    sVar.f10450s = 1;
                    obj = i11.a();
                } else {
                    if (i3 != 1) {
                        if (i3 == 2) {
                            cf.c.M(obj);
                            pair = (Pair) obj;
                            t0 t0Var = (t0) pair.f5552d;
                            if (((Boolean) pair.f5553e).booleanValue()) {
                            }
                            return t0Var;
                        }
                        if (i3 != 3) {
                            kotlin.collections.i0.l("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        cf.c.M(obj);
                        pair = (Pair) obj;
                        t0 t0Var2 = (t0) pair.f5552d;
                        if (((Boolean) pair.f5553e).booleanValue()) {
                            a0Var.b(t0Var2);
                        }
                        return t0Var2;
                    }
                    z10 = sVar.f10446d;
                    a9 = sVar.f10447e;
                    cf.c.M(obj);
                }
                int intValue = ((Number) obj).intValue();
                z11 = a9 instanceof c;
                int i12 = !z11 ? ((c) a9).f10458a : -1;
                if (!z11 && intValue == i12) {
                    return a9;
                }
                ld.a aVar3 = null;
                if (z10) {
                    s0 i13 = zVar.i();
                    u uVar = new u(zVar, i12, aVar3, 0);
                    sVar.f10447e = null;
                    sVar.f10450s = 3;
                    obj = i13.c(uVar, sVar);
                } else {
                    s0 i14 = zVar.i();
                    t tVar = new t(zVar, aVar3, 0);
                    sVar.f10447e = null;
                    sVar.f10450s = 2;
                    obj = i14.b(tVar, sVar);
                }
                return aVar2;
            }
        }
        sVar = new s(zVar, aVar);
        Object obj2 = sVar.f10448i;
        md.a aVar22 = md.a.f6622d;
        i3 = sVar.f10450s;
        if (i3 != 0) {
        }
        int intValue2 = ((Number) obj2).intValue();
        z11 = a9 instanceof c;
        if (!z11) {
        }
        if (!z11) {
        }
        ld.a aVar32 = null;
        if (z10) {
        }
        return aVar22;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(8:0|1|(2:3|(4:5|6|7|8))|72|6|7|8|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x0057, code lost:
    
        r11 = e;
     */
    /* JADX WARN: Removed duplicated region for block: B:12:0x002a  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x013b  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x011d A[Catch: all -> 0x0147, TryCatch #0 {all -> 0x0147, blocks: (B:27:0x010d, B:29:0x011d, B:32:0x0122), top: B:26:0x010d }] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0133  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0122 A[Catch: all -> 0x0147, TRY_LEAVE, TryCatch #0 {all -> 0x0147, blocks: (B:27:0x010d, B:29:0x011d, B:32:0x0122), top: B:26:0x010d }] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00e2  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0089 A[Catch: b -> 0x0057, TryCatch #1 {b -> 0x0057, blocks: (B:36:0x0052, B:37:0x00e3, B:40:0x005c, B:41:0x00c7, B:56:0x0071, B:58:0x0089, B:59:0x008f, B:65:0x007a, B:68:0x00b6), top: B:7:0x0020 }] */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object g(z zVar, boolean z10, nd.c cVar) {
        v vVar;
        wd.b0 b0Var;
        b bVar;
        wd.b0 b0Var2;
        b bVar2;
        w wVar;
        wd.a0 a0Var;
        wd.b0 b0Var3;
        Object a9;
        boolean z11;
        int i3;
        Object obj;
        if (cVar instanceof v) {
            vVar = (v) cVar;
            int i10 = vVar.f10473v;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                vVar.f10473v = i10 - Integer.MIN_VALUE;
                Object obj2 = vVar.f10471t;
                Object obj3 = md.a.f6622d;
                ld.a aVar = null;
                switch (vVar.f10473v) {
                    case 0:
                        cf.c.M(obj2);
                        if (!z10) {
                            s0 i11 = zVar.i();
                            vVar.f10466d = z10;
                            vVar.f10473v = 3;
                            obj2 = i11.a();
                            if (obj2 == obj3) {
                            }
                            int intValue = ((Number) obj2).intValue();
                            s0 i12 = zVar.i();
                            Function2 uVar = new u(zVar, intValue, aVar, 1);
                            vVar.f10466d = z10;
                            vVar.f10473v = 4;
                            obj2 = i12.c(uVar, vVar);
                            if (obj2 == obj3) {
                            }
                            return (c) obj2;
                        }
                        vVar.f10466d = z10;
                        vVar.f10473v = 1;
                        obj2 = zVar.j(vVar);
                        if (obj2 == obj3) {
                        }
                        int hashCode = obj2 == null ? obj2.hashCode() : 0;
                        s0 i13 = zVar.i();
                        vVar.f10467e = obj2;
                        vVar.f10466d = z10;
                        vVar.f10470s = hashCode;
                        vVar.f10473v = 2;
                        a9 = i13.a();
                        if (a9 != obj3) {
                            int i14 = hashCode;
                            z11 = z10;
                            i3 = i14;
                            obj = obj2;
                            obj2 = a9;
                            return new c(i3, ((Number) obj2).intValue(), obj);
                        }
                        return obj3;
                    case 1:
                        z10 = vVar.f10466d;
                        cf.c.M(obj2);
                        if (obj2 == null) {
                        }
                        s0 i132 = zVar.i();
                        vVar.f10467e = obj2;
                        vVar.f10466d = z10;
                        vVar.f10470s = hashCode;
                        vVar.f10473v = 2;
                        a9 = i132.a();
                        if (a9 != obj3) {
                        }
                        return obj3;
                    case 2:
                        i3 = vVar.f10470s;
                        z11 = vVar.f10466d;
                        obj = vVar.f10467e;
                        try {
                            cf.c.M(obj2);
                            return new c(i3, ((Number) obj2).intValue(), obj);
                        } catch (b e2) {
                            e = e2;
                            z10 = z11;
                            b0Var = new wd.b0();
                            c1 c1Var = zVar.f10496e;
                            vVar.f10467e = e;
                            vVar.f10468i = b0Var;
                            vVar.f10469r = b0Var;
                            vVar.f10466d = z10;
                            vVar.f10473v = 5;
                            Object invoke = ((n8.a) c1Var.f9767e).invoke(e);
                            if (invoke != obj3) {
                                bVar = e;
                                obj2 = invoke;
                                b0Var2 = b0Var;
                                b0Var2.f10141d = obj2;
                                wd.a0 a0Var2 = new wd.a0();
                                try {
                                    wVar = new w(b0Var, zVar, a0Var2, (ld.a) null);
                                    vVar.f10467e = bVar;
                                    vVar.f10468i = b0Var;
                                    vVar.f10469r = a0Var2;
                                    vVar.f10473v = 6;
                                    if ((!z10 ? wVar.invoke(vVar) : zVar.i().b(new e(wVar, aVar, 1), vVar)) != obj3) {
                                    }
                                } catch (Throwable th) {
                                    th = th;
                                    bVar2 = bVar;
                                    hd.b.a(bVar2, th);
                                    throw bVar2;
                                }
                            }
                            return obj3;
                        }
                    case a4.j.INTEGER_FIELD_NUMBER /* 3 */:
                        z10 = vVar.f10466d;
                        cf.c.M(obj2);
                        int intValue2 = ((Number) obj2).intValue();
                        s0 i122 = zVar.i();
                        Function2 uVar2 = new u(zVar, intValue2, aVar, 1);
                        vVar.f10466d = z10;
                        vVar.f10473v = 4;
                        obj2 = i122.c(uVar2, vVar);
                        if (obj2 == obj3) {
                        }
                        return (c) obj2;
                    case a4.j.LONG_FIELD_NUMBER /* 4 */:
                        boolean z12 = vVar.f10466d;
                        cf.c.M(obj2);
                        return (c) obj2;
                    case a4.j.STRING_FIELD_NUMBER /* 5 */:
                        z10 = vVar.f10466d;
                        wd.b0 b0Var4 = (wd.b0) vVar.f10469r;
                        wd.b0 b0Var5 = vVar.f10468i;
                        bVar = (b) vVar.f10467e;
                        cf.c.M(obj2);
                        b0Var2 = b0Var4;
                        b0Var = b0Var5;
                        b0Var2.f10141d = obj2;
                        wd.a0 a0Var22 = new wd.a0();
                        wVar = new w(b0Var, zVar, a0Var22, (ld.a) null);
                        vVar.f10467e = bVar;
                        vVar.f10468i = b0Var;
                        vVar.f10469r = a0Var22;
                        vVar.f10473v = 6;
                        if ((!z10 ? wVar.invoke(vVar) : zVar.i().b(new e(wVar, aVar, 1), vVar)) != obj3) {
                            a0Var = a0Var22;
                            b0Var3 = b0Var;
                            Object obj4 = b0Var3.f10141d;
                            obj3 = new c(obj4 != null ? obj4.hashCode() : 0, a0Var.f10139d, obj4);
                        }
                        return obj3;
                    case a4.j.STRING_SET_FIELD_NUMBER /* 6 */:
                        a0Var = (wd.a0) vVar.f10469r;
                        b0Var3 = vVar.f10468i;
                        bVar2 = (b) vVar.f10467e;
                        try {
                            cf.c.M(obj2);
                            Object obj42 = b0Var3.f10141d;
                            obj3 = new c(obj42 != null ? obj42.hashCode() : 0, a0Var.f10139d, obj42);
                            return obj3;
                        } catch (Throwable th2) {
                            th = th2;
                            hd.b.a(bVar2, th);
                            throw bVar2;
                        }
                    default:
                        kotlin.collections.i0.l("call to 'resume' before 'invoke' with coroutine");
                        return null;
                }
            }
        }
        vVar = new v(zVar, cVar);
        Object obj22 = vVar.f10471t;
        Object obj32 = md.a.f6622d;
        ld.a aVar2 = null;
        switch (vVar.f10473v) {
        }
    }

    @Override // x3.f
    public final Object c(Function2 function2, nd.i iVar) {
        x0 x0Var = (x0) iVar.getContext().m(w0.f10481d);
        if (x0Var != null) {
            x0Var.b(this);
        }
        return ge.a0.B(new x0(x0Var, this), new b5.t(this, function2, (ld.a) null), iVar);
    }

    @Override // x3.f
    public final je.e h() {
        return this.f10498r;
    }

    public final s0 i() {
        return (s0) this.f10505y.getValue();
    }

    public final Object j(nd.c cVar) {
        return ((h0) this.f10504x.getValue()).a(new m(3, (ld.a) null), cVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object k(Object obj, boolean z10, nd.c cVar) {
        x xVar;
        int i3;
        wd.a0 a0Var;
        if (cVar instanceof x) {
            xVar = (x) cVar;
            int i10 = xVar.f10485r;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                xVar.f10485r = i10 - Integer.MIN_VALUE;
                Object obj2 = xVar.f10483e;
                md.a aVar = md.a.f6622d;
                i3 = xVar.f10485r;
                if (i3 != 0) {
                    cf.c.M(obj2);
                    wd.a0 a0Var2 = new wd.a0();
                    h0 h0Var = (h0) this.f10504x.getValue();
                    y yVar = new y(a0Var2, this, obj, z10, null);
                    xVar.f10482d = a0Var2;
                    xVar.f10485r = 1;
                    if (h0Var.b(yVar, xVar) == aVar) {
                        return aVar;
                    }
                    a0Var = a0Var2;
                } else {
                    if (i3 != 1) {
                        kotlin.collections.i0.l("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    a0Var = xVar.f10482d;
                    cf.c.M(obj2);
                }
                return new Integer(a0Var.f10139d);
            }
        }
        xVar = new x(this, cVar);
        Object obj22 = xVar.f10483e;
        md.a aVar2 = md.a.f6622d;
        i3 = xVar.f10485r;
        if (i3 != 0) {
        }
        return new Integer(a0Var.f10139d);
    }
}
