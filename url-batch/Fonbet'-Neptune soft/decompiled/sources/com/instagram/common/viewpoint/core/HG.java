package com.instagram.common.viewpoint.core;

import com.google.common.base.Ascii;
import java.util.Arrays;
import okio.Utf8;

/* loaded from: assets/audience_network.dex */
public class HG implements ZY {
    public static byte[] A01;
    public static String[] A02 = {"BeK4HZWWIRhrC207wWuIOn", "ZxUaKMHZMCvHIxTDkc1UvZSYXikI2iYM", "xy0Ab8m7NOX4ZRxTfyGPwRY1TRrgVPC4", "ij8auLNb9rfA8yI55JUjNirWgnYpCp0M", "e9T4yeifuMgQg3dKDn6E2LsVBs4fgiHR", "ibrxpSG6qut0wBAmR6wSiB8exNotCqiu", "LMYPYXdb4SaVI93FsN1uYFih9", "8N3vGs6nddgUWUG"};
    public final /* synthetic */ C4Z A00;

    public static String A00(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A01, i, i + i2);
        int i4 = 0;
        while (true) {
            int length = copyOfRange.length;
            String[] strArr = A02;
            if (strArr[6].length() == strArr[0].length()) {
                throw new RuntimeException();
            }
            A02[2] = "F3dYTVgRpzEGoEWMN2T8FFCtbrhRHRBi";
            if (i4 >= length) {
                return new String(copyOfRange);
            }
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 99);
            i4++;
        }
    }

    public static void A01() {
        A01 = new byte[]{Ascii.NAK, 19, 5, Ascii.DC2, Utf8.REPLACEMENT_BYTE, Ascii.SO, 1, Ascii.SYN, 9, 7, 1, Ascii.DC4, 9, Ascii.SI, Ascii.SO, Utf8.REPLACEMENT_BYTE, 9, 1, 2};
    }

    static {
        A01();
    }

    public HG(C4Z c4z) {
        this.A00 = c4z;
    }

    @Override // com.instagram.common.viewpoint.core.ZY
    public final void AES(String str) {
        ZP zp;
        ZP zp2;
        this.A00.A0Q = false;
        zp = this.A00.A0F;
        zp.setProgress(100);
        zp2 = this.A00.A0F;
        XP.A0L(zp2, 8);
    }

    @Override // com.instagram.common.viewpoint.core.ZY
    public final void AEU(String str) {
        ZP zp;
        ZO zo;
        boolean z;
        int i;
        this.A00.A0Q = true;
        zp = this.A00.A0F;
        XP.A0L(zp, 0);
        zo = this.A00.A0E;
        zo.setUrl(str);
        z = this.A00.A0P;
        if (!z) {
            C4Z c4z = this.A00;
            if (A02[5].charAt(30) != 'i') {
                throw new RuntimeException();
            }
            A02[7] = "LFtEVX0D7i5Pos5vlgnVVb1H7Q5y";
            i = c4z.A02;
            if (i > 1) {
                this.A00.A0P = true;
                this.A00.A0i(A00(0, 19, 3));
            }
        }
        C4Z.A05(this.A00);
    }

    @Override // com.instagram.common.viewpoint.core.ZY
    public final void AEq(int i) {
        boolean z;
        ZP zp;
        z = this.A00.A0Q;
        if (z) {
            zp = this.A00.A0F;
            zp.setProgress(i);
        }
    }

    @Override // com.instagram.common.viewpoint.core.ZY
    public final void AEt(String str) {
        ZO zo;
        zo = this.A00.A0E;
        zo.setTitle(str);
    }

    @Override // com.instagram.common.viewpoint.core.ZY
    public final void AEw() {
        ((AbstractC0480Hr) this.A00).A0B.ACf(14);
    }
}
