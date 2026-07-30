package com.facebook.ads.androidx.media3.common;

import android.os.Bundle;
import android.os.IBinder;
import android.util.Pair;
import com.facebook.ads.androidx.media3.common.Timeline;
import com.instagram.common.viewpoint.core.AbstractC01484a;
import com.instagram.common.viewpoint.core.AbstractC0303Am;
import com.instagram.common.viewpoint.core.C00791h;
import com.instagram.common.viewpoint.core.C02779m;
import com.instagram.common.viewpoint.core.C1805oL;
import com.instagram.common.viewpoint.core.C1807oN;
import com.instagram.common.viewpoint.core.C1Q;
import com.instagram.common.viewpoint.core.C1R;
import com.instagram.common.viewpoint.core.C1S;
import com.instagram.common.viewpoint.core.C3M;
import com.instagram.common.viewpoint.core.C3R;

/* loaded from: assets/audience_network.dex */
public abstract class Timeline implements C1S {
    public static String[] A00 = {"u1TV1j0aFj13GJQ9ixTagHG8KyMgbnog", "4GMeFBxldVuonExwkIPaDDi9I59L728Z", "hqD1wOYcZTmehOTQOtlNc0UQ2KV4ETaI", "yejsGunEYiKaKfUzobCfCtheJf3zEEcL", "wYd9LRHFlTpJXE3VqmNr3ySXFdmyeGzN", "VCegaKN739XbWKUaP5Uwy30Zmvr6QTeK", "Cr3igiuAIuu", "x89DN52UD2fFRZn9rQXfWzGYhaiJYHE1"};
    public static final Timeline A02 = new Timeline() { // from class: com.facebook.ads.redexgen.X.9n
        @Override // com.facebook.ads.androidx.media3.common.Timeline
        public final int A06() {
            return 0;
        }

        @Override // com.facebook.ads.androidx.media3.common.Timeline
        public final int A07() {
            return 0;
        }

        @Override // com.facebook.ads.androidx.media3.common.Timeline
        public final int A0A(Object obj) {
            return -1;
        }

        @Override // com.facebook.ads.androidx.media3.common.Timeline
        public final C1807oN A0I(int i, C1807oN c1807oN, boolean z) {
            throw new IndexOutOfBoundsException();
        }

        @Override // com.facebook.ads.androidx.media3.common.Timeline
        public final C1805oL A0L(int i, C1805oL c1805oL, long j) {
            throw new IndexOutOfBoundsException();
        }

        @Override // com.facebook.ads.androidx.media3.common.Timeline
        public final Object A0M(int i) {
            throw new IndexOutOfBoundsException();
        }
    };
    public static final String A05 = AbstractC01484a.A0h(0);
    public static final String A03 = AbstractC01484a.A0h(1);
    public static final String A04 = AbstractC01484a.A0h(2);
    public static final C1R<Timeline> A01 = new C1R() { // from class: com.facebook.ads.redexgen.X.oP
        @Override // com.instagram.common.viewpoint.core.C1R
        public final C1S A6X(Bundle bundle) {
            Timeline A022;
            A022 = Timeline.A02(bundle);
            return A022;
        }
    };

    public abstract int A06();

    public abstract int A07();

    public abstract int A0A(Object obj);

    public abstract C1807oN A0I(int i, C1807oN c1807oN, boolean z);

    public abstract C1805oL A0L(int i, C1805oL c1805oL, long j);

