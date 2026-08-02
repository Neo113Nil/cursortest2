package defpackage;

import android.database.sqlite.SQLiteTransactionListener;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class fdc implements SQLiteTransactionListener {
    final /* synthetic */ fdd a;

    public fdc(fdd fddVar) {
        this.a = fddVar;
    }

    @Override // android.database.sqlite.SQLiteTransactionListener
    public final void onRollback() {
        if (!this.a.a) {
            throw new fdq();
        }
    }

    @Override // android.database.sqlite.SQLiteTransactionListener
    public final void onBegin() {
    }

    @Override // android.database.sqlite.SQLiteTransactionListener
    public final void onCommit() {
    }
}
