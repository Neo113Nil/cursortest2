package Y7;

import java.util.Iterator;
import java.util.NoSuchElementException;
import q7.C4944m;
import q7.C4946o;
import q7.C4948q;
import q7.t;
import r7.AbstractC4973d;

/* loaded from: classes2.dex */
public class g implements Iterator, F7.a {

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f4051n;

    /* renamed from: u, reason: collision with root package name */
    public int f4052u;

    /* renamed from: v, reason: collision with root package name */
    public final Object f4053v;

    public /* synthetic */ g(int i, Object obj) {
        this.f4051n = i;
        this.f4053v = obj;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        switch (this.f4051n) {
            case 0:
                if (this.f4052u > 0) {
                }
                break;
            case 1:
                if (this.f4052u < ((Object[]) this.f4053v).length) {
                }
                break;
            case 2:
                if (this.f4052u < ((byte[]) this.f4053v).length) {
                }
                break;
            case 3:
                if (this.f4052u < ((int[]) this.f4053v).length) {
                }
                break;
            case 4:
                if (this.f4052u < ((long[]) this.f4053v).length) {
                }
                break;
            case 5:
                if (this.f4052u < ((short[]) this.f4053v).length) {
                }
                break;
            default:
                if (this.f4052u < ((AbstractC4973d) this.f4053v).a()) {
                }
                break;
        }
        return false;
    }

    @Override // java.util.Iterator
    public final Object next() {
        switch (this.f4051n) {
            case 0:
                e eVar = (e) this.f4053v;
                int e6 = eVar.e();
                int i = this.f4052u;
                this.f4052u = i - 1;
                return eVar.i(e6 - i);
            case 1:
                try {
                    Object[] objArr = (Object[]) this.f4053v;
                    int i4 = this.f4052u;
                    this.f4052u = i4 + 1;
                    return objArr[i4];
                } catch (ArrayIndexOutOfBoundsException e9) {
                    this.f4052u--;
                    throw new NoSuchElementException(e9.getMessage());
                }
            case 2:
                int i9 = this.f4052u;
                byte[] bArr = (byte[]) this.f4053v;
                if (i9 >= bArr.length) {
                    throw new NoSuchElementException(String.valueOf(this.f4052u));
                }
                this.f4052u = i9 + 1;
                return new C4944m(bArr[i9]);
            case 3:
                int i10 = this.f4052u;
                int[] iArr = (int[]) this.f4053v;
                if (i10 >= iArr.length) {
                    throw new NoSuchElementException(String.valueOf(this.f4052u));
                }
                this.f4052u = i10 + 1;
                return new C4946o(iArr[i10]);
            case 4:
                int i11 = this.f4052u;
                long[] jArr = (long[]) this.f4053v;
                if (i11 >= jArr.length) {
                    throw new NoSuchElementException(String.valueOf(this.f4052u));
                }
                this.f4052u = i11 + 1;
                return new C4948q(jArr[i11]);
            case 5:
                int i12 = this.f4052u;
                short[] sArr = (short[]) this.f4053v;
                if (i12 >= sArr.length) {
                    throw new NoSuchElementException(String.valueOf(this.f4052u));
                }
                this.f4052u = i12 + 1;
                return new t(sArr[i12]);
            default:
                if (!hasNext()) {
                    throw new NoSuchElementException();
                }
                int i13 = this.f4052u;
                this.f4052u = i13 + 1;
                return ((AbstractC4973d) this.f4053v).get(i13);
        }
    }

    @Override // java.util.Iterator
    public final void remove() {
        switch (this.f4051n) {
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

    public g(Object[] array) {
        this.f4051n = 1;
        kotlin.jvm.internal.h.e(array, "array");
        this.f4053v = array;
    }

    public g(e eVar) {
        this.f4051n = 0;
        this.f4053v = eVar;
        this.f4052u = eVar.e();
    }
}
