package com.squareup.cash.ui.overlays.viewmodels;

/* loaded from: classes4.dex */
public interface AlertDialogViewEvent {

    /* loaded from: classes6.dex */
    public final class BackPressed implements AlertDialogViewEvent {
        public static final BackPressed INSTANCE = new BackPressed();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof BackPressed);
        }

        public final int hashCode() {
            return 366884410;
        }

        public final String toString() {
            return "BackPressed";
        }
    }

    /* loaded from: classes6.dex */
    public final class NegativeClick implements AlertDialogViewEvent {
        public static final NegativeClick INSTANCE = new NegativeClick();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof NegativeClick);
        }

        public final int hashCode() {
            return -935143534;
        }

        public final String toString() {
            return "NegativeClick";
        }
    }

    /* loaded from: classes6.dex */
    public final class PositiveClick implements AlertDialogViewEvent {
        public static final PositiveClick INSTANCE = new PositiveClick();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof PositiveClick);
        }

        public final int hashCode() {
            return -1891810226;
        }

        public final String toString() {
            return "PositiveClick";
        }
    }

    /* loaded from: classes6.dex */
    public final class TapOutside implements AlertDialogViewEvent {
        public static final TapOutside INSTANCE = new TapOutside();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof TapOutside);
        }

        public final int hashCode() {
            return -85382237;
        }

        public final String toString() {
            return "TapOutside";
        }
    }
}
