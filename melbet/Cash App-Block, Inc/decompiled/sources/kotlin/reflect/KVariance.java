package kotlin.reflect;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes9.dex */
public final class KVariance {
    public static final /* synthetic */ KVariance[] $VALUES;
    public static final KVariance IN;
    public static final KVariance INVARIANT;
    public static final KVariance OUT;

    static {
        KVariance kVariance = new KVariance("INVARIANT", 0);
        INVARIANT = kVariance;
        KVariance kVariance2 = new KVariance("IN", 1);
        IN = kVariance2;
        KVariance kVariance3 = new KVariance("OUT", 2);
        OUT = kVariance3;
        $VALUES = new KVariance[]{kVariance, kVariance2, kVariance3};
    }

    public static KVariance valueOf(String str) {
        return (KVariance) Enum.valueOf(KVariance.class, str);
    }

    public static KVariance[] values() {
        return (KVariance[]) $VALUES.clone();
    }
}
