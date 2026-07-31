package d4;

import android.app.Activity;

/* loaded from: classes.dex */
final class a0 extends x {

    /* renamed from: j, reason: collision with root package name */
    final /* synthetic */ Activity f15642j;

    /* renamed from: k, reason: collision with root package name */
    final /* synthetic */ f0 f15643k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    a0(f0 f0Var, Activity activity) {
        super(f0Var.f15667f, true);
        this.f15643k = f0Var;
        this.f15642j = activity;
    }

    @Override // d4.x
    final void a() {
        p0 p0Var;
        p0Var = this.f15643k.f15667f.f15679i;
        ((p0) r3.o.i(p0Var)).N5(x3.b.B3(this.f15642j), this.f15740g);
    }
}
