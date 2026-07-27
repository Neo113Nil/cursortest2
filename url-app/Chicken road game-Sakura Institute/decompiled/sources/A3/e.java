package A3;

import A.f0;
import B1.C0097d;
import C.C0106a;
import C.C0107b;
import G.C0189b0;
import G.C0199g0;
import G.C0205j0;
import G.C0211m0;
import G.C0236z0;
import G.EnumC0224t0;
import G.P;
import G.Q;
import G0.B;
import M2.J;
import M2.p;
import P.n;
import W2.C0286h;
import W2.InterfaceC0284f;
import W2.InterfaceC0302y;
import X.t;
import Z.A;
import android.view.View;
import android.view.inputmethod.BaseInputConnection;
import android.view.inputmethod.InputMethodManager;
import androidx.lifecycle.M;
import androidx.lifecycle.Z;
import com.appsflyer.attribution.RequestError;
import f0.C0578I;
import i.C0661B;
import java.io.File;
import java.io.IOException;
import java.net.URI;
import java.net.URL;
import java.security.cert.Certificate;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Enumeration;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CancellationException;
import javax.net.ssl.SSLPeerUnverifiedException;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.u;
import kotlin.text.y;
import l.U;
import l.m0;
import m.C0850x;
import p0.C0941B;
import p0.C0963Y;
import p0.C0984t;
import p0.InterfaceC0980p;
import q.AbstractC1024c;
import q0.C1051d;
import q0.C1055h;
import r0.AbstractC1065f;
import r0.AbstractC1073n;
import r0.C1062c;
import r0.E;
import r0.F;
import r0.K;
import r0.L;
import r0.a0;
import s0.C1166s;
import y2.AbstractC1341p;
import z2.C1403G;
import z2.C1405I;
import z2.C1441y;
import z2.C1442z;
import z3.I;
import z3.m;
import z3.q;
import z3.v;
import z3.z;

