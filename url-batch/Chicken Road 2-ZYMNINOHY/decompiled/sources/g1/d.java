package g1;

import S0.h;
import T.G;
import T.r;
import W.AbstractC0108a;
import W.J;
import W.u;
import a.AbstractC0124a;
import android.util.Pair;
import io.flutter.embedding.android.KeyboardMap;
import java.nio.ByteOrder;
import java.util.Arrays;
import y0.F;
import y0.n;
import y0.o;
import y0.p;

/* loaded from: classes.dex */
public final class d implements n {

    /* renamed from: a, reason: collision with root package name */
    public p f9019a;

    /* renamed from: b, reason: collision with root package name */
    public F f9020b;

    /* renamed from: e, reason: collision with root package name */
    public InterfaceC0438b f9023e;

    /* renamed from: c, reason: collision with root package name */
    public int f9021c = 0;

    /* renamed from: d, reason: collision with root package name */
    public long f9022d = -1;

    /* renamed from: f, reason: collision with root package name */
    public int f9024f = -1;

    /* renamed from: g, reason: collision with root package name */
    public long f9025g = -1;

    @Override // y0.n
    public final void a(long j4, long j5) {
        this.f9021c = j4 == 0 ? 0 : 4;
        InterfaceC0438b interfaceC0438b = this.f9023e;
        if (interfaceC0438b != null) {
            interfaceC0438b.a(j5);
        }
    }

    @Override // y0.n
    public final boolean b(o oVar) {
        return f.a(oVar);
    }

    /* JADX WARN: Code restructure failed: missing block: B:73:0x0213, code lost:
    
        if (r9 != 65534) goto L78;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x021a, code lost:
    
        if (r2 == 32) goto L81;
     */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0228  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x023a  */
    @Override // y0.n
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int c(o oVar, r rVar) {
        byte[] bArr;
        int i4;
        this.f9020b.getClass();
        String str = J.f3263a;
        int i5 = this.f9021c;
        int i6 = 4;
        if (i5 == 0) {
            AbstractC0124a.t(oVar.getPosition() == 0);
            int i7 = this.f9024f;
            if (i7 != -1) {
                oVar.v(i7);
                this.f9021c = 4;
                return 0;
            }
            if (!f.a(oVar)) {
                throw G.a(null, "Unsupported or unrecognized wav file type.");
            }
            oVar.v((int) (oVar.m() - oVar.getPosition()));
            this.f9021c = 1;
            return 0;
        }
        long j4 = -1;
        if (i5 == 1) {
            u uVar = new u(8);
            e b4 = e.b(oVar, uVar);
            if (b4.f9026a != 1685272116) {
                oVar.u();
            } else {
                oVar.o(8);
                uVar.M(0);
                oVar.E(uVar.f3351a, 0, 8);
                j4 = uVar.p();
                oVar.v(((int) b4.f9027b) + 8);
            }
            this.f9022d = j4;
            this.f9021c = 2;
            return 0;
        }
        if (i5 != 2) {
            if (i5 != 3) {
                if (i5 != 4) {
                    throw new IllegalStateException();
                }
                AbstractC0124a.t(this.f9025g != -1);
                long position = this.f9025g - oVar.getPosition();
                InterfaceC0438b interfaceC0438b = this.f9023e;
                interfaceC0438b.getClass();
                return interfaceC0438b.b(oVar, position) ? -1 : 0;
            }
            oVar.u();
            e b5 = f.b(1684108385, oVar, new u(8));
            oVar.v(8);
            Pair create = Pair.create(Long.valueOf(oVar.getPosition()), Long.valueOf(b5.f9027b));
            this.f9024f = ((Long) create.first).intValue();
            long longValue = ((Long) create.second).longValue();
            long j5 = this.f9022d;
            if (j5 != -1 && longValue == KeyboardMap.kValueMask) {
                longValue = j5;
            }
            this.f9025g = this.f9024f + longValue;
            long length = oVar.getLength();
            if (length != -1 && this.f9025g > length) {
                AbstractC0108a.s("WavExtractor", "Data exceeds input length: " + this.f9025g + ", " + length);
                this.f9025g = length;
            }
            InterfaceC0438b interfaceC0438b2 = this.f9023e;
            interfaceC0438b2.getClass();
            interfaceC0438b2.c(this.f9024f, this.f9025g);
            this.f9021c = 4;
            return 0;
        }
        u uVar2 = new u(16);
        long j6 = f.b(1718449184, oVar, uVar2).f9027b;
        AbstractC0124a.t(j6 >= 16);
        oVar.E(uVar2.f3351a, 0, 16);
        uVar2.M(0);
        int s4 = uVar2.s();
        int s5 = uVar2.s();
        int r4 = uVar2.r();
        uVar2.r();
        int s6 = uVar2.s();
        int s7 = uVar2.s();
        int i8 = ((int) j6) - 16;
        if (i8 > 0) {
            bArr = new byte[i8];
            oVar.E(bArr, 0, i8);
            if (s4 == 65534 && i8 == 24) {
                u uVar3 = new u(bArr);
                uVar3.s();
                int s8 = uVar3.s();
                if (s8 != 0 && s8 != s7) {
                    throw G.c("validBits ( " + s8 + ")  != bitsPerSample( " + s7 + ") are not supported");
                }
                int r5 = uVar3.r();
                if ((r5 >> 18) != 0) {
                    throw G.c("invalid channel mask " + r5);
                }
                if (r5 != 0 && Integer.bitCount(r5) != s5) {
                    throw G.c("invalid number of channels (" + Integer.bitCount(r5) + ") in channel mask " + r5);
                }
                s4 = uVar3.s();
                byte[] bArr2 = new byte[14];
                uVar3.k(bArr2, 0, 14);
                if (!Arrays.equals(bArr2, f.f9028a) && !Arrays.equals(bArr2, f.f9029b)) {
                    throw G.c("invalid wav format extension guid");
                }
            }
        } else {
            bArr = J.f3264b;
        }
        oVar.v((int) (oVar.m() - oVar.getPosition()));
        h hVar = new h();
        hVar.f2418a = s5;
        hVar.f2419b = r4;
        hVar.f2420c = s6;
        hVar.f2421d = s7;
        hVar.f2422e = bArr;
        if (s4 == 17) {
            this.f9023e = new C0437a(this.f9019a, this.f9020b, hVar);
        } else if (s4 == 6) {
            this.f9023e = new C0439c(this.f9019a, this.f9020b, hVar, "audio/g711-alaw", -1);
        } else if (s4 == 7) {
            this.f9023e = new C0439c(this.f9019a, this.f9020b, hVar, "audio/g711-mlaw", -1);
        } else {
            if (s4 != 1) {
                if (s4 != 3) {
                }
                i4 = 0;
                if (i4 != 0) {
                    throw G.c("Unsupported WAV format type: " + s4);
                }
                this.f9023e = new C0439c(this.f9019a, this.f9020b, hVar, "audio/raw", i4);
            }
            i6 = J.B(s7, ByteOrder.LITTLE_ENDIAN);
            i4 = i6;
            if (i4 != 0) {
            }
        }
        this.f9021c = 3;
        return 0;
    }

    @Override // y0.n
    public final void e(p pVar) {
        this.f9019a = pVar;
        this.f9020b = pVar.z(0, 1);
        pVar.r();
    }

    @Override // y0.n
    public final void release() {
    }
}
