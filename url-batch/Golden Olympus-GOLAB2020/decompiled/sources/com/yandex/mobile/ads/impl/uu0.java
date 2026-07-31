package com.yandex.mobile.ads.impl;

import android.annotation.TargetApi;
import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaCryptoException;
import android.media.MediaFormat;
import android.media.metrics.LogSessionId;
import android.os.Bundle;
import android.os.SystemClock;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import com.huawei.hms.adapter.internal.AvailableCode;
import com.huawei.hms.support.api.entity.auth.AuthCode;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.yandex.mobile.ads.impl.av0;
import com.yandex.mobile.ads.impl.gy;
import com.yandex.mobile.ads.impl.ou0;
import com.yandex.mobile.ads.impl.v30;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

/* loaded from: classes3.dex */
public abstract class uu0 extends AbstractC1811ak {

    /* renamed from: F0, reason: collision with root package name */
    private static final vu0 f33282F0 = hm1.f();

    /* renamed from: G0, reason: collision with root package name */
    private static final byte[] f33283G0 = {0, 0, 1, 103, 66, -64, 11, -38, 37, -112, 0, 0, 1, 104, -50, 15, 19, 32, 0, 0, 1, 101, -120, -124, 13, -50, 113, 24, -96, 0, 47, -65, 28, 49, -61, 39, 93, 120};

    /* renamed from: A, reason: collision with root package name */
    private final long[] f33284A;

    /* renamed from: A0, reason: collision with root package name */
    private c60 f33285A0;

    /* renamed from: B, reason: collision with root package name */
    private yb0 f33286B;

    /* renamed from: B0, reason: collision with root package name */
    protected ey f33287B0;

    /* renamed from: C, reason: collision with root package name */
    private yb0 f33288C;

    /* renamed from: C0, reason: collision with root package name */
    private long f33289C0;

    /* renamed from: D, reason: collision with root package name */
    private v30 f33290D;

    /* renamed from: D0, reason: collision with root package name */
    private long f33291D0;

    /* renamed from: E, reason: collision with root package name */
    private v30 f33292E;

    /* renamed from: E0, reason: collision with root package name */
    private int f33293E0;

    /* renamed from: F, reason: collision with root package name */
    private MediaCrypto f33294F;

    /* renamed from: G, reason: collision with root package name */
    private boolean f33295G;

    /* renamed from: H, reason: collision with root package name */
    private long f33296H;

    /* renamed from: I, reason: collision with root package name */
    private float f33297I;

    /* renamed from: J, reason: collision with root package name */
    private float f33298J;

    /* renamed from: K, reason: collision with root package name */
    private ou0 f33299K;

    /* renamed from: L, reason: collision with root package name */
    private yb0 f33300L;

    /* renamed from: M, reason: collision with root package name */
    private MediaFormat f33301M;

    /* renamed from: N, reason: collision with root package name */
    private boolean f33302N;

    /* renamed from: O, reason: collision with root package name */
    private float f33303O;

    /* renamed from: P, reason: collision with root package name */
    private ArrayDeque<su0> f33304P;

    /* renamed from: Q, reason: collision with root package name */
    private b f33305Q;

    /* renamed from: R, reason: collision with root package name */
    private su0 f33306R;

    /* renamed from: S, reason: collision with root package name */
    private int f33307S;

    /* renamed from: T, reason: collision with root package name */
    private boolean f33308T;

    /* renamed from: U, reason: collision with root package name */
    private boolean f33309U;

    /* renamed from: V, reason: collision with root package name */
    private boolean f33310V;

    /* renamed from: W, reason: collision with root package name */
    private boolean f33311W;

    /* renamed from: X, reason: collision with root package name */
    private boolean f33312X;

    /* renamed from: Y, reason: collision with root package name */
    private boolean f33313Y;

    /* renamed from: Z, reason: collision with root package name */
    private boolean f33314Z;

    /* renamed from: a0, reason: collision with root package name */
    private boolean f33315a0;

    /* renamed from: b0, reason: collision with root package name */
    private boolean f33316b0;

    /* renamed from: c0, reason: collision with root package name */
    private boolean f33317c0;

    /* renamed from: d0, reason: collision with root package name */
    private C2397zl f33318d0;

    /* renamed from: e0, reason: collision with root package name */
    private long f33319e0;

    /* renamed from: f0, reason: collision with root package name */
    private int f33320f0;

    /* renamed from: g0, reason: collision with root package name */
    private int f33321g0;

    /* renamed from: h0, reason: collision with root package name */
    private ByteBuffer f33322h0;

    /* renamed from: i0, reason: collision with root package name */
    private boolean f33323i0;

    /* renamed from: j0, reason: collision with root package name */
    private boolean f33324j0;

    /* renamed from: k0, reason: collision with root package name */
    private boolean f33325k0;

    /* renamed from: l0, reason: collision with root package name */
    private boolean f33326l0;

    /* renamed from: m0, reason: collision with root package name */
    private boolean f33327m0;

    /* renamed from: n, reason: collision with root package name */
    private final ou0.b f33328n;

    /* renamed from: n0, reason: collision with root package name */
    private boolean f33329n0;

    /* renamed from: o, reason: collision with root package name */
    private final wu0 f33330o;

    /* renamed from: o0, reason: collision with root package name */
    private int f33331o0;

    /* renamed from: p, reason: collision with root package name */
    private final boolean f33332p;

    /* renamed from: p0, reason: collision with root package name */
    private int f33333p0;

    /* renamed from: q, reason: collision with root package name */
    private final float f33334q;

    /* renamed from: q0, reason: collision with root package name */
    private int f33335q0;

    /* renamed from: r, reason: collision with root package name */
    private final gy f33336r;

    /* renamed from: r0, reason: collision with root package name */
    private boolean f33337r0;

    /* renamed from: s, reason: collision with root package name */
    private final gy f33338s;

    /* renamed from: s0, reason: collision with root package name */
    private boolean f33339s0;

    /* renamed from: t, reason: collision with root package name */
    private final gy f33340t;

    /* renamed from: t0, reason: collision with root package name */
    private boolean f33341t0;

    /* renamed from: u, reason: collision with root package name */
    private final C1979hk f33342u;

    /* renamed from: u0, reason: collision with root package name */
    private long f33343u0;

    /* renamed from: v, reason: collision with root package name */
    private final w42<yb0> f33344v;

    /* renamed from: v0, reason: collision with root package name */
    private long f33345v0;

    /* renamed from: w, reason: collision with root package name */
    private final ArrayList<Long> f33346w;

    /* renamed from: w0, reason: collision with root package name */
    private boolean f33347w0;

    /* renamed from: x, reason: collision with root package name */
    private final MediaCodec.BufferInfo f33348x;

    /* renamed from: x0, reason: collision with root package name */
    private boolean f33349x0;

    /* renamed from: y, reason: collision with root package name */
    private final long[] f33350y;

    /* renamed from: y0, reason: collision with root package name */
    private boolean f33351y0;

    /* renamed from: z, reason: collision with root package name */
    private final long[] f33352z;

    /* renamed from: z0, reason: collision with root package name */
    private boolean f33353z0;

    private static final class a {
        public static void a(ou0.a aVar, ei1 ei1Var) {
            LogSessionId logSessionId;
            boolean equals;
            String stringId;
            LogSessionId a4 = ei1Var.a();
            logSessionId = LogSessionId.LOG_SESSION_ID_NONE;
            equals = a4.equals(logSessionId);
            if (equals) {
                return;
            }
            MediaFormat mediaFormat = aVar.f30202b;
            stringId = a4.getStringId();
            mediaFormat.setString("log-session-id", stringId);
        }
    }

