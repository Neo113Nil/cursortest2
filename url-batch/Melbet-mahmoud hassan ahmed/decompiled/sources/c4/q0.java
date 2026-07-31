package c4;

import android.app.Application;
import android.os.Handler;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class q0 implements s1<l0> {

    /* renamed from: a, reason: collision with root package name */
    private final v1<Application> f2081a;

    /* renamed from: b, reason: collision with root package name */
    private final v1<j0> f2082b;

    /* renamed from: c, reason: collision with root package name */
    private final v1<Handler> f2083c;

    /* renamed from: d, reason: collision with root package name */
    private final v1<Executor> f2084d;

    /* renamed from: e, reason: collision with root package name */
    private final v1<y1> f2085e;

    /* renamed from: f, reason: collision with root package name */
    private final v1<k> f2086f;

    /* renamed from: g, reason: collision with root package name */
    private final v1<u> f2087g;

    public q0(v1<Application> v1Var, v1<j0> v1Var2, v1<Handler> v1Var3, v1<Executor> v1Var4, v1<y1> v1Var5, v1<k> v1Var6, v1<u> v1Var7) {
        this.f2081a = v1Var;
        this.f2082b = v1Var2;
        this.f2083c = v1Var3;
        this.f2084d = v1Var4;
        this.f2085e = v1Var5;
        this.f2086f = v1Var6;
        this.f2087g = v1Var7;
    }

    @Override // c4.v1
    public final /* synthetic */ Object zza() {
        return new l0(this.f2081a.zza(), this.f2082b.zza(), this.f2083c.zza(), this.f2084d.zza(), this.f2085e.zza(), this.f2086f.zza(), this.f2087g.zza());
    }
}
