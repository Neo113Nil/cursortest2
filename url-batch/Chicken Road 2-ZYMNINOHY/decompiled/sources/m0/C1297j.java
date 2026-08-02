package m0;

import java.util.TreeSet;

/* renamed from: m0.j, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1297j {

    /* renamed from: a, reason: collision with root package name */
    public final TreeSet f14391a = new TreeSet(new B.c(6));

    /* renamed from: b, reason: collision with root package name */
    public int f14392b;

    /* renamed from: c, reason: collision with root package name */
    public int f14393c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f14394d;

    public C1297j() {
        d();
    }

    public static int b(int i4, int i5) {
        int min;
        int i6 = i4 - i5;
        return (Math.abs(i6) <= 1000 || (min = (Math.min(i4, i5) - Math.max(i4, i5)) + 65535) >= 1000) ? i6 : i4 < i5 ? min : -min;
    }

    public final synchronized void a(C1296i c1296i) {
        this.f14392b = c1296i.f14389a.f14385c;
        this.f14391a.add(c1296i);
    }

    public final synchronized C1295h c(long j4) {
        if (this.f14391a.isEmpty()) {
            return null;
        }
        C1296i c1296i = (C1296i) this.f14391a.first();
        int i4 = c1296i.f14389a.f14385c;
        if (i4 != C1295h.a(this.f14393c) && j4 < c1296i.f14390b) {
            return null;
        }
        this.f14391a.pollFirst();
        this.f14393c = i4;
        return c1296i.f14389a;
    }

    public final synchronized void d() {
        this.f14391a.clear();
        this.f14394d = false;
        this.f14393c = -1;
        this.f14392b = -1;
    }
}
