package kotlinx.coroutines.internal;

import m6.q0;

/* loaded from: classes.dex */
public abstract class u {
    public abstract c<?> a();

    public final boolean b(u uVar) {
        c<?> a7;
        c<?> a8 = a();
        return (a8 == null || (a7 = uVar.a()) == null || a8.f() >= a7.f()) ? false : true;
    }

    public abstract Object c(Object obj);

    public String toString() {
        return q0.a(this) + '@' + q0.b(this);
    }
}
