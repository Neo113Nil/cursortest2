package f1;

import android.view.ViewGroup;

/* compiled from: r8-map-id-72a2021f0a77848162657eed404f056d03742612a99b9acca4b8f3bd8ed17555 */
/* loaded from: classes.dex */
public final class d extends p {

    /* renamed from: a, reason: collision with root package name */
    public boolean f1657a = false;

    /* renamed from: b, reason: collision with root package name */
    public final ViewGroup f1658b;

    public d(ViewGroup viewGroup) {
        this.f1658b = viewGroup;
    }

    @Override // f1.p, f1.m
    public final void a(o oVar) {
        k3.d.g0(this.f1658b, false);
        this.f1657a = true;
    }

    @Override // f1.p, f1.m
    public final void b() {
        k3.d.g0(this.f1658b, false);
    }

    @Override // f1.p, f1.m
    public final void c() {
        k3.d.g0(this.f1658b, true);
    }

    @Override // f1.m
    public final void e(o oVar) {
        if (!this.f1657a) {
            k3.d.g0(this.f1658b, false);
        }
        oVar.x(this);
    }
}
