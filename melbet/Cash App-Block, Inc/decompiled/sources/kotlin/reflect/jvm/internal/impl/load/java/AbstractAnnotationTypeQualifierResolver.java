package kotlin.reflect.jvm.internal.impl.load.java;

import bo.app.a$$ExternalSyntheticBUOutline0;
import com.stripe.android.uicore.elements.TextFieldUIKt$TextField$4$1;
import java.util.ArrayList;
import java.util.Collection;
import java.util.EnumMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Pair;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.collections.SetsKt___SetsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.builtins.StandardNames;
import kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.MutabilityQualifier;
import kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.NullabilityQualifier;
import kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.WithMigrationStatus;
import kotlin.reflect.jvm.internal.impl.name.FqName;
import kotlin.reflect.jvm.internal.impl.resolve.OverridingUtil;
import org.apache.commons.imaging.ImagingConstants;

/* loaded from: classes9.dex */
public abstract class AbstractAnnotationTypeQualifierResolver<TAnnotation> {
    public static final LinkedHashMap JAVA_APPLICABILITY_TYPES;
    public final JavaTypeEnhancementState javaTypeEnhancementState;
    public final ConcurrentHashMap resolvedNicknames;

    static {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (AnnotationQualifierApplicabilityType annotationQualifierApplicabilityType : AnnotationQualifierApplicabilityType.values()) {
            String javaTarget = annotationQualifierApplicabilityType.getJavaTarget();
            if (linkedHashMap.get(javaTarget) == null) {
                linkedHashMap.put(javaTarget, annotationQualifierApplicabilityType);
            }
        }
        JAVA_APPLICABILITY_TYPES = linkedHashMap;
    }

    public AbstractAnnotationTypeQualifierResolver(JavaTypeEnhancementState javaTypeEnhancementState) {
        javaTypeEnhancementState.getClass();
        this.javaTypeEnhancementState = javaTypeEnhancementState;
        this.resolvedNicknames = new ConcurrentHashMap();
    }

    public static final WithMigrationStatus access$extractMutability(AbstractAnnotationTypeQualifierResolver abstractAnnotationTypeQualifierResolver, Object obj) {
        MutabilityQualifier mutabilityQualifier;
        FqName fqName = abstractAnnotationTypeQualifierResolver.getFqName(obj);
        if (fqName == null) {
            return null;
        }
        if (JvmAnnotationNamesKt.getREAD_ONLY_ANNOTATIONS().contains(fqName)) {
            mutabilityQualifier = MutabilityQualifier.READ_ONLY;
        } else {
            if (!JvmAnnotationNamesKt.getMUTABLE_ANNOTATIONS().contains(fqName)) {
                return null;
            }
            mutabilityQualifier = MutabilityQualifier.MUTABLE;
        }
        ReportLevel reportLevel = (ReportLevel) abstractAnnotationTypeQualifierResolver.javaTypeEnhancementState.getGetReportLevelForAnnotation().invoke(fqName);
        if (reportLevel.isIgnore()) {
            return null;
        }
        if (!reportLevel.isWarning() || abstractAnnotationTypeQualifierResolver.isK2()) {
            return new WithMigrationStatus(mutabilityQualifier, reportLevel.isWarning());
        }
        return null;
    }

    public static /* synthetic */ JavaTypeQualifiersByElementType extractAndMergeDefaultQualifiers$default(AbstractAnnotationTypeQualifierResolver abstractAnnotationTypeQualifierResolver, JavaTypeQualifiersByElementType javaTypeQualifiersByElementType, Iterable iterable, boolean z, int i, Object obj) {
        if (obj != null) {
            a$$ExternalSyntheticBUOutline0.m("Super calls with default arguments not supported in this target, function: extractAndMergeDefaultQualifiers");
            return null;
        }
        if ((i & 4) != 0) {
            z = false;
        }
        return abstractAnnotationTypeQualifierResolver.extractAndMergeDefaultQualifiers(javaTypeQualifiersByElementType, iterable, z);
    }

    public static WithMigrationStatus extractQualifier(Iterable iterable, Function1 function1) {
        Iterator it = iterable.iterator();
        WithMigrationStatus withMigrationStatus = null;
        while (it.hasNext()) {
            WithMigrationStatus withMigrationStatus2 = (WithMigrationStatus) function1.invoke(it.next());
            if (withMigrationStatus != null) {
                if (withMigrationStatus2 != null && !withMigrationStatus2.equals(withMigrationStatus) && (!withMigrationStatus2.isForWarningOnly() || withMigrationStatus.isForWarningOnly())) {
                    if (withMigrationStatus2.isForWarningOnly() || !withMigrationStatus.isForWarningOnly()) {
                        return null;
                    }
                }
            }
            withMigrationStatus = withMigrationStatus2;
        }
        return withMigrationStatus;
    }

