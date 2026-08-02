package com.withpersona.sdk2.inquiry.selfie.cameraScreen;

import com.google.android.gms.internal.mlkit_vision_text_common.zzpc;
import com.withpersona.sdk2.inquiry.selfie.SelfieWorkflow$Screen$CameraScreen$Mode$ManualCaptureWithCountDown;
import com.withpersona.sdk2.inquiry.selfie.SelfieWorkflow$Screen$CameraScreen$Mode$Transition;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes9.dex */
public final /* synthetic */ class CameraScreenRunner$$ExternalSyntheticLambda2 implements Function0 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ zzpc f$0;

    public /* synthetic */ CameraScreenRunner$$ExternalSyntheticLambda2(zzpc zzpcVar, int i) {
        this.$r8$classId = i;
        this.f$0 = zzpcVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.$r8$classId;
        zzpc zzpcVar = this.f$0;
        switch (i) {
            case 0:
                ((SelfieWorkflow$Screen$CameraScreen$Mode$Transition) zzpcVar).onComplete.invoke();
                break;
            default:
                ((SelfieWorkflow$Screen$CameraScreen$Mode$ManualCaptureWithCountDown) zzpcVar).onCaptureClicked.invoke();
                break;
        }
        return Unit.INSTANCE;
    }
}
