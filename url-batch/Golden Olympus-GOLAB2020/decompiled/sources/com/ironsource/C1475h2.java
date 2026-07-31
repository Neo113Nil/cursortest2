package com.ironsource;

import com.huawei.hms.framework.common.BundleUtil;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;

@Metadata
/* renamed from: com.ironsource.h2, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1475h2 implements gt<JSONObject>, et<C1461f2> {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final Map<String, vn> f16553a = new LinkedHashMap();

    @Override // com.ironsource.xe
    @NotNull
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public JSONObject a(@NotNull ft mode) {
        Intrinsics.checkNotNullParameter(mode, "mode");
        JSONObject jSONObject = new JSONObject();
        for (Map.Entry<String, vn> entry : this.f16553a.entrySet()) {
            String key = entry.getKey();
            JSONObject a4 = entry.getValue().a(mode);
            if (a4.length() > 0) {
                jSONObject.put(StringsKt.S0(key, BundleUtil.UNDERLINE_TAG, null, 2, null), a4);
            }
        }
        return jSONObject;
    }

    @Override // com.ironsource.et
    public void a(@NotNull C1461f2 record) {
        Intrinsics.checkNotNullParameter(record, "record");
        String d4 = record.d();
        Map<String, vn> map = this.f16553a;
        vn vnVar = map.get(d4);
        if (vnVar == null) {
            vnVar = new vn();
            map.put(d4, vnVar);
        }
        vnVar.a(record.a(new C1468g2()));
    }
}
