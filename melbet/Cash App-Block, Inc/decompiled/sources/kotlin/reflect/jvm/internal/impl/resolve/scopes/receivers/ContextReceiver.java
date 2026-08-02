package kotlin.reflect.jvm.internal.impl.resolve.scopes.receivers;

import kotlin.reflect.jvm.internal.impl.descriptors.CallableDescriptor;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;

/* loaded from: classes9.dex */
public final class ContextReceiver extends AbstractReceiverValue implements ImplicitContextReceiver {
    public final Name customLabelName;
    public final CallableDescriptor declarationDescriptor;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ContextReceiver(CallableDescriptor callableDescriptor, KotlinType kotlinType, Name name, ReceiverValue receiverValue) {
        super(kotlinType, receiverValue);
        callableDescriptor.getClass();
        kotlinType.getClass();
        this.declarationDescriptor = callableDescriptor;
        this.customLabelName = name;
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.receivers.ImplicitContextReceiver
    public Name getCustomLabelName() {
        return this.customLabelName;
    }

    public CallableDescriptor getDeclarationDescriptor() {
        return this.declarationDescriptor;
    }

    public String toString() {
        return "Cxt { " + getDeclarationDescriptor() + " }";
    }
}
