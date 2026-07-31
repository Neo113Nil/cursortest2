package ru.rustore.sdk.pay.internal;

import com.ironsource.b9;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class r8 {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    public final q9 f44894a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    public final t8 f44895b;

    public r8(@NotNull q9 httpClient, @NotNull t8 deserializer) {
        Intrinsics.checkNotNullParameter(httpClient, "httpClient");
        Intrinsics.checkNotNullParameter(deserializer, "deserializer");
        this.f44894a = httpClient;
        this.f44895b = deserializer;
    }

    public static final s8 a(r8 r8Var, u7 u7Var) {
        t8 t8Var = r8Var.f44895b;
        String jsonString = u7Var.f45085c;
        t8Var.getClass();
        Intrinsics.checkNotNullParameter(jsonString, "jsonString");
        JSONObject fromJson$lambda$0 = new JSONObject(jsonString).getJSONObject(b9.h.f15438E0);
        String string = fromJson$lambda$0.getString("purchaseId");
        Intrinsics.checkNotNullExpressionValue(string, "getString(PURCHASE_ID_KEY)");
        String string2 = fromJson$lambda$0.getString("invoiceId");
        Intrinsics.checkNotNullExpressionValue(string2, "getString(INVOICE_ID_KEY)");
        Intrinsics.checkNotNullExpressionValue(fromJson$lambda$0, "fromJson$lambda$0");
        String a4 = d7.a(fromJson$lambda$0, "paymentUrl");
        String string3 = fromJson$lambda$0.getString("purchaseStatus");
        Intrinsics.checkNotNullExpressionValue(string3, "getString(PURCHASE_STATUS_KEY)");
        String string4 = fromJson$lambda$0.getString("purchaseType");
        Intrinsics.checkNotNullExpressionValue(string4, "getString(PURCHASE_TYPE_KEY)");
        return new s8(string, string2, a4, string3, string4);
    }
}
