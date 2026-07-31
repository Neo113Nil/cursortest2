package com.facebook.react.uimanager.drawable;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import com.facebook.react.uimanager.FloatUtil;
import com.facebook.react.uimanager.LengthPercentage;
import com.facebook.react.uimanager.LengthPercentageType;
import com.facebook.react.uimanager.PixelUtil;
import com.facebook.react.uimanager.ViewProps;
import com.facebook.react.uimanager.style.BackgroundImageLayer;
import com.facebook.react.uimanager.style.BackgroundPosition;
import com.facebook.react.uimanager.style.BackgroundRepeat;
import com.facebook.react.uimanager.style.BackgroundRepeatKeyword;
import com.facebook.react.uimanager.style.BackgroundSize;
import com.facebook.react.uimanager.style.BorderInsets;
import com.facebook.react.uimanager.style.BorderRadiusStyle;
import com.facebook.react.uimanager.style.ComputedBorderRadius;
import com.facebook.react.uimanager.style.CornerRadii;
import java.util.List;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: BackgroundImageDrawable.kt */
@Metadata(d1 = {"\u0000\u009a\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\b\u0000\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\b\u0010\tJ\b\u0010/\u001a\u000200H\u0016J\u0010\u00101\u001a\u0002002\u0006\u00102\u001a\u000203H\u0014J\u0010\u00104\u001a\u0002002\u0006\u00105\u001a\u000206H\u0016J\u0012\u00107\u001a\u0002002\b\u00108\u001a\u0004\u0018\u000109H\u0016J\b\u0010:\u001a\u000206H\u0017J\u0010\u0010;\u001a\u0002002\u0006\u0010<\u001a\u00020=H\u0016J\b\u0010>\u001a\u00020\u0017H\u0002J\u0018\u0010?\u001a\u00020\u00132\u0006\u0010@\u001a\u00020\u00172\u0006\u0010A\u001a\u00020\u0017H\u0002J\b\u0010B\u001a\u000200H\u0002J\u0018\u0010C\u001a\u00020D2\u0006\u0010E\u001a\u00020F2\u0006\u0010G\u001a\u00020DH\u0002JH\u0010H\u001a\u000e\u0012\u0004\u0012\u00020D\u0012\u0004\u0012\u00020D0I2\u0006\u0010J\u001a\u00020D2\u0006\u0010K\u001a\u00020D2\u0006\u0010L\u001a\u00020D2\u0006\u0010M\u001a\u00020D2\b\u0010\"\u001a\u0004\u0018\u00010!2\b\u0010N\u001a\u0004\u0018\u00010)H\u0002J.\u0010O\u001a\u000e\u0012\u0004\u0012\u00020D\u0012\u0004\u0012\u00020D0I2\u0006\u0010P\u001a\u00020D2\u0006\u0010Q\u001a\u00020D2\b\u0010R\u001a\u0004\u0018\u00010%H\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u000e\u0010\u0012\u001a\u00020\u0013X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0014\u001a\u0004\u0018\u00010\u0015X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0016\u001a\u0004\u0018\u00010\u0017X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0018\u001a\u0004\u0018\u00010\u0017X\u0082\u000e¢\u0006\u0002\n\u0000R4\u0010\u001c\u001a\n\u0012\u0004\u0012\u00020\u001b\u0018\u00010\u001a2\u000e\u0010\u0019\u001a\n\u0012\u0004\u0012\u00020\u001b\u0018\u00010\u001a@FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 R4\u0010\"\u001a\n\u0012\u0004\u0012\u00020!\u0018\u00010\u001a2\u000e\u0010\u0019\u001a\n\u0012\u0004\u0012\u00020!\u0018\u00010\u001a@FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b#\u0010\u001e\"\u0004\b$\u0010 R4\u0010&\u001a\n\u0012\u0004\u0012\u00020%\u0018\u00010\u001a2\u000e\u0010\u0019\u001a\n\u0012\u0004\u0012\u00020%\u0018\u00010\u001a@FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b'\u0010\u001e\"\u0004\b(\u0010 R4\u0010*\u001a\n\u0012\u0004\u0012\u00020)\u0018\u00010\u001a2\u000e\u0010\u0019\u001a\n\u0012\u0004\u0012\u00020)\u0018\u00010\u001a@FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b+\u0010\u001e\"\u0004\b,\u0010 R\u000e\u0010-\u001a\u00020.X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006S"}, d2 = {"Lcom/facebook/react/uimanager/drawable/BackgroundImageDrawable;", "Landroid/graphics/drawable/Drawable;", "context", "Landroid/content/Context;", ViewProps.BORDER_RADIUS, "Lcom/facebook/react/uimanager/style/BorderRadiusStyle;", "borderInsets", "Lcom/facebook/react/uimanager/style/BorderInsets;", "<init>", "(Landroid/content/Context;Lcom/facebook/react/uimanager/style/BorderRadiusStyle;Lcom/facebook/react/uimanager/style/BorderInsets;)V", "getBorderRadius", "()Lcom/facebook/react/uimanager/style/BorderRadiusStyle;", "setBorderRadius", "(Lcom/facebook/react/uimanager/style/BorderRadiusStyle;)V", "getBorderInsets", "()Lcom/facebook/react/uimanager/style/BorderInsets;", "setBorderInsets", "(Lcom/facebook/react/uimanager/style/BorderInsets;)V", "needUpdatePath", "", "backgroundImageClipPath", "Landroid/graphics/Path;", "backgroundPositioningArea", "Landroid/graphics/RectF;", "backgroundPaintingArea", "value", "", "Lcom/facebook/react/uimanager/style/BackgroundImageLayer;", "backgroundImageLayers", "getBackgroundImageLayers", "()Ljava/util/List;", "setBackgroundImageLayers", "(Ljava/util/List;)V", "Lcom/facebook/react/uimanager/style/BackgroundSize;", "backgroundSize", "getBackgroundSize", "setBackgroundSize", "Lcom/facebook/react/uimanager/style/BackgroundPosition;", "backgroundPosition", "getBackgroundPosition", "setBackgroundPosition", "Lcom/facebook/react/uimanager/style/BackgroundRepeat;", "backgroundRepeat", "getBackgroundRepeat", "setBackgroundRepeat", "backgroundPaint", "Landroid/graphics/Paint;", "invalidateSelf", "", "onBoundsChange", "bounds", "Landroid/graphics/Rect;", "setAlpha", "alpha", "", "setColorFilter", "colorFilter", "Landroid/graphics/ColorFilter;", "getOpacity", "draw", "canvas", "Landroid/graphics/Canvas;", "computeBorderInsets", "hasInvalidDimensions", "positioningArea", "paintingArea", "updatePath", "positionToPixels", "", "lengthPercentage", "Lcom/facebook/react/uimanager/LengthPercentage;", "availableSpace", "calculateBackgroundImageSize", "Lkotlin/Pair;", "containerWidth", "containerHeight", "imageWidth", "imageHeight", "repeat", "calculateBackgroundPosition", "tileWidth", "tileHeight", ViewProps.POSITION, "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class BackgroundImageDrawable extends Drawable {
    private Path backgroundImageClipPath;
    private List<BackgroundImageLayer> backgroundImageLayers;
    private final Paint backgroundPaint;
    private RectF backgroundPaintingArea;
    private List<BackgroundPosition> backgroundPosition;
    private RectF backgroundPositioningArea;
    private List<BackgroundRepeat> backgroundRepeat;
    private List<? extends BackgroundSize> backgroundSize;
    private BorderInsets borderInsets;
    private BorderRadiusStyle borderRadius;
    private final Context context;
    private boolean needUpdatePath;

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
    }

    public /* synthetic */ BackgroundImageDrawable(Context context, BorderRadiusStyle borderRadiusStyle, BorderInsets borderInsets, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i & 2) != 0 ? null : borderRadiusStyle, (i & 4) != 0 ? null : borderInsets);
    }

    public final BorderRadiusStyle getBorderRadius() {
        return this.borderRadius;
    }

    public final void setBorderRadius(BorderRadiusStyle borderRadiusStyle) {
        this.borderRadius = borderRadiusStyle;
    }

    public final BorderInsets getBorderInsets() {
        return this.borderInsets;
    }

    public final void setBorderInsets(BorderInsets borderInsets) {
        this.borderInsets = borderInsets;
    }

    public BackgroundImageDrawable(Context context, BorderRadiusStyle borderRadiusStyle, BorderInsets borderInsets) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.context = context;
        this.borderRadius = borderRadiusStyle;
        this.borderInsets = borderInsets;
        this.needUpdatePath = true;
        Paint paint = new Paint(1);
        paint.setStyle(Paint.Style.FILL);
        this.backgroundPaint = paint;
    }

    public final List<BackgroundImageLayer> getBackgroundImageLayers() {
        return this.backgroundImageLayers;
    }

    public final void setBackgroundImageLayers(List<BackgroundImageLayer> list) {
        if (Intrinsics.areEqual(this.backgroundImageLayers, list)) {
            return;
        }
        this.backgroundImageLayers = list;
        invalidateSelf();
    }

    public final List<BackgroundSize> getBackgroundSize() {
        return this.backgroundSize;
    }

    public final void setBackgroundSize(List<? extends BackgroundSize> list) {
        if (Intrinsics.areEqual(this.backgroundSize, list)) {
            return;
        }
        this.backgroundSize = list;
        invalidateSelf();
    }

    public final List<BackgroundPosition> getBackgroundPosition() {
        return this.backgroundPosition;
    }

    public final void setBackgroundPosition(List<BackgroundPosition> list) {
        if (Intrinsics.areEqual(this.backgroundPosition, list)) {
            return;
        }
        this.backgroundPosition = list;
        invalidateSelf();
    }

    public final List<BackgroundRepeat> getBackgroundRepeat() {
        return this.backgroundRepeat;
    }

    public final void setBackgroundRepeat(List<BackgroundRepeat> list) {
        if (Intrinsics.areEqual(this.backgroundRepeat, list)) {
            return;
        }
        this.backgroundRepeat = list;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void invalidateSelf() {
        this.needUpdatePath = true;
        super.invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    protected void onBoundsChange(Rect bounds) {
        Intrinsics.checkNotNullParameter(bounds, "bounds");
        super.onBoundsChange(bounds);
        this.needUpdatePath = true;
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int alpha) {
        this.backgroundPaint.setAlpha(alpha);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    @Deprecated(message = "Deprecated in Java")
    public int getOpacity() {
        int alpha = this.backgroundPaint.getAlpha();
        if (alpha == 255) {
            return -1;
        }
        return (1 > alpha || alpha >= 255) ? -2 : -3;
    }

    /* JADX WARN: Removed duplicated region for block: B:49:0x017e  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x018a  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0220  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x01c9  */
    @Override // android.graphics.drawable.Drawable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void draw(Canvas canvas) {
        RectF rectF;
        int size;
        int i;
        RectF rectF2;
        RectF rectF3;
        BackgroundRepeatKeyword backgroundRepeatKeyword;
        float f;
        float f2;
        int i2;
        int i3;
        float f3;
        BackgroundRepeatKeyword backgroundRepeatKeyword2;
        float f4;
        float f5;
        int i4;
        int i5;
        float f6;
        int i6;
        BackgroundImageDrawable backgroundImageDrawable = this;
        Canvas canvas2 = canvas;
        Intrinsics.checkNotNullParameter(canvas2, "canvas");
        List<BackgroundImageLayer> list = backgroundImageDrawable.backgroundImageLayers;
        if (list != null) {
            int i7 = 1;
            if (list != null && list.isEmpty()) {
                return;
            }
            backgroundImageDrawable.updatePath();
            RectF rectF4 = backgroundImageDrawable.backgroundPaintingArea;
            if (rectF4 != null && (rectF = backgroundImageDrawable.backgroundPositioningArea) != null && !backgroundImageDrawable.hasInvalidDimensions(rectF, rectF4)) {
                canvas2.save();
                Path path = backgroundImageDrawable.backgroundImageClipPath;
                if (path != null) {
                    canvas2.clipPath(path);
                }
                List<BackgroundImageLayer> list2 = backgroundImageDrawable.backgroundImageLayers;
                if (list2 != null && list2.size() - 1 >= 0) {
                    while (true) {
                        int i8 = size - 1;
                        BackgroundImageLayer backgroundImageLayer = list2.get(size);
                        List<? extends BackgroundSize> list3 = backgroundImageDrawable.backgroundSize;
                        BackgroundSize backgroundSize = list3 != null ? (BackgroundSize) CollectionsKt.getOrNull(list3, size % list3.size()) : null;
                        List<BackgroundRepeat> list4 = backgroundImageDrawable.backgroundRepeat;
                        BackgroundRepeat backgroundRepeat = list4 != null ? (BackgroundRepeat) CollectionsKt.getOrNull(list4, size % list4.size()) : null;
                        List<BackgroundPosition> list5 = backgroundImageDrawable.backgroundPosition;
                        BackgroundPosition backgroundPosition = list5 != null ? (BackgroundPosition) CollectionsKt.getOrNull(list5, size % list5.size()) : null;
                        Pair<Float, Float> calculateBackgroundImageSize = backgroundImageDrawable.calculateBackgroundImageSize(rectF.width(), rectF.height(), rectF.width(), rectF.height(), backgroundSize, backgroundRepeat);
                        BackgroundRepeat backgroundRepeat2 = backgroundRepeat;
                        BackgroundImageDrawable backgroundImageDrawable2 = backgroundImageDrawable;
                        float floatValue = calculateBackgroundImageSize.component1().floatValue();
                        float floatValue2 = calculateBackgroundImageSize.component2().floatValue();
                        if (floatValue <= 0.0f || floatValue2 <= 0.0f) {
                            i = i7;
                            rectF2 = rectF4;
                            rectF3 = rectF;
                        } else {
                            backgroundImageDrawable2.backgroundPaint.setShader(backgroundImageLayer.getShader(floatValue, floatValue2));
                            Pair<Float, Float> calculateBackgroundPosition = backgroundImageDrawable2.calculateBackgroundPosition(floatValue, floatValue2, backgroundPosition);
                            float floatValue3 = calculateBackgroundPosition.component1().floatValue();
                            float floatValue4 = calculateBackgroundPosition.component2().floatValue();
                            if (backgroundRepeat2 == null || (backgroundRepeatKeyword = backgroundRepeat2.getX()) == null) {
                                backgroundRepeatKeyword = BackgroundRepeatKeyword.Repeat;
                            }
                            if (backgroundRepeatKeyword == BackgroundRepeatKeyword.Space) {
                                float width = rectF4.width() - (2 * floatValue);
                                i = i7;
                                RectF rectF5 = rectF4;
                                if (((float) Math.rint(floatValue)) > 0.0f && (width > 0.0f || FloatUtil.floatsEqual(width, 0.0f))) {
                                    f2 = 0.0f;
                                    f = floatValue4;
                                    int floor = (int) Math.floor(((float) Math.rint(width)) / r8);
                                    rectF2 = rectF5;
                                    floatValue3 = rectF2.left;
                                    f3 = (width - (floor * floatValue)) / (floor + 1);
                                    i3 = floor + 2;
                                    if (backgroundRepeat2 != null) {
                                    }
                                    backgroundRepeatKeyword2 = BackgroundRepeatKeyword.Repeat;
                                    if (backgroundRepeatKeyword2 != BackgroundRepeatKeyword.Space) {
                                    }
                                    f4 = floatValue;
                                    i5 = i;
                                    f6 = 0.0f;
                                    float f7 = floatValue3;
                                    i6 = 0;
                                    while (i6 < i3) {
                                    }
                                } else {
                                    f2 = 0.0f;
                                    f = floatValue4;
                                    rectF2 = rectF5;
                                    f3 = f2;
                                    i3 = i;
                                    if (backgroundRepeat2 != null || (backgroundRepeatKeyword2 = backgroundRepeat2.getY()) == null) {
                                        backgroundRepeatKeyword2 = BackgroundRepeatKeyword.Repeat;
                                    }
                                    if (backgroundRepeatKeyword2 != BackgroundRepeatKeyword.Space) {
                                        float height = rectF2.height() - (2 * floatValue2);
                                        float f8 = f2;
                                        rectF3 = rectF;
                                        if (((float) Math.rint(floatValue2)) > f8 && (height > f8 || FloatUtil.floatsEqual(height, f8))) {
                                            int floor2 = (int) Math.floor(((float) Math.rint(height)) / r0);
                                            f6 = (height - (floor2 * floatValue2)) / (floor2 + 1);
                                            f = rectF2.top;
                                            i5 = floor2 + 2;
                                            f4 = floatValue;
                                            float f72 = floatValue3;
                                            i6 = 0;
                                            while (i6 < i3) {
                                                float f9 = f;
                                                int i9 = 0;
                                                while (i9 < i5) {
                                                    canvas2.save();
                                                    canvas2.translate(f72, f9);
                                                    float f10 = f4;
                                                    canvas2.drawRect(0.0f, 0.0f, f10, floatValue2, backgroundImageDrawable2.backgroundPaint);
                                                    canvas.restore();
                                                    i9++;
                                                    f9 = floatValue2 + f6 + f9;
                                                    f72 = f72;
                                                    f4 = f10;
                                                    canvas2 = canvas;
                                                    i6 = i6;
                                                }
                                                float f11 = f4;
                                                f72 += f11 + f3;
                                                i6++;
                                                canvas2 = canvas;
                                                f4 = f11;
                                            }
                                        }
                                    } else {
                                        rectF3 = rectF;
                                        if (backgroundRepeatKeyword2 == BackgroundRepeatKeyword.Round || backgroundRepeatKeyword2 == BackgroundRepeatKeyword.Repeat) {
                                            if (((float) Math.rint(floatValue2)) > 0.0f) {
                                                int ceil = (int) Math.ceil(((float) Math.rint(r1)) / r0);
                                                f4 = floatValue;
                                                int ceil2 = ((int) Math.ceil(((float) Math.rint(rectF2.height() - r1)) / r0)) + ceil;
                                                f5 = f - (ceil * floatValue2);
                                                i4 = ceil2;
                                            } else {
                                                f4 = floatValue;
                                                f5 = f;
                                                i4 = i;
                                            }
                                            f = f5;
                                            i5 = i4;
                                            f6 = 0.0f;
                                            float f722 = floatValue3;
                                            i6 = 0;
                                            while (i6 < i3) {
                                            }
                                        }
                                    }
                                    f4 = floatValue;
                                    i5 = i;
                                    f6 = 0.0f;
                                    float f7222 = floatValue3;
                                    i6 = 0;
                                    while (i6 < i3) {
                                    }
                                }
                            } else {
                                f = floatValue4;
                                i = i7;
                                rectF2 = rectF4;
                                f2 = 0.0f;
                                if (backgroundRepeatKeyword == BackgroundRepeatKeyword.Round || backgroundRepeatKeyword == BackgroundRepeatKeyword.Repeat) {
                                    if (((float) Math.rint(floatValue)) > 0.0f) {
                                        int ceil3 = (int) Math.ceil(((float) Math.rint(floatValue3)) / r0);
                                        int ceil4 = ((int) Math.ceil(((float) Math.rint(rectF2.width() - floatValue3)) / r0)) + ceil3;
                                        floatValue3 -= ceil3 * floatValue;
                                        i2 = ceil4;
                                    } else {
                                        i2 = i;
                                    }
                                    i3 = i2;
                                    f3 = 0.0f;
                                    if (backgroundRepeat2 != null) {
                                    }
                                    backgroundRepeatKeyword2 = BackgroundRepeatKeyword.Repeat;
                                    if (backgroundRepeatKeyword2 != BackgroundRepeatKeyword.Space) {
                                    }
                                    f4 = floatValue;
                                    i5 = i;
                                    f6 = 0.0f;
                                    float f72222 = floatValue3;
                                    i6 = 0;
                                    while (i6 < i3) {
                                    }
                                }
                                f3 = f2;
                                i3 = i;
                                if (backgroundRepeat2 != null) {
                                }
                                backgroundRepeatKeyword2 = BackgroundRepeatKeyword.Repeat;
                                if (backgroundRepeatKeyword2 != BackgroundRepeatKeyword.Space) {
                                }
                                f4 = floatValue;
                                i5 = i;
                                f6 = 0.0f;
                                float f722222 = floatValue3;
                                i6 = 0;
                                while (i6 < i3) {
                                }
                            }
                        }
                        if (i8 < 0) {
                            break;
                        }
                        canvas2 = canvas;
                        backgroundImageDrawable = backgroundImageDrawable2;
                        rectF4 = rectF2;
                        size = i8;
                        rectF = rectF3;
                        i7 = i;
                    }
                }
                canvas.restore();
            }
        }
    }

    private final RectF computeBorderInsets() {
        BorderInsets borderInsets = this.borderInsets;
        RectF resolve = borderInsets != null ? borderInsets.resolve(getLayoutDirection(), this.context) : null;
        return new RectF(resolve != null ? PixelUtil.INSTANCE.dpToPx(resolve.left) : 0.0f, resolve != null ? PixelUtil.INSTANCE.dpToPx(resolve.top) : 0.0f, resolve != null ? PixelUtil.INSTANCE.dpToPx(resolve.right) : 0.0f, resolve != null ? PixelUtil.INSTANCE.dpToPx(resolve.bottom) : 0.0f);
    }

    private final boolean hasInvalidDimensions(RectF positioningArea, RectF paintingArea) {
        return FloatUtil.floatsEqual(positioningArea.width(), 0.0f) || positioningArea.width() < 0.0f || FloatUtil.floatsEqual(positioningArea.height(), 0.0f) || positioningArea.height() < 0.0f || FloatUtil.floatsEqual(paintingArea.width(), 0.0f) || paintingArea.width() < 0.0f || FloatUtil.floatsEqual(paintingArea.height(), 0.0f) || paintingArea.height() < 0.0f;
    }

    private final void updatePath() {
        CornerRadii bottomLeft;
        CornerRadii bottomLeft2;
        CornerRadii bottomRight;
        CornerRadii bottomRight2;
        CornerRadii topRight;
        CornerRadii topRight2;
        CornerRadii topLeft;
        CornerRadii topLeft2;
        if (this.needUpdatePath) {
            this.needUpdatePath = false;
            RectF computeBorderInsets = computeBorderInsets();
            this.backgroundPositioningArea = new RectF(getBounds().left + computeBorderInsets.left, getBounds().top + computeBorderInsets.top, getBounds().right - computeBorderInsets.right, getBounds().bottom - computeBorderInsets.bottom);
            this.backgroundPaintingArea = new RectF(getBounds());
            BorderRadiusStyle borderRadiusStyle = this.borderRadius;
            ComputedBorderRadius resolve = borderRadiusStyle != null ? borderRadiusStyle.resolve(getLayoutDirection(), this.context, PixelUtil.INSTANCE.pxToDp(getBounds().width()), PixelUtil.INSTANCE.pxToDp(getBounds().height())) : null;
            BorderRadiusStyle borderRadiusStyle2 = this.borderRadius;
            if (borderRadiusStyle2 != null && borderRadiusStyle2.hasRoundedBorders()) {
                RectF rectF = this.backgroundPaintingArea;
                if (rectF == null) {
                    return;
                }
                Path path = new Path();
                this.backgroundImageClipPath = path;
                float f = 0.0f;
                float dpToPx = (resolve == null || (topLeft2 = resolve.getTopLeft()) == null) ? 0.0f : PixelUtil.INSTANCE.dpToPx(topLeft2.getHorizontal());
                float dpToPx2 = (resolve == null || (topLeft = resolve.getTopLeft()) == null) ? 0.0f : PixelUtil.INSTANCE.dpToPx(topLeft.getVertical());
                float dpToPx3 = (resolve == null || (topRight2 = resolve.getTopRight()) == null) ? 0.0f : PixelUtil.INSTANCE.dpToPx(topRight2.getHorizontal());
                float dpToPx4 = (resolve == null || (topRight = resolve.getTopRight()) == null) ? 0.0f : PixelUtil.INSTANCE.dpToPx(topRight.getVertical());
                float dpToPx5 = (resolve == null || (bottomRight2 = resolve.getBottomRight()) == null) ? 0.0f : PixelUtil.INSTANCE.dpToPx(bottomRight2.getHorizontal());
                float dpToPx6 = (resolve == null || (bottomRight = resolve.getBottomRight()) == null) ? 0.0f : PixelUtil.INSTANCE.dpToPx(bottomRight.getVertical());
                float dpToPx7 = (resolve == null || (bottomLeft2 = resolve.getBottomLeft()) == null) ? 0.0f : PixelUtil.INSTANCE.dpToPx(bottomLeft2.getHorizontal());
                if (resolve != null && (bottomLeft = resolve.getBottomLeft()) != null) {
                    f = PixelUtil.INSTANCE.dpToPx(bottomLeft.getVertical());
                }
                path.addRoundRect(rectF, new float[]{dpToPx, dpToPx2, dpToPx3, dpToPx4, dpToPx5, dpToPx6, dpToPx7, f}, Path.Direction.CW);
                return;
            }
            RectF rectF2 = this.backgroundPaintingArea;
            if (rectF2 == null) {
                return;
            }
            Path path2 = new Path();
            this.backgroundImageClipPath = path2;
            path2.addRect(rectF2, Path.Direction.CW);
        }
    }

    private final float positionToPixels(LengthPercentage lengthPercentage, float availableSpace) {
        if (lengthPercentage.getType() == LengthPercentageType.PERCENT) {
            return lengthPercentage.resolve(availableSpace);
        }
        return PixelUtil.INSTANCE.dpToPx(lengthPercentage.resolve(availableSpace));
    }

    private final Pair<Float, Float> calculateBackgroundImageSize(float containerWidth, float containerHeight, float imageWidth, float imageHeight, BackgroundSize backgroundSize, BackgroundRepeat repeat) {
        if (backgroundSize instanceof BackgroundSize.LengthPercentageAuto) {
            BackgroundSize.LengthPercentageAuto lengthPercentageAuto = (BackgroundSize.LengthPercentageAuto) backgroundSize;
            LengthPercentage x = lengthPercentageAuto.getLengthPercentage().getX();
            LengthPercentage y = lengthPercentageAuto.getLengthPercentage().getY();
            if (x != null && y != null) {
                imageWidth = positionToPixels(x, containerWidth);
                imageHeight = positionToPixels(y, containerHeight);
            }
        }
        if ((repeat != null ? repeat.getX() : null) == BackgroundRepeatKeyword.Round && imageWidth > 0.0f && !FloatUtil.floatsEqual(containerWidth % imageWidth, 0.0f)) {
            float rint = (float) Math.rint(containerWidth / imageWidth);
            if (rint > 0.0f) {
                imageWidth = containerWidth / rint;
            }
        }
        if ((repeat != null ? repeat.getY() : null) == BackgroundRepeatKeyword.Round && imageHeight > 0.0f && !FloatUtil.floatsEqual(containerHeight % imageHeight, 0.0f)) {
            float rint2 = (float) Math.rint(containerHeight / imageHeight);
            if (rint2 > 0.0f) {
                imageHeight = containerHeight / rint2;
            }
        }
        return TuplesKt.to(Float.valueOf(imageWidth), Float.valueOf(imageHeight));
    }

    private final Pair<Float, Float> calculateBackgroundPosition(float tileWidth, float tileHeight, BackgroundPosition position) {
        float positionToPixels;
        RectF rectF = this.backgroundPositioningArea;
        float f = 0.0f;
        Float valueOf = Float.valueOf(0.0f);
        if (rectF == null) {
            return TuplesKt.to(valueOf, valueOf);
        }
        float width = rectF.width() - tileWidth;
        float height = rectF.height() - tileHeight;
        if ((position != null ? position.getLeft() : null) != null) {
            positionToPixels = positionToPixels(position.getLeft(), width);
        } else {
            positionToPixels = (position != null ? position.getRight() : null) != null ? width - positionToPixels(position.getRight(), width) : 0.0f;
        }
        float f2 = positionToPixels + rectF.left;
        if ((position != null ? position.getTop() : null) != null) {
            f = positionToPixels(position.getTop(), height);
        } else {
            if ((position != null ? position.getBottom() : null) != null) {
                f = height - positionToPixels(position.getBottom(), height);
            }
        }
        return TuplesKt.to(Float.valueOf(f2), Float.valueOf(f + rectF.top));
    }
}
