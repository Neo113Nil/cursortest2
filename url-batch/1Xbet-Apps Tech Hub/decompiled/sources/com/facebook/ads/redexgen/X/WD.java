package com.facebook.ads.redexgen.X;

import android.util.Log;
import com.google.common.base.Ascii;
import java.util.Arrays;

/* loaded from: assets/audience_network.dex */
public final class WD implements InterfaceC0432Cv {
    public static byte[] A0C;
    public static String[] A0D = {"wYbCHe4PqE0rUTWdo8mFq0UBpfkRDoC", "CuNoFwrXbx7Fup1Bnz4crpheboHEAq61", "i4a35YUA6bJnEiUQjLdSeulU0LA5VC2", "DQj4nZO33GsRRuNygGqDxWwIbU", "NTzjfKAdqL5R4ni", "Zn", "9Rh66LtnIoGSEkHARJ7O", "nCQ56kMXgmV4b9DPw80w9mtudgrGO1uA"};
    public int A00;
    public int A01;
    public int A02;
    public long A04;
    public C0553Ht A05;
    public boolean A06;
    public boolean A07;
    public boolean A08;
    public boolean A09;
    public final InterfaceC0420Cg A0A;
    public final C0540Hg A0B = new C0540Hg(new byte[10]);
    public int A03 = 0;

