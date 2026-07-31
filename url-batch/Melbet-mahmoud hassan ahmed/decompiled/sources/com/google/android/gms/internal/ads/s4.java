package com.google.android.gms.internal.ads;

import android.net.Uri;
import android.util.Log;
import android.util.Pair;
import java.util.Map;

/* loaded from: classes.dex */
public final class s4 implements oc4 {

    /* renamed from: f, reason: collision with root package name */
    public static final vc4 f11650f = new vc4() { // from class: com.google.android.gms.internal.ads.o4
        @Override // com.google.android.gms.internal.ads.vc4
        public final /* synthetic */ oc4[] a(Uri uri, Map map) {
            return uc4.a(this, uri, map);
        }

        @Override // com.google.android.gms.internal.ads.vc4
        public final oc4[] zza() {
            vc4 vc4Var = s4.f11650f;
            return new oc4[]{new s4()};
        }
    };

    /* renamed from: a, reason: collision with root package name */
    private rc4 f11651a;

    /* renamed from: b, reason: collision with root package name */
    private td4 f11652b;

    /* renamed from: c, reason: collision with root package name */
    private q4 f11653c;

    /* renamed from: d, reason: collision with root package name */
    private int f11654d = -1;

    /* renamed from: e, reason: collision with root package name */
    private long f11655e = -1;

    @Override // com.google.android.gms.internal.ads.oc4
    public final boolean c(pc4 pc4Var) {
        return v4.a(pc4Var) != null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0052, code lost:
    
        if (r15 != 65534) goto L22;
     */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0071  */
    @Override // com.google.android.gms.internal.ads.oc4
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int e(pc4 pc4Var, md4 md4Var) {
        int R;
        q4 r4Var;
        wu1.b(this.f11652b);
        int i7 = n13.f8865a;
        if (this.f11653c == null) {
            t4 a7 = v4.a(pc4Var);
            if (a7 == null) {
                throw dz.a("Unsupported or unrecognized wav header.", null);
            }
            int i8 = a7.f12071a;
            if (i8 == 17) {
                r4Var = new p4(this.f11651a, this.f11652b, a7);
            } else if (i8 == 6) {
                r4Var = new r4(this.f11651a, this.f11652b, a7, "audio/g711-alaw", -1);
            } else if (i8 == 7) {
                r4Var = new r4(this.f11651a, this.f11652b, a7, "audio/g711-mlaw", -1);
            } else {
                int i9 = a7.f12075e;
                if (i8 != 1) {
                    if (i8 == 3) {
                        if (i9 == 32) {
                            R = 4;
                            if (R == 0) {
                                int i10 = a7.f12071a;
                                StringBuilder sb = new StringBuilder(40);
                                sb.append("Unsupported WAV format type: ");
                                sb.append(i10);
                                throw dz.c(sb.toString());
                            }
                            r4Var = new r4(this.f11651a, this.f11652b, a7, "audio/raw", R);
                        }
                    }
                    R = 0;
                    if (R == 0) {
                    }
                }
                R = n13.R(i9);
                if (R == 0) {
                }
            }
            this.f11653c = r4Var;
        }
        if (this.f11654d == -1) {
            pc4Var.i();
            dr2 dr2Var = new dr2(8);
            while (true) {
                u4 a8 = u4.a(pc4Var, dr2Var);
                int i11 = a8.f12625a;
                if (i11 != 1684108385) {
                    if (i11 != 1380533830 && i11 != 1718449184) {
                        StringBuilder sb2 = new StringBuilder(39);
                        sb2.append("Ignoring unknown WAV chunk: ");
                        sb2.append(i11);
                        Log.w("WavHeaderReader", sb2.toString());
                    }
                    long j7 = a8.f12626b + 8;
                    int i12 = a8.f12625a;
                    if (i12 == 1380533830) {
                        j7 = 12;
                    }
                    if (j7 > 2147483647L) {
                        StringBuilder sb3 = new StringBuilder(51);
                        sb3.append("Chunk is too large (~2GB+) to skip; id: ");
                        sb3.append(i12);
                        throw dz.c(sb3.toString());
                    }
                    ((jc4) pc4Var).p((int) j7, false);
                } else {
                    ((jc4) pc4Var).p(8, false);
                    long b7 = pc4Var.b();
                    long j8 = a8.f12626b + b7;
                    long c7 = pc4Var.c();
                    if (c7 != -1 && j8 > c7) {
                        StringBuilder sb4 = new StringBuilder(69);
                        sb4.append("Data exceeds input length: ");
                        sb4.append(j8);
                        sb4.append(", ");
                        sb4.append(c7);
                        Log.w("WavHeaderReader", sb4.toString());
                        j8 = c7;
                    }
                    Pair create = Pair.create(Long.valueOf(b7), Long.valueOf(j8));
                    this.f11654d = ((Long) create.first).intValue();
                    long longValue = ((Long) create.second).longValue();
                    this.f11655e = longValue;
                    this.f11653c.b(this.f11654d, longValue);
                }
            }
        } else if (pc4Var.b() == 0) {
            ((jc4) pc4Var).p(this.f11654d, false);
        }
        wu1.f(this.f11655e != -1);
        return this.f11653c.c(pc4Var, this.f11655e - pc4Var.b()) ? -1 : 0;
    }

    @Override // com.google.android.gms.internal.ads.oc4
    public final void g(rc4 rc4Var) {
        this.f11651a = rc4Var;
        this.f11652b = rc4Var.r(0, 1);
        rc4Var.H();
    }

    @Override // com.google.android.gms.internal.ads.oc4
    public final void h(long j7, long j8) {
        q4 q4Var = this.f11653c;
        if (q4Var != null) {
            q4Var.a(j8);
        }
    }
}
