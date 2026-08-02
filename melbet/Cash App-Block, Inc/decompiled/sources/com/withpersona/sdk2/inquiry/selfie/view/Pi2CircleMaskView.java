package com.withpersona.sdk2.inquiry.selfie.view;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewPropertyAnimator;
import androidx.recyclerview.widget.RecyclerView;
import com.plaid.internal.P5$$ExternalSyntheticLambda0;
import com.withpersona.sdk2.inquiry.selfie.R$styleable;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.math.MathKt__MathJVMKt;

/* loaded from: classes4.dex */
public final class Pi2CircleMaskView extends View {
    public static final /* synthetic */ int $r8$clinit = 0;
    public final Paint clearPaint;
    public Bitmap mask;
    public final int maskColor;
    public final Paint paint;
    public final float size;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Pi2CircleMaskView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        context.getClass();
        this.paint = new Paint(7);
        Paint paint = new Paint(1);
        paint.setColor(0);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
        this.clearPaint = paint;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.Pi2CircleMaskView, i, 0);
        obtainStyledAttributes.getClass();
        try {
            this.size = obtainStyledAttributes.getFloat(0, 0.4f);
            this.maskColor = obtainStyledAttributes.getColor(1, -16777216);
            obtainStyledAttributes.recycle();
            setWillNotDraw(false);
        } catch (Throwable th) {
            obtainStyledAttributes.recycle();
            throw th;
        }
    }

    public static void close$default(Pi2CircleMaskView pi2CircleMaskView, Function0 function0, int i) {
        if ((i & 2) != 0) {
            function0 = null;
        }
        ViewPropertyAnimator animate = pi2CircleMaskView.animate();
        animate.setDuration(MathKt__MathJVMKt.roundToLong((Math.abs(pi2CircleMaskView.getScaleX() - 1.0f) / 4.0f) * 500.0f));
        animate.scaleX(1.0f);
        animate.scaleY(1.0f);
        animate.withEndAction(new P5$$ExternalSyntheticLambda0(9, function0));
        animate.start();
    }

    @Override // android.view.View
    public final void onDetachedFromWindow() {
        Bitmap bitmap;
        Bitmap bitmap2 = this.mask;
        if (bitmap2 != null && !bitmap2.isRecycled() && (bitmap = this.mask) != null) {
            bitmap.recycle();
        }
        this.mask = null;
        super.onDetachedFromWindow();
    }

    /* JADX WARN: Code restructure failed: missing block: B:7:0x001d, code lost:
    
        if (r0 == null) goto L11;
     */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onDraw(Canvas canvas) {
        canvas.getClass();
        Bitmap bitmap = this.mask;
        if (bitmap != null) {
            if (bitmap.getWidth() != getWidth() || bitmap.getHeight() != getHeight()) {
                bitmap = null;
            }
        }
        bitmap = Bitmap.createBitmap(getWidth(), getHeight(), Bitmap.Config.ARGB_8888);
        bitmap.getClass();
        Canvas canvas2 = new Canvas(bitmap);
        canvas2.drawColor(this.maskColor);
        canvas2.drawCircle(canvas2.getWidth() / 2.0f, canvas2.getHeight() / 2.0f, this.size * Math.min(canvas2.getWidth(), canvas2.getHeight()), this.clearPaint);
        this.mask = bitmap;
        canvas.drawBitmap(bitmap, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, this.paint);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public Pi2CircleMaskView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        context.getClass();
    }

    public /* synthetic */ Pi2CircleMaskView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public Pi2CircleMaskView(Context context) {
        this(context, null, 0, 6, null);
        context.getClass();
    }
}
