package d1;

import android.os.Trace;
import android.view.KeyEvent;
import android.view.View;
import android.view.autofill.AutofillManager;
import androidx.compose.ui.focus.FocusOwnerImpl$modifier$1;
import d1.i;
import java.util.ArrayList;
import o.b0;
import o.e0;
import w1.b1;
import w1.f0;
import w1.x0;
import x1.t;
import y0.l;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public final class i implements h {

    /* renamed from: a, reason: collision with root package name */
    public final t f2066a;

    /* renamed from: b, reason: collision with root package name */
    public final t f2067b;

    /* renamed from: d, reason: collision with root package name */
    public final f f2069d;

    /* renamed from: f, reason: collision with root package name */
    public b0 f2071f;

    /* renamed from: h, reason: collision with root package name */
    public n f2073h;

    /* renamed from: c, reason: collision with root package name */
    public final n f2068c = new n(2, null, 6);

    /* renamed from: e, reason: collision with root package name */
    public final FocusOwnerImpl$modifier$1 f2070e = new x0() { // from class: androidx.compose.ui.focus.FocusOwnerImpl$modifier$1
        public final boolean equals(Object obj) {
            return obj == this;
        }

        @Override // w1.x0
        public final l f() {
            return i.this.f2068c;
        }

        @Override // w1.x0
        public final /* bridge */ /* synthetic */ void g(l lVar) {
        }

        public final int hashCode() {
            return i.this.f2068c.hashCode();
        }
    };

    /* renamed from: g, reason: collision with root package name */
    public final e0 f2072g = new e0(1);

    /* JADX WARN: Type inference failed for: r4v3, types: [androidx.compose.ui.focus.FocusOwnerImpl$modifier$1] */
    public i(t tVar, t tVar2) {
        this.f2066a = tVar;
        this.f2067b = tVar2;
        this.f2069d = new f(this, tVar2);
    }

    public final boolean a(boolean z3) {
        b1 b1Var;
        n nVar = this.f2073h;
        if (nVar != null) {
            f(null);
            m mVar = m.f2091d;
            m mVar2 = m.f2094g;
            nVar.r0(mVar, mVar2);
            if (!nVar.f8706d.f8718q) {
                t1.a.b("visitAncestors called on an unattached node");
            }
            y0.l lVar = nVar.f8706d.f8710h;
            f0 u7 = w1.f.u(nVar);
            while (u7 != null) {
                if ((u7.F.f7600f.f8709g & 1024) != 0) {
                    while (lVar != null) {
                        if ((lVar.f8708f & 1024) != 0) {
                            o0.e eVar = null;
                            y0.l lVar2 = lVar;
                            while (lVar2 != null) {
                                if (lVar2 instanceof n) {
                                    ((n) lVar2).r0(m.f2092e, mVar2);
                                } else if ((lVar2.f8708f & 1024) != 0 && (lVar2 instanceof w1.l)) {
                                    int i = 0;
                                    for (y0.l lVar3 = ((w1.l) lVar2).f7707s; lVar3 != null; lVar3 = lVar3.i) {
                                        if ((lVar3.f8708f & 1024) != 0) {
                                            i++;
                                            if (i == 1) {
                                                lVar2 = lVar3;
                                            } else {
                                                if (eVar == null) {
                                                    eVar = new o0.e(new y0.l[16]);
                                                }
                                                if (lVar2 != null) {
                                                    eVar.b(lVar2);
                                                    lVar2 = null;
                                                }
                                                eVar.b(lVar3);
                                            }
                                        }
                                    }
                                    if (i == 1) {
                                    }
                                }
                                lVar2 = w1.f.f(eVar);
                            }
                        }
                        lVar = lVar.f8710h;
                    }
                }
                u7 = u7.s();
                lVar = (u7 == null || (b1Var = u7.F) == null) ? null : b1Var.f7599e;
            }
        }
        return true;
    }

    public final boolean b(int i, boolean z3, boolean z7) {
        boolean z8 = true;
        if (z3) {
            a(z3);
        } else {
            int ordinal = d.s(this.f2068c).ordinal();
            if (ordinal == 0) {
                a(z3);
            } else {
                if (ordinal != 1 && ordinal != 2 && ordinal != 3) {
                    throw new a5.c();
                }
                z8 = false;
            }
        }
        if (z8 && z7) {
            c();
        }
        return z8;
    }

    public final void c() {
        t tVar = this.f2066a;
        if (tVar.isFocused() || tVar.hasFocus()) {
            tVar.clearFocus();
        } else if (tVar.hasFocus()) {
            View findFocus = tVar.findFocus();
            if (findFocus != null) {
                findFocus.clearFocus();
            }
            tVar.clearFocus();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x005a, code lost:
    
        if (r8 == null) goto L33;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:34:0x016a A[Catch: all -> 0x0019, TryCatch #0 {all -> 0x0019, blocks: (B:3:0x0007, B:5:0x000e, B:9:0x001c, B:13:0x0026, B:16:0x0032, B:18:0x0038, B:19:0x003d, B:21:0x0045, B:23:0x004a, B:25:0x0050, B:29:0x0056, B:34:0x016a, B:36:0x0170, B:37:0x0173, B:39:0x017e, B:42:0x018a, B:46:0x0194, B:81:0x019a, B:82:0x019f, B:75:0x01d9, B:48:0x01a3, B:50:0x01a9, B:52:0x01ad, B:54:0x01b5, B:56:0x01bb, B:62:0x01c3, B:64:0x01cc, B:65:0x01d0, B:60:0x01d3, B:84:0x01de, B:87:0x01e1, B:89:0x01e7, B:96:0x01eb, B:101:0x01f2, B:103:0x01fa, B:111:0x0211, B:113:0x0216, B:147:0x021a, B:142:0x025c, B:115:0x0226, B:117:0x022c, B:119:0x0230, B:121:0x0238, B:123:0x023e, B:129:0x0246, B:131:0x024f, B:132:0x0253, B:127:0x0256, B:153:0x0261, B:157:0x0271, B:159:0x0276, B:193:0x027a, B:188:0x02bc, B:161:0x0286, B:163:0x028c, B:165:0x0290, B:167:0x0298, B:169:0x029e, B:175:0x02a6, B:177:0x02af, B:178:0x02b3, B:173:0x02b6, B:200:0x02c3, B:202:0x02ca, B:215:0x005e, B:217:0x0064, B:218:0x0067, B:220:0x006f, B:223:0x007b, B:227:0x0085, B:262:0x00d8, B:264:0x00dc, B:229:0x008a, B:231:0x0090, B:233:0x0094, B:235:0x009c, B:237:0x00a2, B:243:0x00aa, B:245:0x00b3, B:246:0x00b7, B:241:0x00ba, B:252:0x00c0, B:266:0x00c5, B:269:0x00c8, B:271:0x00ce, B:278:0x00d2, B:283:0x00e2, B:285:0x00e8, B:286:0x00eb, B:288:0x00f5, B:291:0x0101, B:295:0x010b, B:330:0x015e, B:332:0x0162, B:297:0x0110, B:299:0x0116, B:301:0x011a, B:303:0x0122, B:305:0x0128, B:311:0x0130, B:313:0x0139, B:314:0x013d, B:309:0x0140, B:320:0x0146, B:335:0x014b, B:338:0x014e, B:340:0x0154, B:347:0x0158), top: B:2:0x0007 }] */
    /* JADX WARN: Type inference failed for: r0v10, types: [y0.l] */
    /* JADX WARN: Type inference failed for: r0v11 */
    /* JADX WARN: Type inference failed for: r0v12 */
    /* JADX WARN: Type inference failed for: r0v16, types: [o0.e] */
    /* JADX WARN: Type inference failed for: r0v17 */
    /* JADX WARN: Type inference failed for: r0v18 */
    /* JADX WARN: Type inference failed for: r0v19 */
    /* JADX WARN: Type inference failed for: r0v20, types: [o0.e] */
    /* JADX WARN: Type inference failed for: r0v24, types: [y0.l] */
    /* JADX WARN: Type inference failed for: r0v25 */
    /* JADX WARN: Type inference failed for: r0v26, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v27 */
    /* JADX WARN: Type inference failed for: r0v28 */
    /* JADX WARN: Type inference failed for: r0v29 */
    /* JADX WARN: Type inference failed for: r0v30 */
    /* JADX WARN: Type inference failed for: r0v44 */
    /* JADX WARN: Type inference failed for: r0v45 */
    /* JADX WARN: Type inference failed for: r0v46 */
    /* JADX WARN: Type inference failed for: r0v47 */
    /* JADX WARN: Type inference failed for: r0v48 */
    /* JADX WARN: Type inference failed for: r0v49 */
    /* JADX WARN: Type inference failed for: r0v9, types: [y0.l] */
    /* JADX WARN: Type inference failed for: r15v10 */
    /* JADX WARN: Type inference failed for: r15v11, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r15v12 */
    /* JADX WARN: Type inference failed for: r15v13 */
    /* JADX WARN: Type inference failed for: r15v14 */
    /* JADX WARN: Type inference failed for: r15v15 */
    /* JADX WARN: Type inference failed for: r15v17 */
    /* JADX WARN: Type inference failed for: r15v18 */
    /* JADX WARN: Type inference failed for: r15v4, types: [y0.l] */
    /* JADX WARN: Type inference failed for: r15v5, types: [y0.l] */
    /* JADX WARN: Type inference failed for: r15v9, types: [y0.l] */
    /* JADX WARN: Type inference failed for: r1v21 */
    /* JADX WARN: Type inference failed for: r1v22 */
    /* JADX WARN: Type inference failed for: r1v35, types: [o0.e] */
    /* JADX WARN: Type inference failed for: r1v36 */
    /* JADX WARN: Type inference failed for: r1v37 */
    /* JADX WARN: Type inference failed for: r1v38 */
    /* JADX WARN: Type inference failed for: r1v39, types: [o0.e] */
    /* JADX WARN: Type inference failed for: r1v43 */
    /* JADX WARN: Type inference failed for: r1v44 */
    /* JADX WARN: Type inference failed for: r1v45 */
    /* JADX WARN: Type inference failed for: r1v46 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean d(KeyEvent keyEvent, p6.a aVar) {
        w1.k kVar;
        y0.l lVar;
        b1 b1Var;
        w1.k kVar2;
        b1 b1Var2;
        int size;
        b1 b1Var3;
        n nVar = this.f2068c;
        Trace.beginSection("FocusOwnerImpl:dispatchKeyEvent");
        try {
            if (this.f2069d.f2064e) {
                System.out.println((Object) "FocusRelatedWarning: Dispatching key event while focus system is invalidated.");
                return false;
            }
            if (!g(keyEvent)) {
                return false;
            }
            n g3 = d.g(nVar);
            if (g3 != null) {
                if (!g3.f8706d.f8718q) {
                    t1.a.b("visitLocalDescendants called on an unattached node");
                }
                y0.l lVar2 = g3.f8706d;
                if ((lVar2.f8709g & 9216) != 0) {
                    lVar = null;
                    for (y0.l lVar3 = lVar2.i; lVar3 != null; lVar3 = lVar3.i) {
                        int i = lVar3.f8708f;
                        if ((i & 9216) != 0) {
                            if ((i & 1024) != 0) {
                                break;
                            }
                            lVar = lVar3;
                        }
                    }
                } else {
                    lVar = null;
                }
            }
            if (g3 != null) {
                if (!g3.f8706d.f8718q) {
                    t1.a.b("visitAncestors called on an unattached node");
                }
                y0.l lVar4 = g3.f8706d;
                f0 u7 = w1.f.u(g3);
                loop11: while (true) {
                    if (u7 == null) {
                        kVar2 = null;
                        break;
                    }
                    if ((u7.F.f7600f.f8709g & 8192) != 0) {
                        while (lVar4 != null) {
                            if ((lVar4.f8708f & 8192) != 0) {
                                o0.e eVar = null;
                                y0.l lVar5 = lVar4;
                                while (lVar5 != null) {
                                    if (lVar5 instanceof o1.c) {
                                        kVar2 = lVar5;
                                        break loop11;
                                    }
                                    if ((lVar5.f8708f & 8192) != 0 && (lVar5 instanceof w1.l)) {
                                        y0.l lVar6 = ((w1.l) lVar5).f7707s;
                                        int i8 = 0;
                                        lVar5 = lVar5;
                                        eVar = eVar;
                                        while (lVar6 != null) {
                                            if ((lVar6.f8708f & 8192) != 0) {
                                                i8++;
                                                eVar = eVar;
                                                if (i8 == 1) {
                                                    lVar5 = lVar6;
                                                } else {
                                                    if (eVar == null) {
                                                        eVar = new o0.e(new y0.l[16]);
                                                    }
                                                    if (lVar5 != null) {
                                                        eVar.b(lVar5);
                                                        lVar5 = null;
                                                    }
                                                    eVar.b(lVar6);
                                                }
                                            }
                                            lVar6 = lVar6.i;
                                            lVar5 = lVar5;
                                            eVar = eVar;
                                        }
                                        if (i8 == 1) {
                                        }
                                    }
                                    lVar5 = w1.f.f(eVar);
                                }
                            }
                            lVar4 = lVar4.f8710h;
                        }
                    }
                    u7 = u7.s();
                    lVar4 = (u7 == null || (b1Var2 = u7.F) == null) ? null : b1Var2.f7599e;
                }
                w1.k kVar3 = (o1.c) kVar2;
                if (kVar3 != null) {
                    lVar = ((y0.l) kVar3).f8706d;
                    if (lVar != null) {
                        if (!lVar.f8706d.f8718q) {
                            t1.a.b("visitAncestors called on an unattached node");
                        }
                        y0.l lVar7 = lVar.f8706d.f8710h;
                        f0 u8 = w1.f.u(lVar);
                        ArrayList arrayList = null;
                        while (u8 != null) {
                            if ((u8.F.f7600f.f8709g & 8192) != 0) {
                                while (lVar7 != null) {
                                    if ((lVar7.f8708f & 8192) != 0) {
                                        y0.l lVar8 = lVar7;
                                        o0.e eVar2 = null;
                                        while (lVar8 != null) {
                                            if (lVar8 instanceof o1.c) {
                                                if (arrayList == null) {
                                                    arrayList = new ArrayList();
                                                }
                                                arrayList.add(lVar8);
                                            } else if ((lVar8.f8708f & 8192) != 0 && (lVar8 instanceof w1.l)) {
                                                int i9 = 0;
                                                for (y0.l lVar9 = ((w1.l) lVar8).f7707s; lVar9 != null; lVar9 = lVar9.i) {
                                                    if ((lVar9.f8708f & 8192) != 0) {
                                                        i9++;
                                                        if (i9 == 1) {
                                                            lVar8 = lVar9;
                                                        } else {
                                                            if (eVar2 == null) {
                                                                eVar2 = new o0.e(new y0.l[16]);
                                                            }
                                                            if (lVar8 != null) {
                                                                eVar2.b(lVar8);
                                                                lVar8 = null;
                                                            }
                                                            eVar2.b(lVar9);
                                                        }
                                                    }
                                                }
                                                if (i9 == 1) {
                                                }
                                            }
                                            lVar8 = w1.f.f(eVar2);
                                        }
                                    }
                                    lVar7 = lVar7.f8710h;
                                }
                            }
                            u8 = u8.s();
                            lVar7 = (u8 == null || (b1Var3 = u8.F) == null) ? null : b1Var3.f7599e;
                        }
                        if (arrayList != null && arrayList.size() - 1 >= 0) {
                            while (true) {
                                int i10 = size - 1;
                                if (((o1.c) arrayList.get(size)).h(keyEvent)) {
                                    return true;
                                }
                                if (i10 < 0) {
                                    break;
                                }
                                size = i10;
                            }
                        }
                        w1.l lVar10 = lVar.f8706d;
                        ?? r12 = 0;
                        while (lVar10 != 0) {
                            if (lVar10 instanceof o1.c) {
                                if (((o1.c) lVar10).h(keyEvent)) {
                                    return true;
                                }
                            } else if ((lVar10.f8708f & 8192) != 0 && (lVar10 instanceof w1.l)) {
                                y0.l lVar11 = lVar10.f7707s;
                                int i11 = 0;
                                lVar10 = lVar10;
                                r12 = r12;
                                while (lVar11 != null) {
                                    if ((lVar11.f8708f & 8192) != 0) {
                                        i11++;
                                        r12 = r12;
                                        if (i11 == 1) {
                                            lVar10 = lVar11;
                                        } else {
                                            if (r12 == 0) {
                                                r12 = new o0.e(new y0.l[16]);
                                            }
                                            if (lVar10 != 0) {
                                                r12.b(lVar10);
                                                lVar10 = 0;
                                            }
                                            r12.b(lVar11);
                                        }
                                    }
                                    lVar11 = lVar11.i;
                                    lVar10 = lVar10;
                                    r12 = r12;
                                }
                                if (i11 == 1) {
                                }
                            }
                            lVar10 = w1.f.f(r12);
                        }
                        if (((Boolean) aVar.b()).booleanValue()) {
                            return true;
                        }
                        w1.l lVar12 = lVar.f8706d;
                        ?? r02 = 0;
                        while (lVar12 != 0) {
                            if (lVar12 instanceof o1.c) {
                                if (((o1.c) lVar12).K(keyEvent)) {
                                    return true;
                                }
                            } else if ((lVar12.f8708f & 8192) != 0 && (lVar12 instanceof w1.l)) {
                                y0.l lVar13 = lVar12.f7707s;
                                int i12 = 0;
                                r02 = r02;
                                lVar12 = lVar12;
                                while (lVar13 != null) {
                                    if ((lVar13.f8708f & 8192) != 0) {
                                        i12++;
                                        r02 = r02;
                                        if (i12 == 1) {
                                            lVar12 = lVar13;
                                        } else {
                                            if (r02 == 0) {
                                                r02 = new o0.e(new y0.l[16]);
                                            }
                                            if (lVar12 != 0) {
                                                r02.b(lVar12);
                                                lVar12 = 0;
                                            }
                                            r02.b(lVar13);
                                        }
                                    }
                                    lVar13 = lVar13.i;
                                    r02 = r02;
                                    lVar12 = lVar12;
                                }
                                if (i12 == 1) {
                                }
                            }
                            lVar12 = w1.f.f(r02);
                        }
                        if (arrayList != null) {
                            int size2 = arrayList.size();
                            for (int i13 = 0; i13 < size2; i13++) {
                                if (((o1.c) arrayList.get(i13)).K(keyEvent)) {
                                    return true;
                                }
                            }
                        }
                    }
                    return false;
                }
            }
            if (!nVar.f8706d.f8718q) {
                t1.a.b("visitAncestors called on an unattached node");
            }
            y0.l lVar14 = nVar.f8706d.f8710h;
            f0 u9 = w1.f.u(nVar);
            loop15: while (true) {
                if (u9 == null) {
                    kVar = null;
                    break;
                }
                if ((u9.F.f7600f.f8709g & 8192) != 0) {
                    while (lVar14 != null) {
                        if ((lVar14.f8708f & 8192) != 0) {
                            y0.l lVar15 = lVar14;
                            o0.e eVar3 = null;
                            while (lVar15 != null) {
                                if (lVar15 instanceof o1.c) {
                                    kVar = lVar15;
                                    break loop15;
                                }
                                if ((lVar15.f8708f & 8192) != 0 && (lVar15 instanceof w1.l)) {
                                    y0.l lVar16 = ((w1.l) lVar15).f7707s;
                                    int i14 = 0;
                                    lVar15 = lVar15;
                                    eVar3 = eVar3;
                                    while (lVar16 != null) {
                                        if ((lVar16.f8708f & 8192) != 0) {
                                            i14++;
                                            eVar3 = eVar3;
                                            if (i14 == 1) {
                                                lVar15 = lVar16;
                                            } else {
                                                if (eVar3 == null) {
                                                    eVar3 = new o0.e(new y0.l[16]);
                                                }
                                                if (lVar15 != null) {
                                                    eVar3.b(lVar15);
                                                    lVar15 = null;
                                                }
                                                eVar3.b(lVar16);
                                            }
                                        }
                                        lVar16 = lVar16.i;
                                        lVar15 = lVar15;
                                        eVar3 = eVar3;
                                    }
                                    if (i14 == 1) {
                                    }
                                }
                                lVar15 = w1.f.f(eVar3);
                            }
                        }
                        lVar14 = lVar14.f8710h;
                    }
                }
                u9 = u9.s();
                lVar14 = (u9 == null || (b1Var = u9.F) == null) ? null : b1Var.f7599e;
            }
            w1.k kVar4 = (o1.c) kVar;
            lVar = kVar4 != null ? ((y0.l) kVar4).f8706d : null;
            if (lVar != null) {
            }
            return false;
        } finally {
            Trace.endSection();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:95:0x0113, code lost:
    
        continue;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Boolean e(int i, e1.c cVar, p6.c cVar2) {
        boolean a8;
        b1 b1Var;
        l lVar;
        boolean z3;
        n nVar = this.f2068c;
        n g3 = d.g(nVar);
        int i8 = 4;
        t tVar = this.f2067b;
        n nVar2 = null;
        if (g3 != null) {
            r2.l layoutDirection = tVar.getLayoutDirection();
            k s02 = g3.s0();
            l lVar2 = s02.f2084h;
            l lVar3 = s02.i;
            if (i == 1) {
                lVar = s02.f2078b;
            } else if (i == 2) {
                lVar = s02.f2079c;
            } else if (i == 5) {
                lVar = s02.f2080d;
            } else if (i == 6) {
                lVar = s02.f2081e;
            } else if (i == 3) {
                int ordinal = layoutDirection.ordinal();
                if (ordinal != 0) {
                    if (ordinal != 1) {
                        throw new a5.c();
                    }
                    lVar2 = lVar3;
                }
                if (lVar2 == l.f2087b) {
                    lVar2 = null;
                }
                if (lVar2 == null) {
                    lVar = s02.f2082f;
                }
                lVar = lVar2;
            } else if (i == 4) {
                int ordinal2 = layoutDirection.ordinal();
                if (ordinal2 == 0) {
                    lVar2 = lVar3;
                } else if (ordinal2 != 1) {
                    throw new a5.c();
                }
                if (lVar2 == l.f2087b) {
                    lVar2 = null;
                }
                if (lVar2 == null) {
                    lVar = s02.f2083g;
                }
                lVar = lVar2;
            } else {
                if (i != 7 && i != 8) {
                    throw new IllegalStateException("invalid FocusDirection");
                }
                i iVar = (i) ((t) w1.f.v(g3)).getFocusOwner();
                n nVar3 = iVar.f2073h;
                if (i == 7) {
                    s02.f2085j.getClass();
                } else {
                    s02.f2086k.getClass();
                }
                lVar = nVar3 != iVar.f2073h ? l.f2089d : l.f2087b;
            }
            l lVar4 = l.f2088c;
            if (!q6.i.a(lVar, lVar4)) {
                if (q6.i.a(lVar, l.f2089d)) {
                    Object g7 = d.g(nVar);
                    if (g7 != null) {
                        return (Boolean) cVar2.i(g7);
                    }
                } else {
                    l lVar5 = l.f2087b;
                    if (!q6.i.a(lVar, lVar5)) {
                        lVar.getClass();
                        if (lVar == lVar5) {
                            throw new IllegalStateException("\n    Please check whether the focusRequester is FocusRequester.Cancel or FocusRequester.Default\n    before invoking any functions on the focusRequester.\n");
                        }
                        if (lVar == lVar4) {
                            throw new IllegalStateException("\n    Please check whether the focusRequester is FocusRequester.Cancel or FocusRequester.Default\n    before invoking any functions on the focusRequester.\n");
                        }
                        o0.e eVar = lVar.f2090a;
                        int i9 = eVar.f5580f;
                        if (i9 == 0) {
                            System.out.println((Object) "FocusRelatedWarning: \n   FocusRequester is not initialized. Here are some possible fixes:\n\n   1. Remember the FocusRequester: val focusRequester = remember { FocusRequester() }\n   2. Did you forget to add a Modifier.focusRequester() ?\n   3. Are you attempting to request focus during composition? Focus requests should be made in\n   response to some event. Eg Modifier.clickable { focusRequester.requestFocus() }\n");
                            z3 = false;
                        } else {
                            Object[] objArr = eVar.f5578d;
                            boolean z7 = false;
                            for (int i10 = 0; i10 < i9; i10++) {
                                w1.c cVar3 = (w1.c) objArr[i10];
                                if (!cVar3.f8706d.f8718q) {
                                    t1.a.b("visitChildren called on an unattached node");
                                }
                                o0.e eVar2 = new o0.e(new y0.l[16]);
                                y0.l lVar6 = cVar3.f8706d;
                                y0.l lVar7 = lVar6.i;
                                if (lVar7 == null) {
                                    w1.f.b(eVar2, lVar6);
                                } else {
                                    eVar2.b(lVar7);
                                }
                                while (true) {
                                    int i11 = eVar2.f5580f;
                                    if (i11 != 0) {
                                        y0.l lVar8 = (y0.l) eVar2.k(i11 - 1);
                                        if ((lVar8.f8709g & 1024) == 0) {
                                            w1.f.b(eVar2, lVar8);
                                        } else {
                                            while (true) {
                                                if (lVar8 == null) {
                                                    break;
                                                }
                                                if ((lVar8.f8708f & 1024) != 0) {
                                                    o0.e eVar3 = null;
                                                    while (lVar8 != null) {
                                                        if (lVar8 instanceof n) {
                                                            n nVar4 = (n) lVar8;
                                                            if (nVar4.s0().f2077a ? ((Boolean) cVar2.i(nVar4)).booleanValue() : d.i(nVar4, 7, cVar2)) {
                                                                z7 = true;
                                                                break;
                                                            }
                                                        } else if (((lVar8.f8708f & 1024) != 0) && (lVar8 instanceof w1.l)) {
                                                            int i12 = 0;
                                                            for (y0.l lVar9 = ((w1.l) lVar8).f7707s; lVar9 != null; lVar9 = lVar9.i) {
                                                                if ((lVar9.f8708f & 1024) != 0) {
                                                                    i12++;
                                                                    if (i12 == 1) {
                                                                        lVar8 = lVar9;
                                                                    } else {
                                                                        if (eVar3 == null) {
                                                                            eVar3 = new o0.e(new y0.l[16]);
                                                                        }
                                                                        if (lVar8 != null) {
                                                                            eVar3.b(lVar8);
                                                                            lVar8 = null;
                                                                        }
                                                                        eVar3.b(lVar9);
                                                                    }
                                                                }
                                                            }
                                                            if (i12 == 1) {
                                                            }
                                                        }
                                                        lVar8 = w1.f.f(eVar3);
                                                    }
                                                } else {
                                                    lVar8 = lVar8.i;
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                            z3 = z7;
                        }
                        return Boolean.valueOf(z3);
                    }
                }
            }
            return null;
        }
        g3 = null;
        r2.l layoutDirection2 = tVar.getLayoutDirection();
        b1.f fVar = new b1.f(g3, this, cVar2);
        if (i == 1 || i == 2) {
            if (i == 1) {
                a8 = d.k(nVar, fVar);
            } else {
                if (i != 2) {
                    throw new IllegalStateException("This function should only be used for 1-D focus search");
                }
                a8 = d.a(nVar, fVar);
            }
            return Boolean.valueOf(a8);
        }
        if (i == 3 || i == 4 || i == 5 || i == 6) {
            return d.C(i, fVar, nVar, cVar);
        }
        if (i == 7) {
            int ordinal3 = layoutDirection2.ordinal();
            if (ordinal3 != 0) {
                if (ordinal3 != 1) {
                    throw new a5.c();
                }
                i8 = 3;
            }
            n g8 = d.g(nVar);
            if (g8 != null) {
                return d.C(i8, fVar, g8, cVar);
            }
            return null;
        }
        if (i != 8) {
            throw new IllegalStateException(("Focus search invoked with invalid FocusDirection " + ((Object) b.a(i))).toString());
        }
        n g9 = d.g(nVar);
        if (g9 != null) {
            if (!g9.f8706d.f8718q) {
                t1.a.b("visitAncestors called on an unattached node");
            }
            y0.l lVar10 = g9.f8706d.f8710h;
            f0 u7 = w1.f.u(g9);
            loop5: while (true) {
                if (u7 == null) {
                    break;
                }
                if ((u7.F.f7600f.f8709g & 1024) != 0) {
                    while (lVar10 != null) {
                        if ((lVar10.f8708f & 1024) != 0) {
                            y0.l lVar11 = lVar10;
                            o0.e eVar4 = null;
                            while (lVar11 != null) {
                                if (lVar11 instanceof n) {
                                    n nVar5 = (n) lVar11;
                                    if (nVar5.s0().f2077a) {
                                        nVar2 = nVar5;
                                        break loop5;
                                    }
                                } else if ((lVar11.f8708f & 1024) != 0 && (lVar11 instanceof w1.l)) {
                                    int i13 = 0;
                                    for (y0.l lVar12 = ((w1.l) lVar11).f7707s; lVar12 != null; lVar12 = lVar12.i) {
                                        if ((lVar12.f8708f & 1024) != 0) {
                                            i13++;
                                            if (i13 == 1) {
                                                lVar11 = lVar12;
                                            } else {
                                                if (eVar4 == null) {
                                                    eVar4 = new o0.e(new y0.l[16]);
                                                }
                                                if (lVar11 != null) {
                                                    eVar4.b(lVar11);
                                                    lVar11 = null;
                                                }
                                                eVar4.b(lVar12);
                                            }
                                        }
                                    }
                                    if (i13 != 1) {
                                        lVar11 = w1.f.f(eVar4);
                                    }
                                }
                                lVar11 = w1.f.f(eVar4);
                            }
                        }
                        lVar10 = lVar10.f8710h;
                    }
                }
                u7 = u7.s();
                lVar10 = (u7 == null || (b1Var = u7.F) == null) ? null : b1Var.f7599e;
            }
        }
        n nVar6 = nVar2;
        return Boolean.valueOf((nVar6 == null || nVar6.equals(nVar)) ? false : ((Boolean) fVar.i(nVar6)).booleanValue());
    }

    public final void f(n nVar) {
        f0 u7;
        d2.j u8;
        f0 u9;
        d2.j u10;
        n nVar2 = this.f2073h;
        this.f2073h = nVar;
        e0 e0Var = this.f2072g;
        Object[] objArr = e0Var.f5442a;
        int i = e0Var.f5443b;
        for (int i8 = 0; i8 < i; i8++) {
            z0.b bVar = (z0.b) objArr[i8];
            bVar.getClass();
            if (nVar2 != null && (u9 = w1.f.u(nVar2)) != null && (u10 = u9.u()) != null && u10.f2150d.b(d2.i.f2131g)) {
                ((AutofillManager) bVar.f9102a.f6119e).notifyViewExited(bVar.f9104c, u9.f7640e);
            }
            if (nVar != null && (u7 = w1.f.u(nVar)) != null && (u8 = u7.u()) != null && u8.f2150d.b(d2.i.f2131g)) {
                int i9 = u7.f7640e;
                bVar.f9105d.f2470a.f(i9, new z0.a(bVar, i9));
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:100:0x034d, code lost:
    
        if (((r7 & ((~r7) << 6)) & (-9187201950435737472L)) == 0) goto L89;
     */
    /* JADX WARN: Code restructure failed: missing block: B:103:0x034f, code lost:
    
        r11 = -1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x009f, code lost:
    
        r36 = r15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x00a9, code lost:
    
        if (((r9 & ((~r9) << 6)) & (-9187201950435737472L)) == r36) goto L65;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x00ab, code lost:
    
        r3 = r4.b(r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x00b1, code lost:
    
        if (r4.f5422e != 0) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x00c2, code lost:
    
        if (((r4.f5418a[r3 >> 3] >> ((r3 & 7) << 3)) & 255) != 254) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x00ca, code lost:
    
        r3 = r4.f5420c;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x00cc, code lost:
    
        if (r3 <= r5) goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x00ce, code lost:
    
        r15 = 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x00e5, code lost:
    
        if (java.lang.Long.compare((r4.f5421d * 32) ^ Long.MIN_VALUE, (r3 * 25) ^ Long.MIN_VALUE) > 0) goto L48;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x00e7, code lost:
    
        r3 = r4.f5418a;
        r8 = r4.f5420c;
        r9 = r4.f5419b;
        r10 = (r8 + 7) >> 3;
        r13 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00f3, code lost:
    
        if (r13 >= r10) goto L96;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x00f5, code lost:
    
        r14 = r5;
        r5 = r3[r13] & (-9187201950435737472L);
        r3[r13] = (-72340172838076674L) & ((~r5) + (r5 >>> 7));
        r13 = r13 + 1;
        r5 = r14;
        r15 = r15;
        r6 = r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0115, code lost:
    
        r32 = r6;
        r22 = r15;
        r5 = d6.l.O(r3);
        r6 = r5 - 1;
        r3[r6] = (r3[r6] & 72057594037927935L) | (-72057594037927936L);
        r3[r5] = r3[0];
        r5 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0136, code lost:
    
        if (r5 == r8) goto L97;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0138, code lost:
    
        r6 = r5 >> 3;
        r10 = (r5 & 7) << 3;
        r13 = (r3[r6] >> r10) & 255;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0145, code lost:
    
        if (r13 != r22) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x014c, code lost:
    
        if (r13 == 254) goto L98;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x014f, code lost:
    
        r13 = java.lang.Long.hashCode(r9[r5]) * r31;
        r14 = (r13 ^ (r13 << 16)) >>> 7;
        r15 = r4.b(r14);
        r14 = r14 & r8;
        r33 = r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x016e, code lost:
    
        if ((((r15 - r14) & r8) / 8) != (((r5 - r14) & r8) / 8)) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x0170, code lost:
    
        r3[r6] = (r3[r6] & (~(255 << r10))) | ((r13 & 127) << r10);
        r3[r3.length - 1] = (r3[0] & 72057594037927935L) | Long.MIN_VALUE;
        r5 = r5 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x018e, code lost:
    
        r7 = r33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x0191, code lost:
    
        r7 = r5;
        r5 = r15 >> 3;
        r34 = r3[r5];
        r6 = (r15 & 7) << 3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x01a2, code lost:
    
        if (((r34 >> r6) & 255) != r22) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x01a4, code lost:
    
        r3[r5] = (r34 & (~(255 << r6))) | ((r13 & 127) << r6);
        r3[r6] = (r3[r6] & (~(255 << r10))) | (r22 << r10);
        r9[r15] = r9[r7];
        r9[r7] = r36;
        r5 = r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x01e3, code lost:
    
        r3[r3.length - 1] = (r3[0] & 72057594037927935L) | Long.MIN_VALUE;
        r5 = r5 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x01c8, code lost:
    
        r3[r5] = ((r13 & 127) << r6) | (r34 & (~(255 << r6)));
        r5 = r9[r15];
        r9[r15] = r9[r7];
        r9[r7] = r5;
        r5 = r7 - 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x0147, code lost:
    
        r5 = r5 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x01f1, code lost:
    
        r33 = r7;
        r4.f5422e = o.r0.a(r4.f5420c) - r4.f5421d;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x0281, code lost:
    
        r3 = r4.b(r32);
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x0285, code lost:
    
        r32 = r3;
        r4.f5421d++;
        r3 = r4.f5422e;
        r5 = r4.f5418a;
        r6 = r32 >> 3;
        r7 = r5[r6];
        r9 = (r32 & 7) << 3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x029f, code lost:
    
        if (((r7 >> r9) & 255) != r22) goto L62;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x02a1, code lost:
    
        r21 = r33 ? 1 : 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x02a3, code lost:
    
        r4.f5422e = r3 - r21;
        r3 = r4.f5420c;
        r7 = (r7 & (~(255 << r9))) | (r11 << r9);
        r5[r6] = r7;
        r5[(((r32 - 7) & r3) + (r3 & 7)) >> 3] = r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x0202, code lost:
    
        r22 = 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x0204, code lost:
    
        r32 = r6;
        r33 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x020c, code lost:
    
        r3 = o.r0.b(r4.f5420c);
        r5 = r4.f5418a;
        r6 = r4.f5419b;
        r7 = r4.f5420c;
        r4.c(r3);
        r3 = r4.f5418a;
        r8 = r4.f5419b;
        r9 = r4.f5420c;
        r10 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x0223, code lost:
    
        if (r10 >= r7) goto L104;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x0232, code lost:
    
        if (((r5[r10 >> 3] >> ((r10 & 7) << 3)) & 255) >= r22) goto L56;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x0234, code lost:
    
        r13 = r6[r10];
        r15 = java.lang.Long.hashCode(r13) * r31;
        r15 = r15 ^ (r15 << 16);
        r16 = r3;
        r3 = r4.b(r15 >>> 7);
        r17 = r5;
        r18 = r6;
        r5 = r15 & 127;
        r15 = r3 >> 3;
        r19 = (r3 & 7) << 3;
        r5 = (r16[r15] & (~(255 << r19))) | (r5 << r19);
        r16[r15] = r5;
        r16[(((r3 - 7) & r9) + (r9 & 7)) >> 3] = r5;
        r8[r3] = r13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x0278, code lost:
    
        r10 = r10 + 1;
        r3 = r16;
        r5 = r17;
        r6 = r18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x0272, code lost:
    
        r16 = r3;
        r17 = r5;
        r18 = r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x0209, code lost:
    
        r22 = 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x00c4, code lost:
    
        r33 = true;
        r22 = 128;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean g(KeyEvent keyEvent) {
        int i;
        long j7;
        boolean z3;
        int i8;
        long c8 = h0.a.c(keyEvent.getKeyCode());
        int E = m.a.E(keyEvent);
        int i9 = -862048943;
        long j8 = 0;
        int i10 = 8;
        int i11 = 0;
        boolean z7 = true;
        if (E == 2) {
            b0 b0Var = this.f2071f;
            if (b0Var == null) {
                b0Var = new b0(3);
                this.f2071f = b0Var;
            }
            b0 b0Var2 = b0Var;
            int hashCode = Long.hashCode(c8) * (-862048943);
            int i12 = hashCode ^ (hashCode << 16);
            int i13 = i12 >>> 7;
            int i14 = i12 & 127;
            int i15 = b0Var2.f5420c;
            int i16 = i13 & i15;
            int i17 = 0;
            loop0: while (true) {
                long[] jArr = b0Var2.f5418a;
                int i18 = i16 >> 3;
                int i19 = i9;
                int i20 = (i16 & 7) << 3;
                long j9 = (jArr[i18] >>> i20) | ((jArr[i18 + 1] << (64 - i20)) & ((-i20) >> 63));
                long j10 = i14;
                long j11 = j9 ^ (j10 * 72340172838076673L);
                long j12 = (j11 - 72340172838076673L) & (~j11) & (-9187201950435737472L);
                while (true) {
                    if (j12 == j8) {
                        break;
                    }
                    i8 = (i16 + (Long.numberOfTrailingZeros(j12) >> 3)) & i15;
                    long j13 = j8;
                    if (b0Var2.f5419b[i8] == c8) {
                        z3 = true;
                        break loop0;
                    }
                    j12 &= j12 - 1;
                    j8 = j13;
                }
                i17 += 8;
                i16 = (i16 + i17) & i15;
                i10 = i10;
                i9 = i19;
                j8 = j7;
            }
            b0Var2.f5419b[i8] = c8;
            return z3;
        }
        if (E != 1) {
            return true;
        }
        b0 b0Var3 = this.f2071f;
        if (b0Var3 == null || !b0Var3.a(c8)) {
            return false;
        }
        b0 b0Var4 = this.f2071f;
        if (b0Var4 != null) {
            int hashCode2 = Long.hashCode(c8) * (-862048943);
            int i21 = hashCode2 ^ (hashCode2 << 16);
            int i22 = i21 & 127;
            int i23 = b0Var4.f5420c;
            int i24 = i21 >>> 7;
            loop5: while (true) {
                int i25 = i24 & i23;
                long[] jArr2 = b0Var4.f5418a;
                int i26 = i25 >> 3;
                int i27 = (i25 & 7) << 3;
                long j14 = ((jArr2[i26 + 1] << (64 - i27)) & ((-i27) >> 63)) | (jArr2[i26] >>> i27);
                long j15 = (i22 * 72340172838076673L) ^ j14;
                long j16 = (~j15) & (j15 - 72340172838076673L) & (-9187201950435737472L);
                while (true) {
                    if (j16 == 0) {
                        break;
                    }
                    i = ((Long.numberOfTrailingZeros(j16) >> 3) + i25) & i23;
                    if (b0Var4.f5419b[i] == c8) {
                        break loop5;
                    }
                    j16 &= j16 - 1;
                }
                i11 += 8;
                i24 = i25 + i11;
            }
            if (i >= 0) {
                b0Var4.f5421d--;
                long[] jArr3 = b0Var4.f5418a;
                int i28 = b0Var4.f5420c;
                int i29 = i >> 3;
                int i30 = (i & 7) << 3;
                long j17 = (jArr3[i29] & (~(255 << i30))) | (254 << i30);
                jArr3[i29] = j17;
                jArr3[(((i - 7) & i28) + (i28 & 7)) >> 3] = j17;
                return true;
            }
        }
        return true;
    }
}
