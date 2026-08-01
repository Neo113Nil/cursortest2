package com.facebook.ads.redexgen.X;

import com.facebook.ads.internal.exoplayer2.thirdparty.Format;
import com.facebook.ads.internal.exoplayer2.thirdparty.metadata.Metadata;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.Wc, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C0917Wc implements InterfaceC0399Ba, InterfaceC0406Bj {
    public static byte[] A0J;
    public static String[] A0K = {"NMENm2VVY4CjFU7qkzTmTxviYk7AnS7Z", "JBVFfjWytxpjUnZZ6lInsU7tzfFzOPaX", "YaevPinMBRqhVFzNm59vwI8bFO4cI8AD", "52TqclTutshaaFkrwJ4nyJTeA2xWvRpu", "JGseDZtum4mqdbq3nSxMUnsGXrSMUYmk", "xuKwDkc3QqvJvTm3i1k9vAbPWWVSjov2", "2GdyUNwnHd6eSNq3THJOdF5Wjs3u7UdX", "VVA8bJ0ju0kVaqoWpNH4VPWsYewebzZE"};
    public static final InterfaceC0402Bd A0L;
    public static final int A0M;
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public int A04;
    public int A05;
    public int A06;
    public long A07;
    public long A08;
    public InterfaceC0401Bc A09;
    public C0541Hh A0A;
    public boolean A0B;
    public CG[] A0C;
    public long[][] A0D;
    public final int A0E;
    public final C0541Hh A0F;
    public final C0541Hh A0G;
    public final C0541Hh A0H;
    public final ArrayDeque<C0925Wk> A0I;

    public static String A04(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A0J, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 32);
        }
        return new String(copyOfRange);
    }

    public static void A07() {
        A0J = new byte[]{107, 94, 69, 71, 10, 89, 67, 80, 79, 10, 70, 79, 89, 89, 10, 94, 66, 75, 68, 10, 66, 79, 75, 78, 79, 88, 10, 70, 79, 68, 77, 94, 66, 10, 2, 95, 68, 89, 95, 90, 90, 69, 88, 94, 79, 78, 3, 4, 104, 109, 57, 57};
    }

    static {
        A07();
        A0L = new C0918Wd();
        A0M = C0557Hx.A08(A04(48, 4, 57));
    }

    public C0917Wc() {
        this(0);
    }

    public C0917Wc(int i) {
        this.A0E = i;
        this.A0F = new C0541Hh(16);
        this.A0I = new ArrayDeque<>();
        this.A0H = new C0541Hh(C0537Hd.A03);
        this.A0G = new C0541Hh(4);
        this.A06 = -1;
    }

    private int A00(long j) {
        long sampleAccumulatedBytes = Long.MAX_VALUE;
        int i = 1;
        int i2 = -1;
        long j2 = Long.MAX_VALUE;
        long j3 = Long.MAX_VALUE;
        int trackIndex = 1;
        int minAccumulatedBytesTrackIndex = -1;
        int i3 = 0;
        while (true) {
            CG[] cgArr = this.A0C;
            if (i3 >= cgArr.length) {
                if (j3 == Long.MAX_VALUE || trackIndex == 0) {
                    return i2;
                }
                long preferredSkipAmount = 10485760 + j3;
                if (j2 < preferredSkipAmount) {
                    return i2;
                }
                return minAccumulatedBytesTrackIndex;
            }
            CG cg = cgArr[i3];
            int i4 = cg.A00;
            if (i4 != cg.A03.A01) {
                long j4 = cg.A03.A06[i4];
                String[] strArr = A0K;
                if (strArr[2].charAt(0) == strArr[4].charAt(0)) {
                    throw new RuntimeException();
                }
                A0K[7] = "SNUxNBsUQVazn7VwiZNUPsjETt3vlrb9";
                long j5 = this.A0D[i3][i4];
                long j6 = j4 - j;
                int i5 = (j6 < 0 || j6 >= 262144) ? 1 : 0;
                if ((i5 == 0 && i != 0) || (i5 == i && j6 < sampleAccumulatedBytes)) {
                    i = i5;
                    sampleAccumulatedBytes = j6;
                    i2 = i3;
                    j2 = j5;
                }
                if (j5 < j3) {
                    j3 = j5;
                    trackIndex = i5;
                    minAccumulatedBytesTrackIndex = i3;
                }
            }
            i3++;
        }
    }

    private int A01(InterfaceC0400Bb interfaceC0400Bb, C0404Bh c0404Bh) throws IOException, InterruptedException {
        int i;
        long A7a = interfaceC0400Bb.A7a();
        if (this.A06 == -1) {
            int A00 = A00(A7a);
            this.A06 = A00;
            if (A00 == -1) {
                return -1;
            }
        }
        CG cg = this.A0C[this.A06];
        InterfaceC0409Bm trackOutput = cg.A01;
        int i2 = cg.A00;
        long j = cg.A03.A06[i2];
        int i3 = cg.A03.A05[i2];
        long j2 = (j - A7a) + this.A04;
        if (j2 < 0 || j2 >= 262144) {
            c0404Bh.A00 = j;
            return 1;
        }
        if (cg.A02.A02 == 1) {
            j2 += 8;
            i3 -= 8;
        }
        interfaceC0400Bb.AFe((int) j2);
        int sampleSize = cg.A02.A01;
        String[] strArr = A0K;
        if (strArr[5].charAt(6) == strArr[3].charAt(6)) {
            throw new RuntimeException();
        }
        String[] strArr2 = A0K;
        strArr2[2] = "Kr0RNkXRcq3MKFcdyeDViEL730qvS1Or";
        strArr2[4] = "dsHpYadjIesMKkl8nKWo5Xy2zI1EHMvq";
        if (sampleSize != 0) {
            byte[] bArr = this.A0G.A00;
            bArr[0] = 0;
            bArr[1] = 0;
            bArr[2] = 0;
            int nalUnitLengthFieldLength = cg.A02.A01;
            int i4 = 4 - cg.A02.A01;
            while (this.A04 < i3) {
                int i5 = this.A05;
                if (i5 == 0) {
                    interfaceC0400Bb.readFully(this.A0G.A00, i4, nalUnitLengthFieldLength);
                    this.A0G.A0Y(0);
                    this.A05 = this.A0G.A0H();
                    this.A0H.A0Y(0);
                    trackOutput.AEr(this.A0H, 4);
                    this.A04 += 4;
                    i3 += i4;
                } else {
                    int AEq = trackOutput.AEq(interfaceC0400Bb, i5, false);
                    this.A04 += AEq;
                    this.A05 -= AEq;
                }
            }
            i = 0;
        } else {
            while (true) {
                int i6 = this.A04;
                if (i6 >= i3) {
                    break;
                }
                int AEq2 = trackOutput.AEq(interfaceC0400Bb, i3 - i6, false);
                this.A04 += AEq2;
                this.A05 -= AEq2;
            }
            i = 0;
        }
        long[] jArr = cg.A03.A07;
        String[] strArr3 = A0K;
        if (strArr3[0].charAt(11) != strArr3[1].charAt(11)) {
            A0K[6] = "rOKgrdqhHdXOkXubOIefZGVtdh7cvyNY";
            trackOutput.AEs(jArr[i2], cg.A03.A04[i2], i3, 0, null);
            cg.A00 += 0;
            this.A06 = -1;
            this.A04 = i;
            this.A05 = i;
            return i;
        }
        A0K[6] = "wHchi0wLq1ErSeSpKTFcZRDvkUCQV0RS";
        trackOutput.AEs(jArr[i2], cg.A03.A04[i2], i3, 0, null);
        cg.A00++;
        this.A06 = -1;
        this.A04 = i;
        this.A05 = i;
        return i;
    }

    public static int A02(CP cp, long j) {
        int A00 = cp.A00(j);
        if (A00 == -1) {
            return cp.A01(j);
        }
        return A00;
    }

    public static long A03(CP cp, long j, long j2) {
        int A02 = A02(cp, j);
        if (A02 == -1) {
            return j2;
        }
        long min = Math.min(cp.A06[A02], j2);
        if (A0K[6].charAt(20) == 'b') {
            throw new RuntimeException();
        }
        String[] strArr = A0K;
        strArr[5] = "p3vbyKglgBhvg6ga7RihuDYjPakbSwaT";
        strArr[3] = "aiiDKqFmbgCXZZv8uVJN0mXFbRvDRlE6";
        return min;
    }

    private ArrayList<CP> A05(C0925Wk c0925Wk, C0403Be c0403Be, boolean z) throws C03519d {
        CM A0C;
        ArrayList<CP> arrayList = new ArrayList<>();
        for (int i = 0; i < c0925Wk.A01.size(); i++) {
            C0925Wk c0925Wk2 = c0925Wk.A01.get(i);
            int i2 = ((C1) c0925Wk2).A00;
            if (i2 == C1.A1M && (A0C = C6.A0C(c0925Wk2, c0925Wk.A07(C1.A0o), -9223372036854775807L, null, z, this.A0B)) != null) {
                CP A0E = C6.A0E(A0C, c0925Wk2.A06(C1.A0e).A06(C1.A0i).A06(C1.A17), c0403Be);
                if (A0E.A01 != 0) {
                    arrayList.add(A0E);
                }
            }
        }
        return arrayList;
    }

    private void A06() {
        this.A03 = 0;
        this.A00 = 0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x0061, code lost:
    
        if (r5.A03 == 2) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0063, code lost:
    
        A06();
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0066, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:?, code lost:
    
        return;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void A08(long j) throws C03519d {
        while (true) {
            boolean isEmpty = this.A0I.isEmpty();
            if (A0K[7].charAt(14) == 'r') {
                throw new RuntimeException();
            }
            String[] strArr = A0K;
            strArr[0] = "xKK31fned0mjTVppOAxzoNj9viNrlryO";
            strArr[1] = "3HkC7zoZl6jjTlZPcBHC3lXiUTtQlSXh";
            if (isEmpty || this.A0I.peek().A00 != j) {
                break;
            }
            C0925Wk pop = this.A0I.pop();
            if (((C1) pop).A00 == C1.A0k) {
                A0A(pop);
                this.A0I.clear();
                this.A03 = 2;
            } else if (!this.A0I.isEmpty()) {
                C0925Wk containerAtom = this.A0I.peek();
                containerAtom.A08(pop);
            }
        }
    }

    private void A09(long j) {
        for (CG cg : this.A0C) {
            CP cp = cg.A03;
            int A00 = cp.A00(j);
            if (A00 == -1) {
                A00 = cp.A01(j);
            }
            cg.A00 = A00;
            if (A0K[6].charAt(20) == 'b') {
                throw new RuntimeException();
            }
            String[] strArr = A0K;
            strArr[5] = "MNnvCsSYuz9FkO9KQczdYnABN7zTLwyu";
            strArr[3] = "oflUn1lXrJVPIzwz3GYNJmaWxDOTuoWv";
        }
    }

    private void A0A(C0925Wk c0925Wk) throws C03519d {
        ArrayList<CP> A05;
        int trackCount = -1;
        long j = -9223372036854775807L;
        ArrayList arrayList = new ArrayList();
        Metadata metadata = null;
        C0403Be c0403Be = new C0403Be();
        C0924Wj A07 = c0925Wk.A07(C1.A1Q);
        if (A07 != null && (metadata = C6.A0F(A07, this.A0B)) != null) {
            c0403Be.A05(metadata);
        }
        try {
            A05 = A05(c0925Wk, c0403Be, (this.A0E & 1) != 0);
        } catch (C0921Wg unused) {
            c0403Be = new C0403Be();
            A05 = A05(c0925Wk, c0403Be, true);
        }
        int size = A05.size();
        for (int i = 0; i < size; i++) {
            CP cp = A05.get(i);
            CM cm = cp.A03;
            CG cg = new CG(cm, cp, this.A09.AFx(i, cm.A03));
            Format A0F = cm.A07.A0F(cp.A00 + 30);
            if (cm.A03 == 1) {
                if (c0403Be.A03()) {
                    A0F = A0F.A0G(c0403Be.A00, c0403Be.A01);
                }
                if (metadata != null) {
                    A0F = A0F.A0J(metadata);
                }
            }
            cg.A01.A5j(A0F);
            j = Math.max(j, cm.A04 != -9223372036854775807L ? cm.A04 : cp.A02);
            if (cm.A03 == 2 && trackCount == -1) {
                trackCount = arrayList.size();
            }
            arrayList.add(cg);
        }
        this.A02 = trackCount;
        this.A08 = j;
        CG[] cgArr = (CG[]) arrayList.toArray(new CG[arrayList.size()]);
        this.A0C = cgArr;
        this.A0D = A0G(cgArr);
        this.A09.A5T();
        this.A09.AEx(this);
    }

    public static boolean A0B(int i) {
        return i == C1.A0k || i == C1.A1M || i == C1.A0e || i == C1.A0i || i == C1.A17 || i == C1.A0O;
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0054, code lost:
    
        if (r4 != r3) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0058, code lost:
    
        if (r4 == com.facebook.ads.redexgen.X.C1.A0P) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x005c, code lost:
    
        if (r4 == com.facebook.ads.redexgen.X.C1.A1A) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0060, code lost:
    
        if (r4 == com.facebook.ads.redexgen.X.C1.A1D) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0064, code lost:
    
        if (r4 == com.facebook.ads.redexgen.X.C1.A1F) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0068, code lost:
    
        if (r4 == com.facebook.ads.redexgen.X.C1.A18) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x006c, code lost:
    
        if (r4 == com.facebook.ads.redexgen.X.C1.A0C) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0070, code lost:
    
        if (r4 == com.facebook.ads.redexgen.X.C1.A1K) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0074, code lost:
    
        if (r4 == com.facebook.ads.redexgen.X.C1.A0V) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0078, code lost:
    
        if (r4 != com.facebook.ads.redexgen.X.C1.A1Q) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x007c, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x0085, code lost:
    
        if (r4 != r3) goto L20;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static boolean A0C(int i) {
        if (i != C1.A0d && i != C1.A0o) {
            int i2 = C1.A0W;
            String[] strArr = A0K;
            if (strArr[2].charAt(0) == strArr[4].charAt(0)) {
                throw new RuntimeException();
            }
            A0K[7] = "Lbfp0NvNFR61AEm901fhAiQEZdUAojSN";
            if (i != i2 && i != C1.A1B && i != C1.A1E && i != C1.A1C) {
                int i3 = C1.A0D;
                String[] strArr2 = A0K;
                if (strArr2[0].charAt(11) != strArr2[1].charAt(11)) {
                    String[] strArr3 = A0K;
                    strArr3[2] = "AcWpjtb96ZMDu8ZbPmw7y3S9ldwHNTMG";
                    strArr3[4] = "liNDCAzQcSMqwn5YpITrjlM20opaDBZf";
                } else {
                    A0K[6] = "Et4fiiNPrE1ktHaAFcacRxoSMiMckR7G";
                }
            }
        }
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:48:0x012a, code lost:
    
        if (r2 != (-1)) goto L47;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x012c, code lost:
    
        r11.A07 = (r2 - r12.A7a()) + r11.A00;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x0145, code lost:
    
        if (r2 != (-1)) goto L47;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private boolean A0D(InterfaceC0400Bb interfaceC0400Bb) throws IOException, InterruptedException {
        if (this.A00 == 0) {
            if (!interfaceC0400Bb.AEE(this.A0F.A00, 0, 8, true)) {
                return false;
            }
            this.A00 = 8;
            this.A0F.A0Y(0);
            this.A07 = this.A0F.A0M();
            this.A01 = this.A0F.A08();
        }
        long endPosition = this.A07;
        if (endPosition == 1) {
            interfaceC0400Bb.readFully(this.A0F.A00, 8, 8);
            int headerBytesRemaining = this.A00;
            this.A00 = headerBytesRemaining + 8;
            this.A07 = this.A0F.A0N();
        } else if (endPosition == 0) {
            long A7B = interfaceC0400Bb.A7B();
            if (A7B == -1 && !this.A0I.isEmpty()) {
                C0925Wk peek = this.A0I.peek();
                String[] strArr = A0K;
                if (strArr[0].charAt(11) != strArr[1].charAt(11)) {
                    throw new RuntimeException();
                }
                String[] strArr2 = A0K;
                strArr2[2] = "Y6YGZv93ZuaTG8VKRMqoKTcHxa4CyU5s";
                strArr2[4] = "FFKbnBThmWx8ffVkKuWdFuDu950VBi9q";
                A7B = peek.A00;
            }
            String[] strArr3 = A0K;
            if (strArr3[0].charAt(11) != strArr3[1].charAt(11)) {
                String[] strArr4 = A0K;
                strArr4[2] = "ugTmpqu3zmSn1kJoBPr5aOxqvcpaMzJE";
                strArr4[4] = "H3dhpZSJ1Chdl4exfdGGuKA1AJd0x5s1";
            } else {
                String[] strArr5 = A0K;
                strArr5[5] = "kSEId9swLLOilCfe7rS6ohoMdmP2xe9n";
                strArr5[3] = "aRADAydnlpBl2XluL5U3tUuHw5s08YEm";
            }
        }
        if (this.A07 >= this.A00) {
            if (A0B(this.A01)) {
                long A7a = (interfaceC0400Bb.A7a() + this.A07) - this.A00;
                this.A0I.push(new C0925Wk(this.A01, A7a));
                if (this.A07 == this.A00) {
                    A08(A7a);
                } else {
                    A06();
                }
            } else if (A0C(this.A01)) {
                HI.A04(this.A00 == 8);
                HI.A04(this.A07 <= 2147483647L);
                this.A0A = new C0541Hh((int) this.A07);
                System.arraycopy(this.A0F.A00, 0, this.A0A.A00, 0, 8);
                this.A03 = 1;
            } else {
                this.A0A = null;
                this.A03 = 1;
            }
            return true;
        }
        throw new C03519d(A04(0, 48, 10));
    }

    private boolean A0E(InterfaceC0400Bb interfaceC0400Bb, C0404Bh c0404Bh) throws IOException, InterruptedException {
        long j = this.A07 - this.A00;
        long atomEndPosition = interfaceC0400Bb.A7a() + j;
        boolean z = false;
        C0541Hh c0541Hh = this.A0A;
        if (c0541Hh != null) {
            interfaceC0400Bb.readFully(c0541Hh.A00, this.A00, (int) j);
            if (this.A01 == C1.A0V) {
                this.A0B = A0F(this.A0A);
            } else if (!this.A0I.isEmpty()) {
                this.A0I.peek().A09(new C0924Wj(this.A01, this.A0A));
            }
        } else if (j < 262144) {
            interfaceC0400Bb.AFe((int) j);
        } else {
            long atomPayloadSize = interfaceC0400Bb.A7a();
            c0404Bh.A00 = atomPayloadSize + j;
            z = true;
        }
        A08(atomEndPosition);
        return z && this.A03 != 2;
    }

    public static boolean A0F(C0541Hh c0541Hh) {
        int A08;
        int majorBrand;
        c0541Hh.A0Y(8);
        int A082 = c0541Hh.A08();
        int majorBrand2 = A0M;
        if (A082 == majorBrand2) {
            return true;
        }
        c0541Hh.A0Z(4);
        do {
            int A04 = c0541Hh.A04();
            String[] strArr = A0K;
            String str = strArr[0];
            String str2 = strArr[1];
            int charAt = str.charAt(11);
            int majorBrand3 = str2.charAt(11);
            if (charAt != majorBrand3) {
                throw new RuntimeException();
            }
            String[] strArr2 = A0K;
            strArr2[5] = "HZNBHqeXKlwJLRyY4R1ZazClo3jLxgS8";
            strArr2[3] = "ULnGw1bPzwMM6OF7GcjqoSbIBNnkFp5Y";
            if (A04 > 0) {
                A08 = c0541Hh.A08();
                majorBrand = A0M;
            } else {
                return false;
            }
        } while (A08 != majorBrand);
        return true;
    }

    public static long[][] A0G(CG[] cgArr) {
        long[][] jArr = new long[cgArr.length][];
        int[] iArr = new int[cgArr.length];
        long[] jArr2 = new long[cgArr.length];
        boolean[] tracksFinished = new boolean[cgArr.length];
        for (int i = 0; i < cgArr.length; i++) {
            jArr[i] = new long[cgArr[i].A03.A01];
            jArr2[i] = cgArr[i].A03.A07[0];
        }
        long j = 0;
        int i2 = 0;
        while (true) {
            int length = cgArr.length;
            String[] strArr = A0K;
            if (strArr[0].charAt(11) != strArr[1].charAt(11)) {
                throw new RuntimeException();
            }
            String[] strArr2 = A0K;
            strArr2[5] = "yJ2jD62HfH2jQTY3DSfm8DixkPqWTM6R";
            strArr2[3] = "ERCQlGdy7dAXpXma9fK0CLCiAFSx2az3";
            if (i2 < length) {
                long j2 = Long.MAX_VALUE;
                int minTimeTrackIndex = -1;
                for (int i3 = 0; i3 < cgArr.length; i3++) {
                    if (!tracksFinished[i3]) {
                        long minTimeUs = jArr2[i3];
                        if (minTimeUs <= j2) {
                            minTimeTrackIndex = i3;
                            j2 = jArr2[i3];
                        }
                    }
                }
                int i4 = iArr[minTimeTrackIndex];
                jArr[minTimeTrackIndex][i4] = j;
                j += cgArr[minTimeTrackIndex].A03.A05[i4];
                int i5 = i4 + 1;
                iArr[minTimeTrackIndex] = i5;
                if (i5 < jArr[minTimeTrackIndex].length) {
                    jArr2[minTimeTrackIndex] = cgArr[minTimeTrackIndex].A03.A07[i5];
                } else {
                    tracksFinished[minTimeTrackIndex] = true;
                    i2++;
                }
            } else {
                return jArr;
            }
        }
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0406Bj
    public final long A6k() {
        return this.A08;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0406Bj
    public final C0405Bi A7l(long j) {
        long j2;
        long j3;
        int A01;
        CG[] cgArr = this.A0C;
        if (cgArr.length == 0) {
            return new C0405Bi(C0407Bk.A03);
        }
        long j4 = -9223372036854775807L;
        long j5 = -1;
        int i = this.A02;
        if (i != -1) {
            CP cp = cgArr[i].A03;
            int A02 = A02(cp, j);
            if (A02 == -1) {
                return new C0405Bi(C0407Bk.A03);
            }
            j2 = cp.A07[A02];
            j3 = cp.A06[A02];
            if (j2 < j && A02 < cp.A01 - 1 && (A01 = cp.A01(j)) != -1 && A01 != A02) {
                j4 = cp.A07[A01];
                j5 = cp.A06[A01];
            }
        } else {
            j2 = j;
            j3 = Long.MAX_VALUE;
        }
        int secondSampleIndex = 0;
        while (true) {
            CG[] cgArr2 = this.A0C;
            if (secondSampleIndex >= cgArr2.length) {
                break;
            }
            if (secondSampleIndex != this.A02) {
                CP cp2 = cgArr2[secondSampleIndex].A03;
                j3 = A03(cp2, j2, j3);
                if (j4 != -9223372036854775807L) {
                    j5 = A03(cp2, j4, j5);
                }
            }
            secondSampleIndex++;
        }
        C0407Bk c0407Bk = new C0407Bk(j2, j3);
        if (j4 == -9223372036854775807L) {
            return new C0405Bi(c0407Bk);
        }
        return new C0405Bi(c0407Bk, new C0407Bk(j4, j5));
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0399Ba
    public final void A8e(InterfaceC0401Bc interfaceC0401Bc) {
        this.A09 = interfaceC0401Bc;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0406Bj
    public final boolean A95() {
        return true;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0399Ba
    public final int AE9(InterfaceC0400Bb interfaceC0400Bb, C0404Bh c0404Bh) throws IOException, InterruptedException {
        while (true) {
            switch (this.A03) {
                case 0:
                    if (!A0D(interfaceC0400Bb)) {
                        return -1;
                    }
                    break;
                case 1:
                    if (!A0E(interfaceC0400Bb, c0404Bh)) {
                        break;
                    } else {
                        return 1;
                    }
                case 2:
                    return A01(interfaceC0400Bb, c0404Bh);
                default:
                    throw new IllegalStateException();
            }
        }
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0399Ba
    public final void AEw(long j, long j2) {
        this.A0I.clear();
        this.A00 = 0;
        this.A06 = -1;
        this.A04 = 0;
        this.A05 = 0;
        if (j == 0) {
            A06();
        } else {
            if (this.A0C == null) {
                return;
            }
            A09(j2);
        }
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0399Ba
    public final boolean AFg(InterfaceC0400Bb interfaceC0400Bb) throws IOException, InterruptedException {
        return CK.A04(interfaceC0400Bb);
    }
}
