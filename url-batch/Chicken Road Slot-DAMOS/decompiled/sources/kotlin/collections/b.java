package kotlin.collections;

import java.io.File;
import java.util.Iterator;
import te.a1;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public abstract class b implements Iterator, xd.a {

    /* renamed from: d, reason: collision with root package name */
    public int f5557d;

    /* renamed from: e, reason: collision with root package name */
    public File f5558e;

    public abstract void a();

    @Override // java.util.Iterator
    public final boolean hasNext() {
        int i3 = this.f5557d;
        if (i3 == 0) {
            this.f5557d = 3;
            a();
            return this.f5557d == 1;
        }
        if (i3 == 1) {
            return true;
        }
        if (i3 == 2) {
            return false;
        }
        a1.e("hasNext called when the iterator is in the FAILED state.");
        return false;
    }

    @Override // java.util.Iterator
    public final Object next() {
        int i3 = this.f5557d;
        if (i3 == 1) {
            this.f5557d = 0;
            return this.f5558e;
        }
        if (i3 != 2) {
            this.f5557d = 3;
            a();
            if (this.f5557d == 1) {
                this.f5557d = 0;
                return this.f5558e;
            }
        }
        i0.c();
        return null;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
