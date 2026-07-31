package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.impl.e72;
import com.yandex.mobile.ads.impl.tw1;
import java.io.EOFException;

/* renamed from: com.yandex.mobile.ads.impl.ya, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2363ya implements p70 {

    /* renamed from: d, reason: collision with root package name */
    private final sf1 f34944d;

    /* renamed from: e, reason: collision with root package name */
    private final rf1 f34945e;

    /* renamed from: f, reason: collision with root package name */
    private r70 f34946f;

    /* renamed from: g, reason: collision with root package name */
    private long f34947g;

    /* renamed from: j, reason: collision with root package name */
    private boolean f34950j;

    /* renamed from: k, reason: collision with root package name */
    private boolean f34951k;

    /* renamed from: l, reason: collision with root package name */
    private boolean f34952l;

    /* renamed from: a, reason: collision with root package name */
    private final int f34941a = 0;

    /* renamed from: b, reason: collision with root package name */
    private final C2386za f34942b = new C2386za();

    /* renamed from: c, reason: collision with root package name */
    private final sf1 f34943c = new sf1(com.ironsource.mediationsdk.metadata.a.f17688n);

    /* renamed from: i, reason: collision with root package name */
    private int f34949i = -1;

    /* renamed from: h, reason: collision with root package name */
    private long f34948h = -1;

    static {
        new t70() { // from class: com.yandex.mobile.ads.impl.Pl
            @Override // com.yandex.mobile.ads.impl.t70
            public final p70[] a() {
                p70[] a4;
                a4 = C2363ya.a();
                return a4;
            }
        };
    }

    public C2363ya() {
        sf1 sf1Var = new sf1(10);
        this.f34944d = sf1Var;
        this.f34945e = new rf1(sf1Var.c());
    }

    @Override // com.yandex.mobile.ads.impl.p70
    public final void a(r70 r70Var) {
        this.f34946f = r70Var;
        this.f34942b.a(r70Var, new e72.d(Integer.MIN_VALUE, 0, 1));
        r70Var.a();
    }

    @Override // com.yandex.mobile.ads.impl.p70
    public final void release() {
    }

    private int a(lz lzVar) {
        int i4 = 0;
        while (true) {
            lzVar.b(this.f34944d.c(), 0, 10, false);
            this.f34944d.e(0);
            if (this.f34944d.w() != 4801587) {
                break;
            }
            this.f34944d.f(3);
            int s4 = this.f34944d.s();
            i4 += s4 + 10;
            lzVar.a(false, s4);
        }
        lzVar.c();
        lzVar.a(false, i4);
        if (this.f34948h == -1) {
            this.f34948h = i4;
        }
        return i4;
    }

    @Override // com.yandex.mobile.ads.impl.p70
    public final int a(q70 q70Var, hj1 hj1Var) {
        long j4;
        int i4;
        if (this.f34946f != null) {
            lz lzVar = (lz) q70Var;
            long b4 = lzVar.b();
            int i5 = this.f34941a;
            int i6 = 2;
            if (((i5 & 2) == 0 && ((i5 & 1) == 0 || b4 == -1)) || this.f34950j) {
                j4 = b4;
                i4 = 2;
            } else {
                this.f34949i = -1;
                lzVar.c();
                if (lzVar.a() == 0) {
                    a(lzVar);
                }
                long j5 = 0;
                int i7 = 0;
                while (lzVar.b(this.f34944d.c(), 0, i6, true)) {
                    try {
                        this.f34944d.e(0);
                        if ((this.f34944d.z() & 65526) != 65520) {
                            j4 = b4;
                            i4 = i6;
                            i7 = 0;
                            break;
                        }
                        if (!lzVar.b(this.f34944d.c(), 0, 4, true)) {
                            break;
                        }
                        this.f34945e.c(14);
                        int b5 = this.f34945e.b(13);
                        if (b5 <= 6) {
                            j4 = b4;
                            i4 = i6;
                            this.f34950j = true;
                            throw wf1.a("Malformed ADTS stream", (Exception) null);
                        }
                        j4 = b4;
                        i4 = i6;
                        j5 += b5;
                        i7++;
                        if (i7 == 1000) {
                            break;
                        }
                        try {
                            if (!lzVar.a(true, b5 - 6)) {
                                break;
                            }
                            i6 = i4;
                            b4 = j4;
                        } catch (EOFException unused) {
                        }
                    } catch (EOFException unused2) {
                    }
                }
                j4 = b4;
                i4 = i6;
                lzVar.c();
                if (i7 > 0) {
                    this.f34949i = (int) (j5 / i7);
                } else {
                    this.f34949i = -1;
                }
                this.f34950j = true;
            }
            int read = lzVar.read(this.f34943c.c(), 0, com.ironsource.mediationsdk.metadata.a.f17688n);
            boolean z4 = read == -1;
            if (!this.f34952l) {
                boolean z5 = (this.f34941a & 1) != 0 && this.f34949i > 0;
                if (!z5 || this.f34942b.c() != -9223372036854775807L || z4) {
                    if (z5 && this.f34942b.c() != -9223372036854775807L) {
                        this.f34946f.a(new jr((int) ((this.f34949i * 8000000) / this.f34942b.c()), this.f34949i, j4, this.f34948h, (this.f34941a & i4) != 0));
                    } else {
                        this.f34946f.a(new tw1.b(-9223372036854775807L, 0L));
                    }
                    this.f34952l = true;
                }
            }
            if (z4) {
                return -1;
            }
            this.f34943c.e(0);
            this.f34943c.d(read);
            if (!this.f34951k) {
                this.f34942b.a(4, this.f34947g);
                this.f34951k = true;
            }
            this.f34942b.a(this.f34943c);
            return 0;
        }
        throw new IllegalStateException();
    }

    @Override // com.yandex.mobile.ads.impl.p70
    public final void a(long j4, long j5) {
        this.f34951k = false;
        this.f34942b.a();
        this.f34947g = j5;
    }

    @Override // com.yandex.mobile.ads.impl.p70
    public final boolean a(q70 q70Var) {
        lz lzVar = (lz) q70Var;
        int a4 = a(lzVar);
        int i4 = a4;
        int i5 = 0;
        int i6 = 0;
        do {
            lzVar.b(this.f34944d.c(), 0, 2, false);
            this.f34944d.e(0);
            if ((this.f34944d.z() & 65526) == 65520) {
                i5++;
                if (i5 >= 4 && i6 > 188) {
                    return true;
                }
                lzVar.b(this.f34944d.c(), 0, 4, false);
                this.f34945e.c(14);
                int b4 = this.f34945e.b(13);
                if (b4 <= 6) {
                    i4++;
                    lzVar.c();
                    lzVar.a(false, i4);
                } else {
                    lzVar.a(false, b4 - 6);
                    i6 += b4;
                }
            } else {
                i4++;
                lzVar.c();
                lzVar.a(false, i4);
            }
            i5 = 0;
            i6 = 0;
        } while (i4 - a4 < 8192);
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static p70[] a() {
        return new p70[]{new C2363ya()};
    }
}
