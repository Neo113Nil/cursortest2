package defpackage;

import android.database.DataSetObserver;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class kg extends DataSetObserver {
    final /* synthetic */ ki a;

    public kg(ki kiVar) {
        this.a = kiVar;
    }

    @Override // android.database.DataSetObserver
    public final void onChanged() {
        ki kiVar = this.a;
        if (kiVar.x()) {
            kiVar.v();
        }
    }

    @Override // android.database.DataSetObserver
    public final void onInvalidated() {
        this.a.m();
    }
}
