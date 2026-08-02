package org.intellij.markdown.lexer;

import androidx.collection.MutableObjectList;
import androidx.collection.ObjectListKt;
import androidx.collection.internal.RuntimeHelpersKt;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import kotlin.collections.ArraysKt___ArraysJvmKt;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.internal.ArrayIteratorKt;
import kotlin.jvm.internal.markers.KMutableList;

/* loaded from: classes4.dex */
public final class Stack implements List, KMutableList {
    public final Object $$delegate_0;
    public final /* synthetic */ int $r8$classId;

    public Stack() {
        this.$r8$classId = 0;
        this.$$delegate_0 = new ArrayList();
    }

    @Override // java.util.List
    public final void add(int i, Object obj) {
        int i2;
        int i3 = this.$r8$classId;
        Object obj2 = this.$$delegate_0;
        switch (i3) {
            case 0:
                ((ArrayList) obj2).add(i, obj);
                return;
            default:
                MutableObjectList mutableObjectList = (MutableObjectList) obj2;
                if (i < 0 || i > (i2 = mutableObjectList._size)) {
                    StringBuilder m2m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m2m(i, "Index ", " must be in 0..");
                    m2m.append(mutableObjectList._size);
                    RuntimeHelpersKt.throwIndexOutOfBoundsException(m2m.toString());
                    throw null;
                }
                int i4 = i2 + 1;
                Object[] objArr = mutableObjectList.content;
                if (objArr.length < i4) {
                    mutableObjectList.resizeStorage(i4, objArr);
                }
                Object[] objArr2 = mutableObjectList.content;
                int i5 = mutableObjectList._size;
                if (i != i5) {
                    ArraysKt___ArraysJvmKt.copyInto(i + 1, i, i5, objArr2, objArr2);
                }
                objArr2[i] = obj;
                mutableObjectList._size++;
                return;
        }
    }

    @Override // java.util.List
    public final boolean addAll(int i, Collection collection) {
        int i2 = this.$r8$classId;
        Object obj = this.$$delegate_0;
        switch (i2) {
            case 0:
                collection.getClass();
                return ((ArrayList) obj).addAll(i, collection);
            default:
                collection.getClass();
                MutableObjectList mutableObjectList = (MutableObjectList) obj;
                if (i < 0 || i > mutableObjectList._size) {
                    StringBuilder m2m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m2m(i, "Index ", " must be in 0..");
                    m2m.append(mutableObjectList._size);
                    RuntimeHelpersKt.throwIndexOutOfBoundsException(m2m.toString());
                    throw null;
                }
                int i3 = 0;
                if (collection.isEmpty()) {
                    return false;
                }
                int size = collection.size() + mutableObjectList._size;
                Object[] objArr = mutableObjectList.content;
                if (objArr.length < size) {
                    mutableObjectList.resizeStorage(size, objArr);
                }
                Object[] objArr2 = mutableObjectList.content;
                if (i != mutableObjectList._size) {
                    ArraysKt___ArraysJvmKt.copyInto(collection.size() + i, i, mutableObjectList._size, objArr2, objArr2);
                }
                for (Object obj2 : collection) {
                    int i4 = i3 + 1;
                    if (i3 < 0) {
                        CollectionsKt__CollectionsKt.throwIndexOverflow();
                        throw null;
                    }
                    objArr2[i3 + i] = obj2;
                    i3 = i4;
                }
                mutableObjectList._size = collection.size() + mutableObjectList._size;
                return true;
        }
    }

    @Override // java.util.List, java.util.Collection
    public final void clear() {
        int i = this.$r8$classId;
        Object obj = this.$$delegate_0;
        switch (i) {
            case 0:
                ((ArrayList) obj).clear();
                break;
            default:
                ((MutableObjectList) obj).clear();
                break;
        }
    }

    @Override // java.util.List, java.util.Collection
    public final boolean contains(Object obj) {
        int i = this.$r8$classId;
        Object obj2 = this.$$delegate_0;
        switch (i) {
            case 0:
                return ((ArrayList) obj2).contains(obj);
            default:
                return ((MutableObjectList) obj2).indexOf(obj) >= 0;
        }
    }

