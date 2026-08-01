package l;

import android.database.DataSetObserver;

/* loaded from: classes.dex */
public final class B0 extends DataSetObserver {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ E0 f3252a;

    public B0(E0 e02) {
        this.f3252a = e02;
    }

    @Override // android.database.DataSetObserver
    public final void onChanged() {
        E0 e02 = this.f3252a;
        if (e02.f3283z.isShowing()) {
            e02.i();
        }
    }

    @Override // android.database.DataSetObserver
    public final void onInvalidated() {
        this.f3252a.dismiss();
    }
}
