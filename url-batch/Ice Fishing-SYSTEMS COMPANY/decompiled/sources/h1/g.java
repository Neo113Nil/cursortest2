package h1;

import android.graphics.Path;
import com.google.android.gms.internal.ads.CL;
import d1.C4455a;
import d1.C4456b;
import i1.C4575b;
import j1.AbstractC4591d;
import java.util.ArrayList;
import java.util.Collections;
import k1.C4628a;
import m5.C4782a;
import u.AbstractC5088e;

/* loaded from: classes.dex */
public abstract class g {

    /* renamed from: a, reason: collision with root package name */
    public static final S0.s f38166a = S0.s.i("ty", "d");

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0773 A[LOOP:1: B:27:0x076d->B:29:0x0773, LOOP_END] */
    /* JADX WARN: Type inference failed for: r10v10, types: [d1.b] */
    /* JADX WARN: Type inference failed for: r10v11 */
    /* JADX WARN: Type inference failed for: r10v8 */
    /* JADX WARN: Type inference failed for: r10v9, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r17v15, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r17v16, types: [e1.l] */
    /* JADX WARN: Type inference failed for: r17v17 */
    /* JADX WARN: Type inference failed for: r17v34 */
    /* JADX WARN: Type inference failed for: r17v35 */
    /* JADX WARN: Type inference failed for: r17v36 */
    /* JADX WARN: Type inference failed for: r17v37 */
    /* JADX WARN: Type inference failed for: r17v38 */
    /* JADX WARN: Type inference failed for: r17v39 */
    /* JADX WARN: Type inference failed for: r17v40 */
    /* JADX WARN: Type inference failed for: r17v41 */
    /* JADX WARN: Type inference failed for: r17v42 */
    /* JADX WARN: Type inference failed for: r17v43 */
    /* JADX WARN: Type inference failed for: r17v44 */
    /* JADX WARN: Type inference failed for: r17v45 */
    /* JADX WARN: Type inference failed for: r17v46 */
    /* JADX WARN: Type inference failed for: r17v47 */
    /* JADX WARN: Type inference failed for: r17v48 */
    /* JADX WARN: Type inference failed for: r20v0 */
    /* JADX WARN: Type inference failed for: r20v1, types: [d1.e] */
    /* JADX WARN: Type inference failed for: r20v13 */
    /* JADX WARN: Type inference failed for: r20v14, types: [d1.e] */
    /* JADX WARN: Type inference failed for: r20v15, types: [d1.e] */
    /* JADX WARN: Type inference failed for: r20v16 */
    /* JADX WARN: Type inference failed for: r20v17 */
    /* JADX WARN: Type inference failed for: r20v18, types: [d1.b] */
    /* JADX WARN: Type inference failed for: r20v19, types: [d1.b] */
    /* JADX WARN: Type inference failed for: r20v2, types: [d1.e] */
    /* JADX WARN: Type inference failed for: r20v20 */
    /* JADX WARN: Type inference failed for: r20v26 */
    /* JADX WARN: Type inference failed for: r20v27, types: [d1.b] */
    /* JADX WARN: Type inference failed for: r20v28 */
    /* JADX WARN: Type inference failed for: r20v29 */
    /* JADX WARN: Type inference failed for: r20v3 */
    /* JADX WARN: Type inference failed for: r20v30 */
    /* JADX WARN: Type inference failed for: r20v31 */
    /* JADX WARN: Type inference failed for: r21v26 */
    /* JADX WARN: Type inference failed for: r21v27, types: [d1.b] */
    /* JADX WARN: Type inference failed for: r21v28, types: [d1.b] */
    /* JADX WARN: Type inference failed for: r21v29 */
    /* JADX WARN: Type inference failed for: r21v31 */
    /* JADX WARN: Type inference failed for: r21v32, types: [d1.b] */
    /* JADX WARN: Type inference failed for: r21v33 */
    /* JADX WARN: Type inference failed for: r21v34, types: [d1.b] */
    /* JADX WARN: Type inference failed for: r21v4 */
    /* JADX WARN: Type inference failed for: r21v5, types: [d1.a] */
    /* JADX WARN: Type inference failed for: r21v6, types: [d1.a] */
    /* JADX WARN: Type inference failed for: r21v7 */
    /* JADX WARN: Type inference failed for: r22v10 */
    /* JADX WARN: Type inference failed for: r22v11, types: [d1.a] */
    /* JADX WARN: Type inference failed for: r22v12 */
    /* JADX WARN: Type inference failed for: r22v13, types: [d1.a] */
    /* JADX WARN: Type inference failed for: r22v14 */
    /* JADX WARN: Type inference failed for: r22v15 */
    /* JADX WARN: Type inference failed for: r22v16 */
    /* JADX WARN: Type inference failed for: r22v17, types: [d1.b] */
    /* JADX WARN: Type inference failed for: r22v18, types: [d1.b] */
    /* JADX WARN: Type inference failed for: r22v19 */
    /* JADX WARN: Type inference failed for: r22v20 */
    /* JADX WARN: Type inference failed for: r22v21, types: [d1.d] */
    /* JADX WARN: Type inference failed for: r22v22, types: [d1.d] */
    /* JADX WARN: Type inference failed for: r22v23 */
    /* JADX WARN: Type inference failed for: r23v10 */
    /* JADX WARN: Type inference failed for: r23v11, types: [d1.a] */
    /* JADX WARN: Type inference failed for: r23v12 */
    /* JADX WARN: Type inference failed for: r23v13 */
    /* JADX WARN: Type inference failed for: r23v23 */
    /* JADX WARN: Type inference failed for: r23v24, types: [d1.b] */
    /* JADX WARN: Type inference failed for: r23v25, types: [d1.b] */
    /* JADX WARN: Type inference failed for: r23v26 */
    /* JADX WARN: Type inference failed for: r23v8 */
    /* JADX WARN: Type inference failed for: r23v9, types: [d1.a] */
    /* JADX WARN: Type inference failed for: r24v10, types: [d1.b] */
    /* JADX WARN: Type inference failed for: r24v11, types: [d1.b] */
    /* JADX WARN: Type inference failed for: r24v12 */
    /* JADX WARN: Type inference failed for: r24v9 */
    /* JADX WARN: Type inference failed for: r26v4 */
    /* JADX WARN: Type inference failed for: r26v5, types: [d1.b] */
    /* JADX WARN: Type inference failed for: r26v6, types: [d1.b] */
    /* JADX WARN: Type inference failed for: r26v7 */
    /* JADX WARN: Type inference failed for: r2v52 */
    /* JADX WARN: Type inference failed for: r2v53, types: [d1.a] */
    /* JADX WARN: Type inference failed for: r2v54, types: [d1.a] */
    /* JADX WARN: Type inference failed for: r2v55 */
    /* JADX WARN: Type inference failed for: r3v18 */
    /* JADX WARN: Type inference failed for: r3v19, types: [d1.b] */
    /* JADX WARN: Type inference failed for: r3v20, types: [d1.b] */
    /* JADX WARN: Type inference failed for: r3v21 */
    /* JADX WARN: Type inference failed for: r7v44 */
    /* JADX WARN: Type inference failed for: r7v45 */
    /* JADX WARN: Type inference failed for: r7v46 */
    /* JADX WARN: Type inference failed for: r7v47, types: [d1.a] */
    /* JADX WARN: Type inference failed for: r7v48, types: [d1.a] */
    /* JADX WARN: Type inference failed for: r7v49 */
    /* JADX WARN: Type inference failed for: r7v50 */
    /* JADX WARN: Type inference failed for: r7v51 */
    /* JADX WARN: Type inference failed for: r7v52 */
    /* JADX WARN: Type inference failed for: r7v53, types: [d1.a] */
    /* JADX WARN: Type inference failed for: r7v54, types: [d1.a] */
    /* JADX WARN: Type inference failed for: r7v55 */
    /* JADX WARN: Type inference failed for: r7v61 */
    /* JADX WARN: Type inference failed for: r7v62 */
    /* JADX WARN: Type inference failed for: r7v63 */
    /* JADX WARN: Type inference failed for: r7v64, types: [d1.a] */
    /* JADX WARN: Type inference failed for: r7v65, types: [d1.a] */
    /* JADX WARN: Type inference failed for: r7v66 */
    /* JADX WARN: Type inference failed for: r7v79 */
    /* JADX WARN: Type inference failed for: r7v80 */
    /* JADX WARN: Type inference failed for: r7v81 */
    /* JADX WARN: Type inference failed for: r7v82, types: [d1.a] */
    /* JADX WARN: Type inference failed for: r7v83, types: [d1.a] */
    /* JADX WARN: Type inference failed for: r7v84 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static e1.b a(C4575b c4575b, X0.i iVar) {
        String str;
        char c4;
        ?? r17;
        e1.b aVar;
        e1.b dVar;
        e1.b mVar;
        e1.b bVar;
        int i;
        char c9;
        Object obj;
        boolean z8 = false;
        boolean z9 = false;
        int i4 = 0;
        c4575b.j();
        int i9 = 2;
        while (true) {
            if (!c4575b.D()) {
                str = null;
                break;
            }
            int K8 = c4575b.K(f38166a);
            if (K8 == 0) {
                str = c4575b.H();
                break;
            }
            if (K8 != 1) {
                c4575b.V();
                c4575b.W();
            } else {
                i9 = c4575b.G();
            }
        }
        if (str == null) {
            return null;
        }
        switch (str.hashCode()) {
            case 3239:
                obj = null;
                if (str.equals("el")) {
                    c4 = 0;
                    r17 = null;
                    break;
                }
                c4 = 65535;
                r17 = obj;
                break;
            case 3270:
                obj = null;
                if (str.equals("fl")) {
                    c4 = 1;
                    r17 = null;
                    break;
                }
                c4 = 65535;
                r17 = obj;
                break;
            case 3295:
                obj = null;
                if (str.equals("gf")) {
                    c4 = 2;
                    r17 = null;
                    break;
                }
                c4 = 65535;
                r17 = obj;
                break;
            case 3307:
                obj = null;
                if (str.equals("gr")) {
                    c4 = 3;
                    r17 = null;
                    break;
                }
                c4 = 65535;
                r17 = obj;
                break;
            case 3308:
                obj = null;
                if (str.equals("gs")) {
                    c4 = 4;
                    r17 = null;
                    break;
                }
                c4 = 65535;
                r17 = obj;
                break;
            case 3488:
                obj = null;
                if (str.equals("mm")) {
                    c4 = 5;
                    r17 = null;
                    break;
                }
                c4 = 65535;
                r17 = obj;
                break;
            case 3633:
                obj = null;
                if (str.equals("rc")) {
                    c4 = 6;
                    r17 = null;
                    break;
                }
                c4 = 65535;
                r17 = obj;
                break;
            case 3634:
                obj = null;
                if (str.equals("rd")) {
                    c4 = 7;
                    r17 = null;
                    break;
                }
                c4 = 65535;
                r17 = obj;
                break;
            case 3646:
                obj = null;
                if (str.equals("rp")) {
                    c4 = '\b';
                    r17 = null;
                    break;
                }
                c4 = 65535;
                r17 = obj;
                break;
            case 3669:
                obj = null;
                if (str.equals(com.anythink.expressad.foundation.d.e.f18832u)) {
                    c4 = '\t';
                    r17 = null;
                    break;
                }
                c4 = 65535;
                r17 = obj;
                break;
            case 3679:
                obj = null;
                if (str.equals("sr")) {
                    c4 = '\n';
                    r17 = null;
                    break;
                }
                c4 = 65535;
                r17 = obj;
                break;
            case 3681:
                obj = null;
                if (str.equals(com.anythink.expressad.foundation.g.g.a.b.bb)) {
                    c4 = 11;
                    r17 = null;
                    break;
                }
                c4 = 65535;
                r17 = obj;
                break;
            case 3705:
                obj = null;
                if (str.equals("tm")) {
                    c4 = '\f';
                    r17 = null;
                    break;
                }
                c4 = 65535;
                r17 = obj;
                break;
            case 3710:
                obj = null;
                if (str.equals("tr")) {
                    c4 = '\r';
                    r17 = null;
                    break;
                }
                c4 = 65535;
                r17 = obj;
                break;
            default:
                obj = null;
                c4 = 65535;
                r17 = obj;
                break;
        }
        switch (c4) {
            case 0:
                S0.s sVar = e.f38158a;
                boolean z10 = i9 == 3;
                boolean z11 = false;
                String str2 = r17;
                ?? r20 = str2;
                C4455a c4455a = r20;
                while (c4575b.D()) {
                    int K9 = c4575b.K(e.f38158a);
                    if (K9 == 0) {
                        str2 = c4575b.H();
                    } else if (K9 == 1) {
                        r20 = AbstractC4560a.b(c4575b, iVar);
                    } else if (K9 == 2) {
                        c4455a = Z5.c.k(c4575b, iVar);
                    } else if (K9 == 3) {
                        z11 = c4575b.E();
                    } else if (K9 != 4) {
                        c4575b.V();
                        c4575b.W();
                    } else {
                        z10 = c4575b.G() == 3;
                    }
                }
                aVar = new e1.a(str2, r20, c4455a, z10, z11);
                bVar = aVar;
                while (c4575b.D()) {
                    c4575b.W();
                }
                c4575b.B();
                return bVar;
            case 1:
                S0.s sVar2 = y.f38204a;
                boolean z12 = false;
                boolean z13 = false;
                int i10 = 1;
                C4455a c4455a2 = r17;
                String str3 = c4455a2;
                ?? r21 = str3;
                while (c4575b.D()) {
                    int K10 = c4575b.K(y.f38204a);
                    if (K10 == 0) {
                        str3 = c4575b.H();
                    } else if (K10 == 1) {
                        r21 = Z5.c.g(c4575b, iVar);
                    } else if (K10 == 2) {
                        c4455a2 = Z5.c.j(c4575b, iVar);
                    } else if (K10 == 3) {
                        z12 = c4575b.E();
                    } else if (K10 == 4) {
                        i10 = c4575b.G();
                    } else if (K10 != 5) {
                        c4575b.V();
                        c4575b.W();
                    } else {
                        z13 = c4575b.E();
                    }
                }
                if (c4455a2 == 0) {
                    c4455a2 = new C4455a(Collections.singletonList(new C4628a(100)), 2);
                }
                r17 = new e1.l(str3, z12, i10 == 1 ? Path.FillType.WINDING : Path.FillType.EVEN_ODD, r21, c4455a2, z13);
                bVar = r17;
                while (c4575b.D()) {
                }
                c4575b.B();
                return bVar;
            case 2:
                S0.s sVar3 = l.f38179a;
                Path.FillType fillType = Path.FillType.WINDING;
                int i11 = 0;
                boolean z14 = false;
                C4455a c4455a3 = r17;
                String str4 = c4455a3;
                ?? r23 = str4;
                C4455a c4455a4 = r23;
                C4455a c4455a5 = c4455a4;
                while (c4575b.D()) {
                    switch (c4575b.K(l.f38179a)) {
                        case 0:
                            str4 = c4575b.H();
                            break;
                        case 1:
                            c4575b.j();
                            int i12 = -1;
                            while (c4575b.D()) {
                                int K11 = c4575b.K(l.f38180b);
                                if (K11 == 0) {
                                    i12 = c4575b.G();
                                } else if (K11 != 1) {
                                    c4575b.V();
                                    c4575b.W();
                                } else {
                                    r23 = Z5.c.i(c4575b, iVar, i12);
                                }
                            }
                            c4575b.B();
                            break;
                        case 2:
                            c4455a3 = Z5.c.j(c4575b, iVar);
                            break;
                        case 3:
                            if (c4575b.G() != 1) {
                                i11 = 2;
                                break;
                            } else {
                                i11 = 1;
                                break;
                            }
                        case 4:
                            c4455a4 = Z5.c.k(c4575b, iVar);
                            break;
                        case 5:
                            c4455a5 = Z5.c.k(c4575b, iVar);
                            break;
                        case 6:
                            fillType = c4575b.G() == 1 ? Path.FillType.WINDING : Path.FillType.EVEN_ODD;
                            break;
                        case 7:
                            z14 = c4575b.E();
                            break;
                        default:
                            c4575b.V();
                            c4575b.W();
                            break;
                    }
                }
                if (c4455a3 == 0) {
                    c4455a3 = new C4455a(Collections.singletonList(new C4628a(100)), 2);
                }
                dVar = new e1.d(str4, i11, fillType, r23, c4455a3, c4455a4, c4455a5, z14);
                bVar = dVar;
                while (c4575b.D()) {
                }
                c4575b.B();
                return bVar;
            case 3:
                S0.s sVar4 = z.f38205a;
                ArrayList arrayList = new ArrayList();
                String str5 = r17;
                while (c4575b.D()) {
                    int K12 = c4575b.K(z.f38205a);
                    if (K12 == 0) {
                        str5 = c4575b.H();
                    } else if (K12 == 1) {
                        z8 = c4575b.E();
                    } else if (K12 != 2) {
                        c4575b.W();
                    } else {
                        c4575b.b();
                        while (c4575b.D()) {
                            e1.b a9 = a(c4575b, iVar);
                            if (a9 != null) {
                                arrayList.add(a9);
                            }
                        }
                        c4575b.z();
                    }
                }
                mVar = new e1.m(str5, arrayList, z8);
                bVar = mVar;
                while (c4575b.D()) {
                }
                c4575b.B();
                return bVar;
            case 4:
                S0.s sVar5 = m.f38181a;
                ArrayList arrayList2 = new ArrayList();
                int i13 = 0;
                int i14 = 0;
                int i15 = 0;
                boolean z15 = false;
                float f6 = 0.0f;
                C4455a c4455a6 = r17;
                String str6 = c4455a6;
                ?? r22 = str6;
                C4455a c4455a7 = r22;
                C4455a c4455a8 = c4455a7;
                ?? r26 = c4455a8;
                C4456b c4456b = r26;
                while (c4575b.D()) {
                    switch (c4575b.K(m.f38181a)) {
                        case 0:
                            str6 = c4575b.H();
                            break;
                        case 1:
                            c4575b.j();
                            int i16 = -1;
                            while (c4575b.D()) {
                                int K13 = c4575b.K(m.f38182b);
                                if (K13 == 0) {
                                    i16 = c4575b.G();
                                } else if (K13 != 1) {
                                    c4575b.V();
                                    c4575b.W();
                                } else {
                                    r22 = Z5.c.i(c4575b, iVar, i16);
                                }
                            }
                            c4575b.B();
                            break;
                        case 2:
                            c4455a6 = Z5.c.j(c4575b, iVar);
                            break;
                        case 3:
                            if (c4575b.G() != 1) {
                                i13 = 2;
                                break;
                            } else {
                                i13 = 1;
                                break;
                            }
                        case 4:
                            c4455a7 = Z5.c.k(c4575b, iVar);
                            break;
                        case 5:
                            c4455a8 = Z5.c.k(c4575b, iVar);
                            break;
                        case 6:
                            r26 = Z5.c.h(c4575b, iVar, true);
                            break;
                        case 7:
                            i14 = AbstractC5088e.e(3)[c4575b.G() - 1];
                            break;
                        case 8:
                            i15 = AbstractC5088e.e(3)[c4575b.G() - 1];
                            break;
                        case 9:
                            f6 = (float) c4575b.F();
                            break;
                        case 10:
                            z15 = c4575b.E();
                            break;
                        case 11:
                            c4575b.b();
                            while (c4575b.D()) {
                                c4575b.j();
                                String str7 = r17;
                                ?? r10 = str7;
                                while (c4575b.D()) {
                                    int K14 = c4575b.K(m.f38183c);
                                    if (K14 == 0) {
                                        str7 = c4575b.H();
                                    } else if (K14 != 1) {
                                        c4575b.V();
                                        c4575b.W();
                                    } else {
                                        r10 = Z5.c.h(c4575b, iVar, true);
                                    }
                                }
                                c4575b.B();
                                if (str7.equals(C4782a.PUSH_MINIFIED_BUTTONS_LIST)) {
                                    c4456b = r10;
                                } else if (str7.equals("d") || str7.equals("g")) {
                                    iVar.f3682o = true;
                                    arrayList2.add(r10);
                                }
                            }
                            c4575b.z();
                            if (arrayList2.size() != 1) {
                                break;
                            } else {
                                arrayList2.add((C4456b) arrayList2.get(0));
                                break;
                            }
                        default:
                            c4575b.V();
                            c4575b.W();
                            break;
                    }
                }
                if (c4455a6 == 0) {
                    c4455a6 = new C4455a(Collections.singletonList(new C4628a(100)), 2);
                }
                dVar = new e1.e(str6, i13, r22, c4455a6, c4455a7, c4455a8, r26, i14, i15, f6, arrayList2, c4456b, z15);
                bVar = dVar;
                while (c4575b.D()) {
                }
                c4575b.B();
                return bVar;
            case 5:
                S0.s sVar6 = s.f38197a;
                boolean z16 = false;
                String str8 = r17;
                while (c4575b.D()) {
                    int K15 = c4575b.K(s.f38197a);
                    if (K15 == 0) {
                        str8 = c4575b.H();
                    } else if (K15 == 1) {
                        int G7 = c4575b.G();
                        if (G7 != 1) {
                            if (G7 == 2) {
                                i4 = 2;
                            } else if (G7 == 3) {
                                i4 = 3;
                            } else if (G7 == 4) {
                                i4 = 4;
                            } else if (G7 == 5) {
                                i4 = 5;
                            }
                        }
                        i4 = 1;
                    } else if (K15 != 2) {
                        c4575b.V();
                        c4575b.W();
                    } else {
                        z16 = c4575b.E();
                    }
                }
                e1.g gVar = new e1.g(i4, str8, z16);
                iVar.a("Animation contains merge paths. Merge paths are only supported on KitKat+ and must be manually enabled by calling enableMergePathsForKitKatAndAbove().");
                bVar = gVar;
                while (c4575b.D()) {
                }
                c4575b.B();
                return bVar;
            case 6:
                S0.s sVar7 = u.f38199a;
                boolean z17 = false;
                String str9 = r17;
                ?? r202 = str9;
                C4455a c4455a9 = r202;
                ?? r222 = c4455a9;
                while (c4575b.D()) {
                    int K16 = c4575b.K(u.f38199a);
                    if (K16 == 0) {
                        str9 = c4575b.H();
                    } else if (K16 == 1) {
                        r202 = AbstractC4560a.b(c4575b, iVar);
                    } else if (K16 == 2) {
                        c4455a9 = Z5.c.k(c4575b, iVar);
                    } else if (K16 == 3) {
                        r222 = Z5.c.h(c4575b, iVar, true);
                    } else if (K16 != 4) {
                        c4575b.W();
                    } else {
                        z17 = c4575b.E();
                    }
                }
                aVar = new e1.i(str9, (d1.e) r202, c4455a9, (C4456b) r222, z17);
                bVar = aVar;
                while (c4575b.D()) {
                }
                c4575b.B();
                return bVar;
            case 7:
                S0.s sVar8 = w.f38201a;
                String str10 = r17;
                ?? r32 = str10;
                while (c4575b.D()) {
                    int K17 = c4575b.K(w.f38201a);
                    if (K17 == 0) {
                        str10 = c4575b.H();
                    } else if (K17 == 1) {
                        r32 = Z5.c.h(c4575b, iVar, true);
                    } else if (K17 != 2) {
                        c4575b.W();
                    } else {
                        z9 = c4575b.E();
                    }
                }
                if (!z9) {
                    bVar = new e1.j(str10, r32);
                    while (c4575b.D()) {
                    }
                    c4575b.B();
                    return bVar;
                }
                bVar = r17;
                while (c4575b.D()) {
                }
                c4575b.B();
                return bVar;
            case '\b':
                S0.s sVar9 = v.f38200a;
                boolean z18 = false;
                String str11 = r17;
                ?? r203 = str11;
                C4456b c4456b2 = r203;
                ?? r223 = c4456b2;
                while (c4575b.D()) {
                    int K18 = c4575b.K(v.f38200a);
                    if (K18 == 0) {
                        str11 = c4575b.H();
                    } else if (K18 == 1) {
                        r203 = Z5.c.h(c4575b, iVar, false);
                    } else if (K18 == 2) {
                        c4456b2 = Z5.c.h(c4575b, iVar, false);
                    } else if (K18 == 3) {
                        r223 = AbstractC4562c.c(c4575b, iVar);
                    } else if (K18 != 4) {
                        c4575b.W();
                    } else {
                        z18 = c4575b.E();
                    }
                }
                aVar = new e1.i(str11, (C4456b) r203, c4456b2, (d1.d) r223, z18);
                bVar = aVar;
                while (c4575b.D()) {
                }
                c4575b.B();
                return bVar;
            case '\t':
                S0.s sVar10 = A.f38146a;
                int i17 = 0;
                boolean z19 = false;
                ?? r24 = r17;
                String str12 = r24;
                while (c4575b.D()) {
                    int K19 = c4575b.K(A.f38146a);
                    if (K19 == 0) {
                        str12 = c4575b.H();
                    } else if (K19 == 1) {
                        i17 = c4575b.G();
                    } else if (K19 == 2) {
                        r24 = new C4455a(p.a(c4575b, iVar, j1.j.c(), x.f38202n, false), 5);
                    } else if (K19 != 3) {
                        c4575b.W();
                    } else {
                        z19 = c4575b.E();
                    }
                }
                mVar = new e1.n(str12, i17, r24, z19);
                bVar = mVar;
                while (c4575b.D()) {
                }
                c4575b.B();
                return bVar;
            case '\n':
                S0.s sVar11 = t.f38198a;
                boolean z20 = i9 == 3;
                int i18 = 0;
                boolean z21 = false;
                String str13 = r17;
                ?? r212 = str13;
                d1.e eVar = r212;
                ?? r232 = eVar;
                C4456b c4456b3 = r232;
                C4456b c4456b4 = c4456b3;
                C4456b c4456b5 = c4456b4;
                C4456b c4456b6 = c4456b5;
                while (c4575b.D()) {
                    switch (c4575b.K(t.f38198a)) {
                        case 0:
                            str13 = c4575b.H();
                            break;
                        case 1:
                            int G8 = c4575b.G();
                            int[] e6 = AbstractC5088e.e(2);
                            int length = e6.length;
                            int i19 = 0;
                            while (true) {
                                if (i19 >= length) {
                                    i18 = 0;
                                    break;
                                } else {
                                    int i20 = e6[i19];
                                    if (i20 == 1) {
                                        i = 1;
                                    } else {
                                        if (i20 != 2) {
                                            throw r17;
                                        }
                                        i = 2;
                                    }
                                    if (i == G8) {
                                        i18 = i20;
                                        break;
                                    } else {
                                        i19++;
                                    }
                                }
                            }
                        case 2:
                            r212 = Z5.c.h(c4575b, iVar, false);
                            break;
                        case 3:
                            eVar = AbstractC4560a.b(c4575b, iVar);
                            break;
                        case 4:
                            r232 = Z5.c.h(c4575b, iVar, false);
                            break;
                        case 5:
                            c4456b4 = Z5.c.h(c4575b, iVar, true);
                            break;
                        case 6:
                            c4456b6 = Z5.c.h(c4575b, iVar, false);
                            break;
                        case 7:
                            c4456b3 = Z5.c.h(c4575b, iVar, true);
                            break;
                        case 8:
                            c4456b5 = Z5.c.h(c4575b, iVar, false);
                            break;
                        case 9:
                            z21 = c4575b.E();
                            break;
                        case 10:
                            if (c4575b.G() != 3) {
                                z20 = false;
                                break;
                            } else {
                                z20 = true;
                                break;
                            }
                        default:
                            c4575b.V();
                            c4575b.W();
                            break;
                    }
                }
                aVar = new e1.h(str13, i18, r212, eVar, r232, c4456b3, c4456b4, c4456b5, c4456b6, z21, z20);
                bVar = aVar;
                while (c4575b.D()) {
                }
                c4575b.B();
                return bVar;
            case 11:
                S0.s sVar12 = B.f38147a;
                ArrayList arrayList3 = new ArrayList();
                int i21 = 0;
                int i22 = 0;
                boolean z22 = false;
                float f9 = 0.0f;
                C4455a c4455a10 = r17;
                String str14 = c4455a10;
                ?? r204 = str14;
                C4455a c4455a11 = r204;
                ?? r242 = c4455a11;
                while (c4575b.D()) {
                    switch (c4575b.K(B.f38147a)) {
                        case 0:
                            str14 = c4575b.H();
                            break;
                        case 1:
                            c4455a11 = Z5.c.g(c4575b, iVar);
                            break;
                        case 2:
                            r242 = Z5.c.h(c4575b, iVar, true);
                            break;
                        case 3:
                            c4455a10 = Z5.c.j(c4575b, iVar);
                            break;
                        case 4:
                            i21 = AbstractC5088e.e(3)[c4575b.G() - 1];
                            break;
                        case 5:
                            i22 = AbstractC5088e.e(3)[c4575b.G() - 1];
                            break;
                        case 6:
                            f9 = (float) c4575b.F();
                            break;
                        case 7:
                            z22 = c4575b.E();
                            break;
                        case 8:
                            c4575b.b();
                            while (c4575b.D()) {
                                c4575b.j();
                                String str15 = r17;
                                Object obj2 = str15;
                                while (c4575b.D()) {
                                    int K20 = c4575b.K(B.f38148b);
                                    if (K20 == 0) {
                                        str15 = c4575b.H();
                                    } else if (K20 != 1) {
                                        c4575b.V();
                                        c4575b.W();
                                    } else {
                                        obj2 = Z5.c.h(c4575b, iVar, true);
                                    }
                                }
                                c4575b.B();
                                str15.getClass();
                                switch (str15.hashCode()) {
                                    case 100:
                                        if (str15.equals("d")) {
                                            c9 = 0;
                                            break;
                                        }
                                        c9 = 65535;
                                        break;
                                    case 103:
                                        if (str15.equals("g")) {
                                            c9 = 1;
                                            break;
                                        }
                                        c9 = 65535;
                                        break;
                                    case 111:
                                        if (str15.equals(C4782a.PUSH_MINIFIED_BUTTONS_LIST)) {
                                            c9 = 2;
                                            break;
                                        }
                                        c9 = 65535;
                                        break;
                                    default:
                                        c9 = 65535;
                                        break;
                                }
                                switch (c9) {
                                    case 0:
                                    case 1:
                                        iVar.f3682o = true;
                                        arrayList3.add(obj2);
                                        break;
                                    case 2:
                                        r204 = obj2;
                                        break;
                                }
                            }
                            c4575b.z();
                            if (arrayList3.size() != 1) {
                                break;
                            } else {
                                arrayList3.add((C4456b) arrayList3.get(0));
                                break;
                            }
                            break;
                        default:
                            c4575b.W();
                            break;
                    }
                }
                if (c4455a10 == 0) {
                    c4455a10 = new C4455a(Collections.singletonList(new C4628a(100)), 2);
                }
                aVar = new e1.o(str14, r204, arrayList3, c4455a11, c4455a10, r242, i21 == 0 ? 1 : i21, i22 == 0 ? 1 : i22, f9, z22);
                bVar = aVar;
                while (c4575b.D()) {
                }
                c4575b.B();
                return bVar;
            case '\f':
                S0.s sVar13 = C.f38149a;
                int i23 = 0;
                boolean z23 = false;
                String str16 = r17;
                ?? r213 = str16;
                C4456b c4456b7 = r213;
                C4456b c4456b8 = c4456b7;
                while (c4575b.D()) {
                    int K21 = c4575b.K(C.f38149a);
                    if (K21 == 0) {
                        r213 = Z5.c.h(c4575b, iVar, false);
                    } else if (K21 == 1) {
                        c4456b7 = Z5.c.h(c4575b, iVar, false);
                    } else if (K21 == 2) {
                        c4456b8 = Z5.c.h(c4575b, iVar, false);
                    } else if (K21 == 3) {
                        str16 = c4575b.H();
                    } else if (K21 == 4) {
                        int G9 = c4575b.G();
                        if (G9 == 1) {
                            i23 = 1;
                        } else {
                            if (G9 != 2) {
                                throw new IllegalArgumentException(CL.i(G9, "Unknown trim path type "));
                            }
                            i23 = 2;
                        }
                    } else if (K21 != 5) {
                        c4575b.W();
                    } else {
                        z23 = c4575b.E();
                    }
                }
                aVar = new e1.p(str16, i23, r213, c4456b7, c4456b8, z23);
                bVar = aVar;
                while (c4575b.D()) {
                }
                c4575b.B();
                return bVar;
            case '\r':
                bVar = AbstractC4562c.c(c4575b, iVar);
                while (c4575b.D()) {
                }
                c4575b.B();
                return bVar;
            default:
                AbstractC4591d.b("Unknown shape type ".concat(str));
                bVar = r17;
                while (c4575b.D()) {
                }
                c4575b.B();
                return bVar;
        }
    }
}
