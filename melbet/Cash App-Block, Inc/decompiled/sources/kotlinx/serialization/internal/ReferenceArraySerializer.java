package kotlinx.serialization.internal;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.jvm.internal.ArrayIterator;
import kotlin.reflect.KClass;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import papa.PapaEvent;

/* loaded from: classes9.dex */
public final class ReferenceArraySerializer extends CollectionLikeSerializer {
    public final ArrayClassDesc descriptor;
    public final KClass kClass;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ReferenceArraySerializer(KClass kClass, KSerializer kSerializer) {
        super(kSerializer);
        kClass.getClass();
        kSerializer.getClass();
        this.kClass = kClass;
        SerialDescriptor descriptor = kSerializer.getDescriptor();
        descriptor.getClass();
        this.descriptor = new ArrayClassDesc(descriptor, 0);
    }

    @Override // kotlinx.serialization.internal.AbstractCollectionSerializer
    public final Object builder() {
        return new ArrayList();
    }

    @Override // kotlinx.serialization.internal.AbstractCollectionSerializer
    public final int builderSize(Object obj) {
        ArrayList arrayList = (ArrayList) obj;
        arrayList.getClass();
        return arrayList.size();
    }

    @Override // kotlinx.serialization.internal.AbstractCollectionSerializer
    public final Iterator collectionIterator(Object obj) {
        Object[] objArr = (Object[]) obj;
        objArr.getClass();
        return new ArrayIterator(objArr);
    }

    @Override // kotlinx.serialization.internal.AbstractCollectionSerializer
    public final int collectionSize(Object obj) {
        Object[] objArr = (Object[]) obj;
        objArr.getClass();
        return objArr.length;
    }

    @Override // kotlinx.serialization.KSerializer
    public final SerialDescriptor getDescriptor() {
        return this.descriptor;
    }

    @Override // kotlinx.serialization.internal.CollectionLikeSerializer
    public final void insert(int i, Object obj, Object obj2) {
        ArrayList arrayList = (ArrayList) obj;
        arrayList.getClass();
        arrayList.add(i, obj2);
    }

    @Override // kotlinx.serialization.internal.AbstractCollectionSerializer
    public final Object toBuilder(Object obj) {
        throw null;
    }

    @Override // kotlinx.serialization.internal.AbstractCollectionSerializer
    public final Object toResult(Object obj) {
        ArrayList arrayList = (ArrayList) obj;
        arrayList.getClass();
        KClass kClass = this.kClass;
        kClass.getClass();
        Object newInstance = Array.newInstance((Class<?>) PapaEvent.getJavaClass(kClass), arrayList.size());
        newInstance.getClass();
        Object[] array2 = arrayList.toArray((Object[]) newInstance);
        array2.getClass();
        return array2;
    }
}
