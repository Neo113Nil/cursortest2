package kotlin.reflect.jvm.internal.impl.renderer;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes9.dex */
public final class OverrideRenderingPolicy {
    public static final /* synthetic */ OverrideRenderingPolicy[] $VALUES;
    public static final OverrideRenderingPolicy RENDER_OPEN;
    public static final OverrideRenderingPolicy RENDER_OPEN_OVERRIDE;
    public static final OverrideRenderingPolicy RENDER_OVERRIDE;

    static {
        OverrideRenderingPolicy overrideRenderingPolicy = new OverrideRenderingPolicy("RENDER_OVERRIDE", 0);
        RENDER_OVERRIDE = overrideRenderingPolicy;
        OverrideRenderingPolicy overrideRenderingPolicy2 = new OverrideRenderingPolicy("RENDER_OPEN", 1);
        RENDER_OPEN = overrideRenderingPolicy2;
        OverrideRenderingPolicy overrideRenderingPolicy3 = new OverrideRenderingPolicy("RENDER_OPEN_OVERRIDE", 2);
        RENDER_OPEN_OVERRIDE = overrideRenderingPolicy3;
        $VALUES = new OverrideRenderingPolicy[]{overrideRenderingPolicy, overrideRenderingPolicy2, overrideRenderingPolicy3};
    }

    public static OverrideRenderingPolicy valueOf(String str) {
        return (OverrideRenderingPolicy) Enum.valueOf(OverrideRenderingPolicy.class, str);
    }

    public static OverrideRenderingPolicy[] values() {
        return (OverrideRenderingPolicy[]) $VALUES.clone();
    }
}
