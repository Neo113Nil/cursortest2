package q5;

import kotlin.jvm.internal.i;
import kotlin.jvm.internal.t;
import kotlin.jvm.internal.u;
import o5.InterfaceC0564d;

/* loaded from: classes.dex */
public abstract class g extends AbstractC0607c implements kotlin.jvm.internal.f {
    private final int arity;

    public g(int i7, InterfaceC0564d interfaceC0564d) {
        super(interfaceC0564d);
        this.arity = i7;
    }

    @Override // kotlin.jvm.internal.f
    public int getArity() {
        return this.arity;
    }

    @Override // q5.AbstractC0605a
    public String toString() {
        if (getCompletion() != null) {
            return super.toString();
        }
        t.f5234a.getClass();
        String a7 = u.a(this);
        i.d(a7, "renderLambdaToString(...)");
        return a7;
    }
}
