package z4;

import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;
import te.a1;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class z implements j5.f, j5.e {

    /* renamed from: w, reason: collision with root package name */
    public static final TreeMap f10847w = new TreeMap();

    /* renamed from: d, reason: collision with root package name */
    public final int f10848d;

    /* renamed from: e, reason: collision with root package name */
    public volatile String f10849e;

    /* renamed from: i, reason: collision with root package name */
    public final long[] f10850i;

    /* renamed from: r, reason: collision with root package name */
    public final double[] f10851r;

    /* renamed from: s, reason: collision with root package name */
    public final String[] f10852s;

    /* renamed from: t, reason: collision with root package name */
    public final byte[][] f10853t;

    /* renamed from: u, reason: collision with root package name */
    public final int[] f10854u;

    /* renamed from: v, reason: collision with root package name */
    public int f10855v;

    public z(int i3) {
        this.f10848d = i3;
        int i10 = i3 + 1;
        this.f10854u = new int[i10];
        this.f10850i = new long[i10];
        this.f10851r = new double[i10];
        this.f10852s = new String[i10];
        this.f10853t = new byte[i10][];
    }

    public static final z a(int i3, String str) {
        TreeMap treeMap = f10847w;
        synchronized (treeMap) {
            Map.Entry ceilingEntry = treeMap.ceilingEntry(Integer.valueOf(i3));
            if (ceilingEntry == null) {
                z zVar = new z(i3);
                zVar.f10849e = str;
                zVar.f10855v = i3;
                return zVar;
            }
            treeMap.remove(ceilingEntry.getKey());
            z zVar2 = (z) ceilingEntry.getValue();
            zVar2.f10849e = str;
            zVar2.f10855v = i3;
            return zVar2;
        }
    }

    @Override // j5.e
    public final void D(int i3, byte[] bArr) {
        this.f10854u[i3] = 5;
        this.f10853t[i3] = bArr;
    }

    public final void d() {
        TreeMap treeMap = f10847w;
        synchronized (treeMap) {
            treeMap.put(Integer.valueOf(this.f10848d), this);
            if (treeMap.size() > 15) {
                int size = treeMap.size() - 10;
                Iterator it = treeMap.descendingKeySet().iterator();
                it.getClass();
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

    @Override // j5.e
    public final void f(int i3, long j) {
        this.f10854u[i3] = 2;
        this.f10850i[i3] = j;
    }

    @Override // j5.f
    public final String h() {
        String str = this.f10849e;
        if (str != null) {
            return str;
        }
        kotlin.collections.i0.l("Required value was null.");
        return null;
    }

    @Override // j5.f
    public final void i(j5.e eVar) {
        int i3 = this.f10855v;
        if (1 > i3) {
            return;
        }
        int i10 = 1;
        while (true) {
            int i11 = this.f10854u[i10];
            if (i11 == 1) {
                eVar.r(i10);
            } else if (i11 == 2) {
                eVar.f(i10, this.f10850i[i10]);
            } else if (i11 == 3) {
                eVar.n(this.f10851r[i10], i10);
            } else if (i11 == 4) {
                String str = this.f10852s[i10];
                if (str == null) {
                    a1.e("Required value was null.");
                    return;
                }
                eVar.l(i10, str);
            } else if (i11 == 5) {
                byte[] bArr = this.f10853t[i10];
                if (bArr == null) {
                    a1.e("Required value was null.");
                    return;
                }
                eVar.D(i10, bArr);
            }
            if (i10 == i3) {
                return;
            } else {
                i10++;
            }
        }
    }

    @Override // j5.e
    public final void l(int i3, String str) {
        str.getClass();
        this.f10854u[i3] = 4;
        this.f10852s[i3] = str;
    }

    @Override // j5.e
    public final void n(double d10, int i3) {
        this.f10854u[i3] = 3;
        this.f10851r[i3] = d10;
    }

    @Override // j5.e
    public final void r(int i3) {
        this.f10854u[i3] = 1;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
    }
}
