package io.appmetrica.analytics.impl;

import android.content.Context;
import java.util.Map;
import org.jetbrains.annotations.NotNull;

/* renamed from: io.appmetrica.analytics.impl.en, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2607en implements InterfaceC2947s {

    /* renamed from: b, reason: collision with root package name */
    public final C2999u f38938b;

    /* renamed from: a, reason: collision with root package name */
    public final C2973t f38937a = new C2973t();

    /* renamed from: c, reason: collision with root package name */
    public final W1.h f38939c = W1.i.b(new C2581dn(this));

    public C2607en(@NotNull Context context) {
        this.f38938b = new C2999u(context);
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC2947s
    @NotNull
    public final Map<String, String> a(@NotNull Map<String, String> map) {
        map.putAll((Map) this.f38939c.getValue());
        return map;
    }
}
