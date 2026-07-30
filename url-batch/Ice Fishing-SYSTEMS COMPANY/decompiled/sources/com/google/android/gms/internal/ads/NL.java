package com.google.android.gms.internal.ads;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* loaded from: classes2.dex */
public final class NL extends SK {

    /* renamed from: A, reason: collision with root package name */
    public static final int[] f26521A = {1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, 233, 377, 610, 987, 1597, 2584, 4181, 6765, 10946, 17711, 28657, 46368, 75025, 121393, 196418, 317811, 514229, 832040, 1346269, 2178309, 3524578, 5702887, 9227465, 14930352, 24157817, 39088169, 63245986, 102334155, 165580141, 267914296, 433494437, 701408733, 1134903170, 1836311903, Integer.MAX_VALUE};

    /* renamed from: v, reason: collision with root package name */
    public final int f26522v;

    /* renamed from: w, reason: collision with root package name */
    public final SK f26523w;

    /* renamed from: x, reason: collision with root package name */
    public final SK f26524x;

    /* renamed from: y, reason: collision with root package name */
    public final int f26525y;

    /* renamed from: z, reason: collision with root package name */
    public final int f26526z;

    public NL(SK sk, SK sk2) {
        this.f26523w = sk;
        this.f26524x = sk2;
        int f6 = sk.f();
        this.f26525y = f6;
        this.f26522v = sk2.f() + f6;
        this.f26526z = Math.max(sk.p(), sk2.p()) + 1;
    }

    public static int v(int i) {
        int[] iArr = f26521A;
        if (i >= 47) {
            return Integer.MAX_VALUE;
        }
        return iArr[i];
    }

    @Override // com.google.android.gms.internal.ads.SK
    public final byte e(int i) {
        int i4 = this.f26525y;
        return i < i4 ? this.f26523w.e(i) : this.f26524x.e(i - i4);
    }

    @Override // com.google.android.gms.internal.ads.SK
    public final int f() {
        return this.f26522v;
    }

    @Override // com.google.android.gms.internal.ads.SK
    public final SK g(int i, int i4) {
        return h(i, i4);
    }

    @Override // com.google.android.gms.internal.ads.SK
    public final SK h(int i, int i4) {
        int i9 = this.f26522v;
        int c4 = SK.c(i, i4, i9);
        if (c4 == 0) {
            return SK.f27529u;
        }
        if (c4 == i9) {
            return this;
        }
        SK sk = this.f26523w;
        int i10 = this.f26525y;
        if (i4 <= i10) {
            return sk.g(i, i4);
        }
        int i11 = i4 - i10;
        SK sk2 = this.f26524x;
        return i >= i10 ? sk2.g(i - i10, i11) : new NL(sk.g(i, sk.f()), sk2.g(0, i11));
    }

    @Override // com.google.android.gms.internal.ads.SK
    public final void i(int i, int i4, int i9, byte[] bArr) {
        int i10 = i + i9;
        SK sk = this.f26523w;
        int i11 = this.f26525y;
        if (i10 <= i11) {
            sk.i(i, i4, i9, bArr);
            return;
        }
        SK sk2 = this.f26524x;
        if (i >= i11) {
            sk2.i(i - i11, i4, i9, bArr);
            return;
        }
        int i12 = i11 - i;
        sk.i(i, i4, i12, bArr);
        sk2.i(0, i4 + i12, i9 - i12, bArr);
    }

    @Override // com.google.android.gms.internal.ads.SK, java.lang.Iterable
    public final /* synthetic */ Iterator iterator() {
        return new LL(this);
    }

    @Override // com.google.android.gms.internal.ads.SK
    public final void k(XK xk) {
        this.f26523w.k(xk);
        this.f26524x.k(xk);
    }

    @Override // com.google.android.gms.internal.ads.SK
    public final boolean l(SK sk) {
        ML ml = new ML(this);
        PK next = ml.next();
        ML ml2 = new ML(sk);
        PK next2 = ml2.next();
        int i = 0;
        int i4 = 0;
        int i9 = 0;
        while (true) {
            int f6 = next.f() - i;
            int f9 = next2.f() - i4;
            int min = Math.min(f6, f9);
            if (!(i == 0 ? next.v(next2, i4, min) : next2.v(next, i, min))) {
                return false;
            }
            i9 += min;
            int i10 = this.f26522v;
            if (i9 >= i10) {
                if (i9 == i10) {
                    return true;
                }
                throw new IllegalStateException();
            }
            if (min == f6) {
                i = 0;
                next = ml.next();
            } else {
                i += min;
                next = next;
            }
            if (min == f9) {
                next2 = ml2.next();
                i4 = 0;
            } else {
                i4 += min;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.SK
    public final int n(int i, int i4, int i9) {
        int i10 = i4 + i9;
        SK sk = this.f26523w;
        int i11 = this.f26525y;
        if (i10 <= i11) {
            return sk.n(i, i4, i9);
        }
        SK sk2 = this.f26524x;
        if (i4 >= i11) {
            return sk2.n(i, i4 - i11, i9);
        }
        int i12 = i11 - i4;
        return sk2.n(sk.n(i, i4, i12), 0, i9 - i12);
    }

    @Override // com.google.android.gms.internal.ads.SK
    public final S7.b o() {
        PK pk;
        ArrayList arrayList = new ArrayList();
        ArrayDeque arrayDeque = new ArrayDeque(this.f26526z);
        arrayDeque.push(this);
        SK sk = this.f26523w;
        while (sk instanceof NL) {
            NL nl = (NL) sk;
            arrayDeque.push(nl);
            sk = nl.f26523w;
        }
        PK pk2 = (PK) sk;
        while (true) {
            if (!(pk2 != null)) {
                C3899sL c3899sL = new C3899sL();
                c3899sL.f34234n = arrayList.iterator();
                c3899sL.f34236v = 0;
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    c3899sL.f34236v++;
                }
                c3899sL.f34237w = -1;
                if (!c3899sL.b()) {
                    c3899sL.f34235u = AbstractC3684oL.f33137b;
                    c3899sL.f34238x = 0;
                    c3899sL.f34233B = 0L;
                }
                return new UK(c3899sL);
            }
            if (pk2 == null) {
                throw new NoSuchElementException();
            }
            do {
                pk = null;
                if (arrayDeque.isEmpty()) {
                    break;
                }
                SK sk2 = ((NL) arrayDeque.pop()).f26524x;
                while (sk2 instanceof NL) {
                    NL nl2 = (NL) sk2;
                    arrayDeque.push(nl2);
                    sk2 = nl2.f26523w;
                }
                pk = (PK) sk2;
                arrayList.add(pk2.j());
                pk2 = pk;
            } while (pk.f() == 0);
            arrayList.add(pk2.j());
            pk2 = pk;
        }
    }

    @Override // com.google.android.gms.internal.ads.SK
    public final int p() {
        return this.f26526z;
    }

    @Override // com.google.android.gms.internal.ads.SK
    public final boolean q() {
        return this.f26522v >= v(this.f26526z);
    }

    @Override // com.google.android.gms.internal.ads.SK
    /* renamed from: r */
    public final CC iterator() {
        return new LL(this);
    }
}
