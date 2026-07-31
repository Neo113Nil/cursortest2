package l4;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* loaded from: classes.dex */
abstract class a<T> implements Iterator<T> {

    /* renamed from: f, reason: collision with root package name */
    private b f18601f = b.NOT_READY;

    /* renamed from: g, reason: collision with root package name */
    private T f18602g;

    /* renamed from: l4.a$a, reason: collision with other inner class name */
    static /* synthetic */ class C0091a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f18603a;

        static {
            int[] iArr = new int[b.values().length];
            f18603a = iArr;
            try {
                iArr[b.DONE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f18603a[b.READY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    private enum b {
        READY,
        NOT_READY,
        DONE,
        FAILED
    }

    protected a() {
    }

    private boolean c() {
        this.f18601f = b.FAILED;
        this.f18602g = a();
        if (this.f18601f == b.DONE) {
            return false;
        }
        this.f18601f = b.READY;
        return true;
    }

    protected abstract T a();

    protected final T b() {
        this.f18601f = b.DONE;
        return null;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        j.n(this.f18601f != b.FAILED);
        int i7 = C0091a.f18603a[this.f18601f.ordinal()];
        if (i7 == 1) {
            return false;
        }
        if (i7 != 2) {
            return c();
        }
        return true;
    }

    @Override // java.util.Iterator
    public final T next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        this.f18601f = b.NOT_READY;
        T t6 = (T) h.a(this.f18602g);
        this.f18602g = null;
        return t6;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
