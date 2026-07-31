package D;

import android.database.DataSetObserver;
import i.K;
import i.f0;

/* loaded from: classes.dex */
public final class b extends DataSetObserver {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f188a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f189b;

    public /* synthetic */ b(int i2, Object obj) {
        this.f188a = i2;
        this.f189b = obj;
    }

    @Override // android.database.DataSetObserver
    public final void onChanged() {
        switch (this.f188a) {
            case 0:
                f0 f0Var = (f0) this.f189b;
                f0Var.f190e = true;
                f0Var.notifyDataSetChanged();
                break;
            default:
                K k2 = (K) this.f189b;
                if (k2.f2155z.isShowing()) {
                    k2.c();
                    break;
                }
                break;
        }
    }

    @Override // android.database.DataSetObserver
    public final void onInvalidated() {
        switch (this.f188a) {
            case 0:
                f0 f0Var = (f0) this.f189b;
                f0Var.f190e = false;
                f0Var.notifyDataSetInvalidated();
                break;
            default:
                ((K) this.f189b).dismiss();
                break;
        }
    }
}
