package u1;

import android.graphics.Rect;
import android.os.Build;
import android.view.View;
import java.lang.reflect.Field;
import java.util.Collections;
import java.util.List;
import q3.l1;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public final class o extends androidx.datastore.preferences.protobuf.j implements Runnable, q3.p, View.OnAttachStateChangeListener {

    /* renamed from: f, reason: collision with root package name */
    public boolean f7248f;

    /* renamed from: g, reason: collision with root package name */
    public int f7249g;

    /* renamed from: h, reason: collision with root package name */
    public l1 f7250h;
    public final o.j0 i;

    /* renamed from: j, reason: collision with root package name */
    public final m0.e1 f7251j;

    /* renamed from: k, reason: collision with root package name */
    public final o.e0 f7252k;

    /* renamed from: l, reason: collision with root package name */
    public final w0.p f7253l;

    public o() {
        super(1);
        o.j0 j0Var = new o.j0(9);
        c1.f7199a.getClass();
        j0Var.m(b1.f7189b, new e1("caption bar"));
        j0Var.m(b1.f7190c, new e1("display cutout"));
        j0Var.m(b1.f7191d, new e1("ime"));
        j0Var.m(b1.f7192e, new e1("mandatory system gestures"));
        j0Var.m(b1.f7193f, new e1("navigation bars"));
        j0Var.m(b1.f7194g, new e1("status bars"));
        j0Var.m(b1.f7195h, new e1("system gestures"));
        j0Var.m(b1.i, new e1("tappable element"));
        j0Var.m(b1.f7196j, new e1("waterfall"));
        this.i = j0Var;
        this.f7251j = new m0.e1(0);
        this.f7252k = new o.e0(4);
        this.f7253l = new w0.p();
    }

    public final void E(l1 l1Var) {
        char c8;
        char c9;
        char c10;
        char c11;
        long j7;
        boolean z3;
        boolean z7;
        boolean z8;
        long j8;
        long e8;
        boolean z9;
        long[] jArr;
        int[] iArr;
        long[] jArr2;
        int[] iArr2;
        long[] jArr3;
        int[] iArr3;
        long[] jArr4;
        int[] iArr4;
        int i;
        o.x xVar = androidx.compose.ui.layout.b.f561a;
        int[] iArr5 = xVar.f5495b;
        Object[] objArr = xVar.f5496c;
        long[] jArr5 = xVar.f5494a;
        int length = jArr5.length - 2;
        int i8 = 8;
        if (length >= 0) {
            int i9 = 0;
            z7 = false;
            z8 = false;
            c8 = 7;
            c9 = 16;
            c10 = ' ';
            while (true) {
                long j9 = jArr5[i9];
                c11 = '0';
                j7 = -9187201950435737472L;
                if ((((~j9) << 7) & j9 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i10 = 8 - ((~(i9 - length)) >>> 31);
                    int i11 = 0;
                    while (i11 < i10) {
                        if ((j9 & 255) < 128) {
                            int i12 = (i9 << 3) + i11;
                            int i13 = iArr5[i12];
                            c1 c1Var = (c1) objArr[i12];
                            i = i8;
                            i3.c f6 = l1Var.f6127a.f(i13);
                            jArr4 = jArr5;
                            iArr4 = iArr5;
                            long j10 = (f6.f3422b << 32) | (f6.f3421a << 48) | (f6.f3423c << 16) | f6.f3424d;
                            Object g3 = this.i.g(c1Var);
                            q6.i.b(g3);
                            e1 e1Var = (e1) g3;
                            if (!s0.f(j10, e1Var.f7212h)) {
                                e1Var.f7212h = j10;
                                z7 = true;
                                if (!s0.f(j10, 0L)) {
                                    z8 = true;
                                }
                            }
                        } else {
                            jArr4 = jArr5;
                            iArr4 = iArr5;
                            i = i8;
                        }
                        j9 >>= i;
                        i11++;
                        i8 = i;
                        iArr5 = iArr4;
                        jArr5 = jArr4;
                    }
                    jArr3 = jArr5;
                    iArr3 = iArr5;
                    z3 = true;
                    if (i10 != i8) {
                        break;
                    }
                } else {
                    jArr3 = jArr5;
                    iArr3 = iArr5;
                    z3 = true;
                }
                if (i9 == length) {
                    break;
                }
                i9++;
                iArr5 = iArr3;
                jArr5 = jArr3;
                i8 = 8;
            }
        } else {
            c8 = 7;
            c9 = 16;
            c10 = ' ';
            c11 = '0';
            j7 = -9187201950435737472L;
            z3 = true;
            z7 = false;
            z8 = false;
        }
        o.x xVar2 = androidx.compose.ui.layout.b.f563c;
        int[] iArr6 = xVar2.f5495b;
        Object[] objArr2 = xVar2.f5496c;
        long[] jArr6 = xVar2.f5494a;
        int length2 = jArr6.length - 2;
        if (length2 >= 0) {
            int i14 = 0;
            while (true) {
                long j11 = jArr6[i14];
                if ((((~j11) << c8) & j11 & j7) != j7) {
                    int i15 = 8 - ((~(i14 - length2)) >>> 31);
                    int i16 = 0;
                    while (i16 < i15) {
                        if ((j11 & 255) < 128) {
                            int i17 = (i14 << 3) + i16;
                            int i18 = iArr6[i17];
                            Object g7 = this.i.g((c1) objArr2[i17]);
                            q6.i.b(g7);
                            e1 e1Var2 = (e1) g7;
                            if (i18 != 8) {
                                i3.c g8 = l1Var.f6127a.g(i18);
                                jArr2 = jArr6;
                                iArr2 = iArr6;
                                long j12 = (g8.f3422b << c10) | (g8.f3421a << c11) | (g8.f3423c << c9) | g8.f3424d;
                                if (!s0.f(e1Var2.i, j12)) {
                                    e1Var2.i = j12;
                                    z7 = z3;
                                    if (!s0.f(j12, 0L)) {
                                        z8 = z7;
                                    }
                                }
                            } else {
                                jArr2 = jArr6;
                                iArr2 = iArr6;
                            }
                            e1Var2.f7205a.setValue(Boolean.valueOf(l1Var.f6127a.p(i18)));
                        } else {
                            jArr2 = jArr6;
                            iArr2 = iArr6;
                        }
                        j11 >>= 8;
                        i16++;
                        jArr6 = jArr2;
                        iArr6 = iArr2;
                    }
                    jArr = jArr6;
                    iArr = iArr6;
                    if (i15 != 8) {
                        break;
                    }
                } else {
                    jArr = jArr6;
                    iArr = iArr6;
                }
                if (i14 == length2) {
                    break;
                }
                i14++;
                jArr6 = jArr;
                iArr6 = iArr;
            }
        }
        q3.j e9 = l1Var.f6127a.e();
        if (e9 == null) {
            j8 = 0;
        } else {
            i3.c a8 = e9.a();
            j8 = (a8.f3421a << c11) | (a8.f3422b << c10) | (a8.f3423c << c9) | a8.f3424d;
        }
        o.j0 j0Var = this.i;
        c1.f7199a.getClass();
        Object g9 = j0Var.g(b1.f7196j);
        q6.i.b(g9);
        e1 e1Var3 = (e1) g9;
        if (!s0.f(e1Var3.f7212h, j8)) {
            e1Var3.f7212h = j8;
            e1Var3.i = j8;
            z7 = z3;
            if (!s0.f(j8, 0L)) {
                z8 = z7;
            }
        }
        if (e9 == null) {
            e8 = 0;
        } else {
            int i19 = Build.VERSION.SDK_INT;
            e8 = (i19 >= 28 ? j3.a.e(e9.f6113a) : 0) | ((i19 >= 28 ? j3.a.h(e9.f6113a) : 0) << c10) | ((i19 >= 28 ? j3.a.f(e9.f6113a) : 0) << c11) | ((i19 >= 28 ? j3.a.g(e9.f6113a) : 0) << c9);
        }
        Object g10 = this.i.g(b1.f7190c);
        q6.i.b(g10);
        e1 e1Var4 = (e1) g10;
        if (!s0.f(e8, e1Var4.f7212h)) {
            e1Var4.f7212h = e8;
            e1Var4.i = e8;
            z7 = z3;
            if (!s0.f(e8, 0L)) {
                z8 = z7;
            }
        }
        if (e9 == null) {
            o.e0 e0Var = this.f7252k;
            if (e0Var.f5443b > 0) {
                e0Var.c();
                this.f7253l.clear();
                z7 = z3;
            }
        } else {
            List b8 = Build.VERSION.SDK_INT >= 28 ? j3.a.b(e9.f6113a) : Collections.EMPTY_LIST;
            int size = b8.size();
            o.e0 e0Var2 = this.f7252k;
            if (size < e0Var2.f5443b) {
                e0Var2.k(b8.size(), this.f7252k.f5443b);
                this.f7253l.e(b8.size(), this.f7253l.size());
                z7 = z3;
            } else {
                int size2 = b8.size() - this.f7252k.f5443b;
                int i20 = 0;
                while (i20 < size2) {
                    o.e0 e0Var3 = this.f7252k;
                    e0Var3.a(m0.b.q(b8.get(e0Var3.f5443b)));
                    this.f7253l.add(new n("display cutout rect " + this.f7252k.f5443b));
                    i20++;
                    z7 = z3;
                }
            }
            int size3 = b8.size();
            for (int i21 = 0; i21 < size3; i21++) {
                Rect rect = (Rect) b8.get(i21);
                m0.z0 z0Var = (m0.z0) this.f7252k.e(i21);
                if (!q6.i.a(z0Var.getValue(), rect)) {
                    z0Var.setValue(rect);
                    z7 = z3;
                }
            }
            if (!b8.isEmpty()) {
                z8 = z3;
            }
        }
        if ((z8 || this.f7251j.g() != 0) && z7) {
            m0.e1 e1Var5 = this.f7251j;
            e1Var5.h(e1Var5.g() + 1);
            synchronized (w0.m.f7537c) {
                o.k0 k0Var = w0.m.f7543j.f7505h;
                if (k0Var != null) {
                    boolean z10 = z3;
                    z9 = k0Var.h() == z10 ? z10 : false;
                }
            }
            if (z9) {
                w0.m.a();
            }
        }
    }

    @Override // androidx.datastore.preferences.protobuf.j
    public final void d(q3.u0 u0Var) {
        boolean z3 = false;
        this.f7248f = false;
        int d8 = u0Var.f6160a.d();
        this.f7249g &= ~d8;
        this.f7250h = null;
        c1 c1Var = (c1) androidx.compose.ui.layout.b.f563c.b(d8);
        if (c1Var != null) {
            Object g3 = this.i.g(c1Var);
            q6.i.b(g3);
            e1 e1Var = (e1) g3;
            e1Var.f7207c.h(0.0f);
            e1Var.f7209e.h(1.0f);
            e1Var.f7208d.g(0L);
            e1Var.f7207c.h(0.0f);
            e1Var.f7206b.setValue(Boolean.FALSE);
            e1Var.f7213j = -1L;
            e1Var.f7214k = -1L;
            m0.e1 e1Var2 = this.f7251j;
            e1Var2.h(e1Var2.g() + 1);
            synchronized (w0.m.f7537c) {
                o.k0 k0Var = w0.m.f7543j.f7505h;
                if (k0Var != null) {
                    if (k0Var.h()) {
                        z3 = true;
                    }
                }
            }
            if (z3) {
                w0.m.a();
            }
        }
    }

    @Override // androidx.datastore.preferences.protobuf.j
    public final void e() {
        this.f7248f = true;
    }

    @Override // androidx.datastore.preferences.protobuf.j
    public final l1 f(l1 l1Var, List list) {
        int size = list.size();
        for (int i = 0; i < size; i++) {
            q3.u0 u0Var = (q3.u0) list.get(i);
            c1 c1Var = (c1) androidx.compose.ui.layout.b.f563c.b(u0Var.f6160a.d());
            if (c1Var != null) {
                Object g3 = this.i.g(c1Var);
                q6.i.b(g3);
                e1 e1Var = (e1) g3;
                if (((Boolean) e1Var.f7206b.getValue()).booleanValue()) {
                    q3.t0 t0Var = u0Var.f6160a;
                    e1Var.f7207c.h(t0Var.c());
                    e1Var.f7209e.h(t0Var.a());
                    e1Var.f7208d.g(t0Var.b());
                }
            }
        }
        E(l1Var);
        return l1Var;
    }

    @Override // androidx.datastore.preferences.protobuf.j
    public final a0.a0 g(q3.u0 u0Var, a0.a0 a0Var) {
        l1 l1Var = this.f7250h;
        boolean z3 = false;
        this.f7248f = false;
        this.f7250h = null;
        if (u0Var.f6160a.b() > 0 && l1Var != null) {
            int d8 = u0Var.f6160a.d();
            this.f7249g |= d8;
            c1 c1Var = (c1) androidx.compose.ui.layout.b.f563c.b(d8);
            if (c1Var != null) {
                Object g3 = this.i.g(c1Var);
                q6.i.b(g3);
                e1 e1Var = (e1) g3;
                i3.c f6 = l1Var.f6127a.f(d8);
                long j7 = (f6.f3421a << 48) | (f6.f3422b << 32) | (f6.f3423c << 16) | f6.f3424d;
                long j8 = e1Var.f7212h;
                if (!s0.f(j7, j8)) {
                    e1Var.f7213j = j8;
                    e1Var.f7214k = j7;
                    e1Var.f7206b.setValue(Boolean.TRUE);
                    q3.t0 t0Var = u0Var.f6160a;
                    e1Var.f7207c.h(t0Var.c());
                    e1Var.f7209e.h(t0Var.a());
                    e1Var.f7208d.g(t0Var.b());
                    m0.e1 e1Var2 = this.f7251j;
                    e1Var2.h(e1Var2.g() + 1);
                    synchronized (w0.m.f7537c) {
                        o.k0 k0Var = w0.m.f7543j.f7505h;
                        if (k0Var != null) {
                            if (k0Var.h()) {
                                z3 = true;
                            }
                        }
                    }
                    if (z3) {
                        w0.m.a();
                        return a0Var;
                    }
                }
            }
        }
        return a0Var;
    }

    @Override // q3.p
    public final l1 k(View view, l1 l1Var) {
        if (this.f7248f) {
            this.f7250h = l1Var;
            if (Build.VERSION.SDK_INT == 30) {
                view.post(this);
                return l1Var;
            }
        } else if (this.f7249g == 0) {
            E(l1Var);
        }
        return l1Var;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        Object parent = view.getParent();
        View view2 = parent instanceof View ? (View) parent : null;
        if (view2 != null) {
            view = view2;
        }
        Field field = q3.k0.f6120a;
        q3.c0.i(view, this);
        q3.k0.m(view, this);
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        Object parent = view.getParent();
        View view2 = parent instanceof View ? (View) parent : null;
        if (view2 != null) {
            view = view2;
        }
        Field field = q3.k0.f6120a;
        q3.c0.i(view, null);
        q3.k0.m(view, null);
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.f7248f) {
            this.f7249g = 0;
            this.f7248f = false;
            l1 l1Var = this.f7250h;
            if (l1Var != null) {
                E(l1Var);
                this.f7250h = null;
            }
        }
    }
}
