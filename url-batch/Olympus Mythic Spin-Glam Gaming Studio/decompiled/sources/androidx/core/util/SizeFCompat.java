package androidx.core.util;

import android.util.SizeF;
import androidx.annotation.DoNotInline;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import io.bidmachine.iab.vast.tags.VastAttributes;

/* loaded from: classes3.dex */
public final class SizeFCompat {
    private final float mHeight;
    private final float mWidth;

    public SizeFCompat(float f, float f2) {
        this.mWidth = Preconditions.checkArgumentFinite(f, "width");
        this.mHeight = Preconditions.checkArgumentFinite(f2, "height");
    }

    public float getWidth() {
        return this.mWidth;
    }

    public float getHeight() {
        return this.mHeight;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SizeFCompat)) {
            return false;
        }
        SizeFCompat sizeFCompat = (SizeFCompat) obj;
        return sizeFCompat.mWidth == this.mWidth && sizeFCompat.mHeight == this.mHeight;
    }

    public int hashCode() {
        return Float.floatToIntBits(this.mWidth) ^ Float.floatToIntBits(this.mHeight);
    }

    public String toString() {
        return this.mWidth + VastAttributes.HORIZONTAL_POSITION + this.mHeight;
    }

    @RequiresApi
    private static final class Api21Impl {
        @NonNull
        @DoNotInline
        static SizeFCompat toSizeFCompat(@NonNull SizeF sizeF) {
            Preconditions.checkNotNull(sizeF);
            return new SizeFCompat(sizeF.getWidth(), sizeF.getHeight());
        }

        @NonNull
        @DoNotInline
        static SizeF toSizeF(@NonNull SizeFCompat sizeFCompat) {
            Preconditions.checkNotNull(sizeFCompat);
            return new SizeF(sizeFCompat.getWidth(), sizeFCompat.getHeight());
        }
    }
}
