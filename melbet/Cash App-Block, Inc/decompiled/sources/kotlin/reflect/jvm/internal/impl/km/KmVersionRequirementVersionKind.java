package kotlin.reflect.jvm.internal.impl.km;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes9.dex */
public final class KmVersionRequirementVersionKind {
    public static final /* synthetic */ KmVersionRequirementVersionKind[] $VALUES;
    public static final KmVersionRequirementVersionKind API_VERSION;
    public static final KmVersionRequirementVersionKind COMPILER_VERSION;
    public static final KmVersionRequirementVersionKind LANGUAGE_VERSION;
    public static final KmVersionRequirementVersionKind UNKNOWN;

    static {
        KmVersionRequirementVersionKind kmVersionRequirementVersionKind = new KmVersionRequirementVersionKind("LANGUAGE_VERSION", 0);
        LANGUAGE_VERSION = kmVersionRequirementVersionKind;
        KmVersionRequirementVersionKind kmVersionRequirementVersionKind2 = new KmVersionRequirementVersionKind("COMPILER_VERSION", 1);
        COMPILER_VERSION = kmVersionRequirementVersionKind2;
        KmVersionRequirementVersionKind kmVersionRequirementVersionKind3 = new KmVersionRequirementVersionKind("API_VERSION", 2);
        API_VERSION = kmVersionRequirementVersionKind3;
        KmVersionRequirementVersionKind kmVersionRequirementVersionKind4 = new KmVersionRequirementVersionKind("UNKNOWN", 3);
        UNKNOWN = kmVersionRequirementVersionKind4;
        $VALUES = new KmVersionRequirementVersionKind[]{kmVersionRequirementVersionKind, kmVersionRequirementVersionKind2, kmVersionRequirementVersionKind3, kmVersionRequirementVersionKind4};
    }

    public static KmVersionRequirementVersionKind valueOf(String str) {
        return (KmVersionRequirementVersionKind) Enum.valueOf(KmVersionRequirementVersionKind.class, str);
    }

    public static KmVersionRequirementVersionKind[] values() {
        return (KmVersionRequirementVersionKind[]) $VALUES.clone();
    }
}
