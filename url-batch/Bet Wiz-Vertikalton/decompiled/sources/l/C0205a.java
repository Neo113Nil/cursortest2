package l;

import androidx.appcompat.widget.ActionBarContextView;

/* renamed from: l.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0205a implements K.a0 {

    /* renamed from: a, reason: collision with root package name */
    public boolean f2943a = false;

    /* renamed from: b, reason: collision with root package name */
    public int f2944b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ActionBarContextView f2945c;

    public C0205a(ActionBarContextView actionBarContextView) {
        this.f2945c = actionBarContextView;
    }

    @Override // K.a0
    public final void a() {
        if (this.f2943a) {
            return;
        }
        ActionBarContextView actionBarContextView = this.f2945c;
        actionBarContextView.f1248f = null;
        super/*android.view.View*/.setVisibility(this.f2944b);
    }

    @Override // K.a0
    public final void b() {
        this.f2943a = true;
    }

    @Override // K.a0
    public final void c() {
        super/*android.view.View*/.setVisibility(0);
        this.f2943a = false;
    }
}
