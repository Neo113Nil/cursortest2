package kotlin.reflect.jvm.internal;

import kotlin.Unit;
import kotlin.reflect.jvm.internal.impl.descriptors.ConstructorDescriptor;

/* loaded from: classes9.dex */
public final class KClassImpl$getMembers$visitor$1 extends CreateKCallableVisitor {
    public final /* synthetic */ int $r8$classId;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ KClassImpl$getMembers$visitor$1(KDeclarationContainerImpl kDeclarationContainerImpl, int i) {
        super(kDeclarationContainerImpl);
        this.$r8$classId = i;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.DeclarationDescriptorVisitorEmptyBodies, kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptorVisitor
    public final Object visitConstructorDescriptor(ConstructorDescriptor constructorDescriptor, Object obj) {
        switch (this.$r8$classId) {
            case 0:
                constructorDescriptor.getClass();
                ((Unit) obj).getClass();
                throw new IllegalStateException("No constructors should appear here: " + constructorDescriptor);
            default:
                constructorDescriptor.getClass();
                ((Unit) obj).getClass();
                throw new IllegalStateException("No constructors should appear here: " + constructorDescriptor);
        }
    }
}
