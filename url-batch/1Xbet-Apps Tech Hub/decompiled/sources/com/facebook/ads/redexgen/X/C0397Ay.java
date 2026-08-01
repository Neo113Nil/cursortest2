package com.facebook.ads.redexgen.X;

import android.graphics.Point;
import android.text.TextUtils;
import android.util.Pair;
import com.facebook.ads.internal.exoplayer2.thirdparty.Format;
import com.facebook.ads.internal.exoplayer2.thirdparty.source.TrackGroup;
import com.facebook.ads.internal.exoplayer2.thirdparty.source.TrackGroupArray;
import com.facebook.ads.internal.exoplayer2.thirdparty.trackselection.DefaultTrackSelector$Parameters;
import com.facebook.ads.internal.exoplayer2.thirdparty.trackselection.DefaultTrackSelector$SelectionOverride;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: com.facebook.ads.redexgen.X.Ay, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C0397Ay extends VN {
    public static byte[] A02;
    public static String[] A03 = {"x6AsNgj7kZHrnoNYywGy3amTsD0l", "S34B6ywREx44pNmlWPMRcx17PIA7Fyf2", "1XorlyLpztZAXiZGzmiFCBwFfMWU", "T5Z409y2ECpb8uf8T6KWShvwgb", "8Qiq8HU85lCoFhvN1dBY3zigvCratExc", "EyxqnSMNDXwhS4zpORn6ov", "S8xh7faol6xkg145s9aDIWkyvYFJ4njt", "Q6jD8cwEOZ"};
    public static final int[] A04;
    public final GN A00;
    public final AtomicReference<DefaultTrackSelector$Parameters> A01;

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    public static int A03(TrackGroup trackGroup, int[] iArr, int i, String str, int i2, int i3, int i4, List<Integer> list) {
        int i5 = 0;
        for (int i6 = 0; i6 < list.size(); i6++) {
            int intValue = list.get(i6).intValue();
            if (A0L(trackGroup.A01(intValue), str, iArr[intValue], i, i2, i3, i4)) {
                i5++;
            }
        }
        return i5;
    }

    public static String A0C(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A02, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 116);
        }
        return new String(copyOfRange);
    }

    public static void A0E() {
        A02 = new byte[]{96, 123, 113};
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    public static void A0F(TrackGroup trackGroup, int[] iArr, int i, String str, int i2, int i3, int i4, List<Integer> list) {
        for (int size = list.size() - 1; size >= 0; size--) {
            int intValue = list.get(size).intValue();
            if (!A0L(trackGroup.A01(intValue), str, iArr[intValue], i, i2, i3, i4)) {
                list.remove(size);
            }
        }
    }

    static {
        A0E();
        A04 = new int[0];
    }

    public C0397Ay() {
        this(null);
    }

    public C0397Ay(GN gn) {
        this.A00 = gn;
        this.A01 = new AtomicReference<>(DefaultTrackSelector$Parameters.A0J);
    }

    public static int A00(int i, int i2) {
        if (i == -1) {
            return i2 == -1 ? 0 : -1;
        }
        if (i2 == -1) {
            return 1;
        }
        return i - i2;
    }

    public static int A01(int i, int i2) {
        if (i > i2) {
            return 1;
        }
        return i2 > i ? -1 : 0;
    }

    /* JADX WARN: Incorrect condition in loop: B:3:0x0004 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static int A04(TrackGroup trackGroup, int[] iArr, GE ge) {
        int i = 0;
        for (int i2 = 0; i2 < count; i2++) {
            Format A01 = trackGroup.A01(i2);
            int count = iArr[i2];
            if (A0J(A01, count, ge)) {
                i++;
            }
        }
        return i;
    }

    public static Point A05(boolean z, int tempViewportWidth, int i, int i2, int i3) {
        if (z) {
            if ((i2 > i3) != (tempViewportWidth > i)) {
                tempViewportWidth = i;
                i = tempViewportWidth;
            }
        }
        if (i2 * i >= i3 * tempViewportWidth) {
            return new Point(tempViewportWidth, C0557Hx.A04(tempViewportWidth * i3, i2));
        }
        return new Point(C0557Hx.A04(i * i2, i3), i);
    }

    private final C0396Ax A06(int i, TrackGroupArray trackGroupArray, int[][] iArr, DefaultTrackSelector$Parameters defaultTrackSelector$Parameters) throws C9K {
        TrackGroup trackGroup = null;
        int i2 = 0;
        int i3 = 0;
        for (int i4 = 0; i4 < trackGroupArray.A01; i4++) {
            TrackGroup A01 = trackGroupArray.A01(i4);
            if (A03[1].charAt(28) != 'F') {
                throw new RuntimeException();
            }
            String[] strArr = A03;
            strArr[2] = "1NYDqnXuXqFwXvhmhx1oqfe5tY82";
            strArr[5] = "WKIyqdfHfHQHhajlNNxex4";
            int[] iArr2 = iArr[i4];
            for (int selectedTrackScore = 0; selectedTrackScore < A01.A01; selectedTrackScore++) {
                if (A0H(iArr2[selectedTrackScore], defaultTrackSelector$Parameters.A0B)) {
                    int selectedTrackIndex = (A01.A01(selectedTrackScore).A0D & 1) != 0 ? 2 : 1;
                    if (A0H(iArr2[selectedTrackScore], false)) {
                        selectedTrackIndex += 1000;
                    }
                    if (selectedTrackIndex > i3) {
                        trackGroup = A01;
                        i2 = selectedTrackScore;
                        i3 = selectedTrackIndex;
                    }
                }
            }
        }
        if (trackGroup == null) {
            return null;
        }
        return new C0396Ax(trackGroup, i2);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x006b, code lost:
    
        if (r14 != false) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x006d, code lost:
    
        r14 = r2.A0F;
        r13 = com.facebook.ads.redexgen.X.C0397Ay.A03;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x007f, code lost:
    
        if (r13[3].length() == r13[7].length()) goto L78;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0081, code lost:
    
        com.facebook.ads.redexgen.X.C0397Ay.A03[1] = "4KlbdBkqrnIgKSOErHym9NPyt3h5FUou";
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0089, code lost:
    
        if (r14 == (-1)) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x008f, code lost:
    
        if (r2.A0F > r18.A03) goto L68;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0093, code lost:
    
        if (r2.A08 == (-1)) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0099, code lost:
    
        if (r2.A08 > r18.A02) goto L68;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x009d, code lost:
    
        if (r2.A04 == (-1)) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x00a3, code lost:
    
        if (r2.A04 > r18.A01) goto L68;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x00a5, code lost:
    
        r14 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x00a6, code lost:
    
        if (r14 != 0) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00aa, code lost:
    
        if (r18.A0C != false) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00b0, code lost:
    
        if (r14 == 0) goto L64;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00b2, code lost:
    
        r1 = 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x00b3, code lost:
    
        r13 = A0H(r15[r3], false);
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x00ba, code lost:
    
        if (r13 == false) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00bc, code lost:
    
        r1 = r1 + 1000;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00be, code lost:
    
        if (r1 <= r9) goto L63;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00c0, code lost:
    
        r0 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00c1, code lost:
    
        if (r1 != r9) goto L48;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00c5, code lost:
    
        if (r18.A0D == false) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x00cd, code lost:
    
        if (A00(r2.A04, r8) >= 0) goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x00cf, code lost:
    
        r0 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x00dc, code lost:
    
        r0 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x00de, code lost:
    
        r0 = r2.A0E();
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x00e2, code lost:
    
        if (r0 == r7) goto L58;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x00e4, code lost:
    
        r0 = A00(r0, r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x00e8, code lost:
    
        if (r13 == false) goto L60;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x00ea, code lost:
    
        if (r14 == 0) goto L60;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x00ec, code lost:
    
        if (r0 <= 0) goto L59;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x00ee, code lost:
    
        r0 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x00f7, code lost:
    
        r0 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x00f9, code lost:
    
        if (r0 >= 0) goto L62;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x00fb, code lost:
    
        r0 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x00fd, code lost:
    
        r0 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x00f0, code lost:
    
        r0 = r2.A04;
        r0 = A00(r0, r8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x00d0, code lost:
    
        if (r0 == 0) goto L82;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x00d2, code lost:
    
        r11 = r5;
        r10 = r3;
        r9 = r1;
        r8 = r2.A04;
        r7 = r2.A0E();
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x00ff, code lost:
    
        r0 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x0101, code lost:
    
        r1 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x0113, code lost:
    
        r14 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x010f, code lost:
    
        if (r14 != false) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x0115, code lost:
    
        r6 = r6 + 1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static C0396Ax A07(TrackGroupArray trackGroupArray, int[][] iArr, DefaultTrackSelector$Parameters defaultTrackSelector$Parameters) {
        TrackGroup trackGroup = null;
        int i = 0;
        int i2 = 0;
        int i3 = -1;
        int groupIndex = -1;
        int selectedPixelCount = 0;
        loop0: while (selectedPixelCount < trackGroupArray.A01) {
            TrackGroup A01 = trackGroupArray.A01(selectedPixelCount);
            List<Integer> A0D = A0D(A01, defaultTrackSelector$Parameters.A06, defaultTrackSelector$Parameters.A05, defaultTrackSelector$Parameters.A0F);
            int[] iArr2 = iArr[selectedPixelCount];
            int selectedTrackIndex = 0;
            while (true) {
                int i4 = A01.A01;
                String[] strArr = A03;
                if (strArr[2].length() == strArr[5].length()) {
                    break loop0;
                }
                A03[0] = "lwqQHO";
                if (selectedTrackIndex < i4) {
                    if (A0H(iArr2[selectedTrackIndex], defaultTrackSelector$Parameters.A0B)) {
                        Format A012 = A01.A01(selectedTrackIndex);
                        boolean contains = A0D.contains(Integer.valueOf(selectedTrackIndex));
                        String[] strArr2 = A03;
                        if (strArr2[2].length() != strArr2[5].length()) {
                            A03[6] = "SiU1QSN6MQFkL93X4OOrhG4pGOhEurBM";
                        } else {
                            String[] strArr3 = A03;
                            strArr3[2] = "DpIh5EonHVTuVHRer6KDIMhApdM7";
                            strArr3[5] = "CmkW9iHHxPPPILgrY4olMD";
                        }
                    }
                    selectedTrackIndex++;
                }
            }
            throw new RuntimeException();
        }
        if (trackGroup == null) {
            return null;
        }
        return new C0396Ax(trackGroup, i);
    }

    private final C0396Ax A08(TrackGroupArray trackGroupArray, int[][] iArr, DefaultTrackSelector$Parameters defaultTrackSelector$Parameters) throws C9K {
        int i;
        int i2;
        TrackGroup trackGroup = null;
        int i3 = 0;
        int i4 = 0;
        for (int i5 = 0; i5 < trackGroupArray.A01; i5++) {
            TrackGroup A01 = trackGroupArray.A01(i5);
            int[] iArr2 = iArr[i5];
            for (int i6 = 0; i6 < A01.A01; i6++) {
                if (A0H(iArr2[i6], defaultTrackSelector$Parameters.A0B)) {
                    Format A012 = A01.A01(i6);
                    int i7 = A012.A0D & (defaultTrackSelector$Parameters.A00 ^ (-1));
                    boolean z = (i7 & 1) != 0;
                    boolean z2 = (i7 & 2) != 0;
                    boolean A0K = A0K(A012, defaultTrackSelector$Parameters.A08);
                    if (A0K || (defaultTrackSelector$Parameters.A0E && A0I(A012))) {
                        if (z) {
                            i = 8;
                        } else if (!z2) {
                            i = 6;
                        } else {
                            i = 4;
                        }
                        i2 = i + (A0K ? 1 : 0);
                    } else if (z) {
                        i2 = 3;
                    } else if (z2) {
                        if (A0K(A012, defaultTrackSelector$Parameters.A07)) {
                            i2 = 2;
                        } else {
                            i2 = 1;
                        }
                    }
                    if (A0H(iArr2[i6], false)) {
                        i2 += 1000;
                    }
                    if (i2 > i4) {
                        trackGroup = A01;
                        i3 = i6;
                        i4 = i2;
                    }
                }
            }
        }
        if (trackGroup == null) {
            return null;
        }
        return new C0396Ax(trackGroup, i3);
    }

    public static GO A09(TrackGroupArray trackGroupArray, int[][] iArr, int i, DefaultTrackSelector$Parameters defaultTrackSelector$Parameters, GN gn) throws C9K {
        int i2;
        if (defaultTrackSelector$Parameters.A0A) {
            i2 = 24;
        } else {
            i2 = 16;
        }
        boolean z = defaultTrackSelector$Parameters.A09 && (i & i2) != 0;
        for (int i3 = 0; i3 < trackGroupArray.A01; i3++) {
            TrackGroup A01 = trackGroupArray.A01(i3);
            int[] A0O = A0O(A01, iArr[i3], z, i2, defaultTrackSelector$Parameters.A03, defaultTrackSelector$Parameters.A02, defaultTrackSelector$Parameters.A01, defaultTrackSelector$Parameters.A06, defaultTrackSelector$Parameters.A05, defaultTrackSelector$Parameters.A0F);
            if (A0O.length > 0) {
                return ((GN) HI.A01(gn)).A4k(A01, A0O);
            }
        }
        return null;
    }

    /* JADX WARN: Incorrect condition in loop: B:3:0x0006 */
    /* JADX WARN: Incorrect condition in loop: B:6:0x0011 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final GO A0A(TrackGroupArray trackGroupArray, int[][] iArr, int i, DefaultTrackSelector$Parameters defaultTrackSelector$Parameters, GN gn) throws C9K {
        int groupIndex = -1;
        int i2 = -1;
        GF trackScore = null;
        for (int i3 = 0; i3 < selectedTrackIndex; i3++) {
            TrackGroup A01 = trackGroupArray.A01(i3);
            int[] iArr2 = iArr[i3];
            for (int i4 = 0; i4 < selectedTrackIndex; i4++) {
                int selectedGroupIndex = iArr2[i4];
                if (A0H(selectedGroupIndex, defaultTrackSelector$Parameters.A0B)) {
                    Format A012 = A01.A01(i4);
                    int selectedTrackIndex = iArr2[i4];
                    GF gf = new GF(A012, defaultTrackSelector$Parameters, selectedTrackIndex);
                    if (trackScore != null) {
                        int selectedTrackIndex2 = gf.A00(trackScore);
                        if (selectedTrackIndex2 <= 0) {
                        }
                    }
                    i2 = i3;
                    groupIndex = i4;
                    trackScore = gf;
                }
            }
        }
        if (i2 == -1) {
            return null;
        }
        TrackGroup A013 = trackGroupArray.A01(i2);
        if (!defaultTrackSelector$Parameters.A0D && gn != null) {
            int[] A0N = A0N(A013, iArr[i2], defaultTrackSelector$Parameters.A09);
            int selectedTrackIndex3 = A0N.length;
            if (selectedTrackIndex3 > 0) {
                return gn.A4k(A013, A0N);
            }
        }
        return new C0396Ax(A013, groupIndex);
    }

    private final GO A0B(TrackGroupArray trackGroupArray, int[][] iArr, int i, DefaultTrackSelector$Parameters defaultTrackSelector$Parameters, GN gn) throws C9K {
        GO go = null;
        if (!defaultTrackSelector$Parameters.A0D && gn != null) {
            go = A09(trackGroupArray, iArr, i, defaultTrackSelector$Parameters, gn);
        }
        if (go == null) {
            return A07(trackGroupArray, iArr, defaultTrackSelector$Parameters);
        }
        return go;
    }

    public static List<Integer> A0D(TrackGroup trackGroup, int i, int i2, boolean z) {
        ArrayList arrayList = new ArrayList(trackGroup.A01);
        for (int i3 = 0; i3 < trackGroup.A01; i3++) {
            arrayList.add(Integer.valueOf(i3));
        }
        if (i == Integer.MAX_VALUE || i2 == Integer.MAX_VALUE) {
            return arrayList;
        }
        int i4 = Integer.MAX_VALUE;
        for (int videoPixels = 0; videoPixels < trackGroup.A01; videoPixels++) {
            Format A01 = trackGroup.A01(videoPixels);
            if (A01.A0F > 0 && A01.A08 > 0) {
                Point A05 = A05(z, i, i2, A01.A0F, A01.A08);
                int i5 = A01.A0F * A01.A08;
                if (A01.A0F >= ((int) (A05.x * 0.98f)) && A01.A08 >= ((int) (A05.y * 0.98f)) && i5 < i4) {
                    i4 = i5;
                }
            }
        }
        if (i4 != Integer.MAX_VALUE) {
            for (int maxVideoPixelsToRetain = arrayList.size() - 1; maxVideoPixelsToRetain >= 0; maxVideoPixelsToRetain--) {
                int i6 = trackGroup.A01(((Integer) arrayList.get(maxVideoPixelsToRetain)).intValue()).A0E();
                if (i6 == -1 || i6 > i4) {
                    arrayList.remove(maxVideoPixelsToRetain);
                }
            }
        }
        return arrayList;
    }

    public static void A0G(GM gm, int[][][] iArr, C03679t[] c03679tArr, GO[] goArr, int i) {
        if (i == 0) {
            return;
        }
        int i2 = -1;
        int i3 = -1;
        boolean z = true;
        int i4 = 0;
        while (true) {
            int tunnelingAudioRendererIndex = gm.A00();
            if (i4 >= tunnelingAudioRendererIndex) {
                break;
            }
            int i5 = gm.A01(i4);
            GO go = goArr[i4];
            if ((i5 == 1 || i5 == 2) && go != null && A0M(iArr[i4], gm.A02(i4), go)) {
                if (i5 == 1) {
                    if (i2 != -1) {
                        z = false;
                        break;
                    }
                    i2 = i4;
                } else {
                    if (i3 != -1) {
                        z = false;
                        break;
                    }
                    i3 = i4;
                }
            }
            i4++;
        }
        if (z & ((i2 == -1 || i3 == -1) ? false : true)) {
            C03679t c03679t = new C03679t(i);
            c03679tArr[i2] = c03679t;
            c03679tArr[i3] = c03679t;
        }
    }

    public static boolean A0H(int i, boolean z) {
        int i2 = i & 7;
        return i2 == 4 || (z && i2 == 3);
    }

    public static boolean A0I(Format format) {
        return TextUtils.isEmpty(format.A0N) || A0K(format, A0C(0, 3, 97));
    }

    public static boolean A0J(Format format, int i, GE ge) {
        if (!A0H(i, false) || format.A05 != ge.A00 || format.A0C != ge.A01) {
            return false;
        }
        String str = ge.A02;
        String[] strArr = A03;
        if (strArr[3].length() == strArr[7].length()) {
            throw new RuntimeException();
        }
        A03[4] = "Z4TnxuroRrU42RhZWOmYjmwLcPTU1MVO";
        return str == null || TextUtils.equals(ge.A02, format.A0O);
    }

    public static boolean A0K(Format format, String str) {
        if (str != null) {
            boolean equals = TextUtils.equals(str, C0557Hx.A0L(format.A0N));
            if (A03[1].charAt(28) != 'F') {
                throw new RuntimeException();
            }
            A03[6] = "X09dGmvImKzkjml92Go2OBGPrO7s8ElS";
            if (equals) {
                return true;
            }
        }
        return false;
    }

    public static boolean A0L(Format format, String str, int i, int i2, int i3, int i4, int i5) {
        if (!A0H(i, false) || (i & i2) == 0) {
            return false;
        }
        if (str != null && !C0557Hx.A0g(format.A0O, str)) {
            return false;
        }
        if (format.A0F != -1 && format.A0F > i3) {
            return false;
        }
        int i6 = format.A08;
        String[] strArr = A03;
        if (strArr[2].length() == strArr[5].length()) {
            throw new RuntimeException();
        }
        A03[4] = "SWfcLm8XXzRqeXuobK6MjvAJ3gvDaDv7";
        if (i6 == -1 || format.A08 <= i4) {
            return format.A04 == -1 || format.A04 <= i5;
        }
        return false;
    }

    public static boolean A0M(int[][] iArr, TrackGroupArray trackGroupArray, GO go) {
        if (go == null) {
            return false;
        }
        int A00 = trackGroupArray.A00(go.A81());
        for (int i = 0; i < go.length(); i++) {
            int trackGroupIndex = iArr[A00][go.A75(i)] & 32;
            if (trackGroupIndex != 32) {
                return false;
            }
        }
        return true;
    }

    /* JADX WARN: Incorrect condition in loop: B:31:0x0088 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static int[] A0N(TrackGroup trackGroup, int[] iArr, boolean z) {
        int index;
        int configurationCount = 0;
        GE ge = null;
        HashSet hashSet = new HashSet();
        int i = 0;
        while (true) {
            int i2 = trackGroup.A01;
            if (A03[4].charAt(23) == 'I') {
                throw new RuntimeException();
            }
            String[] strArr = A03;
            strArr[2] = "meGLfV23Rzl9igGpAxJQFKheW1LS";
            strArr[5] = "FiWVyQMXAFPncybwnc3GZ7";
            if (i < i2) {
                Format A01 = trackGroup.A01(i);
                GE ge2 = new GE(A01.A05, A01.A0C, z ? null : A01.A0O);
                if (hashSet.add(ge2)) {
                    int i3 = A04(trackGroup, iArr, ge2);
                    if (A03[1].charAt(28) != 'F') {
                        if (i3 <= configurationCount) {
                        }
                        ge = ge2;
                        configurationCount = i3;
                    } else {
                        A03[1] = "qbEeyg8BdzMApnixm7aM3K2w4BJzFZ2Y";
                        if (i3 <= configurationCount) {
                        }
                        ge = ge2;
                        configurationCount = i3;
                    }
                }
                i++;
            } else {
                if (configurationCount > 1) {
                    int[] iArr2 = new int[configurationCount];
                    int i4 = 0;
                    if (A03[4].charAt(23) != 'I') {
                        String[] strArr2 = A03;
                        strArr2[2] = "4LRww03tsnXN2lDzEbKe5Z8dH5qv";
                        strArr2[5] = "mlJWR4ilrpKl1KfE3NcYmb";
                        index = 0;
                    } else {
                        index = 0;
                    }
                    while (index < selectedConfigurationTrackCount) {
                        Format A012 = trackGroup.A01(index);
                        int configurationCount2 = iArr[index];
                        Object A013 = HI.A01(ge);
                        if (A03[1].charAt(28) != 'F') {
                            throw new RuntimeException();
                        }
                        A03[4] = "nSxM8ZPkvfs0IWAG7eseSPBOLfK4wpcw";
                        if (A0J(A012, configurationCount2, (GE) A013)) {
                            int selectedConfigurationTrackCount = i4 + 1;
                            iArr2[i4] = index;
                            i4 = selectedConfigurationTrackCount;
                        }
                        index++;
                    }
                    return iArr2;
                }
                return A04;
            }
        }
    }

    public static int[] A0O(TrackGroup trackGroup, int[] iArr, boolean z, int i, int i2, int selectedMimeTypeTrackCount, int i3, int i4, int i5, boolean z2) {
        int countForMimeType;
        if (trackGroup.A01 >= 2) {
            List<Integer> A0D = A0D(trackGroup, i4, i5, z2);
            if (A0D.size() < 2) {
                return A04;
            }
            String selectedMimeType = null;
            if (!z) {
                HashSet hashSet = new HashSet();
                int i6 = 0;
                for (int selectedMimeTypeTrackCount2 = 0; selectedMimeTypeTrackCount2 < A0D.size(); selectedMimeTypeTrackCount2++) {
                    String str = trackGroup.A01(A0D.get(selectedMimeTypeTrackCount2).intValue()).A0O;
                    if (hashSet.add(str) && (countForMimeType = A03(trackGroup, iArr, i, str, i2, selectedMimeTypeTrackCount, i3, A0D)) > i6) {
                        selectedMimeType = str;
                        i6 = countForMimeType;
                    }
                }
            }
            A0F(trackGroup, iArr, i, selectedMimeType, i2, selectedMimeTypeTrackCount, i3, A0D);
            return A0D.size() < 2 ? A04 : C0557Hx.A0j(A0D);
        }
        return A04;
    }

    private final GO[] A0P(GM gm, int[][][] iArr, int[] iArr2, DefaultTrackSelector$Parameters defaultTrackSelector$Parameters) throws C9K {
        int A00 = gm.A00();
        GO[] goArr = new GO[A00];
        boolean seenVideoRendererWithMappedTracks = false;
        boolean z = false;
        for (int i = 0; i < A00; i++) {
            if (2 == gm.A01(i)) {
                if (!z) {
                    goArr[i] = A0B(gm.A02(i), iArr[i], iArr2[i], defaultTrackSelector$Parameters, this.A00);
                    z = goArr[i] != null;
                }
                seenVideoRendererWithMappedTracks |= gm.A02(i).A01 > 0;
            }
        }
        boolean z2 = false;
        int rendererCount = 0;
        for (int i2 = 0; i2 < A00; i2++) {
            int A01 = gm.A01(i2);
            switch (A01) {
                case 1:
                    if (z2) {
                        break;
                    } else {
                        TrackGroupArray A022 = gm.A02(i2);
                        int[][] iArr3 = iArr[i2];
                        int i3 = iArr2[i2];
                        goArr[i2] = A0A(A022, iArr3, i3, defaultTrackSelector$Parameters, seenVideoRendererWithMappedTracks ? null : this.A00);
                        if (goArr[i2] != null) {
                            z2 = true;
                            break;
                        } else {
                            z2 = false;
                            break;
                        }
                    }
                case 2:
                    break;
                case 3:
                    if (rendererCount == 0) {
                        goArr[i2] = A08(gm.A02(i2), iArr[i2], defaultTrackSelector$Parameters);
                        rendererCount = goArr[i2] != null ? 1 : 0;
                        if (A03[1].charAt(28) != 'F') {
                            throw new RuntimeException();
                        }
                        String[] strArr = A03;
                        strArr[2] = "QJl7DztNVPNycYqDWlGKy9194VAG";
                        strArr[5] = "9kW2zRUIc2UhcVCPTVcu4Y";
                        break;
                    } else {
                        continue;
                    }
                default:
                    goArr[i2] = A06(A01, gm.A02(i2), iArr[i2], defaultTrackSelector$Parameters);
                    break;
            }
        }
        return goArr;
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0081  */
    @Override // com.facebook.ads.redexgen.X.VN
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Pair<C03679t[], GO[]> A0V(GM gm, int[][][] iArr, int[] iArr2) throws C9K {
        boolean z;
        DefaultTrackSelector$Parameters defaultTrackSelector$Parameters = this.A01.get();
        int A00 = gm.A00();
        GO[] A0P = A0P(gm, iArr, iArr2, defaultTrackSelector$Parameters);
        for (int i = 0; i < A00; i++) {
            if (defaultTrackSelector$Parameters.A06(i)) {
                A0P[i] = null;
            } else {
                TrackGroupArray A022 = gm.A02(i);
                if (defaultTrackSelector$Parameters.A07(i, A022)) {
                    DefaultTrackSelector$SelectionOverride A05 = defaultTrackSelector$Parameters.A05(i, A022);
                    if (A05 == null) {
                        A0P[i] = null;
                    } else if (A05.A01 == 1) {
                        TrackGroup A01 = A022.A01(A05.A00);
                        int rendererCount = A05.A02[0];
                        A0P[i] = new C0396Ax(A01, rendererCount);
                    } else {
                        A0P[i] = ((GN) HI.A01(this.A00)).A4k(A022.A01(A05.A00), A05.A02);
                    }
                }
            }
        }
        C03679t[] rendererConfigurations = new C03679t[A00];
        for (int i2 = 0; i2 < A00; i2++) {
            if (!defaultTrackSelector$Parameters.A06(i2)) {
                int rendererCount2 = gm.A01(i2);
                if (rendererCount2 == 5 || A0P[i2] != null) {
                    z = true;
                    rendererConfigurations[i2] = !z ? C03679t.A01 : null;
                }
            }
            z = false;
            rendererConfigurations[i2] = !z ? C03679t.A01 : null;
        }
        A0G(gm, iArr, rendererConfigurations, A0P, defaultTrackSelector$Parameters.A04);
        return Pair.create(rendererConfigurations, A0P);
    }
}
