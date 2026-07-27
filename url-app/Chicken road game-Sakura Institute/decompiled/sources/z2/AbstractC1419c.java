package z2;

import java.io.File;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* renamed from: z2.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC1419c implements Iterator, N2.a {

    /* renamed from: d, reason: collision with root package name */
    public int f11937d;

    /* renamed from: e, reason: collision with root package name */
    public File f11938e;

    public abstract void b();

    @Override // java.util.Iterator
    public final boolean hasNext() {
        int i2 = this.f11937d;
        if (i2 == 0) {
            this.f11937d = 3;
            b();
            if (this.f11937d != 1) {
                return false;
            }
        } else if (i2 != 1) {
            if (i2 == 2) {
                return false;
            }
            throw new IllegalArgumentException("hasNext called when the iterator is in the FAILED state.");
        }
        return true;
    }

    @Override // java.util.Iterator
    public final Object next() {
        int i2 = this.f11937d;
        if (i2 == 1) {
            this.f11937d = 0;
            return this.f11938e;
        }
        if (i2 != 2) {
            this.f11937d = 3;
            b();
            if (this.f11937d == 1) {
                this.f11937d = 0;
                return this.f11938e;
            }
        }
        throw new NoSuchElementException();
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
