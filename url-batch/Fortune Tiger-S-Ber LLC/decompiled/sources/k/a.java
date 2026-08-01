package k;

import androidx.appcompat.widget.ActionBarContextView;

/* compiled from: r8-map-id-72a2021f0a77848162657eed404f056d03742612a99b9acca4b8f3bd8ed17555 */
/* loaded from: classes.dex */
public final class a implements k0.m0 {

    /* renamed from: f, reason: collision with root package name */
    public boolean f2496f = false;
    public int g;
    public final /* synthetic */ ActionBarContextView h;

    public a(ActionBarContextView actionBarContextView) {
        this.h = actionBarContextView;
    }

    @Override // k0.m0
    public final void b() {
        if (this.f2496f) {
            return;
        }
        ActionBarContextView actionBarContextView = this.h;
        actionBarContextView.f185k = null;
        super/*android.view.View*/.setVisibility(this.g);
    }

    @Override // k0.m0
    public final void c() {
        this.f2496f = true;
    }

    @Override // k0.m0
    public final void g() {
        super/*android.view.View*/.setVisibility(0);
        this.f2496f = false;
    }
}
