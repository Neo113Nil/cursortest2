package kotlin.collections;

import i2.InterfaceC2471a;
import java.util.Iterator;
import java.util.NoSuchElementException;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* renamed from: kotlin.collections.b, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC3212b implements Iterator, InterfaceC2471a {

    @Nullable
    private Object nextValue;

    @NotNull
    private Y state = Y.f41076c;

    /* renamed from: kotlin.collections.b$a */
    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f41082a;

        static {
            int[] iArr = new int[Y.values().length];
            try {
                iArr[Y.f41077d.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Y.f41075b.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f41082a = iArr;
        }
    }

    private final boolean a() {
        this.state = Y.f41078e;
        computeNext();
        return this.state == Y.f41075b;
    }

    protected abstract void computeNext();

    protected final void done() {
        this.state = Y.f41077d;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        Y y4 = this.state;
        if (y4 == Y.f41078e) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        int i4 = a.f41082a[y4.ordinal()];
        if (i4 == 1) {
            return false;
        }
        if (i4 != 2) {
            return a();
        }
        return true;
    }

    @Override // java.util.Iterator
    public Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        this.state = Y.f41076c;
        return this.nextValue;
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    protected final void setNext(Object obj) {
        this.nextValue = obj;
        this.state = Y.f41075b;
    }
}
