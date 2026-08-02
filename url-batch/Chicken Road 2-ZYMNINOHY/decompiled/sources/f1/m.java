package f1;

import E.AbstractC0005f;
import T.C0096n;
import W.AbstractC0108a;
import W.J;
import a0.C0134J;
import java.util.Arrays;
import java.util.Collections;

/* loaded from: classes.dex */
public final class m implements h {

    /* renamed from: l, reason: collision with root package name */
    public static final float[] f8638l = {1.0f, 1.0f, 1.0909091f, 0.90909094f, 1.4545455f, 1.2121212f, 1.0f};

    /* renamed from: a, reason: collision with root package name */
    public final B f8639a;

    /* renamed from: b, reason: collision with root package name */
    public final W.u f8640b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean[] f8641c = new boolean[4];

    /* renamed from: d, reason: collision with root package name */
    public final k f8642d;

    /* renamed from: e, reason: collision with root package name */
    public final C0134J f8643e;

    /* renamed from: f, reason: collision with root package name */
    public l f8644f;

    /* renamed from: g, reason: collision with root package name */
    public long f8645g;

    /* renamed from: h, reason: collision with root package name */
    public String f8646h;

    /* renamed from: i, reason: collision with root package name */
    public y0.F f8647i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f8648j;

    /* renamed from: k, reason: collision with root package name */
    public long f8649k;

    public m(B b4) {
        this.f8639a = b4;
        k kVar = new k();
        kVar.f8629e = new byte[128];
        this.f8642d = kVar;
        this.f8649k = -9223372036854775807L;
        this.f8643e = new C0134J(178);
        this.f8640b = new W.u();
    }

