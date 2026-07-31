package kotlin.coroutines.jvm.internal;

import kotlin.jvm.internal.l;

/* loaded from: classes.dex */
public abstract class k extends d implements kotlin.jvm.internal.f<Object> {
    private final int arity;

    public k(int i7) {
        this(i7, null);
    }

    public k(int i7, y5.d<Object> dVar) {
        super(dVar);
        this.arity = i7;
    }

    @Override // kotlin.jvm.internal.f
    public int getArity() {
        return this.arity;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public String toString() {
        if (getCompletion() != null) {
            return super.toString();
        }
        String d7 = l.d(this);
        kotlin.jvm.internal.i.c(d7, "renderLambdaToString(this)");
        return d7;
    }
}
