package com.yandex.mobile.ads.impl;

import java.util.Comparator;

/* loaded from: classes3.dex */
public abstract class bf1<T> implements Comparator<T> {
    protected bf1() {
    }

    public static <T> bf1<T> a(Comparator<T> comparator) {
        return comparator instanceof bf1 ? (bf1) comparator : new kq(comparator);
    }

    public <S extends T> bf1<S> b() {
        return new jr1(this);
    }

    public static <C extends Comparable> bf1<C> a() {
        return ec1.f25235b;
    }
}
