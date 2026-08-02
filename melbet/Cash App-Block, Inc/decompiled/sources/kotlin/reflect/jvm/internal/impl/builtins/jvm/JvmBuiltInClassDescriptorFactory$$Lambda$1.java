package kotlin.reflect.jvm.internal.impl.builtins.jvm;

import java.util.ArrayList;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.reflect.jvm.internal.impl.builtins.BuiltInsPackageFragment;
import kotlin.reflect.jvm.internal.impl.builtins.jvm.JvmBuiltInClassDescriptorFactory;
import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ModuleDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.PackageFragmentDescriptor;

/* loaded from: classes9.dex */
public final class JvmBuiltInClassDescriptorFactory$$Lambda$1 implements Function1 {
    public static final JvmBuiltInClassDescriptorFactory$$Lambda$1 INSTANCE = new JvmBuiltInClassDescriptorFactory$$Lambda$1();

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        ModuleDescriptor moduleDescriptor = (ModuleDescriptor) obj;
        JvmBuiltInClassDescriptorFactory.Companion companion = JvmBuiltInClassDescriptorFactory.Companion;
        moduleDescriptor.getClass();
        List<PackageFragmentDescriptor> fragments = moduleDescriptor.getPackage(JvmBuiltInClassDescriptorFactory.KOTLIN_FQ_NAME).getFragments();
        ArrayList arrayList = new ArrayList();
        for (Object obj2 : fragments) {
            if (obj2 instanceof BuiltInsPackageFragment) {
                arrayList.add(obj2);
            }
        }
        return (DeclarationDescriptor) CollectionsKt.first((List) arrayList);
    }
}
