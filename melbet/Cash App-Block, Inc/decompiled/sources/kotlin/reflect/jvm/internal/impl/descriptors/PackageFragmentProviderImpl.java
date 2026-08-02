package kotlin.reflect.jvm.internal.impl.descriptors;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Deprecated;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.name.FqName;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.sequences.SequencesKt___SequencesKt;

/* loaded from: classes9.dex */
public final class PackageFragmentProviderImpl implements PackageFragmentProviderOptimized {
    public final Collection packageFragments;

    public PackageFragmentProviderImpl(Collection<? extends PackageFragmentDescriptor> collection) {
        collection.getClass();
        this.packageFragments = collection;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.reflect.jvm.internal.impl.descriptors.PackageFragmentProviderOptimized
    public void collectPackageFragments(FqName fqName, Collection<PackageFragmentDescriptor> collection) {
        fqName.getClass();
        collection.getClass();
        for (Object obj : this.packageFragments) {
            if (Intrinsics.areEqual(((PackageFragmentDescriptor) obj).getFqName(), fqName)) {
                collection.add(obj);
            }
        }
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.PackageFragmentProvider
    @Deprecated
    public List<PackageFragmentDescriptor> getPackageFragments(FqName fqName) {
        fqName.getClass();
        Collection collection = this.packageFragments;
        ArrayList arrayList = new ArrayList();
        for (Object obj : collection) {
            if (Intrinsics.areEqual(((PackageFragmentDescriptor) obj).getFqName(), fqName)) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.PackageFragmentProvider
    public Collection<FqName> getSubPackagesOf(FqName fqName, Function1<? super Name, Boolean> function1) {
        fqName.getClass();
        function1.getClass();
        return SequencesKt___SequencesKt.toList(SequencesKt___SequencesKt.filter(SequencesKt___SequencesKt.map(CollectionsKt.asSequence(this.packageFragments), FindClassInModuleKt$$Lambda$0.INSTANCE$1), new PackageFragmentProviderImpl$$Lambda$1(fqName, 0)));
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.PackageFragmentProviderOptimized
    public boolean isEmpty(FqName fqName) {
        fqName.getClass();
        Collection collection = this.packageFragments;
        if ((collection instanceof Collection) && collection.isEmpty()) {
            return true;
        }
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            if (Intrinsics.areEqual(((PackageFragmentDescriptor) it.next()).getFqName(), fqName)) {
                return false;
            }
        }
        return true;
    }
}
