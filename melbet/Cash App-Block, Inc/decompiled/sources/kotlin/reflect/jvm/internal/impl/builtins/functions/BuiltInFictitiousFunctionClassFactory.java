package kotlin.reflect.jvm.internal.impl.builtins.functions;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.collections.EmptySet;
import kotlin.reflect.jvm.internal.impl.builtins.BuiltInsPackageFragment;
import kotlin.reflect.jvm.internal.impl.builtins.FunctionInterfacePackageFragment;
import kotlin.reflect.jvm.internal.impl.builtins.functions.FunctionTypeKindExtractor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ModuleDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.PackageFragmentDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.deserialization.ClassDescriptorFactory;
import kotlin.reflect.jvm.internal.impl.name.ClassId;
import kotlin.reflect.jvm.internal.impl.name.FqName;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.storage.StorageManager;
import kotlin.text.StringsKt;
import kotlin.text.StringsKt__StringsJVMKt;

/* loaded from: classes9.dex */
public final class BuiltInFictitiousFunctionClassFactory implements ClassDescriptorFactory {
    public final ModuleDescriptor module;
    public final StorageManager storageManager;

    public BuiltInFictitiousFunctionClassFactory(StorageManager storageManager, ModuleDescriptor moduleDescriptor) {
        storageManager.getClass();
        moduleDescriptor.getClass();
        this.storageManager = storageManager;
        this.module = moduleDescriptor;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.deserialization.ClassDescriptorFactory
    public ClassDescriptor createClass(ClassId classId) {
        FqName packageFqName;
        FunctionTypeKindExtractor.KindWithArity functionalClassKindWithArity;
        classId.getClass();
        if (classId.isLocal() || classId.isNestedClass()) {
            return null;
        }
        String asString = classId.getRelativeClassName().asString();
        if (!StringsKt.contains((CharSequence) asString, (CharSequence) "Function", false) || (functionalClassKindWithArity = FunctionTypeKindExtractor.Companion.getDefault().getFunctionalClassKindWithArity((packageFqName = classId.getPackageFqName()), asString)) == null) {
            return null;
        }
        FunctionTypeKind component1 = functionalClassKindWithArity.component1();
        int component2 = functionalClassKindWithArity.component2();
        List<PackageFragmentDescriptor> fragments = this.module.getPackage(packageFqName).getFragments();
        ArrayList arrayList = new ArrayList();
        for (Object obj : fragments) {
            if (obj instanceof BuiltInsPackageFragment) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            Object next = it.next();
            if (next instanceof FunctionInterfacePackageFragment) {
                arrayList2.add(next);
            }
        }
        PackageFragmentDescriptor packageFragmentDescriptor = (FunctionInterfacePackageFragment) CollectionsKt.firstOrNull((List) arrayList2);
        if (packageFragmentDescriptor == null) {
            packageFragmentDescriptor = (BuiltInsPackageFragment) CollectionsKt.first((List) arrayList);
        }
        return new FunctionClassDescriptor(this.storageManager, packageFragmentDescriptor, component1, component2);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.deserialization.ClassDescriptorFactory
    public Collection<ClassDescriptor> getAllContributedClassesIfPossible(FqName fqName) {
        fqName.getClass();
        return EmptySet.INSTANCE;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.deserialization.ClassDescriptorFactory
    public boolean shouldCreateClass(FqName fqName, Name name) {
        fqName.getClass();
        name.getClass();
        String asString = name.asString();
        asString.getClass();
        return (StringsKt__StringsJVMKt.startsWith(asString, "Function", false) || StringsKt__StringsJVMKt.startsWith(asString, "KFunction", false) || StringsKt__StringsJVMKt.startsWith(asString, "SuspendFunction", false) || StringsKt__StringsJVMKt.startsWith(asString, "KSuspendFunction", false)) && FunctionTypeKindExtractor.Companion.getDefault().getFunctionalClassKindWithArity(fqName, asString) != null;
    }
}
