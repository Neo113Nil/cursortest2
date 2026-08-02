package kotlin.collections.builders;

import androidx.collection.MutableObjectList;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.node.HitTestResult;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.google.firebase.components.OptionalProvider$$ExternalSyntheticLambda0;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import java.io.Serializable;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;
import kotlin.collections.AbstractList;
import kotlin.collections.AbstractMutableList;
import kotlin.collections.ArraysKt___ArraysJvmKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.markers.KMappedMarker;
import kotlin.time.DurationKt;

/* loaded from: classes.dex */
public final class ListBuilder extends AbstractMutableList implements List, RandomAccess, Serializable {
    private static final Companion Companion = new Companion(null);
    public static final ListBuilder Empty;
    public Object[] backing;
    public boolean isReadOnly;
    public int length;

    public final class Companion {
        public Companion(DefaultConstructorMarker defaultConstructorMarker) {
        }
    }

    static {
        ListBuilder listBuilder = new ListBuilder(0);
        listBuilder.isReadOnly = true;
        Empty = listBuilder;
    }

    public ListBuilder(int i) {
        if (i >= 0) {
            this.backing = new Object[i];
        } else {
            a$$ExternalSyntheticBUOutline0.m$3("capacity must be non-negative.");
            throw null;
        }
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i, Object obj) {
        checkIsMutable$1();
        AbstractList.Companion companion = AbstractList.Companion;
        int i2 = this.length;
        companion.getClass();
        AbstractList.Companion.checkPositionIndex$kotlin_stdlib(i, i2);
        ((java.util.AbstractList) this).modCount++;
        insertAtInternal(i, 1);
        this.backing[i] = obj;
    }

    @Override // java.util.AbstractList, java.util.List
    public final boolean addAll(int i, Collection collection) {
        collection.getClass();
        checkIsMutable$1();
        AbstractList.Companion companion = AbstractList.Companion;
        int i2 = this.length;
        companion.getClass();
        AbstractList.Companion.checkPositionIndex$kotlin_stdlib(i, i2);
        int size = collection.size();
        addAllInternal$1(i, collection, size);
        return size > 0;
    }

    public final void addAllInternal$1(int i, Collection collection, int i2) {
        ((java.util.AbstractList) this).modCount++;
        insertAtInternal(i, i2);
        Iterator it = collection.iterator();
        for (int i3 = 0; i3 < i2; i3++) {
            this.backing[i + i3] = it.next();
        }
    }

    public final void addAtInternal$1(int i, Object obj) {
        ((java.util.AbstractList) this).modCount++;
        insertAtInternal(i, 1);
        this.backing[i] = obj;
    }

