package p;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.Set;
import q.AbstractC1178a;

/* renamed from: p.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1170f implements Collection, Set, m2.a {

    /* renamed from: a, reason: collision with root package name */
    public int[] f10190a = AbstractC1178a.f10226a;

    /* renamed from: b, reason: collision with root package name */
    public Object[] f10191b = AbstractC1178a.f10227b;

    /* renamed from: c, reason: collision with root package name */
    public int f10192c;

    public C1170f(int i3) {
        if (i3 > 0) {
            AbstractC1172h.a(this, i3);
        }
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean add(Object obj) {
        int i3;
        int b3;
        int i4 = this.f10192c;
        if (obj == null) {
            b3 = AbstractC1172h.b(this, null, 0);
            i3 = 0;
        } else {
            int hashCode = obj.hashCode();
            i3 = hashCode;
            b3 = AbstractC1172h.b(this, obj, hashCode);
        }
        if (b3 >= 0) {
            return false;
        }
        int i5 = ~b3;
        int[] iArr = this.f10190a;
        if (i4 >= iArr.length) {
            int i6 = 8;
            if (i4 >= 8) {
                i6 = (i4 >> 1) + i4;
            } else if (i4 < 4) {
                i6 = 4;
            }
            Object[] objArr = this.f10191b;
            AbstractC1172h.a(this, i6);
            if (i4 != this.f10192c) {
                throw new ConcurrentModificationException();
            }
            int[] iArr2 = this.f10190a;
            if (iArr2.length != 0) {
                c2.c.Q(0, 0, iArr.length, iArr, iArr2);
                c2.c.S(0, objArr.length, 6, objArr, this.f10191b);
            }
        }
        if (i5 < i4) {
            int[] iArr3 = this.f10190a;
            int i7 = i5 + 1;
            c2.c.Q(i7, i5, i4, iArr3, iArr3);
            Object[] objArr2 = this.f10191b;
            c2.c.R(i7, i5, i4, objArr2, objArr2);
        }
        int i8 = this.f10192c;
        if (i4 == i8) {
            int[] iArr4 = this.f10190a;
            if (i5 < iArr4.length) {
                iArr4[i5] = i3;
                this.f10191b[i5] = obj;
                this.f10192c = i8 + 1;
                return true;
            }
        }
        throw new ConcurrentModificationException();
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean addAll(Collection elements) {
        kotlin.jvm.internal.j.e(elements, "elements");
        int size = elements.size() + this.f10192c;
        int i3 = this.f10192c;
        int[] iArr = this.f10190a;
        boolean z = false;
        if (iArr.length < size) {
            Object[] objArr = this.f10191b;
            AbstractC1172h.a(this, size);
            int i4 = this.f10192c;
            if (i4 > 0) {
                c2.c.Q(0, 0, i4, iArr, this.f10190a);
                c2.c.S(0, this.f10192c, 6, objArr, this.f10191b);
            }
        }
        if (this.f10192c != i3) {
            throw new ConcurrentModificationException();
        }
        Iterator it = elements.iterator();
        while (it.hasNext()) {
            z |= add(it.next());
        }
        return z;
    }

    public final Object b(int i3) {
        int i4 = this.f10192c;
        Object[] objArr = this.f10191b;
        Object obj = objArr[i3];
        if (i4 <= 1) {
            clear();
            return obj;
        }
        int i5 = i4 - 1;
        int[] iArr = this.f10190a;
        if (iArr.length <= 8 || i4 >= iArr.length / 3) {
            if (i3 < i5) {
                int i6 = i3 + 1;
                c2.c.Q(i3, i6, i4, iArr, iArr);
                Object[] objArr2 = this.f10191b;
                c2.c.R(i3, i6, i4, objArr2, objArr2);
            }
            this.f10191b[i5] = null;
        } else {
            AbstractC1172h.a(this, i4 > 8 ? i4 + (i4 >> 1) : 8);
            if (i3 > 0) {
                c2.c.Q(0, 0, i3, iArr, this.f10190a);
                c2.c.S(0, i3, 6, objArr, this.f10191b);
            }
            if (i3 < i5) {
                int i7 = i3 + 1;
                c2.c.Q(i3, i7, i4, iArr, this.f10190a);
                c2.c.R(i3, i7, i4, objArr, this.f10191b);
            }
        }
        if (i4 != this.f10192c) {
            throw new ConcurrentModificationException();
        }
        this.f10192c = i5;
        return obj;
    }

    @Override // java.util.Collection, java.util.Set
    public final void clear() {
        if (this.f10192c != 0) {
            this.f10190a = AbstractC1178a.f10226a;
            this.f10191b = AbstractC1178a.f10227b;
            this.f10192c = 0;
        }
        if (this.f10192c != 0) {
            throw new ConcurrentModificationException();
        }
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        return (obj == null ? AbstractC1172h.b(this, null, 0) : AbstractC1172h.b(this, obj, obj.hashCode())) >= 0;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean containsAll(Collection elements) {
        kotlin.jvm.internal.j.e(elements, "elements");
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
        if (!(obj instanceof Set) || this.f10192c != ((Set) obj).size()) {
            return false;
        }
        try {
            int i3 = this.f10192c;
            for (int i4 = 0; i4 < i3; i4++) {
                if (!((Set) obj).contains(this.f10191b[i4])) {
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
        int[] iArr = this.f10190a;
        int i3 = this.f10192c;
        int i4 = 0;
        for (int i5 = 0; i5 < i3; i5++) {
            i4 += iArr[i5];
        }
        return i4;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean isEmpty() {
        return this.f10192c <= 0;
    }

    @Override // java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        return new C1165a(this);
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        int b3 = obj == null ? AbstractC1172h.b(this, null, 0) : AbstractC1172h.b(this, obj, obj.hashCode());
        if (b3 < 0) {
            return false;
        }
        b(b3);
        return true;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean removeAll(Collection elements) {
        kotlin.jvm.internal.j.e(elements, "elements");
        Iterator it = elements.iterator();
        boolean z = false;
        while (it.hasNext()) {
            z |= remove(it.next());
        }
        return z;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean retainAll(Collection elements) {
        kotlin.jvm.internal.j.e(elements, "elements");
        boolean z = false;
        for (int i3 = this.f10192c - 1; -1 < i3; i3--) {
            if (!elements.contains(this.f10191b[i3])) {
                b(i3);
                z = true;
            }
        }
        return z;
    }

    @Override // java.util.Collection, java.util.Set
    public final int size() {
        return this.f10192c;
    }

    @Override // java.util.Collection, java.util.Set
    public final Object[] toArray() {
        Object[] objArr = this.f10191b;
        int i3 = this.f10192c;
        kotlin.jvm.internal.j.e(objArr, "<this>");
        int length = objArr.length;
        if (i3 <= length) {
            Object[] copyOfRange = Arrays.copyOfRange(objArr, 0, i3);
            kotlin.jvm.internal.j.d(copyOfRange, "copyOfRange(...)");
            return copyOfRange;
        }
        throw new IndexOutOfBoundsException("toIndex (" + i3 + ") is greater than size (" + length + ").");
    }

    public final String toString() {
        if (isEmpty()) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(this.f10192c * 14);
        sb.append('{');
        int i3 = this.f10192c;
        for (int i4 = 0; i4 < i3; i4++) {
            if (i4 > 0) {
                sb.append(", ");
            }
            Object obj = this.f10191b[i4];
            if (obj != this) {
                sb.append(obj);
            } else {
                sb.append("(this Set)");
            }
        }
        sb.append('}');
        String sb2 = sb.toString();
        kotlin.jvm.internal.j.d(sb2, "StringBuilder(capacity).…builderAction).toString()");
        return sb2;
    }

    @Override // java.util.Collection, java.util.Set
    public final Object[] toArray(Object[] array) {
        kotlin.jvm.internal.j.e(array, "array");
        int i3 = this.f10192c;
        if (array.length < i3) {
            array = (Object[]) Array.newInstance(array.getClass().getComponentType(), i3);
        } else if (array.length > i3) {
            array[i3] = null;
        }
        c2.c.R(0, 0, this.f10192c, this.f10191b, array);
        return array;
    }
}
