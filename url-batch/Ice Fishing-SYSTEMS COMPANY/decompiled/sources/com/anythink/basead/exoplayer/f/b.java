package com.anythink.basead.exoplayer.f;

import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Looper;
import android.os.SystemClock;
import android.util.Log;
import com.anythink.basead.exoplayer.d.f;
import com.anythink.basead.exoplayer.d.g;
import com.anythink.basead.exoplayer.d.k;
import com.anythink.basead.exoplayer.f.d;
import com.anythink.basead.exoplayer.k.C0544a;
import com.anythink.basead.exoplayer.k.ad;
import com.anythink.basead.exoplayer.k.af;
import com.anythink.basead.exoplayer.k.p;
import com.anythink.basead.exoplayer.m;
import com.anythink.basead.exoplayer.n;
import com.anythink.core.common.d.j;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public abstract class b extends com.anythink.basead.exoplayer.a {

    /* renamed from: A, reason: collision with root package name */
    private static final int f7361A = 1;

    /* renamed from: B, reason: collision with root package name */
    private static final int f7362B = 2;

    /* renamed from: C, reason: collision with root package name */
    private static final byte[] f7363C = af.g("0000016742C00BDA259000000168CE0F13200000016588840DCE7118A0002FBF1C31C3275D78");

    /* renamed from: D, reason: collision with root package name */
    private static final int f7364D = 32;

    /* renamed from: n, reason: collision with root package name */
    protected static final int f7365n = 0;

    /* renamed from: o, reason: collision with root package name */
    protected static final int f7366o = 1;

    /* renamed from: p, reason: collision with root package name */
    protected static final int f7367p = 3;

    /* renamed from: r, reason: collision with root package name */
    private static final String f7368r = "MediaCodecRenderer";

    /* renamed from: s, reason: collision with root package name */
    private static final long f7369s = 1000;

    /* renamed from: t, reason: collision with root package name */
    private static final int f7370t = 0;

    /* renamed from: u, reason: collision with root package name */
    private static final int f7371u = 1;

    /* renamed from: v, reason: collision with root package name */
    private static final int f7372v = 2;

    /* renamed from: w, reason: collision with root package name */
    private static final int f7373w = 0;

    /* renamed from: x, reason: collision with root package name */
    private static final int f7374x = 1;

    /* renamed from: y, reason: collision with root package name */
    private static final int f7375y = 2;

    /* renamed from: z, reason: collision with root package name */
    private static final int f7376z = 0;

    /* renamed from: E, reason: collision with root package name */
    private final com.anythink.basead.exoplayer.f.c f7377E;

    /* renamed from: F, reason: collision with root package name */
    private final g<k> f7378F;

    /* renamed from: G, reason: collision with root package name */
    private final boolean f7379G;

    /* renamed from: H, reason: collision with root package name */
    private final com.anythink.basead.exoplayer.c.e f7380H;

    /* renamed from: I, reason: collision with root package name */
    private final com.anythink.basead.exoplayer.c.e f7381I;
    private final n J;

    /* renamed from: K, reason: collision with root package name */
    private final List<Long> f7382K;

    /* renamed from: L, reason: collision with root package name */
    private final MediaCodec.BufferInfo f7383L;

    /* renamed from: M, reason: collision with root package name */
    private m f7384M;

    /* renamed from: N, reason: collision with root package name */
    private f<k> f7385N;

    /* renamed from: O, reason: collision with root package name */
    private f<k> f7386O;

    /* renamed from: P, reason: collision with root package name */
    private MediaCodec f7387P;

    /* renamed from: Q, reason: collision with root package name */
    private com.anythink.basead.exoplayer.f.a f7388Q;

    /* renamed from: R, reason: collision with root package name */
    private int f7389R;

    /* renamed from: S, reason: collision with root package name */
    private boolean f7390S;

    /* renamed from: T, reason: collision with root package name */
    private boolean f7391T;

    /* renamed from: U, reason: collision with root package name */
    private boolean f7392U;

    /* renamed from: V, reason: collision with root package name */
    private boolean f7393V;

    /* renamed from: W, reason: collision with root package name */
    private boolean f7394W;

    /* renamed from: X, reason: collision with root package name */
    private boolean f7395X;
    private boolean Y;

    /* renamed from: Z, reason: collision with root package name */
    private boolean f7396Z;
    private ByteBuffer[] aa;
    private ByteBuffer[] ab;
    private long ac;
    private int ad;
    private int ae;
    private ByteBuffer af;
    private boolean ag;
    private boolean ah;
    private int ai;
    private int aj;
    private boolean ak;
    private boolean al;
    private boolean am;
    private boolean an;
    private boolean ao;
    private boolean ap;

    /* renamed from: q, reason: collision with root package name */
    protected com.anythink.basead.exoplayer.c.d f7397q;

    @Retention(RetentionPolicy.SOURCE)
    public @interface a {
    }

    @Retention(RetentionPolicy.SOURCE)
    public @interface c {
    }

    @Retention(RetentionPolicy.SOURCE)
    public @interface d {
    }

    @Retention(RetentionPolicy.SOURCE)
    public @interface e {
    }

    public b(int i, com.anythink.basead.exoplayer.f.c cVar, g<k> gVar, boolean z8) {
        super(i);
        C0544a.b(af.f8503a >= 16);
        this.f7377E = (com.anythink.basead.exoplayer.f.c) C0544a.a(cVar);
        this.f7378F = gVar;
        this.f7379G = false;
        this.f7380H = new com.anythink.basead.exoplayer.c.e(0);
        this.f7381I = com.anythink.basead.exoplayer.c.e.e();
        this.J = new n();
        this.f7382K = new ArrayList();
        this.f7383L = new MediaCodec.BufferInfo();
        this.ai = 0;
        this.aj = 0;
    }

    /* JADX WARN: Removed duplicated region for block: B:80:0x015a A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:81:0x015b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private boolean C() {
        int position;
        int a9;
        boolean z8;
        MediaCodec mediaCodec = this.f7387P;
        if (mediaCodec == null || this.aj == 2 || this.am) {
            return false;
        }
        if (this.ad < 0) {
            int dequeueInputBuffer = mediaCodec.dequeueInputBuffer(0L);
            this.ad = dequeueInputBuffer;
            if (dequeueInputBuffer < 0) {
                return false;
            }
            this.f7380H.f6899e = af.f8503a >= 21 ? this.f7387P.getInputBuffer(dequeueInputBuffer) : this.aa[dequeueInputBuffer];
            this.f7380H.a();
        }
        if (this.aj == 1) {
            if (!this.f7392U) {
                this.al = true;
                this.f7387P.queueInputBuffer(this.ad, 0, 0, 0L, 4);
                G();
            }
            this.aj = 2;
            return false;
        }
        if (this.Y) {
            this.Y = false;
            ByteBuffer byteBuffer = this.f7380H.f6899e;
            byte[] bArr = f7363C;
            byteBuffer.put(bArr);
            this.f7387P.queueInputBuffer(this.ad, 0, bArr.length, 0L, 0);
            G();
            this.ak = true;
            return true;
        }
        if (this.ao) {
            a9 = -4;
            position = 0;
        } else {
            if (this.ai == 1) {
                for (int i = 0; i < this.f7384M.f8823j.size(); i++) {
                    this.f7380H.f6899e.put(this.f7384M.f8823j.get(i));
                }
                this.ai = 2;
            }
            position = this.f7380H.f6899e.position();
            a9 = a(this.J, this.f7380H, false);
        }
        if (a9 == -3) {
            return false;
        }
        if (a9 == -5) {
            if (this.ai == 2) {
                this.f7380H.a();
                this.ai = 1;
            }
            b(this.J.f8840a);
            return true;
        }
        if (this.f7380H.c()) {
            if (this.ai == 2) {
                this.f7380H.a();
                this.ai = 1;
            }
            this.am = true;
            if (!this.ak) {
                L();
                return false;
            }
            try {
                if (!this.f7392U) {
                    this.al = true;
                    this.f7387P.queueInputBuffer(this.ad, 0, 0, 0L, 4);
                    G();
                }
                return false;
            } catch (Exception e6) {
                throw com.anythink.basead.exoplayer.g.a(e6, s());
            }
        }
        if (this.ap && !this.f7380H.d()) {
            this.f7380H.a();
            if (this.ai == 2) {
                this.ai = 1;
            }
            return true;
        }
        this.ap = false;
        boolean g9 = this.f7380H.g();
        f<k> fVar = this.f7385N;
        if (fVar != null && (g9 || !this.f7379G)) {
            int e9 = fVar.e();
            if (e9 == 1) {
                throw com.anythink.basead.exoplayer.g.a(this.f7385N.f(), s());
            }
            if (e9 != 4) {
                z8 = true;
                this.ao = z8;
                if (!z8) {
                    return false;
                }
                if (this.f7390S && !g9) {
                    p.a(this.f7380H.f6899e);
                    if (this.f7380H.f6899e.position() == 0) {
                        return true;
                    }
                    this.f7390S = false;
                }
                try {
                    com.anythink.basead.exoplayer.c.e eVar = this.f7380H;
                    long j9 = eVar.f6900f;
                    if (eVar.b()) {
                        this.f7382K.add(Long.valueOf(j9));
                    }
                    this.f7380H.h();
                    a(this.f7380H);
                    if (g9) {
                        MediaCodec.CryptoInfo a10 = this.f7380H.f6898d.a();
                        if (position != 0) {
                            if (a10.numBytesOfClearData == null) {
                                a10.numBytesOfClearData = new int[1];
                            }
                            int[] iArr = a10.numBytesOfClearData;
                            iArr[0] = iArr[0] + position;
                        }
                        this.f7387P.queueSecureInputBuffer(this.ad, 0, a10, j9, 0);
                    } else {
                        this.f7387P.queueInputBuffer(this.ad, 0, this.f7380H.f6899e.limit(), j9, 0);
                    }
                    G();
                    this.ak = true;
                    this.ai = 0;
                    this.f7397q.f6889c++;
                    return true;
                } catch (Exception e10) {
                    throw com.anythink.basead.exoplayer.g.a(e10, s());
                }
            }
        }
        z8 = false;
        this.ao = z8;
        if (!z8) {
        }
    }

    private void D() {
        if (af.f8503a < 21) {
            this.aa = this.f7387P.getInputBuffers();
            this.ab = this.f7387P.getOutputBuffers();
        }
    }

    private void E() {
        if (af.f8503a < 21) {
            this.aa = null;
            this.ab = null;
        }
    }

    private boolean F() {
        return this.ae >= 0;
    }

    private void G() {
        this.ad = -1;
        this.f7380H.f6899e = null;
    }

    private void H() {
        this.ae = -1;
        this.af = null;
    }

    private static long I() {
        return 0L;
    }

    private void J() {
        MediaFormat outputFormat = this.f7387P.getOutputFormat();
        if (this.f7389R != 0 && outputFormat.getInteger("width") == 32 && outputFormat.getInteger("height") == 32) {
            this.f7396Z = true;
            return;
        }
        if (this.f7395X) {
            outputFormat.setInteger("channel-count", 1);
        }
        a(this.f7387P, outputFormat);
    }

    private void K() {
        if (af.f8503a < 21) {
            this.ab = this.f7387P.getOutputBuffers();
        }
    }

    private void L() {
        if (this.aj == 2) {
            A();
            x();
        } else {
            this.an = true;
            w();
        }
    }

    private static boolean M() {
        if (!"Amazon".equals(af.f8505c)) {
            return false;
        }
        String str = af.f8506d;
        return "AFTM".equals(str) || "AFTB".equals(str);
    }

    private ByteBuffer b(int i) {
        return af.f8503a >= 21 ? this.f7387P.getInputBuffer(i) : this.aa[i];
    }

    private boolean d(long j9) {
        int size = this.f7382K.size();
        for (int i = 0; i < size; i++) {
            if (this.f7382K.get(i).longValue() == j9) {
                this.f7382K.remove(i);
                return true;
            }
        }
        return false;
    }

    public void A() {
        this.ac = com.anythink.basead.exoplayer.b.f6539b;
        G();
        H();
        this.ao = false;
        this.ag = false;
        this.f7382K.clear();
        if (af.f8503a < 21) {
            this.aa = null;
            this.ab = null;
        }
        this.f7388Q = null;
        this.ah = false;
        this.ak = false;
        this.f7390S = false;
        this.f7391T = false;
        this.f7389R = 0;
        this.f7392U = false;
        this.f7393V = false;
        this.f7395X = false;
        this.Y = false;
        this.f7396Z = false;
        this.al = false;
        this.ai = 0;
        this.aj = 0;
        MediaCodec mediaCodec = this.f7387P;
        if (mediaCodec != null) {
            this.f7397q.f6888b++;
            try {
                mediaCodec.stop();
                try {
                    this.f7387P.release();
                    this.f7387P = null;
                    f<k> fVar = this.f7385N;
                    if (fVar == null || this.f7386O == fVar) {
                        return;
                    }
                    try {
                        this.f7378F.a(fVar);
                    } finally {
                    }
                } catch (Throwable th) {
                    this.f7387P = null;
                    f<k> fVar2 = this.f7385N;
                    if (fVar2 != null && this.f7386O != fVar2) {
                        try {
                            this.f7378F.a(fVar2);
                        } finally {
                        }
                    }
                    throw th;
                }
            } catch (Throwable th2) {
                try {
                    this.f7387P.release();
                    this.f7387P = null;
                    f<k> fVar3 = this.f7385N;
                    if (fVar3 != null && this.f7386O != fVar3) {
                        try {
                            this.f7378F.a(fVar3);
                        } finally {
                        }
                    }
                    throw th2;
                } catch (Throwable th3) {
                    this.f7387P = null;
                    f<k> fVar4 = this.f7385N;
                    if (fVar4 != null && this.f7386O != fVar4) {
                        try {
                            this.f7378F.a(fVar4);
                        } finally {
                        }
                    }
                    throw th3;
                }
            }
        }
    }

    public void B() {
        this.ac = com.anythink.basead.exoplayer.b.f6539b;
        G();
        H();
        this.ap = true;
        this.ao = false;
        this.ag = false;
        this.f7382K.clear();
        this.Y = false;
        this.f7396Z = false;
        if (this.f7391T || (this.f7393V && this.al)) {
            A();
            x();
        } else if (this.aj != 0) {
            A();
            x();
        } else {
            this.f7387P.flush();
            this.ak = false;
        }
        if (!this.ah || this.f7384M == null) {
            return;
        }
        this.ai = 1;
    }

    public int a(com.anythink.basead.exoplayer.f.a aVar, m mVar, m mVar2) {
        return 0;
    }

    public abstract int a(com.anythink.basead.exoplayer.f.c cVar, g<k> gVar, m mVar);

    public abstract void a(com.anythink.basead.exoplayer.f.a aVar, MediaCodec mediaCodec, m mVar, MediaCrypto mediaCrypto);

    public abstract boolean a(long j9, long j10, MediaCodec mediaCodec, ByteBuffer byteBuffer, int i, int i4, long j11, boolean z8);

    public void c(long j9) {
    }

    @Override // com.anythink.basead.exoplayer.a, com.anythink.basead.exoplayer.z
    public final int m() {
        return 8;
    }

    @Override // com.anythink.basead.exoplayer.a
    public void n() {
    }

    @Override // com.anythink.basead.exoplayer.a
    public void o() {
    }

    @Override // com.anythink.basead.exoplayer.a
    public void p() {
        this.f7384M = null;
        try {
            A();
            try {
                f<k> fVar = this.f7385N;
                if (fVar != null) {
                    this.f7378F.a(fVar);
                }
                try {
                    f<k> fVar2 = this.f7386O;
                    if (fVar2 != null && fVar2 != this.f7385N) {
                        this.f7378F.a(fVar2);
                    }
                } finally {
                }
            } catch (Throwable th) {
                try {
                    f<k> fVar3 = this.f7386O;
                    if (fVar3 != null && fVar3 != this.f7385N) {
                        this.f7378F.a(fVar3);
                    }
                    throw th;
                } finally {
                }
            }
        } catch (Throwable th2) {
            try {
                if (this.f7385N != null) {
                    this.f7378F.a(this.f7385N);
                }
                try {
                    f<k> fVar4 = this.f7386O;
                    if (fVar4 != null && fVar4 != this.f7385N) {
                        this.f7378F.a(fVar4);
                    }
                    throw th2;
                } finally {
                }
            } catch (Throwable th3) {
                try {
                    f<k> fVar5 = this.f7386O;
                    if (fVar5 != null && fVar5 != this.f7385N) {
                        this.f7378F.a(fVar5);
                    }
                    throw th3;
                } finally {
                }
            }
        }
    }

    @Override // com.anythink.basead.exoplayer.y
    public boolean u() {
        if (this.f7384M == null || this.ao) {
            return false;
        }
        if (t() || F()) {
            return true;
        }
        return this.ac != com.anythink.basead.exoplayer.b.f6539b && SystemClock.elapsedRealtime() < this.ac;
    }

    @Override // com.anythink.basead.exoplayer.y
    public boolean v() {
        return this.an;
    }

    public void w() {
    }

    /* JADX WARN: Can't wrap try/catch for region: R(34:29|(2:33|(24:41|42|(1:125)(1:48)|49|(1:124)(1:63)|64|(1:123)(1:70)|71|(1:116)(1:75)|76|(1:108)(1:80)|81|(1:87)|88|89|90|91|92|93|(1:95)|97|(1:99)(1:102)|100|101))|126|(2:132|(30:140|42|(1:44)|125|49|(1:52)|124|64|(2:66|68)|117|123|71|(1:73)|116|76|(1:78)|108|81|(3:83|85|87)|88|89|90|91|92|93|(0)|97|(0)(0)|100|101))|141|42|(0)|125|49|(0)|124|64|(0)|117|123|71|(0)|116|76|(0)|108|81|(0)|88|89|90|91|92|93|(0)|97|(0)(0)|100|101) */
    /* JADX WARN: Code restructure failed: missing block: B:103:0x0273, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:104:0x0277, code lost:
    
        a(new com.anythink.basead.exoplayer.f.b.C0022b(r7.f7384M, r0, r1, r8));
     */
    /* JADX WARN: Code restructure failed: missing block: B:106:0x0275, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:107:0x0276, code lost:
    
        r7 = r15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0057, code lost:
    
        if (r7 != 4) goto L6;
     */
    /* JADX WARN: Removed duplicated region for block: B:102:0x028f  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x014f  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x016a A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:66:0x01a4  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x01d3  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x01fe  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x020f  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0262 A[Catch: Exception -> 0x0273, TRY_LEAVE, TryCatch #2 {Exception -> 0x0273, blocks: (B:93:0x025d, B:95:0x0262), top: B:92:0x025d }] */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0287  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void x() {
        m mVar;
        MediaCrypto mediaCrypto;
        boolean z8;
        int i;
        if (this.f7387P == null && (mVar = this.f7384M) != null) {
            f<k> fVar = this.f7386O;
            this.f7385N = fVar;
            String str = mVar.f8822h;
            boolean z9 = false;
            if (fVar != null) {
                k g9 = fVar.g();
                if (g9 != null) {
                    mediaCrypto = g9.a();
                    z8 = g9.a(str);
                } else if (this.f7385N.f() != null) {
                    mediaCrypto = null;
                    z8 = false;
                }
                if ("Amazon".equals(af.f8505c)) {
                    String str2 = af.f8506d;
                    if ("AFTM".equals(str2) || "AFTB".equals(str2)) {
                        int e6 = this.f7385N.e();
                        if (e6 == 1) {
                            throw com.anythink.basead.exoplayer.g.a(this.f7385N.f(), s());
                        }
                    }
                }
            } else {
                mediaCrypto = null;
                z8 = false;
            }
            if (this.f7388Q == null) {
                try {
                    com.anythink.basead.exoplayer.f.a a9 = a(this.f7377E, this.f7384M, z8);
                    this.f7388Q = a9;
                    if (a9 == null && z8) {
                        com.anythink.basead.exoplayer.f.a a10 = a(this.f7377E, this.f7384M, false);
                        this.f7388Q = a10;
                        if (a10 != null) {
                            Log.w(f7368r, "Drm session requires secure decoder for " + str + ", but no secure decoder available. Trying to proceed with " + this.f7388Q.f7355c + j.f12535z);
                        }
                    }
                } catch (d.b e9) {
                    a(new C0022b(this.f7384M, e9, z8, -49998));
                }
                if (this.f7388Q == null) {
                    a(new C0022b(this.f7384M, (Throwable) null, z8, -49999));
                }
            }
            if (a(this.f7388Q)) {
                String str3 = this.f7388Q.f7355c;
                int i4 = af.f8503a;
                if (i4 <= 25 && "OMX.Exynos.avc.dec.secure".equals(str3)) {
                    String str4 = af.f8506d;
                    if (str4.startsWith("SM-T585") || str4.startsWith("SM-A510") || str4.startsWith("SM-A520") || str4.startsWith("SM-J700")) {
                        i = 2;
                        this.f7389R = i;
                        this.f7390S = i4 >= 21 && this.f7384M.f8823j.isEmpty() && "OMX.MTK.VIDEO.DECODER.AVC".equals(str3);
                        this.f7391T = i4 >= 18 || (i4 == 18 && ("OMX.SEC.avc.dec".equals(str3) || "OMX.SEC.avc.dec.secure".equals(str3))) || (i4 == 19 && af.f8506d.startsWith("SM-G800") && ("OMX.Exynos.avc.dec".equals(str3) || "OMX.Exynos.avc.dec.secure".equals(str3)));
                        com.anythink.basead.exoplayer.f.a aVar = this.f7388Q;
                        String str5 = aVar.f7355c;
                        this.f7392U = (i4 > 17 && ("OMX.rk.video_decoder.avc".equals(str5) || "OMX.allwinner.video.decoder.avc".equals(str5))) || ("Amazon".equals(af.f8505c) && "AFTS".equals(af.f8506d) && aVar.f7360h);
                        this.f7393V = (i4 > 23 && "OMX.google.vorbis.decoder".equals(str3)) || (i4 <= 19 && "hb2000".equals(af.f8504b) && ("OMX.amlogic.avc.decoder.awesome".equals(str3) || "OMX.amlogic.avc.decoder.awesome.secure".equals(str3)));
                        this.f7394W = i4 != 21 && "OMX.google.aac.decoder".equals(str3);
                        m mVar2 = this.f7384M;
                        if (i4 <= 18 && mVar2.f8834u == 1 && "OMX.MTK.AUDIO.DECODER.MP3".equals(str3)) {
                            z9 = true;
                        }
                        this.f7395X = z9;
                        long elapsedRealtime = SystemClock.elapsedRealtime();
                        ad.a("createCodec:".concat(String.valueOf(str3)));
                        this.f7387P = MediaCodec.createByCodecName(str3);
                        ad.a();
                        ad.a("configureCodec");
                        a(this.f7388Q, this.f7387P, this.f7384M, mediaCrypto);
                        ad.a();
                        ad.a("startCodec");
                        this.f7387P.start();
                        ad.a();
                        long elapsedRealtime2 = SystemClock.elapsedRealtime();
                        b bVar = this;
                        bVar.a(str3, elapsedRealtime2, elapsedRealtime2 - elapsedRealtime);
                        if (i4 < 21) {
                            bVar.aa = bVar.f7387P.getInputBuffers();
                            bVar.ab = bVar.f7387P.getOutputBuffers();
                        }
                        bVar.ac = a_() != 2 ? SystemClock.elapsedRealtime() + f7369s : com.anythink.basead.exoplayer.b.f6539b;
                        G();
                        H();
                        bVar.ap = true;
                        bVar.f7397q.f6887a++;
                    }
                }
                if (i4 < 24 && ("OMX.Nvidia.h264.decode".equals(str3) || "OMX.Nvidia.h264.decode.secure".equals(str3))) {
                    String str6 = af.f8504b;
                    if ("flounder".equals(str6) || "flounder_lte".equals(str6) || "grouper".equals(str6) || "tilapia".equals(str6)) {
                        i = 1;
                        this.f7389R = i;
                        this.f7390S = i4 >= 21 && this.f7384M.f8823j.isEmpty() && "OMX.MTK.VIDEO.DECODER.AVC".equals(str3);
                        this.f7391T = i4 >= 18 || (i4 == 18 && ("OMX.SEC.avc.dec".equals(str3) || "OMX.SEC.avc.dec.secure".equals(str3))) || (i4 == 19 && af.f8506d.startsWith("SM-G800") && ("OMX.Exynos.avc.dec".equals(str3) || "OMX.Exynos.avc.dec.secure".equals(str3)));
                        com.anythink.basead.exoplayer.f.a aVar2 = this.f7388Q;
                        String str52 = aVar2.f7355c;
                        this.f7392U = (i4 > 17 && ("OMX.rk.video_decoder.avc".equals(str52) || "OMX.allwinner.video.decoder.avc".equals(str52))) || ("Amazon".equals(af.f8505c) && "AFTS".equals(af.f8506d) && aVar2.f7360h);
                        this.f7393V = (i4 > 23 && "OMX.google.vorbis.decoder".equals(str3)) || (i4 <= 19 && "hb2000".equals(af.f8504b) && ("OMX.amlogic.avc.decoder.awesome".equals(str3) || "OMX.amlogic.avc.decoder.awesome.secure".equals(str3)));
                        this.f7394W = i4 != 21 && "OMX.google.aac.decoder".equals(str3);
                        m mVar22 = this.f7384M;
                        if (i4 <= 18) {
                            z9 = true;
                        }
                        this.f7395X = z9;
                        long elapsedRealtime3 = SystemClock.elapsedRealtime();
                        ad.a("createCodec:".concat(String.valueOf(str3)));
                        this.f7387P = MediaCodec.createByCodecName(str3);
                        ad.a();
                        ad.a("configureCodec");
                        a(this.f7388Q, this.f7387P, this.f7384M, mediaCrypto);
                        ad.a();
                        ad.a("startCodec");
                        this.f7387P.start();
                        ad.a();
                        long elapsedRealtime22 = SystemClock.elapsedRealtime();
                        b bVar2 = this;
                        bVar2.a(str3, elapsedRealtime22, elapsedRealtime22 - elapsedRealtime3);
                        if (i4 < 21) {
                        }
                        bVar2.ac = a_() != 2 ? SystemClock.elapsedRealtime() + f7369s : com.anythink.basead.exoplayer.b.f6539b;
                        G();
                        H();
                        bVar2.ap = true;
                        bVar2.f7397q.f6887a++;
                    }
                }
                i = 0;
                this.f7389R = i;
                this.f7390S = i4 >= 21 && this.f7384M.f8823j.isEmpty() && "OMX.MTK.VIDEO.DECODER.AVC".equals(str3);
                this.f7391T = i4 >= 18 || (i4 == 18 && ("OMX.SEC.avc.dec".equals(str3) || "OMX.SEC.avc.dec.secure".equals(str3))) || (i4 == 19 && af.f8506d.startsWith("SM-G800") && ("OMX.Exynos.avc.dec".equals(str3) || "OMX.Exynos.avc.dec.secure".equals(str3)));
                com.anythink.basead.exoplayer.f.a aVar22 = this.f7388Q;
                String str522 = aVar22.f7355c;
                this.f7392U = (i4 > 17 && ("OMX.rk.video_decoder.avc".equals(str522) || "OMX.allwinner.video.decoder.avc".equals(str522))) || ("Amazon".equals(af.f8505c) && "AFTS".equals(af.f8506d) && aVar22.f7360h);
                this.f7393V = (i4 > 23 && "OMX.google.vorbis.decoder".equals(str3)) || (i4 <= 19 && "hb2000".equals(af.f8504b) && ("OMX.amlogic.avc.decoder.awesome".equals(str3) || "OMX.amlogic.avc.decoder.awesome.secure".equals(str3)));
                this.f7394W = i4 != 21 && "OMX.google.aac.decoder".equals(str3);
                m mVar222 = this.f7384M;
                if (i4 <= 18) {
                }
                this.f7395X = z9;
                long elapsedRealtime32 = SystemClock.elapsedRealtime();
                ad.a("createCodec:".concat(String.valueOf(str3)));
                this.f7387P = MediaCodec.createByCodecName(str3);
                ad.a();
                ad.a("configureCodec");
                a(this.f7388Q, this.f7387P, this.f7384M, mediaCrypto);
                ad.a();
                ad.a("startCodec");
                this.f7387P.start();
                ad.a();
                long elapsedRealtime222 = SystemClock.elapsedRealtime();
                b bVar22 = this;
                bVar22.a(str3, elapsedRealtime222, elapsedRealtime222 - elapsedRealtime32);
                if (i4 < 21) {
                }
                bVar22.ac = a_() != 2 ? SystemClock.elapsedRealtime() + f7369s : com.anythink.basead.exoplayer.b.f6539b;
                G();
                H();
                bVar22.ap = true;
                bVar22.f7397q.f6887a++;
            }
        }
    }

    public final MediaCodec y() {
        return this.f7387P;
    }

    public final com.anythink.basead.exoplayer.f.a z() {
        return this.f7388Q;
    }

    /* renamed from: com.anythink.basead.exoplayer.f.b$b, reason: collision with other inner class name */
    public static class C0022b extends Exception {

        /* renamed from: e, reason: collision with root package name */
        private static final int f7398e = -50000;

        /* renamed from: f, reason: collision with root package name */
        private static final int f7399f = -49999;

        /* renamed from: g, reason: collision with root package name */
        private static final int f7400g = -49998;

        /* renamed from: a, reason: collision with root package name */
        public final String f7401a;

        /* renamed from: b, reason: collision with root package name */
        public final boolean f7402b;

        /* renamed from: c, reason: collision with root package name */
        public final String f7403c;

        /* renamed from: d, reason: collision with root package name */
        public final String f7404d;

        public C0022b(m mVar, Throwable th, boolean z8, int i) {
            super("Decoder init failed: [" + i + "], " + mVar, th);
            this.f7401a = mVar.f8822h;
            this.f7402b = z8;
            this.f7403c = null;
            this.f7404d = "com.google.android.exoplayer.MediaCodecTrackRenderer_" + (i < 0 ? "neg_" : "") + Math.abs(i);
        }

        private static String a(Throwable th) {
            if (th instanceof MediaCodec.CodecException) {
                return ((MediaCodec.CodecException) th).getDiagnosticInfo();
            }
            return null;
        }

        private static String a(int i) {
            return "com.google.android.exoplayer.MediaCodecTrackRenderer_" + (i < 0 ? "neg_" : "") + Math.abs(i);
        }

        public C0022b(m mVar, Throwable th, boolean z8, String str) {
            super("Decoder init failed: " + str + ", " + mVar, th);
            this.f7401a = mVar.f8822h;
            this.f7402b = z8;
            this.f7403c = str;
            String str2 = null;
            if (af.f8503a >= 21 && (th instanceof MediaCodec.CodecException)) {
                str2 = ((MediaCodec.CodecException) th).getDiagnosticInfo();
            }
            this.f7404d = str2;
        }
    }

    private ByteBuffer c(int i) {
        return af.f8503a >= 21 ? this.f7387P.getOutputBuffer(i) : this.ab[i];
    }

    public void a(MediaCodec mediaCodec, MediaFormat mediaFormat) {
    }

    public void a(com.anythink.basead.exoplayer.c.e eVar) {
    }

    private boolean b(boolean z8) {
        f<k> fVar = this.f7385N;
        if (fVar == null || (!z8 && this.f7379G)) {
            return false;
        }
        int e6 = fVar.e();
        if (e6 != 1) {
            return e6 != 4;
        }
        throw com.anythink.basead.exoplayer.g.a(this.f7385N.f(), s());
    }

    private static boolean d(String str) {
        return af.f8503a == 21 && "OMX.google.aac.decoder".equals(str);
    }

    public void a(String str, long j9, long j10) {
    }

    private static boolean c(String str) {
        int i = af.f8503a;
        if (i <= 23 && "OMX.google.vorbis.decoder".equals(str)) {
            return true;
        }
        if (i > 19 || !"hb2000".equals(af.f8504b)) {
            return false;
        }
        return "OMX.amlogic.avc.decoder.awesome".equals(str) || "OMX.amlogic.avc.decoder.awesome.secure".equals(str);
    }

    public boolean a(com.anythink.basead.exoplayer.f.a aVar) {
        return true;
    }

    @Override // com.anythink.basead.exoplayer.z
    public final int a(m mVar) {
        try {
            return a(this.f7377E, this.f7378F, mVar);
        } catch (d.b e6) {
            throw com.anythink.basead.exoplayer.g.a(e6, s());
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x0078, code lost:
    
        if (r5.f8827n == r0.f8827n) goto L36;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void b(m mVar) {
        int a9;
        m mVar2 = this.f7384M;
        this.f7384M = mVar;
        if (!af.a(mVar.f8824k, mVar2 == null ? null : mVar2.f8824k)) {
            if (this.f7384M.f8824k != null) {
                g<k> gVar = this.f7378F;
                if (gVar != null) {
                    f<k> a10 = gVar.a(Looper.myLooper(), this.f7384M.f8824k);
                    this.f7386O = a10;
                    if (a10 == this.f7385N) {
                        this.f7378F.a(a10);
                    }
                } else {
                    throw com.anythink.basead.exoplayer.g.a(new IllegalStateException("Media requires a DrmSessionManager"), s());
                }
            } else {
                this.f7386O = null;
            }
        }
        boolean z8 = true;
        if (this.f7386O != this.f7385N || this.f7387P == null || (a9 = a(this.f7388Q, mVar2, this.f7384M)) == 0) {
            if (this.ak) {
                this.aj = 1;
                return;
            } else {
                A();
                x();
                return;
            }
        }
        if (a9 != 1) {
            if (a9 == 3) {
                this.ah = true;
                this.ai = 1;
                int i = this.f7389R;
                if (i != 2) {
                    if (i == 1) {
                        m mVar3 = this.f7384M;
                        if (mVar3.f8826m == mVar2.f8826m) {
                        }
                    }
                    z8 = false;
                }
                this.Y = z8;
                return;
            }
            throw new IllegalStateException();
        }
    }

    public com.anythink.basead.exoplayer.f.a a(com.anythink.basead.exoplayer.f.c cVar, m mVar, boolean z8) {
        return cVar.a(mVar.f8822h, z8);
    }

    private void a(C0022b c0022b) {
        throw com.anythink.basead.exoplayer.g.a(c0022b, s());
    }

    @Override // com.anythink.basead.exoplayer.a
    public void a(boolean z8) {
        this.f7397q = new com.anythink.basead.exoplayer.c.d();
    }

    @Override // com.anythink.basead.exoplayer.a
    public void a(long j9, boolean z8) {
        this.am = false;
        this.an = false;
        if (this.f7387P != null) {
            B();
        }
    }

    @Override // com.anythink.basead.exoplayer.y
    public final void a(long j9, long j10) {
        if (this.an) {
            w();
            return;
        }
        if (this.f7384M == null) {
            this.f7381I.a();
            int a9 = a(this.J, this.f7381I, true);
            if (a9 != -5) {
                if (a9 == -4) {
                    C0544a.b(this.f7381I.c());
                    this.am = true;
                    L();
                    return;
                }
                return;
            }
            b(this.J.f8840a);
        }
        x();
        if (this.f7387P != null) {
            ad.a("drainAndFeed");
            while (b(j9, j10)) {
            }
            while (C()) {
            }
            ad.a();
            return;
        }
        com.anythink.basead.exoplayer.c.d dVar = this.f7397q;
        dVar.f6890d = b(j9) + dVar.f6890d;
        this.f7381I.a();
        int a10 = a(this.J, this.f7381I, false);
        if (a10 == -5) {
            b(this.J.f8840a);
        } else if (a10 == -4) {
            C0544a.b(this.f7381I.c());
            this.am = true;
            L();
        }
    }

    private boolean b(long j9, long j10) {
        boolean a9;
        int dequeueOutputBuffer;
        ByteBuffer byteBuffer;
        boolean z8;
        if (!F()) {
            if (this.f7394W && this.al) {
                try {
                    dequeueOutputBuffer = this.f7387P.dequeueOutputBuffer(this.f7383L, 0L);
                } catch (IllegalStateException unused) {
                    L();
                    if (this.an) {
                        A();
                    }
                    return false;
                }
            } else {
                dequeueOutputBuffer = this.f7387P.dequeueOutputBuffer(this.f7383L, 0L);
            }
            if (dequeueOutputBuffer < 0) {
                if (dequeueOutputBuffer == -2) {
                    MediaFormat outputFormat = this.f7387P.getOutputFormat();
                    if (this.f7389R != 0 && outputFormat.getInteger("width") == 32 && outputFormat.getInteger("height") == 32) {
                        this.f7396Z = true;
                    } else {
                        if (this.f7395X) {
                            outputFormat.setInteger("channel-count", 1);
                        }
                        a(this.f7387P, outputFormat);
                    }
                    return true;
                }
                if (dequeueOutputBuffer == -3) {
                    if (af.f8503a < 21) {
                        this.ab = this.f7387P.getOutputBuffers();
                    }
                    return true;
                }
                if (this.f7392U && (this.am || this.aj == 2)) {
                    L();
                }
                return false;
            }
            if (this.f7396Z) {
                this.f7396Z = false;
                this.f7387P.releaseOutputBuffer(dequeueOutputBuffer, false);
                return true;
            }
            MediaCodec.BufferInfo bufferInfo = this.f7383L;
            if (bufferInfo.size == 0 && (bufferInfo.flags & 4) != 0) {
                L();
                return false;
            }
            this.ae = dequeueOutputBuffer;
            if (af.f8503a >= 21) {
                byteBuffer = this.f7387P.getOutputBuffer(dequeueOutputBuffer);
            } else {
                byteBuffer = this.ab[dequeueOutputBuffer];
            }
            this.af = byteBuffer;
            if (byteBuffer != null) {
                byteBuffer.position(this.f7383L.offset);
                ByteBuffer byteBuffer2 = this.af;
                MediaCodec.BufferInfo bufferInfo2 = this.f7383L;
                byteBuffer2.limit(bufferInfo2.offset + bufferInfo2.size);
            }
            long j11 = this.f7383L.presentationTimeUs;
            int size = this.f7382K.size();
            int i = 0;
            while (true) {
                if (i >= size) {
                    z8 = false;
                    break;
                }
                if (this.f7382K.get(i).longValue() == j11) {
                    this.f7382K.remove(i);
                    z8 = true;
                    break;
                }
                i++;
            }
            this.ag = z8;
        }
        if (this.f7394W && this.al) {
            try {
                MediaCodec mediaCodec = this.f7387P;
                ByteBuffer byteBuffer3 = this.af;
                int i4 = this.ae;
                MediaCodec.BufferInfo bufferInfo3 = this.f7383L;
                a9 = a(j9, j10, mediaCodec, byteBuffer3, i4, bufferInfo3.flags, bufferInfo3.presentationTimeUs, this.ag);
            } catch (IllegalStateException unused2) {
                L();
                if (this.an) {
                    A();
                }
                return false;
            }
        } else {
            MediaCodec mediaCodec2 = this.f7387P;
            ByteBuffer byteBuffer4 = this.af;
            int i9 = this.ae;
            MediaCodec.BufferInfo bufferInfo4 = this.f7383L;
            a9 = a(j9, j10, mediaCodec2, byteBuffer4, i9, bufferInfo4.flags, bufferInfo4.presentationTimeUs, this.ag);
        }
        if (a9) {
            c(this.f7383L.presentationTimeUs);
            boolean z9 = (this.f7383L.flags & 4) != 0;
            H();
            if (!z9) {
                return true;
            }
            L();
        }
        return false;
    }

    private static MediaCodec.CryptoInfo a(com.anythink.basead.exoplayer.c.e eVar, int i) {
        MediaCodec.CryptoInfo a9 = eVar.f6898d.a();
        if (i == 0) {
            return a9;
        }
        if (a9.numBytesOfClearData == null) {
            a9.numBytesOfClearData = new int[1];
        }
        int[] iArr = a9.numBytesOfClearData;
        iArr[0] = iArr[0] + i;
        return a9;
    }

    private static boolean a(String str) {
        int i = af.f8503a;
        if (i < 18) {
            return true;
        }
        if (i == 18 && ("OMX.SEC.avc.dec".equals(str) || "OMX.SEC.avc.dec.secure".equals(str))) {
            return true;
        }
        if (i == 19 && af.f8506d.startsWith("SM-G800")) {
            return "OMX.Exynos.avc.dec".equals(str) || "OMX.Exynos.avc.dec.secure".equals(str);
        }
        return false;
    }

    private static boolean a(String str, m mVar) {
        return af.f8503a < 21 && mVar.f8823j.isEmpty() && "OMX.MTK.VIDEO.DECODER.AVC".equals(str);
    }

    private static int b(String str) {
        int i = af.f8503a;
        if (i <= 25 && "OMX.Exynos.avc.dec.secure".equals(str)) {
            String str2 = af.f8506d;
            if (str2.startsWith("SM-T585") || str2.startsWith("SM-A510") || str2.startsWith("SM-A520") || str2.startsWith("SM-J700")) {
                return 2;
            }
        }
        if (i >= 24) {
            return 0;
        }
        if (!"OMX.Nvidia.h264.decode".equals(str) && !"OMX.Nvidia.h264.decode.secure".equals(str)) {
            return 0;
        }
        String str3 = af.f8504b;
        return ("flounder".equals(str3) || "flounder_lte".equals(str3) || "grouper".equals(str3) || "tilapia".equals(str3)) ? 1 : 0;
    }

    private static boolean b(com.anythink.basead.exoplayer.f.a aVar) {
        String str = aVar.f7355c;
        if (af.f8503a > 17 || !("OMX.rk.video_decoder.avc".equals(str) || "OMX.allwinner.video.decoder.avc".equals(str))) {
            return "Amazon".equals(af.f8505c) && "AFTS".equals(af.f8506d) && aVar.f7360h;
        }
        return true;
    }

    private static boolean b(String str, m mVar) {
        return af.f8503a <= 18 && mVar.f8834u == 1 && "OMX.MTK.AUDIO.DECODER.MP3".equals(str);
    }
}
