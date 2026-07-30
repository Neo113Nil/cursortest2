package u0;

import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;

/* renamed from: u0.i, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5098i implements y0.d, y0.c {

    /* renamed from: B, reason: collision with root package name */
    public static final TreeMap f41043B = new TreeMap();

    /* renamed from: A, reason: collision with root package name */
    public int f41044A;

    /* renamed from: n, reason: collision with root package name */
    public final int f41045n;

    /* renamed from: u, reason: collision with root package name */
    public volatile String f41046u;

    /* renamed from: v, reason: collision with root package name */
    public final long[] f41047v;

    /* renamed from: w, reason: collision with root package name */
    public final double[] f41048w;

    /* renamed from: x, reason: collision with root package name */
    public final String[] f41049x;

    /* renamed from: y, reason: collision with root package name */
    public final byte[][] f41050y;

    /* renamed from: z, reason: collision with root package name */
    public final int[] f41051z;

    public C5098i(int i) {
        this.f41045n = i;
        int i4 = i + 1;
        this.f41051z = new int[i4];
        this.f41047v = new long[i4];
        this.f41048w = new double[i4];
        this.f41049x = new String[i4];
        this.f41050y = new byte[i4][];
    }

    public static final C5098i a(int i, String str) {
        TreeMap treeMap = f41043B;
        synchronized (treeMap) {
            Map.Entry ceilingEntry = treeMap.ceilingEntry(Integer.valueOf(i));
            if (ceilingEntry == null) {
                C5098i c5098i = new C5098i(i);
                c5098i.f41046u = str;
                c5098i.f41044A = i;
                return c5098i;
            }
            treeMap.remove(ceilingEntry.getKey());
            C5098i c5098i2 = (C5098i) ceilingEntry.getValue();
            c5098i2.f41046u = str;
            c5098i2.f41044A = i;
            return c5098i2;
        }
    }

    @Override // y0.d
    public final String b() {
        String str = this.f41046u;
        if (str != null) {
            return str;
        }
        throw new IllegalStateException("Required value was null.");
    }

    @Override // y0.c
    public final void c(int i, String value) {
        kotlin.jvm.internal.h.e(value, "value");
        this.f41051z[i] = 4;
        this.f41049x[i] = value;
    }

    @Override // y0.c
    public final void d(int i, double d2) {
        this.f41051z[i] = 3;
        this.f41048w[i] = d2;
    }

    @Override // y0.d
    public final void g(y0.c cVar) {
        int i = this.f41044A;
        if (1 > i) {
            return;
        }
        int i4 = 1;
        while (true) {
            int i9 = this.f41051z[i4];
            if (i9 == 1) {
                cVar.o(i4);
            } else if (i9 == 2) {
                cVar.h(i4, this.f41047v[i4]);
            } else if (i9 == 3) {
                cVar.d(i4, this.f41048w[i4]);
            } else if (i9 == 4) {
                String str = this.f41049x[i4];
                if (str == null) {
                    throw new IllegalArgumentException("Required value was null.");
                }
                cVar.c(i4, str);
            } else if (i9 == 5) {
                byte[] bArr = this.f41050y[i4];
                if (bArr == null) {
                    throw new IllegalArgumentException("Required value was null.");
                }
                cVar.l(i4, bArr);
            }
            if (i4 == i) {
                return;
            } else {
                i4++;
            }
        }
    }

    @Override // y0.c
    public final void h(int i, long j9) {
        this.f41051z[i] = 2;
        this.f41047v[i] = j9;
    }

    public final void j() {
        TreeMap treeMap = f41043B;
        synchronized (treeMap) {
            treeMap.put(Integer.valueOf(this.f41045n), this);
            if (treeMap.size() > 15) {
                int size = treeMap.size() - 10;
                Iterator it = treeMap.descendingKeySet().iterator();
                kotlin.jvm.internal.h.d(it, "queryPool.descendingKeySet().iterator()");
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

    @Override // y0.c
    public final void l(int i, byte[] bArr) {
        this.f41051z[i] = 5;
        this.f41050y[i] = bArr;
    }

    @Override // y0.c
    public final void o(int i) {
        this.f41051z[i] = 1;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
    }
}
