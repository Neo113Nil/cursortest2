package io.appmetrica.analytics.impl;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import io.appmetrica.analytics.coreapi.internal.db.DatabaseScript;
import io.appmetrica.analytics.logger.appmetrica.internal.PublicLogger;
import java.io.Closeable;
import java.util.Collection;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class Y6 extends SQLiteOpenHelper implements Closeable {

    /* renamed from: a, reason: collision with root package name */
    public final String f11290a;

    /* renamed from: b, reason: collision with root package name */
    public final PublicLogger f11291b;

    /* renamed from: c, reason: collision with root package name */
    public final C0700in f11292c;

    public Y6(Context context, String str, C0700in c0700in, PublicLogger publicLogger) {
        super(context, str, (SQLiteDatabase.CursorFactory) null, AbstractC1045w5.f12920b);
        this.f11292c = c0700in;
        this.f11290a = str;
        this.f11291b = publicLogger;
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final SQLiteDatabase getReadableDatabase() {
        try {
            return super.getReadableDatabase();
        } catch (Throwable th) {
            this.f11291b.error(th, "Could not get readable database %s due to an exception. AppMetrica SDK may behave unexpectedly.", this.f11290a);
            Qj qj = AbstractC0852oj.f12527a;
            qj.getClass();
            qj.a(new C0878pj("db_read_error", th));
            return null;
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final SQLiteDatabase getWritableDatabase() {
        try {
            return super.getWritableDatabase();
        } catch (Throwable th) {
            this.f11291b.error(th, "Could not get writable database %s due to an exception. AppMetrica SDK may behave unexpectedly.", this.f11290a);
            Qj qj = AbstractC0852oj.f12527a;
            qj.getClass();
            qj.a(new C0878pj("db_write_error", th));
            return null;
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onCreate(SQLiteDatabase sQLiteDatabase) {
        try {
            this.f11292c.f12078a.runScript(sQLiteDatabase);
        } catch (Throwable unused) {
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onDowngrade(SQLiteDatabase sQLiteDatabase, int i4, int i5) {
        C0700in c0700in = this.f11292c;
        if (i4 <= i5) {
            c0700in.getClass();
            return;
        }
        try {
            c0700in.f12079b.runScript(sQLiteDatabase);
        } catch (Throwable unused) {
        }
        try {
            c0700in.f12078a.runScript(sQLiteDatabase);
        } catch (Throwable unused2) {
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onOpen(SQLiteDatabase sQLiteDatabase) {
        super.onOpen(sQLiteDatabase);
        C0700in c0700in = this.f11292c;
        c0700in.getClass();
        try {
            InterfaceC0726jn interfaceC0726jn = c0700in.f12081d;
            if (interfaceC0726jn == null || interfaceC0726jn.a(sQLiteDatabase)) {
                return;
            }
            try {
                c0700in.f12079b.runScript(sQLiteDatabase);
            } catch (Throwable unused) {
            }
            c0700in.f12078a.runScript(sQLiteDatabase);
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
        boolean z;
        C0700in c0700in = this.f11292c;
        c0700in.getClass();
        if (i5 > i4) {
            for (int i6 = i4 + 1; i6 <= i5; i6++) {
                try {
                    Collection collection = (Collection) c0700in.f12080c.f12571a.get(Integer.valueOf(i6));
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
            if (!z && !(!c0700in.f12081d.a(sQLiteDatabase))) {
                try {
                    c0700in.f12079b.runScript(sQLiteDatabase);
                } catch (Throwable unused2) {
                }
                try {
                    c0700in.f12078a.runScript(sQLiteDatabase);
                    return;
                } catch (Throwable unused3) {
                    return;
                }
            }
            return;
        }
        z = true;
        if (!(z | (c0700in.f12081d.a(sQLiteDatabase) ^ true))) {
        }
    }
}
