package defpackage;

import java.io.Serializable;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class e70 extends r30 {
    public Object m;
    public Object n;
    public Serializable o;
    public c82 p;
    public boolean q;
    public int r;
    public /* synthetic */ Object s;
    public final /* synthetic */ i70 t;
    public int u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e70(i70 i70Var, r30 r30Var) {
        super(r30Var);
        this.t = i70Var;
    }

    @Override // defpackage.hn
    public final Object invokeSuspend(Object obj) {
        this.s = obj;
        this.u |= Integer.MIN_VALUE;
        return i70.g(this.t, false, this);
    }
}
