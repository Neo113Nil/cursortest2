package defpackage;

import android.database.DataSetObserver;

/* compiled from: r8-map-id-9fea5842fe02e932dfed9a581eb1db18ad6fbe2fdbe2eb471e1a0b06e64b43e7 */
/* loaded from: classes.dex */
public final class ir extends DataSetObserver {
    public final /* synthetic */ lr a;

    public ir(lr lrVar) {
        this.a = lrVar;
    }

    @Override // android.database.DataSetObserver
    public final void onChanged() {
        lr lrVar = this.a;
        if (lrVar.E.isShowing()) {
            lrVar.d();
        }
    }

    @Override // android.database.DataSetObserver
    public final void onInvalidated() {
        this.a.dismiss();
    }
}
