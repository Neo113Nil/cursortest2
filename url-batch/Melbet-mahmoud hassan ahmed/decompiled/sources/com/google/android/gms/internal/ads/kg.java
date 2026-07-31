package com.google.android.gms.internal.ads;

import android.annotation.TargetApi;
import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Handler;
import android.view.Surface;
import java.nio.ByteBuffer;

@TargetApi(16)
/* loaded from: classes.dex */
public final class kg extends zi implements nm {
    private final uf Q;
    private final gg R;
    private boolean S;
    private int T;
    private int U;
    private long V;
    private boolean W;

    public kg(bj bjVar, zg zgVar, boolean z6, Handler handler, vf vfVar) {
        super(1, bjVar, null, true);
        this.R = new gg(null, new mf[0], new jg(this, null));
        this.Q = new uf(handler, vfVar);
    }

    @Override // com.google.android.gms.internal.ads.zi, com.google.android.gms.internal.ads.cf
    public final boolean A() {
        return this.R.n() || super.A();
    }

    @Override // com.google.android.gms.internal.ads.zi
    protected final xi D(bj bjVar, xe xeVar, boolean z6) {
        return super.D(bjVar, xeVar, false);
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0034, code lost:
    
        if (r4.startsWith("heroqlte") == false) goto L15;
     */
    @Override // com.google.android.gms.internal.ads.zi
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    protected final void E(xi xiVar, MediaCodec mediaCodec, xe xeVar, MediaCrypto mediaCrypto) {
        String str = xiVar.f14216a;
        boolean z6 = true;
        if (zm.f15186a < 24 && "OMX.SEC.aac.dec".equals(str) && "samsung".equals(zm.f15188c)) {
            String str2 = zm.f15187b;
            if (!str2.startsWith("zeroflte")) {
                if (!str2.startsWith("herolte")) {
                }
            }
            this.S = z6;
            mediaCodec.configure(xeVar.c(), (Surface) null, (MediaCrypto) null, 0);
        }
        z6 = false;
        this.S = z6;
        mediaCodec.configure(xeVar.c(), (Surface) null, (MediaCrypto) null, 0);
    }

    @Override // com.google.android.gms.internal.ads.zi
    protected final void F(String str, long j7, long j8) {
        this.Q.d(str, j7, j8);
    }

    @Override // com.google.android.gms.internal.ads.zi
    protected final void I(xe xeVar) {
        super.I(xeVar);
        this.Q.g(xeVar);
        this.T = "audio/raw".equals(xeVar.f14165k) ? xeVar.f14179y : 2;
        this.U = xeVar.f14177w;
    }

    @Override // com.google.android.gms.internal.ads.zi
    protected final void J(MediaCodec mediaCodec, MediaFormat mediaFormat) {
        int i7;
        int[] iArr;
        int integer = mediaFormat.getInteger("channel-count");
        int integer2 = mediaFormat.getInteger("sample-rate");
        if (this.S && integer == 6) {
            int i8 = this.U;
            if (i8 < 6) {
                int[] iArr2 = new int[i8];
                for (int i9 = 0; i9 < this.U; i9++) {
                    iArr2[i9] = i9;
                }
                iArr = iArr2;
            } else {
                iArr = null;
            }
            i7 = 6;
        } else {
            i7 = integer;
            iArr = null;
        }
        try {
            this.R.e("audio/raw", i7, integer2, this.T, 0, iArr);
        } catch (ag e7) {
            throw ie.a(e7, l());
        }
    }

    @Override // com.google.android.gms.internal.ads.zi
    protected final void K() {
        try {
            this.R.i();
        } catch (fg e7) {
            throw ie.a(e7, l());
        }
    }

    @Override // com.google.android.gms.internal.ads.nm
    public final long L() {
        long a7 = this.R.a(M());
        if (a7 != Long.MIN_VALUE) {
            if (!this.W) {
                a7 = Math.max(this.V, a7);
            }
            this.V = a7;
            this.W = false;
        }
        return this.V;
    }

    @Override // com.google.android.gms.internal.ads.zi, com.google.android.gms.internal.ads.cf
    public final boolean M() {
        return super.M() && this.R.o();
    }

    @Override // com.google.android.gms.internal.ads.zi
    protected final boolean N(long j7, long j8, MediaCodec mediaCodec, ByteBuffer byteBuffer, int i7, int i8, long j9, boolean z6) {
        if (z6) {
            mediaCodec.releaseOutputBuffer(i7, false);
            this.O.f12201e++;
            this.R.f();
            return true;
        }
        try {
            if (!this.R.m(byteBuffer, j9)) {
                return false;
            }
            mediaCodec.releaseOutputBuffer(i7, false);
            this.O.f12200d++;
            return true;
        } catch (bg | fg e7) {
            throw ie.a(e7, l());
        }
    }

    @Override // com.google.android.gms.internal.ads.nm
    public final bf e(bf bfVar) {
        return this.R.d(bfVar);
    }

    @Override // com.google.android.gms.internal.ads.ge, com.google.android.gms.internal.ads.cf
    public final nm h() {
        return this;
    }

    @Override // com.google.android.gms.internal.ads.ke
    public final void j(int i7, Object obj) {
        if (i7 != 2) {
            return;
        }
        this.R.l(((Float) obj).floatValue());
    }

    @Override // com.google.android.gms.internal.ads.zi, com.google.android.gms.internal.ads.ge
    protected final void p() {
        try {
            this.R.j();
            try {
                super.p();
            } finally {
            }
        } catch (Throwable th) {
            try {
                super.p();
                throw th;
            } finally {
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zi, com.google.android.gms.internal.ads.ge
    protected final void q(boolean z6) {
        super.q(z6);
        this.Q.f(this.O);
        int i7 = n().f4590a;
    }

    @Override // com.google.android.gms.internal.ads.zi, com.google.android.gms.internal.ads.ge
    protected final void r(long j7, boolean z6) {
        super.r(j7, z6);
        this.R.k();
        this.V = j7;
        this.W = true;
    }

    @Override // com.google.android.gms.internal.ads.ge
    protected final void s() {
        this.R.h();
    }

    @Override // com.google.android.gms.internal.ads.ge
    protected final void t() {
        this.R.g();
    }

    @Override // com.google.android.gms.internal.ads.nm
    public final bf v() {
        return this.R.c();
    }

    @Override // com.google.android.gms.internal.ads.zi
    protected final int y(bj bjVar, xe xeVar) {
        int i7;
        int i8;
        String str = xeVar.f14165k;
        if (!om.a(str)) {
            return 0;
        }
        int i9 = zm.f15186a;
        int i10 = i9 >= 21 ? 16 : 0;
        xi c7 = jj.c(str, false);
        if (c7 == null) {
            return 1;
        }
        int i11 = 2;
        if (i9 < 21 || (((i7 = xeVar.f14178x) == -1 || c7.d(i7)) && ((i8 = xeVar.f14177w) == -1 || c7.c(i8)))) {
            i11 = 3;
        }
        return i10 | 4 | i11;
    }
}
