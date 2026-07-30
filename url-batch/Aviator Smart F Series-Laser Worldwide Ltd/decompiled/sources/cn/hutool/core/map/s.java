package cn.hutool.core.map;

import java.util.Collection;
import java.util.Map;
import java.util.Set;
import java.util.function.BiConsumer;
import java.util.function.Function;

/* loaded from: classes.dex */
public interface s extends Map {
    @Override // java.util.Map
    void clear();

    boolean containsChildNode(Object obj, Object obj2);

    boolean containsParentNode(Object obj, Object obj2);

    Collection<k2> getChildNodes(Object obj);

    Collection<k2> getDeclaredChildNodes(Object obj);

    k2 getDeclaredParentNode(Object obj);

    Object getNodeValue(Object obj);

    k2 getParentNode(Object obj, Object obj2);

    k2 getRootNode(Object obj);

    Set<k2> getTreeNodes(Object obj);

    void linkNodes(Object obj, Object obj2);

    void linkNodes(Object obj, Object obj2, BiConsumer<k2, k2> biConsumer);

    k2 put(Object obj, k2 k2Var);

    @Override // java.util.Map
    /* bridge */ /* synthetic */ Object put(Object obj, Object obj2);

    @Override // java.util.Map
    void putAll(Map<Object, ? extends k2> map);

    <C extends Collection<Object>> void putAllNode(C c8, Function<Object, Object> function, Function<Object, Object> function2, boolean z7);

    void putLinkedNodes(Object obj, Object obj2, Object obj3);

    void putLinkedNodes(Object obj, Object obj2, Object obj3, Object obj4);

    k2 putNode(Object obj, Object obj2);

    @Override // java.util.Map
    k2 remove(Object obj);

    @Override // java.util.Map
    /* bridge */ /* synthetic */ Object remove(Object obj);

    void unlinkNode(Object obj, Object obj2);
}
