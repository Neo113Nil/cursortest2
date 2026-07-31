package com.startapp.sdk.internal;

import java.lang.reflect.Array;
import java.util.Iterator;

/* compiled from: Sta */
/* loaded from: classes3.dex */
public final class s2 implements Iterator {

    /* renamed from: a, reason: collision with root package name */
    public final Object f413a;
    public final int b;
    public int c;

    public s2(int i, Object obj) {
        this.f413a = obj;
        this.b = i;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.c < this.b;
    }

    @Override // java.util.Iterator
    public final Object next() {
        Object obj = this.f413a;
        int i = this.c;
        this.c = i + 1;
        return Array.get(obj, i);
    }
}
