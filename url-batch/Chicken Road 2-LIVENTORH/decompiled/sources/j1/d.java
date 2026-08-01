package j1;

import android.view.ViewGroup;

/* compiled from: r8-map-id-fb2637cf2a71147074b02d847622f707cfc12821f1b81d08e7915f8e7b9519ab */
/* loaded from: classes.dex */
public final class d extends p {

    /* renamed from: a, reason: collision with root package name */
    public boolean f1895a = false;

    /* renamed from: b, reason: collision with root package name */
    public final ViewGroup f1896b;

    public d(ViewGroup viewGroup) {
        this.f1896b = viewGroup;
    }

    @Override // j1.p, j1.m
    public final void a(o oVar) {
        h.a.p0(this.f1896b, false);
        this.f1895a = true;
    }

    @Override // j1.m
    public final void c(o oVar) {
        if (!this.f1895a) {
            h.a.p0(this.f1896b, false);
        }
        oVar.y(this);
    }

    @Override // j1.p, j1.m
    public final void d() {
        h.a.p0(this.f1896b, false);
    }

    @Override // j1.p, j1.m
    public final void e() {
        h.a.p0(this.f1896b, true);
    }
}
