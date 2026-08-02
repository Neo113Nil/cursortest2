package kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.reflect.jvm.internal.impl.descriptors.ValueParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.utils.DFS;

/* loaded from: classes9.dex */
public final class DescriptorUtilsKt$$Lambda$0 implements DFS.Neighbors {
    public static final DescriptorUtilsKt$$Lambda$0 INSTANCE = new DescriptorUtilsKt$$Lambda$0();

    @Override // kotlin.reflect.jvm.internal.impl.utils.DFS.Neighbors
    public final Iterable getNeighbors(Object obj) {
        int i = DescriptorUtilsKt.$r8$clinit;
        Collection<ValueParameterDescriptor> overriddenDescriptors = ((ValueParameterDescriptor) obj).getOverriddenDescriptors();
        ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(overriddenDescriptors, 10));
        Iterator<T> it = overriddenDescriptors.iterator();
        while (it.hasNext()) {
            arrayList.add(((ValueParameterDescriptor) it.next()).getOriginal());
        }
        return arrayList;
    }
}
