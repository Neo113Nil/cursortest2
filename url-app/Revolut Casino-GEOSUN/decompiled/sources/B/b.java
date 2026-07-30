package B;

import android.database.DataSetObserver;
import h.J;
import h.f0;

/* loaded from: classes.dex */
public final class b extends DataSetObserver {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f42a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f43b;

    public /* synthetic */ b(int i2, Object obj) {
        this.f42a = i2;
        this.f43b = obj;
    }

    @Override // android.database.DataSetObserver
    public final void onChanged() {
        switch (this.f42a) {
            case 0:
                f0 f0Var = (f0) this.f43b;
                f0Var.f44e = true;
                f0Var.notifyDataSetChanged();
                break;
            default:
                J j2 = (J) this.f43b;
                if (j2.f2124z.isShowing()) {
                    j2.g();
                    break;
                }
                break;
        }
    }

    @Override // android.database.DataSetObserver
    public final void onInvalidated() {
        switch (this.f42a) {
            case 0:
                f0 f0Var = (f0) this.f43b;
                f0Var.f44e = false;
                f0Var.notifyDataSetInvalidated();
                break;
            default:
                ((J) this.f43b).dismiss();
                break;
        }
    }
}
