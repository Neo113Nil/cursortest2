package hd;

import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.collections.IndexedValue;
import kotlin.collections.i0;
import s.s0;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public class u implements Iterator, xd.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f4525d;

    /* renamed from: e, reason: collision with root package name */
    public int f4526e;

    /* renamed from: i, reason: collision with root package name */
    public final Object f4527i;

    public u(Object[] objArr) {
        this.f4525d = 8;
        objArr.getClass();
        this.f4527i = objArr;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        switch (this.f4525d) {
            case 0:
                return this.f4526e < ((byte[]) this.f4527i).length;
            case 1:
                return this.f4526e < ((int[]) this.f4527i).length;
            case 2:
                return this.f4526e < ((long[]) this.f4527i).length;
            case a4.j.INTEGER_FIELD_NUMBER /* 3 */:
                return this.f4526e < ((short[]) this.f4527i).length;
            case a4.j.LONG_FIELD_NUMBER /* 4 */:
                return this.f4526e < ((kotlin.collections.f) this.f4527i).b();
            case a4.j.STRING_FIELD_NUMBER /* 5 */:
                return ((Iterator) this.f4527i).hasNext();
            case a4.j.STRING_SET_FIELD_NUMBER /* 6 */:
                return this.f4526e > 0;
            case a4.j.DOUBLE_FIELD_NUMBER /* 7 */:
                return this.f4526e < ((s0) this.f4527i).f();
            default:
                return this.f4526e < ((Object[]) this.f4527i).length;
        }
    }

    @Override // java.util.Iterator
    public final Object next() {
        switch (this.f4525d) {
            case 0:
                int i3 = this.f4526e;
                byte[] bArr = (byte[]) this.f4527i;
                if (i3 >= bArr.length) {
                    throw new NoSuchElementException(String.valueOf(i3));
                }
                this.f4526e = i3 + 1;
                return new t(bArr[i3]);
            case 1:
                int i10 = this.f4526e;
                int[] iArr = (int[]) this.f4527i;
                if (i10 >= iArr.length) {
                    throw new NoSuchElementException(String.valueOf(i10));
                }
                this.f4526e = i10 + 1;
                return new x(iArr[i10]);
            case 2:
                int i11 = this.f4526e;
                long[] jArr = (long[]) this.f4527i;
                if (i11 >= jArr.length) {
                    throw new NoSuchElementException(String.valueOf(i11));
                }
                this.f4526e = i11 + 1;
                return new a0(jArr[i11]);
            case a4.j.INTEGER_FIELD_NUMBER /* 3 */:
                int i12 = this.f4526e;
                short[] sArr = (short[]) this.f4527i;
                if (i12 >= sArr.length) {
                    throw new NoSuchElementException(String.valueOf(i12));
                }
                this.f4526e = i12 + 1;
                return new e0(sArr[i12]);
            case a4.j.LONG_FIELD_NUMBER /* 4 */:
                if (!hasNext()) {
                    i0.c();
                    return null;
                }
                kotlin.collections.f fVar = (kotlin.collections.f) this.f4527i;
                int i13 = this.f4526e;
                this.f4526e = i13 + 1;
                return fVar.get(i13);
            case a4.j.STRING_FIELD_NUMBER /* 5 */:
                int i14 = this.f4526e;
                this.f4526e = i14 + 1;
                if (i14 >= 0) {
                    return new IndexedValue(i14, ((Iterator) this.f4527i).next());
                }
                kotlin.collections.y.i();
                throw null;
            case a4.j.STRING_SET_FIELD_NUMBER /* 6 */:
                te.w wVar = (te.w) this.f4527i;
                int i15 = wVar.f9359c;
                int i16 = this.f4526e;
                this.f4526e = i16 - 1;
                return wVar.f9361e[i15 - i16];
            case a4.j.DOUBLE_FIELD_NUMBER /* 7 */:
                s0 s0Var = (s0) this.f4527i;
                int i17 = this.f4526e;
                this.f4526e = i17 + 1;
                return s0Var.g(i17);
            default:
                try {
                    Object[] objArr = (Object[]) this.f4527i;
                    int i18 = this.f4526e;
                    this.f4526e = i18 + 1;
                    return objArr[i18];
                } catch (ArrayIndexOutOfBoundsException e2) {
                    this.f4526e--;
                    throw new NoSuchElementException(e2.getMessage());
                }
        }
    }

    @Override // java.util.Iterator
    public final void remove() {
        switch (this.f4525d) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            case 1:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            case 2:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            case a4.j.INTEGER_FIELD_NUMBER /* 3 */:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            case a4.j.LONG_FIELD_NUMBER /* 4 */:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            case a4.j.STRING_FIELD_NUMBER /* 5 */:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            case a4.j.STRING_SET_FIELD_NUMBER /* 6 */:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            case a4.j.DOUBLE_FIELD_NUMBER /* 7 */:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public /* synthetic */ u(int i3, Object obj) {
        this.f4525d = i3;
        this.f4527i = obj;
    }

    public u(Iterator it) {
        this.f4525d = 5;
        it.getClass();
        this.f4527i = it;
    }

    public u(te.w wVar) {
        this.f4525d = 6;
        this.f4527i = wVar;
        this.f4526e = wVar.f9359c;
    }
}
