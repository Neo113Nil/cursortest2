package io.appmetrica.analytics.impl;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import io.appmetrica.analytics.coreapi.internal.db.DatabaseScript;
import io.appmetrica.analytics.logger.appmetrica.internal.PublicLogger;
import java.io.Closeable;
import java.util.Collection;
import java.util.Iterator;

/* renamed from: io.appmetrica.analytics.impl.f7, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0485f7 extends SQLiteOpenHelper implements Closeable {

    /* renamed from: a, reason: collision with root package name */
    public final String f7304a;

    /* renamed from: b, reason: collision with root package name */
    public final PublicLogger f7305b;

    /* renamed from: c, reason: collision with root package name */
    public final C0656ln f7306c;

    public C0485f7(Context context, String str, C0656ln c0656ln, PublicLogger publicLogger) {
        super(context, str, (SQLiteDatabase.CursorFactory) null, D5.f5884b);
        this.f7306c = c0656ln;
        this.f7304a = str;
        this.f7305b = publicLogger;
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final SQLiteDatabase getReadableDatabase() {
        try {
            return super.getReadableDatabase();
        } catch (Throwable th) {
            this.f7305b.error(th, "Could not get readable database %s due to an exception. AppMetrica SDK may behave unexpectedly.", this.f7304a);
            Vj vj = AbstractC0859tj.f8379a;
            vj.getClass();
            vj.a(new C0885uj("db_read_error", th));
            return null;
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final SQLiteDatabase getWritableDatabase() {
        try {
            return super.getWritableDatabase();
        } catch (Throwable th) {
            this.f7305b.error(th, "Could not get writable database %s due to an exception. AppMetrica SDK may behave unexpectedly.", this.f7304a);
            Vj vj = AbstractC0859tj.f8379a;
            vj.getClass();
            vj.a(new C0885uj("db_write_error", th));
            return null;
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onCreate(SQLiteDatabase sQLiteDatabase) {
        try {
            this.f7306c.f7840a.runScript(sQLiteDatabase);
        } catch (Throwable unused) {
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onDowngrade(SQLiteDatabase sQLiteDatabase, int i3, int i4) {
        C0656ln c0656ln = this.f7306c;
        if (i3 <= i4) {
            c0656ln.getClass();
            return;
        }
        try {
            c0656ln.f7841b.runScript(sQLiteDatabase);
        } catch (Throwable unused) {
        }
        try {
            c0656ln.f7840a.runScript(sQLiteDatabase);
        } catch (Throwable unused2) {
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onOpen(SQLiteDatabase sQLiteDatabase) {
        super.onOpen(sQLiteDatabase);
        C0656ln c0656ln = this.f7306c;
        c0656ln.getClass();
        try {
            InterfaceC0682mn interfaceC0682mn = c0656ln.f7843d;
            if (interfaceC0682mn == null || interfaceC0682mn.a(sQLiteDatabase)) {
                return;
            }
            try {
                c0656ln.f7841b.runScript(sQLiteDatabase);
            } catch (Throwable unused) {
            }
            c0656ln.f7840a.runScript(sQLiteDatabase);
        } catch (Throwable unused2) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:34:? A[RETURN, SYNTHETIC] */
    @Override // android.database.sqlite.SQLiteOpenHelper
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onUpgrade(SQLiteDatabase sQLiteDatabase, int i3, int i4) {
        boolean z;
        C0656ln c0656ln = this.f7306c;
        c0656ln.getClass();
        if (i4 > i3) {
            for (int i5 = i3 + 1; i5 <= i4; i5++) {
                try {
                    Collection collection = (Collection) c0656ln.f7842c.f8560a.get(Integer.valueOf(i5));
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
            if (!z && !(!c0656ln.f7843d.a(sQLiteDatabase))) {
                try {
                    c0656ln.f7841b.runScript(sQLiteDatabase);
                } catch (Throwable unused2) {
                }
                try {
                    c0656ln.f7840a.runScript(sQLiteDatabase);
                    return;
                } catch (Throwable unused3) {
                    return;
                }
            }
            return;
        }
        z = true;
        if (!(z | (c0656ln.f7843d.a(sQLiteDatabase) ^ true))) {
        }
    }
}
