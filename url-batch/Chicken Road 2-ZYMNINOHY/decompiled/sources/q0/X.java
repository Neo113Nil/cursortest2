package q0;

import a0.C0140f;
import a0.C0141g;
import android.media.MediaCodec;
import java.nio.ByteBuffer;
import java.util.Arrays;
import java.util.HashMap;

/* loaded from: classes.dex */
public final class X {

    /* renamed from: a, reason: collision with root package name */
    public final B1.j f14936a;

    /* renamed from: b, reason: collision with root package name */
    public final int f14937b;

    /* renamed from: c, reason: collision with root package name */
    public final W.u f14938c;

    /* renamed from: d, reason: collision with root package name */
    public S0.d f14939d;

    /* renamed from: e, reason: collision with root package name */
    public S0.d f14940e;

    /* renamed from: f, reason: collision with root package name */
    public S0.d f14941f;

    /* renamed from: g, reason: collision with root package name */
    public long f14942g;

    public X(B1.j jVar) {
        int i4;
        this.f14936a = jVar;
        synchronized (jVar) {
            i4 = ((C0141g) jVar.f203d).f4125c.f15442b;
        }
        this.f14937b = i4;
        this.f14938c = new W.u(32);
        S0.d dVar = new S0.d(0L, i4);
        this.f14939d = dVar;
        this.f14940e = dVar;
        this.f14941f = dVar;
    }

    public static S0.d c(S0.d dVar, long j4, ByteBuffer byteBuffer, int i4) {
        while (j4 >= dVar.f2408b) {
            dVar = (S0.d) dVar.f2410d;
        }
        while (i4 > 0) {
            int min = Math.min(i4, (int) (dVar.f2408b - j4));
            u0.a aVar = (u0.a) dVar.f2409c;
            byteBuffer.put(aVar.f15432a, ((int) (j4 - dVar.f2407a)) + aVar.f15433b, min);
            i4 -= min;
            j4 += min;
            if (j4 == dVar.f2408b) {
                dVar = (S0.d) dVar.f2410d;
            }
        }
        return dVar;
    }

    public static S0.d d(S0.d dVar, long j4, byte[] bArr, int i4) {
        while (j4 >= dVar.f2408b) {
            dVar = (S0.d) dVar.f2410d;
        }
        int i5 = i4;
        while (i5 > 0) {
            int min = Math.min(i5, (int) (dVar.f2408b - j4));
            u0.a aVar = (u0.a) dVar.f2409c;
            System.arraycopy(aVar.f15432a, ((int) (j4 - dVar.f2407a)) + aVar.f15433b, bArr, i4 - i5, min);
            i5 -= min;
            j4 += min;
            if (j4 == dVar.f2408b) {
                dVar = (S0.d) dVar.f2410d;
            }
        }
        return dVar;
    }