    public static class b extends Exception {

        /* renamed from: b, reason: collision with root package name */
        public final String f33354b;

        /* renamed from: c, reason: collision with root package name */
        public final boolean f33355c;

        /* renamed from: d, reason: collision with root package name */
        public final su0 f33356d;

        /* renamed from: e, reason: collision with root package name */
        public final String f33357e;

        private static String a(int i4) {
            return "com.monetization.ads.exoplayer2.mediacodec.MediaCodecRenderer_" + (i4 < 0 ? "neg_" : "") + Math.abs(i4);
        }

        public b(int i4, yb0 yb0Var, av0.b bVar, boolean z4) {
            this("Decoder init failed: [" + i4 + "], " + yb0Var, bVar, yb0Var.f34991m, z4, null, a(i4));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static String a(Exception exc) {
            if (exc instanceof MediaCodec.CodecException) {
                return ((MediaCodec.CodecException) exc).getDiagnosticInfo();
            }
            return null;
        }

        private b(String str, Throwable th, String str2, boolean z4, su0 su0Var, String str3) {
            super(str, th);
            this.f33354b = str2;
            this.f33355c = z4;
            this.f33356d = su0Var;
            this.f33357e = str3;
        }
    }

    public uu0(int i4, uz uzVar, wu0 wu0Var, float f4) {
        super(i4);
        this.f33328n = uzVar;
        this.f33330o = (wu0) C2253tf.a(wu0Var);
        this.f33332p = false;
        this.f33334q = f4;
        this.f33336r = gy.j();
        this.f33338s = new gy(0);
        this.f33340t = new gy(2);
        C1979hk c1979hk = new C1979hk();
        this.f33342u = c1979hk;
        this.f33344v = new w42<>();
        this.f33346w = new ArrayList<>();
        this.f33348x = new MediaCodec.BufferInfo();
        this.f33297I = 1.0f;
        this.f33298J = 1.0f;
        this.f33296H = -9223372036854775807L;
        this.f33350y = new long[10];
        this.f33352z = new long[10];
        this.f33284A = new long[10];
        this.f33289C0 = -9223372036854775807L;
        this.f33291D0 = -9223372036854775807L;
        c1979hk.e(0);
        c1979hk.f26356d.order(ByteOrder.nativeOrder());
        this.f33303O = -1.0f;
        this.f33307S = 0;
        this.f33331o0 = 0;
        this.f33320f0 = -1;
        this.f33321g0 = -1;
        this.f33319e0 = -9223372036854775807L;
        this.f33343u0 = -9223372036854775807L;
        this.f33345v0 = -9223372036854775807L;
        this.f33333p0 = 0;
        this.f33335q0 = 0;
    }

    private boolean A() {
        int i4;
        int i5;
        ou0 ou0Var = this.f33299K;
        if (ou0Var == null || this.f33333p0 == 2 || this.f33347w0) {
            return false;
        }
        if (this.f33320f0 < 0) {
            int b4 = ou0Var.b();
            this.f33320f0 = b4;
            if (b4 < 0) {
                return false;
            }
            this.f33338s.f26356d = this.f33299K.b(b4);
            this.f33338s.b();
        }
        if (this.f33333p0 == 1) {
            if (!this.f33317c0) {
                this.f33339s0 = true;
                this.f33299K.a(this.f33320f0, 0, 0L, 4);
                this.f33320f0 = -1;
                this.f33338s.f26356d = null;
            }
            this.f33333p0 = 2;
            return false;
        }
        if (this.f33315a0) {
            this.f33315a0 = false;
            ByteBuffer byteBuffer = this.f33338s.f26356d;
            byte[] bArr = f33283G0;
            byteBuffer.put(bArr);
            this.f33299K.a(this.f33320f0, bArr.length, 0L, 0);
            this.f33320f0 = -1;
            this.f33338s.f26356d = null;
            this.f33337r0 = true;
            return true;
        }
        if (this.f33331o0 == 1) {
            for (int i6 = 0; i6 < this.f33300L.f34993o.size(); i6++) {
                this.f33338s.f26356d.put(this.f33300L.f34993o.get(i6));
            }
            this.f33331o0 = 2;
        }
        int position = this.f33338s.f26356d.position();
        zb0 q4 = q();
        try {
            int a4 = a(q4, this.f33338s, 0);
            if (e()) {
                this.f33345v0 = this.f33343u0;
            }
            if (a4 == -3) {
                return false;
            }
            if (a4 == -5) {
                if (this.f33331o0 == 2) {
                    this.f33338s.b();
                    this.f33331o0 = 1;
                }
                a(q4);
                return true;
            }
            if (this.f33338s.f()) {
                if (this.f33331o0 == 2) {
                    this.f33338s.b();
                    this.f33331o0 = 1;
                }
                this.f33347w0 = true;
                if (!this.f33337r0) {
                    M();
                    return false;
                }
                try {
                    if (!this.f33317c0) {
                        this.f33339s0 = true;
                        this.f33299K.a(this.f33320f0, 0, 0L, 4);
                        this.f33320f0 = -1;
                        this.f33338s.f26356d = null;
                    }
                    return false;
                } catch (MediaCodec.CryptoException e4) {
                    yb0 yb0Var = this.f33286B;
                    int errorCode = e4.getErrorCode();
                    int i7 = u82.f32873a;
                    if (errorCode != 2 && errorCode != 4) {
                        if (errorCode != 10) {
                            if (errorCode != 7) {
                                if (errorCode != 8) {
                                    switch (errorCode) {
                                        case 15:
                                            break;
                                        case 16:
                                        case 18:
                                            break;
                                        case 17:
                                        case 19:
                                        case 20:
                                        case 21:
                                        case 22:
                                            break;
                                        default:
                                            switch (errorCode) {
                                                case 24:
                                                case 25:
                                                case 26:
                                                case 27:
                                                case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                                                    i5 = AuthCode.StatusCode.AUTH_INFO_NOT_EXIST;
                                                    break;
                                                default:
                                                    i5 = AuthCode.StatusCode.PERMISSION_EXPIRED;
                                                    break;
                                            }
                                    }
                                    throw a(e4, yb0Var, i5);
                                }
                                i5 = AuthCode.StatusCode.CERT_FINGERPRINT_ERROR;
                                throw a(e4, yb0Var, i5);
                            }
                        }
                        i5 = AuthCode.StatusCode.PERMISSION_NOT_EXIST;
                        throw a(e4, yb0Var, i5);
                    }
                    i5 = AuthCode.StatusCode.PERMISSION_NOT_AUTHORIZED;
                    throw a(e4, yb0Var, i5);
                }
            }
            if (!this.f33337r0 && !this.f33338s.g()) {
                this.f33338s.b();
                if (this.f33331o0 == 2) {
                    this.f33331o0 = 1;
                }
                return true;
            }
            boolean i8 = this.f33338s.i();
            if (i8) {
                this.f33338s.f26355c.a(position);
            }
            if (this.f33308T && !i8) {
                ByteBuffer byteBuffer2 = this.f33338s.f26356d;
                byte[] bArr2 = s31.f31556a;
                int position2 = byteBuffer2.position();
                int i9 = 0;
                int i10 = 0;
                while (true) {
                    int i11 = i9 + 1;
                    if (i11 >= position2) {
                        byteBuffer2.clear();
                        break;
                    }
                    int i12 = byteBuffer2.get(i9) & 255;
                    if (i10 == 3) {
                        if (i12 == 1 && (byteBuffer2.get(i11) & 31) == 7) {
                            ByteBuffer duplicate = byteBuffer2.duplicate();
                            duplicate.position(i9 - 3);
                            duplicate.limit(position2);
                            byteBuffer2.position(0);
                            byteBuffer2.put(duplicate);
                            break;
                        }
                    } else if (i12 == 0) {
                        i10++;
                    }
                    if (i12 != 0) {
                        i10 = 0;
                    }
                    i9 = i11;
                }
                if (this.f33338s.f26356d.position() == 0) {
                    return true;
                }
                this.f33308T = false;
            }
            gy gyVar = this.f33338s;
            long j4 = gyVar.f26358f;
            C2397zl c2397zl = this.f33318d0;
            if (c2397zl != null) {
                j4 = c2397zl.a(this.f33286B, gyVar);
                this.f33343u0 = Math.max(this.f33343u0, this.f33318d0.a(this.f33286B));
            }
            if (this.f33338s.e()) {
                this.f33346w.add(Long.valueOf(j4));
            }
            if (this.f33351y0) {
                this.f33344v.a(this.f33286B, j4);
                this.f33351y0 = false;
            }
            this.f33343u0 = Math.max(this.f33343u0, j4);
            this.f33338s.h();
            if (this.f33338s.d()) {
                a(this.f33338s);
            }
            b(this.f33338s);
            try {
                if (i8) {
                    this.f33299K.a(this.f33320f0, this.f33338s.f26355c, j4);
                } else {
                    this.f33299K.a(this.f33320f0, this.f33338s.f26356d.limit(), j4, 0);
                }
                this.f33320f0 = -1;
                this.f33338s.f26356d = null;
                this.f33337r0 = true;
                this.f33331o0 = 0;
                this.f33287B0.f25492c++;
                return true;
            } catch (MediaCodec.CryptoException e5) {
                yb0 yb0Var2 = this.f33286B;
                int errorCode2 = e5.getErrorCode();
                int i13 = u82.f32873a;
                if (errorCode2 != 2 && errorCode2 != 4) {
                    if (errorCode2 != 10) {
                        if (errorCode2 != 7) {
                            if (errorCode2 != 8) {
                                switch (errorCode2) {
                                    case 15:
                                        break;
                                    case 16:
                                    case 18:
                                        break;
                                    case 17:
                                    case 19:
                                    case 20:
                                    case 21:
                                    case 22:
                                        break;
                                    default:
                                        switch (errorCode2) {
                                            case 24:
                                            case 25:
                                            case 26:
                                            case 27:
                                            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                                                i4 = AuthCode.StatusCode.AUTH_INFO_NOT_EXIST;
                                                break;
                                            default:
                                                i4 = AuthCode.StatusCode.PERMISSION_EXPIRED;
                                                break;
                                        }
                                }
                                throw a(e5, yb0Var2, i4);
                            }
                            i4 = AuthCode.StatusCode.CERT_FINGERPRINT_ERROR;
                            throw a(e5, yb0Var2, i4);
                        }
                    }
                    i4 = AuthCode.StatusCode.PERMISSION_NOT_EXIST;
                    throw a(e5, yb0Var2, i4);
                }
                i4 = AuthCode.StatusCode.PERMISSION_NOT_AUTHORIZED;
                throw a(e5, yb0Var2, i4);
            }
        } catch (gy.a e6) {
            a(e6);
            c(0);
            B();
            return true;
        }
    }

