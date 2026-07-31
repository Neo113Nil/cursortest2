package com.yandex.div.internal.widget;

import W1.m;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.core.view.AbstractC1281a0;
import androidx.core.view.AbstractC1317t;
import com.ironsource.InterfaceC1490j3;
import com.yandex.div.core.widget.AspectView;
import com.yandex.div.core.widget.ViewsKt;
import j2.AbstractC3185a;
import kotlin.Metadata;
import kotlin.jvm.internal.H;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.v;
import kotlin.ranges.g;
import m2.h;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata
/* loaded from: classes2.dex */
public abstract class AspectImageView extends AppCompatImageView implements AspectView {
    static final /* synthetic */ h[] $$delegatedProperties = {H.d(new v(AspectImageView.class, "gravity", "getGravity()I", 0)), H.d(new v(AspectImageView.class, "aspectRatio", "getAspectRatio()F", 0)), H.d(new v(AspectImageView.class, "imageScale", "getImageScale()Lcom/yandex/div/internal/widget/AspectImageView$Scale;", 0))};

    @NotNull
    private final kotlin.properties.c aspectRatio$delegate;

    @NotNull
    private final kotlin.properties.c gravity$delegate;

    @NotNull
    private final kotlin.properties.c imageScale$delegate;
    private boolean isMatrixInvalidated;

    @NotNull
    private final Matrix transformMatrix;

    @Metadata
    public enum Scale {
        NO_SCALE,
        FIT,
        FILL,
        STRETCH
    }

