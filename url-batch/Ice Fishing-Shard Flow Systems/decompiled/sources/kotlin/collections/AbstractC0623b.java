package kotlin.collections;

import f6.InterfaceC0406a;
import java.io.File;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* renamed from: kotlin.collections.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0623b implements Iterator, InterfaceC0406a {

    /* renamed from: d, reason: collision with root package name */
    public int f6125d;

    /* renamed from: e, reason: collision with root package name */
    public File f6126e;

    public abstract void a();

    @Override // java.util.Iterator
    public final boolean hasNext() {
        int i2 = this.f6125d;
        if (i2 == 0) {
            this.f6125d = 3;
            a();
            return this.f6125d == 1;
        }
        if (i2 == 1) {
            return true;
        }
        if (i2 == 2) {
            return false;
        }
        throw new IllegalArgumentException("hasNext called when the iterator is in the FAILED state.");
    }

    @Override // java.util.Iterator
    public final Object next() {
        int i2 = this.f6125d;
        if (i2 == 1) {
            this.f6125d = 0;
            return this.f6126e;
        }
        if (i2 != 2) {
            this.f6125d = 3;
            a();
            if (this.f6125d == 1) {
                this.f6125d = 0;
                return this.f6126e;
            }
        }
        throw new NoSuchElementException();
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