    public abstract Iterable enumArguments(Object obj, boolean z);

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:12:0x016e A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0018 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:17:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0109  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final JavaTypeQualifiersByElementType extractAndMergeDefaultQualifiers(JavaTypeQualifiersByElementType javaTypeQualifiersByElementType, Iterable<? extends TAnnotation> iterable, boolean z) {
        boolean z2;
        EnumMap<AnnotationQualifierApplicabilityType, JavaDefaultQualifiers> defaultQualifiers;
        JavaDefaultQualifiers javaDefaultQualifiers;
        JavaDefaultQualifiers copy$default;
        Object findAnnotation;
        Object obj;
        Pair pair;
        WithMigrationStatus knownNullability;
        iterable.getClass();
        JavaTypeEnhancementState javaTypeEnhancementState = this.javaTypeEnhancementState;
        if (!javaTypeEnhancementState.getDisabledDefaultAnnotations()) {
            ArrayList arrayList = new ArrayList();
            Iterator<? extends TAnnotation> it = iterable.iterator();
            while (true) {
                JavaDefaultQualifiers javaDefaultQualifiers2 = null;
                if (!it.hasNext()) {
                    break;
                }
                TAnnotation next = it.next();
                if (!javaTypeEnhancementState.getDisabledDefaultAnnotations() && (javaDefaultQualifiers = JavaDefaultQualifiersKt.getBUILT_IN_TYPE_QUALIFIER_DEFAULT_ANNOTATIONS().get(getFqName(next))) != null) {
                    FqName fqName = getFqName(next);
                    ReportLevel resolveJsr305AnnotationState = (fqName == null || !JavaDefaultQualifiersKt.getJSPECIFY_DEFAULT_ANNOTATIONS().containsKey(fqName)) ? resolveJsr305AnnotationState(next) : (ReportLevel) javaTypeEnhancementState.getGetReportLevelForAnnotation().invoke(fqName);
                    if (resolveJsr305AnnotationState == ReportLevel.IGNORE) {
                        resolveJsr305AnnotationState = null;
                    }
                    if (resolveJsr305AnnotationState != null) {
                        copy$default = JavaDefaultQualifiers.copy$default(javaDefaultQualifiers, WithMigrationStatus.copy$default(javaDefaultQualifiers.getNullabilityQualifier(), null, z || resolveJsr305AnnotationState.isWarning(), 1, null), null, false, false, false, 30, null);
                        if (copy$default == null) {
                            javaDefaultQualifiers2 = copy$default;
                        } else {
                            if (!javaTypeEnhancementState.getJsr305().isDisabled() && (findAnnotation = findAnnotation(next, JvmAnnotationNamesKt.getJAVAX_TYPE_QUALIFIER_DEFAULT_ANNOTATION_FQ_NAME())) != null) {
                                Iterator it2 = getMetaAnnotations(next).iterator();
                                while (true) {
                                    if (!it2.hasNext()) {
                                        obj = null;
                                        break;
                                    }
                                    obj = it2.next();
                                    if (resolveTypeQualifierAnnotation(obj) != null) {
                                        break;
                                    }
                                }
                                if (obj != null) {
                                    Iterable enumArguments = enumArguments(findAnnotation, true);
                                    LinkedHashSet linkedHashSet = new LinkedHashSet();
                                    Iterator it3 = enumArguments.iterator();
                                    while (it3.hasNext()) {
                                        AnnotationQualifierApplicabilityType annotationQualifierApplicabilityType = (AnnotationQualifierApplicabilityType) JAVA_APPLICABILITY_TYPES.get((String) it3.next());
                                        if (annotationQualifierApplicabilityType != null) {
                                            linkedHashSet.add(annotationQualifierApplicabilityType);
                                        }
                                    }
                                    if (linkedHashSet.contains(AnnotationQualifierApplicabilityType.TYPE_USE)) {
                                        linkedHashSet = SetsKt___SetsKt.plus((Set) SetsKt___SetsKt.minus(ArraysKt___ArraysKt.toSet(AnnotationQualifierApplicabilityType.values()), AnnotationQualifierApplicabilityType.TYPE_PARAMETER_BOUNDS), (Iterable) linkedHashSet);
                                    }
                                    pair = new Pair(obj, linkedHashSet);
                                    if (pair != null) {
                                        Object obj2 = pair.first;
                                        Set set = (Set) pair.second;
                                        ReportLevel resolveJsr305CustomState = resolveJsr305CustomState(next);
                                        if (resolveJsr305CustomState == null) {
                                            resolveJsr305CustomState = resolveJsr305AnnotationState(obj2);
                                        }
                                        if (!resolveJsr305CustomState.isIgnore()) {
                                            obj2.getClass();
                                            WithMigrationStatus knownNullability2 = knownNullability(obj2, false);
                                            if (knownNullability2 == null) {
                                                Object resolveTypeQualifierAnnotation = resolveTypeQualifierAnnotation(obj2);
                                                if (resolveTypeQualifierAnnotation != null) {
                                                    ReportLevel resolveJsr305AnnotationState2 = resolveJsr305AnnotationState(obj2);
                                                    if (!resolveJsr305AnnotationState2.isIgnore() && (knownNullability = knownNullability(resolveTypeQualifierAnnotation, false)) != null) {
                                                        knownNullability2 = WithMigrationStatus.copy$default(knownNullability, null, resolveJsr305AnnotationState2.isWarning(), 1, null);
                                                    }
                                                }
                                                knownNullability2 = null;
                                            }
                                            if (knownNullability2 != null) {
                                                javaDefaultQualifiers2 = new JavaDefaultQualifiers(WithMigrationStatus.copy$default(knownNullability2, null, z || resolveJsr305CustomState.isWarning(), 1, null), set, false, false, false, 28, null);
                                            }
                                        }
                                    }
                                }
                            }
                            pair = null;
                            if (pair != null) {
                            }
                        }
                        if (javaDefaultQualifiers2 == null) {
                            arrayList.add(javaDefaultQualifiers2);
                        }
                    }
                }
                copy$default = null;
                if (copy$default == null) {
                }
                if (javaDefaultQualifiers2 == null) {
                }
            }
            if (!arrayList.isEmpty()) {
                EnumMap enumMap = new EnumMap(AnnotationQualifierApplicabilityType.class);
                Iterator it4 = arrayList.iterator();
                while (it4.hasNext()) {
                    JavaDefaultQualifiers javaDefaultQualifiers3 = (JavaDefaultQualifiers) it4.next();
                    for (AnnotationQualifierApplicabilityType annotationQualifierApplicabilityType2 : javaDefaultQualifiers3.getQualifierApplicabilityTypes()) {
                        if (enumMap.containsKey(annotationQualifierApplicabilityType2) && isK2()) {
                            JavaDefaultQualifiers javaDefaultQualifiers4 = (JavaDefaultQualifiers) enumMap.get(annotationQualifierApplicabilityType2);
                            if (javaDefaultQualifiers4 != null) {
                                WithMigrationStatus<NullabilityQualifier> nullabilityQualifier = javaDefaultQualifiers4.getNullabilityQualifier();
                                WithMigrationStatus<NullabilityQualifier> nullabilityQualifier2 = javaDefaultQualifiers3.getNullabilityQualifier();
                                if (!Intrinsics.areEqual(nullabilityQualifier2, nullabilityQualifier) && (!nullabilityQualifier2.isForWarningOnly() || nullabilityQualifier.isForWarningOnly())) {
                                    javaDefaultQualifiers4 = (nullabilityQualifier2.isForWarningOnly() || !nullabilityQualifier.isForWarningOnly()) ? null : javaDefaultQualifiers3;
                                }
                                enumMap.put((EnumMap) annotationQualifierApplicabilityType2, (AnnotationQualifierApplicabilityType) javaDefaultQualifiers4);
                            }
                        } else {
                            enumMap.put((EnumMap) annotationQualifierApplicabilityType2, (AnnotationQualifierApplicabilityType) javaDefaultQualifiers3);
                        }
                    }
                }
                EnumMap enumMap2 = (javaTypeQualifiersByElementType == null || (defaultQualifiers = javaTypeQualifiersByElementType.getDefaultQualifiers()) == null) ? new EnumMap(AnnotationQualifierApplicabilityType.class) : new EnumMap((EnumMap) defaultQualifiers);
                for (Map.Entry entry : enumMap.entrySet()) {
                    AnnotationQualifierApplicabilityType annotationQualifierApplicabilityType3 = (AnnotationQualifierApplicabilityType) entry.getKey();
                    JavaDefaultQualifiers javaDefaultQualifiers5 = (JavaDefaultQualifiers) entry.getValue();
                    if (javaDefaultQualifiers5 != null) {
                        enumMap2.put((EnumMap) annotationQualifierApplicabilityType3, (AnnotationQualifierApplicabilityType) javaDefaultQualifiers5);
                        z2 = true;
                    }
                }
                if (z2) {
                    return new JavaTypeQualifiersByElementType(enumMap2);
                }
            }
        }
        return javaTypeQualifiersByElementType;
    }