    public static S0.d e(S0.d dVar, Z.f fVar, J1.b bVar, W.u uVar) {
        if (fVar.g(1073741824)) {
            long j4 = bVar.f1157b;
            int i4 = 1;
            uVar.J(1);
            S0.d d4 = d(dVar, j4, uVar.f3351a, 1);
            long j5 = j4 + 1;
            byte b4 = uVar.f3351a[0];
            boolean z = (b4 & 128) != 0;
            int i5 = b4 & Byte.MAX_VALUE;
            Z.b bVar2 = fVar.f3780d;
            byte[] bArr = bVar2.f3769a;
            if (bArr == null) {
                bVar2.f3769a = new byte[16];
            } else {
                Arrays.fill(bArr, (byte) 0);
            }
            dVar = d(d4, j5, bVar2.f3769a, i5);
            long j6 = j5 + i5;
            if (z) {
                uVar.J(2);
                dVar = d(dVar, j6, uVar.f3351a, 2);
                j6 += 2;
                i4 = uVar.G();
            }
            int[] iArr = bVar2.f3772d;
            if (iArr == null || iArr.length < i4) {
                iArr = new int[i4];
            }
            int[] iArr2 = bVar2.f3773e;
            if (iArr2 == null || iArr2.length < i4) {
                iArr2 = new int[i4];
            }
            if (z) {
                int i6 = i4 * 6;
                uVar.J(i6);
                dVar = d(dVar, j6, uVar.f3351a, i6);
                j6 += i6;
                uVar.M(0);
                for (int i7 = 0; i7 < i4; i7++) {
                    iArr[i7] = uVar.G();
                    iArr2[i7] = uVar.D();
                }
            } else {
                iArr[0] = 0;
                iArr2[0] = bVar.f1156a - ((int) (j6 - bVar.f1157b));
            }
            y0.E e4 = (y0.E) bVar.f1158c;
            String str = W.J.f3263a;
            byte[] bArr2 = e4.f16085b;
            byte[] bArr3 = bVar2.f3769a;
            int i8 = e4.f16084a;
            int i9 = e4.f16086c;
            int i10 = e4.f16087d;
            bVar2.f3774f = i4;
            bVar2.f3772d = iArr;
            bVar2.f3773e = iArr2;
            bVar2.f3770b = bArr2;
            bVar2.f3769a = bArr3;
            bVar2.f3771c = i8;
            bVar2.f3775g = i9;
            bVar2.f3776h = i10;
            MediaCodec.CryptoInfo cryptoInfo = bVar2.f3777i;
            cryptoInfo.numSubSamples = i4;
            cryptoInfo.numBytesOfClearData = iArr;
            cryptoInfo.numBytesOfEncryptedData = iArr2;
            cryptoInfo.key = bArr2;
            cryptoInfo.iv = bArr3;
            cryptoInfo.mode = i8;
            l2.e eVar = bVar2.f3778j;
            eVar.getClass();
            MediaCodec.CryptoInfo.Pattern pattern = (MediaCodec.CryptoInfo.Pattern) eVar.f14271c;
            pattern.set(i9, i10);
            ((MediaCodec.CryptoInfo) eVar.f14270b).setPattern(pattern);
            long j7 = bVar.f1157b;
            int i11 = (int) (j6 - j7);
            bVar.f1157b = j7 + i11;
            bVar.f1156a -= i11;
        }
        if (!fVar.g(268435456)) {
            fVar.j(bVar.f1156a);
            return c(dVar, bVar.f1157b, fVar.f3781e, bVar.f1156a);
        }
        uVar.J(4);
        S0.d d5 = d(dVar, bVar.f1157b, uVar.f3351a, 4);
        int D3 = uVar.D();
        bVar.f1157b += 4;
        bVar.f1156a -= 4;
        fVar.j(D3);
        S0.d c4 = c(d5, bVar.f1157b, fVar.f3781e, D3);
        bVar.f1157b += D3;
        int i12 = bVar.f1156a - D3;
        bVar.f1156a = i12;
        ByteBuffer byteBuffer = fVar.f3784h;
        if (byteBuffer == null || byteBuffer.capacity() < i12) {
            fVar.f3784h = ByteBuffer.allocate(i12);
        } else {
            fVar.f3784h.clear();
        }
        return c(c4, bVar.f1157b, fVar.f3784h, bVar.f1156a);
    }

    public final void a(long j4) {
        S0.d dVar;
        if (j4 == -1) {
            return;
        }
        while (true) {
            dVar = this.f14939d;
            if (j4 < dVar.f2408b) {
                break;
            }
            B1.j jVar = this.f14936a;
            u0.a aVar = (u0.a) dVar.f2409c;
            synchronized (jVar) {
                u0.e eVar = ((C0141g) jVar.f203d).f4125c;
                synchronized (eVar) {
                    u0.a[] aVarArr = eVar.f15446f;
                    int i4 = eVar.f15445e;
                    eVar.f15445e = i4 + 1;
                    aVarArr[i4] = aVar;
                    eVar.f15444d--;
                    eVar.notifyAll();
                }
                jVar.z(aVar);
            }
            S0.d dVar2 = this.f14939d;
            dVar2.f2409c = null;
            S0.d dVar3 = (S0.d) dVar2.f2410d;
            dVar2.f2410d = null;
            this.f14939d = dVar3;
        }
        if (this.f14940e.f2407a < dVar.f2407a) {
            this.f14940e = dVar;
        }
    }

    public final int b(int i4) {
        u0.a a3;
        S0.d dVar = this.f14941f;
        if (((u0.a) dVar.f2409c) == null) {
            B1.j jVar = this.f14936a;
            synchronized (jVar) {
                a3 = ((C0141g) jVar.f203d).f4125c.a();
                ((HashMap) jVar.f201b).put(a3, (b0.i) jVar.f202c);
                C0140f c0140f = (C0140f) ((C0141g) jVar.f203d).f4136p.get((b0.i) jVar.f202c);
                if (c0140f != null) {
                    synchronized (c0140f) {
                        c0140f.f4109d++;
                    }
                }
            }
            S0.d dVar2 = new S0.d(this.f14941f.f2408b, this.f14937b);
            dVar.f2409c = a3;
            dVar.f2410d = dVar2;
        }
        return Math.min(i4, (int) (this.f14941f.f2408b - this.f14942g));
    }
}
