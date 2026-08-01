package l0;

import android.view.ViewGroup;
import k0.AbstractC0180a;

/* renamed from: l0.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0259d extends n {

    /* renamed from: a, reason: collision with root package name */
    public boolean f3082a = false;

    /* renamed from: b, reason: collision with root package name */
    public final ViewGroup f3083b;

    public C0259d(ViewGroup viewGroup) {
        this.f3083b = viewGroup;
    }

    @Override // l0.n, l0.k
    public final void a() {
        AbstractC0180a.r(this.f3083b, false);
    }

    @Override // l0.k
    public final void c(m mVar) {
        if (!this.f3082a) {
            AbstractC0180a.r(this.f3083b, false);
        }
        mVar.x(this);
    }

    @Override // l0.n, l0.k
    public final void e() {
        AbstractC0180a.r(this.f3083b, true);
    }

    @Override // l0.n, l0.k
    public final void f(m mVar) {
        AbstractC0180a.r(this.f3083b, false);
        this.f3082a = true;
    }
}
