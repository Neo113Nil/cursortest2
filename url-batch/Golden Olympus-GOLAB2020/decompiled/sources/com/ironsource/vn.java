package com.ironsource;

import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.json.JSONArray;
import org.json.JSONObject;

@Metadata
/* loaded from: classes2.dex */
public final class vn implements gt<JSONObject>, et<tn> {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final Map<String, C1476h3> f20112a = new LinkedHashMap();

    @Override // com.ironsource.xe
    @NotNull
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public JSONObject a(@NotNull ft mode) {
        Intrinsics.checkNotNullParameter(mode, "mode");
        JSONObject jSONObject = new JSONObject();
        for (Map.Entry<String, C1476h3> entry : this.f20112a.entrySet()) {
            String key = entry.getKey();
            JSONArray a4 = entry.getValue().a(mode);
            if (a4.length() > 0) {
                jSONObject.put(key, a4);
            }
        }
        return jSONObject;
    }

    @Override // com.ironsource.et
    public void a(@NotNull tn record) {
        Intrinsics.checkNotNullParameter(record, "record");
        String c4 = record.c();
        Map<String, C1476h3> map = this.f20112a;
        C1476h3 c1476h3 = map.get(c4);
        if (c1476h3 == null) {
            c1476h3 = new C1476h3();
            map.put(c4, c1476h3);
        }
        c1476h3.a(record.a(new un()));
    }
}
