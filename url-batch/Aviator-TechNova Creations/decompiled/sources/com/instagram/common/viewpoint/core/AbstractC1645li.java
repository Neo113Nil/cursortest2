package com.instagram.common.viewpoint.core;

import android.util.Pair;
import com.facebook.ads.androidx.media3.common.Timeline;

/* renamed from: com.facebook.ads.redexgen.X.li, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public abstract class AbstractC1645li extends EK {
    public static String[] A01 = {"LN1kZ6lR3vZBqqrviA4uTSOzBGS9o2bO", "mUQPITaRnEXTrG2Wr7xIAnPzPHhU6DS3", "avW0I4bwWNzzQZleeOInYpLZY9PTle7", "LGUT8ZIo3joumZn9NybI7JCchk0DSCTG", "S4WFRdtC0lcE2afHWARgiwpUU5tNPmtd", "SbOYlLigHNVPkFHrMvYK7wwtNeL", "2fmBOvz22OTh8nUuYBKjoVDFU", "lR30iWlIbuozJgbVtB9O9DOed4NJenPq"};
    public EC A00;

    public abstract Pair<C7G[], InterfaceC1646lj[]> A0d(EC ec, int[][][] iArr, int[] iArr2, C1683mL c1683mL, Timeline timeline) throws C9Y;

    /* JADX WARN: Incorrect condition in loop: B:3:0x0005 */
    /* JADX WARN: Incorrect condition in loop: B:6:0x000d */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static int A0Y(C7D[] c7dArr, C1802oH c1802oH, int[] iArr, boolean z) throws C9Y {
        int length = c7dArr.length;
        int formatSupportLevel = 0;
        int i = 1;
        for (int i2 = 0; i2 < bestRendererIndex; i2++) {
            C7D c7d = c7dArr[i2];
            int i3 = 0;
            for (int bestFormatSupportLevel = 0; bestFormatSupportLevel < bestRendererIndex; bestFormatSupportLevel++) {
                int bestRendererIndex = c7d.AJb(c1802oH.A08(bestFormatSupportLevel));
                i3 = Math.max(i3, AnonymousClass76.A03(bestRendererIndex));
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

    public static int[] A0Z(C7D c7d, C1802oH c1802oH) throws C9Y {
        int[] iArr = new int[c1802oH.A01];
        for (int i = 0; i < c1802oH.A01; i++) {
            iArr[i] = c7d.AJb(c1802oH.A08(i));
        }
        return iArr;
    }

    public static int[] A0a(C7D[] c7dArr) throws C9Y {
        int[] iArr = new int[c7dArr.length];
        for (int i = 0; i < iArr.length; i++) {
            int AJd = c7dArr[i].AJd();
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
            iArr[i] = AJd;
        }
        return iArr;
    }

    @Override // com.instagram.common.viewpoint.core.EK
    public final EL A0b(C7D[] c7dArr, C1673mA c1673mA, C1683mL c1683mL, Timeline timeline) throws C9Y {
        int[] rendererTrackGroupCounts;
        int[] iArr = new int[c7dArr.length + 1];
        C1802oH[][] c1802oHArr = new C1802oH[c7dArr.length + 1][];
        int[][][] iArr2 = new int[c7dArr.length + 1][][];
        for (int i = 0; i < c1802oHArr.length; i++) {
            c1802oHArr[i] = new C1802oH[c1673mA.A01];
            iArr2[i] = new int[c1673mA.A01][];
        }
        int[] A0a = A0a(c7dArr);
        for (int i2 = 0; i2 < c1673mA.A01; i2++) {
            C1802oH A05 = c1673mA.A05(i2);
            int groupIndex = A0Y(c7dArr, A05, iArr, A05.A02 == 5);
            if (groupIndex == c7dArr.length) {
                rendererTrackGroupCounts = new int[A05.A01];
            } else {
                rendererTrackGroupCounts = A0Z(c7dArr[groupIndex], A05);
            }
            int i3 = iArr[groupIndex];
            c1802oHArr[groupIndex][i3] = A05;
            iArr2[groupIndex][i3] = rendererTrackGroupCounts;
            iArr[groupIndex] = iArr[groupIndex] + 1;
        }
        C1673mA[] c1673mAArr = new C1673mA[c7dArr.length];
        String[] strArr = new String[c7dArr.length];
        int[] iArr3 = new int[c7dArr.length];
        int i4 = 0;
        while (true) {
            int length = c7dArr.length;
            String[] strArr2 = A01;
            if (strArr2[4].charAt(23) == strArr2[1].charAt(23)) {
                throw new RuntimeException();
            }
            String[] strArr3 = A01;
            strArr3[4] = "hppY0P6sht5kF7is4RCKyMBKsFUVAoRB";
            strArr3[1] = "XeHPWbHBeoBDFVDQc4DbmKa9NYqMdrJh";
            if (i4 < length) {
                int i5 = iArr[i4];
                c1673mAArr[i4] = new C1673mA((C1802oH[]) AbstractC01484a.A1I(c1802oHArr[i4], i5));
                iArr2[i4] = (int[][]) AbstractC01484a.A1I(iArr2[i4], i5);
                strArr[i4] = c7dArr[i4].getName();
                iArr3[i4] = c7dArr[i4].A9F();
                i4++;
            } else {
                EC ec = new EC(strArr, iArr3, c1673mAArr, A0a, iArr2, new C1673mA((C1802oH[]) AbstractC01484a.A1I(c1802oHArr[c7dArr.length], iArr[c7dArr.length])));
                Pair<C7G[], InterfaceC1646lj[]> A0d = A0d(ec, iArr2, A0a, c1683mL, timeline);
                return new EL((C7G[]) A0d.first, (InterfaceC1646lj[]) A0d.second, EH.A00(ec, (EE[]) A0d.second), ec);
            }
        }
    }

    @Override // com.instagram.common.viewpoint.core.EK
    public final void A0c(Object obj) {
        this.A00 = (EC) obj;
    }
}
