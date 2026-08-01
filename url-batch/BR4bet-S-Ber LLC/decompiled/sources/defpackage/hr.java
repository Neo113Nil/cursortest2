package defpackage;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* compiled from: r8-map-id-de38bb36dc2361356cb83b4c675dbcd2450924cecdb12a3272c608759c381a50 */
/* loaded from: classes.dex */
public final class hr implements Iterator, wr {
    public final int f;
    public final int g;
    public boolean h;
    public int i;

    public hr(int i, int i2, int i3) {
        this.f = i3;
        this.g = i2;
        boolean z = false;
        if (i3 <= 0 ? i >= i2 : i <= i2) {
            z = true;
        }
        this.h = z;
        this.i = z ? i : i2;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.h;
    }

    @Override // java.util.Iterator
    public final Object next() {
        int i = this.i;
        if (i != this.g) {
            this.i = this.f + i;
        } else {
            if (!this.h) {
                throw new NoSuchElementException();
            }
            this.h = false;
        }
        return Integer.valueOf(i);
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