    private void B() {
        try {
            this.f33299K.flush();
        } finally {
            P();
        }
    }

    @TargetApi(ConnectionResult.API_DISABLED)
    private void M() {
        int i4 = this.f33335q0;
        if (i4 == 1) {
            B();
            return;
        }
        if (i4 == 2) {
            B();
            S();
        } else if (i4 != 3) {
            this.f33349x0 = true;
            O();
        } else {
            N();
            K();
        }
    }

    private void S() {
        try {
            this.f33294F.setMediaDrmSession(a(this.f33292E).f26110b);
            v30 v30Var = this.f33292E;
            v30.a(this.f33290D, v30Var);
            this.f33290D = v30Var;
            this.f33333p0 = 0;
            this.f33335q0 = 0;
        } catch (MediaCryptoException e4) {
            throw a(e4, this.f33286B, AuthCode.StatusCode.PERMISSION_EXPIRED);
        }
    }

    private boolean c(long j4, long j5) {
        boolean z4;
        boolean a4;
        ou0 ou0Var;
        ByteBuffer byteBuffer;
        int i4;
        MediaCodec.BufferInfo bufferInfo;
        int a5;
        boolean z5;
        if (this.f33321g0 < 0) {
            if (this.f33312X && this.f33339s0) {
                try {
                    a5 = this.f33299K.a(this.f33348x);
                } catch (IllegalStateException unused) {
                    M();
                    if (this.f33349x0) {
                        N();
                    }
                    return false;
                }
            } else {
                a5 = this.f33299K.a(this.f33348x);
            }
            if (a5 < 0) {
                if (a5 != -2) {
                    if (this.f33317c0 && (this.f33347w0 || this.f33333p0 == 2)) {
                        M();
                    }
                    return false;
                }
                this.f33341t0 = true;
                MediaFormat a6 = this.f33299K.a();
                if (this.f33307S != 0 && a6.getInteger("width") == 32 && a6.getInteger("height") == 32) {
                    this.f33316b0 = true;
                } else {
                    if (this.f33314Z) {
                        a6.setInteger("channel-count", 1);
                    }
                    this.f33301M = a6;
                    this.f33302N = true;
                }
                return true;
            }
            if (this.f33316b0) {
                this.f33316b0 = false;
                this.f33299K.a(false, a5);
                return true;
            }
            MediaCodec.BufferInfo bufferInfo2 = this.f33348x;
            if (bufferInfo2.size == 0 && (bufferInfo2.flags & 4) != 0) {
                M();
                return false;
            }
            this.f33321g0 = a5;
            ByteBuffer c4 = this.f33299K.c(a5);
            this.f33322h0 = c4;
            if (c4 != null) {
                c4.position(this.f33348x.offset);
                ByteBuffer byteBuffer2 = this.f33322h0;
                MediaCodec.BufferInfo bufferInfo3 = this.f33348x;
                byteBuffer2.limit(bufferInfo3.offset + bufferInfo3.size);
            }
            if (this.f33313Y) {
                MediaCodec.BufferInfo bufferInfo4 = this.f33348x;
                if (bufferInfo4.presentationTimeUs == 0 && (bufferInfo4.flags & 4) != 0) {
                    long j6 = this.f33343u0;
                    if (j6 != -9223372036854775807L) {
                        bufferInfo4.presentationTimeUs = j6;
                    }
                }
            }
            long j7 = this.f33348x.presentationTimeUs;
            int size = this.f33346w.size();
            int i5 = 0;
            while (true) {
                if (i5 >= size) {
                    z5 = false;
                    break;
                }
                if (this.f33346w.get(i5).longValue() == j7) {
                    this.f33346w.remove(i5);
                    z5 = true;
                    break;
                }
                i5++;
            }
            this.f33323i0 = z5;
            long j8 = this.f33345v0;
            long j9 = this.f33348x.presentationTimeUs;
            this.f33324j0 = j8 == j9;
            d(j9);
        }
        if (this.f33312X && this.f33339s0) {
            try {
                ou0Var = this.f33299K;
                byteBuffer = this.f33322h0;
                i4 = this.f33321g0;
                bufferInfo = this.f33348x;
                z4 = false;
            } catch (IllegalStateException unused2) {
                z4 = false;
            }
            try {
                a4 = a(j4, j5, ou0Var, byteBuffer, i4, bufferInfo.flags, 1, bufferInfo.presentationTimeUs, this.f33323i0, this.f33324j0, this.f33288C);
            } catch (IllegalStateException unused3) {
                M();
                if (this.f33349x0) {
                    N();
                }
                return z4;
            }
        } else {
            z4 = false;
            ou0 ou0Var2 = this.f33299K;
            ByteBuffer byteBuffer3 = this.f33322h0;
            int i6 = this.f33321g0;
            MediaCodec.BufferInfo bufferInfo5 = this.f33348x;
            a4 = a(j4, j5, ou0Var2, byteBuffer3, i6, bufferInfo5.flags, 1, bufferInfo5.presentationTimeUs, this.f33323i0, this.f33324j0, this.f33288C);
        }
        if (a4) {
            c(this.f33348x.presentationTimeUs);
            boolean z6 = (this.f33348x.flags & 4) != 0 ? true : z4;
            this.f33321g0 = -1;
            this.f33322h0 = null;
            if (!z6) {
                return true;
            }
            M();
        }
        return z4;
    }

