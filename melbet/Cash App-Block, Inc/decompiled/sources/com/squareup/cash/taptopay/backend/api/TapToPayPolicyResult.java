package com.squareup.cash.taptopay.backend.api;

/* loaded from: classes7.dex */
public interface TapToPayPolicyResult {

    public final class Failure implements TapToPayPolicyResult {
        public final TapToPayPolicyFailureReason reason;

        public Failure(TapToPayPolicyFailureReason tapToPayPolicyFailureReason) {
            this.reason = tapToPayPolicyFailureReason;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Failure) && this.reason == ((Failure) obj).reason;
        }

        public final int hashCode() {
            return this.reason.hashCode();
        }

        public final String toString() {
            return "Failure(reason=" + this.reason + ")";
        }
    }

    public final class Success implements TapToPayPolicyResult {
        public static final Success INSTANCE = new Success();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof Success);
        }

        public final int hashCode() {
            return 1060738190;
        }

        public final String toString() {
            return "Success";
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public final class TapToPayPolicyFailureReason {
        public static final /* synthetic */ TapToPayPolicyFailureReason[] $VALUES;
        public static final TapToPayPolicyFailureReason API_FAILURE;
        public static final TapToPayPolicyFailureReason OS_PLATFORM_LEVEL_OUTDATED;
        public static final TapToPayPolicyFailureReason PLAY_PROTECT_NOT_AVAILABLE;
        public static final TapToPayPolicyFailureReason SCREEN_RECORDING_ON;
        public static final TapToPayPolicyFailureReason UNKNOWN;

        static {
            TapToPayPolicyFailureReason tapToPayPolicyFailureReason = new TapToPayPolicyFailureReason("UNKNOWN", 0);
            UNKNOWN = tapToPayPolicyFailureReason;
            TapToPayPolicyFailureReason tapToPayPolicyFailureReason2 = new TapToPayPolicyFailureReason("API_FAILURE", 1);
            API_FAILURE = tapToPayPolicyFailureReason2;
            TapToPayPolicyFailureReason tapToPayPolicyFailureReason3 = new TapToPayPolicyFailureReason("PLAY_PROTECT_NOT_AVAILABLE", 2);
            PLAY_PROTECT_NOT_AVAILABLE = tapToPayPolicyFailureReason3;
            TapToPayPolicyFailureReason tapToPayPolicyFailureReason4 = new TapToPayPolicyFailureReason("OS_PLATFORM_LEVEL_OUTDATED", 3);
            OS_PLATFORM_LEVEL_OUTDATED = tapToPayPolicyFailureReason4;
            TapToPayPolicyFailureReason tapToPayPolicyFailureReason5 = new TapToPayPolicyFailureReason("SCREEN_RECORDING_ON", 4);
            SCREEN_RECORDING_ON = tapToPayPolicyFailureReason5;
            $VALUES = new TapToPayPolicyFailureReason[]{tapToPayPolicyFailureReason, tapToPayPolicyFailureReason2, tapToPayPolicyFailureReason3, tapToPayPolicyFailureReason4, tapToPayPolicyFailureReason5};
        }

        public static TapToPayPolicyFailureReason valueOf(String str) {
            return (TapToPayPolicyFailureReason) Enum.valueOf(TapToPayPolicyFailureReason.class, str);
        }

        public static TapToPayPolicyFailureReason[] values() {
            return (TapToPayPolicyFailureReason[]) $VALUES.clone();
        }
    }
}
