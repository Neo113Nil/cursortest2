package com.startapp.sdk.internal;

import java.lang.reflect.Array;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class x2 implements Iterator {

    /* renamed from: a, reason: collision with root package name */
    public final Object f7855a;

    /* renamed from: b, reason: collision with root package name */
    public final int f7856b;

    /* renamed from: c, reason: collision with root package name */
    public int f7857c;

    public x2(int i4, Object obj) {
        this.f7855a = obj;
        this.f7856b = i4;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f7857c < this.f7856b;
    }

    @Override // java.util.Iterator
    public final Object next() {
        Object obj = this.f7855a;
        int i4 = this.f7857c;
        this.f7857c = i4 + 1;
        return Array.get(obj, i4);
    }
}
