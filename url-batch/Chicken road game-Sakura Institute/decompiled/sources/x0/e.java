package x0;

import b.h0;
import c7.a1;
import i.b0;
import i.f0;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public final a1 f9597a;

    /* renamed from: b, reason: collision with root package name */
    public final h0 f9598b;

    /* renamed from: c, reason: collision with root package name */
    public final b0 f9599c;

    /* renamed from: d, reason: collision with root package name */
    public final b0 f9600d;

    /* renamed from: e, reason: collision with root package name */
    public final b0 f9601e;

    /* renamed from: f, reason: collision with root package name */
    public final b0 f9602f;

    public e(a1 a1Var, h0 h0Var) {
        this.f9597a = a1Var;
        this.f9598b = h0Var;
        int i7 = f0.f4740a;
        this.f9599c = new b0();
        this.f9600d = new b0();
        this.f9601e = new b0();
        this.f9602f = new b0();
    }

    public final boolean a() {
        return this.f9599c.h() || this.f9601e.h() || this.f9600d.h();
    }

    public final void b(b0 b0Var, Object obj) {
        if (b0Var.a(obj) && this.f9599c.f4724d + this.f9600d.f4724d + this.f9601e.f4724d == 1) {
            this.f9597a.f(new h0(0, this, e.class, "invalidateNodes", "invalidateNodes()V", 0, 0, 5));
        }
    }
}
