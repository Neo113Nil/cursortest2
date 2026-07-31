package d4;

import android.os.Bundle;

/* loaded from: classes.dex */
final class v extends x {

    /* renamed from: j, reason: collision with root package name */
    final /* synthetic */ Long f15727j;

    /* renamed from: k, reason: collision with root package name */
    final /* synthetic */ String f15728k;

    /* renamed from: l, reason: collision with root package name */
    final /* synthetic */ String f15729l;

    /* renamed from: m, reason: collision with root package name */
    final /* synthetic */ Bundle f15730m;

    /* renamed from: n, reason: collision with root package name */
    final /* synthetic */ boolean f15731n;

    /* renamed from: o, reason: collision with root package name */
    final /* synthetic */ boolean f15732o;

    /* renamed from: p, reason: collision with root package name */
    final /* synthetic */ g0 f15733p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    v(g0 g0Var, Long l7, String str, String str2, Bundle bundle, boolean z6, boolean z7) {
        super(g0Var, true);
        this.f15733p = g0Var;
        this.f15727j = l7;
        this.f15728k = str;
        this.f15729l = str2;
        this.f15730m = bundle;
        this.f15731n = z6;
        this.f15732o = z7;
    }

    @Override // d4.x
    final void a() {
        p0 p0Var;
        Long l7 = this.f15727j;
        long longValue = l7 == null ? this.f15739f : l7.longValue();
        p0Var = this.f15733p.f15679i;
        ((p0) r3.o.i(p0Var)).R2(this.f15728k, this.f15729l, this.f15730m, this.f15731n, this.f15732o, longValue);
    }
}
