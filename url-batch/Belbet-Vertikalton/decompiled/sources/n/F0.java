package n;

import android.database.DataSetObserver;

/* loaded from: classes.dex */
public final class F0 extends DataSetObserver {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ I0 f3450a;

    public F0(I0 i02) {
        this.f3450a = i02;
    }

    @Override // android.database.DataSetObserver
    public final void onChanged() {
        I0 i02 = this.f3450a;
        if (i02.f3482z.isShowing()) {
            i02.h();
        }
    }

    @Override // android.database.DataSetObserver
    public final void onInvalidated() {
        this.f3450a.dismiss();
    }
}
