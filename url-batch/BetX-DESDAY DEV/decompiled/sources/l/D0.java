package l;

import android.database.DataSetObserver;

/* loaded from: classes.dex */
public final class D0 extends DataSetObserver {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ G0 f3219a;

    public D0(G0 g02) {
        this.f3219a = g02;
    }

    @Override // android.database.DataSetObserver
    public final void onChanged() {
        G0 g02 = this.f3219a;
        if (g02.f3252z.isShowing()) {
            g02.i();
        }
    }

    @Override // android.database.DataSetObserver
    public final void onInvalidated() {
        this.f3219a.dismiss();
    }
}
