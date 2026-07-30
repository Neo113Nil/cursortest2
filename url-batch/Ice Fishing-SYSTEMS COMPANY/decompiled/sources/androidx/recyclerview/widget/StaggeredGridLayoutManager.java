package androidx.recyclerview.widget;

import O.X;
import P.j;
import P.k;
import S0.s;
import android.content.Context;
import android.graphics.PointF;
import android.graphics.Rect;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import androidx.emoji2.text.g;
import com.google.android.gms.internal.ads.BP;
import com.google.android.gms.internal.ads.C2830Vl;
import com.google.android.gms.internal.ads.H;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.BitSet;
import java.util.WeakHashMap;
import q2.R0;
import t0.AbstractC5019C;
import t0.C5018B;
import t0.C5020D;
import t0.C5029M;
import t0.C5035T;
import t0.C5036U;
import t0.C5037V;
import t0.C5053p;
import t0.C5056s;
import t0.InterfaceC5028L;
import t0.W;

/* loaded from: classes.dex */
public class StaggeredGridLayoutManager extends AbstractC5019C implements InterfaceC5028L {

    /* renamed from: B, reason: collision with root package name */
    public final s f5389B;

    /* renamed from: C, reason: collision with root package name */
    public final int f5390C;

    /* renamed from: D, reason: collision with root package name */
    public boolean f5391D;

    /* renamed from: E, reason: collision with root package name */
    public boolean f5392E;

    /* renamed from: F, reason: collision with root package name */
    public W f5393F;

    /* renamed from: G, reason: collision with root package name */
    public final Rect f5394G;

    /* renamed from: H, reason: collision with root package name */
    public final C5035T f5395H;

    /* renamed from: I, reason: collision with root package name */
    public final boolean f5396I;
    public int[] J;

    /* renamed from: K, reason: collision with root package name */
    public final R0 f5397K;

    /* renamed from: p, reason: collision with root package name */
    public final int f5398p;

    /* renamed from: q, reason: collision with root package name */
    public final H[] f5399q;

    /* renamed from: r, reason: collision with root package name */
    public final g f5400r;

    /* renamed from: s, reason: collision with root package name */
    public final g f5401s;

    /* renamed from: t, reason: collision with root package name */
    public final int f5402t;

    /* renamed from: u, reason: collision with root package name */
    public int f5403u;

    /* renamed from: v, reason: collision with root package name */
    public final C5053p f5404v;

    /* renamed from: w, reason: collision with root package name */
    public boolean f5405w;

    /* renamed from: y, reason: collision with root package name */
    public final BitSet f5407y;

    /* renamed from: x, reason: collision with root package name */
    public boolean f5406x = false;

    /* renamed from: z, reason: collision with root package name */
    public int f5408z = -1;

    /* renamed from: A, reason: collision with root package name */
    public int f5388A = Integer.MIN_VALUE;

    public StaggeredGridLayoutManager(Context context, AttributeSet attributeSet, int i, int i4) {
        this.f5398p = -1;
        this.f5405w = false;
        s sVar = new s(16, false);
        this.f5389B = sVar;
        this.f5390C = 2;
        this.f5394G = new Rect();
        this.f5395H = new C5035T(this);
        this.f5396I = true;
        this.f5397K = new R0(6, this);
        C5018B I2 = AbstractC5019C.I(context, attributeSet, i, i4);
        int i9 = I2.f40558a;
        if (i9 != 0 && i9 != 1) {
            throw new IllegalArgumentException("invalid orientation.");
        }
        c(null);
        if (i9 != this.f5402t) {
            this.f5402t = i9;
            g gVar = this.f5400r;
            this.f5400r = this.f5401s;
            this.f5401s = gVar;
            l0();
        }
        int i10 = I2.f40559b;
        c(null);
        if (i10 != this.f5398p) {
            int[] iArr = (int[]) sVar.f2952u;
            if (iArr != null) {
                Arrays.fill(iArr, -1);
            }
            sVar.f2953v = null;
            l0();
            this.f5398p = i10;
            this.f5407y = new BitSet(this.f5398p);
            this.f5399q = new H[this.f5398p];
            for (int i11 = 0; i11 < this.f5398p; i11++) {
                this.f5399q[i11] = new H(this, i11);
            }
            l0();
        }
        boolean z8 = I2.f40560c;
        c(null);
        W w9 = this.f5393F;
        if (w9 != null && w9.f40648A != z8) {
            w9.f40648A = z8;
        }
        this.f5405w = z8;
        l0();
        C5053p c5053p = new C5053p();
        c5053p.f40757a = true;
        c5053p.f40762f = 0;
        c5053p.f40763g = 0;
        this.f5404v = c5053p;
        this.f5400r = g.a(this, this.f5402t);
        this.f5401s = g.a(this, 1 - this.f5402t);
    }

    public static int c1(int i, int i4, int i9) {
        int mode;
        return (!(i4 == 0 && i9 == 0) && ((mode = View.MeasureSpec.getMode(i)) == Integer.MIN_VALUE || mode == 1073741824)) ? View.MeasureSpec.makeMeasureSpec(Math.max(0, (View.MeasureSpec.getSize(i) - i4) - i9), mode) : i;
    }

    public final boolean A0() {
        int J02;
        if (v() != 0 && this.f5390C != 0 && this.f40568g) {
            if (this.f5406x) {
                J02 = K0();
                J0();
            } else {
                J02 = J0();
                K0();
            }
            s sVar = this.f5389B;
            if (J02 == 0 && O0() != null) {
                int[] iArr = (int[]) sVar.f2952u;
                if (iArr != null) {
                    Arrays.fill(iArr, -1);
                }
                sVar.f2953v = null;
                this.f40567f = true;
                l0();
                return true;
            }
        }
        return false;
    }

    public final int B0(C5029M c5029m) {
        if (v() == 0) {
            return 0;
        }
        g gVar = this.f5400r;
        boolean z8 = !this.f5396I;
        return com.bumptech.glide.g.E(c5029m, gVar, G0(z8), F0(z8), this, this.f5396I);
    }

    public final int C0(C5029M c5029m) {
        if (v() == 0) {
            return 0;
        }
        g gVar = this.f5400r;
        boolean z8 = !this.f5396I;
        return com.bumptech.glide.g.F(c5029m, gVar, G0(z8), F0(z8), this, this.f5396I, this.f5406x);
    }

    public final int D0(C5029M c5029m) {
        if (v() == 0) {
            return 0;
        }
        g gVar = this.f5400r;
        boolean z8 = !this.f5396I;
        return com.bumptech.glide.g.G(c5029m, gVar, G0(z8), F0(z8), this, this.f5396I);
    }

