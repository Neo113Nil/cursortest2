package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.ValidationException;

/* loaded from: classes.dex */
public class En implements InterfaceC0960so {

    /* renamed from: a, reason: collision with root package name */
    public final InterfaceC0960so f10263a;

    public En(InterfaceC0960so interfaceC0960so) {
        this.f10263a = interfaceC0960so;
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC0960so
    public final C0909qo a(Object obj) {
        C0909qo a3 = this.f10263a.a(obj);
        if (a3.f12630a) {
            return a3;
        }
        throw new ValidationException(a3.f12631b);
    }

    public final InterfaceC0960so a() {
        return this.f10263a;
    }
}
