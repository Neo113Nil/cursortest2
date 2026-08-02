package kotlin.reflect.jvm.internal.impl.resolve;

import java.util.Collections;
import java.util.List;
import kotlin.reflect.jvm.internal.impl.builtins.StandardNames;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.DescriptorVisibilities;
import kotlin.reflect.jvm.internal.impl.descriptors.DescriptorVisibility;
import kotlin.reflect.jvm.internal.impl.descriptors.Modality;
import kotlin.reflect.jvm.internal.impl.descriptors.ModuleDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.PropertyDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ReceiverParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.SimpleFunctionDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.SourceElement;
import kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ValueParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.ClassConstructorDescriptorImpl;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.PropertyDescriptorImpl;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.PropertyGetterDescriptorImpl;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.PropertySetterDescriptorImpl;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.ReceiverParameterDescriptorImpl;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.SimpleFunctionDescriptorImpl;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.ValueParameterDescriptorImpl;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.name.NameUtils;
import kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.receivers.ContextClassReceiver;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.receivers.ContextReceiver;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.receivers.ExtensionReceiver;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import kotlin.reflect.jvm.internal.impl.types.KotlinTypeFactory;
import kotlin.reflect.jvm.internal.impl.types.SimpleType;
import kotlin.reflect.jvm.internal.impl.types.TypeAttributes;
import kotlin.reflect.jvm.internal.impl.types.TypeProjectionImpl;
import kotlin.reflect.jvm.internal.impl.types.Variance;

/* loaded from: classes9.dex */
public class DescriptorFactory {

    public final class DefaultClassConstructorDescriptor extends ClassConstructorDescriptorImpl {
        public static /* synthetic */ void $$$reportNull$$$0(int i) {
            Object[] objArr = new Object[3];
            if (i != 1) {
                objArr[0] = "containingClass";
            } else {
                objArr[0] = "source";
            }
            objArr[1] = "kotlin/reflect/jvm/internal/impl/resolve/DescriptorFactory$DefaultClassConstructorDescriptor";
            objArr[2] = "<init>";
            throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
        }
    }

