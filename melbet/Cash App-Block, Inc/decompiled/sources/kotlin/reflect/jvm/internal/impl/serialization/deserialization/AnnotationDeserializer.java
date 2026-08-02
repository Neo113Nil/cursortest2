package kotlin.reflect.jvm.internal.impl.serialization.deserialization;

import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.EmptyMap;
import kotlin.collections.MapsKt__MapsJVMKt;
import kotlin.collections.MapsKt__MapsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntProgressionIterator;
import kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassConstructorDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.FindClassInModuleKt;
import kotlin.reflect.jvm.internal.impl.descriptors.ModuleDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.NotFoundClasses;
import kotlin.reflect.jvm.internal.impl.descriptors.SourceElement;
import kotlin.reflect.jvm.internal.impl.descriptors.ValueParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.AnnotationDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.AnnotationDescriptorImpl;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf;
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.Flags;
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.NameResolver;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.resolve.DescriptorUtils;
import kotlin.reflect.jvm.internal.impl.resolve.constants.AnnotationValue;
import kotlin.reflect.jvm.internal.impl.resolve.constants.ArrayValue;
import kotlin.reflect.jvm.internal.impl.resolve.constants.BooleanValue;
import kotlin.reflect.jvm.internal.impl.resolve.constants.ByteValue;
import kotlin.reflect.jvm.internal.impl.resolve.constants.CharValue;
import kotlin.reflect.jvm.internal.impl.resolve.constants.ConstantValue;
import kotlin.reflect.jvm.internal.impl.resolve.constants.ConstantValueFactory;
import kotlin.reflect.jvm.internal.impl.resolve.constants.DoubleValue;
import kotlin.reflect.jvm.internal.impl.resolve.constants.EnumValue;
import kotlin.reflect.jvm.internal.impl.resolve.constants.ErrorValue;
import kotlin.reflect.jvm.internal.impl.resolve.constants.FloatValue;
import kotlin.reflect.jvm.internal.impl.resolve.constants.IntValue;
import kotlin.reflect.jvm.internal.impl.resolve.constants.KClassValue;
import kotlin.reflect.jvm.internal.impl.resolve.constants.LongValue;
import kotlin.reflect.jvm.internal.impl.resolve.constants.ShortValue;
import kotlin.reflect.jvm.internal.impl.resolve.constants.StringValue;
import kotlin.reflect.jvm.internal.impl.resolve.constants.UByteValue;
import kotlin.reflect.jvm.internal.impl.resolve.constants.UIntValue;
import kotlin.reflect.jvm.internal.impl.resolve.constants.ULongValue;
import kotlin.reflect.jvm.internal.impl.resolve.constants.UShortValue;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import kotlin.reflect.jvm.internal.impl.types.SimpleType;
import kotlin.reflect.jvm.internal.impl.types.error.ErrorUtils;
import papa.Handlers$$ExternalSyntheticBUOutline0;

