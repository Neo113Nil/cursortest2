package kotlin.collections;

import java.util.List;
import java.util.RandomAccess;
import kotlin.collections.AbstractList;

/* loaded from: classes9.dex */
public final class MovingSubList extends AbstractList implements RandomAccess {
    public final /* synthetic */ int $r8$classId = 0;
    public int _size;
    public int fromIndex;
    public final List list;

    public MovingSubList(AbstractList abstractList, int i, int i2) {
        this.list = abstractList;
        this.fromIndex = i;
        AbstractList.Companion companion = AbstractList.Companion;
        int size = abstractList.getSize();
        companion.getClass();
        AbstractList.Companion.checkRangeIndexes$kotlin_stdlib(i, i2, size);
        this._size = i2 - i;
    }

    @Override // java.util.List
    public final Object get(int i) {
        int i2 = this.$r8$classId;
        List list = this.list;
        switch (i2) {
            case 0:
                AbstractList.Companion companion = AbstractList.Companion;
                int i3 = this._size;
                companion.getClass();
                AbstractList.Companion.checkElementIndex$kotlin_stdlib(i, i3);
                return list.get(this.fromIndex + i);
            default:
                AbstractList.Companion companion2 = AbstractList.Companion;
                int i4 = this._size;
                companion2.getClass();
                AbstractList.Companion.checkElementIndex$kotlin_stdlib(i, i4);
                return ((AbstractList) list).get(this.fromIndex + i);
        }
    }

    @Override // kotlin.collections.AbstractCollection
    public final int getSize() {
        switch (this.$r8$classId) {
        }
        return this._size;
    }

    public void move(int i, int i2) {
        AbstractList.Companion companion = AbstractList.Companion;
        int size = this.list.size();
        companion.getClass();
        AbstractList.Companion.checkRangeIndexes$kotlin_stdlib(i, i2, size);
        this.fromIndex = i;
        this._size = i2 - i;
    }

    @Override // kotlin.collections.AbstractList, java.util.List
    public List subList(int i, int i2) {
        switch (this.$r8$classId) {
            case 1:
                AbstractList.Companion companion = AbstractList.Companion;
                int i3 = this._size;
                companion.getClass();
                AbstractList.Companion.checkRangeIndexes$kotlin_stdlib(i, i2, i3);
                AbstractList abstractList = (AbstractList) this.list;
                int i4 = this.fromIndex;
                return new MovingSubList(abstractList, i + i4, i4 + i2);
            default:
                return super.subList(i, i2);
        }
    }

    public MovingSubList(List list) {
        this.list = list;
    }
}
