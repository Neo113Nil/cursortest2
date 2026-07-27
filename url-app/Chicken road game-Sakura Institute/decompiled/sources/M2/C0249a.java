package M2;

import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.jvm.internal.Intrinsics;
import y2.C1322B;
import z2.AbstractC1420d;

/* renamed from: M2.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C0249a implements Iterator, N2.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f3584d;

    /* renamed from: e, reason: collision with root package name */
    public int f3585e;

    /* renamed from: i, reason: collision with root package name */
    public final Object f3586i;

    public /* synthetic */ C0249a(int i2, Object obj) {
        this.f3584d = i2;
        this.f3586i = obj;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        switch (this.f3584d) {
            case 0:
                if (this.f3585e < ((Object[]) this.f3586i).length) {
                }
                break;
            case 1:
                if (this.f3585e < ((i.H) this.f3586i).e()) {
                }
                break;
            case 2:
                if (this.f3585e < ((byte[]) this.f3586i).length) {
                }
                break;
            case 3:
                if (this.f3585e < ((int[]) this.f3586i).length) {
                }
                break;
            case 4:
                if (this.f3585e < ((long[]) this.f3586i).length) {
                }
                break;
            case 5:
                if (this.f3585e < ((short[]) this.f3586i).length) {
                }
                break;
            default:
                if (this.f3585e < ((AbstractC1420d) this.f3586i).e()) {
                }
                break;
        }
        return false;
    }

    @Override // java.util.Iterator
    public final Object next() {
        switch (this.f3584d) {
            case 0:
                try {
                    Object[] objArr = (Object[]) this.f3586i;
                    int i2 = this.f3585e;
                    this.f3585e = i2 + 1;
                    return objArr[i2];
                } catch (ArrayIndexOutOfBoundsException e4) {
                    this.f3585e--;
                    throw new NoSuchElementException(e4.getMessage());
                }
            case 1:
                int i4 = this.f3585e;
                this.f3585e = i4 + 1;
                return ((i.H) this.f3586i).f(i4);
            case 2:
                int i5 = this.f3585e;
                byte[] bArr = (byte[]) this.f3586i;
                if (i5 >= bArr.length) {
                    throw new NoSuchElementException(String.valueOf(this.f3585e));
                }
                this.f3585e = i5 + 1;
                return new y2.u(bArr[i5]);
            case 3:
                int i6 = this.f3585e;
                int[] iArr = (int[]) this.f3586i;
                if (i6 >= iArr.length) {
                    throw new NoSuchElementException(String.valueOf(this.f3585e));
                }
                this.f3585e = i6 + 1;
                return new y2.w(iArr[i6]);
            case 4:
                int i7 = this.f3585e;
                long[] jArr = (long[]) this.f3586i;
                if (i7 >= jArr.length) {
                    throw new NoSuchElementException(String.valueOf(this.f3585e));
                }
                this.f3585e = i7 + 1;
                return new y2.y(jArr[i7]);
            case 5:
                int i8 = this.f3585e;
                short[] sArr = (short[]) this.f3586i;
                if (i8 >= sArr.length) {
                    throw new NoSuchElementException(String.valueOf(this.f3585e));
                }
                this.f3585e = i8 + 1;
                return new C1322B(sArr[i8]);
            default:
                if (!hasNext()) {
                    throw new NoSuchElementException();
                }
                int i9 = this.f3585e;
                this.f3585e = i9 + 1;
                return ((AbstractC1420d) this.f3586i).get(i9);
        }
    }

    @Override // java.util.Iterator
    public final void remove() {
        switch (this.f3584d) {
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

    public C0249a(Object[] array) {
        this.f3584d = 0;
        Intrinsics.checkNotNullParameter(array, "array");
        this.f3586i = array;
    }

    public C0249a(byte[] array) {
        this.f3584d = 2;
        Intrinsics.checkNotNullParameter(array, "array");
        this.f3586i = array;
    }

    public C0249a(int[] array) {
        this.f3584d = 3;
        Intrinsics.checkNotNullParameter(array, "array");
        this.f3586i = array;
    }

    public C0249a(long[] array) {
        this.f3584d = 4;
        Intrinsics.checkNotNullParameter(array, "array");
        this.f3586i = array;
    }

    public C0249a(short[] array) {
        this.f3584d = 5;
        Intrinsics.checkNotNullParameter(array, "array");
        this.f3586i = array;
    }
}
