package defpackage;

import kotlin.coroutines.CoroutineContext;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class go2 implements o30, c50 {
    public final o30 m;
    public final CoroutineContext n;

    public go2(o30 o30Var, CoroutineContext coroutineContext) {
        this.m = o30Var;
        this.n = coroutineContext;
    }

    @Override // defpackage.c50
    public final c50 getCallerFrame() {
        o30 o30Var = this.m;
        if (o30Var instanceof c50) {
            return (c50) o30Var;
        }
        return null;
    }

    @Override // defpackage.o30
    public final CoroutineContext getContext() {
        return this.n;
    }

    @Override // defpackage.o30
    public final void resumeWith(Object obj) {
        this.m.resumeWith(obj);
    }
}
