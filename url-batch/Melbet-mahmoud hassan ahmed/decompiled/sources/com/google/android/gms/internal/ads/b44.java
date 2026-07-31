package com.google.android.gms.internal.ads;

import android.annotation.TargetApi;
import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaCryptoException;
import android.media.MediaFormat;
import android.os.Bundle;
import android.os.SystemClock;
import android.util.Log;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.UUID;

/* loaded from: classes.dex */
public abstract class b44 extends bc3 {
    private static final byte[] F0 = {0, 0, 1, 103, 66, -64, 11, -38, 37, -112, 0, 0, 1, 104, -50, 15, 19, 32, 0, 0, 1, 101, -120, -124, 13, -50, 113, 24, -96, 0, 47, -65, 28, 49, -61, 39, 93, 120};
    private final long[] A;
    private long A0;
    private final long[] B;
    private long B0;
    private final long[] C;
    private int C0;
    private c0 D;
    private c34 D0;
    private c0 E;
    private c34 E0;
    private MediaCrypto F;
    private boolean G;
    private long H;
    private float I;
    private float J;
    private x34 K;
    private c0 L;
    private MediaFormat M;
    private boolean N;
    private float O;
    private ArrayDeque<z34> P;
    private a44 Q;
    private z34 R;
    private int S;
    private boolean T;
    private boolean U;
    private boolean V;
    private boolean W;
    private boolean X;
    private boolean Y;
    private boolean Z;

    /* renamed from: a0, reason: collision with root package name */
    private boolean f3211a0;

    /* renamed from: b0, reason: collision with root package name */
    private boolean f3212b0;

    /* renamed from: c0, reason: collision with root package name */
    private boolean f3213c0;

    /* renamed from: d0, reason: collision with root package name */
    private s34 f3214d0;

    /* renamed from: e0, reason: collision with root package name */
    private long f3215e0;

    /* renamed from: f0, reason: collision with root package name */
    private int f3216f0;

    /* renamed from: g0, reason: collision with root package name */
    private int f3217g0;

    /* renamed from: h0, reason: collision with root package name */
    private ByteBuffer f3218h0;

    /* renamed from: i0, reason: collision with root package name */
    private boolean f3219i0;

    /* renamed from: j0, reason: collision with root package name */
    private boolean f3220j0;

    /* renamed from: k0, reason: collision with root package name */
    private boolean f3221k0;

    /* renamed from: l0, reason: collision with root package name */
    private boolean f3222l0;

    /* renamed from: m0, reason: collision with root package name */
    private boolean f3223m0;

    /* renamed from: n0, reason: collision with root package name */
    private boolean f3224n0;

    /* renamed from: o0, reason: collision with root package name */
    private int f3225o0;

    /* renamed from: p0, reason: collision with root package name */
    private int f3226p0;

    /* renamed from: q, reason: collision with root package name */
    private final w34 f3227q;

    /* renamed from: q0, reason: collision with root package name */
    private int f3228q0;

    /* renamed from: r, reason: collision with root package name */
    private final d44 f3229r;

    /* renamed from: r0, reason: collision with root package name */
    private boolean f3230r0;

    /* renamed from: s, reason: collision with root package name */
    private final float f3231s;

    /* renamed from: s0, reason: collision with root package name */
    private boolean f3232s0;

    /* renamed from: t, reason: collision with root package name */
    private final z51 f3233t;

    /* renamed from: t0, reason: collision with root package name */
    private boolean f3234t0;

    /* renamed from: u, reason: collision with root package name */
    private final z51 f3235u;

    /* renamed from: u0, reason: collision with root package name */
    private long f3236u0;

    /* renamed from: v, reason: collision with root package name */
    private final z51 f3237v;

    /* renamed from: v0, reason: collision with root package name */
    private long f3238v0;

    /* renamed from: w, reason: collision with root package name */
    private final q34 f3239w;

    /* renamed from: w0, reason: collision with root package name */
    private boolean f3240w0;

    /* renamed from: x, reason: collision with root package name */
    private final jx2<c0> f3241x;

    /* renamed from: x0, reason: collision with root package name */
    private boolean f3242x0;

    /* renamed from: y, reason: collision with root package name */
    private final ArrayList<Long> f3243y;

    /* renamed from: y0, reason: collision with root package name */
    private boolean f3244y0;

    /* renamed from: z, reason: collision with root package name */
    private final MediaCodec.BufferInfo f3245z;

    /* renamed from: z0, reason: collision with root package name */
    protected cd3 f3246z0;

    public b44(int i7, w34 w34Var, d44 d44Var, boolean z6, float f7) {
        super(i7);
        this.f3227q = w34Var;
        Objects.requireNonNull(d44Var);
        this.f3229r = d44Var;
        this.f3231s = f7;
        this.f3233t = new z51(0, 0);
        this.f3235u = new z51(0, 0);
        this.f3237v = new z51(2, 0);
        q34 q34Var = new q34();
        this.f3239w = q34Var;
        this.f3241x = new jx2<>(10);
        this.f3243y = new ArrayList<>();
        this.f3245z = new MediaCodec.BufferInfo();
        this.I = 1.0f;
        this.J = 1.0f;
        this.H = -9223372036854775807L;
        this.A = new long[10];
        this.B = new long[10];
        this.C = new long[10];
        this.A0 = -9223372036854775807L;
        this.B0 = -9223372036854775807L;
        q34Var.i(0);
        q34Var.f14952c.order(ByteOrder.nativeOrder());
        this.O = -1.0f;
        this.S = 0;
        this.f3225o0 = 0;
        this.f3216f0 = -1;
        this.f3217g0 = -1;
        this.f3215e0 = -9223372036854775807L;
        this.f3236u0 = -9223372036854775807L;
        this.f3238v0 = -9223372036854775807L;
        this.f3226p0 = 0;
        this.f3228q0 = 0;
    }

    protected static boolean B0(c0 c0Var) {
        return c0Var.E == 0;
    }

    @TargetApi(23)
    private final void C0() {
        int i7 = this.f3228q0;
        if (i7 == 1) {
            h0();
            return;
        }
        if (i7 == 2) {
            h0();
            F0();
        } else if (i7 != 3) {
            this.f3242x0 = true;
            k0();
        } else {
            v0();
            t0();
        }
    }

    private final void D0() {
        this.f3216f0 = -1;
        this.f3235u.f14952c = null;
    }

    private final void E0() {
        this.f3217g0 = -1;
        this.f3218h0 = null;
    }

    private final void F0() {
        try {
            throw null;
        } catch (MediaCryptoException e7) {
            throw w(e7, this.D, false, 6006);
        }
    }

    @TargetApi(23)
    private final boolean G0() {
        if (this.f3230r0) {
            this.f3226p0 = 1;
            if (this.U || this.W) {
                this.f3228q0 = 3;
                return false;
            }
            this.f3228q0 = 2;
        } else {
            F0();
        }
        return true;
    }

    private final void R() {
        this.f3223m0 = false;
        this.f3239w.b();
        this.f3237v.b();
        this.f3222l0 = false;
        this.f3221k0 = false;
    }

