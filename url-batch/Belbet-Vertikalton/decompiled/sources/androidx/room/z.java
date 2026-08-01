package androidx.room;

import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;
import k0.InterfaceC0201c;
import k0.InterfaceC0202d;

/* loaded from: classes.dex */
public final class z implements InterfaceC0202d, InterfaceC0201c {

    /* renamed from: h, reason: collision with root package name */
    public static final TreeMap f2143h = new TreeMap();

    /* renamed from: a, reason: collision with root package name */
    public volatile String f2144a;

    /* renamed from: g, reason: collision with root package name */
    public int f2149g;

    /* renamed from: f, reason: collision with root package name */
    public final int[] f2148f = new int[3];

    /* renamed from: b, reason: collision with root package name */
    public final long[] f2145b = new long[3];

    /* renamed from: c, reason: collision with root package name */
    public final double[] f2146c = new double[3];

    /* renamed from: d, reason: collision with root package name */
    public final String[] f2147d = new String[3];
    public final byte[][] e = new byte[3][];

    public static final z a() {
        TreeMap treeMap = f2143h;
        synchronized (treeMap) {
            Map.Entry ceilingEntry = treeMap.ceilingEntry(2);
            if (ceilingEntry == null) {
                z zVar = new z();
                zVar.f2144a = "SELECT * FROM food_entries WHERE loggedAt >= ? AND loggedAt < ? ORDER BY loggedAt DESC";
                zVar.f2149g = 2;
                return zVar;
            }
            treeMap.remove(ceilingEntry.getKey());
            z zVar2 = (z) ceilingEntry.getValue();
            zVar2.f2144a = "SELECT * FROM food_entries WHERE loggedAt >= ? AND loggedAt < ? ORDER BY loggedAt DESC";
            zVar2.f2149g = 2;
            return zVar2;
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
    }

    @Override // k0.InterfaceC0202d
    public final String d() {
        String str = this.f2144a;
        if (str != null) {
            return str;
        }
        throw new IllegalStateException("Required value was null.");
    }

    @Override // k0.InterfaceC0201c
    public final void j(int i, byte[] bArr) {
        this.f2148f[i] = 5;
        this.e[i] = bArr;
    }

    @Override // k0.InterfaceC0201c
    public final void k(int i) {
        this.f2148f[i] = 1;
    }

    @Override // k0.InterfaceC0201c
    public final void l(String str, int i) {
        this.f2148f[i] = 4;
        this.f2147d[i] = str;
    }

    @Override // k0.InterfaceC0201c
    public final void m(int i, double d2) {
        this.f2148f[i] = 3;
        this.f2146c[i] = d2;
    }

    @Override // k0.InterfaceC0202d
    public final void q(InterfaceC0201c interfaceC0201c) {
        int i = this.f2149g;
        if (1 > i) {
            return;
        }
        int i2 = 1;
        while (true) {
            int i3 = this.f2148f[i2];
            if (i3 == 1) {
                interfaceC0201c.k(i2);
            } else if (i3 == 2) {
                interfaceC0201c.t(i2, this.f2145b[i2]);
            } else if (i3 == 3) {
                interfaceC0201c.m(i2, this.f2146c[i2]);
            } else if (i3 == 4) {
                String str = this.f2147d[i2];
                if (str == null) {
                    throw new IllegalArgumentException("Required value was null.");
                }
                interfaceC0201c.l(str, i2);
            } else if (i3 == 5) {
                byte[] bArr = this.e[i2];
                if (bArr == null) {
                    throw new IllegalArgumentException("Required value was null.");
                }
                interfaceC0201c.j(i2, bArr);
            }
            if (i2 == i) {
                return;
            } else {
                i2++;
            }
        }
    }

    @Override // k0.InterfaceC0201c
    public final void t(int i, long j) {
        this.f2148f[i] = 2;
        this.f2145b[i] = j;
    }

    public final void z() {
        TreeMap treeMap = f2143h;
        synchronized (treeMap) {
            treeMap.put(2, this);
            if (treeMap.size() > 15) {
                int size = treeMap.size() - 10;
                Iterator it = treeMap.descendingKeySet().iterator();
                j1.h.d(it, "queryPool.descendingKeySet().iterator()");
                while (true) {
                    int i = size - 1;
                    if (size <= 0) {
                        break;
                    }
                    it.next();
                    it.remove();
                    size = i;
                }
            }
        }
    }
}
