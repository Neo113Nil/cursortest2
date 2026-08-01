package l;

import android.database.DataSetObserver;

/* loaded from: classes.dex */
public final class C0 extends DataSetObserver {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ F0 f2775a;

    public C0(F0 f02) {
        this.f2775a = f02;
    }

    @Override // android.database.DataSetObserver
    public final void onChanged() {
        F0 f02 = this.f2775a;
        if (f02.f2804z.isShowing()) {
            f02.i();
        }
    }

    @Override // android.database.DataSetObserver
    public final void onInvalidated() {
        this.f2775a.dismiss();
    }
}
