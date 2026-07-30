package defpackage;

import java.io.File;
import java.util.Iterator;

/* compiled from: r8-map-id-dd5e919efaf02f4d8ff55d6a5e2559a4e7180bda542179c0d9d8fc6a077876b4 */
/* loaded from: classes.dex */
public abstract class r implements Iterator, yb0 {
    public int d;
    public File e;

    public abstract void a();

    @Override // java.util.Iterator
    public final boolean hasNext() {
        int i = this.d;
        if (i == 0) {
            this.d = 3;
            a();
            return this.d == 1;
        }
        if (i == 1) {
            return true;
        }
        if (i == 2) {
            return false;
        }
        dd0.e("hasNext called when the iterator is in the FAILED state.");
        return false;
    }

    @Override // java.util.Iterator
    public final Object next() {
        int i = this.d;
        if (i == 1) {
            this.d = 0;
            return this.e;
        }
        if (i != 2) {
            this.d = 3;
            a();
            if (this.d == 1) {
                this.d = 0;
                return this.e;
            }
        }
        dd0.c();
        return null;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
