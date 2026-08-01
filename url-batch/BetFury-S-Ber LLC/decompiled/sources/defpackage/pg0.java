package defpackage;

import android.database.Cursor;
import java.util.Arrays;

/* compiled from: r8-map-id-555d5e190d9a27a9a8404de93c25a29c9fbe11559b3463c92c68ce527c1de619 */
/* loaded from: classes.dex */
public final class pg0 extends sg0 {
    public int[] i;
    public long[] j;
    public double[] k;
    public String[] l;
    public byte[][] m;
    public Cursor n;

    public static void w(Cursor cursor, int i) {
        if (i < 0 || i >= cursor.getColumnCount()) {
            gk0.S("column index out of range", 25);
            throw null;
        }
    }

    @Override // defpackage.eb0
    public final boolean G() {
        i();
        r();
        Cursor cursor = this.n;
        if (cursor != null) {
            return cursor.moveToNext();
        }
        s9.u("Required value was null.");
        return false;
    }

    @Override // defpackage.eb0
    public final void b(int i, long j) {
        i();
        n(1, i);
        this.i[i] = 1;
        this.j[i] = j;
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        if (!this.h) {
            i();
            this.i = new int[0];
            this.j = new long[0];
            this.k = new double[0];
            this.l = new String[0];
            this.m = new byte[0][];
            reset();
        }
        this.h = true;
    }

    @Override // defpackage.eb0
    public final void g(String str, int i) {
        str.getClass();
        i();
        n(3, i);
        this.i[i] = 3;
        this.l[i] = str;
    }

    @Override // defpackage.eb0
    public final int getColumnCount() {
        i();
        r();
        Cursor cursor = this.n;
        if (cursor != null) {
            return cursor.getColumnCount();
        }
        return 0;
    }

    @Override // defpackage.eb0
    public final String getColumnName(int i) {
        i();
        r();
        Cursor cursor = this.n;
        if (cursor == null) {
            s9.u("Required value was null.");
            return null;
        }
        w(cursor, i);
        String columnName = cursor.getColumnName(i);
        columnName.getClass();
        return columnName;
    }

    @Override // defpackage.eb0
    public final long getLong(int i) {
        i();
        Cursor cursor = this.n;
        if (cursor != null) {
            w(cursor, i);
            return cursor.getLong(i);
        }
        gk0.S("no row", 21);
        throw null;
    }

    @Override // defpackage.eb0
    public final String h(int i) {
        i();
        Cursor cursor = this.n;
        if (cursor == null) {
            gk0.S("no row", 21);
            throw null;
        }
        w(cursor, i);
        String string = cursor.getString(i);
        string.getClass();
        return string;
    }

    @Override // defpackage.eb0
    public final boolean isNull(int i) {
        i();
        Cursor cursor = this.n;
        if (cursor != null) {
            w(cursor, i);
            return cursor.isNull(i);
        }
        gk0.S("no row", 21);
        throw null;
    }

    public final void n(int i, int i2) {
        int i3 = i2 + 1;
        int[] iArr = this.i;
        if (iArr.length < i3) {
            this.i = Arrays.copyOf(iArr, i3);
        }
        if (i == 1) {
            long[] jArr = this.j;
            if (jArr.length < i3) {
                this.j = Arrays.copyOf(jArr, i3);
                return;
            }
            return;
        }
        if (i == 2) {
            double[] dArr = this.k;
            if (dArr.length < i3) {
                this.k = Arrays.copyOf(dArr, i3);
                return;
            }
            return;
        }
        if (i == 3) {
            String[] strArr = this.l;
            if (strArr.length < i3) {
                this.l = (String[]) Arrays.copyOf(strArr, i3);
                return;
            }
            return;
        }
        if (i != 4) {
            return;
        }
        byte[][] bArr = this.m;
        if (bArr.length < i3) {
            this.m = (byte[][]) Arrays.copyOf(bArr, i3);
        }
    }

    public final void r() {
        if (this.n == null) {
            this.n = this.f.f(new kz(this));
        }
    }

    @Override // defpackage.eb0
    public final void reset() {
        i();
        Cursor cursor = this.n;
        if (cursor != null) {
            cursor.close();
        }
        this.n = null;
    }

    @Override // defpackage.eb0
    public final void s() {
        i();
        n(5, 6);
        this.i[6] = 5;
    }
}
