package kotlin.reflect.jvm.internal.impl.types;

import kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns;
import kotlin.reflect.jvm.internal.impl.types.checker.KotlinTypeRefiner;

/* loaded from: classes9.dex */
public final class StarProjectionForAbsentTypeParameter extends TypeProjectionBase {
    public final SimpleType nullableAnyType;

    public StarProjectionForAbsentTypeParameter(KotlinBuiltIns kotlinBuiltIns) {
        kotlinBuiltIns.getClass();
        SimpleType nullableAnyType = kotlinBuiltIns.getNullableAnyType();
        nullableAnyType.getClass();
        this.nullableAnyType = nullableAnyType;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.TypeProjection
    public Variance getProjectionKind() {
        return Variance.OUT_VARIANCE;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.TypeProjection
    public KotlinType getType() {
        return this.nullableAnyType;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.TypeProjection
    public boolean isStarProjection() {
        return true;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.TypeProjection
    public TypeProjection refine(KotlinTypeRefiner kotlinTypeRefiner) {
        kotlinTypeRefiner.getClass();
        return this;
    }
}
