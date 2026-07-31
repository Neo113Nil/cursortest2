package d4;

import android.app.Activity;

/* loaded from: classes.dex */
final class f extends x {

    /* renamed from: j, reason: collision with root package name */
    final /* synthetic */ Activity f15663j;

    /* renamed from: k, reason: collision with root package name */
    final /* synthetic */ String f15664k;

    /* renamed from: l, reason: collision with root package name */
    final /* synthetic */ String f15665l;

    /* renamed from: m, reason: collision with root package name */
    final /* synthetic */ g0 f15666m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    f(g0 g0Var, Activity activity, String str, String str2) {
        super(g0Var, true);
        this.f15666m = g0Var;
        this.f15663j = activity;
        this.f15664k = str;
        this.f15665l = str2;
    }

    @Override // d4.x
    final void a() {
        p0 p0Var;
        p0Var = this.f15666m.f15679i;
        ((p0) r3.o.i(p0Var)).o3(x3.b.B3(this.f15663j), this.f15664k, this.f15665l, this.f15739f);
    }
}
