package defpackage;

import kotlin.jvm.functions.Function1;
import kotlin.ranges.d;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class oa2 extends o81 implements Function1 {
    public final /* synthetic */ int m;
    public final /* synthetic */ pa2 n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ oa2(pa2 pa2Var, int i) {
        super(1);
        this.m = i;
        this.n = pa2Var;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.m;
        pa2 pa2Var = this.n;
        switch (i) {
            case 0:
                return Double.valueOf(pa2Var.n.b(d.a(((Number) obj).doubleValue(), pa2Var.e, pa2Var.f)));
            default:
                return Double.valueOf(d.a(pa2Var.k.b(((Number) obj).doubleValue()), pa2Var.e, pa2Var.f));
        }
    }
}
