package com.squareup.cash.work.viewmodels;

/* loaded from: classes7.dex */
public interface WorkHomeViewEvent {

    public interface TitleBarViewEvent extends WorkHomeViewEvent {

        public final class GoBack implements TitleBarViewEvent {
            public static final GoBack INSTANCE = new GoBack();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof GoBack);
            }

            public final int hashCode() {
                return -2100879488;
            }

            public final String toString() {
                return "GoBack";
            }
        }

        public final class ShowMerchantPicker implements TitleBarViewEvent {
            public static final ShowMerchantPicker INSTANCE = new ShowMerchantPicker();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof ShowMerchantPicker);
            }

            public final int hashCode() {
                return -1476268828;
            }

            public final String toString() {
                return "ShowMerchantPicker";
            }
        }

        public final class ShowShiftList implements TitleBarViewEvent {
            public static final ShowShiftList INSTANCE = new ShowShiftList();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof ShowShiftList);
            }

            public final int hashCode() {
                return 1648578322;
            }

            public final String toString() {
                return "ShowShiftList";
            }
        }
    }
}
