package ru.rustore.sdk.pay.internal;

import com.huawei.hms.adapter.internal.CommonCode;
import com.ironsource.C1435b4;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class f3 {
    @NotNull
    public static List a(@NotNull JSONArray jsonArray) {
        Intrinsics.checkNotNullParameter(jsonArray, "jsonArray");
        List createListBuilder = CollectionsKt.createListBuilder();
        int length = jsonArray.length();
        for (int i4 = 0; i4 < length; i4++) {
            JSONObject fromJson$lambda$1$lambda$0 = jsonArray.getJSONObject(i4);
            JSONObject jSONObject = fromJson$lambda$1$lambda$0.getJSONObject("couponInterval");
            String string = fromJson$lambda$1$lambda$0.getString("id");
            Intrinsics.checkNotNullExpressionValue(string, "getString(ID_KEY)");
            long j4 = fromJson$lambda$1$lambda$0.getLong("nominal");
            String string2 = fromJson$lambda$1$lambda$0.getString("shortDescription");
            Intrinsics.checkNotNullExpressionValue(string2, "getString(SHORT_DESCRIPTION_KEY)");
            String string3 = jSONObject.getString("startDate");
            Intrinsics.checkNotNullExpressionValue(string3, "couponInterval.getString(COUPON_START_DATE_KEY)");
            String string4 = jSONObject.getString("endDate");
            Intrinsics.checkNotNullExpressionValue(string4, "couponInterval.getString(COUPON_END_DATE_KEY)");
            j3 j3Var = new j3(string3, string4);
            String string5 = fromJson$lambda$1$lambda$0.getString("status");
            Intrinsics.checkNotNullExpressionValue(string5, "getString(STATUS_KEY)");
            Intrinsics.checkNotNullExpressionValue(fromJson$lambda$1$lambda$0, "fromJson$lambda$1$lambda$0");
            String a4 = d7.a(fromJson$lambda$1$lambda$0, CommonCode.MapKey.HAS_RESOLUTION);
            String string6 = fromJson$lambda$1$lambda$0.getString(C1435b4.f15258i);
            Intrinsics.checkNotNullExpressionValue(string6, "getString(SEGMENT_KEY)");
            createListBuilder.add(new e3(string, j4, string2, j3Var, string5, a4, string6));
        }
        return CollectionsKt.build(createListBuilder);
    }
}
