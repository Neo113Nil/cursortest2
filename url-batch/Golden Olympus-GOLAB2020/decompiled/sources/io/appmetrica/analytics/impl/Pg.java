package io.appmetrica.analytics.impl;

import android.content.Context;
import androidx.annotation.NonNull;

/* loaded from: classes3.dex */
public final class Pg implements InterfaceC2672h8 {

    /* renamed from: a, reason: collision with root package name */
    public final InterfaceC2979t5 f38134a;

    public Pg(@NonNull InterfaceC2979t5 interfaceC2979t5) {
        this.f38134a = interfaceC2979t5;
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC2672h8
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final Og a(@NonNull Context context, @NonNull C2772l5 c2772l5, @NonNull K4 k4) {
        return new Og(context, c2772l5, k4, this.f38134a, new C2798m5(), Hl.a());
    }

    @NonNull
    public final InterfaceC2979t5 a() {
        return this.f38134a;
    }
}
