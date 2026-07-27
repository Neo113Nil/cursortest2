package com.google.android.gms.internal.play_billing;

import b2.AbstractC0279e;
import java.util.Iterator;

/* renamed from: com.google.android.gms.internal.play_billing.a0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0315a0 extends H {

    /* renamed from: c, reason: collision with root package name */
    public final transient Object f5154c;

    public C0315a0(Object obj) {
        this.f5154c = obj;
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC0382x
    public final int b(Object[] objArr) {
        objArr[0] = this.f5154c;
        return 1;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        return this.f5154c.equals(obj);
    }

    @Override // com.google.android.gms.internal.play_billing.H, com.google.android.gms.internal.play_billing.AbstractC0382x
    public final C e() {
        Object[] objArr = {this.f5154c};
        for (int i2 = 0; i2 < 1; i2++) {
            C0388z c0388z = C.f5030b;
            if (objArr[i2] == null) {
                throw new NullPointerException(AbstractC0279e.d(i2, "at index "));
            }
        }
        return C.j(1, objArr);
    }

    @Override // com.google.android.gms.internal.play_billing.H, java.util.Collection, java.util.Set
    public final int hashCode() {
        return this.f5154c.hashCode();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final /* synthetic */ Iterator iterator() {
        return new K(this.f5154c);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return 1;
    }

    @Override // java.util.AbstractCollection
    public final String toString() {
        return AbstractC0279e.f("[", this.f5154c.toString(), "]");
    }
}
