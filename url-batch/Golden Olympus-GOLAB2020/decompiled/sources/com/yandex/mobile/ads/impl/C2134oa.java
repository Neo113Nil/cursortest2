package com.yandex.mobile.ads.impl;

import android.content.Context;
import com.yandex.mobile.ads.impl.ew1;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* renamed from: com.yandex.mobile.ads.impl.oa, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2134oa {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final ew1 f29950a;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C2134oa() {
        this(ew1.a.a());
        int i4 = ew1.f25476l;
    }

    @Nullable
    public final Set<? extends String> a(@NotNull Context context, @NotNull gs adType) {
        Map<gs, Set<String>> e4;
        Set<String> disabledRules;
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(adType, "adType");
        du1 a4 = this.f29950a.a(context);
        if (a4 == null || (e4 = a4.e()) == null || (disabledRules = e4.get(adType)) == null) {
            return null;
        }
        Intrinsics.checkNotNullParameter(disabledRules, "disabledRules");
        return disabledRules;
    }

    public C2134oa(@NotNull ew1 sdkSettings) {
        Intrinsics.checkNotNullParameter(sdkSettings, "sdkSettings");
        this.f29950a = sdkSettings;
    }
}
