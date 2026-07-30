package defpackage;

import android.database.sqlite.SQLiteDatabase;
import java.io.Closeable;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class zs0 implements Closeable {
    public static final String[] n = new String[0];
    public static final y91 o;
    public static final y91 p;
    public final SQLiteDatabase m;

    static {
        kc1 kc1Var = kc1.m;
        o = ya1.a(kc1Var, new e4(4));
        p = ya1.a(kc1Var, new e4(5));
    }

    public zs0(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.getClass();
        this.m = sQLiteDatabase;
    }

    public final void b() {
        this.m.beginTransaction();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.m.close();
    }

    public final void f() {
        this.m.endTransaction();
    }

    public final boolean m() {
        return this.m.inTransaction();
    }
}
