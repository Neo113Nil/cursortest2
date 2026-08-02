package d3;

import java.util.Iterator;
import java.util.NoSuchElementException;
import p3.InterfaceC1349a;

/* loaded from: classes.dex */
public class a implements Iterator, InterfaceC1349a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f8317a = 0;

    /* renamed from: b, reason: collision with root package name */
    public int f8318b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f8319c;

    public a(Object[] array) {
        kotlin.jvm.internal.i.e(array, "array");
        this.f8319c = array;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        switch (this.f8317a) {
            case 0:
                if (this.f8318b < ((d) this.f8319c).b()) {
                }
                break;
            default:
                if (this.f8318b < ((Object[]) this.f8319c).length) {
                }
                break;
        }
        return false;
    }

    @Override // java.util.Iterator
    public final Object next() {
        switch (this.f8317a) {
            case 0:
                if (!hasNext()) {
                    throw new NoSuchElementException();
                }
                d dVar = (d) this.f8319c;
                int i4 = this.f8318b;
                this.f8318b = i4 + 1;
                return dVar.get(i4);
            default:
                try {
                    Object[] objArr = (Object[]) this.f8319c;
                    int i5 = this.f8318b;
                    this.f8318b = i5 + 1;
                    return objArr[i5];
                } catch (ArrayIndexOutOfBoundsException e4) {
                    this.f8318b--;
                    throw new NoSuchElementException(e4.getMessage());
                }
        }
    }

    @Override // java.util.Iterator
    public final void remove() {
        switch (this.f8317a) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public a(d dVar) {
        this.f8319c = dVar;
    }
}
