package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.impl.e72;
import com.yandex.mobile.ads.impl.yb0;
import java.util.Collections;

/* loaded from: classes3.dex */
public final class ue0 implements q40 {

    /* renamed from: a, reason: collision with root package name */
    private final yw1 f33046a;

    /* renamed from: b, reason: collision with root package name */
    private String f33047b;

    /* renamed from: c, reason: collision with root package name */
    private p52 f33048c;

    /* renamed from: d, reason: collision with root package name */
    private a f33049d;

    /* renamed from: e, reason: collision with root package name */
    private boolean f33050e;

    /* renamed from: l, reason: collision with root package name */
    private long f33057l;

    /* renamed from: f, reason: collision with root package name */
    private final boolean[] f33051f = new boolean[3];

    /* renamed from: g, reason: collision with root package name */
    private final r31 f33052g = new r31(32);

    /* renamed from: h, reason: collision with root package name */
    private final r31 f33053h = new r31(33);

    /* renamed from: i, reason: collision with root package name */
    private final r31 f33054i = new r31(34);

    /* renamed from: j, reason: collision with root package name */
    private final r31 f33055j = new r31(39);

    /* renamed from: k, reason: collision with root package name */
    private final r31 f33056k = new r31(40);

    /* renamed from: m, reason: collision with root package name */
    private long f33058m = -9223372036854775807L;

    /* renamed from: n, reason: collision with root package name */
    private final sf1 f33059n = new sf1();

    private static final class a {

        /* renamed from: a, reason: collision with root package name */
        private final p52 f33060a;

        /* renamed from: b, reason: collision with root package name */
        private long f33061b;

        /* renamed from: c, reason: collision with root package name */
        private boolean f33062c;

        /* renamed from: d, reason: collision with root package name */
        private int f33063d;

        /* renamed from: e, reason: collision with root package name */
        private long f33064e;

        /* renamed from: f, reason: collision with root package name */
        private boolean f33065f;

        /* renamed from: g, reason: collision with root package name */
        private boolean f33066g;

        /* renamed from: h, reason: collision with root package name */
        private boolean f33067h;

        /* renamed from: i, reason: collision with root package name */
        private boolean f33068i;

        /* renamed from: j, reason: collision with root package name */
        private boolean f33069j;

        /* renamed from: k, reason: collision with root package name */
        private long f33070k;

        /* renamed from: l, reason: collision with root package name */
        private long f33071l;

        /* renamed from: m, reason: collision with root package name */
        private boolean f33072m;

        public a(p52 p52Var) {
            this.f33060a = p52Var;
        }
    }

