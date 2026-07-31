package d4;

import android.os.Bundle;

/* loaded from: classes.dex */
final class r extends x {

    /* renamed from: j, reason: collision with root package name */
    final /* synthetic */ Bundle f15712j;

    /* renamed from: k, reason: collision with root package name */
    final /* synthetic */ m0 f15713k;

    /* renamed from: l, reason: collision with root package name */
    final /* synthetic */ g0 f15714l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    r(g0 g0Var, Bundle bundle, m0 m0Var) {
        super(g0Var, true);
        this.f15714l = g0Var;
        this.f15712j = bundle;
        this.f15713k = m0Var;
    }

    @Override // d4.x
    final void a() {
        p0 p0Var;
        p0Var = this.f15714l.f15679i;
        ((p0) r3.o.i(p0Var)).A3(this.f15712j, this.f15713k, this.f15739f);
    }

    @Override // d4.x
    protected final void b() {
        this.f15713k.x2(null);
    }
}
