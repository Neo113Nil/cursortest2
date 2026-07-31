package com.yandex.mobile.ads.impl;

import com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor;
import com.yandex.mobile.ads.impl.s11;
import com.yandex.mobile.ads.impl.ww1;
import com.yandex.mobile.ads.impl.wz0;
import com.yandex.mobile.ads.impl.yb0;
import com.yandex.mobile.ads.impl.yh0;
import io.appmetrica.analytics.coreutils.internal.io.Base64Utils;
import java.io.EOFException;

/* loaded from: classes3.dex */
public final class n11 implements p70 {

    /* renamed from: u, reason: collision with root package name */
    private static final yh0.a f29329u;

    /* renamed from: a, reason: collision with root package name */
    private final int f29330a;

    /* renamed from: b, reason: collision with root package name */
    private final long f29331b;

    /* renamed from: c, reason: collision with root package name */
    private final sf1 f29332c;

    /* renamed from: d, reason: collision with root package name */
    private final s11.a f29333d;

    /* renamed from: e, reason: collision with root package name */
    private final xd0 f29334e;

    /* renamed from: f, reason: collision with root package name */
    private final ai0 f29335f;

    /* renamed from: g, reason: collision with root package name */
    private final g40 f29336g;

    /* renamed from: h, reason: collision with root package name */
    private r70 f29337h;

    /* renamed from: i, reason: collision with root package name */
    private p52 f29338i;

    /* renamed from: j, reason: collision with root package name */
    private p52 f29339j;

    /* renamed from: k, reason: collision with root package name */
    private int f29340k;

    /* renamed from: l, reason: collision with root package name */
    private wz0 f29341l;

    /* renamed from: m, reason: collision with root package name */
    private long f29342m;

    /* renamed from: n, reason: collision with root package name */
    private long f29343n;

    /* renamed from: o, reason: collision with root package name */
    private long f29344o;

    /* renamed from: p, reason: collision with root package name */
    private int f29345p;

    /* renamed from: q, reason: collision with root package name */
    private ww1 f29346q;

    /* renamed from: r, reason: collision with root package name */
    private boolean f29347r;

    /* renamed from: s, reason: collision with root package name */
    private boolean f29348s;

    /* renamed from: t, reason: collision with root package name */
    private long f29349t;

    static {
        new t70() { // from class: com.yandex.mobile.ads.impl.Ea
            @Override // com.yandex.mobile.ads.impl.t70
            public final p70[] a() {
                p70[] b4;
                b4 = n11.b();
                return b4;
            }
        };
        f29329u = new yh0.a() { // from class: com.yandex.mobile.ads.impl.Fa
            @Override // com.yandex.mobile.ads.impl.yh0.a
            public final boolean a(int i4, int i5, int i6, int i7, int i8) {
                boolean a4;
                a4 = n11.a(i4, i5, i6, i7, i8);
                return a4;
            }
        };
    }

