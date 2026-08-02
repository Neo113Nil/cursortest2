package kotlin.reflect.jvm.internal.impl.load.java.descriptors;

import java.util.List;
import kotlin.Pair;
import kotlin.collections.EmptyList;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.SourceElement;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.ClassConstructorDescriptorImpl;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.FunctionDescriptorImpl;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.resolve.DescriptorFactory;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;

/* loaded from: classes9.dex */
public class JavaClassConstructorDescriptor extends ClassConstructorDescriptorImpl implements JavaCallableMemberDescriptor {
    public Boolean hasStableParameterNames;
    public Boolean hasSynthesizedParameterNames;

    public static /* synthetic */ void $$$reportNull$$$0(int i) {
        String str = (i == 11 || i == 18) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[(i == 11 || i == 18) ? 2 : 3];
        switch (i) {
            case 1:
            case 5:
            case 9:
            case 15:
                objArr[0] = "annotations";
                break;
            case 2:
            case 8:
            case 13:
                objArr[0] = "kind";
                break;
            case 3:
            case 6:
            case 10:
                objArr[0] = "source";
                break;
            case 4:
            default:
                objArr[0] = "containingDeclaration";
                break;
            case 7:
            case 12:
                objArr[0] = "newOwner";
                break;
            case 11:
            case 18:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/load/java/descriptors/JavaClassConstructorDescriptor";
                break;
            case 14:
                objArr[0] = "sourceElement";
                break;
            case 16:
                objArr[0] = "enhancedValueParameterTypes";
                break;
            case 17:
                objArr[0] = "enhancedReturnType";
                break;
        }
        if (i == 11) {
            objArr[1] = "createSubstitutedCopy";
        } else if (i != 18) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/load/java/descriptors/JavaClassConstructorDescriptor";
        } else {
            objArr[1] = "enhance";
        }
        switch (i) {
            case 4:
            case 5:
            case 6:
                objArr[2] = "createJavaConstructor";
                break;
            case 7:
            case 8:
            case 9:
            case 10:
                objArr[2] = "createSubstitutedCopy";
                break;
            case 11:
            case 18:
                break;
            case 12:
            case 13:
            case 14:
            case 15:
                objArr[2] = "createDescriptor";
                break;
            case 16:
            case 17:
                objArr[2] = "enhance";
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        String format2 = String.format(str, objArr);
        if (i != 11 && i != 18) {
            throw new IllegalArgumentException(format2);
        }
        throw new IllegalStateException(format2);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public JavaClassConstructorDescriptor(ClassDescriptor classDescriptor, JavaClassConstructorDescriptor javaClassConstructorDescriptor, Annotations annotations, boolean z, CallableMemberDescriptor.Kind kind, SourceElement sourceElement) {
        super(classDescriptor, javaClassConstructorDescriptor, annotations, z, kind, sourceElement);
        if (classDescriptor == null) {
            $$$reportNull$$$0(0);
            throw null;
        }
        if (annotations == null) {
            $$$reportNull$$$0(1);
            throw null;
        }
        if (kind == null) {
            $$$reportNull$$$0(2);
            throw null;
        }
        if (sourceElement == null) {
            $$$reportNull$$$0(3);
            throw null;
        }
        this.hasStableParameterNames = null;
        this.hasSynthesizedParameterNames = null;
    }

    public static JavaClassConstructorDescriptor createJavaConstructor(ClassDescriptor classDescriptor, Annotations annotations, boolean z, SourceElement sourceElement) {
        if (classDescriptor == null) {
            $$$reportNull$$$0(4);
            throw null;
        }
        if (annotations == null) {
            $$$reportNull$$$0(5);
            throw null;
        }
        if (sourceElement != null) {
            return new JavaClassConstructorDescriptor(classDescriptor, null, annotations, z, CallableMemberDescriptor.Kind.DECLARATION, sourceElement);
        }
        $$$reportNull$$$0(6);
        throw null;
    }

    public final JavaClassConstructorDescriptor createSubstitutedCopy(DeclarationDescriptor declarationDescriptor, FunctionDescriptor functionDescriptor, CallableMemberDescriptor.Kind kind, Annotations annotations, SourceElement sourceElement) {
        if (declarationDescriptor == null) {
            $$$reportNull$$$0(7);
            throw null;
        }
        if (kind == null) {
            $$$reportNull$$$0(8);
            throw null;
        }
        if (annotations == null) {
            $$$reportNull$$$0(9);
            throw null;
        }
        if (sourceElement == null) {
            $$$reportNull$$$0(10);
            throw null;
        }
        if (kind == CallableMemberDescriptor.Kind.DECLARATION || kind == CallableMemberDescriptor.Kind.SYNTHESIZED) {
            JavaClassConstructorDescriptor javaClassConstructorDescriptor = new JavaClassConstructorDescriptor((ClassDescriptor) declarationDescriptor, (JavaClassConstructorDescriptor) functionDescriptor, annotations, this.isPrimary, kind, sourceElement);
            javaClassConstructorDescriptor.setHasStableParameterNames(hasStableParameterNames());
            javaClassConstructorDescriptor.setHasSynthesizedParameterNames(hasSynthesizedParameterNames());
            return javaClassConstructorDescriptor;
        }
        throw new IllegalStateException("Attempt at creating a constructor that is not a declaration: \ncopy from: " + this + "\nnewOwner: " + declarationDescriptor + "\nkind: " + kind);
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.descriptors.JavaCallableMemberDescriptor
    public JavaClassConstructorDescriptor enhance(KotlinType kotlinType, List<KotlinType> list, KotlinType kotlinType2, Pair<CallableDescriptor.UserDataKey<?>, ?> pair) {
        if (list == null) {
            $$$reportNull$$$0(16);
            throw null;
        }
        if (kotlinType2 == null) {
            $$$reportNull$$$0(17);
            throw null;
        }
        JavaClassConstructorDescriptor createSubstitutedCopy = createSubstitutedCopy(getContainingDeclaration(), null, getKind(), getAnnotations(), getSource());
        createSubstitutedCopy.initialize(kotlinType != null ? DescriptorFactory.createExtensionReceiverParameterForCallable(createSubstitutedCopy, kotlinType, Annotations.Companion.getEMPTY()) : null, getDispatchReceiverParameter(), EmptyList.INSTANCE, getTypeParameters(), UtilKt.copyValueParameters(list, getValueParameters(), createSubstitutedCopy), kotlinType2, getModality(), getVisibility());
        if (pair != null) {
            createSubstitutedCopy.putInUserDataMap((CallableDescriptor.UserDataKey) pair.first, pair.second);
        }
        return createSubstitutedCopy;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.FunctionDescriptorImpl
    public boolean hasStableParameterNames() {
        return this.hasStableParameterNames.booleanValue();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.FunctionDescriptorImpl, kotlin.reflect.jvm.internal.impl.descriptors.CallableDescriptor
    public boolean hasSynthesizedParameterNames() {
        return this.hasSynthesizedParameterNames.booleanValue();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.FunctionDescriptorImpl
    public void setHasStableParameterNames(boolean z) {
        this.hasStableParameterNames = Boolean.valueOf(z);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.FunctionDescriptorImpl
    public void setHasSynthesizedParameterNames(boolean z) {
        this.hasSynthesizedParameterNames = Boolean.valueOf(z);
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.descriptors.JavaCallableMemberDescriptor
    public /* bridge */ /* synthetic */ JavaCallableMemberDescriptor enhance(KotlinType kotlinType, List list, KotlinType kotlinType2, Pair pair) {
        return enhance(kotlinType, (List<KotlinType>) list, kotlinType2, (Pair<CallableDescriptor.UserDataKey<?>, ?>) pair);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.ClassConstructorDescriptorImpl, kotlin.reflect.jvm.internal.impl.descriptors.impl.FunctionDescriptorImpl
    public final /* bridge */ /* synthetic */ FunctionDescriptorImpl createSubstitutedCopy(DeclarationDescriptor declarationDescriptor, FunctionDescriptor functionDescriptor, CallableMemberDescriptor.Kind kind, Name name, Annotations annotations, SourceElement sourceElement) {
        return createSubstitutedCopy(declarationDescriptor, functionDescriptor, kind, annotations, sourceElement);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.ClassConstructorDescriptorImpl, kotlin.reflect.jvm.internal.impl.descriptors.impl.FunctionDescriptorImpl
    public final /* bridge */ /* synthetic */ ClassConstructorDescriptorImpl createSubstitutedCopy(DeclarationDescriptor declarationDescriptor, FunctionDescriptor functionDescriptor, CallableMemberDescriptor.Kind kind, Name name, Annotations annotations, SourceElement sourceElement) {
        return createSubstitutedCopy(declarationDescriptor, functionDescriptor, kind, annotations, sourceElement);
    }
}
