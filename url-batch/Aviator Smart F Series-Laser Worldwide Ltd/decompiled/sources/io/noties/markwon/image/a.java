package io.noties.markwon.image;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import androidx.annotation.IntRange;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/* loaded from: classes4.dex */
public class a extends Drawable {
    private Drawable.Callback callback;
    private int canvasWidth;
    private final String destination;
    private final f imageSize;
    private final g imageSizeResolver;
    private final b loader;
    private final Drawable placeholder;
    private Drawable result;
    private float textSize;
    private boolean waitingForDimensions;
    private boolean wasPlayingBefore = false;

    /* renamed from: io.noties.markwon.image.a$a, reason: collision with other inner class name */
    private class C0355a implements Drawable.Callback {
        private final Drawable.Callback callback;

        C0355a(@NonNull Drawable.Callback callback) {
            this.callback = callback;
        }

        @Override // android.graphics.drawable.Drawable.Callback
        public void invalidateDrawable(@NonNull Drawable drawable) {
            this.callback.invalidateDrawable(a.this);
        }

        @Override // android.graphics.drawable.Drawable.Callback
        public void scheduleDrawable(@NonNull Drawable drawable, @NonNull Runnable runnable, long j8) {
            this.callback.scheduleDrawable(a.this, runnable, j8);
        }

        @Override // android.graphics.drawable.Drawable.Callback
        public void unscheduleDrawable(@NonNull Drawable drawable, @NonNull Runnable runnable) {
            this.callback.unscheduleDrawable(a.this, runnable);
        }
    }

    public a(@NonNull String str, @NonNull b bVar, @NonNull g gVar, @Nullable f fVar) {
        this.destination = str;
        this.loader = bVar;
        this.imageSizeResolver = gVar;
        this.imageSize = fVar;
        Drawable placeholder = bVar.placeholder(this);
        this.placeholder = placeholder;
        if (placeholder != null) {
            setPlaceholderResult(placeholder);
        }
    }

    private void initBounds() {
        if (this.canvasWidth == 0) {
            this.waitingForDimensions = true;
            setBounds(noDimensionsBounds(this.result));
            return;
        }
        this.waitingForDimensions = false;
        Rect resolveBounds = resolveBounds();
        this.result.setBounds(resolveBounds);
        this.result.setCallback(this.callback);
        setBounds(resolveBounds);
        invalidateSelf();
    }

    @NonNull
    private static Rect noDimensionsBounds(@Nullable Drawable drawable) {
        if (drawable != null) {
            Rect bounds = drawable.getBounds();
            if (!bounds.isEmpty()) {
                return bounds;
            }
            Rect intrinsicBounds = d.intrinsicBounds(drawable);
            if (!intrinsicBounds.isEmpty()) {
                return intrinsicBounds;
            }
        }
        return new Rect(0, 0, 1, 1);
    }

    @NonNull
    private Rect resolveBounds() {
        return this.imageSizeResolver.resolveImageSize(this);
    }

    public void clearResult() {
        Drawable drawable = this.result;
        if (drawable != null) {
            drawable.setCallback(null);
            this.result = null;
            setBounds(0, 0, 0, 0);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(@NonNull Canvas canvas) {
        if (hasResult()) {
            this.result.draw(canvas);
        }
    }

    @NonNull
    public String getDestination() {
        return this.destination;
    }

    @Nullable
    public f getImageSize() {
        return this.imageSize;
    }

    @NonNull
    public g getImageSizeResolver() {
        return this.imageSizeResolver;
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        if (hasResult()) {
            return this.result.getIntrinsicHeight();
        }
        return 1;
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        if (hasResult()) {
            return this.result.getIntrinsicWidth();
        }
        return 1;
    }

    public float getLastKnowTextSize() {
        return this.textSize;
    }

    public int getLastKnownCanvasWidth() {
        return this.canvasWidth;
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        if (hasResult()) {
            return this.result.getOpacity();
        }
        return -2;
    }

    public Drawable getResult() {
        return this.result;
    }

    public boolean hasKnownDimensions() {
        return this.canvasWidth > 0;
    }

    public boolean hasResult() {
        return this.result != null;
    }

    public void initWithKnownDimensions(int i8, float f8) {
        this.canvasWidth = i8;
        this.textSize = f8;
        if (this.waitingForDimensions) {
            initBounds();
        }
    }

    public boolean isAttached() {
        return getCallback() != null;
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(@IntRange(from = 0, to = 255) int i8) {
    }

    public void setCallback2(@Nullable Drawable.Callback callback) {
        this.callback = callback == null ? null : new C0355a(callback);
        super.setCallback(callback);
        if (this.callback == null) {
            Drawable drawable = this.result;
            if (drawable != null) {
                drawable.setCallback(null);
                Object obj = this.result;
                if (obj instanceof Animatable) {
                    Animatable animatable = (Animatable) obj;
                    boolean isRunning = animatable.isRunning();
                    this.wasPlayingBefore = isRunning;
                    if (isRunning) {
                        animatable.stop();
                    }
                }
            }
            this.loader.cancel(this);
            return;
        }
        Drawable drawable2 = this.result;
        if (drawable2 != null && drawable2.getCallback() == null) {
            this.result.setCallback(this.callback);
        }
        Drawable drawable3 = this.result;
        boolean z7 = drawable3 == null || drawable3 == this.placeholder;
        if (drawable3 != null) {
            drawable3.setCallback(this.callback);
            Object obj2 = this.result;
            if ((obj2 instanceof Animatable) && this.wasPlayingBefore) {
                ((Animatable) obj2).start();
            }
        }
        if (z7) {
            this.loader.load(this);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(@Nullable ColorFilter colorFilter) {
    }

    protected void setPlaceholderResult(@NonNull Drawable drawable) {
        Drawable drawable2 = this.result;
        if (drawable2 != null) {
            drawable2.setCallback(null);
        }
        Rect bounds = drawable.getBounds();
        if (!bounds.isEmpty()) {
            this.result = drawable;
            drawable.setCallback(this.callback);
            setBounds(bounds);
            this.waitingForDimensions = false;
            return;
        }
        Rect intrinsicBounds = d.intrinsicBounds(drawable);
        if (intrinsicBounds.isEmpty()) {
            drawable.setBounds(0, 0, 1, 1);
        } else {
            drawable.setBounds(intrinsicBounds);
        }
        setBounds(drawable.getBounds());
        setResult(drawable);
    }

    public void setResult(@NonNull Drawable drawable) {
        this.wasPlayingBefore = false;
        Drawable drawable2 = this.result;
        if (drawable2 != null) {
            drawable2.setCallback(null);
        }
        this.result = drawable;
        initBounds();
    }

    @NonNull
    public String toString() {
        return "AsyncDrawable{destination='" + this.destination + "', imageSize=" + this.imageSize + ", result=" + this.result + ", canvasWidth=" + this.canvasWidth + ", textSize=" + this.textSize + ", waitingForDimensions=" + this.waitingForDimensions + '}';
    }
}
