package com.withpersona.sdk2.camera.selfie;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes5.dex */
public final class SelfieError {
    public static final /* synthetic */ SelfieError[] $VALUES;
    public static final SelfieError FaceDetectionUnsupported;
    public static final SelfieError FaceNotCentered;
    public static final SelfieError FaceNotFound;
    public static final SelfieError FaceTooClose;
    public static final SelfieError FaceTooFar;
    public static final SelfieError IncompleteFace;
    public static final SelfieError IncorrectPose;
    public static final SelfieError MultipleFaces;
    public static final SelfieError Other;

    static {
        SelfieError selfieError = new SelfieError("FaceNotCentered", 0);
        FaceNotCentered = selfieError;
        SelfieError selfieError2 = new SelfieError("FaceTooClose", 1);
        FaceTooClose = selfieError2;
        SelfieError selfieError3 = new SelfieError("FaceTooFar", 2);
        FaceTooFar = selfieError3;
        SelfieError selfieError4 = new SelfieError("MultipleFaces", 3);
        MultipleFaces = selfieError4;
        SelfieError selfieError5 = new SelfieError("IncompleteFace", 4);
        IncompleteFace = selfieError5;
        SelfieError selfieError6 = new SelfieError("FaceNotFound", 5);
        FaceNotFound = selfieError6;
        SelfieError selfieError7 = new SelfieError("IncorrectPose", 6);
        IncorrectPose = selfieError7;
        SelfieError selfieError8 = new SelfieError("FaceDetectionUnsupported", 7);
        FaceDetectionUnsupported = selfieError8;
        SelfieError selfieError9 = new SelfieError("Other", 8);
        Other = selfieError9;
        $VALUES = new SelfieError[]{selfieError, selfieError2, selfieError3, selfieError4, selfieError5, selfieError6, selfieError7, selfieError8, selfieError9};
    }

    public static SelfieError valueOf(String str) {
        return (SelfieError) Enum.valueOf(SelfieError.class, str);
    }

    public static SelfieError[] values() {
        return (SelfieError[]) $VALUES.clone();
    }
}
