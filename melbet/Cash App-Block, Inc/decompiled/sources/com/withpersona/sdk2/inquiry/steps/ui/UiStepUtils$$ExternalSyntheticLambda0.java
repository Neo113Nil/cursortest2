package com.withpersona.sdk2.inquiry.steps.ui;

import io.noties.markwon.MarkwonImpl;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes9.dex */
public final /* synthetic */ class UiStepUtils$$ExternalSyntheticLambda0 implements Function0 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ MarkwonImpl f$0;

    public /* synthetic */ UiStepUtils$$ExternalSyntheticLambda0(MarkwonImpl markwonImpl, int i) {
        this.$r8$classId = i;
        this.f$0 = markwonImpl;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.$r8$classId;
        MarkwonImpl markwonImpl = this.f$0;
        switch (i) {
            case 0:
                markwonImpl.onLayout();
                break;
            default:
                markwonImpl.onLayout();
                break;
        }
        return Unit.INSTANCE;
    }
}
