package kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes9.dex */
public final class MutabilityQualifier {
    public static final /* synthetic */ MutabilityQualifier[] $VALUES;
    public static final MutabilityQualifier MUTABLE;
    public static final MutabilityQualifier READ_ONLY;

    static {
        MutabilityQualifier mutabilityQualifier = new MutabilityQualifier("READ_ONLY", 0);
        READ_ONLY = mutabilityQualifier;
        MutabilityQualifier mutabilityQualifier2 = new MutabilityQualifier("MUTABLE", 1);
        MUTABLE = mutabilityQualifier2;
        $VALUES = new MutabilityQualifier[]{mutabilityQualifier, mutabilityQualifier2};
    }

    public static MutabilityQualifier valueOf(String str) {
        return (MutabilityQualifier) Enum.valueOf(MutabilityQualifier.class, str);
    }

    public static MutabilityQualifier[] values() {
        return (MutabilityQualifier[]) $VALUES.clone();
    }
}
