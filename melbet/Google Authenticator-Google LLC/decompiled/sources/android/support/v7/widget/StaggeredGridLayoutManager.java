package android.support.v7.widget;

import android.content.Context;
import android.graphics.PointF;
import android.graphics.Rect;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import defpackage.aah;
import defpackage.bo;
import defpackage.brn;
import defpackage.cmq;
import defpackage.jv;
import defpackage.jz;
import defpackage.ko;
import defpackage.kt;
import defpackage.kx;
import defpackage.ky;
import defpackage.kz;
import defpackage.le;
import defpackage.lk;
import defpackage.ll;
import defpackage.lm;
import defpackage.lv;
import defpackage.lw;
import defpackage.lx;
import defpackage.ly;
import defpackage.lz;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.BitSet;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class StaggeredGridLayoutManager extends ky implements lk {
    private int[] J;
    lz[] a;
    public ko b;
    ko c;
    private int i;
    private int j;
    private int k;
    private final jz l;
    private BitSet m;
    private boolean o;
    private boolean p;
    private ly q;
    public boolean d = false;
    boolean e = false;
    int f = -1;
    int g = Integer.MIN_VALUE;
    cmq h = new cmq();
    private int n = 2;
    private final Rect G = new Rect();
    private final lv H = new lv(this);
    private boolean I = true;
    private final Runnable K = new bo(this, 17, null);

    public StaggeredGridLayoutManager(Context context, AttributeSet attributeSet, int i, int i2) {
        this.i = -1;
        kx aD = aD(context, attributeSet, i, i2);
        int i3 = aD.a;
        if (i3 != 0 && i3 != 1) {
            throw new IllegalArgumentException("invalid orientation.");
        }
        T(null);
        if (i3 != this.j) {
            this.j = i3;
            ko koVar = this.b;
            this.b = this.c;
            this.c = koVar;
            aU();
        }
        int i4 = aD.b;
        T(null);
        if (i4 != this.i) {
            this.h.c();
            aU();
            this.i = i4;
            this.m = new BitSet(i4);
            this.a = new lz[this.i];
            for (int i5 = 0; i5 < this.i; i5++) {
                this.a[i5] = new lz(this, i5);
            }
            aU();
        }
        J(aD.c);
        this.l = new jz();
        this.b = ko.p(this, this.j);
        this.c = ko.p(this, 1 - this.j);
    }

    private final int P(int i) {
        if (at() == 0) {
            return this.e ? 1 : -1;
        }
        return (i < c()) != this.e ? -1 : 1;
    }

    private final int Q(lm lmVar) {
        if (at() == 0) {
            return 0;
        }
        return kt.w(lmVar, this.b, s(!this.I), m(!this.I), this, this.I);
    }

    private final int S(lm lmVar) {
        if (at() == 0) {
            return 0;
        }
        return kt.x(lmVar, this.b, s(!this.I), m(!this.I), this, this.I, this.e);
    }

    private final int U(lm lmVar) {
        if (at() == 0) {
            return 0;
        }
        return kt.y(lmVar, this.b, s(!this.I), m(!this.I), this, this.I);
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0027 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0028 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final int V(int i) {
        int i2 = -1;
        int i3 = 1;
        if (i == 1) {
            return (this.j != 1 && O()) ? 1 : -1;
        }
        if (i == 2) {
            return (this.j != 1 && O()) ? -1 : 1;
        }
        if (i != 17) {
            if (i != 33) {
                if (i != 66) {
                    return (i == 130 && this.j == 1) ? 1 : Integer.MIN_VALUE;
                }
                i2 = 1;
            }
            if (this.j != i3) {
                return i2;
            }
            return Integer.MIN_VALUE;
        }
        i3 = 0;
        if (this.j != i3) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:105:0x024a  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x01cf  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x0181  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x014a  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x011f  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x010e  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0119  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0129  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x016f  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x019a  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0246  */
    /* JADX WARN: Type inference failed for: r8v0 */
    /* JADX WARN: Type inference failed for: r8v1, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r8v27 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final int X(le leVar, jz jzVar, lm lmVar) {
        int i;
        int i2;
        lz lzVar;
        ?? r8;
        int f;
        int b;
        int j;
        int b2;
        int i3;
        int i4;
        int i5;
        int i6 = 0;
        int i7 = 1;
        this.m.set(0, this.i, true);
        jz jzVar2 = this.l;
        int i8 = jzVar2.i ? jzVar.e == 1 ? Integer.MAX_VALUE : Integer.MIN_VALUE : jzVar.e == 1 ? jzVar.g + jzVar.b : jzVar.f - jzVar.b;
        int i9 = jzVar.e;
        for (int i10 = 0; i10 < this.i; i10++) {
            if (!this.a[i10].a.isEmpty()) {
                bE(this.a[i10], i9, i8);
            }
        }
        boolean z = this.e;
        ko koVar = this.b;
        int f2 = z ? koVar.f() : koVar.j();
        boolean z2 = false;
        while (jzVar.a(lmVar) && (jzVar2.i || !this.m.isEmpty())) {
            View n = leVar.n(jzVar.c);
            jzVar.c += jzVar.d;
            lw lwVar = (lw) n.getLayoutParams();
            int a = lwVar.a();
            Object obj = this.h.a;
            if (obj != null) {
                int[] iArr = (int[]) obj;
                if (a < iArr.length) {
                    i = iArr[a];
                    i2 = i != -1 ? i7 : i6;
                    if (i2 == 0) {
                        boolean z3 = lwVar.b;
                        boolean bF = bF(jzVar.e);
                        int i11 = this.i;
                        if (bF) {
                            i5 = i11 - 1;
                            i4 = -1;
                            i3 = -1;
                        } else {
                            i3 = i7;
                            i4 = i11;
                            i5 = i6;
                        }
                        int i12 = jzVar.e;
                        ko koVar2 = this.b;
                        lz lzVar2 = null;
                        if (i12 == i7) {
                            int j2 = koVar2.j();
                            int i13 = Integer.MAX_VALUE;
                            while (i5 != i4) {
                                lz lzVar3 = this.a[i5];
                                int d = lzVar3.d(j2);
                                int i14 = d < i13 ? d : i13;
                                if (d < i13) {
                                    lzVar2 = lzVar3;
                                }
                                i5 += i3;
                                i13 = i14;
                            }
                        } else {
                            int f3 = koVar2.f();
                            int i15 = Integer.MIN_VALUE;
                            while (i5 != i4) {
                                lz lzVar4 = this.a[i5];
                                int f4 = lzVar4.f(f3);
                                int i16 = f4 > i15 ? f4 : i15;
                                if (f4 > i15) {
                                    lzVar2 = lzVar4;
                                }
                                i5 += i3;
                                i15 = i16;
                            }
                        }
                        lzVar = lzVar2;
                        cmq cmqVar = this.h;
                        cmqVar.d(a);
                        ((int[]) cmqVar.a)[a] = lzVar.e;
                    } else {
                        lzVar = this.a[i];
                    }
                    lwVar.a = lzVar;
                    if (jzVar.e != 1) {
                        r8 = 0;
                        super.aH(n, -1, false);
                    } else {
                        r8 = 0;
                        super.aH(n, 0, false);
                    }
                    boolean z4 = lwVar.b;
                    if (this.j != 1) {
                        bG(n, au(this.k, this.A, r8, lwVar.width, r8), au(this.D, this.B, aC() + az(), lwVar.height, true));
                    } else {
                        bG(n, au(this.C, this.A, aA() + aB(), lwVar.width, true), au(this.k, this.B, 0, lwVar.height, false));
                    }
                    if (jzVar.e != 1) {
                        boolean z5 = lwVar.b;
                        b = lzVar.d(f2);
                        f = this.b.b(n) + b;
                        if (i2 != 0) {
                            boolean z6 = lwVar.b;
                        }
                    } else {
                        boolean z7 = lwVar.b;
                        f = lzVar.f(f2);
                        b = f - this.b.b(n);
                        if (i2 != 0) {
                            boolean z8 = lwVar.b;
                        }
                    }
                    boolean z9 = lwVar.b;
                    if (jzVar.e != 1) {
                        lz lzVar5 = lwVar.a;
                        lw n2 = lz.n(n);
                        n2.a = lzVar5;
                        ArrayList arrayList = lzVar5.a;
                        arrayList.add(n);
                        lzVar5.c = Integer.MIN_VALUE;
                        if (arrayList.size() == 1) {
                            lzVar5.b = Integer.MIN_VALUE;
                        }
                        if (n2.c() || n2.b()) {
                            lzVar5.d += lzVar5.f.b.b(n);
                        }
                    } else {
                        lz lzVar6 = lwVar.a;
                        lw n3 = lz.n(n);
                        n3.a = lzVar6;
                        ArrayList arrayList2 = lzVar6.a;
                        arrayList2.add(0, n);
                        lzVar6.b = Integer.MIN_VALUE;
                        if (arrayList2.size() == 1) {
                            lzVar6.c = Integer.MIN_VALUE;
                        }
                        if (n3.c() || n3.b()) {
                            lzVar6.d += lzVar6.f.b.b(n);
                        }
                    }
                    if (O() || this.j != 1) {
                        boolean z10 = lwVar.b;
                        j = this.c.j() + (lzVar.e * this.k);
                        b2 = this.c.b(n) + j;
                    } else {
                        boolean z11 = lwVar.b;
                        b2 = this.c.f() - (((this.i - 1) - lzVar.e) * this.k);
                        j = b2 - this.c.b(n);
                    }
                    if (this.j != 1) {
                        bq(n, j, b, b2, f);
                    } else {
                        bq(n, b, j, f, b2);
                    }
                    boolean z12 = lwVar.b;
                    bE(lzVar, jzVar2.e, i8);
                    ao(leVar, jzVar2);
                    if (jzVar2.h || !n.hasFocusable()) {
                        i7 = 1;
                        z2 = true;
                        i6 = 0;
                    } else {
                        boolean z13 = lwVar.b;
                        this.m.set(lzVar.e, false);
                        i6 = 0;
                        i7 = 1;
                        z2 = true;
                    }
                }
            }
            i = -1;
            if (i != -1) {
            }
            if (i2 == 0) {
            }
            lwVar.a = lzVar;
            if (jzVar.e != 1) {
            }
            boolean z42 = lwVar.b;
            if (this.j != 1) {
            }
            if (jzVar.e != 1) {
            }
            boolean z92 = lwVar.b;
            if (jzVar.e != 1) {
            }
            if (O()) {
            }
            boolean z102 = lwVar.b;
            j = this.c.j() + (lzVar.e * this.k);
            b2 = this.c.b(n) + j;
            if (this.j != 1) {
            }
            boolean z122 = lwVar.b;
            bE(lzVar, jzVar2.e, i8);
            ao(leVar, jzVar2);
            if (jzVar2.h) {
            }
            i7 = 1;
            z2 = true;
            i6 = 0;
        }
        if (!z2) {
            ao(leVar, jzVar2);
        }
        int i17 = jzVar2.e;
        ko koVar3 = this.b;
        int j3 = i17 == -1 ? this.b.j() - ab(koVar3.j()) : Z(koVar3.f()) - this.b.f();
        if (j3 > 0) {
            return Math.min(jzVar.b, j3);
        }
        return 0;
    }

    private final int Z(int i) {
        int d = this.a[0].d(i);
        for (int i2 = 1; i2 < this.i; i2++) {
            int d2 = this.a[i2].d(i);
            if (d2 > d) {
                d = d2;
            }
        }
        return d;
    }

    private final int ab(int i) {
        int f = this.a[0].f(i);
        for (int i2 = 1; i2 < this.i; i2++) {
            int f2 = this.a[i2].f(i);
            if (f2 < f) {
                f = f2;
            }
        }
        return f;
    }

    private final View ac(View view, int i, le leVar, lm lmVar) {
        lz lzVar;
        View g;
        bB();
        int V = V(i);
        if (V == Integer.MIN_VALUE) {
            return null;
        }
        if (view != null) {
            lw lwVar = (lw) view.getLayoutParams();
            boolean z = lwVar.b;
            lzVar = lwVar.a;
        } else {
            lzVar = null;
        }
        int i2 = V == 1 ? i() : c();
        bD(i2, lmVar);
        bC(V);
        jz jzVar = this.l;
        jzVar.c = jzVar.d + i2;
        jzVar.b = (int) (this.b.k() * 0.33333334f);
        jzVar.h = true;
        jzVar.a = false;
        X(leVar, jzVar, lmVar);
        this.o = this.e;
        if (view != null && (g = lzVar.g(i2, V)) != null && g != view) {
            return g;
        }
        if (bF(V)) {
            for (int i3 = this.i - 1; i3 >= 0; i3--) {
                View g2 = this.a[i3].g(i2, V);
                if (g2 != null && g2 != view) {
                    return g2;
                }
            }
        } else {
            for (int i4 = 0; i4 < this.i; i4++) {
                View g3 = this.a[i4].g(i2, V);
                if (g3 != null && g3 != view) {
                    return g3;
                }
            }
        }
        boolean z2 = (this.d ^ true) == (V == -1);
        if (view != null) {
            View R = R(z2 ? lzVar.a() : lzVar.b());
            if (R != null && R != view) {
                return R;
            }
        }
        if (bF(V)) {
            for (int i5 = this.i - 1; i5 >= 0; i5--) {
                if (view == null || i5 != lzVar.e) {
                    lz[] lzVarArr = this.a;
                    View R2 = R(z2 ? lzVarArr[i5].a() : lzVarArr[i5].b());
                    if (R2 != null && R2 != view) {
                        return R2;
                    }
                }
            }
        } else {
            for (int i6 = 0; i6 < this.i; i6++) {
                if (view == null || i6 != lzVar.e) {
                    lz[] lzVarArr2 = this.a;
                    View R3 = R(z2 ? lzVarArr2[i6].a() : lzVarArr2[i6].b());
                    if (R3 != null && R3 != view) {
                        return R3;
                    }
                }
            }
        }
        return null;
    }

    private final void ag(le leVar, lm lmVar, boolean z) {
        int f;
        int i;
        int Z = Z(Integer.MIN_VALUE);
        if (Z != Integer.MIN_VALUE && (f = this.b.f() - Z) > 0) {
            int i2 = -l(-f, leVar, lmVar);
            if (!z || (i = f - i2) <= 0) {
                return;
            }
            this.b.n(i);
        }
    }

    private final void ai(le leVar, lm lmVar, boolean z) {
        int j;
        int ab = ab(Integer.MAX_VALUE);
        if (ab != Integer.MAX_VALUE && (j = ab - this.b.j()) > 0) {
            int l = j - l(j, leVar, lmVar);
            if (!z || l <= 0) {
                return;
            }
            this.b.n(-l);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:54:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00b6  */
    /* JADX WARN: Type inference failed for: r5v13, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r5v3, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r5v7, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r5v9, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r8v7, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r9v0, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r9v1, types: [java.lang.Object, java.util.List] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void am(int i, int i2, int i3) {
        int i4;
        int i5;
        cmq cmqVar;
        Object obj;
        ?? r5;
        lx lxVar;
        int i6;
        int i7 = this.e ? i() : c();
        if (i3 != 8) {
            i4 = i + i2;
        } else {
            if (i >= i2) {
                i4 = i + 1;
                i5 = i2;
                cmqVar = this.h;
                obj = cmqVar.a;
                if (obj != null && i5 < ((int[]) obj).length) {
                    r5 = cmqVar.b;
                    if (r5 != 0) {
                        int size = r5.size() - 1;
                        while (true) {
                            if (size < 0) {
                                lxVar = null;
                                break;
                            }
                            lxVar = (lx) cmqVar.b.get(size);
                            if (lxVar.a == i5) {
                                break;
                            } else {
                                size--;
                            }
                        }
                        if (lxVar != null) {
                            cmqVar.b.remove(lxVar);
                        }
                        int size2 = cmqVar.b.size();
                        int i8 = 0;
                        while (true) {
                            if (i8 >= size2) {
                                i8 = -1;
                                break;
                            } else if (((lx) cmqVar.b.get(i8)).a >= i5) {
                                break;
                            } else {
                                i8++;
                            }
                        }
                        if (i8 != -1) {
                            lx lxVar2 = (lx) cmqVar.b.get(i8);
                            cmqVar.b.remove(i8);
                            i6 = lxVar2.a;
                            if (i6 == -1) {
                                int[] iArr = (int[]) cmqVar.a;
                                Arrays.fill(iArr, i5, iArr.length, -1);
                                int length = ((int[]) cmqVar.a).length;
                            } else {
                                Arrays.fill((int[]) cmqVar.a, i5, Math.min(i6 + 1, ((int[]) cmqVar.a).length), -1);
                            }
                        }
                    }
                    i6 = -1;
                    if (i6 == -1) {
                    }
                }
                if (i3 != 1) {
                    this.h.e(i, i2);
                } else if (i3 == 2) {
                    this.h.f(i, i2);
                } else if (i3 == 8) {
                    this.h.f(i, 1);
                    this.h.e(i2, 1);
                }
                if (i4 > i7) {
                    return;
                }
                if (i5 <= (this.e ? c() : i())) {
                    aU();
                    return;
                }
                return;
            }
            i4 = i2 + 1;
        }
        i5 = i;
        cmqVar = this.h;
        obj = cmqVar.a;
        if (obj != null) {
            r5 = cmqVar.b;
            if (r5 != 0) {
            }
            i6 = -1;
            if (i6 == -1) {
            }
        }
        if (i3 != 1) {
        }
        if (i4 > i7) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:245:0x03c2, code lost:
    
        if (L() != false) goto L235;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void an(le leVar, lm lmVar, boolean z) {
        ly lyVar;
        lz[] lzVarArr;
        int i;
        int i2;
        lv lvVar = this.H;
        if (!(this.q == null && this.f == -1) && lmVar.a() == 0) {
            aP(leVar);
            lvVar.a();
            return;
        }
        boolean z2 = true;
        boolean z3 = (lvVar.e && this.f == -1 && this.q == null) ? false : true;
        if (z3) {
            lvVar.a();
            ly lyVar2 = this.q;
            if (lyVar2 != null) {
                int i3 = lyVar2.c;
                if (i3 > 0) {
                    if (i3 == this.i) {
                        for (int i4 = 0; i4 < this.i; i4++) {
                            this.a[i4].j();
                            ly lyVar3 = this.q;
                            int i5 = lyVar3.d[i4];
                            if (i5 != Integer.MIN_VALUE) {
                                boolean z4 = lyVar3.i;
                                ko koVar = this.b;
                                i5 += z4 ? koVar.f() : koVar.j();
                            }
                            this.a[i4].l(i5);
                        }
                    } else {
                        lyVar2.b();
                        ly lyVar4 = this.q;
                        lyVar4.a = lyVar4.b;
                    }
                }
                ly lyVar5 = this.q;
                this.p = lyVar5.j;
                J(lyVar5.h);
                bB();
                ly lyVar6 = this.q;
                int i6 = lyVar6.a;
                if (i6 != -1) {
                    this.f = i6;
                    lvVar.c = lyVar6.i;
                } else {
                    lvVar.c = this.e;
                }
                if (lyVar6.e > 1) {
                    cmq cmqVar = this.h;
                    cmqVar.a = lyVar6.f;
                    cmqVar.b = lyVar6.g;
                }
            } else {
                bB();
                lvVar.c = this.e;
            }
            if (!lmVar.g && (i2 = this.f) != -1) {
                if (i2 < 0 || i2 >= lmVar.a()) {
                    this.f = -1;
                    this.g = Integer.MIN_VALUE;
                } else {
                    ly lyVar7 = this.q;
                    if (lyVar7 == null || lyVar7.a == -1 || lyVar7.c <= 0) {
                        View R = R(this.f);
                        if (R != null) {
                            lvVar.a = this.e ? i() : c();
                            if (this.g != Integer.MIN_VALUE) {
                                boolean z5 = lvVar.c;
                                ko koVar2 = this.b;
                                if (z5) {
                                    lvVar.b = (koVar2.f() - this.g) - this.b.a(R);
                                } else {
                                    lvVar.b = (koVar2.j() + this.g) - this.b.d(R);
                                }
                            } else if (this.b.b(R) > this.b.k()) {
                                boolean z6 = lvVar.c;
                                ko koVar3 = this.b;
                                lvVar.b = z6 ? koVar3.f() : koVar3.j();
                            } else {
                                int d = this.b.d(R) - this.b.j();
                                if (d < 0) {
                                    lvVar.b = -d;
                                } else {
                                    int f = this.b.f() - this.b.a(R);
                                    if (f < 0) {
                                        lvVar.b = f;
                                    } else {
                                        lvVar.b = Integer.MIN_VALUE;
                                    }
                                }
                            }
                        } else {
                            int i7 = this.f;
                            lvVar.a = i7;
                            int i8 = this.g;
                            if (i8 == Integer.MIN_VALUE) {
                                boolean z7 = P(i7) == 1;
                                lvVar.c = z7;
                                lvVar.b = z7 ? lvVar.g.b.f() : lvVar.g.b.j();
                            } else if (lvVar.c) {
                                lvVar.b = lvVar.g.b.f() - i8;
                            } else {
                                lvVar.b = lvVar.g.b.j() + i8;
                            }
                            lvVar.d = true;
                        }
                    } else {
                        lvVar.b = Integer.MIN_VALUE;
                        lvVar.a = this.f;
                    }
                    lvVar.e = true;
                }
            }
            if (this.o) {
                int a = lmVar.a();
                for (int at = at() - 1; at >= 0; at--) {
                    i = bl(aF(at));
                    if (i >= 0 && i < a) {
                        break;
                    }
                }
                i = 0;
                lvVar.a = i;
                lvVar.b = Integer.MIN_VALUE;
                lvVar.e = true;
            } else {
                int a2 = lmVar.a();
                int at2 = at();
                for (int i9 = 0; i9 < at2; i9++) {
                    int bl = bl(aF(i9));
                    if (bl >= 0 && bl < a2) {
                        i = bl;
                        break;
                    }
                }
                i = 0;
                lvVar.a = i;
                lvVar.b = Integer.MIN_VALUE;
                lvVar.e = true;
            }
        }
        if (this.q == null && this.f == -1 && (lvVar.c != this.o || O() != this.p)) {
            this.h.c();
            lvVar.d = true;
        }
        if (at() > 0 && ((lyVar = this.q) == null || lyVar.c <= 0)) {
            if (lvVar.d) {
                for (int i10 = 0; i10 < this.i; i10++) {
                    this.a[i10].j();
                    int i11 = lvVar.b;
                    if (i11 != Integer.MIN_VALUE) {
                        this.a[i10].l(i11);
                    }
                }
            } else if (z3 || lvVar.f == null) {
                int i12 = 0;
                while (true) {
                    int i13 = this.i;
                    lzVarArr = this.a;
                    if (i12 >= i13) {
                        break;
                    }
                    lz lzVar = lzVarArr[i12];
                    boolean z8 = this.e;
                    int i14 = lvVar.b;
                    int d2 = z8 ? lzVar.d(Integer.MIN_VALUE) : lzVar.f(Integer.MIN_VALUE);
                    lzVar.j();
                    if (d2 != Integer.MIN_VALUE && ((!z8 || d2 >= lzVar.f.b.f()) && (z8 || d2 <= lzVar.f.b.j()))) {
                        if (i14 != Integer.MIN_VALUE) {
                            d2 += i14;
                        }
                        lzVar.c = d2;
                        lzVar.b = d2;
                    }
                    i12++;
                }
                int length = lzVarArr.length;
                int[] iArr = lvVar.f;
                if (iArr == null || iArr.length < length) {
                    lvVar.f = new int[lvVar.g.a.length];
                }
                for (int i15 = 0; i15 < length; i15++) {
                    lvVar.f[i15] = lzVarArr[i15].f(Integer.MIN_VALUE);
                }
            } else {
                for (int i16 = 0; i16 < this.i; i16++) {
                    lz lzVar2 = this.a[i16];
                    lzVar2.j();
                    lzVar2.l(lvVar.f[i16]);
                }
            }
        }
        aJ(leVar);
        jz jzVar = this.l;
        jzVar.a = false;
        K(this.c.k());
        bD(lvVar.a, lmVar);
        if (lvVar.c) {
            bC(-1);
            X(leVar, jzVar, lmVar);
            bC(1);
            jzVar.c = lvVar.a + jzVar.d;
            X(leVar, jzVar, lmVar);
        } else {
            bC(1);
            X(leVar, jzVar, lmVar);
            bC(-1);
            jzVar.c = lvVar.a + jzVar.d;
            X(leVar, jzVar, lmVar);
        }
        if (this.c.h() != 1073741824) {
            int at3 = at();
            float f2 = 0.0f;
            for (int i17 = 0; i17 < at3; i17++) {
                View aF = aF(i17);
                float b = this.c.b(aF);
                if (b >= f2) {
                    f2 = Math.max(f2, b);
                }
            }
            int i18 = this.k;
            int round = Math.round(f2 * this.i);
            if (this.c.h() == Integer.MIN_VALUE) {
                round = Math.min(round, this.c.k());
            }
            K(round);
            if (this.k != i18) {
                for (int i19 = 0; i19 < at3; i19++) {
                    View aF2 = aF(i19);
                    lw lwVar = (lw) aF2.getLayoutParams();
                    boolean z9 = lwVar.b;
                    if (O() && this.j == 1) {
                        int i20 = -((this.i - 1) - lwVar.a.e);
                        aF2.offsetLeftAndRight((this.k * i20) - (i20 * i18));
                    } else {
                        int i21 = lwVar.a.e;
                        int i22 = this.j;
                        int i23 = (this.k * i21) - (i21 * i18);
                        if (i22 == 1) {
                            aF2.offsetLeftAndRight(i23);
                        } else {
                            aF2.offsetTopAndBottom(i23);
                        }
                    }
                }
            }
        }
        if (at() > 0) {
            if (this.e) {
                ag(leVar, lmVar, true);
                ai(leVar, lmVar, false);
            } else {
                ai(leVar, lmVar, true);
                ag(leVar, lmVar, false);
            }
        }
        if (z && !lmVar.g && this.n != 0 && at() > 0 && w() != null) {
            bt(this.K);
        }
        z2 = false;
        if (lmVar.g) {
            lvVar.a();
        }
        this.o = lvVar.c;
        this.p = O();
        if (z2) {
            lvVar.a();
            an(leVar, lmVar, false);
        }
    }

    private final void ao(le leVar, jz jzVar) {
        if (!jzVar.a || jzVar.i) {
            return;
        }
        if (jzVar.b == 0) {
            if (jzVar.e == -1) {
                ar(leVar, jzVar.g);
                return;
            } else {
                bA(leVar, jzVar.f);
                return;
            }
        }
        int i = 1;
        if (jzVar.e == -1) {
            int i2 = jzVar.f;
            int f = this.a[0].f(i2);
            while (i < this.i) {
                int f2 = this.a[i].f(i2);
                if (f2 > f) {
                    f = f2;
                }
                i++;
            }
            int i3 = i2 - f;
            ar(leVar, i3 < 0 ? jzVar.g : jzVar.g - Math.min(i3, jzVar.b));
            return;
        }
        int i4 = jzVar.g;
        int d = this.a[0].d(i4);
        while (i < this.i) {
            int d2 = this.a[i].d(i4);
            if (d2 < d) {
                d = d2;
            }
            i++;
        }
        int i5 = d - jzVar.g;
        bA(leVar, i5 < 0 ? jzVar.f : Math.min(i5, jzVar.b) + jzVar.f);
    }

    private final void ar(le leVar, int i) {
        int at = at();
        while (true) {
            at--;
            if (at < 0) {
                return;
            }
            View aF = aF(at);
            if (this.b.d(aF) < i || this.b.m(aF) < i) {
                return;
            }
            lw lwVar = (lw) aF.getLayoutParams();
            boolean z = lwVar.b;
            if (lwVar.a.a.size() == 1) {
                return;
            }
            lz lzVar = lwVar.a;
            ArrayList arrayList = lzVar.a;
            int size = arrayList.size();
            View view = (View) arrayList.remove(size - 1);
            lw n = lz.n(view);
            n.a = null;
            if (n.c() || n.b()) {
                lzVar.d -= lzVar.f.b.b(view);
            }
            if (size == 1) {
                lzVar.b = Integer.MIN_VALUE;
            }
            lzVar.c = Integer.MIN_VALUE;
            aR(aF, leVar);
        }
    }

    private final void bA(le leVar, int i) {
        while (at() > 0) {
            View aF = aF(0);
            if (this.b.a(aF) > i || this.b.l(aF) > i) {
                return;
            }
            lw lwVar = (lw) aF.getLayoutParams();
            boolean z = lwVar.b;
            if (lwVar.a.a.size() == 1) {
                return;
            }
            lz lzVar = lwVar.a;
            ArrayList arrayList = lzVar.a;
            View view = (View) arrayList.remove(0);
            lw n = lz.n(view);
            n.a = null;
            if (arrayList.size() == 0) {
                lzVar.c = Integer.MIN_VALUE;
            }
            if (n.c() || n.b()) {
                lzVar.d -= lzVar.f.b.b(view);
            }
            lzVar.b = Integer.MIN_VALUE;
            aR(aF, leVar);
        }
    }

    private final void bB() {
        this.e = (this.j == 1 || !O()) ? this.d : !this.d;
    }

    private final void bC(int i) {
        jz jzVar = this.l;
        jzVar.e = i;
        jzVar.d = this.e != (i == -1) ? -1 : 1;
    }

    private final void bD(int i, lm lmVar) {
        int i2;
        int i3;
        int i4;
        jz jzVar = this.l;
        boolean z = false;
        jzVar.b = 0;
        jzVar.c = i;
        if (!bd() || (i4 = lmVar.a) == -1) {
            i2 = 0;
            i3 = 0;
        } else {
            boolean z2 = this.e;
            boolean z3 = i4 < i;
            ko koVar = this.b;
            if (z2 == z3) {
                i2 = koVar.k();
                i3 = 0;
            } else {
                i3 = koVar.k();
                i2 = 0;
            }
        }
        RecyclerView recyclerView = this.s;
        if (recyclerView == null || !recyclerView.i) {
            jzVar.g = this.b.e() + i2;
            jzVar.f = -i3;
        } else {
            jzVar.f = this.b.j() - i3;
            jzVar.g = this.b.f() + i2;
        }
        jzVar.h = false;
        jzVar.a = true;
        if (this.b.h() == 0 && this.b.e() == 0) {
            z = true;
        }
        jzVar.i = z;
    }

    private final void bE(lz lzVar, int i, int i2) {
        int i3 = lzVar.d;
        if (i == -1) {
            if (lzVar.e() + i3 <= i2) {
                this.m.set(lzVar.e, false);
            }
        } else if (lzVar.c() - i3 >= i2) {
            this.m.set(lzVar.e, false);
        }
    }

    private final boolean bF(int i) {
        int i2 = this.j;
        boolean z = i == -1;
        boolean z2 = this.e;
        if (i2 == 0) {
            return z != z2;
        }
        return (z == z2) == O();
    }

    private final void bG(View view, int i, int i2) {
        Rect rect = this.G;
        aI(view, rect);
        lw lwVar = (lw) view.getLayoutParams();
        int bH = bH(i, lwVar.leftMargin + rect.left, lwVar.rightMargin + rect.right);
        int bH2 = bH(i2, lwVar.topMargin + rect.top, lwVar.bottomMargin + rect.bottom);
        if (bf(view, bH, bH2, lwVar)) {
            view.measure(bH, bH2);
        }
    }

    private static final int bH(int i, int i2, int i3) {
        if (i2 == 0) {
            if (i3 != 0) {
                i2 = 0;
            }
            return i;
        }
        int mode = View.MeasureSpec.getMode(i);
        if (mode != Integer.MIN_VALUE) {
            if (mode == 1073741824) {
                mode = 1073741824;
            }
            return i;
        }
        return View.MeasureSpec.makeMeasureSpec(Math.max(0, (View.MeasureSpec.getSize(i) - i2) - i3), mode);
    }

    @Override // defpackage.ky
    public final void A(int i, int i2) {
        am(i, i2, 2);
    }

    @Override // defpackage.ky
    public final void B(int i, int i2) {
        am(i, i2, 4);
    }

    @Override // defpackage.ky
    public final int C(lm lmVar) {
        return Q(lmVar);
    }

    @Override // defpackage.ky
    public final int D(lm lmVar) {
        return S(lmVar);
    }

    @Override // defpackage.ky
    public final int E(lm lmVar) {
        return U(lmVar);
    }

    @Override // defpackage.ky
    public final int F(lm lmVar) {
        return Q(lmVar);
    }

    @Override // defpackage.ky
    public final int G(lm lmVar) {
        return S(lmVar);
    }

    @Override // defpackage.ky
    public final int H(lm lmVar) {
        return U(lmVar);
    }

    final void I(int i, lm lmVar) {
        int c;
        int i2;
        if (i > 0) {
            c = i();
            i2 = 1;
        } else {
            c = c();
            i2 = -1;
        }
        jz jzVar = this.l;
        jzVar.a = true;
        bD(c, lmVar);
        bC(i2);
        jzVar.c = c + jzVar.d;
        jzVar.b = Math.abs(i);
    }

    public final void J(boolean z) {
        T(null);
        ly lyVar = this.q;
        if (lyVar != null && lyVar.h != z) {
            lyVar.h = z;
        }
        this.d = z;
        aU();
    }

    final void K(int i) {
        this.k = i / this.i;
        View.MeasureSpec.makeMeasureSpec(i, this.c.h());
    }

    public final boolean L() {
        int c;
        if (at() == 0 || this.n == 0 || !this.v) {
            return false;
        }
        if (this.e) {
            c = i();
            c();
        } else {
            c = c();
            i();
        }
        if (c != 0 || w() == null) {
            return false;
        }
        this.h.c();
        aV();
        aU();
        return true;
    }

    @Override // defpackage.lk
    public final PointF M(int i) {
        int P = P(i);
        PointF pointF = new PointF();
        if (P == 0) {
            return null;
        }
        float f = P;
        if (this.j == 0) {
            pointF.x = f;
            pointF.y = 0.0f;
            return pointF;
        }
        pointF.x = 0.0f;
        pointF.y = f;
        return pointF;
    }

    /* JADX WARN: Type inference failed for: r1v24, types: [java.lang.Object, java.util.List] */
    @Override // defpackage.ky
    public final Parcelable N() {
        int f;
        int j;
        Object obj;
        ly lyVar = this.q;
        if (lyVar != null) {
            return new ly(lyVar);
        }
        ly lyVar2 = new ly();
        lyVar2.h = this.d;
        lyVar2.i = this.o;
        lyVar2.j = this.p;
        cmq cmqVar = this.h;
        if (cmqVar == null || (obj = cmqVar.a) == null) {
            lyVar2.e = 0;
        } else {
            lyVar2.f = (int[]) obj;
            lyVar2.e = lyVar2.f.length;
            lyVar2.g = cmqVar.b;
        }
        if (at() <= 0) {
            lyVar2.a = -1;
            lyVar2.b = -1;
            lyVar2.c = 0;
            return lyVar2;
        }
        lyVar2.a = this.o ? i() : c();
        View m = this.e ? m(true) : s(true);
        lyVar2.b = m != null ? bl(m) : -1;
        int i = this.i;
        lyVar2.c = i;
        lyVar2.d = new int[i];
        for (int i2 = 0; i2 < this.i; i2++) {
            boolean z = this.o;
            lz[] lzVarArr = this.a;
            if (z) {
                f = lzVarArr[i2].d(Integer.MIN_VALUE);
                if (f != Integer.MIN_VALUE) {
                    j = this.b.f();
                    f -= j;
                    lyVar2.d[i2] = f;
                } else {
                    lyVar2.d[i2] = f;
                }
            } else {
                f = lzVarArr[i2].f(Integer.MIN_VALUE);
                if (f != Integer.MIN_VALUE) {
                    j = this.b.j();
                    f -= j;
                    lyVar2.d[i2] = f;
                } else {
                    lyVar2.d[i2] = f;
                }
            }
        }
        return lyVar2;
    }

    final boolean O() {
        return aw() == 1;
    }

    @Override // defpackage.ky
    public final void T(String str) {
        if (this.q == null) {
            super.T(str);
        }
    }

    @Override // defpackage.ky
    public final void W(AccessibilityEvent accessibilityEvent) {
        super.W(accessibilityEvent);
        if (at() > 0) {
            View s = s(false);
            View m = m(false);
            if (s == null || m == null) {
                return;
            }
            int bl = bl(s);
            int bl2 = bl(m);
            if (bl < bl2) {
                accessibilityEvent.setFromIndex(bl);
                accessibilityEvent.setToIndex(bl2);
            } else {
                accessibilityEvent.setFromIndex(bl2);
                accessibilityEvent.setToIndex(bl);
            }
        }
    }

    @Override // defpackage.ky
    public final void Y(Parcelable parcelable) {
        if (parcelable instanceof ly) {
            ly lyVar = (ly) parcelable;
            this.q = lyVar;
            if (this.f != -1) {
                lyVar.a();
                this.q.b();
            }
            aU();
        }
    }

    @Override // defpackage.ky
    public final int a(le leVar, lm lmVar) {
        if (this.j == 1) {
            return Math.min(this.i, lmVar.a());
        }
        return -1;
    }

    @Override // defpackage.ky
    public final void aL(int i) {
        super.aL(i);
        for (int i2 = 0; i2 < this.i; i2++) {
            this.a[i2].k(i);
        }
    }

    @Override // defpackage.ky
    public final void aM(int i) {
        super.aM(i);
        for (int i2 = 0; i2 < this.i; i2++) {
            this.a[i2].k(i);
        }
    }

    @Override // defpackage.ky
    public final void aO(int i) {
        if (i == 0) {
            L();
        }
    }

    @Override // defpackage.ky
    public final void aa(int i) {
        ly lyVar = this.q;
        if (lyVar != null && lyVar.a != i) {
            lyVar.a();
        }
        this.f = i;
        this.g = Integer.MIN_VALUE;
        aU();
    }

    @Override // defpackage.ky
    public final boolean ad() {
        return this.j == 0;
    }

    @Override // defpackage.ky
    public final boolean ae() {
        return this.j == 1;
    }

    @Override // defpackage.ky
    public final boolean af() {
        return this.n != 0;
    }

    @Override // defpackage.ky
    public final boolean ah() {
        return this.d;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x001a, code lost:
    
        if (r5.length < r4.i) goto L13;
     */
    @Override // defpackage.ky
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void ak(int i, int i2, lm lmVar, jv jvVar) {
        int d;
        if (1 == this.j) {
            i = i2;
        }
        if (at() == 0 || i == 0) {
            return;
        }
        I(i, lmVar);
        int[] iArr = this.J;
        if (iArr != null) {
        }
        this.J = new int[this.i];
        int i3 = 0;
        for (int i4 = 0; i4 < this.i; i4++) {
            jz jzVar = this.l;
            if (jzVar.d == -1) {
                int i5 = jzVar.f;
                d = i5 - this.a[i4].f(i5);
            } else {
                d = this.a[i4].d(jzVar.g) - jzVar.g;
            }
            if (d >= 0) {
                this.J[i3] = d;
                i3++;
            }
        }
        Arrays.sort(this.J, 0, i3);
        for (int i6 = 0; i6 < i3; i6++) {
            jz jzVar2 = this.l;
            if (!jzVar2.a(lmVar)) {
                return;
            }
            jvVar.a(jzVar2.c, this.J[i6]);
            jzVar2.c += jzVar2.d;
        }
    }

    @Override // defpackage.ky
    public final void ap(RecyclerView recyclerView) {
        bt(this.K);
        for (int i = 0; i < this.i; i++) {
            this.a[i].j();
        }
        recyclerView.requestLayout();
    }

    @Override // defpackage.ky
    public final void aq(RecyclerView recyclerView, int i) {
        ll llVar = new ll(recyclerView.getContext());
        llVar.b = i;
        bb(llVar);
    }

    @Override // defpackage.ky
    public final int b(le leVar, lm lmVar) {
        if (this.j == 0) {
            return Math.min(this.i, lmVar.a());
        }
        return -1;
    }

    @Override // defpackage.ky
    public final void br() {
        this.h.c();
        for (int i = 0; i < this.i; i++) {
            this.a[i].j();
        }
    }

    final int c() {
        if (at() == 0) {
            return 0;
        }
        return bl(aF(0));
    }

    @Override // defpackage.ky
    public final int d(int i, le leVar, lm lmVar) {
        return l(i, leVar, lmVar);
    }

    @Override // defpackage.ky
    public final int e(int i, le leVar, lm lmVar) {
        return l(i, leVar, lmVar);
    }

    @Override // defpackage.ky
    public final kz f() {
        return this.j == 0 ? new lw(-2, -1) : new lw(-1, -2);
    }

    @Override // defpackage.ky
    public final kz g(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof ViewGroup.MarginLayoutParams ? new lw((ViewGroup.MarginLayoutParams) layoutParams) : new lw(layoutParams);
    }

    @Override // defpackage.ky
    public final kz h(Context context, AttributeSet attributeSet) {
        return new lw(context, attributeSet);
    }

    final int i() {
        int at = at();
        if (at == 0) {
            return 0;
        }
        return bl(aF(at - 1));
    }

    @Override // defpackage.ky
    public final View j(int i, le leVar, lm lmVar) {
        int V;
        View aF;
        bB();
        if (at() == 0 || (V = V(i)) == Integer.MIN_VALUE) {
            return null;
        }
        int i2 = 1;
        int i3 = 0;
        int i4 = -1;
        int a = (V == -1) ^ this.e ? lmVar.a() - 1 : 0;
        if (R(a) != null) {
            aq(this.s, a);
        } else {
            this.f = a;
            an(leVar, lmVar, true);
        }
        boolean z = this.e;
        if (V == -1) {
            if (z) {
                i4 = at();
            } else {
                i3 = at() - 1;
                i2 = -1;
            }
            while (i3 != i4) {
                aF = aF(i3);
                if (aF != null && aF.hasFocusable()) {
                    break;
                }
                i3 += i2;
            }
            aF = null;
        } else {
            if (z) {
                i3 = at() - 1;
                i2 = -1;
            } else {
                i4 = at();
            }
            while (i3 != i4) {
                aF = aF(i3);
                if (aF != null && aF.hasFocusable()) {
                    break;
                }
                i3 += i2;
            }
            aF = null;
        }
        return (aF == null || !aF.hasFocusable()) ? ac(null, i, leVar, lmVar) : aF;
    }

    @Override // defpackage.ky
    public final View k(View view, int i, le leVar, lm lmVar) {
        View aE;
        if (at() == 0 || (aE = aE(view)) == null) {
            return null;
        }
        return ac(aE, i, leVar, lmVar);
    }

    final int l(int i, le leVar, lm lmVar) {
        if (at() == 0 || i == 0) {
            return 0;
        }
        I(i, lmVar);
        jz jzVar = this.l;
        int X = X(leVar, jzVar, lmVar);
        if (jzVar.b >= X) {
            i = i < 0 ? -X : X;
        }
        this.b.n(-i);
        this.o = this.e;
        jzVar.b = 0;
        ao(leVar, jzVar);
        return i;
    }

    final View m(boolean z) {
        int j = this.b.j();
        int f = this.b.f();
        View view = null;
        for (int at = at() - 1; at >= 0; at--) {
            View aF = aF(at);
            int d = this.b.d(aF);
            int a = this.b.a(aF);
            if (a > j && d < f) {
                if (a <= f || !z) {
                    return aF;
                }
                if (view == null) {
                    view = aF;
                }
            }
        }
        return view;
    }

    @Override // defpackage.ky
    public final void n(le leVar, lm lmVar, aah aahVar) {
        super.n(leVar, lmVar, aahVar);
        aahVar.o("android.support.v7.widget.StaggeredGridLayoutManager");
    }

    @Override // defpackage.ky
    public final void o(le leVar, lm lmVar, View view, aah aahVar) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (!(layoutParams instanceof lw)) {
            super.aN(view, aahVar);
            return;
        }
        lw lwVar = (lw) layoutParams;
        if (this.j == 0) {
            int d = lwVar.d();
            boolean z = lwVar.b;
            aahVar.r(brn.aa(d, 1, -1, -1, false, false));
        } else {
            int d2 = lwVar.d();
            boolean z2 = lwVar.b;
            aahVar.r(brn.aa(-1, -1, d2, 1, false, false));
        }
    }

    @Override // defpackage.ky
    public final void p(le leVar, lm lmVar) {
        an(leVar, lmVar, true);
    }

    @Override // defpackage.ky
    public final void q(lm lmVar) {
        this.f = -1;
        this.g = Integer.MIN_VALUE;
        this.q = null;
        this.H.a();
    }

    @Override // defpackage.ky
    public final void r(Rect rect, int i, int i2) {
        int as;
        int as2;
        int aA = aA() + aB();
        int aC = aC() + az();
        if (this.j == 1) {
            as2 = as(i2, rect.height() + aC, ax());
            as = as(i, (this.k * this.i) + aA, ay());
        } else {
            as = as(i, rect.width() + aA, ay());
            as2 = as(i2, (this.k * this.i) + aC, ax());
        }
        aY(as, as2);
    }

    final View s(boolean z) {
        int j = this.b.j();
        int f = this.b.f();
        int at = at();
        View view = null;
        for (int i = 0; i < at; i++) {
            View aF = aF(i);
            int d = this.b.d(aF);
            if (this.b.a(aF) > j && d < f) {
                if (d >= j || !z) {
                    return aF;
                }
                if (view == null) {
                    view = aF;
                }
            }
        }
        return view;
    }

    @Override // defpackage.ky
    public final boolean t(kz kzVar) {
        return kzVar instanceof lw;
    }

    @Override // defpackage.ky
    public final boolean v() {
        return this.q == null;
    }

    /* JADX WARN: Removed duplicated region for block: B:41:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00d9 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x002e A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00cf  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    final View w() {
        int at = at();
        int i = at - 1;
        BitSet bitSet = new BitSet(this.i);
        bitSet.set(0, this.i, true);
        char c = (this.j == 1 && O()) ? (char) 1 : (char) 65535;
        if (this.e) {
            at = -1;
        } else {
            i = 0;
        }
        int i2 = i < at ? 1 : -1;
        while (i != at) {
            View aF = aF(i);
            lw lwVar = (lw) aF.getLayoutParams();
            if (bitSet.get(lwVar.a.e)) {
                lz lzVar = lwVar.a;
                if (this.e) {
                    if (lzVar.c() < this.b.f()) {
                        boolean z = lz.n((View) lzVar.a.get(r13.size() - 1)).b;
                        return aF;
                    }
                } else if (lzVar.e() > this.b.j()) {
                    boolean z2 = lz.n((View) lzVar.a.get(0)).b;
                    return aF;
                }
                bitSet.clear(lwVar.a.e);
            }
            boolean z3 = lwVar.b;
            i += i2;
            if (i != at) {
                View aF2 = aF(i);
                boolean z4 = this.e;
                ko koVar = this.b;
                if (z4) {
                    int a = koVar.a(aF);
                    int a2 = this.b.a(aF2);
                    if (a < a2) {
                        return aF;
                    }
                    if (a == a2) {
                        if ((lwVar.a.e - ((lw) aF2.getLayoutParams()).a.e >= 0) == (c >= 0)) {
                            return aF;
                        }
                    } else {
                        continue;
                    }
                } else {
                    int d = koVar.d(aF);
                    int d2 = this.b.d(aF2);
                    if (d > d2) {
                        return aF;
                    }
                    if (d != d2) {
                        continue;
                    } else {
                        if ((lwVar.a.e - ((lw) aF2.getLayoutParams()).a.e >= 0) == (c >= 0)) {
                        }
                    }
                }
            }
        }
        return null;
    }

    @Override // defpackage.ky
    public final void x(int i, int i2) {
        am(i, i2, 1);
    }

    @Override // defpackage.ky
    public final void y() {
        this.h.c();
        aU();
    }

    @Override // defpackage.ky
    public final void z(int i, int i2) {
        am(i, i2, 8);
    }
}
