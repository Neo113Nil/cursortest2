package y2;

import O3.d;
import a.AbstractC0124a;
import java.io.Serializable;
import java.util.AbstractList;
import java.util.Collections;
import java.util.List;
import java.util.RandomAccess;

/* loaded from: classes.dex */
public final class b extends AbstractList implements RandomAccess, Serializable {

    /* renamed from: a, reason: collision with root package name */
    public final int[] f16263a;

    /* renamed from: b, reason: collision with root package name */
    public final int f16264b;

    /* renamed from: c, reason: collision with root package name */
    public final int f16265c;

    public b(int i4, int i5, int[] iArr) {
        this.f16263a = iArr;
        this.f16264b = i4;
        this.f16265c = i5;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return (obj instanceof Integer) && d.r(((Integer) obj).intValue(), this.f16264b, this.f16265c, this.f16263a) != -1;
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof b)) {
            return super.equals(obj);
        }
        b bVar = (b) obj;
        int size = size();
        if (bVar.size() != size) {
            return false;
        }
        for (int i4 = 0; i4 < size; i4++) {
            if (this.f16263a[this.f16264b + i4] != bVar.f16263a[bVar.f16264b + i4]) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i4) {
        AbstractC0124a.m(i4, size());
        return Integer.valueOf(this.f16263a[this.f16264b + i4]);
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int i4 = 1;
        for (int i5 = this.f16264b; i5 < this.f16265c; i5++) {
            i4 = (i4 * 31) + this.f16263a[i5];
        }
        return i4;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof Integer)) {
            return -1;
        }
        int intValue = ((Integer) obj).intValue();
        int i4 = this.f16265c;
        int i5 = this.f16264b;
        int r4 = d.r(intValue, i5, i4, this.f16263a);
        if (r4 >= 0) {
            return r4 - i5;
        }
        return -1;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean isEmpty() {
        return false;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int lastIndexOf(Object obj) {
        int i4;
        if (obj instanceof Integer) {
            int intValue = ((Integer) obj).intValue();
            int i5 = this.f16265c;
            while (true) {
                i5--;
                i4 = this.f16264b;
                if (i5 < i4) {
                    i5 = -1;
                    break;
                }
                if (this.f16263a[i5] == intValue) {
                    break;
                }
            }
            if (i5 >= 0) {
                return i5 - i4;
            }
        }
        return -1;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i4, Object obj) {
        Integer num = (Integer) obj;
        AbstractC0124a.m(i4, size());
        int i5 = this.f16264b + i4;
        int[] iArr = this.f16263a;
        int i6 = iArr[i5];
        num.getClass();
        iArr[i5] = num.intValue();
        return Integer.valueOf(i6);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f16265c - this.f16264b;
    }

    @Override // java.util.AbstractList, java.util.List
    public final List subList(int i4, int i5) {
        AbstractC0124a.r(i4, i5, size());
        if (i4 == i5) {
            return Collections.EMPTY_LIST;
        }
        int i6 = this.f16264b;
        return new b(i4 + i6, i6 + i5, this.f16263a);
    }

    @Override // java.util.AbstractCollection
    public final String toString() {
        StringBuilder sb = new StringBuilder(size() * 5);
        sb.append('[');
        int[] iArr = this.f16263a;
        int i4 = this.f16264b;
        sb.append(iArr[i4]);
        while (true) {
            i4++;
            if (i4 >= this.f16265c) {
                sb.append(']');
                return sb.toString();
            }
            sb.append(", ");
            sb.append(iArr[i4]);
        }
    }
}
