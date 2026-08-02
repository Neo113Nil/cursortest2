package kotlinx.serialization.internal;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* loaded from: classes9.dex */
public final class HashSetSerializer extends CollectionLikeSerializer {
    public final /* synthetic */ int $r8$classId;
    public final ListLikeDescriptor descriptor;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HashSetSerializer(KSerializer kSerializer, int i) {
        super(kSerializer);
        this.$r8$classId = i;
        kSerializer.getClass();
        switch (i) {
            case 1:
                super(kSerializer);
                SerialDescriptor descriptor = kSerializer.getDescriptor();
                descriptor.getClass();
                this.descriptor = new ArrayClassDesc(descriptor, 1);
                break;
            case 2:
                super(kSerializer);
                SerialDescriptor descriptor2 = kSerializer.getDescriptor();
                descriptor2.getClass();
                this.descriptor = new ArrayClassDesc(descriptor2, 3);
                break;
            default:
                SerialDescriptor descriptor3 = kSerializer.getDescriptor();
                descriptor3.getClass();
                this.descriptor = new ArrayClassDesc(descriptor3, 2);
                break;
        }
    }

    @Override // kotlinx.serialization.internal.AbstractCollectionSerializer
    public final Object builder() {
        switch (this.$r8$classId) {
            case 0:
                return new HashSet();
            case 1:
                return new ArrayList();
            default:
                return new LinkedHashSet();
        }
    }

    @Override // kotlinx.serialization.internal.AbstractCollectionSerializer
    public final int builderSize(Object obj) {
        switch (this.$r8$classId) {
            case 0:
                HashSet hashSet = (HashSet) obj;
                hashSet.getClass();
                return hashSet.size();
            case 1:
                ArrayList arrayList = (ArrayList) obj;
                arrayList.getClass();
                return arrayList.size();
            default:
                LinkedHashSet linkedHashSet = (LinkedHashSet) obj;
                linkedHashSet.getClass();
                return linkedHashSet.size();
        }
    }

    @Override // kotlinx.serialization.internal.AbstractCollectionSerializer
    public final Iterator collectionIterator(Object obj) {
        Collection collection = (Collection) obj;
        collection.getClass();
        return collection.iterator();
    }

    @Override // kotlinx.serialization.internal.AbstractCollectionSerializer
    public final int collectionSize(Object obj) {
        Collection collection = (Collection) obj;
        collection.getClass();
        return collection.size();
    }

    @Override // kotlinx.serialization.KSerializer
    public final SerialDescriptor getDescriptor() {
        switch (this.$r8$classId) {
        }
        return (ArrayClassDesc) this.descriptor;
    }

    @Override // kotlinx.serialization.internal.CollectionLikeSerializer
    public final void insert(int i, Object obj, Object obj2) {
        switch (this.$r8$classId) {
            case 0:
                HashSet hashSet = (HashSet) obj;
                hashSet.getClass();
                hashSet.add(obj2);
                break;
            case 1:
                ArrayList arrayList = (ArrayList) obj;
                arrayList.getClass();
                arrayList.add(i, obj2);
                break;
            default:
                LinkedHashSet linkedHashSet = (LinkedHashSet) obj;
                linkedHashSet.getClass();
                linkedHashSet.add(obj2);
                break;
        }
    }

    @Override // kotlinx.serialization.internal.AbstractCollectionSerializer
    public final Object toBuilder(Object obj) {
        switch (this.$r8$classId) {
            case 0:
                throw null;
            case 1:
                throw null;
            default:
                throw null;
        }
    }

    @Override // kotlinx.serialization.internal.AbstractCollectionSerializer
    public final Object toResult(Object obj) {
        switch (this.$r8$classId) {
            case 0:
                HashSet hashSet = (HashSet) obj;
                hashSet.getClass();
                return hashSet;
            case 1:
                ArrayList arrayList = (ArrayList) obj;
                arrayList.getClass();
                return arrayList;
            default:
                LinkedHashSet linkedHashSet = (LinkedHashSet) obj;
                linkedHashSet.getClass();
                return linkedHashSet;
        }
    }
}
