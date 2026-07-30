package m;

import android.view.ActionProvider;
import android.view.View;
import i.C0511M;

/* loaded from: classes.dex */
public final class p implements ActionProvider.VisibilityListener {

    /* renamed from: a, reason: collision with root package name */
    public final ActionProvider f6465a;

    /* renamed from: b, reason: collision with root package name */
    public C0511M f6466b;

    public p(t tVar, ActionProvider actionProvider) {
        this.f6465a = actionProvider;
    }

    public final View a(o oVar) {
        return this.f6465a.onCreateActionView(oVar);
    }

    @Override // android.view.ActionProvider.VisibilityListener
    public final void onActionProviderVisibilityChanged(boolean z7) {
        C0511M c0511m = this.f6466b;
        if (c0511m != null) {
            m mVar = ((o) c0511m.f5381e).f6452n;
            mVar.f6417h = true;
            mVar.p(true);
        }
    }
}
