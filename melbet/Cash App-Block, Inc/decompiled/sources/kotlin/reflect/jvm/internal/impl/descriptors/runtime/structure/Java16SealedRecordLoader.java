package kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure;

import java.lang.reflect.Method;

/* loaded from: classes9.dex */
public final class Java16SealedRecordLoader {
    public static final Java16SealedRecordLoader INSTANCE = new Java16SealedRecordLoader();
    public static Cache _cache;

    public static final class Cache {
        public final Method getPermittedSubclasses;
        public final Method getRecordComponents;
        public final Method isRecord;
        public final Method isSealed;

        public Cache(Method method, Method method2, Method method3, Method method4) {
            this.isSealed = method;
            this.getPermittedSubclasses = method2;
            this.isRecord = method3;
            this.getRecordComponents = method4;
        }

        public final Method getGetPermittedSubclasses() {
            return this.getPermittedSubclasses;
        }

        public final Method getGetRecordComponents() {
            return this.getRecordComponents;
        }

        public final Method isRecord() {
            return this.isRecord;
        }

        public final Method isSealed() {
            return this.isSealed;
        }
    }

    public static Cache initCache() {
        Cache cache;
        Cache cache2 = _cache;
        if (cache2 != null) {
            return cache2;
        }
        try {
            cache = new Cache(Class.class.getMethod("isSealed", null), Class.class.getMethod("getPermittedSubclasses", null), Class.class.getMethod("isRecord", null), Class.class.getMethod("getRecordComponents", null));
        } catch (NoSuchMethodException unused) {
            cache = new Cache(null, null, null, null);
        }
        _cache = cache;
        return cache;
    }

    public final Class<?>[] loadGetPermittedSubclasses(Class<?> cls) {
        cls.getClass();
        Method getPermittedSubclasses = initCache().getGetPermittedSubclasses();
        if (getPermittedSubclasses == null) {
            return null;
        }
        Object invoke = getPermittedSubclasses.invoke(cls, null);
        invoke.getClass();
        return (Class[]) invoke;
    }

    public final Object[] loadGetRecordComponents(Class<?> cls) {
        cls.getClass();
        Method getRecordComponents = initCache().getGetRecordComponents();
        if (getRecordComponents == null) {
            return null;
        }
        return (Object[]) getRecordComponents.invoke(cls, null);
    }

    public final Boolean loadIsRecord(Class<?> cls) {
        cls.getClass();
        Method isRecord = initCache().isRecord();
        if (isRecord == null) {
            return null;
        }
        Object invoke = isRecord.invoke(cls, null);
        invoke.getClass();
        return (Boolean) invoke;
    }

    public final Boolean loadIsSealed(Class<?> cls) {
        cls.getClass();
        Method isSealed = initCache().isSealed();
        if (isSealed == null) {
            return null;
        }
        Object invoke = isSealed.invoke(cls, null);
        invoke.getClass();
        return (Boolean) invoke;
    }
}
