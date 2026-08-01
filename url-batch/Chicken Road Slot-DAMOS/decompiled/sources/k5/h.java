package k5;

import a2.r;
import android.content.Context;
import android.database.DatabaseErrorHandler;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;
import android.util.Pair;
import java.io.File;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class h extends SQLiteOpenHelper {

    /* renamed from: v, reason: collision with root package name */
    public static final /* synthetic */ int f5421v = 0;

    /* renamed from: d, reason: collision with root package name */
    public final Context f5422d;

    /* renamed from: e, reason: collision with root package name */
    public final d9.c f5423e;

    /* renamed from: i, reason: collision with root package name */
    public final j5.a f5424i;

    /* renamed from: r, reason: collision with root package name */
    public final boolean f5425r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f5426s;

    /* renamed from: t, reason: collision with root package name */
    public final m5.a f5427t;

    /* renamed from: u, reason: collision with root package name */
    public boolean f5428u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(Context context, String str, final d9.c cVar, final j5.a aVar, boolean z10) {
        super(context, str, null, aVar.f5030a, new DatabaseErrorHandler() { // from class: k5.e
            @Override // android.database.DatabaseErrorHandler
            public final void onCorruption(SQLiteDatabase sQLiteDatabase) {
                int i3 = h.f5421v;
                sQLiteDatabase.getClass();
                d L = c6.f.L(cVar, sQLiteDatabase);
                j5.a.this.getClass();
                Log.e("SupportSQLite", "Corruption reported by sqlite on database: " + L + ".path");
                SQLiteDatabase sQLiteDatabase2 = L.f5410d;
                if (!sQLiteDatabase2.isOpen()) {
                    String path = sQLiteDatabase2.getPath();
                    if (path != null) {
                        j5.a.a(path);
                        return;
                    }
                    return;
                }
                List<Pair<String, String>> list = null;
                try {
                    try {
                        list = sQLiteDatabase2.getAttachedDbs();
                    } finally {
                        if (list != null) {
                            Iterator<T> it = list.iterator();
                            while (it.hasNext()) {
                                Object obj = ((Pair) it.next()).second;
                                obj.getClass();
                                j5.a.a((String) obj);
                            }
                        } else {
                            String path2 = sQLiteDatabase2.getPath();
                            if (path2 != null) {
                                j5.a.a(path2);
                            }
                        }
                    }
                } catch (SQLiteException unused) {
                }
                try {
                    L.close();
                } catch (IOException unused2) {
                }
                if (list != null) {
                    return;
                }
            }
        });
        String str2;
        context.getClass();
        aVar.getClass();
        this.f5422d = context;
        this.f5423e = cVar;
        this.f5424i = aVar;
        this.f5425r = z10;
        if (str == null) {
            str2 = UUID.randomUUID().toString();
            str2.getClass();
        } else {
            str2 = str;
        }
        this.f5427t = new m5.a(str2, context.getCacheDir(), false);
    }

    public final d a(boolean z10) {
        m5.a aVar = this.f5427t;
        try {
            aVar.a((this.f5428u || getDatabaseName() == null) ? false : true);
            this.f5426s = false;
            SQLiteDatabase d10 = d(z10);
            if (!this.f5426s) {
                d L = c6.f.L(this.f5423e, d10);
                aVar.b();
                return L;
            }
            close();
            d a9 = a(z10);
            aVar.b();
            return a9;
        } catch (Throwable th) {
            aVar.b();
            throw th;
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper, java.lang.AutoCloseable
    public final void close() {
        m5.a aVar = this.f5427t;
        try {
            aVar.a(aVar.f6560a);
            super.close();
            this.f5423e.f3701e = null;
            this.f5428u = false;
        } finally {
            aVar.b();
        }
    }

    public final SQLiteDatabase d(boolean z10) {
        SQLiteDatabase readableDatabase;
        SQLiteDatabase readableDatabase2;
        File parentFile;
        String databaseName = getDatabaseName();
        boolean z11 = this.f5428u;
        Context context = this.f5422d;
        if (databaseName != null && !z11 && (parentFile = context.getDatabasePath(databaseName).getParentFile()) != null) {
            parentFile.mkdirs();
            if (!parentFile.isDirectory()) {
                Log.w("SupportSQLite", "Invalid database parent file, not a directory: " + parentFile);
            }
        }
        try {
            if (z10) {
                SQLiteDatabase writableDatabase = getWritableDatabase();
                writableDatabase.getClass();
                return writableDatabase;
            }
            SQLiteDatabase readableDatabase3 = getReadableDatabase();
            readableDatabase3.getClass();
            return readableDatabase3;
        } catch (Throwable unused) {
            try {
                Thread.sleep(500L);
            } catch (InterruptedException unused2) {
            }
            try {
                if (z10) {
                    readableDatabase2 = getWritableDatabase();
                    readableDatabase2.getClass();
                } else {
                    readableDatabase2 = getReadableDatabase();
                    readableDatabase2.getClass();
                }
                return readableDatabase2;
            } catch (Throwable th) {
                th = th;
                if (th instanceof f) {
                    f fVar = (f) th;
                    int ordinal = fVar.f5413d.ordinal();
                    th = fVar.f5414e;
                    if (ordinal == 0 || ordinal == 1 || ordinal == 2 || ordinal == 3) {
                        throw th;
                    }
                    if (ordinal != 4) {
                        r.p();
                        return null;
                    }
                    if (!(th instanceof SQLiteException)) {
                        throw th;
                    }
                }
                if (!(th instanceof SQLiteException) || databaseName == null || !this.f5425r) {
                    throw th;
                }
                context.deleteDatabase(databaseName);
                try {
                    if (z10) {
                        readableDatabase = getWritableDatabase();
                        readableDatabase.getClass();
                    } else {
                        readableDatabase = getReadableDatabase();
                        readableDatabase.getClass();
                    }
                    return readableDatabase;
                } catch (f e2) {
                    throw e2.f5414e;
                }
            }
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onConfigure(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.getClass();
        boolean z10 = this.f5426s;
        j5.a aVar = this.f5424i;
        if (!z10 && aVar.f5030a != sQLiteDatabase.getVersion()) {
            sQLiteDatabase.setMaxSqlCacheSize(1);
        }
        try {
            aVar.b(c6.f.L(this.f5423e, sQLiteDatabase));
        } catch (Throwable th) {
            throw new f(g.f5415d, th);
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onCreate(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.getClass();
        try {
            this.f5424i.c(c6.f.L(this.f5423e, sQLiteDatabase));
        } catch (Throwable th) {
            throw new f(g.f5416e, th);
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onDowngrade(SQLiteDatabase sQLiteDatabase, int i3, int i10) {
        sQLiteDatabase.getClass();
        this.f5426s = true;
        try {
            this.f5424i.d(c6.f.L(this.f5423e, sQLiteDatabase), i3, i10);
        } catch (Throwable th) {
            throw new f(g.f5418r, th);
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onOpen(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.getClass();
        if (!this.f5426s) {
            try {
                this.f5424i.e(c6.f.L(this.f5423e, sQLiteDatabase));
            } catch (Throwable th) {
                throw new f(g.f5419s, th);
            }
        }
        this.f5428u = true;
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onUpgrade(SQLiteDatabase sQLiteDatabase, int i3, int i10) {
        sQLiteDatabase.getClass();
        this.f5426s = true;
        try {
            this.f5424i.f(c6.f.L(this.f5423e, sQLiteDatabase), i3, i10);
        } catch (Throwable th) {
            throw new f(g.f5417i, th);
        }
    }
}
