package com.google.android.gms.internal.ads;

import java.util.AbstractList;
import java.util.Arrays;
import java.util.List;
import java.util.RandomAccess;

/* loaded from: classes2.dex */
public final class JL extends JK implements RandomAccess {

    /* renamed from: w, reason: collision with root package name */
    public static final Object[] f25760w;

    /* renamed from: x, reason: collision with root package name */
    public static final JL f25761x;

    /* renamed from: u, reason: collision with root package name */
    public Object[] f25762u;

    /* renamed from: v, reason: collision with root package name */
    public int f25763v;

    static {
        Object[] objArr = new Object[0];
        f25760w = objArr;
        f25761x = new JL(objArr, 0, false);
    }

    public JL(Object[] objArr, int i, boolean z8) {
        super(z8);
        this.f25762u = objArr;
        this.f25763v = i;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3630nL
    public final /* bridge */ /* synthetic */ InterfaceC3630nL A(int i) {
        if (i >= this.f25763v) {
            return new JL(i == 0 ? f25760w : Arrays.copyOf(this.f25762u, i), this.f25763v, true);
        }
        throw new IllegalArgumentException();
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i, Object obj) {
        int i4;
        a();
        if (i < 0 || i > (i4 = this.f25763v)) {
            throw new IndexOutOfBoundsException(d(i));
        }
        int i9 = i + 1;
        Object[] objArr = this.f25762u;
        int length = objArr.length;
        if (i4 < length) {
            System.arraycopy(objArr, i, objArr, i9, i4 - i);
        } else {
            Object[] objArr2 = new Object[Math.max(((length * 3) / 2) + 1, 10)];
            System.arraycopy(this.f25762u, 0, objArr2, 0, i);
            System.arraycopy(this.f25762u, i, objArr2, i9, this.f25763v - i);
            this.f25762u = objArr2;
        }
        this.f25762u[i] = obj;
        this.f25763v++;
        ((AbstractList) this).modCount++;
    }

    public final void c(int i) {
        if (i < 0 || i >= this.f25763v) {
            throw new IndexOutOfBoundsException(d(i));
        }
    }

    public final String d(int i) {
        int i4 = this.f25763v;
        return D.y.n(new StringBuilder(String.valueOf(i).length() + 13 + String.valueOf(i4).length()), "Index:", i, ", Size:", i4);
    }

    @Override // com.google.android.gms.internal.ads.JK, java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof List)) {
            return false;
        }
        if (!(obj instanceof RandomAccess)) {
            return super.equals(obj);
        }
        List list = (List) obj;
        int i = this.f25763v;
        if (i != list.size()) {
            return false;
        }
        if (!(obj instanceof JL)) {
            for (int i4 = 0; i4 < i; i4++) {
                if (!this.f25762u[i4].equals(list.get(i4))) {
                    return false;
                }
            }
            return true;
        }
        JL jl = (JL) obj;
        for (int i9 = 0; i9 < i; i9++) {
            if (!this.f25762u[i9].equals(jl.f25762u[i9])) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i) {
        c(i);
        return this.f25762u[i];
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int i = this.f25763v;
        int i4 = 1;
        for (int i9 = 0; i9 < i; i9++) {
            i4 = (i4 * 31) + this.f25762u[i9].hashCode();
        }
        return i4;
    }

    @Override // com.google.android.gms.internal.ads.JK, java.util.AbstractList, java.util.List
    public final Object remove(int i) {
        a();
        c(i);
        Object[] objArr = this.f25762u;
        Object obj = objArr[i];
        if (i < this.f25763v - 1) {
            System.arraycopy(objArr, i + 1, objArr, i, (r2 - i) - 1);
        }
        this.f25763v--;
        ((AbstractList) this).modCount++;
        return obj;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i, Object obj) {
        a();
        c(i);
        Object[] objArr = this.f25762u;
        Object obj2 = objArr[i];
        objArr[i] = obj;
        ((AbstractList) this).modCount++;
        return obj2;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f25763v;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        a();
        int i = this.f25763v;
        int length = this.f25762u.length;
        if (i == length) {
            this.f25762u = Arrays.copyOf(this.f25762u, Math.max(((length * 3) / 2) + 1, 10));
        }
        Object[] objArr = this.f25762u;
        int i4 = this.f25763v;
        this.f25763v = i4 + 1;
        objArr[i4] = obj;
        ((AbstractList) this).modCount++;
        return true;
    }
}
