package l;

import androidx.appcompat.widget.ActionBarContextView;

/* renamed from: l.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0206a implements K.a0 {

    /* renamed from: a, reason: collision with root package name */
    public boolean f2886a = false;

    /* renamed from: b, reason: collision with root package name */
    public int f2887b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ActionBarContextView f2888c;

    public C0206a(ActionBarContextView actionBarContextView) {
        this.f2888c = actionBarContextView;
    }

    @Override // K.a0
    public final void a() {
        if (this.f2886a) {
            return;
        }
        ActionBarContextView actionBarContextView = this.f2888c;
        actionBarContextView.f1203f = null;
        super/*android.view.View*/.setVisibility(this.f2887b);
    }

    @Override // K.a0
    public final void b() {
        this.f2886a = true;
    }

    @Override // K.a0
    public final void c() {
        super/*android.view.View*/.setVisibility(0);
        this.f2886a = false;
    }
}
