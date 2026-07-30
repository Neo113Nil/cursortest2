package kotlin.collections;

import java.util.List;
import java.util.RandomAccess;

/* loaded from: classes4.dex */
public final class p0 extends b implements RandomAccess {
    private int _size;
    private int fromIndex;
    private final List<Object> list;

    public p0(List<Object> list) {
        kotlin.jvm.internal.s.checkNotNullParameter(list, "list");
        this.list = list;
    }

    @Override // kotlin.collections.b, java.util.List
    public Object get(int i8) {
        b.Companion.checkElementIndex$kotlin_stdlib(i8, this._size);
        return this.list.get(this.fromIndex + i8);
    }

    @Override // kotlin.collections.b, kotlin.collections.AbstractCollection
    public int getSize() {
        return this._size;
    }

    public final void move(int i8, int i9) {
        b.Companion.checkRangeIndexes$kotlin_stdlib(i8, i9, this.list.size());
        this.fromIndex = i8;
        this._size = i9 - i8;
    }
}
