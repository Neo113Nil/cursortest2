package com.instagram.common.viewpoint.core;

import android.net.Uri;
import android.util.SparseArray;
import android.util.SparseBooleanArray;
import android.util.SparseIntArray;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import org.objectweb.asm.Opcodes;

/* renamed from: com.facebook.ads.redexgen.X.jX, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C1523jX implements GX {
    public static byte[] A0J;
    public static String[] A0K = {"3dZ2NVLPQqqn6A0EUODs8QMiUtGNdx7Z", "xuFjaEC88iswWSp8XVRYQuG7fGDdMX6m", "rjdehGUhBmpCCREwTfVtgF2pvaVk7Y4r", "d6Khp0uOfqWTO1N40QwEt8A6fbOPCRXM", "7DUxEGbk65Je624GBbCgY3TRasgIHugx", "67QtD18zbra6Hv1RLsjBMCgdjZH6dqot", "3juCdNiTPJNnKT5EWnyWnOXcFndGfbid", "ecCIYKwUzA4Q5tjuLJWmpRk8GBJuqhXU"};
    public static final InterfaceC0445Gb A0L;
    public int A00;
    public int A01;
    public int A02;
    public GY A03;
    public C1527jb A04;
    public InterfaceC0552Kf A05;
    public boolean A06;
    public boolean A07;
    public boolean A08;
    public final int A09;
    public final int A0A;
    public final SparseArray<InterfaceC0552Kf> A0B;
    public final SparseBooleanArray A0C;
    public final SparseBooleanArray A0D;
    public final SparseIntArray A0E;
    public final C4J A0F;
    public final KY A0G;
    public final InterfaceC0549Kc A0H;
    public final List<C4R> A0I;

    public static String A0D(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A0J, i, i + i2);
        int i4 = 0;
        while (true) {
            int length = copyOfRange.length;
            if (A0K[5].charAt(9) == '6') {
                throw new RuntimeException();
            }
            A0K[5] = "URhJNiPfEIrBtOuckipDqR7YK4paNHr3";
            if (i4 >= length) {
                return new String(copyOfRange);
            }
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 30);
            i4++;
        }
    }

    public static void A0G() {
        A0J = new byte[]{64, 98, 109, 109, 108, 119, 35, 101, 106, 109, 103, 35, 112, 122, 109, 96, 35, 97, 122, 119, 102, 45, 35, 78, 108, 112, 119, 35, 111, 106, 104, 102, 111, 122, 35, 109, 108, 119, 35, 98, 35, 87, 113, 98, 109, 112, 115, 108, 113, 119, 35, 80, 119, 113, 102, 98, 110, 45};
    }

    static {
        A0G();
        A0L = new InterfaceC0445Gb() { // from class: com.facebook.ads.redexgen.X.ja
            @Override // com.instagram.common.viewpoint.core.InterfaceC0445Gb
            public final GX[] A5F() {
                return C1523jX.A0M();
            }

            @Override // com.instagram.common.viewpoint.core.InterfaceC0445Gb
            public final /* synthetic */ GX[] A5G(Uri uri, Map map) {
                return AbstractC0444Ga.A01(this, uri, map);
            }
        };
    }

    public C1523jX() {
        this(0);
    }

    public C1523jX(int i) {
        this(1, i, 112800);
    }

    public C1523jX(int i, int i2, int i3) {
        this(i, new C4R(0L), new C1545jt(i2), i3);
    }

    public C1523jX(int i, C4R c4r, InterfaceC0549Kc interfaceC0549Kc, int i2) {
        this.A0H = (InterfaceC0549Kc) C3M.A01(interfaceC0549Kc);
        this.A0A = i2;
        this.A09 = i;
        if (i == 1 || i == 2) {
            this.A0I = Collections.singletonList(c4r);
        } else {
            this.A0I = new ArrayList();
            this.A0I.add(c4r);
        }
        this.A0F = new C4J(new byte[9400], 0);
        this.A0C = new SparseBooleanArray();
        this.A0D = new SparseBooleanArray();
        this.A0B = new SparseArray<>();
        this.A0E = new SparseIntArray();
        this.A0G = new KY(i2);
        this.A03 = GY.A00;
        this.A01 = -1;
        A0F();
    }

    private int A00() throws C01042i {
        int A09 = this.A0F.A09();
        int limit = this.A0F.A0A();
        int A00 = AbstractC0553Kg.A00(this.A0F.A0l(), A09, limit);
        this.A0F.A0f(A00);
        int endOfPacket = A00 + Opcodes.NEWARRAY;
        if (endOfPacket > limit) {
            int i = this.A00;
            String[] strArr = A0K;
            String str = strArr[0];
            String str2 = strArr[6];
            int limit2 = str.charAt(22);
            int searchStart = str2.charAt(22);
            if (limit2 == searchStart) {
                throw new RuntimeException();
            }
            A0K[3] = "oFbhmyTyFkRbH7nwLSukkKpVMF9MBiPP";
            this.A00 = i + (A00 - A09);
            if (this.A09 == 2 && this.A00 > 376) {
                throw C01042i.A01(A0D(0, 58, 29), null);
            }
        } else {
            this.A00 = 0;
        }
        return endOfPacket;
    }

    public static /* synthetic */ int A02(C1523jX c1523jX) {
        int i = c1523jX.A02;
        c1523jX.A02 = i + 1;
        return i;
    }

    private void A0F() {
        this.A0C.clear();
        this.A0B.clear();
        SparseArray<InterfaceC0552Kf> A5I = this.A0H.A5I();
        int size = A5I.size();
        for (int i = 0; i < size; i++) {
            SparseArray<InterfaceC0552Kf> sparseArray = this.A0B;
            int initialPayloadReadersSize = A0K[7].charAt(31);
            if (initialPayloadReadersSize != 85) {
                throw new RuntimeException();
            }
            A0K[5] = "Ni66o4kKOCTyHVW4880FmErKiABvWzx3";
            int initialPayloadReadersSize2 = A5I.keyAt(i);
            sparseArray.put(initialPayloadReadersSize2, A5I.valueAt(i));
        }
        this.A0B.put(0, new C1529jd(new C1525jZ(this)));
        this.A05 = null;
    }

    private void A0H(long j) {
        if (!this.A06) {
            this.A06 = true;
            if (this.A0G.A08() != -9223372036854775807L) {
                this.A04 = new C1527jb(this.A0G.A09(), this.A0G.A08(), j, this.A01, this.A0A);
                this.A03.AIN(this.A04.A07());
            } else {
                this.A03.AIN(new C1620lI(this.A0G.A08()));
            }
        }
    }

    private boolean A0I(int i) {
        return this.A09 == 2 || this.A08 || !this.A0D.get(i, false);
    }

    private boolean A0J(InterfaceC1625lN interfaceC1625lN) throws IOException {
        byte[] A0l = this.A0F.A0l();
        if (9400 - this.A0F.A09() < 188) {
            int bytesLeft = this.A0F.A07();
            if (bytesLeft > 0) {
                System.arraycopy(A0l, this.A0F.A09(), A0l, 0, bytesLeft);
            }
            this.A0F.A0j(A0l, bytesLeft);
        }
        while (this.A0F.A07() < 188) {
            int A0A = this.A0F.A0A();
            int limit = interfaceC1625lN.read(A0l, A0A, 9400 - A0A);
            if (limit == -1) {
                return false;
            }
            this.A0F.A0e(A0A + limit);
        }
        return true;
    }

    public static /* synthetic */ GX[] A0M() {
        return new GX[]{new C1523jX()};
    }

    @Override // com.instagram.common.viewpoint.core.GX
    public final void AA4(GY gy) {
        this.A03 = gy;
    }

    @Override // com.instagram.common.viewpoint.core.GX
    public final int AGb(InterfaceC1625lN interfaceC1625lN, C0463Gt c0463Gt) throws IOException {
        InterfaceC0552Kf payloadReader;
        int i;
        long A8G = interfaceC1625lN.A8G();
        if (this.A08) {
            if (((A8G == -1 || this.A09 == 2) ? false : true) && !this.A0G.A0A()) {
                return this.A0G.A07(interfaceC1625lN, c0463Gt, this.A01);
            }
            A0H(A8G);
            if (this.A07) {
                this.A07 = false;
                AIM(0L, 0L);
                if (interfaceC1625lN.A8f() != 0) {
                    c0463Gt.A00 = 0L;
                    return 1;
                }
            }
            C1527jb c1527jb = this.A04;
            if (A0K[3].charAt(3) != 'h') {
                throw new RuntimeException();
            }
            String[] strArr = A0K;
            strArr[0] = "sDiEMLnvjhOTPJNI7EdeGtcVnMMFmFVg";
            strArr[6] = "irXGtuFGajwAGmxrojJd4OjCXPAtU7cs";
            if (c1527jb != null && this.A04.A09()) {
                return this.A04.A06(interfaceC1625lN, c0463Gt);
            }
        }
        boolean A0J2 = A0J(interfaceC1625lN);
        if (A0K[5].charAt(9) == '6') {
            throw new RuntimeException();
        }
        A0K[3] = "pbqhdVjd4r56PJWJm8ke7L1TPhAXhQlh";
        if (!A0J2) {
            return -1;
        }
        int A00 = A00();
        int A0A = this.A0F.A0A();
        if (A00 > A0A) {
            return 0;
        }
        int A0C = this.A0F.A0C();
        if ((8388608 & A0C) == 0) {
            int limit = 0 | ((4194304 & A0C) != 0 ? 1 : 0);
            int packetHeaderFlags = (2096896 & A0C) >> 8;
            int tsPacketHeader = (A0C & 32) != 0 ? 1 : 0;
            if ((A0C & 16) != 0) {
                payloadReader = this.A0B.get(packetHeaderFlags);
            } else {
                payloadReader = null;
            }
            if (payloadReader == null) {
                this.A0F.A0f(A00);
                return 0;
            }
            if (this.A09 != 2) {
                int i2 = A0C & 15;
                int i3 = this.A0E.get(packetHeaderFlags, i2 - 1);
                this.A0E.put(packetHeaderFlags, i2);
                if (i3 == i2) {
                    this.A0F.A0f(A00);
                    return 0;
                }
                if (i2 != ((i3 + 1) & 15)) {
                    payloadReader.AIL();
                }
            }
            if (tsPacketHeader != 0) {
                int A0I = this.A0F.A0I();
                if ((this.A0F.A0I() & 64) != 0) {
                    i = 2;
                } else {
                    i = 0;
                }
                limit |= i;
                this.A0F.A0g(A0I - 1);
            }
            boolean z = this.A08;
            if (A0I(packetHeaderFlags)) {
                this.A0F.A0e(A00);
                payloadReader.A53(this.A0F, limit);
                this.A0F.A0e(A0A);
            }
            if (this.A09 != 2 && !z && this.A08 && A8G != -1) {
                this.A07 = true;
            }
            this.A0F.A0f(A00);
            return 0;
        }
        this.A0F.A0f(A00);
        return 0;
    }

    @Override // com.instagram.common.viewpoint.core.GX
    public final void AGr() {
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x007f, code lost:
    
        throw new java.lang.RuntimeException();
     */
    @Override // com.instagram.common.viewpoint.core.GX
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void AIM(long j, long j2) {
        C3M.A08(this.A09 != 2);
        int size = this.A0I.size();
        int i = 0;
        while (true) {
            if (i < size) {
                C4R c4r = this.A0I.get(i);
                boolean z = c4r.A04() == -9223372036854775807L;
                if (!z) {
                    long A02 = c4r.A02();
                    if (A02 != -9223372036854775807L) {
                        String[] strArr = A0K;
                        if (strArr[0].charAt(22) == strArr[6].charAt(22)) {
                            break;
                        }
                        A0K[1] = "xsireMETvYUgN4sfQ27n1BF88Hpbgatm";
                        if (A02 != 0 && A02 != j2) {
                            z = true;
                        }
                    }
                    z = false;
                }
                if (z) {
                    c4r.A07(j2);
                }
                i++;
            } else if (A0K[3].charAt(3) == 'h') {
                A0K[5] = "QQ4ASPHg1MFvfTvzRH6TwvvGrvMhPJon";
                if (j2 != 0 && this.A04 != null) {
                    this.A04.A08(j2);
                }
                this.A0F.A0d(0);
                this.A0E.clear();
                for (int i2 = 0; i2 < this.A0B.size(); i2++) {
                    this.A0B.valueAt(i2).AIL();
                }
                this.A00 = 0;
                if (A0K[5].charAt(9) != '6') {
                    String[] strArr2 = A0K;
                    strArr2[0] = "GowRIOwCagyGa1SkNIlwyA0nrp7kipic";
                    strArr2[6] = "k5JpOZ1RkOAyzQMCpU3mmbngvjfdQ1X3";
                    return;
                }
                return;
            }
        }
    }

    @Override // com.instagram.common.viewpoint.core.GX
    public final boolean AJL(InterfaceC1625lN interfaceC1625lN) throws IOException {
        byte[] A0l = this.A0F.A0l();
        interfaceC1625lN.AG9(A0l, 0, 940);
        for (int i = 0; i < 188; i++) {
            boolean isSyncBytePatternCorrect = true;
            int i2 = 0;
            while (true) {
                if (i2 >= 5) {
                    break;
                }
                int startPosCandidate = A0l[(i2 * Opcodes.NEWARRAY) + i];
                if (startPosCandidate != 71) {
                    isSyncBytePatternCorrect = false;
                    break;
                }
                i2++;
            }
            if (isSyncBytePatternCorrect) {
                interfaceC1625lN.AJJ(i);
                return true;
            }
        }
        return false;
    }
}
