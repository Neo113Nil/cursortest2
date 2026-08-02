package com.withpersona.sdk2.inquiry.internal.state;

import androidx.camera.video.VideoCapture;

/* loaded from: classes9.dex */
public final class LoadingStepModel implements IntermediateStepModel {
    public final VideoCapture.AnonymousClass3 inquiryLoadingScreen;

    public LoadingStepModel(VideoCapture.AnonymousClass3 anonymousClass3) {
        this.inquiryLoadingScreen = anonymousClass3;
    }

    @Override // com.withpersona.sdk2.inquiry.internal.state.IntermediateStepModel
    public final String getName() {
        return "$pi2_loading";
    }
}
