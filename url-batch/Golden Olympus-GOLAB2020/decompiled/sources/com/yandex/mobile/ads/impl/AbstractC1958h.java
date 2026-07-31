package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.impl.n12;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* renamed from: com.yandex.mobile.ads.impl.h, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
abstract class AbstractC1958h<T> implements Iterator<T> {

    /* renamed from: b, reason: collision with root package name */
    private int f26399b = 2;

    /* renamed from: c, reason: collision with root package name */
    private String f26400c;

    protected AbstractC1958h() {
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        String str;
        int a4;
        int i4 = this.f26399b;
        if (i4 == 4) {
            throw new IllegalStateException();
        }
        int a5 = C2155p8.a(i4);
        if (a5 == 0) {
            return true;
        }
        if (a5 != 2) {
            this.f26399b = 4;
            n12.a aVar = (n12.a) this;
            int i5 = aVar.f29355g;
            while (true) {
                int i6 = aVar.f29355g;
                if (i6 == -1) {
                    aVar.f26399b = 3;
                    str = null;
                    break;
                }
                l12 l12Var = (l12) aVar;
                a4 = l12Var.f28390i.f28833a.a(l12Var.f29352d, i6);
                if (a4 == -1) {
                    a4 = aVar.f29352d.length();
                    aVar.f29355g = -1;
                } else {
                    aVar.f29355g = a4 + 1;
                }
                int i7 = aVar.f29355g;
                if (i7 == i5) {
                    int i8 = i7 + 1;
                    aVar.f29355g = i8;
                    if (i8 > aVar.f29352d.length()) {
                        aVar.f29355g = -1;
                    }
                } else {
                    while (i5 < a4 && aVar.f29353e.a(aVar.f29352d.charAt(i5))) {
                        i5++;
                    }
                    while (a4 > i5 && aVar.f29353e.a(aVar.f29352d.charAt(a4 - 1))) {
                        a4--;
                    }
                    if (!aVar.f29354f || i5 != a4) {
                        break;
                    }
                    i5 = aVar.f29355g;
                }
            }
            int i9 = aVar.f29356h;
            if (i9 == 1) {
                a4 = aVar.f29352d.length();
                aVar.f29355g = -1;
                while (a4 > i5 && aVar.f29353e.a(aVar.f29352d.charAt(a4 - 1))) {
                    a4--;
                }
            } else {
                aVar.f29356h = i9 - 1;
            }
            str = aVar.f29352d.subSequence(i5, a4).toString();
            this.f26400c = str;
            if (this.f26399b != 3) {
                this.f26399b = 1;
                return true;
            }
        }
        return false;
    }

    @Override // java.util.Iterator
    public final T next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        this.f26399b = 2;
        T t4 = (T) this.f26400c;
        this.f26400c = null;
        return t4;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
