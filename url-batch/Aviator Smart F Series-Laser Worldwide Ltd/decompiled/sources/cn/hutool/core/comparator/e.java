package cn.hutool.core.comparator;

import cn.hutool.core.lang.q;
import java.util.Comparator;

/* loaded from: classes.dex */
public class e implements Comparator {
    private final Object[] array;
    private final boolean atEndIfMiss;

    public e(Object... objArr) {
        this(false, objArr);
    }

    private int getOrder(Object obj) {
        int indexOf = cn.hutool.core.util.h.indexOf(this.array, obj);
        if (indexOf >= 0) {
            return indexOf;
        }
        if (this.atEndIfMiss) {
            return this.array.length;
        }
        return -1;
    }

    @Override // java.util.Comparator
    public int compare(Object obj, Object obj2) {
        int order = getOrder(obj);
        int order2 = getOrder(obj2);
        return order == order2 ? (order < 0 || order == this.array.length) ? 1 : 0 : Integer.compare(order, order2);
    }

    public e(boolean z7, Object... objArr) {
        q.notNull(objArr, "'objs' array must not be null", new Object[0]);
        this.atEndIfMiss = z7;
        this.array = objArr;
    }
}