/* loaded from: classes9.dex */
public final class AnnotationDeserializer {
    public final ModuleDescriptor module;
    public final NotFoundClasses notFoundClasses;

    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[ProtoBuf.Annotation.Argument.Value.Type.values().length];
            try {
                iArr[ProtoBuf.Annotation.Argument.Value.Type.BYTE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ProtoBuf.Annotation.Argument.Value.Type.CHAR.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[ProtoBuf.Annotation.Argument.Value.Type.SHORT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[ProtoBuf.Annotation.Argument.Value.Type.INT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[ProtoBuf.Annotation.Argument.Value.Type.LONG.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[ProtoBuf.Annotation.Argument.Value.Type.FLOAT.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[ProtoBuf.Annotation.Argument.Value.Type.DOUBLE.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[ProtoBuf.Annotation.Argument.Value.Type.BOOLEAN.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[ProtoBuf.Annotation.Argument.Value.Type.STRING.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr[ProtoBuf.Annotation.Argument.Value.Type.CLASS.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr[ProtoBuf.Annotation.Argument.Value.Type.ENUM.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr[ProtoBuf.Annotation.Argument.Value.Type.ANNOTATION.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr[ProtoBuf.Annotation.Argument.Value.Type.ARRAY.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public AnnotationDeserializer(ModuleDescriptor moduleDescriptor, NotFoundClasses notFoundClasses) {
        moduleDescriptor.getClass();
        notFoundClasses.getClass();
        this.module = moduleDescriptor;
        this.notFoundClasses = notFoundClasses;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v0, types: [kotlin.Pair] */
    public final AnnotationDescriptor deserializeAnnotation(ProtoBuf.Annotation annotation, NameResolver nameResolver) {
        annotation.getClass();
        nameResolver.getClass();
        ClassDescriptor findNonGenericClassAcrossDependencies = FindClassInModuleKt.findNonGenericClassAcrossDependencies(this.module, NameResolverUtilKt.getClassId(nameResolver, annotation.getId()), this.notFoundClasses);
        Map map = EmptyMap.INSTANCE;
        map.getClass();
        if (annotation.getArgumentCount() != 0 && !ErrorUtils.isError(findNonGenericClassAcrossDependencies) && DescriptorUtils.isAnnotationClass(findNonGenericClassAcrossDependencies)) {
            Collection<ClassConstructorDescriptor> constructors = findNonGenericClassAcrossDependencies.getConstructors();
            constructors.getClass();
            ClassConstructorDescriptor classConstructorDescriptor = (ClassConstructorDescriptor) CollectionsKt.singleOrNull(constructors);
            if (classConstructorDescriptor != null) {
                List<ValueParameterDescriptor> valueParameters = classConstructorDescriptor.getValueParameters();
                valueParameters.getClass();
                List<ValueParameterDescriptor> list = valueParameters;
                int mapCapacity = MapsKt__MapsJVMKt.mapCapacity(CollectionsKt__IterablesKt.collectionSizeOrDefault(list, 10));
                if (mapCapacity < 16) {
                    mapCapacity = 16;
                }
                LinkedHashMap linkedHashMap = new LinkedHashMap(mapCapacity);
                for (Object obj : list) {
                    linkedHashMap.put(((ValueParameterDescriptor) obj).getName(), obj);
                }
                List<ProtoBuf.Annotation.Argument> argumentList = annotation.getArgumentList();
                argumentList.getClass();
                ArrayList arrayList = new ArrayList();
                for (ProtoBuf.Annotation.Argument argument : argumentList) {
                    argument.getClass();
                    ValueParameterDescriptor valueParameterDescriptor = (ValueParameterDescriptor) linkedHashMap.get(NameResolverUtilKt.getName(nameResolver, argument.getNameId()));
                    if (valueParameterDescriptor != null) {
                        Name name = NameResolverUtilKt.getName(nameResolver, argument.getNameId());
                        KotlinType type2 = valueParameterDescriptor.getType();
                        type2.getClass();
                        ProtoBuf.Annotation.Argument.Value value = argument.getValue();
                        value.getClass();
                        ConstantValue<?> resolveValue = resolveValue(type2, value, nameResolver);
                        r5 = doesValueConformToExpectedType(resolveValue, type2, value) ? resolveValue : null;
                        if (r5 == null) {
                            r5 = ErrorValue.Companion.create("Unexpected argument value: actual type " + value.getType() + " != expected type " + type2);
                        }
                        r5 = new Pair(name, r5);
                    }
                    if (r5 != null) {
                        arrayList.add(r5);
                    }
                }
                map = MapsKt__MapsKt.toMap(arrayList);
            }
        }
        return new AnnotationDescriptorImpl(findNonGenericClassAcrossDependencies.getDefaultType(), map, SourceElement.NO_SOURCE);
    }

    public final boolean doesValueConformToExpectedType(ConstantValue constantValue, KotlinType kotlinType, ProtoBuf.Annotation.Argument.Value value) {
        ProtoBuf.Annotation.Argument.Value.Type type2 = value.getType();
        int i = type2 == null ? -1 : WhenMappings.$EnumSwitchMapping$0[type2.ordinal()];
        if (i != 10) {
            ModuleDescriptor moduleDescriptor = this.module;
            if (i != 13) {
                return Intrinsics.areEqual(constantValue.getType(moduleDescriptor), kotlinType);
            }
            if (constantValue instanceof ArrayValue) {
                ArrayValue arrayValue = (ArrayValue) constantValue;
                if (arrayValue.getValue().size() == value.getArrayElementList().size()) {
                    KotlinType arrayElementTypeOrNull = moduleDescriptor.getBuiltIns().getArrayElementTypeOrNull(kotlinType);
                    if (arrayElementTypeOrNull != null) {
                        Iterable indices = CollectionsKt__CollectionsKt.getIndices(arrayValue.getValue());
                        if ((indices instanceof Collection) && ((Collection) indices).isEmpty()) {
                            return true;
                        }
                        IntProgressionIterator it = indices.iterator();
                        while (it.hasNext) {
                            int nextInt = it.nextInt();
                            ConstantValue<?> constantValue2 = arrayValue.getValue().get(nextInt);
                            ProtoBuf.Annotation.Argument.Value arrayElement = value.getArrayElement(nextInt);
                            arrayElement.getClass();
                            if (!doesValueConformToExpectedType(constantValue2, arrayElementTypeOrNull, arrayElement)) {
                            }
                        }
                        return true;
                    }
                }
            }
            Handlers$$ExternalSyntheticBUOutline0.m(constantValue, "Deserialized ArrayValue should have the same number of elements as the original array value: ");
            return false;
        }
        ClassifierDescriptor mo4153getDeclarationDescriptor = kotlinType.getConstructor().mo4153getDeclarationDescriptor();
        ClassDescriptor classDescriptor = mo4153getDeclarationDescriptor instanceof ClassDescriptor ? (ClassDescriptor) mo4153getDeclarationDescriptor : null;
        if (classDescriptor == null || KotlinBuiltIns.isKClass(classDescriptor)) {
            return true;
        }
        return false;
    }

    public final ConstantValue<?> resolveValue(KotlinType kotlinType, ProtoBuf.Annotation.Argument.Value value, NameResolver nameResolver) {
        kotlinType.getClass();
        value.getClass();
        nameResolver.getClass();
        Boolean bool = Flags.IS_UNSIGNED.get(value.getFlags());
        bool.getClass();
        boolean booleanValue = bool.booleanValue();
        ProtoBuf.Annotation.Argument.Value.Type type2 = value.getType();
        switch (type2 == null ? -1 : WhenMappings.$EnumSwitchMapping$0[type2.ordinal()]) {
            case 1:
                byte intValue = (byte) value.getIntValue();
                return booleanValue ? new UByteValue(intValue) : new ByteValue(intValue);
            case 2:
                return new CharValue((char) value.getIntValue());
            case 3:
                short intValue2 = (short) value.getIntValue();
                return booleanValue ? new UShortValue(intValue2) : new ShortValue(intValue2);
            case 4:
                int intValue3 = (int) value.getIntValue();
                return booleanValue ? new UIntValue(intValue3) : new IntValue(intValue3);
            case 5:
                long intValue4 = value.getIntValue();
                return booleanValue ? new ULongValue(intValue4) : new LongValue(intValue4);
            case 6:
                return new FloatValue(value.getFloatValue());
            case 7:
                return new DoubleValue(value.getDoubleValue());
            case 8:
                return new BooleanValue(value.getIntValue() != 0);
            case 9:
                return new StringValue(nameResolver.getString(value.getStringValue()));
            case 10:
                return new KClassValue(NameResolverUtilKt.getClassId(nameResolver, value.getClassId()), value.getArrayDimensionCount());
            case 11:
                return new EnumValue(NameResolverUtilKt.getClassId(nameResolver, value.getClassId()), NameResolverUtilKt.getName(nameResolver, value.getEnumValueId()));
            case 12:
                ProtoBuf.Annotation annotation = value.getAnnotation();
                annotation.getClass();
                return new AnnotationValue(deserializeAnnotation(annotation, nameResolver));
            case 13:
                ConstantValueFactory constantValueFactory = ConstantValueFactory.INSTANCE;
                List<ProtoBuf.Annotation.Argument.Value> arrayElementList = value.getArrayElementList();
                arrayElementList.getClass();
                List<ProtoBuf.Annotation.Argument.Value> list = arrayElementList;
                ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list, 10));
                for (ProtoBuf.Annotation.Argument.Value value2 : list) {
                    SimpleType anyType = this.module.getBuiltIns().getAnyType();
                    anyType.getClass();
                    value2.getClass();
                    arrayList.add(resolveValue(anyType, value2, nameResolver));
                }
                return constantValueFactory.createArrayValue(arrayList, kotlinType);
            default:
                throw new IllegalStateException(("Unsupported annotation argument type: " + value.getType() + " (expected " + kotlinType + ')').toString());
        }
    }
}
