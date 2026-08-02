package nl.dionsegijn.konfetti.core.models;

import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;

/* loaded from: classes4.dex */
public final class ReferenceImage implements CoreImage {
    public final int height;
    public final int reference;
    public final int width;

    public ReferenceImage(int i, int i2, int i3) {
        this.reference = i;
        this.width = i2;
        this.height = i3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ReferenceImage)) {
            return false;
        }
        ReferenceImage referenceImage = (ReferenceImage) obj;
        return this.reference == referenceImage.reference && this.width == referenceImage.width && this.height == referenceImage.height;
    }

    @Override // nl.dionsegijn.konfetti.core.models.CoreImage
    public final int getHeight() {
        return this.height;
    }

    @Override // nl.dionsegijn.konfetti.core.models.CoreImage
    public final int getWidth() {
        return this.width;
    }

    public final int hashCode() {
        return Integer.hashCode(this.height) + JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.width, Integer.hashCode(this.reference) * 31, 31);
    }

    public final String toString() {
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.height, ")", Recorder$$ExternalSyntheticOutline2.m107m(this.reference, this.width, "ReferenceImage(reference=", ", width=", ", height="));
    }
}
