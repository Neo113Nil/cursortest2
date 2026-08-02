package kotlin.reflect.jvm.internal;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes9.dex */
public final class TypeNullability {
    public static final /* synthetic */ TypeNullability[] $VALUES;
    public static final TypeNullability FLEXIBLE;
    public static final TypeNullability NOT_NULL;

    static {
        TypeNullability typeNullability = new TypeNullability("NOT_NULL", 0);
        NOT_NULL = typeNullability;
        TypeNullability typeNullability2 = new TypeNullability("NULLABLE", 1);
        TypeNullability typeNullability3 = new TypeNullability("FLEXIBLE", 2);
        FLEXIBLE = typeNullability3;
        $VALUES = new TypeNullability[]{typeNullability, typeNullability2, typeNullability3};
    }

    public static TypeNullability valueOf(String str) {
        return (TypeNullability) Enum.valueOf(TypeNullability.class, str);
    }

    public static TypeNullability[] values() {
        return (TypeNullability[]) $VALUES.clone();
    }
}
