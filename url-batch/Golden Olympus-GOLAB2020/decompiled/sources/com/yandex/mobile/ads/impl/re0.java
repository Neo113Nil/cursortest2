package com.yandex.mobile.ads.impl;

import android.util.Pair;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import com.yandex.mobile.ads.impl.e72;
import com.yandex.mobile.ads.impl.yb0;
import java.util.Arrays;
import java.util.Collections;

/* loaded from: classes3.dex */
public final class re0 implements q40 {

    /* renamed from: q, reason: collision with root package name */
    private static final double[] f31127q = {23.976023976023978d, 24.0d, 25.0d, 29.97002997002997d, 30.0d, 50.0d, 59.94005994005994d, 60.0d};

    /* renamed from: a, reason: collision with root package name */
    private String f31128a;

    /* renamed from: b, reason: collision with root package name */
    private p52 f31129b;

    /* renamed from: c, reason: collision with root package name */
    private final t82 f31130c;

    /* renamed from: d, reason: collision with root package name */
    private final sf1 f31131d;

    /* renamed from: e, reason: collision with root package name */
    private final r31 f31132e;

    /* renamed from: f, reason: collision with root package name */
    private final boolean[] f31133f = new boolean[4];

    /* renamed from: g, reason: collision with root package name */
    private final a f31134g = new a();

    /* renamed from: h, reason: collision with root package name */
    private long f31135h;

    /* renamed from: i, reason: collision with root package name */
    private boolean f31136i;

    /* renamed from: j, reason: collision with root package name */
    private boolean f31137j;

    /* renamed from: k, reason: collision with root package name */
    private long f31138k;

    /* renamed from: l, reason: collision with root package name */
    private long f31139l;

    /* renamed from: m, reason: collision with root package name */
    private long f31140m;

    /* renamed from: n, reason: collision with root package name */
    private long f31141n;

    /* renamed from: o, reason: collision with root package name */
    private boolean f31142o;

    /* renamed from: p, reason: collision with root package name */
    private boolean f31143p;

    private static final class a {

        /* renamed from: e, reason: collision with root package name */
        private static final byte[] f31144e = {0, 0, 1};

        /* renamed from: a, reason: collision with root package name */
        private boolean f31145a;

        /* renamed from: b, reason: collision with root package name */
        public int f31146b;

        /* renamed from: c, reason: collision with root package name */
        public int f31147c;

        /* renamed from: d, reason: collision with root package name */
        public byte[] f31148d = new byte[UserVerificationMethods.USER_VERIFY_PATTERN];

        public final void a(byte[] bArr, int i4, int i5) {
            if (this.f31145a) {
                int i6 = i5 - i4;
                byte[] bArr2 = this.f31148d;
                int length = bArr2.length;
                int i7 = this.f31146b + i6;
                if (length < i7) {
                    this.f31148d = Arrays.copyOf(bArr2, i7 * 2);
                }
                System.arraycopy(bArr, i4, this.f31148d, this.f31146b, i6);
                this.f31146b += i6;
            }
        }
    }

    re0(t82 t82Var) {
        this.f31130c = t82Var;
        if (t82Var != null) {
            this.f31132e = new r31(178);
            this.f31131d = new sf1();
        } else {
            this.f31132e = null;
            this.f31131d = null;
        }
        this.f31139l = -9223372036854775807L;
        this.f31141n = -9223372036854775807L;
    }

