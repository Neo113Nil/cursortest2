package com.instagram.common.viewpoint.core;

import com.facebook.ads.androidx.media3.common.Timeline;
import com.facebook.video.heroplayer.exocustom.MetaExoPlayerCustomization;

/* renamed from: com.facebook.ads.redexgen.X.7Y, reason: invalid class name */
/* loaded from: assets/audience_network.dex */
public final class C7Y {
    public static String[] A06 = {"jkVScMAnmSDw5NjtFKaMDw93YHVTZfVV", "X8vR6FaiUrrVUV4OyPqbjTz4nTbdT", "DJqg7VUdCo9q2ysxPrWS1RTdTLsj", "4FrbkvGGO58oIWN02YSUZA4iQkwc41Il", "lEgbsVLzgPUjgc1", "ISDPu1y88m9uUW9z", "L6djBwtYOA2bka2PQ69EdZLSIG4ne", "x8MPEelqUvAzBLNZGFUUNdgpeh0HUacA"};
    public C1683mL A00;
    public C1683mL A01;
    public C1683mL A02;
    public AbstractC0303Am<C1683mL> A03 = AbstractC0303Am.A03();
    public AbstractC1707mj<C1683mL, Timeline> A04 = AbstractC1707mj.A04();
    public final C1807oN A05;

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    /* JADX WARN: Removed duplicated region for block: B:17:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x009c A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static C1683mL A00(InterfaceC01212z interfaceC01212z, AbstractC0303Am<C1683mL> abstractC0303Am, C1683mL c1683mL, C1807oN c1807oN) {
        int i;
        int i2;
        Timeline A7Y = interfaceC01212z.A7Y();
        int A7U = interfaceC01212z.A7U();
        Object A0M = A7Y.A0N() ? null : A7Y.A0M(A7U);
        if (!interfaceC01212z.AAU()) {
            boolean A0N = A7Y.A0N();
            String[] strArr = A06;
            if (strArr[7].charAt(14) != strArr[3].charAt(14)) {
                throw new RuntimeException();
            }
            A06[6] = "fPIpfte6042F2VeKOBsTFTkNJVxhR";
            if (!A0N) {
                i = A7Y.A0H(A7U, c1807oN).A07(AbstractC01484a.A0O(interfaceC01212z.A7W()) - c1807oN.A0C());
                for (i2 = 0; i2 < abstractC0303Am.size(); i2++) {
                    C1683mL c1683mL2 = abstractC0303Am.get(i2);
                    if (A04(c1683mL2, A0M, interfaceC01212z.AAU(), interfaceC01212z.A7Q(), interfaceC01212z.A7R(), i)) {
                        return c1683mL2;
                    }
                }
                if (abstractC0303Am.isEmpty() && c1683mL != null) {
                    if (!A04(c1683mL, A0M, interfaceC01212z.AAU(), interfaceC01212z.A7Q(), interfaceC01212z.A7R(), i)) {
                        return c1683mL;
                    }
                }
                return null;
            }
        }
        i = -1;
        while (i2 < abstractC0303Am.size()) {
        }
        if (abstractC0303Am.isEmpty()) {
            if (!A04(c1683mL, A0M, interfaceC01212z.AAU(), interfaceC01212z.A7Q(), interfaceC01212z.A7R(), i)) {
            }
        }
        return null;
    }

    public C7Y(C1807oN c1807oN) {
        this.A05 = c1807oN;
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.mh != com.google.common.collect.ImmutableMap$Builder<com.facebook.ads.androidx.media3.exoplayer.source.MediaSource$MediaPeriodId, com.facebook.ads.androidx.media3.common.Timeline> */
    @MetaExoPlayerCustomization(type = {"FEATURE_LOGIC"}, value = "builder of ImmutableMap should be a buildOrThrow")
    private void A02(Timeline timeline) {
        C1705mh<C1683mL, Timeline> A03 = AbstractC1707mj.A03();
        if (this.A03.isEmpty()) {
            A03(A03, this.A01, timeline);
            C1683mL c1683mL = this.A02;
            C1683mL c1683mL2 = this.A01;
            if (A06[4].length() == 25) {
                throw new RuntimeException();
            }
            String[] strArr = A06;
            strArr[2] = "UxUdIKnoAyUMpq9t4QIr4fpxRPT3";
            strArr[1] = "6BCX8szW2uTmGViuSf00Yq1AObOIr";
            if (!BX.A01(c1683mL, c1683mL2)) {
                A03(A03, this.A02, timeline);
            }
            if (!BX.A01(this.A00, this.A01) && !BX.A01(this.A00, this.A02)) {
                A03(A03, this.A00, timeline);
            }
        } else {
            for (int i = 0; i < this.A03.size(); i++) {
                A03(A03, this.A03.get(i), timeline);
            }
            if (!this.A03.contains(this.A00)) {
                A03(A03, this.A00, timeline);
            }
        }
        this.A04 = A03.A07();
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.mh != com.google.common.collect.ImmutableMap$Builder<com.facebook.ads.androidx.media3.exoplayer.source.MediaSource$MediaPeriodId, com.facebook.ads.androidx.media3.common.Timeline> */
    private void A03(C1705mh<C1683mL, Timeline> c1705mh, C1683mL c1683mL, Timeline timeline) {
        if (c1683mL == null) {
            return;
        }
        if (timeline.A0A(c1683mL.A04) != -1) {
            c1705mh.A05(c1683mL, timeline);
            return;
        }
        Timeline existingTimeline = this.A04.get(c1683mL);
        if (existingTimeline == null) {
            return;
        }
        c1705mh.A05(c1683mL, existingTimeline);
    }

    public static boolean A04(C1683mL c1683mL, Object obj, boolean z, int i, int i2, int i3) {
        if (c1683mL.A04.equals(obj)) {
            return (z && c1683mL.A00 == i && c1683mL.A01 == i2) || (!z && c1683mL.A00 == -1 && c1683mL.A02 == i3);
        }
        return false;
    }

    public final Timeline A05(C1683mL c1683mL) {
        return this.A04.get(c1683mL);
    }

    public final C1683mL A06() {
        return this.A00;
    }

    public final void A07(InterfaceC01212z interfaceC01212z) {
        this.A00 = A00(interfaceC01212z, this.A03, this.A01, this.A05);
        A02(interfaceC01212z.A7Y());
    }
}
