package w1;

import android.database.Cursor;
import android.database.sqlite.SQLiteCursor;
import android.database.sqlite.SQLiteCursorDriver;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteQuery;

/* loaded from: classes.dex */
public final /* synthetic */ class a implements SQLiteDatabase.CursorFactory {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f8578a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f8579b;

    public /* synthetic */ a(int i3, Object obj) {
        this.f8578a = i3;
        this.f8579b = obj;
    }

    @Override // android.database.sqlite.SQLiteDatabase.CursorFactory
    public final Cursor newCursor(SQLiteDatabase sQLiteDatabase, SQLiteCursorDriver sQLiteCursorDriver, String str, SQLiteQuery sQLiteQuery) {
        switch (this.f8578a) {
            case 0:
                v1.d dVar = (v1.d) this.f8579b;
                Z1.i.f(dVar, "$query");
                Z1.i.c(sQLiteQuery);
                dVar.e(new h(sQLiteQuery));
                return new SQLiteCursor(sQLiteCursorDriver, str, sQLiteQuery);
            default:
                return (Cursor) ((I0.c) this.f8579b).e(sQLiteDatabase, sQLiteCursorDriver, str, sQLiteQuery);
        }
    }
}
