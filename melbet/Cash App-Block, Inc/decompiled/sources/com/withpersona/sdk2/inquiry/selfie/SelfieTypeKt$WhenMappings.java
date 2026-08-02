package com.withpersona.sdk2.inquiry.selfie;

import com.withpersona.sdk2.inquiry.network.dto.NextStep;

/* loaded from: classes9.dex */
public abstract /* synthetic */ class SelfieTypeKt$WhenMappings {
    public static final /* synthetic */ int[] $EnumSwitchMapping$0;

    static {
        int[] iArr = new int[NextStep.Selfie.CaptureMethod.values().length];
        try {
            iArr[NextStep.Selfie.CaptureMethod.ONLY_CENTER.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[NextStep.Selfie.CaptureMethod.PROFILE_AND_CENTER.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[NextStep.Selfie.CaptureMethod.CONFIGURABLE_POSES.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        $EnumSwitchMapping$0 = iArr;
    }
}
