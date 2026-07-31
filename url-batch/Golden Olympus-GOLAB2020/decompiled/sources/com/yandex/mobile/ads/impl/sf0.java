package com.yandex.mobile.ads.impl;

import android.content.Context;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public abstract class sf0 extends AbstractC1954gj<String> implements InterfaceC2332x2 {

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private final C1871d8 f31724d;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public sf0(@NotNull Context context, @NotNull C2360y7<String> adResponse) {
        this(context, adResponse, new C1871d8());
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(adResponse, "adResponse");
    }

    @Override // com.yandex.mobile.ads.impl.AbstractC1954gj
    public synchronized void b() {
        this.f31724d.a(null);
    }

    @NotNull
    public final C1871d8 i() {
        return this.f31724d;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sf0(@NotNull Context context, @NotNull C2360y7<String> adResponse, @NotNull C1871d8 adResultReceiver) {
        super(context, adResponse);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(adResponse, "adResponse");
        Intrinsics.checkNotNullParameter(adResultReceiver, "adResultReceiver");
        this.f31724d = adResultReceiver;
        adResultReceiver.a(this);
    }
}