    /* JADX WARN: Removed duplicated region for block: B:48:0x01e1  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0204  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0233  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0219  */
    @Override // com.yandex.mobile.ads.impl.q40
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(sf1 sf1Var) {
        int i4;
        char c4;
        long j4;
        long j5;
        boolean z4;
        boolean z5;
        long j6;
        int i5;
        float f4;
        long j7;
        float f5;
        int i6;
        int i7 = 4;
        char c5 = 3;
        if (this.f31129b == null) {
            throw new IllegalStateException();
        }
        int d4 = sf1Var.d();
        int e4 = sf1Var.e();
        byte[] c6 = sf1Var.c();
        this.f31135h += sf1Var.a();
        this.f31129b.a(sf1Var.a(), sf1Var);
        while (true) {
            int a4 = s31.a(c6, d4, e4, this.f31133f);
            if (a4 == e4) {
                break;
            }
            int i8 = a4 + 3;
            int i9 = sf1Var.c()[i8] & 255;
            int i10 = a4 - d4;
            if (this.f31137j) {
                i4 = i7;
                c4 = c5;
            } else {
                if (i10 > 0) {
                    this.f31134g.a(c6, d4, a4);
                }
                int i11 = i10 < 0 ? -i10 : 0;
                a aVar = this.f31134g;
                if (aVar.f31145a) {
                    int i12 = aVar.f31146b - i11;
                    aVar.f31146b = i12;
                    if (aVar.f31147c == 0 && i9 == 181) {
                        aVar.f31147c = i12;
                        i4 = i7;
                    } else {
                        aVar.f31145a = false;
                        String str = this.f31128a;
                        str.getClass();
                        byte[] copyOf = Arrays.copyOf(aVar.f31148d, aVar.f31146b);
                        int i13 = copyOf[i7] & 255;
                        i4 = i7;
                        byte b4 = copyOf[5];
                        int i14 = ((b4 & 255) >> 4) | (i13 << 4);
                        int i15 = (copyOf[6] & 255) | ((b4 & 15) << 8);
                        int i16 = (copyOf[7] & 240) >> 4;
                        if (i16 != 2) {
                            if (i16 == 3) {
                                f5 = i15 * 16;
                                i6 = i14 * 9;
                            } else if (i16 != i4) {
                                f4 = 1.0f;
                                i4 = 4;
                            } else {
                                f5 = i15 * 121;
                                i6 = i14 * 100;
                            }
                            f4 = f5 / i6;
                            i4 = 4;
                        } else {
                            f4 = (i15 * 4) / (i14 * 3);
                        }
                        yb0 a5 = new yb0.a().b(str).e("video/mpeg2").o(i14).f(i15).b(f4).a(Collections.singletonList(copyOf)).a();
                        int i17 = (copyOf[7] & 15) - 1;
                        if (i17 >= 0) {
                            double[] dArr = f31127q;
                            if (i17 < 8) {
                                double d5 = dArr[i17];
                                byte b5 = copyOf[aVar.f31147c + 9];
                                int i18 = (b5 & 96) >> 5;
                                if (i18 != (b5 & 31)) {
                                    d5 = ((i18 + 1.0d) / (r4 + 1)) * d5;
                                }
                                j7 = (long) (1000000.0d / d5);
                                Pair create = Pair.create(a5, Long.valueOf(j7));
                                this.f31129b.a((yb0) create.first);
                                this.f31138k = ((Long) create.second).longValue();
                                this.f31137j = true;
                                c4 = 3;
                            }
                        }
                        j7 = 0;
                        Pair create2 = Pair.create(a5, Long.valueOf(j7));
                        this.f31129b.a((yb0) create2.first);
                        this.f31138k = ((Long) create2.second).longValue();
                        this.f31137j = true;
                        c4 = 3;
                    }
                } else {
                    i4 = i7;
                    if (i9 == 179) {
                        aVar.f31145a = true;
                    }
                }
                c4 = 3;
                aVar.a(a.f31144e, 0, 3);
            }
            r31 r31Var = this.f31132e;
            if (r31Var != null) {
                if (i10 > 0) {
                    r31Var.a(c6, d4, a4);
                    i5 = 0;
                } else {
                    i5 = -i10;
                }
                if (this.f31132e.a(i5)) {
                    r31 r31Var2 = this.f31132e;
                    int a6 = s31.a(r31Var2.f31025e, r31Var2.f31024d);
                    sf1 sf1Var2 = this.f31131d;
                    int i19 = u82.f32873a;
                    sf1Var2.a(a6, this.f31132e.f31024d);
                    this.f31130c.a(this.f31141n, this.f31131d);
                }
                if (i9 == 178) {
                    if (sf1Var.c()[a4 + 2] == 1) {
                        this.f31132e.b(i9);
                    }
                    if (i9 != 0 || i9 == 179) {
                        int i20 = e4 - a4;
                        if (this.f31143p && this.f31137j) {
                            j6 = this.f31141n;
                            if (j6 != -9223372036854775807L) {
                                j4 = -9223372036854775807L;
                                this.f31129b.a(j6, this.f31142o ? 1 : 0, ((int) (this.f31135h - this.f31140m)) - i20, i20, null);
                                if (this.f31136i || this.f31143p) {
                                    this.f31140m = this.f31135h - i20;
                                    j5 = this.f31139l;
                                    if (j5 == j4) {
                                        long j8 = this.f31141n;
                                        j5 = j8 != j4 ? j8 + this.f31138k : j4;
                                    }
                                    this.f31141n = j5;
                                    z4 = false;
                                    this.f31142o = false;
                                    this.f31139l = j4;
                                    z5 = true;
                                    this.f31136i = true;
                                } else {
                                    z5 = true;
                                    z4 = false;
                                }
                                if (i9 == 0) {
                                    z4 = z5;
                                }
                                this.f31143p = z4;
                            }
                        }
                        j4 = -9223372036854775807L;
                        if (this.f31136i) {
                        }
                        this.f31140m = this.f31135h - i20;
                        j5 = this.f31139l;
                        if (j5 == j4) {
                        }
                        this.f31141n = j5;
                        z4 = false;
                        this.f31142o = false;
                        this.f31139l = j4;
                        z5 = true;
                        this.f31136i = true;
                        if (i9 == 0) {
                        }
                        this.f31143p = z4;
                    } else if (i9 == 184) {
                        this.f31142o = true;
                    }
                    d4 = i8;
                    c5 = c4;
                    i7 = i4;
                }
            }
            if (i9 != 0) {
            }
            int i202 = e4 - a4;
            if (this.f31143p) {
                j6 = this.f31141n;
                if (j6 != -9223372036854775807L) {
                }
            }
            j4 = -9223372036854775807L;
            if (this.f31136i) {
            }
            this.f31140m = this.f31135h - i202;
            j5 = this.f31139l;
            if (j5 == j4) {
            }
            this.f31141n = j5;
            z4 = false;
            this.f31142o = false;
            this.f31139l = j4;
            z5 = true;
            this.f31136i = true;
            if (i9 == 0) {
            }
            this.f31143p = z4;
            d4 = i8;
            c5 = c4;
            i7 = i4;
        }
        if (!this.f31137j) {
            this.f31134g.a(c6, d4, e4);
        }
        r31 r31Var3 = this.f31132e;
        if (r31Var3 != null) {
            r31Var3.a(c6, d4, e4);
        }
    }

    @Override // com.yandex.mobile.ads.impl.q40
    public final void b() {
    }

    @Override // com.yandex.mobile.ads.impl.q40
    public final void a(r70 r70Var, e72.d dVar) {
        dVar.a();
        this.f31128a = dVar.b();
        this.f31129b = r70Var.a(dVar.c(), 2);
        t82 t82Var = this.f31130c;
        if (t82Var != null) {
            t82Var.a(r70Var, dVar);
        }
    }

    @Override // com.yandex.mobile.ads.impl.q40
    public final void a(int i4, long j4) {
        this.f31139l = j4;
    }

    @Override // com.yandex.mobile.ads.impl.q40
    public final void a() {
        s31.a(this.f31133f);
        a aVar = this.f31134g;
        aVar.f31145a = false;
        aVar.f31146b = 0;
        aVar.f31147c = 0;
        r31 r31Var = this.f31132e;
        if (r31Var != null) {
            r31Var.b();
        }
        this.f31135h = 0L;
        this.f31136i = false;
        this.f31139l = -9223372036854775807L;
        this.f31141n = -9223372036854775807L;
    }
}
