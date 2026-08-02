package com.withpersona.sdk2.inquiry.sandbox;

/* loaded from: classes9.dex */
public final class SandboxFlags {
    public ForcedStatus debugForcedStatus;
    public boolean isSandboxModeEnabled;
    public boolean simulateGovIdNfc;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public final class ForcedStatus {
        public static final /* synthetic */ ForcedStatus[] $VALUES;
        public static final ForcedStatus Failed;
        public static final ForcedStatus Passed;

        static {
            ForcedStatus forcedStatus = new ForcedStatus("Failed", 0);
            Failed = forcedStatus;
            ForcedStatus forcedStatus2 = new ForcedStatus("Passed", 1);
            Passed = forcedStatus2;
            $VALUES = new ForcedStatus[]{forcedStatus, forcedStatus2};
        }

        public static ForcedStatus valueOf(String str) {
            return (ForcedStatus) Enum.valueOf(ForcedStatus.class, str);
        }

        public static ForcedStatus[] values() {
            return (ForcedStatus[]) $VALUES.clone();
        }
    }
}
