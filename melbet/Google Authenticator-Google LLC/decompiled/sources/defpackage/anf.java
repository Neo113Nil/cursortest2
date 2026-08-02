package defpackage;

import android.database.Cursor;
import android.database.sqlite.SQLiteCursor;
import android.database.sqlite.SQLiteCursorDriver;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteQuery;
import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class anf extends anh {
    public int[] a;
    public long[] b;
    public double[] c;
    public String[] d;
    public byte[][] e;
    private Cursor i;

    public anf(amj amjVar, String str) {
        super(amjVar, str);
        this.a = new int[0];
        this.b = new long[0];
        this.c = new double[0];
        this.d = new String[0];
        this.e = new byte[0][];
    }

    private final Cursor q() {
        Cursor cursor = this.i;
        if (cursor != null) {
            return cursor;
        }
        yi.h(21, "no row");
        throw new koh();
    }

    private final void r(int i, int i2) {
        int[] iArr = this.a;
        int i3 = i2 + 1;
        if (iArr.length < i3) {
            int[] copyOf = Arrays.copyOf(iArr, i3);
            copyOf.getClass();
            this.a = copyOf;
        }
        if (i == 1) {
            long[] jArr = this.b;
            if (jArr.length < i3) {
                long[] copyOf2 = Arrays.copyOf(jArr, i3);
                copyOf2.getClass();
                this.b = copyOf2;
                return;
            }
            return;
        }
        if (i == 2) {
            double[] dArr = this.c;
            if (dArr.length < i3) {
                double[] copyOf3 = Arrays.copyOf(dArr, i3);
                copyOf3.getClass();
                this.c = copyOf3;
                return;
            }
            return;
        }
        if (i == 3) {
            String[] strArr = this.d;
            if (strArr.length < i3) {
                Object[] copyOf4 = Arrays.copyOf(strArr, i3);
                copyOf4.getClass();
                this.d = (String[]) copyOf4;
                return;
            }
            return;
        }
        if (i != 4) {
            return;
        }
        byte[][] bArr = this.e;
        if (bArr.length < i3) {
            Object[] copyOf5 = Arrays.copyOf(bArr, i3);
            copyOf5.getClass();
            this.e = (byte[][]) copyOf5;
        }
    }

    private final void s() {
        if (this.i == null) {
            amj amjVar = this.f;
            ane aneVar = new ane(this);
            final amq amqVar = new amq(aneVar);
            Cursor rawQueryWithFactory = ((ams) amjVar).e.rawQueryWithFactory(new SQLiteDatabase.CursorFactory() { // from class: amr
                @Override // android.database.sqlite.SQLiteDatabase.CursorFactory
                public final Cursor newCursor(SQLiteDatabase sQLiteDatabase, SQLiteCursorDriver sQLiteCursorDriver, String str, SQLiteQuery sQLiteQuery) {
                    String[] strArr = ams.a;
                    sQLiteQuery.getClass();
                    amy amyVar = new amy(sQLiteQuery);
                    anf anfVar = ((ane) ((amq) krz.this).a).a;
                    int length = anfVar.a.length;
                    for (int i = 1; i < length; i++) {
                        int i2 = anfVar.a[i];
                        if (i2 == 1) {
                            amyVar.c(i, anfVar.b[i]);
                        } else if (i2 == 2) {
                            amyVar.b(i, anfVar.c[i]);
                        } else if (i2 == 3) {
                            String str2 = anfVar.d[i];
                            str2.getClass();
                            amyVar.e(i, str2);
                        } else if (i2 == 4) {
                            byte[] bArr = anfVar.e[i];
                            bArr.getClass();
                            amyVar.a(i, bArr);
                        } else if (i2 == 5) {
                            amyVar.d(i);
                        }
                    }
                    return new SQLiteCursor(sQLiteCursorDriver, str, sQLiteQuery);
                }
            }, aneVar.a.g, ams.b, null);
            rawQueryWithFactory.getClass();
            this.i = rawQueryWithFactory;
        }
    }

    private static final void t(Cursor cursor, int i) {
        if (i < 0 || i >= cursor.getColumnCount()) {
            yi.h(25, "column index out of range");
            throw new koh();
        }
    }

    @Override // defpackage.amh
    public final int a() {
        o();
        s();
        Cursor cursor = this.i;
        if (cursor != null) {
            return cursor.getColumnCount();
        }
        return 0;
    }

    @Override // defpackage.amh
    public final long b(int i) {
        o();
        Cursor q = q();
        t(q, i);
        return q.getLong(i);
    }

    @Override // defpackage.amh
    public final String c(int i) {
        o();
        s();
        Cursor cursor = this.i;
        if (cursor == null) {
            throw new IllegalStateException("Required value was null.");
        }
        t(cursor, i);
        String columnName = cursor.getColumnName(i);
        columnName.getClass();
        return columnName;
    }

    @Override // defpackage.amh, java.lang.AutoCloseable
    public final void close() {
        if (!this.h) {
            o();
            this.a = new int[0];
            this.b = new long[0];
            this.c = new double[0];
            this.d = new String[0];
            this.e = new byte[0][];
            j();
        }
        p();
    }

    @Override // defpackage.amh
    public final String d(int i) {
        o();
        Cursor q = q();
        t(q, i);
        String string = q.getString(i);
        string.getClass();
        return string;
    }

    @Override // defpackage.amh
    public final void e(int i, byte[] bArr) {
        bArr.getClass();
        o();
        r(4, i);
        this.a[i] = 4;
        this.e[i] = bArr;
    }

    @Override // defpackage.amh
    public final void f(int i, double d) {
        o();
        r(2, i);
        this.a[i] = 2;
        this.c[i] = d;
    }

    @Override // defpackage.amh
    public final void g(int i, long j) {
        o();
        r(1, i);
        this.a[i] = 1;
        this.b[i] = j;
    }

    @Override // defpackage.amh
    public final void h(int i) {
        o();
        r(5, i);
        this.a[i] = 5;
    }

    @Override // defpackage.amh
    public final void i(int i, String str) {
        str.getClass();
        o();
        r(3, i);
        this.a[i] = 3;
        this.d[i] = str;
    }

    @Override // defpackage.amh
    public final void j() {
        o();
        Cursor cursor = this.i;
        if (cursor != null) {
            cursor.close();
        }
        this.i = null;
    }

    @Override // defpackage.amh
    public final boolean k(int i) {
        o();
        Cursor q = q();
        t(q, i);
        return q.isNull(i);
    }

    @Override // defpackage.amh
    public final boolean l() {
        o();
        s();
        Cursor cursor = this.i;
        if (cursor != null) {
            return cursor.moveToNext();
        }
        throw new IllegalStateException("Required value was null.");
    }

    @Override // defpackage.amh
    public final byte[] m(int i) {
        o();
        Cursor q = q();
        t(q, i);
        byte[] blob = q.getBlob(i);
        blob.getClass();
        return blob;
    }
}
