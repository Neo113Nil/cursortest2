package f1;

import T.C0096n;
import T.C0097o;
import W.J;
import a0.C0134J;
import android.util.Pair;
import java.util.Arrays;
import java.util.Collections;

/* loaded from: classes.dex */
public final class j implements h {

    /* renamed from: r, reason: collision with root package name */
    public static final double[] f8608r = {23.976023976023978d, 24.0d, 25.0d, 29.97002997002997d, 30.0d, 50.0d, 59.94005994005994d, 60.0d};

    /* renamed from: a, reason: collision with root package name */
    public String f8609a;

    /* renamed from: b, reason: collision with root package name */
    public y0.F f8610b;

    /* renamed from: c, reason: collision with root package name */
    public final B f8611c;

    /* renamed from: d, reason: collision with root package name */
    public final String f8612d;

    /* renamed from: e, reason: collision with root package name */
    public final W.u f8613e;

    /* renamed from: f, reason: collision with root package name */
    public final C0134J f8614f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean[] f8615g = new boolean[4];

    /* renamed from: h, reason: collision with root package name */
    public final i f8616h;

    /* renamed from: i, reason: collision with root package name */
    public long f8617i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f8618j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f8619k;

    /* renamed from: l, reason: collision with root package name */
    public long f8620l;

    /* renamed from: m, reason: collision with root package name */
    public long f8621m;
    public long n;
    public long o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f8622p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f8623q;

    public j(B b4, String str) {
        this.f8611c = b4;
        this.f8612d = str;
        i iVar = new i();
        iVar.f8607d = new byte[128];
        this.f8616h = iVar;
        if (b4 != null) {
            this.f8614f = new C0134J(178);
            this.f8613e = new W.u();
        } else {
            this.f8614f = null;
            this.f8613e = null;
        }
        this.f8621m = -9223372036854775807L;
        this.o = -9223372036854775807L;
    }

