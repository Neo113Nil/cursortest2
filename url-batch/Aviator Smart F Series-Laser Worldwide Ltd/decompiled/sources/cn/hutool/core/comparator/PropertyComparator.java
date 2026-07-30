package cn.hutool.core.comparator;

import cn.hutool.core.bean.q;
import java.util.function.Function;

/* loaded from: classes.dex */
public class PropertyComparator<T> extends FuncComparator<T> {
    private static final long serialVersionUID = 9157326766723846313L;

    public PropertyComparator(String str) {
        this(str, true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Comparable lambda$new$0(String str, Object obj) {
        return (Comparable) q.getProperty(obj, str);
    }

    public PropertyComparator(final String str, boolean z7) {
        super(z7, new Function() { // from class: cn.hutool.core.comparator.h
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                Comparable lambda$new$0;
                lambda$new$0 = PropertyComparator.lambda$new$0(str, obj);
                return lambda$new$0;
            }
        });
    }
}
