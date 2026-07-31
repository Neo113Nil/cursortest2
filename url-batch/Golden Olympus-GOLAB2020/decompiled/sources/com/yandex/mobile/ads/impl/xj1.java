package com.yandex.mobile.ads.impl;

import android.content.Context;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class xj1 implements j82 {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final np1 f34596a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final u32 f34597b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final h82 f34598c;

    /* renamed from: d, reason: collision with root package name */
    private String f34599d;

    public xj1(@NotNull Context context, @NotNull np1 reporter, @NotNull u32 targetUrlHandler, @NotNull h82 urlModifier) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(reporter, "reporter");
        Intrinsics.checkNotNullParameter(targetUrlHandler, "targetUrlHandler");
        Intrinsics.checkNotNullParameter(urlModifier, "urlModifier");
        this.f34596a = reporter;
        this.f34597b = targetUrlHandler;
        this.f34598c = urlModifier;
    }

    @Override // com.yandex.mobile.ads.impl.j82
    public final void a(@NotNull String url) {
        Intrinsics.checkNotNullParameter(url, "url");
        String a4 = this.f34598c.a(url);
        if (url.length() != 0) {
            url = a4;
        }
        this.f34599d = url;
        String str = null;
        if (url == null) {
            Intrinsics.throwUninitializedPropertyAccessException("targetUrl");
            url = null;
        }
        if (url.length() == 0) {
            ap0.b(new Object[0]);
            return;
        }
        u32 u32Var = this.f34597b;
        np1 np1Var = this.f34596a;
        String str2 = this.f34599d;
        if (str2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("targetUrl");
        } else {
            str = str2;
        }
        u32Var.a(np1Var, str);
    }
}
