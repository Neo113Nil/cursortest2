package com.withpersona.sdk2.camera;

import com.android.volley.Request$Priority$EnumUnboxingLocalUtility;

/* loaded from: classes5.dex */
public interface CameraState {

    /* loaded from: classes9.dex */
    public final class Closed implements CameraState {
        public final boolean isClosedDueToBadCameraConfiguration;
        public final boolean wasRecordingInterrupted;

        public Closed(boolean z, boolean z2) {
            this.wasRecordingInterrupted = z;
            this.isClosedDueToBadCameraConfiguration = z2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Closed)) {
                return false;
            }
            Closed closed = (Closed) obj;
            return this.wasRecordingInterrupted == closed.wasRecordingInterrupted && this.isClosedDueToBadCameraConfiguration == closed.isClosedDueToBadCameraConfiguration;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.isClosedDueToBadCameraConfiguration) + (Boolean.hashCode(this.wasRecordingInterrupted) * 31);
        }

        public final String toString() {
            return Request$Priority$EnumUnboxingLocalUtility.m("Closed(wasRecordingInterrupted=", ", isClosedDueToBadCameraConfiguration=", ")", this.wasRecordingInterrupted, this.isClosedDueToBadCameraConfiguration);
        }
    }

    public final class Error implements CameraState {
        public static final Error INSTANCE = new Error();
        public static final Error INSTANCE$1 = new Error();
        public static final Error INSTANCE$2 = new Error();
        public static final Error INSTANCE$3 = new Error();
    }
}
