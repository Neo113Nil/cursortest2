package A;

import B.f0;
import E.C0073a;
import E.C0074b;
import I.C0140b0;
import I.C0150g0;
import I.C0156j0;
import I.C0162m0;
import I.C0187z0;
import I.EnumC0175t0;
import I.P;
import I.Q;
import I0.C;
import R0.A;
import R1.y;
import S.w;
import S1.u;
import T2.I;
import T2.q;
import T2.v;
import T2.z;
import U.p;
import Z.t;
import a0.C0241f;
import android.view.View;
import android.view.inputmethod.BaseInputConnection;
import android.view.inputmethod.InputMethodManager;
import androidx.lifecycle.b0;
import b0.AbstractC0347p;
import b0.C0348q;
import e2.InterfaceC0422a;
import f2.x;
import g2.InterfaceC0439a;
import g2.InterfaceC0441c;
import h0.C0456I;
import h2.AbstractC0508a;
import j.C0519A;
import j.C0550x;
import java.io.File;
import java.io.IOException;
import java.net.URI;
import java.net.URL;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Enumeration;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CancellationException;
import javax.net.ssl.SSLPeerUnverifiedException;
import m.U;
import m.l0;
import n.C0669L;
import n.C0698y;
import n2.AbstractC0730j;
import n2.AbstractC0737q;
import q2.C0821h;
import q2.InterfaceC0819f;
import q2.InterfaceC0835w;
import r.AbstractC0856c;
import r0.C0881C;
import r0.C0901X;
import r0.C0923t;
import r0.InterfaceC0919p;
import s0.C0958d;
import s0.C0962h;
import t0.AbstractC0993f;
import t0.AbstractC1000m;
import t0.C0990c;
import t0.E;

/* loaded from: classes.dex */
public final class h extends f2.k implements InterfaceC0422a {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f52e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f53f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ h(int i3, Object obj) {
        super(0);
        this.f52e = i3;
        this.f53f = obj;
    }

