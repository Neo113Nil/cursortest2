package com.squareup.cash.work.viewmodels;

/* loaded from: classes7.dex */
public interface TimecardDetailViewEvent {

    public final class BackClicked implements TimecardDetailViewEvent {
        public static final BackClicked INSTANCE = new BackClicked();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof BackClicked);
        }

        public final int hashCode() {
            return -238453307;
        }

        public final String toString() {
            return "BackClicked";
        }
    }

    public final class EditClicked implements TimecardDetailViewEvent {
        public static final EditClicked INSTANCE = new EditClicked();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof EditClicked);
        }

        public final int hashCode() {
            return -1378281662;
        }

        public final String toString() {
            return "EditClicked";
        }
    }
}