/* loaded from: classes.dex */
public final class e extends p implements Function0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f851d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f852e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e(int i2, Object obj) {
        super(0);
        this.f851d = i2;
        this.f852e = obj;
    }

    /* JADX WARN: Code restructure failed: missing block: B:202:0x027c, code lost:
    
        continue;
     */
    /* JADX WARN: Finally extract failed */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v3, types: [M2.p, kotlin.jvm.functions.Function0] */
    /* JADX WARN: Type inference failed for: r17v0, types: [A3.f] */
    /* JADX WARN: Type inference failed for: r1v27 */
    /* JADX WARN: Type inference failed for: r1v28, types: [boolean] */
    /* JADX WARN: Type inference failed for: r1v29 */
    /* JADX WARN: Type inference failed for: r7v18, types: [G.Q, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v19 */
    /* JADX WARN: Type inference failed for: r7v22, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r7v23 */
    /* JADX WARN: Type inference failed for: r8v14, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r8v15, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r8v18 */
    /* JADX WARN: Type inference failed for: r8v19 */
    /* JADX WARN: Type inference failed for: r8v21 */
    @Override // kotlin.jvm.functions.Function0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invoke() {
        int y4;
        long b4;
        Iterator it;
        ArrayList arrayList;
        long j4;
        Pair pair;
        Pair pair2;
        InterfaceC0284f t4;
        InterfaceC0980p parentLayoutCoordinates;
        char c4;
        ?? r12;
        Object[] objArr;
        int i2;
        Object[] objArr2;
        boolean B;
        e eVar = this;
        char c5 = 3;
        int i4 = 2;
        char c6 = 7;
        int i5 = 0;
        int i6 = 0;
        int i7 = 0;
        boolean z4 = false;
        boolean z5 = true;
        switch (eVar.f851d) {
            case 0:
                g gVar = (g) eVar.f852e;
                ClassLoader classLoader = gVar.f855b;
                Enumeration<URL> resources = classLoader.getResources("");
                Intrinsics.checkNotNullExpressionValue(resources, "getResources(...)");
                ArrayList list = Collections.list(resources);
                Intrinsics.checkNotNullExpressionValue(list, "list(this)");
                ArrayList arrayList2 = new ArrayList();
                Iterator it2 = list.iterator();
                while (true) {
                    boolean hasNext = it2.hasNext();
                    m fileSystem = gVar.f856c;
                    if (!hasNext) {
                        Enumeration<URL> resources2 = classLoader.getResources("META-INF/MANIFEST.MF");
                        Intrinsics.checkNotNullExpressionValue(resources2, "getResources(...)");
                        ArrayList list2 = Collections.list(resources2);
                        Intrinsics.checkNotNullExpressionValue(list2, "list(this)");
                        ArrayList arrayList3 = new ArrayList();
                        Iterator it3 = list2.iterator();
                        while (it3.hasNext()) {
                            URL url = (URL) it3.next();
                            Intrinsics.c(url);
                            String url2 = url.toString();
                            Intrinsics.checkNotNullExpressionValue(url2, "toString(...)");
                            if (u.n(url2, "jar:file:") && (y4 = y.y(6, url2, "!")) != -1) {
                                String str = v.f12037e;
                                String substring = url2.substring(4, y4);
                                Intrinsics.checkNotNullExpressionValue(substring, "this as java.lang.String…ing(startIndex, endIndex)");
                                v zipPath = E1.i.j(new File(URI.create(substring)));
                                f predicate = f.f853d;
                                Intrinsics.checkNotNullParameter(zipPath, "zipPath");
                                Intrinsics.checkNotNullParameter(fileSystem, "fileSystem");
                                Intrinsics.checkNotNullParameter(predicate, "predicate");
                                q c7 = fileSystem.c(zipPath);
                                try {
                                    b4 = c7.b() - 22;
                                } catch (Throwable th) {
                                    try {
                                        throw th;
                                    } catch (Throwable th2) {
                                        J2.q.a(c7, th);
                                        throw th2;
                                    }
                                }
                                if (b4 < r2) {
                                    throw new IOException("not a zip: size=" + c7.b());
                                }
                                long max = Math.max(b4 - 65536, r2);
                                while (true) {
                                    z h4 = m3.z.h(c7.d(b4));
                                    try {
                                        if (h4.i() == 101010256) {
                                            int n2 = h4.n() & 65535;
                                            int n4 = h4.n() & 65535;
                                            long n5 = h4.n() & 65535;
                                            it = it3;
                                            arrayList = arrayList3;
                                            if (n5 != (h4.n() & 65535) || n2 != 0 || n4 != 0) {
                                                throw new IOException("unsupported zip: spanned");
                                            }
                                            h4.u(4L);
                                            int n6 = h4.n() & 65535;
                                            d dVar = new d(n5, h4.i() & 4294967295L, n6);
                                            h4.p(n6);
                                            h4.close();
                                            long j5 = b4 - 20;
                                            j4 = 0;
                                            if (j5 > 0) {
                                                z h5 = m3.z.h(c7.d(j5));
                                                try {
                                                    if (h5.i() == 117853008) {
                                                        int i8 = h5.i();
                                                        long j6 = h5.j();
                                                        if (h5.i() != 1 || i8 != 0) {
                                                            throw new IOException("unsupported zip: spanned");
                                                        }
                                                        z h6 = m3.z.h(c7.d(j6));
                                                        try {
                                                            int i9 = h6.i();
                                                            if (i9 != 101075792) {
                                                                throw new IOException("bad zip: expected " + b.c(101075792) + " but was " + b.c(i9));
                                                            }
                                                            h6.u(12L);
                                                            int i10 = h6.i();
                                                            int i11 = h6.i();
                                                            long j7 = h6.j();
                                                            if (j7 != h6.j() || i10 != 0 || i11 != 0) {
                                                                throw new IOException("unsupported zip: spanned");
                                                            }
                                                            h6.u(8L);
                                                            d dVar2 = new d(j7, h6.j(), n6);
                                                            Unit unit = Unit.f7487a;
                                                            J2.q.a(h6, null);
                                                            dVar = dVar2;
                                                        } finally {
                                                        }
                                                    }
                                                    Unit unit2 = Unit.f7487a;
                                                    J2.q.a(h5, null);
                                                } finally {
                                                    try {
                                                        throw th;
                                                    } finally {
                                                        J2.q.a(h5, th);
                                                    }
                                                }
                                            }
                                            long j8 = dVar.f850b;
                                            ArrayList arrayList4 = new ArrayList();
                                            z h7 = m3.z.h(c7.d(j8));
                                            try {
                                                long j9 = dVar.f849a;
                                                long j10 = 0;
                                                while (j10 < j9) {
                                                    h d4 = b.d(h7);
                                                    ?? r17 = predicate;
                                                    if (d4.f862e >= j8) {
                                                        throw new IOException("bad zip: local file header offset >= central directory offset");
                                                    }
                                                    if (((Boolean) r17.invoke(d4)).booleanValue()) {
                                                        arrayList4.add(d4);
                                                    }
                                                    j10++;
                                                    predicate = r17;
                                                }
                                                Unit unit3 = Unit.f7487a;
                                                J2.q.a(h7, null);
                                                I i12 = new I(zipPath, fileSystem, b.b(arrayList4));
                                                J2.q.a(c7, null);
                                                pair = new Pair(i12, g.f854e);
                                            } catch (Throwable th3) {
                                            }
                                            throw th;
                                        }
                                        Iterator it4 = it3;
                                        ArrayList arrayList5 = arrayList3;
                                        f fVar = predicate;
                                        h4.close();
                                        b4--;
                                        if (b4 < max) {
                                            throw new IOException("not a zip: end of central directory signature not found");
                                        }
                                        arrayList3 = arrayList5;
                                        predicate = fVar;
                                        it3 = it4;
                                    } catch (Throwable th4) {
                                        h4.close();
                                        throw th4;
                                    }
                                }
                            } else {
                                it = it3;
                                j4 = r2;
                                arrayList = arrayList3;
                                pair = null;
                            }
                            ArrayList arrayList6 = arrayList;
                            if (pair != null) {
                                arrayList6.add(pair);
                            }
                            arrayList3 = arrayList6;
                            r2 = j4;
                            it3 = it;
                        }
                        return C1403G.B(arrayList2, arrayList3);
                    }
                    URL url3 = (URL) it2.next();
                    Intrinsics.c(url3);
                    if (Intrinsics.a(url3.getProtocol(), "file")) {
                        String str2 = v.f12037e;
                        pair2 = new Pair(fileSystem, E1.i.j(new File(url3.toURI())));
                    } else {
                        pair2 = null;
                    }
                    if (pair2 != null) {
                        arrayList2.add(pair2);
                    }
                }
                break;
            case 1:
                ((C0106a) eVar.f852e).f1070p.setValue(Boolean.valueOf(!((Boolean) r0.f1070p.getValue()).booleanValue()));
                return Unit.f7487a;
            case 2:
                AbstractC1065f.n((C0107b) eVar.f852e);
                return Unit.f7487a;
            case 3:
                C0211m0 c0211m0 = (C0211m0) eVar.f852e;
                i.y yVar = new i.y(c0211m0.f2830a.size());
                ArrayList arrayList7 = c0211m0.f2830a;
                int size = arrayList7.size();
                for (int i13 = 0; i13 < size; i13++) {
                    ?? r7 = (Q) arrayList7.get(i13);
                    Object obj = r7.f2741b;
                    int i14 = r7.f2740a;
                    Object p4 = obj != null ? new P(Integer.valueOf(i14), r7.f2741b) : Integer.valueOf(i14);
                    int d5 = yVar.d(p4);
                    boolean z6 = d5 < 0;
                    Object obj2 = z6 ? null : yVar.f6984c[d5];
                    if (obj2 != null) {
                        if (!(obj2 instanceof List) || ((obj2 instanceof N2.a) && !(obj2 instanceof N2.c))) {
                            r7 = C1441y.f(obj2, r7);
                        } else {
                            List b5 = J.b(obj2);
                            b5.add(r7);
                            r7 = b5;
                        }
                    }
                    if (z6) {
                        int i15 = ~d5;
                        yVar.f6983b[i15] = p4;
                        yVar.f6984c[i15] = r7;
                    } else {
                        yVar.f6984c[d5] = r7;
                    }
                }
                return new C0189b0(yVar);
            case 4:
                C0236z0 c0236z0 = (C0236z0) eVar.f852e;
                synchronized (c0236z0.f2983b) {
                    t4 = c0236z0.t();
                    if (((EnumC0224t0) c0236z0.f2999r.getValue()).compareTo(EnumC0224t0.f2917e) <= 0) {
                        Throwable th5 = c0236z0.f2985d;
                        CancellationException cancellationException = new CancellationException("Recomposer shutdown; frame clock awaiter will never resume");
                        cancellationException.initCause(th5);
                        throw cancellationException;
                    }
                }
                if (t4 != null) {
                    AbstractC1341p.a aVar = AbstractC1341p.f11673d;
                    ((C0286h) t4).u(Unit.f7487a);
                }
                return Unit.f7487a;
            case 5:
                Object systemService = ((View) ((C0097d) eVar.f852e).f987e).getContext().getSystemService("input_method");
                Intrinsics.d(systemService, "null cannot be cast to non-null type android.view.inputmethod.InputMethodManager");
                return (InputMethodManager) systemService;
            case 6:
                return new BaseInputConnection(((B) eVar.f852e).f3008a, false);
            case i1.i.DOUBLE_FIELD_NUMBER /* 7 */:
                K0.b bVar = (K0.b) eVar.f852e;
                if (((Y.f) bVar.f3450c.getValue()).f4386a != 9205357640488583168L) {
                    C0205j0 c0205j0 = bVar.f3450c;
                    if (!Y.f.e(((Y.f) c0205j0.getValue()).f4386a)) {
                        return bVar.f3448a.b(((Y.f) c0205j0.getValue()).f4386a);
                    }
                }
                return null;
            case i1.i.BYTES_FIELD_NUMBER /* 8 */:
                P.b bVar2 = (P.b) eVar.f852e;
                n nVar = bVar2.f3640d;
                Object obj3 = bVar2.f3643j;
                if (obj3 != null) {
                    return nVar.e(bVar2, obj3);
                }
                throw new IllegalArgumentException("Value should be initialized");
            case AbstractC1024c.f9242c /* 9 */:
                P0.B b6 = (P0.B) eVar.f852e;
                parentLayoutCoordinates = b6.getParentLayoutCoordinates();
                return Boolean.valueOf((((parentLayoutCoordinates == null || !parentLayoutCoordinates.p()) ? null : parentLayoutCoordinates) == null || b6.m0getPopupContentSizebOM6tXw() == null) ? false : true);
            case 10:
                break;
            case RequestError.STOP_TRACKING /* 11 */:
                W.b bVar3 = (W.b) eVar.f852e;
                W.i iVar = bVar3.f4191v;
                if (iVar == null) {
                    iVar = new W.i();
                    bVar3.f4191v = iVar;
                }
                if (iVar.f4206b == null) {
                    A graphicsContext = ((C1166s) AbstractC1065f.w(bVar3)).getGraphicsContext();
                    iVar.c();
                    iVar.f4206b = graphicsContext;
                }
                return iVar;
            case 12:
                return M.h((Z) eVar.f852e);
            case 13:
                C0578I c0578i = (C0578I) eVar.f852e;
                int i16 = c0578i.f6312k;
                C0199g0 c0199g0 = c0578i.f6309h;
                if (i16 == c0199g0.d()) {
                    c0199g0.f(c0199g0.d() + 1);
                }
                return Unit.f7487a;
            case 14:
                File file = (File) ((f0) eVar.f852e).invoke();
                Intrinsics.checkNotNullParameter(file, "<this>");
                String name = file.getName();
                Intrinsics.checkNotNullExpressionValue(name, "getName(...)");
                if (Intrinsics.a(y.L(name, ""), "preferences_pb")) {
                    String str3 = v.f12037e;
                    File absoluteFile = file.getAbsoluteFile();
                    Intrinsics.checkNotNullExpressionValue(absoluteFile, "file.absoluteFile");
                    return E1.i.j(absoluteFile);
                }
                throw new IllegalStateException(("File extension for file: " + file + " does not match required extension for Preferences file: preferences_pb").toString());
            case AbstractC1024c.f9246g /* 15 */:
                return (InterfaceC0302y) ((C0097d) eVar.f852e).f989j;
            case 16:
                return ((k0.e) eVar.f852e).B0();
            case 17:
                U u4 = (U) eVar.f852e;
                m0 m0Var = u4.f7637e;
                u4.f7638f = m0Var != null ? ((Number) m0Var.f7811l.getValue()).longValue() : 0L;
                return Unit.f7487a;
            case 18:
                ((C0850x) eVar.f852e).f8214A.invoke();
                return Boolean.TRUE;
            case 19:
                m.J j11 = (m.J) eVar.f852e;
                S.n nVar2 = j11.f3978d;
                I.d dVar3 = null;
                while (true) {
                    X.i iVar2 = X.i.f4328l;
                    if (nVar2 == null) {
                        S.n nVar3 = j11.f3978d;
                        if (!nVar3.f3990s) {
                            throw new IllegalStateException("visitChildren called on an unattached node");
                        }
                        I.d dVar4 = new I.d(new S.n[16]);
                        S.n nVar4 = nVar3.f3983l;
                        if (nVar4 == null) {
                            AbstractC1065f.b(dVar4, nVar3);
                        } else {
                            dVar4.b(nVar4);
                        }
                        while (dVar4.l()) {
                            S.n nVar5 = (S.n) dVar4.n(dVar4.f3332i - 1);
                            if ((nVar5.f3981j & 1024) == 0) {
                                AbstractC1065f.b(dVar4, nVar5);
                            } else {
                                while (true) {
                                    if (nVar5 == null) {
                                        break;
                                    }
                                    if ((nVar5.f3980i & 1024) != 0) {
                                        I.d dVar5 = null;
                                        while (nVar5 != null) {
                                            if (nVar5 instanceof t) {
                                                t tVar = (t) nVar5;
                                                B = tVar.B0().f4332a ? X.d.B(tVar) : X.d.i(tVar, 7, iVar2);
                                            } else {
                                                if ((nVar5.f3980i & 1024) != 0 && (nVar5 instanceof AbstractC1073n)) {
                                                    int i17 = 0;
                                                    for (S.n nVar6 = ((AbstractC1073n) nVar5).f9826u; nVar6 != null; nVar6 = nVar6.f3983l) {
                                                        if ((nVar6.f3980i & 1024) != 0) {
                                                            i17++;
                                                            if (i17 == 1) {
                                                                nVar5 = nVar6;
                                                            } else {
                                                                if (dVar5 == null) {
                                                                    dVar5 = new I.d(new S.n[16]);
                                                                }
                                                                if (nVar5 != null) {
                                                                    dVar5.b(nVar5);
                                                                    nVar5 = null;
                                                                }
                                                                dVar5.b(nVar6);
                                                            }
                                                        }
                                                    }
                                                    if (i17 == 1) {
                                                    }
                                                }
                                                nVar5 = AbstractC1065f.f(dVar5);
                                            }
                                        }
                                    } else {
                                        nVar5 = nVar5.f3983l;
                                    }
                                }
                            }
                        }
                    } else if (nVar2 instanceof t) {
                        t tVar2 = (t) nVar2;
                        B = tVar2.B0().f4332a ? X.d.B(tVar2) : X.d.i(tVar2, 7, iVar2);
                    } else {
                        if ((nVar2.f3980i & 1024) != 0 && (nVar2 instanceof AbstractC1073n)) {
                            int i18 = 0;
                            for (S.n nVar7 = ((AbstractC1073n) nVar2).f9826u; nVar7 != null; nVar7 = nVar7.f3983l) {
                                if ((nVar7.f3980i & 1024) != 0) {
                                    i18++;
                                    if (i18 == 1) {
                                        nVar2 = nVar7;
                                    } else {
                                        if (dVar3 == null) {
                                            dVar3 = new I.d(new S.n[16]);
                                        }
                                        if (nVar2 != null) {
                                            dVar3.b(nVar2);
                                            nVar2 = null;
                                        }
                                        dVar3.b(nVar7);
                                    }
                                }
                            }
                            if (i18 == 1) {
                            }
                        }
                        nVar2 = AbstractC1065f.f(dVar3);
                    }
                }
                z4 = B;
                return Boolean.valueOf(z4);
            case 20:
                return (List) eVar.f852e;
            case 21:
                try {
                    return (List) ((p) eVar.f852e).invoke();
                } catch (SSLPeerUnverifiedException unused) {
                    return C1405I.f11931d;
                }
            case 22:
                C0941B a4 = ((C0963Y) eVar.f852e).a();
                E e4 = a4.f8978d;
                if (a4.f8991t != ((I.a) e4.p()).f3324d.f3332i) {
                    Iterator it5 = a4.f8983l.entrySet().iterator();
                    while (it5.hasNext()) {
                        ((C0984t) ((Map.Entry) it5.next()).getValue()).f9060d = true;
                    }
                    if (!e4.f9584C.f9677d) {
                        E.T(e4, false, 7);
                    }
                }
                return Unit.f7487a;
            case 23:
                C1051d c1051d = (C1051d) eVar.f852e;
                c1051d.f9359f = false;
                HashSet hashSet = new HashSet();
                I.d dVar6 = c1051d.f9357d;
                int i19 = dVar6.f3332i;
                I.d dVar7 = c1051d.f9358e;
                if (i19 > 0) {
                    Object[] objArr3 = dVar6.f3330d;
                    int i20 = 0;
                    do {
                        E e5 = (E) objArr3[i20];
                        C1055h c1055h = (C1055h) dVar7.f3330d[i20];
                        S.n nVar8 = (S.n) e5.B.f2912f;
                        if (nVar8.f3990s) {
                            C1051d.b(nVar8, c1055h, hashSet);
                        }
                        i20++;
                    } while (i20 < i19);
                }
                dVar6.g();
                dVar7.g();
                I.d dVar8 = c1051d.f9355b;
                int i21 = dVar8.f3332i;
                I.d dVar9 = c1051d.f9356c;
                if (i21 > 0) {
                    Object[] objArr4 = dVar8.f3330d;
                    do {
                        C1062c c1062c = (C1062c) objArr4[i7];
                        C1055h c1055h2 = (C1055h) dVar9.f3330d[i7];
                        if (c1062c.f3990s) {
                            C1051d.b(c1062c, c1055h2, hashSet);
                        }
                        i7++;
                    } while (i7 < i21);
                }
                dVar8.g();
                dVar9.g();
                Iterator it6 = hashSet.iterator();
                while (it6.hasNext()) {
                    ((C1062c) it6.next()).D0();
                }
                return Unit.f7487a;
            case 24:
                m3.k kVar = ((q3.i) eVar.f852e).f9407e;
                Intrinsics.c(kVar);
                List<Certificate> a5 = kVar.a();
                ArrayList arrayList8 = new ArrayList(C1442z.h(a5, 10));
                for (Certificate certificate : a5) {
                    Intrinsics.d(certificate, "null cannot be cast to non-null type java.security.cert.X509Certificate");
                    arrayList8.add((X509Certificate) certificate);
                }
                return arrayList8;
            case 25:
                L l4 = ((E) eVar.f852e).f9584C;
                l4.f9691r.B = true;
                r0.J j12 = l4.f9692s;
                if (j12 != null) {
                    j12.f9646y = true;
                }
                return Unit.f7487a;
            case 26:
                K k4 = (K) eVar.f852e;
                L l5 = k4.f9658L;
                l5.f9684k = 0;
                I.d v4 = l5.f9674a.v();
                int i22 = v4.f3332i;
                if (i22 > 0) {
                    Object[] objArr5 = v4.f3330d;
                    int i23 = 0;
                    do {
                        K k5 = ((E) objArr5[i23]).f9584C.f9691r;
                        k5.f9660m = k5.f9661n;
                        k5.f9661n = Integer.MAX_VALUE;
                        k5.f9672y = false;
                        if (k5.f9664q == 2) {
                            k5.f9664q = 3;
                        }
                        i23++;
                    } while (i23 < i22);
                }
                L l6 = k4.f9658L;
                I.d v5 = l6.f9674a.v();
                int i24 = v5.f3332i;
                if (i24 > 0) {
                    Object[] objArr6 = v5.f3330d;
                    int i25 = 0;
                    do {
                        ((E) objArr6[i25]).f9584C.f9691r.f9673z.f9617d = false;
                        Unit unit4 = Unit.f7487a;
                        i25++;
                    } while (i25 < i24);
                }
                k4.T().x0().l();
                E e6 = l6.f9674a;
                I.d v6 = e6.v();
                int i26 = v6.f3332i;
                if (i26 > 0) {
                    Object[] objArr7 = v6.f3330d;
                    int i27 = 0;
                    do {
                        E e7 = (E) objArr7[i27];
                        if (e7.f9584C.f9691r.f9660m != e7.t()) {
                            e6.J();
                            e6.y();
                            if (e7.t() == Integer.MAX_VALUE) {
                                e7.f9584C.f9691r.t0();
                            }
                        }
                        i27++;
                    } while (i27 < i26);
                }
                I.d v7 = e6.v();
                int i28 = v7.f3332i;
                if (i28 > 0) {
                    Object[] objArr8 = v7.f3330d;
                    do {
                        F f4 = ((E) objArr8[i6]).f9584C.f9691r.f9673z;
                        f4.f9618e = f4.f9617d;
                        Unit unit5 = Unit.f7487a;
                        i6++;
                    } while (i6 < i28);
                }
                return Unit.f7487a;
            case 27:
                L l7 = (L) eVar.f852e;
                l7.a().a(l7.f9693t);
                return Unit.f7487a;
            case 28:
                a0 a0Var = ((a0) eVar.f852e).f9764t;
                if (a0Var != null) {
                    a0Var.U0();
                }
                return Unit.f7487a;
            default:
                Z.M m4 = a0.f9748K;
                ((Function1) eVar.f852e).invoke(m4);
                m4.f4465A = m4.f4480u.a(m4.f4483x, m4.f4485z, m4.f4484y);
                return Unit.f7487a;
        }
        while (true) {
            Q.A a6 = (Q.A) eVar.f852e;
            synchronized (a6.f3795f) {
                try {
                    if (a6.f3792c) {
                        c4 = c5;
                    } else {
                        try {
                            a6.f3792c = z5;
                            try {
                                I.d dVar10 = a6.f3795f;
                                int i29 = dVar10.f3332i;
                                if (i29 > 0) {
                                    Object[] objArr9 = dVar10.f3330d;
                                    int i30 = i5;
                                    ?? r8 = z5;
                                    while (true) {
                                        Q.z zVar = (Q.z) objArr9[i30];
                                        C0661B c0661b = zVar.f3911g;
                                        Object[] objArr10 = c0661b.f6885b;
                                        long[] jArr = c0661b.f6884a;
                                        int length = jArr.length - i4;
                                        if (length >= 0) {
                                            int i31 = i5;
                                            while (true) {
                                                long j13 = jArr[i31];
                                                if ((((~j13) << c6) & j13 & (-9187201950435737472L)) != -9187201950435737472L) {
                                                    int i32 = 8;
                                                    int i33 = 8 - ((~(i31 - length)) >>> 31);
                                                    int i34 = 0;
                                                    while (i34 < i33) {
                                                        if ((j13 & 255) < 128) {
                                                            objArr2 = objArr9;
                                                            zVar.f3905a.invoke(objArr10[(i31 << 3) + i34]);
                                                            i32 = 8;
                                                        } else {
                                                            objArr2 = objArr9;
                                                        }
                                                        j13 >>= i32;
                                                        i34++;
                                                        objArr9 = objArr2;
                                                    }
                                                    objArr = objArr9;
                                                    i2 = 1;
                                                    i2 = 1;
                                                    c4 = 3;
                                                    if (i33 == i32) {
                                                    }
                                                } else {
                                                    objArr = objArr9;
                                                    i2 = 1;
                                                    c4 = 3;
                                                }
                                                if (i31 != length) {
                                                    i31 += i2;
                                                    c6 = 7;
                                                    objArr9 = objArr;
                                                }
                                            }
                                        } else {
                                            c4 = c5;
                                            objArr = objArr9;
                                            i2 = r8;
                                        }
                                        c0661b.b();
                                        i30 += i2;
                                        if (i30 >= i29) {
                                            r12 = false;
                                        } else {
                                            i4 = 2;
                                            c6 = 7;
                                            c5 = c4;
                                            objArr9 = objArr;
                                            i5 = 0;
                                            r8 = true;
                                        }
                                    }
                                } else {
                                    c4 = c5;
                                    r12 = i5;
                                }
                                a6.f3792c = r12;
                            } catch (Throwable th6) {
                                a6.f3792c = false;
                                throw th6;
                            }
                        } catch (Throwable th7) {
                            th = th7;
                            throw th;
                        }
                    }
                    Unit unit6 = Unit.f7487a;
                    eVar = this;
                    if (!Q.A.a((Q.A) eVar.f852e)) {
                        return Unit.f7487a;
                    }
                    c5 = c4;
                    i4 = 2;
                    c6 = 7;
                    i5 = 0;
                    z5 = true;
                } catch (Throwable th8) {
                    th = th8;
                }
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public e(Function0 function0) {
        super(0);
        this.f851d = 21;
        this.f852e = (p) function0;
    }
}
