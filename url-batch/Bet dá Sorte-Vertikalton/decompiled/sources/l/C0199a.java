package l;

import androidx.appcompat.widget.ActionBarContextView;

/* renamed from: l.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0199a implements K.a0 {

    /* renamed from: a, reason: collision with root package name */
    public boolean f2922a = false;

    /* renamed from: b, reason: collision with root package name */
    public int f2923b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ActionBarContextView f2924c;

    public C0199a(ActionBarContextView actionBarContextView) {
        this.f2924c = actionBarContextView;
    }

    @Override // K.a0
    public final void a() {
        if (this.f2922a) {
            return;
        }
        ActionBarContextView actionBarContextView = this.f2924c;
        actionBarContextView.f1217f = null;
        super/*android.view.View*/.setVisibility(this.f2923b);
    }

    @Override // K.a0
    public final void b() {
        this.f2922a = true;
    }

    @Override // K.a0
    public final void c() {
        super/*android.view.View*/.setVisibility(0);
        this.f2922a = false;
    }
}
