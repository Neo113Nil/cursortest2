package l;

import androidx.appcompat.widget.ActionBarContextView;

/* renamed from: l.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0175a implements M.Z {

    /* renamed from: a, reason: collision with root package name */
    public boolean f2959a = false;

    /* renamed from: b, reason: collision with root package name */
    public int f2960b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ActionBarContextView f2961c;

    public C0175a(ActionBarContextView actionBarContextView) {
        this.f2961c = actionBarContextView;
    }

    @Override // M.Z
    public final void a() {
        if (this.f2959a) {
            return;
        }
        ActionBarContextView actionBarContextView = this.f2961c;
        actionBarContextView.f1350f = null;
        super/*android.view.View*/.setVisibility(this.f2960b);
    }

    @Override // M.Z
    public final void b() {
        this.f2959a = true;
    }

    @Override // M.Z
    public final void g() {
        super/*android.view.View*/.setVisibility(0);
        this.f2959a = false;
    }
}
