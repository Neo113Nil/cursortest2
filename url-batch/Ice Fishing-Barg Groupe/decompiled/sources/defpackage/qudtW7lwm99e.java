package defpackage;

import java.text.BreakIterator;

/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
/* loaded from: classes.dex */
public final class qudtW7lwm99e extends yQRudnv4La6p {
    public static final KUoIVIumpKat Companion = new KUoIVIumpKat();
    public static qudtW7lwm99e Y1f8riQaR6yg;
    public BreakIterator TSizfFm2Yiuu;

    @Override // defpackage.yQRudnv4La6p
    public final int[] OPXfSBeufaJ8(int i) {
        int length = TSizfFm2Yiuu().length();
        if (length <= 0 || i <= 0) {
            return null;
        }
        if (i > length) {
            i = length;
        }
        do {
            BreakIterator breakIterator = this.TSizfFm2Yiuu;
            if (breakIterator == null) {
                cs0.tmVwIGCQF4zR("impl");
                throw null;
            }
            boolean isBoundary = breakIterator.isBoundary(i);
            BreakIterator breakIterator2 = this.TSizfFm2Yiuu;
            if (isBoundary) {
                if (breakIterator2 == null) {
                    cs0.tmVwIGCQF4zR("impl");
                    throw null;
                }
                int preceding = breakIterator2.preceding(i);
                if (preceding == -1) {
                    return null;
                }
                return lS5Rgt96tfkO(preceding, i);
            }
            if (breakIterator2 == null) {
                cs0.tmVwIGCQF4zR("impl");
                throw null;
            }
            i = breakIterator2.preceding(i);
        } while (i != -1);
        return null;
    }

    @Override // defpackage.yQRudnv4La6p
    public final int[] PxuCJdSBwIXG(int i) {
        int length = TSizfFm2Yiuu().length();
        if (length <= 0 || i >= length) {
            return null;
        }
        if (i < 0) {
            i = 0;
        }
        do {
            BreakIterator breakIterator = this.TSizfFm2Yiuu;
            if (breakIterator == null) {
                cs0.tmVwIGCQF4zR("impl");
                throw null;
            }
            boolean isBoundary = breakIterator.isBoundary(i);
            BreakIterator breakIterator2 = this.TSizfFm2Yiuu;
            if (isBoundary) {
                if (breakIterator2 == null) {
                    cs0.tmVwIGCQF4zR("impl");
                    throw null;
                }
                int following = breakIterator2.following(i);
                if (following == -1) {
                    return null;
                }
                return lS5Rgt96tfkO(i, following);
            }
            if (breakIterator2 == null) {
                cs0.tmVwIGCQF4zR("impl");
                throw null;
            }
            i = breakIterator2.following(i);
        } while (i != -1);
        return null;
    }
}
