package kotlin.coroutines.jvm.internal;

import java.io.Serializable;
import v5.k;
import v5.l;
import v5.q;

/* loaded from: classes.dex */
public abstract class a implements y5.d<Object>, e, Serializable {
    private final y5.d<Object> completion;

    public a(y5.d<Object> dVar) {
        this.completion = dVar;
    }

    public y5.d<q> create(Object obj, y5.d<?> dVar) {
        kotlin.jvm.internal.i.d(dVar, "completion");
        throw new UnsupportedOperationException("create(Any?;Continuation) has not been overridden");
    }

    public y5.d<q> create(y5.d<?> dVar) {
        kotlin.jvm.internal.i.d(dVar, "completion");
        throw new UnsupportedOperationException("create(Continuation) has not been overridden");
    }

    @Override // kotlin.coroutines.jvm.internal.e
    public e getCallerFrame() {
        y5.d<Object> dVar = this.completion;
        if (dVar instanceof e) {
            return (e) dVar;
        }
        return null;
    }

    public final y5.d<Object> getCompletion() {
        return this.completion;
    }

    @Override // kotlin.coroutines.jvm.internal.e
    public StackTraceElement getStackTraceElement() {
        return g.d(this);
    }

    protected abstract Object invokeSuspend(Object obj);

    protected void releaseIntercepted() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // y5.d
    public final void resumeWith(Object obj) {
        Object invokeSuspend;
        Object c7;
        y5.d dVar = this;
        while (true) {
            h.b(dVar);
            a aVar = (a) dVar;
            y5.d dVar2 = aVar.completion;
            kotlin.jvm.internal.i.b(dVar2);
            try {
                invokeSuspend = aVar.invokeSuspend(obj);
                c7 = z5.d.c();
            } catch (Throwable th) {
                k.a aVar2 = v5.k.f22832f;
                obj = v5.k.a(l.a(th));
            }
            if (invokeSuspend == c7) {
                return;
            }
            k.a aVar3 = v5.k.f22832f;
            obj = v5.k.a(invokeSuspend);
            aVar.releaseIntercepted();
            if (!(dVar2 instanceof a)) {
                dVar2.resumeWith(obj);
                return;
            }
            dVar = dVar2;
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Continuation at ");
        Object stackTraceElement = getStackTraceElement();
        if (stackTraceElement == null) {
            stackTraceElement = getClass().getName();
        }
        sb.append(stackTraceElement);
        return sb.toString();
    }
}
