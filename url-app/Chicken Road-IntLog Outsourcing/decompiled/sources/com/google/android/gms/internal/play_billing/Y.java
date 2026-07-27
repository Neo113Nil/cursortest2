package com.google.android.gms.internal.play_billing;

import java.util.Iterator;

/* loaded from: classes.dex */
public final class Y extends H {

    /* renamed from: h, reason: collision with root package name */
    public static final Object[] f5135h;

    /* renamed from: i, reason: collision with root package name */
    public static final Y f5136i;

    /* renamed from: c, reason: collision with root package name */
    public final transient Object[] f5137c;

    /* renamed from: d, reason: collision with root package name */
    public final transient int f5138d;

    /* renamed from: e, reason: collision with root package name */
    public final transient Object[] f5139e;

    /* renamed from: f, reason: collision with root package name */
    public final transient int f5140f;

    /* renamed from: g, reason: collision with root package name */
    public final transient int f5141g;

    static {
        Object[] objArr = new Object[0];
        f5135h = objArr;
        f5136i = new Y(0, 0, 0, objArr, objArr);
    }

    public Y(int i2, int i3, int i6, Object[] objArr, Object[] objArr2) {
        this.f5137c = objArr;
        this.f5138d = i2;
        this.f5139e = objArr2;
        this.f5140f = i3;
        this.f5141g = i6;
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC0382x
    public final int b(Object[] objArr) {
        Object[] objArr2 = this.f5137c;
        int i2 = this.f5141g;
        System.arraycopy(objArr2, 0, objArr, 0, i2);
        return i2;
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC0382x
    public final int c() {
        return this.f5141g;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        if (obj != null) {
            Object[] objArr = this.f5139e;
            if (objArr.length != 0) {
                int c2 = AbstractC0325d1.c(obj.hashCode());
                while (true) {
                    int i2 = c2 & this.f5140f;
                    Object obj2 = objArr[i2];
                    if (obj2 == null) {
                        return false;
                    }
                    if (obj2.equals(obj)) {
                        return true;
                    }
                    c2 = i2 + 1;
                }
            }
        }
        return false;
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC0382x
    public final int d() {
        return 0;
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC0382x
    public final Object[] g() {
        return this.f5137c;
    }

    @Override // com.google.android.gms.internal.play_billing.H, java.util.Collection, java.util.Set
    public final int hashCode() {
        return this.f5138d;
    }

    @Override // com.google.android.gms.internal.play_billing.H
    public final C i() {
        return C.j(this.f5141g, this.f5137c);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final /* synthetic */ Iterator iterator() {
        return e().listIterator(0);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.f5141g;
    }
}
