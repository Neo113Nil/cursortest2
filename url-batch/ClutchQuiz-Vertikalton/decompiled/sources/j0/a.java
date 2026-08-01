package j0;

import android.database.Cursor;
import android.database.sqlite.SQLiteCursor;
import android.database.sqlite.SQLiteCursorDriver;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteQuery;
import i0.InterfaceC0145d;

/* loaded from: classes.dex */
public final /* synthetic */ class a implements SQLiteDatabase.CursorFactory {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2647a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f2648b;

    public /* synthetic */ a(int i, Object obj) {
        this.f2647a = i;
        this.f2648b = obj;
    }

    @Override // android.database.sqlite.SQLiteDatabase.CursorFactory
    public final Cursor newCursor(SQLiteDatabase sQLiteDatabase, SQLiteCursorDriver sQLiteCursorDriver, String str, SQLiteQuery sQLiteQuery) {
        switch (this.f2647a) {
            case 0:
                InterfaceC0145d interfaceC0145d = (InterfaceC0145d) this.f2648b;
                g1.f.e(interfaceC0145d, "$query");
                g1.f.b(sQLiteQuery);
                interfaceC0145d.j(new i(sQLiteQuery));
                break;
            default:
                b bVar = (b) this.f2648b;
                g1.f.b(sQLiteQuery);
                bVar.f2649b.j(new i(sQLiteQuery));
                break;
        }
        return new SQLiteCursor(sQLiteCursorDriver, str, sQLiteQuery);
    }
}
