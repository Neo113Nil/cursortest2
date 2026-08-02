package com.withpersona.sdk2.inquiry.selfie.cameraScreen;

/* loaded from: classes9.dex */
public final /* synthetic */ class BasicSelfieCaptureViewController$$ExternalSyntheticLambda10 implements Runnable {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ BasicSelfieCaptureViewController f$0;

    public /* synthetic */ BasicSelfieCaptureViewController$$ExternalSyntheticLambda10(BasicSelfieCaptureViewController basicSelfieCaptureViewController, int i) {
        this.$r8$classId = i;
        this.f$0 = basicSelfieCaptureViewController;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.$r8$classId;
        BasicSelfieCaptureViewController basicSelfieCaptureViewController = this.f$0;
        switch (i) {
            case 0:
                basicSelfieCaptureViewController.isHintBodyAnimatingOut = false;
                break;
            case 1:
                basicSelfieCaptureViewController.isHintBodyAnimatingIn = false;
                break;
            case 2:
                basicSelfieCaptureViewController.isFinalizingCoverAnimatingIn = false;
                break;
            case 3:
                basicSelfieCaptureViewController.isHintTitleAnimatingOut = false;
                break;
            default:
                basicSelfieCaptureViewController.isHintTitleAnimatingIn = false;
                break;
        }
    }
}
