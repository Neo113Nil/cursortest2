package I;

import android.database.DataSetObserver;
import l.K;
import l.f0;

/* loaded from: classes.dex */
public final class a extends DataSetObserver {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f603a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f604b;

    public /* synthetic */ a(int i3, Object obj) {
        this.f603a = i3;
        this.f604b = obj;
    }

    @Override // android.database.DataSetObserver
    public final void onChanged() {
        switch (this.f603a) {
            case 0:
                f0 f0Var = (f0) this.f604b;
                f0Var.f605a = true;
                f0Var.notifyDataSetChanged();
                break;
            default:
                K k3 = (K) this.f604b;
                if (k3.v.isShowing()) {
                    k3.d();
                    break;
                }
                break;
        }
    }

    @Override // android.database.DataSetObserver
    public final void onInvalidated() {
        switch (this.f603a) {
            case 0:
                f0 f0Var = (f0) this.f604b;
                f0Var.f605a = false;
                f0Var.notifyDataSetInvalidated();
                break;
            default:
                ((K) this.f604b).dismiss();
                break;
        }
    }
}
