package com.squareup.cash.ui.widget.text;

import android.view.animation.PathInterpolator;
import com.squareup.cash.ui.widget.text.AnimatedAmountTextView;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* loaded from: classes7.dex */
public final /* synthetic */ class AnimatedAmountTextView$$ExternalSyntheticLambda0 implements Function1 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ AnimatedAmountTextView f$0;

    public /* synthetic */ AnimatedAmountTextView$$ExternalSyntheticLambda0(AnimatedAmountTextView animatedAmountTextView, int i) {
        this.$r8$classId = i;
        this.f$0 = animatedAmountTextView;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.$r8$classId;
        AnimatedAmountTextView animatedAmountTextView = this.f$0;
        AnimatedAmountTextView.Text text = (AnimatedAmountTextView.Text) obj;
        switch (i) {
            case 0:
                PathInterpolator pathInterpolator = AnimatedAmountTextView.SLIDE_INTERPOLATOR;
                text.getClass();
                animatedAmountTextView.texts.remove(text);
                animatedAmountTextView.requestLayout();
                break;
            default:
                PathInterpolator pathInterpolator2 = AnimatedAmountTextView.SLIDE_INTERPOLATOR;
                text.getClass();
                animatedAmountTextView.texts.remove(text);
                animatedAmountTextView.requestLayout();
                break;
        }
        return Unit.INSTANCE;
    }
}
