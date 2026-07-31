package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.feed.FeedAdAppearance;
import com.yandex.mobile.ads.feed.FeedAdRequestConfiguration;
import com.yandex.mobile.ads.impl.C1918f7;
import java.util.Map;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes3.dex */
public final class u80 {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final o80 f32857a;

    public /* synthetic */ u80() {
        this(new o80());
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x003a, code lost:
    
        if (r5 == null) goto L11;
     */
    @NotNull
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final C1918f7 a(@Nullable FeedAdRequestConfiguration feedAdRequestConfiguration, @Nullable FeedAdAppearance appearance) {
        Map emptyMap;
        if (appearance != null) {
            this.f32857a.getClass();
            Intrinsics.checkNotNullParameter(appearance, "appearance");
            Map createMapBuilder = MapsKt.createMapBuilder();
            if (appearance.getCardCornerRadius() != null) {
                createMapBuilder.put("card_corner_radius", appearance.getCardCornerRadius().toString());
            }
            if (appearance.getCardWidth() != null) {
                createMapBuilder.put("card_width", appearance.getCardWidth().toString());
            }
            emptyMap = MapsKt.build(createMapBuilder);
        }
        emptyMap = MapsKt.emptyMap();
        Map createMapBuilder2 = MapsKt.createMapBuilder();
        if ((feedAdRequestConfiguration != null ? feedAdRequestConfiguration.getParameters() : null) != null) {
            createMapBuilder2.putAll(feedAdRequestConfiguration.getParameters());
        }
        createMapBuilder2.putAll(emptyMap);
        Map<String, String> build = MapsKt.build(createMapBuilder2);
        String adUnitId = feedAdRequestConfiguration != null ? feedAdRequestConfiguration.getAdUnitId() : null;
        if (adUnitId == null) {
            adUnitId = "";
        }
        return new C1918f7.a(adUnitId).a(feedAdRequestConfiguration != null ? feedAdRequestConfiguration.getAge() : null).c(feedAdRequestConfiguration != null ? feedAdRequestConfiguration.getGender() : null).b(feedAdRequestConfiguration != null ? feedAdRequestConfiguration.getContextQuery() : null).a(feedAdRequestConfiguration != null ? feedAdRequestConfiguration.getContextTags() : null).a(feedAdRequestConfiguration != null ? feedAdRequestConfiguration.getLocation() : null).a(build).a();
    }

    public u80(@NotNull o80 appearanceParametersProvider) {
        Intrinsics.checkNotNullParameter(appearanceParametersProvider, "appearanceParametersProvider");
        this.f32857a = appearanceParametersProvider;
    }
}
