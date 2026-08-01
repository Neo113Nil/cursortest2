package h0;

import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;

/* loaded from: classes.dex */
public final class p implements k0.c, k0.b {
    public static final TreeMap i = new TreeMap();

    /* renamed from: a, reason: collision with root package name */
    public final int f2990a;

    /* renamed from: b, reason: collision with root package name */
    public volatile String f2991b;

    /* renamed from: c, reason: collision with root package name */
    public final long[] f2992c;
    public final double[] d;

    /* renamed from: e, reason: collision with root package name */
    public final String[] f2993e;

    /* renamed from: f, reason: collision with root package name */
    public final byte[][] f2994f;

    /* renamed from: g, reason: collision with root package name */
    public final int[] f2995g;
    public int h;

    public p(int i2) {
        this.f2990a = i2;
        int i3 = i2 + 1;
        this.f2995g = new int[i3];
        this.f2992c = new long[i3];
        this.d = new double[i3];
        this.f2993e = new String[i3];
        this.f2994f = new byte[i3][];
    }

    public static final p a(String str, int i2) {
        TreeMap treeMap = i;
        synchronized (treeMap) {
            Map.Entry ceilingEntry = treeMap.ceilingEntry(Integer.valueOf(i2));
            if (ceilingEntry == null) {
                p pVar = new p(i2);
                pVar.f2991b = str;
                pVar.h = i2;
                return pVar;
            }
            treeMap.remove(ceilingEntry.getKey());
            p pVar2 = (p) ceilingEntry.getValue();
            pVar2.f2991b = str;
            pVar2.h = i2;
            return pVar2;
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
    }

    @Override // k0.c
    public final String d() {
        String str = this.f2991b;
        if (str != null) {
            return str;
        }
        throw new IllegalStateException("Required value was null.");
    }

    @Override // k0.b
    public final void e(int i2, byte[] bArr) {
        this.f2995g[i2] = 5;
        this.f2994f[i2] = bArr;
    }

    @Override // k0.b
    public final void f(int i2) {
        this.f2995g[i2] = 1;
    }

    @Override // k0.b
    public final void g(String str, int i2) {
        this.f2995g[i2] = 4;
        this.f2993e[i2] = str;
    }

    @Override // k0.b
    public final void h(int i2, double d) {
        this.f2995g[i2] = 3;
        this.d[i2] = d;
    }

    @Override // k0.c
    public final void j(k0.b bVar) {
        int i2 = this.h;
        if (1 > i2) {
            return;
        }
        int i3 = 1;
        while (true) {
            int i4 = this.f2995g[i3];
            if (i4 == 1) {
                bVar.f(i3);
            } else if (i4 == 2) {
                bVar.n(i3, this.f2992c[i3]);
            } else if (i4 == 3) {
                bVar.h(i3, this.d[i3]);
            } else if (i4 == 4) {
                String str = this.f2993e[i3];
                if (str == null) {
                    throw new IllegalArgumentException("Required value was null.");
                }
                bVar.g(str, i3);
            } else if (i4 == 5) {
                byte[] bArr = this.f2994f[i3];
                if (bArr == null) {
                    throw new IllegalArgumentException("Required value was null.");
                }
                bVar.e(i3, bArr);
            }
            if (i3 == i2) {
                return;
            } else {
                i3++;
            }
        }
    }

    public final void k() {
        TreeMap treeMap = i;
        synchronized (treeMap) {
            treeMap.put(Integer.valueOf(this.f2990a), this);
            if (treeMap.size() > 15) {
                int size = treeMap.size() - 10;
                Iterator it = treeMap.descendingKeySet().iterator();
                k1.e.d(it, "queryPool.descendingKeySet().iterator()");
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
        }
    }

    @Override // k0.b
    public final void n(int i2, long j2) {
        this.f2995g[i2] = 2;
        this.f2992c[i2] = j2;
    }
}
