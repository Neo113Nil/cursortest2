package kotlin.reflect.jvm.internal.impl.load.java;

import java.util.EnumMap;

/* loaded from: classes9.dex */
public final class JavaTypeQualifiersByElementType {
    public final EnumMap defaultQualifiers;

    public JavaTypeQualifiersByElementType(EnumMap<AnnotationQualifierApplicabilityType, JavaDefaultQualifiers> enumMap) {
        enumMap.getClass();
        this.defaultQualifiers = enumMap;
    }

    public final JavaDefaultQualifiers get(AnnotationQualifierApplicabilityType annotationQualifierApplicabilityType) {
        return (JavaDefaultQualifiers) this.defaultQualifiers.get(annotationQualifierApplicabilityType);
    }

    public final EnumMap<AnnotationQualifierApplicabilityType, JavaDefaultQualifiers> getDefaultQualifiers() {
        return this.defaultQualifiers;
    }
}
