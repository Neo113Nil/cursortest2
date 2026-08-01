package androidx.fragment.app;

import android.view.View;

/* compiled from: r8-map-id-72a2021f0a77848162657eed404f056d03742612a99b9acca4b8f3bd8ed17555 */
/* loaded from: classes.dex */
public final class r extends k3.m {

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ u f502k;

    public r(u uVar) {
        this.f502k = uVar;
    }

    @Override // k3.m
    public final View K(int i4) {
        u uVar = this.f502k;
        View view = uVar.J;
        if (view != null) {
            return view.findViewById(i4);
        }
        throw new IllegalStateException("Fragment " + uVar + " does not have a view");
    }

    @Override // k3.m
    public final boolean L() {
        return this.f502k.J != null;
    }
}
