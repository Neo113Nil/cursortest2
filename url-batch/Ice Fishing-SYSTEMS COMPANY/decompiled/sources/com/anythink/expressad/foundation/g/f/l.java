package com.anythink.expressad.foundation.g.f;

/* loaded from: classes.dex */
public final class l<T> {

    /* renamed from: a, reason: collision with root package name */
    public T f19556a;

    /* renamed from: b, reason: collision with root package name */
    public com.anythink.expressad.foundation.g.f.a.a f19557b;

    /* renamed from: c, reason: collision with root package name */
    public com.anythink.expressad.foundation.g.f.f.c f19558c;

    private l(T t9, com.anythink.expressad.foundation.g.f.f.c cVar) {
        this.f19557b = null;
        this.f19556a = t9;
        this.f19558c = cVar;
    }

    private boolean a() {
        return this.f19557b == null;
    }

    public static <T> l<T> a(T t9, com.anythink.expressad.foundation.g.f.f.c cVar) {
        return new l<>(t9, cVar);
    }

    public static <T> l<T> a(com.anythink.expressad.foundation.g.f.a.a aVar) {
        return new l<>(aVar);
    }

    private l(com.anythink.expressad.foundation.g.f.a.a aVar) {
        this.f19556a = null;
        this.f19558c = null;
        this.f19557b = aVar;
    }
}
