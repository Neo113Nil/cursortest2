package defpackage;

import android.database.Cursor;
import android.database.sqlite.SQLiteCursorDriver;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteQuery;
import java.util.Arrays;

/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
/* loaded from: classes.dex */
public final class zb2 extends ac2 {
    public static final yb2 Companion = new yb2();
    public byte[][] QrzZRwfaDlRX;
    public double[] cpQdD2nAriOS;
    public int[] dgRBjINgWbAK;
    public Cursor gPXPFXrUH4XX;
    public String[] r3s1LDPKFs1S;
    public long[] x50lh2ztY7Y5;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zb2(pd0 pd0Var, String str) {
        super(pd0Var, str);
        pd0Var.getClass();
        str.getClass();
        this.dgRBjINgWbAK = new int[0];
        this.x50lh2ztY7Y5 = new long[0];
        this.cpQdD2nAriOS = new double[0];
        this.r3s1LDPKFs1S = new String[0];
        this.QrzZRwfaDlRX = new byte[0][];
    }

    public static void cpQdD2nAriOS(Cursor cursor, int i) {
        if (i < 0 || i >= cursor.getColumnCount()) {
            sj0.zf8DYfih6EZu("column index out of range", 25);
            throw null;
        }
    }

    public final void OPXfSBeufaJ8() {
        if (this.gPXPFXrUH4XX == null) {
            b42 b42Var = new b42(7, this);
            pd0 pd0Var = this.rtx2ld2ELZv4;
            pd0Var.getClass();
            final p4 p4Var = new p4(1, b42Var);
            Cursor rawQueryWithFactory = pd0Var.rtx2ld2ELZv4.rawQueryWithFactory(new SQLiteDatabase.CursorFactory() { // from class: nd0
                @Override // android.database.sqlite.SQLiteDatabase.CursorFactory
                public final Cursor newCursor(SQLiteDatabase sQLiteDatabase, SQLiteCursorDriver sQLiteCursorDriver, String str, SQLiteQuery sQLiteQuery) {
                    return (Cursor) p4.this.r3s1LDPKFs1S(sQLiteDatabase, sQLiteCursorDriver, str, sQLiteQuery);
                }
            }, ((zb2) b42Var.OPXfSBeufaJ8).OPXfSBeufaJ8, pd0.OPXfSBeufaJ8, null);
            rawQueryWithFactory.getClass();
            this.gPXPFXrUH4XX = rawQueryWithFactory;
        }
    }

    @Override // defpackage.hy1
    public final void Y1f8riQaR6yg(int i, long j) {
        lS5Rgt96tfkO();
        a92UlCVFR9N8(1, i);
        this.dgRBjINgWbAK[i] = 1;
        this.x50lh2ztY7Y5[i] = j;
    }

    public final void a92UlCVFR9N8(int i, int i2) {
        int i3 = i2 + 1;
        int[] iArr = this.dgRBjINgWbAK;
        if (iArr.length < i3) {
            this.dgRBjINgWbAK = Arrays.copyOf(iArr, i3);
        }
        if (i == 1) {
            long[] jArr = this.x50lh2ztY7Y5;
            if (jArr.length < i3) {
                this.x50lh2ztY7Y5 = Arrays.copyOf(jArr, i3);
                return;
            }
            return;
        }
        if (i == 2) {
            double[] dArr = this.cpQdD2nAriOS;
            if (dArr.length < i3) {
                this.cpQdD2nAriOS = Arrays.copyOf(dArr, i3);
                return;
            }
            return;
        }
        if (i == 3) {
            String[] strArr = this.r3s1LDPKFs1S;
            if (strArr.length < i3) {
                this.r3s1LDPKFs1S = (String[]) Arrays.copyOf(strArr, i3);
                return;
            }
            return;
        }
        if (i != 4) {
            return;
        }
        byte[][] bArr = this.QrzZRwfaDlRX;
        if (bArr.length < i3) {
            this.QrzZRwfaDlRX = (byte[][]) Arrays.copyOf(bArr, i3);
        }
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        if (!this.wdg6QnbFHrFF) {
            e9gEMXR7LXtO();
            reset();
        }
        this.wdg6QnbFHrFF = true;
    }

    @Override // defpackage.hy1
    public final String dgRBjINgWbAK(int i) {
        lS5Rgt96tfkO();
        Cursor cursor = this.gPXPFXrUH4XX;
        if (cursor == null) {
            sj0.zf8DYfih6EZu("no row", 21);
            throw null;
        }
        cpQdD2nAriOS(cursor, i);
        String string = cursor.getString(i);
        string.getClass();
        return string;
    }

    @Override // defpackage.ac2, defpackage.hy1
    public final void e9gEMXR7LXtO() {
        lS5Rgt96tfkO();
        this.dgRBjINgWbAK = new int[0];
        this.x50lh2ztY7Y5 = new long[0];
        this.cpQdD2nAriOS = new double[0];
        this.r3s1LDPKFs1S = new String[0];
        this.QrzZRwfaDlRX = new byte[0][];
    }

    @Override // defpackage.hy1
    public final int getColumnCount() {
        lS5Rgt96tfkO();
        OPXfSBeufaJ8();
        Cursor cursor = this.gPXPFXrUH4XX;
        if (cursor != null) {
            return cursor.getColumnCount();
        }
        return 0;
    }

    @Override // defpackage.hy1
    public final String getColumnName(int i) {
        lS5Rgt96tfkO();
        OPXfSBeufaJ8();
        Cursor cursor = this.gPXPFXrUH4XX;
        if (cursor == null) {
            u9.rtx2ld2ELZv4("Required value was null.");
            return null;
        }
        cpQdD2nAriOS(cursor, i);
        String columnName = cursor.getColumnName(i);
        columnName.getClass();
        return columnName;
    }

    @Override // defpackage.hy1
    public final long getLong(int i) {
        lS5Rgt96tfkO();
        Cursor cursor = this.gPXPFXrUH4XX;
        if (cursor != null) {
            cpQdD2nAriOS(cursor, i);
            return cursor.getLong(i);
        }
        sj0.zf8DYfih6EZu("no row", 21);
        throw null;
    }

    @Override // defpackage.hy1
    public final boolean isNull(int i) {
        lS5Rgt96tfkO();
        Cursor cursor = this.gPXPFXrUH4XX;
        if (cursor != null) {
            cpQdD2nAriOS(cursor, i);
            return cursor.isNull(i);
        }
        sj0.zf8DYfih6EZu("no row", 21);
        throw null;
    }

    @Override // defpackage.ac2, defpackage.hy1
    public final void reset() {
        lS5Rgt96tfkO();
        Cursor cursor = this.gPXPFXrUH4XX;
        if (cursor != null) {
            cursor.close();
        }
        this.gPXPFXrUH4XX = null;
    }

    @Override // defpackage.hy1
    public final boolean tmVwIGCQF4zR() {
        lS5Rgt96tfkO();
        OPXfSBeufaJ8();
        Cursor cursor = this.gPXPFXrUH4XX;
        if (cursor != null) {
            return cursor.moveToNext();
        }
        u9.rtx2ld2ELZv4("Required value was null.");
        return false;
    }

    @Override // defpackage.hy1
    public final void wdg6QnbFHrFF(String str, int i) {
        str.getClass();
        lS5Rgt96tfkO();
        a92UlCVFR9N8(3, i);
        this.dgRBjINgWbAK[i] = 3;
        this.r3s1LDPKFs1S[i] = str;
    }
}
