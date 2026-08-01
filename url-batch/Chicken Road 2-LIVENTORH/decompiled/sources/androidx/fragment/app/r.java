package androidx.fragment.app;

import android.view.View;

/* compiled from: r8-map-id-fb2637cf2a71147074b02d847622f707cfc12821f1b81d08e7915f8e7b9519ab */
/* loaded from: classes.dex */
public final class r extends a.y {

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ u f513n;

    public r(u uVar) {
        this.f513n = uVar;
    }

    @Override // a.y
    public final View M(int i) {
        u uVar = this.f513n;
        View view = uVar.J;
        if (view != null) {
            return view.findViewById(i);
        }
        throw new IllegalStateException("Fragment " + uVar + " does not have a view");
    }

    @Override // a.y
    public final boolean N() {
        return this.f513n.J != null;
    }
}