    @Metadata
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[Scale.values().length];
            try {
                iArr[Scale.NO_SCALE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Scale.FIT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[Scale.FILL.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[Scale.STRETCH.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AspectImageView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i4) {
        super(context, attributeSet, i4);
        Intrinsics.checkNotNullParameter(context, "context");
        this.gravity$delegate = ViewsKt.appearanceAffecting$default(0, null, 2, null);
        this.aspectRatio$delegate = AspectView.Companion.aspectRatioProperty$div_release();
        this.imageScale$delegate = ViewsKt.dimensionAffecting$default(Scale.NO_SCALE, null, 2, null);
        this.transformMatrix = new Matrix();
        this.isMatrixInvalidated = true;
        super.setScaleType(ImageView.ScaleType.MATRIX);
    }

    private final void applyAspectRatio(int i4, int i5) {
        float aspectRatio = getAspectRatio();
        if (aspectRatio == 0.0f) {
            return;
        }
        int mode = View.MeasureSpec.getMode(i4);
        int mode2 = View.MeasureSpec.getMode(i5);
        boolean canResizeWidth = canResizeWidth(i4);
        boolean canResizeHeight = canResizeHeight(i5);
        int measuredWidth = getMeasuredWidth();
        int measuredHeight = getMeasuredHeight();
        if (!canResizeWidth && !canResizeHeight) {
            measuredHeight = AbstractC3185a.c(measuredWidth / aspectRatio);
        } else if (!canResizeWidth && canResizeHeight) {
            measuredHeight = AbstractC3185a.c(measuredWidth / aspectRatio);
        } else if (canResizeWidth && !canResizeHeight) {
            measuredWidth = AbstractC3185a.c(measuredHeight * aspectRatio);
        } else if (canResizeWidth && canResizeHeight) {
            measuredHeight = AbstractC3185a.c(measuredWidth / aspectRatio);
        }
        setMeasuredDimension(View.MeasureSpec.makeMeasureSpec(measuredWidth, mode), View.MeasureSpec.makeMeasureSpec(measuredHeight, mode2));
    }

    private final void updateMatrix(int i4, int i5) {
        float f4;
        Drawable drawable = getDrawable();
        if (drawable == null) {
            return;
        }
        float d4 = g.d((i4 - getPaddingLeft()) - getPaddingRight(), 0);
        float d5 = g.d((i5 - getPaddingTop()) - getPaddingBottom(), 0);
        float intrinsicWidth = drawable.getIntrinsicWidth();
        float intrinsicHeight = drawable.getIntrinsicHeight();
        int b4 = AbstractC1317t.b(getGravity(), AbstractC1281a0.C(this));
        Scale imageScale = getImageScale();
        int[] iArr = WhenMappings.$EnumSwitchMapping$0;
        int i6 = iArr[imageScale.ordinal()];
        if (i6 == 1) {
            f4 = 1.0f;
        } else if (i6 == 2) {
            f4 = Math.min(d4 / intrinsicWidth, d5 / intrinsicHeight);
        } else if (i6 == 3) {
            f4 = Math.max(d4 / intrinsicWidth, d5 / intrinsicHeight);
        } else {
            if (i6 != 4) {
                throw new m();
            }
            f4 = d4 / intrinsicWidth;
        }
        float f5 = iArr[getImageScale().ordinal()] == 4 ? d5 / intrinsicHeight : f4;
        int i7 = b4 & 7;
        float f6 = 0.0f;
        float f7 = i7 != 1 ? i7 != 5 ? 0.0f : d4 - (intrinsicWidth * f4) : (d4 - (intrinsicWidth * f4)) / 2;
        int i8 = b4 & InterfaceC1490j3.d.b.f16818j;
        if (i8 == 16) {
            f6 = (d5 - (intrinsicHeight * f5)) / 2;
        } else if (i8 == 80) {
            f6 = d5 - (intrinsicHeight * f5);
        }
        Matrix matrix = this.transformMatrix;
        matrix.reset();
        matrix.postScale(f4, f5);
        matrix.postTranslate(f7, f6);
        setImageMatrix(this.transformMatrix);
    }

    protected boolean canResizeHeight(int i4) {
        return View.MeasureSpec.getMode(i4) != 1073741824;
    }

    protected boolean canResizeWidth(int i4) {
        return View.MeasureSpec.getMode(i4) != 1073741824;
    }

    public final float getAspectRatio() {
        return ((Number) this.aspectRatio$delegate.getValue(this, $$delegatedProperties[1])).floatValue();
    }

    @Override // android.widget.ImageView, android.view.View
    public int getBaseline() {
        return getMeasuredHeight() - getPaddingBottom();
    }

    public final int getGravity() {
        return ((Number) this.gravity$delegate.getValue(this, $$delegatedProperties[0])).intValue();
    }

    @NotNull
    public final Scale getImageScale() {
        return (Scale) this.imageScale$delegate.getValue(this, $$delegatedProperties[2]);
    }

    @Override // android.view.View
    public void invalidate() {
        super.invalidate();
        this.isMatrixInvalidated = true;
    }

    @Override // android.widget.ImageView, android.view.View
    protected void onDraw(@NotNull Canvas canvas) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        if ((getImageMatrix() == null || Intrinsics.areEqual(getImageMatrix(), this.transformMatrix)) && this.isMatrixInvalidated && getWidth() > 0 && getHeight() > 0) {
            updateMatrix(getWidth(), getHeight());
            this.isMatrixInvalidated = false;
        }
        super.onDraw(canvas);
    }

    @Override // android.view.View
    protected void onLayout(boolean z4, int i4, int i5, int i6, int i7) {
        super.onLayout(z4, i4, i5, i6, i7);
        this.isMatrixInvalidated = true;
    }

    @Override // android.widget.ImageView, android.view.View
    protected void onMeasure(int i4, int i5) {
        super.onMeasure(i4, i5);
        applyAspectRatio(i4, i5);
    }

    @Override // android.view.View
    protected void onSizeChanged(int i4, int i5, int i6, int i7) {
        super.onSizeChanged(i4, i5, i6, i7);
        this.isMatrixInvalidated = true;
    }

    @Override // com.yandex.div.core.widget.AspectView
    public final void setAspectRatio(float f4) {
        this.aspectRatio$delegate.setValue(this, $$delegatedProperties[1], Float.valueOf(f4));
    }

    public final void setGravity(int i4) {
        this.gravity$delegate.setValue(this, $$delegatedProperties[0], Integer.valueOf(i4));
    }

    public final void setImageScale(@NotNull Scale scale) {
        Intrinsics.checkNotNullParameter(scale, "<set-?>");
        this.imageScale$delegate.setValue(this, $$delegatedProperties[2], scale);
    }

    @Override // android.widget.ImageView
    public void setScaleType(@Nullable ImageView.ScaleType scaleType) {
    }
}
