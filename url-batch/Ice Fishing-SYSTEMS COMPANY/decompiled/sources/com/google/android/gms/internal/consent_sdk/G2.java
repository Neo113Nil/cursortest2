package com.google.android.gms.internal.consent_sdk;

import java.util.AbstractList;
import java.util.Arrays;
import java.util.RandomAccess;
import t0.AbstractC5051n;

/* loaded from: classes2.dex */
public final class G2 extends AbstractC4324d2 implements RandomAccess {

    /* renamed from: w, reason: collision with root package name */
    public static final Object[] f35681w;

    /* renamed from: x, reason: collision with root package name */
    public static final G2 f35682x;

    /* renamed from: u, reason: collision with root package name */
    public Object[] f35683u;

    /* renamed from: v, reason: collision with root package name */
    public int f35684v;

    static {
        Object[] objArr = new Object[0];
        f35681w = objArr;
        f35682x = new G2(objArr, 0, false);
    }

    public G2(Object[] objArr, int i, boolean z8) {
        super(z8);
        this.f35683u = objArr;
        this.f35684v = i;
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i, Object obj) {
        int i4;
        a();
        if (i < 0 || i > (i4 = this.f35684v)) {
            throw new IndexOutOfBoundsException(AbstractC5051n.c(i, this.f35684v, "Index:", ", Size:"));
        }
        int i9 = i + 1;
        Object[] objArr = this.f35683u;
        int length = objArr.length;
        if (i4 < length) {
            System.arraycopy(objArr, i, objArr, i9, i4 - i);
        } else {
            Object[] objArr2 = new Object[Math.max(((length * 3) / 2) + 1, 10)];
            System.arraycopy(this.f35683u, 0, objArr2, 0, i);
            System.arraycopy(this.f35683u, i, objArr2, i9, this.f35684v - i);
            this.f35683u = objArr2;
        }
        this.f35683u[i] = obj;
        this.f35684v++;
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.android.gms.internal.consent_sdk.InterfaceC4379r2
    public final /* bridge */ /* synthetic */ InterfaceC4379r2 b(int i) {
        if (i >= this.f35684v) {
            return new G2(i == 0 ? f35681w : Arrays.copyOf(this.f35683u, i), this.f35684v, true);
        }
        throw new IllegalArgumentException();
    }

    public final void c(int i) {
        if (i < 0 || i >= this.f35684v) {
            throw new IndexOutOfBoundsException(AbstractC5051n.c(i, this.f35684v, "Index:", ", Size:"));
        }
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i) {
        c(i);
        return this.f35683u[i];
    }

    @Override // com.google.android.gms.internal.consent_sdk.AbstractC4324d2, java.util.AbstractList, java.util.List
    public final Object remove(int i) {
        a();
        c(i);
        Object[] objArr = this.f35683u;
        Object obj = objArr[i];
        if (i < this.f35684v - 1) {
            System.arraycopy(objArr, i + 1, objArr, i, (r2 - i) - 1);
        }
        this.f35684v--;
        ((AbstractList) this).modCount++;
        return obj;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i, Object obj) {
        a();
        c(i);
        Object[] objArr = this.f35683u;
        Object obj2 = objArr[i];
        objArr[i] = obj;
        ((AbstractList) this).modCount++;
        return obj2;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f35684v;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        a();
        int i = this.f35684v;
        int length = this.f35683u.length;
        if (i == length) {
            this.f35683u = Arrays.copyOf(this.f35683u, Math.max(((length * 3) / 2) + 1, 10));
        }
        Object[] objArr = this.f35683u;
        int i4 = this.f35684v;
        this.f35684v = i4 + 1;
        objArr[i4] = obj;
        ((AbstractList) this).modCount++;
        return true;
    }
}