    /* JADX WARN: Type inference failed for: r6v20 */
    /* JADX WARN: Type inference failed for: r6v3 */
    /* JADX WARN: Type inference failed for: r6v4, types: [boolean, int] */
    public final int E0(BP bp, C5053p c5053p, C5029M c5029m) {
        H h9;
        ?? r62;
        int i;
        int h10;
        int c4;
        int k6;
        int c9;
        int i4;
        int i9;
        int i10;
        int i11 = 0;
        int i12 = 1;
        this.f5407y.set(0, this.f5398p, true);
        C5053p c5053p2 = this.f5404v;
        int i13 = c5053p2.i ? c5053p.f40761e == 1 ? Integer.MAX_VALUE : Integer.MIN_VALUE : c5053p.f40761e == 1 ? c5053p.f40763g + c5053p.f40758b : c5053p.f40762f - c5053p.f40758b;
        int i14 = c5053p.f40761e;
        for (int i15 = 0; i15 < this.f5398p; i15++) {
            if (!this.f5399q[i15].f25264a.isEmpty()) {
                b1(this.f5399q[i15], i14, i13);
            }
        }
        int g9 = this.f5406x ? this.f5400r.g() : this.f5400r.k();
        boolean z8 = false;
        while (true) {
            int i16 = c5053p.f40759c;
            if (((i16 < 0 || i16 >= c5029m.b()) ? i11 : i12) == 0 || (!c5053p2.i && this.f5407y.isEmpty())) {
                break;
            }
            View view = bp.i(c5053p.f40759c, Long.MAX_VALUE).f40615a;
            c5053p.f40759c += c5053p.f40760d;
            C5036U c5036u = (C5036U) view.getLayoutParams();
            int b9 = c5036u.f40576a.b();
            s sVar = this.f5389B;
            int[] iArr = (int[]) sVar.f2952u;
            int i17 = (iArr == null || b9 >= iArr.length) ? -1 : iArr[b9];
            if (i17 == -1) {
                if (S0(c5053p.f40761e)) {
                    i10 = this.f5398p - i12;
                    i9 = -1;
                    i4 = -1;
                } else {
                    i4 = i12;
                    i9 = this.f5398p;
                    i10 = i11;
                }
                H h11 = null;
                if (c5053p.f40761e == i12) {
                    int k9 = this.f5400r.k();
                    int i18 = Integer.MAX_VALUE;
                    while (i10 != i9) {
                        H h12 = this.f5399q[i10];
                        int f6 = h12.f(k9);
                        if (f6 < i18) {
                            i18 = f6;
                            h11 = h12;
                        }
                        i10 += i4;
                    }
                } else {
                    int g10 = this.f5400r.g();
                    int i19 = Integer.MIN_VALUE;
                    while (i10 != i9) {
                        H h13 = this.f5399q[i10];
                        int h14 = h13.h(g10);
                        if (h14 > i19) {
                            h11 = h13;
                            i19 = h14;
                        }
                        i10 += i4;
                    }
                }
                h9 = h11;
                sVar.b(b9);
                ((int[]) sVar.f2952u)[b9] = h9.f25268e;
            } else {
                h9 = this.f5399q[i17];
            }
            c5036u.f40643e = h9;
            if (c5053p.f40761e == 1) {
                r62 = 0;
                b(view, -1, false);
            } else {
                r62 = 0;
                b(view, 0, false);
            }
            if (this.f5402t == 1) {
                i = 1;
                Q0(AbstractC5019C.w(this.f5403u, this.f40572l, r62, ((ViewGroup.MarginLayoutParams) c5036u).width, r62), AbstractC5019C.w(this.f40575o, this.f40573m, D() + G(), ((ViewGroup.MarginLayoutParams) c5036u).height, true), view);
            } else {
                i = 1;
                Q0(AbstractC5019C.w(this.f40574n, this.f40572l, F() + E(), ((ViewGroup.MarginLayoutParams) c5036u).width, true), AbstractC5019C.w(this.f5403u, this.f40573m, 0, ((ViewGroup.MarginLayoutParams) c5036u).height, false), view);
            }
            if (c5053p.f40761e == i) {
                c4 = h9.f(g9);
                h10 = this.f5400r.c(view) + c4;
            } else {
                h10 = h9.h(g9);
                c4 = h10 - this.f5400r.c(view);
            }
            if (c5053p.f40761e == 1) {
                H h15 = c5036u.f40643e;
                h15.getClass();
                C5036U c5036u2 = (C5036U) view.getLayoutParams();
                c5036u2.f40643e = h15;
                ArrayList arrayList = h15.f25264a;
                arrayList.add(view);
                h15.f25266c = Integer.MIN_VALUE;
                if (arrayList.size() == 1) {
                    h15.f25265b = Integer.MIN_VALUE;
                }
                if (c5036u2.f40576a.h() || c5036u2.f40576a.k()) {
                    h15.f25267d = ((StaggeredGridLayoutManager) h15.f25269f).f5400r.c(view) + h15.f25267d;
                }
            } else {
                H h16 = c5036u.f40643e;
                h16.getClass();
                C5036U c5036u3 = (C5036U) view.getLayoutParams();
                c5036u3.f40643e = h16;
                ArrayList arrayList2 = h16.f25264a;
                arrayList2.add(0, view);
                h16.f25265b = Integer.MIN_VALUE;
                if (arrayList2.size() == 1) {
                    h16.f25266c = Integer.MIN_VALUE;
                }
                if (c5036u3.f40576a.h() || c5036u3.f40576a.k()) {
                    h16.f25267d = ((StaggeredGridLayoutManager) h16.f25269f).f5400r.c(view) + h16.f25267d;
                }
            }
            if (P0() && this.f5402t == 1) {
                c9 = this.f5401s.g() - (((this.f5398p - 1) - h9.f25268e) * this.f5403u);
                k6 = c9 - this.f5401s.c(view);
            } else {
                k6 = this.f5401s.k() + (h9.f25268e * this.f5403u);
                c9 = this.f5401s.c(view) + k6;
            }
            if (this.f5402t == 1) {
                AbstractC5019C.N(view, k6, c4, c9, h10);
            } else {
                AbstractC5019C.N(view, c4, k6, h10, c9);
            }
            b1(h9, c5053p2.f40761e, i13);
            U0(bp, c5053p2);
            if (c5053p2.f40764h && view.hasFocusable()) {
                this.f5407y.set(h9.f25268e, false);
            }
            i12 = 1;
            z8 = true;
            i11 = 0;
        }
        if (!z8) {
            U0(bp, c5053p2);
        }
        int k10 = c5053p2.f40761e == -1 ? this.f5400r.k() - M0(this.f5400r.k()) : L0(this.f5400r.g()) - this.f5400r.g();
        if (k10 > 0) {
            return Math.min(c5053p.f40758b, k10);
        }
        return 0;
    }

    public final View F0(boolean z8) {
        int k6 = this.f5400r.k();
        int g9 = this.f5400r.g();
        View view = null;
        for (int v6 = v() - 1; v6 >= 0; v6--) {
            View u7 = u(v6);
            int e6 = this.f5400r.e(u7);
            int b9 = this.f5400r.b(u7);
            if (b9 > k6 && e6 < g9) {
                if (b9 <= g9 || !z8) {
                    return u7;
                }
                if (view == null) {
                    view = u7;
                }
            }
        }
        return view;
    }

    public final View G0(boolean z8) {
        int k6 = this.f5400r.k();
        int g9 = this.f5400r.g();
        int v6 = v();
        View view = null;
        for (int i = 0; i < v6; i++) {
            View u7 = u(i);
            int e6 = this.f5400r.e(u7);
            if (this.f5400r.b(u7) > k6 && e6 < g9) {
                if (e6 >= k6 || !z8) {
                    return u7;
                }
                if (view == null) {
                    view = u7;
                }
            }
        }
        return view;
    }

