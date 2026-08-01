package l0;

import android.database.Cursor;
import android.database.sqlite.SQLiteCursor;
import android.database.sqlite.SQLiteCursorDriver;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteQuery;
import k0.InterfaceC0202d;

/* renamed from: l0.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C0207a implements SQLiteDatabase.CursorFactory {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3246a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f3247b;

    public /* synthetic */ C0207a(int i, Object obj) {
        this.f3246a = i;
        this.f3247b = obj;
    }

    @Override // android.database.sqlite.SQLiteDatabase.CursorFactory
    public final Cursor newCursor(SQLiteDatabase sQLiteDatabase, SQLiteCursorDriver sQLiteCursorDriver, String str, SQLiteQuery sQLiteQuery) {
        switch (this.f3246a) {
            case 0:
                InterfaceC0202d interfaceC0202d = (InterfaceC0202d) this.f3247b;
                j1.h.e(interfaceC0202d, "$query");
                j1.h.b(sQLiteQuery);
                interfaceC0202d.q(new i(sQLiteQuery));
                break;
            default:
                b bVar = (b) this.f3247b;
                j1.h.b(sQLiteQuery);
                bVar.f3248b.q(new i(sQLiteQuery));
                break;
        }
        return new SQLiteCursor(sQLiteCursorDriver, str, sQLiteQuery);
    }
}
