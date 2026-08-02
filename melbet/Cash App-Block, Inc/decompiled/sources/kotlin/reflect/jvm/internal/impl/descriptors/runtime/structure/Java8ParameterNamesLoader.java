package kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure;

import java.lang.reflect.Method;

/* loaded from: classes9.dex */
public final class Java8ParameterNamesLoader {
    public static final Java8ParameterNamesLoader INSTANCE = new Java8ParameterNamesLoader();
    public static Cache cache;

    public final class Cache {
        public final Method getName;
        public final Method getParameters;

        public Cache(Method method, Method method2) {
            this.getParameters = method;
            this.getName = method2;
        }

        public final Method getGetName() {
            return this.getName;
        }

        public final Method getGetParameters() {
            return this.getParameters;
        }
    }
}