    /* JADX WARN: Removed duplicated region for block: B:44:0x025d  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x025f  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00ed  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0126  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x013d  */
    @Override // f1.h
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(W.u uVar) {
        int i4;
        int i5;
        boolean z;
        int i6;
        int i7;
        float f4;
        this.f8644f.getClass();
        this.f8647i.getClass();
        int i8 = uVar.f3352b;
        int i9 = uVar.f3353c;
        byte[] bArr = uVar.f3351a;
        this.f8645g += uVar.a();
        this.f8647i.a(uVar.a(), uVar);
        while (true) {
            int b4 = X.p.b(bArr, i8, i9, this.f8641c);
            k kVar = this.f8642d;
            C0134J c0134j = this.f8643e;
            if (b4 == i9) {
                if (!this.f8648j) {
                    kVar.a(bArr, i8, i9);
                }
                this.f8644f.a(bArr, i8, i9);
                if (c0134j != null) {
                    c0134j.a(bArr, i8, i9);
                    return;
                }
                return;
            }
            int i10 = b4 + 3;
            byte b5 = uVar.f3351a[i10];
            int i11 = b5 & 255;
            int i12 = b4 - i8;
            if (this.f8648j) {
                i4 = i9;
                i5 = i10;
            } else {
                if (i12 > 0) {
                    kVar.a(bArr, i8, b4);
                }
                int i13 = i12 < 0 ? -i12 : 0;
                int i14 = kVar.f8626b;
                if (i14 != 0) {
                    i4 = i9;
                    if (i14 == 1) {
                        i5 = i10;
                        i7 = 0;
                        if (i11 != 181) {
                            AbstractC0108a.s("H263Reader", "Unexpected start code value");
                            kVar.f8625a = false;
                            kVar.f8627c = 0;
                            kVar.f8626b = 0;
                        } else {
                            kVar.f8626b = 2;
                        }
                    } else if (i14 != 2) {
                        i5 = i10;
                        if (i14 != 3) {
                            if (i14 != 4) {
                                throw new IllegalStateException();
                            }
                            if (i11 == 179 || i11 == 181) {
                                kVar.f8627c -= i13;
                                kVar.f8625a = false;
                                y0.F f5 = this.f8647i;
                                int i15 = kVar.f8628d;
                                String str = this.f8646h;
                                str.getClass();
                                byte[] copyOf = Arrays.copyOf(kVar.f8629e, kVar.f8627c);
                                W.t tVar = new W.t(copyOf.length, copyOf);
                                tVar.u(i15);
                                tVar.u(4);
                                tVar.s();
                                tVar.t(8);
                                if (tVar.h()) {
                                    tVar.t(4);
                                    tVar.t(3);
                                }
                                int i16 = tVar.i(4);
                                if (i16 == 15) {
                                    int i17 = tVar.i(8);
                                    int i18 = tVar.i(8);
                                    if (i18 == 0) {
                                        AbstractC0108a.s("H263Reader", "Invalid aspect ratio");
                                        f4 = 1.0f;
                                        if (tVar.h()) {
                                            tVar.t(2);
                                            tVar.t(1);
                                            if (tVar.h()) {
                                                tVar.t(15);
                                                tVar.s();
                                                tVar.t(15);
                                                tVar.s();
                                                tVar.t(15);
                                                tVar.s();
                                                tVar.t(3);
                                                tVar.t(11);
                                                tVar.s();
                                                tVar.t(15);
                                                tVar.s();
                                            }
                                        }
                                        if (tVar.i(2) != 0) {
                                            AbstractC0108a.s("H263Reader", "Unhandled video object layer shape");
                                        }
                                        tVar.s();
                                        int i19 = tVar.i(16);
                                        tVar.s();
                                        if (tVar.h()) {
                                            if (i19 == 0) {
                                                AbstractC0108a.s("H263Reader", "Invalid vop_increment_time_resolution");
                                            } else {
                                                int i20 = 0;
                                                for (int i21 = i19 - 1; i21 > 0; i21 >>= 1) {
                                                    i20++;
                                                }
                                                tVar.t(i20);
                                            }
                                        }
                                        tVar.s();
                                        int i22 = tVar.i(13);
                                        tVar.s();
                                        int i23 = tVar.i(13);
                                        tVar.s();
                                        tVar.s();
                                        C0096n c0096n = new C0096n();
                                        c0096n.f2819a = str;
                                        c0096n.f2830l = T.F.n("video/mp2t");
                                        c0096n.f2831m = T.F.n("video/mp4v-es");
                                        c0096n.f2836t = i22;
                                        c0096n.f2837u = i23;
                                        c0096n.z = f4;
                                        c0096n.f2832p = Collections.singletonList(copyOf);
                                        AbstractC0005f.w(c0096n, f5);
                                        this.f8648j = true;
                                    } else {
                                        f4 = i17 / i18;
                                        if (tVar.h()) {
                                        }
                                        if (tVar.i(2) != 0) {
                                        }
                                        tVar.s();
                                        int i192 = tVar.i(16);
                                        tVar.s();
                                        if (tVar.h()) {
                                        }
                                        tVar.s();
                                        int i222 = tVar.i(13);
                                        tVar.s();
                                        int i232 = tVar.i(13);
                                        tVar.s();
                                        tVar.s();
                                        C0096n c0096n2 = new C0096n();
                                        c0096n2.f2819a = str;
                                        c0096n2.f2830l = T.F.n("video/mp2t");
                                        c0096n2.f2831m = T.F.n("video/mp4v-es");
                                        c0096n2.f2836t = i222;
                                        c0096n2.f2837u = i232;
                                        c0096n2.z = f4;
                                        c0096n2.f2832p = Collections.singletonList(copyOf);
                                        AbstractC0005f.w(c0096n2, f5);
                                        this.f8648j = true;
                                    }
                                } else if (i16 < 7) {
                                    f4 = f8638l[i16];
                                    if (tVar.h()) {
                                    }
                                    if (tVar.i(2) != 0) {
                                    }
                                    tVar.s();
                                    int i1922 = tVar.i(16);
                                    tVar.s();
                                    if (tVar.h()) {
                                    }
                                    tVar.s();
                                    int i2222 = tVar.i(13);
                                    tVar.s();
                                    int i2322 = tVar.i(13);
                                    tVar.s();
                                    tVar.s();
                                    C0096n c0096n22 = new C0096n();
                                    c0096n22.f2819a = str;
                                    c0096n22.f2830l = T.F.n("video/mp2t");
                                    c0096n22.f2831m = T.F.n("video/mp4v-es");
                                    c0096n22.f2836t = i2222;
                                    c0096n22.f2837u = i2322;
                                    c0096n22.z = f4;
                                    c0096n22.f2832p = Collections.singletonList(copyOf);
                                    AbstractC0005f.w(c0096n22, f5);
                                    this.f8648j = true;
                                } else {
                                    AbstractC0108a.s("H263Reader", "Invalid aspect ratio");
                                    f4 = 1.0f;
                                    if (tVar.h()) {
                                    }
                                    if (tVar.i(2) != 0) {
                                    }
                                    tVar.s();
                                    int i19222 = tVar.i(16);
                                    tVar.s();
                                    if (tVar.h()) {
                                    }
                                    tVar.s();
                                    int i22222 = tVar.i(13);
                                    tVar.s();
                                    int i23222 = tVar.i(13);
                                    tVar.s();
                                    tVar.s();
                                    C0096n c0096n222 = new C0096n();
                                    c0096n222.f2819a = str;
                                    c0096n222.f2830l = T.F.n("video/mp2t");
                                    c0096n222.f2831m = T.F.n("video/mp4v-es");
                                    c0096n222.f2836t = i22222;
                                    c0096n222.f2837u = i23222;
                                    c0096n222.z = f4;
                                    c0096n222.f2832p = Collections.singletonList(copyOf);
                                    AbstractC0005f.w(c0096n222, f5);
                                    this.f8648j = true;
                                }
                            } else {
                                i7 = 0;
                            }
                        } else if ((b5 & 240) != 32) {
                            AbstractC0108a.s("H263Reader", "Unexpected start code value");
                            i7 = 0;
                            kVar.f8625a = false;
                            kVar.f8627c = 0;
                            kVar.f8626b = 0;
                        } else {
                            i7 = 0;
                            kVar.f8628d = kVar.f8627c;
                            kVar.f8626b = 4;
                        }
                    } else {
                        i5 = i10;
                        i7 = 0;
                        if (i11 > 31) {
                            AbstractC0108a.s("H263Reader", "Unexpected start code value");
                            kVar.f8625a = false;
                            kVar.f8627c = 0;
                            kVar.f8626b = 0;
                        } else {
                            kVar.f8626b = 3;
                        }
                    }
                } else {
                    i4 = i9;
                    i5 = i10;
                    i7 = 0;
                    if (i11 == 176) {
                        kVar.f8626b = 1;
                        kVar.f8625a = true;
                    }
                }
                kVar.a(k.f8624f, i7, 3);
            }
            this.f8644f.a(bArr, i8, b4);
            if (c0134j != null) {
                if (i12 > 0) {
                    c0134j.a(bArr, i8, b4);
                    i6 = 0;
                } else {
                    i6 = -i12;
                }
                if (c0134j.b(i6)) {
                    int n = X.p.n(c0134j.f3912d, (byte[]) c0134j.f3913e);
                    String str2 = J.f3263a;
                    byte[] bArr2 = (byte[]) c0134j.f3913e;
                    W.u uVar2 = this.f8640b;
                    uVar2.K(n, bArr2);
                    this.f8639a.a(this.f8649k, uVar2);
                }
                if (i11 == 178) {
                    z = true;
                    if (uVar.f3351a[b4 + 2] == 1) {
                        c0134j.e(i11);
                    }
                    int i24 = i4 - b4;
                    this.f8644f.b(i24, this.f8645g - i24, this.f8648j);
                    l lVar = this.f8644f;
                    long j4 = this.f8649k;
                    lVar.f8634e = i11;
                    lVar.f8633d = false;
                    lVar.f8631b = (i11 != 182 || i11 == 179) ? z : false;
                    lVar.f8632c = i11 != 182 ? z : false;
                    lVar.f8635f = 0;
                    lVar.f8637h = j4;
                    i9 = i4;
                    i8 = i5;
                }
            }
            z = true;
            int i242 = i4 - b4;
            this.f8644f.b(i242, this.f8645g - i242, this.f8648j);
            l lVar2 = this.f8644f;
            long j42 = this.f8649k;
            lVar2.f8634e = i11;
            lVar2.f8633d = false;
            lVar2.f8631b = (i11 != 182 || i11 == 179) ? z : false;
            lVar2.f8632c = i11 != 182 ? z : false;
            lVar2.f8635f = 0;
            lVar2.f8637h = j42;
            i9 = i4;
            i8 = i5;
        }
    }

