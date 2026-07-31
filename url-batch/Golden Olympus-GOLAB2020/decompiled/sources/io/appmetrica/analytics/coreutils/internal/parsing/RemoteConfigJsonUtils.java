package io.appmetrica.analytics.coreutils.internal.parsing;

import io.appmetrica.analytics.coreutils.internal.WrapUtils;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONArray;
import org.json.JSONObject;

@Metadata
/* loaded from: classes3.dex */
public final class RemoteConfigJsonUtils {

    @NotNull
    public static final RemoteConfigJsonUtils INSTANCE = new RemoteConfigJsonUtils();

    private RemoteConfigJsonUtils() {
    }

    public static final boolean extractFeature(@NotNull JSONObject jSONObject, @NotNull String str, boolean z4) {
        JSONObject optJSONObject;
        JSONObject optJSONObject2;
        try {
            JSONObject optJSONObject3 = jSONObject.optJSONObject("features");
            if (optJSONObject3 != null && (optJSONObject = optJSONObject3.optJSONObject("list")) != null && (optJSONObject2 = optJSONObject.optJSONObject(str)) != null) {
                return optJSONObject2.optBoolean("enabled", z4);
            }
        } catch (Throwable unused) {
        }
        return z4;
    }

    @NotNull
    public static final byte[][] extractHosts(@NotNull JSONObject jSONObject, @NotNull String str) {
        JSONObject optJSONObject;
        JSONObject optJSONObject2;
        JSONArray optJSONArray;
        JSONObject optJSONObject3 = jSONObject.optJSONObject("query_hosts");
        if (optJSONObject3 == null || (optJSONObject = optJSONObject3.optJSONObject("list")) == null || (optJSONObject2 = optJSONObject.optJSONObject(str)) == null || (optJSONArray = optJSONObject2.optJSONArray("urls")) == null) {
            return new byte[0][];
        }
        int length = optJSONArray.length();
        byte[][] bArr = new byte[length][];
        for (int i4 = 0; i4 < length; i4++) {
            bArr[i4] = optJSONArray.optString(i4).getBytes(Charsets.UTF_8);
        }
        return bArr;
    }

    public static final long extractMillisFromSecondsOrDefault(@NotNull JSONObject jSONObject, @NotNull String str, long j4) {
        return extractMillisOrDefault(jSONObject, str, TimeUnit.SECONDS, j4);
    }

    public static final long extractMillisOrDefault(@NotNull JSONObject jSONObject, @NotNull String str, @NotNull TimeUnit timeUnit, long j4) {
        return WrapUtils.getMillisOrDefault(JsonUtils.optLongOrNull(jSONObject, str), timeUnit, j4);
    }

    @Nullable
    public static final String extractQuery(@NotNull JSONObject jSONObject, @NotNull String str) {
        JSONObject optJSONObject;
        JSONObject optJSONObject2;
        try {
            JSONObject optJSONObject3 = jSONObject.optJSONObject("queries");
            if (optJSONObject3 != null && (optJSONObject = optJSONObject3.optJSONObject("list")) != null && (optJSONObject2 = optJSONObject.optJSONObject(str)) != null) {
                RemoteConfigJsonUtils remoteConfigJsonUtils = INSTANCE;
                String optString = optJSONObject2.optString("url", "");
                remoteConfigJsonUtils.getClass();
                if (!Intrinsics.areEqual(optString, "")) {
                    return optString;
                }
            }
        } catch (Throwable unused) {
        }
        return null;
    }
}
