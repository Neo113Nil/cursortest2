package retrofit2;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: classes3.dex */
public final class Invocation {
    public final List arguments;
    public final Object instance;
    public final Method method;
    public final Class service;

    public Invocation(Class cls, Object obj, Method method, ArrayList arrayList) {
        this.service = cls;
        this.instance = obj;
        this.method = method;
        this.arguments = Collections.unmodifiableList(arrayList);
    }

    public final String toString() {
        return String.format("%s.%s() %s", this.service.getName(), this.method.getName(), this.arguments);
    }
}
