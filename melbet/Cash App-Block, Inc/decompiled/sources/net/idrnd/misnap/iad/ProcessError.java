package net.idrnd.misnap.iad;

/* loaded from: classes9.dex */
public abstract class ProcessError {

    public final class CaptureCoreClosed extends ProcessError {
        public static final CaptureCoreClosed INSTANCE = new CaptureCoreClosed();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof CaptureCoreClosed);
        }

        public final int hashCode() {
            return 2065418004;
        }

        public final String toString() {
            return "CaptureCoreClosed";
        }
    }

    public final class ImageSizeInvalid extends ProcessError {
        public static final ImageSizeInvalid INSTANCE = new ImageSizeInvalid();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof ImageSizeInvalid);
        }

        public final int hashCode() {
            return -561098568;
        }

        public final String toString() {
            return "ImageSizeInvalid";
        }
    }

    public final class ImageTimestampInvalid extends ProcessError {
        public static final ImageTimestampInvalid INSTANCE = new ImageTimestampInvalid();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof ImageTimestampInvalid);
        }

        public final int hashCode() {
            return -178744513;
        }

        public final String toString() {
            return "ImageTimestampInvalid";
        }
    }

    /* loaded from: classes4.dex */
    public final class JpegEncodingFailed extends ProcessError {
        public static final JpegEncodingFailed INSTANCE = new JpegEncodingFailed();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof JpegEncodingFailed);
        }

        public final int hashCode() {
            return 1430792469;
        }

        public final String toString() {
            return "JpegEncodingFailed";
        }
    }

    /* loaded from: classes4.dex */
    public final class Nv21IsNull extends ProcessError {
        public static final Nv21IsNull INSTANCE = new Nv21IsNull();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof Nv21IsNull);
        }

        public final int hashCode() {
            return -948499755;
        }

        public final String toString() {
            return "Nv21IsNull";
        }
    }

    /* loaded from: classes4.dex */
    public final class UnknownError extends ProcessError {
        public static final UnknownError INSTANCE = new UnknownError();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof UnknownError);
        }

        public final int hashCode() {
            return -2143462213;
        }

        public final String toString() {
            return "UnknownError";
        }
    }
}
