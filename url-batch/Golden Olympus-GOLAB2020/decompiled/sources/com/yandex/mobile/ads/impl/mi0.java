package com.yandex.mobile.ads.impl;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class mi0 implements InterfaceC1998ig<ej0> {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final r22 f29116a;

    public /* synthetic */ mi0() {
        this(new r22());
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC1998ig
    public final boolean a(@NotNull ej0 value) {
        Intrinsics.checkNotNullParameter(value, "value");
        String value2 = value.f();
        if (value2 == null) {
            return false;
        }
        this.f29116a.getClass();
        Intrinsics.checkNotNullParameter(value2, "value");
        return value2.length() > 0 && !Intrinsics.areEqual("null", value2);
    }

    public mi0(@NotNull r22 stringAssetValueValidator) {
        Intrinsics.checkNotNullParameter(stringAssetValueValidator, "stringAssetValueValidator");
        this.f29116a = stringAssetValueValidator;
    }
}
