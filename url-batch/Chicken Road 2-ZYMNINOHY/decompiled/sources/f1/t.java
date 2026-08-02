package f1;

import T.C0096n;
import T.C0097o;
import a.AbstractC0124a;

/* loaded from: classes.dex */
public final class t implements h {

    /* renamed from: a, reason: collision with root package name */
    public final W.u f8739a;

    /* renamed from: b, reason: collision with root package name */
    public final y0.w f8740b;

    /* renamed from: c, reason: collision with root package name */
    public final String f8741c;

    /* renamed from: d, reason: collision with root package name */
    public final int f8742d;

    /* renamed from: e, reason: collision with root package name */
    public final String f8743e;

    /* renamed from: f, reason: collision with root package name */
    public y0.F f8744f;

    /* renamed from: g, reason: collision with root package name */
    public String f8745g;

    /* renamed from: h, reason: collision with root package name */
    public int f8746h = 0;

    /* renamed from: i, reason: collision with root package name */
    public int f8747i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f8748j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f8749k;

    /* renamed from: l, reason: collision with root package name */
    public long f8750l;

    /* renamed from: m, reason: collision with root package name */
    public int f8751m;
    public long n;

    public t(String str, int i4, String str2) {
        W.u uVar = new W.u(4);
        this.f8739a = uVar;
        uVar.f3351a[0] = -1;
        this.f8740b = new y0.w();
        this.n = -9223372036854775807L;
        this.f8741c = str;
        this.f8742d = i4;
        this.f8743e = str2;
    }

    @Override // f1.h
    public final void a(W.u uVar) {
        this.f8744f.getClass();
        while (uVar.a() > 0) {
            int i4 = this.f8746h;
            W.u uVar2 = this.f8739a;
            if (i4 == 0) {
                byte[] bArr = uVar.f3351a;
                int i5 = uVar.f3352b;
                int i6 = uVar.f3353c;
                while (true) {
                    if (i5 >= i6) {
                        uVar.M(i6);
                        break;
                    }
                    byte b4 = bArr[i5];
                    boolean z = (b4 & 255) == 255;
                    boolean z4 = this.f8749k && (b4 & 224) == 224;
                    this.f8749k = z;
                    if (z4) {
                        uVar.M(i5 + 1);
                        this.f8749k = false;
                        uVar2.f3351a[1] = bArr[i5];
                        this.f8747i = 2;
                        this.f8746h = 1;
                        break;
                    }
                    i5++;
                }
            } else if (i4 == 1) {
                int min = Math.min(uVar.a(), 4 - this.f8747i);
                uVar.k(uVar2.f3351a, this.f8747i, min);
                int i7 = this.f8747i + min;
                this.f8747i = i7;
                if (i7 >= 4) {
                    uVar2.M(0);
                    int m4 = uVar2.m();
                    y0.w wVar = this.f8740b;
                    if (wVar.a(m4)) {
                        this.f8751m = wVar.f16216b;
                        if (!this.f8748j) {
                            this.f8750l = (wVar.f16220f * 1000000) / wVar.f16217c;
                            C0096n c0096n = new C0096n();
                            c0096n.f2819a = this.f8745g;
                            c0096n.f2830l = T.F.n(this.f8743e);
                            c0096n.f2831m = T.F.n((String) wVar.f16221g);
                            c0096n.n = 4096;
                            c0096n.f2810E = wVar.f16218d;
                            c0096n.f2811F = wVar.f16217c;
                            c0096n.f2822d = this.f8741c;
                            c0096n.f2824f = this.f8742d;
                            this.f8744f.d(new C0097o(c0096n));
                            this.f8748j = true;
                        }
                        uVar2.M(0);
                        this.f8744f.a(4, uVar2);
                        this.f8746h = 2;
                    } else {
                        this.f8747i = 0;
                        this.f8746h = 1;
                    }
                }
            } else {
                if (i4 != 2) {
                    throw new IllegalStateException();
                }
                int min2 = Math.min(uVar.a(), this.f8751m - this.f8747i);
                this.f8744f.a(min2, uVar);
                int i8 = this.f8747i + min2;
                this.f8747i = i8;
                if (i8 >= this.f8751m) {
                    AbstractC0124a.t(this.n != -9223372036854775807L);
                    this.f8744f.e(this.n, 1, this.f8751m, 0, null);
                    this.n += this.f8750l;
                    this.f8747i = 0;
                    this.f8746h = 0;
                }
            }
        }
    }

    @Override // f1.h
    public final void b() {
        this.f8746h = 0;
        this.f8747i = 0;
        this.f8749k = false;
        this.n = -9223372036854775807L;
    }

    @Override // f1.h
    public final void d(int i4, long j4) {
        this.n = j4;
    }

    @Override // f1.h
    public final void e(y0.p pVar, E e4) {
        e4.a();
        e4.c();
        this.f8745g = (String) e4.f8531e;
        e4.c();
        this.f8744f = pVar.z(e4.f8529c, 1);
    }

    @Override // f1.h
    public final void c(boolean z) {
    }
}
