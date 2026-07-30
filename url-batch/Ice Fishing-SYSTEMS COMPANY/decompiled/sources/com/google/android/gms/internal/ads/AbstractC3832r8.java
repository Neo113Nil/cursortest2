package com.google.android.gms.internal.ads;

import android.util.Pair;

/* renamed from: com.google.android.gms.internal.ads.r8, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC3832r8 {

    /* renamed from: a, reason: collision with root package name */
    public static final C4155x7 f33969a = new C4155x7();

    static {
        String str = AbstractC3548lu.f32613a;
        Integer.toString(0, 36);
        Integer.toString(1, 36);
        Integer.toString(2, 36);
    }

    public abstract int a();

    public abstract Y7 b(int i, Y7 y72, long j9);

    public abstract int c();

    public abstract L7 d(int i, L7 l72, boolean z8);

    public abstract int e(Object obj);

    public final boolean equals(Object obj) {
        int j9;
        if (this != obj) {
            if (obj instanceof AbstractC3832r8) {
                AbstractC3832r8 abstractC3832r8 = (AbstractC3832r8) obj;
                if (abstractC3832r8.a() == a() && abstractC3832r8.c() == c()) {
                    Y7 y72 = new Y7();
                    L7 l72 = new L7();
                    Y7 y73 = new Y7();
                    L7 l73 = new L7();
                    int i = 0;
                    while (true) {
                        if (i >= a()) {
                            int i4 = 0;
                            while (true) {
                                if (i4 >= c()) {
                                    int k6 = k(true);
                                    if (k6 == abstractC3832r8.k(true) && (j9 = j(true)) == abstractC3832r8.j(true)) {
                                        while (k6 != j9) {
                                            int h9 = h(k6, 0, true);
                                            if (h9 == abstractC3832r8.h(k6, 0, true)) {
                                                k6 = h9;
                                            }
                                        }
                                    }
                                } else {
                                    if (!d(i4, l72, true).equals(abstractC3832r8.d(i4, l73, true))) {
                                        break;
                                    }
                                    i4++;
                                }
                            }
                        } else {
                            if (!b(i, y72, 0L).equals(abstractC3832r8.b(i, y73, 0L))) {
                                break;
                            }
                            i++;
                        }
                    }
                }
            }
            return false;
        }
        return true;
    }

    public abstract Object f(int i);

    public final boolean g() {
        return a() == 0;
    }

    public int h(int i, int i4, boolean z8) {
        if (i4 == 0) {
            if (i == j(z8)) {
                return -1;
            }
            return i + 1;
        }
        if (i4 == 1) {
            return i;
        }
        if (i4 == 2) {
            return i == j(z8) ? k(z8) : i + 1;
        }
        throw new IllegalStateException();
    }

    public final int hashCode() {
        int i;
        Y7 y72 = new Y7();
        L7 l72 = new L7();
        int a9 = a() + 217;
        int i4 = 0;
        while (true) {
            i = a9 * 31;
            if (i4 >= a()) {
                break;
            }
            a9 = i + b(i4, y72, 0L).hashCode();
            i4++;
        }
        int c4 = c() + i;
        for (int i9 = 0; i9 < c(); i9++) {
            c4 = (c4 * 31) + d(i9, l72, true).hashCode();
        }
        int k6 = k(true);
        while (k6 != -1) {
            c4 = (c4 * 31) + k6;
            k6 = h(k6, 0, true);
        }
        return c4;
    }

    public int i(int i) {
        if (i == k(false)) {
            return -1;
        }
        return i - 1;
    }

    public int j(boolean z8) {
        if (g()) {
            return -1;
        }
        return a() - 1;
    }

    public int k(boolean z8) {
        return g() ? -1 : 0;
    }

    public final int l(int i, L7 l72, Y7 y72, int i4, boolean z8) {
        int i9 = d(i, l72, false).f26108c;
        if (b(i9, y72, 0L).f28804l != i) {
            return i + 1;
        }
        int h9 = h(i9, i4, z8);
        if (h9 == -1) {
            return -1;
        }
        return b(h9, y72, 0L).f28803k;
    }

    public final Pair m(Y7 y72, L7 l72, int i, long j9) {
        Pair n9 = n(y72, l72, i, j9, 0L);
        n9.getClass();
        return n9;
    }

    public final Pair n(Y7 y72, L7 l72, int i, long j9, long j10) {
        PA.a0(i, a());
        b(i, y72, j10);
        if (j9 == com.anythink.basead.exoplayer.b.f6539b) {
            y72.getClass();
            j9 = 0;
        }
        int i4 = y72.f28803k;
        d(i4, l72, false);
        while (i4 < y72.f28804l) {
            l72.getClass();
            if (j9 == 0) {
                break;
            }
            int i9 = i4 + 1;
            d(i9, l72, false).getClass();
            if (j9 < 0) {
                break;
            }
            i4 = i9;
        }
        d(i4, l72, true);
        l72.getClass();
        long j11 = l72.f26109d;
        if (j11 != com.anythink.basead.exoplayer.b.f6539b) {
            j9 = Math.min(j9, j11 - 1);
        }
        long max = Math.max(0L, j9);
        Object obj = l72.f26107b;
        obj.getClass();
        return Pair.create(obj, Long.valueOf(max));
    }

    public L7 o(Object obj, L7 l72) {
        return d(e(obj), l72, true);
    }
}
