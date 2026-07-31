package com.ironsource;

import java.util.HashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata
/* loaded from: classes2.dex */
public class rp implements InterfaceC1447d2 {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final String f18919a;

    public rp(@NotNull String placementName) {
        Intrinsics.checkNotNullParameter(placementName, "placementName");
        this.f18919a = placementName;
    }

    @Override // com.ironsource.InterfaceC1447d2
    @NotNull
    public Map<String, Object> a(@Nullable EnumC1433b2 enumC1433b2) {
        HashMap hashMap = new HashMap();
        hashMap.put("placement", this.f18919a);
        return hashMap;
    }
}
