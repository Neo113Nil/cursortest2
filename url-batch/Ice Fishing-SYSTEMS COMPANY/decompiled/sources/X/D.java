package X;

import O7.AbstractC0399y;
import O7.C0388m;
import O7.C0391p;
import O7.C0396v;
import O7.InterfaceC0387l;
import O7.InterfaceC0397w;
import O7.Y;
import O7.h0;
import a.AbstractC0415a;
import com.google.android.gms.internal.ads.C3874rx;
import com.google.android.gms.internal.ads.C3928sx;
import com.google.android.gms.internal.ads.C3982tx;
import g1.C4523c;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import q7.AbstractC4940i;
import q7.C4942k;
import r7.AbstractC4979j;
import v7.InterfaceC5138i;
import w7.EnumC5179a;
import x7.AbstractC5219c;

/* loaded from: classes.dex */
public final class D implements InterfaceC0406f {

    /* renamed from: h, reason: collision with root package name */
    public static final LinkedHashSet f3536h = new LinkedHashSet();
    public static final Object i = new Object();

    /* renamed from: a, reason: collision with root package name */
    public final C3982tx f3537a;

    /* renamed from: b, reason: collision with root package name */
    public final C4523c f3538b;

    /* renamed from: c, reason: collision with root package name */
    public final String f3539c;

    /* renamed from: d, reason: collision with root package name */
    public final C4942k f3540d;

    /* renamed from: e, reason: collision with root package name */
    public final R7.n f3541e;

    /* renamed from: f, reason: collision with root package name */
    public List f3542f;

    /* renamed from: g, reason: collision with root package name */
    public final S0.n f3543g;