    public ue0(yw1 yw1Var) {
        this.f33046a = yw1Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:162:0x036c  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x0375  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x038b  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x039c  */
    /* JADX WARN: Removed duplicated region for block: B:179:0x0402  */
    /* JADX WARN: Removed duplicated region for block: B:182:0x042a  */
    /* JADX WARN: Removed duplicated region for block: B:185:0x0466  */
    /* JADX WARN: Removed duplicated region for block: B:189:0x04d3  */
    /* JADX WARN: Removed duplicated region for block: B:194:0x04df  */
    /* JADX WARN: Removed duplicated region for block: B:198:0x04eb  */
    /* JADX WARN: Removed duplicated region for block: B:224:0x04cc  */
    /* JADX WARN: Removed duplicated region for block: B:234:0x03ed  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00dc  */
    @Override // com.yandex.mobile.ads.impl.q40
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(sf1 sf1Var) {
        int i4;
        int i5;
        int i6;
        byte[] bArr;
        int i7;
        int i8;
        int i9;
        int i10;
        boolean z4;
        boolean z5;
        char c4;
        int i11;
        boolean z6;
        int i12;
        float f4;
        int i13;
        int i14;
        int i15;
        boolean z7 = true;
        if (this.f33048c == null) {
            throw new IllegalStateException();
        }
        int i16 = u82.f32873a;
        while (sf1Var.a() > 0) {
            int e4 = sf1Var.e();
            byte[] c5 = sf1Var.c();
            this.f33057l += sf1Var.a();
            this.f33048c.a(sf1Var.a(), sf1Var);
            for (int d4 = sf1Var.d(); d4 < e4; d4 = i8) {
                int a4 = s31.a(c5, d4, e4, this.f33051f);
                if (a4 == e4) {
                    a(c5, d4, e4);
                    return;
                }
                int i17 = a4 + 3;
                int i18 = (c5[i17] & 126) >> (z7 ? 1 : 0);
                int i19 = a4 - d4;
                if (i19 > 0) {
                    a(c5, d4, a4);
                }
                int i20 = e4 - a4;
                long j4 = this.f33057l - i20;
                int i21 = i19 < 0 ? -i19 : 0;
                long j5 = this.f33058m;
                a aVar = this.f33049d;
                boolean z8 = this.f33050e;
                if (aVar.f33069j && aVar.f33066g) {
                    aVar.f33072m = aVar.f33062c;
                    aVar.f33069j = false;
                } else if (aVar.f33067h || aVar.f33066g) {
                    if (z8 && aVar.f33068i) {
                        long j6 = aVar.f33061b;
                        i4 = i21;
                        int i22 = i20 + ((int) (j4 - j6));
                        long j7 = aVar.f33071l;
                        if (j7 != -9223372036854775807L) {
                            aVar.f33060a.a(j7, aVar.f33072m ? 1 : 0, (int) (j6 - aVar.f33070k), i22, null);
                        }
                    } else {
                        i4 = i21;
                    }
                    aVar.f33070k = aVar.f33061b;
                    aVar.f33071l = aVar.f33064e;
                    aVar.f33072m = aVar.f33062c;
                    aVar.f33068i = z7;
                    if (this.f33050e) {
                        i9 = i4;
                        this.f33052g.a(i9);
                        this.f33053h.a(i9);
                        this.f33054i.a(i9);
                        if (this.f33052g.a() && this.f33053h.a() && this.f33054i.a()) {
                            p52 p52Var = this.f33048c;
                            int i23 = z7 ? 1 : 0;
                            String str = this.f33047b;
                            r31 r31Var = this.f33052g;
                            r31 r31Var2 = this.f33053h;
                            i5 = i20;
                            r31 r31Var3 = this.f33054i;
                            i6 = e4;
                            int i24 = r31Var.f31025e;
                            bArr = c5;
                            byte[] bArr2 = new byte[r31Var2.f31025e + i24 + r31Var3.f31025e];
                            i8 = i17;
                            System.arraycopy(r31Var.f31024d, 0, bArr2, 0, i24);
                            i7 = i18;
                            System.arraycopy(r31Var2.f31024d, 0, bArr2, r31Var.f31025e, r31Var2.f31025e);
                            System.arraycopy(r31Var3.f31024d, 0, bArr2, r31Var.f31025e + r31Var2.f31025e, r31Var3.f31025e);
                            tf1 tf1Var = new tf1(r31Var2.f31024d, 0, r31Var2.f31025e);
                            tf1Var.d(44);
                            int b4 = tf1Var.b(3);
                            tf1Var.f();
                            int b5 = tf1Var.b(2);
                            boolean c6 = tf1Var.c();
                            int b6 = tf1Var.b(5);
                            int i25 = 0;
                            for (int i26 = 0; i26 < 32; i26++) {
                                if (tf1Var.c()) {
                                    i25 |= i23 << i26;
                                }
                            }
                            int[] iArr = new int[6];
                            for (int i27 = 0; i27 < 6; i27++) {
                                iArr[i27] = tf1Var.b(8);
                            }
                            int b7 = tf1Var.b(8);
                            int i28 = 0;
                            for (int i29 = 0; i29 < b4; i29++) {
                                if (tf1Var.c()) {
                                    i28 += 89;
                                }
                                if (tf1Var.c()) {
                                    i28 += 8;
                                }
                            }
                            tf1Var.d(i28);
                            if (b4 > 0) {
                                tf1Var.d((8 - b4) * 2);
                            }
                            tf1Var.e();
                            int e5 = tf1Var.e();
                            if (e5 == 3) {
                                tf1Var.f();
                            }
                            int e6 = tf1Var.e();
                            int e7 = tf1Var.e();
                            if (tf1Var.c()) {
                                int e8 = tf1Var.e();
                                int e9 = tf1Var.e();
                                int e10 = tf1Var.e();
                                int e11 = tf1Var.e();
                                e6 -= (e8 + e9) * ((e5 == i23 || e5 == 2) ? 2 : i23);
                                e7 -= (e10 + e11) * (e5 == i23 ? 2 : 1);
                            }
                            tf1Var.e();
                            tf1Var.e();
                            int e12 = tf1Var.e();
                            for (int i30 = tf1Var.c() ? 0 : b4; i30 <= b4; i30++) {
                                tf1Var.e();
                                tf1Var.e();
                                tf1Var.e();
                            }
                            tf1Var.e();
                            tf1Var.e();
                            tf1Var.e();
                            tf1Var.e();
                            tf1Var.e();
                            tf1Var.e();
                            int i31 = 4;
                            if (tf1Var.c() && tf1Var.c()) {
                                int i32 = 0;
                                while (i32 < i31) {
                                    int i33 = i31;
                                    int i34 = 0;
                                    while (i34 < 6) {
                                        if (tf1Var.c()) {
                                            i14 = e12;
                                            int min = Math.min(64, 1 << ((i32 << 1) + 4));
                                            if (i32 > 1) {
                                                tf1Var.d();
                                            }
                                            i15 = 1;
                                            for (int i35 = 0; i35 < min; i35++) {
                                                tf1Var.d();
                                            }
                                        } else {
                                            tf1Var.e();
                                            i14 = e12;
                                            i15 = 1;
                                        }
                                        i34 += i32 == 3 ? 3 : i15;
                                        e12 = i14;
                                    }
                                    i32++;
                                    i31 = i33;
                                }
                            }
                            int i36 = e12;
                            int i37 = i31;
                            tf1Var.d(2);
                            if (tf1Var.c()) {
                                tf1Var.d(8);
                                tf1Var.e();
                                tf1Var.e();
                                tf1Var.f();
                            }
                            int e13 = tf1Var.e();
                            int i38 = 0;
                            int i39 = 0;
                            boolean z9 = false;
                            while (i39 < e13) {
                                if (i39 != 0) {
                                    z9 = tf1Var.c();
                                }
                                if (z9) {
                                    tf1Var.f();
                                    tf1Var.e();
                                    for (int i40 = 0; i40 <= i38; i40++) {
                                        if (tf1Var.c()) {
                                            tf1Var.f();
                                        }
                                    }
                                    i13 = e13;
                                } else {
                                    int e14 = tf1Var.e();
                                    int e15 = tf1Var.e();
                                    int i41 = e14 + e15;
                                    i13 = e13;
                                    for (int i42 = 0; i42 < e14; i42++) {
                                        tf1Var.e();
                                        tf1Var.f();
                                    }
                                    for (int i43 = 0; i43 < e15; i43++) {
                                        tf1Var.e();
                                        tf1Var.f();
                                    }
                                    i38 = i41;
                                }
                                i39++;
                                e13 = i13;
                            }
                            if (tf1Var.c()) {
                                for (int i44 = 0; i44 < tf1Var.e(); i44++) {
                                    tf1Var.d(i36 + 5);
                                }
                            }
                            tf1Var.d(2);
                            if (tf1Var.c()) {
                                if (tf1Var.c()) {
                                    int b8 = tf1Var.b(8);
                                    if (b8 == 255) {
                                        int b9 = tf1Var.b(16);
                                        int b10 = tf1Var.b(16);
                                        if (b9 != 0 && b10 != 0) {
                                            f4 = b9 / b10;
                                            if (tf1Var.c()) {
                                                tf1Var.f();
                                            }
                                            if (tf1Var.c()) {
                                                tf1Var.d(i37);
                                                if (tf1Var.c()) {
                                                    tf1Var.d(24);
                                                }
                                            }
                                            if (tf1Var.c()) {
                                                tf1Var.e();
                                                tf1Var.e();
                                            }
                                            tf1Var.f();
                                            if (tf1Var.c()) {
                                                e7 *= 2;
                                            }
                                            i12 = e7;
                                        }
                                    } else {
                                        float[] fArr = s31.f31557b;
                                        if (b8 < 17) {
                                            f4 = fArr[b8];
                                            if (tf1Var.c()) {
                                            }
                                            if (tf1Var.c()) {
                                            }
                                            if (tf1Var.c()) {
                                            }
                                            tf1Var.f();
                                            if (tf1Var.c()) {
                                            }
                                            i12 = e7;
                                        } else {
                                            fr0.a("Unexpected aspect_ratio_idc value: ", b8, "H265Reader");
                                        }
                                    }
                                    if (this.f33055j.a(i9)) {
                                        r31 r31Var4 = this.f33055j;
                                        this.f33059n.a(s31.a(r31Var4.f31025e, r31Var4.f31024d), this.f33055j.f31024d);
                                        this.f33059n.f(5);
                                        this.f33046a.a(j5, this.f33059n);
                                    }
                                    if (this.f33056k.a(i9)) {
                                        r31 r31Var5 = this.f33056k;
                                        this.f33059n.a(s31.a(r31Var5.f31025e, r31Var5.f31024d), this.f33056k.f31024d);
                                        this.f33059n.f(5);
                                        this.f33046a.a(j5, this.f33059n);
                                    }
                                    long j8 = this.f33058m;
                                    a aVar2 = this.f33049d;
                                    boolean z10 = this.f33050e;
                                    aVar2.f33066g = false;
                                    aVar2.f33067h = false;
                                    aVar2.f33064e = j8;
                                    aVar2.f33063d = 0;
                                    aVar2.f33061b = j4;
                                    i10 = i7;
                                    if (i10 >= 32) {
                                        z4 = false;
                                        z5 = true;
                                        c4 = 3;
                                    } else if (i10 == 40) {
                                        z4 = false;
                                        i11 = 16;
                                        z5 = true;
                                        c4 = 3;
                                        z6 = (i10 >= i11 || i10 > 21) ? z4 : z5;
                                        aVar2.f33062c = z6;
                                        if (!z6 || i10 <= 9) {
                                            z4 = z5;
                                        }
                                        aVar2.f33065f = z4;
                                        if (!this.f33050e) {
                                            this.f33052g.b(i10);
                                            this.f33053h.b(i10);
                                            this.f33054i.b(i10);
                                        }
                                        this.f33055j.b(i10);
                                        this.f33056k.b(i10);
                                        z7 = z5;
                                        e4 = i6;
                                        c5 = bArr;
                                    } else {
                                        if (!aVar2.f33068i || aVar2.f33069j) {
                                            z4 = false;
                                            c4 = 3;
                                        } else {
                                            if (z10) {
                                                long j9 = aVar2.f33071l;
                                                if (j9 == -9223372036854775807L) {
                                                    z4 = false;
                                                    c4 = 3;
                                                    aVar2.f33068i = z4;
                                                } else {
                                                    c4 = 3;
                                                    aVar2.f33060a.a(j9, aVar2.f33072m ? 1 : 0, (int) (j4 - aVar2.f33070k), i5, null);
                                                }
                                            } else {
                                                c4 = 3;
                                            }
                                            z4 = false;
                                            aVar2.f33068i = z4;
                                        }
                                        if ((32 > i10 || i10 > 35) && i10 != 39) {
                                            z5 = true;
                                        } else {
                                            z5 = true;
                                            aVar2.f33067h = !aVar2.f33069j;
                                            aVar2.f33069j = true;
                                        }
                                    }
                                    i11 = 16;
                                    if (i10 >= i11) {
                                    }
                                    aVar2.f33062c = z6;
                                    if (!z6) {
                                    }
                                    z4 = z5;
                                    aVar2.f33065f = z4;
                                    if (!this.f33050e) {
                                    }
                                    this.f33055j.b(i10);
                                    this.f33056k.b(i10);
                                    z7 = z5;
                                    e4 = i6;
                                    c5 = bArr;
                                }
                                f4 = 1.0f;
                                if (tf1Var.c()) {
                                }
                                if (tf1Var.c()) {
                                }
                                if (tf1Var.c()) {
                                }
                                tf1Var.f();
                                if (tf1Var.c()) {
                                }
                                i12 = e7;
                            } else {
                                i12 = e7;
                                f4 = 1.0f;
                            }
                            p52Var.a(new yb0.a().b(str).e("video/hevc").a(bq.a(b5, c6, b6, i25, iArr, b7)).o(e6).f(i12).b(f4).a(Collections.singletonList(bArr2)).a());
                            this.f33050e = true;
                            if (this.f33055j.a(i9)) {
                            }
                            if (this.f33056k.a(i9)) {
                            }
                            long j82 = this.f33058m;
                            a aVar22 = this.f33049d;
                            boolean z102 = this.f33050e;
                            aVar22.f33066g = false;
                            aVar22.f33067h = false;
                            aVar22.f33064e = j82;
                            aVar22.f33063d = 0;
                            aVar22.f33061b = j4;
                            i10 = i7;
                            if (i10 >= 32) {
                            }
                            i11 = 16;
                            if (i10 >= i11) {
                            }
                            aVar22.f33062c = z6;
                            if (!z6) {
                            }
                            z4 = z5;
                            aVar22.f33065f = z4;
                            if (!this.f33050e) {
                            }
                            this.f33055j.b(i10);
                            this.f33056k.b(i10);
                            z7 = z5;
                            e4 = i6;
                            c5 = bArr;
                        } else {
                            i5 = i20;
                            i6 = e4;
                            bArr = c5;
                            i7 = i18;
                            i8 = i17;
                        }
                    } else {
                        i5 = i20;
                        i6 = e4;
                        bArr = c5;
                        i7 = i18;
                        i8 = i17;
                        i9 = i4;
                    }
                    if (this.f33055j.a(i9)) {
                    }
                    if (this.f33056k.a(i9)) {
                    }
                    long j822 = this.f33058m;
                    a aVar222 = this.f33049d;
                    boolean z1022 = this.f33050e;
                    aVar222.f33066g = false;
                    aVar222.f33067h = false;
                    aVar222.f33064e = j822;
                    aVar222.f33063d = 0;
                    aVar222.f33061b = j4;
                    i10 = i7;
                    if (i10 >= 32) {
                    }
                    i11 = 16;
                    if (i10 >= i11) {
                    }
                    aVar222.f33062c = z6;
                    if (!z6) {
                    }
                    z4 = z5;
                    aVar222.f33065f = z4;
                    if (!this.f33050e) {
                    }
                    this.f33055j.b(i10);
                    this.f33056k.b(i10);
                    z7 = z5;
                    e4 = i6;
                    c5 = bArr;
                }
                i4 = i21;
                if (this.f33050e) {
                }
                if (this.f33055j.a(i9)) {
                }
                if (this.f33056k.a(i9)) {
                }
                long j8222 = this.f33058m;
                a aVar2222 = this.f33049d;
                boolean z10222 = this.f33050e;
                aVar2222.f33066g = false;
                aVar2222.f33067h = false;
                aVar2222.f33064e = j8222;
                aVar2222.f33063d = 0;
                aVar2222.f33061b = j4;
                i10 = i7;
                if (i10 >= 32) {
                }
                i11 = 16;
                if (i10 >= i11) {
                }
                aVar2222.f33062c = z6;
                if (!z6) {
                }
                z4 = z5;
                aVar2222.f33065f = z4;
                if (!this.f33050e) {
                }
                this.f33055j.b(i10);
                this.f33056k.b(i10);
                z7 = z5;
                e4 = i6;
                c5 = bArr;
            }
        }
    }

    @Override // com.yandex.mobile.ads.impl.q40
    public final void b() {
    }

    @Override // com.yandex.mobile.ads.impl.q40
    public final void a(r70 r70Var, e72.d dVar) {
        dVar.a();
        this.f33047b = dVar.b();
        p52 a4 = r70Var.a(dVar.c(), 2);
        this.f33048c = a4;
        this.f33049d = new a(a4);
        this.f33046a.a(r70Var, dVar);
    }

    private void a(byte[] bArr, int i4, int i5) {
        a aVar = this.f33049d;
        if (aVar.f33065f) {
            int i6 = aVar.f33063d;
            int i7 = (i4 + 2) - i6;
            if (i7 < i5) {
                aVar.f33066g = (bArr[i7] & 128) != 0;
                aVar.f33065f = false;
            } else {
                aVar.f33063d = (i5 - i4) + i6;
            }
        }
        if (!this.f33050e) {
            this.f33052g.a(bArr, i4, i5);
            this.f33053h.a(bArr, i4, i5);
            this.f33054i.a(bArr, i4, i5);
        }
        this.f33055j.a(bArr, i4, i5);
        this.f33056k.a(bArr, i4, i5);
    }

    @Override // com.yandex.mobile.ads.impl.q40
    public final void a(int i4, long j4) {
        if (j4 != -9223372036854775807L) {
            this.f33058m = j4;
        }
    }

    @Override // com.yandex.mobile.ads.impl.q40
    public final void a() {
        this.f33057l = 0L;
        this.f33058m = -9223372036854775807L;
        s31.a(this.f33051f);
        this.f33052g.b();
        this.f33053h.b();
        this.f33054i.b();
        this.f33055j.b();
        this.f33056k.b();
        a aVar = this.f33049d;
        if (aVar != null) {
            aVar.f33065f = false;
            aVar.f33066g = false;
            aVar.f33067h = false;
            aVar.f33068i = false;
            aVar.f33069j = false;
        }
    }
}
