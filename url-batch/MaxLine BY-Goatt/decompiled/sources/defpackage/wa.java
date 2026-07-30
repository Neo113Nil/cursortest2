package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class wa extends o81 implements Function0 {
    public final /* synthetic */ m32 m;
    public final /* synthetic */ Function0 n;
    public final /* synthetic */ p32 o;
    public final /* synthetic */ String p;
    public final /* synthetic */ u81 q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wa(m32 m32Var, Function0 function0, p32 p32Var, String str, u81 u81Var) {
        super(0);
        this.m = m32Var;
        this.n = function0;
        this.o = p32Var;
        this.p = str;
        this.q = u81Var;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        this.m.j(this.n, this.o, this.p, this.q);
        return Unit.a;
    }
}
