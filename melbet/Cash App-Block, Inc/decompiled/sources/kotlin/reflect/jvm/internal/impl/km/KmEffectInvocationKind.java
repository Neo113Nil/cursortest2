package kotlin.reflect.jvm.internal.impl.km;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes9.dex */
public final class KmEffectInvocationKind {
    public static final /* synthetic */ KmEffectInvocationKind[] $VALUES;
    public static final KmEffectInvocationKind AT_LEAST_ONCE;
    public static final KmEffectInvocationKind AT_MOST_ONCE;
    public static final KmEffectInvocationKind EXACTLY_ONCE;

    static {
        KmEffectInvocationKind kmEffectInvocationKind = new KmEffectInvocationKind("AT_MOST_ONCE", 0);
        AT_MOST_ONCE = kmEffectInvocationKind;
        KmEffectInvocationKind kmEffectInvocationKind2 = new KmEffectInvocationKind("EXACTLY_ONCE", 1);
        EXACTLY_ONCE = kmEffectInvocationKind2;
        KmEffectInvocationKind kmEffectInvocationKind3 = new KmEffectInvocationKind("AT_LEAST_ONCE", 2);
        AT_LEAST_ONCE = kmEffectInvocationKind3;
        $VALUES = new KmEffectInvocationKind[]{kmEffectInvocationKind, kmEffectInvocationKind2, kmEffectInvocationKind3};
    }

    public static KmEffectInvocationKind valueOf(String str) {
        return (KmEffectInvocationKind) Enum.valueOf(KmEffectInvocationKind.class, str);
    }

    public static KmEffectInvocationKind[] values() {
        return (KmEffectInvocationKind[]) $VALUES.clone();
    }
}
