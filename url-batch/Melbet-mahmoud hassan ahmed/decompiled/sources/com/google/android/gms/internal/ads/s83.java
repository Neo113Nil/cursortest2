package com.google.android.gms.internal.ads;

import java.util.Comparator;

/* loaded from: classes.dex */
public abstract class s83<T> implements Comparator<T> {
    protected s83() {
    }

    public static <T> s83<T> b(Comparator<T> comparator) {
        return comparator instanceof s83 ? (s83) comparator : new p63(comparator);
    }

    public static <C extends Comparable> s83<C> c() {
        return q83.f10616f;
    }

    public <S extends T> s83<S> a() {
        return new b93(this);
    }

    @Override // java.util.Comparator
    public abstract int compare(T t6, T t7);
}
