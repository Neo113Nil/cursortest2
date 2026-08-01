package l0;

import android.view.ViewGroup;
import m.C0260a;

/* renamed from: l0.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0256d extends n {

    /* renamed from: a, reason: collision with root package name */
    public boolean f3054a = false;

    /* renamed from: b, reason: collision with root package name */
    public final ViewGroup f3055b;

    public C0256d(ViewGroup viewGroup) {
        this.f3055b = viewGroup;
    }

    @Override // l0.n, l0.k
    public final void a() {
        C0260a.s(this.f3055b, false);
    }

    @Override // l0.k
    public final void c(m mVar) {
        if (!this.f3054a) {
            C0260a.s(this.f3055b, false);
        }
        mVar.x(this);
    }

    @Override // l0.n, l0.k
    public final void e() {
        C0260a.s(this.f3055b, true);
    }

    @Override // l0.n, l0.k
    public final void f(m mVar) {
        C0260a.s(this.f3055b, false);
        this.f3054a = true;
    }
}
