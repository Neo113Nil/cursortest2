package com.google.android.gms.internal.ads;

import java.util.Arrays;
import java.util.Iterator;
import java.util.Objects;

/* loaded from: classes.dex */
public final class o73<E> extends x63<E> {

    /* renamed from: d, reason: collision with root package name */
    Object[] f9559d;

    /* renamed from: e, reason: collision with root package name */
    private int f9560e;

    o73(int i7) {
        super(i7);
        this.f9559d = new Object[p73.p(i7)];
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.internal.ads.y63
    public final /* bridge */ /* synthetic */ y63 a(Object obj) {
        f(obj);
        return this;
    }

    public final o73<E> f(E e7) {
        Objects.requireNonNull(e7);
        if (this.f9559d != null) {
            int p7 = p73.p(this.f14060b);
            int length = this.f9559d.length;
            if (p7 <= length) {
                int i7 = length - 1;
                int hashCode = e7.hashCode();
                int a7 = w63.a(hashCode);
                while (true) {
                    int i8 = a7 & i7;
                    Object[] objArr = this.f9559d;
                    Object obj = objArr[i8];
                    if (obj != null) {
                        if (obj.equals(e7)) {
                            break;
                        }
                        a7 = i8 + 1;
                    } else {
                        objArr[i8] = e7;
                        this.f9560e += hashCode;
                        super.c(e7);
                        break;
                    }
                }
                return this;
            }
        }
        this.f9559d = null;
        super.c(e7);
        return this;
    }

    public final o73<E> g(Iterable<? extends E> iterable) {
        if (this.f9559d != null) {
            Iterator<? extends E> it = iterable.iterator();
            while (it.hasNext()) {
                f(it.next());
            }
        } else {
            super.d(iterable);
        }
        return this;
    }

    public final p73<E> h() {
        p73<E> x6;
        boolean y6;
        int i7 = this.f14060b;
        if (i7 == 0) {
            return z83.f15028n;
        }
        if (i7 == 1) {
            Object obj = this.f14059a[0];
            obj.getClass();
            return new e93(obj);
        }
        if (this.f9559d == null || p73.p(i7) != this.f9559d.length) {
            x6 = p73.x(this.f14060b, this.f14059a);
            this.f14060b = x6.size();
        } else {
            y6 = p73.y(this.f14060b, this.f14059a.length);
            Object[] copyOf = y6 ? Arrays.copyOf(this.f14059a, this.f14060b) : this.f14059a;
            x6 = new z83<>(copyOf, this.f9560e, this.f9559d, r5.length - 1, this.f14060b);
        }
        this.f14061c = true;
        this.f9559d = null;
        return x6;
    }
}
