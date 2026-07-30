package defpackage;

import android.graphics.Rect;
import android.os.Build;
import android.view.View;
import android.view.WindowInsetsAnimation;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-dd5e919efaf02f4d8ff55d6a5e2559a4e7180bda542179c0d9d8fc6a077876b4 */
/* loaded from: classes.dex */
public final class f90 extends so1 implements Runnable, br0, View.OnAttachStateChangeListener {
    public boolean e;
    public int g;
    public ip1 h;
    public final vn0 i;
    public final xu0 j;
    public final mn0 k;
    public final ac1 l;

    public f90() {
        super(1);
        vn0 vn0Var = new vn0(9);
        mp1.a.getClass();
        vn0Var.m(lp1.b, new wp1("caption bar"));
        vn0Var.m(lp1.c, new wp1("display cutout"));
        vn0Var.m(lp1.d, new wp1("ime"));
        vn0Var.m(lp1.e, new wp1("mandatory system gestures"));
        vn0Var.m(lp1.f, new wp1("navigation bars"));
        vn0Var.m(lp1.g, new wp1("status bars"));
        vn0Var.m(lp1.h, new wp1("system gestures"));
        vn0Var.m(lp1.i, new wp1("tappable element"));
        vn0Var.m(lp1.j, new wp1("waterfall"));
        this.i = vn0Var;
        this.j = new xu0(0);
        this.k = new mn0(4);
        this.l = new ac1();
    }

    @Override // defpackage.so1
    public final void a(uo1 uo1Var) {
        boolean z = false;
        this.e = false;
        int typeMask = ((WindowInsetsAnimation) uo1Var.a.e).getTypeMask();
        this.g &= ~typeMask;
        this.h = null;
        mp1 mp1Var = (mp1) op1.a.b(typeMask);
        if (mp1Var != null) {
            Object g = this.i.g(mp1Var);
            g.getClass();
            wp1 wp1Var = (wp1) g;
            wp1Var.c.h(0.0f);
            wp1Var.e.h(1.0f);
            wp1Var.d.i(0L);
            wp1Var.c.h(0.0f);
            wp1Var.b.setValue(Boolean.FALSE);
            wp1Var.j = -1L;
            wp1Var.k = -1L;
            xu0 xu0Var = this.j;
            xu0Var.i(xu0Var.h() + 1);
            synchronized (pb1.c) {
                wn0 wn0Var = pb1.j.h;
                if (wn0Var != null) {
                    if (wn0Var.h()) {
                        z = true;
                    }
                }
            }
            if (z) {
                pb1.a();
            }
        }
    }

    @Override // defpackage.br0
    public final ip1 b(View view, ip1 ip1Var) {
        if (this.e) {
            this.h = ip1Var;
            if (Build.VERSION.SDK_INT == 30) {
                view.post(this);
                return ip1Var;
            }
        } else if (this.g == 0) {
            f(ip1Var);
        }
        return ip1Var;
    }

    @Override // defpackage.so1
    public final void c() {
        this.e = true;
    }

    @Override // defpackage.so1
    public final ip1 d(ip1 ip1Var, List list) {
        int size = list.size();
        for (int i = 0; i < size; i++) {
            uo1 uo1Var = (uo1) list.get(i);
            mp1 mp1Var = (mp1) op1.a.b(((WindowInsetsAnimation) uo1Var.a.e).getTypeMask());
            if (mp1Var != null) {
                Object g = this.i.g(mp1Var);
                g.getClass();
                wp1 wp1Var = (wp1) g;
                if (((Boolean) wp1Var.b.getValue()).booleanValue()) {
                    nq0 nq0Var = uo1Var.a;
                    WindowInsetsAnimation windowInsetsAnimation = (WindowInsetsAnimation) nq0Var.e;
                    WindowInsetsAnimation windowInsetsAnimation2 = (WindowInsetsAnimation) nq0Var.e;
                    wp1Var.c.h(windowInsetsAnimation.getInterpolatedFraction());
                    wp1Var.e.h(windowInsetsAnimation2.getAlpha());
                    wp1Var.d.i(windowInsetsAnimation2.getDurationMillis());
                }
            }
        }
        f(ip1Var);
        return ip1Var;
    }

