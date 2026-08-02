package f1;

import T.C0096n;
import T.C0097o;
import a.AbstractC0124a;
import java.util.Objects;
import y0.AbstractC1569a;
import y0.C1570b;

/* renamed from: f1.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0414b implements h {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f8535a;

    /* renamed from: b, reason: collision with root package name */
    public final W.t f8536b;

    /* renamed from: c, reason: collision with root package name */
    public final W.u f8537c;

    /* renamed from: d, reason: collision with root package name */
    public final String f8538d;

    /* renamed from: e, reason: collision with root package name */
    public final int f8539e;

    /* renamed from: f, reason: collision with root package name */
    public final String f8540f;

    /* renamed from: g, reason: collision with root package name */
    public String f8541g;

    /* renamed from: h, reason: collision with root package name */
    public y0.F f8542h;

    /* renamed from: i, reason: collision with root package name */
    public int f8543i;

    /* renamed from: j, reason: collision with root package name */
    public int f8544j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f8545k;

    /* renamed from: l, reason: collision with root package name */
    public long f8546l;

    /* renamed from: m, reason: collision with root package name */
    public C0097o f8547m;
    public int n;
    public long o;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C0414b(String str) {
        this(0, 0, null, str);
        this.f8535a = 0;
    }

    @Override // f1.h
    public final void a(W.u uVar) {
        switch (this.f8535a) {
            case 0:
                this.f8542h.getClass();
                while (uVar.a() > 0) {
                    int i4 = this.f8543i;
                    W.u uVar2 = this.f8537c;
                    if (i4 == 0) {
                        while (true) {
                            if (uVar.a() <= 0) {
                                break;
                            }
                            if (this.f8545k) {
                                int z = uVar.z();
                                if (z == 119) {
                                    this.f8545k = false;
                                    this.f8543i = 1;
                                    byte[] bArr = uVar2.f3351a;
                                    bArr[0] = 11;
                                    bArr[1] = 119;
                                    this.f8544j = 2;
                                } else {
                                    this.f8545k = z == 11;
                                }
                            } else {
                                this.f8545k = uVar.z() == 11;
                            }
                        }
                    } else if (i4 == 1) {
                        byte[] bArr2 = uVar2.f3351a;
                        int min = Math.min(uVar.a(), 128 - this.f8544j);
                        uVar.k(bArr2, this.f8544j, min);
                        int i5 = this.f8544j + min;
                        this.f8544j = i5;
                        if (i5 == 128) {
                            W.t tVar = this.f8536b;
                            tVar.q(0);
                            C1570b q4 = AbstractC1569a.q(tVar);
                            int i6 = q4.f16122f;
                            int i7 = q4.f16118b;
                            int i8 = q4.f16119c;
                            String str = q4.f16117a;
                            C0097o c0097o = this.f8547m;
                            if (c0097o == null || i8 != c0097o.f2846F || i7 != c0097o.f2847G || !Objects.equals(str, c0097o.n)) {
                                C0096n c0096n = new C0096n();
                                c0096n.f2819a = this.f8541g;
                                c0096n.f2830l = T.F.n(this.f8540f);
                                c0096n.f2831m = T.F.n(str);
                                c0096n.f2810E = i8;
                                c0096n.f2811F = i7;
                                c0096n.f2822d = this.f8538d;
                                c0096n.f2824f = this.f8539e;
                                c0096n.f2827i = i6;
                                if ("audio/ac3".equals(str)) {
                                    c0096n.f2826h = i6;
                                }
                                C0097o c0097o2 = new C0097o(c0096n);
                                this.f8547m = c0097o2;
                                this.f8542h.d(c0097o2);
                            }
                            this.n = q4.f16120d;
                            this.f8546l = (q4.f16121e * 1000000) / this.f8547m.f2847G;
                            uVar2.M(0);
                            this.f8542h.a(128, uVar2);
                            this.f8543i = 2;
                        }
                    } else if (i4 == 2) {
                        int min2 = Math.min(uVar.a(), this.n - this.f8544j);
                        this.f8542h.a(min2, uVar);
                        int i9 = this.f8544j + min2;
                        this.f8544j = i9;
                        if (i9 == this.n) {
                            AbstractC0124a.t(this.o != -9223372036854775807L);
                            this.f8542h.e(this.o, 1, this.n, 0, null);
                            this.o += this.f8546l;
                            this.f8543i = 0;
                        }
                    }
                }
                break;
            default:
                this.f8542h.getClass();
                while (uVar.a() > 0) {
                    int i10 = this.f8543i;
                    W.u uVar3 = this.f8537c;
                    if (i10 == 0) {
                        while (uVar.a() > 0) {
                            if (this.f8545k) {
                                int z4 = uVar.z();
                                this.f8545k = z4 == 172;
                                if (z4 == 64 || z4 == 65) {
                                    boolean z5 = z4 == 65;
                                    this.f8543i = 1;
                                    byte[] bArr3 = uVar3.f3351a;
                                    bArr3[0] = -84;
                                    bArr3[1] = (byte) (z5 ? 65 : 64);
                                    this.f8544j = 2;
                                }
                            } else {
                                this.f8545k = uVar.z() == 172;
                            }
                        }
                    } else if (i10 == 1) {
                        byte[] bArr4 = uVar3.f3351a;
                        int min3 = Math.min(uVar.a(), 16 - this.f8544j);
                        uVar.k(bArr4, this.f8544j, min3);
                        int i11 = this.f8544j + min3;
                        this.f8544j = i11;
                        if (i11 == 16) {
                            W.t tVar2 = this.f8536b;
                            tVar2.q(0);
                            A0.c r4 = AbstractC1569a.r(tVar2);
                            int i12 = r4.f9a;
                            C0097o c0097o3 = this.f8547m;
                            if (c0097o3 == null || 2 != c0097o3.f2846F || i12 != c0097o3.f2847G || !"audio/ac4".equals(c0097o3.n)) {
                                C0096n c0096n2 = new C0096n();
                                c0096n2.f2819a = this.f8541g;
                                c0096n2.f2830l = T.F.n(this.f8540f);
                                c0096n2.f2831m = T.F.n("audio/ac4");
                                c0096n2.f2810E = 2;
                                c0096n2.f2811F = i12;
                                c0096n2.f2822d = this.f8538d;
                                c0096n2.f2824f = this.f8539e;
                                C0097o c0097o4 = new C0097o(c0096n2);
                                this.f8547m = c0097o4;
                                this.f8542h.d(c0097o4);
                            }
                            this.n = r4.f10b;
                            this.f8546l = (r4.f11c * 1000000) / this.f8547m.f2847G;
                            uVar3.M(0);
                            this.f8542h.a(16, uVar3);
                            this.f8543i = 2;
                        }
                    } else if (i10 == 2) {
                        int min4 = Math.min(uVar.a(), this.n - this.f8544j);
                        this.f8542h.a(min4, uVar);
                        int i13 = this.f8544j + min4;
                        this.f8544j = i13;
                        if (i13 == this.n) {
                            AbstractC0124a.t(this.o != -9223372036854775807L);
                            this.f8542h.e(this.o, 1, this.n, 0, null);
                            this.o += this.f8546l;
                            this.f8543i = 0;
                        }
                    }
                }
                break;
        }
    }

    @Override // f1.h
    public final void b() {
        switch (this.f8535a) {
            case 0:
                this.f8543i = 0;
                this.f8544j = 0;
                this.f8545k = false;
                this.o = -9223372036854775807L;
                break;
            default:
                this.f8543i = 0;
                this.f8544j = 0;
                this.f8545k = false;
                this.o = -9223372036854775807L;
                break;
        }
    }

    @Override // f1.h
    public final void c(boolean z) {
        int i4 = this.f8535a;
    }

    @Override // f1.h
    public final void d(int i4, long j4) {
        switch (this.f8535a) {
            case 0:
                this.o = j4;
                break;
            default:
                this.o = j4;
                break;
        }
    }

    @Override // f1.h
    public final void e(y0.p pVar, E e4) {
        switch (this.f8535a) {
            case 0:
                e4.a();
                e4.c();
                this.f8541g = (String) e4.f8531e;
                e4.c();
                this.f8542h = pVar.z(e4.f8529c, 1);
                break;
            default:
                e4.a();
                e4.c();
                this.f8541g = (String) e4.f8531e;
                e4.c();
                this.f8542h = pVar.z(e4.f8529c, 1);
                break;
        }
    }

    public C0414b(int i4, int i5, String str, String str2) {
        this.f8535a = i5;
        switch (i5) {
            case 1:
                W.t tVar = new W.t(16, new byte[16]);
                this.f8536b = tVar;
                this.f8537c = new W.u(tVar.f3345d);
                this.f8543i = 0;
                this.f8544j = 0;
                this.f8545k = false;
                this.o = -9223372036854775807L;
                this.f8538d = str;
                this.f8539e = i4;
                this.f8540f = str2;
                break;
            default:
                W.t tVar2 = new W.t(128, new byte[128]);
                this.f8536b = tVar2;
                this.f8537c = new W.u(tVar2.f3345d);
                this.f8543i = 0;
                this.o = -9223372036854775807L;
                this.f8538d = str;
                this.f8539e = i4;
                this.f8540f = str2;
                break;
        }
    }

    private final void f(boolean z) {
    }

    private final void g(boolean z) {
    }
}
