package com.yandex.mobile.ads.impl;

import java.util.Map;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class xx {

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private static final String f34705b = "https://yandex.ru/ads";

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final d50 f34706a;

    static final class a extends kotlin.jvm.internal.s implements Function1<bn1, CharSequence> {

        /* renamed from: b, reason: collision with root package name */
        public static final a f34707b = new a();

        a() {
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

    public xx(@NotNull d50 environmentConfiguration) {
        Intrinsics.checkNotNullParameter(environmentConfiguration, "environmentConfiguration");
        this.f34706a = environmentConfiguration;
    }

    @NotNull
    public final Map<String, String> a() {
        return this.f34706a.d();
    }

    @NotNull
    public final String b() {
        StringBuilder sb = new StringBuilder();
        String a4 = this.f34706a.a();
        if (a4 == null) {
            a4 = f34705b;
        }
        sb.append(a4);
        Character e12 = StringsKt.e1(sb);
        if (e12 == null || e12.charValue() != '/') {
            sb.append('/');
        }
        sb.append("v1/debugpanel");
        if (!this.f34706a.f().isEmpty()) {
            sb.append(CollectionsKt.joinToString$default(this.f34706a.f(), "&", "?", null, 0, null, a.f34707b, 28, null));
        }
        String sb2 = sb.toString();
        Intrinsics.checkNotNullExpressionValue(sb2, "toString(...)");
        return sb2;
    }
}
