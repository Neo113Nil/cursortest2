package l;

import androidx.appcompat.widget.ActionBarContextView;

/* renamed from: l.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0203a implements K.a0 {

    /* renamed from: a, reason: collision with root package name */
    public boolean f3035a = false;

    /* renamed from: b, reason: collision with root package name */
    public int f3036b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ActionBarContextView f3037c;

    public C0203a(ActionBarContextView actionBarContextView) {
        this.f3037c = actionBarContextView;
    }

    @Override // K.a0
    public final void a() {
        if (this.f3035a) {
            return;
        }
        ActionBarContextView actionBarContextView = this.f3037c;
        actionBarContextView.f1178f = null;
        super/*android.view.View*/.setVisibility(this.f3036b);
    }

    @Override // K.a0
    public final void b() {
        this.f3035a = true;
    }

    @Override // K.a0
    public final void c() {
        super/*android.view.View*/.setVisibility(0);
        this.f3035a = false;
    }
}
