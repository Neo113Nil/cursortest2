package kotlin.reflect.jvm.internal.impl.km.internal;

import defpackage.Drop$$ExternalSyntheticBUOutline0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.km.Attributes;
import kotlin.reflect.jvm.internal.impl.km.InconsistentKotlinMetadataException;
import kotlin.reflect.jvm.internal.impl.km.KmAnnotationArgument;
import kotlin.reflect.jvm.internal.impl.km.KmClassifier;
import kotlin.reflect.jvm.internal.impl.km.KmEffectInvocationKind;
import kotlin.reflect.jvm.internal.impl.km.KmEffectType;
import kotlin.reflect.jvm.internal.impl.km.KmFlexibleTypeUpperBound;
import kotlin.reflect.jvm.internal.impl.km.KmProperty;
import kotlin.reflect.jvm.internal.impl.km.KmPropertyAccessorAttributes;
import kotlin.reflect.jvm.internal.impl.km.KmType;
import kotlin.reflect.jvm.internal.impl.km.KmTypeParameter;
import kotlin.reflect.jvm.internal.impl.km.KmTypeProjection;
import kotlin.reflect.jvm.internal.impl.km.KmValueParameter;
import kotlin.reflect.jvm.internal.impl.km.KmVariance;
import kotlin.reflect.jvm.internal.impl.km.KmVersion;
import kotlin.reflect.jvm.internal.impl.km.KmVersionRequirement;
import kotlin.reflect.jvm.internal.impl.km.KmVersionRequirementLevel;
import kotlin.reflect.jvm.internal.impl.km.KmVersionRequirementVersionKind;
import kotlin.reflect.jvm.internal.impl.km.internal.extensions.MetadataExtensions;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf;
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.Flags;
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.VersionRequirement;

/* loaded from: classes9.dex */
public final class WritersKt {

    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;
        public static final /* synthetic */ int[] $EnumSwitchMapping$2;
        public static final /* synthetic */ int[] $EnumSwitchMapping$3;

