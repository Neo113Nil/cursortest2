package d4;

import android.os.Bundle;

/* loaded from: classes.dex */
final class g extends x {

    /* renamed from: j, reason: collision with root package name */
    final /* synthetic */ Bundle f15668j;

    /* renamed from: k, reason: collision with root package name */
    final /* synthetic */ g0 f15669k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    g(g0 g0Var, Bundle bundle) {
        super(g0Var, true);
        this.f15669k = g0Var;
        this.f15668j = bundle;
    }

    @Override // d4.x
    final void a() {
        p0 p0Var;
        p0Var = this.f15669k.f15679i;
        ((p0) r3.o.i(p0Var)).W3(this.f15668j, this.f15739f);
    }
}
