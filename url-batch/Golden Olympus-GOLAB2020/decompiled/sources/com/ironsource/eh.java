package com.ironsource;

import com.ironsource.b9;
import com.ironsource.dh;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

@Metadata
/* loaded from: classes2.dex */
public final class eh implements dh, dh.a {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private JSONObject f16046a = new JSONObject();

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private JSONObject f16047b = new JSONObject();

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private JSONObject f16048c = new JSONObject();

    private final Object e(String str) {
        JSONObject jSONObject;
        if (this.f16048c.has(str)) {
            jSONObject = this.f16048c;
        } else if (this.f16047b.has(str)) {
            jSONObject = this.f16047b;
        } else {
            if (!this.f16046a.has(str)) {
                return null;
            }
            jSONObject = this.f16046a;
        }
        return jSONObject.get(str);
    }

    @Override // com.ironsource.dh
    @Nullable
    public JSONObject a(@NotNull String configKey) {
        Intrinsics.checkNotNullParameter(configKey, "configKey");
        Object e4 = e(configKey);
        if (e4 instanceof JSONObject) {
            return (JSONObject) e4;
        }
        return null;
    }

    @Override // com.ironsource.dh
    @Nullable
    public Integer b(@NotNull String configKey) {
        Intrinsics.checkNotNullParameter(configKey, "configKey");
        Object e4 = e(configKey);
        if (e4 instanceof Integer) {
            return (Integer) e4;
        }
        return null;
    }

    @Override // com.ironsource.dh
    @Nullable
    public Boolean c(@NotNull String configKey) {
        Intrinsics.checkNotNullParameter(configKey, "configKey");
        Object e4 = e(configKey);
        if (e4 instanceof Boolean) {
            return (Boolean) e4;
        }
        return null;
    }

    @Override // com.ironsource.dh
    @Nullable
    public String d(@NotNull String configKey) {
        Intrinsics.checkNotNullParameter(configKey, "configKey");
        Object e4 = e(configKey);
        if (e4 instanceof String) {
            return (String) e4;
        }
        return null;
    }

    @Override // com.ironsource.dh.a
    public void a(@NotNull JSONObject controllerConfig) {
        Intrinsics.checkNotNullParameter(controllerConfig, "controllerConfig");
        this.f16046a = controllerConfig;
        JSONObject optJSONObject = controllerConfig.optJSONObject(b9.a.f15288b);
        if (optJSONObject == null) {
            optJSONObject = new JSONObject();
        }
        this.f16047b = optJSONObject;
        JSONObject optJSONObject2 = this.f16046a.optJSONObject(b9.a.f15289c);
        if (optJSONObject2 == null) {
            optJSONObject2 = new JSONObject();
        }
        this.f16048c = optJSONObject2;
    }
}
