package com.google.android.gms.internal.consent_sdk;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* renamed from: com.google.android.gms.internal.consent_sdk.f2, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4332f2 implements Iterator {

    /* renamed from: n, reason: collision with root package name */
    public int f35835n = 0;

    /* renamed from: u, reason: collision with root package name */
    public final int f35836u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ C4340h2 f35837v;

    public C4332f2(C4340h2 c4340h2) {
        this.f35837v = c4340h2;
        this.f35836u = c4340h2.d();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f35835n < this.f35836u;
    }

    @Override // java.util.Iterator
    public final Object next() {
        int i = this.f35835n;
        if (i >= this.f35836u) {
            throw new NoSuchElementException();
        }
        this.f35835n = i + 1;
        return Byte.valueOf(this.f35837v.c(i));
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
