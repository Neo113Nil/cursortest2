package com.squareup.cash.support.chat.viewmodels;

/* loaded from: classes7.dex */
public interface ChatSurveyUnavailableViewEvent {

    public final class Cancel implements ChatSurveyUnavailableViewEvent {
        public static final Cancel INSTANCE = new Cancel();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof Cancel);
        }

        public final int hashCode() {
            return 462786615;
        }

        public final String toString() {
            return "Cancel";
        }
    }

    public final class Retry implements ChatSurveyUnavailableViewEvent {
        public static final Retry INSTANCE = new Retry();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof Retry);
        }

        public final int hashCode() {
            return 28906827;
        }

        public final String toString() {
            return "Retry";
        }
    }
}
