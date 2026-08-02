package kotlin.reflect.jvm.internal.impl.resolve.constants;

import defpackage.Drop$$ExternalSyntheticBUOutline0;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt__CollectionsJVMKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns;
import kotlin.reflect.jvm.internal.impl.builtins.StandardNames;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.FindClassInModuleKt;
import kotlin.reflect.jvm.internal.impl.descriptors.ModuleDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.name.ClassId;
import kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import kotlin.reflect.jvm.internal.impl.types.KotlinTypeFactory;
import kotlin.reflect.jvm.internal.impl.types.KotlinTypeKt;
import kotlin.reflect.jvm.internal.impl.types.SimpleType;
import kotlin.reflect.jvm.internal.impl.types.TypeAttributes;
import kotlin.reflect.jvm.internal.impl.types.TypeProjection;
import kotlin.reflect.jvm.internal.impl.types.TypeProjectionImpl;
import kotlin.reflect.jvm.internal.impl.types.Variance;
import kotlin.reflect.jvm.internal.impl.types.error.ErrorTypeKind;
import kotlin.reflect.jvm.internal.impl.types.error.ErrorUtils;
import kotlin.reflect.jvm.internal.impl.types.typeUtil.TypeUtilsKt;

/* loaded from: classes9.dex */
public final class KClassValue extends ConstantValue<Value> {
    public static final Companion Companion = new Companion(null);

    public static final class Companion {
        public Companion(DefaultConstructorMarker defaultConstructorMarker) {
        }

        public final ConstantValue<?> create(KotlinType kotlinType) {
            kotlinType.getClass();
            if (KotlinTypeKt.isError(kotlinType)) {
                return null;
            }
            int i = 0;
            KotlinType kotlinType2 = kotlinType;
            while (KotlinBuiltIns.isArray(kotlinType2)) {
                kotlinType2 = ((TypeProjection) CollectionsKt.single((List) kotlinType2.getArguments())).getType();
                kotlinType2.getClass();
                i++;
            }
            ClassifierDescriptor mo4153getDeclarationDescriptor = kotlinType2.getConstructor().mo4153getDeclarationDescriptor();
            if (mo4153getDeclarationDescriptor instanceof ClassDescriptor) {
                ClassId classId = DescriptorUtilsKt.getClassId(mo4153getDeclarationDescriptor);
                return classId == null ? new KClassValue(new Value.LocalClass(kotlinType)) : new KClassValue(classId, i);
            }
            if (mo4153getDeclarationDescriptor instanceof TypeParameterDescriptor) {
                return new KClassValue(ClassId.Companion.topLevel(StandardNames.FqNames.any.toSafe()), 0);
            }
            return null;
        }
    }

    public static abstract class Value {

        public static final class LocalClass extends Value {

            /* renamed from: type, reason: collision with root package name */
            public final KotlinType f1535type;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public LocalClass(KotlinType kotlinType) {
                super(null);
                kotlinType.getClass();
                this.f1535type = kotlinType;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof LocalClass) && Intrinsics.areEqual(this.f1535type, ((LocalClass) obj).f1535type);
            }

            public final KotlinType getType() {
                return this.f1535type;
            }

            public int hashCode() {
                return this.f1535type.hashCode();
            }

            public String toString() {
                return "LocalClass(type=" + this.f1535type + ')';
            }
        }

        public static final class NormalClass extends Value {
            public final ClassLiteralValue value;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public NormalClass(ClassLiteralValue classLiteralValue) {
                super(null);
                classLiteralValue.getClass();
                this.value = classLiteralValue;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof NormalClass) && Intrinsics.areEqual(this.value, ((NormalClass) obj).value);
            }

            public final int getArrayDimensions() {
                return this.value.getArrayNestedness();
            }

            public final ClassId getClassId() {
                return this.value.getClassId();
            }

            public final ClassLiteralValue getValue() {
                return this.value;
            }

            public int hashCode() {
                return this.value.hashCode();
            }

            public String toString() {
                return "NormalClass(value=" + this.value + ')';
            }
        }

        public Value(DefaultConstructorMarker defaultConstructorMarker) {
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public KClassValue(ClassLiteralValue classLiteralValue) {
        this(new Value.NormalClass(classLiteralValue));
        classLiteralValue.getClass();
    }

    public final KotlinType getArgumentType(ModuleDescriptor moduleDescriptor) {
        moduleDescriptor.getClass();
        Value value = getValue();
        if (value instanceof Value.LocalClass) {
            return ((Value.LocalClass) getValue()).getType();
        }
        if (!(value instanceof Value.NormalClass)) {
            Drop$$ExternalSyntheticBUOutline0.m1m();
            return null;
        }
        ClassLiteralValue value2 = ((Value.NormalClass) getValue()).getValue();
        ClassId component1 = value2.component1();
        int component2 = value2.component2();
        ClassDescriptor findClassAcrossModuleDependencies = FindClassInModuleKt.findClassAcrossModuleDependencies(moduleDescriptor, component1);
        if (findClassAcrossModuleDependencies == null) {
            return ErrorUtils.createErrorType(ErrorTypeKind.UNRESOLVED_KCLASS_CONSTANT_VALUE, component1.toString(), String.valueOf(component2));
        }
        SimpleType defaultType = findClassAcrossModuleDependencies.getDefaultType();
        defaultType.getClass();
        KotlinType replaceArgumentsWithStarProjections = TypeUtilsKt.replaceArgumentsWithStarProjections(defaultType);
        for (int i = 0; i < component2; i++) {
            replaceArgumentsWithStarProjections = moduleDescriptor.getBuiltIns().getArrayType(Variance.INVARIANT, replaceArgumentsWithStarProjections);
            replaceArgumentsWithStarProjections.getClass();
        }
        return replaceArgumentsWithStarProjections;
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.constants.ConstantValue
    public KotlinType getType(ModuleDescriptor moduleDescriptor) {
        moduleDescriptor.getClass();
        TypeAttributes empty = TypeAttributes.Companion.getEmpty();
        ClassDescriptor kClass = moduleDescriptor.getBuiltIns().getKClass();
        kClass.getClass();
        return KotlinTypeFactory.simpleNotNullType(empty, kClass, CollectionsKt__CollectionsJVMKt.listOf(new TypeProjectionImpl(getArgumentType(moduleDescriptor))));
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public KClassValue(Value value) {
        super(value);
        value.getClass();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public KClassValue(ClassId classId, int i) {
        this(new ClassLiteralValue(classId, i));
        classId.getClass();
    }
}
