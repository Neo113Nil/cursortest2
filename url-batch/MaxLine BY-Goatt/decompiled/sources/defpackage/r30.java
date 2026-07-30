package defpackage;

import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.e;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public abstract class r30 extends hn {
    private final CoroutineContext _context;
    private transient o30 intercepted;

    public r30(o30 o30Var) {
        this(o30Var, o30Var != null ? o30Var.getContext() : null);
    }

    @Override // defpackage.o30
    public CoroutineContext getContext() {
        CoroutineContext coroutineContext = this._context;
        coroutineContext.getClass();
        return coroutineContext;
    }

    public final o30 intercepted() {
        o30 o30Var = this.intercepted;
        if (o30Var != null) {
            return o30Var;
        }
        e eVar = (e) getContext().m(e.d);
        o30 pb0Var = eVar != null ? new pb0((t40) eVar, this) : this;
        this.intercepted = pb0Var;
        return pb0Var;
    }

    @Override // defpackage.hn
    public void releaseIntercepted() {
        o30 o30Var = this.intercepted;
        if (o30Var != null && o30Var != this) {
            CoroutineContext.Element m = getContext().m(e.d);
            m.getClass();
            pb0 pb0Var = (pb0) o30Var;
            pb0Var.k();
            fs n = pb0Var.n();
            if (n != null) {
                n.o();
            }
        }
        this.intercepted = fx.m;
    }

    public r30(o30 o30Var, CoroutineContext coroutineContext) {
        super(o30Var);
        this._context = coroutineContext;
    }
}
