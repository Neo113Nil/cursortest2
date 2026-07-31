package com.yandex.mobile.ads.impl;

import android.content.Context;
import android.net.Uri;
import com.yandex.mobile.ads.impl.ew1;
import java.util.Locale;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class h82 {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final ew1 f26668a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final Context f26669b;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ h82(Context context) {
        this(context, ew1.a.a());
        int i4 = ew1.f25476l;
    }

    @NotNull
    public final String a(@NotNull String url) {
        Intrinsics.checkNotNullParameter(url, "url");
        du1 a4 = this.f26668a.a(this.f26669b);
        if (a4 != null && !a4.S()) {
            return url;
        }
        String lowerCase = url.toLowerCase(Locale.ROOT);
        Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
        if (!StringsKt.K(lowerCase, "http://", false, 2, null) && !StringsKt.K(lowerCase, "https://", false, 2, null)) {
            ap0.f(new Object[0]);
            return url;
        }
        try {
            Uri parse = Uri.parse(url);
            String uri = parse.buildUpon().appendQueryParameter("ctime", String.valueOf(v42.a())).build().toString();
            Intrinsics.checkNotNull(uri);
            return uri;
        } catch (Exception unused) {
            ap0.f(new Object[0]);
            return url;
        }
    }

    public h82(@NotNull Context context, @NotNull ew1 sdkSettings) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(sdkSettings, "sdkSettings");
        this.f26668a = sdkSettings;
        Context applicationContext = context.getApplicationContext();
        Intrinsics.checkNotNullExpressionValue(applicationContext, "getApplicationContext(...)");
        this.f26669b = applicationContext;
    }
}
