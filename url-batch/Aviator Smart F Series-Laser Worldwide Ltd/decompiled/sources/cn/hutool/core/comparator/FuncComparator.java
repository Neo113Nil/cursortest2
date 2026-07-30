package cn.hutool.core.comparator;

import cn.hutool.core.util.e0;
import java.util.function.Function;

/* loaded from: classes.dex */
public class FuncComparator<T> extends NullComparator<T> {
    private static final long serialVersionUID = 1;
    private final boolean compareSelf;
    private final Function<T, Comparable<?>> func;

    public FuncComparator(boolean z7, Function<T, Comparable<?>> function) {
        this(z7, true, function);
    }

    private int compare(T t7, T t8, Comparable comparable, Comparable comparable2) {
        int compare = e0.compare(comparable, comparable2, this.nullGreater);
        return (this.compareSelf && compare == 0) ? d.compare(t7, t8, this.nullGreater) : compare;
    }

    @Override // cn.hutool.core.comparator.NullComparator
    protected int doCompare(T t7, T t8) {
        Object apply;
        Object apply2;
        try {
            apply = this.func.apply(t7);
            Comparable comparable = (Comparable) apply;
            apply2 = this.func.apply(t8);
            return compare(t7, t8, comparable, (Comparable) apply2);
        } catch (Exception e8) {
            throw new ComparatorException(e8);
        }
    }

    public FuncComparator(boolean z7, boolean z8, Function<T, Comparable<?>> function) {
        super(z7, null);
        this.compareSelf = z8;
        this.func = function;
    }
}
