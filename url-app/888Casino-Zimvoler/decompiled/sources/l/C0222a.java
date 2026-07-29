package l;

import androidx.appcompat.widget.ActionBarContextView;

/* renamed from: l.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0222a implements K.b0 {

    /* renamed from: a, reason: collision with root package name */
    public boolean f2935a = false;

    /* renamed from: b, reason: collision with root package name */
    public int f2936b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ActionBarContextView f2937c;

    public C0222a(ActionBarContextView actionBarContextView) {
        this.f2937c = actionBarContextView;
    }

    @Override // K.b0
    public final void a() {
        if (this.f2935a) {
            return;
        }
        ActionBarContextView actionBarContextView = this.f2937c;
        actionBarContextView.f1140f = null;
        super/*android.view.View*/.setVisibility(this.f2936b);
    }

    @Override // K.b0
    public final void b() {
        this.f2935a = true;
    }

    @Override // K.b0
    public final void c() {
        super/*android.view.View*/.setVisibility(0);
        this.f2935a = false;
    }
}
