package nl.dionsegijn.konfetti.xml.image;

import android.graphics.drawable.Drawable;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import nl.dionsegijn.konfetti.core.models.CoreImage;

/* loaded from: classes7.dex */
public final class DrawableImage implements CoreImage {
    public final Drawable drawable;
    public final int height;
    public final int width;

    public DrawableImage(Drawable drawable, int i, int i2) {
        this.drawable = drawable;
        this.width = i;
        this.height = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DrawableImage)) {
            return false;
        }
        DrawableImage drawableImage = (DrawableImage) obj;
        return this.drawable.equals(drawableImage.drawable) && this.width == drawableImage.width && this.height == drawableImage.height;
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
        return Integer.hashCode(this.height) + JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.width, this.drawable.hashCode() * 31, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("DrawableImage(drawable=");
        sb.append(this.drawable);
        sb.append(", width=");
        sb.append(this.width);
        sb.append(", height=");
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(sb, this.height, ')');
    }
}
