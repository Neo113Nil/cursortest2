package kotlin.reflect.jvm.internal.impl.load.java;

import java.util.Map;
import kotlin.reflect.jvm.internal.impl.name.FqName;
import kotlin.reflect.jvm.internal.impl.storage.LockBasedStorageManager;
import kotlin.reflect.jvm.internal.impl.storage.MemoizedFunctionToNullable;
import kotlinx.coroutines.tasks.TasksKt$awaitImpl$2$2;

/* loaded from: classes9.dex */
public final class NullabilityAnnotationStatesImpl<T> implements NullabilityAnnotationStates<T> {
    public final MemoizedFunctionToNullable cache;
    public final Map states;

    public NullabilityAnnotationStatesImpl(Map<FqName, ? extends T> map) {
        map.getClass();
        this.states = map;
        MemoizedFunctionToNullable createMemoizedFunctionWithNullableValues = new LockBasedStorageManager("Java nullability annotation states").createMemoizedFunctionWithNullableValues(new TasksKt$awaitImpl$2$2(this, 6));
        createMemoizedFunctionWithNullableValues.getClass();
        this.cache = createMemoizedFunctionWithNullableValues;
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.NullabilityAnnotationStates
    public T get(FqName fqName) {
        fqName.getClass();
        return (T) this.cache.invoke(fqName);
    }
}
