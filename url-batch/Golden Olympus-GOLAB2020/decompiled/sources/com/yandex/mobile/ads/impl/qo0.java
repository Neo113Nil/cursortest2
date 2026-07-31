package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.impl.v01;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class qo0 {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final String f30860a = "Yandex Mobile Adsintegrated incorrectly";

    static final class a extends kotlin.jvm.internal.s implements Function1<jo0, CharSequence> {

        /* renamed from: b, reason: collision with root package name */
        public static final a f30861b = new a();

        a() {
            super(1);
        }

        @NotNull
        public static String a(@NotNull jo0 cause) {
            Intrinsics.checkNotNullParameter(cause, "cause");
            return "\t·\t" + cause.getMessage();
        }

        @Override // kotlin.jvm.functions.Function1
        public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
            return a((jo0) obj);
        }
    }

    @NotNull
    public final String a(@NotNull v01.a.b result) {
        Intrinsics.checkNotNullParameter(result, "result");
        return CollectionsKt.joinToString$default(result.a(), "\n", this.f30860a + "\n", null, 0, null, a.f30861b, 28, null);
    }
}
