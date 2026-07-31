package com.ironsource;

import com.ironsource.mediationsdk.utils.IronSourceConstants;
import java.util.HashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata
/* loaded from: classes2.dex */
public abstract class fc implements InterfaceC1447d2 {
    @NotNull
    public final Map<String, Object> a(@NotNull C1460f1 adProperties) {
        Intrinsics.checkNotNullParameter(adProperties, "adProperties");
        HashMap hashMap = new HashMap();
        hashMap.put(IronSourceConstants.EVENTS_PROGRAMMATIC, 1);
        String ad_unit = adProperties.a().toString();
        Intrinsics.checkNotNullExpressionValue(ad_unit, "adProperties.adFormat.toString()");
        hashMap.put(gl.f16534f, ad_unit);
        hashMap.put("adf", Integer.valueOf(wt.b(adProperties.a())));
        String uuid = adProperties.b().toString();
        Intrinsics.checkNotNullExpressionValue(uuid, "adProperties.adId.toString()");
        hashMap.put(gl.f16537i, uuid);
        hashMap.put("mediationAdUnitId", adProperties.c());
        hashMap.put("isMultipleAdUnits", 1);
        return hashMap;
    }
}
