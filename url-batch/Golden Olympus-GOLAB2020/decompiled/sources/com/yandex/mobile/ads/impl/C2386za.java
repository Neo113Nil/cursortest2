package com.yandex.mobile.ads.impl;

import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import com.yandex.mobile.ads.impl.C1790a;
import com.yandex.mobile.ads.impl.e72;
import com.yandex.mobile.ads.impl.yb0;
import java.util.Arrays;
import java.util.Collections;

/* renamed from: com.yandex.mobile.ads.impl.za, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2386za implements q40 {

    /* renamed from: v, reason: collision with root package name */
    private static final byte[] f35515v = {73, 68, 51};

    /* renamed from: a, reason: collision with root package name */
    private final boolean f35516a;

    /* renamed from: b, reason: collision with root package name */
    private final rf1 f35517b;

    /* renamed from: c, reason: collision with root package name */
    private final sf1 f35518c;

    /* renamed from: d, reason: collision with root package name */
    private final String f35519d;

    /* renamed from: e, reason: collision with root package name */
    private String f35520e;

    /* renamed from: f, reason: collision with root package name */
    private p52 f35521f;

    /* renamed from: g, reason: collision with root package name */
    private p52 f35522g;

    /* renamed from: h, reason: collision with root package name */
    private int f35523h;

    /* renamed from: i, reason: collision with root package name */
    private int f35524i;

    /* renamed from: j, reason: collision with root package name */
    private int f35525j;

    /* renamed from: k, reason: collision with root package name */
    private boolean f35526k;

    /* renamed from: l, reason: collision with root package name */
    private boolean f35527l;

    /* renamed from: m, reason: collision with root package name */
    private int f35528m;

    /* renamed from: n, reason: collision with root package name */
    private int f35529n;

    /* renamed from: o, reason: collision with root package name */
    private int f35530o;

    /* renamed from: p, reason: collision with root package name */
    private boolean f35531p;

    /* renamed from: q, reason: collision with root package name */
    private long f35532q;

    /* renamed from: r, reason: collision with root package name */
    private int f35533r;

    /* renamed from: s, reason: collision with root package name */
    private long f35534s;

    /* renamed from: t, reason: collision with root package name */
    private p52 f35535t;

    /* renamed from: u, reason: collision with root package name */
    private long f35536u;

    public C2386za() {
        this(null, true);
    }

    private void d() {
        this.f35523h = 0;
        this.f35524i = 0;
        this.f35525j = UserVerificationMethods.USER_VERIFY_HANDPRINT;
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x02eb  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0323 A[SYNTHETIC] */
    @Override // com.yandex.mobile.ads.impl.q40
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(sf1 sf1Var) {
        int i4;
        int i5;
        int i6;
        int i7 = 7;
        int i8 = -1;
        this.f35521f.getClass();
        int i9 = u82.f32873a;
        while (sf1Var.a() > 0) {
            int i10 = this.f35523h;
            int i11 = 4;
            int i12 = 3;
            if (i10 == 0) {
                byte[] c4 = sf1Var.c();
                int d4 = sf1Var.d();
                int e4 = sf1Var.e();
                while (d4 < e4) {
                    int i13 = d4 + 1;
                    byte b4 = c4[d4];
                    int i14 = b4 & 255;
                    int i15 = i12;
                    if (this.f35525j == 512 && (((((byte) i14) & 255) | 65280) & 65526) == 65520) {
                        if (this.f35527l) {
                            i4 = i8;
                        } else {
                            int i16 = d4 - 1;
                            sf1Var.e(d4);
                            byte[] bArr = this.f35517b.f31172a;
                            if (sf1Var.a() >= 1) {
                                sf1Var.a(bArr, 0, 1);
                                this.f35517b.c(i11);
                                int b5 = this.f35517b.b(1);
                                int i17 = this.f35528m;
                                if (i17 == i8 || b5 == i17) {
                                    if (this.f35529n != i8) {
                                        byte[] bArr2 = this.f35517b.f31172a;
                                        if (sf1Var.a() < 1) {
                                            i4 = -1;
                                        } else {
                                            sf1Var.a(bArr2, 0, 1);
                                            this.f35517b.c(2);
                                            if (this.f35517b.b(i11) == this.f35529n) {
                                                sf1Var.e(i13);
                                            }
                                            i4 = -1;
                                            int i18 = this.f35525j;
                                            i5 = i18 | i14;
                                            if (i5 == 329) {
                                                i6 = 3;
                                                this.f35525j = 768;
                                            } else if (i5 == 511) {
                                                i6 = 3;
                                                this.f35525j = UserVerificationMethods.USER_VERIFY_NONE;
                                            } else if (i5 == 836) {
                                                i6 = 3;
                                                this.f35525j = 1024;
                                            } else {
                                                if (i5 == 1075) {
                                                    this.f35523h = 2;
                                                    this.f35524i = 3;
                                                    this.f35533r = 0;
                                                    this.f35518c.e(0);
                                                    sf1Var.e(i13);
                                                    i8 = i4;
                                                    break;
                                                }
                                                if (i18 != 256) {
                                                    this.f35525j = UserVerificationMethods.USER_VERIFY_HANDPRINT;
                                                    i8 = i4;
                                                    i11 = 4;
                                                    i12 = 3;
                                                } else {
                                                    i6 = 3;
                                                }
                                            }
                                            i12 = i6;
                                            i8 = i4;
                                            d4 = i13;
                                            i11 = 4;
                                        }
                                    }
                                    byte[] bArr3 = this.f35517b.f31172a;
                                    if (sf1Var.a() >= i11) {
                                        sf1Var.a(bArr3, 0, i11);
                                        this.f35517b.c(14);
                                        int b6 = this.f35517b.b(13);
                                        if (b6 >= 7) {
                                            byte[] c5 = sf1Var.c();
                                            int e5 = sf1Var.e();
                                            int i19 = i16 + b6;
                                            if (i19 < e5) {
                                                byte b7 = c5[i19];
                                                i4 = -1;
                                                if (b7 == -1) {
                                                    int i20 = i19 + 1;
                                                    if (i20 != e5) {
                                                        byte b8 = c5[i20];
                                                        if ((((b8 & 255) | 65280) & 65526) == 65520 && ((b8 & 8) >> 3) == b5) {
                                                        }
                                                        int i182 = this.f35525j;
                                                        i5 = i182 | i14;
                                                        if (i5 == 329) {
                                                        }
                                                        i12 = i6;
                                                        i8 = i4;
                                                        d4 = i13;
                                                        i11 = 4;
                                                    }
                                                } else {
                                                    if (b7 == 73) {
                                                        int i21 = i19 + 1;
                                                        if (i21 != e5) {
                                                            if (c5[i21] == 68) {
                                                                int i22 = i19 + 2;
                                                                if (i22 != e5) {
                                                                    if (c5[i22] == 51) {
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                    int i1822 = this.f35525j;
                                                    i5 = i1822 | i14;
                                                    if (i5 == 329) {
                                                    }
                                                    i12 = i6;
                                                    i8 = i4;
                                                    d4 = i13;
                                                    i11 = 4;
                                                }
                                                i8 = i4;
                                                break;
                                            }
                                        }
                                        i4 = -1;
                                        int i18222 = this.f35525j;
                                        i5 = i18222 | i14;
                                        if (i5 == 329) {
                                        }
                                        i12 = i6;
                                        i8 = i4;
                                        d4 = i13;
                                        i11 = 4;
                                    }
                                    i4 = -1;
                                }
                            }
                        }
                        this.f35530o = (b4 & 8) >> 3;
                        this.f35526k = (b4 & 1) == 0;
                        if (this.f35527l) {
                            this.f35523h = i15;
                            this.f35524i = 0;
                        } else {
                            this.f35523h = 1;
                            this.f35524i = 0;
                        }
                        sf1Var.e(i13);
                        i8 = i4;
                        break;
                    }
                    i4 = i8;
                    int i182222 = this.f35525j;
                    i5 = i182222 | i14;
                    if (i5 == 329) {
                    }
                    i12 = i6;
                    i8 = i4;
                    d4 = i13;
                    i11 = 4;
                }
                sf1Var.e(d4);
                i7 = 7;
            } else if (i10 != 1) {
                if (i10 == 2) {
                    byte[] c6 = this.f35518c.c();
                    int min = Math.min(sf1Var.a(), 10 - this.f35524i);
                    sf1Var.a(c6, this.f35524i, min);
                    int i23 = this.f35524i + min;
                    this.f35524i = i23;
                    if (i23 == 10) {
                        this.f35522g.a(10, this.f35518c);
                        this.f35518c.e(6);
                        p52 p52Var = this.f35522g;
                        int s4 = this.f35518c.s() + 10;
                        this.f35523h = 4;
                        this.f35524i = 10;
                        this.f35535t = p52Var;
                        this.f35536u = 0L;
                        this.f35533r = s4;
                    }
                } else if (i10 == 3) {
                    int i24 = this.f35526k ? i7 : 5;
                    byte[] bArr4 = this.f35517b.f31172a;
                    int min2 = Math.min(sf1Var.a(), i24 - this.f35524i);
                    sf1Var.a(bArr4, this.f35524i, min2);
                    int i25 = this.f35524i + min2;
                    this.f35524i = i25;
                    if (i25 == i24) {
                        this.f35517b.c(0);
                        if (this.f35531p) {
                            this.f35517b.d(10);
                        } else {
                            int b9 = this.f35517b.b(2) + 1;
                            if (b9 != 2) {
                                ms0.d("AdtsReader", "Detected audio object type: " + b9 + ", but assuming AAC LC.");
                                b9 = 2;
                            }
                            this.f35517b.d(5);
                            int b10 = this.f35517b.b(3);
                            int i26 = this.f35529n;
                            byte[] bArr5 = {(byte) (((b9 << 3) & 248) | ((i26 >> 1) & i7)), (byte) (((b10 << 3) & 120) | ((i26 << i7) & UserVerificationMethods.USER_VERIFY_PATTERN))};
                            C1790a.C0181a a4 = C1790a.a(new rf1(2, bArr5), false);
                            yb0 a5 = new yb0.a().b(this.f35520e).e("audio/mp4a-latm").a(a4.f23104c).c(a4.f23103b).l(a4.f23102a).a(Collections.singletonList(bArr5)).d(this.f35519d).a();
                            this.f35532q = 1024000000 / a5.f34973A;
                            this.f35521f.a(a5);
                            this.f35531p = true;
                        }
                        this.f35517b.d(4);
                        int b11 = this.f35517b.b(13);
                        int i27 = b11 - 7;
                        if (this.f35526k) {
                            i27 = b11 - 9;
                        }
                        p52 p52Var2 = this.f35521f;
                        long j4 = this.f35532q;
                        this.f35523h = 4;
                        this.f35524i = 0;
                        this.f35535t = p52Var2;
                        this.f35536u = j4;
                        this.f35533r = i27;
                    }
                } else {
                    if (i10 != 4) {
                        throw new IllegalStateException();
                    }
                    int min3 = Math.min(sf1Var.a(), this.f35533r - this.f35524i);
                    this.f35535t.a(min3, sf1Var);
                    int i28 = this.f35524i + min3;
                    this.f35524i = i28;
                    int i29 = this.f35533r;
                    if (i28 == i29) {
                        long j5 = this.f35534s;
                        if (j5 != -9223372036854775807L) {
                            this.f35535t.a(j5, 1, i29, 0, null);
                            this.f35534s += this.f35536u;
                        }
                        d();
                    }
                }
            } else if (sf1Var.a() != 0) {
                this.f35517b.f31172a[0] = sf1Var.c()[sf1Var.d()];
                this.f35517b.c(2);
                int b12 = this.f35517b.b(4);
                int i30 = this.f35529n;
                if (i30 == i8 || b12 == i30) {
                    if (!this.f35527l) {
                        this.f35527l = true;
                        this.f35528m = this.f35530o;
                        this.f35529n = b12;
                    }
                    this.f35523h = 3;
                    this.f35524i = 0;
                } else {
                    this.f35527l = false;
                    d();
                }
            }
        }
    }

    @Override // com.yandex.mobile.ads.impl.q40
    public final void b() {
    }

    public final long c() {
        return this.f35532q;
    }

    public C2386za(String str, boolean z4) {
        this.f35517b = new rf1(new byte[7]);
        this.f35518c = new sf1(Arrays.copyOf(f35515v, 10));
        d();
        this.f35528m = -1;
        this.f35529n = -1;
        this.f35532q = -9223372036854775807L;
        this.f35534s = -9223372036854775807L;
        this.f35516a = z4;
        this.f35519d = str;
    }

    @Override // com.yandex.mobile.ads.impl.q40
    public final void a(r70 r70Var, e72.d dVar) {
        dVar.a();
        this.f35520e = dVar.b();
        p52 a4 = r70Var.a(dVar.c(), 1);
        this.f35521f = a4;
        this.f35535t = a4;
        if (this.f35516a) {
            dVar.a();
            p52 a5 = r70Var.a(dVar.c(), 5);
            this.f35522g = a5;
            a5.a(new yb0.a().b(dVar.b()).e("application/id3").a());
            return;
        }
        this.f35522g = new g40();
    }

    @Override // com.yandex.mobile.ads.impl.q40
    public final void a(int i4, long j4) {
        if (j4 != -9223372036854775807L) {
            this.f35534s = j4;
        }
    }

    @Override // com.yandex.mobile.ads.impl.q40
    public final void a() {
        this.f35534s = -9223372036854775807L;
        this.f35527l = false;
        d();
    }
}
