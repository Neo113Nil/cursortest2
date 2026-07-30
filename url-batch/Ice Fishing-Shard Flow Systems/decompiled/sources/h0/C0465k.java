package h0;

import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: h0.k, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0465k implements l0.e, l0.d {

    /* renamed from: q, reason: collision with root package name */
    public static final TreeMap f5110q = new TreeMap();

    /* renamed from: d, reason: collision with root package name */
    public final int f5111d;

    /* renamed from: e, reason: collision with root package name */
    public volatile String f5112e;

    /* renamed from: i, reason: collision with root package name */
    public final long[] f5113i;

    /* renamed from: l, reason: collision with root package name */
    public final double[] f5114l;

    /* renamed from: m, reason: collision with root package name */
    public final String[] f5115m;

    /* renamed from: n, reason: collision with root package name */
    public final byte[][] f5116n;

    /* renamed from: o, reason: collision with root package name */
    public final int[] f5117o;

    /* renamed from: p, reason: collision with root package name */
    public int f5118p;

    public C0465k(int i2) {
        this.f5111d = i2;
        int i5 = i2 + 1;
        this.f5117o = new int[i5];
        this.f5113i = new long[i5];
        this.f5114l = new double[i5];
        this.f5115m = new String[i5];
        this.f5116n = new byte[i5][];
    }

    public static final C0465k g(int i2, String query) {
        Intrinsics.checkNotNullParameter(query, "query");
        TreeMap treeMap = f5110q;
        synchronized (treeMap) {
            Map.Entry ceilingEntry = treeMap.ceilingEntry(Integer.valueOf(i2));
            if (ceilingEntry == null) {
                Unit unit = Unit.f6114a;
                C0465k c0465k = new C0465k(i2);
                Intrinsics.checkNotNullParameter(query, "query");
                c0465k.f5112e = query;
                c0465k.f5118p = i2;
                return c0465k;
            }
            treeMap.remove(ceilingEntry.getKey());
            C0465k sqliteQuery = (C0465k) ceilingEntry.getValue();
            sqliteQuery.getClass();
            Intrinsics.checkNotNullParameter(query, "query");
            sqliteQuery.f5112e = query;
            sqliteQuery.f5118p = i2;
            Intrinsics.checkNotNullExpressionValue(sqliteQuery, "sqliteQuery");
            return sqliteQuery;
        }
    }

    @Override // l0.d
    public final void D(byte[] value, int i2) {
        Intrinsics.checkNotNullParameter(value, "value");
        this.f5117o[i2] = 5;
        this.f5116n[i2] = value;
    }

    @Override // l0.e
    public final String a() {
        String str = this.f5112e;
        if (str != null) {
            return str;
        }
        throw new IllegalStateException("Required value was null.");
    }

    @Override // l0.e
    public final void d(l0.d statement) {
        Intrinsics.checkNotNullParameter(statement, "statement");
        int i2 = this.f5118p;
        if (1 > i2) {
            return;
        }
        int i5 = 1;
        while (true) {
            int i7 = this.f5117o[i5];
            if (i7 == 1) {
                statement.l(i5);
            } else if (i7 == 2) {
                statement.r(this.f5113i[i5], i5);
            } else if (i7 == 3) {
                statement.m(i5, this.f5114l[i5]);
            } else if (i7 == 4) {
                String str = this.f5115m[i5];
                if (str == null) {
                    throw new IllegalArgumentException("Required value was null.");
                }
                statement.f(i5, str);
            } else if (i7 == 5) {
                byte[] bArr = this.f5116n[i5];
                if (bArr == null) {
                    throw new IllegalArgumentException("Required value was null.");
                }
                statement.D(bArr, i5);
            }
            if (i5 == i2) {
                return;
            } else {
                i5++;
            }
        }
    }

    @Override // l0.d
    public final void f(int i2, String value) {
        Intrinsics.checkNotNullParameter(value, "value");
        this.f5117o[i2] = 4;
        this.f5115m[i2] = value;
    }

    public final void h() {
        TreeMap treeMap = f5110q;
        synchronized (treeMap) {
            treeMap.put(Integer.valueOf(this.f5111d), this);
            if (treeMap.size() > 15) {
                int size = treeMap.size() - 10;
                Iterator it = treeMap.descendingKeySet().iterator();
                Intrinsics.checkNotNullExpressionValue(it, "queryPool.descendingKeySet().iterator()");
                while (true) {
                    int i2 = size - 1;
                    if (size <= 0) {
                        break;
                    }
                    it.next();
                    it.remove();
                    size = i2;
                }
            }
            Unit unit = Unit.f6114a;
        }
    }

    @Override // l0.d
    public final void l(int i2) {
        this.f5117o[i2] = 1;
    }

    @Override // l0.d
    public final void m(int i2, double d7) {
        this.f5117o[i2] = 3;
        this.f5114l[i2] = d7;
    }

    @Override // l0.d
    public final void r(long j, int i2) {
        this.f5117o[i2] = 2;
        this.f5113i[i2] = j;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
    }
}
