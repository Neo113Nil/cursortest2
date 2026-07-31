package com.google.android.gms.internal.ads;

import android.annotation.TargetApi;
import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.SystemClock;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;

@TargetApi(19)
/* loaded from: classes.dex */
public abstract class zi extends ge {
    private static final byte[] P = zm.p("0000016742C00BDA259000000168CE0F13200000016588840DCE7118A0002FBF1C31C3275D78");
    private ByteBuffer[] A;
    private ByteBuffer[] B;
    private long C;
    private int D;
    private int E;
    private boolean F;
    private boolean G;
    private int H;
    private int I;
    private boolean J;
    private boolean K;
    private boolean L;
    private boolean M;
    private boolean N;
    protected tg O;

    /* renamed from: i, reason: collision with root package name */
    private final bj f15112i;

    /* renamed from: j, reason: collision with root package name */
    private final ug f15113j;

    /* renamed from: k, reason: collision with root package name */
    private final ug f15114k;

    /* renamed from: l, reason: collision with root package name */
    private final ye f15115l;

    /* renamed from: m, reason: collision with root package name */
    private final List<Long> f15116m;

    /* renamed from: n, reason: collision with root package name */
    private final MediaCodec.BufferInfo f15117n;

    /* renamed from: o, reason: collision with root package name */
    private xe f15118o;

    /* renamed from: p, reason: collision with root package name */
    private MediaCodec f15119p;

    /* renamed from: q, reason: collision with root package name */
    private xi f15120q;

    /* renamed from: r, reason: collision with root package name */
    private boolean f15121r;

    /* renamed from: s, reason: collision with root package name */
    private boolean f15122s;

    /* renamed from: t, reason: collision with root package name */
    private boolean f15123t;

    /* renamed from: u, reason: collision with root package name */
    private boolean f15124u;

    /* renamed from: v, reason: collision with root package name */
    private boolean f15125v;

    /* renamed from: w, reason: collision with root package name */
    private boolean f15126w;

    /* renamed from: x, reason: collision with root package name */
    private boolean f15127x;

    /* renamed from: y, reason: collision with root package name */
    private boolean f15128y;

    /* renamed from: z, reason: collision with root package name */
    private boolean f15129z;

    public zi(int i7, bj bjVar, zg zgVar, boolean z6) {
        super(i7);
        jm.e(zm.f15186a >= 16);
        this.f15112i = bjVar;
        this.f15113j = new ug(0);
        this.f15114k = new ug(0);
        this.f15115l = new ye();
        this.f15116m = new ArrayList();
        this.f15117n = new MediaCodec.BufferInfo();
        this.H = 0;
        this.I = 0;
    }

