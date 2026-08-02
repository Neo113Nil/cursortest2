package kotlin.reflect.jvm.internal.impl.load.java.lazy.types;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes9.dex */
public final class JavaTypeFlexibility {
    public static final /* synthetic */ JavaTypeFlexibility[] $VALUES;
    public static final JavaTypeFlexibility FLEXIBLE_LOWER_BOUND;
    public static final JavaTypeFlexibility FLEXIBLE_UPPER_BOUND;
    public static final JavaTypeFlexibility INFLEXIBLE;

    static {
        JavaTypeFlexibility javaTypeFlexibility = new JavaTypeFlexibility("INFLEXIBLE", 0);
        INFLEXIBLE = javaTypeFlexibility;
        JavaTypeFlexibility javaTypeFlexibility2 = new JavaTypeFlexibility("FLEXIBLE_UPPER_BOUND", 1);
        FLEXIBLE_UPPER_BOUND = javaTypeFlexibility2;
        JavaTypeFlexibility javaTypeFlexibility3 = new JavaTypeFlexibility("FLEXIBLE_LOWER_BOUND", 2);
        FLEXIBLE_LOWER_BOUND = javaTypeFlexibility3;
        $VALUES = new JavaTypeFlexibility[]{javaTypeFlexibility, javaTypeFlexibility2, javaTypeFlexibility3};
    }

    public static JavaTypeFlexibility valueOf(String str) {
        return (JavaTypeFlexibility) Enum.valueOf(JavaTypeFlexibility.class, str);
    }

    public static JavaTypeFlexibility[] values() {
        return (JavaTypeFlexibility[]) $VALUES.clone();
    }
}
