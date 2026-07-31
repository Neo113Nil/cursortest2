package com.yandex.div.core.widget;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.view.View;
import com.yandex.div.R$id;
import com.yandex.div.core.images.LoadReference;
import com.yandex.div.core.view2.Releasable;
import com.yandex.div.core.view2.divs.widgets.LoadableImage;
import com.yandex.div.core.view2.drawable.ScaleDrawable;
import com.yandex.div.internal.widget.AspectImageView;
import java.util.concurrent.Future;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import y1.n;

@Metadata
/* loaded from: classes2.dex */
public abstract class LoadableImageView extends AspectImageView implements LoadableImage, Releasable {

    @NotNull
    private ImageTransformer _imageTransformer;

    @Nullable
    private Bitmap currentBitmapWithoutFilters;

    @Nullable
    private Drawable externalImage;

    @Nullable
    private Function0<Unit> imageChangeCallback;

    @Nullable
    private LoadReference loadReference;

    @Nullable
    private Drawable sourceDrawable;

    @Metadata
    public interface ImageTransformer {

        @Metadata
        public static final class NOP implements ImageTransformer {

            @NotNull
            public static final NOP INSTANCE = new NOP();

            private NOP() {
            }

            @Override // com.yandex.div.core.widget.LoadableImageView.ImageTransformer
            @Nullable
            public Drawable transform(@Nullable Drawable drawable) {
                return drawable;
            }
        }

        @Nullable
        Drawable transform(@Nullable Drawable drawable);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LoadableImageView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i4) {
        super(context, attributeSet, i4);
        Intrinsics.checkNotNullParameter(context, "context");
        this._imageTransformer = ImageTransformer.NOP.INSTANCE;
    }

    public static /* synthetic */ void getCurrentBitmapWithoutFilters$div_release$annotations() {
    }

    public static /* synthetic */ void getExternalImage$annotations() {
    }

    private final Drawable scaleAccordingToDensity(Drawable drawable) {
        if (shouldScaleAccordingToDensity()) {
            if (drawable instanceof BitmapDrawable) {
                BitmapDrawable bitmapDrawable = (BitmapDrawable) drawable;
                Bitmap bitmap = bitmapDrawable.getBitmap();
                if (bitmap != null) {
                    bitmap.setDensity(160);
                }
                bitmapDrawable.setTargetDensity(getContext().getResources().getDisplayMetrics());
                return drawable;
            }
            if (Build.VERSION.SDK_INT >= 28 && n.a(drawable)) {
                return new ScaleDrawable(drawable, getContext().getResources().getDisplayMetrics().density);
            }
        }
        return drawable;
    }

    private final boolean shouldScaleAccordingToDensity() {
        return (wrapsSize(getLayoutParams().width) && wrapsSize(getLayoutParams().height)) || getImageScale() == AspectImageView.Scale.NO_SCALE;
    }

    private final boolean wrapsSize(int i4) {
        return i4 == -3 || i4 == -2;
    }

    @Override // android.view.View
    public void buildDrawingCache(boolean z4) {
        getDelegate();
        super.buildDrawingCache(z4);
    }

    @Override // com.yandex.div.core.view2.divs.widgets.LoadableImage
    public void cleanLoadingTask() {
        setTag(R$id.bitmap_load_references_tag, null);
    }

    @Nullable
    public final Bitmap getCurrentBitmapWithoutFilters$div_release() {
        return this.currentBitmapWithoutFilters;
    }

    @Nullable
    public DivViewDelegate getDelegate() {
        return null;
    }

    @Nullable
    public final Drawable getExternalImage() {
        return this.externalImage;
    }

    @Nullable
    public final ImageTransformer getImageTransformer() {
        return this._imageTransformer;
    }

    @Nullable
    public final LoadReference getLoadReference$div_release() {
        return this.loadReference;
    }

    @Override // com.yandex.div.core.view2.divs.widgets.LoadableImage
    @Nullable
    public Future<?> getLoadingTask() {
        Object tag = getTag(R$id.bitmap_load_references_tag);
        if (tag instanceof Future) {
            return (Future) tag;
        }
        return null;
    }

    public void imageLoaded() {
        setTag(R$id.image_loaded_flag, Boolean.TRUE);
    }

    @Override // android.widget.ImageView, android.view.View, android.graphics.drawable.Drawable.Callback
    public void invalidateDrawable(@NotNull Drawable dr) {
        Intrinsics.checkNotNullParameter(dr, "dr");
        getDelegate();
        super.invalidateDrawable(dr);
    }

