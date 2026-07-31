package d4;

import android.app.Activity;

/* loaded from: classes.dex */
final class d0 extends x {

    /* renamed from: j, reason: collision with root package name */
    final /* synthetic */ Activity f15654j;

    /* renamed from: k, reason: collision with root package name */
    final /* synthetic */ m0 f15655k;

    /* renamed from: l, reason: collision with root package name */
    final /* synthetic */ f0 f15656l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    d0(f0 f0Var, Activity activity, m0 m0Var) {
        super(f0Var.f15667f, true);
        this.f15656l = f0Var;
        this.f15654j = activity;
        this.f15655k = m0Var;
    }

    @Override // d4.x
    final void a() {
        p0 p0Var;
        p0Var = this.f15656l.f15667f.f15679i;
        ((p0) r3.o.i(p0Var)).q2(x3.b.B3(this.f15654j), this.f15655k, this.f15740g);
    }
}
