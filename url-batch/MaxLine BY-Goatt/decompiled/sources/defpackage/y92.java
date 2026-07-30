package defpackage;

import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.h;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public abstract class y92 extends hn {
    public y92(o30 o30Var) {
        super(o30Var);
        if (o30Var == null || o30Var.getContext() == h.m) {
            return;
        }
        lh.e("Coroutines with restricted suspension must have EmptyCoroutineContext");
        throw null;
    }

    @Override // defpackage.o30
    public final CoroutineContext getContext() {
        return h.m;
    }
}
