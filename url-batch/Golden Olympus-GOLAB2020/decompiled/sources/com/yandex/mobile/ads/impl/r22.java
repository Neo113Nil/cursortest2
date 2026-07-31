package com.yandex.mobile.ads.impl;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class r22 implements InterfaceC1998ig<String> {
    @Override // com.yandex.mobile.ads.impl.InterfaceC1998ig
    public final boolean a(String str) {
        String value = str;
        Intrinsics.checkNotNullParameter(value, "value");
        return value.length() > 0 && !Intrinsics.areEqual("null", value);
    }
}
