package D0;

import android.view.ViewGroup;

/* renamed from: D0.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0302d extends p {

    /* renamed from: a, reason: collision with root package name */
    public boolean f602a = false;

    /* renamed from: b, reason: collision with root package name */
    public final ViewGroup f603b;

    public C0302d(ViewGroup viewGroup) {
        this.f603b = viewGroup;
    }

    @Override // D0.p, D0.m
    public final void b() {
        com.bumptech.glide.e.B(this.f603b, false);
    }

    @Override // D0.p, D0.m
    public final void c(o oVar) {
        com.bumptech.glide.e.B(this.f603b, false);
        this.f602a = true;
    }

    @Override // D0.m
    public final void d(o oVar) {
        if (!this.f602a) {
            com.bumptech.glide.e.B(this.f603b, false);
        }
        oVar.C(this);
    }

    @Override // D0.p, D0.m
    public final void e() {
        com.bumptech.glide.e.B(this.f603b, true);
    }
}