    private final boolean B() {
        MediaCodec mediaCodec = this.f15119p;
        if (mediaCodec == null || this.I == 2 || this.L) {
            return false;
        }
        if (this.D < 0) {
            int dequeueInputBuffer = mediaCodec.dequeueInputBuffer(0L);
            this.D = dequeueInputBuffer;
            if (dequeueInputBuffer < 0) {
                return false;
            }
            ug ugVar = this.f15113j;
            ugVar.f12780c = this.A[dequeueInputBuffer];
            ugVar.b();
        }
        if (this.I == 1) {
            if (!this.f15124u) {
                this.K = true;
                this.f15119p.queueInputBuffer(this.D, 0, 0, 0L, 4);
                this.D = -1;
            }
            this.I = 2;
            return false;
        }
        if (this.f15128y) {
            this.f15128y = false;
            ByteBuffer byteBuffer = this.f15113j.f12780c;
            byte[] bArr = P;
            byteBuffer.put(bArr);
            MediaCodec mediaCodec2 = this.f15119p;
            int i7 = this.D;
            int length = bArr.length;
            mediaCodec2.queueInputBuffer(i7, 0, 38, 0L, 0);
            this.D = -1;
            this.J = true;
            return true;
        }
        if (this.H == 1) {
            for (int i8 = 0; i8 < this.f15118o.f14167m.size(); i8++) {
                this.f15113j.f12780c.put(this.f15118o.f14167m.get(i8));
            }
            this.H = 2;
        }
        int position = this.f15113j.f12780c.position();
        int m7 = m(this.f15115l, this.f15113j, false);
        if (m7 == -3) {
            return false;
        }
        if (m7 == -5) {
            if (this.H == 2) {
                this.f15113j.b();
                this.H = 1;
            }
            I(this.f15115l.f14633a);
            return true;
        }
        if (this.f15113j.f()) {
            if (this.H == 2) {
                this.f15113j.b();
                this.H = 1;
            }
            this.L = true;
            if (!this.J) {
                z();
                return false;
            }
            try {
                if (!this.f15124u) {
                    this.K = true;
                    this.f15119p.queueInputBuffer(this.D, 0, 0, 0L, 4);
                    this.D = -1;
                }
                return false;
            } catch (MediaCodec.CryptoException e7) {
                throw ie.a(e7, l());
            }
        }
        if (this.N && !this.f15113j.g()) {
            this.f15113j.b();
            if (this.H == 2) {
                this.H = 1;
            }
            return true;
        }
        this.N = false;
        boolean i9 = this.f15113j.i();
        if (this.f15121r && !i9) {
            ByteBuffer byteBuffer2 = this.f15113j.f12780c;
            byte[] bArr2 = pm.f10272a;
            int position2 = byteBuffer2.position();
            int i10 = 0;
            int i11 = 0;
            while (true) {
                int i12 = i10 + 1;
                if (i12 >= position2) {
                    byteBuffer2.clear();
                    break;
                }
                int i13 = byteBuffer2.get(i10) & 255;
                if (i11 == 3) {
                    if (i13 == 1) {
                        if ((byteBuffer2.get(i12) & 31) == 7) {
                            ByteBuffer duplicate = byteBuffer2.duplicate();
                            duplicate.position(i10 - 3);
                            duplicate.limit(position2);
                            byteBuffer2.position(0);
                            byteBuffer2.put(duplicate);
                            break;
                        }
                        i13 = 1;
                    }
                } else if (i13 == 0) {
                    i11++;
                }
                if (i13 != 0) {
                    i11 = 0;
                }
                i10 = i12;
            }
            if (this.f15113j.f12780c.position() == 0) {
                return true;
            }
            this.f15121r = false;
        }
        try {
            ug ugVar2 = this.f15113j;
            long j7 = ugVar2.f12781d;
            if (ugVar2.e()) {
                this.f15116m.add(Long.valueOf(j7));
            }
            this.f15113j.f12780c.flip();
            R(this.f15113j);
            if (i9) {
                MediaCodec.CryptoInfo a7 = this.f15113j.f12779b.a();
                if (position != 0) {
                    if (a7.numBytesOfClearData == null) {
                        a7.numBytesOfClearData = new int[1];
                    }
                    int[] iArr = a7.numBytesOfClearData;
                    iArr[0] = iArr[0] + position;
                }
                this.f15119p.queueSecureInputBuffer(this.D, 0, a7, j7, 0);
            } else {
                this.f15119p.queueInputBuffer(this.D, 0, this.f15113j.f12780c.limit(), j7, 0);
            }
            this.D = -1;
            this.J = true;
            this.H = 0;
            this.O.f12199c++;
            return true;
        } catch (MediaCodec.CryptoException e8) {
            throw ie.a(e8, l());
        }
    }

    private final void z() {
        if (this.I == 2) {
            S();
            Q();
        } else {
            this.M = true;
            K();
        }
    }

    @Override // com.google.android.gms.internal.ads.cf
    public boolean A() {
        if (this.f15118o != null) {
            if (k() || this.E >= 0) {
                return true;
            }
            if (this.C != -9223372036854775807L && SystemClock.elapsedRealtime() < this.C) {
                return true;
            }
        }
        return false;
    }

