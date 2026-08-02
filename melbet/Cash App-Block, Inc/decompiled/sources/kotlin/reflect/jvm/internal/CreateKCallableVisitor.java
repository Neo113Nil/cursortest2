package kotlin.reflect.jvm.internal;

import java.util.List;
import kotlin.Unit;
import kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.PropertyDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ReceiverParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.DeclarationDescriptorVisitorEmptyBodies;
import net.idrnd.face.iad.capture.internal.f$$ExternalSyntheticLambda0;

/* loaded from: classes9.dex */
public class CreateKCallableVisitor extends DeclarationDescriptorVisitorEmptyBodies {
    public final KDeclarationContainerImpl container;
    public final KDeclarationContainerImpl container$1;

    public CreateKCallableVisitor(KDeclarationContainerImpl kDeclarationContainerImpl) {
        kDeclarationContainerImpl.getClass();
        kDeclarationContainerImpl.getClass();
        this.container$1 = kDeclarationContainerImpl;
        this.container = kDeclarationContainerImpl;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.DeclarationDescriptorVisitorEmptyBodies, kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptorVisitor
    public final Object visitFunctionDescriptor(FunctionDescriptor functionDescriptor, Object obj) {
        functionDescriptor.getClass();
        ((Unit) obj).getClass();
        return new DescriptorKFunction(this.container$1, functionDescriptor);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.DeclarationDescriptorVisitorEmptyBodies, kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptorVisitor
    public final Object visitPropertyDescriptor(PropertyDescriptor propertyDescriptor, Object obj) {
        int i;
        propertyDescriptor.getClass();
        ((Unit) obj).getClass();
        List<ReceiverParameterDescriptor> contextReceiverParameters = propertyDescriptor.getContextReceiverParameters();
        contextReceiverParameters.getClass();
        if (contextReceiverParameters.isEmpty()) {
            i = (propertyDescriptor.getDispatchReceiverParameter() != null ? 1 : 0) + (propertyDescriptor.getExtensionReceiverParameter() != null ? 1 : 0);
        } else {
            i = -1;
        }
        boolean isVar = propertyDescriptor.isVar();
        KDeclarationContainerImpl kDeclarationContainerImpl = this.container;
        if (isVar) {
            if (i == -1) {
                return new DescriptorKMutablePropertyN(kDeclarationContainerImpl, propertyDescriptor, KCallableOverriddenStorage.EMPTY);
            }
            if (i == 0) {
                return new DescriptorKMutableProperty0(kDeclarationContainerImpl, propertyDescriptor, KCallableOverriddenStorage.EMPTY);
            }
            if (i == 1) {
                return new DescriptorKMutableProperty1(kDeclarationContainerImpl, propertyDescriptor, KCallableOverriddenStorage.EMPTY);
            }
            if (i == 2) {
                return new DescriptorKMutableProperty2(kDeclarationContainerImpl, propertyDescriptor, KCallableOverriddenStorage.EMPTY);
            }
        } else {
            if (i == -1) {
                return new DescriptorKPropertyN(kDeclarationContainerImpl, propertyDescriptor, KCallableOverriddenStorage.EMPTY);
            }
            if (i == 0) {
                return new DescriptorKProperty0(kDeclarationContainerImpl, propertyDescriptor, KCallableOverriddenStorage.EMPTY);
            }
            if (i == 1) {
                return new DescriptorKProperty1(kDeclarationContainerImpl, propertyDescriptor, KCallableOverriddenStorage.EMPTY);
            }
            if (i == 2) {
                return new DescriptorKProperty2(kDeclarationContainerImpl, propertyDescriptor, KCallableOverriddenStorage.EMPTY);
            }
        }
        f$$ExternalSyntheticLambda0.m$1(propertyDescriptor, "Unsupported property: ");
        return null;
    }
}
