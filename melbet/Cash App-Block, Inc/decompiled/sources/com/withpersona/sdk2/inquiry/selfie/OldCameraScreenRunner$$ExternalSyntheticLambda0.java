package com.withpersona.sdk2.inquiry.selfie;

import com.google.android.material.math.MathUtils;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes9.dex */
public final /* synthetic */ class OldCameraScreenRunner$$ExternalSyntheticLambda0 implements Function0 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ MathUtils f$0;

    public /* synthetic */ OldCameraScreenRunner$$ExternalSyntheticLambda0(MathUtils mathUtils, int i) {
        this.$r8$classId = i;
        this.f$0 = mathUtils;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.$r8$classId;
        MathUtils mathUtils = this.f$0;
        switch (i) {
            case 0:
                ((SelfieWorkflow$Screen$OldCameraScreen$Mode$PlayPoseHint) mathUtils).poseHintComplete.invoke();
                break;
            case 1:
                ((SelfieWorkflow$Screen$OldCameraScreen$Mode$FinalizeLocalVideoCapture) mathUtils).onAnimationComplete.invoke();
                break;
            default:
                ((SelfieWorkflow$Screen$OldCameraScreen$Mode$ManualCaptureWithCountDown) mathUtils).onCaptureClicked.invoke();
                break;
        }
        return Unit.INSTANCE;
    }
}
