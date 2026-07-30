package defpackage;

import android.database.DataSetObserver;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class ve1 extends DataSetObserver {
    public final /* synthetic */ ye1 a;

    public ve1(ye1 ye1Var) {
        this.a = ye1Var;
    }

    @Override // android.database.DataSetObserver
    public final void onChanged() {
        ye1 ye1Var = this.a;
        if (ye1Var.K.isShowing()) {
            ye1Var.c();
        }
    }

    @Override // android.database.DataSetObserver
    public final void onInvalidated() {
        this.a.dismiss();
    }
}
