package Q;

import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;

/* loaded from: classes.dex */
public final class k implements U.e, U.d {

    /* renamed from: n, reason: collision with root package name */
    public static final TreeMap f1948n = new TreeMap();

    /* renamed from: f, reason: collision with root package name */
    public final int f1949f;

    /* renamed from: g, reason: collision with root package name */
    public volatile String f1950g;

    /* renamed from: h, reason: collision with root package name */
    public final long[] f1951h;

    /* renamed from: i, reason: collision with root package name */
    public final double[] f1952i;

    /* renamed from: j, reason: collision with root package name */
    public final String[] f1953j;

    /* renamed from: k, reason: collision with root package name */
    public final byte[][] f1954k;

    /* renamed from: l, reason: collision with root package name */
    public final int[] f1955l;

    /* renamed from: m, reason: collision with root package name */
    public int f1956m;

    public k(int i7) {
        this.f1949f = i7;
        int i8 = i7 + 1;
        this.f1955l = new int[i8];
        this.f1951h = new long[i8];
        this.f1952i = new double[i8];
        this.f1953j = new String[i8];
        this.f1954k = new byte[i8][];
    }

    public static final k e(String str, int i7) {
        TreeMap treeMap = f1948n;
        synchronized (treeMap) {
            Map.Entry ceilingEntry = treeMap.ceilingEntry(Integer.valueOf(i7));
            if (ceilingEntry == null) {
                k kVar = new k(i7);
                kVar.f1950g = str;
                kVar.f1956m = i7;
                return kVar;
            }
            treeMap.remove(ceilingEntry.getKey());
            k kVar2 = (k) ceilingEntry.getValue();
            kVar2.f1950g = str;
            kVar2.f1956m = i7;
            return kVar2;
        }
    }

    @Override // U.d
    public final void A(int i7, byte[] bArr) {
        this.f1955l[i7] = 5;
        this.f1954k[i7] = bArr;
    }

    @Override // U.d
    public final void B(String value, int i7) {
        kotlin.jvm.internal.i.e(value, "value");
        this.f1955l[i7] = 4;
        this.f1953j[i7] = value;
    }

    @Override // U.e
    public final void a(U.d dVar) {
        int i7 = this.f1956m;
        if (1 > i7) {
            return;
        }
        int i8 = 1;
        while (true) {
            int i9 = this.f1955l[i8];
            if (i9 == 1) {
                dVar.o(i8);
            } else if (i9 == 2) {
                dVar.t(this.f1951h[i8], i8);
            } else if (i9 == 3) {
                dVar.p(i8, this.f1952i[i8]);
            } else if (i9 == 4) {
                String str = this.f1953j[i8];
                if (str == null) {
                    throw new IllegalArgumentException("Required value was null.");
                }
                dVar.B(str, i8);
            } else if (i9 == 5) {
                byte[] bArr = this.f1954k[i8];
                if (bArr == null) {
                    throw new IllegalArgumentException("Required value was null.");
                }
                dVar.A(i8, bArr);
            }
            if (i8 == i7) {
                return;
            } else {
                i8++;
            }
        }
    }

    @Override // U.e
    public final String d() {
        String str = this.f1950g;
        if (str != null) {
            return str;
        }
        throw new IllegalStateException("Required value was null.");
    }

    public final void g() {
        TreeMap treeMap = f1948n;
        synchronized (treeMap) {
            treeMap.put(Integer.valueOf(this.f1949f), this);
            if (treeMap.size() > 15) {
                int size = treeMap.size() - 10;
                Iterator it = treeMap.descendingKeySet().iterator();
                kotlin.jvm.internal.i.d(it, "queryPool.descendingKeySet().iterator()");
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

    @Override // U.d
    public final void o(int i7) {
        this.f1955l[i7] = 1;
    }

    @Override // U.d
    public final void p(int i7, double d7) {
        this.f1955l[i7] = 3;
        this.f1952i[i7] = d7;
    }

    @Override // U.d
    public final void t(long j4, int i7) {
        this.f1955l[i7] = 2;
        this.f1951h[i7] = j4;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
    }
}
