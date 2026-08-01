package m0;

import android.view.ViewGroup;
import h0.d0;

/* renamed from: m0.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0260c extends m {

    /* renamed from: a, reason: collision with root package name */
    public boolean f3247a = false;

    /* renamed from: b, reason: collision with root package name */
    public final ViewGroup f3248b;

    public C0260c(ViewGroup viewGroup) {
        this.f3248b = viewGroup;
    }

    @Override // m0.m, m0.j
    public final void a() {
        d0.q(this.f3248b, false);
    }

    @Override // m0.j
    public final void c(l lVar) {
        if (!this.f3247a) {
            d0.q(this.f3248b, false);
        }
        lVar.x(this);
    }

    @Override // m0.m, m0.j
    public final void d() {
        d0.q(this.f3248b, true);
    }

    @Override // m0.m, m0.j
    public final void f(l lVar) {
        d0.q(this.f3248b, false);
        this.f3247a = true;
    }
}