    private void y() {
        if (this.f33347w0) {
            throw new IllegalStateException();
        }
        zb0 q4 = q();
        this.f33340t.b();
        do {
            this.f33340t.b();
            int a4 = a(q4, this.f33340t, 0);
            if (a4 == -5) {
                a(q4);
                return;
            }
            if (a4 != -4) {
                if (a4 != -3) {
                    throw new IllegalStateException();
                }
                return;
            } else {
                if (this.f33340t.f()) {
                    this.f33347w0 = true;
                    return;
                }
                if (this.f33351y0) {
                    yb0 yb0Var = this.f33286B;
                    yb0Var.getClass();
                    this.f33288C = yb0Var;
                    a(yb0Var, (MediaFormat) null);
                    this.f33351y0 = false;
                }
                this.f33340t.h();
            }
        } while (this.f33342u.a(this.f33340t));
        this.f33326l0 = true;
    }

    @TargetApi(ConnectionResult.API_DISABLED)
    private boolean z() {
        if (this.f33337r0) {
            this.f33333p0 = 1;
            if (this.f33309U || this.f33311W) {
                this.f33335q0 = 3;
                return false;
            }
            this.f33335q0 = 2;
        } else {
            S();
        }
        return true;
    }

    protected final void C() {
        if (D()) {
            K();
        }
    }

    protected final boolean D() {
        if (this.f33299K == null) {
            return false;
        }
        int i4 = this.f33335q0;
        if (i4 == 3 || this.f33309U || ((this.f33310V && !this.f33341t0) || (this.f33311W && this.f33339s0))) {
            N();
            return true;
        }
        if (i4 == 2) {
            int i5 = u82.f32873a;
            if (i5 < 23) {
                throw new IllegalStateException();
            }
            if (i5 >= 23) {
                try {
                    S();
                } catch (c60 e4) {
                    ms0.b("MediaCodecRenderer", "Failed to update the DRM session, releasing the codec instead.", e4);
                    N();
                    return true;
                }
            }
        }
        B();
        return false;
    }

    protected final ou0 E() {
        return this.f33299K;
    }

    protected final su0 F() {
        return this.f33306R;
    }

    protected boolean G() {
        return false;
    }

    protected final MediaFormat H() {
        return this.f33301M;
    }

    protected final long I() {
        return this.f33291D0;
    }

    protected final float J() {
        return this.f33297I;
    }

    protected final void K() {
        yb0 yb0Var;
        if (this.f33299K != null || this.f33325k0 || (yb0Var = this.f33286B) == null) {
            return;
        }
        boolean z4 = false;
        if (this.f33292E == null && b(yb0Var)) {
            yb0 yb0Var2 = this.f33286B;
            this.f33327m0 = false;
            this.f33342u.b();
            this.f33340t.b();
            this.f33326l0 = false;
            this.f33325k0 = false;
            String str = yb0Var2.f34991m;
            if ("audio/mp4a-latm".equals(str) || "audio/mpeg".equals(str) || "audio/opus".equals(str)) {
                this.f33342u.f(32);
            } else {
                this.f33342u.f(1);
            }
            this.f33325k0 = true;
            return;
        }
        v30 v30Var = this.f33292E;
        v30.a(this.f33290D, v30Var);
        this.f33290D = v30Var;
        String str2 = this.f33286B.f34991m;
        if (v30Var != null) {
            if (this.f33294F == null) {
                gc0 a4 = a(v30Var);
                if (a4 != null) {
                    try {
                        MediaCrypto mediaCrypto = new MediaCrypto(a4.f26109a, a4.f26110b);
                        this.f33294F = mediaCrypto;
                        if (!a4.f26111c && mediaCrypto.requiresSecureDecoderComponent(str2)) {
                            z4 = true;
                        }
                        this.f33295G = z4;
                    } catch (MediaCryptoException e4) {
                        throw a(e4, this.f33286B, AuthCode.StatusCode.PERMISSION_EXPIRED);
                    }
                } else if (this.f33290D.getError() == null) {
                    return;
                }
            }
            if (gc0.f26108d) {
                int state = this.f33290D.getState();
                if (state == 1) {
                    v30.a error = this.f33290D.getError();
                    error.getClass();
                    throw a(error, this.f33286B, error.f33492b);
                }
                if (state != 4) {
                    return;
                }
            }
        }
        try {
            a(this.f33294F, this.f33295G);
        } catch (b e5) {
            throw a(e5, this.f33286B, IronSourceConstants.NT_LOAD);
        }
    }

    protected abstract void L();

    /* JADX WARN: Multi-variable type inference failed */
    protected final void N() {
        try {
            ou0 ou0Var = this.f33299K;
            if (ou0Var != null) {
                ou0Var.release();
                this.f33287B0.f25491b++;
                a(this.f33306R.f31947a);
            }
            this.f33299K = null;
            try {
                MediaCrypto mediaCrypto = this.f33294F;
                if (mediaCrypto != null) {
                    mediaCrypto.release();
                }
            } finally {
            }
        } catch (Throwable th) {
            this.f33299K = null;
            try {
                MediaCrypto mediaCrypto2 = this.f33294F;
                if (mediaCrypto2 != null) {
                    mediaCrypto2.release();
                }
                throw th;
            } finally {
            }
        }
    }

    protected void O() {
    }

    protected void P() {
        this.f33320f0 = -1;
        this.f33338s.f26356d = null;
        this.f33321g0 = -1;
        this.f33322h0 = null;
        this.f33319e0 = -9223372036854775807L;
        this.f33339s0 = false;
        this.f33337r0 = false;
        this.f33315a0 = false;
        this.f33316b0 = false;
        this.f33323i0 = false;
        this.f33324j0 = false;
        this.f33346w.clear();
        this.f33343u0 = -9223372036854775807L;
        this.f33345v0 = -9223372036854775807L;
        C2397zl c2397zl = this.f33318d0;
        if (c2397zl != null) {
            c2397zl.a();
        }
        this.f33333p0 = 0;
        this.f33335q0 = 0;
        this.f33331o0 = this.f33329n0 ? 1 : 0;
    }

    protected final void Q() {
        P();
        this.f33285A0 = null;
        this.f33318d0 = null;
        this.f33304P = null;
        this.f33306R = null;
        this.f33300L = null;
        this.f33301M = null;
        this.f33302N = false;
        this.f33341t0 = false;
        this.f33303O = -1.0f;
        this.f33307S = 0;
        this.f33308T = false;
        this.f33309U = false;
        this.f33310V = false;
        this.f33311W = false;
        this.f33312X = false;
        this.f33313Y = false;
        this.f33314Z = false;
        this.f33317c0 = false;
        this.f33329n0 = false;
        this.f33331o0 = 0;
        this.f33295G = false;
    }

