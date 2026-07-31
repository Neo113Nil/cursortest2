package com.yandex.mobile.ads.impl;

import android.content.Context;
import com.yandex.mobile.ads.impl.v60;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class ja1 {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final wz f27613a;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public /* synthetic */ ja1(Context context, C2286v2 c2286v2, C2360y7 c2360y7) {
        this(context, c2286v2, c2360y7, new wz(r1, c2360y7, c2286v2));
        Context applicationContext = context.getApplicationContext();
        Intrinsics.checkNotNullExpressionValue(applicationContext, "getApplicationContext(...)");
    }

    @NotNull
    public final ga1 a(@NotNull ob2<ya1> videoAdInfo) {
        Intrinsics.checkNotNullParameter(videoAdInfo, "videoAdInfo");
        int i4 = v60.f33519d;
        ga1 a4 = v60.a.a().a(videoAdInfo);
        if (a4 != null && !a4.e()) {
            return a4;
        }
        y60 a5 = this.f27613a.a();
        v60.a.a().a(videoAdInfo, a5);
        return a5;
    }

    public ja1(@NotNull Context context, @NotNull C2286v2 adConfiguration, @NotNull C2360y7<?> adResponse, @NotNull wz exoPlayerCreator) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(adConfiguration, "adConfiguration");
        Intrinsics.checkNotNullParameter(adResponse, "adResponse");
        Intrinsics.checkNotNullParameter(exoPlayerCreator, "exoPlayerCreator");
        this.f27613a = exoPlayerCreator;
    }
}
