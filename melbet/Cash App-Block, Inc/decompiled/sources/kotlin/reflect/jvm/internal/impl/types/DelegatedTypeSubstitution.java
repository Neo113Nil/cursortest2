package kotlin.reflect.jvm.internal.impl.types;

import kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations;

/* loaded from: classes9.dex */
public class DelegatedTypeSubstitution extends TypeSubstitution {
    public final TypeSubstitution substitution;

    public DelegatedTypeSubstitution(TypeSubstitution typeSubstitution) {
        typeSubstitution.getClass();
        this.substitution = typeSubstitution;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.TypeSubstitution
    public boolean approximateCapturedTypes() {
        return this.substitution.approximateCapturedTypes();
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.TypeSubstitution
    public boolean approximateContravariantCapturedTypes() {
        return this.substitution.approximateContravariantCapturedTypes();
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.TypeSubstitution
    public Annotations filterAnnotations(Annotations annotations) {
        annotations.getClass();
        return this.substitution.filterAnnotations(annotations);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.TypeSubstitution
    /* renamed from: get */
    public TypeProjection mo4156get(KotlinType kotlinType) {
        kotlinType.getClass();
        return this.substitution.mo4156get(kotlinType);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.TypeSubstitution
    public boolean isEmpty() {
        return this.substitution.isEmpty();
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.TypeSubstitution
    public KotlinType prepareTopLevelType(KotlinType kotlinType, Variance variance) {
        kotlinType.getClass();
        variance.getClass();
        return this.substitution.prepareTopLevelType(kotlinType, variance);
    }
}
