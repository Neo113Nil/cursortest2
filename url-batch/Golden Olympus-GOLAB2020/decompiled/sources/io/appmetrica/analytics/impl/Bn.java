package io.appmetrica.analytics.impl;

import androidx.annotation.NonNull;
import io.appmetrica.analytics.ValidationException;

/* loaded from: classes3.dex */
public class Bn implements InterfaceC2895po {

    /* renamed from: a, reason: collision with root package name */
    public final InterfaceC2895po f37261a;

    public Bn(@NonNull InterfaceC2895po interfaceC2895po) {
        this.f37261a = interfaceC2895po;
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC2895po
    public final C2843no a(Object obj) {
        C2843no a4 = this.f37261a.a(obj);
        if (a4.f39527a) {
            return a4;
        }
        throw new ValidationException(a4.f39528b);
    }

    @NonNull
    public final InterfaceC2895po a() {
        return this.f37261a;
    }
}
