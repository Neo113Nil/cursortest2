package G;

import android.database.DataSetObserver;
import j.L;
import j.h0;

/* loaded from: classes.dex */
public final class b extends DataSetObserver {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f472a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f473b;

    public /* synthetic */ b(int i2, Object obj) {
        this.f472a = i2;
        this.f473b = obj;
    }

    @Override // android.database.DataSetObserver
    public final void onChanged() {
        switch (this.f472a) {
            case 0:
                h0 h0Var = (h0) this.f473b;
                h0Var.f474e = true;
                h0Var.notifyDataSetChanged();
                break;
            default:
                L l2 = (L) this.f473b;
                if (l2.f2896z.isShowing()) {
                    l2.c();
                    break;
                }
                break;
        }
    }

    @Override // android.database.DataSetObserver
    public final void onInvalidated() {
        switch (this.f472a) {
            case 0:
                h0 h0Var = (h0) this.f473b;
                h0Var.f474e = false;
                h0Var.notifyDataSetInvalidated();
                break;
            default:
                ((L) this.f473b).dismiss();
                break;
        }
    }
}
