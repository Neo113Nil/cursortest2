package com.google.android.gms.internal.play_billing;

import java.util.AbstractMap;
import java.util.Objects;

/* renamed from: com.google.android.gms.internal.play_billing.y, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0356y extends AbstractC0346t {

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ C0358z f6033c;

    public C0356y(C0358z c0358z) {
        this.f6033c = c0358z;
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC0341q
    public final boolean f() {
        return true;
    }

    @Override // java.util.List
    public final /* bridge */ /* synthetic */ Object get(int i4) {
        C0358z c0358z = this.f6033c;
        U.i.G(i4, c0358z.f6036e);
        Object[] objArr = c0358z.f6035d;
        int i5 = i4 + i4;
        Object obj = objArr[i5];
        Objects.requireNonNull(obj);
        Object obj2 = objArr[i5 + 1];
        Objects.requireNonNull(obj2);
        return new AbstractMap.SimpleImmutableEntry(obj, obj2);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f6033c.f6036e;
    }
}
