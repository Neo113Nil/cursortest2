package l;

import androidx.appcompat.widget.ActionBarContextView;

/* renamed from: l.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0223a implements K.b0 {

    /* renamed from: a, reason: collision with root package name */
    public boolean f2940a = false;

    /* renamed from: b, reason: collision with root package name */
    public int f2941b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ActionBarContextView f2942c;

    public C0223a(ActionBarContextView actionBarContextView) {
        this.f2942c = actionBarContextView;
    }

    @Override // K.b0
    public final void a() {
        if (this.f2940a) {
            return;
        }
        ActionBarContextView actionBarContextView = this.f2942c;
        actionBarContextView.f1145f = null;
        super/*android.view.View*/.setVisibility(this.f2941b);
    }

    @Override // K.b0
    public final void b() {
        this.f2940a = true;
    }

    @Override // K.b0
    public final void c() {
        super/*android.view.View*/.setVisibility(0);
        this.f2940a = false;
    }
}
