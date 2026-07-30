package e0;

import android.view.ViewTreeObserver;

/* compiled from: r8-map-id-a2d84f7cf5ca45495ceb585fa5ae0341076c951e080151b58cf9359cc6e7e89d */
/* loaded from: classes.dex */
public final class h implements ViewTreeObserver.OnPreDrawListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ u f149a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ i f150b;

    public h(i iVar, u uVar) {
        this.f150b = iVar;
        this.f149a = uVar;
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        i iVar = this.f150b;
        if (iVar.f161h && iVar.f159f != null) {
            this.f149a.getViewTreeObserver().removeOnPreDrawListener(this);
            iVar.f159f = null;
        }
        return iVar.f161h;
    }
}
