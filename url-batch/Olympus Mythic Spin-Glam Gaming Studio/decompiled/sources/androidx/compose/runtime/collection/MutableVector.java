package androidx.compose.runtime.collection;

import androidx.compose.runtime.internal.StabilityInferred;
import com.safedk.android.analytics.brandsafety.m;
import com.yandex.div.core.ScrollDirection;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.NoSuchElementException;
import java.util.RandomAccess;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.CollectionToArray;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.markers.KMappedMarker;
import kotlin.jvm.internal.markers.KMutableList;

/* compiled from: MutableVector.kt */
@StabilityInferred
@Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0004\n\u0002\u0010\u001e\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\b\u000b\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0001\n\u0002\b\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000f\b\u0007\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00060\u0002j\u0002`\u0003:\u0003MNOB!\b\u0001\u0012\u000e\u0010\u0005\u001a\n\u0012\u0006\u0012\u0004\u0018\u00018\u00000\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\n\u001a\n\u0012\u0006\u0012\u0004\u0018\u00018\u00000\u0004H\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0015\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00028\u0000¢\u0006\u0004\b\u000e\u0010\u000fJ\u001d\u0010\u000e\u001a\u00020\u00112\u0006\u0010\u0010\u001a\u00020\u00062\u0006\u0010\f\u001a\u00028\u0000¢\u0006\u0004\b\u000e\u0010\u0012J#\u0010\u0015\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u00062\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00028\u00000\u0013¢\u0006\u0004\b\u0015\u0010\u0016J#\u0010\u0015\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u00062\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00028\u00000\u0000¢\u0006\u0004\b\u0015\u0010\u0017J#\u0010\u0015\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u00062\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00028\u00000\u0018¢\u0006\u0004\b\u0015\u0010\u0019J\u001b\u0010\u0015\u001a\u00020\r2\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00028\u00000\u0018¢\u0006\u0004\b\u0015\u0010\u001aJ\u0013\u0010\u001c\u001a\b\u0012\u0004\u0012\u00028\u00000\u001b¢\u0006\u0004\b\u001c\u0010\u001dJ\r\u0010\u001e\u001a\u00020\u0011¢\u0006\u0004\b\u001e\u0010\u001fJ\u0018\u0010 \u001a\u00020\r2\u0006\u0010\f\u001a\u00028\u0000H\u0086\u0002¢\u0006\u0004\b \u0010\u000fJ\u001b\u0010!\u001a\u00020\r2\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00028\u00000\u0018¢\u0006\u0004\b!\u0010\u001aJ\u0017\u0010#\u001a\u00020\u00112\u0006\u0010\"\u001a\u00020\u0006H\u0001¢\u0006\u0004\b#\u0010$J\r\u0010%\u001a\u00028\u0000¢\u0006\u0004\b%\u0010&J\u0017\u0010*\u001a\u00020)2\u0006\u0010(\u001a\u00020'H\u0001¢\u0006\u0004\b*\u0010+J\u0015\u0010,\u001a\u00020\u00062\u0006\u0010\f\u001a\u00028\u0000¢\u0006\u0004\b,\u0010-J\u0010\u0010.\u001a\u00020\rH\u0086\b¢\u0006\u0004\b.\u0010/J\u0010\u00100\u001a\u00020\rH\u0086\b¢\u0006\u0004\b0\u0010/J\u0015\u00101\u001a\u00020\u00062\u0006\u0010\f\u001a\u00028\u0000¢\u0006\u0004\b1\u0010-J\u0015\u00102\u001a\u00020\r2\u0006\u0010\f\u001a\u00028\u0000¢\u0006\u0004\b2\u0010\u000fJ\u001b\u00103\u001a\u00020\r2\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00028\u00000\u0000¢\u0006\u0004\b3\u00104J\u001b\u00103\u001a\u00020\r2\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00028\u00000\u0018¢\u0006\u0004\b3\u0010\u001aJ\u0015\u00105\u001a\u00028\u00002\u0006\u0010\u0010\u001a\u00020\u0006¢\u0006\u0004\b5\u00106J\u001d\u00109\u001a\u00020\u00112\u0006\u00107\u001a\u00020\u00062\u0006\u00108\u001a\u00020\u0006¢\u0006\u0004\b9\u0010:J\u0017\u0010<\u001a\u00020\u00112\u0006\u0010;\u001a\u00020\u0006H\u0001¢\u0006\u0004\b<\u0010$J\u001b\u0010=\u001a\u00020\r2\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00028\u00000\u0018¢\u0006\u0004\b=\u0010\u001aJ \u0010>\u001a\u00028\u00002\u0006\u0010\u0010\u001a\u00020\u00062\u0006\u0010\f\u001a\u00028\u0000H\u0086\u0002¢\u0006\u0004\b>\u0010?J%\u0010C\u001a\u00020\u00112\u0016\u0010B\u001a\u0012\u0012\u0004\u0012\u00028\u00000@j\b\u0012\u0004\u0012\u00028\u0000`A¢\u0006\u0004\bC\u0010DR$\u0010\u0005\u001a\n\u0012\u0006\u0012\u0004\u0018\u00018\u00000\u00048\u0000@\u0000X\u0081\u000e¢\u0006\f\n\u0004\b\u0005\u0010E\u0012\u0004\bF\u0010\u001fR\u001e\u0010G\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u001b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bG\u0010HR$\u0010\u0007\u001a\u00020\u00062\u0006\u0010I\u001a\u00020\u00068\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b\u0007\u0010J\u001a\u0004\bK\u0010L¨\u0006P"}, d2 = {"Landroidx/compose/runtime/collection/MutableVector;", "T", "Ljava/util/RandomAccess;", "Lkotlin/collections/RandomAccess;", "", "content", "", "size", "<init>", "([Ljava/lang/Object;I)V", "getContent", "()[Ljava/lang/Object;", "element", "", m.l, "(Ljava/lang/Object;)Z", "index", "", "(ILjava/lang/Object;)V", "", "elements", "addAll", "(ILjava/util/List;)Z", "(ILandroidx/compose/runtime/collection/MutableVector;)Z", "", "(ILjava/util/Collection;)Z", "(Ljava/util/Collection;)Z", "", "asMutableList", "()Ljava/util/List;", "clear", "()V", "contains", "containsAll", "capacity", "resizeStorage", "(I)V", "first", "()Ljava/lang/Object;", "", "message", "", "throwNoSuchElementException", "(Ljava/lang/String;)Ljava/lang/Void;", "indexOf", "(Ljava/lang/Object;)I", "isEmpty", "()Z", "isNotEmpty", "lastIndexOf", "remove", "removeAll", "(Landroidx/compose/runtime/collection/MutableVector;)Z", "removeAt", "(I)Ljava/lang/Object;", "start", "end", "removeRange", "(II)V", "newSize", "setSize", "retainAll", "set", "(ILjava/lang/Object;)Ljava/lang/Object;", "Ljava/util/Comparator;", "Lkotlin/Comparator;", "comparator", "sortWith", "(Ljava/util/Comparator;)V", "[Ljava/lang/Object;", "getContent$annotations", "list", "Ljava/util/List;", "value", "I", "getSize", "()I", "VectorListIterator", "MutableVectorList", "SubList", "runtime"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class MutableVector<T> implements RandomAccess {
    public static final int $stable = 8;
    public Object[] content;
    private List list;
    private int size;

    public MutableVector(Object[] objArr, int i) {
        this.content = objArr;
        this.size = i;
    }

    public final int getSize() {
        return this.size;
    }

    public final boolean contains(Object element) {
        int size = getSize() - 1;
        if (size >= 0) {
            for (int i = 0; !Intrinsics.areEqual(this.content[i], element); i++) {
                if (i != size) {
                }
            }
            return true;
        }
        return false;
    }

    public final Object[] getContent() {
        return this.content;
    }

    public final boolean add(Object element) {
        int i = this.size + 1;
        if (this.content.length < i) {
            resizeStorage(i);
        }
        Object[] objArr = this.content;
        int i2 = this.size;
        objArr[i2] = element;
        this.size = i2 + 1;
        return true;
    }

    public final void add(int index, Object element) {
        int i = this.size + 1;
        if (this.content.length < i) {
            resizeStorage(i);
        }
        Object[] objArr = this.content;
        int i2 = this.size;
        if (index != i2) {
            System.arraycopy(objArr, index, objArr, index + 1, i2 - index);
        }
        objArr[index] = element;
        this.size++;
    }

    public final boolean addAll(int index, List elements) {
        if (elements.isEmpty()) {
            return false;
        }
        int size = elements.size();
        int i = this.size + size;
        if (this.content.length < i) {
            resizeStorage(i);
        }
        Object[] objArr = this.content;
        int i2 = this.size;
        if (index != i2) {
            System.arraycopy(objArr, index, objArr, index + size, i2 - index);
        }
        int size2 = elements.size();
        for (int i3 = 0; i3 < size2; i3++) {
            objArr[index + i3] = elements.get(i3);
        }
        this.size += size;
        return true;
    }

    public final boolean addAll(int index, MutableVector elements) {
        int i = elements.size;
        if (i == 0) {
            return false;
        }
        int i2 = this.size + i;
        if (this.content.length < i2) {
            resizeStorage(i2);
        }
        Object[] objArr = this.content;
        int i3 = this.size;
        if (index != i3) {
            System.arraycopy(objArr, index, objArr, index + i, i3 - index);
        }
        System.arraycopy(elements.content, 0, objArr, index, i);
        this.size += i;
        return true;
    }

    public final boolean addAll(int index, Collection elements) {
        int i = 0;
        if (elements.isEmpty()) {
            return false;
        }
        int size = elements.size();
        int i2 = this.size + size;
        if (this.content.length < i2) {
            resizeStorage(i2);
        }
        Object[] objArr = this.content;
        int i3 = this.size;
        if (index != i3) {
            System.arraycopy(objArr, index, objArr, index + size, i3 - index);
        }
        for (T t : elements) {
            int i4 = i + 1;
            if (i < 0) {
                CollectionsKt.throwIndexOverflow();
            }
            objArr[i + index] = t;
            i = i4;
        }
        this.size += size;
        return true;
    }

    public final boolean addAll(Collection elements) {
        return addAll(this.size, elements);
    }

    public final List asMutableList() {
        List list = this.list;
        if (list != null) {
            return list;
        }
        MutableVectorList mutableVectorList = new MutableVectorList(this);
        this.list = mutableVectorList;
        return mutableVectorList;
    }

    public final void clear() {
        Object[] objArr = this.content;
        int i = this.size;
        for (int i2 = 0; i2 < i; i2++) {
            objArr[i2] = null;
        }
        this.size = 0;
    }

    public final boolean containsAll(Collection elements) {
        Iterator<T> it = elements.iterator();
        while (it.hasNext()) {
            if (!contains(it.next())) {
                return false;
            }
        }
        return true;
    }

    public final void resizeStorage(int capacity) {
        Object[] objArr = this.content;
        int length = objArr.length;
        Object[] objArr2 = new Object[Math.max(capacity, length * 2)];
        System.arraycopy(objArr, 0, objArr2, 0, length);
        this.content = objArr2;
    }

    public final Void throwNoSuchElementException(String message) {
        throw new NoSuchElementException(message);
    }

    public final int indexOf(Object element) {
        Object[] objArr = this.content;
        int i = this.size;
        for (int i2 = 0; i2 < i; i2++) {
            if (Intrinsics.areEqual(element, objArr[i2])) {
                return i2;
            }
        }
        return -1;
    }

    public final Object first() {
        if (getSize() == 0) {
            throwNoSuchElementException("MutableVector is empty.");
            throw new KotlinNothingValueException();
        }
        return this.content[0];
    }

    public final boolean isEmpty() {
        return getSize() == 0;
    }

    public final boolean isNotEmpty() {
        return getSize() != 0;
    }

    public final int lastIndexOf(Object element) {
        Object[] objArr = this.content;
        for (int i = this.size - 1; i >= 0; i--) {
            if (Intrinsics.areEqual(element, objArr[i])) {
                return i;
            }
        }
        return -1;
    }

    public final boolean remove(Object element) {
        int indexOf = indexOf(element);
        if (indexOf < 0) {
            return false;
        }
        removeAt(indexOf);
        return true;
    }

    public final boolean removeAll(MutableVector elements) {
        int i = this.size;
        int size = elements.getSize() - 1;
        if (size >= 0) {
            int i2 = 0;
            while (true) {
                remove(elements.content[i2]);
                if (i2 == size) {
                    break;
                }
                i2++;
            }
        }
        return i != this.size;
    }

    public final boolean removeAll(Collection elements) {
        if (elements.isEmpty()) {
            return false;
        }
        int i = this.size;
        Iterator<T> it = elements.iterator();
        while (it.hasNext()) {
            remove(it.next());
        }
        return i != this.size;
    }

    public final Object removeAt(int index) {
        Object[] objArr = this.content;
        Object obj = objArr[index];
        if (index != getSize() - 1) {
            int i = index + 1;
            System.arraycopy(objArr, i, objArr, index, this.size - i);
        }
        int i2 = this.size - 1;
        this.size = i2;
        objArr[i2] = null;
        return obj;
    }

    public final void removeRange(int start, int end) {
        if (end > start) {
            int i = this.size;
            if (end < i) {
                Object[] objArr = this.content;
                System.arraycopy(objArr, end, objArr, start, i - end);
            }
            int i2 = this.size - (end - start);
            int size = getSize() - 1;
            if (i2 <= size) {
                int i3 = i2;
                while (true) {
                    this.content[i3] = null;
                    if (i3 == size) {
                        break;
                    } else {
                        i3++;
                    }
                }
            }
            this.size = i2;
        }
    }

    public final void setSize(int newSize) {
        this.size = newSize;
    }

    public final boolean retainAll(Collection elements) {
        int i = this.size;
        for (int size = getSize() - 1; -1 < size; size--) {
            if (!elements.contains(this.content[size])) {
                removeAt(size);
            }
        }
        return i != this.size;
    }

    public final Object set(int index, Object element) {
        Object[] objArr = this.content;
        Object obj = objArr[index];
        objArr[index] = element;
        return obj;
    }

    public final void sortWith(Comparator comparator) {
        ArraysKt.sortWith(this.content, comparator, 0, this.size);
    }

    /* compiled from: MutableVector.kt */
    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010+\n\u0000\n\u0002\u0010!\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\t\b\u0002\u0018\u0000*\u0004\b\u0001\u0010\u00012\b\u0012\u0004\u0012\u0002H\u00010\u0002B\u001d\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00010\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\t\u001a\u00020\nH\u0096\u0002J\u000e\u0010\u000b\u001a\u00028\u0001H\u0096\u0002¢\u0006\u0002\u0010\fJ\b\u0010\r\u001a\u00020\u000eH\u0016J\b\u0010\u000f\u001a\u00020\nH\u0016J\b\u0010\u0010\u001a\u00020\u0006H\u0016J\r\u0010\u0011\u001a\u00028\u0001H\u0016¢\u0006\u0002\u0010\fJ\b\u0010\u0012\u001a\u00020\u0006H\u0016J\u0015\u0010\u0013\u001a\u00020\u000e2\u0006\u0010\u0014\u001a\u00028\u0001H\u0016¢\u0006\u0002\u0010\u0015J\u0015\u0010\u0016\u001a\u00020\u000e2\u0006\u0010\u0014\u001a\u00028\u0001H\u0016¢\u0006\u0002\u0010\u0015R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00010\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0017"}, d2 = {"Landroidx/compose/runtime/collection/MutableVector$VectorListIterator;", "T", "", "list", "", "index", "", "<init>", "(Ljava/util/List;I)V", "hasNext", "", ScrollDirection.NEXT, "()Ljava/lang/Object;", "remove", "", "hasPrevious", "nextIndex", "previous", "previousIndex", m.l, "element", "(Ljava/lang/Object;)V", "set", "runtime"}, k = 1, mv = {2, 0, 0}, xi = 48)
    private static final class VectorListIterator<T> implements ListIterator<T>, KMappedMarker {
        private int index;
        private final List list;

        public VectorListIterator(List list, int i) {
            this.list = list;
            this.index = i;
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public boolean hasNext() {
            return this.index < this.list.size();
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public Object next() {
            List list = this.list;
            int i = this.index;
            this.index = i + 1;
            return list.get(i);
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public void remove() {
            int i = this.index - 1;
            this.index = i;
            this.list.remove(i);
        }

        @Override // java.util.ListIterator
        public boolean hasPrevious() {
            return this.index > 0;
        }

        @Override // java.util.ListIterator
        public int nextIndex() {
            return this.index;
        }

        @Override // java.util.ListIterator
        public Object previous() {
            int i = this.index - 1;
            this.index = i;
            return this.list.get(i);
        }

        @Override // java.util.ListIterator
        public int previousIndex() {
            return this.index - 1;
        }

        @Override // java.util.ListIterator
        public void add(Object element) {
            this.list.add(this.index, element);
            this.index++;
        }

        @Override // java.util.ListIterator
        public void set(Object element) {
            this.list.set(this.index, element);
        }
    }

    /* compiled from: MutableVector.kt */
    @Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u001e\n\u0002\b\u0007\n\u0002\u0010)\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010+\n\u0002\b\n\b\u0002\u0018\u0000*\u0004\b\u0001\u0010\u00012\b\u0012\u0004\u0012\u0002H\u00010\u0002B\u0015\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00010\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\u0016\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00028\u0001H\u0096\u0002¢\u0006\u0002\u0010\u000eJ\u0016\u0010\u000f\u001a\u00020\f2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00028\u00010\u0011H\u0016J\u0016\u0010\u0012\u001a\u00028\u00012\u0006\u0010\u0013\u001a\u00020\bH\u0096\u0002¢\u0006\u0002\u0010\u0014J\u0015\u0010\u0015\u001a\u00020\b2\u0006\u0010\r\u001a\u00028\u0001H\u0016¢\u0006\u0002\u0010\u0016J\b\u0010\u0017\u001a\u00020\fH\u0016J\u000f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00028\u00010\u0019H\u0096\u0002J\u0015\u0010\u001a\u001a\u00020\b2\u0006\u0010\r\u001a\u00028\u0001H\u0016¢\u0006\u0002\u0010\u0016J\u0015\u0010\u001b\u001a\u00020\f2\u0006\u0010\r\u001a\u00028\u0001H\u0016¢\u0006\u0002\u0010\u000eJ\u001d\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u0013\u001a\u00020\b2\u0006\u0010\r\u001a\u00028\u0001H\u0016¢\u0006\u0002\u0010\u001dJ\u001e\u0010\u001e\u001a\u00020\f2\u0006\u0010\u0013\u001a\u00020\b2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00028\u00010\u0011H\u0016J\u0016\u0010\u001e\u001a\u00020\f2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00028\u00010\u0011H\u0016J\b\u0010\u001f\u001a\u00020\u001cH\u0016J\u000e\u0010 \u001a\b\u0012\u0004\u0012\u00028\u00010!H\u0016J\u0016\u0010 \u001a\b\u0012\u0004\u0012\u00028\u00010!2\u0006\u0010\u0013\u001a\u00020\bH\u0016J\u0015\u0010\"\u001a\u00020\f2\u0006\u0010\r\u001a\u00028\u0001H\u0016¢\u0006\u0002\u0010\u000eJ\u0016\u0010#\u001a\u00020\f2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00028\u00010\u0011H\u0016J\u0015\u0010$\u001a\u00028\u00012\u0006\u0010\u0013\u001a\u00020\bH\u0016¢\u0006\u0002\u0010\u0014J\u0016\u0010%\u001a\u00020\f2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00028\u00010\u0011H\u0016J\u001e\u0010&\u001a\u00028\u00012\u0006\u0010\u0013\u001a\u00020\b2\u0006\u0010\r\u001a\u00028\u0001H\u0096\u0002¢\u0006\u0002\u0010'J\u001e\u0010(\u001a\b\u0012\u0004\u0012\u00028\u00010\u00022\u0006\u0010)\u001a\u00020\b2\u0006\u0010*\u001a\u00020\bH\u0016R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00010\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u00020\b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\n¨\u0006+"}, d2 = {"Landroidx/compose/runtime/collection/MutableVector$MutableVectorList;", "T", "", "vector", "Landroidx/compose/runtime/collection/MutableVector;", "<init>", "(Landroidx/compose/runtime/collection/MutableVector;)V", "size", "", "getSize", "()I", "contains", "", "element", "(Ljava/lang/Object;)Z", "containsAll", "elements", "", "get", "index", "(I)Ljava/lang/Object;", "indexOf", "(Ljava/lang/Object;)I", "isEmpty", "iterator", "", "lastIndexOf", m.l, "", "(ILjava/lang/Object;)V", "addAll", "clear", "listIterator", "", "remove", "removeAll", "removeAt", "retainAll", "set", "(ILjava/lang/Object;)Ljava/lang/Object;", "subList", "fromIndex", "toIndex", "runtime"}, k = 1, mv = {2, 0, 0}, xi = 48)
    private static final class MutableVectorList<T> implements List<T>, KMutableList {
        private final MutableVector vector;

        @Override // java.util.List, java.util.Collection
        public Object[] toArray() {
            return CollectionToArray.toArray(this);
        }

        @Override // java.util.List, java.util.Collection
        public Object[] toArray(Object[] objArr) {
            return CollectionToArray.toArray(this, objArr);
        }

        public MutableVectorList(MutableVector mutableVector) {
            this.vector = mutableVector;
        }

        @Override // java.util.List
        public final /* bridge */ Object remove(int i) {
            return removeAt(i);
        }

        @Override // java.util.List, java.util.Collection
        public final /* bridge */ int size() {
            return getSize();
        }

        public int getSize() {
            return this.vector.getSize();
        }

        @Override // java.util.List, java.util.Collection
        public boolean contains(Object element) {
            return this.vector.contains(element);
        }

        @Override // java.util.List, java.util.Collection
        public boolean containsAll(Collection elements) {
            return this.vector.containsAll(elements);
        }

        @Override // java.util.List
        public Object get(int index) {
            MutableVectorKt.checkIndex(this, index);
            return this.vector.content[index];
        }

        @Override // java.util.List
        public int indexOf(Object element) {
            return this.vector.indexOf(element);
        }

        @Override // java.util.List, java.util.Collection
        public boolean isEmpty() {
            return this.vector.getSize() == 0;
        }

        @Override // java.util.List, java.util.Collection, java.lang.Iterable
        public Iterator iterator() {
            return new VectorListIterator(this, 0);
        }

        @Override // java.util.List
        public int lastIndexOf(Object element) {
            return this.vector.lastIndexOf(element);
        }

        @Override // java.util.List, java.util.Collection
        public boolean add(Object element) {
            return this.vector.add(element);
        }

        @Override // java.util.List
        public void add(int index, Object element) {
            this.vector.add(index, element);
        }

        @Override // java.util.List
        public boolean addAll(int index, Collection elements) {
            return this.vector.addAll(index, elements);
        }

        @Override // java.util.List, java.util.Collection
        public boolean addAll(Collection elements) {
            return this.vector.addAll(elements);
        }

        @Override // java.util.List, java.util.Collection
        public void clear() {
            this.vector.clear();
        }

        @Override // java.util.List
        public ListIterator listIterator() {
            return new VectorListIterator(this, 0);
        }

        @Override // java.util.List
        public ListIterator listIterator(int index) {
            return new VectorListIterator(this, index);
        }

        @Override // java.util.List, java.util.Collection
        public boolean remove(Object element) {
            return this.vector.remove(element);
        }

        @Override // java.util.List, java.util.Collection
        public boolean removeAll(Collection elements) {
            return this.vector.removeAll(elements);
        }

        public Object removeAt(int index) {
            MutableVectorKt.checkIndex(this, index);
            return this.vector.removeAt(index);
        }

        @Override // java.util.List, java.util.Collection
        public boolean retainAll(Collection elements) {
            return this.vector.retainAll(elements);
        }

        @Override // java.util.List
        public Object set(int index, Object element) {
            MutableVectorKt.checkIndex(this, index);
            return this.vector.set(index, element);
        }

        @Override // java.util.List
        public List subList(int fromIndex, int toIndex) {
            MutableVectorKt.checkSubIndex(this, fromIndex, toIndex);
            return new SubList(this, fromIndex, toIndex);
        }
    }

    /* compiled from: MutableVector.kt */
    @Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u001e\n\u0002\b\u0007\n\u0002\u0010)\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010+\n\u0002\b\n\b\u0002\u0018\u0000*\u0004\b\u0001\u0010\u00012\b\u0012\u0004\u0012\u0002H\u00010\u0002B%\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00010\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0016\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00028\u0001H\u0096\u0002¢\u0006\u0002\u0010\u000fJ\u0016\u0010\u0010\u001a\u00020\r2\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00028\u00010\u0012H\u0016J\u0016\u0010\u0013\u001a\u00028\u00012\u0006\u0010\u0014\u001a\u00020\u0005H\u0096\u0002¢\u0006\u0002\u0010\u0015J\u0015\u0010\u0016\u001a\u00020\u00052\u0006\u0010\u000e\u001a\u00028\u0001H\u0016¢\u0006\u0002\u0010\u0017J\b\u0010\u0018\u001a\u00020\rH\u0016J\u000f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00028\u00010\u001aH\u0096\u0002J\u0015\u0010\u001b\u001a\u00020\u00052\u0006\u0010\u000e\u001a\u00028\u0001H\u0016¢\u0006\u0002\u0010\u0017J\u0015\u0010\u001c\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00028\u0001H\u0016¢\u0006\u0002\u0010\u000fJ\u001d\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u0014\u001a\u00020\u00052\u0006\u0010\u000e\u001a\u00028\u0001H\u0016¢\u0006\u0002\u0010\u001eJ\u001e\u0010\u001f\u001a\u00020\r2\u0006\u0010\u0014\u001a\u00020\u00052\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00028\u00010\u0012H\u0016J\u0016\u0010\u001f\u001a\u00020\r2\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00028\u00010\u0012H\u0016J\b\u0010 \u001a\u00020\u001dH\u0016J\u000e\u0010!\u001a\b\u0012\u0004\u0012\u00028\u00010\"H\u0016J\u0016\u0010!\u001a\b\u0012\u0004\u0012\u00028\u00010\"2\u0006\u0010\u0014\u001a\u00020\u0005H\u0016J\u0015\u0010#\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00028\u0001H\u0016¢\u0006\u0002\u0010\u000fJ\u0016\u0010$\u001a\u00020\r2\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00028\u00010\u0012H\u0016J\u0015\u0010%\u001a\u00028\u00012\u0006\u0010\u0014\u001a\u00020\u0005H\u0016¢\u0006\u0002\u0010\u0015J\u0016\u0010&\u001a\u00020\r2\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00028\u00010\u0012H\u0016J\u001e\u0010'\u001a\u00028\u00012\u0006\u0010\u0014\u001a\u00020\u00052\u0006\u0010\u000e\u001a\u00028\u0001H\u0096\u0002¢\u0006\u0002\u0010(J\u001e\u0010)\u001a\b\u0012\u0004\u0012\u00028\u00010\u00022\u0006\u0010*\u001a\u00020\u00052\u0006\u0010+\u001a\u00020\u0005H\u0016R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00010\u0002X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\t\u001a\u00020\u00058VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\u000b¨\u0006,"}, d2 = {"Landroidx/compose/runtime/collection/MutableVector$SubList;", "T", "", "list", "start", "", "end", "<init>", "(Ljava/util/List;II)V", "size", "getSize", "()I", "contains", "", "element", "(Ljava/lang/Object;)Z", "containsAll", "elements", "", "get", "index", "(I)Ljava/lang/Object;", "indexOf", "(Ljava/lang/Object;)I", "isEmpty", "iterator", "", "lastIndexOf", m.l, "", "(ILjava/lang/Object;)V", "addAll", "clear", "listIterator", "", "remove", "removeAll", "removeAt", "retainAll", "set", "(ILjava/lang/Object;)Ljava/lang/Object;", "subList", "fromIndex", "toIndex", "runtime"}, k = 1, mv = {2, 0, 0}, xi = 48)
    private static final class SubList<T> implements List<T>, KMutableList {
        private int end;
        private final List list;
        private final int start;

        @Override // java.util.List, java.util.Collection
        public Object[] toArray() {
            return CollectionToArray.toArray(this);
        }

        @Override // java.util.List, java.util.Collection
        public Object[] toArray(Object[] objArr) {
            return CollectionToArray.toArray(this, objArr);
        }

        public SubList(List list, int i, int i2) {
            this.list = list;
            this.start = i;
            this.end = i2;
        }

        @Override // java.util.List
        public final /* bridge */ Object remove(int i) {
            return removeAt(i);
        }

        @Override // java.util.List, java.util.Collection
        public final /* bridge */ int size() {
            return getSize();
        }

        public int getSize() {
            return this.end - this.start;
        }

        @Override // java.util.List, java.util.Collection
        public boolean contains(Object element) {
            int i = this.end;
            for (int i2 = this.start; i2 < i; i2++) {
                if (Intrinsics.areEqual(this.list.get(i2), element)) {
                    return true;
                }
            }
            return false;
        }

        @Override // java.util.List, java.util.Collection
        public boolean containsAll(Collection elements) {
            Iterator<T> it = elements.iterator();
            while (it.hasNext()) {
                if (!contains(it.next())) {
                    return false;
                }
            }
            return true;
        }

        @Override // java.util.List
        public Object get(int index) {
            MutableVectorKt.checkIndex(this, index);
            return this.list.get(index + this.start);
        }

        @Override // java.util.List
        public int indexOf(Object element) {
            int i = this.end;
            for (int i2 = this.start; i2 < i; i2++) {
                if (Intrinsics.areEqual(this.list.get(i2), element)) {
                    return i2 - this.start;
                }
            }
            return -1;
        }

        @Override // java.util.List, java.util.Collection
        public boolean isEmpty() {
            return this.end == this.start;
        }

        @Override // java.util.List, java.util.Collection, java.lang.Iterable
        public Iterator iterator() {
            return new VectorListIterator(this, 0);
        }

        @Override // java.util.List
        public int lastIndexOf(Object element) {
            int i = this.end - 1;
            int i2 = this.start;
            if (i2 > i) {
                return -1;
            }
            while (!Intrinsics.areEqual(this.list.get(i), element)) {
                if (i == i2) {
                    return -1;
                }
                i--;
            }
            return i - this.start;
        }

        @Override // java.util.List, java.util.Collection
        public boolean add(Object element) {
            List list = this.list;
            int i = this.end;
            this.end = i + 1;
            list.add(i, element);
            return true;
        }

        @Override // java.util.List
        public void add(int index, Object element) {
            this.list.add(index + this.start, element);
            this.end++;
        }

        @Override // java.util.List
        public boolean addAll(int index, Collection elements) {
            this.list.addAll(index + this.start, elements);
            int size = elements.size();
            this.end += size;
            return size > 0;
        }

        @Override // java.util.List, java.util.Collection
        public boolean addAll(Collection elements) {
            this.list.addAll(this.end, elements);
            int size = elements.size();
            this.end += size;
            return size > 0;
        }

        @Override // java.util.List, java.util.Collection
        public void clear() {
            int i = this.end - 1;
            int i2 = this.start;
            if (i2 <= i) {
                while (true) {
                    this.list.remove(i);
                    if (i == i2) {
                        break;
                    } else {
                        i--;
                    }
                }
            }
            this.end = this.start;
        }

        @Override // java.util.List
        public ListIterator listIterator() {
            return new VectorListIterator(this, 0);
        }

        @Override // java.util.List
        public ListIterator listIterator(int index) {
            return new VectorListIterator(this, index);
        }

        @Override // java.util.List, java.util.Collection
        public boolean remove(Object element) {
            int i = this.end;
            for (int i2 = this.start; i2 < i; i2++) {
                if (Intrinsics.areEqual(this.list.get(i2), element)) {
                    this.list.remove(i2);
                    this.end--;
                    return true;
                }
            }
            return false;
        }

        @Override // java.util.List, java.util.Collection
        public boolean removeAll(Collection elements) {
            int i = this.end;
            Iterator<T> it = elements.iterator();
            while (it.hasNext()) {
                remove(it.next());
            }
            return i != this.end;
        }

        public Object removeAt(int index) {
            MutableVectorKt.checkIndex(this, index);
            this.end--;
            return this.list.remove(index + this.start);
        }

        @Override // java.util.List, java.util.Collection
        public boolean retainAll(Collection elements) {
            int i = this.end;
            int i2 = i - 1;
            int i3 = this.start;
            if (i3 <= i2) {
                while (true) {
                    if (!elements.contains(this.list.get(i2))) {
                        this.list.remove(i2);
                        this.end--;
                    }
                    if (i2 == i3) {
                        break;
                    }
                    i2--;
                }
            }
            return i != this.end;
        }

        @Override // java.util.List
        public Object set(int index, Object element) {
            MutableVectorKt.checkIndex(this, index);
            return this.list.set(index + this.start, element);
        }

        @Override // java.util.List
        public List subList(int fromIndex, int toIndex) {
            MutableVectorKt.checkSubIndex(this, fromIndex, toIndex);
            return new SubList(this, fromIndex, toIndex);
        }
    }
}
