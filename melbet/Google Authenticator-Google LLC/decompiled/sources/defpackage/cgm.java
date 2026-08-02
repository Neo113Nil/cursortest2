package defpackage;

import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final /* synthetic */ class cgm implements cgo {
    public final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public /* synthetic */ cgm(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    @Override // defpackage.cgo
    public final Object a() {
        int i = this.b;
        Object obj = this.a;
        if (i == 0) {
            return ((SQLiteOpenHelper) obj).getWritableDatabase();
        }
        ((SQLiteDatabase) obj).beginTransaction();
        return null;
    }
}
