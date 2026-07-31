package com.google.android.gms.internal.ads;

import android.content.Context;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Handler;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

/* loaded from: classes.dex */
public final class l24 extends b44 implements ex3 {
    private final Context G0;
    private final h14 H0;
    private final o14 I0;
    private int J0;
    private boolean K0;
    private c0 L0;
    private long M0;
    private boolean N0;
    private boolean O0;
    private boolean P0;
    private wx3 Q0;

    public l24(Context context, w34 w34Var, d44 d44Var, boolean z6, Handler handler, i14 i14Var, o14 o14Var) {
        super(1, w34Var, d44Var, false, 44100.0f);
        this.G0 = context.getApplicationContext();
        this.I0 = o14Var;
        this.H0 = new h14(handler, i14Var);
        o14Var.m(new k24(this, null));
    }

    private final void D0() {
        long b02 = this.I0.b0(K());
        if (b02 != Long.MIN_VALUE) {
            if (!this.O0) {
                b02 = Math.max(this.M0, b02);
            }
            this.M0 = b02;
            this.O0 = false;
        }
    }

    private final int J0(z34 z34Var, c0 c0Var) {
        int i7;
        if (!"OMX.google.raw.decoder".equals(z34Var.f14931a) || (i7 = n13.f8865a) >= 24 || (i7 == 23 && n13.t(this.G0))) {
            return c0Var.f3661m;
        }
        return -1;
    }

