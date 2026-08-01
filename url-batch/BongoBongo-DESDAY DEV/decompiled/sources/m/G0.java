package m;

import android.database.DataSetObserver;

/* loaded from: classes.dex */
public final class G0 extends DataSetObserver {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ J0 f2920a;

    public G0(J0 j02) {
        this.f2920a = j02;
    }

    @Override // android.database.DataSetObserver
    public final void onChanged() {
        J0 j02 = this.f2920a;
        if (j02.f2955z.isShowing()) {
            j02.j();
        }
    }

    @Override // android.database.DataSetObserver
    public final void onInvalidated() {
        this.f2920a.dismiss();
    }
}
