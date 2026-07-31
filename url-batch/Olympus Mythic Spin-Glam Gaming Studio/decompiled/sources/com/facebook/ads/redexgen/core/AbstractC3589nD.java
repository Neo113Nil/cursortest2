package com.facebook.ads.redexgen.core;

import android.util.Pair;
import com.facebook.ads.androidx.media3.common.Timeline;

/* renamed from: com.facebook.ads.redexgen.X.nD, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public abstract class AbstractC3589nD extends AbstractC2267Ew {
    public static String[] A01 = {"LN1kZ6lR3vZBqqrviA4uTSOzBGS9o2bO", "mUQPITaRnEXTrG2Wr7xIAnPzPHhU6DS3", "avW0I4bwWNzzQZleeOInYpLZY9PTle7", "LGUT8ZIo3joumZn9NybI7JCchk0DSCTG", "S4WFRdtC0lcE2afHWARgiwpUU5tNPmtd", "SbOYlLigHNVPkFHrMvYK7wwtNeL", "2fmBOvz22OTh8nUuYBKjoVDFU", "lR30iWlIbuozJgbVtB9O9DOed4NJenPq"};
    public C2259Eo A00;

    public abstract Pair<C21007s[], InterfaceC3590nE[]> A0d(C2259Eo c2259Eo, int[][][] iArr, int[] iArr2, C3626no c3626no, Timeline timeline) throws AD;

    /* JADX WARN: Incorrect condition in loop: B:3:0x0005 */
    /* JADX WARN: Incorrect condition in loop: B:6:0x000d */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static int A0Y(InterfaceC20977p[] interfaceC20977pArr, C3741pg c3741pg, int[] iArr, boolean z) throws AD {
        int length = interfaceC20977pArr.length;
        int formatSupportLevel = 0;
        int i = 1;
        for (int i2 = 0; i2 < bestRendererIndex; i2++) {
            InterfaceC20977p interfaceC20977p = interfaceC20977pArr[i2];
            int i3 = 0;
            for (int bestFormatSupportLevel = 0; bestFormatSupportLevel < bestRendererIndex; bestFormatSupportLevel++) {
                int bestRendererIndex = interfaceC20977p.AKM(c3741pg.A08(bestFormatSupportLevel));
                i3 = Math.max(i3, AbstractC20907i.A03(bestRendererIndex));
            }
            int bestRendererIndex2 = iArr[i2];
            int bestRendererIndex3 = bestRendererIndex2 == 0 ? 1 : 0;
            if (i3 > formatSupportLevel || (i3 == formatSupportLevel && z && i == 0 && bestRendererIndex3 != 0)) {
                length = i2;
                formatSupportLevel = i3;
                i = bestRendererIndex3;
            }
        }
        return length;
    }

    public static int[] A0Z(InterfaceC20977p interfaceC20977p, C3741pg c3741pg) throws AD {
        int[] iArr = new int[c3741pg.A01];
        for (int i = 0; i < c3741pg.A01; i++) {
            iArr[i] = interfaceC20977p.AKM(c3741pg.A08(i));
        }
        return iArr;
    }

    public static int[] A0a(InterfaceC20977p[] interfaceC20977pArr) throws AD {
        int[] iArr = new int[interfaceC20977pArr.length];
        for (int i = 0; i < iArr.length; i++) {
            int AKO = interfaceC20977pArr[i].AKO();
            String[] strArr = A01;
            String str = strArr[4];
            String str2 = strArr[1];
            int i2 = str.charAt(23);
            if (i2 == str2.charAt(23)) {
                throw new RuntimeException();
            }
            String[] strArr2 = A01;
            strArr2[4] = "1ViYEGUZxGRCVXLKV1NACncyCaxKGcLE";
            strArr2[1] = "WZkUCc71MckdncxFpAml539B1oxWjr0A";
            iArr[i] = AKO;
        }
        return iArr;
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC2267Ew
    public final C2268Ex A0b(InterfaceC20977p[] interfaceC20977pArr, C3608nW c3608nW, C3626no c3626no, Timeline timeline) throws AD {
        int[] rendererTrackGroupCounts;
        int[] iArr = new int[interfaceC20977pArr.length + 1];
        C3741pg[][] c3741pgArr = new C3741pg[interfaceC20977pArr.length + 1][];
        int[][][] iArr2 = new int[interfaceC20977pArr.length + 1][][];
        for (int i = 0; i < c3741pgArr.length; i++) {
            c3741pgArr[i] = new C3741pg[c3608nW.A01];
            iArr2[i] = new int[c3608nW.A01][];
        }
        int[] A0a = A0a(interfaceC20977pArr);
        for (int i2 = 0; i2 < c3608nW.A01; i2++) {
            C3741pg A05 = c3608nW.A05(i2);
            int groupIndex = A0Y(interfaceC20977pArr, A05, iArr, A05.A02 == 5);
            if (groupIndex == interfaceC20977pArr.length) {
                rendererTrackGroupCounts = new int[A05.A01];
            } else {
                rendererTrackGroupCounts = A0Z(interfaceC20977pArr[groupIndex], A05);
            }
            int i3 = iArr[groupIndex];
            c3741pgArr[groupIndex][i3] = A05;
            iArr2[groupIndex][i3] = rendererTrackGroupCounts;
            iArr[groupIndex] = iArr[groupIndex] + 1;
        }
        C3608nW[] c3608nWArr = new C3608nW[interfaceC20977pArr.length];
        String[] strArr = new String[interfaceC20977pArr.length];
        int[] iArr3 = new int[interfaceC20977pArr.length];
        int i4 = 0;
        while (true) {
            int length = interfaceC20977pArr.length;
            String[] strArr2 = A01;
            if (strArr2[4].charAt(23) == strArr2[1].charAt(23)) {
                throw new RuntimeException();
            }
            String[] strArr3 = A01;
            strArr3[4] = "hppY0P6sht5kF7is4RCKyMBKsFUVAoRB";
            strArr3[1] = "XeHPWbHBeoBDFVDQc4DbmKa9NYqMdrJh";
            if (i4 < length) {
                int i5 = iArr[i4];
                c3608nWArr[i4] = new C3608nW((C3741pg[]) C5C.A1I(c3741pgArr[i4], i5));
                iArr2[i4] = (int[][]) C5C.A1I(iArr2[i4], i5);
                strArr[i4] = interfaceC20977pArr[i4].getName();
                iArr3[i4] = interfaceC20977pArr[i4].A9N();
                i4++;
            } else {
                C2259Eo c2259Eo = new C2259Eo(strArr, iArr3, c3608nWArr, A0a, iArr2, new C3608nW((C3741pg[]) C5C.A1I(c3741pgArr[interfaceC20977pArr.length], iArr[interfaceC20977pArr.length])));
                Pair<C21007s[], InterfaceC3590nE[]> A0d = A0d(c2259Eo, iArr2, A0a, c3626no, timeline);
                return new C2268Ex((C21007s[]) A0d.first, (InterfaceC3590nE[]) A0d.second, AbstractC2264Et.A00(c2259Eo, (InterfaceC2261Eq[]) A0d.second), c2259Eo);
            }
        }
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC2267Ew
    public final void A0c(Object obj) {
        this.A00 = (C2259Eo) obj;
    }
}
