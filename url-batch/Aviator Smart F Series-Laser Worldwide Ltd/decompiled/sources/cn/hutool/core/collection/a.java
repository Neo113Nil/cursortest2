package cn.hutool.core.collection;

import java.util.List;

/* loaded from: classes.dex */
public class a extends p0 {
    final int limit;
    final int remainder;

    public a(List<Object> list, int i8) {
        super(list, list.size() / (i8 <= 0 ? 1 : i8));
        cn.hutool.core.lang.q.isTrue(i8 > 0, "Partition limit must be > 0", new Object[0]);
        this.limit = i8;
        this.remainder = list.size() % i8;
    }

    @Override // cn.hutool.core.collection.p0, java.util.AbstractCollection, java.util.Collection, java.util.List
    public int size() {
        return this.limit;
    }

    @Override // cn.hutool.core.collection.p0, java.util.AbstractList, java.util.List
    public List<Object> get(int i8) {
        int i9 = this.size;
        int i10 = this.remainder;
        int min = (i8 * i9) + Math.min(i8, i10);
        int i11 = i9 + min;
        if (i8 + 1 <= i10) {
            i11++;
        }
        return this.list.subList(min, i11);
    }
}