    /* JADX WARN: Removed duplicated region for block: B:44:0x01ba  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x01d4  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0203  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0205  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x01e9  */
    @Override // f1.h
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(W.u uVar) {
        i iVar;
        C0134J c0134j;
        int i4;
        boolean z;
        long j4;
        long j5;
        boolean z4;
        boolean z5;
        long j6;
        int i5;
        float f4;
        int i6;
        float f5;
        int i7;
        long j7;
        this.f8610b.getClass();
        int i8 = uVar.f3352b;
        int i9 = uVar.f3353c;
        byte[] bArr = uVar.f3351a;
        this.f8617i += uVar.a();
        this.f8610b.a(uVar.a(), uVar);
        while (true) {
            int b4 = X.p.b(bArr, i8, i9, this.f8615g);
            iVar = this.f8616h;
            c0134j = this.f8614f;
            if (b4 == i9) {
                break;
            }
            int i10 = b4 + 3;
            int i11 = uVar.f3351a[i10] & 255;
            int i12 = b4 - i8;
            if (this.f8619k) {
                i4 = i9;
            } else {
                if (i12 > 0) {
                    iVar.a(bArr, i8, b4);
                }
                int i13 = i12 < 0 ? -i12 : 0;
                if (iVar.f8604a) {
                    int i14 = iVar.f8605b - i13;
                    iVar.f8605b = i14;
                    if (iVar.f8606c == 0 && i11 == 181) {
                        iVar.f8606c = i14;
                        i4 = i9;
                    } else {
                        iVar.f8604a = false;
                        String str = this.f8609a;
                        str.getClass();
                        byte[] copyOf = Arrays.copyOf(iVar.f8607d, iVar.f8605b);
                        int i15 = copyOf[4] & 255;
                        byte b5 = copyOf[5];
                        i4 = i9;
                        int i16 = ((b5 & 255) >> 4) | (i15 << 4);
                        int i17 = (copyOf[6] & 255) | ((b5 & 15) << 8);
                        int i18 = (copyOf[7] & 240) >> 4;
                        if (i18 == 2) {
                            f4 = i17 * 4;
                            i6 = i16 * 3;
                        } else if (i18 == 3) {
                            f4 = i17 * 16;
                            i6 = i16 * 9;
                        } else if (i18 != 4) {
                            f5 = 1.0f;
                            C0096n c0096n = new C0096n();
                            c0096n.f2819a = str;
                            c0096n.f2830l = T.F.n(this.f8612d);
                            c0096n.f2831m = T.F.n("video/mpeg2");
                            c0096n.f2836t = i16;
                            c0096n.f2837u = i17;
                            c0096n.z = f5;
                            c0096n.f2832p = Collections.singletonList(copyOf);
                            C0097o c0097o = new C0097o(c0096n);
                            i7 = (copyOf[7] & 15) - 1;
                            if (i7 >= 0 || i7 >= 8) {
                                j7 = 0;
                            } else {
                                double d4 = f8608r[i7];
                                byte b6 = copyOf[iVar.f8606c + 9];
                                int i19 = (b6 & 96) >> 5;
                                if (i19 != (b6 & 31)) {
                                    d4 = ((i19 + 1.0d) / (r6 + 1)) * d4;
                                }
                                j7 = (long) (1000000.0d / d4);
                            }
                            Pair create = Pair.create(c0097o, Long.valueOf(j7));
                            this.f8610b.d((C0097o) create.first);
                            this.f8620l = ((Long) create.second).longValue();
                            this.f8619k = true;
                        } else {
                            f4 = i17 * 121;
                            i6 = i16 * 100;
                        }
                        f5 = f4 / i6;
                        C0096n c0096n2 = new C0096n();
                        c0096n2.f2819a = str;
                        c0096n2.f2830l = T.F.n(this.f8612d);
                        c0096n2.f2831m = T.F.n("video/mpeg2");
                        c0096n2.f2836t = i16;
                        c0096n2.f2837u = i17;
                        c0096n2.z = f5;
                        c0096n2.f2832p = Collections.singletonList(copyOf);
                        C0097o c0097o2 = new C0097o(c0096n2);
                        i7 = (copyOf[7] & 15) - 1;
                        if (i7 >= 0) {
                        }
                        j7 = 0;
                        Pair create2 = Pair.create(c0097o2, Long.valueOf(j7));
                        this.f8610b.d((C0097o) create2.first);
                        this.f8620l = ((Long) create2.second).longValue();
                        this.f8619k = true;
                    }
                } else {
                    i4 = i9;
                    if (i11 == 179) {
                        iVar.f8604a = true;
                    }
                }
                iVar.a(i.f8603e, 0, 3);
            }
            if (c0134j != null) {
                if (i12 > 0) {
                    c0134j.a(bArr, i8, b4);
                    i5 = 0;
                } else {
                    i5 = -i12;
                }
                if (c0134j.b(i5)) {
                    int n = X.p.n(c0134j.f3912d, (byte[]) c0134j.f3913e);
                    String str2 = J.f3263a;
                    byte[] bArr2 = (byte[]) c0134j.f3913e;
                    W.u uVar2 = this.f8613e;
                    uVar2.K(n, bArr2);
                    this.f8611c.a(this.o, uVar2);
                }
                if (i11 == 178) {
                    z = true;
                    if (uVar.f3351a[b4 + 2] == 1) {
                        c0134j.e(i11);
                    }
                    if (i11 != 0 || i11 == 179) {
                        int i20 = i4 - b4;
                        if (this.f8623q && this.f8619k) {
                            j6 = this.o;
                            if (j6 != -9223372036854775807L) {
                                j4 = -9223372036854775807L;
                                this.f8610b.e(j6, this.f8622p ? 1 : 0, ((int) (this.f8617i - this.n)) - i20, i20, null);
                                if (this.f8618j || this.f8623q) {
                                    this.n = this.f8617i - i20;
                                    j5 = this.f8621m;
                                    if (j5 == j4) {
                                        long j8 = this.o;
                                        j5 = j8 != j4 ? j8 + this.f8620l : j4;
                                    }
                                    this.o = j5;
                                    z4 = false;
                                    this.f8622p = false;
                                    this.f8621m = j4;
                                    z5 = true;
                                    this.f8618j = true;
                                } else {
                                    z5 = true;
                                    z4 = false;
                                }
                                this.f8623q = i11 == 0 ? z5 : z4;
                            }
                        }
                        j4 = -9223372036854775807L;
                        if (this.f8618j) {
                        }
                        this.n = this.f8617i - i20;
                        j5 = this.f8621m;
                        if (j5 == j4) {
                        }
                        this.o = j5;
                        z4 = false;
                        this.f8622p = false;
                        this.f8621m = j4;
                        z5 = true;
                        this.f8618j = true;
                        this.f8623q = i11 == 0 ? z5 : z4;
                    } else if (i11 == 184) {
                        this.f8622p = z;
                    }
                    i8 = i10;
                    i9 = i4;
                }
            }
            z = true;
            if (i11 != 0) {
            }
            int i202 = i4 - b4;
            if (this.f8623q) {
                j6 = this.o;
                if (j6 != -9223372036854775807L) {
                }
            }
            j4 = -9223372036854775807L;
            if (this.f8618j) {
            }
            this.n = this.f8617i - i202;
            j5 = this.f8621m;
            if (j5 == j4) {
            }
            this.o = j5;
            z4 = false;
            this.f8622p = false;
            this.f8621m = j4;
            z5 = true;
            this.f8618j = true;
            this.f8623q = i11 == 0 ? z5 : z4;
            i8 = i10;
            i9 = i4;
        }
        if (!this.f8619k) {
            iVar.a(bArr, i8, i9);
        }
        if (c0134j != null) {
            c0134j.a(bArr, i8, i9);
        }
    }

    @Override // f1.h
    public final void b() {
        X.p.a(this.f8615g);
        i iVar = this.f8616h;
        iVar.f8604a = false;
        iVar.f8605b = 0;
        iVar.f8606c = 0;
        C0134J c0134j = this.f8614f;
        if (c0134j != null) {
            c0134j.d();
        }
        this.f8617i = 0L;
        this.f8618j = false;
        this.f8621m = -9223372036854775807L;
        this.o = -9223372036854775807L;
    }

    @Override // f1.h
    public final void c(boolean z) {
        this.f8610b.getClass();
        if (z) {
            boolean z4 = this.f8622p;
            this.f8610b.e(this.o, z4 ? 1 : 0, (int) (this.f8617i - this.n), 0, null);
        }
    }

    @Override // f1.h
    public final void d(int i4, long j4) {
        this.f8621m = j4;
    }

    @Override // f1.h
    public final void e(y0.p pVar, E e4) {
        e4.a();
        e4.c();
        this.f8609a = (String) e4.f8531e;
        e4.c();
        this.f8610b = pVar.z(e4.f8529c, 2);
        B b4 = this.f8611c;
        if (b4 != null) {
            b4.b(pVar, e4);
        }
    }
}
