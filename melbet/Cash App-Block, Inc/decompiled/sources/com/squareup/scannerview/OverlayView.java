package com.squareup.scannerview;

import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import androidx.camera.view.ScreenFlashView;
import androidx.core.content.res.ResourcesCompat;
import androidx.recyclerview.widget.RecyclerView;
import androidx.transition.Transition;
import com.plaid.internal.EnumC0170g;
import com.squareup.cash.R;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import okio.Path$$ExternalSyntheticBUOutline0;

/* loaded from: classes4.dex */
public final class OverlayView extends View {
    public static final /* synthetic */ int $r8$clinit = 0;
    public Function1 callback;
    public final float cardOutlineCornerRadius;
    public final Paint dimPaint;
    public Drawable hintDrawable;
    public float outlineCornerRadius;
    public final float outlinePadding;
    public final Paint outlinePaint;
    public final RectF overlayRect;
    public final Path path;
    public final Paint previewDimPaint;
    public boolean showingPreview;
    public boolean showingSuccess;
    public float squareOutlineCornerRadius;
    public final AnimatorSet successAnimator;
    public final Paint successDimPaint;
    public Drawable successDrawable;
    public final Paint successOutlinePaint;
    public final Path successPath;
    public final AnimatorSet successToNothingAnimator;
    public int topMargin;

    /* renamed from: type, reason: collision with root package name */
    public OverlayType f1415type;