    public D(C3982tx c3982tx, List list, W3.e eVar, InterfaceC0397w interfaceC0397w) {
        int i4 = 1;
        C3874rx c3874rx = C3928sx.f34330a;
        this.f3537a = c3982tx;
        this.f3538b = new C4523c(10, new q(this, null));
        this.f3539c = ".tmp";
        this.f3540d = com.bumptech.glide.e.q(new r(0, this));
        this.f3541e = new R7.n(F.f3544a);
        this.f3542f = AbstractC4979j.R(list);
        J0.l lVar = new J0.l(3, this);
        n nVar = new n(this, null);
        S0.n nVar2 = new S0.n();
        nVar2.f2914n = interfaceC0397w;
        nVar2.f2915u = nVar;
        nVar2.f2916v = Q7.j.a(Integer.MAX_VALUE, null, 6);
        nVar2.f2917w = new AtomicInteger(0);
        Y y6 = (Y) interfaceC0397w.z().i(C0396v.f2634u);
        if (y6 != null) {
            ((h0) y6).G(false, true, new P7.d(i4, lVar, nVar2));
        }
        this.f3543g = nVar2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:34:0x00a9, code lost:
    
        if (r8 != r1) goto L30;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0026 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0054  */
    /* JADX WARN: Type inference failed for: r2v10, types: [E7.p, x7.h] */
    /* JADX WARN: Type inference failed for: r2v3, types: [E7.p, x7.h] */
    /* JADX WARN: Type inference failed for: r8v9 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object a(D d2, k kVar, AbstractC5219c abstractC5219c) {
        s sVar;
        int i4;
        InterfaceC0387l interfaceC0387l;
        C0388m c0388m;
        D d3;
        Object h9;
        InterfaceC0387l interfaceC0387l2;
        Throwable a9;
        E e6;
        d2.getClass();
        if (abstractC5219c instanceof s) {
            sVar = (s) abstractC5219c;
            int i9 = sVar.f3591y;
            if ((i9 & Integer.MIN_VALUE) != 0) {
                sVar.f3591y = i9 - Integer.MIN_VALUE;
                Object obj = sVar.f3589w;
                EnumC5179a enumC5179a = EnumC5179a.f41704n;
                i4 = sVar.f3591y;
                boolean z8 = true;
                if (i4 == 0) {
                    try {
                        if (i4 == 1) {
                            interfaceC0387l = (InterfaceC0387l) sVar.f3586n;
                        } else if (i4 == 2) {
                            C0388m c0388m2 = sVar.f3588v;
                            D d9 = sVar.f3587u;
                            k kVar2 = (k) sVar.f3586n;
                            com.bumptech.glide.f.r(obj);
                            c0388m = c0388m2;
                            d3 = d9;
                            kVar = kVar2;
                        } else {
                            if (i4 != 3) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            interfaceC0387l = (InterfaceC0387l) sVar.f3586n;
                        }
                        com.bumptech.glide.f.r(obj);
                        interfaceC0387l2 = interfaceC0387l;
                    } catch (Throwable th) {
                        th = th;
                        obj = com.bumptech.glide.f.e(th);
                        interfaceC0387l2 = d2;
                        a9 = AbstractC4940i.a(obj);
                        C0388m c0388m3 = (C0388m) interfaceC0387l2;
                        if (a9 != null) {
                        }
                        return q7.v.f40183a;
                    }
                    a9 = AbstractC4940i.a(obj);
                    C0388m c0388m32 = (C0388m) interfaceC0387l2;
                    if (a9 != null) {
                        c0388m32.J(obj);
                    } else {
                        c0388m32.getClass();
                        c0388m32.J(new C0391p(a9, false));
                    }
                    return q7.v.f40183a;
                }
                com.bumptech.glide.f.r(obj);
                c0388m = kVar.f3568b;
                try {
                    e6 = (E) d2.f3541e.E();
                } catch (Throwable th2) {
                    th = th2;
                    d2 = c0388m;
                    obj = com.bumptech.glide.f.e(th);
                    interfaceC0387l2 = d2;
                    a9 = AbstractC4940i.a(obj);
                    C0388m c0388m322 = (C0388m) interfaceC0387l2;
                    if (a9 != null) {
                    }
                    return q7.v.f40183a;
                }
                if (e6 instanceof C0401a) {
                    ?? r22 = kVar.f3567a;
                    InterfaceC5138i interfaceC5138i = kVar.f3570d;
                    sVar.f3586n = c0388m;
                    sVar.f3591y = 1;
                    h9 = d2.h(r22, interfaceC5138i, sVar);
                    if (h9 == enumC5179a) {
                    }
                    C0388m c0388m4 = c0388m;
                    obj = h9;
                    interfaceC0387l2 = c0388m4;
                    a9 = AbstractC4940i.a(obj);
                    C0388m c0388m3222 = (C0388m) interfaceC0387l2;
                    if (a9 != null) {
                    }
                    return q7.v.f40183a;
                }
                if (!(e6 instanceof h)) {
                    z8 = e6 instanceof F;
                }
                if (!z8) {
                    if (e6 instanceof g) {
                        throw ((g) e6).f3561a;
                    }
                    throw new B0.c();
                }
                if (e6 != kVar.f3569c) {
                    throw ((h) e6).f3562a;
                }
                sVar.f3586n = kVar;
                sVar.f3587u = d2;
                sVar.f3588v = c0388m;
                sVar.f3591y = 2;
                Object d10 = d2.d(sVar);
                d3 = d2;
                if (d10 == enumC5179a) {
                }
                return enumC5179a;
                ?? r23 = kVar.f3567a;
                InterfaceC5138i interfaceC5138i2 = kVar.f3570d;
                sVar.f3586n = c0388m;
                sVar.f3587u = null;
                sVar.f3588v = null;
                sVar.f3591y = 3;
                h9 = d3.h(r23, interfaceC5138i2, sVar);
            }
        }
        sVar = new s(d2, abstractC5219c);
        Object obj2 = sVar.f3589w;
        EnumC5179a enumC5179a2 = EnumC5179a.f41704n;
        i4 = sVar.f3591y;
        boolean z82 = true;
        if (i4 == 0) {
        }
        ?? r232 = kVar.f3567a;
        InterfaceC5138i interfaceC5138i22 = kVar.f3570d;
        sVar.f3586n = c0388m;
        sVar.f3587u = null;
        sVar.f3588v = null;
        sVar.f3591y = 3;
        h9 = d3.h(r232, interfaceC5138i22, sVar);
    }

    public final File b() {
        return (File) this.f3540d.getValue();
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x011d  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0122  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x010c  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object c(AbstractC5219c abstractC5219c) {
        t tVar;
        int i4;
        W7.a dVar;
        kotlin.jvm.internal.r rVar;
        D d2;
        kotlin.jvm.internal.r rVar2;
        List list;
        D d3;
        kotlin.jvm.internal.r rVar3;
        v vVar;
        Iterator it;
        W7.a aVar;
        kotlin.jvm.internal.p pVar;
        kotlin.jvm.internal.p pVar2;
        t tVar2;
        D d9;
        W7.d dVar2;
        W7.a aVar2;
        kotlin.jvm.internal.r rVar4;
        if (abstractC5219c instanceof t) {
            tVar = (t) abstractC5219c;
            int i9 = tVar.f3593B;
            if ((i9 & Integer.MIN_VALUE) != 0) {
                tVar.f3593B = i9 - Integer.MIN_VALUE;
                Object obj = tVar.f3600z;
                EnumC5179a enumC5179a = EnumC5179a.f41704n;
                i4 = tVar.f3593B;
                if (i4 != 0) {
                    com.bumptech.glide.f.r(obj);
                    R7.n nVar = this.f3541e;
                    if (!kotlin.jvm.internal.h.a(nVar.E(), F.f3544a) && !(nVar.E() instanceof h)) {
                        throw new IllegalStateException("Check failed.");
                    }
                    dVar = new W7.d();
                    rVar = new kotlin.jvm.internal.r();
                    tVar.f3594n = this;
                    tVar.f3595u = dVar;
                    tVar.f3596v = rVar;
                    tVar.f3597w = rVar;
                    tVar.f3593B = 1;
                    obj = g(tVar);
                    if (obj != enumC5179a) {
                        d2 = this;
                        rVar2 = rVar;
                    }
                    return enumC5179a;
                }
                if (i4 != 1) {
                    if (i4 != 2) {
                        if (i4 != 3) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        aVar2 = (W7.a) tVar.f3597w;
                        pVar2 = (kotlin.jvm.internal.p) tVar.f3596v;
                        rVar4 = (kotlin.jvm.internal.r) tVar.f3595u;
                        d9 = tVar.f3594n;
                        com.bumptech.glide.f.r(obj);
                        try {
                            pVar2.f38859n = true;
                            ((W7.d) aVar2).d(null);
                            R7.n nVar2 = d9.f3541e;
                            Object obj2 = rVar4.f38861n;
                            nVar2.F(new C0401a(obj2 == null ? obj2.hashCode() : 0, obj2));
                            return q7.v.f40183a;
                        } catch (Throwable th) {
                            ((W7.d) aVar2).d(null);
                            throw th;
                        }
                    }
                    it = tVar.f3599y;
                    vVar = tVar.f3598x;
                    pVar = (kotlin.jvm.internal.p) tVar.f3597w;
                    rVar3 = (kotlin.jvm.internal.r) tVar.f3596v;
                    aVar = (W7.a) tVar.f3595u;
                    d3 = tVar.f3594n;
                    com.bumptech.glide.f.r(obj);
                    while (it.hasNext()) {
                        E7.p pVar3 = (E7.p) it.next();
                        tVar.f3594n = d3;
                        tVar.f3595u = aVar;
                        tVar.f3596v = rVar3;
                        tVar.f3597w = pVar;
                        tVar.f3598x = vVar;
                        tVar.f3599y = it;
                        tVar.f3593B = 2;
                        if (pVar3.invoke(vVar, tVar) == enumC5179a) {
                            break;
                        }
                    }
                    tVar2 = tVar;
                    pVar2 = pVar;
                    rVar2 = rVar3;
                    dVar = aVar;
                    d9 = d3;
                    d9.f3542f = null;
                    tVar2.f3594n = d9;
                    tVar2.f3595u = rVar2;
                    tVar2.f3596v = pVar2;
                    tVar2.f3597w = dVar;
                    tVar2.f3598x = null;
                    tVar2.f3599y = null;
                    tVar2.f3593B = 3;
                    dVar2 = (W7.d) dVar;
                    if (dVar2.c(tVar2) != enumC5179a) {
                        aVar2 = dVar2;
                        rVar4 = rVar2;
                        pVar2.f38859n = true;
                        ((W7.d) aVar2).d(null);
                        R7.n nVar22 = d9.f3541e;
                        Object obj22 = rVar4.f38861n;
                        nVar22.F(new C0401a(obj22 == null ? obj22.hashCode() : 0, obj22));
                        return q7.v.f40183a;
                    }
                    return enumC5179a;
                }
                rVar = (kotlin.jvm.internal.r) tVar.f3597w;
                rVar2 = (kotlin.jvm.internal.r) tVar.f3596v;
                dVar = (W7.a) tVar.f3595u;
                d2 = tVar.f3594n;
                com.bumptech.glide.f.r(obj);
                rVar.f38861n = obj;
                kotlin.jvm.internal.p pVar4 = new kotlin.jvm.internal.p();
                v vVar2 = new v(dVar, pVar4, rVar2, d2);
                list = d2.f3542f;
                if (list != null) {
                    pVar2 = pVar4;
                    tVar2 = tVar;
                    d9 = d2;
                    d9.f3542f = null;
                    tVar2.f3594n = d9;
                    tVar2.f3595u = rVar2;
                    tVar2.f3596v = pVar2;
                    tVar2.f3597w = dVar;
                    tVar2.f3598x = null;
                    tVar2.f3599y = null;
                    tVar2.f3593B = 3;
                    dVar2 = (W7.d) dVar;
                    if (dVar2.c(tVar2) != enumC5179a) {
                    }
                    return enumC5179a;
                }
                d3 = d2;
                rVar3 = rVar2;
                vVar = vVar2;
                it = list.iterator();
                aVar = dVar;
                pVar = pVar4;
                while (it.hasNext()) {
                }
                tVar2 = tVar;
                pVar2 = pVar;
                rVar2 = rVar3;
                dVar = aVar;
                d9 = d3;
                d9.f3542f = null;
                tVar2.f3594n = d9;
                tVar2.f3595u = rVar2;
                tVar2.f3596v = pVar2;
                tVar2.f3597w = dVar;
                tVar2.f3598x = null;
                tVar2.f3599y = null;
                tVar2.f3593B = 3;
                dVar2 = (W7.d) dVar;
                if (dVar2.c(tVar2) != enumC5179a) {
                }
                return enumC5179a;
            }
        }
        tVar = new t(this, abstractC5219c);
        Object obj3 = tVar.f3600z;
        EnumC5179a enumC5179a2 = EnumC5179a.f41704n;
        i4 = tVar.f3593B;
        if (i4 != 0) {
        }
        rVar.f38861n = obj3;
        kotlin.jvm.internal.p pVar42 = new kotlin.jvm.internal.p();
        v vVar22 = new v(dVar, pVar42, rVar2, d2);
        list = d2.f3542f;
        if (list != null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object d(AbstractC5219c abstractC5219c) {
        w wVar;
        int i4;
        D d2;
        if (abstractC5219c instanceof w) {
            wVar = (w) abstractC5219c;
            int i9 = wVar.f3616w;
            if ((i9 & Integer.MIN_VALUE) != 0) {
                wVar.f3616w = i9 - Integer.MIN_VALUE;
                Object obj = wVar.f3614u;
                EnumC5179a enumC5179a = EnumC5179a.f41704n;
                i4 = wVar.f3616w;
                if (i4 != 0) {
                    com.bumptech.glide.f.r(obj);
                    try {
                        wVar.f3613n = this;
                        wVar.f3616w = 1;
                        if (c(wVar) == enumC5179a) {
                            return enumC5179a;
                        }
                    } catch (Throwable th) {
                        th = th;
                        d2 = this;
                        d2.f3541e.F(new h(th));
                        throw th;
                    }
                } else {
                    if (i4 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    d2 = wVar.f3613n;
                    try {
                        com.bumptech.glide.f.r(obj);
                    } catch (Throwable th2) {
                        th = th2;
                        d2.f3541e.F(new h(th));
                        throw th;
                    }
                }
                return q7.v.f40183a;
            }
        }
        wVar = new w(this, abstractC5219c);
        Object obj2 = wVar.f3614u;
        EnumC5179a enumC5179a2 = EnumC5179a.f41704n;
        i4 = wVar.f3616w;
        if (i4 != 0) {
        }
        return q7.v.f40183a;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object e(AbstractC5219c abstractC5219c) {
        x xVar;
        int i4;
        D d2;
        if (abstractC5219c instanceof x) {
            xVar = (x) abstractC5219c;
            int i9 = xVar.f3620w;
            if ((i9 & Integer.MIN_VALUE) != 0) {
                xVar.f3620w = i9 - Integer.MIN_VALUE;
                Object obj = xVar.f3618u;
                EnumC5179a enumC5179a = EnumC5179a.f41704n;
                i4 = xVar.f3620w;
                if (i4 != 0) {
                    com.bumptech.glide.f.r(obj);
                    try {
                        xVar.f3617n = this;
                        xVar.f3620w = 1;
                        if (c(xVar) == enumC5179a) {
                            return enumC5179a;
                        }
                    } catch (Throwable th) {
                        th = th;
                        d2 = this;
                        d2.f3541e.F(new h(th));
                        return q7.v.f40183a;
                    }
                } else {
                    if (i4 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    d2 = xVar.f3617n;
                    try {
                        com.bumptech.glide.f.r(obj);
                    } catch (Throwable th2) {
                        th = th2;
                        d2.f3541e.F(new h(th));
                        return q7.v.f40183a;
                    }
                }
                return q7.v.f40183a;
            }
        }
        xVar = new x(this, abstractC5219c);
        Object obj2 = xVar.f3618u;
        EnumC5179a enumC5179a2 = EnumC5179a.f41704n;
        i4 = xVar.f3620w;
        if (i4 != 0) {
        }
        return q7.v.f40183a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0021  */
    /* JADX WARN: Type inference failed for: r0v14 */
    /* JADX WARN: Type inference failed for: r0v16, types: [X.D] */
    /* JADX WARN: Type inference failed for: r0v19 */
    /* JADX WARN: Type inference failed for: r0v2, types: [X.y] */
    /* JADX WARN: Type inference failed for: r0v20 */
    /* JADX WARN: Type inference failed for: r0v3 */
    /* JADX WARN: Type inference failed for: r0v4, types: [X.D] */
    /* JADX WARN: Type inference failed for: r0v7 */
    /* JADX WARN: Type inference failed for: r0v9 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object f(AbstractC5219c abstractC5219c) {
        ?? r02;
        int i4;
        FileInputStream fileInputStream;
        Throwable th;
        C3874rx c3874rx;
        try {
            if (abstractC5219c instanceof y) {
                y yVar = (y) abstractC5219c;
                int i9 = yVar.f3625x;
                if ((i9 & Integer.MIN_VALUE) != 0) {
                    yVar.f3625x = i9 - Integer.MIN_VALUE;
                    r02 = yVar;
                    Object obj = r02.f3623v;
                    EnumC5179a enumC5179a = EnumC5179a.f41704n;
                    i4 = r02.f3625x;
                    if (i4 != 0) {
                        com.bumptech.glide.f.r(obj);
                        try {
                            FileInputStream fileInputStream2 = new FileInputStream(b());
                            try {
                                C3874rx c3874rx2 = C3928sx.f34330a;
                                r02.f3621n = this;
                                r02.f3622u = fileInputStream2;
                                r02.f3625x = 1;
                                try {
                                    c3874rx = C3874rx.C(fileInputStream2);
                                } catch (Exception unused) {
                                    c3874rx = C3928sx.f34330a;
                                }
                                if (c3874rx == enumC5179a) {
                                    return enumC5179a;
                                }
                                fileInputStream = fileInputStream2;
                                obj = c3874rx;
                            } catch (Throwable th2) {
                                fileInputStream = fileInputStream2;
                                th = th2;
                                r02 = this;
                                throw th;
                            }
                        } catch (FileNotFoundException e6) {
                            e = e6;
                            r02 = this;
                            if (!r02.b().exists()) {
                                throw e;
                            }
                            C3874rx c3874rx3 = C3928sx.f34330a;
                            return C3928sx.f34330a;
                        }
                    } else {
                        if (i4 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        fileInputStream = r02.f3622u;
                        r02 = r02.f3621n;
                        try {
                            com.bumptech.glide.f.r(obj);
                        } catch (Throwable th3) {
                            th = th3;
                            try {
                                throw th;
                            } catch (Throwable th4) {
                                AbstractC0415a.h(fileInputStream, th);
                                throw th4;
                            }
                        }
                    }
                    AbstractC0415a.h(fileInputStream, null);
                    return obj;
                }
            }
            if (i4 != 0) {
            }
            AbstractC0415a.h(fileInputStream, null);
            return obj;
        } catch (FileNotFoundException e9) {
            e = e9;
            if (!r02.b().exists()) {
            }
        }
        r02 = new y(this, abstractC5219c);
        Object obj2 = r02.f3623v;
        EnumC5179a enumC5179a2 = EnumC5179a.f41704n;
        i4 = r02.f3625x;
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object g(AbstractC5219c abstractC5219c) {
        z zVar;
        int i4;
        if (abstractC5219c instanceof z) {
            zVar = (z) abstractC5219c;
            int i9 = zVar.f3630x;
            if ((i9 & Integer.MIN_VALUE) != 0) {
                zVar.f3630x = i9 - Integer.MIN_VALUE;
                Object obj = zVar.f3628v;
                Object obj2 = EnumC5179a.f41704n;
                i4 = zVar.f3630x;
                if (i4 != 0) {
                    com.bumptech.glide.f.r(obj);
                    zVar.f3626n = this;
                    zVar.f3630x = 1;
                    Object f6 = f(zVar);
                    if (f6 != obj2) {
                        return f6;
                    }
                } else {
                    if (i4 == 1) {
                        com.bumptech.glide.f.r(obj);
                        return obj;
                    }
                    try {
                        if (i4 != 2) {
                            if (i4 != 3) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            Object obj3 = zVar.f3627u;
                            if (zVar.f3626n != null) {
                                throw new ClassCastException();
                            }
                            com.bumptech.glide.f.r(obj);
                            return obj3;
                        }
                        if (zVar.f3627u != null) {
                            throw new ClassCastException();
                        }
                        D d2 = zVar.f3626n;
                        com.bumptech.glide.f.r(obj);
                        zVar.f3626n = null;
                        zVar.f3627u = obj;
                        zVar.f3630x = 3;
                        if (d2.j(obj, zVar) != obj2) {
                            return obj;
                        }
                    } catch (IOException e6) {
                        com.bumptech.glide.d.b(null, e6);
                        throw null;
                    }
                }
                return obj2;
            }
        }
        zVar = new z(this, abstractC5219c);
        Object obj4 = zVar.f3628v;
        Object obj22 = EnumC5179a.f41704n;
        i4 = zVar.f3630x;
        if (i4 != 0) {
        }
        return obj22;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object h(E7.p pVar, InterfaceC5138i interfaceC5138i, AbstractC5219c abstractC5219c) {
        A a9;
        int i4;
        D d2;
        C0401a c0401a;
        Object obj;
        Object obj2;
        Object obj3;
        D d3;
        if (abstractC5219c instanceof A) {
            a9 = (A) abstractC5219c;
            int i9 = a9.f3525y;
            if ((i9 & Integer.MIN_VALUE) != 0) {
                a9.f3525y = i9 - Integer.MIN_VALUE;
                Object obj4 = a9.f3523w;
                EnumC5179a enumC5179a = EnumC5179a.f41704n;
                i4 = a9.f3525y;
                if (i4 != 0) {
                    com.bumptech.glide.f.r(obj4);
                    C0401a c0401a2 = (C0401a) this.f3541e.E();
                    Object obj5 = c0401a2.f3545a;
                    if ((obj5 != null ? obj5.hashCode() : 0) != c0401a2.f3546b) {
                        throw new IllegalStateException("Data in DataStore was mutated but DataStore is only compatible with Immutable types.");
                    }
                    Object obj6 = c0401a2.f3545a;
                    B b9 = new B(pVar, obj6, null);
                    a9.f3520n = this;
                    a9.f3521u = c0401a2;
                    a9.f3522v = obj6;
                    a9.f3525y = 1;
                    Object y6 = AbstractC0399y.y(interfaceC5138i, b9, a9);
                    if (y6 != enumC5179a) {
                        d2 = this;
                        c0401a = c0401a2;
                        obj4 = y6;
                        obj = obj6;
                    }
                    return enumC5179a;
                }
                if (i4 != 1) {
                    if (i4 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    obj3 = a9.f3521u;
                    d3 = a9.f3520n;
                    com.bumptech.glide.f.r(obj4);
                    d3.f3541e.F(new C0401a(obj3 != null ? obj3.hashCode() : 0, obj3));
                    return obj3;
                }
                obj = a9.f3522v;
                c0401a = (C0401a) a9.f3521u;
                d2 = a9.f3520n;
                com.bumptech.glide.f.r(obj4);
                obj2 = c0401a.f3545a;
                if ((obj2 == null ? obj2.hashCode() : 0) == c0401a.f3546b) {
                    throw new IllegalStateException("Data in DataStore was mutated but DataStore is only compatible with Immutable types.");
                }
                if (kotlin.jvm.internal.h.a(obj, obj4)) {
                    return obj;
                }
                a9.f3520n = d2;
                a9.f3521u = obj4;
                a9.f3522v = null;
                a9.f3525y = 2;
                if (d2.j(obj4, a9) != enumC5179a) {
                    obj3 = obj4;
                    d3 = d2;
                    d3.f3541e.F(new C0401a(obj3 != null ? obj3.hashCode() : 0, obj3));
                    return obj3;
                }
                return enumC5179a;
            }
        }
        a9 = new A(this, abstractC5219c);
        Object obj42 = a9.f3523w;
        EnumC5179a enumC5179a2 = EnumC5179a.f41704n;
        i4 = a9.f3525y;
        if (i4 != 0) {
        }
        obj2 = c0401a.f3545a;
        if ((obj2 == null ? obj2.hashCode() : 0) == c0401a.f3546b) {
        }
    }

    public final Object i(E7.p pVar, AbstractC5219c abstractC5219c) {
        C0388m a9 = AbstractC0399y.a();
        this.f3543g.d(new k(pVar, a9, (E) this.f3541e.E(), abstractC5219c.getContext()));
        return a9.U(abstractC5219c);
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x00ad A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00ae A[Catch: IOException -> 0x00c5, TryCatch #1 {IOException -> 0x00c5, blocks: (B:14:0x00a0, B:18:0x00ae, B:19:0x00c4, B:26:0x00cd, B:27:0x00d0, B:43:0x0077, B:23:0x00cb), top: B:42:0x0077, inners: #3 }] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object j(Object obj, AbstractC5219c abstractC5219c) {
        C c4;
        int i4;
        File file;
        FileOutputStream fileOutputStream;
        D d2;
        FileOutputStream fileOutputStream2;
        if (abstractC5219c instanceof C) {
            c4 = (C) abstractC5219c;
            int i9 = c4.f3535z;
            if ((i9 & Integer.MIN_VALUE) != 0) {
                c4.f3535z = i9 - Integer.MIN_VALUE;
                Object obj2 = c4.f3533x;
                EnumC5179a enumC5179a = EnumC5179a.f41704n;
                i4 = c4.f3535z;
                q7.v vVar = q7.v.f40183a;
                if (i4 != 0) {
                    com.bumptech.glide.f.r(obj2);
                    File b9 = b();
                    File parentFile = b9.getCanonicalFile().getParentFile();
                    if (parentFile != null) {
                        parentFile.mkdirs();
                        if (!parentFile.isDirectory()) {
                            throw new IOException("Unable to create parent directories of " + b9);
                        }
                    }
                    file = new File(b().getAbsolutePath() + ((Object) this.f3539c));
                    try {
                        FileOutputStream fileOutputStream3 = new FileOutputStream(file);
                        try {
                            C3874rx c3874rx = C3928sx.f34330a;
                            m mVar = new m(fileOutputStream3);
                            c4.f3529n = this;
                            c4.f3530u = file;
                            c4.f3531v = fileOutputStream3;
                            c4.f3532w = fileOutputStream3;
                            c4.f3535z = 1;
                            ((C3874rx) obj).c(mVar);
                            if (vVar == enumC5179a) {
                                return enumC5179a;
                            }
                            d2 = this;
                            fileOutputStream2 = fileOutputStream3;
                            fileOutputStream = fileOutputStream2;
                        } catch (Throwable th) {
                            th = th;
                            fileOutputStream = fileOutputStream3;
                            throw th;
                        }
                    } catch (IOException e6) {
                        if (file.exists()) {
                            file.delete();
                        }
                        throw e6;
                    }
                } else {
                    if (i4 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    fileOutputStream2 = c4.f3532w;
                    fileOutputStream = c4.f3531v;
                    file = c4.f3530u;
                    d2 = c4.f3529n;
                    try {
                        com.bumptech.glide.f.r(obj2);
                    } catch (Throwable th2) {
                        th = th2;
                        try {
                            throw th;
                        } catch (Throwable th3) {
                            AbstractC0415a.h(fileOutputStream, th);
                            throw th3;
                        }
                    }
                }
                fileOutputStream2.getFD().sync();
                AbstractC0415a.h(fileOutputStream, null);
                if (!file.renameTo(d2.b())) {
                    return vVar;
                }
                throw new IOException("Unable to rename " + file + ".This likely means that there are multiple instances of DataStore for this file. Ensure that you are only creating a single instance of datastore for this file.");
            }
        }
        c4 = new C(this, abstractC5219c);
        Object obj22 = c4.f3533x;
        EnumC5179a enumC5179a2 = EnumC5179a.f41704n;
        i4 = c4.f3535z;
        q7.v vVar2 = q7.v.f40183a;
        if (i4 != 0) {
        }
        fileOutputStream2.getFD().sync();
        AbstractC0415a.h(fileOutputStream, null);
        if (!file.renameTo(d2.b())) {
        }
    }
}
