package c4;

import android.app.Application;

/* loaded from: classes.dex */
public final class k2 implements s1<h2> {

    /* renamed from: a, reason: collision with root package name */
    private final v1<Application> f2015a;

    /* renamed from: b, reason: collision with root package name */
    private final v1<b0> f2016b;

    /* renamed from: c, reason: collision with root package name */
    private final v1<m> f2017c;

    public k2(v1<Application> v1Var, v1<b0> v1Var2, v1<m> v1Var3) {
        this.f2015a = v1Var;
        this.f2016b = v1Var2;
        this.f2017c = v1Var3;
    }

    @Override // c4.v1
    public final /* synthetic */ Object zza() {
        return new h2(this.f2015a.zza(), this.f2016b.zza(), this.f2017c.zza());
    }
}
