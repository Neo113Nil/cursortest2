package io.appmetrica.analytics.impl;

import androidx.annotation.NonNull;

/* renamed from: io.appmetrica.analytics.impl.qe, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2911qe implements InterfaceC2895po {

    /* renamed from: a, reason: collision with root package name */
    public final String f39658a;

    public C2911qe(@NonNull String str) {
        this.f39658a = str;
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC2895po
    public final C2843no a(Object obj) {
        if (obj != null) {
            return new C2843no(this, true, "");
        }
        return new C2843no(this, false, this.f39658a + " is null.");
    }

    @NonNull
    public final String a() {
        return this.f39658a;
    }
}
