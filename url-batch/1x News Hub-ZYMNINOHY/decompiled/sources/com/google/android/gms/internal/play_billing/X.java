package com.google.android.gms.internal.play_billing;

import java.util.Iterator;

/* loaded from: classes.dex */
public final class X extends H {

    /* renamed from: h, reason: collision with root package name */
    public static final Object[] f2809h;

    /* renamed from: i, reason: collision with root package name */
    public static final X f2810i;

    /* renamed from: c, reason: collision with root package name */
    public final transient Object[] f2811c;

    /* renamed from: d, reason: collision with root package name */
    public final transient int f2812d;

    /* renamed from: e, reason: collision with root package name */
    public final transient Object[] f2813e;
    public final transient int f;

    /* renamed from: g, reason: collision with root package name */
    public final transient int f2814g;

    static {
        Object[] objArr = new Object[0];
        f2809h = objArr;
        f2810i = new X(0, 0, 0, objArr, objArr);
    }

    public X(int i3, int i4, int i5, Object[] objArr, Object[] objArr2) {
        this.f2811c = objArr;
        this.f2812d = i3;
        this.f2813e = objArr2;
        this.f = i4;
        this.f2814g = i5;
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC0273x
    public final int b(Object[] objArr) {
        Object[] objArr2 = this.f2811c;
        int i3 = this.f2814g;
        System.arraycopy(objArr2, 0, objArr, 0, i3);
        return i3;
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC0273x
    public final int c() {
        return this.f2814g;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        if (obj != null) {
            Object[] objArr = this.f2813e;
            if (objArr.length != 0) {
                int b3 = AbstractC0216d1.b(obj.hashCode());
                while (true) {
                    int i3 = b3 & this.f;
                    Object obj2 = objArr[i3];
                    if (obj2 == null) {
                        return false;
                    }
                    if (obj2.equals(obj)) {
                        return true;
                    }
                    b3 = i3 + 1;
                }
            }
        }
        return false;
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC0273x
    public final int d() {
        return 0;
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC0273x
    public final Object[] g() {
        return this.f2811c;
    }

    @Override // com.google.android.gms.internal.play_billing.H, java.util.Collection, java.util.Set
    public final int hashCode() {
        return this.f2812d;
    }

    @Override // com.google.android.gms.internal.play_billing.H
    public final C i() {
        return C.j(this.f2814g, this.f2811c);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final /* synthetic */ Iterator iterator() {
        return e().listIterator(0);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.f2814g;
    }
}
