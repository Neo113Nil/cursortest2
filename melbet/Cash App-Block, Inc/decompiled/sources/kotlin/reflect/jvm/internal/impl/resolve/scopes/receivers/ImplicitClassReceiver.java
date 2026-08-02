package kotlin.reflect.jvm.internal.impl.resolve.scopes.receivers;

import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.types.SimpleType;

/* loaded from: classes9.dex */
public class ImplicitClassReceiver implements ImplicitReceiver, ThisClassReceiver {
    public final ClassDescriptor classDescriptor;
    public final ClassDescriptor declarationDescriptor;

    public ImplicitClassReceiver(ClassDescriptor classDescriptor, ImplicitClassReceiver implicitClassReceiver) {
        classDescriptor.getClass();
        this.classDescriptor = classDescriptor;
        this.declarationDescriptor = classDescriptor;
    }

    public boolean equals(Object obj) {
        ImplicitClassReceiver implicitClassReceiver = obj instanceof ImplicitClassReceiver ? (ImplicitClassReceiver) obj : null;
        return Intrinsics.areEqual(this.classDescriptor, implicitClassReceiver != null ? implicitClassReceiver.classDescriptor : null);
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.receivers.ThisClassReceiver
    public final ClassDescriptor getClassDescriptor() {
        return this.classDescriptor;
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.receivers.ReceiverValue
    public SimpleType getType() {
        SimpleType defaultType = this.classDescriptor.getDefaultType();
        defaultType.getClass();
        return defaultType;
    }

    public int hashCode() {
        return this.classDescriptor.hashCode();
    }

    public String toString() {
        return "Class{" + getType() + '}';
    }
}
