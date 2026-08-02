package com.squareup.cash.wallet.views;

/* loaded from: classes7.dex */
public interface LockAnimationColorTreatment {

    public final class Adaptive implements LockAnimationColorTreatment {
        public static final Adaptive INSTANCE = new Adaptive();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof Adaptive);
        }

        public final int hashCode() {
            return 1823995321;
        }

        public final String toString() {
            return "Adaptive";
        }
    }

    public final class DarkLock implements LockAnimationColorTreatment {
        public static final DarkLock INSTANCE = new DarkLock();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof DarkLock);
        }

        public final int hashCode() {
            return 575839492;
        }

        public final String toString() {
            return "DarkLock";
        }
    }

    public final class LightLock implements LockAnimationColorTreatment {
        public static final LightLock INSTANCE = new LightLock();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof LightLock);
        }

        public final int hashCode() {
            return -1068581762;
        }

        public final String toString() {
            return "LightLock";
        }
    }
}
