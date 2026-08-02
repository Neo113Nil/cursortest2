package kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure;

import java.lang.reflect.Method;

/* loaded from: classes9.dex */
public final class Java16RecordComponentsLoader$Cache {
    public final Method getAccessor;
    public final Method getType;

    public Java16RecordComponentsLoader$Cache(Method method, Method method2) {
        this.getType = method;
        this.getAccessor = method2;
    }

    public final Method getGetAccessor() {
        return this.getAccessor;
    }

    public final Method getGetType() {
        return this.getType;
    }
}
