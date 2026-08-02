package kotlin.reflect.jvm.internal;

import defpackage.Drop$$ExternalSyntheticBUOutline0;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.KTypeParameterBase;
import kotlin.reflect.KType;
import kotlin.reflect.KVariance;
import kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import kotlin.reflect.jvm.internal.impl.types.Variance;
import kotlin.reflect.jvm.internal.impl.types.model.TypeConstructorMarker;
import kotlin.reflect.jvm.internal.impl.types.model.TypeParameterMarker;
import kotlin.reflect.jvm.internal.types.DescriptorKType;
import kotlin.reflect.jvm.internal.types.KTypeSubstitutor;

/* loaded from: classes9.dex */
public final class KTypeParameterImpl extends KTypeParameterBase implements TypeConstructorMarker, TypeParameterMarker {
    public final TypeParameterDescriptor _descriptor;
    public final String name;
    public volatile List upperBounds;
    public final KVariance variance;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public KTypeParameterImpl(KTypeParameterOwnerImpl kTypeParameterOwnerImpl, TypeParameterDescriptor typeParameterDescriptor, KTypeSubstitutor kTypeSubstitutor) {
        this(typeParameterDescriptor, kTypeParameterOwnerImpl, r0, r1);
        KVariance kVariance;
        kTypeParameterOwnerImpl.getClass();
        kTypeSubstitutor.getClass();
        String asString = typeParameterDescriptor.getName().asString();
        asString.getClass();
        Variance variance = typeParameterDescriptor.getVariance();
        variance.getClass();
        int i = KTypeParameterImplKt$WhenMappings.$EnumSwitchMapping$0[variance.ordinal()];
        if (i == 1) {
            kVariance = KVariance.INVARIANT;
        } else if (i == 2) {
            kVariance = KVariance.IN;
        } else {
            if (i != 3) {
                Drop$$ExternalSyntheticBUOutline0.m1m();
                throw null;
            }
            kVariance = KVariance.OUT;
        }
        typeParameterDescriptor.isReified();
        List<KotlinType> upperBounds = typeParameterDescriptor.getUpperBounds();
        upperBounds.getClass();
        List<KotlinType> list = upperBounds;
        ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list, 10));
        for (KotlinType kotlinType : list) {
            kotlinType.getClass();
            KType kType = kTypeSubstitutor.substitute(new DescriptorKType(kotlinType, null), KVariance.INVARIANT).f1521type;
            if (kType == null) {
                FakeOverridesKt.starProjectionInTopLevelTypeIsNotPossible(kTypeParameterOwnerImpl);
                throw null;
            }
            arrayList.add(kType);
        }
        this.upperBounds = arrayList;
    }

    @Override // kotlin.jvm.internal.KTypeParameterBase
    public final List getUpperBounds() {
        List list = this.upperBounds;
        if (list != null) {
            return list;
        }
        Intrinsics.throwUninitializedPropertyAccessException("upperBounds");
        throw null;
    }

    public KTypeParameterImpl(TypeParameterDescriptor typeParameterDescriptor, KTypeParameterOwnerImpl kTypeParameterOwnerImpl, String str, KVariance kVariance) {
        super(kTypeParameterOwnerImpl);
        this.name = str;
        this.variance = kVariance;
        this._descriptor = typeParameterDescriptor;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public KTypeParameterImpl(KTypeParameterOwnerImpl kTypeParameterOwnerImpl, String str, KVariance kVariance) {
        this(null, kTypeParameterOwnerImpl, str, kVariance);
        kTypeParameterOwnerImpl.getClass();
        str.getClass();
    }

    public KTypeParameterImpl(KTypeParameterOwnerImpl kTypeParameterOwnerImpl, TypeParameterDescriptor typeParameterDescriptor) {
        this(kTypeParameterOwnerImpl, typeParameterDescriptor, KTypeSubstitutor.EMPTY);
    }
}
