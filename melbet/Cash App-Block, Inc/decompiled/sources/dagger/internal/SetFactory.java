package dagger.internal;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;

/* loaded from: classes9.dex */
public final class SetFactory implements Factory {
    public static final /* synthetic */ int $r8$clinit = 0;
    public final List collectionProviders;
    public final List individualProviders;

    static {
        InstanceFactory.create(Collections.EMPTY_SET);
    }

    public SetFactory(List list, List list2) {
        this.individualProviders = list;
        this.collectionProviders = list2;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        List list = this.individualProviders;
        int size = list.size();
        List list2 = this.collectionProviders;
        ArrayList arrayList = new ArrayList(list2.size());
        int size2 = list2.size();
        for (int i = 0; i < size2; i++) {
            Collection collection = (Collection) ((Provider) list2.get(i)).get();
            size += collection.size();
            arrayList.add(collection);
        }
        HashSet hashSet = new HashSet(size < 3 ? size + 1 : size < 1073741824 ? (int) ((size / 0.75f) + 1.0f) : Integer.MAX_VALUE);
        int size3 = list.size();
        for (int i2 = 0; i2 < size3; i2++) {
            Object obj = ((Provider) list.get(i2)).get();
            obj.getClass();
            hashSet.add(obj);
        }
        int size4 = arrayList.size();
        for (int i3 = 0; i3 < size4; i3++) {
            for (Object obj2 : (Collection) arrayList.get(i3)) {
                obj2.getClass();
                hashSet.add(obj2);
            }
        }
        return Collections.unmodifiableSet(hashSet);
    }
}
