package t;

import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;
import w.e;

/* loaded from: classes.dex */
public class c implements e, w.d {

    /* renamed from: n, reason: collision with root package name */
    static final TreeMap<Integer, c> f21653n = new TreeMap<>();

    /* renamed from: f, reason: collision with root package name */
    private volatile String f21654f;

    /* renamed from: g, reason: collision with root package name */
    final long[] f21655g;

    /* renamed from: h, reason: collision with root package name */
    final double[] f21656h;

    /* renamed from: i, reason: collision with root package name */
    final String[] f21657i;

    /* renamed from: j, reason: collision with root package name */
    final byte[][] f21658j;

    /* renamed from: k, reason: collision with root package name */
    private final int[] f21659k;

    /* renamed from: l, reason: collision with root package name */
    final int f21660l;

    /* renamed from: m, reason: collision with root package name */
    int f21661m;

    private c(int i7) {
        this.f21660l = i7;
        int i8 = i7 + 1;
        this.f21659k = new int[i8];
        this.f21655g = new long[i8];
        this.f21656h = new double[i8];
        this.f21657i = new String[i8];
        this.f21658j = new byte[i8][];
    }

    public static c h(String str, int i7) {
        TreeMap<Integer, c> treeMap = f21653n;
        synchronized (treeMap) {
            Map.Entry<Integer, c> ceilingEntry = treeMap.ceilingEntry(Integer.valueOf(i7));
            if (ceilingEntry == null) {
                c cVar = new c(i7);
                cVar.i(str, i7);
                return cVar;
            }
            treeMap.remove(ceilingEntry.getKey());
            c value = ceilingEntry.getValue();
            value.i(str, i7);
            return value;
        }
    }

    private static void q() {
        TreeMap<Integer, c> treeMap = f21653n;
        if (treeMap.size() <= 15) {
            return;
        }
        int size = treeMap.size() - 10;
        Iterator<Integer> it = treeMap.descendingKeySet().iterator();
        while (true) {
            int i7 = size - 1;
            if (size <= 0) {
                return;
            }
            it.next();
            it.remove();
            size = i7;
        }
    }

    @Override // w.d
    public void F(int i7, byte[] bArr) {
        this.f21659k[i7] = 5;
        this.f21658j[i7] = bArr;
    }

    @Override // w.e
    public String b() {
        return this.f21654f;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
    }

    @Override // w.e
    public void f(w.d dVar) {
        for (int i7 = 1; i7 <= this.f21661m; i7++) {
            int i8 = this.f21659k[i7];
            if (i8 == 1) {
                dVar.o(i7);
            } else if (i8 == 2) {
                dVar.z(i7, this.f21655g[i7]);
            } else if (i8 == 3) {
                dVar.p(i7, this.f21656h[i7]);
            } else if (i8 == 4) {
                dVar.l(i7, this.f21657i[i7]);
            } else if (i8 == 5) {
                dVar.F(i7, this.f21658j[i7]);
            }
        }
    }

    void i(String str, int i7) {
        this.f21654f = str;
        this.f21661m = i7;
    }

    @Override // w.d
    public void l(int i7, String str) {
        this.f21659k[i7] = 4;
        this.f21657i[i7] = str;
    }

    @Override // w.d
    public void o(int i7) {
        this.f21659k[i7] = 1;
    }

    @Override // w.d
    public void p(int i7, double d7) {
        this.f21659k[i7] = 3;
        this.f21656h[i7] = d7;
    }

    public void u() {
        TreeMap<Integer, c> treeMap = f21653n;
        synchronized (treeMap) {
            treeMap.put(Integer.valueOf(this.f21660l), this);
            q();
        }
    }

    @Override // w.d
    public void z(int i7, long j7) {
        this.f21659k[i7] = 2;
        this.f21655g[i7] = j7;
    }
}
