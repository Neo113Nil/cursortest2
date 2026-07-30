package androidx.room;

import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class x implements y3.d, y3.c {

    /* renamed from: n, reason: collision with root package name */
    public static final TreeMap f1121n = new TreeMap();

    /* renamed from: f, reason: collision with root package name */
    public final int f1122f;

    /* renamed from: g, reason: collision with root package name */
    public volatile String f1123g;

    /* renamed from: h, reason: collision with root package name */
    public final long[] f1124h;

    /* renamed from: i, reason: collision with root package name */
    public final double[] f1125i;

    /* renamed from: j, reason: collision with root package name */
    public final String[] f1126j;

    /* renamed from: k, reason: collision with root package name */
    public final byte[][] f1127k;

    /* renamed from: l, reason: collision with root package name */
    public final int[] f1128l;

    /* renamed from: m, reason: collision with root package name */
    public int f1129m;

    public x(int i7) {
        this.f1122f = i7;
        int i8 = i7 + 1;
        this.f1128l = new int[i8];
        this.f1124h = new long[i8];
        this.f1125i = new double[i8];
        this.f1126j = new String[i8];
        this.f1127k = new byte[i8][];
    }

    public static final x k(String str, int i7) {
        TreeMap treeMap = f1121n;
        synchronized (treeMap) {
            Map.Entry ceilingEntry = treeMap.ceilingEntry(Integer.valueOf(i7));
            if (ceilingEntry == null) {
                x xVar = new x(i7);
                xVar.f1123g = str;
                xVar.f1129m = i7;
                return xVar;
            }
            treeMap.remove(ceilingEntry.getKey());
            x xVar2 = (x) ceilingEntry.getValue();
            xVar2.f1123g = str;
            xVar2.f1129m = i7;
            return xVar2;
        }
    }

    @Override // y3.c
    public final void G(int i7, byte[] bArr) {
        this.f1128l[i7] = 5;
        this.f1127k[i7] = bArr;
    }

    @Override // y3.c
    public final void H(String str, int i7) {
        this.f1128l[i7] = 4;
        this.f1126j[i7] = str;
    }

    @Override // y3.d
    public final String b() {
        String str = this.f1123g;
        if (str != null) {
            return str;
        }
        throw new IllegalStateException("Required value was null.");
    }

    @Override // y3.d
    public final void c(y3.c cVar) {
        int i7 = this.f1129m;
        if (1 > i7) {
            return;
        }
        int i8 = 1;
        while (true) {
            int i9 = this.f1128l[i8];
            if (i9 == 1) {
                cVar.o(i8);
            } else if (i9 == 2) {
                cVar.r(this.f1124h[i8], i8);
            } else if (i9 == 3) {
                cVar.j(this.f1125i[i8], i8);
            } else if (i9 == 4) {
                String str = this.f1126j[i8];
                if (str == null) {
                    throw new IllegalArgumentException("Required value was null.");
                }
                cVar.H(str, i8);
            } else if (i9 == 5) {
                byte[] bArr = this.f1127k[i8];
                if (bArr == null) {
                    throw new IllegalArgumentException("Required value was null.");
                }
                cVar.G(i8, bArr);
            }
            if (i8 == i7) {
                return;
            } else {
                i8++;
            }
        }
    }

    @Override // y3.c
    public final void j(double d8, int i7) {
        this.f1128l[i7] = 3;
        this.f1125i[i7] = d8;
    }

    public final void n() {
        TreeMap treeMap = f1121n;
        synchronized (treeMap) {
            treeMap.put(Integer.valueOf(this.f1122f), this);
            if (treeMap.size() > 15) {
                int size = treeMap.size() - 10;
                Iterator it = treeMap.descendingKeySet().iterator();
                r6.k.e(it, "queryPool.descendingKeySet().iterator()");
                while (true) {
                    int i7 = size - 1;
                    if (size <= 0) {
                        break;
                    }
                    it.next();
                    it.remove();
                    size = i7;
                }
            }
        }
    }

    @Override // y3.c
    public final void o(int i7) {
        this.f1128l[i7] = 1;
    }

    @Override // y3.c
    public final void r(long j8, int i7) {
        this.f1128l[i7] = 2;
        this.f1124h[i7] = j8;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
    }
}
