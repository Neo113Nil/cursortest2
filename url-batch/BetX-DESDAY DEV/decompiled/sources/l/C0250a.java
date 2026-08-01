package l;

import androidx.appcompat.widget.ActionBarContextView;

/* renamed from: l.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0250a implements K.f0 {

    /* renamed from: a, reason: collision with root package name */
    public boolean f3333a = false;

    /* renamed from: b, reason: collision with root package name */
    public int f3334b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ActionBarContextView f3335c;

    public C0250a(ActionBarContextView actionBarContextView) {
        this.f3335c = actionBarContextView;
    }

    @Override // K.f0
    public final void a() {
        if (this.f3333a) {
            return;
        }
        ActionBarContextView actionBarContextView = this.f3335c;
        actionBarContextView.f994f = null;
        super/*android.view.View*/.setVisibility(this.f3334b);
    }

    @Override // K.f0
    public final void b() {
        this.f3333a = true;
    }

    @Override // K.f0
    public final void c() {
        super/*android.view.View*/.setVisibility(0);
        this.f3333a = false;
    }
}
