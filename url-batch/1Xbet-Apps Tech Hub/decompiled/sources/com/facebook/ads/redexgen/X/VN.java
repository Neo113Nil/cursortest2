package com.facebook.ads.redexgen.X;

import android.util.Pair;
import com.facebook.ads.internal.exoplayer2.thirdparty.source.TrackGroup;
import com.facebook.ads.internal.exoplayer2.thirdparty.source.TrackGroupArray;

/* loaded from: assets/audience_network.dex */
public abstract class VN extends GR {
    public static String[] A01 = {"JXADnguvwbjBsYgslHoSHgr2xxMnawNn", "", "jNEAQ3UZ70aM1hHDYV2CS20ieNSkmYbb", "bnkACY5tQbsoiCdyBJgaOjSRI0w0kmrQ", "gVGuKveDeddXJzh5PaouiQlIwgfOoZnh", "qzMEUGGJ0FpDLYRljtzJ24rj8XT6rBKz", "LijUR", "ZVB7ZDT4TSe2rtQPBLBW6RwhtV59NTLq"};
    public GM A00;

    public abstract Pair<C03679t[], GO[]> A0V(GM gm, int[][][] iArr, int[] iArr2) throws C9K;

    /* JADX WARN: Incorrect condition in loop: B:3:0x0004 */
    /* JADX WARN: Incorrect condition in loop: B:6:0x000b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static int A0Q(InterfaceC03669s[] interfaceC03669sArr, TrackGroup trackGroup) throws C9K {
        int formatSupportLevel = interfaceC03669sArr.length;
        int trackIndex = 0;
        for (int i = 0; i < bestRendererIndex; i++) {
            InterfaceC03669s interfaceC03669s = interfaceC03669sArr[i];
            for (int bestFormatSupportLevel = 0; bestFormatSupportLevel < bestRendererIndex; bestFormatSupportLevel++) {
                int bestRendererIndex = interfaceC03669s.AFt(trackGroup.A01(bestFormatSupportLevel));
                int bestRendererIndex2 = bestRendererIndex & 7;
                if (bestRendererIndex2 > trackIndex) {
                    formatSupportLevel = i;
                    trackIndex = bestRendererIndex2;
                    if (trackIndex == 4) {
                        return formatSupportLevel;
                    }
                }
            }
        }
        return formatSupportLevel;
    }

    public static int[] A0R(InterfaceC03669s interfaceC03669s, TrackGroup trackGroup) throws C9K {
        int[] iArr = new int[trackGroup.A01];
        for (int i = 0; i < trackGroup.A01; i++) {
            iArr[i] = interfaceC03669s.AFt(trackGroup.A01(i));
        }
        return iArr;
    }

    public static int[] A0S(InterfaceC03669s[] interfaceC03669sArr) throws C9K {
        int[] iArr = new int[interfaceC03669sArr.length];
        for (int i = 0; i < iArr.length; i++) {
            iArr[i] = interfaceC03669sArr[i].AFv();
        }
        return iArr;
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0065, code lost:
    
        if (r6 == r5) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0067, code lost:
    
        r3 = new int[r7.A01];
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x008d, code lost:
    
        r5 = r13[r6];
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x009b, code lost:
    
        if (com.facebook.ads.redexgen.X.VN.A01[4].charAt(3) == 'u') goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x009d, code lost:
    
        r3 = A0R(r5, r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x00a2, code lost:
    
        com.facebook.ads.redexgen.X.VN.A01[1] = "";
        r3 = A0R(r5, r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x008a, code lost:
    
        if (r6 == r5) goto L17;
     */
    @Override // com.facebook.ads.redexgen.X.GR
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final GS A0T(InterfaceC03669s[] interfaceC03669sArr, TrackGroupArray trackGroupArray) throws C9K {
        int[] A0R;
        int[] iArr = new int[interfaceC03669sArr.length + 1];
        TrackGroup[][] trackGroupArr = new TrackGroup[interfaceC03669sArr.length + 1][];
        int[][][] iArr2 = new int[interfaceC03669sArr.length + 1][][];
        for (int i = 0; i < trackGroupArr.length; i++) {
            trackGroupArr[i] = new TrackGroup[trackGroupArray.A01];
            iArr2[i] = new int[trackGroupArray.A01][];
            if (A01[2].charAt(17) != 'V') {
                throw new RuntimeException();
            }
            A01[1] = "";
        }
        int[] A0S = A0S(interfaceC03669sArr);
        for (int i2 = 0; i2 < trackGroupArray.A01; i2++) {
            TrackGroup A012 = trackGroupArray.A01(i2);
            int A0Q = A0Q(interfaceC03669sArr, A012);
            int groupIndex = interfaceC03669sArr.length;
            if (A01[4].charAt(3) != 'u') {
                A01[6] = "flHuZy9qfiSfYNp536tqdaojA4";
            } else {
                String[] strArr = A01;
                strArr[7] = "D4rc1OneeydPNAn3BWDV4yQ6n9XdhHzA";
                strArr[3] = "1lNTPVAxZlA71NpHB66K3LVNnVnwQcNq";
            }
            int i3 = iArr[A0Q];
            trackGroupArr[A0Q][i3] = A012;
            iArr2[A0Q][i3] = A0R;
            iArr[A0Q] = iArr[A0Q] + 1;
        }
        TrackGroupArray[] trackGroupArrayArr = new TrackGroupArray[interfaceC03669sArr.length];
        int[] iArr3 = new int[interfaceC03669sArr.length];
        for (int i4 = 0; i4 < interfaceC03669sArr.length; i4++) {
            int i5 = iArr[i4];
            trackGroupArrayArr[i4] = new TrackGroupArray((TrackGroup[]) C0557Hx.A0k(trackGroupArr[i4], i5));
            iArr2[i4] = (int[][]) C0557Hx.A0k(iArr2[i4], i5);
            iArr3[i4] = interfaceC03669sArr[i4].A83();
        }
        GM gm = new GM(iArr3, trackGroupArrayArr, A0S, iArr2, new TrackGroupArray((TrackGroup[]) C0557Hx.A0k(trackGroupArr[interfaceC03669sArr.length], iArr[interfaceC03669sArr.length])));
        Pair<C03679t[], GO[]> A0V = A0V(gm, iArr2, A0S);
        return new GS((C03679t[]) A0V.first, (GO[]) A0V.second, gm);
    }

    @Override // com.facebook.ads.redexgen.X.GR
    public final void A0U(Object obj) {
        this.A00 = (GM) obj;
    }
}