    public final WithMigrationStatus<MutabilityQualifier> extractMutability(Iterable<? extends TAnnotation> iterable) {
        iterable.getClass();
        return extractQualifier(iterable, new TextFieldUIKt$TextField$4$1(1, this, AbstractAnnotationTypeQualifierResolver.class, "extractMutability", "extractMutability(Ljava/lang/Object;)Lorg/jetbrains/kotlin/load/java/typeEnhancement/WithMigrationStatus;", 0, 28));
    }

    public final WithMigrationStatus<NullabilityQualifier> extractNullability(Iterable<? extends TAnnotation> iterable, Function1<? super TAnnotation, Boolean> function1) {
        iterable.getClass();
        function1.getClass();
        return extractQualifier(iterable, new OverridingUtil.AnonymousClass7(16, this, function1));
    }

    public final Object findAnnotation(Object obj, FqName fqName) {
        for (Object obj2 : getMetaAnnotations(obj)) {
            if (Intrinsics.areEqual(getFqName(obj2), fqName)) {
                return obj2;
            }
        }
        return null;
    }

    public abstract FqName getFqName(Object obj);

    public abstract Object getKey(Object obj);

    public abstract Iterable getMetaAnnotations(Object obj);

    public final boolean hasAnnotation(Object obj, FqName fqName) {
        Iterable metaAnnotations = getMetaAnnotations(obj);
        if ((metaAnnotations instanceof Collection) && ((Collection) metaAnnotations).isEmpty()) {
            return false;
        }
        Iterator it = metaAnnotations.iterator();
        while (it.hasNext()) {
            if (Intrinsics.areEqual(getFqName(it.next()), fqName)) {
                return true;
            }
        }
        return false;
    }

