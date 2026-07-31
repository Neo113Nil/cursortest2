package com.google.android.gms.internal.ads;

import android.media.AudioTrack;
import android.os.ConditionVariable;
import android.os.SystemClock;
import android.util.Log;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.LinkedList;

/* loaded from: classes.dex */
public final class gg {
    private Method A;
    private int B;
    private long C;
    private long D;
    private int E;
    private long F;
    private long G;
    private int H;
    private int I;
    private long J;
    private long K;
    private long L;
    private float M;
    private mf[] N;
    private ByteBuffer[] O;
    private ByteBuffer P;
    private ByteBuffer Q;
    private byte[] R;
    private int S;
    private int T;
    private boolean U;
    private boolean V;
    private int W;
    private boolean X;
    private long Y;

    /* renamed from: a, reason: collision with root package name */
    private final hg f5598a;

    /* renamed from: b, reason: collision with root package name */
    private final ng f5599b;

    /* renamed from: c, reason: collision with root package name */
    private final mf[] f5600c;

    /* renamed from: d, reason: collision with root package name */
    private final cg f5601d;

    /* renamed from: e, reason: collision with root package name */
    private final ConditionVariable f5602e = new ConditionVariable(true);

    /* renamed from: f, reason: collision with root package name */
    private final long[] f5603f;

    /* renamed from: g, reason: collision with root package name */
    private final yf f5604g;

    /* renamed from: h, reason: collision with root package name */
    private final LinkedList<eg> f5605h;

    /* renamed from: i, reason: collision with root package name */
    private AudioTrack f5606i;

    /* renamed from: j, reason: collision with root package name */
    private int f5607j;

    /* renamed from: k, reason: collision with root package name */
    private int f5608k;

    /* renamed from: l, reason: collision with root package name */
    private int f5609l;

    /* renamed from: m, reason: collision with root package name */
    private int f5610m;

    /* renamed from: n, reason: collision with root package name */
    private boolean f5611n;

    /* renamed from: o, reason: collision with root package name */
    private int f5612o;

    /* renamed from: p, reason: collision with root package name */
    private long f5613p;

    /* renamed from: q, reason: collision with root package name */
    private bf f5614q;

    /* renamed from: r, reason: collision with root package name */
    private bf f5615r;

    /* renamed from: s, reason: collision with root package name */
    private long f5616s;

    /* renamed from: t, reason: collision with root package name */
    private long f5617t;

    /* renamed from: u, reason: collision with root package name */
    private int f5618u;

    /* renamed from: v, reason: collision with root package name */
    private int f5619v;

    /* renamed from: w, reason: collision with root package name */
    private long f5620w;

    /* renamed from: x, reason: collision with root package name */
    private long f5621x;

    /* renamed from: y, reason: collision with root package name */
    private boolean f5622y;

    /* renamed from: z, reason: collision with root package name */
    private long f5623z;

    public gg(kf kfVar, mf[] mfVarArr, cg cgVar) {
        this.f5601d = cgVar;
        if (zm.f15186a >= 18) {
            try {
                this.A = AudioTrack.class.getMethod("getLatency", null);
            } catch (NoSuchMethodException unused) {
            }
        }
        this.f5604g = zm.f15186a >= 19 ? new zf() : new yf(null);
        hg hgVar = new hg();
        this.f5598a = hgVar;
        ng ngVar = new ng();
        this.f5599b = ngVar;
        mf[] mfVarArr2 = {new lg(), hgVar, ngVar};
        this.f5600c = mfVarArr2;
        System.arraycopy(mfVarArr, 0, mfVarArr2, 2, 0);
        this.f5603f = new long[10];
        this.M = 1.0f;
        this.I = 0;
        this.W = 0;
        this.f5615r = bf.f3385d;
        this.T = -1;
        this.N = new mf[0];
        this.O = new ByteBuffer[0];
        this.f5605h = new LinkedList<>();
    }

    private final long p(long j7) {
        return (j7 * this.f5607j) / 1000000;
    }

    private final long q(long j7) {
        return (j7 * 1000000) / this.f5607j;
    }

