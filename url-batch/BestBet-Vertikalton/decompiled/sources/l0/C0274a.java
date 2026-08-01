package l0;

import android.database.Cursor;
import android.database.sqlite.SQLiteCursor;
import android.database.sqlite.SQLiteCursorDriver;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteQuery;

/* renamed from: l0.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C0274a implements SQLiteDatabase.CursorFactory {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3508a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f3509b;

    public /* synthetic */ C0274a(int i, Object obj) {
        this.f3508a = i;
        this.f3509b = obj;
    }

    @Override // android.database.sqlite.SQLiteDatabase.CursorFactory
    public final Cursor newCursor(SQLiteDatabase sQLiteDatabase, SQLiteCursorDriver sQLiteCursorDriver, String str, SQLiteQuery sQLiteQuery) {
        switch (this.f3508a) {
            case 0:
                k0.c cVar = (k0.c) this.f3509b;
                k1.e.b(sQLiteQuery);
                cVar.j(new C0282i(sQLiteQuery));
                break;
            default:
                C0275b c0275b = (C0275b) this.f3509b;
                k1.e.b(sQLiteQuery);
                c0275b.f3510b.j(new C0282i(sQLiteQuery));
                break;
        }
        return new SQLiteCursor(sQLiteCursorDriver, str, sQLiteQuery);
    }
}
