package com.fortunequest.neontrack.ui;

import A.b;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.View;
import android.view.animation.DecelerateInterpolator;
import androidx.recyclerview.widget.RecyclerView;
import com.fortunequest.neontrack.R;
import com.fortunequest.neontrack.ui.ColorWaveOverlay;
import j1.InterfaceC0170a;
import k1.e;

/* loaded from: classes.dex */
public final class ColorWaveOverlay extends View {

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ int f2107e = 0;

    /* renamed from: a, reason: collision with root package name */
    public final Paint f2108a;

    /* renamed from: b, reason: collision with root package name */
    public int f2109b;

    /* renamed from: c, reason: collision with root package name */
    public int f2110c;
    public ValueAnimator d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ColorWaveOverlay(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        e.e(context, "context");
        this.f2108a = new Paint(1);
        this.f2110c = b.a(context, R.color.neon_cyan);
        setVisibility(8);
        setClickable(false);
    }

    public static void a(final ColorWaveOverlay colorWaveOverlay) {
        ValueAnimator valueAnimator = colorWaveOverlay.d;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        colorWaveOverlay.setVisibility(0);
        colorWaveOverlay.f2110c = b.a(colorWaveOverlay.getContext(), R.color.neon_cyan);
        colorWaveOverlay.f2109b = 180;
        colorWaveOverlay.invalidate();
        ValueAnimator ofFloat = ValueAnimator.ofFloat(RecyclerView.f1937A0, 1.0f);
        ofFloat.setDuration(400L);
        ofFloat.setInterpolator(new DecelerateInterpolator());
        final InterfaceC0170a interfaceC0170a = null;
        ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: w0.a
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                int i = ColorWaveOverlay.f2107e;
                k1.e.e(valueAnimator2, "it");
                Object animatedValue = valueAnimator2.getAnimatedValue();
                k1.e.c(animatedValue, "null cannot be cast to non-null type kotlin.Float");
                float floatValue = ((Float) animatedValue).floatValue();
                ColorWaveOverlay colorWaveOverlay2 = ColorWaveOverlay.this;
                colorWaveOverlay2.f2109b = (int) ((1.0f - floatValue) * 180.0f);
                if (floatValue > 0.4f) {
                    colorWaveOverlay2.f2110c = A.b.a(colorWaveOverlay2.getContext(), R.color.neon_orange);
                }
                colorWaveOverlay2.invalidate();
                if (floatValue >= 1.0f) {
                    colorWaveOverlay2.setVisibility(8);
                    InterfaceC0170a interfaceC0170a2 = interfaceC0170a;
                    if (interfaceC0170a2 != null) {
                        interfaceC0170a2.c();
                    }
                }
            }
        });
        ofFloat.start();
        colorWaveOverlay.d = ofFloat;
    }

    @Override // android.view.View
    public final void onDetachedFromWindow() {
        ValueAnimator valueAnimator = this.d;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        super.onDetachedFromWindow();
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        e.e(canvas, "canvas");
        if (this.f2109b > 0) {
            Paint paint = this.f2108a;
            paint.setColor(this.f2110c);
            paint.setAlpha(this.f2109b);
            canvas.drawRect(RecyclerView.f1937A0, RecyclerView.f1937A0, getWidth(), getHeight(), paint);
        }
    }
}
