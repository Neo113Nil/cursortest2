package defpackage;

import android.database.DataSetObserver;

/* compiled from: r8-map-id-f21f5e89e3d3d92eca33bfe12a7775f49cadfb54340e756eb509706243ac6f5c */
/* loaded from: classes.dex */
public final class xd extends DataSetObserver {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ xd(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    @Override // android.database.DataSetObserver
    public final void onChanged() {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                o40 o40Var = (o40) obj;
                o40Var.f = true;
                o40Var.notifyDataSetChanged();
                break;
            default:
                yq yqVar = (yq) obj;
                if (yqVar.E.isShowing()) {
                    yqVar.d();
                    break;
                }
                break;
        }
    }

    @Override // android.database.DataSetObserver
    public final void onInvalidated() {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                o40 o40Var = (o40) obj;
                o40Var.f = false;
                o40Var.notifyDataSetInvalidated();
                break;
            default:
                ((yq) obj).dismiss();
                break;
        }
    }
}