    public final void checkIsMutable$1() {
        if (this.isReadOnly) {
            OptionalProvider$$ExternalSyntheticLambda0.m();
        }
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        checkIsMutable$1();
        removeRangeInternal$1(0, this.length);
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof List) {
            List list = (List) obj;
            Object[] objArr = this.backing;
            int i = this.length;
            if (i == list.size()) {
                for (int i2 = 0; i2 < i; i2++) {
                    if (Intrinsics.areEqual(objArr[i2], list.get(i2))) {
                    }
                }
                return true;
            }
        }
        return false;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i) {
        AbstractList.Companion companion = AbstractList.Companion;
        int i2 = this.length;
        companion.getClass();
        AbstractList.Companion.checkElementIndex$kotlin_stdlib(i, i2);
        return this.backing[i];
    }

    @Override // kotlin.collections.AbstractMutableList
    public final int getSize() {
        return this.length;
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        Object[] objArr = this.backing;
        int i = this.length;
        int i2 = 1;
        for (int i3 = 0; i3 < i; i3++) {
            Object obj = objArr[i3];
            i2 = (i2 * 31) + (obj != null ? obj.hashCode() : 0);
        }
        return i2;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        for (int i = 0; i < this.length; i++) {
            if (Intrinsics.areEqual(this.backing[i], obj)) {
                return i;
            }
        }
        return -1;
    }

    public final void insertAtInternal(int i, int i2) {
        int i3 = this.length + i2;
        if (i3 < 0) {
            throw new OutOfMemoryError();
        }
        Object[] objArr = this.backing;
        if (i3 > objArr.length) {
            AbstractList.Companion companion = AbstractList.Companion;
            int length = objArr.length;
            companion.getClass();
            int newCapacity$kotlin_stdlib = AbstractList.Companion.newCapacity$kotlin_stdlib(length, i3);
            Object[] objArr2 = this.backing;
            objArr2.getClass();
            this.backing = Arrays.copyOf(objArr2, newCapacity$kotlin_stdlib);
        }
        Object[] objArr3 = this.backing;
        ArraysKt___ArraysJvmKt.copyInto(i + i2, i, this.length, objArr3, objArr3);
        this.length += i2;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean isEmpty() {
        return this.length == 0;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator iterator() {
        return listIterator(0);
    }

    @Override // java.util.AbstractList, java.util.List
    public final int lastIndexOf(Object obj) {
        for (int i = this.length - 1; i >= 0; i--) {
            if (Intrinsics.areEqual(this.backing[i], obj)) {
                return i;
            }
        }
        return -1;
    }

    @Override // java.util.AbstractList, java.util.List
    public final ListIterator listIterator(int i) {
        AbstractList.Companion companion = AbstractList.Companion;
        int i2 = this.length;
        companion.getClass();
        AbstractList.Companion.checkPositionIndex$kotlin_stdlib(i, i2);
        return new Itr(this, i);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean remove(Object obj) {
        checkIsMutable$1();
        int indexOf = indexOf(obj);
        if (indexOf >= 0) {
            removeAt(indexOf);
        }
        return indexOf >= 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean removeAll(Collection collection) {
        collection.getClass();
        checkIsMutable$1();
        return retainOrRemoveAllInternal$1(0, this.length, collection, false) > 0;
    }

    @Override // kotlin.collections.AbstractMutableList
    public final Object removeAt(int i) {
        checkIsMutable$1();
        AbstractList.Companion companion = AbstractList.Companion;
        int i2 = this.length;
        companion.getClass();
        AbstractList.Companion.checkElementIndex$kotlin_stdlib(i, i2);
        return removeAtInternal$1(i);
    }

    public final Object removeAtInternal$1(int i) {
        ((java.util.AbstractList) this).modCount++;
        Object[] objArr = this.backing;
        Object obj = objArr[i];
        ArraysKt___ArraysJvmKt.copyInto(i, i + 1, this.length, objArr, objArr);
        Object[] objArr2 = this.backing;
        int i2 = this.length - 1;
        objArr2.getClass();
        objArr2[i2] = null;
        this.length--;
        return obj;
    }

    public final void removeRangeInternal$1(int i, int i2) {
        if (i2 > 0) {
            ((java.util.AbstractList) this).modCount++;
        }
        Object[] objArr = this.backing;
        ArraysKt___ArraysJvmKt.copyInto(i, i + i2, this.length, objArr, objArr);
        Object[] objArr2 = this.backing;
        int i3 = this.length;
        DurationKt.resetRange(i3 - i2, i3, objArr2);
        this.length -= i2;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean retainAll(Collection collection) {
        collection.getClass();
        checkIsMutable$1();
        return retainOrRemoveAllInternal$1(0, this.length, collection, true) > 0;
    }

    public final int retainOrRemoveAllInternal$1(int i, int i2, Collection collection, boolean z) {
        Object[] objArr;
        int i3 = 0;
        int i4 = 0;
        while (true) {
            objArr = this.backing;
            if (i3 >= i2) {
                break;
            }
            int i5 = i + i3;
            if (collection.contains(objArr[i5]) == z) {
                Object[] objArr2 = this.backing;
                i3++;
                objArr2[i4 + i] = objArr2[i5];
                i4++;
            } else {
                i3++;
            }
        }
        int i6 = i2 - i4;
        ArraysKt___ArraysJvmKt.copyInto(i + i4, i2 + i, this.length, objArr, objArr);
        Object[] objArr3 = this.backing;
        int i7 = this.length;
        DurationKt.resetRange(i7 - i6, i7, objArr3);
        if (i6 > 0) {
            ((java.util.AbstractList) this).modCount++;
        }
        this.length -= i6;
        return i6;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i, Object obj) {
        checkIsMutable$1();
        AbstractList.Companion companion = AbstractList.Companion;
        int i2 = this.length;
        companion.getClass();
        AbstractList.Companion.checkElementIndex$kotlin_stdlib(i, i2);
        Object[] objArr = this.backing;
        Object obj2 = objArr[i];
        objArr[i] = obj;
        return obj2;
    }

    @Override // java.util.AbstractList, java.util.List
    public final List subList(int i, int i2) {
        AbstractList.Companion companion = AbstractList.Companion;
        int i3 = this.length;
        companion.getClass();
        AbstractList.Companion.checkRangeIndexes$kotlin_stdlib(i, i2, i3);
        return new BuilderSubList(this.backing, i, i2 - i, null, this);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final Object[] toArray(Object[] objArr) {
        objArr.getClass();
        int length = objArr.length;
        int i = this.length;
        Object[] objArr2 = this.backing;
        if (length < i) {
            Object[] copyOfRange = Arrays.copyOfRange(objArr2, 0, i, objArr.getClass());
            copyOfRange.getClass();
            return copyOfRange;
        }
        ArraysKt___ArraysJvmKt.copyInto(0, 0, i, objArr2, objArr);
        int i2 = this.length;
        if (i2 < objArr.length) {
            objArr[i2] = null;
        }
        return objArr;
    }

    @Override // java.util.AbstractCollection
    public final String toString() {
        return DurationKt.access$subarrayContentToString(this.backing, 0, this.length, this);
    }

    @Override // java.util.AbstractList, java.util.List
    public final ListIterator listIterator() {
        return listIterator(0);
    }

    public /* synthetic */ ListBuilder(int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? 10 : i);
    }

    /* loaded from: classes9.dex */
    public final class BuilderSubList extends AbstractMutableList implements RandomAccess, Serializable {
        public Object[] backing;
        public int length;
        public final int offset;
        public final BuilderSubList parent;
        public final ListBuilder root;

        public BuilderSubList(Object[] objArr, int i, int i2, BuilderSubList builderSubList, ListBuilder listBuilder) {
            objArr.getClass();
            listBuilder.getClass();
            this.backing = objArr;
            this.offset = i;
            this.length = i2;
            this.parent = builderSubList;
            this.root = listBuilder;
            ((java.util.AbstractList) this).modCount = ((java.util.AbstractList) listBuilder).modCount;
        }

        @Override // java.util.AbstractList, java.util.List
        public final void add(int i, Object obj) {
            checkIsMutable();
            checkForComodification$5();
            AbstractList.Companion companion = AbstractList.Companion;
            int i2 = this.length;
            companion.getClass();
            AbstractList.Companion.checkPositionIndex$kotlin_stdlib(i, i2);
            addAtInternal(this.offset + i, obj);
        }

        @Override // java.util.AbstractList, java.util.List
        public final boolean addAll(int i, Collection collection) {
            collection.getClass();
            checkIsMutable();
            checkForComodification$5();
            AbstractList.Companion companion = AbstractList.Companion;
            int i2 = this.length;
            companion.getClass();
            AbstractList.Companion.checkPositionIndex$kotlin_stdlib(i, i2);
            int size = collection.size();
            addAllInternal(this.offset + i, collection, size);
            return size > 0;
        }

        public final void addAllInternal(int i, Collection collection, int i2) {
            ((java.util.AbstractList) this).modCount++;
            ListBuilder listBuilder = this.root;
            BuilderSubList builderSubList = this.parent;
            if (builderSubList != null) {
                builderSubList.addAllInternal(i, collection, i2);
            } else {
                ListBuilder listBuilder2 = ListBuilder.Empty;
                listBuilder.addAllInternal$1(i, collection, i2);
            }
            this.backing = listBuilder.backing;
            this.length += i2;
        }

        public final void addAtInternal(int i, Object obj) {
            ((java.util.AbstractList) this).modCount++;
            ListBuilder listBuilder = this.root;
            BuilderSubList builderSubList = this.parent;
            if (builderSubList != null) {
                builderSubList.addAtInternal(i, obj);
            } else {
                ListBuilder listBuilder2 = ListBuilder.Empty;
                listBuilder.addAtInternal$1(i, obj);
            }
            this.backing = listBuilder.backing;
            this.length++;
        }

        public final void checkForComodification$5() {
            if (((java.util.AbstractList) this.root).modCount == ((java.util.AbstractList) this).modCount) {
                return;
            }
            Drop$$ExternalSyntheticBUOutline0.m$1();
        }

        public final void checkIsMutable() {
            if (this.root.isReadOnly) {
                OptionalProvider$$ExternalSyntheticLambda0.m();
            }
        }

        @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
        public final void clear() {
            checkIsMutable();
            checkForComodification$5();
            removeRangeInternal(this.offset, this.length);
        }

        @Override // java.util.AbstractList, java.util.Collection, java.util.List
        public final boolean equals(Object obj) {
            checkForComodification$5();
            if (obj == this) {
                return true;
            }
            if (obj instanceof List) {
                List list = (List) obj;
                Object[] objArr = this.backing;
                int i = this.length;
                if (i == list.size()) {
                    for (int i2 = 0; i2 < i; i2++) {
                        if (Intrinsics.areEqual(objArr[this.offset + i2], list.get(i2))) {
                        }
                    }
                    return true;
                }
            }
            return false;
        }

        @Override // java.util.AbstractList, java.util.List
        public final Object get(int i) {
            checkForComodification$5();
            AbstractList.Companion companion = AbstractList.Companion;
            int i2 = this.length;
            companion.getClass();
            AbstractList.Companion.checkElementIndex$kotlin_stdlib(i, i2);
            return this.backing[this.offset + i];
        }

        @Override // kotlin.collections.AbstractMutableList
        public final int getSize() {
            checkForComodification$5();
            return this.length;
        }

        @Override // java.util.AbstractList, java.util.Collection, java.util.List
        public final int hashCode() {
            checkForComodification$5();
            Object[] objArr = this.backing;
            int i = this.length;
            int i2 = 1;
            for (int i3 = 0; i3 < i; i3++) {
                Object obj = objArr[this.offset + i3];
                i2 = (i2 * 31) + (obj != null ? obj.hashCode() : 0);
            }
            return i2;
        }

        @Override // java.util.AbstractList, java.util.List
        public final int indexOf(Object obj) {
            checkForComodification$5();
            for (int i = 0; i < this.length; i++) {
                if (Intrinsics.areEqual(this.backing[this.offset + i], obj)) {
                    return i;
                }
            }
            return -1;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public final boolean isEmpty() {
            checkForComodification$5();
            return this.length == 0;
        }

        @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
        public final Iterator iterator() {
            return listIterator(0);
        }

        @Override // java.util.AbstractList, java.util.List
        public final int lastIndexOf(Object obj) {
            checkForComodification$5();
            for (int i = this.length - 1; i >= 0; i--) {
                if (Intrinsics.areEqual(this.backing[this.offset + i], obj)) {
                    return i;
                }
            }
            return -1;
        }

        @Override // java.util.AbstractList, java.util.List
        public final ListIterator listIterator(int i) {
            checkForComodification$5();
            AbstractList.Companion companion = AbstractList.Companion;
            int i2 = this.length;
            companion.getClass();
            AbstractList.Companion.checkPositionIndex$kotlin_stdlib(i, i2);
            return new Itr(this, i);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public final boolean remove(Object obj) {
            checkIsMutable();
            checkForComodification$5();
            int indexOf = indexOf(obj);
            if (indexOf >= 0) {
                removeAt(indexOf);
            }
            return indexOf >= 0;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public final boolean removeAll(Collection collection) {
            collection.getClass();
            checkIsMutable();
            checkForComodification$5();
            return retainOrRemoveAllInternal(this.offset, this.length, collection, false) > 0;
        }

        @Override // kotlin.collections.AbstractMutableList
        public final Object removeAt(int i) {
            checkIsMutable();
            checkForComodification$5();
            AbstractList.Companion companion = AbstractList.Companion;
            int i2 = this.length;
            companion.getClass();
            AbstractList.Companion.checkElementIndex$kotlin_stdlib(i, i2);
            return removeAtInternal(this.offset + i);
        }

        public final Object removeAtInternal(int i) {
            Object removeAtInternal$1;
            ((java.util.AbstractList) this).modCount++;
            BuilderSubList builderSubList = this.parent;
            if (builderSubList != null) {
                removeAtInternal$1 = builderSubList.removeAtInternal(i);
            } else {
                ListBuilder listBuilder = ListBuilder.Empty;
                removeAtInternal$1 = this.root.removeAtInternal$1(i);
            }
            this.length--;
            return removeAtInternal$1;
        }

        public final void removeRangeInternal(int i, int i2) {
            if (i2 > 0) {
                ((java.util.AbstractList) this).modCount++;
            }
            BuilderSubList builderSubList = this.parent;
            if (builderSubList != null) {
                builderSubList.removeRangeInternal(i, i2);
            } else {
                ListBuilder listBuilder = ListBuilder.Empty;
                this.root.removeRangeInternal$1(i, i2);
            }
            this.length -= i2;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public final boolean retainAll(Collection collection) {
            collection.getClass();
            checkIsMutable();
            checkForComodification$5();
            return retainOrRemoveAllInternal(this.offset, this.length, collection, true) > 0;
        }

        public final int retainOrRemoveAllInternal(int i, int i2, Collection collection, boolean z) {
            int retainOrRemoveAllInternal$1;
            BuilderSubList builderSubList = this.parent;
            if (builderSubList != null) {
                retainOrRemoveAllInternal$1 = builderSubList.retainOrRemoveAllInternal(i, i2, collection, z);
            } else {
                ListBuilder listBuilder = ListBuilder.Empty;
                retainOrRemoveAllInternal$1 = this.root.retainOrRemoveAllInternal$1(i, i2, collection, z);
            }
            if (retainOrRemoveAllInternal$1 > 0) {
                ((java.util.AbstractList) this).modCount++;
            }
            this.length -= retainOrRemoveAllInternal$1;
            return retainOrRemoveAllInternal$1;
        }

        @Override // java.util.AbstractList, java.util.List
        public final Object set(int i, Object obj) {
            checkIsMutable();
            checkForComodification$5();
            AbstractList.Companion companion = AbstractList.Companion;
            int i2 = this.length;
            companion.getClass();
            AbstractList.Companion.checkElementIndex$kotlin_stdlib(i, i2);
            Object[] objArr = this.backing;
            int i3 = this.offset + i;
            Object obj2 = objArr[i3];
            objArr[i3] = obj;
            return obj2;
        }

        @Override // java.util.AbstractList, java.util.List
        public final List subList(int i, int i2) {
            AbstractList.Companion companion = AbstractList.Companion;
            int i3 = this.length;
            companion.getClass();
            AbstractList.Companion.checkRangeIndexes$kotlin_stdlib(i, i2, i3);
            return new BuilderSubList(this.backing, this.offset + i, i2 - i, this, this.root);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public final Object[] toArray(Object[] objArr) {
            objArr.getClass();
            checkForComodification$5();
            int length = objArr.length;
            int i = this.length;
            Object[] objArr2 = this.backing;
            int i2 = this.offset;
            if (length < i) {
                Object[] copyOfRange = Arrays.copyOfRange(objArr2, i2, i + i2, objArr.getClass());
                copyOfRange.getClass();
                return copyOfRange;
            }
            ArraysKt___ArraysJvmKt.copyInto(0, i2, i + i2, objArr2, objArr);
            int i3 = this.length;
            if (i3 < objArr.length) {
                objArr[i3] = null;
            }
            return objArr;
        }

        @Override // java.util.AbstractCollection
        public final String toString() {
            checkForComodification$5();
            return DurationKt.access$subarrayContentToString(this.backing, this.offset, this.length, this);
        }

        @Override // java.util.AbstractList, java.util.List
        public final ListIterator listIterator() {
            return listIterator(0);
        }

        @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
        public final boolean add(Object obj) {
            checkIsMutable();
            checkForComodification$5();
            addAtInternal(this.offset + this.length, obj);
            return true;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public final boolean addAll(Collection collection) {
            collection.getClass();
            checkIsMutable();
            checkForComodification$5();
            int size = collection.size();
            addAllInternal(this.offset + this.length, collection, size);
            return size > 0;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public final Object[] toArray() {
            checkForComodification$5();
            Object[] objArr = this.backing;
            int i = this.length;
            int i2 = this.offset;
            return ArraysKt___ArraysJvmKt.copyOfRange(i2, i + i2, objArr);
        }
    }

    public ListBuilder() {
        this(0, 1, null);
    }

    /* loaded from: classes9.dex */
    public final class Itr implements ListIterator, KMappedMarker {
        public final /* synthetic */ int $r8$classId;
        public int expectedModCount;
        public int index;
        public int lastIndex;
        public final Object list;

        public Itr(ListBuilder listBuilder, int i) {
            this.$r8$classId = 0;
            this.list = listBuilder;
            this.index = i;
            this.lastIndex = -1;
            this.expectedModCount = ((java.util.AbstractList) listBuilder).modCount;
        }

        @Override // java.util.ListIterator
        public final void add(Object obj) {
            int i = this.$r8$classId;
            Object obj2 = this.list;
            switch (i) {
                case 0:
                    checkForComodification$4();
                    ListBuilder listBuilder = (ListBuilder) obj2;
                    int i2 = this.index;
                    this.index = i2 + 1;
                    listBuilder.add(i2, obj);
                    this.lastIndex = -1;
                    this.expectedModCount = ((java.util.AbstractList) listBuilder).modCount;
                    return;
                case 1:
                    throw new UnsupportedOperationException("Operation is not supported for read-only collection");
                default:
                    checkForComodification$3();
                    BuilderSubList builderSubList = (BuilderSubList) obj2;
                    int i3 = this.index;
                    this.index = i3 + 1;
                    builderSubList.add(i3, obj);
                    this.lastIndex = -1;
                    this.expectedModCount = ((java.util.AbstractList) builderSubList).modCount;
                    return;
            }
        }

        public void checkForComodification$3() {
            if (((java.util.AbstractList) ((BuilderSubList) this.list).root).modCount == this.expectedModCount) {
                return;
            }
            Drop$$ExternalSyntheticBUOutline0.m$1();
        }

        public void checkForComodification$4() {
            if (((java.util.AbstractList) ((ListBuilder) this.list)).modCount == this.expectedModCount) {
                return;
            }
            Drop$$ExternalSyntheticBUOutline0.m$1();
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public final boolean hasNext() {
            int i = this.$r8$classId;
            Object obj = this.list;
            switch (i) {
                case 0:
                    if (this.index < ((ListBuilder) obj).length) {
                        break;
                    }
                    break;
                case 1:
                    if (this.index < this.expectedModCount) {
                        break;
                    }
                    break;
                default:
                    if (this.index < ((BuilderSubList) obj).length) {
                        break;
                    }
                    break;
            }
            return true;
        }

        @Override // java.util.ListIterator
        public final boolean hasPrevious() {
            switch (this.$r8$classId) {
                case 0:
                    if (this.index > 0) {
                    }
                    break;
                case 1:
                    if (this.index > this.lastIndex) {
                    }
                    break;
                default:
                    if (this.index > 0) {
                    }
                    break;
            }
            return false;
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public final Object next() {
            int i = this.$r8$classId;
            Object obj = this.list;
            switch (i) {
                case 0:
                    checkForComodification$4();
                    int i2 = this.index;
                    ListBuilder listBuilder = (ListBuilder) obj;
                    if (i2 >= listBuilder.length) {
                        a$$ExternalSyntheticBUOutline0.m();
                        return null;
                    }
                    this.index = i2 + 1;
                    this.lastIndex = i2;
                    return listBuilder.backing[i2];
                case 1:
                    MutableObjectList mutableObjectList = ((HitTestResult) obj).values;
                    int i3 = this.index;
                    this.index = i3 + 1;
                    Object obj2 = mutableObjectList.get(i3);
                    obj2.getClass();
                    return (Modifier.Node) obj2;
                default:
                    checkForComodification$3();
                    int i4 = this.index;
                    BuilderSubList builderSubList = (BuilderSubList) obj;
                    if (i4 >= builderSubList.length) {
                        a$$ExternalSyntheticBUOutline0.m();
                        return null;
                    }
                    this.index = i4 + 1;
                    this.lastIndex = i4;
                    return builderSubList.backing[builderSubList.offset + i4];
            }
        }

        @Override // java.util.ListIterator
        public final int nextIndex() {
            switch (this.$r8$classId) {
                case 0:
                    return this.index;
                case 1:
                    return this.index - this.lastIndex;
                default:
                    return this.index;
            }
        }

        @Override // java.util.ListIterator
        public final Object previous() {
            int i = this.$r8$classId;
            Object obj = this.list;
            switch (i) {
                case 0:
                    checkForComodification$4();
                    int i2 = this.index;
                    if (i2 <= 0) {
                        a$$ExternalSyntheticBUOutline0.m();
                        return null;
                    }
                    int i3 = i2 - 1;
                    this.index = i3;
                    this.lastIndex = i3;
                    return ((ListBuilder) obj).backing[i3];
                case 1:
                    MutableObjectList mutableObjectList = ((HitTestResult) obj).values;
                    int i4 = this.index - 1;
                    this.index = i4;
                    Object obj2 = mutableObjectList.get(i4);
                    obj2.getClass();
                    return (Modifier.Node) obj2;
                default:
                    checkForComodification$3();
                    int i5 = this.index;
                    if (i5 <= 0) {
                        a$$ExternalSyntheticBUOutline0.m();
                        return null;
                    }
                    int i6 = i5 - 1;
                    this.index = i6;
                    this.lastIndex = i6;
                    BuilderSubList builderSubList = (BuilderSubList) obj;
                    return builderSubList.backing[builderSubList.offset + i6];
            }
        }

        @Override // java.util.ListIterator
        public final int previousIndex() {
            int i;
            switch (this.$r8$classId) {
                case 0:
                    i = this.index;
                    break;
                case 1:
                    return (this.index - this.lastIndex) - 1;
                default:
                    i = this.index;
                    break;
            }
            return i - 1;
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public final void remove() {
            int i = this.$r8$classId;
            Object obj = this.list;
            switch (i) {
                case 0:
                    ListBuilder listBuilder = (ListBuilder) obj;
                    checkForComodification$4();
                    int i2 = this.lastIndex;
                    if (i2 == -1) {
                        a$$ExternalSyntheticBUOutline0.m$1("Call next() or previous() before removing element from the iterator.");
                        return;
                    }
                    listBuilder.removeAt(i2);
                    this.index = this.lastIndex;
                    this.lastIndex = -1;
                    this.expectedModCount = ((java.util.AbstractList) listBuilder).modCount;
                    return;
                case 1:
                    throw new UnsupportedOperationException("Operation is not supported for read-only collection");
                default:
                    BuilderSubList builderSubList = (BuilderSubList) obj;
                    checkForComodification$3();
                    int i3 = this.lastIndex;
                    if (i3 == -1) {
                        a$$ExternalSyntheticBUOutline0.m$1("Call next() or previous() before removing element from the iterator.");
                        return;
                    }
                    builderSubList.removeAt(i3);
                    this.index = this.lastIndex;
                    this.lastIndex = -1;
                    this.expectedModCount = ((java.util.AbstractList) builderSubList).modCount;
                    return;
            }
        }

        @Override // java.util.ListIterator
        public final void set(Object obj) {
            int i = this.$r8$classId;
            Object obj2 = this.list;
            switch (i) {
                case 0:
                    checkForComodification$4();
                    int i2 = this.lastIndex;
                    if (i2 != -1) {
                        ((ListBuilder) obj2).set(i2, obj);
                        return;
                    } else {
                        a$$ExternalSyntheticBUOutline0.m$1("Call next() or previous() before replacing element from the iterator.");
                        return;
                    }
                case 1:
                    throw new UnsupportedOperationException("Operation is not supported for read-only collection");
                default:
                    checkForComodification$3();
                    int i3 = this.lastIndex;
                    if (i3 != -1) {
                        ((BuilderSubList) obj2).set(i3, obj);
                        return;
                    } else {
                        a$$ExternalSyntheticBUOutline0.m$1("Call next() or previous() before replacing element from the iterator.");
                        return;
                    }
            }
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public Itr(HitTestResult hitTestResult, int i, int i2) {
            this(hitTestResult, (i2 & 1) != 0 ? 0 : i, 0, hitTestResult.values._size);
            this.$r8$classId = 1;
        }

        public Itr(HitTestResult hitTestResult, int i, int i2, int i3) {
            this.$r8$classId = 1;
            this.list = hitTestResult;
            this.index = i;
            this.lastIndex = i2;
            this.expectedModCount = i3;
        }

        public Itr(BuilderSubList builderSubList, int i) {
            this.$r8$classId = 2;
            this.list = builderSubList;
            this.index = i;
            this.lastIndex = -1;
            this.expectedModCount = ((java.util.AbstractList) builderSubList).modCount;
        }
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        checkIsMutable$1();
        int i = this.length;
        ((java.util.AbstractList) this).modCount++;
        insertAtInternal(i, 1);
        this.backing[i] = obj;
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        collection.getClass();
        checkIsMutable$1();
        int size = collection.size();
        addAllInternal$1(this.length, collection, size);
        return size > 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final Object[] toArray() {
        return ArraysKt___ArraysJvmKt.copyOfRange(0, this.length, this.backing);
    }
}
