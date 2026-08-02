package kotlin.reflect.jvm.internal.impl.util;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.jvm.functions.Function1;
import kotlin.reflect.KClass;
import kotlinx.coroutines.tasks.TasksKt$awaitImpl$2$2;

/* loaded from: classes9.dex */
public abstract class TypeRegistry<K, V> {
    public final ConcurrentHashMap idPerType = new ConcurrentHashMap();
    public final AtomicInteger idCounter = new AtomicInteger(0);

    public final Map<String, Integer> allValuesThreadUnsafeForRendering() {
        return this.idPerType;
    }

    public abstract int customComputeIfAbsent(ConcurrentHashMap<String, Integer> concurrentHashMap, String str, Function1<? super String, Integer> function1);

    public final <T extends V, KK extends K> NullableArrayMapAccessor<K, V, T> generateNullableAccessor(KClass kClass) {
        kClass.getClass();
        return new NullableArrayMapAccessor<>(getId(kClass));
    }

    public final int getId(String str) {
        str.getClass();
        return customComputeIfAbsent(this.idPerType, str, new TasksKt$awaitImpl$2$2(this, 24));
    }

    public final <T extends K> int getId(KClass kClass) {
        kClass.getClass();
        String qualifiedName = kClass.getQualifiedName();
        qualifiedName.getClass();
        return getId(qualifiedName);
    }
}
