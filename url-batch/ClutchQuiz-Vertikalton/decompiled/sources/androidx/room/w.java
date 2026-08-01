package androidx.room;

import i0.InterfaceC0144c;
import i0.InterfaceC0145d;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;

/* loaded from: classes.dex */
public final class w implements InterfaceC0145d, InterfaceC0144c {

    /* renamed from: g, reason: collision with root package name */
    public static final TreeMap f1688g = new TreeMap();

    /* renamed from: a, reason: collision with root package name */
    public volatile String f1689a;

    /* renamed from: f, reason: collision with root package name */
    public final int[] f1693f = new int[1];

    /* renamed from: b, reason: collision with root package name */
    public final long[] f1690b = new long[1];

    /* renamed from: c, reason: collision with root package name */
    public final double[] f1691c = new double[1];
    public final String[] d = new String[1];

    /* renamed from: e, reason: collision with root package name */
    public final byte[][] f1692e = new byte[1][];

    public static final w a(String str) {
        TreeMap treeMap = f1688g;
        synchronized (treeMap) {
            Map.Entry ceilingEntry = treeMap.ceilingEntry(0);
            if (ceilingEntry == null) {
                w wVar = new w();
                wVar.f1689a = str;
                return wVar;
            }
            treeMap.remove(ceilingEntry.getKey());
            w wVar2 = (w) ceilingEntry.getValue();
            wVar2.f1689a = str;
            return wVar2;
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
    }

    @Override // i0.InterfaceC0144c
    public final void e(int i, byte[] bArr) {
        this.f1693f[i] = 5;
        this.f1692e[i] = bArr;
    }

    @Override // i0.InterfaceC0144c
    public final void f(int i) {
        this.f1693f[i] = 1;
    }

    @Override // i0.InterfaceC0144c
    public final void g(String str, int i) {
        this.f1693f[i] = 4;
        this.d[i] = str;
    }

    @Override // i0.InterfaceC0144c
    public final void h(int i, double d) {
        this.f1693f[i] = 3;
        this.f1691c[i] = d;
    }

    @Override // i0.InterfaceC0145d
    public final void j(InterfaceC0144c interfaceC0144c) {
    }

    @Override // i0.InterfaceC0145d
    public final String k() {
        String str = this.f1689a;
        if (str != null) {
            return str;
        }
        throw new IllegalStateException("Required value was null.");
    }

    public final void p() {
        TreeMap treeMap = f1688g;
        synchronized (treeMap) {
            treeMap.put(0, this);
            if (treeMap.size() > 15) {
                int size = treeMap.size() - 10;
                Iterator it = treeMap.descendingKeySet().iterator();
                g1.f.d(it, "queryPool.descendingKeySet().iterator()");
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

    @Override // i0.InterfaceC0144c
    public final void r(int i, long j2) {
        this.f1693f[i] = 2;
        this.f1690b[i] = j2;
    }
}
