package com.google.android.gms.internal.play_billing;

import java.util.Iterator;
import java.util.Map;

/* loaded from: classes.dex */
public final class U extends H {

    /* renamed from: c, reason: collision with root package name */
    public final transient X f5105c;

    /* renamed from: d, reason: collision with root package name */
    public final transient Object[] f5106d;

    /* renamed from: e, reason: collision with root package name */
    public final transient int f5107e;

    public U(X x5, Object[] objArr, int i2) {
        this.f5105c = x5;
        this.f5106d = objArr;
        this.f5107e = i2;
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC0382x
    public final int b(Object[] objArr) {
        return e().b(objArr);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        if (obj instanceof Map.Entry) {
            Map.Entry entry = (Map.Entry) obj;
            Object key = entry.getKey();
            Object value = entry.getValue();
            if (value != null && value.equals(this.f5105c.get(key))) {
                return true;
            }
        }
        return false;
    }

    @Override // com.google.android.gms.internal.play_billing.H
    public final C i() {
        return new T(this);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final /* synthetic */ Iterator iterator() {
        return e().listIterator(0);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.f5107e;
    }
}
