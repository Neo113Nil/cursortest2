package w1;

import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;

/* renamed from: w1.A, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1174A implements z1.c, z1.b {

    /* renamed from: l, reason: collision with root package name */
    public static final TreeMap f9841l = new TreeMap();

    /* renamed from: d, reason: collision with root package name */
    public final int f9842d;

    /* renamed from: e, reason: collision with root package name */
    public volatile String f9843e;

    /* renamed from: f, reason: collision with root package name */
    public final long[] f9844f;

    /* renamed from: g, reason: collision with root package name */
    public final double[] f9845g;

    /* renamed from: h, reason: collision with root package name */
    public final String[] f9846h;

    /* renamed from: i, reason: collision with root package name */
    public final byte[][] f9847i;

    /* renamed from: j, reason: collision with root package name */
    public final int[] f9848j;

    /* renamed from: k, reason: collision with root package name */
    public int f9849k;

    public C1174A(int i3) {
        this.f9842d = i3;
        int i4 = i3 + 1;
        this.f9848j = new int[i4];
        this.f9844f = new long[i4];
        this.f9845g = new double[i4];
        this.f9846h = new String[i4];
        this.f9847i = new byte[i4][];
    }

    public static final C1174A b(String str, int i3) {
        TreeMap treeMap = f9841l;
        synchronized (treeMap) {
            Map.Entry ceilingEntry = treeMap.ceilingEntry(Integer.valueOf(i3));
            if (ceilingEntry == null) {
                C1174A c1174a = new C1174A(i3);
                c1174a.f9843e = str;
                c1174a.f9849k = i3;
                return c1174a;
            }
            treeMap.remove(ceilingEntry.getKey());
            C1174A c1174a2 = (C1174A) ceilingEntry.getValue();
            c1174a2.f9843e = str;
            c1174a2.f9849k = i3;
            return c1174a2;
        }
    }

    @Override // z1.b
    public final void A(long j3, int i3) {
        this.f9848j[i3] = 2;
        this.f9844f[i3] = j3;
    }

    @Override // z1.c
    public final void a(z1.b bVar) {
        int i3 = this.f9849k;
        if (1 > i3) {
            return;
        }
        int i4 = 1;
        while (true) {
            int i5 = this.f9848j[i4];
            if (i5 == 1) {
                bVar.k(i4);
            } else if (i5 == 2) {
                bVar.A(this.f9844f[i4], i4);
            } else if (i5 == 3) {
                bVar.i(this.f9845g[i4], i4);
            } else if (i5 == 4) {
                String str = this.f9846h[i4];
                if (str == null) {
                    throw new IllegalArgumentException("Required value was null.");
                }
                bVar.m(str, i4);
            } else if (i5 == 5) {
                byte[] bArr = this.f9847i[i4];
                if (bArr == null) {
                    throw new IllegalArgumentException("Required value was null.");
                }
                bVar.j(i4, bArr);
            }
            if (i4 == i3) {
                return;
            } else {
                i4++;
            }
        }
    }

    @Override // z1.c
    public final String d() {
        String str = this.f9843e;
        if (str != null) {
            return str;
        }
        throw new IllegalStateException("Required value was null.");
    }

    public final void e() {
        TreeMap treeMap = f9841l;
        synchronized (treeMap) {
            treeMap.put(Integer.valueOf(this.f9842d), this);
            if (treeMap.size() > 15) {
                int size = treeMap.size() - 10;
                Iterator it = treeMap.descendingKeySet().iterator();
                f2.j.e(it, "queryPool.descendingKeySet().iterator()");
                while (true) {
                    int i3 = size - 1;
                    if (size <= 0) {
                        break;
                    }
                    it.next();
                    it.remove();
                    size = i3;
                }
            }
        }
    }

    @Override // z1.b
    public final void i(double d3, int i3) {
        this.f9848j[i3] = 3;
        this.f9845g[i3] = d3;
    }

    @Override // z1.b
    public final void j(int i3, byte[] bArr) {
        this.f9848j[i3] = 5;
        this.f9847i[i3] = bArr;
    }

    @Override // z1.b
    public final void k(int i3) {
        this.f9848j[i3] = 1;
    }

    @Override // z1.b
    public final void m(String str, int i3) {
        this.f9848j[i3] = 4;
        this.f9846h[i3] = str;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
    }
}
