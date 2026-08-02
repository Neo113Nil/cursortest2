package kotlin.reflect.jvm.internal.impl.km.internal;

import bo.app.a$$ExternalSyntheticBUOutline0;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import java.util.Iterator;
import java.util.List;
import kotlin.DeprecationLevel;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.km.InconsistentKotlinMetadataException;
import kotlin.reflect.jvm.internal.impl.km.KmAnnotation;
import kotlin.reflect.jvm.internal.impl.km.KmClass;
import kotlin.reflect.jvm.internal.impl.km.KmClassifier;
import kotlin.reflect.jvm.internal.impl.km.KmConstantValue;
import kotlin.reflect.jvm.internal.impl.km.KmConstructor;
import kotlin.reflect.jvm.internal.impl.km.KmContract;
import kotlin.reflect.jvm.internal.impl.km.KmDeclarationContainer;
import kotlin.reflect.jvm.internal.impl.km.KmEffect;
import kotlin.reflect.jvm.internal.impl.km.KmEffectExpression;
import kotlin.reflect.jvm.internal.impl.km.KmEffectInvocationKind;
import kotlin.reflect.jvm.internal.impl.km.KmEffectType;
import kotlin.reflect.jvm.internal.impl.km.KmEnumEntry;
import kotlin.reflect.jvm.internal.impl.km.KmFlexibleTypeUpperBound;
import kotlin.reflect.jvm.internal.impl.km.KmFunction;
import kotlin.reflect.jvm.internal.impl.km.KmLambda;
import kotlin.reflect.jvm.internal.impl.km.KmPackage;
import kotlin.reflect.jvm.internal.impl.km.KmProperty;
import kotlin.reflect.jvm.internal.impl.km.KmType;
import kotlin.reflect.jvm.internal.impl.km.KmTypeAlias;
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
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.NameResolver;
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.ProtoTypeTableUtilKt;
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.TypeTable;
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.VersionRequirement;
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.VersionRequirementTable;

/* loaded from: classes9.dex */
public final class ReadersKt {

    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;
        public static final /* synthetic */ int[] $EnumSwitchMapping$2;
        public static final /* synthetic */ int[] $EnumSwitchMapping$3;
        public static final /* synthetic */ int[] $EnumSwitchMapping$4;
        public static final /* synthetic */ int[] $EnumSwitchMapping$5;
        public static final /* synthetic */ int[] $EnumSwitchMapping$6;

