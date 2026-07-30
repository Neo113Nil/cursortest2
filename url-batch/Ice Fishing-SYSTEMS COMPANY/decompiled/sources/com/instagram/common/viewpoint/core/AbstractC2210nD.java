package com.instagram.common.viewpoint.core;

import android.util.Pair;
import com.facebook.ads.androidx.media3.common.Timeline;

/* renamed from: com.facebook.ads.redexgen.X.nD, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public abstract class AbstractC2210nD extends AbstractC0888Ew {
    public static String[] A01 = {"LN1kZ6lR3vZBqqrviA4uTSOzBGS9o2bO", "mUQPITaRnEXTrG2Wr7xIAnPzPHhU6DS3", "avW0I4bwWNzzQZleeOInYpLZY9PTle7", "LGUT8ZIo3joumZn9NybI7JCchk0DSCTG", "S4WFRdtC0lcE2afHWARgiwpUU5tNPmtd", "SbOYlLigHNVPkFHrMvYK7wwtNeL", "2fmBOvz22OTh8nUuYBKjoVDFU", "lR30iWlIbuozJgbVtB9O9DOed4NJenPq"};
    public C0880Eo A00;

    public abstract Pair<C07217s[], InterfaceC2211nE[]> A0d(C0880Eo c0880Eo, int[][][] iArr, int[] iArr2, C2247no c2247no, Timeline timeline) throws AD;

    /* JADX WARN: Incorrect condition in loop: B:3:0x0005 */
    /* JADX WARN: Incorrect condition in loop: B:6:0x000d */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static int A0Y(InterfaceC07187p[] interfaceC07187pArr, C2362pg c2362pg, int[] iArr, boolean z8) throws AD {
        int length = interfaceC07187pArr.length;
        int formatSupportLevel = 0;
        int i = 1;
        for (int i4 = 0; i4 < bestRendererIndex; i4++) {
            InterfaceC07187p interfaceC07187p = interfaceC07187pArr[i4];
            int i9 = 0;
            for (int bestFormatSupportLevel = 0; bestFormatSupportLevel < bestRendererIndex; bestFormatSupportLevel++) {
                int bestRendererIndex = interfaceC07187p.AKM(c2362pg.A08(bestFormatSupportLevel));
                i9 = Math.max(i9, AbstractC07117i.A03(bestRendererIndex));
            }
            int bestRendererIndex2 = iArr[i4];
            int bestRendererIndex3 = bestRendererIndex2 == 0 ? 1 : 0;
            if (i9 > formatSupportLevel || (i9 == formatSupportLevel && z8 && i == 0 && bestRendererIndex3 != 0)) {
                length = i4;
                formatSupportLevel = i9;
                i = bestRendererIndex3;
            }
        }
        return length;
    }

    public static int[] A0Z(InterfaceC07187p interfaceC07187p, C2362pg c2362pg) throws AD {
        int[] iArr = new int[c2362pg.A01];
        for (int i = 0; i < c2362pg.A01; i++) {
            iArr[i] = interfaceC07187p.AKM(c2362pg.A08(i));
        }
        return iArr;
    }

    public static int[] A0a(InterfaceC07187p[] interfaceC07187pArr) throws AD {
        int[] iArr = new int[interfaceC07187pArr.length];
        for (int i = 0; i < iArr.length; i++) {
            int AKO = interfaceC07187pArr[i].AKO();
            String[] strArr = A01;
            String str = strArr[4];
            String str2 = strArr[1];
            int i4 = str.charAt(23);
            if (i4 == str2.charAt(23)) {
                throw new RuntimeException();
            }
            String[] strArr2 = A01;
            strArr2[4] = "1ViYEGUZxGRCVXLKV1NACncyCaxKGcLE";
            strArr2[1] = "WZkUCc71MckdncxFpAml539B1oxWjr0A";
            iArr[i] = AKO;
        }
        return iArr;
    }

    @Override // com.instagram.common.viewpoint.core.AbstractC0888Ew
    public final C0889Ex A0b(InterfaceC07187p[] interfaceC07187pArr, C2229nW c2229nW, C2247no c2247no, Timeline timeline) throws AD {
        int[] rendererTrackGroupCounts;
        int[] iArr = new int[interfaceC07187pArr.length + 1];
        C2362pg[][] c2362pgArr = new C2362pg[interfaceC07187pArr.length + 1][];
        int[][][] iArr2 = new int[interfaceC07187pArr.length + 1][][];
        for (int i = 0; i < c2362pgArr.length; i++) {
            c2362pgArr[i] = new C2362pg[c2229nW.A01];
            iArr2[i] = new int[c2229nW.A01][];
        }
        int[] A0a = A0a(interfaceC07187pArr);
        for (int i4 = 0; i4 < c2229nW.A01; i4++) {
            C2362pg A05 = c2229nW.A05(i4);
            int groupIndex = A0Y(interfaceC07187pArr, A05, iArr, A05.A02 == 5);
            if (groupIndex == interfaceC07187pArr.length) {
                rendererTrackGroupCounts = new int[A05.A01];
            } else {
                rendererTrackGroupCounts = A0Z(interfaceC07187pArr[groupIndex], A05);
            }
            int i9 = iArr[groupIndex];
            c2362pgArr[groupIndex][i9] = A05;
            iArr2[groupIndex][i9] = rendererTrackGroupCounts;
            iArr[groupIndex] = iArr[groupIndex] + 1;
        }
        C2229nW[] c2229nWArr = new C2229nW[interfaceC07187pArr.length];
        String[] strArr = new String[interfaceC07187pArr.length];
        int[] iArr3 = new int[interfaceC07187pArr.length];
        int i10 = 0;
        while (true) {
            int length = interfaceC07187pArr.length;
            String[] strArr2 = A01;
            if (strArr2[4].charAt(23) == strArr2[1].charAt(23)) {
                throw new RuntimeException();
            }
            String[] strArr3 = A01;
            strArr3[4] = "hppY0P6sht5kF7is4RCKyMBKsFUVAoRB";
            strArr3[1] = "XeHPWbHBeoBDFVDQc4DbmKa9NYqMdrJh";
            if (i10 < length) {
                int i11 = iArr[i10];
                c2229nWArr[i10] = new C2229nW((C2362pg[]) C5C.A1I(c2362pgArr[i10], i11));
                iArr2[i10] = (int[][]) C5C.A1I(iArr2[i10], i11);
                strArr[i10] = interfaceC07187pArr[i10].getName();
                iArr3[i10] = interfaceC07187pArr[i10].A9N();
                i10++;
            } else {
                C0880Eo c0880Eo = new C0880Eo(strArr, iArr3, c2229nWArr, A0a, iArr2, new C2229nW((C2362pg[]) C5C.A1I(c2362pgArr[interfaceC07187pArr.length], iArr[interfaceC07187pArr.length])));
                Pair<C07217s[], InterfaceC2211nE[]> A0d = A0d(c0880Eo, iArr2, A0a, c2247no, timeline);
                return new C0889Ex((C07217s[]) A0d.first, (InterfaceC2211nE[]) A0d.second, AbstractC0885Et.A00(c0880Eo, (InterfaceC0882Eq[]) A0d.second), c0880Eo);
            }
        }
    }

    @Override // com.instagram.common.viewpoint.core.AbstractC0888Ew
    public final void A0c(Object obj) {
        this.A00 = (C0880Eo) obj;
    }
}
