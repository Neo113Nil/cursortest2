package androidx.fragment.app;

import android.app.Dialog;
import android.view.View;

/* compiled from: r8-map-id-fb2637cf2a71147074b02d847622f707cfc12821f1b81d08e7915f8e7b9519ab */
/* loaded from: classes.dex */
public final class o extends a.y {

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ r f483n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ p f484o;

    public o(p pVar, r rVar) {
        this.f484o = pVar;
        this.f483n = rVar;
    }

    @Override // a.y
    public final View M(int i) {
        r rVar = this.f483n;
        if (rVar.N()) {
            return rVar.M(i);
        }
        Dialog dialog = this.f484o.f503h0;
        if (dialog != null) {
            return dialog.findViewById(i);
        }
        return null;
    }

    @Override // a.y
    public final boolean N() {
        return this.f483n.N() || this.f484o.f505k0;
    }
}
