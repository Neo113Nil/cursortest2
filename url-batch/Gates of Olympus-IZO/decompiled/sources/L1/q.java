package L1;

import M1.AbstractC0143d;
import a2.InterfaceC0184a;
import h1.C0438i;
import j.C0481G;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* loaded from: classes.dex */
public class q implements Iterator, InterfaceC0184a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f2718d;

    /* renamed from: e, reason: collision with root package name */
    public int f2719e;

    /* renamed from: f, reason: collision with root package name */
    public final Object f2720f;

    public /* synthetic */ q(int i3, Object obj) {
        this.f2718d = i3;
        this.f2720f = obj;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        switch (this.f2718d) {
            case 0:
                if (this.f2719e < ((byte[]) this.f2720f).length) {
                }
                break;
            case 1:
                if (this.f2719e < ((int[]) this.f2720f).length) {
                }
                break;
            case C0438i.FLOAT_FIELD_NUMBER /* 2 */:
                if (this.f2719e < ((long[]) this.f2720f).length) {
                }
                break;
            case C0438i.INTEGER_FIELD_NUMBER /* 3 */:
                if (this.f2719e < ((short[]) this.f2720f).length) {
                }
                break;
            case C0438i.LONG_FIELD_NUMBER /* 4 */:
                if (this.f2719e < ((AbstractC0143d) this.f2720f).b()) {
                }
                break;
            case 5:
                if (this.f2719e < ((Object[]) this.f2720f).length) {
                }
                break;
            default:
                if (this.f2719e < ((C0481G) this.f2720f).e()) {
                }
                break;
        }
        return false;
    }

    @Override // java.util.Iterator
    public final Object next() {
        switch (this.f2718d) {
            case 0:
                int i3 = this.f2719e;
                byte[] bArr = (byte[]) this.f2720f;
                if (i3 >= bArr.length) {
                    throw new NoSuchElementException(String.valueOf(this.f2719e));
                }
                this.f2719e = i3 + 1;
                return new p(bArr[i3]);
            case 1:
                int i4 = this.f2719e;
                int[] iArr = (int[]) this.f2720f;
                if (i4 >= iArr.length) {
                    throw new NoSuchElementException(String.valueOf(this.f2719e));
                }
                this.f2719e = i4 + 1;
                return new s(iArr[i4]);
            case C0438i.FLOAT_FIELD_NUMBER /* 2 */:
                int i5 = this.f2719e;
                long[] jArr = (long[]) this.f2720f;
                if (i5 >= jArr.length) {
                    throw new NoSuchElementException(String.valueOf(this.f2719e));
                }
                this.f2719e = i5 + 1;
                return new u(jArr[i5]);
            case C0438i.INTEGER_FIELD_NUMBER /* 3 */:
                int i6 = this.f2719e;
                short[] sArr = (short[]) this.f2720f;
                if (i6 >= sArr.length) {
                    throw new NoSuchElementException(String.valueOf(this.f2719e));
                }
                this.f2719e = i6 + 1;
                return new x(sArr[i6]);
            case C0438i.LONG_FIELD_NUMBER /* 4 */:
                if (!hasNext()) {
                    throw new NoSuchElementException();
                }
                int i7 = this.f2719e;
                this.f2719e = i7 + 1;
                return ((AbstractC0143d) this.f2720f).get(i7);
            case 5:
                try {
                    Object[] objArr = (Object[]) this.f2720f;
                    int i8 = this.f2719e;
                    this.f2719e = i8 + 1;
                    return objArr[i8];
                } catch (ArrayIndexOutOfBoundsException e3) {
                    this.f2719e--;
                    throw new NoSuchElementException(e3.getMessage());
                }
            default:
                int i9 = this.f2719e;
                this.f2719e = i9 + 1;
                return ((C0481G) this.f2720f).f(i9);
        }
    }

    @Override // java.util.Iterator
    public final void remove() {
        switch (this.f2718d) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            case 1:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            case C0438i.FLOAT_FIELD_NUMBER /* 2 */:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            case C0438i.INTEGER_FIELD_NUMBER /* 3 */:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            case C0438i.LONG_FIELD_NUMBER /* 4 */:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            case 5:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public q(Object[] objArr) {
        this.f2718d = 5;
        Z1.i.f(objArr, "array");
        this.f2720f = objArr;
    }
}