    public final void H0(BP bp, C5029M c5029m, boolean z8) {
        int g9;
        int L02 = L0(Integer.MIN_VALUE);
        if (L02 != Integer.MIN_VALUE && (g9 = this.f5400r.g() - L02) > 0) {
            int i = g9 - (-Y0(-g9, bp, c5029m));
            if (!z8 || i <= 0) {
                return;
            }
            this.f5400r.o(i);
        }
    }

    public final void I0(BP bp, C5029M c5029m, boolean z8) {
        int k6;
        int M02 = M0(Integer.MAX_VALUE);
        if (M02 != Integer.MAX_VALUE && (k6 = M02 - this.f5400r.k()) > 0) {
            int Y02 = k6 - Y0(k6, bp, c5029m);
            if (!z8 || Y02 <= 0) {
                return;
            }
            this.f5400r.o(-Y02);
        }
    }

    @Override // t0.AbstractC5019C
    public final int J(BP bp, C5029M c5029m) {
        return this.f5402t == 0 ? this.f5398p : super.J(bp, c5029m);
    }

    public final int J0() {
        if (v() == 0) {
            return 0;
        }
        return AbstractC5019C.H(u(0));
    }

    public final int K0() {
        int v6 = v();
        if (v6 == 0) {
            return 0;
        }
        return AbstractC5019C.H(u(v6 - 1));
    }

    @Override // t0.AbstractC5019C
    public final boolean L() {
        return this.f5390C != 0;
    }

    public final int L0(int i) {
        int f6 = this.f5399q[0].f(i);
        for (int i4 = 1; i4 < this.f5398p; i4++) {
            int f9 = this.f5399q[i4].f(i);
            if (f9 > f6) {
                f6 = f9;
            }
        }
        return f6;
    }