        static {
            int[] iArr = new int[ProtoBuf.TypeParameter.Variance.values().length];
            try {
                iArr[ProtoBuf.TypeParameter.Variance.IN.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ProtoBuf.TypeParameter.Variance.OUT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[ProtoBuf.TypeParameter.Variance.INV.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[ProtoBuf.Type.Argument.Projection.values().length];
            try {
                iArr2[ProtoBuf.Type.Argument.Projection.IN.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[ProtoBuf.Type.Argument.Projection.OUT.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr2[ProtoBuf.Type.Argument.Projection.INV.ordinal()] = 3;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr2[ProtoBuf.Type.Argument.Projection.STAR.ordinal()] = 4;
            } catch (NoSuchFieldError unused7) {
            }
            $EnumSwitchMapping$1 = iArr2;
            int[] iArr3 = new int[ProtoBuf.VersionRequirement.VersionKind.values().length];
            try {
                iArr3[ProtoBuf.VersionRequirement.VersionKind.LANGUAGE_VERSION.ordinal()] = 1;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr3[ProtoBuf.VersionRequirement.VersionKind.COMPILER_VERSION.ordinal()] = 2;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr3[ProtoBuf.VersionRequirement.VersionKind.API_VERSION.ordinal()] = 3;
            } catch (NoSuchFieldError unused10) {
            }
            $EnumSwitchMapping$2 = iArr3;
            int[] iArr4 = new int[DeprecationLevel.values().length];
            try {
                DeprecationLevel deprecationLevel = DeprecationLevel.WARNING;
                iArr4[0] = 1;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                DeprecationLevel deprecationLevel2 = DeprecationLevel.WARNING;
                iArr4[1] = 2;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                DeprecationLevel deprecationLevel3 = DeprecationLevel.WARNING;
                iArr4[2] = 3;
            } catch (NoSuchFieldError unused13) {
            }
            $EnumSwitchMapping$3 = iArr4;
            int[] iArr5 = new int[ProtoBuf.Effect.EffectType.values().length];
            try {
                iArr5[ProtoBuf.Effect.EffectType.RETURNS_CONSTANT.ordinal()] = 1;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                iArr5[ProtoBuf.Effect.EffectType.CALLS.ordinal()] = 2;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                iArr5[ProtoBuf.Effect.EffectType.RETURNS_NOT_NULL.ordinal()] = 3;
            } catch (NoSuchFieldError unused16) {
            }
            $EnumSwitchMapping$4 = iArr5;
            int[] iArr6 = new int[ProtoBuf.Effect.InvocationKind.values().length];
            try {
                iArr6[ProtoBuf.Effect.InvocationKind.AT_MOST_ONCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                iArr6[ProtoBuf.Effect.InvocationKind.EXACTLY_ONCE.ordinal()] = 2;
            } catch (NoSuchFieldError unused18) {
            }
            try {
                iArr6[ProtoBuf.Effect.InvocationKind.AT_LEAST_ONCE.ordinal()] = 3;
            } catch (NoSuchFieldError unused19) {
            }
            $EnumSwitchMapping$5 = iArr6;
            int[] iArr7 = new int[ProtoBuf.Expression.ConstantValue.values().length];
            try {
                iArr7[ProtoBuf.Expression.ConstantValue.TRUE.ordinal()] = 1;
            } catch (NoSuchFieldError unused20) {
            }
            try {
                iArr7[ProtoBuf.Expression.ConstantValue.FALSE.ordinal()] = 2;
            } catch (NoSuchFieldError unused21) {
            }
            try {
                iArr7[ProtoBuf.Expression.ConstantValue.NULL.ordinal()] = 3;
            } catch (NoSuchFieldError unused22) {
            }
            $EnumSwitchMapping$6 = iArr7;
        }
    }

    public static final int getDefaultPropertyAccessorFlags(int i) {
        Boolean bool = Flags.HAS_ANNOTATIONS.get(i);
        bool.getClass();
        return Flags.getAccessorFlags(bool.booleanValue(), Flags.VISIBILITY.get(i), Flags.MODALITY.get(i), false, false, false);
    }

    public static final int getPropertyGetterFlags(ProtoBuf.Property property) {
        property.getClass();
        return property.hasGetterFlags() ? property.getGetterFlags() : getDefaultPropertyAccessorFlags(property.getFlags());
    }

    public static final int getPropertySetterFlags(ProtoBuf.Property property) {
        property.getClass();
        return property.hasSetterFlags() ? property.getSetterFlags() : getDefaultPropertyAccessorFlags(property.getFlags());
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x008a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final KmVersionRequirement readVersionRequirement(int i, ReadContext readContext) {
        KmVersionRequirementVersionKind kmVersionRequirementVersionKind;
        KmVersionRequirementLevel kmVersionRequirementLevel;
        KmVersionRequirement kmVersionRequirement = new KmVersionRequirement();
        VersionRequirement create = VersionRequirement.Companion.create(i, readContext.getStrings(), readContext.getVersionRequirements$kotlin_metadata());
        if (create == null && !readContext.getIgnoreUnknownVersionRequirements$kotlin_metadata()) {
            throw new InconsistentKotlinMetadataException("No VersionRequirement with the given id in the table", null, 2, null);
        }
        ProtoBuf.VersionRequirement.VersionKind kind = create != null ? create.getKind() : null;
        int i2 = kind == null ? -1 : WhenMappings.$EnumSwitchMapping$2[kind.ordinal()];
        if (i2 == -1) {
            kmVersionRequirementVersionKind = KmVersionRequirementVersionKind.UNKNOWN;
        } else if (i2 == 1) {
            kmVersionRequirementVersionKind = KmVersionRequirementVersionKind.LANGUAGE_VERSION;
        } else if (i2 == 2) {
            kmVersionRequirementVersionKind = KmVersionRequirementVersionKind.COMPILER_VERSION;
        } else {
            if (i2 != 3) {
                Drop$$ExternalSyntheticBUOutline0.m1m();
                return null;
            }
            kmVersionRequirementVersionKind = KmVersionRequirementVersionKind.API_VERSION;
        }
        DeprecationLevel level = create != null ? create.getLevel() : null;
        int i3 = level == null ? -1 : WhenMappings.$EnumSwitchMapping$3[level.ordinal()];
        if (i3 != -1) {
            if (i3 == 1) {
                kmVersionRequirementLevel = KmVersionRequirementLevel.WARNING;
            } else if (i3 == 2) {
                kmVersionRequirementLevel = KmVersionRequirementLevel.ERROR;
            } else if (i3 != 3) {
                Drop$$ExternalSyntheticBUOutline0.m1m();
                return null;
            }
            kmVersionRequirement.setKind(kmVersionRequirementVersionKind);
            kmVersionRequirement.setLevel(kmVersionRequirementLevel);
            kmVersionRequirement.setErrorCode(create == null ? create.getErrorCode() : null);
            kmVersionRequirement.setMessage(create != null ? create.getMessage() : null);
            if (create != null || (r8 = create.getVersion()) == null) {
                VersionRequirement.Version version = VersionRequirement.Version.INFINITY;
            }
            kmVersionRequirement.setVersion(new KmVersion(version.component1(), version.component2(), version.component3()));
            return kmVersionRequirement;
        }
        kmVersionRequirementLevel = KmVersionRequirementLevel.HIDDEN;
        kmVersionRequirement.setKind(kmVersionRequirementVersionKind);
        kmVersionRequirement.setLevel(kmVersionRequirementLevel);
        kmVersionRequirement.setErrorCode(create == null ? create.getErrorCode() : null);
        kmVersionRequirement.setMessage(create != null ? create.getMessage() : null);
        if (create != null) {
        }
        VersionRequirement.Version version2 = VersionRequirement.Version.INFINITY;
        kmVersionRequirement.setVersion(new KmVersion(version2.component1(), version2.component2(), version2.component3()));
        return kmVersionRequirement;
    }

    /* JADX WARN: Code restructure failed: missing block: B:89:0x0295, code lost:
    
        if (r13 == false) goto L66;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final KmClass toKmClass(ProtoBuf.Class r10, NameResolver nameResolver, boolean z, List<? extends Object> list) {
        r10.getClass();
        nameResolver.getClass();
        list.getClass();
        KmClass kmClass = new KmClass();
        ProtoBuf.TypeTable typeTable = r10.getTypeTable();
        typeTable.getClass();
        TypeTable typeTable2 = new TypeTable(typeTable);
        VersionRequirementTable.Companion companion = VersionRequirementTable.Companion;
        ProtoBuf.VersionRequirementTable versionRequirementTable = r10.getVersionRequirementTable();
        versionRequirementTable.getClass();
        ReadContext readContext = new ReadContext(nameResolver, typeTable2, companion.create(versionRequirementTable), z, null, list, 16, null);
        List<ProtoBuf.TypeParameter> typeParameterList = r10.getTypeParameterList();
        typeParameterList.getClass();
        ReadContext withTypeParameters$kotlin_metadata = readContext.withTypeParameters$kotlin_metadata(typeParameterList);
        kmClass.setFlags$kotlin_metadata(r10.getFlags());
        kmClass.setName(withTypeParameters$kotlin_metadata.className$kotlin_metadata(r10.getFqName()));
        List<ProtoBuf.TypeParameter> typeParameterList2 = r10.getTypeParameterList();
        typeParameterList2.getClass();
        List<KmTypeParameter> typeParameters = kmClass.getTypeParameters();
        for (ProtoBuf.TypeParameter typeParameter : typeParameterList2) {
            typeParameter.getClass();
            typeParameters.add(toKmTypeParameter(typeParameter, withTypeParameters$kotlin_metadata));
        }
        List<ProtoBuf.Type> supertypes = ProtoTypeTableUtilKt.supertypes(r10, withTypeParameters$kotlin_metadata.getTypes());
        List<KmType> supertypes2 = kmClass.getSupertypes();
        Iterator<T> it = supertypes.iterator();
        while (it.hasNext()) {
            supertypes2.add(toKmType((ProtoBuf.Type) it.next(), withTypeParameters$kotlin_metadata));
        }
        List<ProtoBuf.Constructor> constructorList = r10.getConstructorList();
        constructorList.getClass();
        List<KmConstructor> constructors = kmClass.getConstructors();
        for (ProtoBuf.Constructor constructor : constructorList) {
            constructor.getClass();
            KmConstructor kmConstructor = new KmConstructor(constructor.getFlags());
            List<ProtoBuf.ValueParameter> valueParameterList = constructor.getValueParameterList();
            valueParameterList.getClass();
            List<KmValueParameter> valueParameters = kmConstructor.getValueParameters();
            for (ProtoBuf.ValueParameter valueParameter : valueParameterList) {
                valueParameter.getClass();
                valueParameters.add(toKmValueParameter(valueParameter, withTypeParameters$kotlin_metadata));
            }
            List<Integer> versionRequirementList = constructor.getVersionRequirementList();
            versionRequirementList.getClass();
            List<KmVersionRequirement> versionRequirements = kmConstructor.getVersionRequirements();
            for (Integer num : versionRequirementList) {
                num.getClass();
                versionRequirements.add(readVersionRequirement(num.intValue(), withTypeParameters$kotlin_metadata));
            }
            Iterator<T> it2 = withTypeParameters$kotlin_metadata.getExtensions$kotlin_metadata().iterator();
            while (it2.hasNext()) {
                ((MetadataExtensions) it2.next()).readConstructorExtensions(kmConstructor, constructor, withTypeParameters$kotlin_metadata);
            }
            constructors.add(kmConstructor);
        }
        List<ProtoBuf.Function> functionList = r10.getFunctionList();
        functionList.getClass();
        List<ProtoBuf.Property> propertyList = r10.getPropertyList();
        propertyList.getClass();
        List<ProtoBuf.TypeAlias> typeAliasList = r10.getTypeAliasList();
        typeAliasList.getClass();
        visitDeclarations(kmClass, functionList, propertyList, typeAliasList, withTypeParameters$kotlin_metadata);
        if (r10.hasCompanionObjectName()) {
            kmClass.setCompanionObject(withTypeParameters$kotlin_metadata.get(r10.getCompanionObjectName()));
        }
        List<Integer> nestedClassNameList = r10.getNestedClassNameList();
        nestedClassNameList.getClass();
        List<String> nestedClasses = kmClass.getNestedClasses();
        for (Integer num2 : nestedClassNameList) {
            num2.getClass();
            nestedClasses.add(withTypeParameters$kotlin_metadata.get(num2.intValue()));
        }
        Iterator<ProtoBuf.EnumEntry> it3 = r10.getEnumEntryList().iterator();
        while (true) {
            if (!it3.hasNext()) {
                List<Integer> sealedSubclassFqNameList = r10.getSealedSubclassFqNameList();
                sealedSubclassFqNameList.getClass();
                List<String> sealedSubclasses = kmClass.getSealedSubclasses();
                for (Integer num3 : sealedSubclassFqNameList) {
                    num3.getClass();
                    sealedSubclasses.add(withTypeParameters$kotlin_metadata.className$kotlin_metadata(num3.intValue()));
                }
                if (r10.hasInlineClassUnderlyingPropertyName()) {
                    kmClass.setInlineClassUnderlyingPropertyName(withTypeParameters$kotlin_metadata.get(r10.getInlineClassUnderlyingPropertyName()));
                }
                ProtoBuf.Type inlineClassUnderlyingType = ProtoTypeTableUtilKt.inlineClassUnderlyingType(r10, withTypeParameters$kotlin_metadata.getTypes());
                if (inlineClassUnderlyingType == null) {
                    if (r10.hasInlineClassUnderlyingPropertyName()) {
                        List<ProtoBuf.Property> propertyList2 = r10.getPropertyList();
                        propertyList2.getClass();
                        Iterator<T> it4 = propertyList2.iterator();
                        boolean z2 = false;
                        Object obj = null;
                        while (true) {
                            if (it4.hasNext()) {
                                Object next = it4.next();
                                ProtoBuf.Property property = (ProtoBuf.Property) next;
                                property.getClass();
                                if (ProtoTypeTableUtilKt.receiverType(property, withTypeParameters$kotlin_metadata.getTypes()) == null && Intrinsics.areEqual(withTypeParameters$kotlin_metadata.get(property.getName()), withTypeParameters$kotlin_metadata.get(r10.getInlineClassUnderlyingPropertyName()))) {
                                    if (z2) {
                                        break;
                                    }
                                    z2 = true;
                                    obj = next;
                                }
                            }
                        }
                        obj = null;
                        ProtoBuf.Property property2 = (ProtoBuf.Property) obj;
                        if (property2 != null) {
                            inlineClassUnderlyingType = ProtoTypeTableUtilKt.returnType(property2, withTypeParameters$kotlin_metadata.getTypes());
                        }
                    }
                    inlineClassUnderlyingType = null;
                }
                kmClass.setInlineClassUnderlyingType(inlineClassUnderlyingType != null ? toKmType(inlineClassUnderlyingType, withTypeParameters$kotlin_metadata) : null);
                List<ProtoBuf.Type> contextReceiverTypes = ProtoTypeTableUtilKt.contextReceiverTypes(r10, withTypeParameters$kotlin_metadata.getTypes());
                List<KmType> contextReceiverTypes2 = kmClass.getContextReceiverTypes();
                Iterator<T> it5 = contextReceiverTypes.iterator();
                while (it5.hasNext()) {
                    contextReceiverTypes2.add(toKmType((ProtoBuf.Type) it5.next(), withTypeParameters$kotlin_metadata));
                }
                List<Integer> versionRequirementList2 = r10.getVersionRequirementList();
                versionRequirementList2.getClass();
                List<KmVersionRequirement> versionRequirements2 = kmClass.getVersionRequirements();
                for (Integer num4 : versionRequirementList2) {
                    num4.getClass();
                    versionRequirements2.add(readVersionRequirement(num4.intValue(), withTypeParameters$kotlin_metadata));
                }
                Iterator<T> it6 = withTypeParameters$kotlin_metadata.getExtensions$kotlin_metadata().iterator();
                while (it6.hasNext()) {
                    ((MetadataExtensions) it6.next()).readClassExtensions(kmClass, r10, withTypeParameters$kotlin_metadata);
                }
                return kmClass;
            }
            ProtoBuf.EnumEntry next2 = it3.next();
            if (!next2.hasName()) {
                throw new InconsistentKotlinMetadataException("No name for EnumEntry", null, 2, null);
            }
            kmClass.getEnumEntries().add(withTypeParameters$kotlin_metadata.get(next2.getName()));
            List<KmEnumEntry> kmEnumEntries = kmClass.getKmEnumEntries();
            KmEnumEntry kmEnumEntry = new KmEnumEntry(withTypeParameters$kotlin_metadata.get(next2.getName()));
            Iterator<T> it7 = withTypeParameters$kotlin_metadata.getExtensions$kotlin_metadata().iterator();
            while (it7.hasNext()) {
                ((MetadataExtensions) it7.next()).readEnumEntryExtensions(kmEnumEntry, next2, withTypeParameters$kotlin_metadata);
            }
            kmEnumEntries.add(kmEnumEntry);
        }
    }

    public static KmClass toKmClass$default(ProtoBuf.Class r0, NameResolver nameResolver, boolean z, List list, int i, Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        if ((i & 4) != 0) {
            list = EmptyList.INSTANCE;
        }
        return toKmClass(r0, nameResolver, z, list);
    }

    public static final KmEffectExpression toKmEffectExpression(ProtoBuf.Expression expression, ReadContext readContext) {
        Boolean bool;
        KmEffectExpression kmEffectExpression = new KmEffectExpression();
        kmEffectExpression.setFlags$kotlin_metadata(expression.getFlags());
        kmEffectExpression.setParameterIndex(expression.hasValueParameterReference() ? Integer.valueOf(expression.getValueParameterReference()) : null);
        if (expression.hasConstantValue()) {
            ProtoBuf.Expression.ConstantValue constantValue = expression.getConstantValue();
            if (constantValue == null) {
                a$$ExternalSyntheticBUOutline0.m$3("Required value was null.");
                return null;
            }
            int i = WhenMappings.$EnumSwitchMapping$6[constantValue.ordinal()];
            if (i == 1) {
                bool = Boolean.TRUE;
            } else if (i == 2) {
                bool = Boolean.FALSE;
            } else {
                if (i != 3) {
                    Drop$$ExternalSyntheticBUOutline0.m1m();
                    return null;
                }
                bool = null;
            }
            kmEffectExpression.setConstantValue(new KmConstantValue(bool));
        }
        ProtoBuf.Type isInstanceType = ProtoTypeTableUtilKt.isInstanceType(expression, readContext.getTypes());
        kmEffectExpression.setInstanceType(isInstanceType != null ? toKmType(isInstanceType, readContext) : null);
        List<ProtoBuf.Expression> andArgumentList = expression.getAndArgumentList();
        andArgumentList.getClass();
        List<KmEffectExpression> andArguments = kmEffectExpression.getAndArguments();
        for (ProtoBuf.Expression expression2 : andArgumentList) {
            expression2.getClass();
            andArguments.add(toKmEffectExpression(expression2, readContext));
        }
        List<ProtoBuf.Expression> orArgumentList = expression.getOrArgumentList();
        orArgumentList.getClass();
        List<KmEffectExpression> orArguments = kmEffectExpression.getOrArguments();
        for (ProtoBuf.Expression expression3 : orArgumentList) {
            expression3.getClass();
            orArguments.add(toKmEffectExpression(expression3, readContext));
        }
        return kmEffectExpression;
    }

    public static final KmFunction toKmFunction(ProtoBuf.Function function, ReadContext readContext) {
        KmEffectType kmEffectType;
        KmEffectInvocationKind kmEffectInvocationKind;
        KmFunction kmFunction = new KmFunction(function.getFlags(), readContext.get(function.getName()));
        List<ProtoBuf.TypeParameter> typeParameterList = function.getTypeParameterList();
        typeParameterList.getClass();
        ReadContext withTypeParameters$kotlin_metadata = readContext.withTypeParameters$kotlin_metadata(typeParameterList);
        List<ProtoBuf.TypeParameter> typeParameterList2 = function.getTypeParameterList();
        typeParameterList2.getClass();
        List<KmTypeParameter> typeParameters = kmFunction.getTypeParameters();
        for (ProtoBuf.TypeParameter typeParameter : typeParameterList2) {
            typeParameter.getClass();
            typeParameters.add(toKmTypeParameter(typeParameter, withTypeParameters$kotlin_metadata));
        }
        ProtoBuf.Type receiverType = ProtoTypeTableUtilKt.receiverType(function, withTypeParameters$kotlin_metadata.getTypes());
        kmFunction.setReceiverParameterType(receiverType != null ? toKmType(receiverType, withTypeParameters$kotlin_metadata) : null);
        List<ProtoBuf.ValueParameter> contextParameterList = function.getContextParameterList();
        contextParameterList.getClass();
        List<KmValueParameter> contextParameters = kmFunction.getContextParameters();
        for (ProtoBuf.ValueParameter valueParameter : contextParameterList) {
            valueParameter.getClass();
            contextParameters.add(toKmValueParameter(valueParameter, withTypeParameters$kotlin_metadata));
        }
        if (function.getContextParameterList().isEmpty()) {
            List<ProtoBuf.Type> contextReceiverTypeList = function.getContextReceiverTypeList();
            contextReceiverTypeList.getClass();
            if (!contextReceiverTypeList.isEmpty()) {
                List<ProtoBuf.Type> contextReceiverTypes = ProtoTypeTableUtilKt.contextReceiverTypes(function, withTypeParameters$kotlin_metadata.getTypes());
                List<KmValueParameter> contextParameters2 = kmFunction.getContextParameters();
                Iterator<T> it = contextReceiverTypes.iterator();
                while (it.hasNext()) {
                    KmType kmType = toKmType((ProtoBuf.Type) it.next(), withTypeParameters$kotlin_metadata);
                    KmValueParameter kmValueParameter = new KmValueParameter(0, "_");
                    kmValueParameter.setType(kmType);
                    contextParameters2.add(kmValueParameter);
                }
            }
        }
        List<ProtoBuf.ValueParameter> valueParameterList = function.getValueParameterList();
        valueParameterList.getClass();
        List<KmValueParameter> valueParameters = kmFunction.getValueParameters();
        for (ProtoBuf.ValueParameter valueParameter2 : valueParameterList) {
            valueParameter2.getClass();
            valueParameters.add(toKmValueParameter(valueParameter2, withTypeParameters$kotlin_metadata));
        }
        kmFunction.setReturnType(toKmType(ProtoTypeTableUtilKt.returnType(function, withTypeParameters$kotlin_metadata.getTypes()), withTypeParameters$kotlin_metadata));
        if (function.hasContract()) {
            ProtoBuf.Contract contract = function.getContract();
            contract.getClass();
            KmContract kmContract = new KmContract();
            for (ProtoBuf.Effect effect : contract.getEffectList()) {
                if (effect.hasEffectType()) {
                    ProtoBuf.Effect.EffectType effectType = effect.getEffectType();
                    if (effectType == null) {
                        a$$ExternalSyntheticBUOutline0.m$3("Required value was null.");
                        return null;
                    }
                    int i = WhenMappings.$EnumSwitchMapping$4[effectType.ordinal()];
                    if (i == 1) {
                        kmEffectType = KmEffectType.RETURNS_CONSTANT;
                    } else if (i == 2) {
                        kmEffectType = KmEffectType.CALLS;
                    } else {
                        if (i != 3) {
                            Drop$$ExternalSyntheticBUOutline0.m1m();
                            return null;
                        }
                        kmEffectType = KmEffectType.RETURNS_NOT_NULL;
                    }
                    if (effect.hasKind()) {
                        ProtoBuf.Effect.InvocationKind kind = effect.getKind();
                        if (kind == null) {
                            a$$ExternalSyntheticBUOutline0.m$3("Required value was null.");
                            return null;
                        }
                        int i2 = WhenMappings.$EnumSwitchMapping$5[kind.ordinal()];
                        if (i2 == 1) {
                            kmEffectInvocationKind = KmEffectInvocationKind.AT_MOST_ONCE;
                        } else if (i2 == 2) {
                            kmEffectInvocationKind = KmEffectInvocationKind.EXACTLY_ONCE;
                        } else {
                            if (i2 != 3) {
                                Drop$$ExternalSyntheticBUOutline0.m1m();
                                return null;
                            }
                            kmEffectInvocationKind = KmEffectInvocationKind.AT_LEAST_ONCE;
                        }
                    } else {
                        kmEffectInvocationKind = null;
                    }
                    List<KmEffect> effects = kmContract.getEffects();
                    KmEffect kmEffect = new KmEffect(kmEffectType, kmEffectInvocationKind);
                    List<ProtoBuf.Expression> effectConstructorArgumentList = effect.getEffectConstructorArgumentList();
                    effectConstructorArgumentList.getClass();
                    List<KmEffectExpression> constructorArguments = kmEffect.getConstructorArguments();
                    for (ProtoBuf.Expression expression : effectConstructorArgumentList) {
                        expression.getClass();
                        constructorArguments.add(toKmEffectExpression(expression, withTypeParameters$kotlin_metadata));
                    }
                    if (effect.hasConclusionOfConditionalEffect()) {
                        ProtoBuf.Expression conclusionOfConditionalEffect = effect.getConclusionOfConditionalEffect();
                        conclusionOfConditionalEffect.getClass();
                        kmEffect.setConclusion(toKmEffectExpression(conclusionOfConditionalEffect, withTypeParameters$kotlin_metadata));
                    }
                    effects.add(kmEffect);
                }
            }
            kmFunction.setContract(kmContract);
        }
        List<Integer> versionRequirementList = function.getVersionRequirementList();
        versionRequirementList.getClass();
        List<KmVersionRequirement> versionRequirements = kmFunction.getVersionRequirements();
        for (Integer num : versionRequirementList) {
            num.getClass();
            versionRequirements.add(readVersionRequirement(num.intValue(), withTypeParameters$kotlin_metadata));
        }
        Iterator<T> it2 = withTypeParameters$kotlin_metadata.getExtensions$kotlin_metadata().iterator();
        while (it2.hasNext()) {
            ((MetadataExtensions) it2.next()).readFunctionExtensions(kmFunction, function, withTypeParameters$kotlin_metadata);
        }
        return kmFunction;
    }

    public static final KmLambda toKmLambda(ProtoBuf.Function function, NameResolver nameResolver, boolean z) {
        function.getClass();
        nameResolver.getClass();
        KmLambda kmLambda = new KmLambda();
        ProtoBuf.TypeTable typeTable = function.getTypeTable();
        typeTable.getClass();
        kmLambda.setFunction(toKmFunction(function, new ReadContext(nameResolver, new TypeTable(typeTable), VersionRequirementTable.Companion.getEMPTY(), z, null, null, 48, null)));
        return kmLambda;
    }

    public static final KmPackage toKmPackage(ProtoBuf.Package r10, NameResolver nameResolver, boolean z, List<? extends Object> list) {
        r10.getClass();
        nameResolver.getClass();
        list.getClass();
        KmPackage kmPackage = new KmPackage();
        ProtoBuf.TypeTable typeTable = r10.getTypeTable();
        typeTable.getClass();
        TypeTable typeTable2 = new TypeTable(typeTable);
        VersionRequirementTable.Companion companion = VersionRequirementTable.Companion;
        ProtoBuf.VersionRequirementTable versionRequirementTable = r10.getVersionRequirementTable();
        versionRequirementTable.getClass();
        ReadContext readContext = new ReadContext(nameResolver, typeTable2, companion.create(versionRequirementTable), z, null, list, 16, null);
        List<ProtoBuf.Function> functionList = r10.getFunctionList();
        functionList.getClass();
        List<ProtoBuf.Property> propertyList = r10.getPropertyList();
        propertyList.getClass();
        List<ProtoBuf.TypeAlias> typeAliasList = r10.getTypeAliasList();
        typeAliasList.getClass();
        visitDeclarations(kmPackage, functionList, propertyList, typeAliasList, readContext);
        Iterator<T> it = readContext.getExtensions$kotlin_metadata().iterator();
        while (it.hasNext()) {
            ((MetadataExtensions) it.next()).readPackageExtensions(kmPackage, r10, readContext);
        }
        return kmPackage;
    }

    public static KmPackage toKmPackage$default(ProtoBuf.Package r0, NameResolver nameResolver, boolean z, List list, int i, Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        if ((i & 4) != 0) {
            list = EmptyList.INSTANCE;
        }
        return toKmPackage(r0, nameResolver, z, list);
    }

    public static final KmProperty toKmProperty(ProtoBuf.Property property, ReadContext readContext) {
        property.getClass();
        readContext.getClass();
        KmProperty kmProperty = new KmProperty(property.getFlags(), readContext.get(property.getName()), getPropertyGetterFlags(property), getPropertySetterFlags(property));
        List<ProtoBuf.TypeParameter> typeParameterList = property.getTypeParameterList();
        typeParameterList.getClass();
        ReadContext withTypeParameters$kotlin_metadata = readContext.withTypeParameters$kotlin_metadata(typeParameterList);
        List<ProtoBuf.TypeParameter> typeParameterList2 = property.getTypeParameterList();
        typeParameterList2.getClass();
        List<KmTypeParameter> typeParameters = kmProperty.getTypeParameters();
        for (ProtoBuf.TypeParameter typeParameter : typeParameterList2) {
            typeParameter.getClass();
            typeParameters.add(toKmTypeParameter(typeParameter, withTypeParameters$kotlin_metadata));
        }
        ProtoBuf.Type receiverType = ProtoTypeTableUtilKt.receiverType(property, withTypeParameters$kotlin_metadata.getTypes());
        kmProperty.setReceiverParameterType(receiverType != null ? toKmType(receiverType, withTypeParameters$kotlin_metadata) : null);
        List<ProtoBuf.ValueParameter> contextParameterList = property.getContextParameterList();
        contextParameterList.getClass();
        List<KmValueParameter> contextParameters = kmProperty.getContextParameters();
        for (ProtoBuf.ValueParameter valueParameter : contextParameterList) {
            valueParameter.getClass();
            contextParameters.add(toKmValueParameter(valueParameter, withTypeParameters$kotlin_metadata));
        }
        if (property.getContextParameterList().isEmpty()) {
            List<ProtoBuf.Type> contextReceiverTypeList = property.getContextReceiverTypeList();
            contextReceiverTypeList.getClass();
            if (!contextReceiverTypeList.isEmpty()) {
                List<ProtoBuf.Type> contextReceiverTypes = ProtoTypeTableUtilKt.contextReceiverTypes(property, withTypeParameters$kotlin_metadata.getTypes());
                List<KmValueParameter> contextParameters2 = kmProperty.getContextParameters();
                Iterator<T> it = contextReceiverTypes.iterator();
                while (it.hasNext()) {
                    KmType kmType = toKmType((ProtoBuf.Type) it.next(), withTypeParameters$kotlin_metadata);
                    KmValueParameter kmValueParameter = new KmValueParameter(0, "_");
                    kmValueParameter.setType(kmType);
                    contextParameters2.add(kmValueParameter);
                }
            }
        }
        if (property.hasSetterValueParameter()) {
            ProtoBuf.ValueParameter setterValueParameter = property.getSetterValueParameter();
            setterValueParameter.getClass();
            kmProperty.setSetterParameter(toKmValueParameter(setterValueParameter, withTypeParameters$kotlin_metadata));
        }
        kmProperty.setReturnType(toKmType(ProtoTypeTableUtilKt.returnType(property, withTypeParameters$kotlin_metadata.getTypes()), withTypeParameters$kotlin_metadata));
        List<Integer> versionRequirementList = property.getVersionRequirementList();
        versionRequirementList.getClass();
        List<KmVersionRequirement> versionRequirements = kmProperty.getVersionRequirements();
        for (Integer num : versionRequirementList) {
            num.getClass();
            versionRequirements.add(readVersionRequirement(num.intValue(), withTypeParameters$kotlin_metadata));
        }
        Iterator<T> it2 = withTypeParameters$kotlin_metadata.getExtensions$kotlin_metadata().iterator();
        while (it2.hasNext()) {
            ((MetadataExtensions) it2.next()).readPropertyExtensions(kmProperty, property, withTypeParameters$kotlin_metadata);
        }
        return kmProperty;
    }

    public static final KmType toKmType(ProtoBuf.Type type2, ReadContext readContext) {
        KmClassifier typeParameter;
        KmVariance kmVariance;
        KmType kmType = new KmType((type2.getNullable() ? 1 : 0) + (type2.getFlags() << 1));
        if (type2.hasClassName()) {
            typeParameter = new KmClassifier.Class(readContext.className$kotlin_metadata(type2.getClassName()));
        } else if (type2.hasTypeAliasName()) {
            typeParameter = new KmClassifier.TypeAlias(readContext.className$kotlin_metadata(type2.getTypeAliasName()));
        } else if (type2.hasTypeParameter()) {
            typeParameter = new KmClassifier.TypeParameter(type2.getTypeParameter());
        } else {
            if (!type2.hasTypeParameterName()) {
                throw new InconsistentKotlinMetadataException("No classifier (class, type alias or type parameter) recorded for Type", null, 2, null);
            }
            Integer typeParameterId$kotlin_metadata = readContext.getTypeParameterId$kotlin_metadata(type2.getTypeParameterName());
            if (typeParameterId$kotlin_metadata == null) {
                throw new InconsistentKotlinMetadataException("No type parameter id for " + readContext.get(type2.getTypeParameterName()), null, 2, null);
            }
            typeParameter = new KmClassifier.TypeParameter(typeParameterId$kotlin_metadata.intValue());
        }
        kmType.setClassifier(typeParameter);
        for (ProtoBuf.Type.Argument argument : type2.getArgumentList()) {
            ProtoBuf.Type.Argument.Projection projection = argument.getProjection();
            if (projection == null) {
                a$$ExternalSyntheticBUOutline0.m$3("Required value was null.");
                return null;
            }
            int i = WhenMappings.$EnumSwitchMapping$1[projection.ordinal()];
            if (i == 1) {
                kmVariance = KmVariance.IN;
            } else if (i == 2) {
                kmVariance = KmVariance.OUT;
            } else if (i == 3) {
                kmVariance = KmVariance.INVARIANT;
            } else {
                if (i != 4) {
                    Drop$$ExternalSyntheticBUOutline0.m1m();
                    return null;
                }
                kmVariance = null;
            }
            if (kmVariance != null) {
                ProtoBuf.Type type3 = ProtoTypeTableUtilKt.type(argument, readContext.getTypes());
                if (type3 == null) {
                    throw new InconsistentKotlinMetadataException("No type argument for non-STAR projection in Type", null, 2, null);
                }
                kmType.getArguments().add(new KmTypeProjection(kmVariance, toKmType(type3, readContext)));
            } else {
                kmType.getArguments().add(KmTypeProjection.STAR);
            }
        }
        ProtoBuf.Type abbreviatedType = ProtoTypeTableUtilKt.abbreviatedType(type2, readContext.getTypes());
        kmType.setAbbreviatedType(abbreviatedType != null ? toKmType(abbreviatedType, readContext) : null);
        ProtoBuf.Type outerType = ProtoTypeTableUtilKt.outerType(type2, readContext.getTypes());
        kmType.setOuterType(outerType != null ? toKmType(outerType, readContext) : null);
        ProtoBuf.Type flexibleUpperBound = ProtoTypeTableUtilKt.flexibleUpperBound(type2, readContext.getTypes());
        kmType.setFlexibleTypeUpperBound(flexibleUpperBound != null ? new KmFlexibleTypeUpperBound(toKmType(flexibleUpperBound, readContext), type2.hasFlexibleTypeCapabilitiesId() ? readContext.get(type2.getFlexibleTypeCapabilitiesId()) : null) : null);
        Iterator<T> it = readContext.getExtensions$kotlin_metadata().iterator();
        while (it.hasNext()) {
            ((MetadataExtensions) it.next()).readTypeExtensions(kmType, type2, readContext);
        }
        return kmType;
    }

    public static final KmTypeParameter toKmTypeParameter(ProtoBuf.TypeParameter typeParameter, ReadContext readContext) {
        KmVariance kmVariance;
        ProtoBuf.TypeParameter.Variance variance = typeParameter.getVariance();
        if (variance == null) {
            a$$ExternalSyntheticBUOutline0.m$3("Required value was null.");
            return null;
        }
        int i = WhenMappings.$EnumSwitchMapping$0[variance.ordinal()];
        if (i == 1) {
            kmVariance = KmVariance.IN;
        } else if (i == 2) {
            kmVariance = KmVariance.OUT;
        } else {
            if (i != 3) {
                Drop$$ExternalSyntheticBUOutline0.m1m();
                return null;
            }
            kmVariance = KmVariance.INVARIANT;
        }
        boolean reified = typeParameter.getReified();
        KmTypeParameter kmTypeParameter = new KmTypeParameter(reified ? 1 : 0, readContext.get(typeParameter.getName()), typeParameter.getId(), kmVariance);
        List<ProtoBuf.Type> upperBounds = ProtoTypeTableUtilKt.upperBounds(typeParameter, readContext.getTypes());
        List<KmType> upperBounds2 = kmTypeParameter.getUpperBounds();
        Iterator<T> it = upperBounds.iterator();
        while (it.hasNext()) {
            upperBounds2.add(toKmType((ProtoBuf.Type) it.next(), readContext));
        }
        Iterator<T> it2 = readContext.getExtensions$kotlin_metadata().iterator();
        while (it2.hasNext()) {
            ((MetadataExtensions) it2.next()).readTypeParameterExtensions(kmTypeParameter, typeParameter, readContext);
        }
        return kmTypeParameter;
    }

    public static final KmValueParameter toKmValueParameter(ProtoBuf.ValueParameter valueParameter, ReadContext readContext) {
        KmValueParameter kmValueParameter = new KmValueParameter(valueParameter.getFlags(), readContext.get(valueParameter.getName()));
        kmValueParameter.setType(toKmType(ProtoTypeTableUtilKt.type(valueParameter, readContext.getTypes()), readContext));
        ProtoBuf.Type varargElementType = ProtoTypeTableUtilKt.varargElementType(valueParameter, readContext.getTypes());
        kmValueParameter.setVarargElementType(varargElementType != null ? toKmType(varargElementType, readContext) : null);
        if (valueParameter.hasAnnotationParameterDefaultValue()) {
            ProtoBuf.Annotation.Argument.Value annotationParameterDefaultValue = valueParameter.getAnnotationParameterDefaultValue();
            annotationParameterDefaultValue.getClass();
            kmValueParameter.setAnnotationParameterDefaultValue(ReadUtilsKt.readAnnotationArgument(annotationParameterDefaultValue, readContext.getStrings()));
        }
        Iterator<T> it = readContext.getExtensions$kotlin_metadata().iterator();
        while (it.hasNext()) {
            ((MetadataExtensions) it.next()).readValueParameterExtensions(kmValueParameter, valueParameter, readContext);
        }
        return kmValueParameter;
    }

    public static final void visitDeclarations(KmDeclarationContainer kmDeclarationContainer, List list, List list2, List list3, ReadContext readContext) {
        List<KmFunction> functions = kmDeclarationContainer.getFunctions();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            functions.add(toKmFunction((ProtoBuf.Function) it.next(), readContext));
        }
        List<KmProperty> properties = kmDeclarationContainer.getProperties();
        Iterator it2 = list2.iterator();
        while (it2.hasNext()) {
            properties.add(toKmProperty((ProtoBuf.Property) it2.next(), readContext));
        }
        List<KmTypeAlias> typeAliases = kmDeclarationContainer.getTypeAliases();
        Iterator it3 = list3.iterator();
        while (it3.hasNext()) {
            ProtoBuf.TypeAlias typeAlias = (ProtoBuf.TypeAlias) it3.next();
            KmTypeAlias kmTypeAlias = new KmTypeAlias(typeAlias.getFlags(), readContext.get(typeAlias.getName()));
            List<ProtoBuf.TypeParameter> typeParameterList = typeAlias.getTypeParameterList();
            typeParameterList.getClass();
            ReadContext withTypeParameters$kotlin_metadata = readContext.withTypeParameters$kotlin_metadata(typeParameterList);
            List<ProtoBuf.TypeParameter> typeParameterList2 = typeAlias.getTypeParameterList();
            typeParameterList2.getClass();
            List<KmTypeParameter> typeParameters = kmTypeAlias.getTypeParameters();
            for (ProtoBuf.TypeParameter typeParameter : typeParameterList2) {
                typeParameter.getClass();
                typeParameters.add(toKmTypeParameter(typeParameter, withTypeParameters$kotlin_metadata));
            }
            kmTypeAlias.setUnderlyingType(toKmType(ProtoTypeTableUtilKt.underlyingType(typeAlias, withTypeParameters$kotlin_metadata.getTypes()), withTypeParameters$kotlin_metadata));
            kmTypeAlias.setExpandedType(toKmType(ProtoTypeTableUtilKt.expandedType(typeAlias, withTypeParameters$kotlin_metadata.getTypes()), withTypeParameters$kotlin_metadata));
            List<ProtoBuf.Annotation> annotationList = typeAlias.getAnnotationList();
            annotationList.getClass();
            List<KmAnnotation> annotations = kmTypeAlias.getAnnotations();
            for (ProtoBuf.Annotation annotation : annotationList) {
                annotation.getClass();
                annotations.add(ReadUtilsKt.readAnnotation(annotation, withTypeParameters$kotlin_metadata.getStrings()));
            }
            List<Integer> versionRequirementList = typeAlias.getVersionRequirementList();
            versionRequirementList.getClass();
            List<KmVersionRequirement> versionRequirements = kmTypeAlias.getVersionRequirements();
            for (Integer num : versionRequirementList) {
                num.getClass();
                versionRequirements.add(readVersionRequirement(num.intValue(), withTypeParameters$kotlin_metadata));
            }
            Iterator<T> it4 = withTypeParameters$kotlin_metadata.getExtensions$kotlin_metadata().iterator();
            while (it4.hasNext()) {
                ((MetadataExtensions) it4.next()).readTypeAliasExtensions(kmTypeAlias, typeAlias, withTypeParameters$kotlin_metadata);
            }
            typeAliases.add(kmTypeAlias);
        }
    }
}
