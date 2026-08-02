package kotlin.reflect.jvm.internal.impl.resolve.calls.inference;

import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Pair;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.reflect.jvm.internal.KotlinKPropertyN$$Lambda$0;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.storage.LockBasedStorageManager;
import kotlin.reflect.jvm.internal.impl.storage.StorageManager;
import kotlin.reflect.jvm.internal.impl.types.DelegatedTypeSubstitution;
import kotlin.reflect.jvm.internal.impl.types.IndexedParametersSubstitution;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import kotlin.reflect.jvm.internal.impl.types.LazyWrappedType;
import kotlin.reflect.jvm.internal.impl.types.TypeProjection;
import kotlin.reflect.jvm.internal.impl.types.TypeProjectionImpl;
import kotlin.reflect.jvm.internal.impl.types.TypeSubstitution;
import kotlin.reflect.jvm.internal.impl.types.Variance;

/* loaded from: classes9.dex */
public final class CapturedTypeConstructorKt {
    public static final TypeProjection createCapturedIfNeeded(TypeProjection typeProjection, TypeParameterDescriptor typeParameterDescriptor) {
        if (typeParameterDescriptor == null || typeProjection.getProjectionKind() == Variance.INVARIANT) {
            return typeProjection;
        }
        if (typeParameterDescriptor.getVariance() != typeProjection.getProjectionKind()) {
            return new TypeProjectionImpl(createCapturedType(typeProjection));
        }
        if (!typeProjection.isStarProjection()) {
            return new TypeProjectionImpl(typeProjection.getType());
        }
        StorageManager storageManager = LockBasedStorageManager.NO_LOCKS;
        storageManager.getClass();
        return new TypeProjectionImpl(new LazyWrappedType(storageManager, new KotlinKPropertyN$$Lambda$0(typeProjection, 18)));
    }

    public static final KotlinType createCapturedType(TypeProjection typeProjection) {
        typeProjection.getClass();
        return new CapturedType(typeProjection, null, false, null, 14, null);
    }

    public static final boolean isCaptured(KotlinType kotlinType) {
        kotlinType.getClass();
        return kotlinType.getConstructor() instanceof CapturedTypeConstructor;
    }

    public static final TypeSubstitution wrapWithCapturingSubstitution(final TypeSubstitution typeSubstitution, final boolean z) {
        typeSubstitution.getClass();
        if (!(typeSubstitution instanceof IndexedParametersSubstitution)) {
            return new DelegatedTypeSubstitution(typeSubstitution) { // from class: kotlin.reflect.jvm.internal.impl.resolve.calls.inference.CapturedTypeConstructorKt$wrapWithCapturingSubstitution$2
                @Override // kotlin.reflect.jvm.internal.impl.types.DelegatedTypeSubstitution, kotlin.reflect.jvm.internal.impl.types.TypeSubstitution
                public boolean approximateContravariantCapturedTypes() {
                    return z;
                }

                @Override // kotlin.reflect.jvm.internal.impl.types.DelegatedTypeSubstitution, kotlin.reflect.jvm.internal.impl.types.TypeSubstitution
                /* renamed from: get */
                public TypeProjection mo4156get(KotlinType kotlinType) {
                    TypeProjection createCapturedIfNeeded;
                    kotlinType.getClass();
                    TypeProjection mo4156get = super.mo4156get(kotlinType);
                    if (mo4156get == null) {
                        return null;
                    }
                    ClassifierDescriptor mo4153getDeclarationDescriptor = kotlinType.getConstructor().mo4153getDeclarationDescriptor();
                    createCapturedIfNeeded = CapturedTypeConstructorKt.createCapturedIfNeeded(mo4156get, mo4153getDeclarationDescriptor instanceof TypeParameterDescriptor ? (TypeParameterDescriptor) mo4153getDeclarationDescriptor : null);
                    return createCapturedIfNeeded;
                }
            };
        }
        IndexedParametersSubstitution indexedParametersSubstitution = (IndexedParametersSubstitution) typeSubstitution;
        TypeParameterDescriptor[] parameters = indexedParametersSubstitution.getParameters();
        ArrayList zip = ArraysKt___ArraysKt.zip(indexedParametersSubstitution.getArguments(), indexedParametersSubstitution.getParameters());
        ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(zip, 10));
        Iterator it = zip.iterator();
        while (it.hasNext()) {
            Pair pair = (Pair) it.next();
            arrayList.add(createCapturedIfNeeded((TypeProjection) pair.first, (TypeParameterDescriptor) pair.second));
        }
        return new IndexedParametersSubstitution(parameters, (TypeProjection[]) arrayList.toArray(new TypeProjection[0]), z);
    }

    public static /* synthetic */ TypeSubstitution wrapWithCapturingSubstitution$default(TypeSubstitution typeSubstitution, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = true;
        }
        return wrapWithCapturingSubstitution(typeSubstitution, z);
    }
}
