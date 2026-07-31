package com.yandex.mobile.ads.impl;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
final class t81 extends kotlin.jvm.internal.s implements Function1<zi0, yi0> {

    /* renamed from: b, reason: collision with root package name */
    public static final t81 f32242b = new t81();

    t81() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        zi0 it = (zi0) obj;
        Intrinsics.checkNotNullParameter(it, "it");
        return new yi0(it, new xi0());
    }
}