    @Override // f1.h
    public final void b() {
        X.p.a(this.f8641c);
        k kVar = this.f8642d;
        kVar.f8625a = false;
        kVar.f8627c = 0;
        kVar.f8626b = 0;
        l lVar = this.f8644f;
        if (lVar != null) {
            lVar.f8631b = false;
            lVar.f8632c = false;
            lVar.f8633d = false;
            lVar.f8634e = -1;
        }
        C0134J c0134j = this.f8643e;
        if (c0134j != null) {
            c0134j.d();
        }
        this.f8645g = 0L;
        this.f8649k = -9223372036854775807L;
    }

    @Override // f1.h
    public final void c(boolean z) {
        this.f8644f.getClass();
        if (z) {
            this.f8644f.b(0, this.f8645g, this.f8648j);
            l lVar = this.f8644f;
            lVar.f8631b = false;
            lVar.f8632c = false;
            lVar.f8633d = false;
            lVar.f8634e = -1;
        }
    }

    @Override // f1.h
    public final void d(int i4, long j4) {
        this.f8649k = j4;
    }

    @Override // f1.h
    public final void e(y0.p pVar, E e4) {
        e4.a();
        e4.c();
        this.f8646h = (String) e4.f8531e;
        e4.c();
        y0.F z = pVar.z(e4.f8529c, 2);
        this.f8647i = z;
        this.f8644f = new l(z);
        this.f8639a.b(pVar, e4);
    }
}
