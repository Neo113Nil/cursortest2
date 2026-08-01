package l;

import android.database.DataSetObserver;

/* compiled from: r8-map-id-cbdb90155a17acee3f5e5c838b1038a1056cff151b1a2a170c159711c8afb558 */
/* loaded from: classes.dex */
public final class z1 extends DataSetObserver {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ c2 f2616a;

    public z1(c2 c2Var) {
        this.f2616a = c2Var;
    }

    @Override // android.database.DataSetObserver
    public final void onChanged() {
        c2 c2Var = this.f2616a;
        if (c2Var.E.isShowing()) {
            c2Var.e();
        }
    }

    @Override // android.database.DataSetObserver
    public final void onInvalidated() {
        this.f2616a.dismiss();
    }
}