    @Override // java.util.List, java.util.Collection
    public final boolean containsAll(Collection collection) {
        int i = this.$r8$classId;
        Object obj = this.$$delegate_0;
        switch (i) {
            case 0:
                collection.getClass();
                return ((ArrayList) obj).containsAll(collection);
            default:
                collection.getClass();
                MutableObjectList mutableObjectList = (MutableObjectList) obj;
                Iterator it = collection.iterator();
                while (it.hasNext()) {
                    if (mutableObjectList.indexOf(it.next()) < 0) {
                        return false;
                    }
                }
                return true;
        }
    }

    @Override // java.util.List
    public final Object get(int i) {
        int i2 = this.$r8$classId;
        Object obj = this.$$delegate_0;
        switch (i2) {
            case 0:
                return ((ArrayList) obj).get(i);
            default:
                ObjectListKt.access$checkIndex(i, this);
                return ((MutableObjectList) obj).get(i);
        }
    }

    @Override // java.util.List
    public final int indexOf(Object obj) {
        int i = this.$r8$classId;
        Object obj2 = this.$$delegate_0;
        switch (i) {
            case 0:
                return ((ArrayList) obj2).indexOf(obj);
            default:
                return ((MutableObjectList) obj2).indexOf(obj);
        }
    }

    @Override // java.util.List, java.util.Collection
    public final boolean isEmpty() {
        int i = this.$r8$classId;
        Object obj = this.$$delegate_0;
        switch (i) {
            case 0:
                return ((ArrayList) obj).isEmpty();
            default:
                return ((MutableObjectList) obj).isEmpty();
        }
    }