    private final long r() {
        return this.f5611n ? this.G : this.F / this.E;
    }

    private final void s(long j7) {
        ByteBuffer byteBuffer;
        int length = this.N.length;
        int i7 = length;
        while (i7 >= 0) {
            if (i7 > 0) {
                byteBuffer = this.O[i7 - 1];
            } else {
                byteBuffer = this.P;
                if (byteBuffer == null) {
                    byteBuffer = mf.f8510a;
                }
            }
            if (i7 == length) {
                z(byteBuffer, j7);
            } else {
                mf mfVar = this.N[i7];
                mfVar.d(byteBuffer);
                ByteBuffer c7 = mfVar.c();
                this.O[i7] = c7;
                if (c7.hasRemaining()) {
                    i7++;
                }
            }
            if (byteBuffer.hasRemaining()) {
                return;
            } else {
                i7--;
            }
        }
    }

    private final void t() {
        ArrayList arrayList = new ArrayList();
        mf[] mfVarArr = this.f5600c;
        for (int i7 = 0; i7 < 3; i7++) {
            mf mfVar = mfVarArr[i7];
            if (mfVar.h()) {
                arrayList.add(mfVar);
            } else {
                mfVar.g();
            }
        }
        int size = arrayList.size();
        this.N = (mf[]) arrayList.toArray(new mf[size]);
        this.O = new ByteBuffer[size];
        for (int i8 = 0; i8 < size; i8++) {
            mf mfVar2 = this.N[i8];
            mfVar2.g();
            this.O[i8] = mfVar2.c();
        }
    }

    private final void u() {
        this.f5620w = 0L;
        this.f5619v = 0;
        this.f5618u = 0;
        this.f5621x = 0L;
        this.f5622y = false;
        this.f5623z = 0L;
    }

