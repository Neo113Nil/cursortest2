package R1;

import S1.AbstractC0225d;
import g2.InterfaceC0439a;
import j.C0525G;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* loaded from: classes.dex */
public class p implements Iterator, InterfaceC0439a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f4160d;

    /* renamed from: e, reason: collision with root package name */
    public int f4161e;

    /* renamed from: f, reason: collision with root package name */
    public final Object f4162f;

    public /* synthetic */ p(int i3, Object obj) {
        this.f4160d = i3;
        this.f4162f = obj;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        switch (this.f4160d) {
            case 0:
                if (this.f4161e < ((byte[]) this.f4162f).length) {
                }
                break;
            case 1:
                if (this.f4161e < ((int[]) this.f4162f).length) {
                }
                break;
            case k1.i.FLOAT_FIELD_NUMBER /* 2 */:
                if (this.f4161e < ((long[]) this.f4162f).length) {
                }
                break;
            case k1.i.INTEGER_FIELD_NUMBER /* 3 */:
                if (this.f4161e < ((short[]) this.f4162f).length) {
                }
                break;
            case k1.i.LONG_FIELD_NUMBER /* 4 */:
                if (this.f4161e < ((AbstractC0225d) this.f4162f).b()) {
                }
                break;
            case 5:
                if (this.f4161e < ((Object[]) this.f4162f).length) {
                }
                break;
            default:
                if (this.f4161e < ((C0525G) this.f4162f).e()) {
                }
                break;
        }
        return false;
    }

    @Override // java.util.Iterator
    public final Object next() {
        switch (this.f4160d) {
            case 0:
                int i3 = this.f4161e;
                byte[] bArr = (byte[]) this.f4162f;
                if (i3 >= bArr.length) {
                    throw new NoSuchElementException(String.valueOf(this.f4161e));
                }
                this.f4161e = i3 + 1;
                return new o(bArr[i3]);
            case 1:
                int i4 = this.f4161e;
                int[] iArr = (int[]) this.f4162f;
                if (i4 >= iArr.length) {
                    throw new NoSuchElementException(String.valueOf(this.f4161e));
                }
                this.f4161e = i4 + 1;
                return new r(iArr[i4]);
            case k1.i.FLOAT_FIELD_NUMBER /* 2 */:
                int i5 = this.f4161e;
                long[] jArr = (long[]) this.f4162f;
                if (i5 >= jArr.length) {
                    throw new NoSuchElementException(String.valueOf(this.f4161e));
                }
                this.f4161e = i5 + 1;
                return new t(jArr[i5]);
            case k1.i.INTEGER_FIELD_NUMBER /* 3 */:
                int i6 = this.f4161e;
                short[] sArr = (short[]) this.f4162f;
                if (i6 >= sArr.length) {
                    throw new NoSuchElementException(String.valueOf(this.f4161e));
                }
                this.f4161e = i6 + 1;
                return new w(sArr[i6]);
            case k1.i.LONG_FIELD_NUMBER /* 4 */:
                if (!hasNext()) {
                    throw new NoSuchElementException();
                }
                int i7 = this.f4161e;
                this.f4161e = i7 + 1;
                return ((AbstractC0225d) this.f4162f).get(i7);
            case 5:
                try {
                    Object[] objArr = (Object[]) this.f4162f;
                    int i8 = this.f4161e;
                    this.f4161e = i8 + 1;
                    return objArr[i8];
                } catch (ArrayIndexOutOfBoundsException e3) {
                    this.f4161e--;
                    throw new NoSuchElementException(e3.getMessage());
                }
            default:
                int i9 = this.f4161e;
                this.f4161e = i9 + 1;
                return ((C0525G) this.f4162f).f(i9);
        }
    }

    @Override // java.util.Iterator
    public final void remove() {
        switch (this.f4160d) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            case 1:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            case k1.i.FLOAT_FIELD_NUMBER /* 2 */:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            case k1.i.INTEGER_FIELD_NUMBER /* 3 */:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            case k1.i.LONG_FIELD_NUMBER /* 4 */:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            case 5:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public p(Object[] objArr) {
        this.f4160d = 5;
        f2.j.f(objArr, "array");
        this.f4162f = objArr;
    }
}
