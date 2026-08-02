package com.squareup.cash.work.views.clockin;

import androidx.compose.ui.text.LinkAnnotation;
import androidx.compose.ui.text.LinkInteractionListener;
import kotlin.Function;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* loaded from: classes4.dex */
public final /* synthetic */ class DisclaimerTextKt$$ExternalSyntheticLambda1 implements LinkInteractionListener {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Function f$0;

    public /* synthetic */ DisclaimerTextKt$$ExternalSyntheticLambda1(Function function, int i) {
        this.$r8$classId = i;
        this.f$0 = function;
    }

    @Override // androidx.compose.ui.text.LinkInteractionListener
    public final void onClick(LinkAnnotation linkAnnotation) {
        int i = this.$r8$classId;
        Function function = this.f$0;
        switch (i) {
            case 0:
                linkAnnotation.getClass();
                ((Function0) function).invoke();
                break;
            case 1:
                linkAnnotation.getClass();
                ((Function0) function).invoke();
                break;
            default:
                Function1 function1 = (Function1) function;
                linkAnnotation.getClass();
                if (linkAnnotation instanceof LinkAnnotation.Url) {
                    function1.invoke(((LinkAnnotation.Url) linkAnnotation).url);
                    break;
                }
                break;
        }
    }
}
