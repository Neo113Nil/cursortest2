package androidx.fragment.app;

import android.view.View;

/* compiled from: r8-map-id-cbdb90155a17acee3f5e5c838b1038a1056cff151b1a2a170c159711c8afb558 */
/* loaded from: classes.dex */
public final class r extends b4.d {

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ u f625o;

    public r(u uVar) {
        this.f625o = uVar;
    }

    @Override // b4.d
    public final View G(int i) {
        u uVar = this.f625o;
        View view = uVar.J;
        if (view != null) {
            return view.findViewById(i);
        }
        throw new IllegalStateException("Fragment " + uVar + " does not have a view");
    }

    @Override // b4.d
    public final boolean J() {
        return this.f625o.J != null;
    }
}
