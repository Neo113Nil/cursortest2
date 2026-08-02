package p;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.Set;
import p3.InterfaceC1349a;
import q.AbstractC1350a;

/* loaded from: classes.dex */
public final class f implements Collection, Set, InterfaceC1349a {

    /* renamed from: a, reason: collision with root package name */
    public int[] f14650a = AbstractC1350a.f14809a;

    /* renamed from: b, reason: collision with root package name */
    public Object[] f14651b = AbstractC1350a.f14810b;

    /* renamed from: c, reason: collision with root package name */
    public int f14652c;

    public f(int i4) {
        if (i4 > 0) {
            h.a(this, i4);
        }
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean add(Object obj) {
        int i4;
        int b4;
        int i5 = this.f14652c;
        if (obj == null) {
            b4 = h.b(this, null, 0);
            i4 = 0;
        } else {
            int hashCode = obj.hashCode();
            i4 = hashCode;
            b4 = h.b(this, obj, hashCode);
        }
        if (b4 >= 0) {
            return false;
        }
        int i6 = ~b4;
        int[] iArr = this.f14650a;
        if (i5 >= iArr.length) {
            int i7 = 8;
            if (i5 >= 8) {
                i7 = (i5 >> 1) + i5;
            } else if (i5 < 4) {
                i7 = 4;
            }
            Object[] objArr = this.f14651b;
            int[] iArr2 = new int[i7];
            this.f14650a = iArr2;
            this.f14651b = new Object[i7];
            if (i5 != this.f14652c) {
                throw new ConcurrentModificationException();
            }
            if (iArr2.length != 0) {
                d3.g.P(0, 0, iArr.length, iArr, iArr2);
                d3.g.R(0, objArr.length, 6, objArr, this.f14651b);
            }
        }
        if (i6 < i5) {
            int[] iArr3 = this.f14650a;
            int i8 = i6 + 1;
            d3.g.P(i8, i6, i5, iArr3, iArr3);
            Object[] objArr2 = this.f14651b;
            d3.g.Q(i8, i6, i5, objArr2, objArr2);
        }
        int i9 = this.f14652c;
        if (i5 == i9) {
            int[] iArr4 = this.f14650a;
            if (i6 < iArr4.length) {
                iArr4[i6] = i4;
                this.f14651b[i6] = obj;
                this.f14652c = i9 + 1;
                return true;
            }
        }
        throw new ConcurrentModificationException();
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean addAll(Collection elements) {
        kotlin.jvm.internal.i.e(elements, "elements");
        int size = elements.size() + this.f14652c;
        int i4 = this.f14652c;
        int[] iArr = this.f14650a;
        boolean z = false;
        if (iArr.length < size) {
            Object[] objArr = this.f14651b;
            int[] iArr2 = new int[size];
            this.f14650a = iArr2;
            this.f14651b = new Object[size];
            if (i4 > 0) {
                d3.g.P(0, 0, i4, iArr, iArr2);
                d3.g.R(0, this.f14652c, 6, objArr, this.f14651b);
            }
        }
        if (this.f14652c != i4) {
            throw new ConcurrentModificationException();
        }
        Iterator it = elements.iterator();
        while (it.hasNext()) {
            z |= add(it.next());
        }
        return z;
    }

    public final Object b(int i4) {
        int i5 = this.f14652c;
        Object[] objArr = this.f14651b;
        Object obj = objArr[i4];
        if (i5 <= 1) {
            clear();
            return obj;
        }
        int i6 = i5 - 1;
        int[] iArr = this.f14650a;
        if (iArr.length <= 8 || i5 >= iArr.length / 3) {
            if (i4 < i6) {
                int i7 = i4 + 1;
                d3.g.P(i4, i7, i5, iArr, iArr);
                Object[] objArr2 = this.f14651b;
                d3.g.Q(i4, i7, i5, objArr2, objArr2);
            }
            this.f14651b[i6] = null;
        } else {
            int i8 = i5 > 8 ? i5 + (i5 >> 1) : 8;
            int[] iArr2 = new int[i8];
            this.f14650a = iArr2;
            this.f14651b = new Object[i8];
            if (i4 > 0) {
                d3.g.P(0, 0, i4, iArr, iArr2);
                d3.g.R(0, i4, 6, objArr, this.f14651b);
            }
            if (i4 < i6) {
                int i9 = i4 + 1;
                d3.g.P(i4, i9, i5, iArr, this.f14650a);
                d3.g.Q(i4, i9, i5, objArr, this.f14651b);
            }
        }
        if (i5 != this.f14652c) {
            throw new ConcurrentModificationException();
        }
        this.f14652c = i6;
        return obj;
    }

    @Override // java.util.Collection, java.util.Set
    public final void clear() {
        if (this.f14652c != 0) {
            this.f14650a = AbstractC1350a.f14809a;
            this.f14651b = AbstractC1350a.f14810b;
            this.f14652c = 0;
        }
        if (this.f14652c != 0) {
            throw new ConcurrentModificationException();
        }
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        return (obj == null ? h.b(this, null, 0) : h.b(this, obj, obj.hashCode())) >= 0;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean containsAll(Collection elements) {
        kotlin.jvm.internal.i.e(elements, "elements");
        Iterator it = elements.iterator();
        while (it.hasNext()) {
            if (!contains(it.next())) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Set) || this.f14652c != ((Set) obj).size()) {
            return false;
        }
        try {
            int i4 = this.f14652c;
            for (int i5 = 0; i5 < i4; i5++) {
                if (!((Set) obj).contains(this.f14651b[i5])) {
                    return false;
                }
            }
            return true;
        } catch (ClassCastException | NullPointerException unused) {
            return false;
        }
    }

    @Override // java.util.Collection, java.util.Set
    public final int hashCode() {
        int[] iArr = this.f14650a;
        int i4 = this.f14652c;
        int i5 = 0;
        for (int i6 = 0; i6 < i4; i6++) {
            i5 += iArr[i6];
        }
        return i5;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean isEmpty() {
        return this.f14652c <= 0;
    }

    @Override // java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        return new C1342a(this);
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        int b4 = obj == null ? h.b(this, null, 0) : h.b(this, obj, obj.hashCode());
        if (b4 < 0) {
            return false;
        }
        b(b4);
        return true;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean removeAll(Collection elements) {
        kotlin.jvm.internal.i.e(elements, "elements");
        Iterator it = elements.iterator();
        boolean z = false;
        while (it.hasNext()) {
            z |= remove(it.next());
        }
        return z;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean retainAll(Collection elements) {
        kotlin.jvm.internal.i.e(elements, "elements");
        boolean z = false;
        for (int i4 = this.f14652c - 1; -1 < i4; i4--) {
            if (!d3.i.b0(elements, this.f14651b[i4])) {
                b(i4);
                z = true;
            }
        }
        return z;
    }

    @Override // java.util.Collection, java.util.Set
    public final int size() {
        return this.f14652c;
    }

    @Override // java.util.Collection, java.util.Set
    public final Object[] toArray() {
        Object[] objArr = this.f14651b;
        int i4 = this.f14652c;
        kotlin.jvm.internal.i.e(objArr, "<this>");
        V3.b.k(i4, objArr.length);
        Object[] copyOfRange = Arrays.copyOfRange(objArr, 0, i4);
        kotlin.jvm.internal.i.d(copyOfRange, "copyOfRange(...)");
        return copyOfRange;
    }

    public final String toString() {
        if (isEmpty()) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(this.f14652c * 14);
        sb.append('{');
        int i4 = this.f14652c;
        for (int i5 = 0; i5 < i4; i5++) {
            if (i5 > 0) {
                sb.append(", ");
            }
            Object obj = this.f14651b[i5];
            if (obj != this) {
                sb.append(obj);
            } else {
                sb.append("(this Set)");
            }
        }
        sb.append('}');
        String sb2 = sb.toString();
        kotlin.jvm.internal.i.d(sb2, "StringBuilder(capacity).…builderAction).toString()");
        return sb2;
    }

    @Override // java.util.Collection, java.util.Set
    public final Object[] toArray(Object[] array) {
        kotlin.jvm.internal.i.e(array, "array");
        int i4 = this.f14652c;
        if (array.length < i4) {
            array = (Object[]) Array.newInstance(array.getClass().getComponentType(), i4);
        } else if (array.length > i4) {
            array[i4] = null;
        }
        d3.g.Q(0, 0, this.f14652c, this.f14651b, array);
        return array;
    }
}
