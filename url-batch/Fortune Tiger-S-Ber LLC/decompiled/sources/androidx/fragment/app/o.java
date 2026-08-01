package androidx.fragment.app;

import android.app.Dialog;
import android.view.View;

/* compiled from: r8-map-id-72a2021f0a77848162657eed404f056d03742612a99b9acca4b8f3bd8ed17555 */
/* loaded from: classes.dex */
public final class o extends k3.m {

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ r f474k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ p f475l;

    public o(p pVar, r rVar) {
        this.f475l = pVar;
        this.f474k = rVar;
    }

    @Override // k3.m
    public final View K(int i4) {
        r rVar = this.f474k;
        if (rVar.L()) {
            return rVar.K(i4);
        }
        Dialog dialog = this.f475l.f492h0;
        if (dialog != null) {
            return dialog.findViewById(i4);
        }
        return null;
    }

    @Override // k3.m
    public final boolean L() {
        return this.f474k.L() || this.f475l.f495k0;
    }
}
