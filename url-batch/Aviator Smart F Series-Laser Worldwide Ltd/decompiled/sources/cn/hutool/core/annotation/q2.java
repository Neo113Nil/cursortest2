package cn.hutool.core.annotation;

import cn.hutool.core.collection.CollUtil;
import java.util.Map;
import java.util.function.BiConsumer;

/* loaded from: classes.dex */
public abstract /* synthetic */ class q2 {
    public static /* bridge */ /* synthetic */ int b(r2 r2Var, Object obj) {
        int compareTo;
        compareTo = r2Var.compareTo((i2) obj);
        return compareTo;
    }

    public static void c(final r2 r2Var, Map map) {
        if (CollUtil.isNotEmpty((Map<?, ?>) map)) {
            map.forEach(new BiConsumer() { // from class: cn.hutool.core.annotation.p2
                @Override // java.util.function.BiConsumer
                public final void accept(Object obj, Object obj2) {
                    r2.this.setAttribute((String) obj, (g0) obj2);
                }
            });
        }
    }
}
