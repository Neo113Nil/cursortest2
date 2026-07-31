package ru.rustore.sdk.imaging.model;

import android.graphics.drawable.Drawable;
import android.widget.ImageView;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata
/* loaded from: classes3.dex */
public final class ImageRequest {
    private final boolean crossfade;
    private final Drawable error;
    private final WeakReference<ImageView> imageViewRef;
    private final Drawable placeholder;
    private final List<Transformation> transformations;
    private final String url;

    @Metadata
    public static final class Builder {
        private boolean crossfade;
        private Drawable error;
        private final ImageView imageView;
        private Drawable placeholder;
        private final List<Transformation> transformations;
        private final String url;

        public Builder(ImageView imageView, String url) {
            Intrinsics.checkNotNullParameter(imageView, "imageView");
            Intrinsics.checkNotNullParameter(url, "url");
            this.imageView = imageView;
            this.url = url;
            this.transformations = new ArrayList();
        }

        public final ImageRequest build() {
            return new ImageRequest(new WeakReference(this.imageView), this.url, this.placeholder, this.error, this.crossfade, CollectionsKt.toList(this.transformations), null);
        }

        public final Builder crossfade(boolean z4) {
            this.crossfade = z4;
            return this;
        }

        public final Builder error(Drawable drawable) {
            this.error = drawable;
            return this;
        }

        public final Builder placeholder(Drawable drawable) {
            this.placeholder = drawable;
            return this;
        }

        public final Builder transformations(Transformation... transformations) {
            Intrinsics.checkNotNullParameter(transformations, "transformations");
            CollectionsKt.addAll(this.transformations, transformations);
            return this;
        }
    }

    public /* synthetic */ ImageRequest(WeakReference weakReference, String str, Drawable drawable, Drawable drawable2, boolean z4, List list, DefaultConstructorMarker defaultConstructorMarker) {
        this(weakReference, str, drawable, drawable2, z4, list);
    }

    public final boolean getCrossfade() {
        return this.crossfade;
    }

    public final Drawable getError() {
        return this.error;
    }

    public final ImageView getImageView$sdk_public_imaging_release() {
        return this.imageViewRef.get();
    }

    public final Drawable getPlaceholder() {
        return this.placeholder;
    }

    public final List<Transformation> getTransformations() {
        return this.transformations;
    }

    public final String getUrl() {
        return this.url;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("ImageRequest(");
        sb.append("url='" + this.url + "', ");
        sb.append("placeholder=" + this.placeholder + ", ");
        sb.append("error=" + this.error + ", ");
        sb.append("crossfade=" + this.crossfade + ", ");
        StringBuilder sb2 = new StringBuilder("transformations=");
        sb2.append(this.transformations.size());
        sb.append(sb2.toString());
        sb.append(")");
        String sb3 = sb.toString();
        Intrinsics.checkNotNullExpressionValue(sb3, "StringBuilder().apply(builderAction).toString()");
        return sb3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private ImageRequest(WeakReference<ImageView> weakReference, String str, Drawable drawable, Drawable drawable2, boolean z4, List<? extends Transformation> list) {
        this.imageViewRef = weakReference;
        this.url = str;
        this.placeholder = drawable;
        this.error = drawable2;
        this.crossfade = z4;
        this.transformations = list;
    }
}
