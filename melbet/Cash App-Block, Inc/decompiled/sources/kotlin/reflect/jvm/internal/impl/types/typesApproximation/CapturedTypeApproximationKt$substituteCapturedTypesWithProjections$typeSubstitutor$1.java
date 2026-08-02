package kotlin.reflect.jvm.internal.impl.types.typesApproximation;

import kotlin.reflect.jvm.internal.impl.resolve.calls.inference.CapturedTypeConstructor;
import kotlin.reflect.jvm.internal.impl.types.TypeConstructor;
import kotlin.reflect.jvm.internal.impl.types.TypeConstructorSubstitution;
import kotlin.reflect.jvm.internal.impl.types.TypeProjection;
import kotlin.reflect.jvm.internal.impl.types.TypeProjectionImpl;
import kotlin.reflect.jvm.internal.impl.types.Variance;

/* loaded from: classes9.dex */
public final class CapturedTypeApproximationKt$substituteCapturedTypesWithProjections$typeSubstitutor$1 extends TypeConstructorSubstitution {
    @Override // kotlin.reflect.jvm.internal.impl.types.TypeConstructorSubstitution
    public TypeProjection get(TypeConstructor typeConstructor) {
        typeConstructor.getClass();
        CapturedTypeConstructor capturedTypeConstructor = typeConstructor instanceof CapturedTypeConstructor ? (CapturedTypeConstructor) typeConstructor : null;
        if (capturedTypeConstructor == null) {
            return null;
        }
        return capturedTypeConstructor.getProjection().isStarProjection() ? new TypeProjectionImpl(Variance.OUT_VARIANCE, capturedTypeConstructor.getProjection().getType()) : capturedTypeConstructor.getProjection();
    }
}
