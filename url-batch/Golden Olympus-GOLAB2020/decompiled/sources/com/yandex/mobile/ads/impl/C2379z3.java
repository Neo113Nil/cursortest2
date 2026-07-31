package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.impl.C2356y3;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* renamed from: com.yandex.mobile.ads.impl.z3, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2379z3 {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final InterfaceC2333x3 f35448a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final C2356y3 f35449b;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C2379z3(InterfaceC2333x3 interfaceC2333x3) {
        this(interfaceC2333x3, C2356y3.a.a());
        int i4 = C2356y3.f34786e;
    }

    public final void a() {
        String a4 = this.f35448a.a();
        if (a4 == null || a4.length() == 0) {
            return;
        }
        this.f35449b.a(a4);
    }

    public final void b() {
        String a4 = this.f35448a.a();
        if (a4 == null || a4.length() == 0) {
            return;
        }
        this.f35449b.b(a4);
    }

    public C2379z3(@NotNull InterfaceC2333x3 adIdProvider, @NotNull C2356y3 adIdStorage) {
        Intrinsics.checkNotNullParameter(adIdProvider, "adIdProvider");
        Intrinsics.checkNotNullParameter(adIdStorage, "adIdStorage");
        this.f35448a = adIdProvider;
        this.f35449b = adIdStorage;
    }
}
