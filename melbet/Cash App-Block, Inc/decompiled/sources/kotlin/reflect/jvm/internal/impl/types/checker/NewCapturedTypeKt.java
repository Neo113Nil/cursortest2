package kotlin.reflect.jvm.internal.impl.types.checker;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import kotlin.reflect.jvm.internal.impl.types.KotlinTypeFactory;
import kotlin.reflect.jvm.internal.impl.types.SimpleType;
import kotlin.reflect.jvm.internal.impl.types.TypeConstructorSubstitution;
import kotlin.reflect.jvm.internal.impl.types.TypeProjection;
import kotlin.reflect.jvm.internal.impl.types.TypeSubstitutor;
import kotlin.reflect.jvm.internal.impl.types.UnwrappedType;
import kotlin.reflect.jvm.internal.impl.types.Variance;
import kotlin.reflect.jvm.internal.impl.types.checker.KotlinTypePreparator;
import kotlin.reflect.jvm.internal.impl.types.model.CaptureStatus;
import kotlin.reflect.jvm.internal.impl.types.model.KotlinTypeMarker;
import kotlin.reflect.jvm.internal.impl.types.typeUtil.TypeUtilsKt;

/* loaded from: classes9.dex */
public final class NewCapturedTypeKt {
    /* JADX WARN: Removed duplicated region for block: B:5:0x0155  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x016a A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final SimpleType captureFromArguments(SimpleType simpleType, CaptureStatus captureStatus) {
        ArrayList arrayList;
        simpleType.getClass();
        captureStatus.getClass();
        if (simpleType.getArguments().size() == simpleType.getConstructor().getParameters().size()) {
            List<TypeProjection> arguments = simpleType.getArguments();
            List<TypeProjection> list = arguments;
            if (!(list instanceof Collection) || !list.isEmpty()) {
                Iterator<T> it = list.iterator();
                while (it.hasNext()) {
                    if (((TypeProjection) it.next()).getProjectionKind() != Variance.INVARIANT) {
                        List<TypeParameterDescriptor> parameters = simpleType.getConstructor().getParameters();
                        parameters.getClass();
                        ArrayList zip = CollectionsKt.zip(list, parameters);
                        ArrayList arrayList2 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(zip, 10));
                        Iterator it2 = zip.iterator();
                        while (it2.hasNext()) {
                            Pair pair = (Pair) it2.next();
                            TypeProjection typeProjection = (TypeProjection) pair.first;
                            TypeParameterDescriptor typeParameterDescriptor = (TypeParameterDescriptor) pair.second;
                            if (typeProjection.getProjectionKind() != Variance.INVARIANT) {
                                UnwrappedType unwrap2 = (typeProjection.isStarProjection() || typeProjection.getProjectionKind() != Variance.IN_VARIANCE) ? null : typeProjection.getType().unwrap();
                                typeParameterDescriptor.getClass();
                                typeProjection = TypeUtilsKt.asTypeProjection(new NewCapturedType(captureStatus, unwrap2, typeProjection, typeParameterDescriptor));
                            }
                            arrayList2.add(typeProjection);
                        }
                        TypeSubstitutor buildSubstitutor = TypeConstructorSubstitution.Companion.create(simpleType.getConstructor(), arrayList2).buildSubstitutor();
                        int size = arguments.size();
                        for (int i = 0; i < size; i++) {
                            TypeProjection typeProjection2 = arguments.get(i);
                            TypeProjection typeProjection3 = (TypeProjection) arrayList2.get(i);
                            if (typeProjection2.getProjectionKind() != Variance.INVARIANT) {
                                List<KotlinType> upperBounds = simpleType.getConstructor().getParameters().get(i).getUpperBounds();
                                upperBounds.getClass();
                                ArrayList arrayList3 = new ArrayList();
                                Iterator<T> it3 = upperBounds.iterator();
                                while (it3.hasNext()) {
                                    arrayList3.add(KotlinTypePreparator.Default.INSTANCE.prepareType((KotlinTypeMarker) buildSubstitutor.safeSubstitute((KotlinType) it3.next(), Variance.INVARIANT).unwrap()));
                                }
                                if (!typeProjection2.isStarProjection() && typeProjection2.getProjectionKind() == Variance.OUT_VARIANCE) {
                                    arrayList3.add(KotlinTypePreparator.Default.INSTANCE.prepareType((KotlinTypeMarker) typeProjection2.getType().unwrap()));
                                }
                                KotlinType type2 = typeProjection3.getType();
                                type2.getClass();
                                ((NewCapturedType) type2).getConstructor().initializeSupertypes(arrayList3);
                            }
                        }
                        arrayList = arrayList2;
                        if (arrayList == null) {
                            return KotlinTypeFactory.simpleType$default(simpleType.getAttributes(), simpleType.getConstructor(), arrayList, simpleType.isMarkedNullable(), (KotlinTypeRefiner) null, 16, (Object) null);
                        }
                        return null;
                    }
                }
            }
        }
        arrayList = null;
        if (arrayList == null) {
        }
    }
}
