package defpackage;

import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class i32 extends r30 {
    public j32 m;
    public String n;
    public Function1 o;
    public j10 p;
    public /* synthetic */ Object q;
    public final /* synthetic */ j32 r;
    public int s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i32(j32 j32Var, r30 r30Var) {
        super(r30Var);
        this.r = j32Var;
    }

    @Override // defpackage.hn
    public final Object invokeSuspend(Object obj) {
        this.q = obj;
        this.s |= Integer.MIN_VALUE;
        return this.r.b(null, null, this);
    }
}
