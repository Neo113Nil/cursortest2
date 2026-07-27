package m;

import G.C0192d;
import G.C0205j0;
import a.AbstractC0345a;
import android.content.Context;
import android.os.Build;
import android.widget.EdgeEffect;
import kotlin.Unit;
import o.C0905p0;
import o.C0908r0;
import y2.AbstractC1343r;

/* renamed from: m.m, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0840m implements i0 {

    /* renamed from: d, reason: collision with root package name */
    public Y.c f8137d;

    /* renamed from: e, reason: collision with root package name */
    public final E f8138e;

    /* renamed from: i, reason: collision with root package name */
    public final C0205j0 f8139i;

    /* renamed from: j, reason: collision with root package name */
    public final boolean f8140j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f8141k;

    /* renamed from: l, reason: collision with root package name */
    public long f8142l;

    /* renamed from: m, reason: collision with root package name */
    public l0.r f8143m;

    /* renamed from: n, reason: collision with root package name */
    public final S.o f8144n;

    public C0840m(Context context, g0 g0Var) {
        E e4 = new E(context, Z.K.D(g0Var.f8118a));
        this.f8138e = e4;
        Unit unit = Unit.f7487a;
        this.f8139i = C0192d.K(unit, G.W.f2776i);
        this.f8140j = true;
        this.f8142l = 0L;
        this.f8144n = l0.w.a(S.l.f3977a, unit, new C0839l(this, null)).h(Build.VERSION.SDK_INT >= 31 ? new D(this, e4) : new D(this, e4, g0Var));
    }

    public final void a() {
        boolean z4;
        E e4 = this.f8138e;
        EdgeEffect edgeEffect = e4.f8008d;
        if (edgeEffect != null) {
            edgeEffect.onRelease();
            z4 = edgeEffect.isFinished();
        } else {
            z4 = false;
        }
        EdgeEffect edgeEffect2 = e4.f8009e;
        if (edgeEffect2 != null) {
            edgeEffect2.onRelease();
            z4 = edgeEffect2.isFinished() || z4;
        }
        EdgeEffect edgeEffect3 = e4.f8010f;
        if (edgeEffect3 != null) {
            edgeEffect3.onRelease();
            z4 = edgeEffect3.isFinished() || z4;
        }
        EdgeEffect edgeEffect4 = e4.f8011g;
        if (edgeEffect4 != null) {
            edgeEffect4.onRelease();
            z4 = edgeEffect4.isFinished() || z4;
        }
        if (z4) {
            g();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0176  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x01c2  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x020b  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x01e0  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0194  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0029  */
    @Override // m.i0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(long j4, C0905p0 c0905p0, C2.a aVar) {
        C0837j c0837j;
        int i2;
        float f4;
        float f5;
        long d4;
        C0840m c0840m;
        long d5;
        float b4;
        if (aVar instanceof C0837j) {
            c0837j = (C0837j) aVar;
            int i4 = c0837j.f8129n;
            if ((i4 & Integer.MIN_VALUE) != 0) {
                c0837j.f8129n = i4 - Integer.MIN_VALUE;
                Object obj = c0837j.f8127l;
                D2.a aVar2 = D2.a.f2163d;
                i2 = c0837j.f8129n;
                if (i2 == 0) {
                    if (i2 == 1) {
                        AbstractC1343r.b(obj);
                        return Unit.f7487a;
                    }
                    if (i2 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    d4 = c0837j.f8126k;
                    c0840m = c0837j.f8125j;
                    AbstractC1343r.b(obj);
                    d5 = M0.o.d(d4, ((M0.o) obj).f3563a);
                    c0840m.f8141k = false;
                    b4 = M0.o.b(d5);
                    E e4 = c0840m.f8138e;
                    if (b4 <= 0.0f) {
                        EdgeEffect c4 = e4.c();
                        int a4 = O2.c.a(M0.o.b(d5));
                        if (Build.VERSION.SDK_INT >= 31) {
                            c4.onAbsorb(a4);
                        } else if (c4.isFinished()) {
                            c4.onAbsorb(a4);
                        }
                    } else if (M0.o.b(d5) < 0.0f) {
                        EdgeEffect d6 = e4.d();
                        int i5 = -O2.c.a(M0.o.b(d5));
                        if (Build.VERSION.SDK_INT >= 31) {
                            d6.onAbsorb(i5);
                        } else if (d6.isFinished()) {
                            d6.onAbsorb(i5);
                        }
                    }
                    if (M0.o.c(d5) <= 0.0f) {
                        EdgeEffect e5 = e4.e();
                        int a5 = O2.c.a(M0.o.c(d5));
                        if (Build.VERSION.SDK_INT >= 31) {
                            e5.onAbsorb(a5);
                        } else if (e5.isFinished()) {
                            e5.onAbsorb(a5);
                        }
                    } else if (M0.o.c(d5) < 0.0f) {
                        EdgeEffect b5 = e4.b();
                        int i6 = -O2.c.a(M0.o.c(d5));
                        if (Build.VERSION.SDK_INT >= 31) {
                            b5.onAbsorb(i6);
                        } else if (b5.isFinished()) {
                            b5.onAbsorb(i6);
                        }
                    }
                    if (d5 != 0) {
                        c0840m.g();
                    }
                    c0840m.a();
                    return Unit.f7487a;
                }
                AbstractC1343r.b(obj);
                if (Y.f.e(this.f8142l)) {
                    c0837j.f8129n = 1;
                    c0905p0.getClass();
                    C0905p0 c0905p02 = new C0905p0(c0905p0.f8853n, c0837j);
                    c0905p02.f8852m = j4;
                    if (c0905p02.l(Unit.f7487a) == aVar2) {
                        return aVar2;
                    }
                    return Unit.f7487a;
                }
                float b6 = M0.o.b(j4);
                E e6 = this.f8138e;
                if (b6 > 0.0f && E.g(e6.f8010f)) {
                    EdgeEffect c5 = e6.c();
                    int a6 = O2.c.a(M0.o.b(j4));
                    if (Build.VERSION.SDK_INT >= 31) {
                        c5.onAbsorb(a6);
                    } else if (c5.isFinished()) {
                        c5.onAbsorb(a6);
                    }
                    f4 = M0.o.b(j4);
                } else if (M0.o.b(j4) >= 0.0f || !E.g(e6.f8011g)) {
                    f4 = 0.0f;
                } else {
                    EdgeEffect d7 = e6.d();
                    int i7 = -O2.c.a(M0.o.b(j4));
                    if (Build.VERSION.SDK_INT >= 31) {
                        d7.onAbsorb(i7);
                    } else if (d7.isFinished()) {
                        d7.onAbsorb(i7);
                    }
                    f4 = M0.o.b(j4);
                }
                if (M0.o.c(j4) > 0.0f && E.g(e6.f8008d)) {
                    EdgeEffect e7 = e6.e();
                    int a7 = O2.c.a(M0.o.c(j4));
                    if (Build.VERSION.SDK_INT >= 31) {
                        e7.onAbsorb(a7);
                    } else if (e7.isFinished()) {
                        e7.onAbsorb(a7);
                    }
                    f5 = M0.o.c(j4);
                } else if (M0.o.c(j4) >= 0.0f || !E.g(e6.f8009e)) {
                    f5 = 0.0f;
                } else {
                    EdgeEffect b7 = e6.b();
                    int i8 = -O2.c.a(M0.o.c(j4));
                    if (Build.VERSION.SDK_INT >= 31) {
                        b7.onAbsorb(i8);
                    } else if (b7.isFinished()) {
                        b7.onAbsorb(i8);
                    }
                    f5 = M0.o.c(j4);
                }
                long k4 = M1.a.k(f4, f5);
                if (k4 != 0) {
                    g();
                }
                d4 = M0.o.d(j4, k4);
                c0837j.f8125j = this;
                c0837j.f8126k = d4;
                c0837j.f8129n = 2;
                c0905p0.getClass();
                C0905p0 c0905p03 = new C0905p0(c0905p0.f8853n, c0837j);
                c0905p03.f8852m = d4;
                obj = c0905p03.l(Unit.f7487a);
                if (obj == aVar2) {
                    return aVar2;
                }
                c0840m = this;
                d5 = M0.o.d(d4, ((M0.o) obj).f3563a);
                c0840m.f8141k = false;
                b4 = M0.o.b(d5);
                E e42 = c0840m.f8138e;
                if (b4 <= 0.0f) {
                }
                if (M0.o.c(d5) <= 0.0f) {
                }
                if (d5 != 0) {
                }
                c0840m.a();
                return Unit.f7487a;
            }
        }
        c0837j = new C0837j(this, (E2.c) aVar);
        Object obj2 = c0837j.f8127l;
        D2.a aVar22 = D2.a.f2163d;
        i2 = c0837j.f8129n;
        if (i2 == 0) {
        }
    }

    public final long c() {
        Y.c cVar = this.f8137d;
        long e02 = cVar != null ? cVar.f4372a : u3.l.e0(this.f8142l);
        return AbstractC0345a.c(Y.c.d(e02) / Y.f.d(this.f8142l), Y.c.e(e02) / Y.f.b(this.f8142l));
    }

    @Override // m.i0
    public final S.o d() {
        return this.f8144n;
    }

    @Override // m.i0
    public final boolean e() {
        E e4 = this.f8138e;
        EdgeEffect edgeEffect = e4.f8008d;
        C0841n c0841n = C0841n.f8146a;
        if (edgeEffect != null) {
            if ((Build.VERSION.SDK_INT >= 31 ? c0841n.b(edgeEffect) : 0.0f) != 0.0f) {
                return true;
            }
        }
        EdgeEffect edgeEffect2 = e4.f8009e;
        if (edgeEffect2 != null) {
            if ((Build.VERSION.SDK_INT >= 31 ? c0841n.b(edgeEffect2) : 0.0f) != 0.0f) {
                return true;
            }
        }
        EdgeEffect edgeEffect3 = e4.f8010f;
        if (edgeEffect3 != null) {
            if ((Build.VERSION.SDK_INT >= 31 ? c0841n.b(edgeEffect3) : 0.0f) != 0.0f) {
                return true;
            }
        }
        EdgeEffect edgeEffect4 = e4.f8011g;
        if (edgeEffect4 != null) {
            return (Build.VERSION.SDK_INT >= 31 ? c0841n.b(edgeEffect4) : 0.0f) != 0.0f;
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x0259  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x013a  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x010f  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0135  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0149 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0156  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0193  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x01a7  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x01bc  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x01d5  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x01e9  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x01fe  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0217  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x022b  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0240  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0253 A[ADDED_TO_REGION] */
    @Override // m.i0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final long f(long j4, int i2, A.g0 g0Var) {
        float h4;
        float j5;
        long c4;
        boolean z4;
        boolean z5;
        EdgeEffect b4;
        EdgeEffect e4;
        EdgeEffect d4;
        boolean z6;
        boolean z7;
        if (Y.f.e(this.f8142l)) {
            g0Var.getClass();
            C0908r0 c0908r0 = (C0908r0) g0Var.f144e;
            return new Y.c(C0908r0.a(c0908r0, c0908r0.f8872h, j4, c0908r0.f8871g)).f4372a;
        }
        boolean z8 = this.f8141k;
        boolean z9 = true;
        E e5 = this.f8138e;
        if (!z8) {
            if (E.g(e5.f8010f)) {
                i(0L);
            }
            if (E.g(e5.f8011g)) {
                j(0L);
            }
            if (E.g(e5.f8008d)) {
                k(0L);
            }
            if (E.g(e5.f8009e)) {
                h(0L);
            }
            this.f8141k = true;
        }
        if (Y.c.e(j4) != 0.0f) {
            if (E.g(e5.f8008d)) {
                h4 = k(j4);
                if (!E.g(e5.f8008d)) {
                    e5.e().onRelease();
                }
            } else if (E.g(e5.f8009e)) {
                h4 = h(j4);
                if (!E.g(e5.f8009e)) {
                    e5.b().onRelease();
                }
            }
            if (Y.c.d(j4) != 0.0f) {
                if (E.g(e5.f8010f)) {
                    j5 = i(j4);
                    if (!E.g(e5.f8010f)) {
                        e5.c().onRelease();
                    }
                } else if (E.g(e5.f8011g)) {
                    j5 = j(j4);
                    if (!E.g(e5.f8011g)) {
                        e5.d().onRelease();
                    }
                }
                c4 = AbstractC0345a.c(j5, h4);
                if (!Y.c.b(c4, 0L)) {
                    g();
                }
                long g4 = Y.c.g(j4, c4);
                g0Var.getClass();
                C0908r0 c0908r02 = (C0908r0) g0Var.f144e;
                long j6 = new Y.c(C0908r0.a(c0908r02, c0908r02.f8872h, g4, c0908r02.f8871g)).f4372a;
                long g5 = Y.c.g(g4, j6);
                if (i2 == 1) {
                    if (Y.c.d(g5) > 0.5f) {
                        i(g5);
                    } else {
                        if (Y.c.d(g5) >= -0.5f) {
                            z6 = false;
                            if (Y.c.e(g5) <= 0.5f) {
                                k(g5);
                            } else if (Y.c.e(g5) < -0.5f) {
                                h(g5);
                            } else {
                                z7 = false;
                                if (!z6 || z7) {
                                    z4 = true;
                                    if (E.f(e5.f8010f) || Y.c.d(j4) >= 0.0f) {
                                        z5 = false;
                                    } else {
                                        EdgeEffect c5 = e5.c();
                                        float d5 = Y.c.d(j4);
                                        if (c5 instanceof N) {
                                            N n2 = (N) c5;
                                            float f4 = n2.f8036b + d5;
                                            n2.f8036b = f4;
                                            if (Math.abs(f4) > n2.f8035a) {
                                                n2.onRelease();
                                            }
                                        } else {
                                            c5.onRelease();
                                        }
                                        z5 = !E.f(e5.f8010f);
                                    }
                                    if (E.f(e5.f8011g) && Y.c.d(j4) > 0.0f) {
                                        d4 = e5.d();
                                        float d6 = Y.c.d(j4);
                                        if (d4 instanceof N) {
                                            d4.onRelease();
                                        } else {
                                            N n4 = (N) d4;
                                            float f5 = n4.f8036b + d6;
                                            n4.f8036b = f5;
                                            if (Math.abs(f5) > n4.f8035a) {
                                                n4.onRelease();
                                            }
                                        }
                                        z5 = (z5 && E.f(e5.f8011g)) ? false : true;
                                    }
                                    if (E.f(e5.f8008d) && Y.c.e(j4) < 0.0f) {
                                        e4 = e5.e();
                                        float e6 = Y.c.e(j4);
                                        if (e4 instanceof N) {
                                            e4.onRelease();
                                        } else {
                                            N n5 = (N) e4;
                                            float f6 = n5.f8036b + e6;
                                            n5.f8036b = f6;
                                            if (Math.abs(f6) > n5.f8035a) {
                                                n5.onRelease();
                                            }
                                        }
                                        z5 = (z5 && E.f(e5.f8008d)) ? false : true;
                                    }
                                    if (E.f(e5.f8009e) && Y.c.e(j4) > 0.0f) {
                                        b4 = e5.b();
                                        float e7 = Y.c.e(j4);
                                        if (b4 instanceof N) {
                                            b4.onRelease();
                                        } else {
                                            N n6 = (N) b4;
                                            float f7 = n6.f8036b + e7;
                                            n6.f8036b = f7;
                                            if (Math.abs(f7) > n6.f8035a) {
                                                n6.onRelease();
                                            }
                                        }
                                        z5 = (z5 && E.f(e5.f8009e)) ? false : true;
                                    }
                                    if (!z5 && !z4) {
                                        z9 = false;
                                    }
                                    if (z9) {
                                        g();
                                    }
                                    return Y.c.h(c4, j6);
                                }
                            }
                            z7 = true;
                            if (!z6) {
                            }
                            z4 = true;
                            if (E.f(e5.f8010f)) {
                            }
                            z5 = false;
                            if (E.f(e5.f8011g)) {
                                d4 = e5.d();
                                float d62 = Y.c.d(j4);
                                if (d4 instanceof N) {
                                }
                                if (z5) {
                                }
                            }
                            if (E.f(e5.f8008d)) {
                                e4 = e5.e();
                                float e62 = Y.c.e(j4);
                                if (e4 instanceof N) {
                                }
                                if (z5) {
                                }
                            }
                            if (E.f(e5.f8009e)) {
                                b4 = e5.b();
                                float e72 = Y.c.e(j4);
                                if (b4 instanceof N) {
                                }
                                if (z5) {
                                }
                            }
                            if (!z5) {
                                z9 = false;
                            }
                            if (z9) {
                            }
                            return Y.c.h(c4, j6);
                        }
                        j(g5);
                    }
                    z6 = true;
                    if (Y.c.e(g5) <= 0.5f) {
                    }
                    z7 = true;
                    if (!z6) {
                    }
                    z4 = true;
                    if (E.f(e5.f8010f)) {
                    }
                    z5 = false;
                    if (E.f(e5.f8011g)) {
                    }
                    if (E.f(e5.f8008d)) {
                    }
                    if (E.f(e5.f8009e)) {
                    }
                    if (!z5) {
                    }
                    if (z9) {
                    }
                    return Y.c.h(c4, j6);
                }
                z4 = false;
                if (E.f(e5.f8010f)) {
                }
                z5 = false;
                if (E.f(e5.f8011g)) {
                }
                if (E.f(e5.f8008d)) {
                }
                if (E.f(e5.f8009e)) {
                }
                if (!z5) {
                }
                if (z9) {
                }
                return Y.c.h(c4, j6);
            }
            j5 = 0.0f;
            c4 = AbstractC0345a.c(j5, h4);
            if (!Y.c.b(c4, 0L)) {
            }
            long g42 = Y.c.g(j4, c4);
            g0Var.getClass();
            C0908r0 c0908r022 = (C0908r0) g0Var.f144e;
            long j62 = new Y.c(C0908r0.a(c0908r022, c0908r022.f8872h, g42, c0908r022.f8871g)).f4372a;
            long g52 = Y.c.g(g42, j62);
            if (i2 == 1) {
            }
            z4 = false;
            if (E.f(e5.f8010f)) {
            }
            z5 = false;
            if (E.f(e5.f8011g)) {
            }
            if (E.f(e5.f8008d)) {
            }
            if (E.f(e5.f8009e)) {
            }
            if (!z5) {
            }
            if (z9) {
            }
            return Y.c.h(c4, j62);
        }
        h4 = 0.0f;
        if (Y.c.d(j4) != 0.0f) {
        }
        j5 = 0.0f;
        c4 = AbstractC0345a.c(j5, h4);
        if (!Y.c.b(c4, 0L)) {
        }
        long g422 = Y.c.g(j4, c4);
        g0Var.getClass();
        C0908r0 c0908r0222 = (C0908r0) g0Var.f144e;
        long j622 = new Y.c(C0908r0.a(c0908r0222, c0908r0222.f8872h, g422, c0908r0222.f8871g)).f4372a;
        long g522 = Y.c.g(g422, j622);
        if (i2 == 1) {
        }
        z4 = false;
        if (E.f(e5.f8010f)) {
        }
        z5 = false;
        if (E.f(e5.f8011g)) {
        }
        if (E.f(e5.f8008d)) {
        }
        if (E.f(e5.f8009e)) {
        }
        if (!z5) {
        }
        if (z9) {
        }
        return Y.c.h(c4, j622);
    }

    public final void g() {
        if (this.f8140j) {
            this.f8139i.setValue(Unit.f7487a);
        }
    }

    public final float h(long j4) {
        float d4 = Y.c.d(c());
        float e4 = Y.c.e(j4) / Y.f.b(this.f8142l);
        EdgeEffect b4 = this.f8138e.b();
        float f4 = -e4;
        float f5 = 1 - d4;
        int i2 = Build.VERSION.SDK_INT;
        C0841n c0841n = C0841n.f8146a;
        if (i2 >= 31) {
            f4 = c0841n.c(b4, f4, f5);
        } else {
            b4.onPull(f4, f5);
        }
        return (i2 >= 31 ? c0841n.b(b4) : 0.0f) == 0.0f ? Y.f.b(this.f8142l) * (-f4) : Y.c.e(j4);
    }

    public final float i(long j4) {
        float e4 = Y.c.e(c());
        float d4 = Y.c.d(j4) / Y.f.d(this.f8142l);
        EdgeEffect c4 = this.f8138e.c();
        float f4 = 1 - e4;
        int i2 = Build.VERSION.SDK_INT;
        C0841n c0841n = C0841n.f8146a;
        if (i2 >= 31) {
            d4 = c0841n.c(c4, d4, f4);
        } else {
            c4.onPull(d4, f4);
        }
        return (i2 >= 31 ? c0841n.b(c4) : 0.0f) == 0.0f ? Y.f.d(this.f8142l) * d4 : Y.c.d(j4);
    }

    public final float j(long j4) {
        float e4 = Y.c.e(c());
        float d4 = Y.c.d(j4) / Y.f.d(this.f8142l);
        EdgeEffect d5 = this.f8138e.d();
        float f4 = -d4;
        int i2 = Build.VERSION.SDK_INT;
        C0841n c0841n = C0841n.f8146a;
        if (i2 >= 31) {
            f4 = c0841n.c(d5, f4, e4);
        } else {
            d5.onPull(f4, e4);
        }
        return (i2 >= 31 ? c0841n.b(d5) : 0.0f) == 0.0f ? Y.f.d(this.f8142l) * (-f4) : Y.c.d(j4);
    }

    public final float k(long j4) {
        float d4 = Y.c.d(c());
        float e4 = Y.c.e(j4) / Y.f.b(this.f8142l);
        EdgeEffect e5 = this.f8138e.e();
        int i2 = Build.VERSION.SDK_INT;
        C0841n c0841n = C0841n.f8146a;
        if (i2 >= 31) {
            e4 = c0841n.c(e5, e4, d4);
        } else {
            e5.onPull(e4, d4);
        }
        return (i2 >= 31 ? c0841n.b(e5) : 0.0f) == 0.0f ? Y.f.b(this.f8142l) * e4 : Y.c.e(j4);
    }

    public final void l(long j4) {
        boolean a4 = Y.f.a(this.f8142l, 0L);
        boolean a5 = Y.f.a(j4, this.f8142l);
        this.f8142l = j4;
        if (!a5) {
            long c4 = u3.d.c(O2.c.a(Y.f.d(j4)), O2.c.a(Y.f.b(j4)));
            E e4 = this.f8138e;
            e4.f8007c = c4;
            EdgeEffect edgeEffect = e4.f8008d;
            if (edgeEffect != null) {
                edgeEffect.setSize((int) (c4 >> 32), (int) (c4 & 4294967295L));
            }
            EdgeEffect edgeEffect2 = e4.f8009e;
            if (edgeEffect2 != null) {
                edgeEffect2.setSize((int) (c4 >> 32), (int) (c4 & 4294967295L));
            }
            EdgeEffect edgeEffect3 = e4.f8010f;
            if (edgeEffect3 != null) {
                edgeEffect3.setSize((int) (c4 & 4294967295L), (int) (c4 >> 32));
            }
            EdgeEffect edgeEffect4 = e4.f8011g;
            if (edgeEffect4 != null) {
                edgeEffect4.setSize((int) (c4 & 4294967295L), (int) (c4 >> 32));
            }
            EdgeEffect edgeEffect5 = e4.f8012h;
            if (edgeEffect5 != null) {
                edgeEffect5.setSize((int) (c4 >> 32), (int) (c4 & 4294967295L));
            }
            EdgeEffect edgeEffect6 = e4.f8013i;
            if (edgeEffect6 != null) {
                edgeEffect6.setSize((int) (c4 >> 32), (int) (c4 & 4294967295L));
            }
            EdgeEffect edgeEffect7 = e4.f8014j;
            if (edgeEffect7 != null) {
                edgeEffect7.setSize((int) (c4 & 4294967295L), (int) (c4 >> 32));
            }
            EdgeEffect edgeEffect8 = e4.f8015k;
            if (edgeEffect8 != null) {
                edgeEffect8.setSize((int) (c4 & 4294967295L), (int) (c4 >> 32));
            }
        }
        if (a4 || a5) {
            return;
        }
        g();
        a();
    }
}
