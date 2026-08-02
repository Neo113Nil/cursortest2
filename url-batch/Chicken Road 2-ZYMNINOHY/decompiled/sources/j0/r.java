package j0;

import T.AbstractC0088f;
import T.C0096n;
import T.C0097o;
import W.AbstractC0108a;
import W.J;
import a.AbstractC0124a;
import a0.AbstractC0135a;
import a0.C0132H;
import a0.C0136b;
import a0.C0137c;
import a0.C0138d;
import a0.C0146l;
import android.content.Context;
import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaCryptoException;
import android.media.MediaFormat;
import android.media.metrics.LogSessionId;
import android.os.Build;
import android.os.Bundle;
import android.os.SystemClock;
import android.os.Trace;
import c0.L;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.KotlinVersion;
import q0.C1353B;
import q0.b0;
import v2.M;
import v2.h0;
import v2.p0;
import y0.AbstractC1569a;

/* loaded from: classes.dex */
public abstract class r extends AbstractC0135a {

    /* renamed from: N0, reason: collision with root package name */
    public static final byte[] f13788N0 = {0, 0, 1, 103, 66, -64, 11, -38, 37, -112, 0, 0, 1, 104, -50, 15, 19, 32, 0, 0, 1, 101, -120, -124, 13, -50, 113, 24, -96, 0, 47, -65, 28, 49, -61, 39, 93, 120};

    /* renamed from: A, reason: collision with root package name */
    public final MediaCodec.BufferInfo f13789A;

    /* renamed from: A0, reason: collision with root package name */
    public boolean f13790A0;

    /* renamed from: B, reason: collision with root package name */
    public final ArrayDeque f13791B;

    /* renamed from: B0, reason: collision with root package name */
    public boolean f13792B0;

    /* renamed from: C, reason: collision with root package name */
    public final L f13793C;

    /* renamed from: C0, reason: collision with root package name */
    public C0146l f13794C0;

    /* renamed from: D, reason: collision with root package name */
    public final AtomicInteger f13795D;

    /* renamed from: D0, reason: collision with root package name */
    public C0137c f13796D0;

    /* renamed from: E, reason: collision with root package name */
    public C0097o f13797E;

    /* renamed from: E0, reason: collision with root package name */
    public q f13798E0;

    /* renamed from: F, reason: collision with root package name */
    public C0097o f13799F;

    /* renamed from: F0, reason: collision with root package name */
    public long f13800F0;

    /* renamed from: G, reason: collision with root package name */
    public e0.t f13801G;

    /* renamed from: G0, reason: collision with root package name */
    public boolean f13802G0;

    /* renamed from: H, reason: collision with root package name */
    public e0.t f13803H;

    /* renamed from: H0, reason: collision with root package name */
    public boolean f13804H0;

    /* renamed from: I, reason: collision with root package name */
    public C0132H f13805I;

    /* renamed from: I0, reason: collision with root package name */
    public boolean f13806I0;

    /* renamed from: J, reason: collision with root package name */
    public MediaCrypto f13807J;

    /* renamed from: J0, reason: collision with root package name */
    public long f13808J0;

    /* renamed from: K, reason: collision with root package name */
    public final long f13809K;

    /* renamed from: K0, reason: collision with root package name */
    public C0136b f13810K0;
    public float L;

    /* renamed from: L0, reason: collision with root package name */
    public C0136b f13811L0;

    /* renamed from: M, reason: collision with root package name */
    public float f13812M;

    /* renamed from: M0, reason: collision with root package name */
    public M f13813M0;

    /* renamed from: N, reason: collision with root package name */
    public l f13814N;

    /* renamed from: O, reason: collision with root package name */
    public C0097o f13815O;

    /* renamed from: P, reason: collision with root package name */
    public MediaFormat f13816P;

    /* renamed from: Q, reason: collision with root package name */
    public boolean f13817Q;

    /* renamed from: R, reason: collision with root package name */
    public float f13818R;

    /* renamed from: S, reason: collision with root package name */
    public ArrayDeque f13819S;

    /* renamed from: T, reason: collision with root package name */
    public p f13820T;

    /* renamed from: U, reason: collision with root package name */
    public o f13821U;

    /* renamed from: V, reason: collision with root package name */
    public int f13822V;

    /* renamed from: W, reason: collision with root package name */
    public boolean f13823W;

    /* renamed from: X, reason: collision with root package name */
    public boolean f13824X;

    /* renamed from: Y, reason: collision with root package name */
    public boolean f13825Y;

    /* renamed from: Z, reason: collision with root package name */
    public boolean f13826Z;

    /* renamed from: a0, reason: collision with root package name */
    public long f13827a0;

    /* renamed from: b0, reason: collision with root package name */
    public long f13828b0;

    /* renamed from: c0, reason: collision with root package name */
    public int f13829c0;

    /* renamed from: d0, reason: collision with root package name */
    public int f13830d0;

    /* renamed from: e0, reason: collision with root package name */
    public ByteBuffer f13831e0;

    /* renamed from: f0, reason: collision with root package name */
    public boolean f13832f0;

    /* renamed from: g0, reason: collision with root package name */
    public boolean f13833g0;

    /* renamed from: h0, reason: collision with root package name */
    public boolean f13834h0;

    /* renamed from: i0, reason: collision with root package name */
    public boolean f13835i0;

    /* renamed from: j0, reason: collision with root package name */
    public boolean f13836j0;

    /* renamed from: k0, reason: collision with root package name */
    public int f13837k0;

    /* renamed from: l0, reason: collision with root package name */
    public int f13838l0;

    /* renamed from: m0, reason: collision with root package name */
    public int f13839m0;

    /* renamed from: n0, reason: collision with root package name */
    public boolean f13840n0;

    /* renamed from: o0, reason: collision with root package name */
    public boolean f13841o0;

    /* renamed from: p0, reason: collision with root package name */
    public boolean f13842p0;

    /* renamed from: q0, reason: collision with root package name */
    public long f13843q0;

    /* renamed from: r0, reason: collision with root package name */
    public boolean f13844r0;

    /* renamed from: s, reason: collision with root package name */
    public final Context f13845s;

    /* renamed from: s0, reason: collision with root package name */
    public boolean f13846s0;

    /* renamed from: t, reason: collision with root package name */
    public final k f13847t;

    /* renamed from: u, reason: collision with root package name */
    public final j f13848u;
    public final float v;

    /* renamed from: w, reason: collision with root package name */
    public final Z.f f13849w;

    /* renamed from: x, reason: collision with root package name */
    public final Z.f f13850x;