    public final int M0(int i) {
        int h9 = this.f5399q[0].h(i);
        for (int i4 = 1; i4 < this.f5398p; i4++) {
            int h10 = this.f5399q[i4].h(i);
            if (h10 < h9) {
                h9 = h10;
            }
        }
        return h9;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:56:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00bd  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void N0(int i, int i4, int i9) {
        int i10;
        int i11;
        s sVar;
        int[] iArr;
        ArrayList arrayList;
        C5037V c5037v;
        int i12;
        int K02 = this.f5406x ? K0() : J0();
        if (i9 != 8) {
            i10 = i + i4;
        } else {
            if (i >= i4) {
                i10 = i + 1;
                i11 = i4;
                sVar = this.f5389B;
                iArr = (int[]) sVar.f2952u;
                if (iArr != null && i11 < iArr.length) {
                    arrayList = (ArrayList) sVar.f2953v;
                    if (arrayList != null) {
                        if (arrayList != null) {
                            for (int size = arrayList.size() - 1; size >= 0; size--) {
                                c5037v = (C5037V) ((ArrayList) sVar.f2953v).get(size);
                                if (c5037v.f40644n == i11) {
                                    break;
                                }
                            }
                        }
                        c5037v = null;
                        if (c5037v != null) {
                            ((ArrayList) sVar.f2953v).remove(c5037v);
                        }
                        int size2 = ((ArrayList) sVar.f2953v).size();
                        int i13 = 0;
                        while (true) {
                            if (i13 >= size2) {
                                i13 = -1;
                                break;
                            } else if (((C5037V) ((ArrayList) sVar.f2953v).get(i13)).f40644n >= i11) {
                                break;
                            } else {
                                i13++;
                            }
                        }
                        if (i13 != -1) {
                            C5037V c5037v2 = (C5037V) ((ArrayList) sVar.f2953v).get(i13);
                            ((ArrayList) sVar.f2953v).remove(i13);
                            i12 = c5037v2.f40644n;
                            if (i12 == -1) {
                                int[] iArr2 = (int[]) sVar.f2952u;
                                Arrays.fill(iArr2, i11, iArr2.length, -1);
                                int length = ((int[]) sVar.f2952u).length;
                            } else {
                                Arrays.fill((int[]) sVar.f2952u, i11, i12 + 1, -1);
                            }
                        }
                    }
                    i12 = -1;
                    if (i12 == -1) {
                    }
                }
                if (i9 != 1) {
                    sVar.j(i, i4);
                } else if (i9 == 2) {
                    sVar.l(i, i4);
                } else if (i9 == 8) {
                    sVar.l(i, 1);
                    sVar.j(i4, 1);
                }
                if (i10 > K02) {
                    return;
                }
                if (i11 <= (this.f5406x ? J0() : K0())) {
                    l0();
                    return;
                }
                return;
            }
            i10 = i4 + 1;
        }
        i11 = i;
        sVar = this.f5389B;
        iArr = (int[]) sVar.f2952u;
        if (iArr != null) {
            arrayList = (ArrayList) sVar.f2953v;
            if (arrayList != null) {
            }
            i12 = -1;
            if (i12 == -1) {
            }
        }
        if (i9 != 1) {
        }
        if (i10 > K02) {
        }
    }

    @Override // t0.AbstractC5019C
    public final void O(int i) {
        super.O(i);
        for (int i4 = 0; i4 < this.f5398p; i4++) {
            H h9 = this.f5399q[i4];
            int i9 = h9.f25265b;
            if (i9 != Integer.MIN_VALUE) {
                h9.f25265b = i9 + i;
            }
            int i10 = h9.f25266c;
            if (i10 != Integer.MIN_VALUE) {
                h9.f25266c = i10 + i;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:47:0x00f7  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00fc  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0101 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x002c A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00fe  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00f9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final View O0() {
        int v6 = v();
        int i = v6 - 1;
        BitSet bitSet = new BitSet(this.f5398p);
        bitSet.set(0, this.f5398p, true);
        char c4 = (this.f5402t == 1 && P0()) ? (char) 1 : (char) 65535;
        if (this.f5406x) {
            v6 = -1;
        } else {
            i = 0;
        }
        int i4 = i < v6 ? 1 : -1;
        while (i != v6) {
            View u7 = u(i);
            C5036U c5036u = (C5036U) u7.getLayoutParams();
            if (bitSet.get(c5036u.f40643e.f25268e)) {
                H h9 = c5036u.f40643e;
                if (this.f5406x) {
                    int i9 = h9.f25266c;
                    if (i9 == Integer.MIN_VALUE) {
                        h9.a();
                        i9 = h9.f25266c;
                    }
                    if (i9 < this.f5400r.g()) {
                        ArrayList arrayList = h9.f25264a;
                        ((C5036U) ((View) arrayList.get(arrayList.size() - 1)).getLayoutParams()).getClass();
                        return u7;
                    }
                } else {
                    int i10 = h9.f25265b;
                    if (i10 == Integer.MIN_VALUE) {
                        View view = (View) h9.f25264a.get(0);
                        C5036U c5036u2 = (C5036U) view.getLayoutParams();
                        h9.f25265b = ((StaggeredGridLayoutManager) h9.f25269f).f5400r.e(view);
                        c5036u2.getClass();
                        i10 = h9.f25265b;
                    }
                    if (i10 > this.f5400r.k()) {
                        ((C5036U) ((View) h9.f25264a.get(0)).getLayoutParams()).getClass();
                        return u7;
                    }
                }
                bitSet.clear(c5036u.f40643e.f25268e);
            }
            i += i4;
            if (i != v6) {
                View u9 = u(i);
                if (this.f5406x) {
                    int b9 = this.f5400r.b(u7);
                    int b10 = this.f5400r.b(u9);
                    if (b9 < b10) {
                        return u7;
                    }
                    if (b9 == b10) {
                        if ((c5036u.f40643e.f25268e - ((C5036U) u9.getLayoutParams()).f40643e.f25268e >= 0) == (c4 >= 0)) {
                            return u7;
                        }
                    } else {
                        continue;
                    }
                } else {
                    int e6 = this.f5400r.e(u7);
                    int e9 = this.f5400r.e(u9);
                    if (e6 > e9) {
                        return u7;
                    }
                    if (e6 == e9) {
                        if ((c5036u.f40643e.f25268e - ((C5036U) u9.getLayoutParams()).f40643e.f25268e >= 0) == (c4 >= 0)) {
                        }
                    } else {
                        continue;
                    }
                }
            }
        }
        return null;
    }

    @Override // t0.AbstractC5019C
    public final void P(int i) {
        super.P(i);
        for (int i4 = 0; i4 < this.f5398p; i4++) {
            H h9 = this.f5399q[i4];
            int i9 = h9.f25265b;
            if (i9 != Integer.MIN_VALUE) {
                h9.f25265b = i9 + i;
            }
            int i10 = h9.f25266c;
            if (i10 != Integer.MIN_VALUE) {
                h9.f25266c = i10 + i;
            }
        }
    }

    public final boolean P0() {
        return C() == 1;
    }

    public final void Q0(int i, int i4, View view) {
        RecyclerView recyclerView = this.f40563b;
        Rect rect = this.f5394G;
        if (recyclerView == null) {
            rect.set(0, 0, 0, 0);
        } else {
            rect.set(recyclerView.J(view));
        }
        C5036U c5036u = (C5036U) view.getLayoutParams();
        int c12 = c1(i, ((ViewGroup.MarginLayoutParams) c5036u).leftMargin + rect.left, ((ViewGroup.MarginLayoutParams) c5036u).rightMargin + rect.right);
        int c13 = c1(i4, ((ViewGroup.MarginLayoutParams) c5036u).topMargin + rect.top, ((ViewGroup.MarginLayoutParams) c5036u).bottomMargin + rect.bottom);
        if (u0(view, c12, c13, c5036u)) {
            view.measure(c12, c13);
        }
    }

    @Override // t0.AbstractC5019C
    public final void R(RecyclerView recyclerView) {
        RecyclerView recyclerView2 = this.f40563b;
        if (recyclerView2 != null) {
            recyclerView2.removeCallbacks(this.f5397K);
        }
        for (int i = 0; i < this.f5398p; i++) {
            this.f5399q[i].b();
        }
        recyclerView.requestLayout();
    }

    /* JADX WARN: Code restructure failed: missing block: B:100:0x01aa, code lost:
    
        r12 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:105:0x01a6, code lost:
    
        if ((r12 < J0()) != r16.f5406x) goto L108;
     */
    /* JADX WARN: Code restructure failed: missing block: B:265:0x041e, code lost:
    
        if (A0() != false) goto L259;
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x0198, code lost:
    
        if (r16.f5406x != false) goto L109;
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x01a8, code lost:
    
        r12 = false;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void R0(BP bp, C5029M c5029m, boolean z8) {
        W w9;
        int i;
        int i4;
        boolean z9;
        W w10 = this.f5393F;
        C5035T c5035t = this.f5395H;
        if (!(w10 == null && this.f5408z == -1) && c5029m.b() == 0) {
            g0(bp);
            c5035t.a();
            return;
        }
        boolean z10 = true;
        boolean z11 = (c5035t.f40640e && this.f5408z == -1 && this.f5393F == null) ? false : true;
        s sVar = this.f5389B;
        StaggeredGridLayoutManager staggeredGridLayoutManager = c5035t.f40642g;
        if (z11) {
            c5035t.a();
            W w11 = this.f5393F;
            if (w11 != null) {
                int i9 = w11.f40653v;
                if (i9 > 0) {
                    if (i9 == this.f5398p) {
                        for (int i10 = 0; i10 < this.f5398p; i10++) {
                            this.f5399q[i10].b();
                            W w12 = this.f5393F;
                            int i11 = w12.f40654w[i10];
                            if (i11 != Integer.MIN_VALUE) {
                                i11 += w12.f40649B ? this.f5400r.g() : this.f5400r.k();
                            }
                            H h9 = this.f5399q[i10];
                            h9.f25265b = i11;
                            h9.f25266c = i11;
                        }
                    } else {
                        w11.f40654w = null;
                        w11.f40653v = 0;
                        w11.f40655x = 0;
                        w11.f40656y = null;
                        w11.f40657z = null;
                        w11.f40651n = w11.f40652u;
                    }
                }
                W w13 = this.f5393F;
                this.f5392E = w13.f40650C;
                boolean z12 = w13.f40648A;
                c(null);
                W w14 = this.f5393F;
                if (w14 != null && w14.f40648A != z12) {
                    w14.f40648A = z12;
                }
                this.f5405w = z12;
                l0();
                X0();
                W w15 = this.f5393F;
                int i12 = w15.f40651n;
                if (i12 != -1) {
                    this.f5408z = i12;
                    c5035t.f40638c = w15.f40649B;
                } else {
                    c5035t.f40638c = this.f5406x;
                }
                if (w15.f40655x > 1) {
                    sVar.f2952u = w15.f40656y;
                    sVar.f2953v = w15.f40657z;
                }
            } else {
                X0();
                c5035t.f40638c = this.f5406x;
            }
            if (!c5029m.f40600g && (i4 = this.f5408z) != -1) {
                if (i4 < 0 || i4 >= c5029m.b()) {
                    this.f5408z = -1;
                    this.f5388A = Integer.MIN_VALUE;
                } else {
                    W w16 = this.f5393F;
                    if (w16 == null || w16.f40651n == -1 || w16.f40653v < 1) {
                        View q6 = q(this.f5408z);
                        if (q6 != null) {
                            c5035t.f40636a = this.f5406x ? K0() : J0();
                            if (this.f5388A != Integer.MIN_VALUE) {
                                if (c5035t.f40638c) {
                                    c5035t.f40637b = (this.f5400r.g() - this.f5388A) - this.f5400r.b(q6);
                                } else {
                                    c5035t.f40637b = (this.f5400r.k() + this.f5388A) - this.f5400r.e(q6);
                                }
                            } else if (this.f5400r.c(q6) > this.f5400r.l()) {
                                c5035t.f40637b = c5035t.f40638c ? this.f5400r.g() : this.f5400r.k();
                            } else {
                                int e6 = this.f5400r.e(q6) - this.f5400r.k();
                                if (e6 < 0) {
                                    c5035t.f40637b = -e6;
                                } else {
                                    int g9 = this.f5400r.g() - this.f5400r.b(q6);
                                    if (g9 < 0) {
                                        c5035t.f40637b = g9;
                                    } else {
                                        c5035t.f40637b = Integer.MIN_VALUE;
                                    }
                                }
                            }
                        } else {
                            int i13 = this.f5408z;
                            c5035t.f40636a = i13;
                            int i14 = this.f5388A;
                            if (i14 == Integer.MIN_VALUE) {
                                if (v() == 0) {
                                }
                                c5035t.f40638c = z9;
                                c5035t.f40637b = z9 ? staggeredGridLayoutManager.f5400r.g() : staggeredGridLayoutManager.f5400r.k();
                            } else if (c5035t.f40638c) {
                                c5035t.f40637b = staggeredGridLayoutManager.f5400r.g() - i14;
                            } else {
                                c5035t.f40637b = staggeredGridLayoutManager.f5400r.k() + i14;
                            }
                            c5035t.f40639d = true;
                        }
                    } else {
                        c5035t.f40637b = Integer.MIN_VALUE;
                        c5035t.f40636a = this.f5408z;
                    }
                    c5035t.f40640e = true;
                }
            }
            if (this.f5391D) {
                int b9 = c5029m.b();
                for (int v6 = v() - 1; v6 >= 0; v6--) {
                    i = AbstractC5019C.H(u(v6));
                    if (i >= 0 && i < b9) {
                        break;
                    }
                }
                i = 0;
                c5035t.f40636a = i;
                c5035t.f40637b = Integer.MIN_VALUE;
                c5035t.f40640e = true;
            } else {
                int b10 = c5029m.b();
                int v9 = v();
                for (int i15 = 0; i15 < v9; i15++) {
                    int H6 = AbstractC5019C.H(u(i15));
                    if (H6 >= 0 && H6 < b10) {
                        i = H6;
                        break;
                    }
                }
                i = 0;
                c5035t.f40636a = i;
                c5035t.f40637b = Integer.MIN_VALUE;
                c5035t.f40640e = true;
            }
        }
        if (this.f5393F == null && this.f5408z == -1 && (c5035t.f40638c != this.f5391D || P0() != this.f5392E)) {
            int[] iArr = (int[]) sVar.f2952u;
            if (iArr != null) {
                Arrays.fill(iArr, -1);
            }
            sVar.f2953v = null;
            c5035t.f40639d = true;
        }
        if (v() > 0 && ((w9 = this.f5393F) == null || w9.f40653v < 1)) {
            if (c5035t.f40639d) {
                for (int i16 = 0; i16 < this.f5398p; i16++) {
                    this.f5399q[i16].b();
                    int i17 = c5035t.f40637b;
                    if (i17 != Integer.MIN_VALUE) {
                        H h10 = this.f5399q[i16];
                        h10.f25265b = i17;
                        h10.f25266c = i17;
                    }
                }
            } else if (z11 || c5035t.f40641f == null) {
                for (int i18 = 0; i18 < this.f5398p; i18++) {
                    H h11 = this.f5399q[i18];
                    boolean z13 = this.f5406x;
                    int i19 = c5035t.f40637b;
                    int f6 = z13 ? h11.f(Integer.MIN_VALUE) : h11.h(Integer.MIN_VALUE);
                    h11.b();
                    if (f6 != Integer.MIN_VALUE) {
                        StaggeredGridLayoutManager staggeredGridLayoutManager2 = (StaggeredGridLayoutManager) h11.f25269f;
                        if ((!z13 || f6 >= staggeredGridLayoutManager2.f5400r.g()) && (z13 || f6 <= staggeredGridLayoutManager2.f5400r.k())) {
                            if (i19 != Integer.MIN_VALUE) {
                                f6 += i19;
                            }
                            h11.f25266c = f6;
                            h11.f25265b = f6;
                        }
                    }
                }
                H[] hArr = this.f5399q;
                int length = hArr.length;
                int[] iArr2 = c5035t.f40641f;
                if (iArr2 == null || iArr2.length < length) {
                    c5035t.f40641f = new int[staggeredGridLayoutManager.f5399q.length];
                }
                for (int i20 = 0; i20 < length; i20++) {
                    c5035t.f40641f[i20] = hArr[i20].h(Integer.MIN_VALUE);
                }
            } else {
                for (int i21 = 0; i21 < this.f5398p; i21++) {
                    H h12 = this.f5399q[i21];
                    h12.b();
                    int i22 = c5035t.f40641f[i21];
                    h12.f25265b = i22;
                    h12.f25266c = i22;
                }
            }
        }
        p(bp);
        C5053p c5053p = this.f5404v;
        c5053p.f40757a = false;
        int l9 = this.f5401s.l();
        this.f5403u = l9 / this.f5398p;
        View.MeasureSpec.makeMeasureSpec(l9, this.f5401s.i());
        a1(c5035t.f40636a, c5029m);
        if (c5035t.f40638c) {
            Z0(-1);
            E0(bp, c5053p, c5029m);
            Z0(1);
            c5053p.f40759c = c5035t.f40636a + c5053p.f40760d;
            E0(bp, c5053p, c5029m);
        } else {
            Z0(1);
            E0(bp, c5053p, c5029m);
            Z0(-1);
            c5053p.f40759c = c5035t.f40636a + c5053p.f40760d;
            E0(bp, c5053p, c5029m);
        }
        if (this.f5401s.i() != 1073741824) {
            int v10 = v();
            float f9 = 0.0f;
            for (int i23 = 0; i23 < v10; i23++) {
                View u7 = u(i23);
                float c4 = this.f5401s.c(u7);
                if (c4 >= f9) {
                    ((C5036U) u7.getLayoutParams()).getClass();
                    f9 = Math.max(f9, c4);
                }
            }
            int i24 = this.f5403u;
            int round = Math.round(f9 * this.f5398p);
            if (this.f5401s.i() == Integer.MIN_VALUE) {
                round = Math.min(round, this.f5401s.l());
            }
            this.f5403u = round / this.f5398p;
            View.MeasureSpec.makeMeasureSpec(round, this.f5401s.i());
            if (this.f5403u != i24) {
                for (int i25 = 0; i25 < v10; i25++) {
                    View u9 = u(i25);
                    C5036U c5036u = (C5036U) u9.getLayoutParams();
                    c5036u.getClass();
                    if (P0() && this.f5402t == 1) {
                        int i26 = -((this.f5398p - 1) - c5036u.f40643e.f25268e);
                        u9.offsetLeftAndRight((this.f5403u * i26) - (i26 * i24));
                    } else {
                        int i27 = c5036u.f40643e.f25268e;
                        int i28 = this.f5403u * i27;
                        int i29 = i27 * i24;
                        if (this.f5402t == 1) {
                            u9.offsetLeftAndRight(i28 - i29);
                        } else {
                            u9.offsetTopAndBottom(i28 - i29);
                        }
                    }
                }
            }
        }
        if (v() > 0) {
            if (this.f5406x) {
                H0(bp, c5029m, true);
                I0(bp, c5029m, false);
            } else {
                I0(bp, c5029m, true);
                H0(bp, c5029m, false);
            }
        }
        if (z8 && !c5029m.f40600g && this.f5390C != 0 && v() > 0 && O0() != null) {
            RecyclerView recyclerView = this.f40563b;
            if (recyclerView != null) {
                recyclerView.removeCallbacks(this.f5397K);
            }
        }
        z10 = false;
        if (c5029m.f40600g) {
            c5035t.a();
        }
        this.f5391D = c5035t.f40638c;
        this.f5392E = P0();
        if (z10) {
            c5035t.a();
            R0(bp, c5029m, false);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:111:0x0051, code lost:
    
        if (r8.f5402t == 1) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:114:0x0057, code lost:
    
        if (r8.f5402t == 0) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:118:0x0063, code lost:
    
        if (P0() == false) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:122:0x006f, code lost:
    
        if (P0() == false) goto L37;
     */
    @Override // t0.AbstractC5019C
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final View S(View view, int i, BP bp, C5029M c5029m) {
        View view2;
        int i4;
        if (v() != 0) {
            RecyclerView recyclerView = this.f40563b;
            if (recyclerView == null || (view2 = recyclerView.A(view)) == null || ((ArrayList) this.f40562a.f39327d).contains(view2)) {
                view2 = null;
            }
            if (view2 != null) {
                X0();
                if (i == 1) {
                    if (this.f5402t != 1) {
                    }
                    i4 = -1;
                } else if (i == 2) {
                    if (this.f5402t != 1) {
                    }
                    i4 = 1;
                } else if (i != 17) {
                    if (i != 33) {
                        if (i == 66) {
                        }
                    }
                    i4 = Integer.MIN_VALUE;
                }
                if (i4 != Integer.MIN_VALUE) {
                    C5036U c5036u = (C5036U) view2.getLayoutParams();
                    c5036u.getClass();
                    H h9 = c5036u.f40643e;
                    int K02 = i4 == 1 ? K0() : J0();
                    a1(K02, c5029m);
                    Z0(i4);
                    C5053p c5053p = this.f5404v;
                    c5053p.f40759c = c5053p.f40760d + K02;
                    c5053p.f40758b = (int) (this.f5400r.l() * 0.33333334f);
                    c5053p.f40764h = true;
                    c5053p.f40757a = false;
                    E0(bp, c5053p, c5029m);
                    this.f5391D = this.f5406x;
                    View g9 = h9.g(K02, i4);
                    if (g9 != null && g9 != view2) {
                        return g9;
                    }
                    if (S0(i4)) {
                        for (int i9 = this.f5398p - 1; i9 >= 0; i9--) {
                            View g10 = this.f5399q[i9].g(K02, i4);
                            if (g10 != null && g10 != view2) {
                                return g10;
                            }
                        }
                    } else {
                        for (int i10 = 0; i10 < this.f5398p; i10++) {
                            View g11 = this.f5399q[i10].g(K02, i4);
                            if (g11 != null && g11 != view2) {
                                return g11;
                            }
                        }
                    }
                    boolean z8 = (this.f5405w ^ true) == (i4 == -1);
                    View q6 = q(z8 ? h9.c() : h9.d());
                    if (q6 != null && q6 != view2) {
                        return q6;
                    }
                    if (S0(i4)) {
                        for (int i11 = this.f5398p - 1; i11 >= 0; i11--) {
                            if (i11 != h9.f25268e) {
                                View q9 = q(z8 ? this.f5399q[i11].c() : this.f5399q[i11].d());
                                if (q9 != null && q9 != view2) {
                                    return q9;
                                }
                            }
                        }
                    } else {
                        for (int i12 = 0; i12 < this.f5398p; i12++) {
                            View q10 = q(z8 ? this.f5399q[i12].c() : this.f5399q[i12].d());
                            if (q10 != null && q10 != view2) {
                                return q10;
                            }
                        }
                    }
                }
            }
        }
        return null;
    }

    public final boolean S0(int i) {
        if (this.f5402t == 0) {
            return (i == -1) != this.f5406x;
        }
        return ((i == -1) == this.f5406x) == P0();
    }

    @Override // t0.AbstractC5019C
    public final void T(AccessibilityEvent accessibilityEvent) {
        super.T(accessibilityEvent);
        if (v() > 0) {
            View G02 = G0(false);
            View F02 = F0(false);
            if (G02 == null || F02 == null) {
                return;
            }
            int H6 = AbstractC5019C.H(G02);
            int H8 = AbstractC5019C.H(F02);
            if (H6 < H8) {
                accessibilityEvent.setFromIndex(H6);
                accessibilityEvent.setToIndex(H8);
            } else {
                accessibilityEvent.setFromIndex(H8);
                accessibilityEvent.setToIndex(H6);
            }
        }
    }

    public final void T0(int i, C5029M c5029m) {
        int J02;
        int i4;
        if (i > 0) {
            J02 = K0();
            i4 = 1;
        } else {
            J02 = J0();
            i4 = -1;
        }
        C5053p c5053p = this.f5404v;
        c5053p.f40757a = true;
        a1(J02, c5029m);
        Z0(i4);
        c5053p.f40759c = J02 + c5053p.f40760d;
        c5053p.f40758b = Math.abs(i);
    }

    public final void U0(BP bp, C5053p c5053p) {
        if (!c5053p.f40757a || c5053p.i) {
            return;
        }
        if (c5053p.f40758b == 0) {
            if (c5053p.f40761e == -1) {
                V0(bp, c5053p.f40763g);
                return;
            } else {
                W0(bp, c5053p.f40762f);
                return;
            }
        }
        int i = 1;
        if (c5053p.f40761e == -1) {
            int i4 = c5053p.f40762f;
            int h9 = this.f5399q[0].h(i4);
            while (i < this.f5398p) {
                int h10 = this.f5399q[i].h(i4);
                if (h10 > h9) {
                    h9 = h10;
                }
                i++;
            }
            int i9 = i4 - h9;
            V0(bp, i9 < 0 ? c5053p.f40763g : c5053p.f40763g - Math.min(i9, c5053p.f40758b));
            return;
        }
        int i10 = c5053p.f40763g;
        int f6 = this.f5399q[0].f(i10);
        while (i < this.f5398p) {
            int f9 = this.f5399q[i].f(i10);
            if (f9 < f6) {
                f6 = f9;
            }
            i++;
        }
        int i11 = f6 - c5053p.f40763g;
        W0(bp, i11 < 0 ? c5053p.f40762f : Math.min(i11, c5053p.f40758b) + c5053p.f40762f);
    }

    @Override // t0.AbstractC5019C
    public final void V(BP bp, C5029M c5029m, View view, k kVar) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (!(layoutParams instanceof C5036U)) {
            U(view, kVar);
            return;
        }
        C5036U c5036u = (C5036U) layoutParams;
        if (this.f5402t == 0) {
            H h9 = c5036u.f40643e;
            kVar.j(j.a(h9 == null ? -1 : h9.f25268e, 1, -1, -1, false));
        } else {
            H h10 = c5036u.f40643e;
            kVar.j(j.a(-1, -1, h10 == null ? -1 : h10.f25268e, 1, false));
        }
    }

    public final void V0(BP bp, int i) {
        for (int v6 = v() - 1; v6 >= 0; v6--) {
            View u7 = u(v6);
            if (this.f5400r.e(u7) < i || this.f5400r.n(u7) < i) {
                return;
            }
            C5036U c5036u = (C5036U) u7.getLayoutParams();
            c5036u.getClass();
            if (c5036u.f40643e.f25264a.size() == 1) {
                return;
            }
            H h9 = c5036u.f40643e;
            ArrayList arrayList = h9.f25264a;
            int size = arrayList.size();
            View view = (View) arrayList.remove(size - 1);
            C5036U c5036u2 = (C5036U) view.getLayoutParams();
            c5036u2.f40643e = null;
            if (c5036u2.f40576a.h() || c5036u2.f40576a.k()) {
                h9.f25267d -= ((StaggeredGridLayoutManager) h9.f25269f).f5400r.c(view);
            }
            if (size == 1) {
                h9.f25265b = Integer.MIN_VALUE;
            }
            h9.f25266c = Integer.MIN_VALUE;
            i0(u7, bp);
        }
    }

    @Override // t0.AbstractC5019C
    public final void W(int i, int i4) {
        N0(i, i4, 1);
    }

    public final void W0(BP bp, int i) {
        while (v() > 0) {
            View u7 = u(0);
            if (this.f5400r.b(u7) > i || this.f5400r.m(u7) > i) {
                return;
            }
            C5036U c5036u = (C5036U) u7.getLayoutParams();
            c5036u.getClass();
            if (c5036u.f40643e.f25264a.size() == 1) {
                return;
            }
            H h9 = c5036u.f40643e;
            ArrayList arrayList = h9.f25264a;
            View view = (View) arrayList.remove(0);
            C5036U c5036u2 = (C5036U) view.getLayoutParams();
            c5036u2.f40643e = null;
            if (arrayList.size() == 0) {
                h9.f25266c = Integer.MIN_VALUE;
            }
            if (c5036u2.f40576a.h() || c5036u2.f40576a.k()) {
                h9.f25267d -= ((StaggeredGridLayoutManager) h9.f25269f).f5400r.c(view);
            }
            h9.f25265b = Integer.MIN_VALUE;
            i0(u7, bp);
        }
    }

    @Override // t0.AbstractC5019C
    public final void X() {
        s sVar = this.f5389B;
        int[] iArr = (int[]) sVar.f2952u;
        if (iArr != null) {
            Arrays.fill(iArr, -1);
        }
        sVar.f2953v = null;
        l0();
    }

    public final void X0() {
        if (this.f5402t == 1 || !P0()) {
            this.f5406x = this.f5405w;
        } else {
            this.f5406x = !this.f5405w;
        }
    }

    @Override // t0.AbstractC5019C
    public final void Y(int i, int i4) {
        N0(i, i4, 8);
    }

    public final int Y0(int i, BP bp, C5029M c5029m) {
        if (v() == 0 || i == 0) {
            return 0;
        }
        T0(i, c5029m);
        C5053p c5053p = this.f5404v;
        int E02 = E0(bp, c5053p, c5029m);
        if (c5053p.f40758b >= E02) {
            i = i < 0 ? -E02 : E02;
        }
        this.f5400r.o(-i);
        this.f5391D = this.f5406x;
        c5053p.f40758b = 0;
        U0(bp, c5053p);
        return i;
    }

    @Override // t0.AbstractC5019C
    public final void Z(int i, int i4) {
        N0(i, i4, 2);
    }

    public final void Z0(int i) {
        C5053p c5053p = this.f5404v;
        c5053p.f40761e = i;
        c5053p.f40760d = this.f5406x != (i == -1) ? -1 : 1;
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0019, code lost:
    
        if ((r4 < J0()) != r3.f5406x) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:4:0x000a, code lost:
    
        if (r3.f5406x != false) goto L6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x000c, code lost:
    
        r1 = 1;
     */
    @Override // t0.InterfaceC5028L
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final PointF a(int i) {
        int i4 = -1;
        if (v() == 0) {
        }
        PointF pointF = new PointF();
        if (i4 == 0) {
            return null;
        }
        if (this.f5402t == 0) {
            pointF.x = i4;
            pointF.y = 0.0f;
            return pointF;
        }
        pointF.x = 0.0f;
        pointF.y = i4;
        return pointF;
    }

    @Override // t0.AbstractC5019C
    public final void a0(int i, int i4) {
        N0(i, i4, 4);
    }

    public final void a1(int i, C5029M c5029m) {
        int i4;
        int i9;
        int i10;
        C5053p c5053p = this.f5404v;
        boolean z8 = false;
        c5053p.f40758b = 0;
        c5053p.f40759c = i;
        C5056s c5056s = this.f40566e;
        if (!(c5056s != null && c5056s.f40783e) || (i10 = c5029m.f40594a) == -1) {
            i4 = 0;
            i9 = 0;
        } else {
            if (this.f5406x == (i10 < i)) {
                i4 = this.f5400r.l();
                i9 = 0;
            } else {
                i9 = this.f5400r.l();
                i4 = 0;
            }
        }
        RecyclerView recyclerView = this.f40563b;
        if (recyclerView == null || !recyclerView.f5386z) {
            c5053p.f40763g = this.f5400r.f() + i4;
            c5053p.f40762f = -i9;
        } else {
            c5053p.f40762f = this.f5400r.k() - i9;
            c5053p.f40763g = this.f5400r.g() + i4;
        }
        c5053p.f40764h = false;
        c5053p.f40757a = true;
        if (this.f5400r.i() == 0 && this.f5400r.f() == 0) {
            z8 = true;
        }
        c5053p.i = z8;
    }

    @Override // t0.AbstractC5019C
    public final void b0(BP bp, C5029M c5029m) {
        R0(bp, c5029m, true);
    }

    public final void b1(H h9, int i, int i4) {
        int i9 = h9.f25267d;
        int i10 = h9.f25268e;
        if (i != -1) {
            int i11 = h9.f25266c;
            if (i11 == Integer.MIN_VALUE) {
                h9.a();
                i11 = h9.f25266c;
            }
            if (i11 - i9 >= i4) {
                this.f5407y.set(i10, false);
                return;
            }
            return;
        }
        int i12 = h9.f25265b;
        if (i12 == Integer.MIN_VALUE) {
            View view = (View) h9.f25264a.get(0);
            C5036U c5036u = (C5036U) view.getLayoutParams();
            h9.f25265b = ((StaggeredGridLayoutManager) h9.f25269f).f5400r.e(view);
            c5036u.getClass();
            i12 = h9.f25265b;
        }
        if (i12 + i9 <= i4) {
            this.f5407y.set(i10, false);
        }
    }

    @Override // t0.AbstractC5019C
    public final void c(String str) {
        if (this.f5393F == null) {
            super.c(str);
        }
    }

    @Override // t0.AbstractC5019C
    public final void c0(C5029M c5029m) {
        this.f5408z = -1;
        this.f5388A = Integer.MIN_VALUE;
        this.f5393F = null;
        this.f5395H.a();
    }

    @Override // t0.AbstractC5019C
    public final boolean d() {
        return this.f5402t == 0;
    }

    @Override // t0.AbstractC5019C
    public final void d0(Parcelable parcelable) {
        if (parcelable instanceof W) {
            this.f5393F = (W) parcelable;
            l0();
        }
    }

    @Override // t0.AbstractC5019C
    public final boolean e() {
        return this.f5402t == 1;
    }

    @Override // t0.AbstractC5019C
    public final Parcelable e0() {
        int h9;
        int k6;
        int[] iArr;
        W w9 = this.f5393F;
        if (w9 != null) {
            W w10 = new W();
            w10.f40653v = w9.f40653v;
            w10.f40651n = w9.f40651n;
            w10.f40652u = w9.f40652u;
            w10.f40654w = w9.f40654w;
            w10.f40655x = w9.f40655x;
            w10.f40656y = w9.f40656y;
            w10.f40648A = w9.f40648A;
            w10.f40649B = w9.f40649B;
            w10.f40650C = w9.f40650C;
            w10.f40657z = w9.f40657z;
            return w10;
        }
        W w11 = new W();
        w11.f40648A = this.f5405w;
        w11.f40649B = this.f5391D;
        w11.f40650C = this.f5392E;
        s sVar = this.f5389B;
        if (sVar == null || (iArr = (int[]) sVar.f2952u) == null) {
            w11.f40655x = 0;
        } else {
            w11.f40656y = iArr;
            w11.f40655x = iArr.length;
            w11.f40657z = (ArrayList) sVar.f2953v;
        }
        if (v() <= 0) {
            w11.f40651n = -1;
            w11.f40652u = -1;
            w11.f40653v = 0;
            return w11;
        }
        w11.f40651n = this.f5391D ? K0() : J0();
        View F02 = this.f5406x ? F0(true) : G0(true);
        w11.f40652u = F02 != null ? AbstractC5019C.H(F02) : -1;
        int i = this.f5398p;
        w11.f40653v = i;
        w11.f40654w = new int[i];
        for (int i4 = 0; i4 < this.f5398p; i4++) {
            if (this.f5391D) {
                h9 = this.f5399q[i4].f(Integer.MIN_VALUE);
                if (h9 != Integer.MIN_VALUE) {
                    k6 = this.f5400r.g();
                    h9 -= k6;
                    w11.f40654w[i4] = h9;
                } else {
                    w11.f40654w[i4] = h9;
                }
            } else {
                h9 = this.f5399q[i4].h(Integer.MIN_VALUE);
                if (h9 != Integer.MIN_VALUE) {
                    k6 = this.f5400r.k();
                    h9 -= k6;
                    w11.f40654w[i4] = h9;
                } else {
                    w11.f40654w[i4] = h9;
                }
            }
        }
        return w11;
    }

    @Override // t0.AbstractC5019C
    public final boolean f(C5020D c5020d) {
        return c5020d instanceof C5036U;
    }

    @Override // t0.AbstractC5019C
    public final void f0(int i) {
        if (i == 0) {
            A0();
        }
    }

    @Override // t0.AbstractC5019C
    public final void h(int i, int i4, C5029M c5029m, C2830Vl c2830Vl) {
        C5053p c5053p;
        int f6;
        int i9;
        if (this.f5402t != 0) {
            i = i4;
        }
        if (v() == 0 || i == 0) {
            return;
        }
        T0(i, c5029m);
        int[] iArr = this.J;
        if (iArr == null || iArr.length < this.f5398p) {
            this.J = new int[this.f5398p];
        }
        int i10 = 0;
        int i11 = 0;
        while (true) {
            int i12 = this.f5398p;
            c5053p = this.f5404v;
            if (i10 >= i12) {
                break;
            }
            if (c5053p.f40760d == -1) {
                f6 = c5053p.f40762f;
                i9 = this.f5399q[i10].h(f6);
            } else {
                f6 = this.f5399q[i10].f(c5053p.f40763g);
                i9 = c5053p.f40763g;
            }
            int i13 = f6 - i9;
            if (i13 >= 0) {
                this.J[i11] = i13;
                i11++;
            }
            i10++;
        }
        Arrays.sort(this.J, 0, i11);
        for (int i14 = 0; i14 < i11; i14++) {
            int i15 = c5053p.f40759c;
            if (i15 < 0 || i15 >= c5029m.b()) {
                return;
            }
            c2830Vl.a(c5053p.f40759c, this.J[i14]);
            c5053p.f40759c += c5053p.f40760d;
        }
    }

    @Override // t0.AbstractC5019C
    public final int j(C5029M c5029m) {
        return B0(c5029m);
    }

    @Override // t0.AbstractC5019C
    public final int k(C5029M c5029m) {
        return C0(c5029m);
    }

    @Override // t0.AbstractC5019C
    public final int l(C5029M c5029m) {
        return D0(c5029m);
    }

    @Override // t0.AbstractC5019C
    public final int m(C5029M c5029m) {
        return B0(c5029m);
    }

    @Override // t0.AbstractC5019C
    public final int m0(int i, BP bp, C5029M c5029m) {
        return Y0(i, bp, c5029m);
    }

    @Override // t0.AbstractC5019C
    public final int n(C5029M c5029m) {
        return C0(c5029m);
    }

    @Override // t0.AbstractC5019C
    public final void n0(int i) {
        W w9 = this.f5393F;
        if (w9 != null && w9.f40651n != i) {
            w9.f40654w = null;
            w9.f40653v = 0;
            w9.f40651n = -1;
            w9.f40652u = -1;
        }
        this.f5408z = i;
        this.f5388A = Integer.MIN_VALUE;
        l0();
    }

    @Override // t0.AbstractC5019C
    public final int o(C5029M c5029m) {
        return D0(c5029m);
    }

    @Override // t0.AbstractC5019C
    public final int o0(int i, BP bp, C5029M c5029m) {
        return Y0(i, bp, c5029m);
    }

    @Override // t0.AbstractC5019C
    public final C5020D r() {
        return this.f5402t == 0 ? new C5036U(-2, -1) : new C5036U(-1, -2);
    }

    @Override // t0.AbstractC5019C
    public final void r0(Rect rect, int i, int i4) {
        int g9;
        int g10;
        int i9 = this.f5398p;
        int F8 = F() + E();
        int D8 = D() + G();
        if (this.f5402t == 1) {
            int height = rect.height() + D8;
            RecyclerView recyclerView = this.f40563b;
            WeakHashMap weakHashMap = X.f2240a;
            g10 = AbstractC5019C.g(i4, height, recyclerView.getMinimumHeight());
            g9 = AbstractC5019C.g(i, (this.f5403u * i9) + F8, this.f40563b.getMinimumWidth());
        } else {
            int width = rect.width() + F8;
            RecyclerView recyclerView2 = this.f40563b;
            WeakHashMap weakHashMap2 = X.f2240a;
            g9 = AbstractC5019C.g(i, width, recyclerView2.getMinimumWidth());
            g10 = AbstractC5019C.g(i4, (this.f5403u * i9) + D8, this.f40563b.getMinimumHeight());
        }
        this.f40563b.setMeasuredDimension(g9, g10);
    }

    @Override // t0.AbstractC5019C
    public final C5020D s(Context context, AttributeSet attributeSet) {
        return new C5036U(context, attributeSet);
    }

    @Override // t0.AbstractC5019C
    public final C5020D t(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof ViewGroup.MarginLayoutParams ? new C5036U((ViewGroup.MarginLayoutParams) layoutParams) : new C5036U(layoutParams);
    }

    @Override // t0.AbstractC5019C
    public final int x(BP bp, C5029M c5029m) {
        return this.f5402t == 1 ? this.f5398p : super.x(bp, c5029m);
    }

    @Override // t0.AbstractC5019C
    public final void x0(RecyclerView recyclerView, int i) {
        C5056s c5056s = new C5056s(recyclerView.getContext());
        c5056s.f40779a = i;
        y0(c5056s);
    }

    @Override // t0.AbstractC5019C
    public final boolean z0() {
        return this.f5393F == null;
    }
}
