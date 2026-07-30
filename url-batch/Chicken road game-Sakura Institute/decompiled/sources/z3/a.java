package z3;

import android.database.Cursor;
import android.database.sqlite.SQLiteCursor;
import android.database.sqlite.SQLiteCursorDriver;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteQuery;
import com.android.installreferrer.api.InstallReferrerClient;
import r6.k;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final /* synthetic */ class a implements SQLiteDatabase.CursorFactory {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f10069a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f10070b;

    public /* synthetic */ a(int i7, Object obj) {
        this.f10069a = i7;
        this.f10070b = obj;
    }

    @Override // android.database.sqlite.SQLiteDatabase.CursorFactory
    public final Cursor newCursor(SQLiteDatabase sQLiteDatabase, SQLiteCursorDriver sQLiteCursorDriver, String str, SQLiteQuery sQLiteQuery) {
        switch (this.f10069a) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                y3.d dVar = (y3.d) this.f10070b;
                k.c(sQLiteQuery);
                dVar.c(new h(sQLiteQuery));
                return new SQLiteCursor(sQLiteCursorDriver, str, sQLiteQuery);
            default:
                return (Cursor) ((i2.c) this.f10070b).j(sQLiteDatabase, sQLiteCursorDriver, str, sQLiteQuery);
        }
    }
}
