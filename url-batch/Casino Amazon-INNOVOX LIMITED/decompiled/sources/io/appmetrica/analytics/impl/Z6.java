package io.appmetrica.analytics.impl;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import io.appmetrica.analytics.coreapi.internal.db.DatabaseScript;
import io.appmetrica.analytics.logger.appmetrica.internal.PublicLogger;
import java.io.Closeable;
import java.util.Collection;
import java.util.Iterator;

/* loaded from: classes3.dex */
public final class Z6 extends SQLiteOpenHelper implements Closeable {

    /* renamed from: a, reason: collision with root package name */
    public final String f1140a;
    public final PublicLogger b;
    public final C0287jn c;

    public Z6(Context context, String str, C0287jn c0287jn, PublicLogger publicLogger) {
        super(context, str, (SQLiteDatabase.CursorFactory) null, AbstractC0620x5.b);
        this.c = c0287jn;
        this.f1140a = str;
        this.b = publicLogger;
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final SQLiteDatabase getReadableDatabase() {
        try {
            return super.getReadableDatabase();
        } catch (Throwable th) {
            this.b.error(th, "Could not get readable database %s due to an exception. AppMetrica SDK may behave unexpectedly.", this.f1140a);
            Rj rj = AbstractC0435pj.f1437a;
            rj.getClass();
            rj.a(new C0460qj("db_read_error", th));
            return null;
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final SQLiteDatabase getWritableDatabase() {
        try {
            return super.getWritableDatabase();
        } catch (Throwable th) {
            this.b.error(th, "Could not get writable database %s due to an exception. AppMetrica SDK may behave unexpectedly.", this.f1140a);
            Rj rj = AbstractC0435pj.f1437a;
            rj.getClass();
            rj.a(new C0460qj("db_write_error", th));
            return null;
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onCreate(SQLiteDatabase sQLiteDatabase) {
        try {
            this.c.f1328a.runScript(sQLiteDatabase);
        } catch (Throwable unused) {
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onDowngrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        C0287jn c0287jn = this.c;
        if (i <= i2) {
            c0287jn.getClass();
            return;
        }
        try {
            c0287jn.b.runScript(sQLiteDatabase);
        } catch (Throwable unused) {
        }
        try {
            c0287jn.f1328a.runScript(sQLiteDatabase);
        } catch (Throwable unused2) {
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onOpen(SQLiteDatabase sQLiteDatabase) {
        super.onOpen(sQLiteDatabase);
        C0287jn c0287jn = this.c;
        c0287jn.getClass();
        try {
            InterfaceC0313kn interfaceC0313kn = c0287jn.d;
            if (interfaceC0313kn == null || interfaceC0313kn.a(sQLiteDatabase)) {
                return;
            }
            try {
                c0287jn.b.runScript(sQLiteDatabase);
            } catch (Throwable unused) {
            }
            c0287jn.f1328a.runScript(sQLiteDatabase);
        } catch (Throwable unused2) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:34:? A[RETURN, SYNTHETIC] */
    @Override // android.database.sqlite.SQLiteOpenHelper
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        boolean z;
        C0287jn c0287jn = this.c;
        c0287jn.getClass();
        if (i2 > i) {
            for (int i3 = i + 1; i3 <= i2; i3++) {
                try {
                    Collection collection = (Collection) c0287jn.c.f1451a.get(Integer.valueOf(i3));
                    if (collection != null) {
                        Iterator it = collection.iterator();
                        while (it.hasNext()) {
                            ((DatabaseScript) it.next()).runScript(sQLiteDatabase);
                        }
                    }
                } catch (Throwable unused) {
                }
            }
            z = false;
            if (!z && !(!c0287jn.d.a(sQLiteDatabase))) {
                try {
                    c0287jn.b.runScript(sQLiteDatabase);
                } catch (Throwable unused2) {
                }
                try {
                    c0287jn.f1328a.runScript(sQLiteDatabase);
                    return;
                } catch (Throwable unused3) {
                    return;
                }
            }
            return;
        }
        z = true;
        if (!(z | (c0287jn.d.a(sQLiteDatabase) ^ true))) {
        }
    }
}
