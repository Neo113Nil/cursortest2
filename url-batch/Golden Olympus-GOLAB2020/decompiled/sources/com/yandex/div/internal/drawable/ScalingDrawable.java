package com.yandex.div.internal.drawable;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Picture;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.g;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata
/* loaded from: classes2.dex */
public final class ScalingDrawable extends Drawable {
    private boolean isDirtyRect;

    @Nullable
    private Bitmap originalBitmap;

    @Nullable
    private Picture originalPicture;
    private float xTranslate;
    private float yTranslate;

    @NotNull
    private ScaleType customScaleType = ScaleType.NO_SCALE;

    @NotNull
    private AlignmentHorizontal alignmentHorizontal = AlignmentHorizontal.LEFT;

    @NotNull
    private AlignmentVertical alignmentVertical = AlignmentVertical.TOP;

    @NotNull
    private final Paint paint = new Paint(3);

    @NotNull
    private Matrix thumbTransformMatrix = new Matrix();
    private float xScale = 1.0f;
    private float yScale = 1.0f;

    @Metadata
    public enum AlignmentHorizontal {
        LEFT,
        CENTER,
        RIGHT
    }

    @Metadata
    public enum AlignmentVertical {
        TOP,
        CENTER,
        BOTTOM
    }

    @Metadata
    public enum ScaleType {
        NO_SCALE,
        FIT,
        FILL,
        STRETCH
    }

    @Metadata
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;
        public static final /* synthetic */ int[] $EnumSwitchMapping$2;

        static {
            int[] iArr = new int[ScaleType.values().length];
            try {
                iArr[ScaleType.FILL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ScaleType.FIT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[ScaleType.NO_SCALE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[AlignmentHorizontal.values().length];
            try {
                iArr2[AlignmentHorizontal.CENTER.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[AlignmentHorizontal.RIGHT.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
            $EnumSwitchMapping$1 = iArr2;
            int[] iArr3 = new int[AlignmentVertical.values().length];
            try {
                iArr3[AlignmentVertical.CENTER.ordinal()] = 1;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr3[AlignmentVertical.BOTTOM.ordinal()] = 2;
            } catch (NoSuchFieldError unused7) {
            }
            $EnumSwitchMapping$2 = iArr3;
        }
    }

    private final void reset() {
        this.isDirtyRect = true;
        invalidateSelf();
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00c2  */
    @Override // android.graphics.drawable.Drawable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void draw(@NotNull Canvas canvas) {
        int width;
        int height;
        float f4;
        float f5;
        float f6;
        int i4;
        float f7;
        float f8;
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        canvas.save();
        Bitmap bitmap = this.originalBitmap;
        if (bitmap != null) {
            width = bitmap.getWidth();
        } else {
            Picture picture = this.originalPicture;
            width = picture != null ? picture.getWidth() : 0;
        }
        Bitmap bitmap2 = this.originalBitmap;
        if (bitmap2 != null) {
            height = bitmap2.getHeight();
        } else {
            Picture picture2 = this.originalPicture;
            height = picture2 != null ? picture2.getHeight() : 0;
        }
        if (height <= 0 || width <= 0) {
            Bitmap bitmap3 = this.originalBitmap;
            if (bitmap3 != null) {
                canvas.drawBitmap(bitmap3, this.thumbTransformMatrix, this.paint);
            }
            Picture picture3 = this.originalPicture;
            if (picture3 != null) {
                canvas.drawPicture(picture3);
            }
            canvas.restore();
            return;
        }
        if (this.isDirtyRect) {
            float width2 = getBounds().width();
            float height2 = getBounds().height();
            float f9 = width;
            this.xScale = width2 / f9;
            float f10 = height;
            this.yScale = height2 / f10;
            int i5 = WhenMappings.$EnumSwitchMapping$0[this.customScaleType.ordinal()];
            if (i5 == 1) {
                float c4 = g.c(this.xScale, this.yScale);
                this.xScale = c4;
                this.yScale = c4;
            } else if (i5 == 2) {
                float f11 = g.f(this.xScale, this.yScale);
                this.xScale = f11;
                this.yScale = f11;
            } else if (i5 == 3) {
                this.xScale = 1.0f;
                this.yScale = 1.0f;
            }
            float f12 = f9 * this.xScale;
            float f13 = f10 * this.yScale;
            int i6 = WhenMappings.$EnumSwitchMapping$1[this.alignmentHorizontal.ordinal()];
            float f14 = 0.0f;
            if (i6 == 1) {
                f4 = (width2 - f12) / 2;
                f5 = this.xScale;
            } else if (i6 != 2) {
                f6 = 0.0f;
                this.xTranslate = f6;
                i4 = WhenMappings.$EnumSwitchMapping$2[this.alignmentVertical.ordinal()];
                if (i4 == 1) {
                    if (i4 == 2) {
                        f7 = height2 - f13;
                        f8 = this.yScale;
                    }
                    this.yTranslate = f14;
                    this.isDirtyRect = false;
                } else {
                    f7 = (height2 - f13) / 2;
                    f8 = this.yScale;
                }
                f14 = f7 / f8;
                this.yTranslate = f14;
                this.isDirtyRect = false;
            } else {
                f4 = width2 - f12;
                f5 = this.xScale;
            }
            f6 = f4 / f5;
            this.xTranslate = f6;
            i4 = WhenMappings.$EnumSwitchMapping$2[this.alignmentVertical.ordinal()];
            if (i4 == 1) {
            }
            f14 = f7 / f8;
            this.yTranslate = f14;
            this.isDirtyRect = false;
        }
        canvas.scale(this.xScale, this.yScale);
        canvas.translate(this.xTranslate, this.yTranslate);
        Bitmap bitmap4 = this.originalBitmap;
        if (bitmap4 != null) {
            canvas.drawBitmap(bitmap4, this.thumbTransformMatrix, this.paint);
        }
        Picture picture4 = this.originalPicture;
        if (picture4 != null) {
            canvas.drawPicture(picture4);
        }
        canvas.restore();
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return this.paint.getAlpha();
    }

    @Override // android.graphics.drawable.Drawable
    protected void onBoundsChange(@NotNull Rect bounds) {
        Intrinsics.checkNotNullParameter(bounds, "bounds");
        super.onBoundsChange(bounds);
        reset();
    }

    public final void setAlignmentHorizontal(@NotNull AlignmentHorizontal alignmentHorizontal) {
        Intrinsics.checkNotNullParameter(alignmentHorizontal, "<set-?>");
        this.alignmentHorizontal = alignmentHorizontal;
    }

    public final void setAlignmentVertical(@NotNull AlignmentVertical alignmentVertical) {
        Intrinsics.checkNotNullParameter(alignmentVertical, "<set-?>");
        this.alignmentVertical = alignmentVertical;
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i4) {
        this.paint.setAlpha(i4);
        invalidateSelf();
    }

    public final void setBitmap(@NotNull Bitmap bitmap) {
        Intrinsics.checkNotNullParameter(bitmap, "bitmap");
        this.originalBitmap = bitmap;
        this.originalPicture = null;
        reset();
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(@Nullable ColorFilter colorFilter) {
    }

    public final void setCustomScaleType(@NotNull ScaleType scaleType) {
        Intrinsics.checkNotNullParameter(scaleType, "<set-?>");
        this.customScaleType = scaleType;
    }

    public final void setPicture(@NotNull Picture picture) {
        Intrinsics.checkNotNullParameter(picture, "picture");
        this.originalPicture = picture;
        this.originalBitmap = null;
        reset();
    }
}
