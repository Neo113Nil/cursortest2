package defpackage;

import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class em2 extends r30 {
    public Function1 m;
    public /* synthetic */ Object n;
    public final /* synthetic */ im2 o;
    public int p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public em2(im2 im2Var, r30 r30Var) {
        super(r30Var);
        this.o = im2Var;
    }

    @Override // defpackage.hn
    public final Object invokeSuspend(Object obj) {
        this.n = obj;
        this.p |= Integer.MIN_VALUE;
        return this.o.c(null, 0.0f, null, this);
    }
}
