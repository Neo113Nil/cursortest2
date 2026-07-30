package cn.hutool.core.map;

import java.util.Map;
import java.util.function.Consumer;

/* loaded from: classes.dex */
public interface k2 extends Map.Entry {
    boolean containsChild(Object obj);

    boolean containsParent(Object obj);

    @Override // java.util.Map.Entry
    boolean equals(Object obj);

    void forEachChild(boolean z7, Consumer<k2> consumer);

    k2 getChild(Object obj);

    Map<Object, k2> getChildren();

    Map<Object, k2> getDeclaredChildren();

    k2 getDeclaredParent();

    k2 getParent(Object obj);

    k2 getRoot();

    int getWeight();

    boolean hasChildren();

    boolean hasParent();

    @Override // java.util.Map.Entry
    int hashCode();
}
