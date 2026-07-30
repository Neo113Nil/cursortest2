package g0;

import android.os.Trace;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class t {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3890a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f3891b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f3892c;

    /* renamed from: d, reason: collision with root package name */
    public Object f3893d;

    /* renamed from: e, reason: collision with root package name */
    public final Object f3894e;

    /* renamed from: f, reason: collision with root package name */
    public Object f3895f;

    /* renamed from: g, reason: collision with root package name */
    public Object f3896g;

    /* renamed from: h, reason: collision with root package name */
    public Object f3897h;

    /* renamed from: i, reason: collision with root package name */
    public Object f3898i;

    public t(r1.d0 d0Var) {
        this.f3890a = 1;
        this.f3891b = d0Var;
        r1.t tVar = new r1.t(d0Var);
        this.f3892c = tVar;
        this.f3893d = tVar;
        r1.o1 o1Var = tVar.O;
        this.f3894e = o1Var;
        this.f3895f = o1Var;
    }

    public static final void a(t tVar, s0.n nVar, r1.a1 a1Var) {
        for (s0.n nVar2 = nVar.f8108j; nVar2 != null; nVar2 = nVar2.f8108j) {
            if (nVar2 == r1.w0.f7910a) {
                r1.d0 s5 = ((r1.d0) tVar.f3891b).s();
                a1Var.f7702s = s5 != null ? (r1.t) s5.A.f3892c : null;
                tVar.f3893d = a1Var;
                return;
            } else {
                if ((nVar2.f8106h & 2) != 0) {
                    return;
                }
                nVar2.z0(a1Var);
            }
        }
    }

    public static s0.n b(s0.m mVar, s0.n nVar) {
        s0.n nVar2;
        if (mVar instanceof r1.s0) {
            nVar2 = ((r1.s0) mVar).l();
            nVar2.f8106h = r1.b1.g(nVar2);
        } else {
            r1.c cVar = new r1.c();
            cVar.f8106h = r1.b1.e(mVar);
            cVar.f7714s = mVar;
            cVar.f7716u = new HashSet();
            nVar2 = cVar;
        }
        if (nVar2.f8116r) {
            a.a.M("A ModifierNodeElement cannot return an already attached node from create() ");
            throw null;
        }
        nVar2.f8112n = true;
        s0.n nVar3 = nVar.f8109k;
        if (nVar3 != null) {
            nVar3.f8108j = nVar2;
            nVar2.f8109k = nVar3;
        }
        nVar.f8109k = nVar2;
        nVar2.f8108j = nVar;
        return nVar2;
    }

    public static s0.n c(s0.n nVar) {
        boolean z8 = nVar.f8116r;
        if (z8) {
            i.u uVar = r1.b1.f7713a;
            if (!z8) {
                a.a.M("autoInvalidateRemovedNode called on unattached node");
                throw null;
            }
            r1.b1.b(nVar, -1, 2);
            nVar.x0();
            nVar.r0();
        }
        s0.n nVar2 = nVar.f8109k;
        s0.n nVar3 = nVar.f8108j;
        if (nVar2 != null) {
            nVar2.f8108j = nVar3;
            nVar.f8109k = null;
        }
        if (nVar3 != null) {
            nVar3.f8109k = nVar2;
            nVar.f8108j = null;
        }
        r6.k.c(nVar3);
        return nVar3;
    }

    public static void l(s0.m mVar, s0.m mVar2, s0.n nVar) {
        if ((mVar instanceof r1.s0) && (mVar2 instanceof r1.s0)) {
            r1.v0 v0Var = r1.w0.f7910a;
            r6.k.d(nVar, "null cannot be cast to non-null type T of androidx.compose.ui.node.NodeChainKt.updateUnsafe");
            ((r1.s0) mVar2).m(nVar);
            if (nVar.f8116r) {
                r1.b1.d(nVar);
                return;
            } else {
                nVar.f8113o = true;
                return;
            }
        }
        if (!(nVar instanceof r1.c)) {
            throw new IllegalStateException("Unknown Modifier.Node type");
        }
        r1.c cVar = (r1.c) nVar;
        if (cVar.f8116r) {
            cVar.B0();
        }
        cVar.f7714s = mVar2;
        cVar.f8106h = r1.b1.e(mVar2);
        if (cVar.f8116r) {
            cVar.A0(false);
        }
        if (nVar.f8116r) {
            r1.b1.d(nVar);
        } else {
            nVar.f8113o = true;
        }
    }

    public void d() {
        Set set = (Set) this.f3891b;
        if (set.isEmpty()) {
            return;
        }
        Trace.beginSection("Compose:abandons");
        try {
            Iterator it = set.iterator();
            while (it.hasNext()) {
                u1 u1Var = (u1) it.next();
                it.remove();
                u1Var.b();
            }
        } finally {
            Trace.endSection();
        }
    }

    public void e() {
        ArrayList arrayList = (ArrayList) this.f3892c;
        Set set = (Set) this.f3891b;
        g(Integer.MIN_VALUE);
        ArrayList arrayList2 = (ArrayList) this.f3893d;
        if (!arrayList2.isEmpty()) {
            Trace.beginSection("Compose:onForgotten");
            try {
                i.b0 b0Var = (i.b0) this.f3896g;
                int size = arrayList2.size();
                while (true) {
                    size--;
                    if (-1 >= size) {
                        break;
                    }
                    Object obj = arrayList2.get(size);
                    if (obj instanceof u1) {
                        set.remove(obj);
                        ((u1) obj).c();
                    }
                    if (obj instanceof j) {
                        if (b0Var == null || !b0Var.c(obj)) {
                            ((j) obj).c();
                        } else {
                            ((j) obj).b();
                        }
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (arrayList.isEmpty()) {
            return;
        }
        Trace.beginSection("Compose:onRemembered");
        try {
            int size2 = arrayList.size();
            for (int i7 = 0; i7 < size2; i7++) {
                u1 u1Var = (u1) arrayList.get(i7);
                set.remove(u1Var);
                u1Var.a();
            }
        } finally {
            Trace.endSection();
        }
    }

    public boolean f(int i7) {
        return (i7 & ((s0.n) this.f3895f).f8107i) != 0;
    }

    public void g(int i7) {
        i.o oVar = (i.o) this.f3898i;
        ArrayList arrayList = (ArrayList) this.f3895f;
        if (arrayList.isEmpty()) {
            return;
        }
        int i8 = 0;
        ArrayList arrayList2 = null;
        int i9 = 0;
        i.o oVar2 = null;
        i.o oVar3 = null;
        while (i9 < oVar.f4769b) {
            if (i7 <= oVar.c(i9)) {
                Object remove = arrayList.remove(i9);
                int d8 = oVar.d(i9);
                int d9 = ((i.o) this.f3897h).d(i9);
                if (arrayList2 == null) {
                    arrayList2 = e6.m.Y(remove);
                    oVar3 = new i.o();
                    oVar3.a(d8);
                    oVar2 = new i.o();
                    oVar2.a(d9);
                } else {
                    r6.k.d(oVar2, "null cannot be cast to non-null type androidx.collection.MutableIntList");
                    r6.k.d(oVar3, "null cannot be cast to non-null type androidx.collection.MutableIntList");
                    arrayList2.add(remove);
                    oVar3.a(d8);
                    oVar2.a(d9);
                }
            } else {
                i9++;
            }
        }
        if (arrayList2 != null) {
            r6.k.d(oVar2, "null cannot be cast to non-null type androidx.collection.MutableIntList");
            r6.k.d(oVar3, "null cannot be cast to non-null type androidx.collection.MutableIntList");
            int size = arrayList2.size() - 1;
            while (i8 < size) {
                int i10 = i8 + 1;
                int size2 = arrayList2.size();
                for (int i11 = i10; i11 < size2; i11++) {
                    int c4 = oVar3.c(i8);
                    int c6 = oVar3.c(i11);
                    if (c4 < c6 || (c6 == c4 && oVar2.c(i8) < oVar2.c(i11))) {
                        Object obj = arrayList2.get(i8);
                        arrayList2.set(i8, arrayList2.get(i11));
                        arrayList2.set(i11, obj);
                        int c9 = oVar2.c(i8);
                        oVar2.e(i8, oVar2.c(i11));
                        oVar2.e(i11, c9);
                        int c10 = oVar3.c(i8);
                        oVar3.e(i8, oVar3.c(i11));
                        oVar3.e(i11, c10);
                    }
                }
                i8 = i10;
            }
            ((ArrayList) this.f3893d).addAll(arrayList2);
        }
    }

    public void h(Object obj, int i7, int i8, int i9) {
        g(i7);
        if (i9 < 0 || i9 >= i7) {
            ((ArrayList) this.f3893d).add(obj);
            return;
        }
        ((ArrayList) this.f3895f).add(obj);
        ((i.o) this.f3897h).a(i8);
        ((i.o) this.f3898i).a(i9);
    }

    public void i() {
        for (s0.n nVar = (s0.n) this.f3895f; nVar != null; nVar = nVar.f8109k) {
            nVar.w0();
            if (nVar.f8112n) {
                r1.b1.a(nVar);
            }
            if (nVar.f8113o) {
                r1.b1.d(nVar);
            }
            nVar.f8112n = false;
            nVar.f8113o = false;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:100:0x01bc, code lost:
    
        r26[r33] = r14;
        r11 = 1;
        r26[1] = r27;
        r26[r32] = r22;
        r26[3] = r25;
        r26[4] = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:102:0x021c, code lost:
    
        r13 = r28 + 2;
        r11 = r24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:107:0x01a6, code lost:
    
        r27 = r11;
        r28 = r13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:109:0x0185, code lost:
    
        r25 = r22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:110:0x0170, code lost:
    
        r11 = r20[(r13 + 1) + r17];
        r14 = r11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:111:0x0163, code lost:
    
        r24 = r11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:112:0x016e, code lost:
    
        r24 = r11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:114:0x0222, code lost:
    
        r3 = r3 + 1;
        r12 = r20;
        r11 = r21;
        r13 = r26;
        r14 = r29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:115:0x0149, code lost:
    
        r11 = r33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x00cd, code lost:
    
        if (r16[(r11 + 1) + r17] > r16[(r25 - 1) + r17]) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x013f, code lost:
    
        r26 = r13;
        r29 = r14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x0145, code lost:
    
        if ((r19 % 2) != 0) goto L57;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x0147, code lost:
    
        r11 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x014b, code lost:
    
        r13 = r12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x014c, code lost:
    
        if (r13 > r3) goto L164;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x014e, code lost:
    
        if (r13 == r12) goto L67;
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x0150, code lost:
    
        if (r13 == r3) goto L65;
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x0152, code lost:
    
        r24 = r11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x0160, code lost:
    
        if (r20[(r13 + 1) + r17] >= r20[(r13 - 1) + r17]) goto L66;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x0165, code lost:
    
        r11 = r20[(r13 - 1) + r17];
        r14 = r11 - 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x0177, code lost:
    
        r22 = r10 - ((r6 - r14) - r13);
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x017d, code lost:
    
        if (r3 == 0) goto L74;
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x017f, code lost:
    
        if (r14 == r11) goto L73;
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x0182, code lost:
    
        r25 = r22 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x0187, code lost:
    
        r22 = r11;
        r11 = r22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x018d, code lost:
    
        if (r14 <= r7) goto L169;
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x018f, code lost:
    
        if (r11 <= r15) goto L171;
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x0191, code lost:
    
        r27 = r11;
        r28 = r13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x019d, code lost:
    
        if (r0.a(r14 - 1, r27 - 1) == false) goto L170;
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x019f, code lost:
    
        r14 = r14 - 1;
        r11 = r27 - 1;
        r13 = r28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x01aa, code lost:
    
        r20[r17 + r28] = r14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x01ae, code lost:
    
        if (r24 == 0) goto L165;
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x01b0, code lost:
    
        r11 = r19 - r28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x01b2, code lost:
    
        if (r11 < r12) goto L166;
     */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x01b4, code lost:
    
        if (r11 > r3) goto L167;
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x01ba, code lost:
    
        if (r16[r17 + r11] < r14) goto L168;
     */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0113  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0135  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void j(int i7, i0.d dVar, i0.d dVar2, s0.n nVar, boolean z8) {
        int i8;
        i0.d dVar3;
        i0.d dVar4;
        int i9;
        int[] iArr;
        int[] iArr2;
        char c4;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        r1.u0 u0Var = (r1.u0) this.f3898i;
        if (u0Var == null) {
            i8 = i7;
            dVar3 = dVar;
            dVar4 = dVar2;
            u0Var = new r1.u0(this, nVar, i8, dVar3, dVar4, z8);
            this.f3898i = u0Var;
        } else {
            i8 = i7;
            dVar3 = dVar;
            dVar4 = dVar2;
            u0Var.f7904a = nVar;
            u0Var.f7905b = i8;
            u0Var.f7906c = dVar3;
            u0Var.f7907d = dVar4;
            u0Var.f7908e = z8;
        }
        t tVar = u0Var.f7909f;
        int i15 = dVar3.f4842h - i8;
        int i16 = dVar4.f4842h - i8;
        char c6 = 2;
        int i17 = ((i15 + i16) + 1) / 2;
        m0 m0Var = new m0(i17 * 3);
        m0 m0Var2 = new m0(i17 * 4);
        int i18 = 0;
        m0Var2.d(0, i15, 0, i16);
        int i19 = (i17 * 2) + 1;
        int[] iArr3 = new int[i19];
        int[] iArr4 = new int[i19];
        int[] iArr5 = new int[5];
        while (true) {
            int i20 = m0Var2.f3793b;
            if (i20 == 0) {
                break;
            }
            char c9 = c6;
            int[] iArr6 = m0Var2.f3792a;
            int i21 = i18;
            int i22 = i20 - 1;
            m0Var2.f3793b = i22;
            int i23 = iArr6[i22];
            int i24 = i20 - 2;
            m0Var2.f3793b = i24;
            int i25 = iArr6[i24];
            int i26 = i20 - 3;
            m0Var2.f3793b = i26;
            int i27 = iArr6[i26];
            int i28 = i20 - 4;
            m0Var2.f3793b = i28;
            int i29 = iArr6[i28];
            int i30 = i27 - i29;
            int i31 = i19;
            int i32 = i23 - i25;
            int[] iArr7 = iArr3;
            if (i30 >= 1 && i32 >= 1) {
                int i33 = ((i30 + i32) + 1) / 2;
                int i34 = i31 / 2;
                int i35 = i34 + 1;
                iArr7[i35] = i29;
                iArr4[i35] = i27;
                int i36 = i21;
                while (i36 < i33) {
                    int i37 = i30 - i32;
                    int i38 = i33;
                    iArr = iArr4;
                    int i39 = -i36;
                    int i40 = Math.abs(i37) % 2 == 1 ? 1 : i21;
                    int i41 = i39;
                    while (true) {
                        if (i41 > i36) {
                            break;
                        }
                        if (i41 != i39) {
                            if (i41 != i36) {
                                i10 = i41;
                                iArr2 = iArr5;
                            } else {
                                i10 = i41;
                                iArr2 = iArr5;
                            }
                            i11 = iArr7[(i10 - 1) + i34];
                            i12 = i11 + 1;
                            int i42 = ((i12 - i29) + i25) - i10;
                            int i43 = (i36 == 0 && i12 == i11) ? i42 - 1 : i42;
                            int i44 = i11;
                            i13 = i42;
                            while (i12 < i27 && i13 < i23 && u0Var.a(i12, i13)) {
                                i12++;
                                i13++;
                            }
                            iArr7[i34 + i10] = i12;
                            if (i40 == 0) {
                                int i45 = i13;
                                int i46 = i37 - i10;
                                i14 = i30;
                                if (i46 >= i39 + 1 && i46 <= i36 - 1 && iArr[i34 + i46] <= i12) {
                                    iArr2[i21] = i44;
                                    iArr2[1] = i43;
                                    iArr2[c9] = i12;
                                    iArr2[3] = i45;
                                    iArr2[4] = i21;
                                    c4 = 1;
                                    break;
                                }
                            } else {
                                i14 = i30;
                            }
                            i41 = i10 + 2;
                            iArr5 = iArr2;
                            i30 = i14;
                        } else {
                            i10 = i41;
                            iArr2 = iArr5;
                        }
                        i11 = iArr7[i10 + 1 + i34];
                        i12 = i11;
                        int i422 = ((i12 - i29) + i25) - i10;
                        if (i36 == 0) {
                        }
                        int i442 = i11;
                        i13 = i422;
                        while (i12 < i27) {
                            i12++;
                            i13++;
                        }
                        iArr7[i34 + i10] = i12;
                        if (i40 == 0) {
                        }
                        i41 = i10 + 2;
                        iArr5 = iArr2;
                        i30 = i14;
                    }
                    if (r1.f.l(iArr2) > 0) {
                        int i47 = iArr2[3];
                        int i48 = iArr2[c4];
                        int i49 = i47 - i48;
                        int i50 = iArr2[c9];
                        int i51 = iArr2[i21];
                        int i52 = i50 - i51;
                        if (i49 == i52) {
                            m0Var.c(i51, i48, i52);
                        } else if (iArr2[4] != 0) {
                            m0Var.c(i51, i48, r1.f.l(iArr2));
                        } else if (i49 > i52) {
                            m0Var.c(i51, i48 + 1, r1.f.l(iArr2));
                        } else {
                            m0Var.c(i51 + 1, i48, r1.f.l(iArr2));
                        }
                    }
                    m0Var2.d(i29, iArr2[i21], i25, iArr2[1]);
                    m0Var2.d(iArr2[c9], i27, iArr2[3], i23);
                    c6 = c9;
                    i18 = i21;
                    i19 = i31;
                    iArr3 = iArr7;
                    iArr4 = iArr;
                    iArr5 = iArr2;
                }
            }
            iArr = iArr4;
            iArr2 = iArr5;
            c6 = c9;
            i18 = i21;
            i19 = i31;
            iArr3 = iArr7;
            iArr4 = iArr;
            iArr5 = iArr2;
        }
        int i53 = i18;
        int i54 = m0Var.f3793b;
        if (i54 % 3 != 0) {
            a.a.M("Array size not a multiple of 3");
            throw null;
        }
        if (i54 > 3) {
            i9 = i53;
            m0Var.e(i9, i54 - 3);
        } else {
            i9 = i53;
        }
        m0Var.c(i15, i16, i9);
        int i55 = i9;
        int i56 = i55;
        int i57 = i56;
        while (i55 < m0Var.f3793b) {
            int[] iArr8 = m0Var.f3792a;
            int i58 = iArr8[i55];
            int i59 = iArr8[i55 + 2];
            int i60 = i58 - i59;
            int i61 = iArr8[i55 + 1] - i59;
            i55 += 3;
            while (i56 < i60) {
                s0.n nVar2 = u0Var.f7904a.f8109k;
                r6.k.c(nVar2);
                if ((nVar2.f8106h & 2) != 0) {
                    r1.a1 a1Var = nVar2.f8111m;
                    r6.k.c(a1Var);
                    r1.a1 a1Var2 = a1Var.f7702s;
                    r1.a1 a1Var3 = a1Var.f7701r;
                    r6.k.c(a1Var3);
                    if (a1Var2 != null) {
                        a1Var2.f7701r = a1Var3;
                    }
                    a1Var3.f7702s = a1Var2;
                    a(tVar, u0Var.f7904a, a1Var3);
                }
                u0Var.f7904a = c(nVar2);
                i56++;
            }
            while (i57 < i61) {
                s0.n b9 = b((s0.m) u0Var.f7907d.f4840f[u0Var.f7905b + i57], u0Var.f7904a);
                u0Var.f7904a = b9;
                if (u0Var.f7908e) {
                    s0.n nVar3 = b9.f8109k;
                    r6.k.c(nVar3);
                    r1.a1 a1Var4 = nVar3.f8111m;
                    r6.k.c(a1Var4);
                    r1.w g9 = r1.f.g(u0Var.f7904a);
                    if (g9 != null) {
                        r1.y yVar = new r1.y((r1.d0) tVar.f3891b, g9);
                        u0Var.f7904a.z0(yVar);
                        a(tVar, u0Var.f7904a, yVar);
                        yVar.f7702s = a1Var4.f7702s;
                        yVar.f7701r = a1Var4;
                        a1Var4.f7702s = yVar;
                    } else {
                        u0Var.f7904a.z0(a1Var4);
                    }
                    u0Var.f7904a.q0();
                    u0Var.f7904a.w0();
                    r1.b1.a(u0Var.f7904a);
                } else {
                    b9.f8112n = true;
                }
                i57++;
            }
            while (true) {
                int i62 = i59 - 1;
                if (i59 > 0) {
                    s0.n nVar4 = u0Var.f7904a.f8109k;
                    r6.k.c(nVar4);
                    u0Var.f7904a = nVar4;
                    i0.d dVar5 = u0Var.f7906c;
                    int i63 = u0Var.f7905b;
                    s0.m mVar = (s0.m) dVar5.f4840f[i63 + i56];
                    s0.m mVar2 = (s0.m) u0Var.f7907d.f4840f[i63 + i57];
                    if (!r6.k.a(mVar, mVar2)) {
                        l(mVar, mVar2, u0Var.f7904a);
                    }
                    i56++;
                    i57++;
                    i59 = i62;
                }
            }
        }
        int i64 = i9;
        for (s0.n nVar5 = ((r1.o1) this.f3894e).f8108j; nVar5 != null && nVar5 != r1.w0.f7910a; nVar5 = nVar5.f8108j) {
            i64 |= nVar5.f8106h;
            nVar5.f8107i = i64;
        }
    }

    public void k() {
        r1.y yVar;
        r1.d0 d0Var = (r1.d0) this.f3891b;
        r1.a1 a1Var = (r1.t) this.f3892c;
        for (s0.n nVar = ((r1.o1) this.f3894e).f8108j; nVar != null; nVar = nVar.f8108j) {
            r1.w g9 = r1.f.g(nVar);
            if (g9 != null) {
                r1.a1 a1Var2 = nVar.f8111m;
                if (a1Var2 != null) {
                    r1.y yVar2 = (r1.y) a1Var2;
                    r1.w wVar = yVar2.O;
                    yVar2.k1(g9);
                    yVar = yVar2;
                    if (wVar != nVar) {
                        r1.f1 f1Var = yVar2.I;
                        yVar = yVar2;
                        if (f1Var != null) {
                            f1Var.invalidate();
                            yVar = yVar2;
                        }
                    }
                } else {
                    r1.y yVar3 = new r1.y(d0Var, g9);
                    nVar.z0(yVar3);
                    yVar = yVar3;
                }
                a1Var.f7702s = yVar;
                yVar.f7701r = a1Var;
                a1Var = yVar;
            } else {
                nVar.z0(a1Var);
            }
        }
        r1.d0 s5 = d0Var.s();
        a1Var.f7702s = s5 != null ? (r1.t) s5.A.f3892c : null;
        this.f3893d = a1Var;
    }

    public String toString() {
        switch (this.f3890a) {
            case 1:
                StringBuilder sb = new StringBuilder("[");
                s0.n nVar = (s0.n) this.f3895f;
                r1.o1 o1Var = (r1.o1) this.f3894e;
                if (nVar == o1Var) {
                    sb.append("]");
                } else {
                    while (true) {
                        if (nVar != null && nVar != o1Var) {
                            sb.append(String.valueOf(nVar));
                            if (nVar.f8109k == o1Var) {
                                sb.append("]");
                            } else {
                                sb.append(",");
                                nVar = nVar.f8109k;
                            }
                        }
                    }
                }
                String sb2 = sb.toString();
                r6.k.e(sb2, "StringBuilder().apply(builderAction).toString()");
                return sb2;
            default:
                return super.toString();
        }
    }

    public t(Set set) {
        this.f3890a = 0;
        this.f3891b = set;
        this.f3892c = new ArrayList();
        this.f3893d = new ArrayList();
        this.f3894e = new ArrayList();
        this.f3895f = new ArrayList();
        this.f3897h = new i.o();
        this.f3898i = new i.o();
    }
}
