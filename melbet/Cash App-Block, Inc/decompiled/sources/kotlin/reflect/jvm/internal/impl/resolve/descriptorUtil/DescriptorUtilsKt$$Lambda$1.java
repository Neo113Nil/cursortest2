package kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil;

import kotlin.jvm.functions.Function1;
import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor;

/* loaded from: classes9.dex */
public final class DescriptorUtilsKt$$Lambda$1 implements Function1 {
    public static final DescriptorUtilsKt$$Lambda$1 INSTANCE = new DescriptorUtilsKt$$Lambda$1();

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        DeclarationDescriptor declarationDescriptor = (DeclarationDescriptor) obj;
        int i = DescriptorUtilsKt.$r8$clinit;
        declarationDescriptor.getClass();
        return declarationDescriptor.getContainingDeclaration();
    }
}
