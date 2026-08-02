package com.withpersona.sdk2.camera.selfie;

import androidx.credentials.Credential;

/* loaded from: classes9.dex */
public final class SelfieFrameInfo {
    public final SelfieBrightnessInfo brightnessInfo;
    public final SelfieError error;
    public final float faceAngle;
    public final int facesInFrame;
    public final boolean isFaceCentered;
    public final boolean isFaceTooClose;
    public final boolean isFaceTooFar;
    public final Credential selfiePhoto;

    public SelfieFrameInfo(Credential credential, SelfieError selfieError, int i, boolean z, boolean z2, boolean z3, float f, SelfieBrightnessInfo selfieBrightnessInfo) {
        this.selfiePhoto = credential;
        this.error = selfieError;
        this.facesInFrame = i;
        this.isFaceTooClose = z;
        this.isFaceTooFar = z2;
        this.isFaceCentered = z3;
        this.faceAngle = f;
        this.brightnessInfo = selfieBrightnessInfo;
    }
}
