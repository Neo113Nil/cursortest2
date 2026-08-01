package l5;

import android.database.Cursor;
import java.util.Arrays;
import kotlin.collections.i0;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class e extends f {

    /* renamed from: r, reason: collision with root package name */
    public int[] f5871r;

    /* renamed from: s, reason: collision with root package name */
    public long[] f5872s;

    /* renamed from: t, reason: collision with root package name */
    public double[] f5873t;

    /* renamed from: u, reason: collision with root package name */
    public String[] f5874u;

    /* renamed from: v, reason: collision with root package name */
    public byte[][] f5875v;

    /* renamed from: w, reason: collision with root package name */
    public Cursor f5876w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(k5.d dVar, String str) {
        super(dVar, str);
        dVar.getClass();
        str.getClass();
        this.f5871r = new int[0];
        this.f5872s = new long[0];
        this.f5873t = new double[0];
        this.f5874u = new String[0];
        this.f5875v = new byte[0][];
    }

    public static void i(Cursor cursor, int i3) {
        if (i3 < 0 || i3 >= cursor.getColumnCount()) {
            g8.b.L(25, "column index out of range");
            throw null;
        }
    }

    @Override // i5.c
    public final boolean E() {
        a();
        h();
        Cursor cursor = this.f5876w;
        if (cursor != null) {
            return cursor.moveToNext();
        }
        i0.l("Required value was null.");
        return false;
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        if (!this.f5879i) {
            g();
            reset();
        }
        this.f5879i = true;
    }

    public final void d(int i3, int i10) {
        int i11 = i10 + 1;
        int[] iArr = this.f5871r;
        if (iArr.length < i11) {
            this.f5871r = Arrays.copyOf(iArr, i11);
        }
        if (i3 == 1) {
            long[] jArr = this.f5872s;
            if (jArr.length < i11) {
                this.f5872s = Arrays.copyOf(jArr, i11);
                return;
            }
            return;
        }
        if (i3 == 2) {
            double[] dArr = this.f5873t;
            if (dArr.length < i11) {
                this.f5873t = Arrays.copyOf(dArr, i11);
                return;
            }
            return;
        }
        if (i3 == 3) {
            String[] strArr = this.f5874u;
            if (strArr.length < i11) {
                this.f5874u = (String[]) Arrays.copyOf(strArr, i11);
                return;
            }
            return;
        }
        if (i3 != 4) {
            return;
        }
        byte[][] bArr = this.f5875v;
        if (bArr.length < i11) {
            this.f5875v = (byte[][]) Arrays.copyOf(bArr, i11);
        }
    }

    @Override // i5.c
    public final void f(int i3, long j) {
        a();
        d(1, i3);
        this.f5871r[i3] = 1;
        this.f5872s[i3] = j;
    }

    @Override // l5.f, i5.c
    public final void g() {
        a();
        this.f5871r = new int[0];
        this.f5872s = new long[0];
        this.f5873t = new double[0];
        this.f5874u = new String[0];
        this.f5875v = new byte[0][];
    }

    @Override // i5.c
    public final int getColumnCount() {
        a();
        h();
        Cursor cursor = this.f5876w;
        if (cursor != null) {
            return cursor.getColumnCount();
        }
        return 0;
    }

    @Override // i5.c
    public final String getColumnName(int i3) {
        a();
        h();
        Cursor cursor = this.f5876w;
        if (cursor == null) {
            i0.l("Required value was null.");
            return null;
        }
        i(cursor, i3);
        String columnName = cursor.getColumnName(i3);
        columnName.getClass();
        return columnName;
    }

    @Override // i5.c
    public final long getLong(int i3) {
        a();
        Cursor cursor = this.f5876w;
        if (cursor != null) {
            i(cursor, i3);
            return cursor.getLong(i3);
        }
        g8.b.L(21, "no row");
        throw null;
    }

    public final void h() {
        if (this.f5876w == null) {
            this.f5876w = this.f5877d.o(new l.d(2, this));
        }
    }

    @Override // i5.c
    public final boolean isNull(int i3) {
        a();
        Cursor cursor = this.f5876w;
        if (cursor != null) {
            i(cursor, i3);
            return cursor.isNull(i3);
        }
        g8.b.L(21, "no row");
        throw null;
    }

    @Override // i5.c
    public final String k(int i3) {
        a();
        Cursor cursor = this.f5876w;
        if (cursor == null) {
            g8.b.L(21, "no row");
            throw null;
        }
        i(cursor, i3);
        String string = cursor.getString(i3);
        string.getClass();
        return string;
    }

    @Override // i5.c
    public final void q(String str) {
        str.getClass();
        a();
        d(3, 2);
        this.f5871r[2] = 3;
        this.f5874u[2] = str;
    }

    @Override // l5.f, i5.c
    public final void reset() {
        a();
        Cursor cursor = this.f5876w;
        if (cursor != null) {
            cursor.close();
        }
        this.f5876w = null;
    }
}
