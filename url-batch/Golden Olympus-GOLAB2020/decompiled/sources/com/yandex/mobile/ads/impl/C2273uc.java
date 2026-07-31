package com.yandex.mobile.ads.impl;

import com.huawei.hms.support.api.entity.core.JosStatusCodes;
import com.yandex.mobile.ads.impl.tw1;
import com.yandex.mobile.ads.impl.yb0;
import java.io.EOFException;
import java.util.Arrays;

/* renamed from: com.yandex.mobile.ads.impl.uc, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2273uc implements p70 {

    /* renamed from: p, reason: collision with root package name */
    private static final int[] f33011p;

    /* renamed from: q, reason: collision with root package name */
    private static final int[] f33012q;

    /* renamed from: r, reason: collision with root package name */
    private static final byte[] f33013r;

    /* renamed from: s, reason: collision with root package name */
    private static final byte[] f33014s;

    /* renamed from: t, reason: collision with root package name */
    private static final int f33015t;

    /* renamed from: c, reason: collision with root package name */
    private boolean f33018c;

    /* renamed from: d, reason: collision with root package name */
    private long f33019d;

    /* renamed from: e, reason: collision with root package name */
    private int f33020e;

    /* renamed from: f, reason: collision with root package name */
    private int f33021f;

    /* renamed from: g, reason: collision with root package name */
    private boolean f33022g;

    /* renamed from: h, reason: collision with root package name */
    private long f33023h;

    /* renamed from: j, reason: collision with root package name */
    private int f33025j;

    /* renamed from: k, reason: collision with root package name */
    private long f33026k;

    /* renamed from: l, reason: collision with root package name */
    private r70 f33027l;

    /* renamed from: m, reason: collision with root package name */
    private p52 f33028m;

    /* renamed from: n, reason: collision with root package name */
    private tw1 f33029n;

    /* renamed from: o, reason: collision with root package name */
    private boolean f33030o;

    /* renamed from: b, reason: collision with root package name */
    private final int f33017b = 0;

    /* renamed from: a, reason: collision with root package name */
    private final byte[] f33016a = new byte[1];

    /* renamed from: i, reason: collision with root package name */
    private int f33024i = -1;

    static {
        new t70() { // from class: com.yandex.mobile.ads.impl.Ch
            @Override // com.yandex.mobile.ads.impl.t70
            public final p70[] a() {
                p70[] a4;
                a4 = C2273uc.a();
                return a4;
            }
        };
        f33011p = new int[]{13, 14, 16, 18, 20, 21, 27, 32, 6, 7, 6, 6, 1, 1, 1, 1};
        int[] iArr = {18, 24, 33, 37, 41, 47, 51, 59, 61, 6, 1, 1, 1, 1, 1, 1};
        f33012q = iArr;
        f33013r = u82.c("#!AMR\n");
        f33014s = u82.c("#!AMR-WB\n");
        f33015t = iArr[8];
    }

    @Override // com.yandex.mobile.ads.impl.p70
    public final void a(r70 r70Var) {
        this.f33027l = r70Var;
        this.f33028m = r70Var.a(0, 1);
        r70Var.a();
    }

    @Override // com.yandex.mobile.ads.impl.p70
    public final void release() {
    }

    private int a(lz lzVar) {
        boolean z4;
        lzVar.c();
        lzVar.b(this.f33016a, 0, 1, false);
        byte b4 = this.f33016a[0];
        if ((b4 & 131) > 0) {
            throw wf1.a("Invalid padding bits for frame header " + ((int) b4), (Exception) null);
        }
        int i4 = (b4 >> 3) & 15;
        if (i4 >= 0 && i4 <= 15 && (((z4 = this.f33018c) && (i4 < 10 || i4 > 13)) || (!z4 && (i4 < 12 || i4 > 14)))) {
            return z4 ? f33012q[i4] : f33011p[i4];
        }
        StringBuilder sb = new StringBuilder("Illegal AMR ");
        sb.append(this.f33018c ? "WB" : "NB");
        sb.append(" frame type ");
        sb.append(i4);
        throw wf1.a(sb.toString(), (Exception) null);
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x00e9  */
    @Override // com.yandex.mobile.ads.impl.p70
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int a(q70 q70Var, hj1 hj1Var) {
        int i4;
        int i5;
        if (this.f33028m != null) {
            int i6 = u82.f32873a;
            lz lzVar = (lz) q70Var;
            if (lzVar.a() == 0) {
                byte[] bArr = f33013r;
                lzVar.c();
                byte[] bArr2 = new byte[bArr.length];
                lzVar.b(bArr2, 0, bArr.length, false);
                if (Arrays.equals(bArr2, bArr)) {
                    this.f33018c = false;
                    lzVar.a(bArr.length);
                } else {
                    byte[] bArr3 = f33014s;
                    lzVar.c();
                    byte[] bArr4 = new byte[bArr3.length];
                    lzVar.b(bArr4, 0, bArr3.length, false);
                    if (Arrays.equals(bArr4, bArr3)) {
                        this.f33018c = true;
                        lzVar.a(bArr3.length);
                    } else {
                        throw wf1.a("Could not find AMR header.", (Exception) null);
                    }
                }
            }
            if (!this.f33030o) {
                this.f33030o = true;
                boolean z4 = this.f33018c;
                this.f33028m.a(new yb0.a().e(z4 ? "audio/amr-wb" : "audio/3gpp").h(f33015t).c(1).l(z4 ? 16000 : JosStatusCodes.RTN_CODE_COMMON_ERROR).a());
            }
            if (this.f33021f == 0) {
                try {
                    int a4 = a((lz) q70Var);
                    this.f33020e = a4;
                    this.f33021f = a4;
                    if (this.f33024i == -1) {
                        this.f33023h = lzVar.a();
                        this.f33024i = this.f33020e;
                    }
                    if (this.f33024i == this.f33020e) {
                        this.f33025j++;
                    }
                } catch (EOFException unused) {
                }
            }
            int b4 = this.f33028m.b(q70Var, this.f33021f, true);
            if (b4 != -1) {
                int i7 = this.f33021f - b4;
                this.f33021f = i7;
                if (i7 <= 0) {
                    this.f33028m.a(this.f33026k + this.f33019d, 1, this.f33020e, 0, null);
                    this.f33019d += 20000;
                }
                i4 = 0;
                long b5 = lzVar.b();
                if (!this.f33022g) {
                    int i8 = this.f33017b;
                    if ((i8 & 1) != 0 && b5 != -1 && ((i5 = this.f33024i) == -1 || i5 == this.f33020e)) {
                        if (this.f33025j >= 20 || i4 == -1) {
                            jr jrVar = new jr((int) ((i5 * 8000000) / 20000), i5, b5, this.f33023h, (i8 & 2) != 0);
                            this.f33029n = jrVar;
                            this.f33027l.a(jrVar);
                            this.f33022g = true;
                        }
                    } else {
                        tw1.b bVar = new tw1.b(-9223372036854775807L, 0L);
                        this.f33029n = bVar;
                        this.f33027l.a(bVar);
                        this.f33022g = true;
                    }
                }
                return i4;
            }
            i4 = -1;
            long b52 = lzVar.b();
            if (!this.f33022g) {
            }
            return i4;
        }
        throw new IllegalStateException();
    }

    @Override // com.yandex.mobile.ads.impl.p70
    public final void a(long j4, long j5) {
        this.f33019d = 0L;
        this.f33020e = 0;
        this.f33021f = 0;
        if (j4 != 0) {
            tw1 tw1Var = this.f33029n;
            if (tw1Var instanceof jr) {
                this.f33026k = ((jr) tw1Var).c(j4);
                return;
            }
        }
        this.f33026k = 0L;
    }

    @Override // com.yandex.mobile.ads.impl.p70
    public final boolean a(q70 q70Var) {
        lz lzVar = (lz) q70Var;
        byte[] bArr = f33013r;
        lzVar.c();
        byte[] bArr2 = new byte[bArr.length];
        lzVar.b(bArr2, 0, bArr.length, false);
        if (Arrays.equals(bArr2, bArr)) {
            this.f33018c = false;
            lzVar.a(bArr.length);
            return true;
        }
        byte[] bArr3 = f33014s;
        lzVar.c();
        byte[] bArr4 = new byte[bArr3.length];
        lzVar.b(bArr4, 0, bArr3.length, false);
        if (!Arrays.equals(bArr4, bArr3)) {
            return false;
        }
        this.f33018c = true;
        lzVar.a(bArr3.length);
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static p70[] a() {
        return new p70[]{new C2273uc()};
    }
}
