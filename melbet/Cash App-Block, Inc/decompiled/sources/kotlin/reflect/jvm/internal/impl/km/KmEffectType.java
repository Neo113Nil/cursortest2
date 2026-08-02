package kotlin.reflect.jvm.internal.impl.km;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes9.dex */
public final class KmEffectType {
    public static final /* synthetic */ KmEffectType[] $VALUES;
    public static final KmEffectType CALLS;
    public static final KmEffectType RETURNS_CONSTANT;
    public static final KmEffectType RETURNS_NOT_NULL;

    static {
        KmEffectType kmEffectType = new KmEffectType("RETURNS_CONSTANT", 0);
        RETURNS_CONSTANT = kmEffectType;
        KmEffectType kmEffectType2 = new KmEffectType("CALLS", 1);
        CALLS = kmEffectType2;
        KmEffectType kmEffectType3 = new KmEffectType("RETURNS_NOT_NULL", 2);
        RETURNS_NOT_NULL = kmEffectType3;
        $VALUES = new KmEffectType[]{kmEffectType, kmEffectType2, kmEffectType3};
    }

    public static KmEffectType valueOf(String str) {
        return (KmEffectType) Enum.valueOf(KmEffectType.class, str);
    }

    public static KmEffectType[] values() {
        return (KmEffectType[]) $VALUES.clone();
    }
}
