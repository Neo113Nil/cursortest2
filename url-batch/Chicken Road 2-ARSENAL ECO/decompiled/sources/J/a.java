package J;

import android.database.DataSetObserver;
import k.N;
import k.j0;

/* loaded from: classes.dex */
public final class a extends DataSetObserver {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1228a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f1229b;

    public /* synthetic */ a(int i7, Object obj) {
        this.f1228a = i7;
        this.f1229b = obj;
    }

    @Override // android.database.DataSetObserver
    public final void onChanged() {
        switch (this.f1228a) {
            case 0:
                j0 j0Var = (j0) this.f1229b;
                j0Var.f1230f = true;
                j0Var.notifyDataSetChanged();
                break;
            default:
                N n7 = (N) this.f1229b;
                if (n7.f4935A.isShowing()) {
                    n7.b();
                    break;
                }
                break;
        }
    }

    @Override // android.database.DataSetObserver
    public final void onInvalidated() {
        switch (this.f1228a) {
            case 0:
                j0 j0Var = (j0) this.f1229b;
                j0Var.f1230f = false;
                j0Var.notifyDataSetInvalidated();
                break;
            default:
                ((N) this.f1229b).dismiss();
                break;
        }
    }
}
