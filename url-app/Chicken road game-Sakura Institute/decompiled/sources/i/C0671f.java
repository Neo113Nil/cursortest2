package i;

import j.AbstractC0705a;
import java.lang.reflect.Array;
import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;
import z2.C1403G;
import z2.C1436t;

/* renamed from: i.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0671f implements Collection, Set, N2.b, N2.f {

    /* renamed from: d, reason: collision with root package name */
    public int[] f6916d = AbstractC0705a.f7119a;

    /* renamed from: e, reason: collision with root package name */
    public Object[] f6917e = AbstractC0705a.f7121c;

    /* renamed from: i, reason: collision with root package name */
    public int f6918i;

    public C0671f(int i2) {
        if (i2 > 0) {
            n.b(this, i2);
        }
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean add(Object obj) {
        int i2;
        int c4;
        int i4 = this.f6918i;
        if (obj == null) {
            Intrinsics.checkNotNullParameter(this, "<this>");
            c4 = n.c(this, null, 0);
            i2 = 0;
        } else {
            int hashCode = obj.hashCode();
            i2 = hashCode;
            c4 = n.c(this, obj, hashCode);
        }
        if (c4 >= 0) {
            return false;
        }
        int i5 = ~c4;
        int[] iArr = this.f6916d;
        if (i4 >= iArr.length) {
            int i6 = 8;
            if (i4 >= 8) {
                i6 = (i4 >> 1) + i4;
            } else if (i4 < 4) {
                i6 = 4;
            }
            Object[] objArr = this.f6917e;
            n.b(this, i6);
            if (i4 != this.f6918i) {
                throw new ConcurrentModificationException();
            }
            int[] iArr2 = this.f6916d;
            if (iArr2.length != 0) {
                C1436t.g(iArr, iArr2, 0, iArr.length, 6);
                C1436t.h(objArr, this.f6917e, 0, objArr.length, 6);
            }
        }
        if (i5 < i4) {
            int[] iArr3 = this.f6916d;
            int i7 = i5 + 1;
            C1436t.e(iArr3, iArr3, i7, i5, i4);
            Object[] objArr2 = this.f6917e;
            C1436t.f(objArr2, objArr2, i7, i5, i4);
        }
        int i8 = this.f6918i;
        if (i4 == i8) {
            int[] iArr4 = this.f6916d;
            if (i5 < iArr4.length) {
                iArr4[i5] = i2;
                this.f6917e[i5] = obj;
                this.f6918i = i8 + 1;
                return true;
            }
        }
        throw new ConcurrentModificationException();
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean addAll(Collection elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        int size = elements.size() + this.f6918i;
        int i2 = this.f6918i;
        int[] iArr = this.f6916d;
        boolean z4 = false;
        if (iArr.length < size) {
            Object[] objArr = this.f6917e;
            n.b(this, size);
            int i4 = this.f6918i;
            if (i4 > 0) {
                C1436t.g(iArr, this.f6916d, 0, i4, 6);
                C1436t.h(objArr, this.f6917e, 0, this.f6918i, 6);
            }
        }
        if (this.f6918i != i2) {
            throw new ConcurrentModificationException();
        }
        Iterator it = elements.iterator();
        while (it.hasNext()) {
            z4 |= add(it.next());
        }
        return z4;
    }

    @Override // java.util.Collection, java.util.Set
    public final void clear() {
        if (this.f6918i != 0) {
            int[] iArr = AbstractC0705a.f7119a;
            Intrinsics.checkNotNullParameter(iArr, "<set-?>");
            this.f6916d = iArr;
            Object[] objArr = AbstractC0705a.f7121c;
            Intrinsics.checkNotNullParameter(objArr, "<set-?>");
            this.f6917e = objArr;
            this.f6918i = 0;
        }
        if (this.f6918i != 0) {
            throw new ConcurrentModificationException();
        }
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        int c4;
        if (obj == null) {
            Intrinsics.checkNotNullParameter(this, "<this>");
            c4 = n.c(this, null, 0);
        } else {
            c4 = n.c(this, obj, obj.hashCode());
        }
        return c4 >= 0;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean containsAll(Collection elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        Iterator it = elements.iterator();
        while (it.hasNext()) {
            if (!contains(it.next())) {
                return false;
            }
        }
        return true;
    }

    public final Object e(int i2) {
        int i4 = this.f6918i;
        Object[] objArr = this.f6917e;
        Object obj = objArr[i2];
        if (i4 <= 1) {
            clear();
        } else {
            int i5 = i4 - 1;
            int[] iArr = this.f6916d;
            if (iArr.length <= 8 || i4 >= iArr.length / 3) {
                if (i2 < i5) {
                    int i6 = i2 + 1;
                    C1436t.e(iArr, iArr, i2, i6, i4);
                    Object[] objArr2 = this.f6917e;
                    C1436t.f(objArr2, objArr2, i2, i6, i4);
                }
                this.f6917e[i5] = null;
            } else {
                n.b(this, i4 > 8 ? i4 + (i4 >> 1) : 8);
                if (i2 > 0) {
                    C1436t.g(iArr, this.f6916d, 0, i2, 6);
                    C1436t.h(objArr, this.f6917e, 0, i2, 6);
                }
                if (i2 < i5) {
                    int i7 = i2 + 1;
                    C1436t.e(iArr, this.f6916d, i2, i7, i4);
                    C1436t.f(objArr, this.f6917e, i2, i7, i4);
                }
            }
            if (i4 != this.f6918i) {
                throw new ConcurrentModificationException();
            }
            this.f6918i = i5;
        }
        return obj;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof Set) && this.f6918i == ((Set) obj).size()) {
            try {
                int i2 = this.f6918i;
                for (int i4 = 0; i4 < i2; i4++) {
                    if (((Set) obj).contains(this.f6917e[i4])) {
                    }
                }
                return true;
            } catch (ClassCastException | NullPointerException unused) {
            }
        }
        return false;
    }

    @Override // java.util.Collection, java.util.Set
    public final int hashCode() {
        int[] iArr = this.f6916d;
        int i2 = this.f6918i;
        int i4 = 0;
        for (int i5 = 0; i5 < i2; i5++) {
            i4 += iArr[i5];
        }
        return i4;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean isEmpty() {
        return this.f6918i <= 0;
    }

    @Override // java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        return new C0666a(this);
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        int c4;
        if (obj == null) {
            Intrinsics.checkNotNullParameter(this, "<this>");
            c4 = n.c(this, null, 0);
        } else {
            c4 = n.c(this, obj, obj.hashCode());
        }
        if (c4 < 0) {
            return false;
        }
        e(c4);
        return true;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean removeAll(Collection elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        Iterator it = elements.iterator();
        boolean z4 = false;
        while (it.hasNext()) {
            z4 |= remove(it.next());
        }
        return z4;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean retainAll(Collection elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        boolean z4 = false;
        for (int i2 = this.f6918i - 1; -1 < i2; i2--) {
            if (!C1403G.o(elements, this.f6917e[i2])) {
                e(i2);
                z4 = true;
            }
        }
        return z4;
    }

    @Override // java.util.Collection, java.util.Set
    public final int size() {
        return this.f6918i;
    }

    @Override // java.util.Collection, java.util.Set
    public final Object[] toArray() {
        return C1436t.j(this.f6917e, 0, this.f6918i);
    }

    public final String toString() {
        if (isEmpty()) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(this.f6918i * 14);
        sb.append('{');
        int i2 = this.f6918i;
        for (int i4 = 0; i4 < i2; i4++) {
            if (i4 > 0) {
                sb.append(", ");
            }
            Object obj = this.f6917e[i4];
            if (obj != this) {
                sb.append(obj);
            } else {
                sb.append("(this Set)");
            }
        }
        sb.append('}');
        String sb2 = sb.toString();
        Intrinsics.checkNotNullExpressionValue(sb2, "StringBuilder(capacity).…builderAction).toString()");
        return sb2;
    }

    @Override // java.util.Collection, java.util.Set
    public final Object[] toArray(Object[] result) {
        Intrinsics.checkNotNullParameter(result, "array");
        int i2 = this.f6918i;
        if (result.length < i2) {
            result = (Object[]) Array.newInstance(result.getClass().getComponentType(), i2);
        } else if (result.length > i2) {
            result[i2] = null;
        }
        C1436t.f(this.f6917e, result, 0, 0, this.f6918i);
        Intrinsics.checkNotNullExpressionValue(result, "result");
        return result;
    }
}
