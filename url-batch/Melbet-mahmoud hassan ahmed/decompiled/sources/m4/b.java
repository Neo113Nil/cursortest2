package m4;

import java.util.NoSuchElementException;

/* loaded from: classes.dex */
public abstract class b<T> extends s0<T> {

    /* renamed from: f, reason: collision with root package name */
    private EnumC0099b f19099f = EnumC0099b.NOT_READY;

    /* renamed from: g, reason: collision with root package name */
    private T f19100g;

    static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f19101a;

        static {
            int[] iArr = new int[EnumC0099b.values().length];
            f19101a = iArr;
            try {
                iArr[EnumC0099b.DONE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f19101a[EnumC0099b.READY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    /* renamed from: m4.b$b, reason: collision with other inner class name */
    private enum EnumC0099b {
        READY,
        NOT_READY,
        DONE,
        FAILED
    }

    protected b() {
    }

    private boolean c() {
        this.f19099f = EnumC0099b.FAILED;
        this.f19100g = a();
        if (this.f19099f == EnumC0099b.DONE) {
            return false;
        }
        this.f19099f = EnumC0099b.READY;
        return true;
    }

    protected abstract T a();

    protected final T b() {
        this.f19099f = EnumC0099b.DONE;
        return null;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        l4.j.n(this.f19099f != EnumC0099b.FAILED);
        int i7 = a.f19101a[this.f19099f.ordinal()];
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
        this.f19099f = EnumC0099b.NOT_READY;
        T t6 = (T) f0.a(this.f19100g);
        this.f19100g = null;
        return t6;
    }
}
