package androidx.fragment.app;

import android.app.Dialog;
import android.view.View;

/* compiled from: r8-map-id-cbdb90155a17acee3f5e5c838b1038a1056cff151b1a2a170c159711c8afb558 */
/* loaded from: classes.dex */
public final class o extends b4.d {

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ r f593o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ p f594p;

    public o(p pVar, r rVar) {
        this.f594p = pVar;
        this.f593o = rVar;
    }

    @Override // b4.d
    public final View G(int i) {
        r rVar = this.f593o;
        if (rVar.J()) {
            return rVar.G(i);
        }
        Dialog dialog = this.f594p.f613j0;
        if (dialog != null) {
            return dialog.findViewById(i);
        }
        return null;
    }

    @Override // b4.d
    public final boolean J() {
        return this.f593o.J() || this.f594p.f617n0;
    }
}
