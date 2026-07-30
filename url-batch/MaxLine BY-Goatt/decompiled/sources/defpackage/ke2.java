package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class ke2 extends o81 implements Function2 {
    public final /* synthetic */ int m;
    public final /* synthetic */ Function2 n;
    public final /* synthetic */ my o;
    public final /* synthetic */ Function2 p;
    public final /* synthetic */ Function2 q;
    public final /* synthetic */ z63 r;
    public final /* synthetic */ my s;
    public final /* synthetic */ int t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ke2(int i, Function2 function2, my myVar, Function2 function22, Function2 function23, z63 z63Var, my myVar2, int i2) {
        super(2);
        this.m = i;
        this.n = function2;
        this.o = myVar;
        this.p = function22;
        this.q = function23;
        this.r = z63Var;
        this.s = myVar2;
        this.t = i2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        j8.h(this.m, this.n, this.o, this.p, this.q, this.r, this.s, (a00) obj, s03.R(this.t | 1));
        return Unit.a;
    }
}