    private final void S() {
        if (this.f3230r0) {
            this.f3226p0 = 1;
            this.f3228q0 = 3;
        } else {
            v0();
            t0();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0 */
    /* JADX WARN: Type inference failed for: r1v3, types: [int] */
    private final boolean Z() {
        x34 x34Var = this.K;
        boolean z6 = 0;
        if (x34Var == null || this.f3226p0 == 2 || this.f3240w0) {
            return false;
        }
        if (this.f3216f0 < 0) {
            int zza = x34Var.zza();
            this.f3216f0 = zza;
            if (zza < 0) {
                return false;
            }
            this.f3235u.f14952c = this.K.E(zza);
            this.f3235u.b();
        }
        if (this.f3226p0 == 1) {
            if (!this.f3213c0) {
                this.f3232s0 = true;
                this.K.b(this.f3216f0, 0, 0, 0L, 4);
                D0();
            }
            this.f3226p0 = 2;
            return false;
        }
        if (this.f3211a0) {
            this.f3211a0 = false;
            this.f3235u.f14952c.put(F0);
            this.K.b(this.f3216f0, 0, 38, 0L, 0);
            D0();
            this.f3230r0 = true;
            return true;
        }
        if (this.f3225o0 == 1) {
            for (int i7 = 0; i7 < this.L.f3662n.size(); i7++) {
                this.f3235u.f14952c.put(this.L.f3662n.get(i7));
            }
            this.f3225o0 = 2;
        }
        int position = this.f3235u.f14952c.position();
        cx3 y6 = y();
        try {
            int u6 = u(y6, this.f3235u, 0);
            if (A()) {
                this.f3238v0 = this.f3236u0;
            }
            if (u6 == -3) {
                return false;
            }
            if (u6 == -5) {
                if (this.f3225o0 == 2) {
                    this.f3235u.b();
                    this.f3225o0 = 1;
                }
                Q(y6);
                return true;
            }
            if (this.f3235u.g()) {
                if (this.f3225o0 == 2) {
                    this.f3235u.b();
                    this.f3225o0 = 1;
                }
                this.f3240w0 = true;
                if (!this.f3230r0) {
                    C0();
                    return false;
                }
                try {
                    if (!this.f3213c0) {
                        this.f3232s0 = true;
                        this.K.b(this.f3216f0, 0, 0, 0L, 4);
                        D0();
                    }
                    return false;
                } catch (MediaCodec.CryptoException e7) {
                    throw w(e7, this.D, false, nz3.b(e7.getErrorCode()));
                }
            }
            if (!this.f3230r0 && !this.f3235u.h()) {
                this.f3235u.b();
                if (this.f3225o0 == 2) {
                    this.f3225o0 = 1;
                }
                return true;
            }
            boolean k7 = this.f3235u.k();
            if (k7) {
                this.f3235u.f14951b.b(position);
            }
            if (this.T && !k7) {
                ByteBuffer byteBuffer = this.f3235u.f14952c;
                byte[] bArr = th2.f12217a;
                int position2 = byteBuffer.position();
                int i8 = 0;
                int i9 = 0;
                while (true) {
                    int i10 = i8 + 1;
                    if (i10 >= position2) {
                        byteBuffer.clear();
                        break;
                    }
                    int i11 = byteBuffer.get(i8) & 255;
                    if (i9 == 3) {
                        if (i11 == 1) {
                            if ((byteBuffer.get(i10) & 31) == 7) {
                                ByteBuffer duplicate = byteBuffer.duplicate();
                                duplicate.position(i8 - 3);
                                duplicate.limit(position2);
                                byteBuffer.position(0);
                                byteBuffer.put(duplicate);
                                break;
                            }
                            i11 = 1;
                        }
                    } else if (i11 == 0) {
                        i9++;
                    }
                    if (i11 != 0) {
                        i9 = 0;
                    }
                    i8 = i10;
                }
                if (this.f3235u.f14952c.position() == 0) {
                    return true;
                }
                this.T = false;
            }
            z51 z51Var = this.f3235u;
            long j7 = z51Var.f14954e;
            s34 s34Var = this.f3214d0;
            if (s34Var != null) {
                j7 = s34Var.b(this.D, z51Var);
                this.f3236u0 = Math.max(this.f3236u0, this.f3214d0.a(this.D));
            }
            long j8 = j7;
            if (this.f3235u.f()) {
                this.f3243y.add(Long.valueOf(j8));
            }
            if (this.f3244y0) {
                this.f3241x.d(j8, this.D);
                this.f3244y0 = false;
            }
            this.f3236u0 = Math.max(this.f3236u0, j8);
            this.f3235u.j();
            if (this.f3235u.e()) {
                s0(this.f3235u);
            }
            j0(this.f3235u);
            try {
                if (k7) {
                    this.K.f(this.f3216f0, 0, this.f3235u.f14951b, j8, 0);
                } else {
                    this.K.b(this.f3216f0, 0, this.f3235u.f14952c.limit(), j8, 0);
                }
                D0();
                this.f3230r0 = true;
                this.f3225o0 = 0;
                cd3 cd3Var = this.f3246z0;
                z6 = cd3Var.f3809c + 1;
                cd3Var.f3809c = z6;
                return true;
            } catch (MediaCodec.CryptoException e8) {
                throw w(e8, this.D, z6, nz3.b(e8.getErrorCode()));
            }
        } catch (x41 e9) {
            V(e9);
            b0(0);
            h0();
            return true;
        }
    }

    private final boolean a0() {
        return this.f3217g0 >= 0;
    }

    private final boolean b0(int i7) {
        cx3 y6 = y();
        this.f3233t.b();
        int u6 = u(y6, this.f3233t, i7 | 4);
        if (u6 == -5) {
            Q(y6);
            return true;
        }
        if (u6 != -4 || !this.f3233t.g()) {
            return false;
        }
        this.f3240w0 = true;
        C0();
        return false;
    }

    private final boolean d0(long j7) {
        return this.H == -9223372036854775807L || SystemClock.elapsedRealtime() - j7 < this.H;
    }

    private final boolean g0(c0 c0Var) {
        if (n13.f8865a >= 23 && this.K != null && this.f3228q0 != 3 && q() != 0) {
            float N = N(this.J, c0Var, t());
            float f7 = this.O;
            if (f7 == N) {
                return true;
            }
            if (N == -1.0f) {
                S();
                return false;
            }
            if (f7 == -1.0f && N <= this.f3231s) {
                return true;
            }
            Bundle bundle = new Bundle();
            bundle.putFloat("operating-rate", N);
            this.K.S(bundle);
            this.O = N;
        }
        return true;
    }

    private final void h0() {
        try {
            this.K.h();
        } finally {
            w0();
        }
    }

    protected boolean A0(z34 z34Var) {
        return true;
    }

    @Override // com.google.android.gms.internal.ads.bc3
    protected void B() {
        this.D = null;
        this.A0 = -9223372036854775807L;
        this.B0 = -9223372036854775807L;
        this.C0 = 0;
        z0();
    }

    @Override // com.google.android.gms.internal.ads.bc3
    protected void D(boolean z6, boolean z7) {
        this.f3246z0 = new cd3();
    }

    @Override // com.google.android.gms.internal.ads.bc3
    protected void E(long j7, boolean z6) {
        this.f3240w0 = false;
        this.f3242x0 = false;
        if (this.f3221k0) {
            this.f3239w.b();
            this.f3237v.b();
            this.f3222l0 = false;
        } else {
            y0();
        }
        if (this.f3241x.a() > 0) {
            this.f3244y0 = true;
        }
        this.f3241x.e();
        int i7 = this.C0;
        if (i7 != 0) {
            int i8 = i7 - 1;
            this.B0 = this.B[i8];
            this.A0 = this.A[i8];
            this.C0 = 0;
        }
    }

    @Override // com.google.android.gms.internal.ads.bc3
    protected void F() {
        try {
            R();
            v0();
        } finally {
            this.E0 = null;
        }
    }

    @Override // com.google.android.gms.internal.ads.xx3
    public boolean K() {
        return this.f3242x0;
    }

    @Override // com.google.android.gms.internal.ads.bc3
    protected final void L(c0[] c0VarArr, long j7, long j8) {
        if (this.B0 == -9223372036854775807L) {
            wu1.f(this.A0 == -9223372036854775807L);
            this.A0 = j7;
            this.B0 = j8;
            return;
        }
        int i7 = this.C0;
        if (i7 == 10) {
            long j9 = this.B[9];
            StringBuilder sb = new StringBuilder(65);
            sb.append("Too many stream changes, so dropping offset: ");
            sb.append(j9);
            Log.w("MediaCodecRenderer", sb.toString());
        } else {
            this.C0 = i7 + 1;
        }
        long[] jArr = this.A;
        int i8 = this.C0 - 1;
        jArr[i8] = j7;
        this.B[i8] = j8;
        this.C[i8] = this.f3236u0;
    }

    protected abstract float N(float f7, c0 c0Var, c0[] c0VarArr);

    protected abstract int O(d44 d44Var, c0 c0Var);

    protected abstract de3 P(z34 z34Var, c0 c0Var, c0 c0Var2);

    /* JADX WARN: Code restructure failed: missing block: B:27:0x005b, code lost:
    
        if (G0() == false) goto L56;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x0087, code lost:
    
        if (G0() == false) goto L56;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x009b, code lost:
    
        if (G0() == false) goto L56;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    protected de3 Q(cx3 cx3Var) {
        int i7;
        boolean z6 = true;
        this.f3244y0 = true;
        c0 c0Var = cx3Var.f3980a;
        Objects.requireNonNull(c0Var);
        if (c0Var.f3660l == null) {
            throw w(new IllegalArgumentException(), c0Var, false, 4005);
        }
        c34 c34Var = cx3Var.f3981b;
        this.E0 = c34Var;
        this.D = c0Var;
        if (this.f3221k0) {
            this.f3223m0 = true;
            return null;
        }
        x34 x34Var = this.K;
        if (x34Var == null) {
            this.P = null;
            t0();
            return null;
        }
        z34 z34Var = this.R;
        c0 c0Var2 = this.L;
        c34 c34Var2 = this.D0;
        if (c34Var2 != c34Var) {
            if (c34Var != null && c34Var2 != null && n13.f8865a >= 23) {
                UUID uuid = nz3.f9409e;
                UUID uuid2 = nz3.f9405a;
                if (!uuid.equals(uuid2)) {
                    uuid.equals(uuid2);
                }
            }
            S();
            return new de3(z34Var.f14931a, c0Var2, c0Var, 0, 128);
        }
        wu1.f(c34Var == c34Var2 || n13.f8865a >= 23);
        de3 P = P(z34Var, c0Var2, c0Var);
        int i8 = P.f4189d;
        if (i8 != 0) {
            if (i8 == 1) {
                if (g0(c0Var)) {
                    this.L = c0Var;
                    if (c34Var == c34Var2) {
                        if (this.f3230r0) {
                            this.f3226p0 = 1;
                            if (this.U || this.W) {
                                this.f3228q0 = 3;
                                i7 = 2;
                            } else {
                                this.f3228q0 = 1;
                            }
                        }
                    }
                }
                i7 = 16;
            } else if (i8 != 2) {
                if (g0(c0Var)) {
                    this.L = c0Var;
                    if (c34Var != c34Var2) {
                    }
                }
                i7 = 16;
            } else {
                if (g0(c0Var)) {
                    this.f3224n0 = true;
                    this.f3225o0 = 1;
                    int i9 = this.S;
                    if (i9 != 2 && (i9 != 1 || c0Var.f3665q != c0Var2.f3665q || c0Var.f3666r != c0Var2.f3666r)) {
                        z6 = false;
                    }
                    this.f3211a0 = z6;
                    this.L = c0Var;
                    if (c34Var != c34Var2) {
                    }
                }
                i7 = 16;
            }
            return (P.f4189d != 0 || (this.K == x34Var && this.f3228q0 != 3)) ? P : new de3(z34Var.f14931a, c0Var2, c0Var, 0, i7);
        }
        S();
        i7 = 0;
        if (P.f4189d != 0) {
        }
    }

    protected abstract v34 T(z34 z34Var, c0 c0Var, MediaCrypto mediaCrypto, float f7);

    protected abstract List<z34> U(d44 d44Var, c0 c0Var, boolean z6);

    protected abstract void V(Exception exc);

    protected abstract void W(String str, long j7, long j8);

    protected abstract void X(String str);

    protected abstract void Y(c0 c0Var, MediaFormat mediaFormat);

    @Override // com.google.android.gms.internal.ads.bc3, com.google.android.gms.internal.ads.yx3
    public final int b() {
        return 8;
    }

    /*  JADX ERROR: Type inference failed
        jadx.core.utils.exceptions.JadxOverflowException: Type inference error: updates count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:77)
        */
    @Override // com.google.android.gms.internal.ads.xx3
    public final void e(long r24, long r26) {
        /*
            Method dump skipped, instructions count: 940
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.b44.e(long, long):void");
    }

    @Override // com.google.android.gms.internal.ads.xx3
    public boolean f0() {
        if (this.D != null) {
            if (s() || a0()) {
                return true;
            }
            if (this.f3215e0 != -9223372036854775807L && SystemClock.elapsedRealtime() < this.f3215e0) {
                return true;
            }
        }
        return false;
    }

    protected abstract void i0();

    @Override // com.google.android.gms.internal.ads.yx3
    public final int j(c0 c0Var) {
        try {
            return O(this.f3229r, c0Var);
        } catch (k44 e7) {
            throw w(e7, c0Var, false, 4002);
        }
    }

    protected abstract void j0(z51 z51Var);

    protected void k0() {
    }

    protected abstract boolean l0(long j7, long j8, x34 x34Var, ByteBuffer byteBuffer, int i7, int i8, int i9, long j9, boolean z6, boolean z7, c0 c0Var);

    protected boolean m0(c0 c0Var) {
        return false;
    }

    @Override // com.google.android.gms.internal.ads.bc3, com.google.android.gms.internal.ads.xx3
    public void n(float f7, float f8) {
        this.I = f7;
        this.J = f8;
        g0(this.L);
    }

    protected final float n0() {
        return this.I;
    }

    protected final long o0() {
        return this.B0;
    }

    protected final x34 p0() {
        return this.K;
    }

    protected y34 q0(Throwable th, z34 z34Var) {
        return new y34(th, z34Var);
    }

    protected final z34 r0() {
        return this.R;
    }

    protected void s0(z51 z51Var) {
    }

    /* JADX WARN: Code restructure failed: missing block: B:173:0x026f, code lost:
    
        if ("stvm8".equals(r6) == false) goto L154;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:105:0x0287 A[Catch: Exception -> 0x0384, TryCatch #5 {Exception -> 0x0384, blocks: (B:39:0x00b8, B:42:0x00d1, B:45:0x00d9, B:48:0x00e9, B:49:0x00f3, B:51:0x0100, B:53:0x0116, B:54:0x0121, B:55:0x0173, B:58:0x0187, B:60:0x018d, B:62:0x0197, B:64:0x019f, B:66:0x01a7, B:69:0x01ea, B:71:0x01f2, B:73:0x01fa, B:76:0x0205, B:79:0x020f, B:81:0x0217, B:84:0x0221, B:86:0x022b, B:88:0x0233, B:92:0x023d, B:94:0x0243, B:97:0x024e, B:99:0x0252, B:103:0x0283, B:105:0x0287, B:108:0x0292, B:110:0x0296, B:112:0x029e, B:114:0x02a8, B:116:0x02b2, B:118:0x02ba, B:120:0x02c2, B:122:0x02ca, B:124:0x02d2, B:127:0x02dd, B:129:0x02e3, B:131:0x02e7, B:134:0x02f2, B:136:0x02fa, B:140:0x033d, B:142:0x034e, B:143:0x0355, B:145:0x035c, B:146:0x0365, B:151:0x0309, B:154:0x0313, B:156:0x031b, B:158:0x0323, B:160:0x032d, B:162:0x0337, B:170:0x025f, B:172:0x0269, B:174:0x0271, B:176:0x0279, B:185:0x01b5, B:187:0x01bd, B:189:0x01c5, B:191:0x01cf, B:193:0x01d7, B:195:0x01df, B:199:0x011b, B:201:0x012e, B:203:0x0133, B:205:0x013f, B:206:0x014a, B:208:0x0154, B:213:0x0380, B:214:0x0383, B:219:0x0144, B:225:0x00ee, B:227:0x00c5), top: B:38:0x00b8, outer: #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0296 A[Catch: Exception -> 0x0384, TryCatch #5 {Exception -> 0x0384, blocks: (B:39:0x00b8, B:42:0x00d1, B:45:0x00d9, B:48:0x00e9, B:49:0x00f3, B:51:0x0100, B:53:0x0116, B:54:0x0121, B:55:0x0173, B:58:0x0187, B:60:0x018d, B:62:0x0197, B:64:0x019f, B:66:0x01a7, B:69:0x01ea, B:71:0x01f2, B:73:0x01fa, B:76:0x0205, B:79:0x020f, B:81:0x0217, B:84:0x0221, B:86:0x022b, B:88:0x0233, B:92:0x023d, B:94:0x0243, B:97:0x024e, B:99:0x0252, B:103:0x0283, B:105:0x0287, B:108:0x0292, B:110:0x0296, B:112:0x029e, B:114:0x02a8, B:116:0x02b2, B:118:0x02ba, B:120:0x02c2, B:122:0x02ca, B:124:0x02d2, B:127:0x02dd, B:129:0x02e3, B:131:0x02e7, B:134:0x02f2, B:136:0x02fa, B:140:0x033d, B:142:0x034e, B:143:0x0355, B:145:0x035c, B:146:0x0365, B:151:0x0309, B:154:0x0313, B:156:0x031b, B:158:0x0323, B:160:0x032d, B:162:0x0337, B:170:0x025f, B:172:0x0269, B:174:0x0271, B:176:0x0279, B:185:0x01b5, B:187:0x01bd, B:189:0x01c5, B:191:0x01cf, B:193:0x01d7, B:195:0x01df, B:199:0x011b, B:201:0x012e, B:203:0x0133, B:205:0x013f, B:206:0x014a, B:208:0x0154, B:213:0x0380, B:214:0x0383, B:219:0x0144, B:225:0x00ee, B:227:0x00c5), top: B:38:0x00b8, outer: #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:129:0x02e3 A[Catch: Exception -> 0x0384, TryCatch #5 {Exception -> 0x0384, blocks: (B:39:0x00b8, B:42:0x00d1, B:45:0x00d9, B:48:0x00e9, B:49:0x00f3, B:51:0x0100, B:53:0x0116, B:54:0x0121, B:55:0x0173, B:58:0x0187, B:60:0x018d, B:62:0x0197, B:64:0x019f, B:66:0x01a7, B:69:0x01ea, B:71:0x01f2, B:73:0x01fa, B:76:0x0205, B:79:0x020f, B:81:0x0217, B:84:0x0221, B:86:0x022b, B:88:0x0233, B:92:0x023d, B:94:0x0243, B:97:0x024e, B:99:0x0252, B:103:0x0283, B:105:0x0287, B:108:0x0292, B:110:0x0296, B:112:0x029e, B:114:0x02a8, B:116:0x02b2, B:118:0x02ba, B:120:0x02c2, B:122:0x02ca, B:124:0x02d2, B:127:0x02dd, B:129:0x02e3, B:131:0x02e7, B:134:0x02f2, B:136:0x02fa, B:140:0x033d, B:142:0x034e, B:143:0x0355, B:145:0x035c, B:146:0x0365, B:151:0x0309, B:154:0x0313, B:156:0x031b, B:158:0x0323, B:160:0x032d, B:162:0x0337, B:170:0x025f, B:172:0x0269, B:174:0x0271, B:176:0x0279, B:185:0x01b5, B:187:0x01bd, B:189:0x01c5, B:191:0x01cf, B:193:0x01d7, B:195:0x01df, B:199:0x011b, B:201:0x012e, B:203:0x0133, B:205:0x013f, B:206:0x014a, B:208:0x0154, B:213:0x0380, B:214:0x0383, B:219:0x0144, B:225:0x00ee, B:227:0x00c5), top: B:38:0x00b8, outer: #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:136:0x02fa A[Catch: Exception -> 0x0384, TryCatch #5 {Exception -> 0x0384, blocks: (B:39:0x00b8, B:42:0x00d1, B:45:0x00d9, B:48:0x00e9, B:49:0x00f3, B:51:0x0100, B:53:0x0116, B:54:0x0121, B:55:0x0173, B:58:0x0187, B:60:0x018d, B:62:0x0197, B:64:0x019f, B:66:0x01a7, B:69:0x01ea, B:71:0x01f2, B:73:0x01fa, B:76:0x0205, B:79:0x020f, B:81:0x0217, B:84:0x0221, B:86:0x022b, B:88:0x0233, B:92:0x023d, B:94:0x0243, B:97:0x024e, B:99:0x0252, B:103:0x0283, B:105:0x0287, B:108:0x0292, B:110:0x0296, B:112:0x029e, B:114:0x02a8, B:116:0x02b2, B:118:0x02ba, B:120:0x02c2, B:122:0x02ca, B:124:0x02d2, B:127:0x02dd, B:129:0x02e3, B:131:0x02e7, B:134:0x02f2, B:136:0x02fa, B:140:0x033d, B:142:0x034e, B:143:0x0355, B:145:0x035c, B:146:0x0365, B:151:0x0309, B:154:0x0313, B:156:0x031b, B:158:0x0323, B:160:0x032d, B:162:0x0337, B:170:0x025f, B:172:0x0269, B:174:0x0271, B:176:0x0279, B:185:0x01b5, B:187:0x01bd, B:189:0x01c5, B:191:0x01cf, B:193:0x01d7, B:195:0x01df, B:199:0x011b, B:201:0x012e, B:203:0x0133, B:205:0x013f, B:206:0x014a, B:208:0x0154, B:213:0x0380, B:214:0x0383, B:219:0x0144, B:225:0x00ee, B:227:0x00c5), top: B:38:0x00b8, outer: #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:142:0x034e A[Catch: Exception -> 0x0384, TryCatch #5 {Exception -> 0x0384, blocks: (B:39:0x00b8, B:42:0x00d1, B:45:0x00d9, B:48:0x00e9, B:49:0x00f3, B:51:0x0100, B:53:0x0116, B:54:0x0121, B:55:0x0173, B:58:0x0187, B:60:0x018d, B:62:0x0197, B:64:0x019f, B:66:0x01a7, B:69:0x01ea, B:71:0x01f2, B:73:0x01fa, B:76:0x0205, B:79:0x020f, B:81:0x0217, B:84:0x0221, B:86:0x022b, B:88:0x0233, B:92:0x023d, B:94:0x0243, B:97:0x024e, B:99:0x0252, B:103:0x0283, B:105:0x0287, B:108:0x0292, B:110:0x0296, B:112:0x029e, B:114:0x02a8, B:116:0x02b2, B:118:0x02ba, B:120:0x02c2, B:122:0x02ca, B:124:0x02d2, B:127:0x02dd, B:129:0x02e3, B:131:0x02e7, B:134:0x02f2, B:136:0x02fa, B:140:0x033d, B:142:0x034e, B:143:0x0355, B:145:0x035c, B:146:0x0365, B:151:0x0309, B:154:0x0313, B:156:0x031b, B:158:0x0323, B:160:0x032d, B:162:0x0337, B:170:0x025f, B:172:0x0269, B:174:0x0271, B:176:0x0279, B:185:0x01b5, B:187:0x01bd, B:189:0x01c5, B:191:0x01cf, B:193:0x01d7, B:195:0x01df, B:199:0x011b, B:201:0x012e, B:203:0x0133, B:205:0x013f, B:206:0x014a, B:208:0x0154, B:213:0x0380, B:214:0x0383, B:219:0x0144, B:225:0x00ee, B:227:0x00c5), top: B:38:0x00b8, outer: #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:145:0x035c A[Catch: Exception -> 0x0384, TryCatch #5 {Exception -> 0x0384, blocks: (B:39:0x00b8, B:42:0x00d1, B:45:0x00d9, B:48:0x00e9, B:49:0x00f3, B:51:0x0100, B:53:0x0116, B:54:0x0121, B:55:0x0173, B:58:0x0187, B:60:0x018d, B:62:0x0197, B:64:0x019f, B:66:0x01a7, B:69:0x01ea, B:71:0x01f2, B:73:0x01fa, B:76:0x0205, B:79:0x020f, B:81:0x0217, B:84:0x0221, B:86:0x022b, B:88:0x0233, B:92:0x023d, B:94:0x0243, B:97:0x024e, B:99:0x0252, B:103:0x0283, B:105:0x0287, B:108:0x0292, B:110:0x0296, B:112:0x029e, B:114:0x02a8, B:116:0x02b2, B:118:0x02ba, B:120:0x02c2, B:122:0x02ca, B:124:0x02d2, B:127:0x02dd, B:129:0x02e3, B:131:0x02e7, B:134:0x02f2, B:136:0x02fa, B:140:0x033d, B:142:0x034e, B:143:0x0355, B:145:0x035c, B:146:0x0365, B:151:0x0309, B:154:0x0313, B:156:0x031b, B:158:0x0323, B:160:0x032d, B:162:0x0337, B:170:0x025f, B:172:0x0269, B:174:0x0271, B:176:0x0279, B:185:0x01b5, B:187:0x01bd, B:189:0x01c5, B:191:0x01cf, B:193:0x01d7, B:195:0x01df, B:199:0x011b, B:201:0x012e, B:203:0x0133, B:205:0x013f, B:206:0x014a, B:208:0x0154, B:213:0x0380, B:214:0x0383, B:219:0x0144, B:225:0x00ee, B:227:0x00c5), top: B:38:0x00b8, outer: #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:151:0x0309 A[Catch: Exception -> 0x0384, TryCatch #5 {Exception -> 0x0384, blocks: (B:39:0x00b8, B:42:0x00d1, B:45:0x00d9, B:48:0x00e9, B:49:0x00f3, B:51:0x0100, B:53:0x0116, B:54:0x0121, B:55:0x0173, B:58:0x0187, B:60:0x018d, B:62:0x0197, B:64:0x019f, B:66:0x01a7, B:69:0x01ea, B:71:0x01f2, B:73:0x01fa, B:76:0x0205, B:79:0x020f, B:81:0x0217, B:84:0x0221, B:86:0x022b, B:88:0x0233, B:92:0x023d, B:94:0x0243, B:97:0x024e, B:99:0x0252, B:103:0x0283, B:105:0x0287, B:108:0x0292, B:110:0x0296, B:112:0x029e, B:114:0x02a8, B:116:0x02b2, B:118:0x02ba, B:120:0x02c2, B:122:0x02ca, B:124:0x02d2, B:127:0x02dd, B:129:0x02e3, B:131:0x02e7, B:134:0x02f2, B:136:0x02fa, B:140:0x033d, B:142:0x034e, B:143:0x0355, B:145:0x035c, B:146:0x0365, B:151:0x0309, B:154:0x0313, B:156:0x031b, B:158:0x0323, B:160:0x032d, B:162:0x0337, B:170:0x025f, B:172:0x0269, B:174:0x0271, B:176:0x0279, B:185:0x01b5, B:187:0x01bd, B:189:0x01c5, B:191:0x01cf, B:193:0x01d7, B:195:0x01df, B:199:0x011b, B:201:0x012e, B:203:0x0133, B:205:0x013f, B:206:0x014a, B:208:0x0154, B:213:0x0380, B:214:0x0383, B:219:0x0144, B:225:0x00ee, B:227:0x00c5), top: B:38:0x00b8, outer: #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:170:0x025f A[Catch: Exception -> 0x0384, TryCatch #5 {Exception -> 0x0384, blocks: (B:39:0x00b8, B:42:0x00d1, B:45:0x00d9, B:48:0x00e9, B:49:0x00f3, B:51:0x0100, B:53:0x0116, B:54:0x0121, B:55:0x0173, B:58:0x0187, B:60:0x018d, B:62:0x0197, B:64:0x019f, B:66:0x01a7, B:69:0x01ea, B:71:0x01f2, B:73:0x01fa, B:76:0x0205, B:79:0x020f, B:81:0x0217, B:84:0x0221, B:86:0x022b, B:88:0x0233, B:92:0x023d, B:94:0x0243, B:97:0x024e, B:99:0x0252, B:103:0x0283, B:105:0x0287, B:108:0x0292, B:110:0x0296, B:112:0x029e, B:114:0x02a8, B:116:0x02b2, B:118:0x02ba, B:120:0x02c2, B:122:0x02ca, B:124:0x02d2, B:127:0x02dd, B:129:0x02e3, B:131:0x02e7, B:134:0x02f2, B:136:0x02fa, B:140:0x033d, B:142:0x034e, B:143:0x0355, B:145:0x035c, B:146:0x0365, B:151:0x0309, B:154:0x0313, B:156:0x031b, B:158:0x0323, B:160:0x032d, B:162:0x0337, B:170:0x025f, B:172:0x0269, B:174:0x0271, B:176:0x0279, B:185:0x01b5, B:187:0x01bd, B:189:0x01c5, B:191:0x01cf, B:193:0x01d7, B:195:0x01df, B:199:0x011b, B:201:0x012e, B:203:0x0133, B:205:0x013f, B:206:0x014a, B:208:0x0154, B:213:0x0380, B:214:0x0383, B:219:0x0144, B:225:0x00ee, B:227:0x00c5), top: B:38:0x00b8, outer: #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:213:0x0380 A[Catch: Exception -> 0x0384, TryCatch #5 {Exception -> 0x0384, blocks: (B:39:0x00b8, B:42:0x00d1, B:45:0x00d9, B:48:0x00e9, B:49:0x00f3, B:51:0x0100, B:53:0x0116, B:54:0x0121, B:55:0x0173, B:58:0x0187, B:60:0x018d, B:62:0x0197, B:64:0x019f, B:66:0x01a7, B:69:0x01ea, B:71:0x01f2, B:73:0x01fa, B:76:0x0205, B:79:0x020f, B:81:0x0217, B:84:0x0221, B:86:0x022b, B:88:0x0233, B:92:0x023d, B:94:0x0243, B:97:0x024e, B:99:0x0252, B:103:0x0283, B:105:0x0287, B:108:0x0292, B:110:0x0296, B:112:0x029e, B:114:0x02a8, B:116:0x02b2, B:118:0x02ba, B:120:0x02c2, B:122:0x02ca, B:124:0x02d2, B:127:0x02dd, B:129:0x02e3, B:131:0x02e7, B:134:0x02f2, B:136:0x02fa, B:140:0x033d, B:142:0x034e, B:143:0x0355, B:145:0x035c, B:146:0x0365, B:151:0x0309, B:154:0x0313, B:156:0x031b, B:158:0x0323, B:160:0x032d, B:162:0x0337, B:170:0x025f, B:172:0x0269, B:174:0x0271, B:176:0x0279, B:185:0x01b5, B:187:0x01bd, B:189:0x01c5, B:191:0x01cf, B:193:0x01d7, B:195:0x01df, B:199:0x011b, B:201:0x012e, B:203:0x0133, B:205:0x013f, B:206:0x014a, B:208:0x0154, B:213:0x0380, B:214:0x0383, B:219:0x0144, B:225:0x00ee, B:227:0x00c5), top: B:38:0x00b8, outer: #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:71:0x01f2 A[Catch: Exception -> 0x0384, TryCatch #5 {Exception -> 0x0384, blocks: (B:39:0x00b8, B:42:0x00d1, B:45:0x00d9, B:48:0x00e9, B:49:0x00f3, B:51:0x0100, B:53:0x0116, B:54:0x0121, B:55:0x0173, B:58:0x0187, B:60:0x018d, B:62:0x0197, B:64:0x019f, B:66:0x01a7, B:69:0x01ea, B:71:0x01f2, B:73:0x01fa, B:76:0x0205, B:79:0x020f, B:81:0x0217, B:84:0x0221, B:86:0x022b, B:88:0x0233, B:92:0x023d, B:94:0x0243, B:97:0x024e, B:99:0x0252, B:103:0x0283, B:105:0x0287, B:108:0x0292, B:110:0x0296, B:112:0x029e, B:114:0x02a8, B:116:0x02b2, B:118:0x02ba, B:120:0x02c2, B:122:0x02ca, B:124:0x02d2, B:127:0x02dd, B:129:0x02e3, B:131:0x02e7, B:134:0x02f2, B:136:0x02fa, B:140:0x033d, B:142:0x034e, B:143:0x0355, B:145:0x035c, B:146:0x0365, B:151:0x0309, B:154:0x0313, B:156:0x031b, B:158:0x0323, B:160:0x032d, B:162:0x0337, B:170:0x025f, B:172:0x0269, B:174:0x0271, B:176:0x0279, B:185:0x01b5, B:187:0x01bd, B:189:0x01c5, B:191:0x01cf, B:193:0x01d7, B:195:0x01df, B:199:0x011b, B:201:0x012e, B:203:0x0133, B:205:0x013f, B:206:0x014a, B:208:0x0154, B:213:0x0380, B:214:0x0383, B:219:0x0144, B:225:0x00ee, B:227:0x00c5), top: B:38:0x00b8, outer: #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:78:0x020d A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0243 A[Catch: Exception -> 0x0384, TryCatch #5 {Exception -> 0x0384, blocks: (B:39:0x00b8, B:42:0x00d1, B:45:0x00d9, B:48:0x00e9, B:49:0x00f3, B:51:0x0100, B:53:0x0116, B:54:0x0121, B:55:0x0173, B:58:0x0187, B:60:0x018d, B:62:0x0197, B:64:0x019f, B:66:0x01a7, B:69:0x01ea, B:71:0x01f2, B:73:0x01fa, B:76:0x0205, B:79:0x020f, B:81:0x0217, B:84:0x0221, B:86:0x022b, B:88:0x0233, B:92:0x023d, B:94:0x0243, B:97:0x024e, B:99:0x0252, B:103:0x0283, B:105:0x0287, B:108:0x0292, B:110:0x0296, B:112:0x029e, B:114:0x02a8, B:116:0x02b2, B:118:0x02ba, B:120:0x02c2, B:122:0x02ca, B:124:0x02d2, B:127:0x02dd, B:129:0x02e3, B:131:0x02e7, B:134:0x02f2, B:136:0x02fa, B:140:0x033d, B:142:0x034e, B:143:0x0355, B:145:0x035c, B:146:0x0365, B:151:0x0309, B:154:0x0313, B:156:0x031b, B:158:0x0323, B:160:0x032d, B:162:0x0337, B:170:0x025f, B:172:0x0269, B:174:0x0271, B:176:0x0279, B:185:0x01b5, B:187:0x01bd, B:189:0x01c5, B:191:0x01cf, B:193:0x01d7, B:195:0x01df, B:199:0x011b, B:201:0x012e, B:203:0x0133, B:205:0x013f, B:206:0x014a, B:208:0x0154, B:213:0x0380, B:214:0x0383, B:219:0x0144, B:225:0x00ee, B:227:0x00c5), top: B:38:0x00b8, outer: #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0252 A[Catch: Exception -> 0x0384, TryCatch #5 {Exception -> 0x0384, blocks: (B:39:0x00b8, B:42:0x00d1, B:45:0x00d9, B:48:0x00e9, B:49:0x00f3, B:51:0x0100, B:53:0x0116, B:54:0x0121, B:55:0x0173, B:58:0x0187, B:60:0x018d, B:62:0x0197, B:64:0x019f, B:66:0x01a7, B:69:0x01ea, B:71:0x01f2, B:73:0x01fa, B:76:0x0205, B:79:0x020f, B:81:0x0217, B:84:0x0221, B:86:0x022b, B:88:0x0233, B:92:0x023d, B:94:0x0243, B:97:0x024e, B:99:0x0252, B:103:0x0283, B:105:0x0287, B:108:0x0292, B:110:0x0296, B:112:0x029e, B:114:0x02a8, B:116:0x02b2, B:118:0x02ba, B:120:0x02c2, B:122:0x02ca, B:124:0x02d2, B:127:0x02dd, B:129:0x02e3, B:131:0x02e7, B:134:0x02f2, B:136:0x02fa, B:140:0x033d, B:142:0x034e, B:143:0x0355, B:145:0x035c, B:146:0x0365, B:151:0x0309, B:154:0x0313, B:156:0x031b, B:158:0x0323, B:160:0x032d, B:162:0x0337, B:170:0x025f, B:172:0x0269, B:174:0x0271, B:176:0x0279, B:185:0x01b5, B:187:0x01bd, B:189:0x01c5, B:191:0x01cf, B:193:0x01d7, B:195:0x01df, B:199:0x011b, B:201:0x012e, B:203:0x0133, B:205:0x013f, B:206:0x014a, B:208:0x0154, B:213:0x0380, B:214:0x0383, B:219:0x0144, B:225:0x00ee, B:227:0x00c5), top: B:38:0x00b8, outer: #2 }] */
    /* JADX WARN: Type inference failed for: r10v0 */
    /* JADX WARN: Type inference failed for: r10v1, types: [android.media.MediaCrypto, android.view.Surface, com.google.android.gms.internal.ads.r44] */
    /* JADX WARN: Type inference failed for: r10v2 */
    /* JADX WARN: Type inference failed for: r9v0 */
    /* JADX WARN: Type inference failed for: r9v1, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r9v2 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    protected final void t0() {
        c0 c0Var;
        String str;
        int i7;
        long elapsedRealtime;
        MediaCodec mediaCodec;
        x34 t44Var;
        long elapsedRealtime2;
        int i8;
        boolean z6;
        boolean z7;
        boolean z8;
        boolean z9;
        String str2;
        if (this.K != null || this.f3221k0 || (c0Var = this.D) == null) {
            return;
        }
        if (this.E0 == null && m0(c0Var)) {
            c0 c0Var2 = this.D;
            R();
            String str3 = c0Var2.f3660l;
            if ("audio/mp4a-latm".equals(str3) || "audio/mpeg".equals(str3) || "audio/opus".equals(str3)) {
                this.f3239w.o(32);
            } else {
                this.f3239w.o(1);
            }
            this.f3221k0 = true;
            return;
        }
        c34 c34Var = this.E0;
        this.D0 = c34Var;
        c0 c0Var3 = this.D;
        String str4 = c0Var3.f3660l;
        ?? r9 = 0;
        if (c34Var != null && d34.f4063a) {
            t24 a7 = c34Var.a();
            throw w(a7, this.D, false, a7.f12064f);
        }
        try {
            ArrayDeque<z34> arrayDeque = 0;
            if (this.P == null) {
                try {
                    List<z34> U = U(this.f3229r, c0Var3, false);
                    U.isEmpty();
                    this.P = new ArrayDeque<>();
                    if (!U.isEmpty()) {
                        this.P.add(U.get(0));
                    }
                    this.Q = null;
                } catch (k44 e7) {
                    throw new a44(this.D, (Throwable) e7, false, -49998);
                }
            }
            if (this.P.isEmpty()) {
                throw new a44(this.D, (Throwable) null, false, -49999);
            }
            while (this.K == null) {
                z34 peekFirst = this.P.peekFirst();
                if (!A0(peekFirst)) {
                    return;
                }
                try {
                    str = peekFirst.f14931a;
                    i7 = n13.f8865a;
                    float f7 = -1.0f;
                    float N = i7 < 23 ? -1.0f : N(this.J, this.D, t());
                    if (N > this.f3231s) {
                        f7 = N;
                    }
                    elapsedRealtime = SystemClock.elapsedRealtime();
                    String valueOf = String.valueOf(str);
                    lz2.a(valueOf.length() != 0 ? "createCodec:".concat(valueOf) : new String("createCodec:"));
                    v34 T = T(peekFirst, this.D, arrayDeque, f7);
                    if (i7 >= 31) {
                        int a8 = dy.a(T.f13118c.f3660l);
                        String j7 = n13.j(a8);
                        Log.i("DefaultMediaCodecAdapterFactory", j7.length() != 0 ? "Creating an asynchronous MediaCodec adapter for track type ".concat(j7) : new String("Creating an asynchronous MediaCodec adapter for track type "));
                        t44Var = new i34(a8, r9).c(T);
                    } else {
                        try {
                            z34 z34Var = T.f13116a;
                            Objects.requireNonNull(z34Var);
                            String str5 = z34Var.f14931a;
                            String valueOf2 = String.valueOf(str5);
                            lz2.a(valueOf2.length() != 0 ? "createCodec:".concat(valueOf2) : new String("createCodec:"));
                            MediaCodec createByCodecName = MediaCodec.createByCodecName(str5);
                            lz2.b();
                            try {
                                lz2.a("configureCodec");
                                createByCodecName.configure(T.f13117b, T.f13119d, (MediaCrypto) arrayDeque, (int) r9);
                                lz2.b();
                                lz2.a("startCodec");
                                createByCodecName.start();
                                lz2.b();
                                t44Var = new t44(createByCodecName, arrayDeque, arrayDeque);
                            } catch (IOException e8) {
                                e = e8;
                                mediaCodec = createByCodecName;
                                if (mediaCodec != null) {
                                    mediaCodec.release();
                                }
                                throw e;
                            } catch (RuntimeException e9) {
                                e = e9;
                                mediaCodec = createByCodecName;
                                if (mediaCodec != null) {
                                }
                                throw e;
                            }
                        } catch (IOException e10) {
                            e = e10;
                            mediaCodec = null;
                            if (mediaCodec != null) {
                            }
                            throw e;
                        } catch (RuntimeException e11) {
                            e = e11;
                            mediaCodec = null;
                            if (mediaCodec != null) {
                            }
                            throw e;
                        }
                    }
                    this.K = t44Var;
                    elapsedRealtime2 = SystemClock.elapsedRealtime();
                    this.R = peekFirst;
                    this.O = f7;
                    this.L = this.D;
                } catch (Exception e12) {
                    oc2.b("MediaCodecRenderer", "Failed to initialize decoder: ".concat(String.valueOf(peekFirst)), e12);
                    this.P.removeFirst();
                    a44 a44Var = new a44(this.D, (Throwable) e12, false, peekFirst);
                    V(a44Var);
                    a44 a44Var2 = this.Q;
                    if (a44Var2 == null) {
                        this.Q = a44Var;
                    } else {
                        this.Q = a44.a(a44Var2, a44Var);
                    }
                    if (this.P.isEmpty()) {
                        throw this.Q;
                    }
                }
                if (i7 <= 25 && "OMX.Exynos.avc.dec.secure".equals(str)) {
                    String str6 = n13.f8868d;
                    if (str6.startsWith("SM-T585") || str6.startsWith("SM-A510") || str6.startsWith("SM-A520") || str6.startsWith("SM-J700")) {
                        i8 = 2;
                        this.S = i8;
                        this.T = i7 >= 21 && this.L.f3662n.isEmpty() && "OMX.MTK.VIDEO.DECODER.AVC".equals(str);
                        if (i7 >= 18 && ((i7 != 18 || (!"OMX.SEC.avc.dec".equals(str) && !"OMX.SEC.avc.dec.secure".equals(str))) && (i7 != 19 || !n13.f8868d.startsWith("SM-G800") || (!"OMX.Exynos.avc.dec".equals(str) && !"OMX.Exynos.avc.dec.secure".equals(str))))) {
                            z6 = false;
                            this.U = z6;
                            this.V = i7 != 29 && "c2.android.aac.decoder".equals(str);
                            if (i7 <= 23) {
                                if ("OMX.google.vorbis.decoder".equals(str)) {
                                }
                                z7 = true;
                                this.W = z7;
                                this.X = i7 != 21 && "OMX.google.aac.decoder".equals(str);
                                if (i7 < 21 && "OMX.SEC.mp3.dec".equals(str) && "samsung".equals(n13.f8867c)) {
                                    str2 = n13.f8866b;
                                    if (!str2.startsWith("baffin") || str2.startsWith("grand") || str2.startsWith("fortuna") || str2.startsWith("gprimelte") || str2.startsWith("j2y18lte") || str2.startsWith("ms01")) {
                                        z8 = true;
                                        this.Y = z8;
                                        this.Z = i7 > 18 && this.L.f3673y == 1 && "OMX.MTK.AUDIO.DECODER.MP3".equals(str);
                                        String str7 = peekFirst.f14931a;
                                        if (i7 <= 25) {
                                            if ("OMX.rk.video_decoder.avc".equals(str7)) {
                                            }
                                            z9 = true;
                                            this.f3213c0 = z9;
                                            this.K.t();
                                            if ("c2.android.mp3.decoder".equals(peekFirst.f14931a)) {
                                                this.f3214d0 = new s34();
                                            }
                                            if (q() == 2) {
                                                this.f3215e0 = SystemClock.elapsedRealtime() + 1000;
                                            }
                                            this.f3246z0.f3807a++;
                                            W(str, elapsedRealtime2, elapsedRealtime2 - elapsedRealtime);
                                            r9 = 0;
                                            arrayDeque = 0;
                                        }
                                        if ((i7 <= 17 || !"OMX.allwinner.video.decoder.avc".equals(str7)) && ((i7 > 29 || (!"OMX.broadcom.video_decoder.tunnel".equals(str7) && !"OMX.broadcom.video_decoder.tunnel.secure".equals(str7))) && (!"Amazon".equals(n13.f8867c) || !"AFTS".equals(n13.f8868d) || !peekFirst.f14936f))) {
                                            z9 = false;
                                            this.f3213c0 = z9;
                                            this.K.t();
                                            if ("c2.android.mp3.decoder".equals(peekFirst.f14931a)) {
                                            }
                                            if (q() == 2) {
                                            }
                                            this.f3246z0.f3807a++;
                                            W(str, elapsedRealtime2, elapsedRealtime2 - elapsedRealtime);
                                            r9 = 0;
                                            arrayDeque = 0;
                                        }
                                        z9 = true;
                                        this.f3213c0 = z9;
                                        this.K.t();
                                        if ("c2.android.mp3.decoder".equals(peekFirst.f14931a)) {
                                        }
                                        if (q() == 2) {
                                        }
                                        this.f3246z0.f3807a++;
                                        W(str, elapsedRealtime2, elapsedRealtime2 - elapsedRealtime);
                                        r9 = 0;
                                        arrayDeque = 0;
                                    }
                                }
                                z8 = false;
                                this.Y = z8;
                                this.Z = i7 > 18 && this.L.f3673y == 1 && "OMX.MTK.AUDIO.DECODER.MP3".equals(str);
                                String str72 = peekFirst.f14931a;
                                if (i7 <= 25) {
                                }
                                if (i7 <= 17) {
                                }
                                z9 = false;
                                this.f3213c0 = z9;
                                this.K.t();
                                if ("c2.android.mp3.decoder".equals(peekFirst.f14931a)) {
                                }
                                if (q() == 2) {
                                }
                                this.f3246z0.f3807a++;
                                W(str, elapsedRealtime2, elapsedRealtime2 - elapsedRealtime);
                                r9 = 0;
                                arrayDeque = 0;
                            }
                            if (i7 <= 19) {
                                String str8 = n13.f8866b;
                                if (!"hb2000".equals(str8)) {
                                }
                                if (!"OMX.amlogic.avc.decoder.awesome".equals(str)) {
                                    if ("OMX.amlogic.avc.decoder.awesome.secure".equals(str)) {
                                    }
                                }
                                z7 = true;
                                this.W = z7;
                                this.X = i7 != 21 && "OMX.google.aac.decoder".equals(str);
                                if (i7 < 21) {
                                    str2 = n13.f8866b;
                                    if (!str2.startsWith("baffin")) {
                                    }
                                    z8 = true;
                                    this.Y = z8;
                                    this.Z = i7 > 18 && this.L.f3673y == 1 && "OMX.MTK.AUDIO.DECODER.MP3".equals(str);
                                    String str722 = peekFirst.f14931a;
                                    if (i7 <= 25) {
                                    }
                                    if (i7 <= 17) {
                                    }
                                    z9 = false;
                                    this.f3213c0 = z9;
                                    this.K.t();
                                    if ("c2.android.mp3.decoder".equals(peekFirst.f14931a)) {
                                    }
                                    if (q() == 2) {
                                    }
                                    this.f3246z0.f3807a++;
                                    W(str, elapsedRealtime2, elapsedRealtime2 - elapsedRealtime);
                                    r9 = 0;
                                    arrayDeque = 0;
                                }
                                z8 = false;
                                this.Y = z8;
                                this.Z = i7 > 18 && this.L.f3673y == 1 && "OMX.MTK.AUDIO.DECODER.MP3".equals(str);
                                String str7222 = peekFirst.f14931a;
                                if (i7 <= 25) {
                                }
                                if (i7 <= 17) {
                                }
                                z9 = false;
                                this.f3213c0 = z9;
                                this.K.t();
                                if ("c2.android.mp3.decoder".equals(peekFirst.f14931a)) {
                                }
                                if (q() == 2) {
                                }
                                this.f3246z0.f3807a++;
                                W(str, elapsedRealtime2, elapsedRealtime2 - elapsedRealtime);
                                r9 = 0;
                                arrayDeque = 0;
                            }
                            z7 = false;
                            this.W = z7;
                            this.X = i7 != 21 && "OMX.google.aac.decoder".equals(str);
                            if (i7 < 21) {
                            }
                            z8 = false;
                            this.Y = z8;
                            this.Z = i7 > 18 && this.L.f3673y == 1 && "OMX.MTK.AUDIO.DECODER.MP3".equals(str);
                            String str72222 = peekFirst.f14931a;
                            if (i7 <= 25) {
                            }
                            if (i7 <= 17) {
                            }
                            z9 = false;
                            this.f3213c0 = z9;
                            this.K.t();
                            if ("c2.android.mp3.decoder".equals(peekFirst.f14931a)) {
                            }
                            if (q() == 2) {
                            }
                            this.f3246z0.f3807a++;
                            W(str, elapsedRealtime2, elapsedRealtime2 - elapsedRealtime);
                            r9 = 0;
                            arrayDeque = 0;
                        }
                        z6 = true;
                        this.U = z6;
                        this.V = i7 != 29 && "c2.android.aac.decoder".equals(str);
                        if (i7 <= 23) {
                        }
                        if (i7 <= 19) {
                        }
                        z7 = false;
                        this.W = z7;
                        this.X = i7 != 21 && "OMX.google.aac.decoder".equals(str);
                        if (i7 < 21) {
                        }
                        z8 = false;
                        this.Y = z8;
                        this.Z = i7 > 18 && this.L.f3673y == 1 && "OMX.MTK.AUDIO.DECODER.MP3".equals(str);
                        String str722222 = peekFirst.f14931a;
                        if (i7 <= 25) {
                        }
                        if (i7 <= 17) {
                        }
                        z9 = false;
                        this.f3213c0 = z9;
                        this.K.t();
                        if ("c2.android.mp3.decoder".equals(peekFirst.f14931a)) {
                        }
                        if (q() == 2) {
                        }
                        this.f3246z0.f3807a++;
                        W(str, elapsedRealtime2, elapsedRealtime2 - elapsedRealtime);
                        r9 = 0;
                        arrayDeque = 0;
                    }
                }
                if (i7 < 24 && ("OMX.Nvidia.h264.decode".equals(str) || "OMX.Nvidia.h264.decode.secure".equals(str))) {
                    String str9 = n13.f8866b;
                    if ("flounder".equals(str9) || "flounder_lte".equals(str9) || "grouper".equals(str9) || "tilapia".equals(str9)) {
                        i8 = 1;
                        this.S = i8;
                        this.T = i7 >= 21 && this.L.f3662n.isEmpty() && "OMX.MTK.VIDEO.DECODER.AVC".equals(str);
                        if (i7 >= 18) {
                            z6 = false;
                            this.U = z6;
                            this.V = i7 != 29 && "c2.android.aac.decoder".equals(str);
                            if (i7 <= 23) {
                            }
                            if (i7 <= 19) {
                            }
                            z7 = false;
                            this.W = z7;
                            this.X = i7 != 21 && "OMX.google.aac.decoder".equals(str);
                            if (i7 < 21) {
                            }
                            z8 = false;
                            this.Y = z8;
                            this.Z = i7 > 18 && this.L.f3673y == 1 && "OMX.MTK.AUDIO.DECODER.MP3".equals(str);
                            String str7222222 = peekFirst.f14931a;
                            if (i7 <= 25) {
                            }
                            if (i7 <= 17) {
                            }
                            z9 = false;
                            this.f3213c0 = z9;
                            this.K.t();
                            if ("c2.android.mp3.decoder".equals(peekFirst.f14931a)) {
                            }
                            if (q() == 2) {
                            }
                            this.f3246z0.f3807a++;
                            W(str, elapsedRealtime2, elapsedRealtime2 - elapsedRealtime);
                            r9 = 0;
                            arrayDeque = 0;
                        }
                        z6 = true;
                        this.U = z6;
                        this.V = i7 != 29 && "c2.android.aac.decoder".equals(str);
                        if (i7 <= 23) {
                        }
                        if (i7 <= 19) {
                        }
                        z7 = false;
                        this.W = z7;
                        this.X = i7 != 21 && "OMX.google.aac.decoder".equals(str);
                        if (i7 < 21) {
                        }
                        z8 = false;
                        this.Y = z8;
                        this.Z = i7 > 18 && this.L.f3673y == 1 && "OMX.MTK.AUDIO.DECODER.MP3".equals(str);
                        String str72222222 = peekFirst.f14931a;
                        if (i7 <= 25) {
                        }
                        if (i7 <= 17) {
                        }
                        z9 = false;
                        this.f3213c0 = z9;
                        this.K.t();
                        if ("c2.android.mp3.decoder".equals(peekFirst.f14931a)) {
                        }
                        if (q() == 2) {
                        }
                        this.f3246z0.f3807a++;
                        W(str, elapsedRealtime2, elapsedRealtime2 - elapsedRealtime);
                        r9 = 0;
                        arrayDeque = 0;
                    }
                }
                i8 = 0;
                this.S = i8;
                this.T = i7 >= 21 && this.L.f3662n.isEmpty() && "OMX.MTK.VIDEO.DECODER.AVC".equals(str);
                if (i7 >= 18) {
                }
                z6 = true;
                this.U = z6;
                this.V = i7 != 29 && "c2.android.aac.decoder".equals(str);
                if (i7 <= 23) {
                }
                if (i7 <= 19) {
                }
                z7 = false;
                this.W = z7;
                this.X = i7 != 21 && "OMX.google.aac.decoder".equals(str);
                if (i7 < 21) {
                }
                z8 = false;
                this.Y = z8;
                this.Z = i7 > 18 && this.L.f3673y == 1 && "OMX.MTK.AUDIO.DECODER.MP3".equals(str);
                String str722222222 = peekFirst.f14931a;
                if (i7 <= 25) {
                }
                if (i7 <= 17) {
                }
                z9 = false;
                this.f3213c0 = z9;
                this.K.t();
                if ("c2.android.mp3.decoder".equals(peekFirst.f14931a)) {
                }
                if (q() == 2) {
                }
                this.f3246z0.f3807a++;
                W(str, elapsedRealtime2, elapsedRealtime2 - elapsedRealtime);
                r9 = 0;
                arrayDeque = 0;
            }
            this.P = arrayDeque;
        } catch (a44 e13) {
            throw w(e13, this.D, false, 4001);
        }
    }

    protected void u0(long j7) {
        while (true) {
            int i7 = this.C0;
            if (i7 == 0 || j7 < this.C[0]) {
                return;
            }
            long[] jArr = this.A;
            this.A0 = jArr[0];
            this.B0 = this.B[0];
            int i8 = i7 - 1;
            this.C0 = i8;
            System.arraycopy(jArr, 1, jArr, 0, i8);
            long[] jArr2 = this.B;
            System.arraycopy(jArr2, 1, jArr2, 0, this.C0);
            long[] jArr3 = this.C;
            System.arraycopy(jArr3, 1, jArr3, 0, this.C0);
            i0();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    protected final void v0() {
        try {
            x34 x34Var = this.K;
            if (x34Var != null) {
                x34Var.k();
                this.f3246z0.f3808b++;
                X(this.R.f14931a);
            }
        } finally {
            this.K = null;
            this.F = null;
            this.D0 = null;
            x0();
        }
    }

    protected void w0() {
        D0();
        E0();
        this.f3215e0 = -9223372036854775807L;
        this.f3232s0 = false;
        this.f3230r0 = false;
        this.f3211a0 = false;
        this.f3212b0 = false;
        this.f3219i0 = false;
        this.f3220j0 = false;
        this.f3243y.clear();
        this.f3236u0 = -9223372036854775807L;
        this.f3238v0 = -9223372036854775807L;
        s34 s34Var = this.f3214d0;
        if (s34Var != null) {
            s34Var.c();
        }
        this.f3226p0 = 0;
        this.f3228q0 = 0;
        this.f3225o0 = this.f3224n0 ? 1 : 0;
    }

    protected final void x0() {
        w0();
        this.f3214d0 = null;
        this.P = null;
        this.R = null;
        this.L = null;
        this.M = null;
        this.N = false;
        this.f3234t0 = false;
        this.O = -1.0f;
        this.S = 0;
        this.T = false;
        this.U = false;
        this.V = false;
        this.W = false;
        this.X = false;
        this.Y = false;
        this.Z = false;
        this.f3213c0 = false;
        this.f3224n0 = false;
        this.f3225o0 = 0;
        this.G = false;
    }

    protected final boolean y0() {
        boolean z02 = z0();
        if (z02) {
            t0();
        }
        return z02;
    }

    protected final boolean z0() {
        if (this.K == null) {
            return false;
        }
        if (this.f3228q0 == 3 || this.U || ((this.V && !this.f3234t0) || (this.W && this.f3232s0))) {
            v0();
            return true;
        }
        h0();
        return false;
    }
}
