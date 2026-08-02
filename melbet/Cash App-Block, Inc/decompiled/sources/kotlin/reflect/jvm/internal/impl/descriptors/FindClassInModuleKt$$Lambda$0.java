package kotlin.reflect.jvm.internal.impl.descriptors;

import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.reflect.jvm.internal.impl.name.ClassId;
import kotlin.text.StringsKt__StringsKt$lineSequence$$inlined$Sequence$1;

/* loaded from: classes9.dex */
public final class FindClassInModuleKt$$Lambda$0 implements Function1 {
    public static final FindClassInModuleKt$$Lambda$0 INSTANCE = new FindClassInModuleKt$$Lambda$0(0);
    public static final FindClassInModuleKt$$Lambda$0 INSTANCE$1 = new FindClassInModuleKt$$Lambda$0(1);
    public static final FindClassInModuleKt$$Lambda$0 INSTANCE$2 = new FindClassInModuleKt$$Lambda$0(2);
    public static final FindClassInModuleKt$$Lambda$0 INSTANCE$3 = new FindClassInModuleKt$$Lambda$0(3);
    public static final FindClassInModuleKt$$Lambda$0 INSTANCE$4 = new FindClassInModuleKt$$Lambda$0(4);
    public final /* synthetic */ int $r8$classId;

    public /* synthetic */ FindClassInModuleKt$$Lambda$0(int i) {
        this.$r8$classId = i;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.$r8$classId) {
            case 0:
                ((ClassId) obj).getClass();
                return 0;
            case 1:
                PackageFragmentDescriptor packageFragmentDescriptor = (PackageFragmentDescriptor) obj;
                packageFragmentDescriptor.getClass();
                return packageFragmentDescriptor.getFqName();
            case 2:
                DeclarationDescriptor declarationDescriptor = (DeclarationDescriptor) obj;
                declarationDescriptor.getClass();
                return Boolean.valueOf(declarationDescriptor instanceof CallableDescriptor);
            case 3:
                ((DeclarationDescriptor) obj).getClass();
                return Boolean.valueOf(!(r2 instanceof ConstructorDescriptor));
            default:
                DeclarationDescriptor declarationDescriptor2 = (DeclarationDescriptor) obj;
                declarationDescriptor2.getClass();
                List<TypeParameterDescriptor> typeParameters = ((CallableDescriptor) declarationDescriptor2).getTypeParameters();
                typeParameters.getClass();
                return new StringsKt__StringsKt$lineSequence$$inlined$Sequence$1(typeParameters, 1);
        }
    }
}
