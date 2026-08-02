package com.withpersona.sdk2.inquiry.selfie.view;

import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.View;
import android.view.animation.LinearInterpolator;
import androidx.recyclerview.widget.RecyclerView;
import androidx.swiperefreshlayout.widget.CircularProgressDrawable;
import com.knotapi.knot.ui.views.KnotSpinnerView$$ExternalSyntheticLambda3;
import com.withpersona.sdk2.inquiry.selfie.R$styleable;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes9.dex */
public final class Pi2ProgressArcView extends View {
    public static final /* synthetic */ int $r8$clinit = 0;
    public float _rotation;
    public ValueAnimator animator;
    public ValueAnimator indeterminateAnimator;
    public final Paint paint;
    public float progress;
    public ValueAnimator rotateToZeroAnimator;
    public final float size;
    public final float startAngle;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Pi2ProgressArcView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        context.getClass();
        Paint paint = new Paint(1);
        this.paint = paint;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.Pi2ProgressArcView, i, 0);
        obtainStyledAttributes.getClass();
        try {
            this.size = obtainStyledAttributes.getFloat(0, 0.4f);
            this.startAngle = obtainStyledAttributes.getFloat(2, 270.0f);
            this.progress = obtainStyledAttributes.getFloat(1, RecyclerView.DECELERATION_RATE);
            paint.setColor(obtainStyledAttributes.getColor(3, -1));
            paint.setStrokeWidth(obtainStyledAttributes.getDimensionPixelSize(4, 4));
            paint.setStyle(Paint.Style.STROKE);
            paint.setStrokeCap(Paint.Cap.BUTT);
            obtainStyledAttributes.recycle();
            setWillNotDraw(false);
        } catch (Throwable th) {
            obtainStyledAttributes.recycle();
            throw th;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void setProgress$default(Pi2ProgressArcView pi2ProgressArcView, float f, Function0 function0, int i, Object obj) {
        if ((i & 2) != 0) {
            function0 = null;
        }
        pi2ProgressArcView.setProgress(f, function0);
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        canvas.getClass();
        int width = getWidth() / 2;
        int height = getHeight() / 2;
        float min = this.size * Math.min(getWidth(), getHeight());
        Paint paint = this.paint;
        float strokeWidth = min - (paint.getStrokeWidth() / 2.0f);
        float f = width;
        float f2 = height;
        canvas.drawArc(f - strokeWidth, f2 - strokeWidth, f + strokeWidth, f2 + strokeWidth, this.startAngle + this._rotation, (this.progress * 360.0f) / 100.0f, false, paint);
    }

    public final void setIndeterminate() {
        ValueAnimator valueAnimator = this.rotateToZeroAnimator;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator valueAnimator2 = this.indeterminateAnimator;
        if (valueAnimator2 != null) {
            valueAnimator2.cancel();
        }
        setProgressInternal(25.0f, null);
        ValueAnimator ofFloat = ValueAnimator.ofFloat(RecyclerView.DECELERATION_RATE, 100.0f);
        ofFloat.setDuration(300L);
        ofFloat.addUpdateListener(new Pi2ProgressArcView$rotateToZero$1$1(ofFloat, this, 1));
        ofFloat.setInterpolator(new LinearInterpolator());
        ofFloat.setRepeatCount(-1);
        ofFloat.setRepeatMode(2);
        ofFloat.start();
        this.indeterminateAnimator = ofFloat;
    }

    public final void setProgress(float f, Function0<Unit> function0) {
        ValueAnimator valueAnimator = this.indeterminateAnimator;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        if (this._rotation != RecyclerView.DECELERATION_RATE) {
            ValueAnimator ofFloat = ValueAnimator.ofFloat(RecyclerView.DECELERATION_RATE, 100.0f);
            ofFloat.setDuration(300L);
            ofFloat.addUpdateListener(new Pi2ProgressArcView$rotateToZero$1$1(ofFloat, this, 0));
            ofFloat.setInterpolator(new LinearInterpolator());
            ofFloat.setRepeatCount(-1);
            ofFloat.setRepeatMode(2);
            ofFloat.start();
            this.rotateToZeroAnimator = ofFloat;
        }
        setProgressInternal(f, function0);
    }

    public final void setProgressInternal(float f, Function0 function0) {
        if (this.progress == f) {
            if (function0 != null) {
                function0.invoke();
                return;
            }
            return;
        }
        ValueAnimator valueAnimator = this.animator;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        float f2 = this.progress;
        ValueAnimator ofFloat = ValueAnimator.ofFloat(f2, f);
        ofFloat.setDuration((long) ((Math.abs(f - f2) / 100.0f) * 1000.0f));
        ofFloat.addUpdateListener(new KnotSpinnerView$$ExternalSyntheticLambda3(8, this, ofFloat));
        ofFloat.addListener(new CircularProgressDrawable.AnonymousClass2(6, function0, this));
        ofFloat.start();
        this.animator = ofFloat;
    }

    public final void setStrokeColor(int i) {
        this.paint.setColor(i);
    }

    public final void setStrokeWidth(float f) {
        this.paint.setStrokeWidth(f);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public Pi2ProgressArcView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        context.getClass();
    }

    public /* synthetic */ Pi2ProgressArcView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public Pi2ProgressArcView(Context context) {
        this(context, null, 0, 6, null);
        context.getClass();
    }
}
