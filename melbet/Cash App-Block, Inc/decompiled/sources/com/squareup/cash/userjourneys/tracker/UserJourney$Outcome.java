package com.squareup.cash.userjourneys.tracker;

/* loaded from: classes.dex */
public interface UserJourney$Outcome {

    public interface Completed extends UserJourney$Outcome {
    }

    public final class Failed implements Completed {
        public static final Failed INSTANCE = new Failed();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof Failed);
        }

        public final int hashCode() {
            return 230782598;
        }

        public final String toString() {
            return "Failed";
        }
    }

    public final class ProcessCrashed implements UserJourney$Outcome {
        public static final ProcessCrashed INSTANCE = new ProcessCrashed();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof ProcessCrashed);
        }

        public final int hashCode() {
            return 2042288736;
        }

        public final String toString() {
            return "ProcessCrashed";
        }
    }

    public final class ProcessKilled implements UserJourney$Outcome {
        public static final ProcessKilled INSTANCE = new ProcessKilled();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof ProcessKilled);
        }

        public final int hashCode() {
            return 1810943331;
        }

        public final String toString() {
            return "ProcessKilled";
        }
    }

    public final class Succeeded implements Completed {
        public static final Succeeded INSTANCE = new Succeeded();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof Succeeded);
        }

        public final int hashCode() {
            return 483512184;
        }

        public final String toString() {
            return "Succeeded";
        }
    }

    /* loaded from: classes7.dex */
    public final class Terminated implements UserJourney$Outcome {
        public final UserJourney$TerminationReason reason;

        public Terminated(UserJourney$TerminationReason userJourney$TerminationReason) {
            this.reason = userJourney$TerminationReason;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Terminated) && this.reason == ((Terminated) obj).reason;
        }

        public final UserJourney$TerminationReason getReason() {
            return this.reason;
        }

        public final int hashCode() {
            return this.reason.hashCode();
        }

        public final String toString() {
            return "Terminated(reason=" + this.reason + ")";
        }
    }

    public final class UserCanceled implements Completed {
        public static final UserCanceled INSTANCE = new UserCanceled();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof UserCanceled);
        }

        public final int hashCode() {
            return -1283251955;
        }

        public final String toString() {
            return "UserCanceled";
        }
    }
}
