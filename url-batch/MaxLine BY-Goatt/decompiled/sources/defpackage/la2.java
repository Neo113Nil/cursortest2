package defpackage;

import kotlin.ranges.d;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final /* synthetic */ class la2 implements nc0 {
    public final /* synthetic */ int m;
    public final /* synthetic */ pa2 n;

    public /* synthetic */ la2(pa2 pa2Var, int i) {
        this.m = i;
        this.n = pa2Var;
    }

    @Override // defpackage.nc0
    public final double b(double d) {
        int i = this.m;
        pa2 pa2Var = this.n;
        switch (i) {
            case 0:
                return d.a(pa2Var.k.b(d), pa2Var.e, pa2Var.f);
            default:
                return pa2Var.n.b(d.a(d, pa2Var.e, pa2Var.f));
        }
    }
}
