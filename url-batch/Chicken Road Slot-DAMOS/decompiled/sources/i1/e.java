package i1;

import d2.v;
import s.d0;
import s.i0;
import s.q0;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public final k f4592a;

    /* renamed from: b, reason: collision with root package name */
    public final v f4593b;

    /* renamed from: c, reason: collision with root package name */
    public final i0 f4594c;

    /* renamed from: d, reason: collision with root package name */
    public final i0 f4595d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f4596e;

    public e(k kVar, v vVar) {
        this.f4592a = kVar;
        this.f4593b = vVar;
        int i3 = q0.f8360a;
        this.f4594c = new i0();
        this.f4595d = new i0();
    }

    public final void a() {
        if (this.f4596e) {
            return;
        }
        d2.o oVar = new d2.o(0, this, e.class, "invalidateNodes", "invalidateNodes()V", 0, 1);
        d0 d0Var = this.f4593b.L0;
        if (d0Var.g(oVar) < 0) {
            d0Var.a(oVar);
        }
        this.f4596e = true;
    }
}
