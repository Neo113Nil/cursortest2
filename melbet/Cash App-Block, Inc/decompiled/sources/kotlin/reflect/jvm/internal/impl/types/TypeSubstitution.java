package kotlin.reflect.jvm.internal.impl.types;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations;

/* loaded from: classes9.dex */
public abstract class TypeSubstitution {
    public static final Companion Companion = new Companion(null);
    public static final TypeSubstitution EMPTY = new TypeSubstitution$Companion$EMPTY$1();

    public static final class Companion {
        public Companion(DefaultConstructorMarker defaultConstructorMarker) {
        }
    }

    public boolean approximateCapturedTypes() {
        return false;
    }

    public boolean approximateContravariantCapturedTypes() {
        return false;
    }

    public final TypeSubstitutor buildSubstitutor() {
        TypeSubstitutor create = TypeSubstitutor.create(this);
        create.getClass();
        return create;
    }

    public Annotations filterAnnotations(Annotations annotations) {
        annotations.getClass();
        return annotations;
    }

    /* renamed from: get */
    public abstract TypeProjection mo4156get(KotlinType kotlinType);

    public boolean isEmpty() {
        return false;
    }

    public KotlinType prepareTopLevelType(KotlinType kotlinType, Variance variance) {
        kotlinType.getClass();
        variance.getClass();
        return kotlinType;
    }

    public final TypeSubstitution replaceWithNonApproximating() {
        return new TypeSubstitution() { // from class: kotlin.reflect.jvm.internal.impl.types.TypeSubstitution$replaceWithNonApproximating$1
            @Override // kotlin.reflect.jvm.internal.impl.types.TypeSubstitution
            public boolean approximateCapturedTypes() {
                return false;
            }

            @Override // kotlin.reflect.jvm.internal.impl.types.TypeSubstitution
            public boolean approximateContravariantCapturedTypes() {
                return false;
            }

            @Override // kotlin.reflect.jvm.internal.impl.types.TypeSubstitution
            public Annotations filterAnnotations(Annotations annotations) {
                annotations.getClass();
                return TypeSubstitution.this.filterAnnotations(annotations);
            }

            @Override // kotlin.reflect.jvm.internal.impl.types.TypeSubstitution
            /* renamed from: get */
            public TypeProjection mo4156get(KotlinType kotlinType) {
                kotlinType.getClass();
                return TypeSubstitution.this.mo4156get(kotlinType);
            }

            @Override // kotlin.reflect.jvm.internal.impl.types.TypeSubstitution
            public boolean isEmpty() {
                return TypeSubstitution.this.isEmpty();
            }

            @Override // kotlin.reflect.jvm.internal.impl.types.TypeSubstitution
            public KotlinType prepareTopLevelType(KotlinType kotlinType, Variance variance) {
                kotlinType.getClass();
                variance.getClass();
                return TypeSubstitution.this.prepareTopLevelType(kotlinType, variance);
            }
        };
    }
}
