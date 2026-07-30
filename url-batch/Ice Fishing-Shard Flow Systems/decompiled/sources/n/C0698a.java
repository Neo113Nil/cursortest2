package n;

import androidx.appcompat.widget.ActionBarContextView;

/* renamed from: n.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0698a implements I.Z {

    /* renamed from: a, reason: collision with root package name */
    public boolean f6737a = false;

    /* renamed from: b, reason: collision with root package name */
    public int f6738b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ActionBarContextView f6739c;

    public C0698a(ActionBarContextView actionBarContextView) {
        this.f6739c = actionBarContextView;
    }

    @Override // I.Z
    public final void a() {
        if (this.f6737a) {
            return;
        }
        ActionBarContextView actionBarContextView = this.f6739c;
        actionBarContextView.f3154n = null;
        super/*android.view.View*/.setVisibility(this.f6738b);
    }

    @Override // I.Z
    public final void b() {
        this.f6737a = true;
    }

    @Override // I.Z
    public final void c() {
        super/*android.view.View*/.setVisibility(0);
        this.f6737a = false;
    }
}
