package l;

import androidx.appcompat.widget.ActionBarContextView;

/* renamed from: l.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0196a implements K.d0 {

    /* renamed from: a, reason: collision with root package name */
    public boolean f2881a = false;

    /* renamed from: b, reason: collision with root package name */
    public int f2882b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ActionBarContextView f2883c;

    public C0196a(ActionBarContextView actionBarContextView) {
        this.f2883c = actionBarContextView;
    }

    @Override // K.d0
    public final void a() {
        if (this.f2881a) {
            return;
        }
        ActionBarContextView actionBarContextView = this.f2883c;
        actionBarContextView.f1262f = null;
        super/*android.view.View*/.setVisibility(this.f2882b);
    }

    @Override // K.d0
    public final void b() {
        this.f2881a = true;
    }

    @Override // K.d0
    public final void c() {
        super/*android.view.View*/.setVisibility(0);
        this.f2881a = false;
    }
}
