package com.yandex.mobile.ads.impl;

import android.animation.ArgbEvaluator;
import android.animation.ValueAnimator;
import android.view.View;
import android.widget.TextView;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes3.dex */
public final class d42<T extends TextView> implements InterfaceC2183qd<T> {

    /* renamed from: a, reason: collision with root package name */
    private final int f24416a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final ArgbEvaluator f24417b;

    /* renamed from: c, reason: collision with root package name */
    @Nullable
    private ValueAnimator f24418c;

    private static final class a implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: a, reason: collision with root package name */
        @NotNull
        private final TextView f24419a;

        public a(@NotNull TextView textView) {
            Intrinsics.checkNotNullParameter(textView, "textView");
            this.f24419a = textView;
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public final void onAnimationUpdate(@NotNull ValueAnimator valueAnimator) {
            Intrinsics.checkNotNullParameter(valueAnimator, "valueAnimator");
            Object animatedValue = valueAnimator.getAnimatedValue();
            if (animatedValue instanceof Integer) {
                this.f24419a.setTextColor(((Number) animatedValue).intValue());
            }
        }
    }

    public /* synthetic */ d42(int i4) {
        this(i4, new ArgbEvaluator());
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC2183qd
    public final void a(View view) {
        TextView textView = (TextView) view;
        Intrinsics.checkNotNullParameter(textView, "textView");
        this.f24418c = ValueAnimator.ofObject(this.f24417b, Integer.valueOf(textView.getCurrentTextColor()), Integer.valueOf(this.f24416a));
        a aVar = new a(textView);
        ValueAnimator valueAnimator = this.f24418c;
        if (valueAnimator != null) {
            valueAnimator.addUpdateListener(aVar);
        }
        ValueAnimator valueAnimator2 = this.f24418c;
        if (valueAnimator2 != null) {
            valueAnimator2.setDuration(500);
        }
        ValueAnimator valueAnimator3 = this.f24418c;
        if (valueAnimator3 != null) {
            valueAnimator3.start();
        }
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC2183qd
    public final void cancel() {
        ValueAnimator valueAnimator = this.f24418c;
        if (valueAnimator != null) {
            valueAnimator.removeAllUpdateListeners();
        }
        ValueAnimator valueAnimator2 = this.f24418c;
        if (valueAnimator2 != null) {
            valueAnimator2.cancel();
        }
    }

    public d42(int i4, @NotNull ArgbEvaluator argbEvaluator) {
        Intrinsics.checkNotNullParameter(argbEvaluator, "argbEvaluator");
        this.f24416a = i4;
        this.f24417b = argbEvaluator;
    }
}
