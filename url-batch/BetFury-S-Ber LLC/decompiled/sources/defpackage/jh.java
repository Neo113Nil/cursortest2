package defpackage;

import android.database.DataSetObserver;

/* compiled from: r8-map-id-555d5e190d9a27a9a8404de93c25a29c9fbe11559b3463c92c68ce527c1de619 */
/* loaded from: classes.dex */
public final class jh extends DataSetObserver {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ jh(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    @Override // android.database.DataSetObserver
    public final void onChanged() {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                yf0 yf0Var = (yf0) obj;
                yf0Var.f = true;
                yf0Var.notifyDataSetChanged();
                break;
            default:
                ny nyVar = (ny) obj;
                if (nyVar.E.isShowing()) {
                    nyVar.d();
                    break;
                }
                break;
        }
    }

    @Override // android.database.DataSetObserver
    public final void onInvalidated() {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                yf0 yf0Var = (yf0) obj;
                yf0Var.f = false;
                yf0Var.notifyDataSetInvalidated();
                break;
            default:
                ((ny) obj).dismiss();
                break;
        }
    }
}
