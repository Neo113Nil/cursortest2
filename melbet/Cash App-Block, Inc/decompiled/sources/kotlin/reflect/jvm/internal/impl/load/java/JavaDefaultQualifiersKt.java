package kotlin.reflect.jvm.internal.impl.load.java;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.collections.CollectionsKt__CollectionsJVMKt;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.MapsKt__MapsKt;
import kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.NullabilityQualifier;
import kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.WithMigrationStatus;
import kotlin.reflect.jvm.internal.impl.name.FqName;

/* loaded from: classes9.dex */
public final class JavaDefaultQualifiersKt {
    public static final List APPLICABILITY_OF_JAVAX_DEFAULTS;
    public static final List APPLICABILITY_OF_JSPECIFY_DEFAULTS;
    public static final LinkedHashMap BUILT_IN_TYPE_QUALIFIER_DEFAULT_ANNOTATIONS;
    public static final Map JSPECIFY_DEFAULT_ANNOTATIONS;

    static {
        AnnotationQualifierApplicabilityType annotationQualifierApplicabilityType = AnnotationQualifierApplicabilityType.FIELD;
        AnnotationQualifierApplicabilityType annotationQualifierApplicabilityType2 = AnnotationQualifierApplicabilityType.METHOD_RETURN_TYPE;
        AnnotationQualifierApplicabilityType annotationQualifierApplicabilityType3 = AnnotationQualifierApplicabilityType.VALUE_PARAMETER;
        List listOf = CollectionsKt__CollectionsKt.listOf((Object[]) new AnnotationQualifierApplicabilityType[]{annotationQualifierApplicabilityType, annotationQualifierApplicabilityType2, annotationQualifierApplicabilityType3, AnnotationQualifierApplicabilityType.TYPE_PARAMETER_BOUNDS, AnnotationQualifierApplicabilityType.TYPE_USE});
        APPLICABILITY_OF_JSPECIFY_DEFAULTS = listOf;
        List listOf2 = CollectionsKt__CollectionsJVMKt.listOf(annotationQualifierApplicabilityType3);
        APPLICABILITY_OF_JAVAX_DEFAULTS = listOf2;
        FqName jspecify_old_null_marked_annotation_fq_name = JvmAnnotationNamesKt.getJSPECIFY_OLD_NULL_MARKED_ANNOTATION_FQ_NAME();
        NullabilityQualifier nullabilityQualifier = NullabilityQualifier.NOT_NULL;
        List list = listOf;
        Map mapOf = MapsKt__MapsKt.mapOf(new Pair(jspecify_old_null_marked_annotation_fq_name, new JavaDefaultQualifiers(new WithMigrationStatus(nullabilityQualifier, false, 2, null), list, false, true, true)), new Pair(JvmAnnotationNamesKt.getJSPECIFY_NULL_MARKED_ANNOTATION_FQ_NAME(), new JavaDefaultQualifiers(new WithMigrationStatus(nullabilityQualifier, false, 2, null), list, false, true, true)), new Pair(JvmAnnotationNamesKt.getJSPECIFY_NULL_UNMARKED_ANNOTATION_FQ_NAME(), new JavaDefaultQualifiers(new WithMigrationStatus(NullabilityQualifier.FORCE_FLEXIBILITY, false, 2, null), list, false, true, true, 4, null)));
        JSPECIFY_DEFAULT_ANNOTATIONS = mapOf;
        List list2 = listOf2;
        BUILT_IN_TYPE_QUALIFIER_DEFAULT_ANNOTATIONS = MapsKt__MapsKt.plus(mapOf, MapsKt__MapsKt.mapOf(new Pair(JvmAnnotationNamesKt.getJAVAX_PARAMETERS_ARE_NONNULL_BY_DEFAULT_ANNOTATION_FQ_NAME(), new JavaDefaultQualifiers(new WithMigrationStatus(nullabilityQualifier, false, 2, null), list2, false, false, false, 28, null)), new Pair(JvmAnnotationNamesKt.getJAVAX_PARAMETERS_ARE_NULLABLE_BY_DEFAULT_ANNOTATION_FQ_NAME(), new JavaDefaultQualifiers(new WithMigrationStatus(NullabilityQualifier.NULLABLE, false, 2, null), list2, false, false, false, 28, null))));
    }

    public static final Map<FqName, JavaDefaultQualifiers> getBUILT_IN_TYPE_QUALIFIER_DEFAULT_ANNOTATIONS() {
        return BUILT_IN_TYPE_QUALIFIER_DEFAULT_ANNOTATIONS;
    }

    public static final Map<FqName, JavaDefaultQualifiers> getJSPECIFY_DEFAULT_ANNOTATIONS() {
        return JSPECIFY_DEFAULT_ANNOTATIONS;
    }
}
