package android.support.v7.widget;

import android.content.Context;
import android.graphics.Rect;
import android.os.Bundle;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import android.widget.GridView;
import defpackage.a;
import defpackage.aag;
import defpackage.aah;
import defpackage.afr;
import defpackage.brn;
import defpackage.jv;
import defpackage.jy;
import defpackage.kc;
import defpackage.kd;
import defpackage.ke;
import defpackage.kr;
import defpackage.ky;
import defpackage.kz;
import defpackage.le;
import defpackage.lm;
import defpackage.lp;
import j$.util.DesugarCollections;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeMap;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class GridLayoutManager extends LinearLayoutManager {
    private static final Set G = DesugarCollections.unmodifiableSet(new HashSet(Arrays.asList(17, 66, 33, 130)));
    private int H;
    boolean a;
    int b;
    int[] c;
    View[] d;
    final SparseIntArray e;
    final SparseIntArray f;
    final Rect g;
    int h;
    int i;
    final afr j;

    public GridLayoutManager(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        this.a = false;
        this.b = -1;
        this.e = new SparseIntArray();
        this.f = new SparseIntArray();
        afr afrVar = new afr((byte[]) null, (byte[]) null);
        this.j = afrVar;
        this.g = new Rect();
        this.H = -1;
        this.h = -1;
        this.i = -1;
        int i3 = aD(context, attributeSet, i, i2).b;
        if (i3 == this.b) {
            return;
        }
        this.a = true;
        if (i3 <= 0) {
            throw new IllegalArgumentException(a.Y(i3, "Span count should be at least 1. Provided "));
        }
        this.b = i3;
        afrVar.q();
        aU();
    }

    private final int bA(int i) {
        if (this.k == 0) {
            RecyclerView recyclerView = this.s;
            return bC(recyclerView.e, recyclerView.M, i);
        }
        RecyclerView recyclerView2 = this.s;
        return bD(recyclerView2.e, recyclerView2.M, i);
    }

    private final int bB(int i) {
        if (this.k == 1) {
            RecyclerView recyclerView = this.s;
            return bC(recyclerView.e, recyclerView.M, i);
        }
        RecyclerView recyclerView2 = this.s;
        return bD(recyclerView2.e, recyclerView2.M, i);
    }

    private final int bC(le leVar, lm lmVar, int i) {
        if (lmVar.g) {
            int a = leVar.a(i);
            if (a == -1) {
                Log.w("GridLayoutManager", a.Y(i, "Cannot find span size for pre layout position. "));
                return 0;
            }
            i = a;
        }
        int i2 = this.b;
        int i3 = 0;
        int i4 = 0;
        int i5 = 0;
        while (true) {
            i3++;
            if (i4 >= i) {
                break;
            }
            if (i3 == i2) {
                i5++;
                i3 = 0;
            } else if (i3 > i2) {
                i5++;
                i3 = 1;
            }
            i4++;
        }
        return i3 > i2 ? i5 + 1 : i5;
    }

    private final int bD(le leVar, lm lmVar, int i) {
        if (!lmVar.g) {
            return i % this.b;
        }
        int i2 = this.f.get(i, -1);
        if (i2 != -1) {
            return i2;
        }
        int a = leVar.a(i);
        if (a != -1) {
            return a % this.b;
        }
        Log.w("GridLayoutManager", a.Y(i, "Cannot find span size for pre layout position. It is not cached, not in the adapter. Pos:"));
        return 0;
    }

    private final int bE(le leVar, lm lmVar, int i) {
        if (!lmVar.g) {
            return 1;
        }
        int i2 = this.e.get(i, -1);
        if (i2 != -1) {
            return i2;
        }
        if (leVar.a(i) == -1) {
            Log.w("GridLayoutManager", a.Y(i, "Cannot find span size for pre layout position. It is not cached, not in the adapter. Pos:"));
        }
        return 1;
    }

    private final View bF(View view, int i, le leVar, lm lmVar) {
        int i2;
        int i3;
        int at;
        int i4;
        int i5;
        int i6;
        View view2 = view;
        le leVar2 = leVar;
        lm lmVar2 = lmVar;
        if (view2 != null) {
            jy jyVar = (jy) view2.getLayoutParams();
            i3 = jyVar.a;
            i2 = jyVar.b + i3;
        } else {
            i2 = 0;
            i3 = 0;
        }
        if (super.S(i, leVar2, lmVar2) == null) {
            return null;
        }
        int i7 = -1;
        if ((I(i) == 1) != this.m) {
            i5 = at() - 1;
            at = -1;
            i4 = -1;
        } else {
            at = at();
            i4 = 1;
            i5 = 0;
        }
        boolean z = this.k == 1 && ag();
        int bC = bC(leVar2, lmVar2, i5);
        View view3 = null;
        View view4 = null;
        int i8 = -1;
        int i9 = 0;
        int i10 = 0;
        while (i5 != at) {
            int bC2 = bC(leVar2, lmVar2, i5);
            View aF = aF(i5);
            if (aF == view2) {
                break;
            }
            if (aF.hasFocusable() && bC2 != bC) {
                if (view3 != null) {
                    break;
                }
                i6 = i5;
                view3 = null;
            } else {
                jy jyVar2 = (jy) aF.getLayoutParams();
                int i11 = jyVar2.a;
                i6 = i5;
                int i12 = jyVar2.b + i11;
                if (view != null && aF.hasFocusable() && i11 == i3 && i12 == i2) {
                    return aF;
                }
                if (aF.hasFocusable() && view3 == null) {
                    view3 = null;
                } else if (aF.hasFocusable() || view4 != null) {
                    if (view != null) {
                        int min = Math.min(i12, i2) - Math.max(i11, i3);
                        if (aF.hasFocusable()) {
                            if (min <= i9) {
                                if (min == i9) {
                                    if (z != (i11 > i7)) {
                                    }
                                }
                            }
                        } else if (view3 == null && bp(aF)) {
                            if (min <= i10) {
                                if (min == i10) {
                                    if (z != (i11 > i8)) {
                                    }
                                }
                            }
                        }
                    } else if (aF.hasFocusable()) {
                        if (z != (i11 > i7)) {
                        }
                    } else if (view3 == null && bp(aF)) {
                        if (z != (i11 > i8)) {
                        }
                    }
                }
                if (aF.hasFocusable()) {
                    int i13 = jyVar2.a;
                    i9 = Math.min(i12, i2) - Math.max(i11, i3);
                    view3 = aF;
                    i7 = i13;
                } else {
                    int i14 = jyVar2.a;
                    i10 = Math.min(i12, i2) - Math.max(i11, i3);
                    view4 = aF;
                    i8 = i14;
                }
            }
            i5 = i6 + i4;
            view2 = view;
            leVar2 = leVar;
            lmVar2 = lmVar;
        }
        return view3 != null ? view3 : view4;
    }

    private final Set bG(int i) {
        return bI(bA(i), i);
    }

    private final Set bH(int i) {
        return bI(bB(i), i);
    }

    private final Set bI(int i, int i2) {
        HashSet hashSet = new HashSet();
        RecyclerView recyclerView = this.s;
        int bE = bE(recyclerView.e, recyclerView.M, i2);
        for (int i3 = i; i3 < i + bE; i3++) {
            hashSet.add(Integer.valueOf(i3));
        }
        return hashSet;
    }

    private final void bJ(int i) {
        int i2;
        int length;
        int[] iArr = this.c;
        int i3 = this.b;
        int i4 = i3 + 1;
        if (iArr == null || (length = iArr.length) != i4 || iArr[length - 1] != i) {
            iArr = new int[i4];
        }
        int i5 = 0;
        iArr[0] = 0;
        int i6 = i / i3;
        int i7 = i % i3;
        int i8 = 0;
        for (int i9 = 1; i9 <= i3; i9++) {
            i5 += i7;
            if (i5 <= 0 || i3 - i5 >= i7) {
                i2 = i6;
            } else {
                i2 = i6 + 1;
                i5 -= i3;
            }
            i8 += i2;
            iArr[i9] = i8;
        }
        this.c = iArr;
    }

    private final void bK() {
        View[] viewArr = this.d;
        if (viewArr != null) {
            if (viewArr.length == this.b) {
                return;
            }
        }
        this.d = new View[this.b];
    }

    private final void bL(View view, int i, boolean z) {
        int i2;
        int i3;
        jy jyVar = (jy) view.getLayoutParams();
        Rect rect = jyVar.d;
        int i4 = rect.top + rect.bottom + jyVar.topMargin + jyVar.bottomMargin;
        int i5 = rect.left + rect.right + jyVar.leftMargin + jyVar.rightMargin;
        int c = c(jyVar.a, jyVar.b);
        if (this.k == 1) {
            i3 = au(c, i, i5, jyVar.width, false);
            i2 = au(this.l.k(), this.B, i4, jyVar.height, true);
        } else {
            int au = au(c, i, i4, jyVar.height, false);
            int au2 = au(this.l.k(), this.A, i5, jyVar.width, true);
            i2 = au;
            i3 = au2;
        }
        bM(view, i3, i2, z);
    }

    private final void bM(View view, int i, int i2, boolean z) {
        boolean bf;
        kz kzVar = (kz) view.getLayoutParams();
        if (z) {
            bf = true;
            if (this.w && ky.bc(view.getMeasuredWidth(), i, kzVar.width) && ky.bc(view.getMeasuredHeight(), i2, kzVar.height)) {
                bf = false;
            }
        } else {
            bf = bf(view, i, i2, kzVar);
        }
        if (bf) {
            view.measure(i, i2);
        }
    }

    private final void bN() {
        int az;
        int aC;
        if (this.k == 1) {
            az = this.C - aB();
            aC = aA();
        } else {
            az = this.D - az();
            aC = aC();
        }
        bJ(az - aC);
    }

    @Override // defpackage.ky
    public final void A(int i, int i2) {
        afr afrVar = this.j;
        afrVar.q();
        afrVar.p();
    }

    @Override // defpackage.ky
    public final void B(int i, int i2) {
        afr afrVar = this.j;
        afrVar.q();
        afrVar.p();
    }

    @Override // defpackage.ky
    public final int a(le leVar, lm lmVar) {
        if (this.k == 1) {
            return Math.min(this.b, av());
        }
        if (lmVar.a() <= 0) {
            return 0;
        }
        return bC(leVar, lmVar, lmVar.a() - 1) + 1;
    }

    @Override // defpackage.ky
    public final int b(le leVar, lm lmVar) {
        if (this.k == 0) {
            return Math.min(this.b, av());
        }
        if (lmVar.a() <= 0) {
            return 0;
        }
        return bC(leVar, lmVar, lmVar.a() - 1) + 1;
    }

    final int c(int i, int i2) {
        if (this.k != 1 || !ag()) {
            int[] iArr = this.c;
            return iArr[i2 + i] - iArr[i];
        }
        int[] iArr2 = this.c;
        int i3 = this.b - i;
        return iArr2[i3] - iArr2[i3 - i2];
    }

    @Override // android.support.v7.widget.LinearLayoutManager, defpackage.ky
    public final int d(int i, le leVar, lm lmVar) {
        bN();
        bK();
        return super.d(i, leVar, lmVar);
    }

    @Override // android.support.v7.widget.LinearLayoutManager, defpackage.ky
    public final int e(int i, le leVar, lm lmVar) {
        bN();
        bK();
        return super.e(i, leVar, lmVar);
    }

    @Override // android.support.v7.widget.LinearLayoutManager, defpackage.ky
    public final kz f() {
        return this.k == 0 ? new jy(-2, -1) : new jy(-1, -2);
    }

    @Override // defpackage.ky
    public final kz g(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof ViewGroup.MarginLayoutParams ? new jy((ViewGroup.MarginLayoutParams) layoutParams) : new jy(layoutParams);
    }

    @Override // defpackage.ky
    public final kz h(Context context, AttributeSet attributeSet) {
        return new jy(context, attributeSet);
    }

    @Override // android.support.v7.widget.LinearLayoutManager
    public final View i(le leVar, lm lmVar, boolean z, boolean z2) {
        int i;
        int i2;
        int i3;
        int at = at();
        if (z2) {
            i = -1;
            i2 = at() - 1;
            i3 = -1;
        } else {
            i = at;
            i2 = 0;
            i3 = 1;
        }
        int a = lmVar.a();
        V();
        int j = this.l.j();
        int f = this.l.f();
        View view = null;
        View view2 = null;
        while (i2 != i) {
            View aF = aF(i2);
            int bl = bl(aF);
            if (bl >= 0 && bl < a && bD(leVar, lmVar, bl) == 0) {
                if (((kz) aF.getLayoutParams()).c()) {
                    if (view2 == null) {
                        view2 = aF;
                    }
                } else {
                    if (this.l.d(aF) < f && this.l.a(aF) >= j) {
                        return aF;
                    }
                    if (view == null) {
                        view = aF;
                    }
                }
            }
            i2 += i3;
        }
        return view != null ? view : view2;
    }

    @Override // android.support.v7.widget.LinearLayoutManager, defpackage.ky
    public final View j(int i, le leVar, lm lmVar) {
        int I;
        Z();
        if (at() == 0 || (I = I(i)) == Integer.MIN_VALUE) {
            return null;
        }
        V();
        int a = (I == -1) ^ this.m ? lmVar.a() - 1 : 0;
        if (R(a) != null) {
            aq(this.s, a);
        } else {
            this.n = a;
            p(leVar, lmVar);
        }
        View O = I == -1 ? O() : P();
        return (O == null || !O.hasFocusable()) ? bF(null, i, leVar, lmVar) : O;
    }

    @Override // android.support.v7.widget.LinearLayoutManager, defpackage.ky
    public final View k(View view, int i, le leVar, lm lmVar) {
        View aE = aE(view);
        if (aE == null) {
            return null;
        }
        return bF(aE, i, leVar, lmVar);
    }

    /* JADX WARN: Code restructure failed: missing block: B:101:0x0205, code lost:
    
        r2 = aA() + r18.c[r6.a];
        r3 = r18.l.c(r5) + r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:102:0x0218, code lost:
    
        r1 = aC() + r18.c[r6.a];
        r14 = r1;
        r1 = r18.l.c(r5) + r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:104:0x024a, code lost:
    
        java.util.Arrays.fill(r5, (java.lang.Object) null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:105:0x024e, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:107:0x01b5, code lost:
    
        r14 = r21.b;
        r1 = r14 + r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:109:0x01bf, code lost:
    
        if (r21.f != (-1)) goto L85;
     */
    /* JADX WARN: Code restructure failed: missing block: B:110:0x01c1, code lost:
    
        r14 = r21.b;
        r2 = r14 - r7;
        r1 = 0;
        r3 = r14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:111:0x01d0, code lost:
    
        r14 = r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:112:0x01c9, code lost:
    
        r14 = r21.b;
        r3 = r14 + r7;
        r1 = 0;
        r2 = r14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:113:0x009b, code lost:
    
        r12 = r13 - 1;
        r14 = -1;
        r15 = -1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0095, code lost:
    
        if (r11 != 1) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0097, code lost:
    
        r15 = 1;
        r14 = r13;
        r12 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x009f, code lost:
    
        r7 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x00a0, code lost:
    
        if (r12 == r14) goto L113;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x00a2, code lost:
    
        r8 = r18.d[r12];
        r9 = (defpackage.jy) r8.getLayoutParams();
        r8 = bE(r19, r20, bl(r8));
        r9.b = r8;
        r9.a = r7;
        r7 = r7 + r8;
        r12 = r12 + r15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x00be, code lost:
    
        r1 = 0.0f;
        r2 = 0;
        r7 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x00c1, code lost:
    
        if (r2 >= r13) goto L114;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00c3, code lost:
    
        r8 = r18.d[r2];
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00c9, code lost:
    
        if (r21.l != null) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x00cc, code lost:
    
        if (r11 != 1) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00ce, code lost:
    
        r14 = false;
        super.aH(r8, -1, false);
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00e6, code lost:
    
        aI(r8, r18.g);
        bL(r8, r5, r14);
        r9 = r18.l.b(r8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00f4, code lost:
    
        if (r9 <= r7) goto L53;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00f6, code lost:
    
        r7 = r9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x00f7, code lost:
    
        r8 = r18.l.c(r8) / ((defpackage.jy) r8.getLayoutParams()).b;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x010a, code lost:
    
        if (r8 <= r1) goto L116;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x010c, code lost:
    
        r1 = r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x010d, code lost:
    
        r2 = r2 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x00d4, code lost:
    
        r14 = false;
        super.aH(r8, 0, false);
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x00da, code lost:
    
        r14 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x00dd, code lost:
    
        if (r11 != 1) goto L49;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x00df, code lost:
    
        super.aH(r8, -1, true);
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x00e3, code lost:
    
        super.aH(r8, 0, true);
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x0110, code lost:
    
        if (r10 == false) goto L64;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x0112, code lost:
    
        bJ(java.lang.Math.max(java.lang.Math.round(r1 * r18.b), r6));
        r7 = 0;
        r14 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x0123, code lost:
    
        if (r14 >= r13) goto L117;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x0125, code lost:
    
        r1 = r18.d[r14];
        bL(r1, 1073741824, true);
        r1 = r18.l.b(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x0135, code lost:
    
        if (r1 <= r7) goto L119;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x0137, code lost:
    
        r7 = r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x0138, code lost:
    
        r14 = r14 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x013b, code lost:
    
        r14 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x013c, code lost:
    
        if (r14 >= r13) goto L120;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x013e, code lost:
    
        r1 = r18.d[r14];
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x0148, code lost:
    
        if (r18.l.b(r1) == r7) goto L73;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x014a, code lost:
    
        r2 = (defpackage.jy) r1.getLayoutParams();
        r5 = r2.d;
        r6 = ((r5.top + r5.bottom) + r2.topMargin) + r2.bottomMargin;
        r8 = ((r5.left + r5.right) + r2.leftMargin) + r2.rightMargin;
        r5 = c(r2.a, r2.b);
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x0173, code lost:
    
        if (r18.k != 1) goto L71;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x0175, code lost:
    
        r2 = au(r5, 1073741824, r8, r2.width, false);
        r5 = android.view.View.MeasureSpec.makeMeasureSpec(r7 - r6, 1073741824);
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x0195, code lost:
    
        bM(r1, r2, r5, true);
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x019d, code lost:
    
        r14 = r14 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x0185, code lost:
    
        r8 = android.view.View.MeasureSpec.makeMeasureSpec(r7 - r8, 1073741824);
        r5 = au(r5, 1073741824, r6, r2.height, false);
        r2 = r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x01a0, code lost:
    
        r22.a = r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x01a6, code lost:
    
        if (r18.k != 1) goto L82;
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x01ab, code lost:
    
        if (r21.f != (-1)) goto L80;
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x01ad, code lost:
    
        r14 = r21.b;
        r14 = r14 - r7;
        r1 = r14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x01b9, code lost:
    
        r2 = 0;
        r3 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x01d1, code lost:
    
        r7 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x01d2, code lost:
    
        r5 = r18.d;
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x01d4, code lost:
    
        if (r7 >= r13) goto L123;
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x01d6, code lost:
    
        r5 = r5[r7];
        r6 = (defpackage.jy) r5.getLayoutParams();
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x01e1, code lost:
    
        if (r18.k != 1) goto L96;
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x01e7, code lost:
    
        if (ag() == false) goto L95;
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x01e9, code lost:
    
        r2 = aA() + r18.c[r18.b - r6.a];
        r3 = r2;
        r2 = r2 - r18.l.c(r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x022c, code lost:
    
        bq(r5, r2, r14, r3, r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x0233, code lost:
    
        if (r6.c() != false) goto L101;
     */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x0239, code lost:
    
        if (r6.b() == false) goto L125;
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x023e, code lost:
    
        r22.d = r5.hasFocusable() | r22.d;
        r7 = r7 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x023b, code lost:
    
        r22.c = true;
     */
    @Override // android.support.v7.widget.LinearLayoutManager
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void l(le leVar, lm lmVar, ke keVar, kd kdVar) {
        View a;
        int i = this.l.i();
        int i2 = at() > 0 ? this.c[this.b] : 0;
        boolean z = i != 1073741824;
        if (z) {
            bN();
        }
        int i3 = keVar.e;
        int i4 = this.b;
        if (i3 != 1) {
            i4 = bD(leVar, lmVar, keVar.d) + bE(leVar, lmVar, keVar.d);
        }
        int i5 = 0;
        while (i5 < this.b && keVar.c(lmVar) && i4 > 0) {
            int i6 = keVar.d;
            int bE = bE(leVar, lmVar, i6);
            if (bE > this.b) {
                throw new IllegalArgumentException("Item at position " + i6 + " requires " + bE + " spans but GridLayoutManager has only " + this.b + " spans.");
            }
            i4 -= bE;
            if (i4 < 0 || (a = keVar.a(leVar)) == null) {
                break;
            }
            this.d[i5] = a;
            i5++;
        }
        kdVar.b = true;
    }

    @Override // android.support.v7.widget.LinearLayoutManager
    public final void m(le leVar, lm lmVar, kc kcVar, int i) {
        bN();
        if (lmVar.a() > 0 && !lmVar.g) {
            int bD = bD(leVar, lmVar, kcVar.b);
            if (i == 1) {
                while (bD > 0) {
                    int i2 = kcVar.b;
                    if (i2 <= 0) {
                        break;
                    }
                    int i3 = i2 - 1;
                    kcVar.b = i3;
                    bD = bD(leVar, lmVar, i3);
                }
            } else {
                int a = lmVar.a() - 1;
                int i4 = kcVar.b;
                while (i4 < a) {
                    int i5 = i4 + 1;
                    int bD2 = bD(leVar, lmVar, i5);
                    if (bD2 <= bD) {
                        break;
                    }
                    i4 = i5;
                    bD = bD2;
                }
                kcVar.b = i4;
            }
        }
        bK();
    }

    @Override // android.support.v7.widget.LinearLayoutManager, defpackage.ky
    public final void n(le leVar, lm lmVar, aah aahVar) {
        super.n(leVar, lmVar, aahVar);
        aahVar.o(GridView.class.getName());
        kr krVar = this.s.l;
        if (krVar == null || krVar.a() <= 1) {
            return;
        }
        aahVar.h(aag.j);
    }

    @Override // defpackage.ky
    public final void o(le leVar, lm lmVar, View view, aah aahVar) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (!(layoutParams instanceof jy)) {
            super.aN(view, aahVar);
            return;
        }
        jy jyVar = (jy) layoutParams;
        int bC = bC(leVar, lmVar, jyVar.a());
        if (this.k == 0) {
            aahVar.r(brn.aa(jyVar.a, jyVar.b, bC, 1, false, false));
        } else {
            aahVar.r(brn.aa(bC, 1, jyVar.a, jyVar.b, false, false));
        }
    }

    @Override // android.support.v7.widget.LinearLayoutManager, defpackage.ky
    public final void p(le leVar, lm lmVar) {
        if (lmVar.g) {
            int at = at();
            for (int i = 0; i < at; i++) {
                jy jyVar = (jy) aF(i).getLayoutParams();
                int a = jyVar.a();
                this.e.put(a, jyVar.b);
                this.f.put(a, jyVar.a);
            }
        }
        super.X(leVar, lmVar);
        this.e.clear();
        this.f.clear();
    }

    @Override // android.support.v7.widget.LinearLayoutManager, defpackage.ky
    public final void q(lm lmVar) {
        View R;
        super.q(lmVar);
        this.a = false;
        int i = this.H;
        if (i == -1 || (R = R(i)) == null) {
            return;
        }
        R.sendAccessibilityEvent(67108864);
        this.H = -1;
    }

    @Override // defpackage.ky
    public final void r(Rect rect, int i, int i2) {
        int as;
        int as2;
        if (this.c == null) {
            super.r(rect, i, i2);
        }
        int aA = aA() + aB();
        int aC = aC() + az();
        if (this.k == 1) {
            as2 = as(i2, rect.height() + aC, ax());
            as = as(i, this.c[r7.length - 1] + aA, ay());
        } else {
            as = as(i, rect.width() + aA, ay());
            as2 = as(i2, this.c[r5.length - 1] + aC, ax());
        }
        aY(as, as2);
    }

    @Override // android.support.v7.widget.LinearLayoutManager
    public final void s(boolean z) {
        if (z) {
            throw new UnsupportedOperationException("GridLayoutManager does not support stack from end. Consider using reverse layout");
        }
        super.s(false);
    }

    @Override // defpackage.ky
    public final boolean t(kz kzVar) {
        return kzVar instanceof jy;
    }

    /* JADX WARN: Removed duplicated region for block: B:109:0x025c  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x018c  */
    @Override // android.support.v7.widget.LinearLayoutManager, defpackage.ky
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean u(int i, Bundle bundle) {
        View view;
        lp g;
        int i2;
        int i3 = -1;
        if (i == aag.j.a()) {
            if (i != -1) {
                int i4 = 0;
                while (true) {
                    if (i4 >= at()) {
                        view = null;
                        break;
                    }
                    View aF = aF(i4);
                    aF.getClass();
                    if (aF.isAccessibilityFocused()) {
                        view = aF(i4);
                        break;
                    }
                    i4++;
                }
                if (view != null && bundle != null) {
                    int i5 = bundle.getInt("android.view.accessibility.action.ARGUMENT_DIRECTION_INT", -1);
                    if (G.contains(Integer.valueOf(i5)) && (g = this.s.g(view)) != null) {
                        int a = g.a();
                        int bB = bB(a);
                        int bA = bA(a);
                        if (bB >= 0 && bA >= 0) {
                            if (!bH(a).contains(Integer.valueOf(this.h)) || !bG(a).contains(Integer.valueOf(this.i))) {
                                this.h = bB;
                                this.i = bA;
                            }
                            int i6 = this.h;
                            if (i6 == -1) {
                                i6 = bB;
                            }
                            int i7 = this.i;
                            if (i7 != -1) {
                                bA = i7;
                            }
                            if (i5 == 17) {
                                i2 = a - 1;
                                while (i2 >= 0) {
                                    int bB2 = bB(i2);
                                    int bA2 = bA(i2);
                                    if (bB2 < 0 || bA2 < 0) {
                                        break;
                                    }
                                    if (this.k != 1) {
                                        if (bH(i2).contains(Integer.valueOf(i6)) && bA2 < bA) {
                                            this.i = bA2;
                                            break;
                                        }
                                        i2--;
                                    } else {
                                        if ((bB2 == i6 && bA2 < bA) || bB2 < i6) {
                                            this.h = bB2;
                                            this.i = bA2;
                                            break;
                                        }
                                        i2--;
                                    }
                                }
                                i2 = -1;
                                if (i2 == -1) {
                                }
                                if (i2 != -1) {
                                }
                            } else if (i5 == 33) {
                                i2 = a - 1;
                                while (i2 >= 0) {
                                    int bB3 = bB(i2);
                                    int bA3 = bA(i2);
                                    if (bB3 < 0 || bA3 < 0) {
                                        break;
                                    }
                                    if (this.k == 1) {
                                        if (bB3 < i6 && bG(i2).contains(Integer.valueOf(bA))) {
                                            this.h = bB3;
                                            break;
                                        }
                                        i2--;
                                    } else {
                                        if (bB3 < i6 && bA3 == bA) {
                                            this.h = ((Integer) Collections.max(bH(i2))).intValue();
                                            break;
                                        }
                                        i2--;
                                    }
                                }
                                i2 = -1;
                                if (i2 == -1) {
                                }
                                if (i2 != -1) {
                                }
                            } else if (i5 == 66) {
                                i2 = a + 1;
                                while (i2 < av()) {
                                    int bB4 = bB(i2);
                                    int bA4 = bA(i2);
                                    if (bB4 < 0 || bA4 < 0) {
                                        break;
                                    }
                                    if (this.k != 1) {
                                        if (bA4 > bA && bH(i2).contains(Integer.valueOf(i6))) {
                                            this.i = bA4;
                                            break;
                                        }
                                        i2++;
                                    } else {
                                        if ((bB4 == i6 && bA4 > bA) || bB4 > i6) {
                                            this.h = bB4;
                                            this.i = bA4;
                                            break;
                                        }
                                        i2++;
                                    }
                                }
                                i2 = -1;
                                if (i2 == -1) {
                                }
                                if (i2 != -1) {
                                }
                            } else if (i5 == 130) {
                                i2 = a + 1;
                                while (i2 < av()) {
                                    int bB5 = bB(i2);
                                    int bA5 = bA(i2);
                                    if (bB5 < 0 || bA5 < 0) {
                                        break;
                                    }
                                    if (this.k == 1) {
                                        if (bB5 > i6 && (bA5 == bA || bG(i2).contains(Integer.valueOf(bA)))) {
                                            this.h = bB5;
                                            break;
                                        }
                                        i2++;
                                    } else {
                                        if (bB5 > i6 && bA5 == bA) {
                                            this.h = bB(i2);
                                            break;
                                        }
                                        i2++;
                                    }
                                }
                                i2 = -1;
                                if (i2 == -1) {
                                    if (this.k == 0) {
                                        if (i5 == 17) {
                                            TreeMap treeMap = new TreeMap(Collections.reverseOrder());
                                            int i8 = 0;
                                            loop2: while (true) {
                                                if (i8 >= av()) {
                                                    for (Integer num : treeMap.keySet()) {
                                                        int intValue = num.intValue();
                                                        if (intValue < bB) {
                                                            i2 = ((Integer) treeMap.get(num)).intValue();
                                                            this.h = intValue;
                                                            this.i = bA(i2);
                                                            break;
                                                        }
                                                    }
                                                } else {
                                                    for (Integer num2 : bH(i8)) {
                                                        if (num2.intValue() < 0) {
                                                            break loop2;
                                                        }
                                                        treeMap.put(num2, Integer.valueOf(i8));
                                                    }
                                                    i8++;
                                                }
                                            }
                                        } else if (i5 == 66) {
                                            TreeMap treeMap2 = new TreeMap();
                                            int i9 = 0;
                                            loop5: while (true) {
                                                if (i9 >= av()) {
                                                    for (Integer num3 : treeMap2.keySet()) {
                                                        int intValue2 = num3.intValue();
                                                        if (intValue2 > bB) {
                                                            i2 = ((Integer) treeMap2.get(num3)).intValue();
                                                            this.h = intValue2;
                                                            this.i = 0;
                                                            break;
                                                        }
                                                    }
                                                } else {
                                                    for (Integer num4 : bH(i9)) {
                                                        if (num4.intValue() < 0) {
                                                            break loop5;
                                                        }
                                                        if (!treeMap2.containsKey(num4)) {
                                                            treeMap2.put(num4, Integer.valueOf(i9));
                                                        }
                                                    }
                                                    i9++;
                                                }
                                            }
                                        }
                                    }
                                    i2 = -1;
                                }
                                if (i2 != -1) {
                                    aa(i2);
                                    this.H = i2;
                                    return true;
                                }
                            }
                        }
                    }
                }
                return false;
            }
            i = -1;
        }
        if (i == 16908343) {
            if (bundle != null) {
                int i10 = bundle.getInt("android.view.accessibility.action.ARGUMENT_ROW_INT", -1);
                int i11 = bundle.getInt("android.view.accessibility.action.ARGUMENT_COLUMN_INT", -1);
                if (i10 != -1 && i11 != -1) {
                    int a2 = this.s.l.a();
                    for (int i12 = 0; i12 < a2; i12++) {
                        RecyclerView recyclerView = this.s;
                        int bD = bD(recyclerView.e, recyclerView.M, i12);
                        RecyclerView recyclerView2 = this.s;
                        int bC = bC(recyclerView2.e, recyclerView2.M, i12);
                        if (this.k == 1) {
                            if (bD == i11 && bC == i10) {
                                i3 = i12;
                                break;
                            }
                        } else {
                            if (bD == i10 && bC == i11) {
                                i3 = i12;
                                break;
                            }
                        }
                    }
                    if (i3 >= 0) {
                        ar(i3);
                        return true;
                    }
                }
                return false;
            }
            i = 16908343;
        }
        return super.u(i, bundle);
    }

    @Override // android.support.v7.widget.LinearLayoutManager, defpackage.ky
    public final boolean v() {
        return this.p == null && !this.a;
    }

    @Override // android.support.v7.widget.LinearLayoutManager
    public final void w(lm lmVar, ke keVar, jv jvVar) {
        int i = this.b;
        for (int i2 = 0; i2 < this.b && keVar.c(lmVar) && i > 0; i2++) {
            jvVar.a(keVar.d, Math.max(0, keVar.g));
            i--;
            keVar.d += keVar.e;
        }
    }

    @Override // defpackage.ky
    public final void x(int i, int i2) {
        afr afrVar = this.j;
        afrVar.q();
        afrVar.p();
    }

    @Override // defpackage.ky
    public final void y() {
        afr afrVar = this.j;
        afrVar.q();
        afrVar.p();
    }

    @Override // defpackage.ky
    public final void z(int i, int i2) {
        afr afrVar = this.j;
        afrVar.q();
        afrVar.p();
    }
}
