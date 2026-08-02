package com.squareup.cash.work.presenters.shift.geofence;

/* loaded from: classes7.dex */
public interface GeofenceStatus {

    public final class InsideGeofence implements GeofenceStatus {
        public static final InsideGeofence INSTANCE = new InsideGeofence();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof InsideGeofence);
        }

        public final int hashCode() {
            return -1340813234;
        }

        public final String toString() {
            return "InsideGeofence";
        }
    }

    public final class InvalidCoordinates implements GeofenceStatus {
        public static final InvalidCoordinates INSTANCE = new InvalidCoordinates();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof InvalidCoordinates);
        }

        public final int hashCode() {
            return 735003446;
        }

        public final String toString() {
            return "InvalidCoordinates";
        }
    }

    public final class NotRequired implements GeofenceStatus {
        public static final NotRequired INSTANCE = new NotRequired();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof NotRequired);
        }

        public final int hashCode() {
            return -407554016;
        }

        public final String toString() {
            return "NotRequired";
        }
    }

    public final class OutsideGeofence implements GeofenceStatus {
        public static final OutsideGeofence INSTANCE = new OutsideGeofence();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof OutsideGeofence);
        }

        public final int hashCode() {
            return -60491309;
        }

        public final String toString() {
            return "OutsideGeofence";
        }
    }

    public final class PermissionDeniedNeedsSettings implements GeofenceStatus {
        public static final PermissionDeniedNeedsSettings INSTANCE = new PermissionDeniedNeedsSettings();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof PermissionDeniedNeedsSettings);
        }

        public final int hashCode() {
            return -461875004;
        }

        public final String toString() {
            return "PermissionDeniedNeedsSettings";
        }
    }

    public final class PermissionRequired implements GeofenceStatus {
        public static final PermissionRequired INSTANCE = new PermissionRequired();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof PermissionRequired);
        }

        public final int hashCode() {
            return 1363049024;
        }

        public final String toString() {
            return "PermissionRequired";
        }
    }
}
