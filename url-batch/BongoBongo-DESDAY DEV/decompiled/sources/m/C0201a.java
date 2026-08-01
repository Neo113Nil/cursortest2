package m;

import androidx.appcompat.widget.ActionBarContextView;

/* renamed from: m.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0201a implements L.d0 {

    /* renamed from: a, reason: collision with root package name */
    public boolean f3065a = false;

    /* renamed from: b, reason: collision with root package name */
    public int f3066b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ActionBarContextView f3067c;

    public C0201a(ActionBarContextView actionBarContextView) {
        this.f3067c = actionBarContextView;
    }

    @Override // L.d0
    public final void a() {
        if (this.f3065a) {
            return;
        }
        ActionBarContextView actionBarContextView = this.f3067c;
        actionBarContextView.f1345f = null;
        super/*android.view.View*/.setVisibility(this.f3066b);
    }

    @Override // L.d0
    public final void b() {
        this.f3065a = true;
    }

    @Override // L.d0
    public final void c() {
        super/*android.view.View*/.setVisibility(0);
        this.f3065a = false;
    }
}
