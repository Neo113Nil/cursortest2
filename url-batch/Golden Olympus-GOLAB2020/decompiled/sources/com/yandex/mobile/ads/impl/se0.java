package com.yandex.mobile.ads.impl;

import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import com.yandex.mobile.ads.impl.e72;
import com.yandex.mobile.ads.impl.yb0;
import java.util.Arrays;
import java.util.Collections;

/* loaded from: classes3.dex */
public final class se0 implements q40 {

    /* renamed from: l, reason: collision with root package name */
    private static final float[] f31697l = {1.0f, 1.0f, 1.0909091f, 0.90909094f, 1.4545455f, 1.2121212f, 1.0f};

    /* renamed from: a, reason: collision with root package name */
    private final t82 f31698a;

    /* renamed from: f, reason: collision with root package name */
    private b f31703f;

    /* renamed from: g, reason: collision with root package name */
    private long f31704g;

    /* renamed from: h, reason: collision with root package name */
    private String f31705h;

    /* renamed from: i, reason: collision with root package name */
    private p52 f31706i;

    /* renamed from: j, reason: collision with root package name */
    private boolean f31707j;

    /* renamed from: c, reason: collision with root package name */
    private final boolean[] f31700c = new boolean[4];

    /* renamed from: d, reason: collision with root package name */
    private final a f31701d = new a();

    /* renamed from: k, reason: collision with root package name */
    private long f31708k = -9223372036854775807L;

    /* renamed from: e, reason: collision with root package name */
    private final r31 f31702e = new r31(178);

    /* renamed from: b, reason: collision with root package name */
    private final sf1 f31699b = new sf1();

    private static final class a {

        /* renamed from: f, reason: collision with root package name */
        private static final byte[] f31709f = {0, 0, 1};

        /* renamed from: a, reason: collision with root package name */
        private boolean f31710a;

        /* renamed from: b, reason: collision with root package name */
        private int f31711b;

        /* renamed from: c, reason: collision with root package name */
        public int f31712c;

        /* renamed from: d, reason: collision with root package name */
        public int f31713d;

        /* renamed from: e, reason: collision with root package name */
        public byte[] f31714e = new byte[UserVerificationMethods.USER_VERIFY_PATTERN];

        public final void a(byte[] bArr, int i4, int i5) {
            if (this.f31710a) {
                int i6 = i5 - i4;
                byte[] bArr2 = this.f31714e;
                int length = bArr2.length;
                int i7 = this.f31712c + i6;
                if (length < i7) {
                    this.f31714e = Arrays.copyOf(bArr2, i7 * 2);
                }
                System.arraycopy(bArr, i4, this.f31714e, this.f31712c, i6);
                this.f31712c += i6;
            }
        }
    }

    private static final class b {

        /* renamed from: a, reason: collision with root package name */
        private final p52 f31715a;

        /* renamed from: b, reason: collision with root package name */
        private boolean f31716b;

        /* renamed from: c, reason: collision with root package name */
        private boolean f31717c;

        /* renamed from: d, reason: collision with root package name */
        private boolean f31718d;

        /* renamed from: e, reason: collision with root package name */
        private int f31719e;

        /* renamed from: f, reason: collision with root package name */
        private int f31720f;

        /* renamed from: g, reason: collision with root package name */
        private long f31721g;

        /* renamed from: h, reason: collision with root package name */
        private long f31722h;

        public b(p52 p52Var) {
            this.f31715a = p52Var;
        }
    }