    @Override // defpackage.so1
    public final c51 e(uo1 uo1Var, c51 c51Var) {
        ip1 ip1Var = this.h;
        boolean z = false;
        this.e = false;
        this.h = null;
        if (((WindowInsetsAnimation) uo1Var.a.e).getDurationMillis() > 0 && ip1Var != null) {
            int typeMask = ((WindowInsetsAnimation) uo1Var.a.e).getTypeMask();
            this.g |= typeMask;
            mp1 mp1Var = (mp1) op1.a.b(typeMask);
            if (mp1Var != null) {
                Object g = this.i.g(mp1Var);
                g.getClass();
                wp1 wp1Var = (wp1) g;
                c90 g2 = ip1Var.a.g(typeMask);
                long j = (g2.a << 48) | (g2.b << 32) | (g2.c << 16) | g2.d;
                long j2 = wp1Var.h;
                if (!t90.n(j, j2)) {
                    wp1Var.j = j2;
                    wp1Var.k = j;
                    wp1Var.b.setValue(Boolean.TRUE);
                    nq0 nq0Var = uo1Var.a;
                    wp1Var.c.h(((WindowInsetsAnimation) nq0Var.e).getInterpolatedFraction());
                    wp1Var.e.h(((WindowInsetsAnimation) nq0Var.e).getAlpha());
                    wp1Var.d.i(((WindowInsetsAnimation) nq0Var.e).getDurationMillis());
                    xu0 xu0Var = this.j;
                    xu0Var.i(xu0Var.h() + 1);
                    synchronized (pb1.c) {
                        wn0 wn0Var = pb1.j.h;
                        if (wn0Var != null) {
                            if (wn0Var.h()) {
                                z = true;
                            }
                        }
                    }
                    if (z) {
                        pb1.a();
                        return c51Var;
                    }
                }
            }
        }
        return c51Var;
    }

