package com.instagram.common.viewpoint.core;

import com.facebook.ads.internal.protocol.AdErrorType;
import com.google.common.base.Ascii;
import java.util.Arrays;
import okio.Utf8;

/* loaded from: assets/audience_network.dex */
public class T7 implements S7 {
    public static byte[] A03;
    public static String[] A04 = {"mqH0C", "P", "Prv4rgxv4XvjDltPpSeqnrL7fWipLvZ8", "wRAQVkTW0Fdys8", "msKGEa7u", "", "70lhKNnmmmhMBIKZ0qoNvOWwjw91iHAS", "ylnG6cBHFe0YAiTdKU1DLGP7G6QidCUo"};
    public final /* synthetic */ C1455iN A00;
    public final /* synthetic */ C0702Qc A01;
    public final /* synthetic */ boolean A02;

    public static String A00(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A03, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 103);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A03 = new byte[]{Ascii.FS, 55, Utf8.REPLACEMENT_BYTE, 66, 59, 58, -10, 74, 69, -10, 58, 69, 77, 68, 66, 69, 55, 58, -10, 55, -10, 67, 59, 58, Utf8.REPLACEMENT_BYTE, 55, 4};
    }

    static {
        A01();
    }

    public T7(C0702Qc c0702Qc, C1455iN c1455iN, boolean z) {
        this.A01 = c0702Qc;
        this.A00 = c1455iN;
        this.A02 = z;
    }

    @Override // com.instagram.common.viewpoint.core.S7
    public final void ACh() {
        C1159dL c1159dL;
        long j;
        QQ qq;
        QQ qq2;
        if (this.A01.A0a != null) {
            this.A01.A0a.A0J();
            this.A01.A0a = null;
        }
        AdErrorType adErrorType = AdErrorType.CACHE_FAILURE_ERROR;
        String A00 = A00(0, 27, 111);
        c1159dL = this.A01.A0c;
        LH A0F = c1159dL.A0F();
        j = this.A01.A00;
        A0F.A3F(XG.A01(j), adErrorType.getErrorCode(), A00);
        qq = this.A01.A0G;
        if (qq != null) {
            qq2 = this.A01.A0G;
            qq2.ADB(V1.A01(adErrorType, A00));
        }
    }

    @Override // com.instagram.common.viewpoint.core.S7
    public final void ACq() {
        QQ qq;
        EnumC0813Ul enumC0813Ul;
        C1159dL c1159dL;
        QQ qq2;
        C1159dL c1159dL2;
        boolean A0r;
        QQ qq3;
        C02226w c02226w;
        C02226w c02226w2;
        this.A01.A0a = this.A00;
        if (this.A02) {
            c02226w = this.A01.A0A;
            if (c02226w != null) {
                c02226w2 = this.A01.A0A;
                c02226w2.A0L();
            }
        }
        qq = this.A01.A0G;
        if (qq != null) {
            enumC0813Ul = this.A01.A0E;
            if (enumC0813Ul.equals(EnumC0813Ul.A04)) {
                A0r = this.A01.A0r();
                if (!A0r) {
                    qq3 = this.A01.A0G;
                    qq3.AEB();
                }
            }
            if (this.A02) {
                C0702Qc c0702Qc = this.A01;
                String[] strArr = A04;
                if (strArr[4].length() != strArr[0].length()) {
                    String[] strArr2 = A04;
                    strArr2[4] = "lirdd0Qr";
                    strArr2[0] = "muvxx";
                    c1159dL = c0702Qc.A0c;
                    if (U7.A1n(c1159dL) && this.A01.A10() != null && this.A01.A10().A1Y()) {
                        C0702Qc c0702Qc2 = this.A01;
                        c1159dL2 = this.A01.A0c;
                        c0702Qc2.A0M = AbstractC1071bu.A01(c1159dL2, this.A01.A10(), 4, new T8(this));
                        return;
                    } else {
                        C0702Qc c0702Qc3 = this.A01;
                        if (A04[3].length() != 28) {
                            A04[6] = "Y1qaffLCA6OgZ6gO9VGOLjOrervRHVYN";
                            qq2 = c0702Qc3.A0G;
                            qq2.ACH();
                            return;
                        }
                    }
                }
                throw new RuntimeException();
            }
        }
    }
}
