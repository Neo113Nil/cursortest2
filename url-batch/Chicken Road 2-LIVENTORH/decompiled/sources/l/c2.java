package l;

import android.database.DataSetObserver;

/* compiled from: r8-map-id-fb2637cf2a71147074b02d847622f707cfc12821f1b81d08e7915f8e7b9519ab */
/* loaded from: classes.dex */
public final class c2 extends DataSetObserver {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ f2 f2262a;

    public c2(f2 f2Var) {
        this.f2262a = f2Var;
    }

    @Override // android.database.DataSetObserver
    public final void onChanged() {
        f2 f2Var = this.f2262a;
        if (f2Var.E.isShowing()) {
            f2Var.f();
        }
    }

    @Override // android.database.DataSetObserver
    public final void onInvalidated() {
        this.f2262a.dismiss();
    }
}
