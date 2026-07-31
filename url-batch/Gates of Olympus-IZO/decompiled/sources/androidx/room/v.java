package androidx.room;

import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;

/* loaded from: classes.dex */
public final class v implements v1.d, v1.c {

    /* renamed from: l, reason: collision with root package name */
    public static final TreeMap f4106l = new TreeMap();

    /* renamed from: d, reason: collision with root package name */
    public final int f4107d;

    /* renamed from: e, reason: collision with root package name */
    public volatile String f4108e;

    /* renamed from: f, reason: collision with root package name */
    public final long[] f4109f;

    /* renamed from: g, reason: collision with root package name */
    public final double[] f4110g;

    /* renamed from: h, reason: collision with root package name */
    public final String[] f4111h;

    /* renamed from: i, reason: collision with root package name */
    public final byte[][] f4112i;

    /* renamed from: j, reason: collision with root package name */
    public final int[] f4113j;

    /* renamed from: k, reason: collision with root package name */
    public int f4114k;

    public v(int i3) {
        this.f4107d = i3;
        int i4 = i3 + 1;
        this.f4113j = new int[i4];
        this.f4109f = new long[i4];
        this.f4110g = new double[i4];
        this.f4111h = new String[i4];
        this.f4112i = new byte[i4][];
    }

    public static final v a(String str, int i3) {
        TreeMap treeMap = f4106l;
        synchronized (treeMap) {
            Map.Entry ceilingEntry = treeMap.ceilingEntry(Integer.valueOf(i3));
            if (ceilingEntry == null) {
                v vVar = new v(i3);
                vVar.f4108e = str;
                vVar.f4114k = i3;
                return vVar;
            }
            treeMap.remove(ceilingEntry.getKey());
            v vVar2 = (v) ceilingEntry.getValue();
            vVar2.f4108e = str;
            vVar2.f4114k = i3;
            return vVar2;
        }
    }

    @Override // v1.c
    public final void A(int i3, byte[] bArr) {
        this.f4113j[i3] = 5;
        this.f4112i[i3] = bArr;
    }

    @Override // v1.c
    public final void B(int i3) {
        this.f4113j[i3] = 1;
    }

    @Override // v1.c
    public final void C(String str, int i3) {
        Z1.i.f(str, "value");
        this.f4113j[i3] = 4;
        this.f4111h[i3] = str;
    }

    @Override // v1.c
    public final void J(long j3, int i3) {
        this.f4113j[i3] = 2;
        this.f4109f[i3] = j3;
    }

    public final void b() {
        TreeMap treeMap = f4106l;
        synchronized (treeMap) {
            treeMap.put(Integer.valueOf(this.f4107d), this);
            if (treeMap.size() > 15) {
                int size = treeMap.size() - 10;
                Iterator it = treeMap.descendingKeySet().iterator();
                Z1.i.e(it, "queryPool.descendingKeySet().iterator()");
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

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
    }

    @Override // v1.d
    public final void e(v1.c cVar) {
        int i3 = this.f4114k;
        if (1 > i3) {
            return;
        }
        int i4 = 1;
        while (true) {
            int i5 = this.f4113j[i4];
            if (i5 == 1) {
                cVar.B(i4);
            } else if (i5 == 2) {
                cVar.J(this.f4109f[i4], i4);
            } else if (i5 == 3) {
                cVar.t(this.f4110g[i4], i4);
            } else if (i5 == 4) {
                String str = this.f4111h[i4];
                if (str == null) {
                    throw new IllegalArgumentException("Required value was null.");
                }
                cVar.C(str, i4);
            } else if (i5 == 5) {
                byte[] bArr = this.f4112i[i4];
                if (bArr == null) {
                    throw new IllegalArgumentException("Required value was null.");
                }
                cVar.A(i4, bArr);
            }
            if (i4 == i3) {
                return;
            } else {
                i4++;
            }
        }
    }

    @Override // v1.d
    public final String h() {
        String str = this.f4108e;
        if (str != null) {
            return str;
        }
        throw new IllegalStateException("Required value was null.");
    }

    @Override // v1.c
    public final void t(double d3, int i3) {
        this.f4113j[i3] = 3;
        this.f4110g[i3] = d3;
    }
}