    protected final void R() {
        this.f33353z0 = true;
    }

    protected abstract float a(float f4, yb0[] yb0VarArr);

    protected abstract int a(wu0 wu0Var, yb0 yb0Var);

    protected abstract iy a(su0 su0Var, yb0 yb0Var, yb0 yb0Var2);

    protected abstract ou0.a a(su0 su0Var, yb0 yb0Var, MediaCrypto mediaCrypto, float f4);

    protected abstract ArrayList a(wu0 wu0Var, yb0 yb0Var, boolean z4);

    protected void a(gy gyVar) {
    }

    protected abstract void a(yb0 yb0Var, MediaFormat mediaFormat);

    protected abstract void a(Exception exc);

    protected abstract void a(String str);

    protected abstract void a(String str, long j4, long j5);

    protected abstract boolean a(long j4, long j5, ou0 ou0Var, ByteBuffer byteBuffer, int i4, int i5, int i6, long j6, boolean z4, boolean z5, yb0 yb0Var);

    protected abstract void b(gy gyVar);

    protected boolean b(yb0 yb0Var) {
        return false;
    }

    @Override // com.yandex.mobile.ads.impl.so1
    public boolean d() {
        if (this.f33286B == null) {
            return false;
        }
        if (t() || this.f33321g0 >= 0) {
            return true;
        }
        return this.f33319e0 != -9223372036854775807L && SystemClock.elapsedRealtime() < this.f33319e0;
    }

    @Override // com.yandex.mobile.ads.impl.AbstractC1811ak, com.yandex.mobile.ads.impl.to1
    public final int f() {
        return 8;
    }

    @Override // com.yandex.mobile.ads.impl.AbstractC1811ak
    protected void u() {
        this.f33286B = null;
        this.f33289C0 = -9223372036854775807L;
        this.f33291D0 = -9223372036854775807L;
        this.f33293E0 = 0;
        D();
    }

    @Override // com.yandex.mobile.ads.impl.AbstractC1811ak
    protected void v() {
        try {
            this.f33327m0 = false;
            this.f33342u.b();
            this.f33340t.b();
            this.f33326l0 = false;
            this.f33325k0 = false;
            N();
        } finally {
            v30.a(this.f33292E, null);
            this.f33292E = null;
        }
    }

    private boolean b(long j4, long j5) {
        if (this.f33349x0) {
            throw new IllegalStateException();
        }
        if (this.f33342u.m()) {
            C1979hk c1979hk = this.f33342u;
            ByteBuffer byteBuffer = c1979hk.f26356d;
            int i4 = this.f33321g0;
            int l4 = c1979hk.l();
            C1979hk c1979hk2 = this.f33342u;
            if (!a(j4, j5, null, byteBuffer, i4, 0, l4, c1979hk2.f26358f, c1979hk2.e(), this.f33342u.f(), this.f33288C)) {
                return false;
            }
            c(this.f33342u.k());
            this.f33342u.b();
        }
        if (this.f33347w0) {
            this.f33349x0 = true;
            return false;
        }
        if (this.f33326l0) {
            if (!this.f33342u.a(this.f33340t)) {
                throw new IllegalStateException();
            }
            this.f33326l0 = false;
        }
        if (this.f33327m0) {
            if (this.f33342u.m()) {
                return true;
            }
            this.f33327m0 = false;
            this.f33342u.b();
            this.f33340t.b();
            this.f33326l0 = false;
            this.f33325k0 = false;
            this.f33327m0 = false;
            K();
            if (!this.f33325k0) {
                return false;
            }
        }
        y();
        if (this.f33342u.m()) {
            this.f33342u.h();
        }
        return this.f33342u.m() || this.f33347w0 || this.f33327m0;
    }

    protected boolean a(su0 su0Var) {
        return true;
    }

    private List<su0> a(boolean z4) {
        ArrayList a4 = a(this.f33330o, this.f33286B, z4);
        if (!a4.isEmpty() || !z4) {
            return a4;
        }
        ArrayList a5 = a(this.f33330o, this.f33286B, false);
        if (!a5.isEmpty()) {
            ms0.d("MediaCodecRenderer", "Drm session requires secure decoder for " + this.f33286B.f34991m + ", but no secure decoder available. Trying to proceed with " + a5 + ".");
        }
        return a5;
    }

    protected final void d(long j4) {
        yb0 b4 = this.f33344v.b(j4);
        if (b4 == null && this.f33302N) {
            b4 = this.f33344v.c();
        }
        if (b4 != null) {
            this.f33288C = b4;
        } else if (!this.f33302N || this.f33288C == null) {
            return;
        }
        a(this.f33288C, this.f33301M);
        this.f33302N = false;
    }

    private gc0 a(v30 v30Var) {
        su cryptoConfig = v30Var.getCryptoConfig();
        if (cryptoConfig != null && !(cryptoConfig instanceof gc0)) {
            throw a(new IllegalArgumentException("Expecting FrameworkCryptoConfig but found: " + cryptoConfig), this.f33286B, AuthCode.StatusCode.WAITING_CONNECT);
        }
        return (gc0) cryptoConfig;
    }