    /* JADX WARN: Code restructure failed: missing block: B:144:0x0145, code lost:
    
        continue;
     */
    /* JADX WARN: Finally extract failed */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v3, types: [e2.a, f2.k] */
    /* JADX WARN: Type inference failed for: r13v0 */
    /* JADX WARN: Type inference failed for: r13v1, types: [int] */
    /* JADX WARN: Type inference failed for: r13v22 */
    /* JADX WARN: Type inference failed for: r6v3, types: [I.Q, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v4 */
    /* JADX WARN: Type inference failed for: r6v7, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r6v8 */
    /* JADX WARN: Type inference failed for: r7v4, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r7v5, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r7v50 */
    /* JADX WARN: Type inference failed for: r7v7 */
    /* JADX WARN: Type inference failed for: r7v8, types: [int] */
    @Override // e2.InterfaceC0422a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b() {
        InterfaceC0819f t3;
        InterfaceC0919p parentLayoutCoordinates;
        Object[] objArr;
        int i3;
        Object[] objArr2;
        Object[] objArr3;
        int M3;
        long b3;
        R1.i iVar;
        R1.i iVar2;
        boolean B3;
        char c2 = 7;
        boolean z3 = false;
        int i4 = 0;
        boolean z4 = false;
        switch (this.f52e) {
            case 0:
                j jVar = (j) this.f53f;
                jVar.f59F = null;
                AbstractC0993f.o(jVar);
                AbstractC0993f.n(jVar);
                AbstractC0993f.m(jVar);
                return Boolean.TRUE;
            case 1:
                n nVar = (n) this.f53f;
                nVar.f77B = null;
                AbstractC0993f.o(nVar);
                AbstractC0993f.n(nVar);
                AbstractC0993f.m(nVar);
                return Boolean.TRUE;
            case k1.i.FLOAT_FIELD_NUMBER /* 2 */:
                A1.h hVar = (A1.h) this.f53f;
                String str = hVar.f216e;
                A1.d dVar = new A1.d();
                dVar.f203a = null;
                A1.g gVar = new A1.g(hVar.f215d, hVar.f216e, dVar, hVar.f217f);
                gVar.setWriteAheadLoggingEnabled(hVar.f219h);
                return gVar;
            case k1.i.INTEGER_FIELD_NUMBER /* 3 */:
                ((C0073a) this.f53f).f941m.setValue(Boolean.valueOf(!((Boolean) r0.f941m.getValue()).booleanValue()));
                return y.f4171a;
            case k1.i.LONG_FIELD_NUMBER /* 4 */:
                AbstractC0993f.m((C0074b) this.f53f);
                return y.f4171a;
            case 5:
                return (List) this.f53f;
            case 6:
                try {
                    return (List) ((f2.k) this.f53f).b();
                } catch (SSLPeerUnverifiedException unused) {
                    return u.f4320d;
                }
            case k1.i.DOUBLE_FIELD_NUMBER /* 7 */:
                C0162m0 c0162m0 = (C0162m0) this.f53f;
                C0550x c0550x = new C0550x(c0162m0.f2834a.size());
                ArrayList arrayList = c0162m0.f2834a;
                int size = arrayList.size();
                for (int i5 = 0; i5 < size; i5++) {
                    ?? r6 = (Q) arrayList.get(i5);
                    Object obj = r6.f2743b;
                    int i6 = r6.f2742a;
                    Object p3 = obj != null ? new P(Integer.valueOf(i6), r6.f2743b) : Integer.valueOf(i6);
                    int d3 = c0550x.d(p3);
                    boolean z5 = d3 < 0;
                    Object obj2 = z5 ? null : c0550x.f6346c[d3];
                    if (obj2 != null) {
                        if (!(obj2 instanceof List) || ((obj2 instanceof InterfaceC0439a) && !(obj2 instanceof InterfaceC0441c))) {
                            r6 = S1.m.C0(obj2, r6);
                        } else {
                            List b4 = x.b(obj2);
                            b4.add(r6);
                            r6 = b4;
                        }
                    }
                    if (z5) {
                        int i7 = ~d3;
                        c0550x.f6345b[i7] = p3;
                        c0550x.f6346c[i7] = r6;
                    } else {
                        c0550x.f6346c[d3] = r6;
                    }
                }
                return new C0140b0(c0550x);
            case k1.i.BYTES_FIELD_NUMBER /* 8 */:
                C0187z0 c0187z0 = (C0187z0) this.f53f;
                synchronized (c0187z0.f2985b) {
                    t3 = c0187z0.t();
                    if (((EnumC0175t0) c0187z0.f3001r.getValue()).compareTo(EnumC0175t0.f2920e) <= 0) {
                        Throwable th = c0187z0.f2987d;
                        CancellationException cancellationException = new CancellationException("Recomposer shutdown; frame clock awaiter will never resume");
                        cancellationException.initCause(th);
                        throw cancellationException;
                    }
                }
                if (t3 != null) {
                    ((C0821h) t3).u(y.f4171a);
                }
                return y.f4171a;
            case AbstractC0856c.f8037c /* 9 */:
                Object systemService = ((View) ((G1.m) this.f53f).f2116b).getContext().getSystemService("input_method");
                f2.j.d(systemService, "null cannot be cast to non-null type android.view.inputmethod.InputMethodManager");
                return (InputMethodManager) systemService;
            case AbstractC0856c.f8039e /* 10 */:
                return new BaseInputConnection(((C) this.f53f).f3012a, false);
            case 11:
                return ((C0348q) ((AbstractC0347p) this.f53f)).f5431c;
            case 12:
                M0.b bVar = (M0.b) this.f53f;
                if (((C0241f) bVar.f3454c.getValue()).f4736a != 9205357640488583168L) {
                    C0156j0 c0156j0 = bVar.f3454c;
                    if (!C0241f.e(((C0241f) c0156j0.getValue()).f4736a)) {
                        long j3 = ((C0241f) c0156j0.getValue()).f4736a;
                        return bVar.f3452a.f5431c;
                    }
                }
                return null;
            case 13:
                R.b bVar2 = (R.b) this.f53f;
                R.n nVar2 = bVar2.f4002d;
                Object obj3 = bVar2.f4005g;
                if (obj3 != null) {
                    return nVar2.a(bVar2, obj3);
                }
                throw new IllegalArgumentException("Value should be initialized");
            case 14:
                A a3 = (A) this.f53f;
                parentLayoutCoordinates = a3.getParentLayoutCoordinates();
                return Boolean.valueOf((((parentLayoutCoordinates == null || !parentLayoutCoordinates.o()) ? null : parentLayoutCoordinates) == null || a3.m0getPopupContentSizebOM6tXw() == null) ? false : true);
            case AbstractC0856c.f8041g /* 15 */:
                break;
            case 16:
                return f2.j.h((Object[]) this.f53f);
            case 17:
                U2.e eVar = (U2.e) this.f53f;
                ClassLoader classLoader = eVar.f4525b;
                Enumeration<URL> resources = classLoader.getResources("");
                f2.j.e(resources, "getResources(...)");
                ArrayList list = Collections.list(resources);
                f2.j.e(list, "list(this)");
                ArrayList arrayList2 = new ArrayList();
                Iterator it = list.iterator();
                while (true) {
                    boolean hasNext = it.hasNext();
                    T2.m mVar = eVar.f4526c;
                    if (!hasNext) {
                        Enumeration<URL> resources2 = classLoader.getResources("META-INF/MANIFEST.MF");
                        f2.j.e(resources2, "getResources(...)");
                        ArrayList<URL> list2 = Collections.list(resources2);
                        f2.j.e(list2, "list(this)");
                        ArrayList arrayList3 = new ArrayList();
                        for (URL url : list2) {
                            f2.j.c(url);
                            String url2 = url.toString();
                            f2.j.e(url2, "toString(...)");
                            if (AbstractC0737q.z(url2, "jar:file:") && (M3 = AbstractC0730j.M(6, url2, "!")) != -1) {
                                String str2 = v.f4446e;
                                String substring = url2.substring(4, M3);
                                f2.j.e(substring, "this as java.lang.String…ing(startIndex, endIndex)");
                                v m3 = A1.i.m(new File(URI.create(substring)));
                                q c3 = mVar.c(m3);
                                try {
                                    b3 = c3.b() - 22;
                                } catch (Throwable th2) {
                                    try {
                                        throw th2;
                                    } catch (Throwable th3) {
                                        O2.d.t(c3, th2);
                                        throw th3;
                                    }
                                }
                                if (b3 < r2) {
                                    throw new IOException("not a zip: size=" + c3.b());
                                }
                                long max = Math.max(b3 - 65536, r2);
                                do {
                                    z p4 = AbstractC0508a.p(c3.d(b3));
                                    try {
                                        if (p4.l() == 101010256) {
                                            int r3 = p4.r() & 65535;
                                            int r4 = p4.r() & 65535;
                                            long r5 = p4.r() & 65535;
                                            if (r5 != (p4.r() & 65535) || r3 != 0 || r4 != 0) {
                                                throw new IOException("unsupported zip: spanned");
                                            }
                                            p4.x(4L);
                                            int r7 = p4.r() & 65535;
                                            U2.d dVar2 = new U2.d(r5, p4.l() & 4294967295L, r7);
                                            p4.s(r7);
                                            p4.close();
                                            long j4 = b3 - 20;
                                            if (j4 > 0) {
                                                z p5 = AbstractC0508a.p(c3.d(j4));
                                                try {
                                                    if (p5.l() == 117853008) {
                                                        int l3 = p5.l();
                                                        long n3 = p5.n();
                                                        if (p5.l() != 1 || l3 != 0) {
                                                            throw new IOException("unsupported zip: spanned");
                                                        }
                                                        z p6 = AbstractC0508a.p(c3.d(n3));
                                                        try {
                                                            int l4 = p6.l();
                                                            if (l4 != 101075792) {
                                                                throw new IOException("bad zip: expected " + U2.b.c(101075792) + " but was " + U2.b.c(l4));
                                                            }
                                                            p6.x(12L);
                                                            int l5 = p6.l();
                                                            int l6 = p6.l();
                                                            long n4 = p6.n();
                                                            if (n4 != p6.n() || l5 != 0 || l6 != 0) {
                                                                throw new IOException("unsupported zip: spanned");
                                                            }
                                                            p6.x(8L);
                                                            U2.d dVar3 = new U2.d(n4, p6.n(), r7);
                                                            O2.d.t(p6, null);
                                                            dVar2 = dVar3;
                                                        } catch (Throwable th4) {
                                                            try {
                                                                throw th4;
                                                            } finally {
                                                            }
                                                        }
                                                    }
                                                    O2.d.t(p5, null);
                                                } finally {
                                                    try {
                                                        throw th;
                                                    } finally {
                                                    }
                                                }
                                            }
                                            long j5 = dVar2.f4523b;
                                            ArrayList arrayList4 = new ArrayList();
                                            z p7 = AbstractC0508a.p(c3.d(j5));
                                            try {
                                                long j6 = dVar2.f4522a;
                                                for (long j7 = 0; j7 < j6; j7++) {
                                                    U2.f d4 = U2.b.d(p7);
                                                    if (d4.f4532e >= j5) {
                                                        throw new IOException("bad zip: local file header offset >= central directory offset");
                                                    }
                                                    v vVar = U2.e.f4524e;
                                                    if (A1.i.b(d4.f4528a)) {
                                                        arrayList4.add(d4);
                                                    }
                                                }
                                                O2.d.t(p7, null);
                                                I i8 = new I(m3, mVar, U2.b.b(arrayList4));
                                                O2.d.t(c3, null);
                                                iVar = new R1.i(i8, U2.e.f4524e);
                                            } catch (Throwable th5) {
                                            }
                                            throw th2;
                                        }
                                        p4.close();
                                        b3--;
                                    } catch (Throwable th6) {
                                        p4.close();
                                        throw th6;
                                    }
                                } while (b3 >= max);
                                throw new IOException("not a zip: end of central directory signature not found");
                            }
                            iVar = null;
                            if (iVar != null) {
                                arrayList3.add(iVar);
                            }
                            r2 = 0;
                        }
                        return S1.l.U0(arrayList2, arrayList3);
                    }
                    URL url3 = (URL) it.next();
                    f2.j.c(url3);
                    if (f2.j.a(url3.getProtocol(), "file")) {
                        String str3 = v.f4446e;
                        iVar2 = new R1.i(mVar, A1.i.m(new File(url3.toURI())));
                    } else {
                        iVar2 = null;
                    }
                    if (iVar2 != null) {
                        arrayList2.add(iVar2);
                    }
                }
                break;
            case 18:
                return androidx.lifecycle.P.i((b0) this.f53f);
            case 19:
                C0456I c0456i = (C0456I) this.f53f;
                int i9 = c0456i.f5888k;
                C0150g0 c0150g0 = c0456i.f5885h;
                if (i9 == c0150g0.g()) {
                    c0150g0.h(c0150g0.g() + 1);
                }
                return y.f4171a;
            case 20:
                File file = (File) ((f0) this.f53f).b();
                String name = file.getName();
                f2.j.e(name, "getName(...)");
                if (AbstractC0730j.W(name, "").equals("preferences_pb")) {
                    String str4 = v.f4446e;
                    File absoluteFile = file.getAbsoluteFile();
                    f2.j.e(absoluteFile, "file.absoluteFile");
                    return A1.i.m(absoluteFile);
                }
                throw new IllegalStateException(("File extension for file: " + file + " does not match required extension for Preferences file: preferences_pb").toString());
            case 21:
                U u3 = (U) this.f53f;
                l0 l0Var = u3.f6675e;
                u3.f6676f = l0Var != null ? ((Number) l0Var.f6847l.getValue()).longValue() : 0L;
                return y.f4171a;
            case 22:
                return (InterfaceC0835w) ((G1.m) this.f53f).f2118d;
            case 23:
                return ((m0.e) this.f53f).y0();
            case 24:
                return this.f53f;
            case 25:
                ((C0698y) this.f53f).f7238x.b();
                return Boolean.TRUE;
            case 26:
                C0669L c0669l = (C0669L) this.f53f;
                p pVar = c0669l.f4489d;
                K.d dVar4 = null;
                while (true) {
                    Z.i iVar3 = Z.i.f4682j;
                    if (pVar == null) {
                        p pVar2 = c0669l.f4489d;
                        if (!pVar2.f4501p) {
                            throw new IllegalStateException("visitChildren called on an unattached node");
                        }
                        K.d dVar5 = new K.d(new p[16]);
                        p pVar3 = pVar2.f4494i;
                        if (pVar3 == null) {
                            AbstractC0993f.b(dVar5, pVar2);
                        } else {
                            dVar5.b(pVar3);
                        }
                        while (dVar5.m()) {
                            p pVar4 = (p) dVar5.o(dVar5.f3216f - 1);
                            if ((pVar4.f4492g & 1024) == 0) {
                                AbstractC0993f.b(dVar5, pVar4);
                            } else {
                                while (true) {
                                    if (pVar4 == null) {
                                        break;
                                    }
                                    if ((pVar4.f4491f & 1024) != 0) {
                                        K.d dVar6 = null;
                                        while (pVar4 != null) {
                                            if (pVar4 instanceof t) {
                                                t tVar = (t) pVar4;
                                                B3 = tVar.y0().f4686a ? Z.d.B(tVar) : Z.d.i(tVar, 7, iVar3);
                                            } else {
                                                if ((pVar4.f4491f & 1024) != 0 && (pVar4 instanceof AbstractC1000m)) {
                                                    int i10 = 0;
                                                    for (p pVar5 = ((AbstractC1000m) pVar4).f8771r; pVar5 != null; pVar5 = pVar5.f4494i) {
                                                        if ((pVar5.f4491f & 1024) != 0) {
                                                            i10++;
                                                            if (i10 == 1) {
                                                                pVar4 = pVar5;
                                                            } else {
                                                                if (dVar6 == null) {
                                                                    dVar6 = new K.d(new p[16]);
                                                                }
                                                                if (pVar4 != null) {
                                                                    dVar6.b(pVar4);
                                                                    pVar4 = null;
                                                                }
                                                                dVar6.b(pVar5);
                                                            }
                                                        }
                                                    }
                                                    if (i10 == 1) {
                                                    }
                                                }
                                                pVar4 = AbstractC0993f.f(dVar6);
                                            }
                                        }
                                    } else {
                                        pVar4 = pVar4.f4494i;
                                    }
                                }
                            }
                        }
                    } else if (pVar instanceof t) {
                        t tVar2 = (t) pVar;
                        B3 = tVar2.y0().f4686a ? Z.d.B(tVar2) : Z.d.i(tVar2, 7, iVar3);
                    } else {
                        if ((pVar.f4491f & 1024) != 0 && (pVar instanceof AbstractC1000m)) {
                            int i11 = 0;
                            for (p pVar6 = ((AbstractC1000m) pVar).f8771r; pVar6 != null; pVar6 = pVar6.f4494i) {
                                if ((pVar6.f4491f & 1024) != 0) {
                                    i11++;
                                    if (i11 == 1) {
                                        pVar = pVar6;
                                    } else {
                                        if (dVar4 == null) {
                                            dVar4 = new K.d(new p[16]);
                                        }
                                        if (pVar != null) {
                                            dVar4.b(pVar);
                                            pVar = null;
                                        }
                                        dVar4.b(pVar6);
                                    }
                                }
                            }
                            if (i11 == 1) {
                            }
                        }
                        pVar = AbstractC0993f.f(dVar4);
                    }
                }
                z4 = B3;
                return Boolean.valueOf(z4);
            case 27:
                C0881C a4 = ((C0901X) this.f53f).a();
                E e3 = a4.f8100d;
                if (a4.f8113q != ((K.a) e3.p()).f3208d.f3216f) {
                    Iterator it2 = a4.f8105i.entrySet().iterator();
                    while (it2.hasNext()) {
                        ((C0923t) ((Map.Entry) it2.next()).getValue()).f8176d = true;
                    }
                    if (!e3.f8562z.f8628d) {
                        E.T(e3, false, 7);
                    }
                }
                return y.f4171a;
            case 28:
                C0958d c0958d = (C0958d) this.f53f;
                c0958d.f8350f = false;
                HashSet hashSet = new HashSet();
                K.d dVar7 = c0958d.f8348d;
                int i12 = dVar7.f3216f;
                K.d dVar8 = c0958d.f8349e;
                if (i12 > 0) {
                    Object[] objArr4 = dVar7.f3214d;
                    int i13 = 0;
                    do {
                        E e4 = (E) objArr4[i13];
                        C0962h c0962h = (C0962h) dVar8.f3214d[i13];
                        p pVar7 = (p) e4.f8561y.f2915f;
                        if (pVar7.f4501p) {
                            C0958d.b(pVar7, c0962h, hashSet);
                        }
                        i13++;
                    } while (i13 < i12);
                }
                dVar7.h();
                dVar8.h();
                K.d dVar9 = c0958d.f8346b;
                int i14 = dVar9.f3216f;
                K.d dVar10 = c0958d.f8347c;
                if (i14 > 0) {
                    Object[] objArr5 = dVar9.f3214d;
                    do {
                        C0990c c0990c = (C0990c) objArr5[i4];
                        C0962h c0962h2 = (C0962h) dVar10.f3214d[i4];
                        if (c0990c.f4501p) {
                            C0958d.b(c0990c, c0962h2, hashSet);
                        }
                        i4++;
                    } while (i4 < i14);
                }
                dVar9.h();
                dVar10.h();
                Iterator it3 = hashSet.iterator();
                while (it3.hasNext()) {
                    ((C0990c) it3.next()).A0();
                }
                return y.f4171a;
            default:
                return new t.I((R.k) this.f53f, S1.v.f4321d);
        }
        while (true) {
            w wVar = (w) this.f53f;
            synchronized (wVar.f4276f) {
                if (!wVar.f4273c) {
                    wVar.f4273c = true;
                    try {
                        K.d dVar11 = wVar.f4276f;
                        int i15 = dVar11.f3216f;
                        if (i15 > 0) {
                            Object[] objArr6 = dVar11.f3214d;
                            ?? r72 = z3;
                            while (true) {
                                S.v vVar2 = (S.v) objArr6[r72];
                                C0519A c0519a = vVar2.f4265g;
                                Object[] objArr7 = c0519a.f6248b;
                                long[] jArr = c0519a.f6247a;
                                int length = jArr.length - 2;
                                if (length >= 0) {
                                    ?? r13 = z3;
                                    while (true) {
                                        long j8 = jArr[r13];
                                        objArr = objArr6;
                                        if ((((~j8) << c2) & j8 & (-9187201950435737472L)) != -9187201950435737472L) {
                                            int i16 = 8;
                                            int i17 = 8 - ((~(r13 - length)) >>> 31);
                                            int i18 = 0;
                                            while (i18 < i17) {
                                                if ((j8 & 255) < 128) {
                                                    objArr3 = objArr7;
                                                    vVar2.f4259a.n(objArr7[(r13 << 3) + i18]);
                                                    i16 = 8;
                                                } else {
                                                    objArr3 = objArr7;
                                                }
                                                j8 >>= i16;
                                                i18++;
                                                objArr7 = objArr3;
                                            }
                                            objArr2 = objArr7;
                                            i3 = 1;
                                            if (i17 == i16) {
                                            }
                                        } else {
                                            objArr2 = objArr7;
                                            i3 = 1;
                                        }
                                        if (r13 != length) {
                                            int i19 = r13 + i3;
                                            objArr6 = objArr;
                                            objArr7 = objArr2;
                                            c2 = 7;
                                            r13 = i19;
                                        }
                                    }
                                } else {
                                    objArr = objArr6;
                                    i3 = 1;
                                }
                                c0519a.b();
                                int i20 = r72 + i3;
                                if (i20 >= i15) {
                                    z3 = false;
                                } else {
                                    objArr6 = objArr;
                                    c2 = 7;
                                    z3 = false;
                                    r72 = i20;
                                }
                            }
                        }
                        wVar.f4273c = z3;
                    } catch (Throwable th7) {
                        wVar.f4273c = false;
                        throw th7;
                    }
                }
            }
            if (!w.a((w) this.f53f)) {
                return y.f4171a;
            }
            c2 = 7;
            z3 = false;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(AbstractC0347p abstractC0347p, long j3) {
        super(0);
        this.f52e = 11;
        this.f53f = abstractC0347p;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public h(InterfaceC0422a interfaceC0422a) {
        super(0);
        this.f52e = 6;
        this.f53f = (f2.k) interfaceC0422a;
    }
}
