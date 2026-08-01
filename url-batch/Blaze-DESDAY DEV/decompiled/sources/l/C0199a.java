package l;

import androidx.appcompat.widget.ActionBarContextView;

/* renamed from: l.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0199a implements K.d0 {

    /* renamed from: a, reason: collision with root package name */
    public boolean f2907a = false;

    /* renamed from: b, reason: collision with root package name */
    public int f2908b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ActionBarContextView f2909c;

    public C0199a(ActionBarContextView actionBarContextView) {
        this.f2909c = actionBarContextView;
    }

    @Override // K.d0
    public final void a() {
        if (this.f2907a) {
            return;
        }
        ActionBarContextView actionBarContextView = this.f2909c;
        actionBarContextView.f1293f = null;
        super/*android.view.View*/.setVisibility(this.f2908b);
    }

    @Override // K.d0
    public final void d() {
        this.f2907a = true;
    }

    @Override // K.d0
    public final void g() {
        super/*android.view.View*/.setVisibility(0);
        this.f2907a = false;
    }
}
