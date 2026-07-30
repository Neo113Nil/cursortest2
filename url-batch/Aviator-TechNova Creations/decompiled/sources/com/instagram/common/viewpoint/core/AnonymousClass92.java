package com.instagram.common.viewpoint.core;

import android.content.Context;
import android.graphics.Point;
import android.os.Looper;
import android.text.TextUtils;
import android.util.Pair;
import androidx.recyclerview.widget.ItemTouchHelper;
import com.facebook.ads.androidx.media3.common.Timeline;
import com.facebook.video.heroplayer.exocustom.MetaExoPlayerCustomization;
import com.google.android.material.card.MaterialCardViewHelper;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.objectweb.asm.Opcodes;

/* renamed from: com.facebook.ads.redexgen.X.92, reason: invalid class name */
/* loaded from: assets/audience_network.dex */
public final class AnonymousClass92 extends AbstractC1645li {
    public static byte[] A07;
    public static String[] A08 = {"yr7s5jzv1addyUjDczkFmKgb3TbXTjPI", "k5bxDF12X7IfueMvpCyLhsS14secbcRr", "A1nn9z9SPvnfAziOnMuSk0GZzxZ0jVfY", "Bn8GSVMc2Ww3cTp6j1ZQIVGuo4fvIYJ3", "KOSGSA", "kbDMqlVGuQuF7sZpY9G1V32bVqx23m", "bfxskyCfRQ3e5JfVyMYK1TBq", "KPf5jweXKATwb3ocWNu711OjnnCWcsTU"};
    public static final AbstractC1815oV<Integer> A09;
    public static final AbstractC1815oV<Integer> A0A;
    public C1842oy A00;
    public AnonymousClass93 A01;
    public E3 A02;
    public final Context A03;
    public final EA A04;
    public final Object A05;
    public final boolean A06;

    /* JADX WARN: Code restructure failed: missing block: B:43:0x00c7, code lost:
    
        if (r18.A01.A0A == false) goto L68;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x00cd, code lost:
    
        if (r7.isEmpty() != false) goto L69;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x00d5, code lost:
    
        if (r7.size() != r10.A01) goto L70;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x00d7, code lost:
    
        r6.clear();
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x00e7, code lost:
    
        if (com.instagram.common.viewpoint.core.AnonymousClass92.A08[1].charAt(16) == 'p') goto L47;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x00e9, code lost:
    
        com.instagram.common.viewpoint.core.AnonymousClass92.A08[4] = "67hsDi";
        r6.add(r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x00f3, code lost:
    
        r14.addAll(r6);
        r11 = r11 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x00fa, code lost:
    
        com.instagram.common.viewpoint.core.AnonymousClass92.A08[4] = "yJ8LwG";
        r6.add(r7);
     */
    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    @MetaExoPlayerCustomization("D25277746")
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private <T extends E5<T>> Pair<E9, Integer> A0A(int i, EC ec, int[][][] iArr, E4<T> e4, Comparator<List<T>> comparator) {
        List arrayList;
        ArrayList arrayList2 = new ArrayList();
        int A02 = ec.A02();
        for (int i2 = 0; i2 < A02; i2++) {
            if (i == ec.A03(i2)) {
                C1673mA A072 = ec.A07(i2);
                int i3 = 0;
                while (i3 < A072.A01) {
                    C1802oH A05 = A072.A05(i3);
                    List<T> A57 = e4.A57(i2, A05, iArr[i2][i3]);
                    boolean[] zArr = new boolean[A05.A01];
                    ArrayList arrayList3 = new ArrayList();
                    ArrayList arrayList4 = new ArrayList();
                    int i4 = 0;
                    while (true) {
                        int i5 = A05.A01;
                        if (A08[4].length() != 6) {
                            throw new RuntimeException();
                        }
                        A08[7] = "GGTbcpljDMs4NAqJNauGpoXnSvHOQ6AN";
                        if (i4 >= i5) {
                            break;
                        }
                        T t = A57.get(i4);
                        int A082 = t.A08();
                        if (!zArr[i4] && A082 != 0) {
                            if (A082 == 1) {
                                arrayList = AbstractC0303Am.A04(t);
                                arrayList3.add(t);
                            } else {
                                arrayList = new ArrayList();
                                arrayList.add(t);
                                int i6 = i4 + 1;
                                while (i6 < A05.A01) {
                                    T t2 = A57.get(i6);
                                    if (t2.A08() == 2 && t.A09(t2)) {
                                        arrayList.add(t2);
                                        zArr[i6] = true;
                                    }
                                    i6++;
                                    if (A08[1].charAt(16) == 'p') {
                                        A08[7] = "CPvHWQWYEszLaRsxiIiXKw3X1jOClslA";
                                    }
                                }
                            }
                            arrayList4.add(arrayList);
                        }
                        i4++;
                    }
                }
            }
        }
        boolean isEmpty = arrayList2.isEmpty();
        if (A08[1].charAt(16) != 'p') {
            throw new RuntimeException();
        }
        A08[4] = "ji0WxR";
        if (isEmpty) {
            return null;
        }
        List list = (List) Collections.max(arrayList2, comparator);
        int[] iArr2 = new int[list.size()];
        for (int i7 = 0; i7 < list.size(); i7++) {
            iArr2[i7] = ((E5) list.get(i7)).A01;
        }
        E5 e5 = (E5) list.get(0);
        return Pair.create(new E9(e5.A03, iArr2), Integer.valueOf(e5.A00));
    }