    public final void f(ip1 ip1Var) {
        char c;
        char c2;
        boolean z;
        char c3;
        boolean z2;
        boolean z3;
        long j;
        boolean z4;
        long[] jArr;
        int[] iArr;
        Object[] objArr;
        long[] jArr2;
        int[] iArr2;
        Object[] objArr2;
        long j2;
        int i;
        en0 en0Var = op1.a;
        int[] iArr3 = en0Var.b;
        Object[] objArr3 = en0Var.c;
        long[] jArr3 = en0Var.a;
        int length = jArr3.length - 2;
        if (length >= 0) {
            int i2 = 0;
            z2 = false;
            z3 = false;
            c = 16;
            c2 = ' ';
            while (true) {
                long j3 = jArr3[i2];
                z = true;
                if ((((~j3) << 7) & j3 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i3 = 8;
                    int i4 = 8 - ((~(i2 - length)) >>> 31);
                    int i5 = 0;
                    c3 = '0';
                    while (i5 < i4) {
                        if ((j3 & 255) < 128) {
                            int i6 = (i2 << 3) + i5;
                            int i7 = iArr3[i6];
                            mp1 mp1Var = (mp1) objArr3[i6];
                            c90 g = ip1Var.a.g(i7);
                            jArr2 = jArr3;
                            iArr2 = iArr3;
                            long j4 = (g.a << 48) | (g.b << 32) | (g.c << 16) | g.d;
                            Object g2 = this.i.g(mp1Var);
                            g2.getClass();
                            wp1 wp1Var = (wp1) g2;
                            j2 = j3;
                            if (!t90.n(j4, wp1Var.h)) {
                                wp1Var.h = j4;
                                z2 = true;
                                if (!t90.n(j4, 0L)) {
                                    z3 = true;
                                }
                            }
                            if (i7 != 8) {
                                c90 h = ip1Var.a.h(i7);
                                objArr2 = objArr3;
                                long j5 = (h.b << 32) | (h.a << 48) | (h.c << 16) | h.d;
                                if (!t90.n(wp1Var.i, j5)) {
                                    wp1Var.i = j5;
                                    z2 = true;
                                    if (!t90.n(j5, 0L)) {
                                        z3 = true;
                                    }
                                }
                            } else {
                                objArr2 = objArr3;
                            }
                            wp1Var.a.setValue(Boolean.valueOf(ip1Var.a.q(i7)));
                            i = 8;
                        } else {
                            jArr2 = jArr3;
                            iArr2 = iArr3;
                            objArr2 = objArr3;
                            j2 = j3;
                            i = i3;
                        }
                        j3 = j2 >> i;
                        i5++;
                        i3 = i;
                        objArr3 = objArr2;
                        jArr3 = jArr2;
                        iArr3 = iArr2;
                    }
                    jArr = jArr3;
                    iArr = iArr3;
                    objArr = objArr3;
                    if (i4 != i3) {
                        break;
                    }
                } else {
                    jArr = jArr3;
                    iArr = iArr3;
                    objArr = objArr3;
                    c3 = '0';
                }
                if (i2 == length) {
                    break;
                }
                i2++;
                objArr3 = objArr;
                jArr3 = jArr;
                iArr3 = iArr;
            }
        } else {
            c = 16;
            c2 = ' ';
            z = true;
            c3 = '0';
            z2 = false;
            z3 = false;
        }
        ms f = ip1Var.a.f();
        if (f == null) {
            j = 0;
        } else {
            c90 b = c90.b(f.a.getWaterfallInsets());
            j = (b.a << c3) | (b.b << c2) | (b.c << c) | b.d;
        }
        vn0 vn0Var = this.i;
        mp1.a.getClass();
        Object g3 = vn0Var.g(lp1.j);
        g3.getClass();
        wp1 wp1Var2 = (wp1) g3;
        wp1Var2.a.setValue(Boolean.valueOf(!t90.n(j, 0L)));
        if (!t90.n(wp1Var2.h, j)) {
            wp1Var2.h = j;
            wp1Var2.i = j;
            z2 = z;
            if (!t90.n(j, 0L)) {
                z3 = z2;
            }
        }
        if (f == null) {
            mn0 mn0Var = this.k;
            if (mn0Var.b > 0) {
                mn0Var.d();
                this.l.clear();
                z2 = z;
            }
        } else {
            List<Rect> boundingRects = f.a.getBoundingRects();
            int size = boundingRects.size();
            mn0 mn0Var2 = this.k;
            if (size < mn0Var2.b) {
                mn0Var2.l(boundingRects.size(), this.k.b);
                this.l.e(boundingRects.size(), this.l.size());
                z2 = z;
            } else {
                int size2 = boundingRects.size() - this.k.b;
                int i8 = 0;
                while (i8 < size2) {
                    mn0 mn0Var3 = this.k;
                    mn0Var3.a(gb0.F(boundingRects.get(mn0Var3.b)));
                    this.l.add(new w80("display cutout rect " + this.k.b));
                    i8++;
                    z2 = z;
                }
            }
            int size3 = boundingRects.size();
            for (int i9 = 0; i9 < size3; i9++) {
                Rect rect = boundingRects.get(i9);
                ao0 ao0Var = (ao0) this.k.f(i9);
                if (!Intrinsics.a(ao0Var.getValue(), rect)) {
                    ao0Var.setValue(rect);
                    z2 = z;
                }
            }
            if (!boundingRects.isEmpty()) {
                z3 = z;
            }
        }
        if ((z3 || this.j.h() != 0) && z2) {
            xu0 xu0Var = this.j;
            xu0Var.i(xu0Var.h() + 1);
            synchronized (pb1.c) {
                wn0 wn0Var = pb1.j.h;
                if (wn0Var != null) {
                    boolean z5 = z;
                    z4 = wn0Var.h() == z5 ? z5 : false;
                }
            }
            if (z4) {
                pb1.a();
            }
        }
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        Object parent = view.getParent();
        View view2 = parent instanceof View ? (View) parent : null;
        if (view2 != null) {
            view = view2;
        }
        int i = ln1.a;
        hn1.a(view, this);
        view.setWindowInsetsAnimationCallback(new to1(this));
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        Object parent = view.getParent();
        View view2 = parent instanceof View ? (View) parent : null;
        if (view2 != null) {
            view = view2;
        }
        int i = ln1.a;
        hn1.a(view, null);
        view.setWindowInsetsAnimationCallback(null);
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.e) {
            this.g = 0;
            this.e = false;
            ip1 ip1Var = this.h;
            if (ip1Var != null) {
                f(ip1Var);
                this.h = null;
            }
        }
    }
}
