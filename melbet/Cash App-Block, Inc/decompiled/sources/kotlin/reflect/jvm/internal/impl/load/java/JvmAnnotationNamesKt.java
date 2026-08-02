package kotlin.reflect.jvm.internal.impl.load.java;

import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.Pair;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.collections.MapsKt__MapsKt;
import kotlin.collections.SetsKt___SetsKt;
import kotlin.reflect.jvm.internal.impl.builtins.StandardNames;
import kotlin.reflect.jvm.internal.impl.name.FqName;

/* loaded from: classes9.dex */
public final class JvmAnnotationNamesKt {
    public static final Set BUILT_IN_TYPE_QUALIFIER_ANNOTATIONS;
    public static final Set FORCE_FLEXIBILITY_ANNOTATIONS;
    public static final FqName JAVAX_NONNULL_ANNOTATION_FQ_NAME;
    public static final FqName JAVAX_PARAMETERS_ARE_NONNULL_BY_DEFAULT_ANNOTATION_FQ_NAME;
    public static final FqName JAVAX_PARAMETERS_ARE_NULLABLE_BY_DEFAULT_ANNOTATION_FQ_NAME;
    public static final FqName JAVAX_TYPE_QUALIFIER_ANNOTATION_FQ_NAME;
    public static final FqName JAVAX_TYPE_QUALIFIER_DEFAULT_ANNOTATION_FQ_NAME;
    public static final FqName JAVAX_TYPE_QUALIFIER_NICKNAME_ANNOTATION_FQ_NAME;
    public static final FqName JSPECIFY_NULL_MARKED_ANNOTATION_FQ_NAME;
    public static final FqName JSPECIFY_NULL_UNMARKED_ANNOTATION_FQ_NAME;
    public static final FqName JSPECIFY_OLD_NULL_MARKED_ANNOTATION_FQ_NAME;
    public static final Set MUTABLE_ANNOTATIONS;
    public static final Set NOT_NULL_ANNOTATIONS;
    public static final Set NULLABLE_ANNOTATIONS;
    public static final Set READ_ONLY_ANNOTATIONS;
    public static final FqName UNDER_MIGRATION_ANNOTATION_FQ_NAME;

