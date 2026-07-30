package androidx.collection;

import kotlin.jvm.internal.s;

/* loaded from: classes.dex */
public final class FloatObjectMapKt {
    private static final MutableFloatObjectMap EmptyFloatObjectMap = new MutableFloatObjectMap(0);

    public static final <V> FloatObjectMap<V> emptyFloatObjectMap() {
        MutableFloatObjectMap mutableFloatObjectMap = EmptyFloatObjectMap;
        s.checkNotNull(mutableFloatObjectMap, "null cannot be cast to non-null type androidx.collection.FloatObjectMap<V of androidx.collection.FloatObjectMapKt.emptyFloatObjectMap>");
        return mutableFloatObjectMap;
    }

    public static final <V> FloatObjectMap<V> floatObjectMapOf() {
        MutableFloatObjectMap mutableFloatObjectMap = EmptyFloatObjectMap;
        s.checkNotNull(mutableFloatObjectMap, "null cannot be cast to non-null type androidx.collection.FloatObjectMap<V of androidx.collection.FloatObjectMapKt.floatObjectMapOf>");
        return mutableFloatObjectMap;
    }

    public static final <V> MutableFloatObjectMap<V> mutableFloatObjectMapOf() {
        return new MutableFloatObjectMap<>(0, 1, null);
    }

    public static final <V> FloatObjectMap<V> floatObjectMapOf(float f8, V v7) {
        MutableFloatObjectMap mutableFloatObjectMap = new MutableFloatObjectMap(0, 1, null);
        mutableFloatObjectMap.set(f8, v7);
        return mutableFloatObjectMap;
    }

    public static final <V> MutableFloatObjectMap<V> mutableFloatObjectMapOf(float f8, V v7) {
        MutableFloatObjectMap<V> mutableFloatObjectMap = new MutableFloatObjectMap<>(0, 1, null);
        mutableFloatObjectMap.set(f8, v7);
        return mutableFloatObjectMap;
    }

    public static final <V> FloatObjectMap<V> floatObjectMapOf(float f8, V v7, float f9, V v8) {
        MutableFloatObjectMap mutableFloatObjectMap = new MutableFloatObjectMap(0, 1, null);
        mutableFloatObjectMap.set(f8, v7);
        mutableFloatObjectMap.set(f9, v8);
        return mutableFloatObjectMap;
    }

    public static final <V> MutableFloatObjectMap<V> mutableFloatObjectMapOf(float f8, V v7, float f9, V v8) {
        MutableFloatObjectMap<V> mutableFloatObjectMap = new MutableFloatObjectMap<>(0, 1, null);
        mutableFloatObjectMap.set(f8, v7);
        mutableFloatObjectMap.set(f9, v8);
        return mutableFloatObjectMap;
    }

    public static final <V> FloatObjectMap<V> floatObjectMapOf(float f8, V v7, float f9, V v8, float f10, V v9) {
        MutableFloatObjectMap mutableFloatObjectMap = new MutableFloatObjectMap(0, 1, null);
        mutableFloatObjectMap.set(f8, v7);
        mutableFloatObjectMap.set(f9, v8);
        mutableFloatObjectMap.set(f10, v9);
        return mutableFloatObjectMap;
    }

    public static final <V> MutableFloatObjectMap<V> mutableFloatObjectMapOf(float f8, V v7, float f9, V v8, float f10, V v9) {
        MutableFloatObjectMap<V> mutableFloatObjectMap = new MutableFloatObjectMap<>(0, 1, null);
        mutableFloatObjectMap.set(f8, v7);
        mutableFloatObjectMap.set(f9, v8);
        mutableFloatObjectMap.set(f10, v9);
        return mutableFloatObjectMap;
    }

    public static final <V> FloatObjectMap<V> floatObjectMapOf(float f8, V v7, float f9, V v8, float f10, V v9, float f11, V v10) {
        MutableFloatObjectMap mutableFloatObjectMap = new MutableFloatObjectMap(0, 1, null);
        mutableFloatObjectMap.set(f8, v7);
        mutableFloatObjectMap.set(f9, v8);
        mutableFloatObjectMap.set(f10, v9);
        mutableFloatObjectMap.set(f11, v10);
        return mutableFloatObjectMap;
    }

    public static final <V> MutableFloatObjectMap<V> mutableFloatObjectMapOf(float f8, V v7, float f9, V v8, float f10, V v9, float f11, V v10) {
        MutableFloatObjectMap<V> mutableFloatObjectMap = new MutableFloatObjectMap<>(0, 1, null);
        mutableFloatObjectMap.set(f8, v7);
        mutableFloatObjectMap.set(f9, v8);
        mutableFloatObjectMap.set(f10, v9);
        mutableFloatObjectMap.set(f11, v10);
        return mutableFloatObjectMap;
    }

    public static final <V> FloatObjectMap<V> floatObjectMapOf(float f8, V v7, float f9, V v8, float f10, V v9, float f11, V v10, float f12, V v11) {
        MutableFloatObjectMap mutableFloatObjectMap = new MutableFloatObjectMap(0, 1, null);
        mutableFloatObjectMap.set(f8, v7);
        mutableFloatObjectMap.set(f9, v8);
        mutableFloatObjectMap.set(f10, v9);
        mutableFloatObjectMap.set(f11, v10);
        mutableFloatObjectMap.set(f12, v11);
        return mutableFloatObjectMap;
    }

    public static final <V> MutableFloatObjectMap<V> mutableFloatObjectMapOf(float f8, V v7, float f9, V v8, float f10, V v9, float f11, V v10, float f12, V v11) {
        MutableFloatObjectMap<V> mutableFloatObjectMap = new MutableFloatObjectMap<>(0, 1, null);
        mutableFloatObjectMap.set(f8, v7);
        mutableFloatObjectMap.set(f9, v8);
        mutableFloatObjectMap.set(f10, v9);
        mutableFloatObjectMap.set(f11, v10);
        mutableFloatObjectMap.set(f12, v11);
        return mutableFloatObjectMap;
    }
}