    se0(t82 t82Var) {
        this.f31698a = t82Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:58:0x02d8  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x02f8  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0313  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0315  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x011f  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x015a  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0171  */
    @Override // com.yandex.mobile.ads.impl.q40
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(sf1 sf1Var) {
        char c4;
        int i4;
        boolean z4;
        int i5;
        b bVar;
        long j4;
        int i6;
        int i7;
        float f4;
        int i8 = 2;
        char c5 = 3;
        boolean z5 = true;
        if (this.f31703f == null) {
            throw new IllegalStateException();
        }
        if (this.f31706i == null) {
            throw new IllegalStateException();
        }
        int d4 = sf1Var.d();
        int e4 = sf1Var.e();
        byte[] c6 = sf1Var.c();
        this.f31704g += sf1Var.a();
        this.f31706i.a(sf1Var.a(), sf1Var);
        while (true) {
            int a4 = s31.a(c6, d4, e4, this.f31700c);
            if (a4 == e4) {
                if (!this.f31707j) {
                    this.f31701d.a(c6, d4, e4);
                }
                b bVar2 = this.f31703f;
                if (bVar2.f31717c) {
                    int i9 = bVar2.f31720f;
                    int i10 = (d4 + 1) - i9;
                    if (i10 < e4) {
                        if (((c6[i10] & 192) >> 6) != 0) {
                            z5 = false;
                        }
                        bVar2.f31718d = z5;
                        bVar2.f31717c = false;
                    } else {
                        bVar2.f31720f = (e4 - d4) + i9;
                    }
                }
                r31 r31Var = this.f31702e;
                if (r31Var != null) {
                    r31Var.a(c6, d4, e4);
                    return;
                }
                return;
            }
            int i11 = a4 + 3;
            byte b4 = sf1Var.c()[i11];
            int i12 = b4 & 255;
            int i13 = a4 - d4;
            if (this.f31707j) {
                c4 = c5;
                i4 = e4;
            } else {
                if (i13 > 0) {
                    this.f31701d.a(c6, d4, a4);
                }
                int i14 = i13 < 0 ? -i13 : 0;
                a aVar = this.f31701d;
                int i15 = aVar.f31711b;
                if (i15 != 0) {
                    i4 = e4;
                    if (i15 == z5) {
                        i7 = 0;
                        if (i12 != 181) {
                            ms0.d("H263Reader", "Unexpected start code value");
                            aVar.f31710a = false;
                            aVar.f31712c = 0;
                            aVar.f31711b = 0;
                        } else {
                            aVar.f31711b = 2;
                        }
                    } else if (i15 == i8) {
                        i7 = 0;
                        if (i12 > 31) {
                            ms0.d("H263Reader", "Unexpected start code value");
                            aVar.f31710a = false;
                            aVar.f31712c = 0;
                            aVar.f31711b = 0;
                        } else {
                            aVar.f31711b = 3;
                        }
                    } else if (i15 != 3) {
                        if (i15 != 4) {
                            throw new IllegalStateException();
                        }
                        if (i12 == 179 || i12 == 181) {
                            aVar.f31712c -= i14;
                            aVar.f31710a = false;
                            p52 p52Var = this.f31706i;
                            int i16 = aVar.f31713d;
                            String str = this.f31705h;
                            str.getClass();
                            byte[] copyOf = Arrays.copyOf(aVar.f31714e, aVar.f31712c);
                            rf1 rf1Var = new rf1(copyOf.length, copyOf);
                            rf1Var.e(i16);
                            rf1Var.e(4);
                            rf1Var.h();
                            rf1Var.d(8);
                            if (rf1Var.f()) {
                                rf1Var.d(4);
                                rf1Var.d(3);
                            }
                            int b5 = rf1Var.b(4);
                            if (b5 == 15) {
                                int b6 = rf1Var.b(8);
                                int b7 = rf1Var.b(8);
                                if (b7 == 0) {
                                    ms0.d("H263Reader", "Invalid aspect ratio");
                                    f4 = 1.0f;
                                    if (rf1Var.f()) {
                                        rf1Var.d(2);
                                        rf1Var.d(1);
                                        if (rf1Var.f()) {
                                            rf1Var.d(15);
                                            rf1Var.h();
                                            rf1Var.d(15);
                                            rf1Var.h();
                                            rf1Var.d(15);
                                            rf1Var.h();
                                            rf1Var.d(3);
                                            rf1Var.d(11);
                                            rf1Var.h();
                                            rf1Var.d(15);
                                            rf1Var.h();
                                        }
                                    }
                                    if (rf1Var.b(2) != 0) {
                                        ms0.d("H263Reader", "Unhandled video object layer shape");
                                    }
                                    rf1Var.h();
                                    int b8 = rf1Var.b(16);
                                    rf1Var.h();
                                    if (rf1Var.f()) {
                                        if (b8 == 0) {
                                            ms0.d("H263Reader", "Invalid vop_increment_time_resolution");
                                        } else {
                                            int i17 = 0;
                                            for (int i18 = b8 - 1; i18 > 0; i18 >>= 1) {
                                                i17++;
                                            }
                                            rf1Var.d(i17);
                                        }
                                    }
                                    rf1Var.h();
                                    int b9 = rf1Var.b(13);
                                    rf1Var.h();
                                    int b10 = rf1Var.b(13);
                                    rf1Var.h();
                                    rf1Var.h();
                                    p52Var.a(new yb0.a().b(str).e("video/mp4v-es").o(b9).f(b10).b(f4).a(Collections.singletonList(copyOf)).a());
                                    this.f31707j = true;
                                    c4 = 3;
                                } else {
                                    f4 = b6 / b7;
                                    if (rf1Var.f()) {
                                    }
                                    if (rf1Var.b(2) != 0) {
                                    }
                                    rf1Var.h();
                                    int b82 = rf1Var.b(16);
                                    rf1Var.h();
                                    if (rf1Var.f()) {
                                    }
                                    rf1Var.h();
                                    int b92 = rf1Var.b(13);
                                    rf1Var.h();
                                    int b102 = rf1Var.b(13);
                                    rf1Var.h();
                                    rf1Var.h();
                                    p52Var.a(new yb0.a().b(str).e("video/mp4v-es").o(b92).f(b102).b(f4).a(Collections.singletonList(copyOf)).a());
                                    this.f31707j = true;
                                    c4 = 3;
                                }
                            } else {
                                float[] fArr = f31697l;
                                if (b5 < 7) {
                                    f4 = fArr[b5];
                                    if (rf1Var.f()) {
                                    }
                                    if (rf1Var.b(2) != 0) {
                                    }
                                    rf1Var.h();
                                    int b822 = rf1Var.b(16);
                                    rf1Var.h();
                                    if (rf1Var.f()) {
                                    }
                                    rf1Var.h();
                                    int b922 = rf1Var.b(13);
                                    rf1Var.h();
                                    int b1022 = rf1Var.b(13);
                                    rf1Var.h();
                                    rf1Var.h();
                                    p52Var.a(new yb0.a().b(str).e("video/mp4v-es").o(b922).f(b1022).b(f4).a(Collections.singletonList(copyOf)).a());
                                    this.f31707j = true;
                                    c4 = 3;
                                } else {
                                    ms0.d("H263Reader", "Invalid aspect ratio");
                                    f4 = 1.0f;
                                    if (rf1Var.f()) {
                                    }
                                    if (rf1Var.b(2) != 0) {
                                    }
                                    rf1Var.h();
                                    int b8222 = rf1Var.b(16);
                                    rf1Var.h();
                                    if (rf1Var.f()) {
                                    }
                                    rf1Var.h();
                                    int b9222 = rf1Var.b(13);
                                    rf1Var.h();
                                    int b10222 = rf1Var.b(13);
                                    rf1Var.h();
                                    rf1Var.h();
                                    p52Var.a(new yb0.a().b(str).e("video/mp4v-es").o(b9222).f(b10222).b(f4).a(Collections.singletonList(copyOf)).a());
                                    this.f31707j = true;
                                    c4 = 3;
                                }
                            }
                        } else {
                            i7 = 0;
                        }
                    } else if ((b4 & 240) != 32) {
                        ms0.d("H263Reader", "Unexpected start code value");
                        i7 = 0;
                        aVar.f31710a = false;
                        aVar.f31712c = 0;
                        aVar.f31711b = 0;
                    } else {
                        i7 = 0;
                        aVar.f31713d = aVar.f31712c;
                        aVar.f31711b = 4;
                    }
                } else {
                    i4 = e4;
                    i7 = 0;
                    if (i12 == 176) {
                        aVar.f31711b = 1;
                        aVar.f31710a = true;
                        c4 = 3;
                        aVar.a(a.f31709f, i7, 3);
                    }
                }
                c4 = 3;
                aVar.a(a.f31709f, i7, 3);
            }
            b bVar3 = this.f31703f;
            if (bVar3.f31717c) {
                int i19 = bVar3.f31720f;
                int i20 = (d4 + 1) - i19;
                if (i20 < a4) {
                    bVar3.f31718d = ((c6[i20] & 192) >> 6) == 0;
                    bVar3.f31717c = false;
                } else {
                    bVar3.f31720f = i19 + i13;
                }
            }
            r31 r31Var2 = this.f31702e;
            if (r31Var2 != null) {
                if (i13 > 0) {
                    r31Var2.a(c6, d4, a4);
                    i6 = 0;
                } else {
                    i6 = -i13;
                }
                if (this.f31702e.a(i6)) {
                    r31 r31Var3 = this.f31702e;
                    int a5 = s31.a(r31Var3.f31025e, r31Var3.f31024d);
                    sf1 sf1Var2 = this.f31699b;
                    int i21 = u82.f32873a;
                    sf1Var2.a(a5, this.f31702e.f31024d);
                    this.f31698a.a(this.f31708k, this.f31699b);
                }
                if (i12 == 178) {
                    i5 = 2;
                    z4 = true;
                    if (sf1Var.c()[a4 + 2] == 1) {
                        this.f31702e.b(i12);
                    }
                    int i22 = i4 - a4;
                    long j5 = this.f31704g - i22;
                    bVar = this.f31703f;
                    boolean z6 = this.f31707j;
                    if (bVar.f31719e == 182 && z6 && bVar.f31716b) {
                        j4 = bVar.f31722h;
                        if (j4 != -9223372036854775807L) {
                            bVar.f31715a.a(j4, bVar.f31718d ? 1 : 0, (int) (j5 - bVar.f31721g), i22, null);
                        }
                    }
                    if (bVar.f31719e != 179) {
                        bVar.f31721g = j5;
                    }
                    b bVar4 = this.f31703f;
                    long j6 = this.f31708k;
                    bVar4.f31719e = i12;
                    bVar4.f31718d = false;
                    bVar4.f31716b = (i12 != 182 || i12 == 179) ? z4 : false;
                    bVar4.f31717c = i12 != 182 ? z4 : false;
                    bVar4.f31720f = 0;
                    bVar4.f31722h = j6;
                    z5 = z4;
                    d4 = i11;
                    c5 = c4;
                    e4 = i4;
                    i8 = i5;
                }
            }
            z4 = true;
            i5 = 2;
            int i222 = i4 - a4;
            long j52 = this.f31704g - i222;
            bVar = this.f31703f;
            boolean z62 = this.f31707j;
            if (bVar.f31719e == 182) {
                j4 = bVar.f31722h;
                if (j4 != -9223372036854775807L) {
                }
            }
            if (bVar.f31719e != 179) {
            }
            b bVar42 = this.f31703f;
            long j62 = this.f31708k;
            bVar42.f31719e = i12;
            bVar42.f31718d = false;
            bVar42.f31716b = (i12 != 182 || i12 == 179) ? z4 : false;
            bVar42.f31717c = i12 != 182 ? z4 : false;
            bVar42.f31720f = 0;
            bVar42.f31722h = j62;
            z5 = z4;
            d4 = i11;
            c5 = c4;
            e4 = i4;
            i8 = i5;
        }
    }

    @Override // com.yandex.mobile.ads.impl.q40
    public final void b() {
    }

    @Override // com.yandex.mobile.ads.impl.q40
    public final void a(r70 r70Var, e72.d dVar) {
        dVar.a();
        this.f31705h = dVar.b();
        p52 a4 = r70Var.a(dVar.c(), 2);
        this.f31706i = a4;
        this.f31703f = new b(a4);
        t82 t82Var = this.f31698a;
        if (t82Var != null) {
            t82Var.a(r70Var, dVar);
        }
    }

    @Override // com.yandex.mobile.ads.impl.q40
    public final void a(int i4, long j4) {
        if (j4 != -9223372036854775807L) {
            this.f31708k = j4;
        }
    }

    @Override // com.yandex.mobile.ads.impl.q40
    public final void a() {
        s31.a(this.f31700c);
        a aVar = this.f31701d;
        aVar.f31710a = false;
        aVar.f31712c = 0;
        aVar.f31711b = 0;
        b bVar = this.f31703f;
        if (bVar != null) {
            bVar.f31716b = false;
            bVar.f31717c = false;
            bVar.f31718d = false;
            bVar.f31719e = -1;
        }
        r31 r31Var = this.f31702e;
        if (r31Var != null) {
            r31Var.b();
        }
        this.f31704g = 0L;
        this.f31708k = -9223372036854775807L;
    }
}
