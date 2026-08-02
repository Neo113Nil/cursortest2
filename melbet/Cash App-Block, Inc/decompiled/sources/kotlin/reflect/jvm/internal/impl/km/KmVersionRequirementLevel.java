package kotlin.reflect.jvm.internal.impl.km;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes9.dex */
public final class KmVersionRequirementLevel {
    public static final /* synthetic */ KmVersionRequirementLevel[] $VALUES;
    public static final KmVersionRequirementLevel ERROR;
    public static final KmVersionRequirementLevel HIDDEN;
    public static final KmVersionRequirementLevel WARNING;

    static {
        KmVersionRequirementLevel kmVersionRequirementLevel = new KmVersionRequirementLevel("WARNING", 0);
        WARNING = kmVersionRequirementLevel;
        KmVersionRequirementLevel kmVersionRequirementLevel2 = new KmVersionRequirementLevel("ERROR", 1);
        ERROR = kmVersionRequirementLevel2;
        KmVersionRequirementLevel kmVersionRequirementLevel3 = new KmVersionRequirementLevel("HIDDEN", 2);
        HIDDEN = kmVersionRequirementLevel3;
        $VALUES = new KmVersionRequirementLevel[]{kmVersionRequirementLevel, kmVersionRequirementLevel2, kmVersionRequirementLevel3};
    }

    public static KmVersionRequirementLevel valueOf(String str) {
        return (KmVersionRequirementLevel) Enum.valueOf(KmVersionRequirementLevel.class, str);
    }

    public static KmVersionRequirementLevel[] values() {
        return (KmVersionRequirementLevel[]) $VALUES.clone();
    }
}
