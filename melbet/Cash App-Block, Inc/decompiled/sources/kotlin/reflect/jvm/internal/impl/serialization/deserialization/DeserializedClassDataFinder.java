package kotlin.reflect.jvm.internal.impl.serialization.deserialization;

import kotlin.reflect.jvm.internal.impl.descriptors.PackageFragmentDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.PackageFragmentProvider;
import kotlin.reflect.jvm.internal.impl.descriptors.PackageFragmentProviderKt;
import kotlin.reflect.jvm.internal.impl.name.ClassId;

/* loaded from: classes9.dex */
public final class DeserializedClassDataFinder implements ClassDataFinder {
    public final PackageFragmentProvider packageFragmentProvider;

    public DeserializedClassDataFinder(PackageFragmentProvider packageFragmentProvider) {
        packageFragmentProvider.getClass();
        this.packageFragmentProvider = packageFragmentProvider;
    }

    @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.ClassDataFinder
    public ClassData findClassData(ClassId classId) {
        ClassData findClassData;
        classId.getClass();
        for (PackageFragmentDescriptor packageFragmentDescriptor : PackageFragmentProviderKt.packageFragments(this.packageFragmentProvider, classId.getPackageFqName())) {
            if ((packageFragmentDescriptor instanceof DeserializedPackageFragment) && (findClassData = ((DeserializedPackageFragment) packageFragmentDescriptor).getClassDataFinder().findClassData(classId)) != null) {
                return findClassData;
            }
        }
        return null;
    }
}
