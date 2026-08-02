package com.google.android.gms.internal.play_billing;

import java.util.Iterator;

/* loaded from: classes.dex */
public final class A extends AbstractC0350v {

    /* renamed from: c, reason: collision with root package name */
    public final transient C f5798c;

    /* renamed from: d, reason: collision with root package name */
    public final transient B f5799d;

    public A(C c4, B b4) {
        this.f5798c = c4;
        this.f5799d = b4;
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC0341q
    public final int b(Object[] objArr) {
        return this.f5799d.b(objArr);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        return this.f5798c.get(obj) != null;
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC0350v, com.google.android.gms.internal.play_billing.AbstractC0341q
    public final AbstractC0346t e() {
        return this.f5799d;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final /* synthetic */ Iterator iterator() {
        return this.f5799d.listIterator(0);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.f5798c.f5811f;
    }
}
