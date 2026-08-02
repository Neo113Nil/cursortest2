package defpackage;

import java.io.Serializable;
import java.util.Objects;

/* compiled from: PG */
/* loaded from: classes2.dex */
public abstract class kqu implements Serializable, kqj, kqx {
    public final kqj k;

    public kqu(kqj kqjVar) {
        this.k = kqjVar;
    }

    protected abstract Object b(Object obj);

    public kqj c(Object obj, kqj kqjVar) {
        throw new UnsupportedOperationException("create(Any?;Continuation) has not been overridden");
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.kqj
    public final void ca(Object obj) {
        while (true) {
            this.getClass();
            kqu kquVar = this;
            kqj kqjVar = kquVar.k;
            kqjVar.getClass();
            try {
                obj = kquVar.b(obj);
                if (obj == kqp.a) {
                    return;
                }
            } catch (Throwable th) {
                obj = ixc.X(th);
            }
            kquVar.h();
            if (!(kqjVar instanceof kqu)) {
                kqjVar.ca(obj);
                return;
            }
            this = kqjVar;
        }
    }

    @Override // defpackage.kqx
    public StackTraceElement f() {
        return null;
    }

    @Override // defpackage.kqx
    public kqx g() {
        kqj kqjVar = this.k;
        if (kqjVar instanceof kqx) {
            return (kqx) kqjVar;
        }
        return null;
    }

    public String toString() {
        String name = getClass().getName();
        Objects.toString(name);
        return "Continuation at ".concat(String.valueOf(name));
    }

    protected void h() {
    }
}
