package com.google.android.gms.internal.play_billing;

import java.util.Iterator;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.play_billing.z, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0358z extends AbstractC0350v {

    /* renamed from: c, reason: collision with root package name */
    public final transient C f6034c;

    /* renamed from: d, reason: collision with root package name */
    public final transient Object[] f6035d;

    /* renamed from: e, reason: collision with root package name */
    public final transient int f6036e;

    public C0358z(C c4, Object[] objArr, int i4) {
        this.f6034c = c4;
        this.f6035d = objArr;
        this.f6036e = i4;
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC0341q
    public final int b(Object[] objArr) {
        return e().b(objArr);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        if (obj instanceof Map.Entry) {
            Map.Entry entry = (Map.Entry) obj;
            Object key = entry.getKey();
            Object value = entry.getValue();
            if (value != null && value.equals(this.f6034c.get(key))) {
                return true;
            }
        }
        return false;
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC0350v
    public final AbstractC0346t h() {
        return new C0356y(this);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final /* synthetic */ Iterator iterator() {
        return e().listIterator(0);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.f6036e;
    }
}
