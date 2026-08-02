package kotlin.jvm.internal;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* loaded from: classes.dex */
public final class a implements Iterator, m2.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f9679a = 1;

    /* renamed from: b, reason: collision with root package name */
    public int f9680b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f9681c;

    public a(Object[] array) {
        j.e(array, "array");
        this.f9681c = array;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        switch (this.f9679a) {
            case 0:
                if (this.f9680b < ((Object[]) this.f9681c).length) {
                }
                break;
            default:
                if (this.f9680b <= 0 || !((Iterator) this.f9681c).hasNext()) {
                }
                break;
        }
        return false;
    }

    @Override // java.util.Iterator
    public final Object next() {
        switch (this.f9679a) {
            case 0:
                try {
                    Object[] objArr = (Object[]) this.f9681c;
                    int i3 = this.f9680b;
                    this.f9680b = i3 + 1;
                    return objArr[i3];
                } catch (ArrayIndexOutOfBoundsException e3) {
                    this.f9680b--;
                    throw new NoSuchElementException(e3.getMessage());
                }
            default:
                int i4 = this.f9680b;
                if (i4 == 0) {
                    throw new NoSuchElementException();
                }
                this.f9680b = i4 - 1;
                return ((Iterator) this.f9681c).next();
        }
    }

    @Override // java.util.Iterator
    public final void remove() {
        switch (this.f9679a) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public a(r2.j jVar) {
        jVar.getClass();
        this.f9680b = 10;
        this.f9681c = new r2.b(jVar.f10280a);
    }
}