    /* renamed from: y, reason: collision with root package name */
    public final Z.f f13851y;
    public final h z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(Context context, int i4, k kVar, float f4) {
        super(i4);
        j jVar = j.f13764b;
        this.f13845s = context.getApplicationContext();
        this.f13847t = kVar;
        this.f13848u = jVar;
        this.v = f4;
        this.f13795D = new AtomicInteger();
        this.f13849w = new Z.f(0);
        this.f13850x = new Z.f(0);
        this.f13851y = new Z.f(2);
        h hVar = new h(2);
        hVar.f13761l = 32;
        this.z = hVar;
        this.f13789A = new MediaCodec.BufferInfo();
        this.L = 1.0f;
        this.f13812M = 1.0f;
        this.f13809K = -9223372036854775807L;
        this.f13791B = new ArrayDeque();
        this.f13798E0 = q.f13782f;
        hVar.j(0);
        hVar.f3781e.order(ByteOrder.nativeOrder());
        L l4 = new L();
        l4.f5518a = U.n.f3061a;
        l4.f5520c = 0;
        l4.f5519b = 2;
        this.f13793C = l4;
        this.f13818R = -1.0f;
        this.f13822V = 0;
        this.f13837k0 = 0;
        this.f13829c0 = -1;
        this.f13830d0 = -1;
        this.f13828b0 = -9223372036854775807L;
        this.f13843q0 = -9223372036854775807L;
        this.f13800F0 = -9223372036854775807L;
        this.f13827a0 = -9223372036854775807L;
        this.f13838l0 = 0;
        this.f13839m0 = 0;
        this.f13796D0 = new C0137c();
        this.f13806I0 = false;
        this.f13808J0 = 0L;
        int i5 = M.f15576c;
        this.f13813M0 = h0.f15638j;
        C0136b c0136b = C0136b.f4058b;
        this.f13810K0 = c0136b;
        this.f13811L0 = c0136b;
    }

    public final boolean A0(C0097o c0097o) {
        if (this.f13814N != null && this.f13839m0 != 3 && this.f4044h != 0) {
            float f4 = this.f13812M;
            c0097o.getClass();
            C0097o[] c0097oArr = this.f4046j;
            c0097oArr.getClass();
            float P4 = P(f4, c0097o, c0097oArr);
            float f5 = this.f13818R;
            if (f5 != P4) {
                if (P4 == -1.0f) {
                    if (this.f13840n0) {
                        this.f13838l0 = 1;
                        this.f13839m0 = 3;
                        return false;
                    }
                    n0();
                    X();
                    return false;
                }
                if (f5 != -1.0f || P4 > this.v) {
                    Bundle bundle = new Bundle();
                    bundle.putFloat("operating-rate", P4);
                    l lVar = this.f13814N;
                    lVar.getClass();
                    lVar.b(bundle);
                    this.f13818R = P4;
                }
            }
        }
        return true;
    }

    public final void B0() {
        e0.t tVar = this.f13803H;
        tVar.getClass();
        Z.a y4 = tVar.y();
        if (y4 instanceof f0.j) {
            try {
                MediaCrypto mediaCrypto = this.f13807J;
                mediaCrypto.getClass();
                ((f0.j) y4).getClass();
                mediaCrypto.setMediaDrmSession(null);
            } catch (MediaCryptoException e4) {
                throw g(e4, this.f13797E, false, 6006);
            }
        }
        s0(this.f13803H);
        this.f13838l0 = 0;
        this.f13839m0 = 0;
    }

    @Override // a0.AbstractC0135a
    public void C(float f4, float f5) {
        this.L = f4;
        this.f13812M = f5;
        A0(this.f13815O);
    }

    public final void C0(long j4) {
        C0097o c0097o = (C0097o) this.f13798E0.f13786d.d(j4);
        if (c0097o == null && this.f13802G0 && this.f13816P != null) {
            c0097o = (C0097o) this.f13798E0.f13786d.c();
        }
        if (c0097o != null) {
            this.f13799F = c0097o;
        } else if (!this.f13817Q || this.f13799F == null) {
            return;
        }
        C0097o c0097o2 = this.f13799F;
        c0097o2.getClass();
        f0(c0097o2, this.f13816P);
        this.f13817Q = false;
        this.f13802G0 = false;
    }

    @Override // a0.AbstractC0135a
    public final int D(C0097o c0097o) {
        try {
            return z0(this.f13848u, c0097o);
        } catch (u e4) {
            throw g(e4, c0097o, false, 4002);
        }
    }

    @Override // a0.AbstractC0135a
    public final int E() {
        return 8;
    }

