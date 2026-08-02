package kotlinx.serialization.descriptors;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.IndexedValue;
import kotlin.collections.IndexingIterable;
import kotlin.collections.MapsKt__MapsKt;
import kotlin.jvm.internal.ArrayIterator;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.internal.CachedNames;
import kotlinx.serialization.internal.EnumsKt;
import kotlinx.serialization.internal.TuplesKt;
import okio.Utf8;
import papa.internal.AppUpdateDetector$$ExternalSyntheticLambda0;

/* loaded from: classes3.dex */
public final class SerialDescriptorImpl implements SerialDescriptor, CachedNames {
    public final Lazy _hashCode$delegate;
    public final List annotations;
    public final List[] elementAnnotations;
    public final SerialDescriptor[] elementDescriptors;
    public final String[] elementNames;
    public final boolean[] elementOptionality;
    public final int elementsCount;
    public final Utf8 kind;
    public final Map name2Index;
    public final String serialName;
    public final HashSet serialNames;
    public final SerialDescriptor[] typeParametersDescriptors;

    public SerialDescriptorImpl(String str, Utf8 utf8, int i, List list, ClassSerialDescriptorBuilder classSerialDescriptorBuilder) {
        list.getClass();
        this.serialName = str;
        this.kind = utf8;
        this.elementsCount = i;
        this.annotations = classSerialDescriptorBuilder.annotations;
        ArrayList arrayList = classSerialDescriptorBuilder.elementNames;
        this.serialNames = CollectionsKt.toHashSet(arrayList);
        String[] strArr = (String[]) arrayList.toArray(new String[0]);
        this.elementNames = strArr;
        this.elementDescriptors = EnumsKt.compactArray(classSerialDescriptorBuilder.elementDescriptors);
        this.elementAnnotations = (List[]) classSerialDescriptorBuilder.elementAnnotations.toArray(new List[0]);
        this.elementOptionality = CollectionsKt.toBooleanArray(classSerialDescriptorBuilder.elementOptionality);
        strArr.getClass();
        IndexingIterable indexingIterable = new IndexingIterable(new AppUpdateDetector$$ExternalSyntheticLambda0(strArr, 11), 0);
        ArrayList arrayList2 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(indexingIterable, 10));
        Iterator it = indexingIterable.iterator();
        while (true) {
            ArrayIterator arrayIterator = (ArrayIterator) it;
            if (!((Iterator) arrayIterator.f1520array).hasNext()) {
                this.name2Index = MapsKt__MapsKt.toMap(arrayList2);
                this.typeParametersDescriptors = EnumsKt.compactArray(list);
                this._hashCode$delegate = LazyKt.lazy(new AppUpdateDetector$$ExternalSyntheticLambda0(this, 13));
                return;
            }
            IndexedValue indexedValue = (IndexedValue) arrayIterator.next();
            arrayList2.add(new Pair(indexedValue.value, Integer.valueOf(indexedValue.index)));
        }
    }

    public final boolean equals(Object obj) {
        int i;
        if (this == obj) {
            return true;
        }
        if (obj instanceof SerialDescriptorImpl) {
            SerialDescriptor serialDescriptor = (SerialDescriptor) obj;
            if (this.serialName.equals(serialDescriptor.getSerialName()) && Arrays.equals(this.typeParametersDescriptors, ((SerialDescriptorImpl) obj).typeParametersDescriptors)) {
                int elementsCount = serialDescriptor.getElementsCount();
                int i2 = this.elementsCount;
                if (i2 == elementsCount) {
                    for (0; i < i2; i + 1) {
                        SerialDescriptor[] serialDescriptorArr = this.elementDescriptors;
                        i = (Intrinsics.areEqual(serialDescriptorArr[i].getSerialName(), serialDescriptor.getElementDescriptor(i).getSerialName()) && Intrinsics.areEqual(serialDescriptorArr[i].getKind(), serialDescriptor.getElementDescriptor(i).getKind())) ? i + 1 : 0;
                    }
                    return true;
                }
            }
        }
        return false;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final List getAnnotations() {
        return this.annotations;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final List getElementAnnotations(int i) {
        return this.elementAnnotations[i];
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final SerialDescriptor getElementDescriptor(int i) {
        return this.elementDescriptors[i];
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final int getElementIndex(String str) {
        str.getClass();
        Integer num = (Integer) this.name2Index.get(str);
        if (num != null) {
            return num.intValue();
        }
        return -3;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final String getElementName(int i) {
        return this.elementNames[i];
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final int getElementsCount() {
        return this.elementsCount;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final Utf8 getKind() {
        return this.kind;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final String getSerialName() {
        return this.serialName;
    }

    @Override // kotlinx.serialization.internal.CachedNames
    public final Set getSerialNames() {
        return this.serialNames;
    }

    public final int hashCode() {
        return ((Number) this._hashCode$delegate.getValue()).intValue();
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final boolean isElementOptional(int i) {
        return this.elementOptionality[i];
    }

    public final String toString() {
        return TuplesKt.toStringImpl(this);
    }
}
