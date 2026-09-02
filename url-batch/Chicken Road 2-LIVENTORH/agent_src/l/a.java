package l;

import androidx.appcompat.widget.ActionBarContextView;

/* compiled from: r8-map-id-fb2637cf2a71147074b02d847622f707cfc12821f1b81d08e7915f8e7b9519ab */
/* loaded from: classes.dex */
public final class a implements n0.q0 {

    /* renamed from: a, reason: collision with root package name */
    public boolean f2240a = false;

    /* renamed from: b, reason: collision with root package name */
    public int f2241b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ActionBarContextView f2242c;

    public a(ActionBarContextView actionBarContextView) {
        this.f2242c = actionBarContextView;
    }

    @Override // n0.q0
    public final void a() {
        if (this.f2240a) {
            return;
        }
        ActionBarContextView actionBarContextView = this.f2242c;
        actionBarContextView.f163k = null;
        super/*android.view.View*/.setVisibility(this.f2241b);
    }

    @Override // n0.q0
    public final void b() {
        this.f2240a = true;
    }

    @Override // n0.q0
    public final void c() {
        super/*android.view.View*/.setVisibility(0);
        this.f2240a = false;
    }
}
