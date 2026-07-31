package com.google.android.gms.internal.ads;

import android.net.Uri;
import java.io.EOFException;
import java.util.Arrays;
import java.util.Map;

/* loaded from: classes.dex */
public final class be4 implements oc4 {

    /* renamed from: p, reason: collision with root package name */
    private static final int[] f3368p;

    /* renamed from: s, reason: collision with root package name */
    private static final int f3371s;

    /* renamed from: b, reason: collision with root package name */
    private boolean f3373b;

    /* renamed from: c, reason: collision with root package name */
    private long f3374c;

    /* renamed from: d, reason: collision with root package name */
    private int f3375d;

    /* renamed from: e, reason: collision with root package name */
    private int f3376e;

    /* renamed from: f, reason: collision with root package name */
    private boolean f3377f;

    /* renamed from: h, reason: collision with root package name */
    private int f3379h;

    /* renamed from: i, reason: collision with root package name */
    private long f3380i;

    /* renamed from: j, reason: collision with root package name */
    private rc4 f3381j;

    /* renamed from: k, reason: collision with root package name */
    private td4 f3382k;

    /* renamed from: l, reason: collision with root package name */
    private pd4 f3383l;

    /* renamed from: m, reason: collision with root package name */
    private boolean f3384m;

    /* renamed from: n, reason: collision with root package name */
    public static final vc4 f3366n = new vc4() { // from class: com.google.android.gms.internal.ads.zd4
        @Override // com.google.android.gms.internal.ads.vc4
        public final /* synthetic */ oc4[] a(Uri uri, Map map) {
            return uc4.a(this, uri, map);
        }

        @Override // com.google.android.gms.internal.ads.vc4
        public final oc4[] zza() {
            vc4 vc4Var = be4.f3366n;
            return new oc4[]{new be4(0)};
        }
    };

    /* renamed from: o, reason: collision with root package name */
    private static final int[] f3367o = {13, 14, 16, 18, 20, 21, 27, 32, 6, 7, 6, 6, 1, 1, 1, 1};

    /* renamed from: q, reason: collision with root package name */
    private static final byte[] f3369q = n13.w("#!AMR\n");

    /* renamed from: r, reason: collision with root package name */
    private static final byte[] f3370r = n13.w("#!AMR-WB\n");

    /* renamed from: a, reason: collision with root package name */
    private final byte[] f3372a = new byte[1];

    /* renamed from: g, reason: collision with root package name */
    private int f3378g = -1;

    static {
        int[] iArr = {18, 24, 33, 37, 41, 47, 51, 59, 61, 6, 1, 1, 1, 1, 1, 1};
        f3368p = iArr;
        f3371s = iArr[8];
    }

