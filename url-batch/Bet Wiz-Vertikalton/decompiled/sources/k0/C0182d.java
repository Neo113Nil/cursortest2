package k0;

import android.view.ViewGroup;
import j0.AbstractC0142a;

/* renamed from: k0.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0182d extends o {

    /* renamed from: a, reason: collision with root package name */
    public boolean f2753a = false;

    /* renamed from: b, reason: collision with root package name */
    public final ViewGroup f2754b;

    public C0182d(ViewGroup viewGroup) {
        this.f2754b = viewGroup;
    }

    @Override // k0.o, k0.l
    public final void a() {
        AbstractC0142a.o(this.f2754b, false);
    }

    @Override // k0.l
    public final void b(n nVar) {
        if (!this.f2753a) {
            AbstractC0142a.o(this.f2754b, false);
        }
        nVar.x(this);
    }

    @Override // k0.o, k0.l
    public final void c() {
        AbstractC0142a.o(this.f2754b, true);
    }

    @Override // k0.o, k0.l
    public final void e(n nVar) {
        AbstractC0142a.o(this.f2754b, false);
        this.f2753a = true;
    }
}
