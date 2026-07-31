package l;

import android.database.DataSetObserver;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public final class g1 extends DataSetObserver {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ j1 f4249a;

    public g1(j1 j1Var) {
        this.f4249a = j1Var;
    }

    @Override // android.database.DataSetObserver
    public final void onChanged() {
        j1 j1Var = this.f4249a;
        if (j1Var.f4317y.isShowing()) {
            j1Var.d();
        }
    }

    @Override // android.database.DataSetObserver
    public final void onInvalidated() {
        this.f4249a.dismiss();
    }
}
