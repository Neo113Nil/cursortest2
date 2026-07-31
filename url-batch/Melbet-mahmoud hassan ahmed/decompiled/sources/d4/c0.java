package d4;

import android.app.Activity;

/* loaded from: classes.dex */
final class c0 extends x {

    /* renamed from: j, reason: collision with root package name */
    final /* synthetic */ Activity f15648j;

    /* renamed from: k, reason: collision with root package name */
    final /* synthetic */ f0 f15649k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    c0(f0 f0Var, Activity activity) {
        super(f0Var.f15667f, true);
        this.f15649k = f0Var;
        this.f15648j = activity;
    }

    @Override // d4.x
    final void a() {
        p0 p0Var;
        p0Var = this.f15649k.f15667f.f15679i;
        ((p0) r3.o.i(p0Var)).p4(x3.b.B3(this.f15648j), this.f15740g);
    }
}
