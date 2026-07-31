package kotlin.jvm.internal;

import java.io.Serializable;

/* loaded from: classes.dex */
public abstract class j implements f, Serializable {
    private final int arity;

    public j(int i7) {
        this.arity = i7;
    }

    @Override // kotlin.jvm.internal.f
    public int getArity() {
        return this.arity;
    }

    public String toString() {
        t.f5234a.getClass();
        String a7 = u.a(this);
        i.d(a7, "renderLambdaToString(...)");
        return a7;
    }
}
