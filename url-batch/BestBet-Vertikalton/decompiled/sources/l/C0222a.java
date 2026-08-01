package l;

import androidx.appcompat.widget.ActionBarContextView;

/* renamed from: l.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0222a implements K.a0 {

    /* renamed from: a, reason: collision with root package name */
    public boolean f3359a = false;

    /* renamed from: b, reason: collision with root package name */
    public int f3360b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ActionBarContextView f3361c;

    public C0222a(ActionBarContextView actionBarContextView) {
        this.f3361c = actionBarContextView;
    }

    @Override // K.a0
    public final void a() {
        if (this.f3359a) {
            return;
        }
        ActionBarContextView actionBarContextView = this.f3361c;
        actionBarContextView.f1666f = null;
        super/*android.view.View*/.setVisibility(this.f3360b);
    }

    @Override // K.a0
    public final void d() {
        this.f3359a = true;
    }

    @Override // K.a0
    public final void g() {
        super/*android.view.View*/.setVisibility(0);
        this.f3359a = false;
    }
}
