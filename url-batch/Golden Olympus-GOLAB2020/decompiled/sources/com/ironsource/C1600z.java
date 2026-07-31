package com.ironsource;

import com.unity3d.mediation.LevelPlay;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata
/* renamed from: com.ironsource.z, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1600z implements bf {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final bi f20485a;

    public C1600z(@NotNull bi sessionDepthService) {
        Intrinsics.checkNotNullParameter(sessionDepthService, "sessionDepthService");
        this.f20485a = sessionDepthService;
    }

    @Override // com.ironsource.bf
    public void a(@NotNull Map<String, Object> output) {
        Intrinsics.checkNotNullParameter(output, "output");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put(ge.f16400G0, Integer.valueOf(this.f20485a.a(LevelPlay.AdFormat.INTERSTITIAL)));
        output.put("interstitial", linkedHashMap);
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        linkedHashMap2.put(ge.f16400G0, Integer.valueOf(this.f20485a.a(LevelPlay.AdFormat.REWARDED)));
        output.put(ge.f16394D0, linkedHashMap2);
        LinkedHashMap linkedHashMap3 = new LinkedHashMap();
        linkedHashMap3.put(ge.f16400G0, Integer.valueOf(this.f20485a.a(LevelPlay.AdFormat.BANNER)));
        output.put("banner", linkedHashMap3);
        LinkedHashMap linkedHashMap4 = new LinkedHashMap();
        linkedHashMap4.put(ge.f16400G0, Integer.valueOf(this.f20485a.a(LevelPlay.AdFormat.NATIVE_AD)));
        output.put("nativeAd", linkedHashMap4);
    }
}
