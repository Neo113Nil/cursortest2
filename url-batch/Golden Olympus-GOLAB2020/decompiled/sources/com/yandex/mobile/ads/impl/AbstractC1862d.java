package com.yandex.mobile.ads.impl;

import android.util.Pair;
import com.yandex.mobile.ads.impl.x42;

/* renamed from: com.yandex.mobile.ads.impl.d, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC1862d extends x42 {

    /* renamed from: c, reason: collision with root package name */
    private final int f24373c;

    /* renamed from: d, reason: collision with root package name */
    private final xx1 f24374d;

    /* renamed from: e, reason: collision with root package name */
    private final boolean f24375e = false;

    public AbstractC1862d(xx1 xx1Var) {
        this.f24374d = xx1Var;
        this.f24373c = xx1Var.b();
    }

    public static Object a(Object obj, Object obj2) {
        return Pair.create(obj, obj2);
    }

    public static Object c(Object obj) {
        return ((Pair) obj).second;
    }

    public static Object d(Object obj) {
        return ((Pair) obj).first;
    }

    protected abstract int b(int i4);

    protected abstract int b(Object obj);

    @Override // com.yandex.mobile.ads.impl.x42
    public final int b(boolean z4) {
        int i4 = this.f24373c;
        if (i4 == 0) {
            return -1;
        }
        if (this.f24375e) {
            z4 = false;
        }
        int c4 = z4 ? this.f24374d.c() : i4 - 1;
        while (g(c4).c()) {
            c4 = z4 ? this.f24374d.d(c4) : c4 > 0 ? c4 - 1 : -1;
            if (c4 == -1) {
                return -1;
            }
        }
        return g(c4).b(z4) + f(c4);
    }

    protected abstract int c(int i4);

    protected abstract Object d(int i4);

    protected abstract int e(int i4);

    protected abstract int f(int i4);

    protected abstract x42 g(int i4);

    @Override // com.yandex.mobile.ads.impl.x42
    public final int a(boolean z4) {
        if (this.f24373c == 0) {
            return -1;
        }
        if (this.f24375e) {
            z4 = false;
        }
        int a4 = z4 ? this.f24374d.a() : 0;
        while (g(a4).c()) {
            a4 = z4 ? this.f24374d.a(a4) : a4 < this.f24373c + (-1) ? a4 + 1 : -1;
            if (a4 == -1) {
                return -1;
            }
        }
        return g(a4).a(z4) + f(a4);
    }

    /* JADX WARN: Code restructure failed: missing block: B:42:0x002f, code lost:
    
        if (r0 > 0) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x0033, code lost:
    
        r0 = -1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x0033, code lost:
    
        r0 = r0 - 1;
     */
    @Override // com.yandex.mobile.ads.impl.x42
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int b(int i4, int i5, boolean z4) {
        int i6;
        if (this.f24375e) {
            if (i5 == 1) {
                i5 = 2;
            }
            z4 = false;
        }
        int c4 = c(i4);
        int f4 = f(c4);
        int b4 = g(c4).b(i4 - f4, i5 != 2 ? i5 : 0, z4);
        if (b4 != -1) {
            return f4 + b4;
        }
        if (z4) {
            i6 = this.f24374d.d(c4);
        }
        while (i6 != -1 && g(i6).c()) {
            if (z4) {
                i6 = this.f24374d.d(i6);
            } else {
                i6 = i6 > 0 ? i6 - 1 : -1;
            }
        }
        if (i6 != -1) {
            return g(i6).b(z4) + f(i6);
        }
        if (i5 == 2) {
            return b(z4);
        }
        return -1;
    }

    @Override // com.yandex.mobile.ads.impl.x42
    public final int a(Object obj) {
        int a4;
        if (!(obj instanceof Pair)) {
            return -1;
        }
        Pair pair = (Pair) obj;
        Object obj2 = pair.first;
        Object obj3 = pair.second;
        int b4 = b(obj2);
        if (b4 == -1 || (a4 = g(b4).a(obj3)) == -1) {
            return -1;
        }
        return e(b4) + a4;
    }

    /* JADX WARN: Code restructure failed: missing block: B:44:0x0032, code lost:
    
        if (r0 < (r6.f24373c - 1)) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x0036, code lost:
    
        r0 = -1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x0036, code lost:
    
        r0 = r0 + 1;
     */
    @Override // com.yandex.mobile.ads.impl.x42
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int a(int i4, int i5, boolean z4) {
        int i6;
        if (this.f24375e) {
            if (i5 == 1) {
                i5 = 2;
            }
            z4 = false;
        }
        int c4 = c(i4);
        int f4 = f(c4);
        int a4 = g(c4).a(i4 - f4, i5 != 2 ? i5 : 0, z4);
        if (a4 != -1) {
            return f4 + a4;
        }
        if (z4) {
            i6 = this.f24374d.a(c4);
        }
        while (i6 != -1 && g(i6).c()) {
            if (z4) {
                i6 = this.f24374d.a(i6);
            } else {
                i6 = i6 < this.f24373c - 1 ? i6 + 1 : -1;
            }
        }
        if (i6 != -1) {
            return g(i6).a(z4) + f(i6);
        }
        if (i5 == 2) {
            return a(z4);
        }
        return -1;
    }

    @Override // com.yandex.mobile.ads.impl.x42
    public final x42.b a(int i4, x42.b bVar, boolean z4) {
        int b4 = b(i4);
        int f4 = f(b4);
        g(b4).a(i4 - e(b4), bVar, z4);
        bVar.f34405d += f4;
        if (z4) {
            Object d4 = d(b4);
            Object obj = bVar.f34404c;
            obj.getClass();
            bVar.f34404c = Pair.create(d4, obj);
        }
        return bVar;
    }

    @Override // com.yandex.mobile.ads.impl.x42
    public final x42.b a(Object obj, x42.b bVar) {
        Pair pair = (Pair) obj;
        Object obj2 = pair.first;
        Object obj3 = pair.second;
        int b4 = b(obj2);
        int f4 = f(b4);
        g(b4).a(obj3, bVar);
        bVar.f34405d += f4;
        bVar.f34404c = obj;
        return bVar;
    }

    @Override // com.yandex.mobile.ads.impl.x42
    public final Object a(int i4) {
        int b4 = b(i4);
        return Pair.create(d(b4), g(b4).a(i4 - e(b4)));
    }

    @Override // com.yandex.mobile.ads.impl.x42
    public final x42.d a(int i4, x42.d dVar, long j4) {
        int c4 = c(i4);
        int f4 = f(c4);
        int e4 = e(c4);
        g(c4).a(i4 - f4, dVar, j4);
        Object d4 = d(c4);
        if (!x42.d.f34414s.equals(dVar.f34418b)) {
            d4 = Pair.create(d4, dVar.f34418b);
        }
        dVar.f34418b = d4;
        dVar.f34432p += e4;
        dVar.f34433q += e4;
        return dVar;
    }
}
