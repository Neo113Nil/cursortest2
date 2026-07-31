package coil.decode;

import coil.decode.ImageSource;

/* compiled from: ImageSource.kt */
/* loaded from: classes12.dex */
public final class ResourceMetadata extends ImageSource.Metadata {
    private final int density;
    private final String packageName;
    private final int resId;

    public final int getDensity() {
        return this.density;
    }

    public ResourceMetadata(String str, int i, int i2) {
        this.packageName = str;
        this.resId = i;
        this.density = i2;
    }
}