    protected xi D(bj bjVar, xe xeVar, boolean z6) {
        return jj.c(xeVar.f14165k, false);
    }

    protected abstract void E(xi xiVar, MediaCodec mediaCodec, xe xeVar, MediaCrypto mediaCrypto);

    protected abstract void F(String str, long j7, long j8);

    /* JADX WARN: Code restructure failed: missing block: B:20:0x004f, code lost:
    
        if (r6.f14170p == r0.f14170p) goto L25;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    protected void I(xe xeVar) {
        xe xeVar2 = this.f15118o;
        this.f15118o = xeVar;
        if (!zm.o(xeVar.f14168n, xeVar2 == null ? null : xeVar2.f14168n) && this.f15118o.f14168n != null) {
            throw ie.a(new IllegalStateException("Media requires a DrmSessionManager"), l());
        }
        MediaCodec mediaCodec = this.f15119p;
        boolean z6 = true;
        if (mediaCodec == null || !T(mediaCodec, this.f15120q.f14217b, xeVar2, this.f15118o)) {
            if (this.J) {
                this.I = 1;
                return;
            } else {
                S();
                Q();
                return;
            }
        }
        this.G = true;
        this.H = 1;
        if (this.f15123t) {
            xe xeVar3 = this.f15118o;
            if (xeVar3.f14169o == xeVar2.f14169o) {
            }
        }
        z6 = false;
        this.f15128y = z6;
    }

    protected abstract void J(MediaCodec mediaCodec, MediaFormat mediaFormat);

    protected void K() {
    }

    @Override // com.google.android.gms.internal.ads.cf
    public boolean M() {
        return this.M;
    }

    protected abstract boolean N(long j7, long j8, MediaCodec mediaCodec, ByteBuffer byteBuffer, int i7, int i8, long j9, boolean z6);

    protected final MediaCodec O() {
        return this.f15119p;
    }

    protected final xi P() {
        return this.f15120q;
    }

    /* JADX WARN: Removed duplicated region for block: B:76:0x015c A[Catch: Exception -> 0x01d1, TryCatch #1 {Exception -> 0x01d1, blocks: (B:74:0x014c, B:76:0x015c, B:77:0x0167, B:85:0x0161), top: B:73:0x014c }] */
    /* JADX WARN: Removed duplicated region for block: B:80:0x01b3  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x01bb  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0161 A[Catch: Exception -> 0x01d1, TryCatch #1 {Exception -> 0x01d1, blocks: (B:74:0x014c, B:76:0x015c, B:77:0x0167, B:85:0x0161), top: B:73:0x014c }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    protected final void Q() {
        xe xeVar;
        boolean z6;
        if (this.f15119p != null || (xeVar = this.f15118o) == null) {
            return;
        }
        xi xiVar = this.f15120q;
        if (xiVar == null) {
            try {
                xiVar = D(this.f15112i, xeVar, false);
                this.f15120q = xiVar;
                if (xiVar == null) {
                    throw ie.a(new yi(this.f15118o, (Throwable) null, false, -49999), l());
                }
            } catch (ej e7) {
                throw ie.a(new yi(this.f15118o, (Throwable) e7, false, -49998), l());
            }
        }
        if (!U(xiVar)) {
            return;
        }
        String str = this.f15120q.f14216a;
        xe xeVar2 = this.f15118o;
        int i7 = zm.f15186a;
        this.f15121r = i7 < 21 && xeVar2.f14167m.isEmpty() && "OMX.MTK.VIDEO.DECODER.AVC".equals(str);
        this.f15122s = i7 < 18 || (i7 == 18 && ("OMX.SEC.avc.dec".equals(str) || "OMX.SEC.avc.dec.secure".equals(str))) || (i7 == 19 && zm.f15189d.startsWith("SM-G800") && ("OMX.Exynos.avc.dec".equals(str) || "OMX.Exynos.avc.dec.secure".equals(str)));
        try {
            if (i7 < 24 && ("OMX.Nvidia.h264.decode".equals(str) || "OMX.Nvidia.h264.decode.secure".equals(str))) {
                String str2 = zm.f15187b;
                if ("flounder".equals(str2) || "flounder_lte".equals(str2) || "grouper".equals(str2) || "tilapia".equals(str2)) {
                    z6 = true;
                    this.f15123t = z6;
                    this.f15124u = i7 > 17 && ("OMX.rk.video_decoder.avc".equals(str) || "OMX.allwinner.video.decoder.avc".equals(str));
                    this.f15125v = (i7 > 23 && "OMX.google.vorbis.decoder".equals(str)) || (i7 <= 19 && "hb2000".equals(zm.f15187b) && ("OMX.amlogic.avc.decoder.awesome".equals(str) || "OMX.amlogic.avc.decoder.awesome.secure".equals(str)));
                    this.f15126w = i7 != 21 && "OMX.google.aac.decoder".equals(str);
                    this.f15127x = i7 > 18 && this.f15118o.f14177w == 1 && "OMX.MTK.AUDIO.DECODER.MP3".equals(str);
                    long elapsedRealtime = SystemClock.elapsedRealtime();
                    String valueOf = String.valueOf(str);
                    wm.a(valueOf.length() == 0 ? "createCodec:".concat(valueOf) : new String("createCodec:"));
                    this.f15119p = MediaCodec.createByCodecName(str);
                    wm.b();
                    wm.a("configureCodec");
                    E(this.f15120q, this.f15119p, this.f15118o, null);
                    wm.b();
                    wm.a("startCodec");
                    this.f15119p.start();
                    wm.b();
                    long elapsedRealtime2 = SystemClock.elapsedRealtime();
                    F(str, elapsedRealtime2, elapsedRealtime2 - elapsedRealtime);
                    this.A = this.f15119p.getInputBuffers();
                    this.B = this.f15119p.getOutputBuffers();
                    this.C = a() != 2 ? SystemClock.elapsedRealtime() + 1000 : -9223372036854775807L;
                    this.D = -1;
                    this.E = -1;
                    this.N = true;
                    this.O.f12197a++;
                    return;
                }
            }
            long elapsedRealtime3 = SystemClock.elapsedRealtime();
            String valueOf2 = String.valueOf(str);
            wm.a(valueOf2.length() == 0 ? "createCodec:".concat(valueOf2) : new String("createCodec:"));
            this.f15119p = MediaCodec.createByCodecName(str);
            wm.b();
            wm.a("configureCodec");
            E(this.f15120q, this.f15119p, this.f15118o, null);
            wm.b();
            wm.a("startCodec");
            this.f15119p.start();
            wm.b();
            long elapsedRealtime22 = SystemClock.elapsedRealtime();
            F(str, elapsedRealtime22, elapsedRealtime22 - elapsedRealtime3);
            this.A = this.f15119p.getInputBuffers();
            this.B = this.f15119p.getOutputBuffers();
            this.C = a() != 2 ? SystemClock.elapsedRealtime() + 1000 : -9223372036854775807L;
            this.D = -1;
            this.E = -1;
            this.N = true;
            this.O.f12197a++;
            return;
        } catch (Exception e8) {
            throw ie.a(new yi(this.f15118o, (Throwable) e8, false, str), l());
        }
        z6 = false;
        this.f15123t = z6;
        this.f15124u = i7 > 17 && ("OMX.rk.video_decoder.avc".equals(str) || "OMX.allwinner.video.decoder.avc".equals(str));
        this.f15125v = (i7 > 23 && "OMX.google.vorbis.decoder".equals(str)) || (i7 <= 19 && "hb2000".equals(zm.f15187b) && ("OMX.amlogic.avc.decoder.awesome".equals(str) || "OMX.amlogic.avc.decoder.awesome.secure".equals(str)));
        this.f15126w = i7 != 21 && "OMX.google.aac.decoder".equals(str);
        this.f15127x = i7 > 18 && this.f15118o.f14177w == 1 && "OMX.MTK.AUDIO.DECODER.MP3".equals(str);
    }

    protected void R(ug ugVar) {
    }

    protected void S() {
        this.C = -9223372036854775807L;
        this.D = -1;
        this.E = -1;
        this.F = false;
        this.f15116m.clear();
        this.A = null;
        this.B = null;
        this.f15120q = null;
        this.G = false;
        this.J = false;
        this.f15121r = false;
        this.f15122s = false;
        this.f15123t = false;
        this.f15124u = false;
        this.f15125v = false;
        this.f15127x = false;
        this.f15128y = false;
        this.f15129z = false;
        this.K = false;
        this.H = 0;
        this.I = 0;
        this.f15113j.f12780c = null;
        MediaCodec mediaCodec = this.f15119p;
        if (mediaCodec != null) {
            this.O.f12198b++;
            try {
                mediaCodec.stop();
                try {
                    this.f15119p.release();
                } finally {
                }
            } catch (Throwable th) {
                try {
                    this.f15119p.release();
                    throw th;
                } finally {
                }
            }
        }
    }

    protected boolean T(MediaCodec mediaCodec, boolean z6, xe xeVar, xe xeVar2) {
        return false;
    }

    protected boolean U(xi xiVar) {
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:100:0x014e, code lost:
    
        if (r16.M == false) goto L115;
     */
    /* JADX WARN: Code restructure failed: missing block: B:101:0x0150, code lost:
    
        S();
     */
    /* JADX WARN: Code restructure failed: missing block: B:109:0x0066, code lost:
    
        if (r16.M == false) goto L115;
     */
    @Override // com.google.android.gms.internal.ads.cf
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void X(long j7, long j8) {
        boolean N;
        int dequeueOutputBuffer;
        boolean z6;
        if (this.M) {
            K();
            return;
        }
        if (this.f15118o == null) {
            this.f15114k.b();
            int m7 = m(this.f15115l, this.f15114k, true);
            if (m7 != -5) {
                if (m7 == -4) {
                    jm.e(this.f15114k.f());
                    this.L = true;
                    z();
                    return;
                }
                return;
            }
            I(this.f15115l.f14633a);
        }
        Q();
        if (this.f15119p != null) {
            wm.a("drainAndFeed");
            while (true) {
                if (this.E < 0) {
                    if (this.f15126w && this.K) {
                        try {
                            dequeueOutputBuffer = this.f15119p.dequeueOutputBuffer(this.f15117n, 0L);
                            this.E = dequeueOutputBuffer;
                        } catch (IllegalStateException unused) {
                            z();
                        }
                    } else {
                        dequeueOutputBuffer = this.f15119p.dequeueOutputBuffer(this.f15117n, 0L);
                        this.E = dequeueOutputBuffer;
                    }
                    if (dequeueOutputBuffer >= 0) {
                        if (this.f15129z) {
                            this.f15129z = false;
                            this.f15119p.releaseOutputBuffer(dequeueOutputBuffer, false);
                            this.E = -1;
                        } else {
                            MediaCodec.BufferInfo bufferInfo = this.f15117n;
                            if ((bufferInfo.flags & 4) != 0) {
                                z();
                                this.E = -1;
                                break;
                            }
                            ByteBuffer byteBuffer = this.B[this.E];
                            if (byteBuffer != null) {
                                byteBuffer.position(bufferInfo.offset);
                                MediaCodec.BufferInfo bufferInfo2 = this.f15117n;
                                byteBuffer.limit(bufferInfo2.offset + bufferInfo2.size);
                            }
                            long j9 = this.f15117n.presentationTimeUs;
                            int size = this.f15116m.size();
                            int i7 = 0;
                            while (true) {
                                if (i7 >= size) {
                                    z6 = false;
                                    break;
                                } else {
                                    if (this.f15116m.get(i7).longValue() == j9) {
                                        this.f15116m.remove(i7);
                                        z6 = true;
                                        break;
                                    }
                                    i7++;
                                }
                            }
                            this.F = z6;
                        }
                    } else if (dequeueOutputBuffer == -2) {
                        MediaFormat outputFormat = this.f15119p.getOutputFormat();
                        if (this.f15123t && outputFormat.getInteger("width") == 32 && outputFormat.getInteger("height") == 32) {
                            this.f15129z = true;
                        } else {
                            if (this.f15127x) {
                                outputFormat.setInteger("channel-count", 1);
                            }
                            J(this.f15119p, outputFormat);
                        }
                    } else if (dequeueOutputBuffer == -3) {
                        this.B = this.f15119p.getOutputBuffers();
                    } else if (this.f15124u && (this.L || this.I == 2)) {
                        z();
                    }
                }
                if (this.f15126w && this.K) {
                    try {
                        MediaCodec mediaCodec = this.f15119p;
                        ByteBuffer[] byteBufferArr = this.B;
                        int i8 = this.E;
                        ByteBuffer byteBuffer2 = byteBufferArr[i8];
                        MediaCodec.BufferInfo bufferInfo3 = this.f15117n;
                        N = N(j7, j8, mediaCodec, byteBuffer2, i8, bufferInfo3.flags, bufferInfo3.presentationTimeUs, this.F);
                    } catch (IllegalStateException unused2) {
                        z();
                    }
                } else {
                    MediaCodec mediaCodec2 = this.f15119p;
                    ByteBuffer[] byteBufferArr2 = this.B;
                    int i9 = this.E;
                    ByteBuffer byteBuffer3 = byteBufferArr2[i9];
                    MediaCodec.BufferInfo bufferInfo4 = this.f15117n;
                    N = N(j7, j8, mediaCodec2, byteBuffer3, i9, bufferInfo4.flags, bufferInfo4.presentationTimeUs, this.F);
                }
                if (!N) {
                    break;
                }
                long j10 = this.f15117n.presentationTimeUs;
                this.E = -1;
            }
            while (B()) {
            }
            wm.b();
        } else {
            w(j7);
            this.f15114k.b();
            int m8 = m(this.f15115l, this.f15114k, false);
            if (m8 == -5) {
                I(this.f15115l.f14633a);
            } else if (m8 == -4) {
                jm.e(this.f15114k.f());
                this.L = true;
                z();
            }
        }
        this.O.a();
    }