    public static String A0J(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A07, i, i + i2);
        int i4 = 0;
        while (true) {
            int length = copyOfRange.length;
            if (A08[5].length() == 27) {
                throw new RuntimeException();
            }
            A08[4] = "58VoVy";
            if (i4 >= length) {
                return new String(copyOfRange);
            }
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 10);
            i4++;
        }
    }

    public static void A0M() {
        A07 = new byte[]{91, 92, -112, Byte.MAX_VALUE, -124, -118, 59, 126, -125, 124, -119, -119, Byte.MIN_VALUE, -121, 59, 126, -118, -112, -119, -113, 59, 126, -118, -119, -114, -113, -115, 124, -124, -119, -113, -114, 59, 126, 124, -119, -119, -118, -113, 59, 125, Byte.MIN_VALUE, 59, 124, -117, -117, -121, -124, Byte.MIN_VALUE, Byte.MAX_VALUE, 59, -110, -124, -113, -125, -118, -112, -113, 59, -115, Byte.MIN_VALUE, -127, Byte.MIN_VALUE, -115, Byte.MIN_VALUE, -119, 126, Byte.MIN_VALUE, 59, -113, -118, 59, 94, -118, -119, -113, Byte.MIN_VALUE, -109, -113, 73, 59, 93, -112, -124, -121, Byte.MAX_VALUE, 59, -113, -125, Byte.MIN_VALUE, 59, -113, -115, 124, 126, -122, 59, -114, Byte.MIN_VALUE, -121, Byte.MIN_VALUE, 126, -113, -118, -115, 59, -124, -119, -114, -113, 124, -119, 126, Byte.MIN_VALUE, 59, -110, -124, -113, -125, 59, -118, -119, Byte.MIN_VALUE, 59, -118, -127, 59, -113, -125, Byte.MIN_VALUE, 59, -119, -118, -119, 72, Byte.MAX_VALUE, Byte.MIN_VALUE, -117, -115, Byte.MIN_VALUE, 126, 124, -113, Byte.MIN_VALUE, Byte.MAX_VALUE, 59, 126, -118, -119, -114, -113, -115, -112, 126, -113, -118, -115, -114, 59, -113, -125, 124, -113, 59, -113, 124, -122, Byte.MIN_VALUE, 59, 124, 59, 94, -118, -119, -113, Byte.MIN_VALUE, -109, -113, 59, 124, -115, -126, -112, -120, Byte.MIN_VALUE, -119, -113, 73, -103, -70, -69, -74, -54, -63, -55, -87, -57, -74, -72, -64, -88, -70, -63, -70, -72, -55, -60, -57, -57, -37, -54, -49, -43, -107, -57, -55, -103, -83, -63, -80, -75, -69, 123, -83, -81, Byte.MIN_VALUE, -49, -29, -46, -41, -35, -99, -45, -49, -47, -95, -70, -50, -67, -62, -56, -120, -66, -70, -68, -116, -122, -61, -56, -68, -54, -61, -71, -119, 124, 119, 120, -126, 66, 116, -119, 67, 68, -98, -111, -116, -115, -105, 87, -119, -98, -117, -33, -46, -51, -50, -40, -104, -51, -40, -43, -53, -30, -106, -33, -46, -36, -46, -40, -41, -92, -105, -110, -109, -99, 93, -106, -109, -92, -111, -11, -24, -29, -28, -18, -82, -9, -84, -11, -19, -29, -83, -18, -19, -79, -83, -11, -17, -72};
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    public static void A0N(C1673mA c1673mA, C1795oA c1795oA, Map<Integer, C1797oC> map) {
        C1797oC c1797oC;
        for (int i = 0; i < c1673mA.A01; i++) {
            C1797oC c1797oC2 = c1795oA.A0G.get(c1673mA.A05(i));
            if (c1797oC2 != null && ((c1797oC = map.get(Integer.valueOf(c1797oC2.A01()))) == null || (c1797oC.A01.isEmpty() && !c1797oC2.A01.isEmpty()))) {
                map.put(Integer.valueOf(c1797oC2.A01()), c1797oC2);
            }
        }
    }

    static {
        A0M();
        A09 = AbstractC1815oV.A04(new Comparator() { // from class: com.facebook.ads.redexgen.X.Dx
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return AnonymousClass92.A05((Integer) obj, (Integer) obj2);
            }
        });
        A0A = AbstractC1815oV.A04(new Comparator() { // from class: com.facebook.ads.redexgen.X.Dy
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return AnonymousClass92.A06((Integer) obj, (Integer) obj2);
            }
        });
    }

    @Deprecated
    public AnonymousClass92() {
        this(AnonymousClass93.A0J, new C1668m5());
    }

    @MetaExoPlayerCustomization(type = {"NEW_CONSTRUCTOR"}, value = "Backward Compatible Constructor")
    public AnonymousClass92(EA ea) {
        this(AnonymousClass93.A0J, ea);
    }

    @Deprecated
    public AnonymousClass92(C1795oA c1795oA, EA ea) {
        this(c1795oA, ea, null);
    }

    public AnonymousClass92(C1795oA c1795oA, EA ea, Context context) {
        this.A05 = new Object();
        this.A03 = context != null ? context.getApplicationContext() : null;
        this.A04 = ea;
        if (c1795oA instanceof AnonymousClass93) {
            this.A01 = (AnonymousClass93) c1795oA;
        } else {
            AnonymousClass93 defaultParameters = context == null ? AnonymousClass93.A0J : AnonymousClass93.A02(context);
            this.A01 = defaultParameters.A0P().A0u(c1795oA).A0p();
        }
        this.A00 = C1842oy.A07;
        this.A06 = context != null && AbstractC01484a.A18(context);
        if (!this.A06 && context != null && AbstractC01484a.A02 >= 32) {
            this.A02 = E3.A00(context);
        }
        if (this.A01.A08 && context == null) {
            AnonymousClass44.A07(A0J(Opcodes.NEWARRAY, 20, 75), A0J(1, Opcodes.NEW, 17));
        }
    }

    public static int A00(int i, int i2) {
        if (i != 0 && i == i2) {
            return Integer.MAX_VALUE;
        }
        return Integer.bitCount(i & i2);
    }

    public static int A02(C1836or c1836or, String str, boolean z) {
        if (!TextUtils.isEmpty(str)) {
            String str2 = c1836or.A0V;
            String[] strArr = A08;
            if (strArr[6].length() != strArr[3].length()) {
                A08[7] = "utaRfuDCbQDIc6IM3a2tNPgwwhECnGgZ";
                if (str.equals(str2)) {
                    if (A08[4].length() != 6) {
                        throw new RuntimeException();
                    }
                    String[] strArr2 = A08;
                    strArr2[6] = "bdPum8qTTDlHeCQDHcvgSGFt";
                    strArr2[3] = "zx28NE7Z14W3AzzAuoWnzSjL1M2eUdTs";
                    return 4;
                }
            }
            throw new RuntimeException();
        }
        String A0K = A0K(str);
        String A0K2 = A0K(c1836or.A0V);
        if (A0K2 == null || A0K == null) {
            return (z && A0K2 == null) ? 1 : 0;
        }
        if (A0K2.startsWith(A0K) || A0K.startsWith(A0K2)) {
            return 3;
        }
        String A0J = A0J(0, 1, 36);
        String str3 = AbstractC01484a.A1P(A0K2, A0J)[0];
        String formatMainLanguage = AbstractC01484a.A1P(A0K, A0J)[0];
        String[] strArr3 = A08;
        String str4 = strArr3[6];
        String formatLanguage = strArr3[3];
        if (str4.length() != formatLanguage.length()) {
            A08[4] = "rXSrCW";
            if (!str3.equals(formatMainLanguage)) {
                return 0;
            }
            return 2;
        }
        throw new RuntimeException();
    }

    /* JADX WARN: Incorrect condition in loop: B:6:0x000e */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static int A03(C1802oH c1802oH, int i, int i2, boolean z) {
        if (i == Integer.MAX_VALUE || i2 == Integer.MAX_VALUE) {
            return Integer.MAX_VALUE;
        }
        int i3 = Integer.MAX_VALUE;
        for (int videoPixels = 0; videoPixels < maxVideoPixelsToRetain; videoPixels++) {
            C1836or A082 = c1802oH.A08(videoPixels);
            int maxVideoPixelsToRetain = A082.A0L;
            if (maxVideoPixelsToRetain > 0) {
                int maxVideoPixelsToRetain2 = A082.A0A;
                if (maxVideoPixelsToRetain2 > 0) {
                    int i4 = A082.A0L;
                    int maxVideoPixelsToRetain3 = A082.A0A;
                    Point A092 = A09(z, i, i2, i4, maxVideoPixelsToRetain3);
                    int i5 = A082.A0L;
                    int maxVideoPixelsToRetain4 = A082.A0A;
                    int i6 = i5 * maxVideoPixelsToRetain4;
                    int i7 = A082.A0L;
                    int maxVideoPixelsToRetain5 = A092.x;
                    if (i7 >= ((int) (maxVideoPixelsToRetain5 * 0.98f))) {
                        int i8 = A082.A0A;
                        int maxVideoPixelsToRetain6 = A092.y;
                        if (i8 >= ((int) (maxVideoPixelsToRetain6 * 0.98f)) && i6 < i3) {
                            i3 = i6;
                        }
                    }
                }
            }
        }
        return i3;
    }

    public static /* synthetic */ int A05(Integer num, Integer num2) {
        if (num.intValue() == -1) {
            return num2.intValue() == -1 ? 0 : -1;
        }
        if (num2.intValue() == -1) {
            return 1;
        }
        int intValue = num.intValue();
        int intValue2 = num2.intValue();
        if (A08[4].length() != 6) {
            throw new RuntimeException();
        }
        A08[1] = "gB7bm57sTKDjvfC8pNahT9wGVNX6TDKL";
        return intValue - intValue2;
    }

    public static /* synthetic */ int A06(Integer num, Integer num2) {
        return 0;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0087 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0088 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0089 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:13:0x008a A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:14:0x008b A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0013 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static int A07(String str) {
        char c;
        if (str == null) {
            return 0;
        }
        switch (str.hashCode()) {
            case -1851077871:
                if (str.equals(A0J(272, 18, 95))) {
                    c = 0;
                    switch (c) {
                        case 0:
                            return 5;
                        case 1:
                            return 4;
                        case 2:
                            return 3;
                        case 3:
                            return 2;
                        case 4:
                            return 1;
                        default:
                            return 0;
                    }
                }
                c = 65535;
                switch (c) {
                }
            case -1662735862:
                String[] strArr = A08;
                if (strArr[6].length() == strArr[3].length()) {
                    throw new RuntimeException();
                }
                A08[1] = "cKYBOGEqW486lDdcpu93NQ9TicEen6vk";
                if (str.equals(A0J(253, 10, 9))) {
                    c = 1;
                    switch (c) {
                    }
                }
                c = 65535;
                switch (c) {
                }
            case -1662541442:
                if (str.equals(A0J(290, 10, 36))) {
                    c = 2;
                    switch (c) {
                    }
                }
                c = 65535;
                switch (c) {
                }
            case 1331836730:
                if (str.equals(A0J(263, 9, 30))) {
                    c = 4;
                    switch (c) {
                    }
                }
                c = 65535;
                switch (c) {
                }
            case 1599127257:
                if (str.equals(A0J(MaterialCardViewHelper.DEFAULT_FADE_ANIM_DURATION, 19, Opcodes.LNEG))) {
                    c = 3;
                    switch (c) {
                    }
                }
                c = 65535;
                switch (c) {
                }
            default:
                c = 65535;
                switch (c) {
                }
        }
    }

    @MetaExoPlayerCustomization("Made public in D13395849")
    public static Point A09(boolean z, int tempViewportWidth, int i, int i2, int i3) {
        if (z) {
            if ((i2 > i3) != (tempViewportWidth > i)) {
                tempViewportWidth = i;
                i = tempViewportWidth;
            }
        }
        if (i2 * i >= i3 * tempViewportWidth) {
            return new Point(tempViewportWidth, AbstractC01484a.A05(tempViewportWidth * i3, i2));
        }
        return new Point(AbstractC01484a.A05(i * i2, i3), i);
    }

    private final Pair<E9, Integer> A0B(EC ec, int[][][] iArr, final AnonymousClass93 anonymousClass93, final String str) throws C9Y {
        return A0A(3, ec, iArr, new E4() { // from class: com.facebook.ads.redexgen.X.m0
            @Override // com.instagram.common.viewpoint.core.E4
            public final List A57(int i, C1802oH c1802oH, int[] iArr2) {
                AbstractC0303Am A02;
                A02 = C1650ln.A02(i, c1802oH, AnonymousClass93.this, iArr2, str);
                return A02;
            }
        }, new Comparator() { // from class: com.facebook.ads.redexgen.X.Dw
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return C1650ln.A01((List) obj, (List) obj2);
            }
        });
    }

    private final Pair<E9, Integer> A0C(EC ec, int[][][] iArr, int[] iArr2, final AnonymousClass93 anonymousClass93) throws C9Y {
        final boolean z = false;
        int i = 0;
        while (true) {
            if (i < ec.A02()) {
                if (2 == ec.A03(i) && ec.A07(i).A01 > 0) {
                    z = true;
                    break;
                }
                i++;
            } else {
                break;
            }
        }
        return A0A(1, ec, iArr, new E4() { // from class: com.facebook.ads.redexgen.X.m1
            @Override // com.instagram.common.viewpoint.core.E4
            public final List A57(int i2, C1802oH c1802oH, int[] iArr3) {
                return AnonymousClass92.this.A0e(anonymousClass93, z, i2, c1802oH, iArr3);
            }
        }, new Comparator() { // from class: com.facebook.ads.redexgen.X.Dv
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return C1662lz.A02((List) obj, (List) obj2);
            }
        });
    }

    private final Pair<E9, Integer> A0D(EC ec, int[][][] iArr, final int[] iArr2, final AnonymousClass93 anonymousClass93, final String str) throws C9Y {
        return A0A(2, ec, iArr, new E4() { // from class: com.facebook.ads.redexgen.X.m3
            @Override // com.instagram.common.viewpoint.core.E4
            public final List A57(int i, C1802oH c1802oH, int[] iArr3) {
                AbstractC0303Am A06;
                A06 = C1647lk.A06(i, c1802oH, AnonymousClass93.this, iArr3, str, iArr2[i]);
                return A06;
            }
        }, new Comparator() { // from class: com.facebook.ads.redexgen.X.Du
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return C1647lk.A05((List) obj, (List) obj2);
            }
        });
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x007d, code lost:
    
        r5 = r5 + 1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final E9 A0E(int i, C1673mA c1673mA, int[][] iArr, AnonymousClass93 anonymousClass93) throws C9Y {
        C1802oH c1802oH = null;
        int i2 = 0;
        E0 e0 = null;
        int i3 = 0;
        loop0: while (i3 < c1673mA.A01) {
            C1802oH trackGroup = c1673mA.A05(i3);
            int[] iArr2 = iArr[i3];
            int groupIndex = 0;
            while (true) {
                int i4 = trackGroup.A01;
                int selectedTrackIndex = A08[7].charAt(4);
                if (selectedTrackIndex == 114) {
                    break loop0;
                }
                A08[7] = "eXe48tlcaaFOVphj3tBJsJZ33XViaUIe";
                if (groupIndex < i4) {
                    int i5 = iArr2[groupIndex];
                    int selectedTrackIndex2 = A08[7].charAt(4);
                    if (selectedTrackIndex2 == 114) {
                        throw new RuntimeException();
                    }
                    A08[7] = "FFBXZuvHsKfXoft1igGzNsuMgLJqlaBK";
                    if (A0S(i5, anonymousClass93.A0B)) {
                        E0 trackScore = new E0(trackGroup.A08(groupIndex), iArr2[groupIndex]);
                        if (e0 != null) {
                            int compareTo = trackScore.compareTo(e0);
                            String[] strArr = A08;
                            String str = strArr[0];
                            String str2 = strArr[2];
                            int selectedTrackIndex3 = str.charAt(9);
                            if (selectedTrackIndex3 == str2.charAt(9)) {
                                break loop0;
                            }
                            A08[1] = "us6BKPnONaHSk6j2pgBHNNPTLKUclzqr";
                            if (compareTo <= 0) {
                            }
                        }
                        c1802oH = trackGroup;
                        i2 = groupIndex;
                        e0 = trackScore;
                    }
                    groupIndex++;
                }
            }
            throw new RuntimeException();
        }
        if (c1802oH == null) {
            return null;
        }
        return new E9(c1802oH, i2);
    }

    public static String A0K(String str) {
        if (TextUtils.isEmpty(str) || TextUtils.equals(str, A0J(ItemTouchHelper.Callback.DEFAULT_SWIPE_ANIMATION_DURATION, 3, 75))) {
            return null;
        }
        return str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A0L() {
        boolean z;
        synchronized (this.A05) {
            z = this.A01.A08 && !this.A06 && AbstractC01484a.A02 >= 32 && this.A02 != null && this.A02.A06();
        }
        if (z) {
            A01();
        }
    }

    public static void A0P(EC ec, C1795oA c1795oA, E9[] e9Arr) {
        E9 e9;
        int A02 = ec.A02();
        HashMap hashMap = new HashMap();
        for (int i = 0; i < A02; i++) {
            A0N(ec.A07(i), c1795oA, hashMap);
        }
        A0N(ec.A06(), c1795oA, hashMap);
        for (int i2 = 0; i2 < A02; i2++) {
            int rendererCount = ec.A03(i2);
            C1797oC c1797oC = (C1797oC) hashMap.get(Integer.valueOf(rendererCount));
            if (c1797oC != null) {
                boolean isEmpty = c1797oC.A01.isEmpty();
                if (A08[7].charAt(4) == 'r') {
                    throw new RuntimeException();
                }
                A08[4] = "YbaSeo";
                if (!isEmpty && ec.A07(i2).A04(c1797oC.A00) != -1) {
                    e9 = new E9(c1797oC.A00, AD.A0C(c1797oC.A01));
                } else {
                    e9 = null;
                }
                e9Arr[i2] = e9;
            }
        }
    }

    public static void A0Q(EC ec, AnonymousClass93 anonymousClass93, E9[] e9Arr) {
        E9 e9;
        int A02 = ec.A02();
        for (int i = 0; i < A02; i++) {
            C1673mA A072 = ec.A07(i);
            if (anonymousClass93.A0S(i, A072)) {
                C1651lo A0Q = anonymousClass93.A0Q(i, A072);
                String[] strArr = A08;
                String str = strArr[6];
                String str2 = strArr[3];
                int rendererIndex = str.length();
                int rendererCount = str2.length();
                if (rendererIndex == rendererCount) {
                    throw new RuntimeException();
                }
                A08[5] = "K8f1XF422sl3cXXm";
                if (A0Q != null) {
                    int length = A0Q.A03.length;
                    String[] strArr2 = A08;
                    String str3 = strArr2[6];
                    String str4 = strArr2[3];
                    int rendererIndex2 = str3.length();
                    int rendererCount2 = str4.length();
                    if (rendererIndex2 == rendererCount2) {
                        throw new RuntimeException();
                    }
                    A08[4] = "KnBpd5";
                    if (length != 0) {
                        int rendererCount3 = A0Q.A00;
                        C1802oH A05 = A072.A05(rendererCount3);
                        int[] iArr = A0Q.A03;
                        int rendererIndex3 = A0Q.A02;
                        e9 = new E9(A05, iArr, rendererIndex3);
                        e9Arr[i] = e9;
                    }
                }
                e9 = null;
                e9Arr[i] = e9;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0049, code lost:
    
        if (r4 != 2) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0088, code lost:
    
        continue;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x004b, code lost:
    
        if (r3 == null) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0057, code lost:
    
        if (A0W(r12[r7], r11.A07(r7), r3) == false) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0059, code lost:
    
        if (r4 != 1) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x005b, code lost:
    
        if (r9 == (-1)) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0085, code lost:
    
        r9 = r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x005d, code lost:
    
        r10 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0072, code lost:
    
        if (r8 == (-1)) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0087, code lost:
    
        r8 = r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0074, code lost:
    
        r10 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0088, code lost:
    
        continue;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0088, code lost:
    
        continue;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x0082, code lost:
    
        if (r4 != 1) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0046, code lost:
    
        if (r4 != 1) goto L13;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void A0R(EC ec, int[][][] iArr, C7G[] c7gArr, InterfaceC1646lj[] interfaceC1646ljArr) {
        int i = -1;
        int i2 = -1;
        int i3 = 1;
        int i4 = 0;
        while (true) {
            int i5 = ec.A02();
            int tunnelingVideoRendererIndex = A08[4].length();
            if (tunnelingVideoRendererIndex == 6) {
                A08[1] = "NZY9D9dgjYLNZ0XYpF4W2GrX5uVEwVhV";
                if (i4 >= i5) {
                    break;
                }
                int rendererType = ec.A03(i4);
                InterfaceC1646lj interfaceC1646lj = interfaceC1646ljArr[i4];
                String[] strArr = A08;
                String str = strArr[0];
                String str2 = strArr[2];
                int tunnelingVideoRendererIndex2 = str.charAt(9);
                int tunnelingAudioRendererIndex = str2.charAt(9);
                if (tunnelingVideoRendererIndex2 != tunnelingAudioRendererIndex) {
                    A08[4] = "nPMicF";
                } else {
                    String[] strArr2 = A08;
                    strArr2[6] = "5F5ko3NIDU1YMXmZZUDVXdSE";
                    strArr2[3] = "1c60xx4jFCOb1nSxKeVAoj10cRAS07b7";
                }
            } else {
                throw new RuntimeException();
            }
            i4++;
        }
        int tunnelingAudioRendererIndex2 = (i == -1 || i2 == -1) ? 0 : 1;
        if ((i3 & tunnelingAudioRendererIndex2) != 0) {
            C7G c7g = new C7G(true);
            c7gArr[i] = c7g;
            c7gArr[i2] = c7g;
        }
    }

    @MetaExoPlayerCustomization("Made public for customization on DashManifestHelper")
    public static boolean A0S(int i, boolean z) {
        int A03 = AnonymousClass76.A03(i);
        return A03 == 4 || (z && A03 == 3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean A0T(C1836or c1836or) {
        boolean z;
        synchronized (this.A05) {
            z = !this.A01.A08 || this.A06 || c1836or.A06 <= 2 || (A0U(c1836or) && (AbstractC01484a.A02 < 32 || this.A02 == null || !this.A02.A06())) || (AbstractC01484a.A02 >= 32 && this.A02 != null && this.A02.A06() && this.A02.A04() && this.A02.A05() && this.A02.A07(this.A00, c1836or));
        }
        return z;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static boolean A0U(C1836or c1836or) {
        char c;
        if (c1836or.A0W == null) {
            return false;
        }
        String str = c1836or.A0W;
        switch (str.hashCode()) {
            case -2123537834:
                if (str.equals(A0J(236, 14, 79))) {
                    c = 2;
                    break;
                }
                c = 65535;
                break;
            case 187078296:
                if (str.equals(A0J(208, 9, 92))) {
                    c = 0;
                    break;
                }
                c = 65535;
                break;
            case 187078297:
                if (str.equals(A0J(217, 9, 66))) {
                    c = 3;
                    break;
                }
                c = 65535;
                break;
            case 1504578661:
                if (str.equals(A0J(226, 10, 100))) {
                    c = 1;
                    break;
                }
                c = 65535;
                break;
            default:
                c = 65535;
                break;
        }
        switch (c) {
        }
        return false;
    }

    public static boolean A0W(int[][] iArr, C1673mA c1673mA, InterfaceC1646lj interfaceC1646lj) {
        if (interfaceC1646lj == null) {
            return false;
        }
        int A04 = c1673mA.A04(interfaceC1646lj.A9D());
        for (int i = 0; i < interfaceC1646lj.length(); i++) {
            int trackGroupIndex = AnonymousClass76.A05(iArr[A04][interfaceC1646lj.A89(i)]);
            if (trackGroupIndex != 32) {
                return false;
            }
        }
        return true;
    }

    private final E9[] A0X(EC ec, int[][][] iArr, int[] iArr2, AnonymousClass93 anonymousClass93) throws C9Y {
        String str;
        int A02 = ec.A02();
        E9[] e9Arr = new E9[A02];
        Pair<E9, Integer> A0C = A0C(ec, iArr, iArr2, anonymousClass93);
        if (A0C != null) {
            Object obj = A0C.second;
            String[] strArr = A08;
            String str2 = strArr[0];
            String str3 = strArr[2];
            int charAt = str2.charAt(9);
            int rendererCount = str3.charAt(9);
            if (charAt == rendererCount) {
                throw new RuntimeException();
            }
            A08[7] = "yBKbxgl1qoYBYNtasAVV61g1RQWhRN9O";
            e9Arr[((Integer) obj).intValue()] = (E9) A0C.first;
        }
        if (A0C == null) {
            str = null;
        } else {
            C1802oH c1802oH = ((E9) A0C.first).A01;
            int rendererCount2 = ((E9) A0C.first).A02[0];
            str = c1802oH.A08(rendererCount2).A0V;
        }
        Pair<E9, Integer> A0D = A0D(ec, iArr, iArr2, anonymousClass93, str);
        if (A0D != null) {
            e9Arr[((Integer) A0D.second).intValue()] = (E9) A0D.first;
        }
        Pair<E9, Integer> A0B = A0B(ec, iArr, anonymousClass93, str);
        if (A0B != null) {
            e9Arr[((Integer) A0B.second).intValue()] = (E9) A0B.first;
        }
        for (int i = 0; i < A02; i++) {
            int i2 = ec.A03(i);
            if (i2 != 2 && i2 != 1) {
                String[] strArr2 = A08;
                String str4 = strArr2[0];
                String str5 = strArr2[2];
                int charAt2 = str4.charAt(9);
                int rendererCount3 = str5.charAt(9);
                if (charAt2 == rendererCount3) {
                    throw new RuntimeException();
                }
                String[] strArr3 = A08;
                strArr3[6] = "1xsmyE1OdjkvrsbXr4cEFZBV";
                strArr3[3] = "D4xPicyrc2caIP01Cw6NBhV2pRXBVsmG";
                if (i2 != 3) {
                    e9Arr[i] = A0E(i2, ec.A07(i), iArr[i], anonymousClass93);
                }
            }
        }
        return e9Arr;
    }

    @Override // com.instagram.common.viewpoint.core.EK
    public final boolean A0Y() {
        return true;
    }

    @Override // com.instagram.common.viewpoint.core.AbstractC1645li
    @MetaExoPlayerCustomization(type = {"MERGED"}, value = "final removed in D35162315")
    public final Pair<C7G[], InterfaceC1646lj[]> A0d(EC ec, int[][][] iArr, int[] iArr2, C1683mL c1683mL, Timeline timeline) throws C9Y {
        AnonymousClass93 anonymousClass93;
        synchronized (this.A05) {
            try {
                anonymousClass93 = this.A01;
                if (anonymousClass93.A08 && AbstractC01484a.A02 >= 32 && this.A02 != null) {
                    this.A02.A03(this, (Looper) C3M.A02(Looper.myLooper()));
                }
            } catch (Throwable th) {
                th = th;
                while (true) {
                    try {
                        throw th;
                    } catch (Throwable th2) {
                        th = th2;
                    }
                }
            }
        }
        int A02 = ec.A02();
        E9[] A0X = A0X(ec, iArr, iArr2, anonymousClass93);
        A0P(ec, anonymousClass93, A0X);
        A0Q(ec, anonymousClass93, A0X);
        for (int rendererCount = 0; rendererCount < A02; rendererCount++) {
            int A03 = ec.A03(rendererCount);
            if (anonymousClass93.A0R(rendererCount) || anonymousClass93.A0H.contains(Integer.valueOf(A03))) {
                A0X[rendererCount] = null;
            }
        }
        InterfaceC1646lj[] A5T = this.A04.A5T(A0X, A00(), c1683mL, timeline);
        C7G[] c7gArr = new C7G[A02];
        for (int i = 0; i < A02; i++) {
            c7gArr[i] = !(anonymousClass93.A0R(i) || anonymousClass93.A0H.contains(Integer.valueOf(ec.A03(i)))) && (ec.A03(i) == -2 || A5T[i] != null) ? C7G.A01 : null;
        }
        if (anonymousClass93.A0D) {
            A0R(ec, iArr, c7gArr, A5T);
        }
        return Pair.create(c7gArr, A5T);
    }

    public final /* synthetic */ AbstractC0303Am A0e(AnonymousClass93 anonymousClass93, boolean z, int i, C1802oH c1802oH, int[] iArr) {
        return C1662lz.A03(i, c1802oH, anonymousClass93, iArr, z, new InterfaceC1502jB() { // from class: com.facebook.ads.redexgen.X.m2
            @Override // com.instagram.common.viewpoint.core.InterfaceC1502jB
            public final boolean A44(Object obj) {
                boolean A0T;
                A0T = AnonymousClass92.this.A0T((C1836or) obj);
                return A0T;
            }
        });
    }
}
