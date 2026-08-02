package com.squareup.cash.userjourneys.tracker;

/* loaded from: classes7.dex */
public interface UserJourneyResponseSignal {

    public final class Friction implements UserJourneyResponseSignal {
        public final UserJourney$Friction friction;

        public Friction(UserJourney$Friction userJourney$Friction) {
            this.friction = userJourney$Friction;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Friction) && this.friction.equals(((Friction) obj).friction);
        }

        public final UserJourney$Friction getFriction() {
            return this.friction;
        }

        public final int hashCode() {
            return this.friction.hashCode();
        }

        public final String toString() {
            return "Friction(friction=" + this.friction + ")";
        }
    }

    public final class Frustration implements UserJourneyResponseSignal {
        public final UserJourney$Friction frustration;

        public Frustration(UserJourney$Friction userJourney$Friction) {
            this.frustration = userJourney$Friction;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Frustration) && this.frustration.equals(((Frustration) obj).frustration);
        }

        public final UserJourney$Friction getFrustration() {
            return this.frustration;
        }

        public final int hashCode() {
            return this.frustration.hashCode();
        }

        public final String toString() {
            return "Frustration(frustration=" + this.frustration + ")";
        }
    }
}
