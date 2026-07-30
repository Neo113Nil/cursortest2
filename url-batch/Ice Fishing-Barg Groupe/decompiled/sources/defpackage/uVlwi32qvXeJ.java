package defpackage;

import java.text.BreakIterator;

/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
/* loaded from: classes.dex */
public final class uVlwi32qvXeJ extends yQRudnv4La6p {
    public static final hVNtCUZb4tYH Companion = new hVNtCUZb4tYH();
    public static uVlwi32qvXeJ Y1f8riQaR6yg;
    public BreakIterator TSizfFm2Yiuu;

    @Override // defpackage.yQRudnv4La6p
    public final int[] OPXfSBeufaJ8(int i) {
        int length = TSizfFm2Yiuu().length();
        if (length > 0 && i > 0) {
            if (i > length) {
                i = length;
            }
            while (i > 0 && !dgRBjINgWbAK(i - 1) && !wdg6QnbFHrFF(i)) {
                BreakIterator breakIterator = this.TSizfFm2Yiuu;
                if (breakIterator == null) {
                    cs0.tmVwIGCQF4zR("impl");
                    throw null;
                }
                i = breakIterator.preceding(i);
                if (i == -1) {
                    break;
                }
            }
            BreakIterator breakIterator2 = this.TSizfFm2Yiuu;
            if (breakIterator2 == null) {
                cs0.tmVwIGCQF4zR("impl");
                throw null;
            }
            int preceding = breakIterator2.preceding(i);
            if (preceding != -1 && dgRBjINgWbAK(preceding) && (preceding == 0 || !dgRBjINgWbAK(preceding - 1))) {
                return lS5Rgt96tfkO(preceding, i);
            }
        }
        return null;
    }

    @Override // defpackage.yQRudnv4La6p
    public final int[] PxuCJdSBwIXG(int i) {
        if (TSizfFm2Yiuu().length() > 0 && i < TSizfFm2Yiuu().length()) {
            if (i < 0) {
                i = 0;
            }
            while (!dgRBjINgWbAK(i) && (!dgRBjINgWbAK(i) || (i != 0 && dgRBjINgWbAK(i - 1)))) {
                BreakIterator breakIterator = this.TSizfFm2Yiuu;
                if (breakIterator == null) {
                    cs0.tmVwIGCQF4zR("impl");
                    throw null;
                }
                i = breakIterator.following(i);
                if (i == -1) {
                    break;
                }
            }
            BreakIterator breakIterator2 = this.TSizfFm2Yiuu;
            if (breakIterator2 == null) {
                cs0.tmVwIGCQF4zR("impl");
                throw null;
            }
            int following = breakIterator2.following(i);
            if (following != -1 && wdg6QnbFHrFF(following)) {
                return lS5Rgt96tfkO(i, following);
            }
        }
        return null;
    }

    public final boolean dgRBjINgWbAK(int i) {
        if (i < 0 || i >= TSizfFm2Yiuu().length()) {
            return false;
        }
        return Character.isLetterOrDigit(TSizfFm2Yiuu().codePointAt(i));
    }

    public final boolean wdg6QnbFHrFF(int i) {
        if (i <= 0 || !dgRBjINgWbAK(i - 1)) {
            return false;
        }
        return i == TSizfFm2Yiuu().length() || !dgRBjINgWbAK(i);
    }
}
