package com.google.android.gms.internal.ads;

import android.annotation.TargetApi;
import android.content.Context;
import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Handler;
import android.os.SystemClock;
import android.util.Log;
import android.view.Surface;
import java.nio.ByteBuffer;

@TargetApi(16)
/* loaded from: classes.dex */
public final class in extends zi {
    private final Context Q;
    private final kn R;
    private final sn S;
    private final boolean T;
    private final long[] U;
    private xe[] V;
    private hn W;
    private Surface X;
    private Surface Y;
    private boolean Z;

    /* renamed from: a0, reason: collision with root package name */
    private long f6691a0;

    /* renamed from: b0, reason: collision with root package name */
    private long f6692b0;

    /* renamed from: c0, reason: collision with root package name */
    private int f6693c0;

    /* renamed from: d0, reason: collision with root package name */
    private int f6694d0;

    /* renamed from: e0, reason: collision with root package name */
    private int f6695e0;

    /* renamed from: f0, reason: collision with root package name */
    private float f6696f0;

    /* renamed from: g0, reason: collision with root package name */
    private int f6697g0;

    /* renamed from: h0, reason: collision with root package name */
    private int f6698h0;

    /* renamed from: i0, reason: collision with root package name */
    private int f6699i0;

    /* renamed from: j0, reason: collision with root package name */
    private float f6700j0;

    /* renamed from: k0, reason: collision with root package name */
    private int f6701k0;

    /* renamed from: l0, reason: collision with root package name */
    private int f6702l0;

    /* renamed from: m0, reason: collision with root package name */
    private int f6703m0;

    /* renamed from: n0, reason: collision with root package name */
    private float f6704n0;

    /* renamed from: o0, reason: collision with root package name */
    private long f6705o0;

    /* renamed from: p0, reason: collision with root package name */
    private int f6706p0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public in(Context context, bj bjVar, long j7, Handler handler, tn tnVar, int i7) {
        super(2, bjVar, null, false);
        boolean z6 = false;
        this.Q = context.getApplicationContext();
        this.R = new kn(context);
        this.S = new sn(handler, tnVar);
        if (zm.f15186a <= 22 && "foster".equals(zm.f15187b) && "NVIDIA".equals(zm.f15188c)) {
            z6 = true;
        }
        this.T = z6;
        this.U = new long[10];
        this.f6705o0 = -9223372036854775807L;
        this.f6691a0 = -9223372036854775807L;
        this.f6697g0 = -1;
        this.f6698h0 = -1;
        this.f6700j0 = -1.0f;
        this.f6696f0 = -1.0f;
        f0();
    }

    private static int e0(xe xeVar) {
        int i7 = xeVar.f14172r;
        if (i7 == -1) {
            return 0;
        }
        return i7;
    }

    private final void f0() {
        this.f6701k0 = -1;
        this.f6702l0 = -1;
        this.f6704n0 = -1.0f;
        this.f6703m0 = -1;
    }

