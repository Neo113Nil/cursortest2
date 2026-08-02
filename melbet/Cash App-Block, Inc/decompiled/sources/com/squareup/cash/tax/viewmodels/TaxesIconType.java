package com.squareup.cash.tax.viewmodels;

/* loaded from: classes7.dex */
public interface TaxesIconType {

    public final class Alert implements TaxesIconType {
        public static final Alert INSTANCE = new Alert();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof Alert);
        }

        public final int hashCode() {
            return -1506855376;
        }

        public final String toString() {
            return "Alert";
        }
    }

    public final class Standard implements TaxesIconType {
        public static final Standard INSTANCE = new Standard();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof Standard);
        }

        public final int hashCode() {
            return -33009303;
        }

        public final String toString() {
            return "Standard";
        }
    }
}
