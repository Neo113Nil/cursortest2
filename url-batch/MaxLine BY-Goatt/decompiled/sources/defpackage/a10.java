package defpackage;

import java.io.Serializable;
import kotlin.coroutines.CoroutineContext;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class a10 extends r30 {
    public Object m;
    public Serializable n;
    public a32 o;
    public c82 p;
    public CoroutineContext q;
    public c82 r;
    public boolean s;
    public /* synthetic */ Object t;
    public final /* synthetic */ b10 u;
    public int v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a10(b10 b10Var, r30 r30Var) {
        super(r30Var);
        this.u = b10Var;
    }

    @Override // defpackage.hn
    public final Object invokeSuspend(Object obj) {
        this.t = obj;
        this.v |= Integer.MIN_VALUE;
        return this.u.g(false, null, this);
    }
}
