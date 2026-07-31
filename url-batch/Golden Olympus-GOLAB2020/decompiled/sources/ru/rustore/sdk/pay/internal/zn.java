package ru.rustore.sdk.pay.internal;

import com.huawei.hms.support.api.entity.pay.HwPayConstant;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;
import ru.rustore.sdk.pay.model.Url;

/* loaded from: classes3.dex */
public final class zn {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    public final y7 f45847a;

    public zn(@NotNull y7 logger) {
        Intrinsics.checkNotNullParameter(logger, "logger");
        this.f45847a = logger;
    }

    public static dn a(JSONObject jSONObject) {
        Url url;
        JSONObject jSONObject2 = jSONObject.getJSONObject("userInfo");
        String string = jSONObject2.getString(HwPayConstant.KEY_USER_NAME);
        Intrinsics.checkNotNullExpressionValue(string, "getString(USER_NAME_KEY)");
        if (!jSONObject2.has("avatarUrl") || jSONObject2.isNull("avatarUrl")) {
            url = null;
        } else {
            String string2 = jSONObject2.getString("avatarUrl");
            Intrinsics.checkNotNullExpressionValue(string2, "getString(AVATAR_URL_KEY)");
            url = new Url(string2);
        }
        return new dn(string, url);
    }
}
