package com.instagram.common.viewpoint.core;

import java.io.IOException;
import java.util.ArrayDeque;
import java.util.Arrays;
import org.checkerframework.checker.nullness.qual.RequiresNonNull;

/* renamed from: com.facebook.ads.redexgen.X.kr, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C1598kr implements I9 {
    public static byte[] A07;
    public static String[] A08 = {"eVwUBMvHO9uBMhknAGNfZP2yr814WJyE", "k5ILRUABeDXqCwWpN", "hJjZHs3Q8zIp76bYyURn3XwI", "BeESTKEHKjvJbhVudlSNXwxkHuAjvLDZ", "rbeMFWTNNauR3FTC2xnHN2ozIe2oUtV0", "bbPaxRhv7ZvGWrZH", "Yl9CHZRrzKaSrdtxcFsBA9EFbwcoGK5g", "dqSnihCeyqEvBM16"};
    public int A00;
    public int A01;
    public long A02;
    public I8 A03;
    public final byte[] A06 = new byte[8];
    public final ArrayDeque<I6> A05 = new ArrayDeque<>();
    public final IE A04 = new IE();

    public static String A03(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A07, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 15);
        }
        return new String(copyOfRange);
    }

    public static void A05() {
        A07 = new byte[]{98, -121, -113, 122, -123, -126, 125, 57, 126, -123, 126, -122, 126, -121, -115, 57, -115, -110, -119, 126, 57, 91, Byte.MIN_VALUE, -120, 115, 126, 123, 118, 50, 120, 126, -127, 115, -122, 50, -123, 123, -116, 119, 76, 50, -78, -41, -33, -54, -43, -46, -51, -119, -46, -41, -35, -50, -48, -50, -37, -119, -36, -46, -29, -50, -93, -119, -61, -28, -30, -39, -34, -41, -112, -43, -36, -43, -35, -43, -34, -28, -112, -29, -39, -22, -43, -86, -112};
        if (A08[6].charAt(2) != '9') {
            throw new RuntimeException();
        }
        String[] strArr = A08;
        strArr[0] = "OJtOaz7eyeuGy8JHYC7MsYj9KI0teM8x";
        strArr[4] = "Pthq8qREsbuOKTWUYG3bxj4Nb5ptFAt8";
    }

    static {
        A05();
    }

    private double A00(InterfaceC1619lN interfaceC1619lN, int i) throws IOException {
        long A02 = A02(interfaceC1619lN, i);
        if (i == 4) {
            return Float.intBitsToFloat((int) A02);
        }
        return Double.longBitsToDouble(A02);
    }

    @RequiresNonNull({"processor"})
    private long A01(InterfaceC1619lN interfaceC1619lN) throws IOException {
        interfaceC1619lN.AI1();
        while (true) {
            interfaceC1619lN.AG9(this.A06, 0, 4);
            int A00 = IE.A00(this.A06[0]);
            if (A00 != -1 && A00 <= 4) {
                int A01 = (int) IE.A01(this.A06, A00, false);
                if (this.A03.AAN(A01)) {
                    interfaceC1619lN.AJJ(A00);
                    return A01;
                }
            }
            interfaceC1619lN.AJJ(1);
        }
    }

    private long A02(InterfaceC1619lN interfaceC1619lN, int i) throws IOException {
        interfaceC1619lN.readFully(this.A06, 0, i);
        long j = 0;
        for (int i2 = 0; i2 < i; i2++) {
            long value = this.A06[i2] & 255;
            j = (j << 8) | value;
        }
        return j;
    }

    public static String A04(InterfaceC1619lN interfaceC1619lN, int i) throws IOException {
        if (i == 0) {
            return A03(0, 0, 32);
        }
        byte[] bArr = new byte[i];
        interfaceC1619lN.readFully(bArr, 0, i);
        while (i > 0 && bArr[i - 1] == 0) {
            i--;
        }
        return new String(bArr, 0, i);
    }

    @Override // com.instagram.common.viewpoint.core.I9
    public final void AA5(I8 i8) {
        this.A03 = i8;
    }

    /* JADX WARN: Code restructure failed: missing block: B:49:0x011d, code lost:
    
        if (r0 <= 2147483647L) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x011f, code lost:
    
        r12.A03.AJZ(r12.A00, A04(r13, (int) r12.A02));
        r12.A01 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x012f, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x015b, code lost:
    
        throw com.instagram.common.viewpoint.core.C00982i.A01(A03(63, 21, 97) + r12.A02, null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x0137, code lost:
    
        if (r0 <= 2147483647L) goto L44;
     */
    @Override // com.instagram.common.viewpoint.core.I9
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean AGe(InterfaceC1619lN interfaceC1619lN) throws IOException {
        long j;
        int i;
        C3M.A02(this.A03);
        while (true) {
            I6 head = this.A05.peek();
            if (head != null) {
                long A8f = interfaceC1619lN.A8f();
                j = head.A01;
                if (A8f >= j) {
                    I8 i8 = this.A03;
                    i = this.A05.pop().A00;
                    i8.A6F(i);
                    return true;
                }
            }
            if (this.A01 == 0) {
                long A05 = this.A04.A05(interfaceC1619lN, true, false, 4);
                if (A05 == -2) {
                    A05 = A01(interfaceC1619lN);
                }
                if (A05 == -1) {
                    return false;
                }
                this.A00 = (int) A05;
                this.A01 = 1;
            }
            if (this.A01 == 1) {
                this.A02 = this.A04.A05(interfaceC1619lN, false, true, 8);
                this.A01 = 2;
            }
            int A7m = this.A03.A7m(this.A00);
            switch (A7m) {
                case 0:
                    interfaceC1619lN.AJJ((int) this.A02);
                    this.A01 = 0;
                case 1:
                    long A8f2 = interfaceC1619lN.A8f();
                    this.A05.push(new I6(this.A00, A8f2 + this.A02));
                    I8 i82 = this.A03;
                    int i2 = this.A00;
                    long elementContentPosition = this.A02;
                    i82.AJO(i2, A8f2, elementContentPosition);
                    this.A01 = 0;
                    return true;
                case 2:
                    if (this.A02 <= 8) {
                        this.A03.AA9(this.A00, A02(interfaceC1619lN, (int) this.A02));
                        this.A01 = 0;
                        return true;
                    }
                    throw C00982i.A01(A03(41, 22, 90) + this.A02, null);
                case 3:
                    long j2 = this.A02;
                    if (A08[3].charAt(30) == 'v') {
                        A08[3] = "KnGHYIorNoG22Tvn2zIFMGSlF3FZ2Zej";
                        break;
                    } else {
                        A08[2] = "fCyqjQ49ueazrn4tXgyzoG1n";
                        break;
                    }
                case 4:
                    this.A03.A4a(this.A00, (int) this.A02, interfaceC1619lN);
                    this.A01 = 0;
                    return true;
                case 5:
                    long j3 = this.A02;
                    if (A08[6].charAt(2) != '9') {
                        throw new RuntimeException();
                    }
                    A08[2] = "D1RmFcc9PuCELhM1k2KVAJs3";
                    if (j3 == 4 || this.A02 == 8) {
                        this.A03.A6S(this.A00, A00(interfaceC1619lN, (int) this.A02));
                        this.A01 = 0;
                        return true;
                    }
                    throw C00982i.A01(A03(21, 20, 3) + this.A02, null);
                default:
                    throw C00982i.A01(A03(0, 21, 10) + A7m, null);
            }
        }
    }

    @Override // com.instagram.common.viewpoint.core.I9
    public final void reset() {
        this.A01 = 0;
        this.A05.clear();
        this.A04.A06();
    }
}