    public abstract Object A0M(int i);

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.Am != com.google.common.collect.ImmutableList<com.facebook.ads.androidx.media3.common.Timeline$Period> */
    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.Am != com.google.common.collect.ImmutableList<com.facebook.ads.androidx.media3.common.Timeline$Window> */
    /* JADX WARN: Type inference failed for: r0v5, types: [com.facebook.ads.redexgen.X.9m] */
    public static C02779m A02(Bundle bundle) {
        final AbstractC0303Am A042 = A04(C1805oL.A0J, C3R.A00(bundle, A05));
        final AbstractC0303Am A043 = A04(C1807oN.A08, C3R.A00(bundle, A03));
        final int[] intArray = bundle.getIntArray(A04);
        if (intArray == null) {
            intArray = A05(A042.size());
        }
        return new Timeline(A042, A043, intArray) { // from class: com.facebook.ads.redexgen.X.9m
            public static String[] A04 = {"nDkuZZEFG4iGMwbsGEvKBo4ueCI7wxif", "OM6NJOBBZMKrUazjZz4CdR8Ljfz9nzwy", "h9AdYD37MAF4FmuzDOyGIvEw", "VkmtOVI9Gbc78hEhNGIz4LiMtzYnUrU2", "bkWqGplua99PBwc9ED6yZtwvDtuw6KwN", "305DBImSoaz5MlD7g6qLfpiwFg5d3Fl", "QtOjLPNYFNek9UnmHWOFtbeX9w", "y2avdvKeY0dhYPEmFhuJXZmeyR2ks2D4"};
            public final AbstractC0303Am<C1807oN> A00;
            public final AbstractC0303Am<C1805oL> A01;
            public final int[] A02;
            public final int[] A03;

            /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.Am != com.google.common.collect.ImmutableList<com.facebook.ads.androidx.media3.common.Timeline$Period> */
            /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.Am != com.google.common.collect.ImmutableList<com.facebook.ads.androidx.media3.common.Timeline$Window> */
            /* JADX WARN: Incorrect condition in loop: B:6:0x001b */
            {
                C3M.A07(A042.size() == intArray.length);
                this.A01 = A042;
                this.A00 = A043;
                this.A02 = intArray;
                this.A03 = new int[intArray.length];
                for (int i = 0; i < i; i++) {
                    int[] iArr = this.A03;
                    int i2 = intArray[i];
                    iArr[i2] = i;
                }
            }

            @Override // com.facebook.ads.androidx.media3.common.Timeline
            public final int A06() {
                return this.A00.size();
            }

            @Override // com.facebook.ads.androidx.media3.common.Timeline
            public final int A07() {
                return this.A01.size();
            }

            @Override // com.facebook.ads.androidx.media3.common.Timeline
            public final int A08(int i, int i2, boolean z) {
                if (i2 == 1) {
                    return i;
                }
                if (i == A0C(z)) {
                    if (i2 == 2) {
                        return A0B(z);
                    }
                    return -1;
                }
                if (z) {
                    return this.A02[this.A03[i] + 1];
                }
                return i + 1;
            }

            @Override // com.facebook.ads.androidx.media3.common.Timeline
            public final int A0A(Object obj) {
                throw new UnsupportedOperationException();
            }

            @Override // com.facebook.ads.androidx.media3.common.Timeline
            public final int A0B(boolean z) {
                if (A0N()) {
                    return -1;
                }
                if (!z) {
                    return 0;
                }
                int[] iArr = this.A02;
                if (A04[1].charAt(22) == 'H') {
                    throw new RuntimeException();
                }
                A04[7] = "6ncpOYdEr0xsUZdZBYFnYejLEosAstPL";
                return iArr[0];
            }

            @Override // com.facebook.ads.androidx.media3.common.Timeline
            public final int A0C(boolean z) {
                if (A0N()) {
                    return -1;
                }
                if (z) {
                    return this.A02[A07() - 1];
                }
                return A07() - 1;
            }

            @Override // com.facebook.ads.androidx.media3.common.Timeline
            public final C1807oN A0I(int i, C1807oN p, boolean z) {
                C1844p0 c1844p0;
                C1807oN p2 = this.A00.get(i);
                Object obj = p2.A03;
                Object obj2 = p2.A04;
                int i2 = p2.A00;
                long j = p2.A01;
                long j2 = p2.A02;
                c1844p0 = p2.A06;
                p.A0G(obj, obj2, i2, j, j2, c1844p0, p2.A05);
                return p;
            }

            @Override // com.facebook.ads.androidx.media3.common.Timeline
            public final C1805oL A0L(int i, C1805oL c1805oL, long j) {
                C1805oL c1805oL2 = this.A01.get(i);
                c1805oL.A07(c1805oL2.A0C, c1805oL2.A09, c1805oL2.A0A, c1805oL2.A06, c1805oL2.A07, c1805oL2.A04, c1805oL2.A0G, c1805oL2.A0D, c1805oL2.A08, c1805oL2.A02, c1805oL2.A03, c1805oL2.A00, c1805oL2.A01, c1805oL2.A05);
                c1805oL.A0F = c1805oL2.A0F;
                return c1805oL;
            }

            @Override // com.facebook.ads.androidx.media3.common.Timeline
            public final Object A0M(int i) {
                throw new UnsupportedOperationException();
            }
        };
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.1R != com.facebook.ads.androidx.media3.common.Bundleable$Creator<T extends com.facebook.ads.redexgen.X.1S> */
    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.1h != com.google.common.collect.ImmutableList$Builder<T extends com.facebook.ads.redexgen.X.1S> */
    public static <T extends C1S> AbstractC0303Am<T> A04(C1R<T> c1r, IBinder iBinder) {
        if (iBinder == null) {
            return AbstractC0303Am.A03();
        }
        C00791h c00791h = new C00791h();
        AbstractC0303Am<Bundle> A002 = C1Q.A00(iBinder);
        for (int i = 0; i < A002.size(); i++) {
            c00791h.A04(c1r.A6X(A002.get(i)));
        }
        return c00791h.A05();
    }

    public static int[] A05(int i) {
        int[] iArr = new int[i];
        for (int i2 = 0; i2 < i; i2++) {
            iArr[i2] = i2;
            int i3 = A00[1].charAt(20);
            if (i3 == 50) {
                throw new RuntimeException();
            }
            String[] strArr = A00;
            strArr[2] = "bm1hpxiL8T70YPoy7qoC4X3DFFhRRvrI";
            strArr[4] = "ZU2doOYnXTdq2XyitRV5O0BVNSu1NLTL";
        }
        return iArr;
    }

    public int A08(int i, int i2, boolean z) {
        switch (i2) {
            case 0:
                if (i == A0C(z)) {
                    return -1;
                }
                return i + 1;
            case 1:
                return i;
            case 2:
                int A0C = A0C(z);
                String[] strArr = A00;
                if (strArr[3].charAt(14) != strArr[5].charAt(14)) {
                    throw new RuntimeException();
                }
                A00[1] = "R0HEAX03GiDQUcMP0CiDD2yYG3qNGv8H";
                if (i == A0C) {
                    return A0B(z);
                }
                return i + 1;
            default:
                throw new IllegalStateException();
        }
    }

    public final int A09(int i, C1807oN c1807oN, C1805oL c1805oL, int i2, boolean z) {
        int i3 = A0H(i, c1807oN).A00;
        int windowIndex = A0K(i3, c1805oL).A01;
        if (windowIndex == i) {
            int nextWindowIndex = A08(i3, i2, z);
            if (nextWindowIndex == -1) {
                return -1;
            }
            int windowIndex2 = A0K(nextWindowIndex, c1805oL).A00;
            return windowIndex2;
        }
        int windowIndex3 = i + 1;
        return windowIndex3;
    }

    public int A0B(boolean z) {
        return A0N() ? -1 : 0;
    }

    public int A0C(boolean z) {
        if (A0N()) {
            return -1;
        }
        return A07() - 1;
    }

    @Deprecated
    public final Pair<Object, Long> A0D(C1805oL c1805oL, C1807oN c1807oN, int i, long j) {
        return A0E(c1805oL, c1807oN, i, j);
    }

    public final Pair<Object, Long> A0E(C1805oL c1805oL, C1807oN c1807oN, int i, long j) {
        return (Pair) C3M.A01(A0G(c1805oL, c1807oN, i, j, 0L));
    }

    @Deprecated
    public final Pair<Object, Long> A0F(C1805oL c1805oL, C1807oN c1807oN, int i, long j, long j2) {
        return A0G(c1805oL, c1807oN, i, j, j2);
    }

    public final Pair<Object, Long> A0G(C1805oL c1805oL, C1807oN c1807oN, int i, long j, long j2) {
        C3M.A00(i, 0, A07());
        A0L(i, c1805oL, j2);
        if (j == -9223372036854775807L) {
            j = c1805oL.A05();
            if (j == -9223372036854775807L) {
                return null;
            }
        }
        int i2 = c1805oL.A00;
        A0H(i2, c1807oN);
        while (i2 < c1805oL.A01 && c1807oN.A02 != j && A0H(i2 + 1, c1807oN).A02 <= j) {
            i2++;
        }
        A0I(i2, c1807oN, true);
        long j3 = j - c1807oN.A02;
        if (c1807oN.A01 != -9223372036854775807L) {
            long j4 = c1807oN.A01;
            if (A00[1].charAt(20) == '2') {
                throw new RuntimeException();
            }
            A00[1] = "slEcDLMOMSnRw8lzrIQwxe9jf9tcgTic";
            j3 = Math.min(j3, j4 - 1);
        }
        return Pair.create(C3M.A01(c1807oN.A04), Long.valueOf(Math.max(0L, j3)));
    }

    public final C1807oN A0H(int i, C1807oN c1807oN) {
        return A0I(i, c1807oN, false);
    }

    public C1807oN A0J(Object obj, C1807oN c1807oN) {
        return A0I(A0A(obj), c1807oN, true);
    }

    public final C1805oL A0K(int i, C1805oL c1805oL) {
        return A0L(i, c1805oL, 0L);
    }

    public final boolean A0N() {
        return A07() == 0;
    }

    public final boolean A0O(int i, C1807oN c1807oN, C1805oL c1805oL, int i2, boolean z) {
        return A09(i, c1807oN, c1805oL, i2, z) == -1;
    }

    public final boolean equals(Object obj) {
        int A0C;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Timeline)) {
            return false;
        }
        Timeline timeline = (Timeline) obj;
        if (timeline.A07() != A07() || timeline.A06() != A06()) {
            return false;
        }
        C1805oL c1805oL = new C1805oL();
        C1807oN c1807oN = new C1807oN();
        C1805oL window = new C1805oL();
        C1807oN otherPeriod = new C1807oN();
        for (int i = 0; i < A07(); i++) {
            if (!A0K(i, c1805oL).equals(timeline.A0K(i, window))) {
                return false;
            }
        }
        for (int i2 = 0; i2 < A06(); i2++) {
            boolean equals = A0I(i2, c1807oN, true).equals(timeline.A0I(i2, otherPeriod, true));
            if (A00[6].length() != 11) {
                throw new RuntimeException();
            }
            String[] strArr = A00;
            strArr[7] = "LCXdoHEXleHtD1UyLVprjOGqC7qnADXU";
            strArr[0] = "np8LEsRhRemsbbWWIjAQc1GjKbBRdfRS";
            if (!equals) {
                return false;
            }
        }
        int A0B = A0B(true);
        if (A0B != timeline.A0B(true) || (A0C = A0C(true)) != timeline.A0C(true)) {
            return false;
        }
        while (A0B != A0C) {
            int A08 = A08(A0B, 0, true);
            if (A08 != timeline.A08(A0B, 0, true)) {
                return false;
            }
            A0B = A08;
        }
        return true;
    }

    public final int hashCode() {
        C1805oL c1805oL = new C1805oL();
        C1807oN c1807oN = new C1807oN();
        int result = 7 * 31;
        int i = result + A07();
        for (int i2 = 0; i2 < A07(); i2++) {
            C1805oL window = A0K(i2, c1805oL);
            i = (i * 31) + window.hashCode();
        }
        int result2 = i * 31;
        int i3 = result2 + A06();
        for (int i4 = 0; i4 < A06(); i4++) {
            i3 = (i3 * 31) + A0I(i4, c1807oN, true).hashCode();
        }
        int A0B = A0B(true);
        while (A0B != -1) {
            int windowIndex = i3 * 31;
            i3 = windowIndex + A0B;
            A0B = A08(A0B, 0, true);
        }
        return i3;
    }
}
