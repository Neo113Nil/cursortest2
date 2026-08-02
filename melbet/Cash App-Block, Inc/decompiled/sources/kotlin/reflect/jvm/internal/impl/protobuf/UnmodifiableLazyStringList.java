package kotlin.reflect.jvm.internal.impl.protobuf;

import com.google.android.gms.measurement.internal.zzbe;
import java.util.AbstractList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* loaded from: classes9.dex */
public class UnmodifiableLazyStringList extends AbstractList<String> implements RandomAccess, LazyStringList {
    public final LazyStringList list;

    /* renamed from: kotlin.reflect.jvm.internal.impl.protobuf.UnmodifiableLazyStringList$1, reason: invalid class name */
    public final class AnonymousClass1 implements ListIterator {
        public ListIterator iter;

        @Override // java.util.ListIterator
        public final void add(Object obj) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public final boolean hasNext() {
            return this.iter.hasNext();
        }

        @Override // java.util.ListIterator
        public final boolean hasPrevious() {
            return this.iter.hasPrevious();
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public final Object next() {
            return (String) this.iter.next();
        }

        @Override // java.util.ListIterator
        public final int nextIndex() {
            return this.iter.nextIndex();
        }

        @Override // java.util.ListIterator
        public final Object previous() {
            return (String) this.iter.previous();
        }

        @Override // java.util.ListIterator
        public final int previousIndex() {
            return this.iter.previousIndex();
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public final void remove() {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.ListIterator
        public final void set(Object obj) {
            throw new UnsupportedOperationException();
        }
    }

    public UnmodifiableLazyStringList(LazyStringList lazyStringList) {
        this.list = lazyStringList;
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.LazyStringList
    public void add(ByteString byteString) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractList, java.util.List
    public String get(int i) {
        return this.list.get(i);
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.LazyStringList
    public ByteString getByteString(int i) {
        return this.list.getByteString(i);
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.LazyStringList
    public List<?> getUnderlyingElements() {
        return this.list.getUnderlyingElements();
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.LazyStringList
    public LazyStringList getUnmodifiableView() {
        return this;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public Iterator<String> iterator() {
        zzbe zzbeVar = new zzbe(5);
        zzbeVar.zza = this.list.iterator();
        return zzbeVar;
    }

    @Override // java.util.AbstractList, java.util.List
    public ListIterator<String> listIterator(int i) {
        AnonymousClass1 anonymousClass1 = new AnonymousClass1();
        anonymousClass1.iter = this.list.listIterator(i);
        return anonymousClass1;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public int size() {
        return this.list.size();
    }
}
