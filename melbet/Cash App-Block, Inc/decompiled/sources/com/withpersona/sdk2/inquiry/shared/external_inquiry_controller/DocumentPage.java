package com.withpersona.sdk2.inquiry.shared.external_inquiry_controller;

/* loaded from: classes9.dex */
public interface DocumentPage {

    public final class Pending implements DocumentPage {
        public static final Pending INSTANCE = new Pending();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof Pending);
        }

        public final int hashCode() {
            return -1611120582;
        }

        public final String toString() {
            return "Pending";
        }
    }

    public final class Prompt implements DocumentPage {
        public static final Prompt INSTANCE = new Prompt();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof Prompt);
        }

        public final int hashCode() {
            return -39927199;
        }

        public final String toString() {
            return "Prompt";
        }
    }

    public final class Review implements DocumentPage {
        public static final Review INSTANCE = new Review();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof Review);
        }

        public final int hashCode() {
            return 5529685;
        }

        public final String toString() {
            return "Review";
        }
    }

    public final class TakePhoto implements DocumentPage {
        public static final TakePhoto INSTANCE = new TakePhoto();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof TakePhoto);
        }

        public final int hashCode() {
            return -1776980018;
        }

        public final String toString() {
            return "TakePhoto";
        }
    }
}