    public static /* synthetic */ void $$$reportNull$$$0(int i) {
        String str = (i == 12 || i == 23 || i == 25) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[(i == 12 || i == 23 || i == 25) ? 2 : 3];
        switch (i) {
            case 1:
            case 4:
            case 8:
            case 14:
            case 16:
            case 18:
            case 31:
            case 33:
            case 35:
                objArr[0] = "annotations";
                break;
            case 2:
            case 5:
            case 9:
                objArr[0] = "parameterAnnotations";
                break;
            case 3:
            case 7:
            case 13:
            case 15:
            case 17:
            default:
                objArr[0] = "propertyDescriptor";
                break;
            case 6:
            case 11:
            case 19:
                objArr[0] = "sourceElement";
                break;
            case 10:
                objArr[0] = "visibility";
                break;
            case 12:
            case 23:
            case 25:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/resolve/DescriptorFactory";
                break;
            case 20:
                objArr[0] = "containingClass";
                break;
            case 21:
                objArr[0] = "source";
                break;
            case 22:
            case 24:
            case 26:
                objArr[0] = "enumClass";
                break;
            case 27:
            case 28:
            case 29:
                objArr[0] = "descriptor";
                break;
            case 30:
            case 32:
            case 34:
                objArr[0] = "owner";
                break;
        }
        if (i == 12) {
            objArr[1] = "createSetter";
        } else if (i == 23) {
            objArr[1] = "createEnumValuesMethod";
        } else if (i != 25) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/resolve/DescriptorFactory";
        } else {
            objArr[1] = "createEnumValueOfMethod";
        }
        switch (i) {
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
                objArr[2] = "createSetter";
                break;
            case 12:
            case 23:
            case 25:
                break;
            case 13:
            case 14:
                objArr[2] = "createDefaultGetter";
                break;
            case 15:
            case 16:
            case 17:
            case 18:
            case 19:
                objArr[2] = "createGetter";
                break;
            case 20:
            case 21:
                objArr[2] = "createPrimaryConstructorForObject";
                break;
            case 22:
                objArr[2] = "createEnumValuesMethod";
                break;
            case 24:
                objArr[2] = "createEnumValueOfMethod";
                break;
            case 26:
                objArr[2] = "createEnumEntriesProperty";
                break;
            case 27:
                objArr[2] = "isEnumValuesMethod";
                break;
            case 28:
                objArr[2] = "isEnumValueOfMethod";
                break;
            case 29:
                objArr[2] = "isEnumSpecialMethod";
                break;
            case 30:
            case 31:
                objArr[2] = "createExtensionReceiverParameterForCallable";
                break;
            case 32:
            case 33:
                objArr[2] = "createContextReceiverParameterForCallable";
                break;
            case 34:
            case 35:
                objArr[2] = "createContextReceiverParameterForClass";
                break;
            default:
                objArr[2] = "createDefaultSetter";
                break;
        }
        String format2 = String.format(str, objArr);
        if (i != 12 && i != 23 && i != 25) {
            throw new IllegalArgumentException(format2);
        }
        throw new IllegalStateException(format2);
    }

    public static ReceiverParameterDescriptor createContextReceiverParameterForCallable(CallableDescriptor callableDescriptor, KotlinType kotlinType, Name name, Annotations annotations, int i) {
        if (callableDescriptor == null) {
            $$$reportNull$$$0(32);
            throw null;
        }
        if (annotations == null) {
            $$$reportNull$$$0(33);
            throw null;
        }
        if (kotlinType == null) {
            return null;
        }
        return new ReceiverParameterDescriptorImpl(callableDescriptor, new ContextReceiver(callableDescriptor, kotlinType, name, null), annotations, NameUtils.contextReceiverName(i));
    }

    public static ReceiverParameterDescriptor createContextReceiverParameterForClass(ClassDescriptor classDescriptor, KotlinType kotlinType, Name name, Annotations annotations, int i) {
        if (classDescriptor == null) {
            $$$reportNull$$$0(34);
            throw null;
        }
        if (annotations == null) {
            $$$reportNull$$$0(35);
            throw null;
        }
        if (kotlinType == null) {
            return null;
        }
        return new ReceiverParameterDescriptorImpl(classDescriptor, new ContextClassReceiver(classDescriptor, kotlinType, name, null), annotations, NameUtils.contextReceiverName(i));
    }

    public static PropertyGetterDescriptorImpl createDefaultGetter(PropertyDescriptor propertyDescriptor, Annotations annotations) {
        if (propertyDescriptor == null) {
            $$$reportNull$$$0(13);
            throw null;
        }
        if (annotations != null) {
            return createGetter(propertyDescriptor, annotations, true, false, false);
        }
        $$$reportNull$$$0(14);
        throw null;
    }

    public static PropertySetterDescriptorImpl createDefaultSetter(PropertyDescriptor propertyDescriptor, Annotations annotations, Annotations annotations2) {
        if (propertyDescriptor == null) {
            $$$reportNull$$$0(0);
            throw null;
        }
        if (annotations == null) {
            $$$reportNull$$$0(1);
            throw null;
        }
        if (annotations2 != null) {
            return createSetter(propertyDescriptor, annotations, annotations2, true, false, false, propertyDescriptor.getSource());
        }
        $$$reportNull$$$0(2);
        throw null;
    }

    public static PropertyDescriptor createEnumEntriesProperty(ClassDescriptor classDescriptor) {
        if (classDescriptor == null) {
            $$$reportNull$$$0(26);
            throw null;
        }
        ModuleDescriptor containingModule = DescriptorUtils.getContainingModule(classDescriptor);
        ClassDescriptor findEnumEntriesClass = StdlibClassFinderKt.getStdlibClassFinder(containingModule).findEnumEntriesClass(containingModule);
        if (findEnumEntriesClass == null) {
            return null;
        }
        Annotations.Companion companion = Annotations.Companion;
        Annotations empty = companion.getEMPTY();
        Modality modality = Modality.FINAL;
        DescriptorVisibility descriptorVisibility = DescriptorVisibilities.PUBLIC;
        Name name = StandardNames.ENUM_ENTRIES;
        CallableMemberDescriptor.Kind kind = CallableMemberDescriptor.Kind.SYNTHESIZED;
        PropertyDescriptorImpl create = PropertyDescriptorImpl.create(classDescriptor, empty, modality, descriptorVisibility, false, name, kind, classDescriptor.getSource(), false, false, false, false, false, false);
        PropertyGetterDescriptorImpl propertyGetterDescriptorImpl = new PropertyGetterDescriptorImpl(create, companion.getEMPTY(), modality, descriptorVisibility, false, false, false, kind, null, classDescriptor.getSource());
        create.initialize(propertyGetterDescriptorImpl, null);
        SimpleType simpleType = KotlinTypeFactory.simpleType(TypeAttributes.Companion.getEmpty(), findEnumEntriesClass.getTypeConstructor(), Collections.singletonList(new TypeProjectionImpl(classDescriptor.getDefaultType())), false);
        List<? extends TypeParameterDescriptor> list = Collections.EMPTY_LIST;
        create.setType(simpleType, list, null, null, list);
        propertyGetterDescriptorImpl.initialize(create.getReturnType());
        return create;
    }

    public static SimpleFunctionDescriptor createEnumValueOfMethod(ClassDescriptor classDescriptor) {
        if (classDescriptor == null) {
            $$$reportNull$$$0(24);
            throw null;
        }
        Annotations.Companion companion = Annotations.Companion;
        SimpleFunctionDescriptorImpl create = SimpleFunctionDescriptorImpl.create(classDescriptor, companion.getEMPTY(), StandardNames.ENUM_VALUE_OF, CallableMemberDescriptor.Kind.SYNTHESIZED, classDescriptor.getSource());
        ValueParameterDescriptorImpl valueParameterDescriptorImpl = new ValueParameterDescriptorImpl(create, null, 0, companion.getEMPTY(), Name.identifier("value"), DescriptorUtilsKt.getBuiltIns(classDescriptor).getStringType(), false, false, false, null, classDescriptor.getSource());
        List<ReceiverParameterDescriptor> list = Collections.EMPTY_LIST;
        SimpleFunctionDescriptorImpl initialize = create.initialize((ReceiverParameterDescriptor) null, (ReceiverParameterDescriptor) null, list, (List<? extends TypeParameterDescriptor>) list, Collections.singletonList(valueParameterDescriptorImpl), (KotlinType) classDescriptor.getDefaultType(), Modality.FINAL, DescriptorVisibilities.PUBLIC);
        if (initialize != null) {
            return initialize;
        }
        $$$reportNull$$$0(25);
        throw null;
    }

    public static SimpleFunctionDescriptor createEnumValuesMethod(ClassDescriptor classDescriptor) {
        if (classDescriptor == null) {
            $$$reportNull$$$0(22);
            throw null;
        }
        SimpleFunctionDescriptorImpl create = SimpleFunctionDescriptorImpl.create(classDescriptor, Annotations.Companion.getEMPTY(), StandardNames.ENUM_VALUES, CallableMemberDescriptor.Kind.SYNTHESIZED, classDescriptor.getSource());
        List<ReceiverParameterDescriptor> list = Collections.EMPTY_LIST;
        SimpleFunctionDescriptorImpl initialize = create.initialize((ReceiverParameterDescriptor) null, (ReceiverParameterDescriptor) null, list, (List<? extends TypeParameterDescriptor>) list, (List<ValueParameterDescriptor>) list, (KotlinType) DescriptorUtilsKt.getBuiltIns(classDescriptor).getArrayType(Variance.INVARIANT, classDescriptor.getDefaultType()), Modality.FINAL, DescriptorVisibilities.PUBLIC);
        if (initialize != null) {
            return initialize;
        }
        $$$reportNull$$$0(23);
        throw null;
    }

    public static ReceiverParameterDescriptor createExtensionReceiverParameterForCallable(CallableDescriptor callableDescriptor, KotlinType kotlinType, Annotations annotations) {
        if (callableDescriptor == null) {
            $$$reportNull$$$0(30);
            throw null;
        }
        if (annotations == null) {
            $$$reportNull$$$0(31);
            throw null;
        }
        if (kotlinType == null) {
            return null;
        }
        return new ReceiverParameterDescriptorImpl(callableDescriptor, new ExtensionReceiver(callableDescriptor, kotlinType, null), annotations);
    }

    public static PropertyGetterDescriptorImpl createGetter(PropertyDescriptor propertyDescriptor, Annotations annotations, boolean z, boolean z2, boolean z3, SourceElement sourceElement) {
        if (propertyDescriptor == null) {
            $$$reportNull$$$0(17);
            throw null;
        }
        if (annotations == null) {
            $$$reportNull$$$0(18);
            throw null;
        }
        if (sourceElement != null) {
            return new PropertyGetterDescriptorImpl(propertyDescriptor, annotations, propertyDescriptor.getModality(), propertyDescriptor.getVisibility(), z, z2, z3, CallableMemberDescriptor.Kind.DECLARATION, null, sourceElement);
        }
        $$$reportNull$$$0(19);
        throw null;
    }

    public static ClassConstructorDescriptorImpl createPrimaryConstructorForObject(ClassDescriptor classDescriptor, SourceElement sourceElement) {
        if (classDescriptor == null) {
            $$$reportNull$$$0(20);
            throw null;
        }
        if (sourceElement == null) {
            $$$reportNull$$$0(21);
            throw null;
        }
        if (classDescriptor == null) {
            DefaultClassConstructorDescriptor.$$$reportNull$$$0(0);
            throw null;
        }
        if (sourceElement == null) {
            DefaultClassConstructorDescriptor.$$$reportNull$$$0(1);
            throw null;
        }
        DefaultClassConstructorDescriptor defaultClassConstructorDescriptor = new DefaultClassConstructorDescriptor(classDescriptor, null, Annotations.Companion.getEMPTY(), true, CallableMemberDescriptor.Kind.DECLARATION, sourceElement);
        defaultClassConstructorDescriptor.initialize(Collections.EMPTY_LIST, DescriptorUtils.getDefaultConstructorVisibility(classDescriptor, false));
        return defaultClassConstructorDescriptor;
    }

    public static PropertySetterDescriptorImpl createSetter(PropertyDescriptor propertyDescriptor, Annotations annotations, Annotations annotations2, boolean z, boolean z2, boolean z3, DescriptorVisibility descriptorVisibility, SourceElement sourceElement) {
        if (propertyDescriptor == null) {
            $$$reportNull$$$0(7);
            throw null;
        }
        if (annotations == null) {
            $$$reportNull$$$0(8);
            throw null;
        }
        if (annotations2 == null) {
            $$$reportNull$$$0(9);
            throw null;
        }
        if (descriptorVisibility == null) {
            $$$reportNull$$$0(10);
            throw null;
        }
        if (sourceElement == null) {
            $$$reportNull$$$0(11);
            throw null;
        }
        PropertySetterDescriptorImpl propertySetterDescriptorImpl = new PropertySetterDescriptorImpl(propertyDescriptor, annotations, propertyDescriptor.getModality(), descriptorVisibility, z, z2, z3, CallableMemberDescriptor.Kind.DECLARATION, null, sourceElement);
        propertySetterDescriptorImpl.initialize(PropertySetterDescriptorImpl.createSetterParameter(propertySetterDescriptorImpl, propertyDescriptor.getType(), annotations2));
        return propertySetterDescriptorImpl;
    }

    public static PropertyGetterDescriptorImpl createGetter(PropertyDescriptor propertyDescriptor, Annotations annotations, boolean z, boolean z2, boolean z3) {
        if (propertyDescriptor == null) {
            $$$reportNull$$$0(15);
            throw null;
        }
        if (annotations != null) {
            return createGetter(propertyDescriptor, annotations, z, z2, z3, propertyDescriptor.getSource());
        }
        $$$reportNull$$$0(16);
        throw null;
    }

    public static PropertySetterDescriptorImpl createSetter(PropertyDescriptor propertyDescriptor, Annotations annotations, Annotations annotations2, boolean z, boolean z2, boolean z3, SourceElement sourceElement) {
        if (propertyDescriptor == null) {
            $$$reportNull$$$0(3);
            throw null;
        }
        if (annotations == null) {
            $$$reportNull$$$0(4);
            throw null;
        }
        if (annotations2 == null) {
            $$$reportNull$$$0(5);
            throw null;
        }
        if (sourceElement != null) {
            return createSetter(propertyDescriptor, annotations, annotations2, z, z2, z3, propertyDescriptor.getVisibility(), sourceElement);
        }
        $$$reportNull$$$0(6);
        throw null;
    }
}