    public final void G(MediaFormat mediaFormat) {
        if (Build.VERSION.SDK_INT >= 29) {
            for (Map.Entry entry : this.f13810K0.f4059a.entrySet()) {
                String str = (String) entry.getKey();
                Object value = entry.getValue();
                if (value == null) {
                    mediaFormat.setString(str, null);
                } else if (value instanceof Integer) {
                    mediaFormat.setInteger(str, ((Integer) value).intValue());
                } else if (value instanceof Long) {
                    mediaFormat.setLong(str, ((Long) value).longValue());
                } else if (value instanceof Float) {
                    mediaFormat.setFloat(str, ((Float) value).floatValue());
                } else if (value instanceof String) {
                    mediaFormat.setString(str, (String) value);
                } else if (value instanceof ByteBuffer) {
                    mediaFormat.setByteBuffer(str, (ByteBuffer) value);
                }
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:108:0x0316, code lost:
    
        r24.f13834h0 = true;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v1 */
    /* JADX WARN: Type inference failed for: r2v2, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r2v5 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean H(long j4, long j5) {
        h hVar;
        int i4;
        int i5;
        int i6;
        AbstractC0124a.t(!this.f13846s0);
        h hVar2 = this.z;
        if (hVar2.m()) {
            ByteBuffer byteBuffer = hVar2.f3781e;
            int i7 = this.f13830d0;
            int i8 = hVar2.f13760k;
            long j6 = hVar2.f3783g;
            boolean W4 = W(this.f4048l, hVar2.f13759j);
            boolean g4 = hVar2.g(4);
            C0097o c0097o = this.f13799F;
            c0097o.getClass();
            hVar = hVar2;
            if (l0(j4, j5, null, byteBuffer, i7, 0, i8, j6, W4, g4, c0097o)) {
                h0(hVar.f13759j);
                hVar.h();
            }
        }
        hVar = hVar2;
        if (this.f13844r0) {
            this.f13846s0 = true;
            return false;
        }
        ?? r22 = 0;
        boolean z = this.f13834h0;
        Z.f fVar = this.f13851y;
        if (z) {
            AbstractC0124a.t(hVar.l(fVar));
            this.f13834h0 = false;
        }
        if (this.f13835i0) {
            if (hVar.m()) {
                return true;
            }
            this.f13833g0 = false;
            p0();
            this.f13835i0 = false;
            X();
            if (!this.f13833g0) {
                return false;
            }
        }
        AbstractC0124a.t(!this.f13844r0);
        l2.e eVar = this.f4039c;
        eVar.k();
        fVar.h();
        while (true) {
            fVar.h();
            int y4 = y(eVar, fVar, r22);
            if (y4 == -5) {
                e0(eVar);
                break;
            }
            if (y4 != -4) {
                if (y4 != -3) {
                    throw new IllegalStateException();
                }
                if (l()) {
                    S().f13787e = this.f13843q0;
                }
            } else {
                if (fVar.g(4)) {
                    this.f13844r0 = true;
                    S().f13787e = this.f13843q0;
                    break;
                }
                this.f13843q0 = Math.max(this.f13843q0, fVar.f3783g);
                if (l() || this.f13850x.g(536870912)) {
                    S().f13787e = this.f13843q0;
                }
                byte[] bArr = null;
                if (this.f13790A0) {
                    C0097o c0097o2 = this.f13797E;
                    c0097o2.getClass();
                    this.f13799F = c0097o2;
                    if (Objects.equals(c0097o2.n, "audio/opus") && !this.f13799F.f2870q.isEmpty()) {
                        byte[] bArr2 = (byte[]) this.f13799F.f2870q.get(r22);
                        int i9 = (bArr2[10] & 255) | ((bArr2[11] & 255) << 8);
                        C0096n a3 = this.f13799F.a();
                        a3.f2813H = i9;
                        this.f13799F = new C0097o(a3);
                    }
                    f0(this.f13799F, null);
                    this.f13790A0 = r22;
                }
                fVar.k();
                C0097o c0097o3 = this.f13799F;
                if (c0097o3 != null && Objects.equals(c0097o3.n, "audio/opus")) {
                    if (fVar.g(268435456)) {
                        fVar.f3779c = this.f13799F;
                        U(fVar);
                    }
                    if (this.f4048l - fVar.f3783g <= 80000) {
                        List list = this.f13799F.f2870q;
                        L l4 = this.f13793C;
                        l4.getClass();
                        fVar.f3781e.getClass();
                        if (fVar.f3781e.limit() - fVar.f3781e.position() != 0) {
                            if (l4.f5519b == 2 && (list.size() == 1 || list.size() == 3)) {
                                bArr = (byte[]) list.get(r22);
                            }
                            ByteBuffer byteBuffer2 = fVar.f3781e;
                            int position = byteBuffer2.position();
                            int limit = byteBuffer2.limit();
                            int i10 = limit - position;
                            int i11 = (i10 + KotlinVersion.MAX_COMPONENT_VALUE) / KotlinVersion.MAX_COMPONENT_VALUE;
                            int i12 = i11 + 27 + i10;
                            if (l4.f5519b == 2) {
                                i4 = bArr != null ? bArr.length + 28 : 47;
                                i12 = i4 + 44 + i12;
                            } else {
                                i4 = r22;
                            }
                            if (l4.f5518a.capacity() < i12) {
                                l4.f5518a = ByteBuffer.allocate(i12).order(ByteOrder.LITTLE_ENDIAN);
                            } else {
                                l4.f5518a.clear();
                            }
                            ByteBuffer byteBuffer3 = l4.f5518a;
                            if (l4.f5519b == 2) {
                                if (bArr != null) {
                                    L.a(byteBuffer3, 0L, 0, 1, true);
                                    i6 = limit;
                                    byteBuffer3.put(U.i.b(bArr.length));
                                    byteBuffer3.put(bArr);
                                    i5 = i4;
                                    byteBuffer3.putInt(22, J.n(byteBuffer3.arrayOffset(), bArr.length + 28, 0, byteBuffer3.array()));
                                    byteBuffer3.position(bArr.length + 28);
                                } else {
                                    i5 = i4;
                                    i6 = limit;
                                    byteBuffer3.put(L.f5516d);
                                }
                                byteBuffer3.put(L.f5517e);
                            } else {
                                i5 = i4;
                                i6 = limit;
                            }
                            int o = l4.f5520c + ((int) ((AbstractC1569a.o(byteBuffer2.get(0), byteBuffer2.limit() > 1 ? byteBuffer2.get(1) : (byte) 0) * 48000) / 1000000));
                            l4.f5520c = o;
                            L.a(byteBuffer3, o, l4.f5519b, i11, false);
                            for (int i13 = 0; i13 < i11; i13++) {
                                if (i10 >= 255) {
                                    byteBuffer3.put((byte) -1);
                                    i10 -= 255;
                                } else {
                                    byteBuffer3.put((byte) i10);
                                    i10 = 0;
                                }
                            }
                            int i14 = i6;
                            while (position < i14) {
                                byteBuffer3.put(byteBuffer2.get(position));
                                position++;
                            }
                            byteBuffer2.position(byteBuffer2.limit());
                            byteBuffer3.flip();
                            if (l4.f5519b == 2) {
                                byteBuffer3.putInt(i5 + 66, J.n(byteBuffer3.arrayOffset() + i5 + 44, byteBuffer3.limit() - byteBuffer3.position(), 0, byteBuffer3.array()));
                            } else {
                                byteBuffer3.putInt(22, J.n(byteBuffer3.arrayOffset(), byteBuffer3.limit() - byteBuffer3.position(), 0, byteBuffer3.array()));
                            }
                            l4.f5519b++;
                            l4.f5518a = byteBuffer3;
                            fVar.h();
                            fVar.j(l4.f5518a.remaining());
                            fVar.f3781e.put(l4.f5518a);
                            fVar.k();
                        }
                    }
                }
                if (hVar.m()) {
                    long j7 = this.f4048l;
                    if (W(j7, hVar.f13759j) != W(j7, fVar.f3783g)) {
                        break;
                    }
                }
                if (!hVar.l(fVar)) {
                    break;
                }
                r22 = 0;
            }
        }
        if (hVar.m()) {
            hVar.k();
        }
        return hVar.m() || this.f13844r0 || this.f13835i0;
    }

    public abstract C0138d I(o oVar, C0097o c0097o, C0097o c0097o2);

    public n J(IllegalStateException illegalStateException, o oVar) {
        return new n(illegalStateException, oVar);
    }

    public final boolean K(long j4, long j5) {
        int valueTypeForKey;
        l lVar = this.f13814N;
        lVar.getClass();
        int i4 = this.f13830d0;
        MediaCodec.BufferInfo bufferInfo = this.f13789A;
        if (i4 < 0) {
            int n = lVar.n(bufferInfo);
            if (n < 0) {
                if (n != -2) {
                    if (this.f13826Z && (this.f13844r0 || this.f13838l0 == 2)) {
                        k0();
                    }
                    long j6 = this.f13827a0;
                    if (j6 != -9223372036854775807L) {
                        long j7 = j6 + 100;
                        this.f4043g.getClass();
                        if (j7 < System.currentTimeMillis()) {
                            k0();
                            return false;
                        }
                    }
                    return false;
                }
                this.f13842p0 = true;
                l lVar2 = this.f13814N;
                lVar2.getClass();
                MediaFormat g4 = lVar2.g();
                if (this.f13822V != 0 && g4.getInteger("width") == 32 && g4.getInteger("height") == 32) {
                    this.f13825Y = true;
                    return true;
                }
                if (Build.VERSION.SDK_INT >= 29 && !this.f13813M0.isEmpty()) {
                    M<String> m4 = this.f13813M0;
                    C0136b c0136b = C0136b.f4058b;
                    HashMap hashMap = new HashMap();
                    for (String str : m4) {
                        if (g4.containsKey(str)) {
                            valueTypeForKey = g4.getValueTypeForKey(str);
                            if (valueTypeForKey == 1) {
                                hashMap.put(str, Integer.valueOf(g4.getInteger(str)));
                            } else if (valueTypeForKey == 2) {
                                hashMap.put(str, Long.valueOf(g4.getLong(str)));
                            } else if (valueTypeForKey == 3) {
                                hashMap.put(str, Float.valueOf(g4.getFloat(str)));
                            } else if (valueTypeForKey == 4) {
                                hashMap.put(str, g4.getString(str));
                            } else if (valueTypeForKey == 5) {
                                ByteBuffer byteBuffer = g4.getByteBuffer(str);
                                if (byteBuffer == null) {
                                    hashMap.put(str, null);
                                } else {
                                    ByteBuffer allocate = ByteBuffer.allocate(byteBuffer.remaining());
                                    allocate.put(byteBuffer.duplicate());
                                    allocate.flip();
                                    hashMap.put(str, allocate);
                                }
                            }
                        }
                    }
                    C0136b c0136b2 = new C0136b(hashMap);
                    if (!c0136b2.equals(this.f13811L0)) {
                        this.f13811L0 = c0136b2;
                        c0(c0136b2);
                    }
                }
                this.f13816P = g4;
                this.f13817Q = true;
                return true;
            }
            bufferInfo.presentationTimeUs -= this.f13808J0;
            if (this.f13825Y) {
                this.f13825Y = false;
                lVar.f(n);
                return true;
            }
            if (bufferInfo.size == 0 && (bufferInfo.flags & 4) != 0) {
                k0();
                return false;
            }
            this.f13830d0 = n;
            ByteBuffer t4 = lVar.t(n);
            this.f13831e0 = t4;
            if (t4 != null) {
                t4.position(bufferInfo.offset);
                this.f13831e0.limit(bufferInfo.offset + bufferInfo.size);
            }
            C0(bufferInfo.presentationTimeUs);
        }
        boolean z = this.f13806I0 || bufferInfo.presentationTimeUs < this.f4048l;
        long j8 = this.f13798E0.f13787e;
        boolean z4 = j8 != -9223372036854775807L && j8 <= bufferInfo.presentationTimeUs;
        this.f13832f0 = z4;
        ByteBuffer byteBuffer2 = this.f13831e0;
        int i5 = this.f13830d0;
        int i6 = bufferInfo.flags;
        long j9 = bufferInfo.presentationTimeUs;
        C0097o c0097o = this.f13799F;
        c0097o.getClass();
        if (!l0(j4, j5, lVar, byteBuffer2, i5, i6, 1, j9, z, z4, c0097o)) {
            return false;
        }
        h0(bufferInfo.presentationTimeUs);
        boolean z5 = (bufferInfo.flags & 4) != 0;
        if (!z5 && this.f13841o0 && this.f13832f0) {
            this.f4043g.getClass();
            this.f13827a0 = System.currentTimeMillis();
        }
        this.f13830d0 = -1;
        this.f13831e0 = null;
        if (!z5) {
            return true;
        }
        k0();
        return false;
    }

    public final boolean L() {
        l lVar = this.f13814N;
        if (lVar != null && this.f13838l0 != 2 && !this.f13844r0) {
            int i4 = this.f13829c0;
            Z.f fVar = this.f13850x;
            if (i4 < 0) {
                int l4 = lVar.l();
                this.f13829c0 = l4;
                if (l4 >= 0) {
                    fVar.f3781e = lVar.q(l4);
                    fVar.h();
                }
            }
            if (this.f13838l0 == 1) {
                if (!this.f13826Z) {
                    this.f13841o0 = true;
                    lVar.e(this.f13829c0, 0, 0L, 4);
                    this.f13829c0 = -1;
                    fVar.f3781e = null;
                }
                this.f13838l0 = 2;
                return false;
            }
            if (this.f13824X) {
                this.f13824X = false;
                ByteBuffer byteBuffer = fVar.f3781e;
                byteBuffer.getClass();
                byteBuffer.put(f13788N0);
                lVar.e(this.f13829c0, 38, 0L, 0);
                this.f13829c0 = -1;
                fVar.f3781e = null;
                this.f13840n0 = true;
                return true;
            }
            if (this.f13837k0 == 1) {
                int i5 = 0;
                while (true) {
                    C0097o c0097o = this.f13815O;
                    c0097o.getClass();
                    if (i5 >= c0097o.f2870q.size()) {
                        break;
                    }
                    byte[] bArr = (byte[]) this.f13815O.f2870q.get(i5);
                    ByteBuffer byteBuffer2 = fVar.f3781e;
                    byteBuffer2.getClass();
                    byteBuffer2.put(bArr);
                    i5++;
                }
                this.f13837k0 = 2;
            }
            ByteBuffer byteBuffer3 = fVar.f3781e;
            byteBuffer3.getClass();
            int position = byteBuffer3.position();
            l2.e eVar = this.f4039c;
            eVar.k();
            try {
                lVar.m(new g0.p(this, 8, eVar));
                int i6 = this.f13795D.get();
                if (i6 == -3) {
                    if (l()) {
                        S().f13787e = this.f13843q0;
                        return false;
                    }
                } else {
                    if (i6 == -5) {
                        if (this.f13837k0 == 2) {
                            fVar.h();
                            this.f13837k0 = 1;
                        }
                        e0(eVar);
                        return true;
                    }
                    if (!fVar.g(4)) {
                        if (this.f13840n0 || fVar.g(1)) {
                            long j4 = fVar.f3783g;
                            if (!u0(fVar)) {
                                boolean g4 = fVar.g(1073741824);
                                if (g4) {
                                    Z.b bVar = fVar.f3780d;
                                    if (position == 0) {
                                        bVar.getClass();
                                    } else {
                                        if (bVar.f3772d == null) {
                                            int[] iArr = new int[1];
                                            bVar.f3772d = iArr;
                                            bVar.f3777i.numBytesOfClearData = iArr;
                                        }
                                        int[] iArr2 = bVar.f3772d;
                                        iArr2[0] = iArr2[0] + position;
                                    }
                                }
                                if (this.f13790A0) {
                                    S0.g gVar = S().f13786d;
                                    C0097o c0097o2 = this.f13797E;
                                    c0097o2.getClass();
                                    gVar.a(j4, c0097o2);
                                    this.f13790A0 = false;
                                }
                                this.f13843q0 = Math.max(this.f13843q0, j4);
                                if (l() || fVar.g(536870912)) {
                                    S().f13787e = this.f13843q0;
                                }
                                fVar.k();
                                if (fVar.g(268435456)) {
                                    U(fVar);
                                }
                                if (this.f13806I0) {
                                    long j5 = this.f13843q0;
                                    if (j4 <= j5) {
                                        this.f13808J0 = (j5 - j4) + 1 + this.f13808J0;
                                    }
                                    this.f13843q0 = j4;
                                    this.f13806I0 = false;
                                }
                                j0(fVar);
                                int O4 = O(fVar);
                                long j6 = j4 + this.f13808J0;
                                if (g4) {
                                    lVar.c(this.f13829c0, fVar.f3780d, j6, O4);
                                } else {
                                    int i7 = this.f13829c0;
                                    ByteBuffer byteBuffer4 = fVar.f3781e;
                                    byteBuffer4.getClass();
                                    lVar.e(i7, byteBuffer4.limit(), j6, O4);
                                }
                                this.f13829c0 = -1;
                                fVar.f3781e = null;
                                this.f13840n0 = true;
                                this.f13837k0 = 0;
                                this.f13796D0.f4068c++;
                                return true;
                            }
                        } else {
                            fVar.h();
                            if (this.f13837k0 == 2) {
                                this.f13837k0 = 1;
                                return true;
                            }
                        }
                        return true;
                    }
                    S().f13787e = this.f13843q0;
                    if (this.f13837k0 == 2) {
                        fVar.h();
                        this.f13837k0 = 1;
                    }
                    this.f13844r0 = true;
                    if (!this.f13840n0) {
                        k0();
                        return false;
                    }
                    if (!this.f13826Z) {
                        this.f13841o0 = true;
                        lVar.e(this.f13829c0, 0, 0L, 4);
                        this.f13829c0 = -1;
                        fVar.f3781e = null;
                        return false;
                    }
                }
            } catch (Z.e e4) {
                a0(e4);
                m0(0);
                M();
                return true;
            }
        }
        return false;
    }

    public final void M() {
        try {
            l lVar = this.f13814N;
            lVar.getClass();
            lVar.flush();
        } finally {
            q0();
        }
    }

    public final List N(boolean z) {
        C0097o c0097o = this.f13797E;
        c0097o.getClass();
        j jVar = this.f13848u;
        ArrayList Q4 = Q(jVar, c0097o, z);
        if (!Q4.isEmpty() || !z) {
            return Q4;
        }
        ArrayList Q5 = Q(jVar, c0097o, false);
        if (!Q5.isEmpty()) {
            AbstractC0108a.s("MediaCodecRenderer", "Drm session requires secure decoder for " + c0097o.n + ", but no secure decoder available. Trying to proceed with " + Q5 + ".");
        }
        return Q5;
    }

    public int O(Z.f fVar) {
        return 0;
    }

    public abstract float P(float f4, C0097o c0097o, C0097o[] c0097oArr);

    public abstract ArrayList Q(j jVar, C0097o c0097o, boolean z);

    public long R(long j4, long j5) {
        return super.i(j4, j5);
    }

    public final q S() {
        ArrayDeque arrayDeque = this.f13791B;
        return !arrayDeque.isEmpty() ? (q) arrayDeque.getLast() : this.f13798E0;
    }

    public abstract L1.h T(o oVar, C0097o c0097o, MediaCrypto mediaCrypto, float f4);

    public abstract void U(Z.f fVar);

    /* JADX WARN: Removed duplicated region for block: B:39:0x0157  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0170  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void V(o oVar, MediaCrypto mediaCrypto) {
        int i4;
        boolean equals;
        String stringId;
        LogSessionId unused;
        this.f13821U = oVar;
        C0097o c0097o = this.f13797E;
        c0097o.getClass();
        String str = oVar.f13766a;
        float f4 = this.f13812M;
        C0097o[] c0097oArr = this.f4046j;
        c0097oArr.getClass();
        float P4 = P(f4, c0097o, c0097oArr);
        if (P4 <= this.v) {
            P4 = -1.0f;
        }
        this.f4043g.getClass();
        long elapsedRealtime = SystemClock.elapsedRealtime();
        L1.h T4 = T(oVar, c0097o, mediaCrypto, P4);
        int i5 = Build.VERSION.SDK_INT;
        if (i5 >= 31) {
            b0.i iVar = this.f4042f;
            iVar.getClass();
            LogSessionId a3 = iVar.a();
            unused = LogSessionId.LOG_SESSION_ID_NONE;
            equals = a3.equals(LogSessionId.LOG_SESSION_ID_NONE);
            if (!equals) {
                MediaFormat mediaFormat = (MediaFormat) T4.f1634b;
                stringId = a3.getStringId();
                mediaFormat.setString("log-session-id", stringId);
            }
        }
        try {
            Trace.beginSection("createCodec:" + str);
            l f5 = this.f13847t.f(T4);
            this.f13814N = f5;
            f5.p(new e0.t(this));
            Trace.endSection();
            this.f4043g.getClass();
            long elapsedRealtime2 = SystemClock.elapsedRealtime();
            if (!oVar.e(this.f13845s, c0097o)) {
                String c4 = C0097o.c(c0097o);
                Locale locale = Locale.US;
                AbstractC0108a.s("MediaCodecRenderer", "Format exceeds selected codec's capabilities [" + c4 + ", " + str + "]");
            }
            this.f13818R = P4;
            this.f13815O = c0097o;
            boolean z = false;
            if (i5 <= 25 && "OMX.Exynos.avc.dec.secure".equals(str)) {
                String str2 = Build.MODEL;
                if (str2.startsWith("SM-T585") || str2.startsWith("SM-A510") || str2.startsWith("SM-A520") || str2.startsWith("SM-J700")) {
                    i4 = 2;
                    this.f13822V = i4;
                    this.f13823W = i5 != 29 && "c2.android.aac.decoder".equals(str);
                    String str3 = oVar.f13766a;
                    if ((i5 <= 25 && "OMX.rk.video_decoder.avc".equals(str3)) || ((i5 <= 29 && ("OMX.broadcom.video_decoder.tunnel".equals(str3) || "OMX.broadcom.video_decoder.tunnel.secure".equals(str3) || "OMX.bcm.vdec.avc.tunnel".equals(str3) || "OMX.bcm.vdec.avc.tunnel.secure".equals(str3) || "OMX.bcm.vdec.hevc.tunnel".equals(str3) || "OMX.bcm.vdec.hevc.tunnel.secure".equals(str3))) || ("Amazon".equals(Build.MANUFACTURER) && "AFTS".equals(Build.MODEL) && oVar.f13771f))) {
                        z = true;
                    }
                    this.f13826Z = z;
                    this.f13814N.getClass();
                    if (this.f4044h == 2) {
                        this.f4043g.getClass();
                        this.f13828b0 = SystemClock.elapsedRealtime() + 1000;
                    }
                    this.f13796D0.f4066a++;
                    long j4 = elapsedRealtime2 - elapsedRealtime;
                    if (i5 >= 31 && !this.f13813M0.isEmpty()) {
                        l lVar = this.f13814N;
                        lVar.getClass();
                        lVar.w(new ArrayList(this.f13813M0));
                    }
                    b0(elapsedRealtime2, j4, str);
                }
            }
            i4 = 0;
            this.f13822V = i4;
            this.f13823W = i5 != 29 && "c2.android.aac.decoder".equals(str);
            String str32 = oVar.f13766a;
            if (i5 <= 25) {
                z = true;
                this.f13826Z = z;
                this.f13814N.getClass();
                if (this.f4044h == 2) {
                }
                this.f13796D0.f4066a++;
                long j42 = elapsedRealtime2 - elapsedRealtime;
                if (i5 >= 31) {
                    l lVar2 = this.f13814N;
                    lVar2.getClass();
                    lVar2.w(new ArrayList(this.f13813M0));
                }
                b0(elapsedRealtime2, j42, str);
            }
            z = true;
            this.f13826Z = z;
            this.f13814N.getClass();
            if (this.f4044h == 2) {
            }
            this.f13796D0.f4066a++;
            long j422 = elapsedRealtime2 - elapsedRealtime;
            if (i5 >= 31) {
            }
            b0(elapsedRealtime2, j422, str);
        } catch (Throwable th) {
            Trace.endSection();
            throw th;
        }
    }

    public final boolean W(long j4, long j5) {
        if (j5 >= j4) {
            return false;
        }
        C0097o c0097o = this.f13799F;
        return c0097o == null || !Objects.equals(c0097o.n, "audio/opus") || j4 - j5 > 80000;
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x0073, code lost:
    
        if (r7 != 4) goto L65;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x008c, code lost:
    
        if (r2.z() != null) goto L76;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void X() {
        C0097o c0097o;
        MediaCrypto mediaCrypto;
        if (this.f13814N != null || this.f13833g0 || (c0097o = this.f13797E) == null) {
            return;
        }
        String str = c0097o.n;
        boolean z = true;
        if (this.f13803H == null && y0(c0097o)) {
            this.f13833g0 = false;
            p0();
            boolean equals = "audio/mp4a-latm".equals(str);
            h hVar = this.z;
            if (equals || "audio/mpeg".equals(str) || "audio/opus".equals(str)) {
                hVar.getClass();
                hVar.f13761l = 32;
            } else {
                hVar.getClass();
                hVar.f13761l = 1;
            }
            this.f13833g0 = true;
            return;
        }
        s0(this.f13803H);
        if (this.f13801G != null) {
            AbstractC0124a.t(this.f13807J == null);
            e0.t tVar = this.f13801G;
            Z.a y4 = tVar.y();
            if (f0.j.f8496a && (y4 instanceof f0.j)) {
                int F4 = tVar.F();
                if (F4 == 1) {
                    f0.c z4 = tVar.z();
                    z4.getClass();
                    throw g(z4, this.f13797E, false, z4.f8489a);
                }
            }
            if (y4 != null) {
                if (y4 instanceof f0.j) {
                    try {
                        this.f13807J = new MediaCrypto(null, null);
                    } catch (MediaCryptoException e4) {
                        throw g(e4, this.f13797E, false, 6006);
                    }
                }
            }
        }
        try {
            e0.t tVar2 = this.f13801G;
            if (tVar2 != null) {
                if (tVar2.F() != 3) {
                    if (this.f13801G.F() == 4) {
                    }
                }
                e0.t tVar3 = this.f13801G;
                str.getClass();
                if (tVar3.I(str)) {
                    Y(this.f13807J, z);
                    mediaCrypto = this.f13807J;
                    if (mediaCrypto == null && this.f13814N == null) {
                        mediaCrypto.release();
                        this.f13807J = null;
                        return;
                    }
                }
            }
            z = false;
            Y(this.f13807J, z);
            mediaCrypto = this.f13807J;
            if (mediaCrypto == null) {
            }
        } catch (p e5) {
            throw g(e5, c0097o, false, 4001);
        }
    }

    public final void Y(MediaCrypto mediaCrypto, boolean z) {
        C0097o c0097o = this.f13797E;
        c0097o.getClass();
        if (this.f13819S == null) {
            try {
                List N4 = N(z);
                this.f13819S = new ArrayDeque();
                ArrayList arrayList = (ArrayList) N4;
                if (!arrayList.isEmpty()) {
                    this.f13819S.add((o) arrayList.get(0));
                }
                this.f13820T = null;
            } catch (u e4) {
                throw new p(c0097o, e4, z, -49998);
            }
        }
        if (this.f13819S.isEmpty()) {
            throw new p(c0097o, null, z, -49999);
        }
        ArrayDeque arrayDeque = this.f13819S;
        arrayDeque.getClass();
        while (this.f13814N == null) {
            o oVar = (o) arrayDeque.peekFirst();
            oVar.getClass();
            if (!Z(c0097o) || !w0(oVar)) {
                return;
            }
            try {
                V(oVar, mediaCrypto);
            } catch (Exception e5) {
                AbstractC0108a.t("MediaCodecRenderer", "Failed to initialize decoder: " + oVar, e5);
                arrayDeque.removeFirst();
                p pVar = new p("Decoder init failed: " + oVar.f13766a + ", " + c0097o, e5, c0097o.n, z, oVar, e5 instanceof MediaCodec.CodecException ? ((MediaCodec.CodecException) e5).getDiagnosticInfo() : null);
                a0(pVar);
                p pVar2 = this.f13820T;
                if (pVar2 == null) {
                    this.f13820T = pVar;
                } else {
                    this.f13820T = new p(pVar2.getMessage(), pVar2.getCause(), pVar2.f13778a, pVar2.f13779b, pVar2.f13780c, pVar2.f13781d);
                }
                if (arrayDeque.isEmpty()) {
                    throw this.f13820T;
                }
            }
        }
        this.f13819S = null;
    }

    public boolean Z(C0097o c0097o) {
        return true;
    }

    public abstract void a0(Exception exc);

    public abstract void b0(long j4, long j5, String str);

    @Override // a0.AbstractC0135a, a0.i0
    public void c(int i4, Object obj) {
        int i5;
        if (i4 == 11) {
            C0132H c0132h = (C0132H) obj;
            c0132h.getClass();
            this.f13805I = c0132h;
            return;
        }
        if (i4 != 21) {
            if (i4 == 22 && (i5 = Build.VERSION.SDK_INT) >= 29) {
                obj.getClass();
                M m4 = (M) obj;
                if (this.f13813M0.equals(m4)) {
                    return;
                }
                if (i5 >= 31) {
                    HashSet hashSet = new HashSet(m4);
                    HashSet hashSet2 = new HashSet();
                    p0 it = this.f13813M0.iterator();
                    while (it.hasNext()) {
                        String str = (String) it.next();
                        if (!hashSet.remove(str)) {
                            hashSet2.add(str);
                        }
                    }
                    l lVar = this.f13814N;
                    if (lVar != null) {
                        if (!hashSet2.isEmpty()) {
                            lVar.B(new ArrayList(hashSet2));
                        }
                        if (!hashSet.isEmpty()) {
                            lVar.w(new ArrayList(hashSet));
                        }
                    }
                }
                this.f13813M0 = m4;
                return;
            }
            return;
        }
        if (Build.VERSION.SDK_INT >= 29) {
            obj.getClass();
            C0136b c0136b = (C0136b) obj;
            this.f13810K0 = c0136b;
            l lVar2 = this.f13814N;
            if (lVar2 != null) {
                Bundle bundle = new Bundle();
                for (Map.Entry entry : c0136b.f4059a.entrySet()) {
                    String str2 = (String) entry.getKey();
                    Object value = entry.getValue();
                    if (value != null) {
                        if (value instanceof Integer) {
                            bundle.putInt(str2, ((Integer) value).intValue());
                        } else if (value instanceof Long) {
                            bundle.putLong(str2, ((Long) value).longValue());
                        } else if (value instanceof Float) {
                            bundle.putFloat(str2, ((Float) value).floatValue());
                        } else if (value instanceof String) {
                            bundle.putString(str2, (String) value);
                        } else if (value instanceof ByteBuffer) {
                            ByteBuffer byteBuffer = (ByteBuffer) value;
                            byte[] bArr = new byte[byteBuffer.remaining()];
                            byteBuffer.duplicate().get(bArr);
                            bundle.putByteArray(str2, bArr);
                        }
                    }
                }
                lVar2.b(bundle);
            }
        }
    }

    public abstract void c0(C0136b c0136b);

    public abstract void d0(String str);

    /* JADX WARN: Code restructure failed: missing block: B:50:0x00e3, code lost:
    
        if (r4.I(r2) != false) goto L128;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public C0138d e0(l2.e eVar) {
        C0097o c0097o;
        int i4;
        Z.a y4;
        Z.a y5;
        this.f13790A0 = true;
        C0097o c0097o2 = (C0097o) eVar.f14271c;
        c0097o2.getClass();
        String str = c0097o2.n;
        if (str == null) {
            throw g(new IllegalArgumentException("Sample MIME type is null."), c0097o2, false, 4005);
        }
        if ((str.equals("video/av01") || str.equals("video/x-vnd.on2.vp9")) && !c0097o2.f2870q.isEmpty()) {
            C0096n a3 = c0097o2.a();
            a3.f2832p = null;
            c0097o = new C0097o(a3);
        } else {
            c0097o = c0097o2;
        }
        e0.t tVar = (e0.t) eVar.f14270b;
        e0.t tVar2 = this.f13803H;
        if (tVar2 != tVar) {
            if (tVar != null) {
                tVar.t(null);
            }
            if (tVar2 != null) {
                tVar2.H(null);
            }
        }
        this.f13803H = tVar;
        this.f13797E = c0097o;
        if (this.f13833g0) {
            this.f13835i0 = true;
            return null;
        }
        l lVar = this.f13814N;
        if (lVar == null) {
            this.f13819S = null;
            X();
            return null;
        }
        o oVar = this.f13821U;
        oVar.getClass();
        C0097o c0097o3 = this.f13815O;
        c0097o3.getClass();
        e0.t tVar3 = this.f13801G;
        e0.t tVar4 = this.f13803H;
        if (tVar3 != tVar4) {
            if (tVar4 != null && tVar3 != null && (y4 = tVar4.y()) != null && (y5 = tVar3.y()) != null && y4.getClass().equals(y5.getClass())) {
                if (y4 instanceof f0.j) {
                    if (tVar4.B().equals(tVar3.B())) {
                        UUID uuid = AbstractC0088f.f2783e;
                        if (!uuid.equals(tVar3.B()) && !uuid.equals(tVar4.B())) {
                            if (!oVar.f13771f) {
                                if (tVar4.F() != 2) {
                                    if (tVar4.F() == 3 || tVar4.F() == 4) {
                                        String str2 = c0097o.n;
                                        str2.getClass();
                                    }
                                }
                            }
                        }
                    }
                }
            }
            if (this.f13840n0) {
                this.f13838l0 = 1;
                this.f13839m0 = 3;
            } else {
                n0();
                X();
            }
            return new C0138d(oVar.f13766a, c0097o3, c0097o, 0, 128);
        }
        boolean z = this.f13803H != this.f13801G;
        C0138d I4 = I(oVar, c0097o3, c0097o);
        int i5 = I4.f4083d;
        if (i5 != 0) {
            if (i5 == 1) {
                if (A0(c0097o)) {
                    this.f13815O = c0097o;
                    if (z) {
                        if (this.f13840n0) {
                            this.f13838l0 = 1;
                            this.f13839m0 = 2;
                        } else {
                            B0();
                        }
                    } else if (this.f13840n0) {
                        this.f13838l0 = 1;
                        this.f13839m0 = 1;
                    }
                }
                i4 = 16;
            } else if (i5 == 2) {
                if (A0(c0097o)) {
                    this.f13836j0 = true;
                    this.f13837k0 = 1;
                    int i6 = this.f13822V;
                    this.f13824X = i6 == 2 || (i6 == 1 && c0097o.f2874u == c0097o3.f2874u && c0097o.v == c0097o3.v);
                    this.f13815O = c0097o;
                    if (z) {
                        if (this.f13840n0) {
                            this.f13838l0 = 1;
                            this.f13839m0 = 2;
                        } else {
                            B0();
                        }
                    }
                }
                i4 = 16;
            } else {
                if (i5 != 3) {
                    throw new IllegalStateException();
                }
                if (A0(c0097o)) {
                    this.f13815O = c0097o;
                    if (z) {
                        if (this.f13840n0) {
                            this.f13838l0 = 1;
                            this.f13839m0 = 2;
                        } else {
                            B0();
                        }
                    }
                }
                i4 = 16;
            }
            return (i5 != 0 || (this.f13814N == lVar && this.f13839m0 != 3)) ? I4 : new C0138d(oVar.f13766a, c0097o3, c0097o, 0, i4);
        }
        if (this.f13840n0) {
            this.f13838l0 = 1;
            this.f13839m0 = 3;
        } else {
            n0();
            X();
        }
        i4 = 0;
        if (i5 != 0) {
        }
    }

    public abstract void f0(C0097o c0097o, MediaFormat mediaFormat);

    public void h0(long j4) {
        this.f13800F0 = j4;
        while (true) {
            ArrayDeque arrayDeque = this.f13791B;
            if (arrayDeque.isEmpty() || j4 < ((q) arrayDeque.peek()).f13783a) {
                return;
            }
            q qVar = (q) arrayDeque.poll();
            qVar.getClass();
            t0(qVar);
            i0();
        }
    }

    @Override // a0.AbstractC0135a
    public final long i(long j4, long j5) {
        return R(j4, j5);
    }

    public abstract void i0();

    public final void k0() {
        int i4 = this.f13839m0;
        if (i4 == 1) {
            M();
            return;
        }
        if (i4 == 2) {
            M();
            B0();
        } else if (i4 != 3) {
            this.f13846s0 = true;
            o0();
        } else {
            n0();
            X();
        }
    }

    public abstract boolean l0(long j4, long j5, l lVar, ByteBuffer byteBuffer, int i4, int i5, int i6, long j6, boolean z, boolean z4, C0097o c0097o);

    public final boolean m0(int i4) {
        l2.e eVar = this.f4039c;
        eVar.k();
        Z.f fVar = this.f13849w;
        fVar.h();
        int y4 = y(eVar, fVar, i4 | 4);
        if (y4 == -5) {
            e0(eVar);
            return true;
        }
        if (y4 != -4 || !fVar.g(4)) {
            return false;
        }
        this.f13844r0 = true;
        k0();
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void n0() {
        try {
            l lVar = this.f13814N;
            if (lVar != null) {
                lVar.release();
                this.f13796D0.f4067b++;
                o oVar = this.f13821U;
                oVar.getClass();
                d0(oVar.f13766a);
            }
            this.f13814N = null;
            try {
                MediaCrypto mediaCrypto = this.f13807J;
                if (mediaCrypto != null) {
                    mediaCrypto.release();
                }
            } finally {
            }
        } catch (Throwable th) {
            this.f13814N = null;
            try {
                MediaCrypto mediaCrypto2 = this.f13807J;
                if (mediaCrypto2 != null) {
                    mediaCrypto2.release();
                }
                throw th;
            } finally {
            }
        }
    }

    public abstract void o0();

    @Override // a0.AbstractC0135a
    public void p() {
        this.f13797E = null;
        t0(q.f13782f);
        this.f13791B.clear();
        if (this.f13833g0) {
            this.f13833g0 = false;
            p0();
        } else {
            if (this.f13814N == null) {
                return;
            }
            if (x0()) {
                n0();
            } else if (v0()) {
                M();
            } else {
                this.f13806I0 = true;
            }
        }
    }

    public final void p0() {
        this.f13843q0 = -9223372036854775807L;
        S().f13787e = -9223372036854775807L;
        this.f13800F0 = -9223372036854775807L;
        this.f13835i0 = false;
        this.z.h();
        this.f13851y.h();
        this.f13834h0 = false;
        L l4 = this.f13793C;
        l4.getClass();
        l4.f5518a = U.n.f3061a;
        l4.f5520c = 0;
        l4.f5519b = 2;
    }

    public void q0() {
        this.f13829c0 = -1;
        this.f13850x.f3781e = null;
        this.f13830d0 = -1;
        this.f13831e0 = null;
        this.f13843q0 = -9223372036854775807L;
        S().f13787e = -9223372036854775807L;
        this.f13800F0 = -9223372036854775807L;
        this.f13828b0 = -9223372036854775807L;
        this.f13841o0 = false;
        this.f13827a0 = -9223372036854775807L;
        this.f13840n0 = false;
        this.f13824X = false;
        this.f13825Y = false;
        this.f13832f0 = false;
        this.f13838l0 = 0;
        this.f13839m0 = 0;
        this.f13837k0 = this.f13836j0 ? 1 : 0;
        this.f13806I0 = false;
        this.f13808J0 = 0L;
    }

    @Override // a0.AbstractC0135a
    public void r(long j4, boolean z, boolean z4) {
        ArrayDeque arrayDeque = this.f13791B;
        if (!arrayDeque.isEmpty()) {
            this.f13798E0 = (q) arrayDeque.getLast();
        }
        arrayDeque.clear();
        if (z4) {
            this.f13844r0 = false;
            this.f13846s0 = false;
            this.f13792B0 = false;
            if (this.f13833g0) {
                p0();
            } else if (this.f13814N != null) {
                if (x0()) {
                    n0();
                    X();
                } else if (v0()) {
                    M();
                } else {
                    this.f13806I0 = true;
                }
            }
            if (this.f13798E0.f13786d.f() > 0) {
                this.f13790A0 = true;
            }
            S0.g gVar = this.f13798E0.f13786d;
            synchronized (gVar) {
                gVar.f2414a = 0;
                gVar.f2415b = 0;
                Arrays.fill((Object[]) gVar.f2417d, (Object) null);
            }
        }
    }

    public final void r0() {
        q0();
        this.f13794C0 = null;
        this.f13819S = null;
        this.f13821U = null;
        this.f13815O = null;
        this.f13816P = null;
        this.f13817Q = false;
        this.f13842p0 = false;
        this.f13818R = -1.0f;
        this.f13822V = 0;
        this.f13823W = false;
        this.f13826Z = false;
        this.f13836j0 = false;
        this.f13837k0 = 0;
    }

    public final void s0(e0.t tVar) {
        e0.t tVar2 = this.f13801G;
        if (tVar2 != tVar) {
            if (tVar != null) {
                tVar.t(null);
            }
            if (tVar2 != null) {
                tVar2.H(null);
            }
        }
        this.f13801G = tVar;
    }

    public final void t0(q qVar) {
        this.f13798E0 = qVar;
        if (qVar.f13785c != -9223372036854775807L) {
            this.f13802G0 = true;
            g0();
        }
    }

    public boolean u0(Z.f fVar) {
        return false;
    }

    public boolean v0() {
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x003a, code lost:
    
        if (r4 >= r0) goto L16;
     */
    @Override // a0.AbstractC0135a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void w(C0097o[] c0097oArr, long j4, long j5, C1353B c1353b) {
        if (this.f13798E0.f13785c == -9223372036854775807L) {
            t0(new q(-9223372036854775807L, j4, j5));
            if (this.f13804H0) {
                i0();
                return;
            }
            return;
        }
        ArrayDeque arrayDeque = this.f13791B;
        if (arrayDeque.isEmpty()) {
            long j6 = this.f13843q0;
            if (j6 != -9223372036854775807L) {
                long j7 = this.f13800F0;
                if (j7 != -9223372036854775807L) {
                }
            }
            t0(new q(-9223372036854775807L, j4, j5));
            if (this.f13798E0.f13785c != -9223372036854775807L) {
                i0();
                return;
            }
            return;
        }
        arrayDeque.add(new q(this.f13843q0, j4, j5));
    }

    public boolean w0(o oVar) {
        return true;
    }

    public boolean x0() {
        int i4 = this.f13839m0;
        if (i4 == 3 || (this.f13823W && !this.f13842p0)) {
            return true;
        }
        if (i4 != 2) {
            return false;
        }
        try {
            B0();
            return false;
        } catch (C0146l e4) {
            AbstractC0108a.t("MediaCodecRenderer", "Failed to update the DRM session, releasing the codec instead.", e4);
            return true;
        }
    }

    public boolean y0(C0097o c0097o) {
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:42:0x0078 A[LOOP:1: B:33:0x0053->B:42:0x0078, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0079 A[EDGE_INSN: B:43:0x0079->B:44:? BREAK  A[LOOP:1: B:33:0x0053->B:42:0x0078], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0099 A[LOOP:2: B:45:0x0079->B:54:0x0099, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:55:0x009a A[EDGE_INSN: B:55:0x009a->B:56:0x009a BREAK  A[LOOP:2: B:45:0x0079->B:54:0x0099], SYNTHETIC] */
    @Override // a0.AbstractC0135a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void z(long j4, long j5) {
        boolean z;
        boolean z4;
        boolean z5 = false;
        if (this.f13792B0) {
            this.f13792B0 = false;
            k0();
        }
        C0146l c0146l = this.f13794C0;
        if (c0146l != null) {
            this.f13794C0 = null;
            throw c0146l;
        }
        try {
            if (this.f13846s0) {
                o0();
                return;
            }
            if (this.f13797E != null || m0(2)) {
                X();
                if (this.f13833g0) {
                    Trace.beginSection("bypassRender");
                    while (H(j4, j5)) {
                    }
                    Trace.endSection();
                } else if (this.f13814N != null) {
                    this.f4043g.getClass();
                    long elapsedRealtime = SystemClock.elapsedRealtime();
                    Trace.beginSection("drainAndFeed");
                    while (K(j4, j5)) {
                        long j6 = this.f13809K;
                        if (j6 != -9223372036854775807L) {
                            this.f4043g.getClass();
                            if (SystemClock.elapsedRealtime() - elapsedRealtime >= j6) {
                                z4 = false;
                                if (z4) {
                                    break;
                                }
                            }
                        }
                        z4 = true;
                        if (z4) {
                        }
                    }
                    while (L()) {
                        long j7 = this.f13809K;
                        if (j7 != -9223372036854775807L) {
                            this.f4043g.getClass();
                            if (SystemClock.elapsedRealtime() - elapsedRealtime >= j7) {
                                z = false;
                                if (z) {
                                    break;
                                }
                            }
                        }
                        z = true;
                        if (z) {
                        }
                    }
                    Trace.endSection();
                } else {
                    C0137c c0137c = this.f13796D0;
                    int i4 = c0137c.f4069d;
                    b0 b0Var = this.f4045i;
                    b0Var.getClass();
                    c0137c.f4069d = i4 + b0Var.k(j4 - this.f4047k);
                    m0(1);
                }
                synchronized (this.f13796D0) {
                }
            }
        } catch (MediaCodec.CryptoException e4) {
            throw g(e4, this.f13797E, false, J.x(e4.getErrorCode()));
        } catch (IllegalStateException e5) {
            boolean z6 = e5 instanceof MediaCodec.CodecException;
            if (!z6) {
                StackTraceElement[] stackTrace = e5.getStackTrace();
                if (stackTrace.length <= 0 || !stackTrace[0].getClassName().equals("android.media.MediaCodec")) {
                    throw e5;
                }
            }
            a0(e5);
            if (z6 && ((MediaCodec.CodecException) e5).isRecoverable()) {
                z5 = true;
            }
            if (z5) {
                n0();
            }
            n J4 = J(e5, this.f13821U);
            throw g(J4, this.f13797E, z5, J4.f13765a == 1101 ? 4006 : 4003);
        }
    }

    public abstract int z0(j jVar, C0097o c0097o);

    public void g0() {
    }

    public void j0(Z.f fVar) {
    }
}
