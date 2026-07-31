package com.yandex.mobile.ads.impl;

import android.content.Context;
import com.yandex.mobile.ads.impl.C2356y3;
import com.yandex.mobile.ads.impl.ew1;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* renamed from: com.yandex.mobile.ads.impl.v3, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2287v3 {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final C2356y3 f33490a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final C2310w3 f33491b;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C2287v3() {
        this(C2356y3.a.a(), new C2310w3());
        int i4 = C2356y3.f34786e;
    }

    @NotNull
    public final String a(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        return a(context, this.f33490a.c());
    }

    @NotNull
    public final String b(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        return a(context, this.f33490a.d());
    }

    private final String a(Context context, List<String> list) {
        this.f33491b.getClass();
        Intrinsics.checkNotNullParameter(context, "context");
        int i4 = ew1.f25476l;
        du1 a4 = ew1.a.a().a(context);
        return CollectionsKt.joinToString$default(list.subList(list.size() - kotlin.ranges.g.g((a4 == null || a4.b() == 0) ? 5 : a4.b(), list.size()), list.size()), StringUtils.COMMA, null, null, 0, null, null, 62, null);
    }

    public C2287v3(@NotNull C2356y3 adIdStorage, @NotNull C2310w3 adIdHeaderSizeProvider) {
        Intrinsics.checkNotNullParameter(adIdStorage, "adIdStorage");
        Intrinsics.checkNotNullParameter(adIdHeaderSizeProvider, "adIdHeaderSizeProvider");
        this.f33490a = adIdStorage;
        this.f33491b = adIdHeaderSizeProvider;
    }
}
