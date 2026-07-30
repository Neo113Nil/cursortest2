package defpackage;

import android.database.Cursor;
import android.database.sqlite.SQLiteCursorDriver;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteQuery;
import java.util.Arrays;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class fr2 extends hr2 {
    public int[] p;
    public long[] q;
    public double[] r;
    public String[] s;
    public byte[][] t;
    public Cursor u;

    public static void n(Cursor cursor, int i) {
        if (i < 0 || i >= cursor.getColumnCount()) {
            s03.P(25, "column index out of range");
            throw null;
        }
    }

    @Override // defpackage.uc2
    public final boolean E() {
        b();
        m();
        Cursor cursor = this.u;
        if (cursor != null) {
            return cursor.moveToNext();
        }
        lh.g("Required value was null.");
        return false;
    }

    @Override // defpackage.uc2
    public final void a(double d, int i) {
        b();
        f(2, i);
        this.p[i] = 2;
        this.r[i] = d;
    }

    @Override // defpackage.uc2
    public final void c(int i) {
        b();
        f(5, i);
        this.p[i] = 5;
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        if (!this.o) {
            b();
            this.p = new int[0];
            this.q = new long[0];
            this.r = new double[0];
            this.s = new String[0];
            this.t = new byte[0][];
            reset();
        }
        this.o = true;
    }

    @Override // defpackage.uc2
    public final void d(long j, int i) {
        b();
        f(1, i);
        this.p[i] = 1;
        this.q[i] = j;
    }

    public final void f(int i, int i2) {
        int i3 = i2 + 1;
        int[] iArr = this.p;
        if (iArr.length < i3) {
            this.p = Arrays.copyOf(iArr, i3);
        }
        if (i == 1) {
            long[] jArr = this.q;
            if (jArr.length < i3) {
                this.q = Arrays.copyOf(jArr, i3);
                return;
            }
            return;
        }
        if (i == 2) {
            double[] dArr = this.r;
            if (dArr.length < i3) {
                this.r = Arrays.copyOf(dArr, i3);
                return;
            }
            return;
        }
        if (i == 3) {
            String[] strArr = this.s;
            if (strArr.length < i3) {
                this.s = (String[]) Arrays.copyOf(strArr, i3);
                return;
            }
            return;
        }
        if (i != 4) {
            return;
        }
        byte[][] bArr = this.t;
        if (bArr.length < i3) {
            this.t = (byte[][]) Arrays.copyOf(bArr, i3);
        }
    }

    @Override // defpackage.uc2
    public final int getColumnCount() {
        b();
        m();
        Cursor cursor = this.u;
        if (cursor != null) {
            return cursor.getColumnCount();
        }
        return 0;
    }

    @Override // defpackage.uc2
    public final String getColumnName(int i) {
        b();
        m();
        Cursor cursor = this.u;
        if (cursor == null) {
            lh.g("Required value was null.");
            return null;
        }
        n(cursor, i);
        String columnName = cursor.getColumnName(i);
        columnName.getClass();
        return columnName;
    }

    @Override // defpackage.uc2
    public final double getDouble(int i) {
        b();
        Cursor o = o();
        n(o, i);
        return o.getDouble(i);
    }

    @Override // defpackage.uc2
    public final long getLong(int i) {
        b();
        Cursor o = o();
        n(o, i);
        return o.getLong(i);
    }

    @Override // defpackage.uc2
    public final boolean isNull(int i) {
        b();
        Cursor o = o();
        n(o, i);
        return o.isNull(i);
    }

    @Override // defpackage.uc2
    public final String j(int i) {
        b();
        Cursor o = o();
        n(o, i);
        String string = o.getString(i);
        string.getClass();
        return string;
    }

    public final void m() {
        if (this.u == null) {
            at0 at0Var = new at0(this);
            zs0 zs0Var = this.m;
            zs0Var.getClass();
            final ma maVar = new ma(2, at0Var);
            Cursor rawQueryWithFactory = zs0Var.m.rawQueryWithFactory(new SQLiteDatabase.CursorFactory() { // from class: ys0
                @Override // android.database.sqlite.SQLiteDatabase.CursorFactory
                public final Cursor newCursor(SQLiteDatabase sQLiteDatabase, SQLiteCursorDriver sQLiteCursorDriver, String str, SQLiteQuery sQLiteQuery) {
                    return (Cursor) ma.this.b(sQLiteDatabase, sQLiteCursorDriver, str, sQLiteQuery);
                }
            }, ((fr2) at0Var.m).n, zs0.n, null);
            rawQueryWithFactory.getClass();
            this.u = rawQueryWithFactory;
        }
    }

    public final Cursor o() {
        Cursor cursor = this.u;
        if (cursor != null) {
            return cursor;
        }
        s03.P(21, "no row");
        throw null;
    }

    @Override // defpackage.uc2
    public final void reset() {
        b();
        Cursor cursor = this.u;
        if (cursor != null) {
            cursor.close();
        }
        this.u = null;
    }

    @Override // defpackage.uc2
    public final void w(int i, String str) {
        str.getClass();
        b();
        f(3, i);
        this.p[i] = 3;
        this.s[i] = str;
    }
}