    /* loaded from: classes8.dex */
    public abstract /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[OverlayType.values().length];
            try {
                OverlayType overlayType = OverlayType.CARD;
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                OverlayType overlayType2 = OverlayType.CARD;
                iArr[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OverlayView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        context.getClass();
        float dimension = context.getResources().getDimension(R.dimen.sv_outline_corner_radius);
        this.cardOutlineCornerRadius = dimension;
        this.squareOutlineCornerRadius = dimension;
        this.outlineCornerRadius = dimension;
        this.outlinePadding = context.getResources().getDimension(R.dimen.sv_outline_padding);
        float dimension2 = context.getResources().getDimension(R.dimen.sv_outline_width);
        Paint paint = new Paint();
        this.dimPaint = paint;
        Paint paint2 = new Paint();
        this.outlinePaint = paint2;
        Path path = new Path();
        this.path = path;
        this.overlayRect = new RectF();
        Drawable drawable = ResourcesCompat.getDrawable(getResources(), R.drawable.sv_success, context.getTheme());
        drawable.getClass();
        Drawable mutate = drawable.mutate();
        mutate.getClass();
        this.successDrawable = mutate;
        this.successPath = new Path();
        final int i2 = 1;
        paint.setAntiAlias(true);
        final int i3 = 0;
        paint.setColor(0);
        paint.setAlpha(EnumC0170g.SDK_ASSET_ICON_CLEARED_REC_VALUE);
        paint.setStyle(Paint.Style.FILL);
        paint2.setAntiAlias(true);
        paint2.setColor(-1);
        paint2.setStyle(Paint.Style.STROKE);
        paint2.setStrokeWidth(dimension2);
        this.previewDimPaint = new Paint(paint);
        this.successDimPaint = new Paint(paint);
        Paint paint3 = new Paint(paint2);
        this.successOutlinePaint = paint3;
        paint3.setColor(-16726023);
        this.successDrawable.setTint(-16726023);
        path.setFillType(Path.FillType.EVEN_ODD);
        final int i4 = 2;
        ValueAnimator ofFloat = ValueAnimator.ofFloat(RecyclerView.DECELERATION_RATE, 1.0f);
        ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) { // from class: com.squareup.scannerview.OverlayView$$ExternalSyntheticLambda0
            public final /* synthetic */ OverlayView f$0;

            {
                this.f$0 = this;
            }

            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                int i5 = i3;
                OverlayView overlayView = this.f$0;
                switch (i5) {
                    case 0:
                        int i6 = OverlayView.$r8$clinit;
                        valueAnimator.getClass();
                        overlayView.successDimPaint.setAlpha((int) (valueAnimator.getAnimatedFraction() * 204.0f));
                        overlayView.successOutlinePaint.setAlpha((int) (valueAnimator.getAnimatedFraction() * 255.0f));
                        overlayView.successDrawable.setAlpha((int) (valueAnimator.getAnimatedFraction() * 255.0f));
                        overlayView.invalidate();
                        break;
                    case 1:
                        int i7 = OverlayView.$r8$clinit;
                        valueAnimator.getClass();
                        overlayView.successDimPaint.setAlpha((int) ((1.0f - valueAnimator.getAnimatedFraction()) * 204.0f));
                        overlayView.successOutlinePaint.setAlpha((int) ((1.0f - valueAnimator.getAnimatedFraction()) * 255.0f));
                        overlayView.successDrawable.setAlpha((int) ((1.0f - valueAnimator.getAnimatedFraction()) * 255.0f));
                        overlayView.invalidate();
                        break;
                    default:
                        int i8 = OverlayView.$r8$clinit;
                        valueAnimator.getClass();
                        overlayView.successOutlinePaint.setAlpha((int) ((1.0f - valueAnimator.getAnimatedFraction()) * 255.0f));
                        overlayView.successDrawable.setAlpha((int) ((1.0f - valueAnimator.getAnimatedFraction()) * 255.0f));
                        overlayView.invalidate();
                        break;
                }
            }
        });
        ofFloat.setDuration(250L);
        ValueAnimator ofFloat2 = ValueAnimator.ofFloat(1.0f, RecyclerView.DECELERATION_RATE);
        ofFloat2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) { // from class: com.squareup.scannerview.OverlayView$$ExternalSyntheticLambda0
            public final /* synthetic */ OverlayView f$0;

            {
                this.f$0 = this;
            }

            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                int i5 = i2;
                OverlayView overlayView = this.f$0;
                switch (i5) {
                    case 0:
                        int i6 = OverlayView.$r8$clinit;
                        valueAnimator.getClass();
                        overlayView.successDimPaint.setAlpha((int) (valueAnimator.getAnimatedFraction() * 204.0f));
                        overlayView.successOutlinePaint.setAlpha((int) (valueAnimator.getAnimatedFraction() * 255.0f));
                        overlayView.successDrawable.setAlpha((int) (valueAnimator.getAnimatedFraction() * 255.0f));
                        overlayView.invalidate();
                        break;
                    case 1:
                        int i7 = OverlayView.$r8$clinit;
                        valueAnimator.getClass();
                        overlayView.successDimPaint.setAlpha((int) ((1.0f - valueAnimator.getAnimatedFraction()) * 204.0f));
                        overlayView.successOutlinePaint.setAlpha((int) ((1.0f - valueAnimator.getAnimatedFraction()) * 255.0f));
                        overlayView.successDrawable.setAlpha((int) ((1.0f - valueAnimator.getAnimatedFraction()) * 255.0f));
                        overlayView.invalidate();
                        break;
                    default:
                        int i8 = OverlayView.$r8$clinit;
                        valueAnimator.getClass();
                        overlayView.successOutlinePaint.setAlpha((int) ((1.0f - valueAnimator.getAnimatedFraction()) * 255.0f));
                        overlayView.successDrawable.setAlpha((int) ((1.0f - valueAnimator.getAnimatedFraction()) * 255.0f));
                        overlayView.invalidate();
                        break;
                }
            }
        });
        ofFloat2.setDuration(500L);
        ofFloat2.setStartDelay(1000L);
        Transition.AnonymousClass3 anonymousClass3 = new Transition.AnonymousClass3(this, 13);
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playSequentially(ofFloat, ofFloat2);
        animatorSet.addListener(anonymousClass3);
        this.successAnimator = animatorSet;
        ValueAnimator ofFloat3 = ValueAnimator.ofFloat(1.0f, RecyclerView.DECELERATION_RATE);
        ofFloat3.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) { // from class: com.squareup.scannerview.OverlayView$$ExternalSyntheticLambda0
            public final /* synthetic */ OverlayView f$0;

            {
                this.f$0 = this;
            }

            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                int i5 = i4;
                OverlayView overlayView = this.f$0;
                switch (i5) {
                    case 0:
                        int i6 = OverlayView.$r8$clinit;
                        valueAnimator.getClass();
                        overlayView.successDimPaint.setAlpha((int) (valueAnimator.getAnimatedFraction() * 204.0f));
                        overlayView.successOutlinePaint.setAlpha((int) (valueAnimator.getAnimatedFraction() * 255.0f));
                        overlayView.successDrawable.setAlpha((int) (valueAnimator.getAnimatedFraction() * 255.0f));
                        overlayView.invalidate();
                        break;
                    case 1:
                        int i7 = OverlayView.$r8$clinit;
                        valueAnimator.getClass();
                        overlayView.successDimPaint.setAlpha((int) ((1.0f - valueAnimator.getAnimatedFraction()) * 204.0f));
                        overlayView.successOutlinePaint.setAlpha((int) ((1.0f - valueAnimator.getAnimatedFraction()) * 255.0f));
                        overlayView.successDrawable.setAlpha((int) ((1.0f - valueAnimator.getAnimatedFraction()) * 255.0f));
                        overlayView.invalidate();
                        break;
                    default:
                        int i8 = OverlayView.$r8$clinit;
                        valueAnimator.getClass();
                        overlayView.successOutlinePaint.setAlpha((int) ((1.0f - valueAnimator.getAnimatedFraction()) * 255.0f));
                        overlayView.successDrawable.setAlpha((int) ((1.0f - valueAnimator.getAnimatedFraction()) * 255.0f));
                        overlayView.invalidate();
                        break;
                }
            }
        });
        ofFloat3.addListener(new ScreenFlashView.AnonymousClass2(this, 5));
        ofFloat3.setDuration(500L);
        ofFloat3.setStartDelay(1000L);
        AnimatorSet animatorSet2 = new AnimatorSet();
        animatorSet2.playSequentially(ofFloat, ofFloat3);
        animatorSet2.addListener(anonymousClass3);
        this.successToNothingAnimator = animatorSet2;
    }

    public static boolean maybeSet(RectF rectF, float f, float f2, float f3, float f4) {
        if (rectF.left == f && rectF.top == f2 && rectF.right == f3 && rectF.bottom == f4) {
            return false;
        }
        rectF.set(f, f2, f3, f4);
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void setOverlayType$default(OverlayView overlayView, OverlayType overlayType, Drawable drawable, boolean z, Function0 function0, int i, Object obj) {
        if ((i & 2) != 0) {
            drawable = null;
        }
        if ((i & 4) != 0) {
            z = false;
        }
        if ((i & 8) != 0) {
            function0 = null;
        }
        overlayView.setOverlayType(overlayType, drawable, z, function0);
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        Drawable drawable;
        canvas.getClass();
        if (this.showingPreview) {
            canvas.drawColor(this.previewDimPaint.getColor());
            return;
        }
        canvas.drawPath(this.path, this.dimPaint);
        float f = this.outlineCornerRadius;
        Paint paint = this.outlinePaint;
        RectF rectF = this.overlayRect;
        canvas.drawRoundRect(rectF, f, f, paint);
        if (!this.showingSuccess && (drawable = this.hintDrawable) != null) {
            drawable.draw(canvas);
        }
        if (this.showingSuccess) {
            float f2 = this.outlineCornerRadius;
            canvas.drawRoundRect(rectF, f2, f2, this.successDimPaint);
            float f3 = this.outlineCornerRadius;
            canvas.drawRoundRect(rectF, f3, f3, this.successOutlinePaint);
            this.successDrawable.draw(canvas);
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        int measuredWidth = getMeasuredWidth();
        int measuredHeight = getMeasuredHeight();
        OverlayType overlayType = this.f1415type;
        int i3 = overlayType == null ? -1 : WhenMappings.$EnumSwitchMapping$0[overlayType.ordinal()];
        RectF rectF = this.overlayRect;
        if (i3 != -1) {
            float f = this.outlinePadding;
            if (i3 == 1) {
                float f2 = measuredWidth - (f * 2.0f);
                float f3 = 0.6306075f * f2;
                float f4 = this.topMargin;
                if (maybeSet(rectF, f, f4, f2 + f, f3 + f4)) {
                    Function1 function1 = this.callback;
                    function1.getClass();
                    function1.invoke(new RectF(rectF));
                }
            } else {
                if (i3 != 2) {
                    Path$$ExternalSyntheticBUOutline0.m();
                    return;
                }
                float f5 = measuredWidth - (f * 2.0f);
                float f6 = measuredWidth / 2;
                float f7 = f5 / 2.0f;
                float f8 = f6 - f7;
                float f9 = f6 + f7;
                float f10 = this.topMargin;
                if (maybeSet(rectF, f8, f10, f9, f5 + f10)) {
                    Function1 function12 = this.callback;
                    function12.getClass();
                    function12.invoke(new RectF(rectF));
                }
            }
        } else {
            rectF.setEmpty();
            Function1 function13 = this.callback;
            function13.getClass();
            function13.invoke(new RectF(rectF));
        }
        Path path = this.path;
        path.reset();
        Path path2 = this.successPath;
        path2.reset();
        Path.Direction direction = Path.Direction.CW;
        path.addRect(RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, measuredWidth, measuredHeight, direction);
        if (!rectF.isEmpty()) {
            float f11 = this.outlineCornerRadius;
            path.addRoundRect(rectF, f11, f11, Path.Direction.CCW);
            float f12 = this.outlineCornerRadius;
            path2.addRoundRect(rectF, f12, f12, direction);
        }
        int width = (int) (rectF.right - (rectF.width() / 2.0f));
        int height = (int) (rectF.bottom - (rectF.height() / 2.0f));
        int intrinsicWidth = this.successDrawable.getIntrinsicWidth() / 2;
        int intrinsicHeight = this.successDrawable.getIntrinsicHeight() / 2;
        this.successDrawable.setBounds(width - intrinsicWidth, height - intrinsicHeight, width + intrinsicWidth, height + intrinsicHeight);
    }

    public final void setCallback(Function1<? super RectF, Unit> function1) {
        this.callback = function1;
    }

    public final void setOverlayType(OverlayType overlayType, Drawable drawable, boolean z, Function0<Unit> function0) {
        AnimatorSet animatorSet = this.successAnimator;
        animatorSet.cancel();
        AnimatorSet animatorSet2 = this.successToNothingAnimator;
        animatorSet2.cancel();
        if (z) {
            if (overlayType == null) {
                animatorSet = animatorSet2;
            }
            if (function0 != null) {
                animatorSet.addListener(new OverlayView$setOverlayType$$inlined$doOnEnd$1(this, overlayType, function0, 0));
            }
            animatorSet.start();
        } else {
            setType(overlayType);
            requestLayout();
            if (function0 != null) {
                function0.invoke();
            }
        }
        this.hintDrawable = drawable;
    }

    public final void setPreviewDimAlpha(int i) {
        this.previewDimPaint.setAlpha(i);
    }

    public final void setShowingPreview(boolean z) {
        this.showingPreview = z;
    }

    public final void setSquareOutlineCornerRadius(int i) {
        this.squareOutlineCornerRadius = getContext().getResources().getDimension(i);
    }

    public final void setSuccessColor(int i) {
        this.successOutlinePaint.setColor(i);
    }

    public final void setSuccessDrawable(Drawable drawable) {
        drawable.getClass();
        this.successDrawable = drawable;
    }

    public final void setTopMargin(int i) {
        this.topMargin = i;
        requestLayout();
    }

    public final void setType(OverlayType overlayType) {
        float f;
        this.f1415type = overlayType;
        int i = overlayType == null ? -1 : WhenMappings.$EnumSwitchMapping$0[overlayType.ordinal()];
        if (i == -1 || i == 1) {
            f = this.cardOutlineCornerRadius;
        } else {
            if (i != 2) {
                Drop$$ExternalSyntheticBUOutline0.m1m();
                return;
            }
            f = this.squareOutlineCornerRadius;
        }
        this.outlineCornerRadius = f;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public OverlayView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4, 0);
        context.getClass();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public OverlayView(Context context) {
        this(context, null, 6, 0);
        context.getClass();
    }

    public /* synthetic */ OverlayView(Context context, AttributeSet attributeSet, int i, int i2) {
        this(context, (i & 2) != 0 ? null : attributeSet, 0);
    }
}
