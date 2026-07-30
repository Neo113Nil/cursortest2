package defpackage;

import androidx.compose.ui.draw.a;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class pb extends o81 implements xt0 {
    public final /* synthetic */ Function0 m;
    public final /* synthetic */ boolean n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pb(Function0 function0, boolean z) {
        super(3);
        this.m = function0;
        this.n = z;
    }

    @Override // defpackage.xt0
    public final Object a(Object obj, Object obj2, Object obj3) {
        vl1 vl1Var = (vl1) obj;
        a00 a00Var = (a00) obj2;
        ((Number) obj3).intValue();
        a00Var.X(-196777734);
        long j = ((kw2) a00Var.j(lw2.a)).a;
        boolean e = a00Var.e(j);
        Function0 function0 = this.m;
        boolean f = e | a00Var.f(function0);
        boolean z = this.n;
        boolean g = f | a00Var.g(z);
        Object M = a00Var.M();
        if (g || M == sz.a) {
            M = new ob(j, function0, z);
            a00Var.i0(M);
        }
        vl1 b = a.b(vl1Var, (Function1) M);
        a00Var.q(false);
        return b;
    }
}
