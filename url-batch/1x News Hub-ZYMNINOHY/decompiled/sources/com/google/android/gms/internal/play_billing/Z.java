package com.google.android.gms.internal.play_billing;

import E1.AbstractC0033i;
import java.util.Iterator;
import w0.AbstractC1234c;

/* loaded from: classes.dex */
public final class Z extends H {

    /* renamed from: c, reason: collision with root package name */
    public final transient Object f2825c;

    public Z(Object obj) {
        this.f2825c = obj;
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC0273x
    public final int b(Object[] objArr) {
        objArr[0] = this.f2825c;
        return 1;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        return this.f2825c.equals(obj);
    }

    @Override // com.google.android.gms.internal.play_billing.H, com.google.android.gms.internal.play_billing.AbstractC0273x
    public final C e() {
        Object[] objArr = {this.f2825c};
        for (int i3 = 0; i3 < 1; i3++) {
            C0279z c0279z = C.f2714b;
            if (objArr[i3] == null) {
                throw new NullPointerException(AbstractC0033i.h(i3, "at index "));
            }
        }
        return C.j(1, objArr);
    }

    @Override // com.google.android.gms.internal.play_billing.H, java.util.Collection, java.util.Set
    public final int hashCode() {
        return this.f2825c.hashCode();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final /* synthetic */ Iterator iterator() {
        return new K(this.f2825c);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return 1;
    }

    @Override // java.util.AbstractCollection
    public final String toString() {
        return AbstractC1234c.a("[", this.f2825c.toString(), "]");
    }
}