    /* JADX WARN: Code restructure failed: missing block: B:110:0x0263, code lost:
    
        if (r2.B().equals(r6) == false) goto L136;
     */
    /* JADX WARN: Code restructure failed: missing block: B:127:0x0189, code lost:
    
        if (r6.L().equals(r13) == false) goto L88;
     */
    /* JADX WARN: Code restructure failed: missing block: B:131:0x019d, code lost:
    
        if (r6.z().equals(r3) == false) goto L88;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0122, code lost:
    
        if (r16.v().equals(r3) == false) goto L58;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x0146, code lost:
    
        if (r16.p().equals(r3) != false) goto L67;
     */
    /* JADX WARN: Removed duplicated region for block: B:107:0x024f  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x0273  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x0173  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00ed  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x010c  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0152  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0165  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x01a6  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x01b9  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0218  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0231  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x02a2  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x02b0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void a(su0 su0Var, MediaCrypto mediaCrypto) {
        int i4;
        boolean z4;
        boolean z5;
        boolean z6;
        vu0 vu0Var;
        boolean z7;
        String str = su0Var.f31947a;
        int i5 = u82.f32873a;
        float a4 = i5 < 23 ? -1.0f : a(this.f33298J, s());
        float f4 = a4 > this.f33334q ? a4 : -1.0f;
        long elapsedRealtime = SystemClock.elapsedRealtime();
        ou0.a a5 = a(su0Var, this.f33286B, mediaCrypto, f4);
        if (i5 >= 31) {
            a.a(a5, r());
        }
        try {
            j52.a("createCodec:" + str);
            this.f33299K = this.f33328n.a(a5);
            j52.a();
            long elapsedRealtime2 = SystemClock.elapsedRealtime();
            this.f33306R = su0Var;
            this.f33303O = f4;
            this.f33300L = this.f33286B;
            if (i5 <= 25) {
                vu0 vu0Var2 = f33282F0;
                if (vu0Var2.p().equals(str)) {
                    String str2 = u82.f32876d;
                    if (str2.startsWith(vu0Var2.J()) || str2.startsWith(vu0Var2.F()) || str2.startsWith(vu0Var2.G()) || str2.startsWith(vu0Var2.I())) {
                        i4 = 2;
                        this.f33307S = i4;
                        this.f33308T = i5 >= 21 && this.f33300L.f34993o.isEmpty() && f33282F0.r().equals(str);
                        if (i5 >= 18) {
                            if (i5 == 18) {
                                vu0 vu0Var3 = f33282F0;
                                if (!vu0Var3.u().equals(str)) {
                                }
                            }
                            if (i5 == 19) {
                                String str3 = u82.f32876d;
                                vu0 vu0Var4 = f33282F0;
                                if (str3.startsWith(vu0Var4.H())) {
                                    if (!vu0Var4.o().equals(str)) {
                                    }
                                }
                            }
                            z4 = false;
                            this.f33309U = z4;
                            this.f33310V = i5 != 29 && f33282F0.d().equals(str);
                            if (i5 <= 23 || !f33282F0.D().equals(str)) {
                                if (i5 <= 19) {
                                    vu0 vu0Var5 = f33282F0;
                                    String l4 = vu0Var5.l();
                                    String str4 = u82.f32874b;
                                    if (!l4.equals(str4)) {
                                    }
                                    if (!vu0Var5.y().equals(str)) {
                                    }
                                }
                                z5 = false;
                                this.f33311W = z5;
                                this.f33312X = i5 != 21 && f33282F0.C().equals(str);
                                if (i5 < 21) {
                                    vu0 vu0Var6 = f33282F0;
                                    if (vu0Var6.w().equals(str) && vu0Var6.K().equals(u82.f32875c)) {
                                        String str5 = u82.f32874b;
                                        if (str5.startsWith(vu0Var6.c()) || str5.startsWith(vu0Var6.j()) || str5.startsWith(vu0Var6.h()) || str5.startsWith(vu0Var6.i()) || str5.startsWith(vu0Var6.m()) || str5.startsWith(vu0Var6.n())) {
                                            z6 = true;
                                            this.f33313Y = z6;
                                            this.f33314Z = i5 > 18 && this.f33300L.f35004z == 1 && f33282F0.q().equals(str);
                                            String str6 = su0Var.f31947a;
                                            if ((i5 <= 25 || !f33282F0.E().equals(str6)) && (i5 > 17 || !f33282F0.x().equals(str6))) {
                                                if (i5 <= 29) {
                                                    vu0 vu0Var7 = f33282F0;
                                                    if (!vu0Var7.A().equals(str6)) {
                                                    }
                                                }
                                                vu0Var = f33282F0;
                                                if ((vu0Var.b().equals(u82.f32875c) || !vu0Var.a().equals(u82.f32876d) || !su0Var.f31952f) && !G()) {
                                                    z7 = false;
                                                    this.f33317c0 = z7;
                                                    this.f33299K.getClass();
                                                    if (f33282F0.e().equals(su0Var.f31947a)) {
                                                        this.f33318d0 = new C2397zl();
                                                    }
                                                    if (getState() == 2) {
                                                        this.f33319e0 = SystemClock.elapsedRealtime() + 1000;
                                                    }
                                                    this.f33287B0.f25490a++;
                                                    a(str, elapsedRealtime2, elapsedRealtime2 - elapsedRealtime);
                                                }
                                            }
                                            z7 = true;
                                            this.f33317c0 = z7;
                                            this.f33299K.getClass();
                                            if (f33282F0.e().equals(su0Var.f31947a)) {
                                            }
                                            if (getState() == 2) {
                                            }
                                            this.f33287B0.f25490a++;
                                            a(str, elapsedRealtime2, elapsedRealtime2 - elapsedRealtime);
                                        }
                                    }
                                }
                                z6 = false;
                                this.f33313Y = z6;
                                this.f33314Z = i5 > 18 && this.f33300L.f35004z == 1 && f33282F0.q().equals(str);
                                String str62 = su0Var.f31947a;
                                if (i5 <= 25) {
                                }
                                if (i5 <= 29) {
                                }
                                vu0Var = f33282F0;
                                if (vu0Var.b().equals(u82.f32875c)) {
                                }
                                z7 = false;
                                this.f33317c0 = z7;
                                this.f33299K.getClass();
                                if (f33282F0.e().equals(su0Var.f31947a)) {
                                }
                                if (getState() == 2) {
                                }
                                this.f33287B0.f25490a++;
                                a(str, elapsedRealtime2, elapsedRealtime2 - elapsedRealtime);
                            }
                            z5 = true;
                            this.f33311W = z5;
                            this.f33312X = i5 != 21 && f33282F0.C().equals(str);
                            if (i5 < 21) {
                            }
                            z6 = false;
                            this.f33313Y = z6;
                            this.f33314Z = i5 > 18 && this.f33300L.f35004z == 1 && f33282F0.q().equals(str);
                            String str622 = su0Var.f31947a;
                            if (i5 <= 25) {
                            }
                            if (i5 <= 29) {
                            }
                            vu0Var = f33282F0;
                            if (vu0Var.b().equals(u82.f32875c)) {
                            }
                            z7 = false;
                            this.f33317c0 = z7;
                            this.f33299K.getClass();
                            if (f33282F0.e().equals(su0Var.f31947a)) {
                            }
                            if (getState() == 2) {
                            }
                            this.f33287B0.f25490a++;
                            a(str, elapsedRealtime2, elapsedRealtime2 - elapsedRealtime);
                        }
                        z4 = true;
                        this.f33309U = z4;
                        this.f33310V = i5 != 29 && f33282F0.d().equals(str);
                        if (i5 <= 23) {
                        }
                        if (i5 <= 19) {
                        }
                        z5 = false;
                        this.f33311W = z5;
                        this.f33312X = i5 != 21 && f33282F0.C().equals(str);
                        if (i5 < 21) {
                        }
                        z6 = false;
                        this.f33313Y = z6;
                        this.f33314Z = i5 > 18 && this.f33300L.f35004z == 1 && f33282F0.q().equals(str);
                        String str6222 = su0Var.f31947a;
                        if (i5 <= 25) {
                        }
                        if (i5 <= 29) {
                        }
                        vu0Var = f33282F0;
                        if (vu0Var.b().equals(u82.f32875c)) {
                        }
                        z7 = false;
                        this.f33317c0 = z7;
                        this.f33299K.getClass();
                        if (f33282F0.e().equals(su0Var.f31947a)) {
                        }
                        if (getState() == 2) {
                        }
                        this.f33287B0.f25490a++;
                        a(str, elapsedRealtime2, elapsedRealtime2 - elapsedRealtime);
                    }
                }
            }
            if (i5 < 24) {
                vu0 vu0Var8 = f33282F0;
                if (vu0Var8.s().equals(str) || vu0Var8.t().equals(str)) {
                    String f5 = vu0Var8.f();
                    String str7 = u82.f32874b;
                    if (f5.equals(str7) || vu0Var8.g().equals(str7) || vu0Var8.k().equals(str7) || vu0Var8.M().equals(str7)) {
                        i4 = 1;
                        this.f33307S = i4;
                        this.f33308T = i5 >= 21 && this.f33300L.f34993o.isEmpty() && f33282F0.r().equals(str);
                        if (i5 >= 18) {
                        }
                        z4 = true;
                        this.f33309U = z4;
                        this.f33310V = i5 != 29 && f33282F0.d().equals(str);
                        if (i5 <= 23) {
                        }
                        if (i5 <= 19) {
                        }
                        z5 = false;
                        this.f33311W = z5;
                        this.f33312X = i5 != 21 && f33282F0.C().equals(str);
                        if (i5 < 21) {
                        }
                        z6 = false;
                        this.f33313Y = z6;
                        this.f33314Z = i5 > 18 && this.f33300L.f35004z == 1 && f33282F0.q().equals(str);
                        String str62222 = su0Var.f31947a;
                        if (i5 <= 25) {
                        }
                        if (i5 <= 29) {
                        }
                        vu0Var = f33282F0;
                        if (vu0Var.b().equals(u82.f32875c)) {
                        }
                        z7 = false;
                        this.f33317c0 = z7;
                        this.f33299K.getClass();
                        if (f33282F0.e().equals(su0Var.f31947a)) {
                        }
                        if (getState() == 2) {
                        }
                        this.f33287B0.f25490a++;
                        a(str, elapsedRealtime2, elapsedRealtime2 - elapsedRealtime);
                    }
                }
            }
            i4 = 0;
            this.f33307S = i4;
            this.f33308T = i5 >= 21 && this.f33300L.f34993o.isEmpty() && f33282F0.r().equals(str);
            if (i5 >= 18) {
            }
            z4 = true;
            this.f33309U = z4;
            this.f33310V = i5 != 29 && f33282F0.d().equals(str);
            if (i5 <= 23) {
            }
            if (i5 <= 19) {
            }
            z5 = false;
            this.f33311W = z5;
            this.f33312X = i5 != 21 && f33282F0.C().equals(str);
            if (i5 < 21) {
            }
            z6 = false;
            this.f33313Y = z6;
            this.f33314Z = i5 > 18 && this.f33300L.f35004z == 1 && f33282F0.q().equals(str);
            String str622222 = su0Var.f31947a;
            if (i5 <= 25) {
            }
            if (i5 <= 29) {
            }
            vu0Var = f33282F0;
            if (vu0Var.b().equals(u82.f32875c)) {
            }
            z7 = false;
            this.f33317c0 = z7;
            this.f33299K.getClass();
            if (f33282F0.e().equals(su0Var.f31947a)) {
            }
            if (getState() == 2) {
            }
            this.f33287B0.f25490a++;
            a(str, elapsedRealtime2, elapsedRealtime2 - elapsedRealtime);
        } catch (Throwable th) {
            j52.a();
            throw th;
        }
    }

    protected void c(long j4) {
        while (true) {
            int i4 = this.f33293E0;
            if (i4 == 0 || j4 < this.f33284A[0]) {
                return;
            }
            long[] jArr = this.f33350y;
            this.f33289C0 = jArr[0];
            this.f33291D0 = this.f33352z[0];
            int i5 = i4 - 1;
            this.f33293E0 = i5;
            System.arraycopy(jArr, 1, jArr, 0, i5);
            long[] jArr2 = this.f33352z;
            System.arraycopy(jArr2, 1, jArr2, 0, this.f33293E0);
            long[] jArr3 = this.f33284A;
            System.arraycopy(jArr3, 1, jArr3, 0, this.f33293E0);
            L();
        }
    }

    private boolean c(int i4) {
        zb0 q4 = q();
        this.f33336r.b();
        int a4 = a(q4, this.f33336r, i4 | 4);
        if (a4 == -5) {
            a(q4);
            return true;
        }
        if (a4 != -4 || !this.f33336r.f()) {
            return false;
        }
        this.f33347w0 = true;
        M();
        return false;
    }

    private boolean c(yb0 yb0Var) {
        if (u82.f32873a >= 23 && this.f33299K != null && this.f33335q0 != 3 && getState() != 0) {
            float a4 = a(this.f33298J, s());
            float f4 = this.f33303O;
            if (f4 == a4) {
                return true;
            }
            if (a4 == -1.0f) {
                if (this.f33337r0) {
                    this.f33333p0 = 1;
                    this.f33335q0 = 3;
                    return false;
                }
                N();
                K();
                return false;
            }
            if (f4 == -1.0f && a4 <= this.f33334q) {
                return true;
            }
            Bundle bundle = new Bundle();
            bundle.putFloat("operating-rate", a4);
            this.f33299K.a(bundle);
            this.f33303O = a4;
        }
        return true;
    }

    @Override // com.yandex.mobile.ads.impl.AbstractC1811ak, com.yandex.mobile.ads.impl.so1
    public boolean a() {
        return this.f33349x0;
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00fa A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0051 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00c0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void a(MediaCrypto mediaCrypto, boolean z4) {
        b bVar;
        if (this.f33304P == null) {
            try {
                List<su0> a4 = a(z4);
                ArrayDeque<su0> arrayDeque = new ArrayDeque<>();
                this.f33304P = arrayDeque;
                if (this.f33332p) {
                    arrayDeque.addAll(a4);
                } else if (!a4.isEmpty()) {
                    this.f33304P.add(a4.get(0));
                }
                this.f33305Q = null;
            } catch (av0.b e4) {
                throw new b(-49998, this.f33286B, e4, z4);
            }
        }
        if (!this.f33304P.isEmpty()) {
            su0 peekFirst = this.f33304P.peekFirst();
            while (this.f33299K == null) {
                su0 peekFirst2 = this.f33304P.peekFirst();
                if (!a(peekFirst2)) {
                    return;
                }
                try {
                    a(peekFirst2, mediaCrypto);
                } catch (Exception e5) {
                    if (peekFirst2 == peekFirst) {
                        try {
                            ms0.d("MediaCodecRenderer", "Preferred decoder instantiation failed. Sleeping for 50ms then retrying.");
                            Thread.sleep(50L);
                            a(peekFirst2, mediaCrypto);
                        } catch (Exception e6) {
                            ms0.b("MediaCodecRenderer", "Failed to initialize decoder: " + peekFirst2, e6);
                            this.f33304P.removeFirst();
                            yb0 yb0Var = this.f33286B;
                            b bVar2 = new b("Decoder init failed: " + peekFirst2.f31947a + ", " + yb0Var, e6, yb0Var.f34991m, z4, peekFirst2, u82.f32873a < 21 ? b.a(e6) : null);
                            a(bVar2);
                            bVar = this.f33305Q;
                            if (bVar != null) {
                                this.f33305Q = bVar2;
                            } else {
                                this.f33305Q = new b(bVar.getMessage(), bVar.getCause(), bVar.f33354b, bVar.f33355c, bVar.f33356d, bVar.f33357e);
                            }
                            if (!this.f33304P.isEmpty()) {
                                throw this.f33305Q;
                            }
                        }
                    } else {
                        throw e5;
                    }
                    ms0.b("MediaCodecRenderer", "Failed to initialize decoder: " + peekFirst2, e6);
                    this.f33304P.removeFirst();
                    yb0 yb0Var2 = this.f33286B;
                    b bVar22 = new b("Decoder init failed: " + peekFirst2.f31947a + ", " + yb0Var2, e6, yb0Var2.f34991m, z4, peekFirst2, u82.f32873a < 21 ? b.a(e6) : null);
                    a(bVar22);
                    bVar = this.f33305Q;
                    if (bVar != null) {
                    }
                    if (!this.f33304P.isEmpty()) {
                    }
                }
            }
            this.f33304P = null;
            return;
        }
        throw new b(-49999, this.f33286B, null, z4);
    }

    @Override // com.yandex.mobile.ads.impl.AbstractC1811ak
    protected void a(boolean z4, boolean z5) {
        this.f33287B0 = new ey();
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x0072, code lost:
    
        if (r12 != false) goto L112;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x00aa, code lost:
    
        if (z() == false) goto L98;
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x00dc, code lost:
    
        if (z() == false) goto L98;
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x00f1, code lost:
    
        if (z() == false) goto L98;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    protected iy a(zb0 zb0Var) {
        int i4;
        gc0 a4;
        boolean z4 = true;
        this.f33351y0 = true;
        yb0 yb0Var = zb0Var.f35541b;
        yb0Var.getClass();
        if (yb0Var.f34991m != null) {
            v30 v30Var = zb0Var.f35540a;
            v30.a(this.f33292E, v30Var);
            this.f33292E = v30Var;
            this.f33286B = yb0Var;
            if (this.f33325k0) {
                this.f33327m0 = true;
                return null;
            }
            ou0 ou0Var = this.f33299K;
            if (ou0Var == null) {
                this.f33304P = null;
                K();
                return null;
            }
            su0 su0Var = this.f33306R;
            yb0 yb0Var2 = this.f33300L;
            v30 v30Var2 = this.f33290D;
            int i5 = 0;
            if (v30Var2 != v30Var) {
                if (v30Var != null && v30Var2 != null && u82.f32873a >= 23) {
                    UUID uuid = C1813am.f23362e;
                    if (!uuid.equals(v30Var2.getSchemeUuid()) && !uuid.equals(v30Var.getSchemeUuid()) && (a4 = a(v30Var)) != null) {
                        boolean requiresSecureDecoder = a4.f26111c ? false : v30Var.requiresSecureDecoder(yb0Var.f34991m);
                        if (!su0Var.f31952f) {
                        }
                    }
                }
                if (this.f33337r0) {
                    this.f33333p0 = 1;
                    this.f33335q0 = 3;
                } else {
                    N();
                    K();
                }
                return new iy(su0Var.f31947a, yb0Var2, yb0Var, 0, UserVerificationMethods.USER_VERIFY_PATTERN);
            }
            boolean z5 = this.f33292E != this.f33290D;
            if (z5 && u82.f32873a < 23) {
                throw new IllegalStateException();
            }
            iy a5 = a(su0Var, yb0Var2, yb0Var);
            int i6 = a5.f27419d;
            if (i6 != 0) {
                if (i6 == 1) {
                    if (c(yb0Var)) {
                        this.f33300L = yb0Var;
                        if (!z5) {
                            if (this.f33337r0) {
                                this.f33333p0 = 1;
                                if (!this.f33309U && !this.f33311W) {
                                    this.f33335q0 = 1;
                                } else {
                                    this.f33335q0 = 3;
                                    i4 = 2;
                                }
                            }
                        }
                    }
                    i5 = 16;
                } else if (i6 == 2) {
                    if (c(yb0Var)) {
                        this.f33329n0 = true;
                        this.f33331o0 = 1;
                        int i7 = this.f33307S;
                        if (i7 != 2 && (i7 != 1 || yb0Var.f34996r != yb0Var2.f34996r || yb0Var.f34997s != yb0Var2.f34997s)) {
                            z4 = false;
                        }
                        this.f33315a0 = z4;
                        this.f33300L = yb0Var;
                        if (z5) {
                        }
                    }
                    i5 = 16;
                } else if (i6 == 3) {
                    if (c(yb0Var)) {
                        this.f33300L = yb0Var;
                        if (z5) {
                        }
                    }
                    i5 = 16;
                } else {
                    throw new IllegalStateException();
                }
                return (a5.f27419d != 0 || (this.f33299K == ou0Var && this.f33335q0 != 3)) ? a5 : new iy(su0Var.f31947a, yb0Var2, yb0Var, 0, i4);
            }
            if (this.f33337r0) {
                this.f33333p0 = 1;
                this.f33335q0 = 3;
            } else {
                N();
                K();
            }
            i4 = i5;
            if (a5.f27419d != 0) {
            }
        }
        throw a(new IllegalArgumentException(), yb0Var, IronSourceConstants.NT_INSTANCE_LOAD_SUCCESS);
    }

    @Override // com.yandex.mobile.ads.impl.AbstractC1811ak
    protected void a(long j4, boolean z4) {
        this.f33347w0 = false;
        this.f33349x0 = false;
        this.f33353z0 = false;
        if (this.f33325k0) {
            this.f33342u.b();
            this.f33340t.b();
            this.f33326l0 = false;
        } else {
            C();
        }
        if (this.f33344v.d() > 0) {
            this.f33351y0 = true;
        }
        this.f33344v.a();
        int i4 = this.f33293E0;
        if (i4 != 0) {
            int i5 = i4 - 1;
            this.f33291D0 = this.f33352z[i5];
            this.f33289C0 = this.f33350y[i5];
            this.f33293E0 = 0;
        }
    }

    @Override // com.yandex.mobile.ads.impl.AbstractC1811ak
    protected final void a(yb0[] yb0VarArr, long j4, long j5) {
        if (this.f33291D0 == -9223372036854775807L) {
            if (this.f33289C0 == -9223372036854775807L) {
                this.f33289C0 = j4;
                this.f33291D0 = j5;
                return;
            }
            throw new IllegalStateException();
        }
        int i4 = this.f33293E0;
        if (i4 == this.f33352z.length) {
            ms0.d("MediaCodecRenderer", "Too many stream changes, so dropping offset: " + this.f33352z[this.f33293E0 - 1]);
        } else {
            this.f33293E0 = i4 + 1;
        }
        long[] jArr = this.f33350y;
        int i5 = this.f33293E0 - 1;
        jArr[i5] = j4;
        this.f33352z[i5] = j5;
        this.f33284A[i5] = this.f33343u0;
    }

    @Override // com.yandex.mobile.ads.impl.so1
    public final void a(long j4, long j5) {
        boolean z4 = false;
        if (this.f33353z0) {
            this.f33353z0 = false;
            M();
        }
        c60 c60Var = this.f33285A0;
        if (c60Var == null) {
            try {
                if (this.f33349x0) {
                    O();
                    return;
                }
                if (this.f33286B != null || c(2)) {
                    K();
                    if (this.f33325k0) {
                        j52.a("bypassRender");
                        while (b(j4, j5)) {
                        }
                        j52.a();
                    } else if (this.f33299K != null) {
                        long elapsedRealtime = SystemClock.elapsedRealtime();
                        j52.a("drainAndFeed");
                        while (c(j4, j5) && (this.f33296H == -9223372036854775807L || SystemClock.elapsedRealtime() - elapsedRealtime < this.f33296H)) {
                        }
                        while (A() && (this.f33296H == -9223372036854775807L || SystemClock.elapsedRealtime() - elapsedRealtime < this.f33296H)) {
                        }
                        j52.a();
                    } else {
                        this.f33287B0.f25493d += b(j4);
                        c(1);
                    }
                    synchronized (this.f33287B0) {
                    }
                    return;
                }
                return;
            } catch (IllegalStateException e4) {
                int i4 = u82.f32873a;
                if (i4 < 21 || !(e4 instanceof MediaCodec.CodecException)) {
                    StackTraceElement[] stackTrace = e4.getStackTrace();
                    if (stackTrace.length <= 0 || !stackTrace[0].getClassName().equals("android.media.MediaCodec")) {
                        throw e4;
                    }
                }
                a(e4);
                if (i4 >= 21 && (e4 instanceof MediaCodec.CodecException) && ((MediaCodec.CodecException) e4).isRecoverable()) {
                    z4 = true;
                }
                if (z4) {
                    N();
                }
                throw a(4003, this.f33286B, a(e4, this.f33306R), z4);
            }
        }
        this.f33285A0 = null;
        throw c60Var;
    }

    protected final void a(c60 c60Var) {
        this.f33285A0 = c60Var;
    }

    @Override // com.yandex.mobile.ads.impl.so1
    public void a(float f4, float f5) {
        this.f33297I = f4;
        this.f33298J = f5;
        c(this.f33300L);
    }

    @Override // com.yandex.mobile.ads.impl.to1
    public final int a(yb0 yb0Var) {
        try {
            return a(this.f33330o, yb0Var);
        } catch (av0.b e4) {
            throw a(e4, yb0Var, IronSourceConstants.NT_INSTANCE_LOAD);
        }
    }

    protected ru0 a(IllegalStateException illegalStateException, su0 su0Var) {
        return new ru0(illegalStateException, su0Var);
    }
}
