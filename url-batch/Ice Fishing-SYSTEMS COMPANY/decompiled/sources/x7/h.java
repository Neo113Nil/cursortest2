package x7;

import kotlin.jvm.internal.s;
import kotlin.jvm.internal.t;
import v7.InterfaceC5133d;

/* loaded from: classes2.dex */
public abstract class h extends AbstractC5219c implements kotlin.jvm.internal.f {
    private final int arity;

    public h(int i, InterfaceC5133d interfaceC5133d) {
        super(interfaceC5133d);
        this.arity = i;
    }

    @Override // kotlin.jvm.internal.f
    public int getArity() {
        return this.arity;
    }

    @Override // x7.AbstractC5217a
    public String toString() {
        if (getCompletion() != null) {
            return super.toString();
        }
        s.f38862a.getClass();
        String a9 = t.a(this);
        kotlin.jvm.internal.h.d(a9, "renderLambdaToString(...)");
        return a9;
    }
}
