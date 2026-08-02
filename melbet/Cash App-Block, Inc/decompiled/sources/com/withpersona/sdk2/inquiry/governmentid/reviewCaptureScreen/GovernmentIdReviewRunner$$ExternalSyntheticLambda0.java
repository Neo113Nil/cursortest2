package com.withpersona.sdk2.inquiry.governmentid.reviewCaptureScreen;

import com.withpersona.sdk2.inquiry.governmentid.Screen;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes9.dex */
public final /* synthetic */ class GovernmentIdReviewRunner$$ExternalSyntheticLambda0 implements Function0 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Screen.ReviewScreen f$0;

    public /* synthetic */ GovernmentIdReviewRunner$$ExternalSyntheticLambda0(Screen.ReviewScreen reviewScreen, int i) {
        this.$r8$classId = i;
        this.f$0 = reviewScreen;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.$r8$classId;
        Screen.ReviewScreen reviewScreen = this.f$0;
        switch (i) {
            case 0:
                reviewScreen.acceptImage.invoke();
                break;
            case 1:
                reviewScreen.retryImage.invoke();
                break;
            case 2:
                reviewScreen.close.invoke();
                break;
            default:
                reviewScreen.onErrorDismissed.invoke();
                break;
        }
        return Unit.INSTANCE;
    }
}
