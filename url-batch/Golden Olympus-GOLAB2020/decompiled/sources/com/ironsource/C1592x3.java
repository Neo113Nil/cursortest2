package com.ironsource;

import com.unity3d.mediation.LevelPlay;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;

@Metadata
/* renamed from: com.ironsource.x3, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1592x3 {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final Map<LevelPlay.AdFormat, C1537q> f20270a;

    public C1592x3(@NotNull JSONObject applicationAuctionSettings) {
        Intrinsics.checkNotNullParameter(applicationAuctionSettings, "applicationAuctionSettings");
        LevelPlay.AdFormat[] values = LevelPlay.AdFormat.values();
        LinkedHashMap linkedHashMap = new LinkedHashMap(kotlin.ranges.g.d(MapsKt.mapCapacity(values.length), 16));
        for (LevelPlay.AdFormat adFormat : values) {
            JSONObject optJSONObject = applicationAuctionSettings.optJSONObject(wt.a(adFormat));
            if (optJSONObject == null) {
                optJSONObject = new JSONObject();
            } else {
                Intrinsics.checkNotNullExpressionValue(optJSONObject, "applicationAuctionSettin…ormatKey) ?: JSONObject()");
            }
            linkedHashMap.put(adFormat, new C1537q(optJSONObject));
        }
        this.f20270a = linkedHashMap;
    }

    @NotNull
    public final Map<LevelPlay.AdFormat, C1537q> a() {
        return this.f20270a;
    }
}
