package com.yandex.mobile.ads.impl;

import java.util.Map;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class nn0 implements x92 {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final w92 f29687a;

    public nn0(@NotNull w92 requestConfiguration) {
        Intrinsics.checkNotNullParameter(requestConfiguration, "requestConfiguration");
        this.f29687a = requestConfiguration;
    }

    @Override // com.yandex.mobile.ads.impl.x92
    @NotNull
    public final Map<String, String> a() {
        C2037k7 c2037k7 = new C2037k7(this.f29687a.a());
        Map createMapBuilder = MapsKt.createMapBuilder();
        Map<String, String> b4 = this.f29687a.b();
        if (b4 != null) {
            createMapBuilder.putAll(b4);
        }
        String e4 = c2037k7.e();
        if (e4 != null) {
            createMapBuilder.put("video-session-id", e4);
        }
        return MapsKt.build(createMapBuilder);
    }
}
