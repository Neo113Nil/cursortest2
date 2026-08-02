package kotlin.jvm.internal;

import java.io.Serializable;

/* loaded from: classes.dex */
public abstract class j implements f, Serializable {
    private final int arity;

    public j(int i4) {
        this.arity = i4;
    }

    @Override // kotlin.jvm.internal.f
    public int getArity() {
        return this.arity;
    }

    public String toString() {
        q.f14160a.getClass();
        String obj = getClass().getGenericInterfaces()[0].toString();
        if (obj.startsWith("kotlin.jvm.functions.")) {
            obj = obj.substring(21);
        }
        i.d(obj, "renderLambdaToString(...)");
        return obj;
    }
}
