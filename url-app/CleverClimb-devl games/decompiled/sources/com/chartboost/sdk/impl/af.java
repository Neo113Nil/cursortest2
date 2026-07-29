package com.chartboost.sdk.impl;

import com.chartboost.sdk.Model.CBError;

/* loaded from: classes.dex */
public class af<T> {

    /* renamed from: a, reason: collision with root package name */
    public final T f3705a;

    /* renamed from: b, reason: collision with root package name */
    public final CBError f3706b;

    public static <T> af<T> a(T t) {
        return new af<>(t, null);
    }

    public static <T> af<T> a(CBError cBError) {
        return new af<>(null, cBError);
    }

    private af(T t, CBError cBError) {
        this.f3705a = t;
        this.f3706b = cBError;
    }
}
