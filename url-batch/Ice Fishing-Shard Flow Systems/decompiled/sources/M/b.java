package M;

import android.database.DataSetObserver;
import n.I0;
import n.f1;

/* loaded from: classes.dex */
public final class b extends DataSetObserver {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1709a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f1710b;

    public /* synthetic */ b(int i2, Object obj) {
        this.f1709a = i2;
        this.f1710b = obj;
    }

    @Override // android.database.DataSetObserver
    public final void onChanged() {
        switch (this.f1709a) {
            case 0:
                f1 f1Var = (f1) this.f1710b;
                f1Var.f1711d = true;
                f1Var.notifyDataSetChanged();
                break;
            default:
                I0 i02 = (I0) this.f1710b;
                if (i02.f6649G.isShowing()) {
                    i02.c();
                    break;
                }
                break;
        }
    }

    @Override // android.database.DataSetObserver
    public final void onInvalidated() {
        switch (this.f1709a) {
            case 0:
                f1 f1Var = (f1) this.f1710b;
                f1Var.f1711d = false;
                f1Var.notifyDataSetInvalidated();
                break;
            default:
                ((I0) this.f1710b).dismiss();
                break;
        }
    }
}
