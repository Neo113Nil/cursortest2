package defpackage;

import android.graphics.Rect;
import android.os.Build;
import android.view.View;
import androidx.compose.ui.layout.b;
import java.util.Collections;
import java.util.List;
import java.util.WeakHashMap;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class a31 extends iv implements Runnable, iu1, View.OnAttachStateChangeListener {
    public boolean o;
    public int p;
    public c83 q;
    public final tn1 r;
    public final iz1 s;
    public final jn1 t;
    public final fn2 u;

    public a31() {
        super(1);
        tn1 tn1Var = new tn1(9);
        l83.a.getClass();
        tn1Var.m(k83.b, new t83("caption bar"));
        tn1Var.m(k83.c, new t83("display cutout"));
        tn1Var.m(k83.d, new t83("ime"));
        tn1Var.m(k83.e, new t83("mandatory system gestures"));
        tn1Var.m(k83.f, new t83("navigation bars"));
        tn1Var.m(k83.g, new t83("status bars"));
        tn1Var.m(k83.h, new t83("system gestures"));
        tn1Var.m(k83.i, new t83("tappable element"));
        tn1Var.m(k83.j, new t83("waterfall"));
        this.r = tn1Var;
        this.s = new iz1(0);
        this.t = new jn1(4);
        this.u = new fn2();
    }

    public final void E(c83 c83Var) {
        char c;
        char c2;
        char c3;
        char c4;
        long j;
        boolean z;
        boolean z2;
        boolean z3;
        long j2;
        long i;
        boolean z4;
        long[] jArr;
        int[] iArr;
        long[] jArr2;
        int[] iArr2;
        long[] jArr3;
        int[] iArr3;
        long[] jArr4;
        int[] iArr4;
        int i2;
        zm1 zm1Var = b.a;
        int[] iArr5 = zm1Var.b;
        Object[] objArr = zm1Var.c;
        long[] jArr5 = zm1Var.a;
        int length = jArr5.length - 2;
        int i3 = 8;
        if (length >= 0) {
            int i4 = 0;
            z2 = false;
            z3 = false;
            c = 7;
            c2 = 16;
            c3 = ' ';
            while (true) {
                long j3 = jArr5[i4];
                c4 = '0';
                j = -9187201950435737472L;
                if ((((~j3) << 7) & j3 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i5 = 8 - ((~(i4 - length)) >>> 31);
                    int i6 = 0;
                    while (i6 < i5) {
                        if ((j3 & 255) < 128) {
                            int i7 = (i4 << 3) + i6;
                            int i8 = iArr5[i7];
                            l83 l83Var = (l83) objArr[i7];
                            i2 = i3;
                            z21 h = c83Var.a.h(i8);
                            jArr4 = jArr5;
                            iArr4 = iArr5;
                            long j4 = (h.b << 32) | (h.a << 48) | (h.c << 16) | h.d;
                            Object g = this.r.g(l83Var);
                            g.getClass();
                            t83 t83Var = (t83) g;
                            if (!nk2.h(j4, t83Var.h)) {
                                t83Var.h = j4;
                                z2 = true;
                                if (!nk2.h(j4, 0L)) {
                                    z3 = true;
                                }
                            }
                        } else {
                            jArr4 = jArr5;
                            iArr4 = iArr5;
                            i2 = i3;
                        }
                        j3 >>= i2;
                        i6++;
                        i3 = i2;
                        iArr5 = iArr4;
                        jArr5 = jArr4;
                    }
                    jArr3 = jArr5;
                    iArr3 = iArr5;
                    z = true;
                    if (i5 != i3) {
                        break;
                    }
                } else {
                    jArr3 = jArr5;
                    iArr3 = iArr5;
                    z = true;
                }
                if (i4 == length) {
                    break;
                }
                i4++;
                iArr5 = iArr3;
                jArr5 = jArr3;
                i3 = 8;
            }
        } else {
            c = 7;
            c2 = 16;
            c3 = ' ';
            c4 = '0';
            j = -9187201950435737472L;
            z = true;
            z2 = false;
            z3 = false;
        }
        zm1 zm1Var2 = b.c;
        int[] iArr6 = zm1Var2.b;
        Object[] objArr2 = zm1Var2.c;
        long[] jArr6 = zm1Var2.a;
        int length2 = jArr6.length - 2;
        if (length2 >= 0) {
            int i9 = 0;
            while (true) {
                long j5 = jArr6[i9];
                if ((((~j5) << c) & j5 & j) != j) {
                    int i10 = 8 - ((~(i9 - length2)) >>> 31);
                    int i11 = 0;
                    while (i11 < i10) {
                        if ((j5 & 255) < 128) {
                            int i12 = (i9 << 3) + i11;
                            int i13 = iArr6[i12];
                            Object g2 = this.r.g((l83) objArr2[i12]);
                            g2.getClass();
                            t83 t83Var2 = (t83) g2;
                            if (i13 != 8) {
                                z21 i14 = c83Var.a.i(i13);
                                jArr2 = jArr6;
                                iArr2 = iArr6;
                                long j6 = (i14.b << c3) | (i14.a << c4) | (i14.c << c2) | i14.d;
                                if (!nk2.h(t83Var2.i, j6)) {
                                    t83Var2.i = j6;
                                    z2 = z;
                                    if (!nk2.h(j6, 0L)) {
                                        z3 = z2;
                                    }
                                }
                            } else {
                                jArr2 = jArr6;
                                iArr2 = iArr6;
                            }
                            t83Var2.a.setValue(Boolean.valueOf(c83Var.a.t(i13)));
                        } else {
                            jArr2 = jArr6;
                            iArr2 = iArr6;
                        }
                        j5 >>= 8;
                        i11++;
                        jArr6 = jArr2;
                        iArr6 = iArr2;
                    }
                    jArr = jArr6;
                    iArr = iArr6;
                    if (i10 != 8) {
                        break;
                    }
                } else {
                    jArr = jArr6;
                    iArr = iArr6;
                }
                if (i9 == length2) {
                    break;
                }
                i9++;
                jArr6 = jArr;
                iArr6 = iArr;
            }
        }
        wb0 g3 = c83Var.a.g();
        if (g3 == null) {
            j2 = 0;
        } else {
            z21 a = g3.a();
            j2 = (a.a << c4) | (a.b << c3) | (a.c << c2) | a.d;
        }
        tn1 tn1Var = this.r;
        l83.a.getClass();
        Object g4 = tn1Var.g(k83.j);
        g4.getClass();
        t83 t83Var3 = (t83) g4;
        if (!nk2.h(t83Var3.h, j2)) {
            t83Var3.h = j2;
            t83Var3.i = j2;
            z2 = z;
            if (!nk2.h(j2, 0L)) {
                z3 = z2;
            }
        }
        if (g3 == null) {
            i = 0;
        } else {
            int i15 = Build.VERSION.SDK_INT;
            i = (i15 >= 28 ? km.i(g3.a) : 0) | ((i15 >= 28 ? km.l(g3.a) : 0) << c3) | ((i15 >= 28 ? km.j(g3.a) : 0) << c4) | ((i15 >= 28 ? km.k(g3.a) : 0) << c2);
        }
        Object g5 = this.r.g(k83.c);
        g5.getClass();
        t83 t83Var4 = (t83) g5;
        if (!nk2.h(i, t83Var4.h)) {
            t83Var4.h = i;
            t83Var4.i = i;
            z2 = z;
            if (!nk2.h(i, 0L)) {
                z3 = z2;
            }
        }
        if (g3 == null) {
            jn1 jn1Var = this.t;
            if (jn1Var.b > 0) {
                jn1Var.c();
                this.u.clear();
                z2 = z;
            }
        } else {
            List d = Build.VERSION.SDK_INT >= 28 ? km.d(g3.a) : Collections.EMPTY_LIST;
            int size = d.size();
            jn1 jn1Var2 = this.t;
            if (size < jn1Var2.b) {
                jn1Var2.k(d.size(), this.t.b);
                this.u.c(d.size(), this.u.size());
                z2 = z;
            } else {
                int size2 = d.size() - this.t.b;
                int i16 = 0;
                while (i16 < size2) {
                    jn1 jn1Var3 = this.t;
                    jn1Var3.a(ij2.j(d.get(jn1Var3.b)));
                    this.u.add(new o21("display cutout rect " + this.t.b));
                    i16++;
                    z2 = z;
                }
            }
            int size3 = d.size();
            for (int i17 = 0; i17 < size3; i17++) {
                Rect rect = (Rect) d.get(i17);
                zn1 zn1Var = (zn1) this.t.e(i17);
                if (!Intrinsics.b(zn1Var.getValue(), rect)) {
                    zn1Var.setValue(rect);
                    z2 = z;
                }
            }
            if (!d.isEmpty()) {
                z3 = z;
            }
        }
        if ((z3 || this.s.h() != 0) && z2) {
            iz1 iz1Var = this.s;
            iz1Var.i(iz1Var.h() + 1);
            synchronized (tm2.c) {
                un1 un1Var = tm2.j.h;
                if (un1Var != null) {
                    boolean z5 = z;
                    z4 = un1Var.h() == z5 ? z5 : false;
                }
            }
            if (z4) {
                tm2.a();
            }
        }
    }

    @Override // defpackage.iu1
    public final c83 a(View view, c83 c83Var) {
        if (this.o) {
            this.q = c83Var;
            if (Build.VERSION.SDK_INT == 30) {
                view.post(this);
                return c83Var;
            }
        } else if (this.p == 0) {
            E(c83Var);
        }
        return c83Var;
    }

    @Override // defpackage.iv
    public final void e(i73 i73Var) {
        boolean z = false;
        this.o = false;
        int d = i73Var.a.d();
        this.p &= ~d;
        this.q = null;
        l83 l83Var = (l83) b.c.b(d);
        if (l83Var != null) {
            Object g = this.r.g(l83Var);
            g.getClass();
            t83 t83Var = (t83) g;
            t83Var.c.i(0.0f);
            t83Var.e.i(1.0f);
            t83Var.d.i(0L);
            t83Var.c.i(0.0f);
            t83Var.b.setValue(Boolean.FALSE);
            t83Var.j = -1L;
            t83Var.k = -1L;
            iz1 iz1Var = this.s;
            iz1Var.i(iz1Var.h() + 1);
            synchronized (tm2.c) {
                un1 un1Var = tm2.j.h;
                if (un1Var != null) {
                    if (un1Var.h()) {
                        z = true;
                    }
                }
            }
            if (z) {
                tm2.a();
            }
        }
    }

    @Override // defpackage.iv
    public final void f(i73 i73Var) {
        this.o = true;
    }

    @Override // defpackage.iv
    public final c83 g(c83 c83Var, List list) {
        int size = list.size();
        for (int i = 0; i < size; i++) {
            i73 i73Var = (i73) list.get(i);
            l83 l83Var = (l83) b.c.b(i73Var.a.d());
            if (l83Var != null) {
                Object g = this.r.g(l83Var);
                g.getClass();
                t83 t83Var = (t83) g;
                if (((Boolean) t83Var.b.getValue()).booleanValue()) {
                    h73 h73Var = i73Var.a;
                    t83Var.c.i(h73Var.c());
                    t83Var.e.i(h73Var.a());
                    t83Var.d.i(h73Var.b());
                }
            }
        }
        E(c83Var);
        return c83Var;
    }

    @Override // defpackage.iv
    public final tt1 h(i73 i73Var, tt1 tt1Var) {
        c83 c83Var = this.q;
        boolean z = false;
        this.o = false;
        this.q = null;
        if (i73Var.a.b() > 0 && c83Var != null) {
            int d = i73Var.a.d();
            this.p |= d;
            l83 l83Var = (l83) b.c.b(d);
            if (l83Var != null) {
                Object g = this.r.g(l83Var);
                g.getClass();
                t83 t83Var = (t83) g;
                z21 h = c83Var.a.h(d);
                long j = (h.a << 48) | (h.b << 32) | (h.c << 16) | h.d;
                long j2 = t83Var.h;
                if (!nk2.h(j, j2)) {
                    t83Var.j = j2;
                    t83Var.k = j;
                    t83Var.b.setValue(Boolean.TRUE);
                    h73 h73Var = i73Var.a;
                    t83Var.c.i(h73Var.c());
                    t83Var.e.i(h73Var.a());
                    t83Var.d.i(h73Var.b());
                    iz1 iz1Var = this.s;
                    iz1Var.i(iz1Var.h() + 1);
                    synchronized (tm2.c) {
                        un1 un1Var = tm2.j.h;
                        if (un1Var != null) {
                            if (un1Var.h()) {
                                z = true;
                            }
                        }
                    }
                    if (z) {
                        tm2.a();
                        return tt1Var;
                    }
                }
            }
        }
        return tt1Var;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        Object parent = view.getParent();
        View view2 = parent instanceof View ? (View) parent : null;
        if (view2 != null) {
            view = view2;
        }
        WeakHashMap weakHashMap = e53.a;
        x43.c(view, this);
        e53.k(view, this);
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        Object parent = view.getParent();
        View view2 = parent instanceof View ? (View) parent : null;
        if (view2 != null) {
            view = view2;
        }
        WeakHashMap weakHashMap = e53.a;
        x43.c(view, null);
        e53.k(view, null);
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.o) {
            this.p = 0;
            this.o = false;
            c83 c83Var = this.q;
            if (c83Var != null) {
                E(c83Var);
                this.q = null;
            }
        }
    }
}
