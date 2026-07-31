package ru.rustore.sdk.pay.internal;

import kotlin.Result;
import kotlin.ResultKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;
import ru.rustore.sdk.pay.internal.ak;
import ru.rustore.sdk.pay.model.RuStorePaymentException;

/* loaded from: classes3.dex */
public final /* synthetic */ class ei extends kotlin.jvm.internal.p implements Function1<String, ak.b> {
    public ei(Object obj) {
        super(1, obj, x0.class, "deserialize", "deserialize(Ljava/lang/String;)Lru/rustore/sdk/pay/internal/network/session/Session$Authorized;", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Object m243constructorimpl;
        String jsonString = (String) obj;
        Intrinsics.checkNotNullParameter(jsonString, "p0");
        x0 x0Var = (x0) this.receiver;
        x0Var.getClass();
        Intrinsics.checkNotNullParameter(jsonString, "jsonString");
        try {
            Result.Companion companion = Result.Companion;
            JSONObject jSONObject = new JSONObject(jsonString);
            String string = jSONObject.getString("paymentBaseUrl");
            Intrinsics.checkNotNullExpressionValue(string, "getString(PAYMENT_BASE_URL_KEY)");
            String string2 = jSONObject.getString("token");
            Intrinsics.checkNotNullExpressionValue(string2, "getString(TOKEN_KEY)");
            m243constructorimpl = Result.m243constructorimpl(new ak.b(string, string2, jSONObject.has("sandboxEnabled") ? jSONObject.getBoolean("sandboxEnabled") : false));
        } catch (Throwable th) {
            Result.Companion companion2 = Result.Companion;
            m243constructorimpl = Result.m243constructorimpl(ResultKt.createFailure(th));
        }
        Throwable d4 = Result.d(m243constructorimpl);
        if (d4 == null) {
            return (ak.b) m243constructorimpl;
        }
        StringBuilder sb = new StringBuilder("Error deserialization of authorized session. ");
        sb.append("Message: " + d4.getMessage());
        String sb2 = sb.toString();
        Intrinsics.checkNotNullExpressionValue(sb2, "StringBuilder().apply(builderAction).toString()");
        RuStorePaymentException.RuStorePaymentCommonException throwable = new RuStorePaymentException.RuStorePaymentCommonException(sb2, null, 2, null);
        y7 y7Var = x0Var.f45197a;
        y7Var.getClass();
        Intrinsics.checkNotNullParameter(throwable, "throwable");
        u3.e.i(y7Var.f45263a, throwable, null, 2, null);
        throw throwable;
    }
}
