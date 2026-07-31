package com.yandex.mobile.ads.impl;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
final class up0 implements Iterator<Object> {

    /* renamed from: b, reason: collision with root package name */
    public static final up0 f33226b;

    /* renamed from: c, reason: collision with root package name */
    private static final /* synthetic */ up0[] f33227c;

    static {
        up0 up0Var = new up0();
        f33226b = up0Var;
        f33227c = new up0[]{up0Var};
    }

    private up0() {
    }

    public static up0 valueOf(String str) {
        return (up0) Enum.valueOf(up0.class, str);
    }

    public static up0[] values() {
        return (up0[]) f33227c.clone();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return false;
    }

    @Override // java.util.Iterator
    public final Object next() {
        throw new NoSuchElementException();
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new IllegalStateException("no calls to next() since the last call to remove()");
    }
}
