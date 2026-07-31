package com.yandex.mobile.ads.impl;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
final class jb1 extends kotlin.jvm.internal.s implements Function1<ob2<ya1>, String> {

    /* renamed from: b, reason: collision with root package name */
    public static final jb1 f27622b = new jb1();

    jb1() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        ob2 it = (ob2) obj;
        Intrinsics.checkNotNullParameter(it, "it");
        return ((ya1) it.d()).getUrl();
    }
}
