package k;

import android.database.DataSetObserver;

/* compiled from: r8-map-id-72a2021f0a77848162657eed404f056d03742612a99b9acca4b8f3bd8ed17555 */
/* loaded from: classes.dex */
public final class z1 extends DataSetObserver {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ c2 f2698a;

    public z1(c2 c2Var) {
        this.f2698a = c2Var;
    }

    @Override // android.database.DataSetObserver
    public final void onChanged() {
        c2 c2Var = this.f2698a;
        if (c2Var.E.isShowing()) {
            c2Var.c();
        }
    }

    @Override // android.database.DataSetObserver
    public final void onInvalidated() {
        this.f2698a.dismiss();
    }
}