        static {
            int[] iArr = new int[KmVersionRequirementVersionKind.values().length];
            try {
                iArr[KmVersionRequirementVersionKind.LANGUAGE_VERSION.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[KmVersionRequirementVersionKind.COMPILER_VERSION.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[KmVersionRequirementVersionKind.API_VERSION.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[KmVersionRequirementVersionKind.UNKNOWN.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[KmVersionRequirementLevel.values().length];
            try {
                iArr2[KmVersionRequirementLevel.WARNING.ordinal()] = 1;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr2[KmVersionRequirementLevel.ERROR.ordinal()] = 2;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr2[KmVersionRequirementLevel.HIDDEN.ordinal()] = 3;
            } catch (NoSuchFieldError unused7) {
            }
            $EnumSwitchMapping$1 = iArr2;
            int[] iArr3 = new int[KmEffectType.values().length];
            try {
                iArr3[KmEffectType.RETURNS_CONSTANT.ordinal()] = 1;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr3[KmEffectType.CALLS.ordinal()] = 2;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr3[KmEffectType.RETURNS_NOT_NULL.ordinal()] = 3;
            } catch (NoSuchFieldError unused10) {
            }
            $EnumSwitchMapping$2 = iArr3;
            int[] iArr4 = new int[KmEffectInvocationKind.values().length];
            try {
                iArr4[KmEffectInvocationKind.AT_MOST_ONCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr4[KmEffectInvocationKind.EXACTLY_ONCE.ordinal()] = 2;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr4[KmEffectInvocationKind.AT_LEAST_ONCE.ordinal()] = 3;
            } catch (NoSuchFieldError unused13) {
            }
            $EnumSwitchMapping$3 = iArr4;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:54:0x0206 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:58:0x014c A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final ProtoBuf.Property.Builder writeProperty(WriteContext writeContext, KmProperty kmProperty) {
        ProtoBuf.VersionRequirement.VersionKind versionKind;
        ProtoBuf.VersionRequirement.Level level;
        writeContext.getClass();
        kmProperty.getClass();
        ProtoBuf.Property.Builder newBuilder = ProtoBuf.Property.newBuilder();
        for (KmTypeParameter kmTypeParameter : kmProperty.getTypeParameters()) {
            ProtoBuf.TypeParameter.Builder newBuilder2 = ProtoBuf.TypeParameter.newBuilder();
            Iterator<T> it = kmTypeParameter.getUpperBounds().iterator();
            while (it.hasNext()) {
                newBuilder2.addUpperBound(writeType(writeContext, (KmType) it.next()).build());
            }
            for (MetadataExtensions metadataExtensions : writeContext.getExtensions$kotlin_metadata()) {
                newBuilder2.getClass();
                metadataExtensions.writeTypeParameterExtensions(kmTypeParameter, newBuilder2, writeContext);
            }
            newBuilder2.setName(writeContext.get(kmTypeParameter.getName()));
            newBuilder2.setId(kmTypeParameter.getId());
            boolean isReified = Attributes.isReified(kmTypeParameter);
            if (isReified != ProtoBuf.TypeParameter.getDefaultInstance().getReified()) {
                newBuilder2.setReified(isReified);
            }
            if (kmTypeParameter.getVariance() == KmVariance.IN) {
                newBuilder2.setVariance(ProtoBuf.TypeParameter.Variance.IN);
            } else if (kmTypeParameter.getVariance() == KmVariance.OUT) {
                newBuilder2.setVariance(ProtoBuf.TypeParameter.Variance.OUT);
            }
            newBuilder.addTypeParameter(newBuilder2.build());
        }
        KmType receiverParameterType = kmProperty.getReceiverParameterType();
        if (receiverParameterType != null) {
            newBuilder.setReceiverType(writeType(writeContext, receiverParameterType).build());
        }
        List<KmValueParameter> contextParameters = kmProperty.getContextParameters();
        ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(contextParameters, 10));
        Iterator<T> it2 = contextParameters.iterator();
        while (it2.hasNext()) {
            arrayList.add(writeValueParameter(writeContext, (KmValueParameter) it2.next()).build());
        }
        newBuilder.addAllContextParameter(arrayList);
        List<KmValueParameter> contextParameters2 = kmProperty.getContextParameters();
        ArrayList arrayList2 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(contextParameters2, 10));
        Iterator<T> it3 = contextParameters2.iterator();
        while (it3.hasNext()) {
            arrayList2.add(writeType(writeContext, ((KmValueParameter) it3.next()).getType()).build());
        }
        newBuilder.addAllContextReceiverType(arrayList2);
        KmValueParameter setterParameter = kmProperty.getSetterParameter();
        if (setterParameter != null) {
            newBuilder.setSetterValueParameter(writeValueParameter(writeContext, setterParameter).build());
        }
        newBuilder.setReturnType(writeType(writeContext, kmProperty.getReturnType()).build());
        List<KmVersionRequirement> versionRequirements = kmProperty.getVersionRequirements();
        ArrayList arrayList3 = new ArrayList();
        Iterator<T> it4 = versionRequirements.iterator();
        while (true) {
            final int i = 1;
            if (!it4.hasNext()) {
                newBuilder.addAllVersionRequirement(arrayList3);
                Iterator<T> it5 = writeContext.getExtensions$kotlin_metadata().iterator();
                while (it5.hasNext()) {
                    ((MetadataExtensions) it5.next()).writePropertyExtensions(kmProperty, newBuilder, writeContext);
                }
                newBuilder.setName(writeContext.get(kmProperty.getName()));
                int flags$kotlin_metadata = kmProperty.getFlags$kotlin_metadata();
                Flags.BooleanFlagField booleanFlagField = Flags.HAS_ANNOTATIONS;
                int flags = flags$kotlin_metadata | booleanFlagField.toFlags(Boolean.valueOf(!kmProperty.getAnnotations().isEmpty()));
                if (flags != ProtoBuf.Property.getDefaultInstance().getFlags()) {
                    newBuilder.setFlags(flags);
                }
                newBuilder.setGetterFlags(kmProperty.getGetter().getFlags$kotlin_metadata() | booleanFlagField.toFlags(Boolean.valueOf(!kmProperty.getGetter().getAnnotations().isEmpty())));
                KmPropertyAccessorAttributes setter = kmProperty.getSetter();
                if (setter != null) {
                    newBuilder.setSetterFlags(booleanFlagField.toFlags(Boolean.valueOf(!setter.getAnnotations().isEmpty())) | setter.getFlags$kotlin_metadata());
                }
                return newBuilder;
            }
            KmVersionRequirement kmVersionRequirement = (KmVersionRequirement) it4.next();
            KmVersionRequirementVersionKind kind = kmVersionRequirement.getKind();
            KmVersionRequirementLevel level2 = kmVersionRequirement.getLevel();
            Integer errorCode = kmVersionRequirement.getErrorCode();
            String message = kmVersionRequirement.getMessage();
            final ProtoBuf.VersionRequirement.Builder newBuilder3 = ProtoBuf.VersionRequirement.newBuilder();
            int i2 = WhenMappings.$EnumSwitchMapping$0[kind.ordinal()];
            Integer num = null;
            if (i2 == 1) {
                versionKind = ProtoBuf.VersionRequirement.VersionKind.LANGUAGE_VERSION;
            } else if (i2 == 2) {
                versionKind = ProtoBuf.VersionRequirement.VersionKind.COMPILER_VERSION;
            } else if (i2 != 3) {
                if (i2 != 4) {
                    Drop$$ExternalSyntheticBUOutline0.m1m();
                    return null;
                }
                if (num == null) {
                    arrayList3.add(num);
                }
            } else {
                versionKind = ProtoBuf.VersionRequirement.VersionKind.API_VERSION;
            }
            if (versionKind != newBuilder3.getDefaultInstanceForType().getVersionKind()) {
                newBuilder3.setVersionKind(versionKind);
            }
            int i3 = WhenMappings.$EnumSwitchMapping$1[level2.ordinal()];
            if (i3 == 1) {
                level = ProtoBuf.VersionRequirement.Level.WARNING;
            } else if (i3 == 2) {
                level = ProtoBuf.VersionRequirement.Level.ERROR;
            } else {
                if (i3 != 3) {
                    Drop$$ExternalSyntheticBUOutline0.m1m();
                    return null;
                }
                level = ProtoBuf.VersionRequirement.Level.HIDDEN;
            }
            if (level != newBuilder3.getDefaultInstanceForType().getLevel()) {
                newBuilder3.setLevel(level);
            }
            if (errorCode != null) {
                newBuilder3.setErrorCode(errorCode.intValue());
            }
            if (message != null) {
                newBuilder3.setMessage(writeContext.get(message));
            }
            KmVersion version = kmVersionRequirement.getVersion();
            final int i4 = 0;
            new VersionRequirement.Version(version.component1(), version.component2(), version.component3()).encode(new Function1(newBuilder3, i4) { // from class: kotlin.reflect.jvm.internal.impl.km.internal.WritersKt$$Lambda$0
                public final /* synthetic */ int $r8$classId;
                public final ProtoBuf.VersionRequirement.Builder arg$0;

                {
                    this.$r8$classId = i4;
                    this.arg$0 = newBuilder3;
                }

                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    int i5 = this.$r8$classId;
                    ProtoBuf.VersionRequirement.Builder builder = this.arg$0;
                    int intValue = ((Number) obj).intValue();
                    switch (i5) {
                        case 0:
                            builder.setVersion(intValue);
                            break;
                        default:
                            builder.setVersionFull(intValue);
                            break;
                    }
                    return Unit.INSTANCE;
                }
            }, new Function1(newBuilder3, i) { // from class: kotlin.reflect.jvm.internal.impl.km.internal.WritersKt$$Lambda$0
                public final /* synthetic */ int $r8$classId;
                public final ProtoBuf.VersionRequirement.Builder arg$0;

                {
                    this.$r8$classId = i;
                    this.arg$0 = newBuilder3;
                }

                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    int i5 = this.$r8$classId;
                    ProtoBuf.VersionRequirement.Builder builder = this.arg$0;
                    int intValue = ((Number) obj).intValue();
                    switch (i5) {
                        case 0:
                            builder.setVersion(intValue);
                            break;
                        default:
                            builder.setVersionFull(intValue);
                            break;
                    }
                    return Unit.INSTANCE;
                }
            });
            num = Integer.valueOf(writeContext.getVersionRequirements$kotlin_metadata().get(newBuilder3));
            if (num == null) {
            }
        }
    }

    public static final ProtoBuf.Type.Builder writeType(WriteContext writeContext, KmType kmType) {
        ProtoBuf.Type.Builder newBuilder = ProtoBuf.Type.newBuilder();
        KmClassifier classifier = kmType.getClassifier();
        if (classifier instanceof KmClassifier.Class) {
            newBuilder.setClassName(writeContext.getClassName$kotlin_metadata(((KmClassifier.Class) classifier).getName()));
        } else if (classifier instanceof KmClassifier.TypeAlias) {
            newBuilder.setTypeAliasName(writeContext.getClassName$kotlin_metadata(((KmClassifier.TypeAlias) classifier).getName()));
        } else {
            if (!(classifier instanceof KmClassifier.TypeParameter)) {
                Drop$$ExternalSyntheticBUOutline0.m1m();
                return null;
            }
            newBuilder.setTypeParameter(((KmClassifier.TypeParameter) classifier).getId());
        }
        for (KmTypeProjection kmTypeProjection : kmType.getArguments()) {
            ProtoBuf.Type.Argument.Builder newBuilder2 = ProtoBuf.Type.Argument.newBuilder();
            if (Intrinsics.areEqual(kmTypeProjection, KmTypeProjection.STAR)) {
                newBuilder2.setProjection(ProtoBuf.Type.Argument.Projection.STAR);
            } else {
                KmVariance component1 = kmTypeProjection.component1();
                KmType component2 = kmTypeProjection.component2();
                if (component1 == null || component2 == null) {
                    throw new InconsistentKotlinMetadataException("Variance and type must be set for non-star type projection", null, 2, null);
                }
                if (component1 == KmVariance.IN) {
                    newBuilder2.setProjection(ProtoBuf.Type.Argument.Projection.IN);
                } else if (component1 == KmVariance.OUT) {
                    newBuilder2.setProjection(ProtoBuf.Type.Argument.Projection.OUT);
                }
                newBuilder2.setType(writeType(writeContext, component2).build());
            }
            newBuilder2.getClass();
            newBuilder.addArgument(newBuilder2);
        }
        KmType abbreviatedType = kmType.getAbbreviatedType();
        if (abbreviatedType != null) {
            newBuilder.setAbbreviatedType(writeType(writeContext, abbreviatedType).build());
        }
        KmType outerType = kmType.getOuterType();
        if (outerType != null) {
            newBuilder.setOuterType(writeType(writeContext, outerType).build());
        }
        KmFlexibleTypeUpperBound flexibleTypeUpperBound = kmType.getFlexibleTypeUpperBound();
        if (flexibleTypeUpperBound != null) {
            ProtoBuf.Type.Builder writeType = writeType(writeContext, flexibleTypeUpperBound.getType());
            String typeFlexibilityId = flexibleTypeUpperBound.getTypeFlexibilityId();
            if (typeFlexibilityId != null) {
                newBuilder.setFlexibleTypeCapabilitiesId(writeContext.get(typeFlexibilityId));
            }
            newBuilder.setFlexibleUpperBound(writeType.build());
        }
        for (MetadataExtensions metadataExtensions : writeContext.getExtensions$kotlin_metadata()) {
            newBuilder.getClass();
            metadataExtensions.writeTypeExtensions(kmType, newBuilder, writeContext);
        }
        if (Attributes.isNullable(kmType)) {
            newBuilder.setNullable(true);
        }
        int flags$kotlin_metadata = kmType.getFlags$kotlin_metadata() >> 1;
        if (flags$kotlin_metadata != ProtoBuf.Type.getDefaultInstance().getFlags()) {
            newBuilder.setFlags(flags$kotlin_metadata);
        }
        newBuilder.getClass();
        return newBuilder;
    }

    public static final ProtoBuf.ValueParameter.Builder writeValueParameter(WriteContext writeContext, KmValueParameter kmValueParameter) {
        ProtoBuf.ValueParameter.Builder newBuilder = ProtoBuf.ValueParameter.newBuilder();
        newBuilder.setType(writeType(writeContext, kmValueParameter.getType()).build());
        KmType varargElementType = kmValueParameter.getVarargElementType();
        if (varargElementType != null) {
            newBuilder.setVarargElementType(writeType(writeContext, varargElementType).build());
        }
        KmAnnotationArgument annotationParameterDefaultValue = kmValueParameter.getAnnotationParameterDefaultValue();
        if (annotationParameterDefaultValue != null) {
            newBuilder.setAnnotationParameterDefaultValue(WriteUtilsKt.writeAnnotationArgument(annotationParameterDefaultValue, writeContext.getStrings()).build());
        }
        Iterator<T> it = writeContext.getExtensions$kotlin_metadata().iterator();
        while (it.hasNext()) {
            ((MetadataExtensions) it.next()).writeValueParameterExtensions(kmValueParameter, newBuilder, writeContext);
        }
        int flags$kotlin_metadata = kmValueParameter.getFlags$kotlin_metadata() | Flags.HAS_ANNOTATIONS.toFlags(Boolean.valueOf(!kmValueParameter.getAnnotations().isEmpty()));
        if (flags$kotlin_metadata != ProtoBuf.ValueParameter.getDefaultInstance().getFlags()) {
            newBuilder.setFlags(flags$kotlin_metadata);
        }
        newBuilder.setName(writeContext.get(kmValueParameter.getName()));
        return newBuilder;
    }
}
