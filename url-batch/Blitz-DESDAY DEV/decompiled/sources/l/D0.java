package l;

import android.database.DataSetObserver;

/* loaded from: classes.dex */
public final class D0 extends DataSetObserver {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ G0 f2855a;

    public D0(G0 g02) {
        this.f2855a = g02;
    }

    @Override // android.database.DataSetObserver
    public final void onChanged() {
        G0 g02 = this.f2855a;
        if (g02.f2884z.isShowing()) {
            g02.i();
        }
    }

    @Override // android.database.DataSetObserver
    public final void onInvalidated() {
        this.f2855a.dismiss();
    }
}
