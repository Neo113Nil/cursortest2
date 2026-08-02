package com.stripe.android.challenge.confirmation;

import com.google.android.material.button.MaterialButton$$ExternalSyntheticLambda3;
import com.squareup.cash.ui.AlertBannerKt$$ExternalSyntheticLambda3;
import kotlin.jvm.functions.Function0;

/* loaded from: classes8.dex */
public final /* synthetic */ class IntentConfirmationChallengeActivity$$ExternalSyntheticLambda0 implements Function0 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ IntentConfirmationChallengeActivity f$0;

    public /* synthetic */ IntentConfirmationChallengeActivity$$ExternalSyntheticLambda0(IntentConfirmationChallengeActivity intentConfirmationChallengeActivity, int i) {
        this.$r8$classId = i;
        this.f$0 = intentConfirmationChallengeActivity;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.$r8$classId;
        IntentConfirmationChallengeActivity intentConfirmationChallengeActivity = this.f$0;
        switch (i) {
            case 0:
                return intentConfirmationChallengeActivity.viewModelFactory;
            default:
                int i2 = IntentConfirmationChallengeActivity.$r8$clinit;
                return new IntentConfirmationWebViewClient(new MaterialButton$$ExternalSyntheticLambda3(intentConfirmationChallengeActivity, 25), intentConfirmationChallengeActivity.getViewModel().logger, new AlertBannerKt$$ExternalSyntheticLambda3(intentConfirmationChallengeActivity, 26));
        }
    }
}
