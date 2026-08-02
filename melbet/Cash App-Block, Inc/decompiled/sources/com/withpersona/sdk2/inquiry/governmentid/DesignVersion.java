package com.withpersona.sdk2.inquiry.governmentid;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes9.dex */
public final class DesignVersion {
    public static final /* synthetic */ DesignVersion[] $VALUES;
    public static final DesignVersion K0000;
    public static final DesignVersion V0;

    static {
        DesignVersion designVersion = new DesignVersion("V0", 0);
        V0 = designVersion;
        DesignVersion designVersion2 = new DesignVersion("K0000", 1);
        K0000 = designVersion2;
        $VALUES = new DesignVersion[]{designVersion, designVersion2};
    }

    public static DesignVersion valueOf(String str) {
        return (DesignVersion) Enum.valueOf(DesignVersion.class, str);
    }

    public static DesignVersion[] values() {
        return (DesignVersion[]) $VALUES.clone();
    }
}
