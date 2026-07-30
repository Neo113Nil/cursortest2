package cn.hutool.core.collection;

import java.util.AbstractList;
import java.util.List;

/* loaded from: classes.dex */
public class p0 extends AbstractList {
    protected final List<Object> list;
    protected final int size;

    public p0(List<Object> list, int i8) {
        this.list = (List) cn.hutool.core.lang.q.notNull(list);
        this.size = Math.min(list.size(), i8);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean isEmpty() {
        return this.list.isEmpty();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public int size() {
        int i8 = this.size;
        if (i8 == 0) {
            return 0;
        }
        return ((this.list.size() + i8) - 1) / i8;
    }

    @Override // java.util.AbstractList, java.util.List
    public List<Object> get(int i8) {
        int i9 = this.size;
        int i10 = i8 * i9;
        return this.list.subList(i10, Math.min(i9 + i10, this.list.size()));
    }
}