    @Override // com.google.android.gms.internal.ads.df
    public final int b() {
        return 4;
    }

    @Override // com.google.android.gms.internal.ads.df
    public final int g(xe xeVar) {
        try {
            return y(this.f15112i, xeVar);
        } catch (ej e7) {
            throw ie.a(e7, l());
        }
    }

    @Override // com.google.android.gms.internal.ads.ge
    protected void p() {
        this.f15118o = null;
        S();
    }

    @Override // com.google.android.gms.internal.ads.ge
    protected void q(boolean z6) {
        this.O = new tg();
    }

    @Override // com.google.android.gms.internal.ads.ge
    protected void r(long j7, boolean z6) {
        this.L = false;
        this.M = false;
        if (this.f15119p != null) {
            this.C = -9223372036854775807L;
            this.D = -1;
            this.E = -1;
            this.N = true;
            this.F = false;
            this.f15116m.clear();
            this.f15128y = false;
            this.f15129z = false;
            if (this.f15122s || ((this.f15125v && this.K) || this.I != 0)) {
                S();
                Q();
            } else {
                this.f15119p.flush();
                this.J = false;
            }
            if (!this.G || this.f15118o == null) {
                return;
            }
            this.H = 1;
        }
    }

    protected abstract int y(bj bjVar, xe xeVar);
}
