package d1;

import o.e0;
import o.k0;
import o.s0;
import x1.t;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public final i f2060a;

    /* renamed from: b, reason: collision with root package name */
    public final t f2061b;

    /* renamed from: c, reason: collision with root package name */
    public final k0 f2062c;

    /* renamed from: d, reason: collision with root package name */
    public final k0 f2063d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f2064e;

    public f(i iVar, t tVar) {
        this.f2060a = iVar;
        this.f2061b = tVar;
        k0 k0Var = s0.f5536a;
        this.f2062c = new k0();
        this.f2063d = new k0();
    }

    public final void a() {
        if (this.f2064e) {
            return;
        }
        e eVar = new e(0, this, f.class, "invalidateNodes", "invalidateNodes()V", 0, 0, 0);
        e0 e0Var = this.f2061b.f8582w0;
        if (e0Var.f(eVar) < 0) {
            e0Var.a(eVar);
        }
        this.f2064e = true;
    }
}
