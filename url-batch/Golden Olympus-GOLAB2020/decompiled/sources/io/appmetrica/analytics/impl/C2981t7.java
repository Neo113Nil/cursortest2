package io.appmetrica.analytics.impl;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import io.appmetrica.analytics.coreapi.internal.db.DatabaseScript;
import io.appmetrica.analytics.logger.appmetrica.internal.PublicLogger;
import java.io.Closeable;
import java.util.Collection;
import java.util.Iterator;

/* renamed from: io.appmetrica.analytics.impl.t7, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2981t7 extends SQLiteOpenHelper implements Closeable {

    /* renamed from: a, reason: collision with root package name */
    public final String f39843a;

    /* renamed from: b, reason: collision with root package name */
    public final PublicLogger f39844b;

    /* renamed from: c, reason: collision with root package name */
    public final C2687hn f39845c;

    public C2981t7(Context context, String str, C2687hn c2687hn, PublicLogger publicLogger) {
        super(context, str, (SQLiteDatabase.CursorFactory) null, S5.f38240b);
        this.f39845c = c2687hn;
        this.f39843a = str;
        this.f39844b = publicLogger;
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final SQLiteDatabase getReadableDatabase() {
        try {
            return super.getReadableDatabase();
        } catch (Throwable th) {
            this.f39844b.error(th, "Could not get readable database %s due to an exception. AppMetrica SDK may behave unexpectedly.", this.f39843a);
            C2551ck c2551ck = Bj.f37257a;
            c2551ck.getClass();
            c2551ck.a(new Cj("db_read_error", th));
            return null;
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final SQLiteDatabase getWritableDatabase() {
        try {
            return super.getWritableDatabase();
        } catch (Throwable th) {
            this.f39844b.error(th, "Could not get writable database %s due to an exception. AppMetrica SDK may behave unexpectedly.", this.f39843a);
            C2551ck c2551ck = Bj.f37257a;
            c2551ck.getClass();
            c2551ck.a(new Cj("db_write_error", th));
            return null;
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onCreate(SQLiteDatabase sQLiteDatabase) {
        try {
            this.f39845c.f39161a.runScript(sQLiteDatabase);
        } catch (Throwable unused) {
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onDowngrade(SQLiteDatabase sQLiteDatabase, int i4, int i5) {
        C2687hn c2687hn = this.f39845c;
        if (i4 <= i5) {
            c2687hn.getClass();
            return;
        }
        try {
            c2687hn.f39162b.runScript(sQLiteDatabase);
        } catch (Throwable unused) {
        }
        try {
            c2687hn.f39161a.runScript(sQLiteDatabase);
        } catch (Throwable unused2) {
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onOpen(SQLiteDatabase sQLiteDatabase) {
        super.onOpen(sQLiteDatabase);
        C2687hn c2687hn = this.f39845c;
        c2687hn.getClass();
        try {
            C2712in c2712in = c2687hn.f39164d;
            if (c2712in == null || c2712in.a(sQLiteDatabase)) {
                return;
            }
            try {
                c2687hn.f39162b.runScript(sQLiteDatabase);
            } catch (Throwable unused) {
            }
            c2687hn.f39161a.runScript(sQLiteDatabase);
        } catch (Throwable unused2) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:34:? A[RETURN, SYNTHETIC] */
    @Override // android.database.sqlite.SQLiteOpenHelper
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onUpgrade(SQLiteDatabase sQLiteDatabase, int i4, int i5) {
        boolean z4;
        C2687hn c2687hn = this.f39845c;
        c2687hn.getClass();
        if (i5 > i4) {
            for (int i6 = i4 + 1; i6 <= i5; i6++) {
                try {
                    Collection collection = (Collection) c2687hn.f39163c.f37877a.get(Integer.valueOf(i6));
                    if (collection != null) {
                        Iterator it = collection.iterator();
                        while (it.hasNext()) {
                            ((DatabaseScript) it.next()).runScript(sQLiteDatabase);
                        }
                    }
                } catch (Throwable unused) {
                }
            }
            z4 = false;
            if (!z4 && !(!c2687hn.f39164d.a(sQLiteDatabase))) {
                try {
                    c2687hn.f39162b.runScript(sQLiteDatabase);
                } catch (Throwable unused2) {
                }
                try {
                    c2687hn.f39161a.runScript(sQLiteDatabase);
                    return;
                } catch (Throwable unused3) {
                    return;
                }
            }
            return;
        }
        z4 = true;
        if (!(z4 | (c2687hn.f39164d.a(sQLiteDatabase) ^ true))) {
        }
    }
}
