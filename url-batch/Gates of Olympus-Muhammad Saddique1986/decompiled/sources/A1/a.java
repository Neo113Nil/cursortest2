package A1;

import android.database.Cursor;
import android.database.sqlite.SQLiteCursor;
import android.database.sqlite.SQLiteCursorDriver;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteQuery;

/* loaded from: classes.dex */
public final /* synthetic */ class a implements SQLiteDatabase.CursorFactory {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f197a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f198b;

    public /* synthetic */ a(int i3, Object obj) {
        this.f197a = i3;
        this.f198b = obj;
    }

    @Override // android.database.sqlite.SQLiteDatabase.CursorFactory
    public final Cursor newCursor(SQLiteDatabase sQLiteDatabase, SQLiteCursorDriver sQLiteCursorDriver, String str, SQLiteQuery sQLiteQuery) {
        switch (this.f197a) {
            case 0:
                z1.c cVar = (z1.c) this.f198b;
                f2.j.c(sQLiteQuery);
                cVar.a(new j(sQLiteQuery));
                return new SQLiteCursor(sQLiteCursorDriver, str, sQLiteQuery);
            default:
                return (Cursor) ((b) this.f198b).f(sQLiteDatabase, sQLiteCursorDriver, str, sQLiteQuery);
        }
    }
}
