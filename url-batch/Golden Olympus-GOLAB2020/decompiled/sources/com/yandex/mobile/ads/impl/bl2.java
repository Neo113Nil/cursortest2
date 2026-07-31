package com.yandex.mobile.ads.impl;

import android.location.Location;
import com.yandex.mobile.ads.common.AdRequestConfiguration;
import com.yandex.mobile.ads.common.AdTheme;
import com.yandex.mobile.ads.impl.C1918f7;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class bl2 {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final hq1 f23860a;

    public /* synthetic */ bl2() {
        this(new hq1());
    }

    @NotNull
    public final C1918f7 a(@NotNull AdRequestConfiguration adRequestConfiguration) {
        Intrinsics.checkNotNullParameter(adRequestConfiguration, "adRequestConfiguration");
        String age = adRequestConfiguration.getAge();
        String gender = adRequestConfiguration.getGender();
        String contextQuery = adRequestConfiguration.getContextQuery();
        List<String> contextTags = adRequestConfiguration.getContextTags();
        Location location = adRequestConfiguration.getLocation();
        Map<String, String> parameters = adRequestConfiguration.getParameters();
        String biddingData = adRequestConfiguration.getBiddingData();
        AdTheme preferredTheme = adRequestConfiguration.getPreferredTheme();
        C1918f7.a aVar = new C1918f7.a(adRequestConfiguration.getAdUnitId());
        if (age != null) {
            if (StringsKt.z(age)) {
                age = null;
            }
            if (age != null) {
                aVar.a(age);
            }
        }
        if (gender != null) {
            if (StringsKt.z(gender)) {
                gender = null;
            }
            if (gender != null) {
                aVar.c(gender);
            }
        }
        if (contextQuery != null) {
            aVar = aVar.b(contextQuery);
        }
        if (contextTags != null) {
            aVar = aVar.a(contextTags);
        }
        if (location != null) {
            aVar = aVar.a(location);
        }
        if (parameters != null) {
            aVar = aVar.a(parameters);
        }
        if (biddingData != null) {
            aVar = aVar.d(biddingData);
        }
        if (preferredTheme != null) {
            this.f23860a.getClass();
            aVar = aVar.a(hq1.a(preferredTheme));
        }
        return aVar.a();
    }

    public bl2(@NotNull hq1 requestedAdThemeFactory) {
        Intrinsics.checkNotNullParameter(requestedAdThemeFactory, "requestedAdThemeFactory");
        this.f23860a = requestedAdThemeFactory;
    }
}