    @Override // com.google.android.gms.internal.ads.b44, com.google.android.gms.internal.ads.bc3
    protected final void B() {
        this.P0 = true;
        try {
            this.I0.b();
            try {
                super.B();
            } finally {
            }
        } catch (Throwable th) {
            try {
                super.B();
                throw th;
            } finally {
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.b44, com.google.android.gms.internal.ads.bc3
    protected final void D(boolean z6, boolean z7) {
        super.D(z6, z7);
        this.H0.f(this.f3246z0);
        z();
    }

    @Override // com.google.android.gms.internal.ads.b44, com.google.android.gms.internal.ads.bc3
    protected final void E(long j7, boolean z6) {
        super.E(j7, z6);
        this.I0.b();
        this.M0 = j7;
        this.N0 = true;
        this.O0 = true;
    }

    @Override // com.google.android.gms.internal.ads.b44, com.google.android.gms.internal.ads.bc3
    protected final void F() {
        try {
            super.F();
            if (this.P0) {
                this.P0 = false;
                this.I0.i();
            }
        } catch (Throwable th) {
            if (this.P0) {
                this.P0 = false;
                this.I0.i();
            }
            throw th;
        }
    }

    @Override // com.google.android.gms.internal.ads.bc3
    protected final void H() {
        this.I0.f();
    }

    @Override // com.google.android.gms.internal.ads.bc3
    protected final void I() {
        D0();
        this.I0.e();
    }

    @Override // com.google.android.gms.internal.ads.b44, com.google.android.gms.internal.ads.xx3
    public final boolean K() {
        return super.K() && this.I0.q();
    }

    @Override // com.google.android.gms.internal.ads.b44
    protected final float N(float f7, c0 c0Var, c0[] c0VarArr) {
        int i7 = -1;
        for (c0 c0Var2 : c0VarArr) {
            int i8 = c0Var2.f3674z;
            if (i8 != -1) {
                i7 = Math.max(i7, i8);
            }
        }
        if (i7 == -1) {
            return -1.0f;
        }
        return i7 * f7;
    }

    @Override // com.google.android.gms.internal.ads.b44
    protected final int O(d44 d44Var, c0 c0Var) {
        if (!dy.g(c0Var.f3660l)) {
            return 0;
        }
        int i7 = n13.f8865a >= 21 ? 32 : 0;
        int i8 = c0Var.E;
        boolean B0 = b44.B0(c0Var);
        if (B0 && this.I0.t(c0Var) && (i8 == 0 || q44.d() != null)) {
            return i7 | 12;
        }
        if (("audio/raw".equals(c0Var.f3660l) && !this.I0.t(c0Var)) || !this.I0.t(n13.b(2, c0Var.f3673y, c0Var.f3674z))) {
            return 1;
        }
        List<z34> U = U(d44Var, c0Var, false);
        if (U.isEmpty()) {
            return 1;
        }
        if (!B0) {
            return 2;
        }
        z34 z34Var = U.get(0);
        boolean d7 = z34Var.d(c0Var);
        int i9 = 8;
        if (d7 && z34Var.e(c0Var)) {
            i9 = 16;
        }
        return (true != d7 ? 3 : 4) | i9 | i7;
    }

    @Override // com.google.android.gms.internal.ads.b44
    protected final de3 P(z34 z34Var, c0 c0Var, c0 c0Var2) {
        int i7;
        int i8;
        de3 b7 = z34Var.b(c0Var, c0Var2);
        int i9 = b7.f4190e;
        if (J0(z34Var, c0Var2) > this.J0) {
            i9 |= 64;
        }
        String str = z34Var.f14931a;
        if (i9 != 0) {
            i8 = i9;
            i7 = 0;
        } else {
            i7 = b7.f4189d;
            i8 = 0;
        }
        return new de3(str, c0Var, c0Var2, i7, i8);
    }

    @Override // com.google.android.gms.internal.ads.b44
    protected final de3 Q(cx3 cx3Var) {
        de3 Q = super.Q(cx3Var);
        this.H0.g(cx3Var.f3980a, Q);
        return Q;
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x00a8, code lost:
    
        if ("AXON 7 mini".equals(r10) == false) goto L34;
     */
    /* JADX WARN: Removed duplicated region for block: B:27:0x008b  */
    @Override // com.google.android.gms.internal.ads.b44
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    protected final v34 T(z34 z34Var, c0 c0Var, MediaCrypto mediaCrypto, float f7) {
        boolean z6;
        MediaFormat mediaFormat;
        c0[] t6 = t();
        int J0 = J0(z34Var, c0Var);
        if (t6.length != 1) {
            for (c0 c0Var2 : t6) {
                if (z34Var.b(c0Var, c0Var2).f4189d != 0) {
                    J0 = Math.max(J0, J0(z34Var, c0Var2));
                }
            }
        }
        this.J0 = J0;
        String str = z34Var.f14931a;
        int i7 = n13.f8865a;
        if (i7 < 24 && "OMX.SEC.aac.dec".equals(str) && "samsung".equals(n13.f8867c)) {
            String str2 = n13.f8866b;
            if (str2.startsWith("zeroflte") || str2.startsWith("herolte") || str2.startsWith("heroqlte")) {
                z6 = true;
                this.K0 = z6;
                String str3 = z34Var.f14933c;
                int i8 = this.J0;
                mediaFormat = new MediaFormat();
                mediaFormat.setString("mime", str3);
                mediaFormat.setInteger("channel-count", c0Var.f3673y);
                mediaFormat.setInteger("sample-rate", c0Var.f3674z);
                qe2.b(mediaFormat, c0Var.f3662n);
                qe2.a(mediaFormat, "max-input-size", i8);
                if (i7 >= 23) {
                    mediaFormat.setInteger("priority", 0);
                    if (f7 != -1.0f) {
                        if (i7 == 23) {
                            String str4 = n13.f8868d;
                            if (!"ZTE B2017G".equals(str4)) {
                            }
                        }
                        mediaFormat.setFloat("operating-rate", f7);
                    }
                }
                if (i7 <= 28 && "audio/ac4".equals(c0Var.f3660l)) {
                    mediaFormat.setInteger("ac4-is-sync", 1);
                }
                if (i7 >= 24 && this.I0.a(n13.b(4, c0Var.f3673y, c0Var.f3674z)) == 2) {
                    mediaFormat.setInteger("pcm-encoding", 4);
                }
                this.L0 = ("audio/raw".equals(z34Var.f14932b) || "audio/raw".equals(c0Var.f3660l)) ? null : c0Var;
                return v34.a(z34Var, mediaFormat, c0Var, null);
            }
        }
        z6 = false;
        this.K0 = z6;
        String str32 = z34Var.f14933c;
        int i82 = this.J0;
        mediaFormat = new MediaFormat();
        mediaFormat.setString("mime", str32);
        mediaFormat.setInteger("channel-count", c0Var.f3673y);
        mediaFormat.setInteger("sample-rate", c0Var.f3674z);
        qe2.b(mediaFormat, c0Var.f3662n);
        qe2.a(mediaFormat, "max-input-size", i82);
        if (i7 >= 23) {
        }
        if (i7 <= 28) {
            mediaFormat.setInteger("ac4-is-sync", 1);
        }
        if (i7 >= 24) {
            mediaFormat.setInteger("pcm-encoding", 4);
        }
        this.L0 = ("audio/raw".equals(z34Var.f14932b) || "audio/raw".equals(c0Var.f3660l)) ? null : c0Var;
        return v34.a(z34Var, mediaFormat, c0Var, null);
    }

    @Override // com.google.android.gms.internal.ads.b44
    protected final List<z34> U(d44 d44Var, c0 c0Var, boolean z6) {
        z34 d7;
        String str = c0Var.f3660l;
        if (str == null) {
            return Collections.emptyList();
        }
        if (this.I0.t(c0Var) && (d7 = q44.d()) != null) {
            return Collections.singletonList(d7);
        }
        List<z34> f7 = q44.f(q44.e(str, false, false), c0Var);
        if ("audio/eac3-joc".equals(str)) {
            ArrayList arrayList = new ArrayList(f7);
            arrayList.addAll(q44.e("audio/eac3", false, false));
            f7 = arrayList;
        }
        return Collections.unmodifiableList(f7);
    }

    @Override // com.google.android.gms.internal.ads.b44
    protected final void V(Exception exc) {
        oc2.a("MediaCodecAudioRenderer", "Audio codec error", exc);
        this.H0.a(exc);
    }

    @Override // com.google.android.gms.internal.ads.b44
    protected final void W(String str, long j7, long j8) {
        this.H0.c(str, j7, j8);
    }

    @Override // com.google.android.gms.internal.ads.b44
    protected final void X(String str) {
        this.H0.d(str);
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x008b A[LOOP:0: B:24:0x0087->B:26:0x008b, LOOP_END] */
    @Override // com.google.android.gms.internal.ads.b44
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    protected final void Y(c0 c0Var, MediaFormat mediaFormat) {
        int i7;
        int i8;
        int i9;
        c0 c0Var2 = this.L0;
        int[] iArr = null;
        if (c0Var2 != null) {
            c0Var = c0Var2;
        } else if (p0() != null) {
            if (!"audio/raw".equals(c0Var.f3660l)) {
                if (n13.f8865a >= 24 && mediaFormat.containsKey("pcm-encoding")) {
                    i7 = mediaFormat.getInteger("pcm-encoding");
                } else if (mediaFormat.containsKey("v-bits-per-sample")) {
                    i7 = n13.R(mediaFormat.getInteger("v-bits-per-sample"));
                } else if (!"audio/raw".equals(c0Var.f3660l)) {
                    i7 = 2;
                }
                bf4 bf4Var = new bf4();
                bf4Var.s("audio/raw");
                bf4Var.n(i7);
                bf4Var.c(c0Var.B);
                bf4Var.d(c0Var.C);
                bf4Var.e0(mediaFormat.getInteger("channel-count"));
                bf4Var.t(mediaFormat.getInteger("sample-rate"));
                c0 y6 = bf4Var.y();
                if (this.K0 && y6.f3673y == 6 && (i8 = c0Var.f3673y) < 6) {
                    iArr = new int[i8];
                    for (i9 = 0; i9 < c0Var.f3673y; i9++) {
                        iArr[i9] = i9;
                    }
                }
                c0Var = y6;
            }
            i7 = c0Var.A;
            bf4 bf4Var2 = new bf4();
            bf4Var2.s("audio/raw");
            bf4Var2.n(i7);
            bf4Var2.c(c0Var.B);
            bf4Var2.d(c0Var.C);
            bf4Var2.e0(mediaFormat.getInteger("channel-count"));
            bf4Var2.t(mediaFormat.getInteger("sample-rate"));
            c0 y62 = bf4Var2.y();
            if (this.K0) {
                iArr = new int[i8];
                while (i9 < c0Var.f3673y) {
                }
            }
            c0Var = y62;
        }
        try {
            this.I0.n(c0Var, 0, iArr);
        } catch (j14 e7) {
            throw w(e7, e7.f6932f, false, 5001);
        }
    }

    @Override // com.google.android.gms.internal.ads.ex3
    public final e30 c() {
        return this.I0.c();
    }

    @Override // com.google.android.gms.internal.ads.ex3
    public final void c0(e30 e30Var) {
        this.I0.g(e30Var);
    }

    @Override // com.google.android.gms.internal.ads.b44, com.google.android.gms.internal.ads.xx3
    public final boolean f0() {
        return this.I0.p() || super.f0();
    }

    @Override // com.google.android.gms.internal.ads.bc3, com.google.android.gms.internal.ads.xx3
    public final ex3 h() {
        return this;
    }

    protected final void h0() {
        this.O0 = true;
    }

    @Override // com.google.android.gms.internal.ads.b44
    protected final void i0() {
        this.I0.d();
    }

    @Override // com.google.android.gms.internal.ads.b44
    protected final void j0(z51 z51Var) {
        if (!this.N0 || z51Var.f()) {
            return;
        }
        if (Math.abs(z51Var.f14954e - this.M0) > 500000) {
            this.M0 = z51Var.f14954e;
        }
        this.N0 = false;
    }

    @Override // com.google.android.gms.internal.ads.b44
    protected final void k0() {
        try {
            this.I0.h();
        } catch (n14 e7) {
            throw w(e7, e7.f8881g, e7.f8880f, 5002);
        }
    }

    @Override // com.google.android.gms.internal.ads.b44
    protected final boolean l0(long j7, long j8, x34 x34Var, ByteBuffer byteBuffer, int i7, int i8, int i9, long j9, boolean z6, boolean z7, c0 c0Var) {
        Objects.requireNonNull(byteBuffer);
        if (this.L0 != null && (i8 & 2) != 0) {
            Objects.requireNonNull(x34Var);
            x34Var.d(i7, false);
            return true;
        }
        if (z6) {
            if (x34Var != null) {
                x34Var.d(i7, false);
            }
            this.f3246z0.f3812f += i9;
            this.I0.d();
            return true;
        }
        try {
            if (!this.I0.k(byteBuffer, j9, i9)) {
                return false;
            }
            if (x34Var != null) {
                x34Var.d(i7, false);
            }
            this.f3246z0.f3811e += i9;
            return true;
        } catch (k14 e7) {
            throw w(e7, e7.f7333g, false, 5001);
        } catch (n14 e8) {
            throw w(e8, c0Var, e8.f8880f, 5002);
        }
    }

    @Override // com.google.android.gms.internal.ads.bc3, com.google.android.gms.internal.ads.tx3
    public final void m(int i7, Object obj) {
        if (i7 == 2) {
            this.I0.j(((Float) obj).floatValue());
            return;
        }
        if (i7 == 3) {
            this.I0.o((ef3) obj);
            return;
        }
        if (i7 == 6) {
            this.I0.l((kw3) obj);
            return;
        }
        switch (i7) {
            case 9:
                this.I0.s(((Boolean) obj).booleanValue());
                break;
            case 10:
                this.I0.r(((Integer) obj).intValue());
                break;
            case 11:
                this.Q0 = (wx3) obj;
                break;
        }
    }

    @Override // com.google.android.gms.internal.ads.b44
    protected final boolean m0(c0 c0Var) {
        return this.I0.t(c0Var);
    }

    @Override // com.google.android.gms.internal.ads.xx3, com.google.android.gms.internal.ads.yx3
    public final String v() {
        return "MediaCodecAudioRenderer";
    }

    @Override // com.google.android.gms.internal.ads.ex3
    public final long zza() {
        if (q() == 2) {
            D0();
        }
        return this.M0;
    }
}