    public be4(int i7) {
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0039 A[Catch: EOFException -> 0x0098, TryCatch #0 {EOFException -> 0x0098, blocks: (B:13:0x0007, B:15:0x001b, B:23:0x0039, B:24:0x0042, B:30:0x003e, B:40:0x005c, B:41:0x007f, B:42:0x0080, B:43:0x0097), top: B:12:0x0007 }] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x003e A[Catch: EOFException -> 0x0098, TryCatch #0 {EOFException -> 0x0098, blocks: (B:13:0x0007, B:15:0x001b, B:23:0x0039, B:24:0x0042, B:30:0x003e, B:40:0x005c, B:41:0x007f, B:42:0x0080, B:43:0x0097), top: B:12:0x0007 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final int a(pc4 pc4Var) {
        int i7;
        int i8 = this.f3376e;
        if (i8 == 0) {
            try {
                pc4Var.i();
                ((jc4) pc4Var).n(this.f3372a, 0, 1, false);
                byte b7 = this.f3372a[0];
                if ((b7 & 131) > 0) {
                    StringBuilder sb = new StringBuilder(42);
                    sb.append("Invalid padding bits for frame header ");
                    sb.append((int) b7);
                    throw dz.a(sb.toString(), null);
                }
                int i9 = (b7 >> 3) & 15;
                boolean z6 = this.f3373b;
                if (z6) {
                    if (i9 >= 10) {
                        if (i9 > 13) {
                        }
                    }
                    i8 = !z6 ? f3368p[i9] : f3367o[i9];
                    this.f3375d = i8;
                    this.f3376e = i8;
                    i7 = this.f3378g;
                    if (i7 == -1) {
                        this.f3378g = i8;
                        i7 = i8;
                    }
                    if (i7 == i8) {
                        this.f3379h++;
                    }
                }
                if (!z6) {
                    if (i9 >= 12 && i9 <= 14) {
                    }
                    if (!z6) {
                    }
                    this.f3375d = i8;
                    this.f3376e = i8;
                    i7 = this.f3378g;
                    if (i7 == -1) {
                    }
                    if (i7 == i8) {
                    }
                }
                String str = true != z6 ? "NB" : "WB";
                StringBuilder sb2 = new StringBuilder(str.length() + 35);
                sb2.append("Illegal AMR ");
                sb2.append(str);
                sb2.append(" frame type ");
                sb2.append(i9);
                throw dz.a(sb2.toString(), null);
            } catch (EOFException unused) {
                return -1;
            }
        }
        int a7 = rd4.a(this.f3382k, pc4Var, i8, true);
        if (a7 == -1) {
            return -1;
        }
        int i10 = this.f3376e - a7;
        this.f3376e = i10;
        if (i10 > 0) {
            return 0;
        }
        this.f3382k.a(this.f3374c, 1, this.f3375d, 0, null);
        this.f3374c += 20000;
        return 0;
    }

    private static boolean b(pc4 pc4Var, byte[] bArr) {
        pc4Var.i();
        int length = bArr.length;
        byte[] bArr2 = new byte[length];
        ((jc4) pc4Var).n(bArr2, 0, length, false);
        return Arrays.equals(bArr2, bArr);
    }

    private final boolean d(pc4 pc4Var) {
        int length;
        byte[] bArr = f3369q;
        if (b(pc4Var, bArr)) {
            this.f3373b = false;
            length = bArr.length;
        } else {
            byte[] bArr2 = f3370r;
            if (!b(pc4Var, bArr2)) {
                return false;
            }
            this.f3373b = true;
            length = bArr2.length;
        }
        ((jc4) pc4Var).p(length, false);
        return true;
    }

    @Override // com.google.android.gms.internal.ads.oc4
    public final boolean c(pc4 pc4Var) {
        return d(pc4Var);
    }

    @Override // com.google.android.gms.internal.ads.oc4
    public final int e(pc4 pc4Var, md4 md4Var) {
        wu1.b(this.f3382k);
        int i7 = n13.f8865a;
        if (pc4Var.b() == 0 && !d(pc4Var)) {
            throw dz.a("Could not find AMR header.", null);
        }
        if (!this.f3384m) {
            this.f3384m = true;
            boolean z6 = this.f3373b;
            String str = true != z6 ? "audio/3gpp" : "audio/amr-wb";
            int i8 = true != z6 ? 8000 : 16000;
            td4 td4Var = this.f3382k;
            bf4 bf4Var = new bf4();
            bf4Var.s(str);
            bf4Var.l(f3371s);
            bf4Var.e0(1);
            bf4Var.t(i8);
            td4Var.b(bf4Var.y());
        }
        int a7 = a(pc4Var);
        if (this.f3377f) {
            return a7;
        }
        od4 od4Var = new od4(-9223372036854775807L, 0L);
        this.f3383l = od4Var;
        this.f3381j.p(od4Var);
        this.f3377f = true;
        return a7;
    }

    @Override // com.google.android.gms.internal.ads.oc4
    public final void g(rc4 rc4Var) {
        this.f3381j = rc4Var;
        this.f3382k = rc4Var.r(0, 1);
        rc4Var.H();
    }

    @Override // com.google.android.gms.internal.ads.oc4
    public final void h(long j7, long j8) {
        this.f3374c = 0L;
        this.f3375d = 0;
        this.f3376e = 0;
        this.f3380i = 0L;
    }
}