    public boolean isImageLoaded() {
        return Intrinsics.areEqual(getTag(R$id.image_loaded_flag), Boolean.TRUE);
    }

    public boolean isImagePreview() {
        return Intrinsics.areEqual(getTag(R$id.image_loaded_flag), Boolean.FALSE);
    }

    @Override // android.widget.ImageView, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        getDelegate();
    }

    @Override // android.widget.ImageView, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        getDelegate();
    }

    @Override // android.view.View
    protected void onVisibilityChanged(@NotNull View changedView, int i4) {
        Intrinsics.checkNotNullParameter(changedView, "changedView");
        getDelegate();
    }

    public void previewLoaded() {
        setTag(R$id.image_loaded_flag, Boolean.FALSE);
    }

    public void release() {
        this.currentBitmapWithoutFilters = null;
        setExternalImage(null);
        this.sourceDrawable = null;
        resetImageLoaded();
        Future<?> loadingTask = getLoadingTask();
        if (loadingTask != null) {
            loadingTask.cancel(true);
        }
        cleanLoadingTask();
    }

    public void resetImageLoaded() {
        setTag(R$id.image_loaded_flag, null);
    }

    @Override // com.yandex.div.core.view2.divs.widgets.LoadableImage
    public void saveLoadingTask(@NotNull Future<?> task) {
        Intrinsics.checkNotNullParameter(task, "task");
        setTag(R$id.bitmap_load_references_tag, task);
    }

    public final void setCurrentBitmapWithoutFilters$div_release(@Nullable Bitmap bitmap) {
        this.currentBitmapWithoutFilters = bitmap;
    }

    public void setDelegate(@Nullable DivViewDelegate divViewDelegate) {
    }

    public final void setExternalImage(@Nullable Drawable drawable) {
        this.externalImage = drawable != null ? scaleAccordingToDensity(drawable) : null;
        invalidate();
    }

    public void setImage(@Nullable Bitmap bitmap) {
        setImageBitmap(bitmap);
    }

    @Override // androidx.appcompat.widget.AppCompatImageView, android.widget.ImageView
    public void setImageBitmap(@Nullable Bitmap bitmap) {
        if (shouldScaleAccordingToDensity() && bitmap != null) {
            bitmap.setDensity(160);
        }
        setImageDrawable(new BitmapDrawable(getContext().getResources(), bitmap));
    }

    public final void setImageChangeCallback(@Nullable Function0<Unit> function0) {
        this.imageChangeCallback = function0;
    }

    @Override // androidx.appcompat.widget.AppCompatImageView, android.widget.ImageView
    public void setImageDrawable(@Nullable Drawable drawable) {
        this.sourceDrawable = drawable;
        if (this.externalImage == null) {
            Drawable transform = this._imageTransformer.transform(drawable);
            super.setImageDrawable(transform != null ? scaleAccordingToDensity(transform) : null);
            Function0<Unit> function0 = this.imageChangeCallback;
            if (function0 != null) {
                function0.invoke();
                return;
            }
            return;
        }
        Drawable drawable2 = getDrawable();
        Drawable drawable3 = this.externalImage;
        if (drawable2 != drawable3) {
            super.setImageDrawable(drawable3);
        }
        Function0<Unit> function02 = this.imageChangeCallback;
        if (function02 != null) {
            function02.invoke();
        }
    }

    public final void setImageTransformer(@Nullable ImageTransformer imageTransformer) {
        if (imageTransformer == null) {
            imageTransformer = ImageTransformer.NOP.INSTANCE;
        }
        this._imageTransformer = imageTransformer;
        Drawable drawable = this.sourceDrawable;
        if (drawable != null) {
            setImageDrawable(drawable);
        }
    }

    public final void setLoadReference$div_release(@Nullable LoadReference loadReference) {
        this.loadReference = loadReference;
    }

    public void setPlaceholder(@Nullable Drawable drawable) {
        setImageDrawable(drawable);
    }

    public void setPreview(@Nullable Drawable drawable) {
        setImageDrawable(drawable);
    }

    @Override // android.view.View
    public void unscheduleDrawable(@Nullable Drawable drawable) {
        getDelegate();
        super.unscheduleDrawable(drawable);
    }

    public void setImage(@Nullable Drawable drawable) {
        setImageDrawable(drawable);
        Object drawable2 = getDrawable();
        if ((drawable2 instanceof Animatable) && this.externalImage == null) {
            ((Animatable) drawable2).start();
        }
    }

    public void setPreview(@Nullable Bitmap bitmap) {
        setImageBitmap(bitmap);
    }
}
