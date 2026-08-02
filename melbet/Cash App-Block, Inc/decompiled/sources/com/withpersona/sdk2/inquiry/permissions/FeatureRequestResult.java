package com.withpersona.sdk2.inquiry.permissions;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes9.dex */
public final class FeatureRequestResult {
    public static final /* synthetic */ FeatureRequestResult[] $VALUES;
    public static final FeatureRequestResult Failure;
    public static final FeatureRequestResult SettingsLaunched;
    public static final FeatureRequestResult Success;

    static {
        FeatureRequestResult featureRequestResult = new FeatureRequestResult("Success", 0);
        Success = featureRequestResult;
        FeatureRequestResult featureRequestResult2 = new FeatureRequestResult("Failure", 1);
        Failure = featureRequestResult2;
        FeatureRequestResult featureRequestResult3 = new FeatureRequestResult("SettingsLaunched", 2);
        SettingsLaunched = featureRequestResult3;
        $VALUES = new FeatureRequestResult[]{featureRequestResult, featureRequestResult2, featureRequestResult3};
    }

    public static FeatureRequestResult valueOf(String str) {
        return (FeatureRequestResult) Enum.valueOf(FeatureRequestResult.class, str);
    }

    public static FeatureRequestResult[] values() {
        return (FeatureRequestResult[]) $VALUES.clone();
    }
}
