package c4;

import android.os.Handler;

/* loaded from: classes.dex */
public final class k0 implements s1<g0> {

    /* renamed from: a, reason: collision with root package name */
    private final v1<j0> f2011a;

    /* renamed from: b, reason: collision with root package name */
    private final v1<Handler> f2012b;

    /* renamed from: c, reason: collision with root package name */
    private final v1<l0> f2013c;

    public k0(v1<j0> v1Var, v1<Handler> v1Var2, v1<l0> v1Var3) {
        this.f2011a = v1Var;
        this.f2012b = v1Var2;
        this.f2013c = v1Var3;
    }

    @Override // c4.v1
    public final /* synthetic */ Object zza() {
        return new g0(this.f2011a.zza(), this.f2012b.zza(), this.f2013c.zza());
    }
}
