package androidx.lifecycle;

import android.view.View;
import android.view.inputmethod.BaseInputConnection;
import android.view.inputmethod.InputMethodManager;
import com.android.installreferrer.api.InstallReferrerClient;
import g0.g1;
import g0.j1;
import g0.q1;
import g0.t1;
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
import l.p1;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class r0 extends r6.l implements q6.a {

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f1025g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ Object f1026h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ r0(int i7, Object obj) {
        super(0);
        this.f1025g = i7;
        this.f1026h = obj;
    }

    /* JADX WARN: Code restructure failed: missing block: B:215:0x02a6, code lost:
    
        if (r0 != null) goto L157;
     */
    /* JADX WARN: Code restructure failed: missing block: B:216:0x02a8, code lost:
    
        r7 = r0.booleanValue();
     */
    /* JADX WARN: Code restructure failed: missing block: B:279:0x0347, code lost:
    
        if (r0 != null) goto L157;
     */
    /* JADX WARN: Code restructure failed: missing block: B:283:0x030e, code lost:
    
        continue;
     */
    /* JADX WARN: Finally extract failed */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v55 */
    /* JADX WARN: Type inference failed for: r4v56, types: [boolean] */
    /* JADX WARN: Type inference failed for: r4v57 */
    /* JADX WARN: Type inference failed for: r4v59 */
    /* JADX WARN: Type inference failed for: r4v65, types: [boolean] */
    /* JADX WARN: Type inference failed for: r4v66 */
    /* JADX WARN: Type inference failed for: r6v1, types: [g0.p0, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v2 */
    /* JADX WARN: Type inference failed for: r6v4, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r6v5 */
    /* JADX WARN: Type inference failed for: r7v4, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r7v5, types: [java.lang.Object[]] */
    @Override // q6.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a() {
        y3.e compileStatement;
        c7.f t2;
        int I;
        long size;
        int i7;
        ArrayList arrayList;
        d6.j jVar;
        d6.j jVar2;
        boolean i8;
        Boolean B;
        p1.p parentLayoutCoordinates;
        ?? r42;
        int i9;
        ?? r43;
        int i10;
        int i11 = 2;
        int i12 = 0;
        boolean z8 = true;
        switch (this.f1025g) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                return q0.i((c1) this.f1026h);
            case 1:
                compileStatement = r0.database.compileStatement(((androidx.room.z) this.f1026h).createQuery());
                return compileStatement;
            case 2:
                ((c0.a) this.f1026h).f1446o.setValue(Boolean.valueOf(!((Boolean) r0.getValue()).booleanValue()));
                return d6.z.f2639a;
            case 3:
                r1.f.m((c0.b) this.f1026h);
                return d6.z.f2639a;
            case 4:
                return Float.valueOf(v1.g.d(((Number) ((q6.a) this.f1026h).a()).floatValue(), 0.0f, 1.0f));
            case 5:
                return r6.k.h((Object[]) this.f1026h);
            case 6:
                f1.k0 k0Var = (f1.k0) this.f1026h;
                int i13 = k0Var.f3203k;
                g0.d1 d1Var = k0Var.f3200h;
                if (i13 == d1Var.e()) {
                    d1Var.f(d1Var.e() + 1);
                }
                return d6.z.f2639a;
            case j3.i.DOUBLE_FIELD_NUMBER /* 7 */:
                ArrayList arrayList2 = ((j1) this.f1026h).f3759a;
                i.x xVar = new i.x(arrayList2.size());
                int size2 = arrayList2.size();
                for (int i14 = 0; i14 < size2; i14++) {
                    ?? r62 = (g0.p0) arrayList2.get(i14);
                    Object obj = r62.f3847b;
                    int i15 = r62.f3846a;
                    Object o0Var = obj != null ? new g0.o0(Integer.valueOf(i15), r62.f3847b) : Integer.valueOf(i15);
                    int d8 = xVar.d(o0Var);
                    boolean z9 = d8 < 0;
                    Object obj2 = z9 ? null : xVar.f4814c[d8];
                    if (obj2 != null) {
                        if (!(obj2 instanceof List) || ((obj2 instanceof s6.a) && !(obj2 instanceof s6.c))) {
                            r62 = e6.m.Y(obj2, r62);
                        } else {
                            List b9 = r6.y.b(obj2);
                            b9.add(r62);
                            r62 = b9;
                        }
                    }
                    if (z9) {
                        int i16 = ~d8;
                        xVar.f4813b[i16] = o0Var;
                        xVar.f4814c[i16] = r62;
                    } else {
                        xVar.f4814c[d8] = r62;
                    }
                }
                return new g0.y0(xVar);
            case 8:
                t1 t1Var = (t1) this.f1026h;
                synchronized (t1Var.f3908b) {
                    t2 = t1Var.t();
                    if (((q1) t1Var.f3924r.getValue()).compareTo(q1.f3861g) <= 0) {
                        Throwable th = t1Var.f3910d;
                        CancellationException cancellationException = new CancellationException("Recomposer shutdown; frame clock awaiter will never resume");
                        cancellationException.initCause(th);
                        throw cancellationException;
                    }
                }
                if (t2 != null) {
                    ((c7.h) t2).resumeWith(d6.z.f2639a);
                }
                return d6.z.f2639a;
            case q.c.f7259c /* 9 */:
                Object systemService = ((View) ((b1.b) this.f1026h).f1230g).getContext().getSystemService("input_method");
                r6.k.d(systemService, "null cannot be cast to non-null type android.view.inputmethod.InputMethodManager");
                return (InputMethodManager) systemService;
            case q.c.f7261e /* 10 */:
                return new BaseInputConnection(((g2.z) this.f1026h).f4075a, false);
            case 11:
                g8.f fVar = (g8.f) this.f1026h;
                ClassLoader classLoader = fVar.f4549b;
                f8.m mVar = fVar.f4550c;
                Enumeration<URL> resources = classLoader.getResources("");
                r6.k.e(resources, "getResources(...)");
                ArrayList list = Collections.list(resources);
                r6.k.e(list, "list(this)");
                ArrayList arrayList3 = new ArrayList();
                int size3 = list.size();
                int i17 = 0;
                while (i17 < size3) {
                    Object obj3 = list.get(i17);
                    i17++;
                    URL url = (URL) obj3;
                    r6.k.c(url);
                    if (r6.k.a(url.getProtocol(), "file")) {
                        String str = f8.w.f3645g;
                        jVar2 = new d6.j(mVar, j4.i.n(new File(url.toURI())));
                    } else {
                        jVar2 = null;
                    }
                    if (jVar2 != null) {
                        arrayList3.add(jVar2);
                    }
                }
                Enumeration<URL> resources2 = classLoader.getResources("META-INF/MANIFEST.MF");
                r6.k.e(resources2, "getResources(...)");
                ArrayList list2 = Collections.list(resources2);
                r6.k.e(list2, "list(this)");
                ArrayList arrayList4 = new ArrayList();
                int size4 = list2.size();
                int i18 = 0;
                while (i18 < size4) {
                    Object obj4 = list2.get(i18);
                    i18++;
                    URL url2 = (URL) obj4;
                    r6.k.c(url2);
                    String url3 = url2.toString();
                    r6.k.e(url3, "toString(...)");
                    if (z6.o.v(url3, "jar:file:") && (I = z6.h.I(6, url3, "!")) != -1) {
                        String str2 = f8.w.f3645g;
                        String substring = url3.substring(4, I);
                        r6.k.e(substring, "this as java.lang.String…ing(startIndex, endIndex)");
                        f8.w n8 = j4.i.n(new File(URI.create(substring)));
                        f8.r f9 = mVar.f(n8);
                        try {
                            size = f9.size() - 22;
                        } catch (Throwable th2) {
                            try {
                                throw th2;
                            } catch (Throwable th3) {
                                r4.a.r(f9, th2);
                                throw th3;
                            }
                        }
                        if (size < 0) {
                            throw new IOException("not a zip: size=" + f9.size());
                        }
                        i7 = size4;
                        long max = Math.max(size - 65536, 0L);
                        while (true) {
                            f8.a0 n9 = a8.d.n(f9.c(size));
                            try {
                                if (n9.k() == 101010256) {
                                    int t8 = n9.t() & 65535;
                                    int t9 = n9.t() & 65535;
                                    arrayList = list2;
                                    long t10 = n9.t() & 65535;
                                    if (t10 != (n9.t() & 65535) || t8 != 0 || t9 != 0) {
                                        throw new IOException("unsupported zip: spanned");
                                    }
                                    n9.skip(4L);
                                    int t11 = n9.t() & 65535;
                                    g8.d dVar = new g8.d(t10, n9.k() & 4294967295L, t11);
                                    n9.u(t11);
                                    n9.close();
                                    long j8 = size - 20;
                                    if (j8 > 0) {
                                        n9 = a8.d.n(f9.c(j8));
                                        try {
                                            if (n9.k() == 117853008) {
                                                int k8 = n9.k();
                                                long n10 = n9.n();
                                                if (n9.k() != 1 || k8 != 0) {
                                                    throw new IOException("unsupported zip: spanned");
                                                }
                                                n9 = a8.d.n(f9.c(n10));
                                                try {
                                                    int k9 = n9.k();
                                                    if (k9 != 101075792) {
                                                        throw new IOException("bad zip: expected " + g8.b.c(101075792) + " but was " + g8.b.c(k9));
                                                    }
                                                    n9.skip(12L);
                                                    int k10 = n9.k();
                                                    int k11 = n9.k();
                                                    long n11 = n9.n();
                                                    if (n11 != n9.n() || k10 != 0 || k11 != 0) {
                                                        throw new IOException("unsupported zip: spanned");
                                                    }
                                                    n9.skip(8L);
                                                    dVar = new g8.d(n11, n9.n(), t11);
                                                } catch (Throwable th4) {
                                                    try {
                                                        throw th4;
                                                    } finally {
                                                    }
                                                }
                                            }
                                        } finally {
                                            try {
                                                throw th4;
                                            } finally {
                                            }
                                        }
                                    }
                                    g8.d dVar2 = dVar;
                                    long j9 = dVar2.f4544b;
                                    ArrayList arrayList5 = new ArrayList();
                                    n9 = a8.d.n(f9.c(j9));
                                    try {
                                        long j10 = dVar2.f4543a;
                                        long j11 = 0;
                                        while (j11 < j10) {
                                            g8.g d9 = g8.b.d(n9);
                                            long j12 = j9;
                                            if (d9.f4558g >= j12) {
                                                throw new IOException("bad zip: local file header offset >= central directory offset");
                                            }
                                            f8.w wVar = g8.f.f4548e;
                                            if (m4.f.g(d9.f4552a)) {
                                                arrayList5.add(d9);
                                            }
                                            j11++;
                                            j9 = j12;
                                        }
                                        n9.close();
                                        f8.j0 j0Var = new f8.j0(n8, mVar, g8.b.b(arrayList5));
                                        f9.close();
                                        jVar = new d6.j(j0Var, g8.f.f4548e);
                                    } catch (Throwable th42) {
                                    }
                                    throw th2;
                                }
                                ArrayList arrayList6 = list2;
                                n9.close();
                                size--;
                                if (size < max) {
                                    throw new IOException("not a zip: end of central directory signature not found");
                                }
                                list2 = arrayList6;
                            } finally {
                                n9.close();
                            }
                        }
                    } else {
                        arrayList = list2;
                        i7 = size4;
                        jVar = null;
                    }
                    if (jVar != null) {
                        arrayList4.add(jVar);
                    }
                    size4 = i7;
                    list2 = arrayList;
                }
                return e6.l.r0(arrayList3, arrayList4);
            case 12:
                return ((z0.q) ((z0.p) this.f1026h)).f10036c;
            case 13:
                return (c7.x) ((b1.b) this.f1026h).f1232i;
            case 14:
                return ((k1.e) this.f1026h).A0();
            case q.c.f7263g /* 15 */:
                k2.b bVar = (k2.b) this.f1026h;
                g1 g1Var = bVar.f5344h;
                if (((y0.f) g1Var.getValue()).f9792a == 9205357640488583168L || y0.f.e(((y0.f) g1Var.getValue()).f9792a)) {
                    return null;
                }
                z0.q qVar = bVar.f5342f;
                long j13 = ((y0.f) g1Var.getValue()).f9792a;
                return qVar.f10036c;
            case 16:
                File file = (File) ((a0.b1) this.f1026h).a();
                String name = file.getName();
                r6.k.e(name, "getName(...)");
                if (z6.h.U(name, "").equals("preferences_pb")) {
                    String str3 = f8.w.f3645g;
                    File absoluteFile = file.getAbsoluteFile();
                    r6.k.e(absoluteFile, "file.absoluteFile");
                    return j4.i.n(absoluteFile);
                }
                throw new IllegalStateException(("File extension for file: " + file + " does not match required extension for Preferences file: preferences_pb").toString());
            case 17:
                return Float.valueOf(l.e.i(((c7.x) this.f1026h).k()));
            case 18:
                l.x0 x0Var = (l.x0) this.f1026h;
                p1 p1Var = x0Var.f5709e;
                x0Var.f5710f = p1Var != null ? ((Number) p1Var.f5621l.getValue()).longValue() : 0L;
                return d6.z.f2639a;
            case 19:
                ((m.q) this.f1026h).f6236z.a();
                return Boolean.TRUE;
            case 20:
                m.z zVar = (m.z) this.f1026h;
                x0.h hVar = x0.h.f9610l;
                s0.n nVar = zVar.f8104f;
                i0.d dVar3 = null;
                while (true) {
                    if (nVar == null) {
                        s0.n nVar2 = zVar.f8104f;
                        if (!nVar2.f8116r) {
                            throw new IllegalStateException("visitChildren called on an unattached node");
                        }
                        i0.d dVar4 = new i0.d(new s0.n[16]);
                        s0.n nVar3 = nVar2.f8109k;
                        if (nVar3 == null) {
                            r1.f.b(dVar4, nVar2);
                        } else {
                            dVar4.b(nVar3);
                        }
                        while (true) {
                            if (dVar4.m()) {
                                s0.n nVar4 = (s0.n) dVar4.o(dVar4.f4842h - 1);
                                if ((nVar4.f8107i & 1024) == 0) {
                                    r1.f.b(dVar4, nVar4);
                                } else {
                                    while (true) {
                                        if (nVar4 == null) {
                                            break;
                                        }
                                        if ((nVar4.f8106h & 1024) != 0) {
                                            i0.d dVar5 = null;
                                            while (nVar4 != null) {
                                                if (nVar4 instanceof x0.r) {
                                                    x0.r rVar = (x0.r) nVar4;
                                                    if (rVar.A0().f9612a) {
                                                        B = x0.d.B(rVar);
                                                        break;
                                                    } else {
                                                        i8 = x0.d.i(rVar, 7, hVar);
                                                    }
                                                } else {
                                                    if ((nVar4.f8106h & 1024) != 0 && (nVar4 instanceof r1.m)) {
                                                        i0.d dVar6 = dVar5;
                                                        int i19 = 0;
                                                        for (s0.n nVar5 = ((r1.m) nVar4).f7853t; nVar5 != null; nVar5 = nVar5.f8109k) {
                                                            if ((nVar5.f8106h & 1024) != 0) {
                                                                i19++;
                                                                if (i19 == 1) {
                                                                    nVar4 = nVar5;
                                                                } else {
                                                                    if (dVar6 == null) {
                                                                        dVar6 = new i0.d(new s0.n[16]);
                                                                    }
                                                                    if (nVar4 != null) {
                                                                        dVar6.b(nVar4);
                                                                        nVar4 = null;
                                                                    }
                                                                    dVar6.b(nVar5);
                                                                }
                                                            }
                                                        }
                                                        if (i19 == 1) {
                                                            dVar5 = dVar6;
                                                        } else {
                                                            dVar5 = dVar6;
                                                        }
                                                    }
                                                    nVar4 = r1.f.f(dVar5);
                                                }
                                            }
                                        } else {
                                            nVar4 = nVar4.f8109k;
                                        }
                                    }
                                }
                            }
                        }
                    } else if (nVar instanceof x0.r) {
                        x0.r rVar2 = (x0.r) nVar;
                        if (rVar2.A0().f9612a) {
                            B = x0.d.B(rVar2);
                            break;
                        } else {
                            i8 = x0.d.i(rVar2, 7, hVar);
                        }
                    } else {
                        if ((nVar.f8106h & 1024) != 0 && (nVar instanceof r1.m)) {
                            i0.d dVar7 = dVar3;
                            int i20 = 0;
                            for (s0.n nVar6 = ((r1.m) nVar).f7853t; nVar6 != null; nVar6 = nVar6.f8109k) {
                                if ((nVar6.f8106h & 1024) != 0) {
                                    i20++;
                                    if (i20 == 1) {
                                        nVar = nVar6;
                                    } else {
                                        if (dVar7 == null) {
                                            dVar7 = new i0.d(new s0.n[16]);
                                        }
                                        if (nVar != null) {
                                            dVar7.b(nVar);
                                            nVar = null;
                                        }
                                        dVar7.b(nVar6);
                                    }
                                }
                            }
                            if (i20 == 1) {
                                dVar3 = dVar7;
                            } else {
                                dVar3 = dVar7;
                            }
                        }
                        nVar = r1.f.f(dVar3);
                    }
                }
                i8 = false;
                return Boolean.valueOf(i8);
            case 21:
                p0.b bVar2 = (p0.b) this.f1026h;
                p0.l lVar = bVar2.f6986f;
                Object obj5 = bVar2.f6989i;
                if (obj5 != null) {
                    return lVar.b(bVar2, obj5);
                }
                throw new IllegalArgumentException("Value should be initialized");
            case 22:
                p1.b0 a3 = ((p1.v0) this.f1026h).a();
                r1.d0 d0Var = a3.f7018f;
                if (a3.f7031s != ((i0.a) d0Var.p()).f4834f.f4842h) {
                    Iterator it = a3.f7023k.entrySet().iterator();
                    while (it.hasNext()) {
                        ((p1.t) ((Map.Entry) it.next()).getValue()).f7084d = true;
                    }
                    if (!d0Var.B.f7834d) {
                        r1.d0.T(d0Var, false, 7);
                    }
                }
                return d6.z.f2639a;
            case 23:
                p2.v vVar = (p2.v) this.f1026h;
                parentLayoutCoordinates = vVar.getParentLayoutCoordinates();
                return Boolean.valueOf((((parentLayoutCoordinates == null || !parentLayoutCoordinates.O()) ? null : parentLayoutCoordinates) == null || vVar.m6getPopupContentSizebOM6tXw() == null) ? false : true);
            case 24:
                break;
            case 25:
                q1.d dVar8 = (q1.d) this.f1026h;
                i0.d dVar9 = dVar8.f7484c;
                i0.d dVar10 = dVar8.f7483b;
                i0.d dVar11 = dVar8.f7486e;
                dVar8.f7487f = false;
                HashSet hashSet = new HashSet();
                i0.d dVar12 = dVar8.f7485d;
                int i21 = dVar12.f4842h;
                if (i21 > 0) {
                    Object[] objArr = dVar12.f4840f;
                    int i22 = 0;
                    do {
                        r1.d0 d0Var2 = (r1.d0) objArr[i22];
                        q1.h hVar2 = (q1.h) dVar11.f4840f[i22];
                        s0.n nVar7 = (s0.n) d0Var2.A.f3895f;
                        if (nVar7.f8116r) {
                            q1.d.b(nVar7, hVar2, hashSet);
                        }
                        i22++;
                    } while (i22 < i21);
                }
                dVar12.h();
                dVar11.h();
                int i23 = dVar10.f4842h;
                if (i23 > 0) {
                    Object[] objArr2 = dVar10.f4840f;
                    do {
                        r1.c cVar = (r1.c) objArr2[i12];
                        q1.h hVar3 = (q1.h) dVar9.f4840f[i12];
                        if (cVar.f8116r) {
                            q1.d.b(cVar, hVar3, hashSet);
                        }
                        i12++;
                    } while (i12 < i23);
                }
                dVar10.h();
                dVar9.h();
                Iterator it2 = hashSet.iterator();
                while (it2.hasNext()) {
                    ((r1.c) it2.next()).C0();
                }
                return d6.z.f2639a;
            case 26:
                r1.l0 l0Var = ((r1.d0) this.f1026h).B;
                l0Var.f7848r.A = true;
                r1.i0 i0Var = l0Var.f7849s;
                if (i0Var != null) {
                    i0Var.f7799x = true;
                }
                return d6.z.f2639a;
            case 27:
                r1.j0 j0Var2 = (r1.j0) this.f1026h;
                r1.l0 l0Var2 = j0Var2.K;
                r1.d0 d0Var3 = l0Var2.f7831a;
                l0Var2.f7841k = 0;
                i0.d v5 = l0Var2.f7831a.v();
                int i24 = v5.f4842h;
                if (i24 > 0) {
                    Object[] objArr3 = v5.f4840f;
                    int i25 = 0;
                    do {
                        r1.j0 j0Var3 = ((r1.d0) objArr3[i25]).B.f7848r;
                        j0Var3.f7812l = j0Var3.f7813m;
                        j0Var3.f7813m = Integer.MAX_VALUE;
                        j0Var3.f7824x = false;
                        if (j0Var3.f7816p == 2) {
                            j0Var3.f7816p = 3;
                        }
                        i25++;
                    } while (i25 < i24);
                }
                i0.d v8 = d0Var3.v();
                int i26 = v8.f4842h;
                if (i26 > 0) {
                    Object[] objArr4 = v8.f4840f;
                    int i27 = 0;
                    do {
                        ((r1.d0) objArr4[i27]).B.f7848r.f7825y.f7757d = false;
                        i27++;
                    } while (i27 < i26);
                }
                j0Var2.l().v0().p();
                i0.d v9 = d0Var3.v();
                int i28 = v9.f4842h;
                if (i28 > 0) {
                    Object[] objArr5 = v9.f4840f;
                    int i29 = 0;
                    do {
                        r1.d0 d0Var4 = (r1.d0) objArr5[i29];
                        if (d0Var4.B.f7848r.f7812l != d0Var4.t()) {
                            d0Var3.K();
                            d0Var3.y();
                            if (d0Var4.t() == Integer.MAX_VALUE) {
                                d0Var4.B.f7848r.r0();
                            }
                        }
                        i29++;
                    } while (i29 < i28);
                }
                i0.d v10 = d0Var3.v();
                int i30 = v10.f4842h;
                if (i30 > 0) {
                    Object[] objArr6 = v10.f4840f;
                    do {
                        r1.e0 e0Var = ((r1.d0) objArr6[i12]).B.f7848r.f7825y;
                        e0Var.f7758e = e0Var.f7757d;
                        i12++;
                    } while (i12 < i30);
                }
                return d6.z.f2639a;
            case 28:
                r1.l0 l0Var3 = (r1.l0) this.f1026h;
                l0Var3.a().b(l0Var3.f7850t);
                return d6.z.f2639a;
            default:
                r1.a1 a1Var = ((r1.a1) this.f1026h).f7702s;
                if (a1Var != null) {
                    a1Var.S0();
                }
                return d6.z.f2639a;
        }
        while (true) {
            q0.t tVar = (q0.t) this.f1026h;
            synchronized (tVar.f7459f) {
                try {
                    if (!tVar.f7456c) {
                        tVar.f7456c = z8;
                        try {
                            i0.d dVar13 = tVar.f7459f;
                            int i31 = dVar13.f4842h;
                            if (i31 > 0) {
                                try {
                                    Object[] objArr7 = dVar13.f4840f;
                                    int i32 = i12;
                                    while (true) {
                                        q0.s sVar = (q0.s) objArr7[i32];
                                        i.b0 b0Var = sVar.f7448g;
                                        q6.c cVar2 = sVar.f7442a;
                                        Object[] objArr8 = b0Var.f4722b;
                                        long[] jArr = b0Var.f4721a;
                                        int length = jArr.length - i11;
                                        if (length >= 0) {
                                            int i33 = i12;
                                            while (true) {
                                                long j14 = jArr[i33];
                                                i9 = i32;
                                                if ((((~j14) << 7) & j14 & (-9187201950435737472L)) != -9187201950435737472L) {
                                                    int i34 = 8;
                                                    int i35 = 8 - ((~(i33 - length)) >>> 31);
                                                    while (i12 < i35) {
                                                        if ((j14 & 255) < 128) {
                                                            i10 = i34;
                                                            cVar2.f(objArr8[(i33 << 3) + i12]);
                                                        } else {
                                                            i10 = i34;
                                                        }
                                                        j14 >>= i10;
                                                        i12++;
                                                        i34 = i10;
                                                    }
                                                    if (i35 != i34) {
                                                    }
                                                }
                                                if (i33 != length) {
                                                    i33++;
                                                    i32 = i9;
                                                    i12 = 0;
                                                }
                                            }
                                        } else {
                                            i9 = i32;
                                        }
                                        b0Var.b();
                                        i32 = i9 + 1;
                                        if (i32 >= i31) {
                                            r43 = 0;
                                        } else {
                                            i11 = 2;
                                            i12 = 0;
                                        }
                                    }
                                } catch (Throwable th5) {
                                    th = th5;
                                    r42 = 0;
                                    tVar.f7456c = r42;
                                    throw th;
                                }
                            } else {
                                r43 = i12;
                            }
                            tVar.f7456c = r43;
                        } catch (Throwable th6) {
                            th = th6;
                            r42 = i12;
                        }
                    }
                } catch (Throwable th7) {
                    throw th7;
                }
            }
            if (!q0.t.a((q0.t) this.f1026h)) {
                return d6.z.f2639a;
            }
            i11 = 2;
            i12 = 0;
            z8 = true;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r0(z0.p pVar, long j8) {
        super(0);
        this.f1025g = 12;
        this.f1026h = pVar;
    }
}
