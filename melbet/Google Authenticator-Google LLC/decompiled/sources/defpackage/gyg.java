package defpackage;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* compiled from: PG */
/* loaded from: classes2.dex */
abstract class gyg implements Iterator {
    final CharSequence b;
    final gyv c;
    final boolean d;
    private Object g;
    public int a = 2;
    int e = 0;
    int f = Integer.MAX_VALUE;

    public gyg(gzz gzzVar, CharSequence charSequence) {
        this.c = gzzVar.a;
        this.d = gzzVar.b;
        this.b = charSequence;
    }

    public abstract int a(int i);

    public abstract int b(int i);

    @Override // java.util.Iterator
    public final boolean hasNext() {
        int b;
        int a;
        hoq.H(this.a != 4);
        int i = this.a;
        int i2 = i - 1;
        String str = null;
        if (i == 0) {
            throw null;
        }
        if (i2 == 0) {
            return true;
        }
        if (i2 != 2) {
            this.a = 4;
            int i3 = this.e;
            while (true) {
                int i4 = this.e;
                if (i4 == -1) {
                    this.a = 3;
                    break;
                }
                b = b(i4);
                if (b == -1) {
                    b = this.b.length();
                    this.e = -1;
                    a = -1;
                } else {
                    a = a(b);
                    this.e = a;
                }
                if (a == i3) {
                    int i5 = a + 1;
                    this.e = i5;
                    if (i5 > this.b.length()) {
                        this.e = -1;
                    }
                } else {
                    while (i3 < b && this.c.c(this.b.charAt(i3))) {
                        i3++;
                    }
                    while (b > i3) {
                        int i6 = b - 1;
                        if (!this.c.c(this.b.charAt(i6))) {
                            break;
                        }
                        b = i6;
                    }
                    if (!this.d || i3 != b) {
                        break;
                    }
                    i3 = this.e;
                }
            }
            int i7 = this.f;
            if (i7 == 1) {
                CharSequence charSequence = this.b;
                int length = charSequence.length();
                this.e = -1;
                while (length > i3) {
                    int i8 = length - 1;
                    if (!this.c.c(charSequence.charAt(i8))) {
                        break;
                    }
                    length = i8;
                }
                b = length;
            } else {
                this.f = i7 - 1;
            }
            str = this.b.subSequence(i3, b).toString();
            this.g = str;
            if (this.a != 3) {
                this.a = 1;
                return true;
            }
        }
        return false;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        this.a = 2;
        Object obj = this.g;
        this.g = null;
        return obj;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
