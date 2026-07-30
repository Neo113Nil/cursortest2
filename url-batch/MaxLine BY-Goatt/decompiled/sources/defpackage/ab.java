package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class ab extends o81 implements Function2 {
    public final /* synthetic */ o32 m;
    public final /* synthetic */ Function0 n;
    public final /* synthetic */ p32 o;
    public final /* synthetic */ my p;
    public final /* synthetic */ int q;
    public final /* synthetic */ int r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ab(o32 o32Var, Function0 function0, p32 p32Var, my myVar, int i, int i2) {
        super(2);
        this.m = o32Var;
        this.n = function0;
        this.o = p32Var;
        this.p = myVar;
        this.q = i;
        this.r = i2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        cb.a(this.m, this.n, this.o, this.p, (a00) obj, s03.R(this.q | 1), this.r);
        return Unit.a;
    }
}
