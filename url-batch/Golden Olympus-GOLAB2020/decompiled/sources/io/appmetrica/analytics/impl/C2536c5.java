package io.appmetrica.analytics.impl;

import com.ironsource.b9;
import java.util.Arrays;
import org.jetbrains.annotations.NotNull;

/* renamed from: io.appmetrica.analytics.impl.c5, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2536c5 implements InterfaceC2955s7 {

    /* renamed from: a, reason: collision with root package name */
    public final String f38765a;

    /* renamed from: b, reason: collision with root package name */
    public final String f38766b;

    public C2536c5(@NotNull C2772l5 c2772l5) {
        this.f38765a = String.format("component_%s.db", Arrays.copyOf(new Object[]{c2772l5.d() ? b9.h.f15466Z : c2772l5.b()}, 1));
        this.f38766b = "db_metrica_" + c2772l5;
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC2955s7
    @NotNull
    public final String a() {
        return this.f38766b;
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC2955s7
    @NotNull
    public final String b() {
        return this.f38765a;
    }
}
