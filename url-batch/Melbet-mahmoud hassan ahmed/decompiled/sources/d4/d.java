package d4;

import android.os.Bundle;

/* loaded from: classes.dex */
final class d extends x {

    /* renamed from: j, reason: collision with root package name */
    final /* synthetic */ String f15650j;

    /* renamed from: k, reason: collision with root package name */
    final /* synthetic */ String f15651k;

    /* renamed from: l, reason: collision with root package name */
    final /* synthetic */ Bundle f15652l;

    /* renamed from: m, reason: collision with root package name */
    final /* synthetic */ g0 f15653m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    d(g0 g0Var, String str, String str2, Bundle bundle) {
        super(g0Var, true);
        this.f15653m = g0Var;
        this.f15650j = str;
        this.f15651k = str2;
        this.f15652l = bundle;
    }

    @Override // d4.x
    final void a() {
        p0 p0Var;
        p0Var = this.f15653m.f15679i;
        ((p0) r3.o.i(p0Var)).l2(this.f15650j, this.f15651k, this.f15652l);
    }
}
