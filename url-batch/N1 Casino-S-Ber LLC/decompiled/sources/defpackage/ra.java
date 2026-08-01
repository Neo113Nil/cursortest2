package defpackage;

import android.view.View;

/* compiled from: r8-map-id-f21f5e89e3d3d92eca33bfe12a7775f49cadfb54340e756eb509706243ac6f5c */
/* loaded from: classes.dex */
public final /* synthetic */ class ra implements View.OnFocusChangeListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ li b;

    public /* synthetic */ ra(li liVar, int i) {
        this.a = i;
        this.b = liVar;
    }

    @Override // android.view.View.OnFocusChangeListener
    public final void onFocusChange(View view, boolean z) {
        int i = this.a;
        li liVar = this.b;
        switch (i) {
            case 0:
                ua uaVar = (ua) liVar;
                uaVar.s(uaVar.t());
                break;
            default:
                rg rgVar = (rg) liVar;
                rgVar.l = z;
                rgVar.p();
                if (!z) {
                    rgVar.s(false);
                    rgVar.m = false;
                    break;
                }
                break;
        }
    }
}
