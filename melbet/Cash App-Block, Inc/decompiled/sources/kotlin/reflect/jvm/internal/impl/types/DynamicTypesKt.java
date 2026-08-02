package kotlin.reflect.jvm.internal.impl.types;

/* loaded from: classes9.dex */
public final class DynamicTypesKt {
    public static final boolean isDynamic(KotlinType kotlinType) {
        kotlinType.getClass();
        return kotlinType.unwrap() instanceof DynamicType;
    }
}
