package cn.hutool.core.map;

import cn.hutool.core.collection.CollUtil;
import java.util.Collection;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.Function;

/* loaded from: classes.dex */
public abstract /* synthetic */ class r {
    public static boolean a(s sVar, Object obj, final Object obj2) {
        return ((Boolean) cn.hutool.core.lang.l0.ofNullable(sVar.get(obj)).map(new Function() { // from class: cn.hutool.core.map.j
            @Override // java.util.function.Function
            public final Object apply(Object obj3) {
                Boolean valueOf;
                valueOf = Boolean.valueOf(((k2) obj3).containsChild(obj2));
                return valueOf;
            }
        }).orElse(Boolean.FALSE)).booleanValue();
    }

    public static boolean b(s sVar, Object obj, final Object obj2) {
        return ((Boolean) cn.hutool.core.lang.l0.ofNullable(sVar.get(obj)).map(new Function() { // from class: cn.hutool.core.map.k
            @Override // java.util.function.Function
            public final Object apply(Object obj3) {
                Boolean valueOf;
                valueOf = Boolean.valueOf(((k2) obj3).containsParent(obj2));
                return valueOf;
            }
        }).orElse(Boolean.FALSE)).booleanValue();
    }

    public static Collection c(s sVar, Object obj) {
        return (Collection) cn.hutool.core.lang.l0.ofNullable(sVar.get(obj)).map(new Function() { // from class: cn.hutool.core.map.l
            @Override // java.util.function.Function
            public final Object apply(Object obj2) {
                return ((k2) obj2).getChildren();
            }
        }).map(new m()).orElseGet(new n());
    }

    public static Collection d(s sVar, Object obj) {
        return (Collection) cn.hutool.core.lang.l0.ofNullable(sVar.get(obj)).map(new Function() { // from class: cn.hutool.core.map.q
            @Override // java.util.function.Function
            public final Object apply(Object obj2) {
                return ((k2) obj2).getDeclaredChildren();
            }
        }).map(new m()).orElseGet(new n());
    }

    public static k2 e(s sVar, Object obj) {
        return (k2) cn.hutool.core.lang.l0.ofNullable(sVar.get(obj)).map(new Function() { // from class: cn.hutool.core.map.p
            @Override // java.util.function.Function
            public final Object apply(Object obj2) {
                return ((k2) obj2).getDeclaredParent();
            }
        }).orElse(null);
    }

    public static Object f(s sVar, Object obj) {
        return cn.hutool.core.lang.l0.ofNullable(sVar.get(obj)).map(new Function() { // from class: cn.hutool.core.map.o
            @Override // java.util.function.Function
            public final Object apply(Object obj2) {
                return ((k2) obj2).getValue();
            }
        }).get();
    }

    public static k2 g(s sVar, Object obj, final Object obj2) {
        return (k2) cn.hutool.core.lang.l0.ofNullable(sVar.get(obj)).map(new Function() { // from class: cn.hutool.core.map.i
            @Override // java.util.function.Function
            public final Object apply(Object obj3) {
                k2 parent;
                parent = ((k2) obj3).getParent(obj2);
                return parent;
            }
        }).orElse(null);
    }

    public static k2 h(s sVar, Object obj) {
        return (k2) cn.hutool.core.lang.l0.ofNullable(sVar.get(obj)).map(new Function() { // from class: cn.hutool.core.map.f
            @Override // java.util.function.Function
            public final Object apply(Object obj2) {
                return ((k2) obj2).getRoot();
            }
        }).orElse(null);
    }

    public static Set i(s sVar, Object obj) {
        k2 k2Var = (k2) sVar.get(obj);
        if (cn.hutool.core.util.e0.isNull(k2Var)) {
            return Collections.emptySet();
        }
        LinkedHashSet newLinkedHashSet = CollUtil.newLinkedHashSet(k2Var.getRoot());
        CollUtil.addAll((Collection) newLinkedHashSet, (Iterable) k2Var.getRoot().getChildren().values());
        return newLinkedHashSet;
    }

    public static void j(s sVar, Object obj, Object obj2) {
        sVar.linkNodes(obj, obj2, null);
    }

    public static k2 k(s sVar, Object obj, k2 k2Var) {
        return sVar.putNode(obj, k2Var.getValue());
    }

    public static void m(final s sVar, Map map) {
        if (CollUtil.isEmpty((Map<?, ?>) map)) {
            return;
        }
        map.forEach(new BiConsumer() { // from class: cn.hutool.core.map.h
            @Override // java.util.function.BiConsumer
            public final void accept(Object obj, Object obj2) {
                r.q(s.this, obj, (k2) obj2);
            }
        });
    }

    public static void n(final s sVar, Collection collection, final Function function, final Function function2, final boolean z7) {
        if (CollUtil.isEmpty((Collection<?>) collection)) {
            return;
        }
        collection.forEach(new Consumer() { // from class: cn.hutool.core.map.g
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                r.r(s.this, function, function2, z7, obj);
            }
        });
    }

    public static void o(s sVar, Object obj, Object obj2, Object obj3, Object obj4) {
        sVar.putNode(obj, obj2);
        sVar.putNode(obj3, obj4);
        sVar.linkNodes(obj, obj3);
    }

    public static /* synthetic */ void q(s sVar, Object obj, k2 k2Var) {
        if (!k2Var.hasParent()) {
            sVar.putNode(k2Var.getKey(), k2Var.getValue());
        } else {
            k2 declaredParent = k2Var.getDeclaredParent();
            sVar.putLinkedNodes(declaredParent.getKey(), declaredParent.getValue(), k2Var.getKey(), k2Var.getValue());
        }
    }

    public static /* synthetic */ void r(s sVar, Function function, Function function2, boolean z7, Object obj) {
        Object apply;
        Object apply2;
        apply = function.apply(obj);
        apply2 = function2.apply(obj);
        boolean isNotNull = cn.hutool.core.util.e0.isNotNull(apply);
        boolean isNotNull2 = cn.hutool.core.util.e0.isNotNull(apply2);
        if (!z7 || (isNotNull && isNotNull2)) {
            sVar.linkNodes(apply2, apply);
            ((k2) sVar.get(apply)).setValue(obj);
        } else if (isNotNull || isNotNull2) {
            if (isNotNull) {
                sVar.putNode(apply, obj);
            } else {
                sVar.putNode(apply2, null);
            }
        }
    }
}
