package defpackage;

import android.view.View;

/* compiled from: r8-map-id-f21f5e89e3d3d92eca33bfe12a7775f49cadfb54340e756eb509706243ac6f5c */
/* loaded from: classes.dex */
public final class jk extends jw {
    public final /* synthetic */ mk o;

    public jk(mk mkVar) {
        this.o = mkVar;
    }

    @Override // defpackage.jw
    public final View L(int i) {
        mk mkVar = this.o;
        View view = mkVar.J;
        if (view != null) {
            return view.findViewById(i);
        }
        t8.h(mkVar, " does not have a view", "Fragment ");
        return null;
    }

    @Override // defpackage.jw
    public final boolean O() {
        return this.o.J != null;
    }
}
