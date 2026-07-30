package com.anythink.basead.exoplayer.h;

import android.util.Pair;
import com.anythink.basead.exoplayer.ae;

/* loaded from: classes.dex */
abstract class a extends com.anythink.basead.exoplayer.ae {

    /* renamed from: b, reason: collision with root package name */
    private final int f7558b;

    /* renamed from: c, reason: collision with root package name */
    private final aa f7559c;

    /* renamed from: d, reason: collision with root package name */
    private final boolean f7560d;

    public a(boolean z8, aa aaVar) {
        this.f7560d = z8;
        this.f7559c = aaVar;
        this.f7558b = aaVar.a();
    }

    public abstract int a(int i);

    @Override // com.anythink.basead.exoplayer.ae
    public final int a(int i, int i4, boolean z8) {
        if (this.f7560d) {
            if (i4 == 1) {
                i4 = 2;
            }
            z8 = false;
        }
        int b9 = b(i);
        int e6 = e(b9);
        int a9 = c(b9).a(i - e6, i4 != 2 ? i4 : 0, z8);
        if (a9 != -1) {
            return e6 + a9;
        }
        int a10 = a(b9, z8);
        while (a10 != -1 && c(a10).a()) {
            a10 = a(a10, z8);
        }
        if (a10 != -1) {
            return c(a10).b(z8) + e(a10);
        }
        if (i4 == 2) {
            return b(z8);
        }
        return -1;
    }

    public abstract int b(int i);

    @Override // com.anythink.basead.exoplayer.ae
    public final int b(int i, int i4, boolean z8) {
        if (this.f7560d) {
            if (i4 == 1) {
                i4 = 2;
            }
            z8 = false;
        }
        int b9 = b(i);
        int e6 = e(b9);
        int b10 = c(b9).b(i - e6, i4 != 2 ? i4 : 0, z8);
        if (b10 != -1) {
            return e6 + b10;
        }
        int b11 = b(b9, z8);
        while (b11 != -1 && c(b11).a()) {
            b11 = b(b11, z8);
        }
        if (b11 != -1) {
            return c(b11).a(z8) + e(b11);
        }
        if (i4 == 2) {
            return a(z8);
        }
        return -1;
    }

    public abstract int b(Object obj);

    public abstract com.anythink.basead.exoplayer.ae c(int i);

    public abstract int d(int i);

    public abstract int e(int i);

    public abstract Object f(int i);

    @Override // com.anythink.basead.exoplayer.ae
    public final int a(boolean z8) {
        int i = this.f7558b;
        if (i == 0) {
            return -1;
        }
        if (this.f7560d) {
            z8 = false;
        }
        int b9 = z8 ? this.f7559c.b() : i - 1;
        while (c(b9).a()) {
            b9 = b(b9, z8);
            if (b9 == -1) {
                return -1;
            }
        }
        return c(b9).a(z8) + e(b9);
    }

    @Override // com.anythink.basead.exoplayer.ae
    public final int b(boolean z8) {
        if (this.f7558b == 0) {
            return -1;
        }
        if (this.f7560d) {
            z8 = false;
        }
        int c4 = z8 ? this.f7559c.c() : 0;
        while (c(c4).a()) {
            c4 = a(c4, z8);
            if (c4 == -1) {
                return -1;
            }
        }
        return c(c4).b(z8) + e(c4);
    }

    private int b(int i, boolean z8) {
        if (z8) {
            return this.f7559c.b(i);
        }
        if (i > 0) {
            return i - 1;
        }
        return -1;
    }

    @Override // com.anythink.basead.exoplayer.ae
    public final ae.b a(int i, ae.b bVar, boolean z8, long j9) {
        int b9 = b(i);
        int e6 = e(b9);
        int d2 = d(b9);
        c(b9).a(i - e6, bVar, z8, j9);
        bVar.f6510f += d2;
        bVar.f6511g += d2;
        return bVar;
    }

    @Override // com.anythink.basead.exoplayer.ae
    public final ae.a a(int i, ae.a aVar, boolean z8) {
        int a9 = a(i);
        int e6 = e(a9);
        c(a9).a(i - d(a9), aVar, z8);
        aVar.f6501c += e6;
        if (z8) {
            aVar.f6500b = Pair.create(f(a9), aVar.f6500b);
        }
        return aVar;
    }

    @Override // com.anythink.basead.exoplayer.ae
    public final int a(Object obj) {
        int a9;
        if (!(obj instanceof Pair)) {
            return -1;
        }
        Pair pair = (Pair) obj;
        Object obj2 = pair.first;
        Object obj3 = pair.second;
        int b9 = b(obj2);
        if (b9 == -1 || (a9 = c(b9).a(obj3)) == -1) {
            return -1;
        }
        return d(b9) + a9;
    }

    private int a(int i, boolean z8) {
        if (z8) {
            return this.f7559c.a(i);
        }
        if (i < this.f7558b - 1) {
            return i + 1;
        }
        return -1;
    }
}
