package kotlin.reflect.jvm.internal.impl.renderer;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes9.dex */
public final class PropertyAccessorRenderingPolicy {
    public static final /* synthetic */ PropertyAccessorRenderingPolicy[] $VALUES;
    public static final PropertyAccessorRenderingPolicy DEBUG;
    public static final PropertyAccessorRenderingPolicy NONE;
    public static final PropertyAccessorRenderingPolicy PRETTY;

    static {
        PropertyAccessorRenderingPolicy propertyAccessorRenderingPolicy = new PropertyAccessorRenderingPolicy("PRETTY", 0);
        PRETTY = propertyAccessorRenderingPolicy;
        PropertyAccessorRenderingPolicy propertyAccessorRenderingPolicy2 = new PropertyAccessorRenderingPolicy("DEBUG", 1);
        DEBUG = propertyAccessorRenderingPolicy2;
        PropertyAccessorRenderingPolicy propertyAccessorRenderingPolicy3 = new PropertyAccessorRenderingPolicy("NONE", 2);
        NONE = propertyAccessorRenderingPolicy3;
        $VALUES = new PropertyAccessorRenderingPolicy[]{propertyAccessorRenderingPolicy, propertyAccessorRenderingPolicy2, propertyAccessorRenderingPolicy3};
    }

    public static PropertyAccessorRenderingPolicy valueOf(String str) {
        return (PropertyAccessorRenderingPolicy) Enum.valueOf(PropertyAccessorRenderingPolicy.class, str);
    }

    public static PropertyAccessorRenderingPolicy[] values() {
        return (PropertyAccessorRenderingPolicy[]) $VALUES.clone();
    }
}
