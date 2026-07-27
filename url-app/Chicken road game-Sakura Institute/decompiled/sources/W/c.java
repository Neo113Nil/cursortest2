package W;

import M2.p;
import kotlin.jvm.functions.Function1;
import w2.C1294c;

/* loaded from: classes.dex */
public final class c implements M0.b {

    /* renamed from: d, reason: collision with root package name */
    public a f4193d = g.f4197d;

    /* renamed from: e, reason: collision with root package name */
    public C1294c f4194e;

    /* JADX WARN: Multi-variable type inference failed */
    public final C1294c a(Function1 function1) {
        C1294c c1294c = new C1294c();
        c1294c.f11388d = (p) function1;
        this.f4194e = c1294c;
        return c1294c;
    }

    @Override // M0.b
    public final float e() {
        return this.f4193d.e().e();
    }

    @Override // M0.b
    public final float q() {
        return this.f4193d.e().q();
    }
}