    public abstract boolean isK2();

    public final boolean isTypeUseAnnotation(TAnnotation tannotation) {
        tannotation.getClass();
        Object findAnnotation = findAnnotation(tannotation, StandardNames.FqNames.target);
        if (findAnnotation == null) {
            return false;
        }
        Iterable enumArguments = enumArguments(findAnnotation, false);
        if ((enumArguments instanceof Collection) && ((Collection) enumArguments).isEmpty()) {
            return false;
        }
        Iterator it = enumArguments.iterator();
        while (it.hasNext()) {
            if (Intrinsics.areEqual((String) it.next(), "TYPE")) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0067, code lost:
    
        if (r5.equals("ALWAYS") != false) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x007c, code lost:
    
        if (r5.equals("NEVER") == false) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0088, code lost:
    
        r5 = kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.NullabilityQualifier.NULLABLE;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0085, code lost:
    
        if (r5.equals("MAYBE") == false) goto L36;
     */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
    java.lang.NullPointerException: Cannot invoke "java.util.List.iterator()" because the return value of "jadx.core.dex.visitors.regions.SwitchOverStringVisitor$SwitchData.getNewCases()" is null
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.restoreSwitchOverString(SwitchOverStringVisitor.java:109)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visitRegion(SwitchOverStringVisitor.java:66)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:77)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:82)
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final WithMigrationStatus knownNullability(Object obj, boolean z) {
        NullabilityQualifier nullabilityQualifier;
        FqName fqName = getFqName(obj);
        if (fqName == null) {
            return null;
        }
        ReportLevel reportLevel = (ReportLevel) this.javaTypeEnhancementState.getGetReportLevelForAnnotation().invoke(fqName);
        if (reportLevel.isIgnore()) {
            return null;
        }
        if (JvmAnnotationNamesKt.getNOT_NULL_ANNOTATIONS().contains(fqName)) {
            nullabilityQualifier = NullabilityQualifier.NOT_NULL;
        } else if (JvmAnnotationNamesKt.getNULLABLE_ANNOTATIONS().contains(fqName)) {
            nullabilityQualifier = NullabilityQualifier.NULLABLE;
        } else if (JvmAnnotationNamesKt.getFORCE_FLEXIBILITY_ANNOTATIONS().contains(fqName)) {
            nullabilityQualifier = NullabilityQualifier.FORCE_FLEXIBILITY;
        } else {
            if (!fqName.equals(JvmAnnotationNamesKt.getJAVAX_NONNULL_ANNOTATION_FQ_NAME())) {
                return null;
            }
            String str = (String) CollectionsKt.firstOrNull(enumArguments(obj, false));
            if (str != null) {
                switch (str.hashCode()) {
                    case 73135176:
                        break;
                    case 74175084:
                        break;
                    case 433141802:
                        if (str.equals("UNKNOWN")) {
                            nullabilityQualifier = NullabilityQualifier.FORCE_FLEXIBILITY;
                            break;
                        }
                        break;
                    case 1933739535:
                        break;
                }
                return null;
            }
            nullabilityQualifier = NullabilityQualifier.NOT_NULL;
        }
        return new WithMigrationStatus(nullabilityQualifier, reportLevel.isWarning() || z);
    }

