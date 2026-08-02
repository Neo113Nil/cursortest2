package com.withpersona.sdk2.inquiry.selfie;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes9.dex */
public final class SelfieHintPose {
    public static final /* synthetic */ SelfieHintPose[] $VALUES;
    public static final SelfieHintPose Left;
    public static final SelfieHintPose Right;

    /* JADX INFO: Fake field, exist only in values array */
    SelfieHintPose EF0;

    static {
        SelfieHintPose selfieHintPose = new SelfieHintPose("Center", 0);
        SelfieHintPose selfieHintPose2 = new SelfieHintPose("Left", 1);
        Left = selfieHintPose2;
        SelfieHintPose selfieHintPose3 = new SelfieHintPose("Right", 2);
        Right = selfieHintPose3;
        $VALUES = new SelfieHintPose[]{selfieHintPose, selfieHintPose2, selfieHintPose3};
    }

    public static SelfieHintPose valueOf(String str) {
        return (SelfieHintPose) Enum.valueOf(SelfieHintPose.class, str);
    }

    public static SelfieHintPose[] values() {
        return (SelfieHintPose[]) $VALUES.clone();
    }
}
