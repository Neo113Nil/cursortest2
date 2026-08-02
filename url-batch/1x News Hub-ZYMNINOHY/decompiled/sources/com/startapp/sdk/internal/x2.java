package com.startapp.sdk.internal;

import java.lang.reflect.Array;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class x2 implements Iterator {

    /* renamed from: a, reason: collision with root package name */
    public final Object f4709a;

    /* renamed from: b, reason: collision with root package name */
    public final int f4710b;

    /* renamed from: c, reason: collision with root package name */
    public int f4711c;

    public x2(int i3, Object obj) {
        this.f4709a = obj;
        this.f4710b = i3;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f4711c < this.f4710b;
    }

    @Override // java.util.Iterator
    public final Object next() {
        Object obj = this.f4709a;
        int i3 = this.f4711c;
        this.f4711c = i3 + 1;
        return Array.get(obj, i3);
    }
}
