package com.instagram.common.viewpoint.core;

import com.facebook.video.heroplayer.exocustom.MetaExoPlayerCustomization;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* renamed from: com.facebook.ads.redexgen.X.0y, reason: invalid class name and case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C00640y extends AnonymousClass94 {
    public static byte[] A0H;
    public static String[] A0I = {"m5Q3aiQKICJZrVflAtkG72aHaW7D7vzV", "Te6TlfxhDkM1nSnzhWnFswazR8GhYsIL", "RAA", "kEgqAeLW1EWE377lDOv4M7tHjIvdZKXO", "06ys5nuQ5LNcvNVR71UhF3Tfl10HYLje", "yFo", "kDpjkJehLDjfyQcmHJ0GXPIrbeMaoLDA", "wnjbAtiJPFcw6YA"};
    public AnonymousClass96 A00;
    public float A01;
    public int A02;
    public int A03;
    public long A04;
    public final float A05;
    public final int A06;
    public final int A07;
    public final long A08;
    public final long A09;
    public final long A0A;
    public final AbstractC0297Am<C0378Ds> A0B;
    public final float A0C;
    public final int A0D;
    public final long A0E;
    public final C3T A0F;
    public final EU A0G;

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    public C00640y(@MetaExoPlayerCustomization("Used for OculusAdaptiveTrackSelection") C1796oH c1796oH, @MetaExoPlayerCustomization("Used to retain old value for Oculus") int[] iArr, int i, EU eu, int i2, long j, long j2, long j3, int i3, int i4, float f, float f2, long j4, List<C0378Ds> list, C3T c3t) {
        super(c1796oH, iArr, i);
        if (j3 < j) {
            AnonymousClass44.A07(A03(0, 22, 43), A03(22, 90, 50));
            j3 = j;
        }
        this.A0G = eu;
        this.A0D = i2;
        this.A08 = j * 1000;
        this.A0E = j2 * 1000;
        this.A09 = 1000 * j3;
        this.A07 = i3;
        this.A06 = i4;
        this.A0C = f;
        this.A05 = f2;
        this.A0B = AbstractC0297Am.A05(list);
        this.A0A = j4;
        this.A0F = c3t;
        this.A01 = 1.0f;
        this.A02 = 0;
        this.A04 = -9223372036854775807L;
    }

    public static String A03(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A0H, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 89);
        }
        return new String(copyOfRange);
    }

    public static void A04() {
        A0H = new byte[]{-59, -24, -27, -12, -8, -19, -6, -23, -40, -10, -27, -25, -17, -41, -23, -16, -23, -25, -8, -19, -13, -14, -52, -17, -11, 0, -2, -1, -12, -7, -14, -85, -8, -12, -7, -49, 0, -3, -20, -1, -12, -6, -7, -33, -6, -35, -16, -1, -20, -12, -7, -52, -15, -1, -16, -3, -49, -12, -2, -18, -20, -3, -17, -40, -2, -85, -1, -6, -85, -19, -16, -85, -20, -1, -85, -9, -16, -20, -2, -1, -85, -8, -12, -7, -49, 0, -3, -20, -1, -12, -6, -7, -47, -6, -3, -36, 0, -20, -9, -12, -1, 4, -44, -7, -18, -3, -16, -20, -2, -16, -40, -2};
    }

    static {
        A04();
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.1h != com.google.common.collect.ImmutableList$Builder<com.facebook.ads.androidx.media3.exoplayer.trackselection.AdaptiveTrackSelection$AdaptationCheckpoint> */
    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.1h != com.google.common.collect.ImmutableList$Builder<com.google.common.collect.ImmutableList<com.facebook.ads.androidx.media3.exoplayer.trackselection.AdaptiveTrackSelection$AdaptationCheckpoint>> */
    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.Am != com.google.common.collect.ImmutableList<java.lang.Integer> */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0110  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x011a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static AbstractC0297Am<AbstractC0297Am<C0378Ds>> A00(E9[] e9Arr) {
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < e9Arr.length; i++) {
            if (e9Arr[i] != null && e9Arr[i].A02.length > 1) {
                C00731h A01 = AbstractC0297Am.A01();
                A01.A04(new C0378Ds(0L, 0L));
                arrayList.add(A01);
            } else {
                arrayList.add(null);
            }
        }
        long[][] A06 = A06(e9Arr);
        int length = A06.length;
        if (A0I[0].charAt(10) != 'x') {
            A0I[0] = "UXetESR07W40Ugl2KcKxfZnSKo41RBjF";
            int[] iArr = new int[length];
            long[] jArr = new long[A06.length];
            for (int i2 = 0; i2 < A06.length; i2++) {
                int length2 = A06[i2].length;
                if (A0I[0].charAt(10) == 'x') {
                    throw new RuntimeException();
                }
                A0I[7] = "x";
                jArr[i2] = length2 == 0 ? 0L : A06[i2][0];
                String[] strArr = A0I;
                if (strArr[1].charAt(10) != strArr[4].charAt(10)) {
                    String[] strArr2 = A0I;
                    strArr2[1] = "cSuX5sbs1mm7BtC5NofnfdI255eKyli3";
                    strArr2[4] = "Z411JjDvpqHs7gscP9Mv86ZFtFCMjIgX";
                }
            }
            A05(arrayList, jArr);
            AbstractC0297Am<Integer> A02 = A02(A06);
            for (int i3 = 0; i3 < A02.size(); i3++) {
                int intValue = A02.get(i3).intValue();
                int i4 = iArr[intValue] + 1;
                iArr[intValue] = i4;
                jArr[intValue] = A06[intValue][i4];
                A05(arrayList, jArr);
            }
            for (int i5 = 0; i5 < e9Arr.length; i5++) {
                if (arrayList.get(i5) != null) {
                    jArr[i5] = jArr[i5] * 2;
                }
            }
            A05(arrayList, jArr);
            C00731h A012 = AbstractC0297Am.A01();
            int i6 = 0;
            while (true) {
                int size = arrayList.size();
                String[] strArr3 = A0I;
                if (strArr3[5].length() != strArr3[2].length()) {
                    String[] strArr4 = A0I;
                    strArr4[5] = "B5d";
                    strArr4[2] = "E7u";
                    if (i6 >= size) {
                        break;
                    }
                    C00731h c00731h = (C00731h) arrayList.get(i6);
                    A012.A04(c00731h != null ? AbstractC0297Am.A03() : c00731h.A05());
                    i6++;
                } else {
                    String[] strArr5 = A0I;
                    strArr5[6] = "P6lwie0zupyVMIziqYi4GtWsnZGWabHp";
                    strArr5[3] = "HBKI3D47JNzwp3E4fcvtN9y7FoJFPrZj";
                    if (i6 >= size) {
                        break;
                    }
                    C00731h c00731h2 = (C00731h) arrayList.get(i6);
                    A012.A04(c00731h2 != null ? AbstractC0297Am.A03() : c00731h2.A05());
                    i6++;
                }
            }
            return A012.A05();
        }
        throw new RuntimeException();
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.oE != com.google.common.collect.Multimap<java.lang.Double, java.lang.Integer> */
    public static AbstractC0297Am<Integer> A02(long[][] jArr) {
        InterfaceC1793oE A00 = AbstractC1795oG.A02().A03().A00();
        for (int i = 0; i < jArr.length; i++) {
            if (jArr[i].length > 1) {
                double[] logBitrates = new double[jArr[i].length];
                int i2 = 0;
                while (true) {
                    double d = 0.0d;
                    if (i2 >= jArr[i].length) {
                        break;
                    }
                    if (jArr[i][i2] != -1) {
                        d = Math.log(jArr[i][i2]);
                    }
                    logBitrates[i2] = d;
                    i2++;
                }
                double d2 = logBitrates[logBitrates.length - 1] - logBitrates[0];
                int i3 = 0;
                for (int i4 = 1; i3 < logBitrates.length - i4; i4 = 1) {
                    A00.AGU(Double.valueOf(d2 == 0.0d ? 1.0d : (((logBitrates[i3] + logBitrates[i3 + 1]) * 0.5d) - logBitrates[0]) / d2), Integer.valueOf(i));
                    i3++;
                }
            }
        }
        return AbstractC0297Am.A05(A00.values());
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.1h != com.google.common.collect.ImmutableList$Builder<com.facebook.ads.androidx.media3.exoplayer.trackselection.AdaptiveTrackSelection$AdaptationCheckpoint> */
    public static void A05(List<C00731h<C0378Ds>> list, long[] jArr) {
        long j = 0;
        int i = 0;
        while (true) {
            if (i < jArr.length) {
                long j2 = jArr[i];
                String[] strArr = A0I;
                if (strArr[5].length() != strArr[2].length()) {
                    break;
                }
                A0I[0] = "hzQzkxJwAHZ0fRiIn7Pvrd3jIUiof14p";
                j += j2;
                i++;
            } else {
                for (int i2 = 0; i2 < list.size(); i2++) {
                    C00731h<C0378Ds> c00731h = list.get(i2);
                    if (A0I[0].charAt(10) != 'x') {
                        A0I[0] = "0V4VZlbFayh1Opq7Ah9Nva0ccysrREXP";
                        if (c00731h != null) {
                            c00731h.A04(new C0378Ds(j, jArr[i2]));
                        }
                    }
                }
                return;
            }
        }
        throw new RuntimeException();
    }

    public static long[][] A06(E9[] e9Arr) {
        long j;
        long[] jArr;
        long[][] jArr2 = new long[e9Arr.length][];
        for (int i = 0; i < e9Arr.length; i++) {
            E9 e9 = e9Arr[i];
            if (e9 == null) {
                jArr2[i] = new long[0];
            } else {
                long[] jArr3 = new long[e9.A02.length];
                String[] strArr = A0I;
                String str = strArr[6];
                String str2 = strArr[3];
                int i2 = str.charAt(18);
                if (i2 == str2.charAt(18)) {
                    throw new RuntimeException();
                }
                String[] strArr2 = A0I;
                strArr2[5] = "e4C";
                strArr2[2] = "lZL";
                jArr2[i] = jArr3;
                for (int i3 = 0; i3 < e9.A02.length; i3++) {
                    int j2 = e9.A01.A08(e9.A02[i3]).A05;
                    int i4 = A0I[7].length();
                    if (i4 != 11) {
                        String[] strArr3 = A0I;
                        strArr3[5] = "HL2";
                        strArr3[2] = "liv";
                        j = j2;
                        jArr = jArr2[i];
                        if (j != -1) {
                            jArr[i3] = j;
                        }
                        j = 0;
                        jArr[i3] = j;
                    } else {
                        j = j2;
                        jArr = jArr2[i];
                        if (j != -1) {
                            jArr[i3] = j;
                        }
                        j = 0;
                        jArr[i3] = j;
                    }
                }
                Arrays.sort(jArr2[i]);
            }
        }
        return jArr2;
    }

    @Override // com.instagram.common.viewpoint.core.AnonymousClass94, com.instagram.common.viewpoint.core.InterfaceC1640lj
    public final void A5p() {
        this.A00 = null;
    }

    @Override // com.instagram.common.viewpoint.core.AnonymousClass94, com.instagram.common.viewpoint.core.InterfaceC1640lj
    public final void A6C() {
        this.A04 = -9223372036854775807L;
        this.A00 = null;
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC1640lj
    public final int A8v() {
        return this.A03;
    }

    @Override // com.instagram.common.viewpoint.core.AnonymousClass94, com.instagram.common.viewpoint.core.InterfaceC1640lj
    public final void AEc(float f) {
        this.A01 = f;
    }
}
