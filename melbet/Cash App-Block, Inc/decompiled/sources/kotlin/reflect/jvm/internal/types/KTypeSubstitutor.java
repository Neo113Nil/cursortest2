package kotlin.reflect.jvm.internal.types;

import com.google.mlkit.vision.face.FaceDetection;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.EmptyMap;
import kotlin.reflect.KClassifier;
import kotlin.reflect.KType;
import kotlin.reflect.KTypeProjection;
import kotlin.reflect.KVariance;
import kotlin.reflect.full.KClassifiers;
import kotlin.reflect.jvm.internal.impl.types.model.RigidTypeMarker;

/* loaded from: classes3.dex */
public final class KTypeSubstitutor {
    public static final KTypeSubstitutor EMPTY;
    public final Map substitution;

    static {
        EmptyMap emptyMap = EmptyMap.INSTANCE;
        emptyMap.getClass();
        EMPTY = new KTypeSubstitutor(emptyMap);
    }

    public KTypeSubstitutor(Map map) {
        map.getClass();
        this.substitution = map;
    }

    /* JADX WARN: Code restructure failed: missing block: B:70:0x0105, code lost:
    
        if (r8.isMarkedNullable() == false) goto L77;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final KTypeProjection substitute(KType kType, KVariance kVariance) {
        KTypeProjection star;
        AbstractKType upperBoundIfFlexible;
        AbstractKType lowerBoundIfFlexible;
        kType.getClass();
        Map map = this.substitution;
        if (map.isEmpty()) {
            return new KTypeProjection(kType, kVariance);
        }
        boolean z = kType instanceof AbstractKType;
        AbstractKType abstractKType = z ? (AbstractKType) kType : null;
        AbstractKType lowerBoundIfFlexible2 = abstractKType != null ? abstractKType.lowerBoundIfFlexible() : null;
        AbstractKType abstractKType2 = z ? (AbstractKType) kType : null;
        AbstractKType upperBoundIfFlexible2 = abstractKType2 != null ? abstractKType2.upperBoundIfFlexible() : null;
        if (lowerBoundIfFlexible2 != null && upperBoundIfFlexible2 != null) {
            KTypeProjection substitute = substitute(lowerBoundIfFlexible2, kVariance);
            KType f1521type = substitute.getF1521type();
            AbstractKType abstractKType3 = f1521type instanceof AbstractKType ? (AbstractKType) f1521type : null;
            if (abstractKType3 != null && (lowerBoundIfFlexible = abstractKType3.lowerBoundIfFlexible()) != null) {
                substitute = new KTypeProjection(lowerBoundIfFlexible, substitute.getVariance());
            }
            KTypeProjection substitute2 = substitute(upperBoundIfFlexible2, kVariance);
            KType f1521type2 = substitute2.getF1521type();
            AbstractKType abstractKType4 = f1521type2 instanceof AbstractKType ? (AbstractKType) f1521type2 : null;
            if (abstractKType4 != null && (upperBoundIfFlexible = abstractKType4.upperBoundIfFlexible()) != null) {
                substitute2 = new KTypeProjection(upperBoundIfFlexible, substitute2.getVariance());
            }
            KType f1521type3 = substitute2.getF1521type();
            KType f1521type4 = substitute.getF1521type();
            if (f1521type3 != null && f1521type4 != null) {
                return new KTypeProjection(FaceDetection.createPlatformKType(f1521type4, f1521type3), substitute.getVariance());
            }
            KTypeProjection.INSTANCE.getClass();
            return KTypeProjection.Companion.getSTAR();
        }
        KClassifier classifier = kType.getClassifier();
        if (classifier == null) {
            return new KTypeProjection(kType, kVariance);
        }
        KTypeProjection kTypeProjection = (KTypeProjection) map.get(classifier);
        if (kTypeProjection == null) {
            if (!kType.getArguments().isEmpty()) {
                List<KTypeProjection> arguments = kType.getArguments();
                ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(arguments, 10));
                for (KTypeProjection kTypeProjection2 : arguments) {
                    KVariance variance = kTypeProjection2.getVariance();
                    KType f1521type5 = kTypeProjection2.getF1521type();
                    if (f1521type5 == null || variance == null) {
                        KTypeProjection.INSTANCE.getClass();
                        star = KTypeProjection.Companion.getSTAR();
                    } else {
                        star = substitute(f1521type5, variance);
                    }
                    arrayList.add(star);
                }
                boolean isMarkedNullable = kType.isMarkedNullable();
                List annotations = kType.getAnnotations();
                AbstractKType abstractKType5 = z ? (AbstractKType) kType : null;
                kType = KClassifiers.createTypeImpl(classifier, arrayList, isMarkedNullable, annotations, abstractKType5 != null ? abstractKType5.getMutableCollectionClass() : null);
            }
            return new KTypeProjection(kType, kVariance);
        }
        KType f1521type6 = kTypeProjection.getF1521type();
        KVariance variance2 = kTypeProjection.getVariance();
        if (f1521type6 != null && variance2 != null) {
            KVariance access$intersectWith = KTypeSubstitutorKt.access$intersectWith(variance2, kVariance);
            RigidTypeMarker rigidTypeMarker = (RigidTypeMarker) f1521type6;
            boolean z2 = false;
            RigidTypeMarker withNullability = ReflectTypeSystemContext.INSTANCE.withNullability(rigidTypeMarker, kType.isMarkedNullable() || f1521type6.isMarkedNullable());
            if (withNullability != null) {
                AbstractKType abstractKType6 = (AbstractKType) withNullability;
                AbstractKType abstractKType7 = z ? (AbstractKType) kType : null;
                if (abstractKType7 == null || !abstractKType7.isDefinitelyNotNullType()) {
                    AbstractKType abstractKType8 = rigidTypeMarker instanceof AbstractKType ? (AbstractKType) rigidTypeMarker : null;
                    if (abstractKType8 != null) {
                        if (abstractKType8.isDefinitelyNotNullType()) {
                        }
                    }
                    withNullability = abstractKType6.makeDefinitelyNotNullAsSpecified(z2);
                }
                z2 = true;
                withNullability = abstractKType6.makeDefinitelyNotNullAsSpecified(z2);
            }
            withNullability.getClass();
            kTypeProjection = new KTypeProjection((KType) withNullability, access$intersectWith);
        }
        return kTypeProjection;
    }
}
