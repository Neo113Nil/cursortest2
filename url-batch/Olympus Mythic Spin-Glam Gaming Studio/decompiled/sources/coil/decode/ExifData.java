package coil.decode;

import kotlin.jvm.internal.DefaultConstructorMarker;

/* compiled from: ExifUtils.kt */
/* loaded from: classes11.dex */
public final class ExifData {
    public static final Companion Companion = new Companion(null);
    public static final ExifData NONE = new ExifData(false, 0);
    private final boolean isFlipped;
    private final int rotationDegrees;

    public ExifData(boolean z, int i) {
        this.isFlipped = z;
        this.rotationDegrees = i;
    }

    public final boolean isFlipped() {
        return this.isFlipped;
    }

    public final int getRotationDegrees() {
        return this.rotationDegrees;
    }

    /* compiled from: ExifUtils.kt */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }
}
