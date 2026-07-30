package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class i30 extends o81 implements Function2 {
    public final /* synthetic */ String m;
    public final /* synthetic */ boolean n;
    public final /* synthetic */ y20 o;
    public final /* synthetic */ Function0 p;
    public final /* synthetic */ int q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i30(String str, boolean z, y20 y20Var, Function0 function0, int i) {
        super(2);
        this.m = str;
        this.n = z;
        this.o = y20Var;
        this.p = function0;
        this.q = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        k30.b(this.m, this.n, this.o, this.p, (a00) obj, s03.R(this.q | 1));
        return Unit.a;
    }
}
