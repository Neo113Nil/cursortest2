package kotlin.jvm.internal;

import bo.app.a$$ExternalSyntheticBUOutline0;
import com.google.firebase.components.OptionalProvider$$ExternalSyntheticLambda0;
import java.util.Iterator;
import kotlin.collections.AbstractList;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.IndexedValue;
import kotlin.jvm.internal.markers.KMappedMarker;

/* loaded from: classes.dex */
public class ArrayIterator implements Iterator, KMappedMarker {
    public final /* synthetic */ int $r8$classId = 2;

    /* renamed from: array, reason: collision with root package name */
    public final Object f1520array;
    public int index;

    public ArrayIterator(Object[] objArr) {
        objArr.getClass();
        this.f1520array = objArr;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        switch (this.$r8$classId) {
            case 0:
                return this.index < ((Object[]) this.f1520array).length;
            case 1:
                return this.index < ((AbstractList) this.f1520array).getSize();
            default:
                return ((Iterator) this.f1520array).hasNext();
        }
    }

    @Override // java.util.Iterator
    public final Object next() {
        switch (this.$r8$classId) {
            case 0:
                try {
                    Object[] objArr = (Object[]) this.f1520array;
                    int i = this.index;
                    this.index = i + 1;
                    return objArr[i];
                } catch (ArrayIndexOutOfBoundsException e) {
                    this.index--;
                    OptionalProvider$$ExternalSyntheticLambda0.m(e.getMessage());
                    return null;
                }
            case 1:
                if (!hasNext()) {
                    a$$ExternalSyntheticBUOutline0.m();
                    return null;
                }
                AbstractList abstractList = (AbstractList) this.f1520array;
                int i2 = this.index;
                this.index = i2 + 1;
                return abstractList.get(i2);
            default:
                int i3 = this.index;
                this.index = i3 + 1;
                if (i3 >= 0) {
                    return new IndexedValue(i3, ((Iterator) this.f1520array).next());
                }
                CollectionsKt__CollectionsKt.throwIndexOverflow();
                throw null;
        }
    }

    @Override // java.util.Iterator
    public final void remove() {
        switch (this.$r8$classId) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            case 1:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public ArrayIterator(Iterator it) {
        it.getClass();
        this.f1520array = it;
    }

    public ArrayIterator(AbstractList abstractList) {
        this.f1520array = abstractList;
    }
}
