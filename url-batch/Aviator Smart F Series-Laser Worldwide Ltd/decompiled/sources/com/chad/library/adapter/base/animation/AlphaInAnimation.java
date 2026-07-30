package com.chad.library.adapter.base.animation;

import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.view.View;
import android.view.animation.LinearInterpolator;
import kotlin.jvm.internal.o;
import kotlin.jvm.internal.s;

/* loaded from: classes2.dex */
public final class AlphaInAnimation implements BaseAnimation {
    public static final Companion Companion = new Companion(null);
    private static final float DEFAULT_ALPHA_FROM = 0.0f;
    private final float mFrom;

    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(o oVar) {
            this();
        }
    }

    public AlphaInAnimation() {
        this(0.0f, 1, null);
    }

    @Override // com.chad.library.adapter.base.animation.BaseAnimation
    public Animator[] animators(View view) {
        s.checkNotNullParameter(view, "view");
        ObjectAnimator animator = ObjectAnimator.ofFloat(view, "alpha", this.mFrom, 1.0f);
        animator.setDuration(300L);
        animator.setInterpolator(new LinearInterpolator());
        s.checkNotNullExpressionValue(animator, "animator");
        return new Animator[]{animator};
    }

    public AlphaInAnimation(float f8) {
        this.mFrom = f8;
    }

    public /* synthetic */ AlphaInAnimation(float f8, int i8, o oVar) {
        this((i8 & 1) != 0 ? 0.0f : f8);
    }
}
