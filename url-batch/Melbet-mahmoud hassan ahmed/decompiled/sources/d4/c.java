package d4;

import android.os.Bundle;

/* loaded from: classes.dex */
final class c extends x {

    /* renamed from: j, reason: collision with root package name */
    final /* synthetic */ Bundle f15646j;

    /* renamed from: k, reason: collision with root package name */
    final /* synthetic */ g0 f15647k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    c(g0 g0Var, Bundle bundle) {
        super(g0Var, true);
        this.f15647k = g0Var;
        this.f15646j = bundle;
    }

    @Override // d4.x
    final void a() {
        p0 p0Var;
        p0Var = this.f15647k.f15679i;
        ((p0) r3.o.i(p0Var)).Y0(this.f15646j, this.f15739f);
    }
}
