package com.squareup.cash.support.viewmodels;

/* loaded from: classes7.dex */
public abstract class SupportHomeContactOptionsSheetEvents {

    public final class ChatClicked extends SupportHomeContactOptionsSheetEvents {
        public static final ChatClicked INSTANCE = new ChatClicked();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof ChatClicked);
        }

        public final int hashCode() {
            return 1421580443;
        }

        public final String toString() {
            return "ChatClicked";
        }
    }

    public final class DismissSheet extends SupportHomeContactOptionsSheetEvents {
        public static final DismissSheet INSTANCE = new DismissSheet();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof DismissSheet);
        }

        public final int hashCode() {
            return -327243895;
        }

        public final String toString() {
            return "DismissSheet";
        }
    }

    public final class MoreContactOptionsClicked extends SupportHomeContactOptionsSheetEvents {
        public static final MoreContactOptionsClicked INSTANCE = new MoreContactOptionsClicked();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof MoreContactOptionsClicked);
        }

        public final int hashCode() {
            return -1281220224;
        }

        public final String toString() {
            return "MoreContactOptionsClicked";
        }
    }

    public final class PhoneClicked extends SupportHomeContactOptionsSheetEvents {
        public static final PhoneClicked INSTANCE = new PhoneClicked();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof PhoneClicked);
        }

        public final int hashCode() {
            return -509707923;
        }

        public final String toString() {
            return "PhoneClicked";
        }
    }
}
