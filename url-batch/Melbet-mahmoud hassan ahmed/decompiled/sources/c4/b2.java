package c4;

import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class b2 implements s1<y1> {

    /* renamed from: a, reason: collision with root package name */
    private final v1<Executor> f1936a;

    public b2(v1<Executor> v1Var) {
        this.f1936a = v1Var;
    }

    @Override // c4.v1
    public final /* synthetic */ Object zza() {
        return new y1(this.f1936a.zza());
    }
}
