package kotlin.jvm.internal;

import java.io.Serializable;

/* loaded from: classes.dex */
public abstract class j<R> implements f<R>, Serializable {
    private final int arity;

    public j(int i7) {
        this.arity = i7;
    }

    @Override // kotlin.jvm.internal.f
    public int getArity() {
        return this.arity;
    }

    public String toString() {
        String e7 = l.e(this);
        i.c(e7, "renderLambdaToString(this)");
        return e7;
    }
}
