package defpackage;

import java.io.FileOutputStream;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class pl0 extends r30 {
    public FileOutputStream m;
    public FileOutputStream n;
    public /* synthetic */ Object o;
    public final /* synthetic */ ql0 p;
    public int q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pl0(ql0 ql0Var, r30 r30Var) {
        super(r30Var);
        this.p = ql0Var;
    }

    @Override // defpackage.hn
    public final Object invokeSuspend(Object obj) {
        this.o = obj;
        this.q |= Integer.MIN_VALUE;
        return this.p.b(null, this);
    }
}
