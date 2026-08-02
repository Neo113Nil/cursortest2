package kotlin.reflect.jvm.internal.impl.renderer;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes9.dex */
public final class ParameterNameRenderingPolicy {
    public static final /* synthetic */ ParameterNameRenderingPolicy[] $VALUES;
    public static final ParameterNameRenderingPolicy ALL;
    public static final ParameterNameRenderingPolicy NONE;
    public static final ParameterNameRenderingPolicy ONLY_NON_SYNTHESIZED;

    static {
        ParameterNameRenderingPolicy parameterNameRenderingPolicy = new ParameterNameRenderingPolicy("ALL", 0);
        ALL = parameterNameRenderingPolicy;
        ParameterNameRenderingPolicy parameterNameRenderingPolicy2 = new ParameterNameRenderingPolicy("ONLY_NON_SYNTHESIZED", 1);
        ONLY_NON_SYNTHESIZED = parameterNameRenderingPolicy2;
        ParameterNameRenderingPolicy parameterNameRenderingPolicy3 = new ParameterNameRenderingPolicy("NONE", 2);
        NONE = parameterNameRenderingPolicy3;
        $VALUES = new ParameterNameRenderingPolicy[]{parameterNameRenderingPolicy, parameterNameRenderingPolicy2, parameterNameRenderingPolicy3};
    }

    public static ParameterNameRenderingPolicy valueOf(String str) {
        return (ParameterNameRenderingPolicy) Enum.valueOf(ParameterNameRenderingPolicy.class, str);
    }

    public static ParameterNameRenderingPolicy[] values() {
        return (ParameterNameRenderingPolicy[]) $VALUES.clone();
    }
}
