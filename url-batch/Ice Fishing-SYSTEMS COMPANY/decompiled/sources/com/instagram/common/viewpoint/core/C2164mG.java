package com.instagram.common.viewpoint.core;

import android.net.Uri;
import com.anythink.basead.exoplayer.b;
import com.facebook.ads.androidx.media3.common.Metadata;
import com.facebook.ads.androidx.media3.extractor.metadata.id3.Id3Frame;
import com.facebook.ads.androidx.media3.extractor.metadata.id3.MlltFrame;
import com.facebook.ads.androidx.media3.extractor.metadata.id3.TextInformationFrame;
import com.facebook.video.heroplayer.exocustom.MetaExoPlayerCustomization;
import java.io.EOFException;
import java.io.IOException;
import java.util.Arrays;
import java.util.Map;
import org.checkerframework.checker.nullness.qual.EnsuresNonNull;
import org.checkerframework.checker.nullness.qual.RequiresNonNull;

@MetaExoPlayerCustomization("DoNotStrip")
/* renamed from: com.facebook.ads.redexgen.X.mG, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public final class C2164mG implements H9 {
    public static byte[] A0K;
    public static String[] A0L = {"", "XN01ItT2bHY64Udo8U0rv5VGSzBxMc17", "LZob5GHcOm1BKJQ2vQEKg44UBdoAB", "Ux8BYUlKxCzUFwXHW791pvzO", "", "EYpHAHesBPuZwNRi93BVygfvwpQNuwRz", "BndnCdJGei78P0VEYjqxuWcWalVGolEJ", "FxTwI"};
    public static final HD A0M;
    public static final IE A0N;
    public int A00;
    public int A01;
    public long A02;
    public long A03;
    public long A04;
    public long A05;
    public Metadata A06;
    public HA A07;
    public InterfaceC0946Hd A08;
    public InterfaceC0946Hd A09;
    public InterfaceC2163mF A0A;
    public boolean A0B;
    public boolean A0C;
    public final int A0D;
    public final long A0E;
    public final C06464v A0F;
    public final HK A0G;
    public final HM A0H;
    public final HN A0I;
    public final InterfaceC0946Hd A0J;

    public static String A09(int i, int i4, int i9) {
        byte[] copyOfRange = Arrays.copyOfRange(A0K, i, i + i4);
        for (int i10 = 0; i10 < copyOfRange.length; i10++) {
            copyOfRange[i10] = (byte) ((copyOfRange[i10] - i9) - 44);
        }
        return new String(copyOfRange);
    }

    public static void A0B() {
        A0K = new byte[]{-78, -60, -64, -47, -62, -57, -60, -61, Byte.MAX_VALUE, -45, -50, -50, Byte.MAX_VALUE, -52, -64, -51, -40, Byte.MAX_VALUE, -63, -40, -45, -60, -46, -115, -27, -35, -42, -33};
        if (A0L[5].charAt(24) == 'i') {
            throw new RuntimeException();
        }
        String[] strArr = A0L;
        strArr[1] = "rBULd6kp2sYKxjbrN7jKkVDhSodb4v28";
        strArr[6] = "gBWiztBtWh7JHxCzKYVaG6CraVXBuCHm";
    }

    static {
        A0B();
        A0M = new HD() { // from class: com.facebook.ads.redexgen.X.mI
            @Override // com.instagram.common.viewpoint.core.HD
            public final H9[] A5N() {
                return C2164mG.A0G();
            }

            @Override // com.instagram.common.viewpoint.core.HD
            public final /* synthetic */ H9[] A5O(Uri uri, Map map) {
                return HC.A01(this, uri, map);
            }
        };
        A0N = new IE() { // from class: com.facebook.ads.redexgen.X.mH
            @Override // com.instagram.common.viewpoint.core.IE
            public final boolean A6Q(int i, int i4, int i9, int i10, int i11) {
                return C2164mG.A0C(i, i4, i9, i10, i11);
            }
        };
    }

    @MetaExoPlayerCustomization("DoNotStrip")
    public C2164mG() {
        this(0);
    }

    @MetaExoPlayerCustomization("DoNotStrip")
    public C2164mG(int i) {
        this(i, b.f6539b);
    }

    @MetaExoPlayerCustomization("DoNotStrip")
    public C2164mG(int i, long j9) {
        this.A0D = (i & 2) != 0 ? i | 1 : i;
        this.A0E = j9;
        this.A0F = new C06464v(10);
        this.A0I = new HN();
        this.A0G = new HK();
        this.A02 = b.f6539b;
        this.A0H = new HM();
        this.A0J = new C2191mt();
        this.A08 = this.A0J;
    }

    public static int A00(C06464v c06464v, int i) {
        if (c06464v.A0A() >= i + 4) {
            c06464v.A0f(i);
            if (A0L[5].charAt(24) == 'i') {
                throw new RuntimeException();
            }
            A0L[3] = "hnNDf1WGfP5HptxyzX0WY3yEy4CiO";
            int A0C = c06464v.A0C();
            if (A0C == 1483304551 || A0C == 1231971951) {
                return A0C;
            }
        }
        if (c06464v.A0A() >= 40) {
            c06464v.A0f(36);
            return c06464v.A0C() == 1447187017 ? 1447187017 : 0;
        }
        return 0;
    }

    @RequiresNonNull({"extractorOutput", "realTrackOutput"})
    private int A01(InterfaceC2190ms interfaceC2190ms) throws IOException {
        if (this.A01 == 0) {
            try {
                A0F(interfaceC2190ms, false);
            } catch (EOFException unused) {
                return -1;
            }
        }
        if (this.A0A == null) {
            this.A0A = A07(interfaceC2190ms);
            this.A07.AJ7(this.A0A);
            this.A08.A6e(new C05902p().A11(this.A0I.A06).A0h(4096).A0b(this.A0I.A01).A0m(this.A0I.A03).A0d(this.A0G.A00).A0e(this.A0G.A01).A0v((this.A0D & 8) != 0 ? null : this.A06).A14());
            this.A03 = interfaceC2190ms.A8n();
        } else if (this.A03 != 0) {
            long A8n = interfaceC2190ms.A8n();
            if (A8n < this.A03) {
                interfaceC2190ms.AK3((int) (this.A03 - A8n));
            }
        }
        return A02(interfaceC2190ms);
    }

    @RequiresNonNull({"realTrackOutput", "seeker"})
    private int A02(InterfaceC2190ms interfaceC2190ms) throws IOException {
        if (this.A00 == 0) {
            interfaceC2190ms.AIl();
            if (A0E(interfaceC2190ms)) {
                return -1;
            }
            this.A0F.A0f(0);
            int A0C = this.A0F.A0C();
            int sampleHeaderData = this.A01;
            if (A0D(A0C, sampleHeaderData)) {
                int sampleHeaderData2 = HO.A00(A0C);
                if (sampleHeaderData2 != -1) {
                    this.A0I.A00(A0C);
                    if (this.A02 == b.f6539b) {
                        this.A02 = this.A0A.A9H(interfaceC2190ms.A8n());
                        if (this.A0E != b.f6539b) {
                            this.A02 += this.A0E - this.A0A.A9H(0L);
                        }
                    }
                    int sampleHeaderData3 = this.A0I.A02;
                    this.A00 = sampleHeaderData3;
                    if (this.A0A instanceof C07308b) {
                        C07308b c07308b = (C07308b) this.A0A;
                        long j9 = this.A04;
                        int sampleHeaderData4 = this.A0I.A04;
                        long A03 = A03(j9 + sampleHeaderData4);
                        long A8n = interfaceC2190ms.A8n();
                        int sampleHeaderData5 = this.A0I.A02;
                        c07308b.A01(A03, A8n + sampleHeaderData5);
                        if (this.A0C && c07308b.A02(this.A05)) {
                            this.A0C = false;
                            this.A08 = this.A09;
                        }
                    }
                }
            }
            interfaceC2190ms.AK3(1);
            this.A01 = 0;
            return 0;
        }
        int AIp = this.A08.AIp(interfaceC2190ms, this.A00, true);
        if (AIp == -1) {
            return -1;
        }
        int bytesAppended = this.A00;
        this.A00 = bytesAppended - AIp;
        int bytesAppended2 = this.A00;
        if (bytesAppended2 > 0) {
            return 0;
        }
        this.A08.AIu(A03(this.A04), 1, this.A0I.A02, 0, null);
        if (A0L[5].charAt(24) == 'i') {
            throw new RuntimeException();
        }
        A0L[3] = "39D9RtME66Nzc4lHdRGQvnw";
        long j10 = this.A04;
        int bytesAppended3 = this.A0I.A04;
        this.A04 = j10 + bytesAppended3;
        this.A00 = 0;
        return 0;
    }

    private long A03(long j9) {
        return this.A02 + ((1000000 * j9) / this.A0I.A03);
    }

    public static long A04(Metadata metadata) {
        if (metadata != null) {
            int A02 = metadata.A02();
            for (int i = 0; i < A02; i++) {
                Metadata.Entry A03 = metadata.A03(i);
                if ((A03 instanceof TextInformationFrame) && ((Id3Frame) ((TextInformationFrame) A03)).A00.equals(A09(24, 4, 101))) {
                    return C5C.A0O(Long.parseLong(((TextInformationFrame) A03).A02.get(0)));
                }
            }
            return b.f6539b;
        }
        return b.f6539b;
    }

    private C07378i A05(InterfaceC2190ms interfaceC2190ms, boolean z8) throws IOException {
        interfaceC2190ms.AGt(this.A0F.A0l(), 0, 4);
        this.A0F.A0f(0);
        this.A0I.A00(this.A0F.A0C());
        return new C07378i(interfaceC2190ms.A8O(), interfaceC2190ms.A8n(), this.A0I, z8);
    }

    public static C8X A06(Metadata metadata, long j9) {
        if (metadata != null) {
            int A02 = metadata.A02();
            for (int i = 0; i < A02; i++) {
                Metadata.Entry entry = metadata.A03(i);
                if (entry instanceof MlltFrame) {
                    return C8X.A01(j9, (MlltFrame) entry, A04(metadata));
                }
            }
            return null;
        }
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x0082, code lost:
    
        if ((r5 & 2) != 0) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0095, code lost:
    
        r4 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0092, code lost:
    
        if ((r5 & 2) != 0) goto L24;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private InterfaceC2163mF A07(InterfaceC2190ms interfaceC2190ms) throws IOException {
        long durationUs;
        InterfaceC2163mF A08 = A08(interfaceC2190ms);
        InterfaceC2163mF seekFrameSeeker = A06(this.A06, interfaceC2190ms.A8n());
        if (this.A0B) {
            return new C8W();
        }
        InterfaceC2163mF interfaceC2163mF = null;
        if ((this.A0D & 4) != 0) {
            long j9 = -1;
            if (seekFrameSeeker != null) {
                durationUs = seekFrameSeeker.A7t();
                j9 = seekFrameSeeker.A7j();
            } else if (A08 != null) {
                durationUs = A08.A7t();
                j9 = A08.A7j();
            } else {
                durationUs = A04(this.A06);
            }
            interfaceC2163mF = new C07308b(durationUs, interfaceC2190ms.A8n(), j9);
        } else if (seekFrameSeeker != null) {
            interfaceC2163mF = seekFrameSeeker;
        } else if (A08 != null) {
            interfaceC2163mF = A08;
        }
        boolean z8 = true;
        String[] strArr = A0L;
        if (strArr[1].charAt(10) == strArr[6].charAt(10)) {
            throw new RuntimeException();
        }
        String[] strArr2 = A0L;
        strArr2[7] = "puIT5";
        strArr2[4] = "";
        if (interfaceC2163mF == null || (!interfaceC2163mF.AAj() && (this.A0D & 1) != 0)) {
            int i = this.A0D;
            if (A0L[5].charAt(24) != 'i') {
                String[] strArr3 = A0L;
                strArr3[7] = "yAfIM";
                strArr3[4] = "";
            } else {
                A0L[5] = "MGo95V6JQFDSGlQkmGWT48KfEqhrmySi";
            }
            return A05(interfaceC2190ms, z8);
        }
        return interfaceC2163mF;
    }

    private InterfaceC2163mF A08(InterfaceC2190ms interfaceC2190ms) throws IOException {
        C06464v c06464v = new C06464v(this.A0I.A02);
        interfaceC2190ms.AGt(c06464v.A0l(), 0, this.A0I.A02);
        int i = 21;
        if ((this.A0I.A05 & 1) != 0) {
            if (this.A0I.A01 != 1) {
                i = 36;
            }
        } else if (this.A0I.A01 == 1) {
            i = 13;
        }
        int A00 = A00(c06464v, i);
        if (A00 == 1483304551 || A00 == 1231971951) {
            C8U A01 = C8U.A01(interfaceC2190ms.A8O(), interfaceC2190ms.A8n(), this.A0I, c06464v);
            if (A01 != null && !this.A0G.A03()) {
                interfaceC2190ms.AIl();
                interfaceC2190ms.A47(i + 141);
                C06464v frame = this.A0F;
                interfaceC2190ms.AGt(frame.A0l(), 0, 3);
                C06464v frame2 = this.A0F;
                frame2.A0f(0);
                HK hk = this.A0G;
                C06464v frame3 = this.A0F;
                hk.A04(frame3.A0K());
            }
            interfaceC2190ms.AK3(this.A0I.A02);
            if (A01 != null && !A01.AAj() && A00 == 1231971951) {
                C07378i A05 = A05(interfaceC2190ms, false);
                String[] strArr = A0L;
                String str = strArr[7];
                String str2 = strArr[4];
                int xingBase = str.length();
                if (xingBase == str2.length()) {
                    throw new RuntimeException();
                }
                String[] strArr2 = A0L;
                strArr2[1] = "bGvlWKvJjPQrySHefRGmEijHbVzYOxUK";
                strArr2[6] = "fU58RXvZc6f3KsNNOCISAUQgLzoCeDCK";
                return A05;
            }
            return A01;
        }
        if (A00 == 1447187017) {
            C8V A002 = C8V.A00(interfaceC2190ms.A8O(), interfaceC2190ms.A8n(), this.A0I, c06464v);
            interfaceC2190ms.AK3(this.A0I.A02);
            return A002;
        }
        interfaceC2190ms.AIl();
        return null;
    }

    @EnsuresNonNull({"extractorOutput", "realTrackOutput"})
    private void A0A() {
        AbstractC06233y.A02(this.A09);
    }

    public static /* synthetic */ boolean A0C(int i, int i4, int i9, int i10, int i11) {
        if (i4 != 67 || i9 != 79 || i10 != 77 || (i11 != 77 && i != 2)) {
            if (i4 == 77) {
                if (A0L[5].charAt(24) == 'i') {
                    throw new RuntimeException();
                }
                String[] strArr = A0L;
                strArr[2] = "NxAl2v4obD3CfxY1bwrYNdaYMjSl6";
                strArr[0] = "";
                if (i9 != 76 || i10 != 76 || (i11 != 84 && i != 2)) {
                }
            }
            return false;
        }
        return true;
    }

    public static boolean A0D(int i, long j9) {
        return ((long) ((-128000) & i)) == ((-128000) & j9);
    }

    private boolean A0E(InterfaceC2190ms interfaceC2190ms) throws IOException {
        if (this.A0A != null) {
            long A7j = this.A0A.A7j();
            if (A7j != -1) {
                long dataEndPosition = interfaceC2190ms.A8i();
                if (dataEndPosition > A7j - 4) {
                    return true;
                }
            }
        }
        try {
            return !interfaceC2190ms.AGu(this.A0F.A0l(), 0, 4, true);
        } catch (EOFException unused) {
            return true;
        }
    }

    private boolean A0F(InterfaceC2190ms interfaceC2190ms, boolean z8) throws IOException {
        int candidateSynchronizedHeaderData;
        int i = 0;
        int i4 = 0;
        int i9 = 0;
        int searchedBytes = 0;
        int headerData = z8 ? 32768 : 131072;
        interfaceC2190ms.AIl();
        if (interfaceC2190ms.A8n() == 0) {
            int validFrameCount = this.A0D;
            int validFrameCount2 = (validFrameCount & 8) == 0 ? 1 : 0;
            this.A06 = this.A0H.A00(interfaceC2190ms, validFrameCount2 != 0 ? null : A0N);
            if (this.A06 != null) {
                this.A0G.A05(this.A06);
            }
            i9 = (int) interfaceC2190ms.A8i();
            if (!z8) {
                interfaceC2190ms.AK3(i9);
            }
        }
        while (true) {
            if (A0E(interfaceC2190ms)) {
                if (i <= 0) {
                    throw new EOFException();
                }
            } else {
                this.A0F.A0f(0);
                int A0C = this.A0F.A0C();
                if ((i4 != 0 && !A0D(A0C, i4)) || (candidateSynchronizedHeaderData = HO.A00(A0C)) == -1) {
                    int candidateSynchronizedHeaderData2 = searchedBytes + 1;
                    if (searchedBytes == headerData) {
                        if (z8) {
                            return false;
                        }
                        throw C3K.A01(A09(0, 24, 51), null);
                    }
                    i = 0;
                    i4 = 0;
                    if (z8) {
                        interfaceC2190ms.AIl();
                        int validFrameCount3 = i9 + candidateSynchronizedHeaderData2;
                        interfaceC2190ms.A47(validFrameCount3);
                    } else {
                        interfaceC2190ms.AK3(1);
                    }
                    searchedBytes = candidateSynchronizedHeaderData2;
                } else {
                    i++;
                    if (i == 1) {
                        this.A0I.A00(A0C);
                        i4 = A0C;
                    } else if (i == 4) {
                        break;
                    }
                    int validFrameCount4 = candidateSynchronizedHeaderData - 4;
                    interfaceC2190ms.A47(validFrameCount4);
                }
            }
        }
        if (z8) {
            interfaceC2190ms.AK3(i9 + searchedBytes);
        } else {
            interfaceC2190ms.AIl();
        }
        this.A01 = i4;
        if (A0L[5].charAt(24) == 105) {
            throw new RuntimeException();
        }
        String[] strArr = A0L;
        strArr[7] = "Yv6sT";
        strArr[4] = "";
        return true;
    }

    public static /* synthetic */ H9[] A0G() {
        return new H9[]{new C2164mG()};
    }

    @Override // com.instagram.common.viewpoint.core.H9
    public final void AAC(HA ha) {
        this.A07 = ha;
        this.A09 = this.A07.AKS(0, 1);
        this.A08 = this.A09;
        this.A07.A6O();
    }

    @Override // com.instagram.common.viewpoint.core.H9
    public final int AHL(InterfaceC2190ms interfaceC2190ms, HV hv) throws IOException {
        A0A();
        int A01 = A01(interfaceC2190ms);
        if (A01 == -1 && (this.A0A instanceof C07308b)) {
            long A03 = A03(this.A04);
            long durationUs = this.A0A.A7t();
            if (durationUs != A03) {
                ((C07308b) this.A0A).A00(A03);
                this.A07.AJ7(this.A0A);
            }
        }
        return A01;
    }

    @Override // com.instagram.common.viewpoint.core.H9
    public final void AHb() {
    }

    @Override // com.instagram.common.viewpoint.core.H9
    public final void AJ6(long j9, long j10) {
        this.A01 = 0;
        this.A02 = b.f6539b;
        this.A04 = 0L;
        this.A00 = 0;
        this.A05 = j10;
        if ((this.A0A instanceof C07308b) && !((C07308b) this.A0A).A02(j10)) {
            this.A0C = true;
            this.A08 = this.A0J;
        }
    }

    @Override // com.instagram.common.viewpoint.core.H9
    public final boolean AK5(InterfaceC2190ms interfaceC2190ms) throws IOException {
        return A0F(interfaceC2190ms, true);
    }
}
