package l;

import android.database.DataSetObserver;

/* loaded from: classes.dex */
public final class B0 extends DataSetObserver {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ E0 f2814a;

    public B0(E0 e02) {
        this.f2814a = e02;
    }

    @Override // android.database.DataSetObserver
    public final void onChanged() {
        E0 e02 = this.f2814a;
        if (e02.f2845z.isShowing()) {
            e02.i();
        }
    }

    @Override // android.database.DataSetObserver
    public final void onInvalidated() {
        this.f2814a.dismiss();
    }
}
