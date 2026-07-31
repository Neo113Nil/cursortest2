package com.yandex.mobile.ads.impl;

import java.util.Map;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
final class va0 extends kotlin.jvm.internal.s implements Function1<Map.Entry<? extends String, ? extends Object>, CharSequence> {

    /* renamed from: b, reason: collision with root package name */
    public static final va0 f33561b = new va0();

    va0() {
        super(1);
    }

    @NotNull
    public static String a(@NotNull Map.Entry it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return it.getKey() + "=" + it.getValue();
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return a((Map.Entry) obj);
    }
}
