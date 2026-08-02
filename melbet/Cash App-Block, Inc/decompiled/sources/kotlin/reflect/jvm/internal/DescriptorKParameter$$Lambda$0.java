package kotlin.reflect.jvm.internal;

import java.lang.reflect.Type;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ReceiverParameterDescriptor;
import net.idrnd.face.iad.capture.internal.f$$ExternalSyntheticLambda0;

/* loaded from: classes9.dex */
public final class DescriptorKParameter$$Lambda$0 implements Function0 {
    public final /* synthetic */ int $r8$classId;
    public final DescriptorKParameter arg$0;

    public /* synthetic */ DescriptorKParameter$$Lambda$0(DescriptorKParameter descriptorKParameter, int i) {
        this.$r8$classId = i;
        this.arg$0 = descriptorKParameter;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.$r8$classId;
        DescriptorKParameter descriptorKParameter = this.arg$0;
        switch (i) {
            case 0:
                return UtilKt.computeAnnotations(descriptorKParameter.getDescriptor());
            default:
                ParameterDescriptor descriptor = descriptorKParameter.getDescriptor();
                DescriptorKCallable descriptorKCallable = descriptorKParameter.callable;
                if (descriptor instanceof ReceiverParameterDescriptor) {
                    ReceiverParameterDescriptor instanceReceiverParameter = UtilKt.getInstanceReceiverParameter(descriptorKCallable);
                    KCallableOverriddenStorage kCallableOverriddenStorage = descriptorKCallable.overriddenStorage;
                    if (Intrinsics.areEqual(instanceReceiverParameter, descriptor) && (kCallableOverriddenStorage.isFakeOverride || descriptorKCallable.getDescriptor().getKind() == CallableMemberDescriptor.Kind.FAKE_OVERRIDE)) {
                        DeclarationDescriptor declarationDescriptor = kCallableOverriddenStorage.instanceReceiverParameter;
                        if (declarationDescriptor == null) {
                            declarationDescriptor = descriptorKCallable.getDescriptor();
                        }
                        DeclarationDescriptor containingDeclaration = declarationDescriptor.getContainingDeclaration();
                        containingDeclaration.getClass();
                        Class javaClass = UtilKt.toJavaClass((ClassDescriptor) containingDeclaration);
                        if (javaClass != null) {
                            return javaClass;
                        }
                        f$$ExternalSyntheticLambda0.m$1(descriptor, "Cannot determine receiver Java type of inherited declaration: ");
                        return null;
                    }
                }
                return (Type) descriptorKCallable.getCaller().getParameterTypes().get(descriptorKParameter.index);
        }
    }
}