    static {
        FqName fqName = new FqName("org.jspecify.nullness.Nullable");
        FqName fqName2 = new FqName("org.jspecify.nullness.NullMarked");
        JSPECIFY_OLD_NULL_MARKED_ANNOTATION_FQ_NAME = fqName2;
        FqName fqName3 = new FqName("org.jspecify.nullness.NullnessUnspecified");
        FqName fqName4 = new FqName("org.jspecify.annotations.NonNull");
        FqName fqName5 = new FqName("org.jspecify.annotations.Nullable");
        FqName fqName6 = new FqName("org.jspecify.annotations.NullMarked");
        JSPECIFY_NULL_MARKED_ANNOTATION_FQ_NAME = fqName6;
        FqName fqName7 = new FqName("org.jspecify.annotations.NullnessUnspecified");
        FqName fqName8 = new FqName("org.jspecify.annotations.NullUnmarked");
        JSPECIFY_NULL_UNMARKED_ANNOTATION_FQ_NAME = fqName8;
        JAVAX_TYPE_QUALIFIER_ANNOTATION_FQ_NAME = new FqName("javax.annotation.meta.TypeQualifier");
        JAVAX_TYPE_QUALIFIER_NICKNAME_ANNOTATION_FQ_NAME = new FqName("javax.annotation.meta.TypeQualifierNickname");
        JAVAX_TYPE_QUALIFIER_DEFAULT_ANNOTATION_FQ_NAME = new FqName("javax.annotation.meta.TypeQualifierDefault");
        FqName fqName9 = new FqName("javax.annotation.Nonnull");
        JAVAX_NONNULL_ANNOTATION_FQ_NAME = fqName9;
        FqName fqName10 = new FqName("javax.annotation.Nullable");
        FqName fqName11 = new FqName("javax.annotation.CheckForNull");
        JAVAX_PARAMETERS_ARE_NONNULL_BY_DEFAULT_ANNOTATION_FQ_NAME = new FqName("javax.annotation.ParametersAreNonnullByDefault");
        JAVAX_PARAMETERS_ARE_NULLABLE_BY_DEFAULT_ANNOTATION_FQ_NAME = new FqName("javax.annotation.ParametersAreNullableByDefault");
        BUILT_IN_TYPE_QUALIFIER_ANNOTATIONS = ArraysKt___ArraysKt.toSet(new FqName[]{fqName9, fqName11});
        FqName fqName12 = JvmAnnotationNames.JETBRAINS_NOT_NULL_ANNOTATION;
        fqName12.getClass();
        Set set = ArraysKt___ArraysKt.toSet(new FqName[]{fqName12, fqName4, new FqName("android.annotation.NonNull"), new FqName("androidx.annotation.NonNull"), new FqName("androidx.annotation.RecentlyNonNull"), new FqName("android.support.annotation.NonNull"), new FqName("com.android.annotations.NonNull"), new FqName("org.checkerframework.checker.nullness.compatqual.NonNullDecl"), new FqName("org.checkerframework.checker.nullness.qual.NonNull"), new FqName("edu.umd.cs.findbugs.annotations.NonNull"), new FqName("io.reactivex.annotations.NonNull"), new FqName("io.reactivex.rxjava3.annotations.NonNull"), new FqName("org.eclipse.jdt.annotation.NonNull"), new FqName("lombok.NonNull"), new FqName("jakarta.annotation.Nonnull")});
        NOT_NULL_ANNOTATIONS = set;
        FqName fqName13 = JvmAnnotationNames.JETBRAINS_NULLABLE_ANNOTATION;
        fqName13.getClass();
        Set set2 = ArraysKt___ArraysKt.toSet(new FqName[]{fqName13, fqName, fqName5, fqName10, fqName11, new FqName("android.annotation.Nullable"), new FqName("androidx.annotation.Nullable"), new FqName("androidx.annotation.RecentlyNullable"), new FqName("android.support.annotation.Nullable"), new FqName("com.android.annotations.Nullable"), new FqName("org.checkerframework.checker.nullness.compatqual.NullableDecl"), new FqName("org.checkerframework.checker.nullness.qual.Nullable"), new FqName("edu.umd.cs.findbugs.annotations.Nullable"), new FqName("edu.umd.cs.findbugs.annotations.PossiblyNull"), new FqName("edu.umd.cs.findbugs.annotations.CheckForNull"), new FqName("io.reactivex.annotations.Nullable"), new FqName("io.reactivex.rxjava3.annotations.Nullable"), new FqName("org.eclipse.jdt.annotation.Nullable"), new FqName("jakarta.annotation.Nullable"), new FqName("io.vertx.codegen.annotations.Nullable")});
        NULLABLE_ANNOTATIONS = set2;
        FORCE_FLEXIBILITY_ANNOTATIONS = ArraysKt___ArraysKt.toSet(new FqName[]{fqName3, fqName7});
        SetsKt___SetsKt.plus(SetsKt___SetsKt.plus(SetsKt___SetsKt.plus(SetsKt___SetsKt.plus(SetsKt___SetsKt.plus((Set) SetsKt___SetsKt.plus((Set) new LinkedHashSet(), (Iterable) set), (Iterable) set2), fqName9), fqName2), fqName6), fqName8);
        READ_ONLY_ANNOTATIONS = ArraysKt___ArraysKt.toSet(new FqName[]{JvmAnnotationNames.JETBRAINS_READONLY_ANNOTATION, JvmAnnotationNames.READONLY_ANNOTATION, JvmAnnotationNames.JETBRAINS_UNMODIFIABLE_ANNOTATION, JvmAnnotationNames.JETBRAINS_UNMODIFIABLE_VIEW_ANNOTATION});
        MUTABLE_ANNOTATIONS = ArraysKt___ArraysKt.toSet(new FqName[]{JvmAnnotationNames.JETBRAINS_MUTABLE_ANNOTATION, JvmAnnotationNames.MUTABLE_ANNOTATION});
        MapsKt__MapsKt.mapOf(new Pair(JvmAnnotationNames.TARGET_ANNOTATION, StandardNames.FqNames.target), new Pair(JvmAnnotationNames.RETENTION_ANNOTATION, StandardNames.FqNames.retention), new Pair(JvmAnnotationNames.DEPRECATED_ANNOTATION, StandardNames.FqNames.deprecated), new Pair(JvmAnnotationNames.DOCUMENTED_ANNOTATION, StandardNames.FqNames.mustBeDocumented));
        UNDER_MIGRATION_ANNOTATION_FQ_NAME = new FqName("kotlin.annotations.jvm.UnderMigration");
    }

