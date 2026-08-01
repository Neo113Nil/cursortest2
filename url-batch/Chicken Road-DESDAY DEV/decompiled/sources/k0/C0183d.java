package k0;

import android.view.ViewGroup;
import j0.AbstractC0143a;

/* renamed from: k0.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0183d extends o {

    /* renamed from: a, reason: collision with root package name */
    public boolean f2704a = false;

    /* renamed from: b, reason: collision with root package name */
    public final ViewGroup f2705b;

    public C0183d(ViewGroup viewGroup) {
        this.f2705b = viewGroup;
    }

    @Override // k0.o, k0.l
    public final void a() {
        AbstractC0143a.q(this.f2705b, false);
    }

    @Override // k0.l
    public final void b(n nVar) {
        if (!this.f2704a) {
            AbstractC0143a.q(this.f2705b, false);
        }
        nVar.x(this);
    }

    @Override // k0.o, k0.l
    public final void c() {
        AbstractC0143a.q(this.f2705b, true);
    }

    @Override // k0.o, k0.l
    public final void e(n nVar) {
        AbstractC0143a.q(this.f2705b, false);
        this.f2704a = true;
    }
}
