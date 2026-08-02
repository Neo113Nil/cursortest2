package com.squareup.cash.taptopay.viewmodels;

import com.knotapi.knot.utilities.Constants;

/* loaded from: classes7.dex */
public interface TapToPayOnboardingCompleteViewEvent {

    public final class Close implements TapToPayOnboardingCompleteViewEvent {
        public static final Close INSTANCE = new Close();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof Close);
        }

        public final int hashCode() {
            return -53547244;
        }

        public final String toString() {
            return Constants.META_CLOSE;
        }
    }

    public final class TryDemoMode implements TapToPayOnboardingCompleteViewEvent {
        public static final TryDemoMode INSTANCE = new TryDemoMode();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof TryDemoMode);
        }

        public final int hashCode() {
            return -753202915;
        }

        public final String toString() {
            return "TryDemoMode";
        }
    }
}
