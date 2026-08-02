package h3;

import f3.InterfaceC0425c;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.q;

/* loaded from: classes.dex */
public abstract class g extends c implements kotlin.jvm.internal.f {
    private final int arity;

    public g(int i4, InterfaceC0425c interfaceC0425c) {
        super(interfaceC0425c);
        this.arity = i4;
    }

    @Override // kotlin.jvm.internal.f
    public int getArity() {
        return this.arity;
    }

    @Override // h3.AbstractC0448a
    public String toString() {
        if (getCompletion() != null) {
            return super.toString();
        }
        q.f14160a.getClass();
        String obj = getClass().getGenericInterfaces()[0].toString();
        if (obj.startsWith("kotlin.jvm.functions.")) {
            obj = obj.substring(21);
        }
        i.d(obj, "renderLambdaToString(...)");
        return obj;
    }
}
