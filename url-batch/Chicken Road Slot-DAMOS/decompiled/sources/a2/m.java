package a2;

import android.graphics.Rect;
import android.os.Build;
import android.view.View;
import java.lang.reflect.Field;
import java.util.Collections;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import o3.k1;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class m extends androidx.datastore.preferences.protobuf.i implements Runnable, o3.i, View.OnAttachStateChangeListener {

    /* renamed from: i, reason: collision with root package name */
    public boolean f122i;

    /* renamed from: r, reason: collision with root package name */
    public int f123r;

    /* renamed from: s, reason: collision with root package name */
    public k1 f124s;

    /* renamed from: t, reason: collision with root package name */
    public final s.h0 f125t;

    /* renamed from: u, reason: collision with root package name */
    public final n0.g1 f126u;

    /* renamed from: v, reason: collision with root package name */
    public final s.d0 f127v;

    /* renamed from: w, reason: collision with root package name */
    public final b1.w f128w;

    public m() {
        super(1);
        s.h0 h0Var = new s.h0(9);
        f1.f90a.getClass();
        h0Var.m(e1.f82b, new i1("caption bar"));
        h0Var.m(e1.f83c, new i1("display cutout"));
        h0Var.m(e1.f84d, new i1("ime"));
        h0Var.m(e1.f85e, new i1("mandatory system gestures"));
        h0Var.m(e1.f86f, new i1("navigation bars"));
        h0Var.m(e1.g, new i1("status bars"));
        h0Var.m(e1.f87h, new i1("system gestures"));
        h0Var.m(e1.f88i, new i1("tappable element"));
        h0Var.m(e1.j, new i1("waterfall"));
        this.f125t = h0Var;
        this.f126u = new n0.g1(0);
        this.f127v = new s.d0(4);
        this.f128w = new b1.w();
    }

    public final void F(k1 k1Var) {
        char c10;
        char c11;
        boolean z10;
        char c12;
        boolean z11;
        boolean z12;
        long j;
        boolean z13;
        long[] jArr;
        int[] iArr;
        Object[] objArr;
        long[] jArr2;
        int[] iArr2;
        Object[] objArr2;
        long j3;
        int i3;
        s.w wVar = h1.f99a;
        int[] iArr3 = wVar.f8337b;
        Object[] objArr3 = wVar.f8338c;
        long[] jArr3 = wVar.f8336a;
        int length = jArr3.length - 2;
        if (length >= 0) {
            int i10 = 0;
            z11 = false;
            z12 = false;
            c10 = 16;
            c11 = ' ';
            while (true) {
                long j10 = jArr3[i10];
                z10 = true;
                if ((((~j10) << 7) & j10 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i11 = 8;
                    int i12 = 8 - ((~(i10 - length)) >>> 31);
                    int i13 = 0;
                    c12 = '0';
                    while (i13 < i12) {
                        if ((j10 & 255) < 128) {
                            int i14 = (i10 << 3) + i13;
                            int i15 = iArr3[i14];
                            f1 f1Var = (f1) objArr3[i14];
                            h3.b i16 = k1Var.f7415a.i(i15);
                            jArr2 = jArr3;
                            iArr2 = iArr3;
                            long j11 = (i16.f4443a << 48) | (i16.f4444b << 32) | (i16.f4445c << 16) | i16.f4446d;
                            Object g = this.f125t.g(f1Var);
                            g.getClass();
                            i1 i1Var = (i1) g;
                            j3 = j10;
                            if (!q.g(j11, i1Var.f107h)) {
                                i1Var.f107h = j11;
                                z11 = true;
                                if (!q.g(j11, 0L)) {
                                    z12 = true;
                                }
                            }
                            if (i15 != 8) {
                                h3.b j12 = k1Var.f7415a.j(i15);
                                objArr2 = objArr3;
                                long j13 = (j12.f4444b << 32) | (j12.f4443a << 48) | (j12.f4445c << 16) | j12.f4446d;
                                if (!q.g(i1Var.f108i, j13)) {
                                    i1Var.f108i = j13;
                                    z11 = true;
                                    if (!q.g(j13, 0L)) {
                                        z12 = true;
                                    }
                                }
                            } else {
                                objArr2 = objArr3;
                            }
                            i1Var.f101a.setValue(Boolean.valueOf(k1Var.f7415a.u(i15)));
                            i3 = 8;
                        } else {
                            jArr2 = jArr3;
                            iArr2 = iArr3;
                            objArr2 = objArr3;
                            j3 = j10;
                            i3 = i11;
                        }
                        j10 = j3 >> i3;
                        i13++;
                        i11 = i3;
                        objArr3 = objArr2;
                        jArr3 = jArr2;
                        iArr3 = iArr2;
                    }
                    jArr = jArr3;
                    iArr = iArr3;
                    objArr = objArr3;
                    if (i12 != i11) {
                        break;
                    }
                } else {
                    jArr = jArr3;
                    iArr = iArr3;
                    objArr = objArr3;
                    c12 = '0';
                }
                if (i10 == length) {
                    break;
                }
                i10++;
                objArr3 = objArr;
                jArr3 = jArr;
                iArr3 = iArr;
            }
        } else {
            c10 = 16;
            c11 = ' ';
            z10 = true;
            c12 = '0';
            z11 = false;
            z12 = false;
        }
        o3.d h10 = k1Var.f7415a.h();
        if (h10 == null) {
            j = 0;
        } else {
            h3.b a9 = h10.a();
            j = (a9.f4443a << c12) | (a9.f4444b << c11) | (a9.f4445c << c10) | a9.f4446d;
        }
        s.h0 h0Var = this.f125t;
        f1.f90a.getClass();
        Object g2 = h0Var.g(e1.j);
        g2.getClass();
        i1 i1Var2 = (i1) g2;
        i1Var2.f101a.setValue(Boolean.valueOf(!q.g(j, 0L)));
        if (!q.g(i1Var2.f107h, j)) {
            i1Var2.f107h = j;
            i1Var2.f108i = j;
            z11 = z10;
            if (!q.g(j, 0L)) {
                z12 = z11;
            }
        }
        if (h10 == null) {
            s.d0 d0Var = this.f127v;
            if (d0Var.f8285b > 0) {
                d0Var.d();
                this.f128w.clear();
                z11 = z10;
            }
        } else {
            List c13 = Build.VERSION.SDK_INT >= 28 ? e3.k.c(h10.f7384a) : Collections.EMPTY_LIST;
            int size = c13.size();
            s.d0 d0Var2 = this.f127v;
            if (size < d0Var2.f8285b) {
                d0Var2.l(c13.size(), this.f127v.f8285b);
                this.f128w.f(c13.size(), this.f128w.size());
                z11 = z10;
            } else {
                int size2 = c13.size() - this.f127v.f8285b;
                int i17 = 0;
                while (i17 < size2) {
                    s.d0 d0Var3 = this.f127v;
                    d0Var3.a(n0.h.r(c13.get(d0Var3.f8285b)));
                    this.f128w.add(new l("display cutout rect " + this.f127v.f8285b));
                    i17++;
                    z11 = z10;
                }
            }
            int size3 = c13.size();
            for (int i18 = 0; i18 < size3; i18++) {
                Rect rect = (Rect) c13.get(i18);
                n0.z0 z0Var = (n0.z0) this.f127v.f(i18);
                if (!Intrinsics.a(z0Var.getValue(), rect)) {
                    z0Var.setValue(rect);
                    z11 = z10;
                }
            }
            if (!c13.isEmpty()) {
                z12 = z10;
            }
        }
        if ((z12 || this.f126u.h() != 0) && z11) {
            n0.g1 g1Var = this.f126u;
            g1Var.i(g1Var.h() + 1);
            synchronized (b1.r.f1030c) {
                s.i0 i0Var = b1.r.j.f959h;
                if (i0Var != null) {
                    boolean z14 = z10;
                    z13 = i0Var.h() == z14 ? z14 : false;
                }
            }
            if (z13) {
                b1.r.a();
            }
        }
    }

    @Override // o3.i
    public final k1 b(View view, k1 k1Var) {
        if (this.f122i) {
            this.f124s = k1Var;
            if (Build.VERSION.SDK_INT == 30) {
                view.post(this);
                return k1Var;
            }
        } else if (this.f123r == 0) {
            F(k1Var);
        }
        return k1Var;
    }

    @Override // androidx.datastore.preferences.protobuf.i
    public final void e(o3.q0 q0Var) {
        boolean z10 = false;
        this.f122i = false;
        int d10 = q0Var.f7435a.d();
        this.f123r &= ~d10;
        this.f124s = null;
        f1 f1Var = (f1) h1.f99a.b(d10);
        if (f1Var != null) {
            Object g = this.f125t.g(f1Var);
            g.getClass();
            i1 i1Var = (i1) g;
            i1Var.f103c.i(0.0f);
            i1Var.f105e.i(1.0f);
            i1Var.f104d.i(0L);
            i1Var.f103c.i(0.0f);
            i1Var.f102b.setValue(Boolean.FALSE);
            i1Var.j = -1L;
            i1Var.f109k = -1L;
            n0.g1 g1Var = this.f126u;
            g1Var.i(g1Var.h() + 1);
            synchronized (b1.r.f1030c) {
                s.i0 i0Var = b1.r.j.f959h;
                if (i0Var != null) {
                    if (i0Var.h()) {
                        z10 = true;
                    }
                }
            }
            if (z10) {
                b1.r.a();
            }
        }
    }

    @Override // androidx.datastore.preferences.protobuf.i
    public final void f(o3.q0 q0Var) {
        this.f122i = true;
    }

    @Override // androidx.datastore.preferences.protobuf.i
    public final k1 g(k1 k1Var, List list) {
        int size = list.size();
        for (int i3 = 0; i3 < size; i3++) {
            o3.q0 q0Var = (o3.q0) list.get(i3);
            f1 f1Var = (f1) h1.f99a.b(q0Var.f7435a.d());
            if (f1Var != null) {
                Object g = this.f125t.g(f1Var);
                g.getClass();
                i1 i1Var = (i1) g;
                if (((Boolean) i1Var.f102b.getValue()).booleanValue()) {
                    o3.p0 p0Var = q0Var.f7435a;
                    i1Var.f103c.i(p0Var.c());
                    i1Var.f105e.i(p0Var.a());
                    i1Var.f104d.i(p0Var.b());
                }
            }
        }
        F(k1Var);
        return k1Var;
    }

    @Override // androidx.datastore.preferences.protobuf.i
    public final c6.e h(o3.q0 q0Var, c6.e eVar) {
        k1 k1Var = this.f124s;
        boolean z10 = false;
        this.f122i = false;
        this.f124s = null;
        if (q0Var.f7435a.b() > 0 && k1Var != null) {
            int d10 = q0Var.f7435a.d();
            this.f123r |= d10;
            f1 f1Var = (f1) h1.f99a.b(d10);
            if (f1Var != null) {
                Object g = this.f125t.g(f1Var);
                g.getClass();
                i1 i1Var = (i1) g;
                h3.b i3 = k1Var.f7415a.i(d10);
                long j = (i3.f4443a << 48) | (i3.f4444b << 32) | (i3.f4445c << 16) | i3.f4446d;
                long j3 = i1Var.f107h;
                if (!q.g(j, j3)) {
                    i1Var.j = j3;
                    i1Var.f109k = j;
                    i1Var.f102b.setValue(Boolean.TRUE);
                    o3.p0 p0Var = q0Var.f7435a;
                    i1Var.f103c.i(p0Var.c());
                    i1Var.f105e.i(p0Var.a());
                    i1Var.f104d.i(p0Var.b());
                    n0.g1 g1Var = this.f126u;
                    g1Var.i(g1Var.h() + 1);
                    synchronized (b1.r.f1030c) {
                        s.i0 i0Var = b1.r.j.f959h;
                        if (i0Var != null) {
                            if (i0Var.h()) {
                                z10 = true;
                            }
                        }
                    }
                    if (z10) {
                        b1.r.a();
                        return eVar;
                    }
                }
            }
        }
        return eVar;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        Object parent = view.getParent();
        View view2 = parent instanceof View ? (View) parent : null;
        if (view2 != null) {
            view = view2;
        }
        Field field = o3.c0.f7378a;
        o3.w.c(view, this);
        o3.c0.f(view, this);
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        Object parent = view.getParent();
        View view2 = parent instanceof View ? (View) parent : null;
        if (view2 != null) {
            view = view2;
        }
        Field field = o3.c0.f7378a;
        o3.w.c(view, null);
        o3.c0.f(view, null);
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.f122i) {
            this.f123r = 0;
            this.f122i = false;
            k1 k1Var = this.f124s;
            if (k1Var != null) {
                F(k1Var);
                this.f124s = null;
            }
        }
    }
}
