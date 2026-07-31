package com.yandex.mobile.ads.impl;

import android.content.Context;
import com.yandex.mobile.ads.impl.ua0;
import java.util.ArrayList;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class lu1 {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final z40 f28783a = new z40();

    @NotNull
    public final String a(@NotNull Context context, @NotNull zw1 sensitiveModeChecker, @NotNull C1803ac advertisingConfiguration, @NotNull d50 environmentConfiguration) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(environmentConfiguration, "environmentConfiguration");
        Intrinsics.checkNotNullParameter(advertisingConfiguration, "advertisingConfiguration");
        Intrinsics.checkNotNullParameter(sensitiveModeChecker, "sensitiveModeChecker");
        String[] strArr = {new ua0(new ua0.a(sensitiveModeChecker.b(context)).i(environmentConfiguration.g()).d(environmentConfiguration.e()).a(advertisingConfiguration.a(), advertisingConfiguration.b()).a(advertisingConfiguration.c()).N0().l(context).k(context).M0().a(zw1.a(context)).a(context, environmentConfiguration.b()).b(context).S0().T0().P0(), 0).toString(), CollectionsKt.joinToString$default(environmentConfiguration.f(), "&", null, null, 0, null, ku1.f28329b, 30, null)};
        ArrayList arrayList = new ArrayList();
        for (int i4 = 0; i4 < 2; i4++) {
            String str = strArr[i4];
            if (!StringsKt.z(str)) {
                arrayList.add(str);
            }
        }
        return this.f28783a.a(context, CollectionsKt.joinToString$default(arrayList, "&", null, null, 0, null, null, 62, null));
    }
}
