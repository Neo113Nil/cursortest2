package m;

import android.database.DataSetObserver;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class z0 extends DataSetObserver {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ c1 f6221a;

    public z0(c1 c1Var) {
        this.f6221a = c1Var;
    }

    @Override // android.database.DataSetObserver
    public final void onChanged() {
        c1 c1Var = this.f6221a;
        if (c1Var.J.isShowing()) {
            c1Var.a();
        }
    }

    @Override // android.database.DataSetObserver
    public final void onInvalidated() {
        this.f6221a.dismiss();
    }
}
