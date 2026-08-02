package com.squareup.cash.wallet.viewmodels;

/* loaded from: classes7.dex */
public interface OverdraftCoverageListItemViewModel {

    public final class Loading implements OverdraftCoverageListItemViewModel {
        public static final Loading INSTANCE = new Loading();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof Loading);
        }

        public final int hashCode() {
            return -1212642200;
        }

        public final String toString() {
            return "Loading";
        }
    }

    public final class Ready implements OverdraftCoverageListItemViewModel {
        public final OverdraftListItemState overdraftListItemState;

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        public final class OverdraftListItemState {
            public static final /* synthetic */ OverdraftListItemState[] $VALUES;
            public static final OverdraftListItemState ELIGIBLE;
            public static final OverdraftListItemState NEW;
            public static final OverdraftListItemState OFF;
            public static final OverdraftListItemState ON;

            static {
                OverdraftListItemState overdraftListItemState = new OverdraftListItemState("ON", 0);
                ON = overdraftListItemState;
                OverdraftListItemState overdraftListItemState2 = new OverdraftListItemState("OFF", 1);
                OFF = overdraftListItemState2;
                OverdraftListItemState overdraftListItemState3 = new OverdraftListItemState("ELIGIBLE", 2);
                ELIGIBLE = overdraftListItemState3;
                OverdraftListItemState overdraftListItemState4 = new OverdraftListItemState("NEW", 3);
                NEW = overdraftListItemState4;
                $VALUES = new OverdraftListItemState[]{overdraftListItemState, overdraftListItemState2, overdraftListItemState3, overdraftListItemState4};
            }

            public static OverdraftListItemState valueOf(String str) {
                return (OverdraftListItemState) Enum.valueOf(OverdraftListItemState.class, str);
            }

            public static OverdraftListItemState[] values() {
                return (OverdraftListItemState[]) $VALUES.clone();
            }
        }

        public Ready(OverdraftListItemState overdraftListItemState) {
            this.overdraftListItemState = overdraftListItemState;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Ready) && this.overdraftListItemState == ((Ready) obj).overdraftListItemState;
        }

        public final int hashCode() {
            return this.overdraftListItemState.hashCode();
        }

        public final String toString() {
            return "Ready(overdraftListItemState=" + this.overdraftListItemState + ")";
        }
    }
}