    public static final Set<FqName> getBUILT_IN_TYPE_QUALIFIER_ANNOTATIONS() {
        return BUILT_IN_TYPE_QUALIFIER_ANNOTATIONS;
    }

    public static final Set<FqName> getFORCE_FLEXIBILITY_ANNOTATIONS() {
        return FORCE_FLEXIBILITY_ANNOTATIONS;
    }

    public static final FqName getJAVAX_NONNULL_ANNOTATION_FQ_NAME() {
        return JAVAX_NONNULL_ANNOTATION_FQ_NAME;
    }

    public static final FqName getJAVAX_PARAMETERS_ARE_NONNULL_BY_DEFAULT_ANNOTATION_FQ_NAME() {
        return JAVAX_PARAMETERS_ARE_NONNULL_BY_DEFAULT_ANNOTATION_FQ_NAME;
    }

    public static final FqName getJAVAX_PARAMETERS_ARE_NULLABLE_BY_DEFAULT_ANNOTATION_FQ_NAME() {
        return JAVAX_PARAMETERS_ARE_NULLABLE_BY_DEFAULT_ANNOTATION_FQ_NAME;
    }

    public static final FqName getJAVAX_TYPE_QUALIFIER_ANNOTATION_FQ_NAME() {
        return JAVAX_TYPE_QUALIFIER_ANNOTATION_FQ_NAME;
    }

    public static final FqName getJAVAX_TYPE_QUALIFIER_DEFAULT_ANNOTATION_FQ_NAME() {
        return JAVAX_TYPE_QUALIFIER_DEFAULT_ANNOTATION_FQ_NAME;
    }

    public static final FqName getJAVAX_TYPE_QUALIFIER_NICKNAME_ANNOTATION_FQ_NAME() {
        return JAVAX_TYPE_QUALIFIER_NICKNAME_ANNOTATION_FQ_NAME;
    }

    public static final FqName getJSPECIFY_NULL_MARKED_ANNOTATION_FQ_NAME() {
        return JSPECIFY_NULL_MARKED_ANNOTATION_FQ_NAME;
    }

    public static final FqName getJSPECIFY_NULL_UNMARKED_ANNOTATION_FQ_NAME() {
        return JSPECIFY_NULL_UNMARKED_ANNOTATION_FQ_NAME;
    }

    public static final FqName getJSPECIFY_OLD_NULL_MARKED_ANNOTATION_FQ_NAME() {
        return JSPECIFY_OLD_NULL_MARKED_ANNOTATION_FQ_NAME;
    }

    public static final Set<FqName> getMUTABLE_ANNOTATIONS() {
        return MUTABLE_ANNOTATIONS;
    }

    public static final Set<FqName> getNOT_NULL_ANNOTATIONS() {
        return NOT_NULL_ANNOTATIONS;
    }

    public static final Set<FqName> getNULLABLE_ANNOTATIONS() {
        return NULLABLE_ANNOTATIONS;
    }

    public static final Set<FqName> getREAD_ONLY_ANNOTATIONS() {
        return READ_ONLY_ANNOTATIONS;
    }

    public static final FqName getUNDER_MIGRATION_ANNOTATION_FQ_NAME() {
        return UNDER_MIGRATION_ANNOTATION_FQ_NAME;
    }
}
