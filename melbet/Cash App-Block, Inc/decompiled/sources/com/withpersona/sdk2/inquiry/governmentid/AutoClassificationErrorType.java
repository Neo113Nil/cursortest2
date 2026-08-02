package com.withpersona.sdk2.inquiry.governmentid;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes9.dex */
public final class AutoClassificationErrorType {
    public static final /* synthetic */ AutoClassificationErrorType[] $VALUES;
    public static final AutoClassificationErrorType IdTypeRejected;
    public static final AutoClassificationErrorType UnableToClassify;

    static {
        AutoClassificationErrorType autoClassificationErrorType = new AutoClassificationErrorType("IdTypeRejected", 0);
        IdTypeRejected = autoClassificationErrorType;
        AutoClassificationErrorType autoClassificationErrorType2 = new AutoClassificationErrorType("UnableToClassify", 1);
        UnableToClassify = autoClassificationErrorType2;
        $VALUES = new AutoClassificationErrorType[]{autoClassificationErrorType, autoClassificationErrorType2};
    }

    public static AutoClassificationErrorType valueOf(String str) {
        return (AutoClassificationErrorType) Enum.valueOf(AutoClassificationErrorType.class, str);
    }

    public static AutoClassificationErrorType[] values() {
        return (AutoClassificationErrorType[]) $VALUES.clone();
    }
}