    public n11() {
        this(0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ boolean a(int i4, int i5, int i6, int i7, int i8) {
        if (i5 == 67 && i6 == 79 && i7 == 77 && (i8 == 77 || i4 == 2)) {
            return true;
        }
        if (i5 == 77 && i6 == 76 && i7 == 76) {
            return i8 == 84 || i4 == 2;
        }
        return false;
    }

    @Override // com.yandex.mobile.ads.impl.p70
    public final void release() {
    }

    public n11(int i4) {
        this((Object) null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ p70[] b() {
        return new p70[]{new n11()};
    }

    public final void a() {
        this.f29347r = true;
    }

    public n11(Object obj) {
        this.f29330a = 0;
        this.f29331b = -9223372036854775807L;
        this.f29332c = new sf1(10);
        this.f29333d = new s11.a();
        this.f29334e = new xd0();
        this.f29342m = -9223372036854775807L;
        this.f29335f = new ai0();
        g40 g40Var = new g40();
        this.f29336g = g40Var;
        this.f29339j = g40Var;
    }

    @Override // com.yandex.mobile.ads.impl.p70
    public final void a(r70 r70Var) {
        this.f29337h = r70Var;
        p52 a4 = r70Var.a(0, 1);
        this.f29338i = a4;
        this.f29339j = a4;
        this.f29337h.a();
    }

    private boolean a(lz lzVar) {
        ww1 ww1Var = this.f29346q;
        if (ww1Var != null) {
            long a4 = ww1Var.a();
            if (a4 != -1 && lzVar.d() > a4 - 4) {
                return true;
            }
        }
        try {
            return !lzVar.b(this.f29332c.c(), 0, 4, true);
        } catch (EOFException unused) {
            return true;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:135:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x0112  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0091 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0151  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x019d  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x028a  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x03a7  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x028d  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x01a4  */
    @Override // com.yandex.mobile.ads.impl.p70
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int a(q70 q70Var, hj1 hj1Var) {
        long j4;
        int i4;
        long j5;
        long j6;
        int i5;
        int i6;
        lz lzVar;
        ww1 a4;
        ww1 ww1Var;
        wz0 wz0Var;
        ww1 ww1Var2;
        ww1 krVar;
        long j7;
        long j8;
        if (this.f29338i != null) {
            int i7 = u82.f32873a;
            int i8 = 0;
            if (this.f29340k == 0) {
                try {
                    a((lz) q70Var, false);
                } catch (EOFException unused) {
                    j4 = 1000000;
                }
            }
            if (this.f29346q == null) {
                sf1 sf1Var = new sf1(this.f29333d.f31531c);
                lz lzVar2 = (lz) q70Var;
                lzVar2.b(sf1Var.c(), 0, this.f29333d.f31531c, false);
                s11.a aVar = this.f29333d;
                j4 = 1000000;
                if ((aVar.f31529a & 1) != 0) {
                    if (aVar.f31533e != 1) {
                        i5 = 36;
                        j6 = -9223372036854775807L;
                        i4 = 1;
                        if (sf1Var.e() >= i5 + 4) {
                            sf1Var.e(i5);
                            int h4 = sf1Var.h();
                            if (h4 == 1483304551 || h4 == 1231971951) {
                                i6 = h4;
                                if (i6 != 1483304551 || i6 == 1231971951) {
                                    lzVar = lzVar2;
                                    a4 = rk2.a(lzVar.b(), lzVar.a(), this.f29333d, sf1Var);
                                    if (a4 != null) {
                                        xd0 xd0Var = this.f29334e;
                                        if (xd0Var.f34517a == -1 || xd0Var.f34518b == -1) {
                                            lzVar.c();
                                            lzVar.a(false, i5 + ModuleDescriptor.MODULE_VERSION);
                                            lzVar.b(this.f29332c.c(), 0, 3, false);
                                            this.f29332c.e(0);
                                            xd0 xd0Var2 = this.f29334e;
                                            int w4 = this.f29332c.w();
                                            xd0Var2.getClass();
                                            int i9 = w4 >> 12;
                                            int i10 = w4 & 4095;
                                            if (i9 > 0 || i10 > 0) {
                                                xd0Var2.f34517a = i9;
                                                xd0Var2.f34518b = i10;
                                            }
                                        }
                                    }
                                    lzVar.a(this.f29333d.f31531c);
                                    if (a4 != null && !a4.b() && i6 == 1231971951) {
                                        lzVar.b(this.f29332c.c(), 0, 4, false);
                                        this.f29332c.e(0);
                                        this.f29333d.a(this.f29332c.h());
                                        a4 = new kr(lzVar.b(), lzVar.a(), this.f29333d, false);
                                    }
                                    ww1Var = a4;
                                } else if (i6 == 1447187017) {
                                    lzVar = lzVar2;
                                    ww1Var = ka2.a(lzVar2.b(), lzVar2.a(), this.f29333d, sf1Var);
                                    lzVar.a(this.f29333d.f31531c);
                                } else {
                                    lzVar = lzVar2;
                                    lzVar.c();
                                    ww1Var = null;
                                }
                                wz0Var = this.f29341l;
                                long a5 = lzVar.a();
                                if (wz0Var != null) {
                                    int c4 = wz0Var.c();
                                    for (int i11 = 0; i11 < c4; i11++) {
                                        wz0.b a6 = wz0Var.a(i11);
                                        j5 = 0;
                                        if (a6 instanceof k01) {
                                            k01 k01Var = (k01) a6;
                                            int c5 = wz0Var.c();
                                            int i12 = 0;
                                            while (true) {
                                                if (i12 >= c5) {
                                                    j8 = -9223372036854775807L;
                                                    break;
                                                }
                                                wz0.b a7 = wz0Var.a(i12);
                                                if (a7 instanceof h42) {
                                                    h42 h42Var = (h42) a7;
                                                    if (h42Var.f35592b.equals("TLEN")) {
                                                        j8 = u82.a(Long.parseLong(h42Var.f26553d));
                                                        break;
                                                    }
                                                }
                                                i12++;
                                            }
                                            ww1Var2 = l01.a(a5, k01Var, j8);
                                            if (this.f29347r) {
                                                krVar = new ww1.a();
                                            } else {
                                                if ((this.f29330a & 4) != 0) {
                                                    long j9 = -1;
                                                    if (ww1Var2 != null) {
                                                        j7 = ww1Var2.c();
                                                    } else if (ww1Var != null) {
                                                        j7 = ww1Var.c();
                                                        j9 = ww1Var.a();
                                                    } else {
                                                        wz0 wz0Var2 = this.f29341l;
                                                        if (wz0Var2 != null) {
                                                            int c6 = wz0Var2.c();
                                                            for (int i13 = 0; i13 < c6; i13++) {
                                                                wz0.b a8 = wz0Var2.a(i13);
                                                                if (a8 instanceof h42) {
                                                                    h42 h42Var2 = (h42) a8;
                                                                    if (h42Var2.f35592b.equals("TLEN")) {
                                                                        j7 = u82.a(Long.parseLong(h42Var2.f26553d));
                                                                        break;
                                                                    }
                                                                }
                                                            }
                                                        }
                                                        j7 = -9223372036854775807L;
                                                    }
                                                    ww1Var = new ik0(j7, lzVar.a(), j9);
                                                } else if (ww1Var2 != null) {
                                                    ww1Var = ww1Var2;
                                                } else if (ww1Var == null) {
                                                    ww1Var = null;
                                                }
                                                if (ww1Var == null || !(ww1Var.b() || (this.f29330a & 1) == 0)) {
                                                    boolean z4 = (this.f29330a & 2) != 0;
                                                    lzVar.b(this.f29332c.c(), 0, 4, false);
                                                    this.f29332c.e(0);
                                                    this.f29333d.a(this.f29332c.h());
                                                    krVar = new kr(lzVar.b(), lzVar.a(), this.f29333d, z4);
                                                } else {
                                                    krVar = ww1Var;
                                                }
                                            }
                                            this.f29346q = krVar;
                                            this.f29337h.a(krVar);
                                            this.f29339j.a(new yb0.a().e(this.f29333d.f31530b).h(Base64Utils.IO_BUFFER_SIZE).c(this.f29333d.f31533e).l(this.f29333d.f31532d).d(this.f29334e.f34517a).e(this.f29334e.f34518b).a((this.f29330a & 8) != 0 ? null : this.f29341l).a());
                                            this.f29344o = lzVar.a();
                                        }
                                    }
                                }
                                j5 = 0;
                                ww1Var2 = null;
                                if (this.f29347r) {
                                }
                                this.f29346q = krVar;
                                this.f29337h.a(krVar);
                                this.f29339j.a(new yb0.a().e(this.f29333d.f31530b).h(Base64Utils.IO_BUFFER_SIZE).c(this.f29333d.f31533e).l(this.f29333d.f31532d).d(this.f29334e.f34517a).e(this.f29334e.f34518b).a((this.f29330a & 8) != 0 ? null : this.f29341l).a());
                                this.f29344o = lzVar.a();
                            }
                        }
                        if (sf1Var.e() >= 40) {
                            sf1Var.e(36);
                            if (sf1Var.h() == 1447187017) {
                                i6 = 1447187017;
                                if (i6 != 1483304551) {
                                }
                                lzVar = lzVar2;
                                a4 = rk2.a(lzVar.b(), lzVar.a(), this.f29333d, sf1Var);
                                if (a4 != null) {
                                }
                                lzVar.a(this.f29333d.f31531c);
                                if (a4 != null) {
                                    lzVar.b(this.f29332c.c(), 0, 4, false);
                                    this.f29332c.e(0);
                                    this.f29333d.a(this.f29332c.h());
                                    a4 = new kr(lzVar.b(), lzVar.a(), this.f29333d, false);
                                }
                                ww1Var = a4;
                                wz0Var = this.f29341l;
                                long a52 = lzVar.a();
                                if (wz0Var != null) {
                                }
                                j5 = 0;
                                ww1Var2 = null;
                                if (this.f29347r) {
                                }
                                this.f29346q = krVar;
                                this.f29337h.a(krVar);
                                this.f29339j.a(new yb0.a().e(this.f29333d.f31530b).h(Base64Utils.IO_BUFFER_SIZE).c(this.f29333d.f31533e).l(this.f29333d.f31532d).d(this.f29334e.f34517a).e(this.f29334e.f34518b).a((this.f29330a & 8) != 0 ? null : this.f29341l).a());
                                this.f29344o = lzVar.a();
                            }
                        }
                        i6 = 0;
                        if (i6 != 1483304551) {
                        }
                        lzVar = lzVar2;
                        a4 = rk2.a(lzVar.b(), lzVar.a(), this.f29333d, sf1Var);
                        if (a4 != null) {
                        }
                        lzVar.a(this.f29333d.f31531c);
                        if (a4 != null) {
                        }
                        ww1Var = a4;
                        wz0Var = this.f29341l;
                        long a522 = lzVar.a();
                        if (wz0Var != null) {
                        }
                        j5 = 0;
                        ww1Var2 = null;
                        if (this.f29347r) {
                        }
                        this.f29346q = krVar;
                        this.f29337h.a(krVar);
                        this.f29339j.a(new yb0.a().e(this.f29333d.f31530b).h(Base64Utils.IO_BUFFER_SIZE).c(this.f29333d.f31533e).l(this.f29333d.f31532d).d(this.f29334e.f34517a).e(this.f29334e.f34518b).a((this.f29330a & 8) != 0 ? null : this.f29341l).a());
                        this.f29344o = lzVar.a();
                    }
                    i5 = 21;
                    j6 = -9223372036854775807L;
                    i4 = 1;
                    if (sf1Var.e() >= i5 + 4) {
                    }
                    if (sf1Var.e() >= 40) {
                    }
                    i6 = 0;
                    if (i6 != 1483304551) {
                    }
                    lzVar = lzVar2;
                    a4 = rk2.a(lzVar.b(), lzVar.a(), this.f29333d, sf1Var);
                    if (a4 != null) {
                    }
                    lzVar.a(this.f29333d.f31531c);
                    if (a4 != null) {
                    }
                    ww1Var = a4;
                    wz0Var = this.f29341l;
                    long a5222 = lzVar.a();
                    if (wz0Var != null) {
                    }
                    j5 = 0;
                    ww1Var2 = null;
                    if (this.f29347r) {
                    }
                    this.f29346q = krVar;
                    this.f29337h.a(krVar);
                    this.f29339j.a(new yb0.a().e(this.f29333d.f31530b).h(Base64Utils.IO_BUFFER_SIZE).c(this.f29333d.f31533e).l(this.f29333d.f31532d).d(this.f29334e.f34517a).e(this.f29334e.f34518b).a((this.f29330a & 8) != 0 ? null : this.f29341l).a());
                    this.f29344o = lzVar.a();
                } else {
                    if (aVar.f31533e == 1) {
                        i5 = 13;
                        j6 = -9223372036854775807L;
                        i4 = 1;
                        if (sf1Var.e() >= i5 + 4) {
                        }
                        if (sf1Var.e() >= 40) {
                        }
                        i6 = 0;
                        if (i6 != 1483304551) {
                        }
                        lzVar = lzVar2;
                        a4 = rk2.a(lzVar.b(), lzVar.a(), this.f29333d, sf1Var);
                        if (a4 != null) {
                        }
                        lzVar.a(this.f29333d.f31531c);
                        if (a4 != null) {
                        }
                        ww1Var = a4;
                        wz0Var = this.f29341l;
                        long a52222 = lzVar.a();
                        if (wz0Var != null) {
                        }
                        j5 = 0;
                        ww1Var2 = null;
                        if (this.f29347r) {
                        }
                        this.f29346q = krVar;
                        this.f29337h.a(krVar);
                        this.f29339j.a(new yb0.a().e(this.f29333d.f31530b).h(Base64Utils.IO_BUFFER_SIZE).c(this.f29333d.f31533e).l(this.f29333d.f31532d).d(this.f29334e.f34517a).e(this.f29334e.f34518b).a((this.f29330a & 8) != 0 ? null : this.f29341l).a());
                        this.f29344o = lzVar.a();
                    }
                    i5 = 21;
                    j6 = -9223372036854775807L;
                    i4 = 1;
                    if (sf1Var.e() >= i5 + 4) {
                    }
                    if (sf1Var.e() >= 40) {
                    }
                    i6 = 0;
                    if (i6 != 1483304551) {
                    }
                    lzVar = lzVar2;
                    a4 = rk2.a(lzVar.b(), lzVar.a(), this.f29333d, sf1Var);
                    if (a4 != null) {
                    }
                    lzVar.a(this.f29333d.f31531c);
                    if (a4 != null) {
                    }
                    ww1Var = a4;
                    wz0Var = this.f29341l;
                    long a522222 = lzVar.a();
                    if (wz0Var != null) {
                    }
                    j5 = 0;
                    ww1Var2 = null;
                    if (this.f29347r) {
                    }
                    this.f29346q = krVar;
                    this.f29337h.a(krVar);
                    this.f29339j.a(new yb0.a().e(this.f29333d.f31530b).h(Base64Utils.IO_BUFFER_SIZE).c(this.f29333d.f31533e).l(this.f29333d.f31532d).d(this.f29334e.f34517a).e(this.f29334e.f34518b).a((this.f29330a & 8) != 0 ? null : this.f29341l).a());
                    this.f29344o = lzVar.a();
                }
                if (i8 == -1) {
                    ww1 ww1Var3 = this.f29346q;
                    if (ww1Var3 instanceof ik0) {
                        long j10 = ((this.f29343n * j4) / this.f29333d.f31532d) + this.f29342m;
                        if (ww1Var3.c() != j10) {
                            ((ik0) this.f29346q).d(j10);
                            this.f29337h.a(this.f29346q);
                        }
                    }
                }
                return i8;
            }
            i4 = 1;
            j5 = 0;
            j4 = 1000000;
            j6 = -9223372036854775807L;
            if (this.f29344o != 0) {
                lz lzVar3 = (lz) q70Var;
                long a9 = lzVar3.a();
                long j11 = this.f29344o;
                if (a9 < j11) {
                    lzVar3.a((int) (j11 - a9));
                }
            }
            if (this.f29345p == 0) {
                lz lzVar4 = (lz) q70Var;
                lzVar4.c();
                if (!a(lzVar4)) {
                    this.f29332c.e(0);
                    int h5 = this.f29332c.h();
                    if (((-128000) & h5) == (this.f29340k & (-128000)) && s11.a(h5) != -1) {
                        this.f29333d.a(h5);
                        if (this.f29342m == j6) {
                            this.f29342m = this.f29346q.a(lzVar4.a());
                            if (this.f29331b != j6) {
                                this.f29342m = (this.f29331b - this.f29346q.a(j5)) + this.f29342m;
                            }
                        }
                        this.f29345p = this.f29333d.f31531c;
                        ww1 ww1Var4 = this.f29346q;
                        if (ww1Var4 instanceof ik0) {
                            ik0 ik0Var = (ik0) ww1Var4;
                            ik0Var.a((((this.f29343n + r3.f31535g) * j4) / r3.f31532d) + this.f29342m, lzVar4.a() + this.f29333d.f31531c);
                            if (this.f29348s && ik0Var.c(this.f29349t)) {
                                this.f29348s = false;
                                this.f29339j = this.f29338i;
                            }
                        }
                    } else {
                        lzVar4.a(i4);
                        this.f29340k = 0;
                        if (i8 == -1) {
                        }
                        return i8;
                    }
                }
                i8 = -1;
                if (i8 == -1) {
                }
                return i8;
            }
            int b4 = this.f29339j.b(q70Var, this.f29345p, i4);
            if (b4 != -1) {
                int i14 = this.f29345p - b4;
                this.f29345p = i14;
                if (i14 <= 0) {
                    p52 p52Var = this.f29339j;
                    long j12 = this.f29343n;
                    p52Var.a(((j12 * j4) / r5.f31532d) + this.f29342m, 1, this.f29333d.f31531c, 0, null);
                    this.f29343n += this.f29333d.f31535g;
                    this.f29345p = 0;
                }
                if (i8 == -1) {
                }
                return i8;
            }
            i8 = -1;
            if (i8 == -1) {
            }
            return i8;
        }
        throw new IllegalStateException();
    }

    @Override // com.yandex.mobile.ads.impl.p70
    public final void a(long j4, long j5) {
        this.f29340k = 0;
        this.f29342m = -9223372036854775807L;
        this.f29343n = 0L;
        this.f29345p = 0;
        this.f29349t = j5;
        ww1 ww1Var = this.f29346q;
        if (!(ww1Var instanceof ik0) || ((ik0) ww1Var).c(j5)) {
            return;
        }
        this.f29348s = true;
        this.f29339j = this.f29336g;
    }

    @Override // com.yandex.mobile.ads.impl.p70
    public final boolean a(q70 q70Var) {
        return a((lz) q70Var, true);
    }

    /* JADX WARN: Code restructure failed: missing block: B:49:0x00a5, code lost:
    
        if (r19 == false) goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x00a7, code lost:
    
        r18.a(r3 + r8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x00af, code lost:
    
        r17.f29340k = r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x00b1, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x00ac, code lost:
    
        r18.c();
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private boolean a(lz lzVar, boolean z4) {
        int i4;
        int i5;
        int a4;
        int i6 = z4 ? 32768 : 131072;
        lzVar.c();
        if (lzVar.a() == 0) {
            wz0 a5 = this.f29335f.a(lzVar, (this.f29330a & 8) == 0 ? null : f29329u);
            this.f29341l = a5;
            if (a5 != null) {
                this.f29334e.a(a5);
            }
            i4 = (int) lzVar.d();
            if (!z4) {
                lzVar.a(i4);
            }
            i5 = 0;
        } else {
            i4 = 0;
            i5 = 0;
        }
        int i7 = i5;
        int i8 = i7;
        while (true) {
            if (!a(lzVar)) {
                this.f29332c.e(0);
                int h4 = this.f29332c.h();
                if ((i5 == 0 || ((-128000) & h4) == (i5 & (-128000))) && (a4 = s11.a(h4)) != -1) {
                    i7++;
                    if (i7 != 1) {
                        if (i7 == 4) {
                            break;
                        }
                    } else {
                        this.f29333d.a(h4);
                        i5 = h4;
                    }
                    lzVar.a(false, a4 - 4);
                } else {
                    int i9 = i8 + 1;
                    if (i8 == i6) {
                        if (z4) {
                            return false;
                        }
                        throw wf1.a("Searched too many bytes.", (Exception) null);
                    }
                    if (z4) {
                        lzVar.c();
                        lzVar.a(false, i4 + i9);
                    } else {
                        lzVar.a(1);
                    }
                    i7 = 0;
                    i8 = i9;
                    i5 = 0;
                }
            } else if (i7 <= 0) {
                throw new EOFException();
            }
        }
    }
}
