package l;

import android.database.DataSetObserver;

/* loaded from: classes.dex */
public final class E0 extends DataSetObserver {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ H0 f3219a;

    public E0(H0 h02) {
        this.f3219a = h02;
    }

    @Override // android.database.DataSetObserver
    public final void onChanged() {
        H0 h02 = this.f3219a;
        if (h02.f3252z.isShowing()) {
            h02.i();
        }
    }

    @Override // android.database.DataSetObserver
    public final void onInvalidated() {
        this.f3219a.dismiss();
    }
}