    private final void v() {
        if (x()) {
            if (zm.f15186a >= 21) {
                this.f5606i.setVolume(this.M);
                return;
            }
            AudioTrack audioTrack = this.f5606i;
            float f7 = this.M;
            audioTrack.setStereoVolume(f7, f7);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0021  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x0032 -> B:6:0x0010). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final boolean w() {
        boolean z6;
        int i7;
        mf[] mfVarArr;
        if (this.T == -1) {
            int i8 = this.f5611n ? this.N.length : 0;
            this.T = i8;
            z6 = true;
            i7 = this.T;
            mfVarArr = this.N;
            if (i7 < mfVarArr.length) {
                mf mfVar = mfVarArr[i7];
                if (z6) {
                    mfVar.b();
                }
                s(-9223372036854775807L);
                if (!mfVar.i()) {
                    return false;
                }
                i8 = this.T + 1;
                this.T = i8;
                z6 = true;
                i7 = this.T;
                mfVarArr = this.N;
                if (i7 < mfVarArr.length) {
                    ByteBuffer byteBuffer = this.Q;
                    if (byteBuffer != null) {
                        z(byteBuffer, -9223372036854775807L);
                        if (this.Q != null) {
                            return false;
                        }
                    }
                    this.T = -1;
                    return true;
                }
            }
        } else {
            z6 = false;
            i7 = this.T;
            mfVarArr = this.N;
            if (i7 < mfVarArr.length) {
            }
        }
    }

    private final boolean x() {
        return this.f5606i != null;
    }

    private final boolean y() {
        int i7;
        return zm.f15186a < 23 && ((i7 = this.f5610m) == 5 || i7 == 6);
    }

    private final boolean z(ByteBuffer byteBuffer, long j7) {
        int write;
        if (!byteBuffer.hasRemaining()) {
            return true;
        }
        ByteBuffer byteBuffer2 = this.Q;
        if (byteBuffer2 != null) {
            jm.c(byteBuffer2 == byteBuffer);
        } else {
            this.Q = byteBuffer;
            if (zm.f15186a < 21) {
                int remaining = byteBuffer.remaining();
                byte[] bArr = this.R;
                if (bArr == null || bArr.length < remaining) {
                    this.R = new byte[remaining];
                }
                int position = byteBuffer.position();
                byteBuffer.get(this.R, 0, remaining);
                byteBuffer.position(position);
                this.S = 0;
            }
        }
        int remaining2 = byteBuffer.remaining();
        if (zm.f15186a < 21) {
            int a7 = this.f5612o - ((int) (this.F - (this.f5604g.a() * this.E)));
            if (a7 > 0) {
                write = this.f5606i.write(this.R, this.S, Math.min(remaining2, a7));
                if (write > 0) {
                    this.S += write;
                    byteBuffer.position(byteBuffer.position() + write);
                }
            } else {
                write = 0;
            }
        } else {
            write = this.f5606i.write(byteBuffer, remaining2, 1);
        }
        this.Y = SystemClock.elapsedRealtime();
        if (write < 0) {
            throw new fg(write);
        }
        boolean z6 = this.f5611n;
        if (!z6) {
            this.F += write;
        }
        if (write != remaining2) {
            return false;
        }
        if (z6) {
            this.G += this.H;
        }
        this.Q = null;
        return true;
    }

    public final long a(boolean z6) {
        long b7;
        long j7;
        long j8;
        long j9;
        long j10;
        bf bfVar;
        long j11;
        long j12;
        StringBuilder sb;
        String str;
        if (!x() || this.I == 0) {
            return Long.MIN_VALUE;
        }
        if (this.f5606i.getPlayState() == 3) {
            long b8 = this.f5604g.b();
            if (b8 != 0) {
                long nanoTime = System.nanoTime() / 1000;
                if (nanoTime - this.f5621x >= 30000) {
                    long[] jArr = this.f5603f;
                    int i7 = this.f5618u;
                    jArr[i7] = b8 - nanoTime;
                    this.f5618u = (i7 + 1) % 10;
                    int i8 = this.f5619v;
                    if (i8 < 10) {
                        this.f5619v = i8 + 1;
                    }
                    this.f5621x = nanoTime;
                    this.f5620w = 0L;
                    int i9 = 0;
                    while (true) {
                        int i10 = this.f5619v;
                        if (i9 >= i10) {
                            break;
                        }
                        this.f5620w += this.f5603f[i9] / i10;
                        i9++;
                    }
                }
                if (!y() && nanoTime - this.f5623z >= 500000) {
                    boolean h7 = this.f5604g.h();
                    this.f5622y = h7;
                    if (h7) {
                        long d7 = this.f5604g.d() / 1000;
                        long c7 = this.f5604g.c();
                        if (d7 >= this.K) {
                            if (Math.abs(d7 - nanoTime) > 5000000) {
                                sb = new StringBuilder(136);
                                str = "Spurious audio timestamp (system clock mismatch): ";
                            } else if (Math.abs(q(c7) - b8) > 5000000) {
                                sb = new StringBuilder(138);
                                str = "Spurious audio timestamp (frame position mismatch): ";
                            }
                            sb.append(str);
                            sb.append(c7);
                            sb.append(", ");
                            sb.append(d7);
                            sb.append(", ");
                            sb.append(nanoTime);
                            sb.append(", ");
                            sb.append(b8);
                            Log.w("AudioTrack", sb.toString());
                        }
                        this.f5622y = false;
                    }
                    if (this.A != null && !this.f5611n) {
                        try {
                            long intValue = (((Integer) r1.invoke(this.f5606i, null)).intValue() * 1000) - this.f5613p;
                            this.L = intValue;
                            long max = Math.max(intValue, 0L);
                            this.L = max;
                            if (max > 5000000) {
                                StringBuilder sb2 = new StringBuilder(61);
                                sb2.append("Ignoring impossibly large audio latency: ");
                                sb2.append(max);
                                Log.w("AudioTrack", sb2.toString());
                                this.L = 0L;
                            }
                        } catch (Exception unused) {
                            this.A = null;
                        }
                    }
                    this.f5623z = nanoTime;
                }
            }
        }
        long nanoTime2 = System.nanoTime() / 1000;
        if (this.f5622y) {
            b7 = q(this.f5604g.c() + p(nanoTime2 - (this.f5604g.d() / 1000)));
        } else {
            b7 = this.f5619v == 0 ? this.f5604g.b() : nanoTime2 + this.f5620w;
            if (!z6) {
                b7 -= this.L;
            }
        }
        long j13 = this.J;
        while (!this.f5605h.isEmpty()) {
            j10 = this.f5605h.getFirst().f4601c;
            if (b7 < j10) {
                break;
            }
            eg remove = this.f5605h.remove();
            bfVar = remove.f4599a;
            this.f5615r = bfVar;
            j11 = remove.f4601c;
            this.f5617t = j11;
            j12 = remove.f4600b;
            this.f5616s = j12 - this.J;
        }
        if (this.f5615r.f3386a == 1.0f) {
            j9 = (b7 + this.f5616s) - this.f5617t;
        } else {
            if (!this.f5605h.isEmpty() || this.f5599b.m() < 1024) {
                j7 = this.f5616s;
                double d8 = this.f5615r.f3386a;
                double d9 = b7 - this.f5617t;
                Double.isNaN(d8);
                Double.isNaN(d9);
                j8 = (long) (d8 * d9);
            } else {
                j7 = this.f5616s;
                j8 = zm.j(b7 - this.f5617t, this.f5599b.l(), this.f5599b.m());
            }
            j9 = j8 + j7;
        }
        return j13 + j9;
    }

    public final bf c() {
        return this.f5615r;
    }

    public final bf d(bf bfVar) {
        if (this.f5611n) {
            bf bfVar2 = bf.f3385d;
            this.f5615r = bfVar2;
            return bfVar2;
        }
        float k7 = this.f5599b.k(bfVar.f3386a);
        this.f5599b.j(1.0f);
        bf bfVar3 = new bf(k7, 1.0f);
        bf bfVar4 = this.f5614q;
        if (bfVar4 == null) {
            bfVar4 = !this.f5605h.isEmpty() ? this.f5605h.getLast().f4599a : this.f5615r;
        }
        if (!bfVar3.equals(bfVar4)) {
            if (x()) {
                this.f5614q = bfVar3;
            } else {
                this.f5615r = bfVar3;
            }
        }
        return this.f5615r;
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00f7  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00f9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void e(String str, int i7, int i8, int i9, int i10, int[] iArr) {
        int i11;
        int i12;
        int p7;
        this.B = zm.i(i9, i7);
        this.f5598a.j(iArr);
        mf[] mfVarArr = this.f5600c;
        boolean z6 = false;
        for (int i13 = 0; i13 < 3; i13++) {
            mf mfVar = mfVarArr[i13];
            try {
                z6 |= mfVar.f(i8, i7, i9);
                if (mfVar.h()) {
                    i7 = mfVar.zza();
                    mfVar.a();
                    i9 = 2;
                }
            } catch (lf e7) {
                throw new ag(e7);
            }
        }
        if (z6) {
            t();
        }
        int i14 = 252;
        switch (i7) {
            case 1:
                i11 = 4;
                break;
            case 2:
                i11 = 12;
                break;
            case 3:
                i11 = 28;
                break;
            case 4:
                i11 = 204;
                break;
            case 5:
                i11 = 220;
                break;
            case 6:
                i11 = 252;
                break;
            case c4.w0.f2149o /* 7 */:
                i11 = 1276;
                break;
            case c4.w0.f2150p /* 8 */:
                i11 = he.f6194a;
                break;
            default:
                StringBuilder sb = new StringBuilder(38);
                sb.append("Unsupported channel count: ");
                sb.append(i7);
                throw new ag(sb.toString());
        }
        int i15 = zm.f15186a;
        if (i15 <= 23 && "foster".equals(zm.f15187b) && "NVIDIA".equals(zm.f15188c)) {
            if (i7 != 3 && i7 != 5) {
                if (i7 == 7) {
                    i14 = he.f6194a;
                }
            }
            if (i15 <= 25) {
                "fugu".equals(zm.f15187b);
            }
            if (z6 && x() && this.f5609l == i9 && this.f5607j == i8 && this.f5608k == i14) {
                return;
            }
            k();
            this.f5609l = i9;
            this.f5611n = false;
            this.f5607j = i8;
            this.f5608k = i14;
            this.f5610m = 2;
            this.E = zm.i(2, i7);
            int minBufferSize = AudioTrack.getMinBufferSize(i8, i14, this.f5610m);
            jm.e(minBufferSize != -2);
            i12 = minBufferSize * 4;
            p7 = ((int) p(250000L)) * this.E;
            int max = (int) Math.max(minBufferSize, p(750000L) * this.E);
            if (i12 >= p7) {
                i12 = p7;
            } else if (i12 > max) {
                i12 = max;
            }
            this.f5612o = i12;
            this.f5613p = q(i12 / this.E);
            d(this.f5615r);
        }
        i14 = i11;
        if (i15 <= 25) {
        }
        if (z6) {
        }
        k();
        this.f5609l = i9;
        this.f5611n = false;
        this.f5607j = i8;
        this.f5608k = i14;
        this.f5610m = 2;
        this.E = zm.i(2, i7);
        int minBufferSize2 = AudioTrack.getMinBufferSize(i8, i14, this.f5610m);
        jm.e(minBufferSize2 != -2);
        i12 = minBufferSize2 * 4;
        p7 = ((int) p(250000L)) * this.E;
        int max2 = (int) Math.max(minBufferSize2, p(750000L) * this.E);
        if (i12 >= p7) {
        }
        this.f5612o = i12;
        this.f5613p = q(i12 / this.E);
        d(this.f5615r);
    }

    public final void f() {
        if (this.I == 1) {
            this.I = 2;
        }
    }

    public final void g() {
        this.V = false;
        if (x()) {
            u();
            this.f5604g.f();
        }
    }

    public final void h() {
        this.V = true;
        if (x()) {
            this.K = System.nanoTime() / 1000;
            this.f5606i.play();
        }
    }

    public final void i() {
        if (!this.U && x() && w()) {
            this.f5604g.e(r());
            this.U = true;
        }
    }

    public final void j() {
        k();
        mf[] mfVarArr = this.f5600c;
        for (int i7 = 0; i7 < 3; i7++) {
            mfVarArr[i7].e();
        }
        this.W = 0;
        this.V = false;
    }

    public final void k() {
        bf bfVar;
        if (x()) {
            this.C = 0L;
            this.D = 0L;
            this.F = 0L;
            this.G = 0L;
            this.H = 0;
            bf bfVar2 = this.f5614q;
            if (bfVar2 != null) {
                this.f5615r = bfVar2;
                this.f5614q = null;
            } else if (!this.f5605h.isEmpty()) {
                bfVar = this.f5605h.getLast().f4599a;
                this.f5615r = bfVar;
            }
            this.f5605h.clear();
            this.f5616s = 0L;
            this.f5617t = 0L;
            this.P = null;
            this.Q = null;
            int i7 = 0;
            while (true) {
                mf[] mfVarArr = this.N;
                if (i7 >= mfVarArr.length) {
                    break;
                }
                mf mfVar = mfVarArr[i7];
                mfVar.g();
                this.O[i7] = mfVar.c();
                i7++;
            }
            this.U = false;
            this.T = -1;
            this.I = 0;
            this.L = 0L;
            u();
            if (this.f5606i.getPlayState() == 3) {
                this.f5606i.pause();
            }
            AudioTrack audioTrack = this.f5606i;
            this.f5606i = null;
            this.f5604g.g(null, false);
            this.f5602e.close();
            new wf(this, audioTrack).start();
        }
    }

    public final void l(float f7) {
        if (this.M != f7) {
            this.M = f7;
            v();
        }
    }

    public final boolean m(ByteBuffer byteBuffer, long j7) {
        int i7;
        uf ufVar;
        uf ufVar2;
        ByteBuffer byteBuffer2 = this.P;
        jm.c(byteBuffer2 == null || byteBuffer == byteBuffer2);
        if (!x()) {
            this.f5602e.block();
            int i8 = this.W;
            int i9 = this.f5607j;
            int i10 = this.f5608k;
            int i11 = this.f5610m;
            int i12 = this.f5612o;
            this.f5606i = i8 == 0 ? new AudioTrack(3, i9, i10, i11, i12, 1) : new AudioTrack(3, i9, i10, i11, i12, 1, i8);
            int state = this.f5606i.getState();
            if (state != 1) {
                try {
                    this.f5606i.release();
                } catch (Exception unused) {
                } catch (Throwable th) {
                    this.f5606i = null;
                    throw th;
                }
                this.f5606i = null;
                throw new bg(state, this.f5607j, this.f5608k, this.f5612o);
            }
            int audioSessionId = this.f5606i.getAudioSessionId();
            if (this.W != audioSessionId) {
                this.W = audioSessionId;
                ufVar2 = ((jg) this.f5601d).f7117a.Q;
                ufVar2.b(audioSessionId);
            }
            this.f5604g.g(this.f5606i, y());
            v();
            this.X = false;
            if (this.V) {
                h();
            }
        }
        if (y()) {
            if (this.f5606i.getPlayState() == 2) {
                this.X = false;
                return false;
            }
            if (this.f5606i.getPlayState() == 1 && this.f5604g.a() != 0) {
                return false;
            }
        }
        boolean z6 = this.X;
        boolean n7 = n();
        this.X = n7;
        if (z6 && !n7 && this.f5606i.getPlayState() != 1) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            long j8 = this.Y;
            cg cgVar = this.f5601d;
            int i13 = this.f5612o;
            long b7 = he.b(this.f5613p);
            ufVar = ((jg) cgVar).f7117a.Q;
            ufVar.c(i13, b7, elapsedRealtime - j8);
        }
        if (this.P == null) {
            if (!byteBuffer.hasRemaining()) {
                return true;
            }
            if (this.f5611n && this.H == 0) {
                int i14 = this.f5610m;
                if (i14 == 7 || i14 == 8) {
                    int position = byteBuffer.position();
                    i7 = ((((byteBuffer.get(position + 5) & 252) >> 2) | ((byteBuffer.get(position + 4) & 1) << 6)) + 1) * 32;
                } else if (i14 == 5) {
                    int i15 = jf.f7110d;
                    i7 = 1536;
                } else {
                    if (i14 != 6) {
                        StringBuilder sb = new StringBuilder(38);
                        sb.append("Unexpected audio encoding: ");
                        sb.append(i14);
                        throw new IllegalStateException(sb.toString());
                    }
                    i7 = jf.a(byteBuffer);
                }
                this.H = i7;
            }
            if (this.f5614q != null) {
                if (!w()) {
                    return false;
                }
                this.f5605h.add(new eg(this.f5614q, Math.max(0L, j7), q(r()), null));
                this.f5614q = null;
                t();
            }
            if (this.I == 0) {
                this.J = Math.max(0L, j7);
                this.I = 1;
            } else {
                long q7 = this.J + q(this.f5611n ? this.D : this.C / this.B);
                if (this.I == 1 && Math.abs(q7 - j7) > 200000) {
                    StringBuilder sb2 = new StringBuilder(80);
                    sb2.append("Discontinuity detected [expected ");
                    sb2.append(q7);
                    sb2.append(", got ");
                    sb2.append(j7);
                    sb2.append("]");
                    Log.e("AudioTrack", sb2.toString());
                    this.I = 2;
                }
                if (this.I == 2) {
                    this.J += j7 - q7;
                    this.I = 1;
                    ((jg) this.f5601d).f7117a.W = true;
                }
            }
            if (this.f5611n) {
                this.D += this.H;
            } else {
                this.C += byteBuffer.remaining();
            }
            this.P = byteBuffer;
        }
        if (this.f5611n) {
            z(this.P, j7);
        } else {
            s(j7);
        }
        if (this.P.hasRemaining()) {
            return false;
        }
        this.P = null;
        return true;
    }

    public final boolean n() {
        if (x()) {
            if (r() > this.f5604g.a()) {
                return true;
            }
            if (y() && this.f5606i.getPlayState() == 2 && this.f5606i.getPlaybackHeadPosition() == 0) {
                return true;
            }
        }
        return false;
    }

    public final boolean o() {
        return !x() || (this.U && !n());
    }
}
