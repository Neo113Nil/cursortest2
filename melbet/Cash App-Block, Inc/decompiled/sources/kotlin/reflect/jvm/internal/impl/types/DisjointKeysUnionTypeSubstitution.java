package kotlin.reflect.jvm.internal.impl.types;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations;

/* loaded from: classes9.dex */
public final class DisjointKeysUnionTypeSubstitution extends TypeSubstitution {
    public static final Companion Companion = new Companion(null);
    public final TypeSubstitution first;
    public final TypeSubstitution second;

    public static final class Companion {
        public Companion(DefaultConstructorMarker defaultConstructorMarker) {
        }

        public final TypeSubstitution create(TypeSubstitution typeSubstitution, TypeSubstitution typeSubstitution2) {
            typeSubstitution.getClass();
            typeSubstitution2.getClass();
            return typeSubstitution.isEmpty() ? typeSubstitution2 : typeSubstitution2.isEmpty() ? typeSubstitution : new DisjointKeysUnionTypeSubstitution(typeSubstitution, typeSubstitution2, null);
        }
    }

    public DisjointKeysUnionTypeSubstitution(TypeSubstitution typeSubstitution, TypeSubstitution typeSubstitution2, DefaultConstructorMarker defaultConstructorMarker) {
        this.first = typeSubstitution;
        this.second = typeSubstitution2;
    }

    public static final TypeSubstitution create(TypeSubstitution typeSubstitution, TypeSubstitution typeSubstitution2) {
        return Companion.create(typeSubstitution, typeSubstitution2);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.TypeSubstitution
    public boolean approximateCapturedTypes() {
        return this.first.approximateCapturedTypes() || this.second.approximateCapturedTypes();
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.TypeSubstitution
    public boolean approximateContravariantCapturedTypes() {
        return this.first.approximateContravariantCapturedTypes() || this.second.approximateContravariantCapturedTypes();
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.TypeSubstitution
    public Annotations filterAnnotations(Annotations annotations) {
        annotations.getClass();
        return this.second.filterAnnotations(this.first.filterAnnotations(annotations));
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.TypeSubstitution
    /* renamed from: get */
    public TypeProjection mo4156get(KotlinType kotlinType) {
        kotlinType.getClass();
        TypeProjection mo4156get = this.first.mo4156get(kotlinType);
        return mo4156get == null ? this.second.mo4156get(kotlinType) : mo4156get;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.TypeSubstitution
    public boolean isEmpty() {
        return false;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.TypeSubstitution
    public KotlinType prepareTopLevelType(KotlinType kotlinType, Variance variance) {
        kotlinType.getClass();
        variance.getClass();
        return this.second.prepareTopLevelType(this.first.prepareTopLevelType(kotlinType, variance), variance);
    }
}
