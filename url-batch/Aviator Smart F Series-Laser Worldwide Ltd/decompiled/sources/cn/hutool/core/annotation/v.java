package cn.hutool.core.annotation;

import java.util.Map;
import java.util.function.BiConsumer;
import java.util.function.Function;

/* loaded from: classes.dex */
public class v implements u2 {
    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$process$0(Map map, cn.hutool.core.map.s sVar, String str, g0 g0Var) {
        String str2 = (String) cn.hutool.core.lang.l0.ofNullable(g0Var.getAnnotation(p.class)).map(new Function() { // from class: cn.hutool.core.annotation.q
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return ((p) obj).value();
            }
        }).orElse(null);
        if (cn.hutool.core.util.e0.isNull(str2)) {
            return;
        }
        g0 g0Var2 = (g0) map.get(str2);
        cn.hutool.core.lang.q.notNull(g0Var2, "no method for alias: [{}]", str2);
        sVar.putLinkedNodes(str2, g0Var2, str, g0Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$process$1(final cn.hutool.core.map.s sVar, Map map, String str, g0 g0Var) {
        cn.hutool.core.lang.l0 ofNullable = cn.hutool.core.lang.l0.ofNullable(str);
        sVar.getClass();
        g0 g0Var2 = (g0) ofNullable.map(new Function() { // from class: cn.hutool.core.annotation.r
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return cn.hutool.core.map.s.this.getRootNode((String) obj);
            }
        }).map(new Function() { // from class: cn.hutool.core.annotation.s
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return (g0) ((cn.hutool.core.map.k2) obj).getValue();
            }
        }).orElse(g0Var);
        cn.hutool.core.lang.q.isTrue(cn.hutool.core.util.e0.isNull(g0Var2) || cn.hutool.core.util.p.isAssignable(g0Var.getAttributeType(), g0Var2.getAttributeType()), "return type of the root alias method [{}] is inconsistent with the original [{}]", g0Var2.getClass(), g0Var.getAttributeType());
        if (g0Var != g0Var2) {
            map.put(str, new m1(g0Var, g0Var2));
        }
    }

    @Override // cn.hutool.core.annotation.u2
    public /* bridge */ /* synthetic */ int compareTo(u2 u2Var) {
        return t2.a(this, u2Var);
    }

    @Override // cn.hutool.core.annotation.u2
    public int order() {
        return Integer.MIN_VALUE;
    }

    @Override // cn.hutool.core.annotation.u2
    public void process(r2 r2Var, i0 i0Var) {
        final Map<String, g0> attributes = r2Var.getAttributes();
        final cn.hutool.core.map.c0 c0Var = new cn.hutool.core.map.c0(false);
        attributes.forEach(new BiConsumer() { // from class: cn.hutool.core.annotation.t
            @Override // java.util.function.BiConsumer
            public final void accept(Object obj, Object obj2) {
                v.lambda$process$0(attributes, c0Var, (String) obj, (g0) obj2);
            }
        });
        attributes.forEach(new BiConsumer() { // from class: cn.hutool.core.annotation.u
            @Override // java.util.function.BiConsumer
            public final void accept(Object obj, Object obj2) {
                v.lambda$process$1(cn.hutool.core.map.s.this, attributes, (String) obj, (g0) obj2);
            }
        });
        r2Var.setAttributes(attributes);
    }

    @Override // cn.hutool.core.annotation.u2, java.lang.Comparable
    public /* bridge */ /* synthetic */ int compareTo(Object obj) {
        int compareTo;
        compareTo = compareTo((u2) obj);
        return compareTo;
    }
}
