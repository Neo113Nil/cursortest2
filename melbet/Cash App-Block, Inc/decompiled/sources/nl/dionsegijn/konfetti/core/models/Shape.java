package nl.dionsegijn.konfetti.core.models;

import androidx.recyclerview.widget.RecyclerView;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;

/* loaded from: classes9.dex */
public interface Shape {

    /* loaded from: classes4.dex */
    public final class Circle implements Shape {
        public static final Circle INSTANCE = new Circle();
        public static final Circle INSTANCE$1 = new Circle();
    }

    /* loaded from: classes7.dex */
    public final class DrawableShape implements Shape {
        public final boolean applyAlpha;
        public final float heightRatio;
        public final CoreImage image;
        public final boolean tint;

        public DrawableShape(CoreImage coreImage, boolean z, boolean z2) {
            this.image = coreImage;
            this.tint = z;
            this.applyAlpha = z2;
            this.heightRatio = (coreImage.getHeight() == -1 && coreImage.getWidth() == -1) ? 1.0f : (coreImage.getHeight() == -1 || coreImage.getWidth() == -1) ? RecyclerView.DECELERATION_RATE : coreImage.getHeight() / coreImage.getWidth();
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof DrawableShape)) {
                return false;
            }
            DrawableShape drawableShape = (DrawableShape) obj;
            return this.image.equals(drawableShape.image) && this.tint == drawableShape.tint && this.applyAlpha == drawableShape.applyAlpha;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public final int hashCode() {
            int hashCode = this.image.hashCode() * 31;
            boolean z = this.tint;
            int i = z;
            if (z != 0) {
                i = 1;
            }
            int i2 = (hashCode + i) * 31;
            boolean z2 = this.applyAlpha;
            return i2 + (z2 ? 1 : z2 ? 1 : 0);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("DrawableShape(image=");
            sb.append(this.image);
            sb.append(", tint=");
            sb.append(this.tint);
            sb.append(", applyAlpha=");
            return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(sb, this.applyAlpha, ")");
        }
    }
}
