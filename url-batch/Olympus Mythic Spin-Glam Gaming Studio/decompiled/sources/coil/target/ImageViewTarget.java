package coil.target;

import android.graphics.drawable.Drawable;
import android.widget.ImageView;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ImageViewTarget.kt */
/* loaded from: classes15.dex */
public class ImageViewTarget extends GenericViewTarget {
    private final ImageView view;

    public ImageViewTarget(ImageView imageView) {
        this.view = imageView;
    }

    @Override // coil.target.ViewTarget
    public ImageView getView() {
        return this.view;
    }

    @Override // coil.target.GenericViewTarget
    public Drawable getDrawable() {
        return getView().getDrawable();
    }

    @Override // coil.target.GenericViewTarget
    public void setDrawable(Drawable drawable) {
        getView().setImageDrawable(drawable);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ImageViewTarget) && Intrinsics.areEqual(getView(), ((ImageViewTarget) obj).getView());
    }

    public int hashCode() {
        return getView().hashCode();
    }
}