    public final ReportLevel resolveJsr305AnnotationState(Object obj) {
        ReportLevel resolveJsr305CustomState = resolveJsr305CustomState(obj);
        return resolveJsr305CustomState != null ? resolveJsr305CustomState : this.javaTypeEnhancementState.getJsr305().getGlobalLevel();
    }

    public final ReportLevel resolveJsr305CustomState(Object obj) {
        Iterable enumArguments;
        String str;
        JavaTypeEnhancementState javaTypeEnhancementState = this.javaTypeEnhancementState;
        ReportLevel reportLevel = javaTypeEnhancementState.getJsr305().getUserDefinedLevelForSpecificAnnotation().get(getFqName(obj));
        if (reportLevel != null) {
            return reportLevel;
        }
        Object findAnnotation = findAnnotation(obj, JvmAnnotationNamesKt.getUNDER_MIGRATION_ANNOTATION_FQ_NAME());
        if (findAnnotation == null || (enumArguments = enumArguments(findAnnotation, false)) == null || (str = (String) CollectionsKt.firstOrNull(enumArguments)) == null) {
            return null;
        }
        ReportLevel migrationLevel = javaTypeEnhancementState.getJsr305().getMigrationLevel();
        if (migrationLevel != null) {
            return migrationLevel;
        }
        int hashCode = str.hashCode();
        if (hashCode != -2137067054) {
            if (hashCode != -1838656823) {
                if (hashCode == 2656902 && str.equals("WARN")) {
                    return ReportLevel.WARN;
                }
            } else if (str.equals(ImagingConstants.PARAM_KEY_STRICT)) {
                return ReportLevel.STRICT;
            }
        } else if (str.equals("IGNORE")) {
            return ReportLevel.IGNORE;
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final TAnnotation resolveTypeQualifierAnnotation(TAnnotation tannotation) {
        TAnnotation tannotation2;
        tannotation.getClass();
        if (this.javaTypeEnhancementState.getJsr305().isDisabled()) {
            return null;
        }
        if (CollectionsKt.contains(JvmAnnotationNamesKt.getBUILT_IN_TYPE_QUALIFIER_ANNOTATIONS(), getFqName(tannotation)) || hasAnnotation(tannotation, JvmAnnotationNamesKt.getJAVAX_TYPE_QUALIFIER_ANNOTATION_FQ_NAME())) {
            return tannotation;
        }
        if (!hasAnnotation(tannotation, JvmAnnotationNamesKt.getJAVAX_TYPE_QUALIFIER_NICKNAME_ANNOTATION_FQ_NAME())) {
            return null;
        }
        Object key = getKey(tannotation);
        ConcurrentHashMap concurrentHashMap = this.resolvedNicknames;
        TAnnotation tannotation3 = (TAnnotation) concurrentHashMap.get(key);
        if (tannotation3 != null) {
            return tannotation3;
        }
        Iterator it = getMetaAnnotations(tannotation).iterator();
        while (true) {
            if (!it.hasNext()) {
                tannotation2 = null;
                break;
            }
            tannotation2 = (TAnnotation) resolveTypeQualifierAnnotation(it.next());
            if (tannotation2 != null) {
                break;
            }
        }
        if (tannotation2 == null) {
            return null;
        }
        TAnnotation tannotation4 = (TAnnotation) concurrentHashMap.putIfAbsent(key, tannotation2);
        return tannotation4 == null ? tannotation2 : tannotation4;
    }
}
