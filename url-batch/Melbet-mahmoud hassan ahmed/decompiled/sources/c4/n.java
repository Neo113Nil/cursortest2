package c4;

import android.app.Application;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class n implements s1<k> {

    /* renamed from: a, reason: collision with root package name */
    private final v1<Application> f2045a;

    /* renamed from: b, reason: collision with root package name */
    private final v1<m> f2046b;

    /* renamed from: c, reason: collision with root package name */
    private final v1<Executor> f2047c;

    public n(v1<Application> v1Var, v1<m> v1Var2, v1<Executor> v1Var3) {
        this.f2045a = v1Var;
        this.f2046b = v1Var2;
        this.f2047c = v1Var3;
    }

    @Override // c4.v1
    public final /* synthetic */ Object zza() {
        return new k(this.f2045a.zza(), this.f2046b.zza(), this.f2047c.zza());
    }
}
