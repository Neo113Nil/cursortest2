package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.ValidationException;

/* loaded from: classes3.dex */
public class Fn implements to {

    /* renamed from: a, reason: collision with root package name */
    public final to f850a;

    public Fn(to toVar) {
        this.f850a = toVar;
    }

    @Override // io.appmetrica.analytics.impl.to
    public final ro a(Object obj) {
        ro a2 = this.f850a.a(obj);
        if (a2.f1473a) {
            return a2;
        }
        throw new ValidationException(a2.b);
    }

    public final to a() {
        return this.f850a;
    }
}