    public static String A00(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A0C, i, i + i2);
        int i4 = 0;
        while (true) {
            int length = copyOfRange.length;
            String[] strArr = A0D;
            if (strArr[6].length() == strArr[4].length()) {
                throw new RuntimeException();
            }
            String[] strArr2 = A0D;
            strArr2[6] = "tGST5WGrXasfnynKry2Y";
            strArr2[4] = "X7BCEDGkhqj2a0M";
            if (i4 >= length) {
                return new String(copyOfRange);
            }
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 105);
            i4++;
        }
    }

    public static void A02() {
        A0C = new byte[]{-37, 40, 42, 45, 32, -37, Ascii.GS, 52, 47, 32, 46, -44, -23, -9, -42, -23, -27, -24, -23, -10, -14, Ascii.VT, 2, Ascii.NAK, Ascii.CR, 2, 0, 17, 2, 1, -67, 16, 17, -2, Ascii.SI, 17, -67, 0, Ascii.FF, 1, 2, -67, Ascii.CR, Ascii.SI, 2, 3, 6, Ascii.NAK, -41, -67, 40, 65, 56, 75, 67, 56, 54, 71, 56, 55, -13, 70, 71, 52, 69, 71, -13, 60, 65, 55, 60, 54, 52, 71, 66, 69, -13, 69, 56, 52, 55, 60, 65, 58, -13, 56, 75, 71, 56, 65, 55, 56, 55, -13, 59, 56, 52, 55, 56, 69, -2, Ascii.ETB, Ascii.SO, 33, Ascii.EM, Ascii.SO, Ascii.FF, Ascii.GS, Ascii.SO, Ascii.CR, -55, Ascii.FS, Ascii.GS, 10, Ascii.ESC, Ascii.GS, -55, Ascii.DC2, Ascii.ETB, Ascii.CR, Ascii.DC2, Ascii.FF, 10, Ascii.GS, Ascii.CAN, Ascii.ESC, -29, -55, Ascii.SO, 33, Ascii.EM, Ascii.SO, Ascii.FF, Ascii.GS, Ascii.SO, Ascii.CR, -55};
    }

    static {
        A02();
    }

    public WD(InterfaceC0420Cg interfaceC0420Cg) {
        this.A0A = interfaceC0420Cg;
    }

    private void A01() {
        this.A0B.A07(0);
        this.A04 = -9223372036854775807L;
        if (this.A08) {
            this.A0B.A08(4);
            this.A0B.A08(1);
            long pts = this.A0B.A04(15) << 15;
            long A04 = (this.A0B.A04(3) << 30) | pts;
            this.A0B.A08(1);
            long pts2 = this.A0B.A04(15);
            long j = A04 | pts2;
            this.A0B.A08(1);
            if (!this.A09 && this.A07) {
                this.A0B.A08(4);
                long pts3 = this.A0B.A04(3);
                this.A0B.A08(1);
                this.A0B.A08(1);
                this.A0B.A08(1);
                this.A05.A07((pts3 << 30) | (this.A0B.A04(15) << 15) | this.A0B.A04(15));
                this.A09 = true;
            }
            this.A04 = this.A05.A07(j);
        }
    }

    private void A03(int i) {
        this.A03 = i;
        this.A00 = 0;
    }

    private boolean A04() {
        this.A0B.A07(0);
        int A04 = this.A0B.A04(24);
        if (A04 != 1) {
            Log.w(A00(11, 9, 27), A00(20, 30, 52) + A04);
            this.A02 = -1;
            return false;
        }
        this.A0B.A08(8);
        int A042 = this.A0B.A04(16);
        this.A0B.A08(5);
        this.A06 = this.A0B.A0F();
        this.A0B.A08(2);
        this.A08 = this.A0B.A0F();
        this.A07 = this.A0B.A0F();
        this.A0B.A08(6);
        int packetLength = this.A0B.A04(8);
        this.A01 = packetLength;
        if (A042 == 0) {
            this.A02 = -1;
        } else {
            int startCodePrefix = A042 + 6;
            this.A02 = (startCodePrefix - 9) - packetLength;
        }
        return true;
    }

    private boolean A05(C0541Hh c0541Hh, byte[] bArr, int i) {
        int min = Math.min(c0541Hh.A04(), i - this.A00);
        if (min <= 0) {
            return true;
        }
        if (bArr == null) {
            c0541Hh.A0Z(min);
        } else {
            int bytesToRead = this.A00;
            c0541Hh.A0c(bArr, bytesToRead, min);
        }
        int bytesToRead2 = this.A00;
        int bytesToRead3 = bytesToRead2 + min;
        this.A00 = bytesToRead3;
        return bytesToRead3 == i;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x00e6, code lost:
    
        if (r6 != (-1)) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x00e8, code lost:
    
        android.util.Log.w(r5, A00(100, 37, 64) + r7.A02 + A00(0, 11, 82));
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0115, code lost:
    
        r7.A0A.ADi();
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0128, code lost:
    
        if (r6 != (-1)) goto L43;
     */
    @Override // com.facebook.ads.redexgen.X.InterfaceC0432Cv
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void A4P(C0541Hh c0541Hh, boolean z) throws C03519d {
        if (z) {
            int i = this.A03;
            String A00 = A00(11, 9, 27);
            switch (i) {
                case 2:
                    Log.w(A00, A00(50, 50, 106));
                    break;
                case 3:
                    int i2 = this.A02;
                    String[] strArr = A0D;
                    if (strArr[1].charAt(7) == strArr[7].charAt(7)) {
                        String[] strArr2 = A0D;
                        strArr2[6] = "yVWHAKGbYqdJQnId175P";
                        strArr2[4] = "7JSMzt33eVYw0UR";
                        break;
                    } else {
                        A0D[3] = "iT6qZLxrsL5nFXzA5eMWRbmPpry";
                        break;
                    }
            }
            A03(1);
        }
        while (c0541Hh.A04() > 0) {
            switch (this.A03) {
                case 0:
                    c0541Hh.A0Z(c0541Hh.A04());
                    break;
                case 1:
                    if (!A05(c0541Hh, this.A0B.A00, 9)) {
                        break;
                    } else {
                        A03(A04() ? 2 : 0);
                        break;
                    }
                case 2:
                    if (A05(c0541Hh, this.A0B.A00, Math.min(10, this.A01)) && A05(c0541Hh, null, this.A01)) {
                        A01();
                        this.A0A.ADj(this.A04, this.A06);
                        A03(3);
                        break;
                    }
                    break;
                case 3:
                    int A04 = c0541Hh.A04();
                    String[] strArr3 = A0D;
                    if (strArr3[0].length() == strArr3[2].length()) {
                        A0D[3] = "hjut4LIYfO6UEnzCC4LSiWMZuOq2ZkQ";
                        int i3 = this.A02;
                        int i4 = i3 != -1 ? A04 - i3 : 0;
                        if (i4 > 0) {
                            A04 -= i4;
                            c0541Hh.A0X(c0541Hh.A06() + A04);
                        }
                        this.A0A.A4O(c0541Hh);
                        int i5 = this.A02;
                        if (i5 == -1) {
                            break;
                        } else {
                            int i6 = i5 - A04;
                            this.A02 = i6;
                            if (i6 != 0) {
                                break;
                            } else {
                                this.A0A.ADi();
                                A03(1);
                                break;
                            }
                        }
                    } else {
                        throw new RuntimeException();
                    }
            }
        }
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0432Cv
    public final void A8g(C0553Ht c0553Ht, InterfaceC0401Bc interfaceC0401Bc, C0431Cu c0431Cu) {
        this.A05 = c0553Ht;
        this.A0A.A4l(interfaceC0401Bc, c0431Cu);
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0432Cv
    public final void AEv() {
        this.A03 = 0;
        this.A00 = 0;
        this.A09 = false;
        this.A0A.AEv();
    }
}
