package com.yandex.mobile.ads.impl;

import java.util.Iterator;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class x70 {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final w70 f34478a;

    public /* synthetic */ x70() {
        this(new w70());
    }

    @Nullable
    public final LinkedHashMap a(@Nullable JSONObject jSONObject) {
        if (jSONObject != null) {
            Iterator<String> keys = jSONObject.keys();
            if (keys.hasNext()) {
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                while (keys.hasNext()) {
                    String next = keys.next();
                    if (!jSONObject.isNull(next)) {
                        Object obj = jSONObject.get(next);
                        if (obj instanceof JSONObject) {
                            JSONObject jsonObject = (JSONObject) obj;
                            this.f34478a.getClass();
                            Intrinsics.checkNotNullParameter(jsonObject, "jsonObject");
                            v70 v70Var = (Intrinsics.areEqual(jsonObject.optString("type"), "parcelable") && Intrinsics.areEqual(eq0.a("value", jsonObject), "null")) ? v70.f33540a : null;
                            if (v70Var != null) {
                                Intrinsics.checkNotNull(next);
                                linkedHashMap.put(next, v70Var);
                            }
                        } else {
                            Intrinsics.checkNotNull(next);
                            Intrinsics.checkNotNull(obj);
                            linkedHashMap.put(next, obj);
                        }
                    }
                }
                return linkedHashMap;
            }
        }
        return null;
    }

    public x70(@NotNull w70 extrasParcelableParser) {
        Intrinsics.checkNotNullParameter(extrasParcelableParser, "extrasParcelableParser");
        this.f34478a = extrasParcelableParser;
    }
}
