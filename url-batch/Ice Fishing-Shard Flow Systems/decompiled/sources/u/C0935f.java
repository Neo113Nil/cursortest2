package u;

import java.lang.reflect.Array;
import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.Set;
import kotlin.collections.CollectionsKt;
import kotlin.collections.o;
import kotlin.jvm.internal.Intrinsics;
import v.AbstractC0955a;

/* renamed from: u.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0935f implements Collection, Set, f6.b {

    /* renamed from: d, reason: collision with root package name */
    public int[] f8028d = AbstractC0955a.f8126a;

    /* renamed from: e, reason: collision with root package name */
    public Object[] f8029e = AbstractC0955a.f8127b;

    /* renamed from: i, reason: collision with root package name */
    public int f8030i;

    public C0935f(int i2) {
        if (i2 > 0) {
            AbstractC0937h.a(this, i2);
        }
    }

    public final Object a(int i2) {
        int i5 = this.f8030i;
        Object[] objArr = this.f8029e;
        Object obj = objArr[i2];
        if (i5 <= 1) {
            clear();
            return obj;
        }
        int i7 = i5 - 1;
        int[] iArr = this.f8028d;
        if (iArr.length <= 8 || i5 >= iArr.length / 3) {
            if (i2 < i7) {
                int i8 = i2 + 1;
                o.d(i2, i8, iArr, iArr, i5);
                Object[] objArr2 = this.f8029e;
                o.e(objArr2, objArr2, i2, i8, i5);
            }
            this.f8029e[i7] = null;
        } else {
            AbstractC0937h.a(this, i5 > 8 ? i5 + (i5 >> 1) : 8);
            if (i2 > 0) {
                o.d(0, 0, iArr, this.f8028d, i2);
                o.f(objArr, this.f8029e, 0, i2, 6);
            }
            if (i2 < i7) {
                int i9 = i2 + 1;
                o.d(i2, i9, iArr, this.f8028d, i5);
                o.e(objArr, this.f8029e, i2, i9, i5);
            }
        }
        if (i5 != this.f8030i) {
            throw new ConcurrentModificationException();
        }
        this.f8030i = i7;
        return obj;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean add(Object obj) {
        int i2;
        int b7;
        int i5 = this.f8030i;
        if (obj == null) {
            Intrinsics.checkNotNullParameter(this, "<this>");
            b7 = AbstractC0937h.b(this, null, 0);
            i2 = 0;
        } else {
            int hashCode = obj.hashCode();
            i2 = hashCode;
            b7 = AbstractC0937h.b(this, obj, hashCode);
        }
        if (b7 >= 0) {
            return false;
        }
        int i7 = ~b7;
        int[] iArr = this.f8028d;
        if (i5 >= iArr.length) {
            int i8 = 8;
            if (i5 >= 8) {
                i8 = (i5 >> 1) + i5;
            } else if (i5 < 4) {
                i8 = 4;
            }
            Object[] objArr = this.f8029e;
            AbstractC0937h.a(this, i8);
            if (i5 != this.f8030i) {
                throw new ConcurrentModificationException();
            }
            int[] iArr2 = this.f8028d;
            if (iArr2.length != 0) {
                o.d(0, 0, iArr, iArr2, iArr.length);
                o.f(objArr, this.f8029e, 0, objArr.length, 6);
            }
        }
        if (i7 < i5) {
            int[] iArr3 = this.f8028d;
            int i9 = i7 + 1;
            o.d(i9, i7, iArr3, iArr3, i5);
            Object[] objArr2 = this.f8029e;
            o.e(objArr2, objArr2, i9, i7, i5);
        }
        int i10 = this.f8030i;
        if (i5 == i10) {
            int[] iArr4 = this.f8028d;
            if (i7 < iArr4.length) {
                iArr4[i7] = i2;
                this.f8029e[i7] = obj;
                this.f8030i = i10 + 1;
                return true;
            }
        }
        throw new ConcurrentModificationException();
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean addAll(Collection elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        int size = elements.size() + this.f8030i;
        int i2 = this.f8030i;
        int[] iArr = this.f8028d;
        boolean z7 = false;
        if (iArr.length < size) {
            Object[] objArr = this.f8029e;
            AbstractC0937h.a(this, size);
            int i5 = this.f8030i;
            if (i5 > 0) {
                o.d(0, 0, iArr, this.f8028d, i5);
                o.f(objArr, this.f8029e, 0, this.f8030i, 6);
            }
        }
        if (this.f8030i != i2) {
            throw new ConcurrentModificationException();
        }
        Iterator it = elements.iterator();
        while (it.hasNext()) {
            z7 |= add(it.next());
        }
        return z7;
    }

    @Override // java.util.Collection, java.util.Set
    public final void clear() {
        if (this.f8030i != 0) {
            int[] iArr = AbstractC0955a.f8126a;
            Intrinsics.checkNotNullParameter(iArr, "<set-?>");
            this.f8028d = iArr;
            Object[] objArr = AbstractC0955a.f8127b;
            Intrinsics.checkNotNullParameter(objArr, "<set-?>");
            this.f8029e = objArr;
            this.f8030i = 0;
        }
        if (this.f8030i != 0) {
            throw new ConcurrentModificationException();
        }
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        int b7;
        if (obj == null) {
            Intrinsics.checkNotNullParameter(this, "<this>");
            b7 = AbstractC0937h.b(this, null, 0);
        } else {
            b7 = AbstractC0937h.b(this, obj, obj.hashCode());
        }
        return b7 >= 0;
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

    @Override // java.util.Collection, java.util.Set
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Set) || this.f8030i != ((Set) obj).size()) {
            return false;
        }
        try {
            int i2 = this.f8030i;
            for (int i5 = 0; i5 < i2; i5++) {
                if (!((Set) obj).contains(this.f8029e[i5])) {
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
        int[] iArr = this.f8028d;
        int i2 = this.f8030i;
        int i5 = 0;
        for (int i7 = 0; i7 < i2; i7++) {
            i5 += iArr[i7];
        }
        return i5;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean isEmpty() {
        return this.f8030i <= 0;
    }

    @Override // java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        return new C0930a(this);
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        int b7;
        if (obj == null) {
            Intrinsics.checkNotNullParameter(this, "<this>");
            b7 = AbstractC0937h.b(this, null, 0);
        } else {
            b7 = AbstractC0937h.b(this, obj, obj.hashCode());
        }
        if (b7 < 0) {
            return false;
        }
        a(b7);
        return true;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean removeAll(Collection elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        Iterator it = elements.iterator();
        boolean z7 = false;
        while (it.hasNext()) {
            z7 |= remove(it.next());
        }
        return z7;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean retainAll(Collection elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        boolean z7 = false;
        for (int i2 = this.f8030i - 1; -1 < i2; i2--) {
            if (!CollectionsKt.m(elements, this.f8029e[i2])) {
                a(i2);
                z7 = true;
            }
        }
        return z7;
    }

    @Override // java.util.Collection, java.util.Set
    public final int size() {
        return this.f8030i;
    }

    @Override // java.util.Collection, java.util.Set
    public final Object[] toArray() {
        return o.h(this.f8029e, 0, this.f8030i);
    }

    public final String toString() {
        if (isEmpty()) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(this.f8030i * 14);
        sb.append('{');
        int i2 = this.f8030i;
        for (int i5 = 0; i5 < i2; i5++) {
            if (i5 > 0) {
                sb.append(", ");
            }
            Object obj = this.f8029e[i5];
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
        int i2 = this.f8030i;
        if (result.length < i2) {
            result = (Object[]) Array.newInstance(result.getClass().getComponentType(), i2);
        } else if (result.length > i2) {
            result[i2] = null;
        }
        o.e(this.f8029e, result, 0, 0, this.f8030i);
        Intrinsics.checkNotNullExpressionValue(result, "result");
        return result;
    }
}
