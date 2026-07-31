package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.impl.InterfaceC1861cm;

/* loaded from: classes3.dex */
public final class qq1<T> {

    /* renamed from: a, reason: collision with root package name */
    public final T f30869a;

    /* renamed from: b, reason: collision with root package name */
    public final InterfaceC1861cm.a f30870b;

    /* renamed from: c, reason: collision with root package name */
    public final hi2 f30871c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f30872d;

    public interface a {
        void a(hi2 hi2Var);
    }

    public interface b<T> {
        void a(T t4);
    }

    private qq1(hi2 hi2Var) {
        this.f30872d = false;
        this.f30869a = null;
        this.f30870b = null;
        this.f30871c = hi2Var;
    }

    public static <T> qq1<T> a(T t4, InterfaceC1861cm.a aVar) {
        return new qq1<>(t4, aVar);
    }

    public static <T> qq1<T> a(hi2 hi2Var) {
        return new qq1<>(hi2Var);
    }

    private qq1(T t4, InterfaceC1861cm.a aVar) {
        this.f30872d = false;
        this.f30869a = t4;
        this.f30870b = aVar;
        this.f30871c = null;
    }
}
