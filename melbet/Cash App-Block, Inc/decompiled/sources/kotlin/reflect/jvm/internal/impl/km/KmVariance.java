package kotlin.reflect.jvm.internal.impl.km;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes9.dex */
public final class KmVariance {
    public static final /* synthetic */ KmVariance[] $VALUES;
    public static final KmVariance IN;
    public static final KmVariance INVARIANT;
    public static final KmVariance OUT;

    static {
        KmVariance kmVariance = new KmVariance("INVARIANT", 0);
        INVARIANT = kmVariance;
        KmVariance kmVariance2 = new KmVariance("IN", 1);
        IN = kmVariance2;
        KmVariance kmVariance3 = new KmVariance("OUT", 2);
        OUT = kmVariance3;
        $VALUES = new KmVariance[]{kmVariance, kmVariance2, kmVariance3};
    }

    public static KmVariance valueOf(String str) {
        return (KmVariance) Enum.valueOf(KmVariance.class, str);
    }

    public static KmVariance[] values() {
        return (KmVariance[]) $VALUES.clone();
    }
}
