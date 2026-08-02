package dev.zacsweers.metro.internal;

import java.util.Map;
import kotlin.collections.EmptyMap;

/* loaded from: classes.dex */
public abstract class AbstractMapFactory implements Factory {
    public final Map contributingMap;

    static {
        EmptyMap.INSTANCE.getClass();
    }

    public AbstractMapFactory(Map map) {
        this.contributingMap = BaseDoubleCheckKt.toUnmodifiableMap(map);
    }
}
