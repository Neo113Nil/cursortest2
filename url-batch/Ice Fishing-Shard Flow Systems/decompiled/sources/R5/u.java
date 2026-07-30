package R5;

import f6.InterfaceC0406a;
import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.collections.AbstractC0627f;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public class u implements Iterator, InterfaceC0406a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f2434d = 4;

    /* renamed from: e, reason: collision with root package name */
    public int f2435e;

    /* renamed from: i, reason: collision with root package name */
    public final Object f2436i;

    public u(Object[] array) {
        Intrinsics.checkNotNullParameter(array, "array");
        this.f2436i = array;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        switch (this.f2434d) {
            case 0:
                if (this.f2435e < ((byte[]) this.f2436i).length) {
                }
                break;
            case 1:
                if (this.f2435e < ((int[]) this.f2436i).length) {
                }
                break;
            case 2:
                if (this.f2435e < ((long[]) this.f2436i).length) {
                }
                break;
            case 3:
                if (this.f2435e < ((short[]) this.f2436i).length) {
                }
                break;
            case 4:
                if (this.f2435e < ((AbstractC0627f) this.f2436i).a()) {
                }
                break;
            case 5:
                if (this.f2435e < ((Object[]) this.f2436i).length) {
                }
                break;
            default:
                if (this.f2435e > 0) {
                }
                break;
        }
        return false;
    }

    @Override // java.util.Iterator
    public final Object next() {
        switch (this.f2434d) {
            case 0:
                int i2 = this.f2435e;
                byte[] bArr = (byte[]) this.f2436i;
                if (i2 >= bArr.length) {
                    throw new NoSuchElementException(String.valueOf(this.f2435e));
                }
                this.f2435e = i2 + 1;
                return new t(bArr[i2]);
            case 1:
                int i5 = this.f2435e;
                int[] iArr = (int[]) this.f2436i;
                if (i5 >= iArr.length) {
                    throw new NoSuchElementException(String.valueOf(this.f2435e));
                }
                this.f2435e = i5 + 1;
                return new x(iArr[i5]);
            case 2:
                int i7 = this.f2435e;
                long[] jArr = (long[]) this.f2436i;
                if (i7 >= jArr.length) {
                    throw new NoSuchElementException(String.valueOf(this.f2435e));
                }
                this.f2435e = i7 + 1;
                return new A(jArr[i7]);
            case 3:
                int i8 = this.f2435e;
                short[] sArr = (short[]) this.f2436i;
                if (i8 >= sArr.length) {
                    throw new NoSuchElementException(String.valueOf(this.f2435e));
                }
                this.f2435e = i8 + 1;
                return new E(sArr[i8]);
            case 4:
                if (!hasNext()) {
                    throw new NoSuchElementException();
                }
                AbstractC0627f abstractC0627f = (AbstractC0627f) this.f2436i;
                int i9 = this.f2435e;
                this.f2435e = i9 + 1;
                return abstractC0627f.get(i9);
            case 5:
                try {
                    Object[] objArr = (Object[]) this.f2436i;
                    int i10 = this.f2435e;
                    this.f2435e = i10 + 1;
                    return objArr[i10];
                } catch (ArrayIndexOutOfBoundsException e7) {
                    this.f2435e--;
                    throw new NoSuchElementException(e7.getMessage());
                }
            default:
                x6.e eVar = (x6.e) this.f2436i;
                int d7 = eVar.d();
                int i11 = this.f2435e;
                this.f2435e = i11 - 1;
                return eVar.i(d7 - i11);
        }
    }

    @Override // java.util.Iterator
    public final void remove() {
        switch (this.f2434d) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            case 1:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            case 2:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            case 3:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            case 4:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            case 5:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public u(byte[] array) {
        Intrinsics.checkNotNullParameter(array, "array");
        this.f2436i = array;
    }

    public u(int[] array) {
        Intrinsics.checkNotNullParameter(array, "array");
        this.f2436i = array;
    }

    public u(long[] array) {
        Intrinsics.checkNotNullParameter(array, "array");
        this.f2436i = array;
    }

    public u(short[] array) {
        Intrinsics.checkNotNullParameter(array, "array");
        this.f2436i = array;
    }

    public u(AbstractC0627f abstractC0627f) {
        this.f2436i = abstractC0627f;
    }

    public u(x6.e eVar) {
        this.f2436i = eVar;
        this.f2435e = eVar.d();
    }
}
