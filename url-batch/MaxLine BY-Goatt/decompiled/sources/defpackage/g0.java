package defpackage;

import java.io.File;
import java.util.Iterator;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public abstract class g0 implements Iterator, k71 {
    public int m;
    public File n;

    public abstract void a();

    @Override // java.util.Iterator
    public final boolean hasNext() {
        int i = this.m;
        if (i == 0) {
            this.m = 3;
            a();
            return this.m == 1;
        }
        if (i == 1) {
            return true;
        }
        if (i == 2) {
            return false;
        }
        lh.e("hasNext called when the iterator is in the FAILED state.");
        return false;
    }

    @Override // java.util.Iterator
    public final Object next() {
        int i = this.m;
        if (i == 1) {
            this.m = 0;
            return this.n;
        }
        if (i != 2) {
            this.m = 3;
            a();
            if (this.m == 1) {
                this.m = 0;
                return this.n;
            }
        }
        b71.f();
        return null;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