    private final void g0() {
        if (this.f6693c0 > 0) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            this.S.d(this.f6693c0, elapsedRealtime - this.f6692b0);
            this.f6693c0 = 0;
            this.f6692b0 = elapsedRealtime;
        }
    }

    private final void h0() {
        int i7 = this.f6701k0;
        int i8 = this.f6697g0;
        if (i7 == i8 && this.f6702l0 == this.f6698h0 && this.f6703m0 == this.f6699i0 && this.f6704n0 == this.f6700j0) {
            return;
        }
        this.S.h(i8, this.f6698h0, this.f6699i0, this.f6700j0);
        this.f6701k0 = this.f6697g0;
        this.f6702l0 = this.f6698h0;
        this.f6703m0 = this.f6699i0;
        this.f6704n0 = this.f6700j0;
    }

    private final void i0() {
        if (this.f6701k0 == -1 && this.f6702l0 == -1) {
            return;
        }
        this.S.h(this.f6697g0, this.f6698h0, this.f6699i0, this.f6700j0);
    }

    private static boolean j0(long j7) {
        return j7 < -30000;
    }

    private final boolean k0(boolean z6) {
        return zm.f15186a >= 23 && (!z6 || fn.c(this.Q));
    }

    @Override // com.google.android.gms.internal.ads.zi, com.google.android.gms.internal.ads.cf
    public final boolean A() {
        Surface surface;
        if (super.A() && (this.Z || (((surface = this.Y) != null && this.X == surface) || O() == null))) {
            this.f6691a0 = -9223372036854775807L;
            return true;
        }
        if (this.f6691a0 == -9223372036854775807L) {
            return false;
        }
        if (SystemClock.elapsedRealtime() < this.f6691a0) {
            return true;
        }
        this.f6691a0 = -9223372036854775807L;
        return false;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // com.google.android.gms.internal.ads.zi
    protected final void E(xi xiVar, MediaCodec mediaCodec, xe xeVar, MediaCrypto mediaCrypto) {
        char c7;
        int i7;
        xe[] xeVarArr = this.V;
        int i8 = xeVar.f14169o;
        int i9 = xeVar.f14170p;
        int i10 = xeVar.f14166l;
        if (i10 == -1) {
            String str = xeVar.f14165k;
            if (i8 != -1 && i9 != -1) {
                int i11 = 4;
                switch (str.hashCode()) {
                    case -1664118616:
                        if (str.equals("video/3gpp")) {
                            c7 = 0;
                            break;
                        }
                        c7 = 65535;
                        break;
                    case -1662541442:
                        if (str.equals("video/hevc")) {
                            c7 = 4;
                            break;
                        }
                        c7 = 65535;
                        break;
                    case 1187890754:
                        if (str.equals("video/mp4v-es")) {
                            c7 = 1;
                            break;
                        }
                        c7 = 65535;
                        break;
                    case 1331836730:
                        if (str.equals("video/avc")) {
                            c7 = 2;
                            break;
                        }
                        c7 = 65535;
                        break;
                    case 1599127256:
                        if (str.equals("video/x-vnd.on2.vp8")) {
                            c7 = 3;
                            break;
                        }
                        c7 = 65535;
                        break;
                    case 1599127257:
                        if (str.equals("video/x-vnd.on2.vp9")) {
                            c7 = 5;
                            break;
                        }
                        c7 = 65535;
                        break;
                    default:
                        c7 = 65535;
                        break;
                }
                if (c7 != 0 && c7 != 1) {
                    if (c7 != 2) {
                        if (c7 != 3) {
                            if (c7 == 4 || c7 == 5) {
                                i7 = i8 * i9;
                                i10 = (i7 * 3) / (i11 + i11);
                            }
                        }
                    } else if (!"BRAVIA 4K 2015".equals(zm.f15189d)) {
                        i7 = zm.d(i8, 16) * zm.d(i9, 16) * 256;
                        i11 = 2;
                        i10 = (i7 * 3) / (i11 + i11);
                    }
                }
                i7 = i8 * i9;
                i11 = 2;
                i10 = (i7 * 3) / (i11 + i11);
            }
            i10 = -1;
        }
        int length = xeVarArr.length;
        hn hnVar = new hn(i8, i9, i10);
        this.W = hnVar;
        boolean z6 = this.T;
        MediaFormat c8 = xeVar.c();
        c8.setInteger("max-width", hnVar.f6351a);
        c8.setInteger("max-height", hnVar.f6352b);
        int i12 = hnVar.f6353c;
        if (i12 != -1) {
            c8.setInteger("max-input-size", i12);
        }
        if (z6) {
            c8.setInteger("auto-frc", 0);
        }
        if (this.X == null) {
            jm.e(k0(xiVar.f14219d));
            if (this.Y == null) {
                this.Y = fn.a(this.Q, xiVar.f14219d);
            }
            this.X = this.Y;
        }
        mediaCodec.configure(c8, this.X, (MediaCrypto) null, 0);
        int i13 = zm.f15186a;
    }

    @Override // com.google.android.gms.internal.ads.zi
    protected final void F(String str, long j7, long j8) {
        this.S.b(str, j7, j8);
    }

    @Override // com.google.android.gms.internal.ads.zi
    protected final void I(xe xeVar) {
        super.I(xeVar);
        this.S.f(xeVar);
        float f7 = xeVar.f14173s;
        if (f7 == -1.0f) {
            f7 = 1.0f;
        }
        this.f6696f0 = f7;
        this.f6695e0 = e0(xeVar);
    }

    @Override // com.google.android.gms.internal.ads.zi
    protected final void J(MediaCodec mediaCodec, MediaFormat mediaFormat) {
        boolean z6 = false;
        if (mediaFormat.containsKey("crop-right") && mediaFormat.containsKey("crop-left") && mediaFormat.containsKey("crop-bottom") && mediaFormat.containsKey("crop-top")) {
            z6 = true;
        }
        this.f6697g0 = z6 ? (mediaFormat.getInteger("crop-right") - mediaFormat.getInteger("crop-left")) + 1 : mediaFormat.getInteger("width");
        int integer = z6 ? (mediaFormat.getInteger("crop-bottom") - mediaFormat.getInteger("crop-top")) + 1 : mediaFormat.getInteger("height");
        this.f6698h0 = integer;
        float f7 = this.f6696f0;
        this.f6700j0 = f7;
        if (zm.f15186a >= 21) {
            int i7 = this.f6695e0;
            if (i7 == 90 || i7 == 270) {
                int i8 = this.f6697g0;
                this.f6697g0 = integer;
                this.f6698h0 = i8;
                this.f6700j0 = 1.0f / f7;
            }
        } else {
            this.f6699i0 = this.f6695e0;
        }
        mediaCodec.setVideoScalingMode(1);
    }

    @Override // com.google.android.gms.internal.ads.zi
    protected final boolean N(long j7, long j8, MediaCodec mediaCodec, ByteBuffer byteBuffer, int i7, int i8, long j9, boolean z6) {
        while (true) {
            int i9 = this.f6706p0;
            if (i9 == 0) {
                break;
            }
            long[] jArr = this.U;
            long j10 = jArr[0];
            if (j9 < j10) {
                break;
            }
            this.f6705o0 = j10;
            int i10 = i9 - 1;
            this.f6706p0 = i10;
            System.arraycopy(jArr, 1, jArr, 0, i10);
        }
        long j11 = j9 - this.f6705o0;
        if (z6) {
            d0(mediaCodec, i7, j11);
            return true;
        }
        long j12 = j9 - j7;
        if (this.X == this.Y) {
            if (!j0(j12)) {
                return false;
            }
            d0(mediaCodec, i7, j11);
            return true;
        }
        if (!this.Z) {
            if (zm.f15186a >= 21) {
                c0(mediaCodec, i7, j11, System.nanoTime());
            } else {
                b0(mediaCodec, i7, j11);
            }
            return true;
        }
        if (a() != 2) {
            return false;
        }
        long elapsedRealtime = SystemClock.elapsedRealtime();
        long nanoTime = System.nanoTime();
        long a7 = this.R.a(j9, ((j12 - ((elapsedRealtime * 1000) - j8)) * 1000) + nanoTime);
        long j13 = (a7 - nanoTime) / 1000;
        if (!j0(j13)) {
            if (zm.f15186a >= 21) {
                if (j13 < 50000) {
                    c0(mediaCodec, i7, j11, a7);
                    return true;
                }
            } else if (j13 < 30000) {
                if (j13 > 11000) {
                    try {
                        Thread.sleep((j13 - 10000) / 1000);
                    } catch (InterruptedException unused) {
                        Thread.currentThread().interrupt();
                    }
                }
                b0(mediaCodec, i7, j11);
                return true;
            }
            return false;
        }
        wm.a("dropVideoBuffer");
        mediaCodec.releaseOutputBuffer(i7, false);
        wm.b();
        tg tgVar = this.O;
        tgVar.f12202f++;
        this.f6693c0++;
        int i11 = this.f6694d0 + 1;
        this.f6694d0 = i11;
        tgVar.f12203g = Math.max(i11, tgVar.f12203g);
        if (this.f6693c0 == -1) {
            g0();
        }
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zi
    protected final void R(ug ugVar) {
        int i7 = zm.f15186a;
    }

    @Override // com.google.android.gms.internal.ads.zi
    protected final void S() {
        try {
            super.S();
        } finally {
            Surface surface = this.Y;
            if (surface != null) {
                if (this.X == surface) {
                    this.X = null;
                }
                surface.release();
                this.Y = null;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zi
    protected final boolean T(MediaCodec mediaCodec, boolean z6, xe xeVar, xe xeVar2) {
        if (!xeVar.f14165k.equals(xeVar2.f14165k) || e0(xeVar) != e0(xeVar2)) {
            return false;
        }
        if (!z6 && (xeVar.f14169o != xeVar2.f14169o || xeVar.f14170p != xeVar2.f14170p)) {
            return false;
        }
        int i7 = xeVar2.f14169o;
        hn hnVar = this.W;
        return i7 <= hnVar.f6351a && xeVar2.f14170p <= hnVar.f6352b && xeVar2.f14166l <= hnVar.f6353c;
    }

    @Override // com.google.android.gms.internal.ads.zi
    protected final boolean U(xi xiVar) {
        return this.X != null || k0(xiVar.f14219d);
    }

    protected final void b0(MediaCodec mediaCodec, int i7, long j7) {
        h0();
        wm.a("releaseOutputBuffer");
        mediaCodec.releaseOutputBuffer(i7, true);
        wm.b();
        this.O.f12200d++;
        this.f6694d0 = 0;
        z();
    }

    @TargetApi(21)
    protected final void c0(MediaCodec mediaCodec, int i7, long j7, long j8) {
        h0();
        wm.a("releaseOutputBuffer");
        mediaCodec.releaseOutputBuffer(i7, j8);
        wm.b();
        this.O.f12200d++;
        this.f6694d0 = 0;
        z();
    }

    protected final void d0(MediaCodec mediaCodec, int i7, long j7) {
        wm.a("skipVideoBuffer");
        mediaCodec.releaseOutputBuffer(i7, false);
        wm.b();
        this.O.f12201e++;
    }

    @Override // com.google.android.gms.internal.ads.ke
    public final void j(int i7, Object obj) {
        if (i7 == 1) {
            Surface surface = (Surface) obj;
            if (surface == null) {
                Surface surface2 = this.Y;
                if (surface2 != null) {
                    surface = surface2;
                } else {
                    xi P = P();
                    if (P != null && k0(P.f14219d)) {
                        surface = fn.a(this.Q, P.f14219d);
                        this.Y = surface;
                    }
                }
            }
            if (this.X == surface) {
                if (surface == null || surface == this.Y) {
                    return;
                }
                i0();
                if (this.Z) {
                    this.S.g(this.X);
                    return;
                }
                return;
            }
            this.X = surface;
            int a7 = a();
            if (a7 == 1 || a7 == 2) {
                MediaCodec O = O();
                if (zm.f15186a < 23 || O == null || surface == null) {
                    S();
                    Q();
                } else {
                    O.setOutputSurface(surface);
                }
            }
            if (surface == null || surface == this.Y) {
                f0();
                this.Z = false;
                int i8 = zm.f15186a;
            } else {
                i0();
                this.Z = false;
                int i9 = zm.f15186a;
                if (a7 == 2) {
                    this.f6691a0 = -9223372036854775807L;
                }
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zi, com.google.android.gms.internal.ads.ge
    protected final void p() {
        this.f6697g0 = -1;
        this.f6698h0 = -1;
        this.f6700j0 = -1.0f;
        this.f6696f0 = -1.0f;
        this.f6705o0 = -9223372036854775807L;
        this.f6706p0 = 0;
        f0();
        this.Z = false;
        int i7 = zm.f15186a;
        this.R.b();
        try {
            super.p();
        } finally {
            this.O.a();
            this.S.c(this.O);
        }
    }

    @Override // com.google.android.gms.internal.ads.zi, com.google.android.gms.internal.ads.ge
    protected final void q(boolean z6) {
        super.q(z6);
        int i7 = n().f4590a;
        this.S.e(this.O);
        this.R.c();
    }

    @Override // com.google.android.gms.internal.ads.zi, com.google.android.gms.internal.ads.ge
    protected final void r(long j7, boolean z6) {
        super.r(j7, z6);
        this.Z = false;
        int i7 = zm.f15186a;
        this.f6694d0 = 0;
        int i8 = this.f6706p0;
        if (i8 != 0) {
            this.f6705o0 = this.U[i8 - 1];
            this.f6706p0 = 0;
        }
        this.f6691a0 = -9223372036854775807L;
    }

    @Override // com.google.android.gms.internal.ads.ge
    protected final void s() {
        this.f6693c0 = 0;
        this.f6692b0 = SystemClock.elapsedRealtime();
        this.f6691a0 = -9223372036854775807L;
    }

    @Override // com.google.android.gms.internal.ads.ge
    protected final void t() {
        g0();
    }

    @Override // com.google.android.gms.internal.ads.ge
    protected final void u(xe[] xeVarArr, long j7) {
        this.V = xeVarArr;
        if (this.f6705o0 == -9223372036854775807L) {
            this.f6705o0 = j7;
            return;
        }
        int i7 = this.f6706p0;
        if (i7 == 10) {
            long j8 = this.U[9];
            StringBuilder sb = new StringBuilder(65);
            sb.append("Too many stream changes, so dropping offset: ");
            sb.append(j8);
            Log.w("MediaCodecVideoRenderer", sb.toString());
        } else {
            this.f6706p0 = i7 + 1;
        }
        this.U[this.f6706p0 - 1] = j7;
    }

    @Override // com.google.android.gms.internal.ads.zi
    protected final int y(bj bjVar, xe xeVar) {
        boolean z6;
        int i7;
        int i8;
        String str = xeVar.f14165k;
        if (!om.b(str)) {
            return 0;
        }
        yg ygVar = xeVar.f14168n;
        if (ygVar != null) {
            z6 = false;
            for (int i9 = 0; i9 < ygVar.f14676h; i9++) {
                z6 |= ygVar.a(i9).f14198j;
            }
        } else {
            z6 = false;
        }
        xi c7 = jj.c(str, z6);
        if (c7 == null) {
            return 1;
        }
        boolean e7 = c7.e(xeVar.f14162h);
        if (e7 && (i7 = xeVar.f14169o) > 0 && (i8 = xeVar.f14170p) > 0) {
            if (zm.f15186a >= 21) {
                e7 = c7.f(i7, i8, xeVar.f14171q);
            } else {
                e7 = i7 * i8 <= jj.a();
                if (!e7) {
                    int i10 = xeVar.f14169o;
                    int i11 = xeVar.f14170p;
                    String str2 = zm.f15190e;
                    StringBuilder sb = new StringBuilder(String.valueOf(str2).length() + 56);
                    sb.append("FalseCheck [legacyFrameSize, ");
                    sb.append(i10);
                    sb.append("x");
                    sb.append(i11);
                    sb.append("] [");
                    sb.append(str2);
                    sb.append("]");
                    Log.d("MediaCodecVideoRenderer", sb.toString());
                }
            }
        }
        return (true != e7 ? 2 : 3) | (true != c7.f14217b ? 4 : 8) | (true == c7.f14218c ? 16 : 0);
    }

    final void z() {
        if (this.Z) {
            return;
        }
        this.Z = true;
        this.S.g(this.X);
    }
}
