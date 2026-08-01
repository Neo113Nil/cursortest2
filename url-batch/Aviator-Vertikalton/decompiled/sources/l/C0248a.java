package l;

import androidx.appcompat.widget.ActionBarContextView;

/* renamed from: l.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0248a implements K.f0 {

    /* renamed from: a, reason: collision with root package name */
    public boolean f3320a = false;

    /* renamed from: b, reason: collision with root package name */
    public int f3321b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ActionBarContextView f3322c;

    public C0248a(ActionBarContextView actionBarContextView) {
        this.f3322c = actionBarContextView;
    }

    @Override // K.f0
    public final void a() {
        if (this.f3320a) {
            return;
        }
        ActionBarContextView actionBarContextView = this.f3322c;
        actionBarContextView.f993f = null;
        super/*android.view.View*/.setVisibility(this.f3321b);
    }

    @Override // K.f0
    public final void b() {
        this.f3320a = true;
    }

    @Override // K.f0
    public final void c() {
        super/*android.view.View*/.setVisibility(0);
        this.f3320a = false;
    }
}
