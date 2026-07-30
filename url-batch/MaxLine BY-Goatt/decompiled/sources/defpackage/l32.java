package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class l32 extends o81 implements Function0 {
    public final /* synthetic */ b82 m;
    public final /* synthetic */ m32 n;
    public final /* synthetic */ u31 o;
    public final /* synthetic */ long p;
    public final /* synthetic */ long q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l32(b82 b82Var, m32 m32Var, u31 u31Var, long j, long j2) {
        super(0);
        this.m = b82Var;
        this.n = m32Var;
        this.o = u31Var;
        this.p = j;
        this.q = j2;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        m32 m32Var = this.n;
        this.m.m = m32Var.getPositionProvider().a(this.o, this.p, m32Var.getParentLayoutDirection(), this.q);
        return Unit.a;
    }
}
