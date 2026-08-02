package com.squareup.cash.taptopay.viewmodels;

import com.knotapi.knot.utilities.Constants;

/* loaded from: classes7.dex */
public interface TapToPayFirstTimeScreenViewEvent {

    public final class Close implements TapToPayFirstTimeScreenViewEvent {
        public static final Close INSTANCE = new Close();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof Close);
        }

        public final int hashCode() {
            return -397253107;
        }

        public final String toString() {
            return Constants.META_CLOSE;
        }
    }

    public final class Next implements TapToPayFirstTimeScreenViewEvent {
        public static final Next INSTANCE = new Next();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof Next);
        }

        public final int hashCode() {
            return -428135362;
        }

        public final String toString() {
            return "Next";
        }
    }
}
