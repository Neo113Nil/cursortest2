package defpackage;

import android.database.DataSetObserver;

/* compiled from: r8-map-id-de38bb36dc2361356cb83b4c675dbcd2450924cecdb12a3272c608759c381a50 */
/* loaded from: classes.dex */
public final class mt extends DataSetObserver {
    public final /* synthetic */ pt a;

    public mt(pt ptVar) {
        this.a = ptVar;
    }

    @Override // android.database.DataSetObserver
    public final void onChanged() {
        pt ptVar = this.a;
        if (ptVar.E.isShowing()) {
            ptVar.d();
        }
    }

    @Override // android.database.DataSetObserver
    public final void onInvalidated() {
        this.a.dismiss();
    }
}
