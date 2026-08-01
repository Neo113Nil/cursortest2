package n;

import androidx.appcompat.widget.ActionBarContextView;

/* renamed from: n.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0262a implements M.X {

    /* renamed from: a, reason: collision with root package name */
    public boolean f3593a = false;

    /* renamed from: b, reason: collision with root package name */
    public int f3594b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ActionBarContextView f3595c;

    public C0262a(ActionBarContextView actionBarContextView) {
        this.f3595c = actionBarContextView;
    }

    @Override // M.X
    public final void a() {
        if (this.f3593a) {
            return;
        }
        ActionBarContextView actionBarContextView = this.f3595c;
        actionBarContextView.f1712f = null;
        super/*android.view.View*/.setVisibility(this.f3594b);
    }

    @Override // M.X
    public final void d() {
        this.f3593a = true;
    }

    @Override // M.X
    public final void g() {
        super/*android.view.View*/.setVisibility(0);
        this.f3593a = false;
    }
}
