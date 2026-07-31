package com.yandex.mobile.ads.impl;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
final class ku1 extends kotlin.jvm.internal.s implements Function1<bn1, CharSequence> {

    /* renamed from: b, reason: collision with root package name */
    public static final ku1 f28329b = new ku1();

    ku1() {
        super(1);
    }

    @NotNull
    public static String a(@NotNull bn1 it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return it.getKey() + "=" + it.getValue();
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return a((bn1) obj);
    }
}