    @Override // java.util.List, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        switch (this.$r8$classId) {
            case 0:
                Iterator it = ((ArrayList) this.$$delegate_0).iterator();
                it.getClass();
                return it;
            default:
                return new MutableObjectList.MutableObjectListIterator(this, 0);
        }
    }

    @Override // java.util.List
    public final int lastIndexOf(Object obj) {
        int i;
        int i2 = this.$r8$classId;
        Object obj2 = this.$$delegate_0;
        switch (i2) {
            case 0:
                return ((ArrayList) obj2).lastIndexOf(obj);
            default:
                MutableObjectList mutableObjectList = (MutableObjectList) obj2;
                Object[] objArr = mutableObjectList.content;
                int i3 = mutableObjectList._size;
                if (obj == null) {
                    i = i3 - 1;
                    while (-1 < i) {
                        if (objArr[i] != null) {
                            i--;
                        }
                    }
                    return -1;
                }
                i = i3 - 1;
                while (-1 < i) {
                    if (!obj.equals(objArr[i])) {
                        i--;
                    }
                }
                return -1;
                return i;
        }
    }

    @Override // java.util.List
    public final ListIterator listIterator() {
        switch (this.$r8$classId) {
            case 0:
                ListIterator listIterator = ((ArrayList) this.$$delegate_0).listIterator();
                listIterator.getClass();
                return listIterator;
            default:
                return new MutableObjectList.MutableObjectListIterator(this, 0);
        }
    }

    public Object pop() {
        Object last = CollectionsKt.last((List) this);
        remove(((ArrayList) this.$$delegate_0).size() - 1);
        return last;
    }

    @Override // java.util.List
    public final Object remove(int i) {
        int i2 = this.$r8$classId;
        Object obj = this.$$delegate_0;
        switch (i2) {
            case 0:
                return ((ArrayList) obj).remove(i);
            default:
                ObjectListKt.access$checkIndex(i, this);
                return ((MutableObjectList) obj).removeAt(i);
        }
    }

    @Override // java.util.List, java.util.Collection
    public final boolean removeAll(Collection collection) {
        int i = this.$r8$classId;
        Object obj = this.$$delegate_0;
        switch (i) {
            case 0:
                collection.getClass();
                return ((ArrayList) obj).removeAll(collection);
            default:
                collection.getClass();
                MutableObjectList mutableObjectList = (MutableObjectList) obj;
                int i2 = mutableObjectList._size;
                Iterator it = collection.iterator();
                while (it.hasNext()) {
                    mutableObjectList.remove(it.next());
                }
                return i2 != mutableObjectList._size;
        }
    }

    @Override // java.util.List, java.util.Collection
    public final boolean retainAll(Collection collection) {
        int i = this.$r8$classId;
        Object obj = this.$$delegate_0;
        switch (i) {
            case 0:
                collection.getClass();
                return ((ArrayList) obj).retainAll(collection);
            default:
                collection.getClass();
                MutableObjectList mutableObjectList = (MutableObjectList) obj;
                int i2 = mutableObjectList._size;
                Object[] objArr = mutableObjectList.content;
                for (int i3 = i2 - 1; -1 < i3; i3--) {
                    if (!collection.contains(objArr[i3])) {
                        mutableObjectList.removeAt(i3);
                    }
                }
                return i2 != mutableObjectList._size;
        }
    }

    @Override // java.util.List
    public final Object set(int i, Object obj) {
        int i2 = this.$r8$classId;
        Object obj2 = this.$$delegate_0;
        switch (i2) {
            case 0:
                return ((ArrayList) obj2).set(i, obj);
            default:
                ObjectListKt.access$checkIndex(i, this);
                return ((MutableObjectList) obj2).set(i, obj);
        }
    }

    @Override // java.util.List, java.util.Collection
    public final int size() {
        int i = this.$r8$classId;
        Object obj = this.$$delegate_0;
        switch (i) {
            case 0:
                return ((ArrayList) obj).size();
            default:
                return ((MutableObjectList) obj)._size;
        }
    }

    @Override // java.util.List
    public final List subList(int i, int i2) {
        switch (this.$r8$classId) {
            case 0:
                List subList = ((ArrayList) this.$$delegate_0).subList(i, i2);
                subList.getClass();
                return subList;
            default:
                ObjectListKt.access$checkSubIndex(i, i2, this);
                return new MutableObjectList.SubList(i, i2, 0, this);
        }
    }

    @Override // java.util.List, java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        switch (this.$r8$classId) {
            case 0:
                objArr.getClass();
                break;
            default:
                objArr.getClass();
                break;
        }
        return ArrayIteratorKt.toArray(this, objArr);
    }

    public Stack(MutableObjectList mutableObjectList) {
        this.$r8$classId = 1;
        this.$$delegate_0 = mutableObjectList;
    }

    @Override // java.util.List, java.util.Collection
    public final Object[] toArray() {
        switch (this.$r8$classId) {
        }
        return ArrayIteratorKt.toArray(this);
    }

    @Override // java.util.List
    public final ListIterator listIterator(int i) {
        switch (this.$r8$classId) {
            case 0:
                ListIterator listIterator = ((ArrayList) this.$$delegate_0).listIterator(i);
                listIterator.getClass();
                return listIterator;
            default:
                return new MutableObjectList.MutableObjectListIterator(this, i);
        }
    }

    @Override // java.util.List, java.util.Collection
    public final boolean remove(Object obj) {
        int i = this.$r8$classId;
        Object obj2 = this.$$delegate_0;
        switch (i) {
            case 0:
                return ((ArrayList) obj2).remove(obj);
            default:
                return ((MutableObjectList) obj2).remove(obj);
        }
    }

    @Override // java.util.List, java.util.Collection
    public final boolean add(Object obj) {
        int i = this.$r8$classId;
        Object obj2 = this.$$delegate_0;
        switch (i) {
            case 0:
                return ((ArrayList) obj2).add(obj);
            default:
                ((MutableObjectList) obj2).add(obj);
                return true;
        }
    }

    @Override // java.util.List, java.util.Collection
    public final boolean addAll(Collection collection) {
        int i = this.$r8$classId;
        Object obj = this.$$delegate_0;
        switch (i) {
            case 0:
                collection.getClass();
                return ((ArrayList) obj).addAll(collection);
            default:
                collection.getClass();
                MutableObjectList mutableObjectList = (MutableObjectList) obj;
                int i2 = mutableObjectList._size;
                Iterator it = collection.iterator();
                while (it.hasNext()) {
                    mutableObjectList.add(it.next());
                }
                return i2 != mutableObjectList._size;
        }
    }
}
