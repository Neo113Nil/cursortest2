package i1;

import android.os.Trace;
import android.view.KeyEvent;
import android.view.View;
import c2.b1;
import c2.g0;
import c2.z1;
import d2.v;
import java.util.ArrayList;
import kotlin.collections.i0;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import s.a0;
import s.d0;
import te.a1;
import z4.w;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class k implements h {

    /* renamed from: a, reason: collision with root package name */
    public final v f4601a;

    /* renamed from: b, reason: collision with root package name */
    public final v f4602b;

    /* renamed from: d, reason: collision with root package name */
    public final e f4604d;

    /* renamed from: f, reason: collision with root package name */
    public a0 f4606f;

    /* renamed from: h, reason: collision with root package name */
    public t f4607h;

    /* renamed from: c, reason: collision with root package name */
    public final t f4603c = new t(2, null, 14);

    /* renamed from: e, reason: collision with root package name */
    public final i f4605e = new i(this);
    public final d0 g = new d0(1);

    public k(v vVar, v vVar2) {
        this.f4601a = vVar;
        this.f4602b = vVar2;
        this.f4604d = new e(this, vVar2);
    }

    public final boolean a(boolean z10) {
        b1 b1Var;
        if (f() != null) {
            t f3 = f();
            h(null);
            if (f3 != null) {
                f3.J(r.f4626d, r.f4628i);
                if (!f3.f3305d.B) {
                    z1.a.b("visitAncestors called on an unattached node");
                }
                d1.k kVar = f3.f3305d.f3309s;
                g0 u2 = c2.k.u(f3);
                while (u2 != null) {
                    if ((((d1.k) u2.S.g).f3308r & 1024) != 0) {
                        while (kVar != null) {
                            if ((kVar.f3307i & 1024) != 0) {
                                o0.e eVar = null;
                                d1.k kVar2 = kVar;
                                while (kVar2 != null) {
                                    if (kVar2 instanceof t) {
                                        ((t) kVar2).J(r.f4627e, r.f4628i);
                                    } else if ((kVar2.f3307i & 1024) != 0 && (kVar2 instanceof c2.j)) {
                                        int i3 = 0;
                                        for (d1.k kVar3 = ((c2.j) kVar2).D; kVar3 != null; kVar3 = kVar3.f3310t) {
                                            if ((kVar3.f3307i & 1024) != 0) {
                                                i3++;
                                                if (i3 == 1) {
                                                    kVar2 = kVar3;
                                                } else {
                                                    if (eVar == null) {
                                                        eVar = new o0.e(new d1.k[16]);
                                                    }
                                                    if (kVar2 != null) {
                                                        eVar.b(kVar2);
                                                        kVar2 = null;
                                                    }
                                                    eVar.b(kVar3);
                                                }
                                            }
                                        }
                                        if (i3 == 1) {
                                        }
                                    }
                                    kVar2 = c2.k.e(eVar);
                                }
                            }
                            kVar = kVar.f3309s;
                        }
                    }
                    u2 = u2.s();
                    kVar = (u2 == null || (b1Var = u2.S) == null) ? null : (z1) b1Var.f1495f;
                }
            }
        }
        return true;
    }

    public final boolean b(int i3, boolean z10, boolean z11) {
        boolean z12 = true;
        if (z10) {
            a(z10);
        } else {
            int ordinal = k7.e.C(this.f4603c, i3).ordinal();
            if (ordinal == 0) {
                a(z10);
            } else {
                if (ordinal != 1 && ordinal != 2 && ordinal != 3) {
                    a2.r.p();
                    return false;
                }
                z12 = false;
            }
        }
        if (z12 && z11) {
            c();
        }
        return z12;
    }

    public final void c() {
        v vVar = this.f4601a;
        if (vVar.isFocused() || vVar.hasFocus()) {
            vVar.clearFocus();
        } else if (vVar.hasFocus()) {
            View findFocus = vVar.findFocus();
            if (findFocus != null) {
                findFocus.clearFocus();
            }
            vVar.clearFocus();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x005a, code lost:
    
        if (r8 == null) goto L33;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0172 A[Catch: all -> 0x0019, TryCatch #0 {all -> 0x0019, blocks: (B:3:0x0007, B:5:0x000e, B:9:0x001c, B:13:0x0026, B:16:0x0032, B:18:0x0038, B:19:0x003d, B:21:0x0045, B:23:0x004a, B:25:0x0050, B:29:0x0056, B:34:0x0172, B:36:0x0178, B:37:0x017b, B:39:0x0186, B:42:0x0194, B:46:0x019e, B:49:0x01a4, B:50:0x01a9, B:52:0x01b1, B:54:0x01b7, B:56:0x01bb, B:58:0x01c3, B:60:0x01c9, B:66:0x01d1, B:68:0x01da, B:69:0x01de, B:64:0x01e1, B:75:0x01e7, B:86:0x01ec, B:89:0x01ef, B:91:0x01f5, B:98:0x01f9, B:103:0x0202, B:105:0x020a, B:110:0x021a, B:112:0x021f, B:146:0x0223, B:141:0x025c, B:114:0x0226, B:116:0x022c, B:118:0x0230, B:120:0x0238, B:122:0x023e, B:128:0x0246, B:130:0x024f, B:131:0x0253, B:126:0x0256, B:148:0x0261, B:152:0x0271, B:154:0x0276, B:188:0x027a, B:183:0x02bc, B:156:0x0286, B:158:0x028c, B:160:0x0290, B:162:0x0298, B:164:0x029e, B:170:0x02a6, B:172:0x02af, B:173:0x02b3, B:168:0x02b6, B:195:0x02c3, B:197:0x02ca, B:210:0x005e, B:212:0x0064, B:213:0x0067, B:215:0x006f, B:218:0x007d, B:222:0x0087, B:257:0x00dc, B:259:0x00e0, B:224:0x008c, B:226:0x0092, B:228:0x0096, B:230:0x009e, B:232:0x00a4, B:238:0x00ac, B:240:0x00b5, B:241:0x00b9, B:236:0x00bc, B:247:0x00c2, B:261:0x00c7, B:264:0x00ca, B:266:0x00d0, B:273:0x00d4, B:278:0x00e6, B:280:0x00ec, B:281:0x00ef, B:283:0x00f9, B:286:0x0107, B:290:0x0111, B:325:0x0166, B:327:0x016a, B:292:0x0116, B:294:0x011c, B:296:0x0120, B:298:0x0128, B:300:0x012e, B:306:0x0136, B:308:0x013f, B:309:0x0143, B:304:0x0146, B:315:0x014c, B:330:0x0151, B:333:0x0154, B:335:0x015a, B:342:0x015e), top: B:2:0x0007 }] */
    /* JADX WARN: Type inference failed for: r0v10, types: [d1.k] */
    /* JADX WARN: Type inference failed for: r0v11 */
    /* JADX WARN: Type inference failed for: r0v12 */
    /* JADX WARN: Type inference failed for: r0v16, types: [o0.e] */
    /* JADX WARN: Type inference failed for: r0v17 */
    /* JADX WARN: Type inference failed for: r0v18 */
    /* JADX WARN: Type inference failed for: r0v19 */
    /* JADX WARN: Type inference failed for: r0v20, types: [o0.e] */
    /* JADX WARN: Type inference failed for: r0v23, types: [d1.k] */
    /* JADX WARN: Type inference failed for: r0v24 */
    /* JADX WARN: Type inference failed for: r0v25, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v26 */
    /* JADX WARN: Type inference failed for: r0v27 */
    /* JADX WARN: Type inference failed for: r0v28 */
    /* JADX WARN: Type inference failed for: r0v29 */
    /* JADX WARN: Type inference failed for: r0v43 */
    /* JADX WARN: Type inference failed for: r0v44 */
    /* JADX WARN: Type inference failed for: r0v45 */
    /* JADX WARN: Type inference failed for: r0v46 */
    /* JADX WARN: Type inference failed for: r0v47 */
    /* JADX WARN: Type inference failed for: r0v48 */
    /* JADX WARN: Type inference failed for: r0v9, types: [d1.k] */
    /* JADX WARN: Type inference failed for: r15v10 */
    /* JADX WARN: Type inference failed for: r15v11, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r15v12 */
    /* JADX WARN: Type inference failed for: r15v13 */
    /* JADX WARN: Type inference failed for: r15v14 */
    /* JADX WARN: Type inference failed for: r15v15 */
    /* JADX WARN: Type inference failed for: r15v17 */
    /* JADX WARN: Type inference failed for: r15v18 */
    /* JADX WARN: Type inference failed for: r15v4, types: [d1.k] */
    /* JADX WARN: Type inference failed for: r15v5, types: [d1.k] */
    /* JADX WARN: Type inference failed for: r15v9, types: [d1.k] */
    /* JADX WARN: Type inference failed for: r1v22 */
    /* JADX WARN: Type inference failed for: r1v23 */
    /* JADX WARN: Type inference failed for: r1v36, types: [o0.e] */
    /* JADX WARN: Type inference failed for: r1v37 */
    /* JADX WARN: Type inference failed for: r1v38 */
    /* JADX WARN: Type inference failed for: r1v39 */
    /* JADX WARN: Type inference failed for: r1v40, types: [o0.e] */
    /* JADX WARN: Type inference failed for: r1v44 */
    /* JADX WARN: Type inference failed for: r1v45 */
    /* JADX WARN: Type inference failed for: r1v46 */
    /* JADX WARN: Type inference failed for: r1v47 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean d(KeyEvent keyEvent, Function0 function0) {
        c2.i iVar;
        d1.k kVar;
        b1 b1Var;
        c2.i iVar2;
        b1 b1Var2;
        int size;
        b1 b1Var3;
        boolean z10;
        t tVar = this.f4603c;
        Trace.beginSection("FocusOwnerImpl:dispatchKeyEvent");
        try {
            if (this.f4604d.f4596e) {
                System.out.println((Object) "FocusRelatedWarning: Dispatching key event while focus system is invalidated.");
                return false;
            }
            if (!i(keyEvent)) {
                return false;
            }
            t n10 = w.n(tVar);
            if (n10 != null) {
                if (!n10.f3305d.B) {
                    z1.a.b("visitLocalDescendants called on an unattached node");
                }
                d1.k kVar2 = n10.f3305d;
                if ((kVar2.f3308r & 9216) != 0) {
                    kVar = null;
                    for (d1.k kVar3 = kVar2.f3310t; kVar3 != null; kVar3 = kVar3.f3310t) {
                        int i3 = kVar3.f3307i;
                        if ((i3 & 9216) != 0) {
                            if ((i3 & 1024) != 0) {
                                break;
                            }
                            kVar = kVar3;
                        }
                    }
                } else {
                    kVar = null;
                }
            }
            if (n10 != null) {
                if (!n10.f3305d.B) {
                    z1.a.b("visitAncestors called on an unattached node");
                }
                d1.k kVar4 = n10.f3305d;
                g0 u2 = c2.k.u(n10);
                loop11: while (true) {
                    if (u2 == null) {
                        iVar2 = null;
                        break;
                    }
                    if ((((d1.k) u2.S.g).f3308r & 8192) != 0) {
                        while (kVar4 != null) {
                            if ((kVar4.f3307i & 8192) != 0) {
                                o0.e eVar = null;
                                d1.k kVar5 = kVar4;
                                while (kVar5 != null) {
                                    if (kVar5 instanceof v1.b) {
                                        iVar2 = kVar5;
                                        break loop11;
                                    }
                                    if ((kVar5.f3307i & 8192) != 0 && (kVar5 instanceof c2.j)) {
                                        d1.k kVar6 = ((c2.j) kVar5).D;
                                        int i10 = 0;
                                        kVar5 = kVar5;
                                        eVar = eVar;
                                        while (kVar6 != null) {
                                            if ((kVar6.f3307i & 8192) != 0) {
                                                i10++;
                                                eVar = eVar;
                                                if (i10 == 1) {
                                                    kVar5 = kVar6;
                                                } else {
                                                    if (eVar == null) {
                                                        eVar = new o0.e(new d1.k[16]);
                                                    }
                                                    if (kVar5 != null) {
                                                        eVar.b(kVar5);
                                                        kVar5 = null;
                                                    }
                                                    eVar.b(kVar6);
                                                }
                                            }
                                            kVar6 = kVar6.f3310t;
                                            kVar5 = kVar5;
                                            eVar = eVar;
                                        }
                                        if (i10 == 1) {
                                        }
                                    }
                                    kVar5 = c2.k.e(eVar);
                                }
                            }
                            kVar4 = kVar4.f3309s;
                        }
                    }
                    u2 = u2.s();
                    kVar4 = (u2 == null || (b1Var2 = u2.S) == null) ? null : (z1) b1Var2.f1495f;
                }
                c2.i iVar3 = (v1.b) iVar2;
                if (iVar3 != null) {
                    kVar = ((d1.k) iVar3).f3305d;
                    if (kVar != null) {
                        if (!kVar.f3305d.B) {
                            z1.a.b("visitAncestors called on an unattached node");
                        }
                        d1.k kVar7 = kVar.f3305d.f3309s;
                        g0 u10 = c2.k.u(kVar);
                        ArrayList arrayList = null;
                        while (u10 != null) {
                            if ((((d1.k) u10.S.g).f3308r & 8192) != 0) {
                                while (kVar7 != null) {
                                    if ((kVar7.f3307i & 8192) != 0) {
                                        d1.k kVar8 = kVar7;
                                        o0.e eVar2 = null;
                                        while (kVar8 != null) {
                                            if (kVar8 instanceof v1.b) {
                                                if (arrayList == null) {
                                                    arrayList = new ArrayList();
                                                }
                                                arrayList.add(kVar8);
                                                z10 = false;
                                            } else {
                                                z10 = true;
                                            }
                                            if (z10 && (kVar8.f3307i & 8192) != 0 && (kVar8 instanceof c2.j)) {
                                                int i11 = 0;
                                                for (d1.k kVar9 = ((c2.j) kVar8).D; kVar9 != null; kVar9 = kVar9.f3310t) {
                                                    if ((kVar9.f3307i & 8192) != 0) {
                                                        i11++;
                                                        if (i11 == 1) {
                                                            kVar8 = kVar9;
                                                        } else {
                                                            if (eVar2 == null) {
                                                                eVar2 = new o0.e(new d1.k[16]);
                                                            }
                                                            if (kVar8 != null) {
                                                                eVar2.b(kVar8);
                                                                kVar8 = null;
                                                            }
                                                            eVar2.b(kVar9);
                                                        }
                                                    }
                                                }
                                                if (i11 == 1) {
                                                }
                                            }
                                            kVar8 = c2.k.e(eVar2);
                                        }
                                    }
                                    kVar7 = kVar7.f3309s;
                                }
                            }
                            u10 = u10.s();
                            kVar7 = (u10 == null || (b1Var3 = u10.S) == null) ? null : (z1) b1Var3.f1495f;
                        }
                        if (arrayList != null && arrayList.size() - 1 >= 0) {
                            while (true) {
                                int i12 = size - 1;
                                ((v1.b) arrayList.get(size)).getClass();
                                if (i12 < 0) {
                                    break;
                                }
                                size = i12;
                            }
                        }
                        c2.j jVar = kVar.f3305d;
                        ?? r12 = 0;
                        while (jVar != 0) {
                            if (jVar instanceof v1.b) {
                            } else if ((jVar.f3307i & 8192) != 0 && (jVar instanceof c2.j)) {
                                d1.k kVar10 = jVar.D;
                                int i13 = 0;
                                jVar = jVar;
                                r12 = r12;
                                while (kVar10 != null) {
                                    if ((kVar10.f3307i & 8192) != 0) {
                                        i13++;
                                        r12 = r12;
                                        if (i13 == 1) {
                                            jVar = kVar10;
                                        } else {
                                            if (r12 == 0) {
                                                r12 = new o0.e(new d1.k[16]);
                                            }
                                            if (jVar != 0) {
                                                r12.b(jVar);
                                                jVar = 0;
                                            }
                                            r12.b(kVar10);
                                        }
                                    }
                                    kVar10 = kVar10.f3310t;
                                    jVar = jVar;
                                    r12 = r12;
                                }
                                if (i13 == 1) {
                                }
                            }
                            jVar = c2.k.e(r12);
                        }
                        if (((Boolean) function0.invoke()).booleanValue()) {
                            return true;
                        }
                        c2.j jVar2 = kVar.f3305d;
                        ?? r02 = 0;
                        while (jVar2 != 0) {
                            if (jVar2 instanceof v1.b) {
                                if (((v1.b) jVar2).i(keyEvent)) {
                                    return true;
                                }
                            } else if ((jVar2.f3307i & 8192) != 0 && (jVar2 instanceof c2.j)) {
                                d1.k kVar11 = jVar2.D;
                                int i14 = 0;
                                r02 = r02;
                                jVar2 = jVar2;
                                while (kVar11 != null) {
                                    if ((kVar11.f3307i & 8192) != 0) {
                                        i14++;
                                        r02 = r02;
                                        if (i14 == 1) {
                                            jVar2 = kVar11;
                                        } else {
                                            if (r02 == 0) {
                                                r02 = new o0.e(new d1.k[16]);
                                            }
                                            if (jVar2 != 0) {
                                                r02.b(jVar2);
                                                jVar2 = 0;
                                            }
                                            r02.b(kVar11);
                                        }
                                    }
                                    kVar11 = kVar11.f3310t;
                                    r02 = r02;
                                    jVar2 = jVar2;
                                }
                                if (i14 == 1) {
                                }
                            }
                            jVar2 = c2.k.e(r02);
                        }
                        if (arrayList != null) {
                            int size2 = arrayList.size();
                            for (int i15 = 0; i15 < size2; i15++) {
                                if (((v1.b) arrayList.get(i15)).i(keyEvent)) {
                                    return true;
                                }
                            }
                        }
                    }
                    return false;
                }
            }
            if (!tVar.f3305d.B) {
                z1.a.b("visitAncestors called on an unattached node");
            }
            d1.k kVar12 = tVar.f3305d.f3309s;
            g0 u11 = c2.k.u(tVar);
            loop15: while (true) {
                if (u11 == null) {
                    iVar = null;
                    break;
                }
                if ((((d1.k) u11.S.g).f3308r & 8192) != 0) {
                    while (kVar12 != null) {
                        if ((kVar12.f3307i & 8192) != 0) {
                            d1.k kVar13 = kVar12;
                            o0.e eVar3 = null;
                            while (kVar13 != null) {
                                if (kVar13 instanceof v1.b) {
                                    iVar = kVar13;
                                    break loop15;
                                }
                                if ((kVar13.f3307i & 8192) != 0 && (kVar13 instanceof c2.j)) {
                                    d1.k kVar14 = ((c2.j) kVar13).D;
                                    int i16 = 0;
                                    kVar13 = kVar13;
                                    eVar3 = eVar3;
                                    while (kVar14 != null) {
                                        if ((kVar14.f3307i & 8192) != 0) {
                                            i16++;
                                            eVar3 = eVar3;
                                            if (i16 == 1) {
                                                kVar13 = kVar14;
                                            } else {
                                                if (eVar3 == null) {
                                                    eVar3 = new o0.e(new d1.k[16]);
                                                }
                                                if (kVar13 != null) {
                                                    eVar3.b(kVar13);
                                                    kVar13 = null;
                                                }
                                                eVar3.b(kVar14);
                                            }
                                        }
                                        kVar14 = kVar14.f3310t;
                                        kVar13 = kVar13;
                                        eVar3 = eVar3;
                                    }
                                    if (i16 == 1) {
                                    }
                                }
                                kVar13 = c2.k.e(eVar3);
                            }
                        }
                        kVar12 = kVar12.f3309s;
                    }
                }
                u11 = u11.s();
                kVar12 = (u11 == null || (b1Var = u11.S) == null) ? null : (z1) b1Var.f1495f;
            }
            c2.i iVar4 = (v1.b) iVar;
            kVar = iVar4 != null ? ((d1.k) iVar4).f3305d : null;
            if (kVar != null) {
            }
            return false;
        } finally {
            Trace.endSection();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:86:0x011a, code lost:
    
        continue;
     */
    /* JADX WARN: Type inference failed for: r6v14, types: [kotlin.jvm.functions.Function1, wd.p] */
    /* JADX WARN: Type inference failed for: r6v20, types: [kotlin.jvm.functions.Function1, wd.p] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Boolean e(int i3, j1.c cVar, Function1 function1) {
        boolean h10;
        t tVar;
        b1 b1Var;
        t tVar2 = this.f4603c;
        t n10 = w.n(tVar2);
        int i10 = 4;
        v vVar = this.f4602b;
        boolean z10 = false;
        if (n10 != null) {
            x2.l layoutDirection = vVar.getLayoutDirection();
            o K = n10.K();
            q qVar = K.f4618h;
            q qVar2 = K.f4619i;
            if (i3 == 1) {
                qVar = K.f4613b;
            } else if (i3 == 2) {
                qVar = K.f4614c;
            } else if (i3 == 5) {
                qVar = K.f4615d;
            } else if (i3 == 6) {
                qVar = K.f4616e;
            } else if (i3 == 3) {
                int ordinal = layoutDirection.ordinal();
                if (ordinal != 0) {
                    if (ordinal != 1) {
                        a2.r.p();
                        return null;
                    }
                    qVar = qVar2;
                }
                if (qVar == q.f4622b) {
                    qVar = null;
                }
                if (qVar == null) {
                    qVar = K.f4617f;
                }
            } else if (i3 == 4) {
                int ordinal2 = layoutDirection.ordinal();
                if (ordinal2 == 0) {
                    qVar = qVar2;
                } else if (ordinal2 != 1) {
                    a2.r.p();
                    return null;
                }
                if (qVar == q.f4622b) {
                    qVar = null;
                }
                if (qVar == null) {
                    qVar = K.g;
                }
            } else {
                if (i3 != 7 && i3 != 8) {
                    i0.l("invalid FocusDirection");
                    return null;
                }
                a aVar = new a(i3);
                k kVar = (k) c2.k.v(n10).getFocusOwner();
                t f3 = kVar.f();
                if (i3 == 7) {
                    K.j.invoke(aVar);
                } else {
                    K.f4620k.invoke(aVar);
                }
                qVar = aVar.f4584b ? q.f4623c : f3 != kVar.f() ? q.f4624d : q.f4622b;
            }
            q qVar3 = q.f4623c;
            if (!Intrinsics.a(qVar, qVar3)) {
                if (Intrinsics.a(qVar, q.f4624d)) {
                    t n11 = w.n(tVar2);
                    if (n11 != null) {
                        return (Boolean) function1.invoke(n11);
                    }
                } else {
                    q qVar4 = q.f4622b;
                    if (!Intrinsics.a(qVar, qVar4)) {
                        if (qVar == qVar4) {
                            i0.l("\n    Please check whether the focusRequester is FocusRequester.Cancel or FocusRequester.Default\n    before invoking any functions on the focusRequester.\n");
                            return null;
                        }
                        if (qVar == qVar3) {
                            i0.l("\n    Please check whether the focusRequester is FocusRequester.Cancel or FocusRequester.Default\n    before invoking any functions on the focusRequester.\n");
                            return null;
                        }
                        o0.e eVar = qVar.f4625a;
                        int i11 = eVar.f7319i;
                        if (i11 == 0) {
                            System.out.println((Object) "FocusRelatedWarning: \n   FocusRequester is not initialized. Here are some possible fixes:\n\n   1. Remember the FocusRequester: val focusRequester = remember { FocusRequester() }\n   2. Did you forget to add a Modifier.focusRequester() ?\n   3. Are you attempting to request focus during composition? Focus requests should be made in\n   response to some event. Eg Modifier.clickable { focusRequester.requestFocus() }\n");
                        } else {
                            Object[] objArr = eVar.f7317d;
                            boolean z11 = false;
                            for (int i12 = 0; i12 < i11; i12++) {
                                c2.b bVar = (c2.b) objArr[i12];
                                if (!bVar.f3305d.B) {
                                    z1.a.b("visitChildren called on an unattached node");
                                }
                                o0.e eVar2 = new o0.e(new d1.k[16]);
                                d1.k kVar2 = bVar.f3305d;
                                d1.k kVar3 = kVar2.f3310t;
                                if (kVar3 == null) {
                                    c2.k.b(eVar2, kVar2);
                                } else {
                                    eVar2.b(kVar3);
                                }
                                while (true) {
                                    int i13 = eVar2.f7319i;
                                    if (i13 != 0) {
                                        d1.k kVar4 = (d1.k) eVar2.l(i13 - 1);
                                        if ((kVar4.f3308r & 1024) == 0) {
                                            c2.k.b(eVar2, kVar4);
                                        } else {
                                            while (true) {
                                                if (kVar4 == null) {
                                                    break;
                                                }
                                                if ((kVar4.f3307i & 1024) != 0) {
                                                    o0.e eVar3 = null;
                                                    while (kVar4 != null) {
                                                        if (kVar4 instanceof t) {
                                                            if (((Boolean) function1.invoke((t) kVar4)).booleanValue()) {
                                                                z11 = true;
                                                                break;
                                                            }
                                                        } else if ((kVar4.f3307i & 1024) != 0 && (kVar4 instanceof c2.j)) {
                                                            int i14 = 0;
                                                            for (d1.k kVar5 = ((c2.j) kVar4).D; kVar5 != null; kVar5 = kVar5.f3310t) {
                                                                if ((kVar5.f3307i & 1024) != 0) {
                                                                    i14++;
                                                                    if (i14 == 1) {
                                                                        kVar4 = kVar5;
                                                                    } else {
                                                                        if (eVar3 == null) {
                                                                            eVar3 = new o0.e(new d1.k[16]);
                                                                        }
                                                                        if (kVar4 != null) {
                                                                            eVar3.b(kVar4);
                                                                            kVar4 = null;
                                                                        }
                                                                        eVar3.b(kVar5);
                                                                    }
                                                                }
                                                            }
                                                            if (i14 == 1) {
                                                            }
                                                        }
                                                        kVar4 = c2.k.e(eVar3);
                                                    }
                                                } else {
                                                    kVar4 = kVar4.f3310t;
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                            z10 = z11;
                        }
                        return Boolean.valueOf(z10);
                    }
                }
            }
            return null;
        }
        n10 = null;
        x2.l layoutDirection2 = vVar.getLayoutDirection();
        a3.i iVar = new a3.i(n10, this, function1);
        if (i3 == 1 || i3 == 2) {
            if (i3 == 1) {
                h10 = a.a.v(tVar2, iVar);
            } else {
                if (i3 != 2) {
                    i0.l("This function should only be used for 1-D focus search");
                    return null;
                }
                h10 = a.a.h(tVar2, iVar);
            }
            return Boolean.valueOf(h10);
        }
        if (i3 == 3 || i3 == 4 || i3 == 5 || i3 == 6) {
            return c6.f.f0(i3, iVar, tVar2, cVar);
        }
        if (i3 == 7) {
            int ordinal3 = layoutDirection2.ordinal();
            if (ordinal3 != 0) {
                if (ordinal3 != 1) {
                    a2.r.p();
                    return null;
                }
                i10 = 3;
            }
            t n12 = w.n(tVar2);
            if (n12 != null) {
                return c6.f.f0(i10, iVar, n12, cVar);
            }
            return null;
        }
        if (i3 != 8) {
            a1.h(c.a(i3), "Focus search invoked with invalid FocusDirection ");
            return null;
        }
        t n13 = w.n(tVar2);
        if (n13 != null) {
            if (!n13.f3305d.B) {
                z1.a.b("visitAncestors called on an unattached node");
            }
            d1.k kVar6 = n13.f3305d.f3309s;
            g0 u2 = c2.k.u(n13);
            loop5: while (u2 != null) {
                if ((((d1.k) u2.S.g).f3308r & 1024) != 0) {
                    while (kVar6 != null) {
                        if ((kVar6.f3307i & 1024) != 0) {
                            d1.k kVar7 = kVar6;
                            o0.e eVar4 = null;
                            while (kVar7 != null) {
                                if (kVar7 instanceof t) {
                                    t tVar3 = (t) kVar7;
                                    if (tVar3.K().f4612a) {
                                        tVar = tVar3;
                                        break loop5;
                                    }
                                } else if ((kVar7.f3307i & 1024) != 0 && (kVar7 instanceof c2.j)) {
                                    int i15 = 0;
                                    for (d1.k kVar8 = ((c2.j) kVar7).D; kVar8 != null; kVar8 = kVar8.f3310t) {
                                        if ((kVar8.f3307i & 1024) != 0) {
                                            i15++;
                                            if (i15 == 1) {
                                                kVar7 = kVar8;
                                            } else {
                                                if (eVar4 == null) {
                                                    eVar4 = new o0.e(new d1.k[16]);
                                                }
                                                if (kVar7 != null) {
                                                    eVar4.b(kVar7);
                                                    kVar7 = null;
                                                }
                                                eVar4.b(kVar8);
                                            }
                                        }
                                    }
                                    if (i15 != 1) {
                                        kVar7 = c2.k.e(eVar4);
                                    }
                                }
                                kVar7 = c2.k.e(eVar4);
                            }
                        }
                        kVar6 = kVar6.f3309s;
                    }
                }
                u2 = u2.s();
                kVar6 = (u2 == null || (b1Var = u2.S) == null) ? null : (z1) b1Var.f1495f;
            }
        }
        tVar = null;
        if (tVar != null && !tVar.equals(tVar2)) {
            z10 = ((Boolean) iVar.invoke(tVar)).booleanValue();
        }
        return Boolean.valueOf(z10);
    }

    public final t f() {
        t tVar = this.f4607h;
        if (tVar == null || !tVar.B) {
            return null;
        }
        return tVar;
    }

    public final boolean g(int i3) {
        if (!b(i3, false, false)) {
            return false;
        }
        Boolean e2 = e(i3, null, new d2.t(i3, 2));
        boolean booleanValue = e2 != null ? e2.booleanValue() : false;
        if (!booleanValue) {
            c();
        }
        return booleanValue;
    }

    public final void h(t tVar) {
        t tVar2 = this.f4607h;
        this.f4607h = tVar;
        d0 d0Var = this.g;
        Object[] objArr = d0Var.f8284a;
        int i3 = d0Var.f8285b;
        for (int i10 = 0; i10 < i3; i10++) {
            ((f) objArr[i10]).b(tVar2, tVar);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:100:0x034f, code lost:
    
        if (((r7 & ((~r7) << 6)) & (-9187201950435737472L)) == 0) goto L89;
     */
    /* JADX WARN: Code restructure failed: missing block: B:103:0x0351, code lost:
    
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
    
        if (r4.f8265e != 0) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x00c2, code lost:
    
        if (((r4.f8261a[r3 >> 3] >> ((r3 & 7) << 3)) & 255) != 254) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x00ca, code lost:
    
        r3 = r4.f8263c;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x00cc, code lost:
    
        if (r3 <= r5) goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x00ce, code lost:
    
        r13 = r4.f8264d;
        r8 = hd.a0.f4495e;
        r15 = 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x00e7, code lost:
    
        if (java.lang.Long.compare((r13 * 32) ^ Long.MIN_VALUE, (r3 * 25) ^ Long.MIN_VALUE) > 0) goto L48;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x00e9, code lost:
    
        r3 = r4.f8261a;
        r8 = r4.f8263c;
        r9 = r4.f8262b;
        r10 = (r8 + 7) >> 3;
        r13 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00f5, code lost:
    
        if (r13 >= r10) goto L96;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x00f7, code lost:
    
        r14 = r5;
        r5 = r3[r13] & (-9187201950435737472L);
        r3[r13] = (-72340172838076674L) & ((~r5) + (r5 >>> 7));
        r13 = r13 + 1;
        r5 = r14;
        r15 = r15;
        r6 = r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0117, code lost:
    
        r32 = r6;
        r22 = r15;
        r5 = kotlin.collections.w.o(r3);
        r6 = r5 - 1;
        r3[r6] = (r3[r6] & 72057594037927935L) | (-72057594037927936L);
        r3[r5] = r3[0];
        r5 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0138, code lost:
    
        if (r5 == r8) goto L97;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x013a, code lost:
    
        r6 = r5 >> 3;
        r10 = (r5 & 7) << 3;
        r13 = (r3[r6] >> r10) & 255;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0147, code lost:
    
        if (r13 != r22) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x014e, code lost:
    
        if (r13 == 254) goto L98;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x0151, code lost:
    
        r13 = java.lang.Long.hashCode(r9[r5]) * r31;
        r14 = (r13 ^ (r13 << 16)) >>> 7;
        r15 = r4.b(r14);
        r14 = r14 & r8;
        r33 = r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x0170, code lost:
    
        if ((((r15 - r14) & r8) / 8) != (((r5 - r14) & r8) / 8)) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x0172, code lost:
    
        r3[r6] = (r3[r6] & (~(255 << r10))) | ((r13 & 127) << r10);
        r3[r3.length - 1] = (r3[0] & 72057594037927935L) | Long.MIN_VALUE;
        r5 = r5 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x0190, code lost:
    
        r7 = r33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x0193, code lost:
    
        r7 = r5;
        r5 = r15 >> 3;
        r34 = r3[r5];
        r6 = (r15 & 7) << 3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x01a4, code lost:
    
        if (((r34 >> r6) & 255) != r22) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x01a6, code lost:
    
        r3[r5] = (r34 & (~(255 << r6))) | ((r13 & 127) << r6);
        r3[r6] = (r3[r6] & (~(255 << r10))) | (r22 << r10);
        r9[r15] = r9[r7];
        r9[r7] = r36;
        r5 = r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x01e5, code lost:
    
        r3[r3.length - 1] = (r3[0] & 72057594037927935L) | Long.MIN_VALUE;
        r5 = r5 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x01ca, code lost:
    
        r3[r5] = ((r13 & 127) << r6) | (r34 & (~(255 << r6)));
        r5 = r9[r15];
        r9[r15] = r9[r7];
        r9[r7] = r5;
        r5 = r7 - 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x0149, code lost:
    
        r5 = r5 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x01f3, code lost:
    
        r33 = r7;
        r4.f8265e = s.p0.a(r4.f8263c) - r4.f8264d;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x0283, code lost:
    
        r3 = r4.b(r32);
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x0287, code lost:
    
        r32 = r3;
        r4.f8264d++;
        r3 = r4.f8265e;
        r5 = r4.f8261a;
        r6 = r32 >> 3;
        r7 = r5[r6];
        r9 = (r32 & 7) << 3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x02a1, code lost:
    
        if (((r7 >> r9) & 255) != r22) goto L62;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x02a3, code lost:
    
        r21 = r33 ? 1 : 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x02a5, code lost:
    
        r4.f8265e = r3 - r21;
        r3 = r4.f8263c;
        r7 = (r7 & (~(255 << r9))) | (r11 << r9);
        r5[r6] = r7;
        r5[(((r32 - 7) & r3) + (r3 & 7)) >> 3] = r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x0204, code lost:
    
        r22 = 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x0206, code lost:
    
        r32 = r6;
        r33 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x020e, code lost:
    
        r3 = s.p0.b(r4.f8263c);
        r5 = r4.f8261a;
        r6 = r4.f8262b;
        r7 = r4.f8263c;
        r4.c(r3);
        r3 = r4.f8261a;
        r8 = r4.f8262b;
        r9 = r4.f8263c;
        r10 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x0225, code lost:
    
        if (r10 >= r7) goto L104;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x0234, code lost:
    
        if (((r5[r10 >> 3] >> ((r10 & 7) << 3)) & 255) >= r22) goto L56;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x0236, code lost:
    
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
    /* JADX WARN: Code restructure failed: missing block: B:73:0x027a, code lost:
    
        r10 = r10 + 1;
        r3 = r16;
        r5 = r17;
        r6 = r18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x0274, code lost:
    
        r16 = r3;
        r17 = r5;
        r18 = r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x020b, code lost:
    
        r22 = 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x00c4, code lost:
    
        r33 = true;
        r22 = 128;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean i(KeyEvent keyEvent) {
        int i3;
        long j;
        boolean z10;
        int i10;
        long e2 = cf.c.e(keyEvent.getKeyCode());
        int K = c6.f.K(keyEvent);
        int i11 = -862048943;
        long j3 = 0;
        int i12 = 8;
        int i13 = 0;
        boolean z11 = true;
        if (K == 2) {
            a0 a0Var = this.f4606f;
            if (a0Var == null) {
                a0Var = new a0(3);
                this.f4606f = a0Var;
            }
            a0 a0Var2 = a0Var;
            int hashCode = Long.hashCode(e2) * (-862048943);
            int i14 = hashCode ^ (hashCode << 16);
            int i15 = i14 >>> 7;
            int i16 = i14 & 127;
            int i17 = a0Var2.f8263c;
            int i18 = i15 & i17;
            int i19 = 0;
            loop0: while (true) {
                long[] jArr = a0Var2.f8261a;
                int i20 = i18 >> 3;
                int i21 = i11;
                int i22 = (i18 & 7) << 3;
                long j10 = (jArr[i20] >>> i22) | ((jArr[i20 + 1] << (64 - i22)) & ((-i22) >> 63));
                long j11 = i16;
                long j12 = j10 ^ (j11 * 72340172838076673L);
                long j13 = (j12 - 72340172838076673L) & (~j12) & (-9187201950435737472L);
                while (true) {
                    if (j13 == j3) {
                        break;
                    }
                    i10 = (i18 + (Long.numberOfTrailingZeros(j13) >> 3)) & i17;
                    long j14 = j3;
                    if (a0Var2.f8262b[i10] == e2) {
                        z10 = true;
                        break loop0;
                    }
                    j13 &= j13 - 1;
                    j3 = j14;
                }
                i19 += 8;
                i18 = (i18 + i19) & i17;
                i12 = i12;
                i11 = i21;
                j3 = j;
            }
            a0Var2.f8262b[i10] = e2;
            return z10;
        }
        if (K != 1) {
            return true;
        }
        a0 a0Var3 = this.f4606f;
        if (a0Var3 == null || !a0Var3.a(e2)) {
            return false;
        }
        a0 a0Var4 = this.f4606f;
        if (a0Var4 != null) {
            int hashCode2 = Long.hashCode(e2) * (-862048943);
            int i23 = hashCode2 ^ (hashCode2 << 16);
            int i24 = i23 & 127;
            int i25 = a0Var4.f8263c;
            int i26 = i23 >>> 7;
            loop5: while (true) {
                int i27 = i26 & i25;
                long[] jArr2 = a0Var4.f8261a;
                int i28 = i27 >> 3;
                int i29 = (i27 & 7) << 3;
                long j15 = ((jArr2[i28 + 1] << (64 - i29)) & ((-i29) >> 63)) | (jArr2[i28] >>> i29);
                long j16 = (i24 * 72340172838076673L) ^ j15;
                long j17 = (~j16) & (j16 - 72340172838076673L) & (-9187201950435737472L);
                while (true) {
                    if (j17 == 0) {
                        break;
                    }
                    i3 = ((Long.numberOfTrailingZeros(j17) >> 3) + i27) & i25;
                    if (a0Var4.f8262b[i3] == e2) {
                        break loop5;
                    }
                    j17 &= j17 - 1;
                }
                i13 += 8;
                i26 = i27 + i13;
            }
            if (i3 >= 0) {
                a0Var4.f8264d--;
                long[] jArr3 = a0Var4.f8261a;
                int i30 = a0Var4.f8263c;
                int i31 = i3 >> 3;
                int i32 = (i3 & 7) << 3;
                long j18 = (jArr3[i31] & (~(255 << i32))) | (254 << i32);
                jArr3[i31] = j18;
                jArr3[(((i3 - 7) & i30) + (i30 & 7)) >> 3] = j18;
                return true;
            }
        }
        return true;
    }
}
