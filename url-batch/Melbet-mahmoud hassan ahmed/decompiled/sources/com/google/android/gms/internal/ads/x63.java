package com.google.android.gms.internal.ads;

import java.util.Arrays;
import java.util.Iterator;
import java.util.Objects;

/* loaded from: classes.dex */
class x63<E> extends y63<E> {

    /* renamed from: a, reason: collision with root package name */
    Object[] f14059a;

    /* renamed from: b, reason: collision with root package name */
    int f14060b = 0;

    /* renamed from: c, reason: collision with root package name */
    boolean f14061c;

    x63(int i7) {
        this.f14059a = new Object[i7];
    }

    private final void e(int i7) {
        Object[] objArr = this.f14059a;
        int length = objArr.length;
        if (length < i7) {
            this.f14059a = Arrays.copyOf(objArr, y63.b(length, i7));
        } else if (!this.f14061c) {
            return;
        } else {
            this.f14059a = (Object[]) objArr.clone();
        }
        this.f14061c = false;
    }

    public final x63<E> c(E e7) {
        Objects.requireNonNull(e7);
        e(this.f14060b + 1);
        Object[] objArr = this.f14059a;
        int i7 = this.f14060b;
        this.f14060b = i7 + 1;
        objArr[i7] = e7;
        return this;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final y63<E> d(Iterable<? extends E> iterable) {
        e(this.f14060b + iterable.size());
        if (iterable instanceof z63) {
            this.f14060b = ((z63) iterable).i(this.f14059a, this.f14060b);
            return this;
        }
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            a(it.next());
        }
        return this;
    }
}
