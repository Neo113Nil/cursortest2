package com.stripe.android.uicore.elements.compat;

import androidx.compose.animation.core.Transition;
import kotlin.jvm.functions.Function0;

/* renamed from: com.stripe.android.uicore.elements.compat.TextFieldTransitionScope$Transition-DTcfvLk$$inlined$animateColor$1, reason: invalid class name */
/* loaded from: classes7.dex */
public final class TextFieldTransitionScope$TransitionDTcfvLk$$inlined$animateColor$1 implements Function0 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Transition $this_animateValue;

    public /* synthetic */ TextFieldTransitionScope$TransitionDTcfvLk$$inlined$animateColor$1(Transition transition, int i) {
        this.$r8$classId = i;
        this.$this_animateValue = transition;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.$r8$classId;
        Transition transition = this.$this_animateValue;
        switch (i) {
            case 0:
                return transition.targetState$delegate.getValue();
            case 1:
                return transition.targetState$delegate.getValue();
            case 2:
                return transition.getSegment();
            case 3:
                return transition.targetState$delegate.getValue();
            case 4:
                return transition.getSegment();
            case 5:
                return transition.getSegment();
            case 6:
                return transition.targetState$delegate.getValue();
            case 7:
                return transition.getSegment();
            case 8:
                return transition.targetState$delegate.getValue();
            case 9:
                return transition.getSegment();
            case 10:
                return transition.targetState$delegate.getValue();
            default:
                return transition.getSegment();
        }
    }
}
