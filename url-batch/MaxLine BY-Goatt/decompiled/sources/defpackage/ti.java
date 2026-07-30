package defpackage;

import java.util.List;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class ti extends r30 {
    public List m;
    public m92 n;
    public int o;
    public int p;
    public /* synthetic */ Object q;
    public final /* synthetic */ ui r;
    public int s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ti(ui uiVar, r30 r30Var) {
        super(r30Var);
        this.r = uiVar;
    }

    @Override // defpackage.hn
    public final Object invokeSuspend(Object obj) {
        this.q = obj;
        this.s |= Integer.MIN_VALUE;
        return this.r.a(this);
    }
}
