package ru.rustore.sdk.pay.internal;

import com.ironsource.b9;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;
import ru.rustore.sdk.pay.internal.ak;
import ru.rustore.sdk.pay.model.RuStorePaymentException;

/* loaded from: classes3.dex */
public final class ci extends kotlin.jvm.internal.s implements Function1<u7, ak.a> {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ di f43931a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ci(di diVar) {
        super(1);
        this.f43931a = diVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Object m243constructorimpl;
        u7 response = (u7) obj;
        Intrinsics.checkNotNullParameter(response, "response");
        n nVar = this.f43931a.f43972b;
        String jsonString = response.f45085c;
        Intrinsics.checkNotNullParameter(jsonString, "jsonString");
        try {
            Result.Companion companion = Result.Companion;
            JSONObject jSONObject = new JSONObject(jsonString).getJSONObject(b9.h.f15438E0);
            String string = jSONObject.getString("url");
            Intrinsics.checkNotNullExpressionValue(string, "getString(PAYMENT_BASE_URL_KEY)");
            String string2 = jSONObject.getString("jwe");
            Intrinsics.checkNotNullExpressionValue(string2, "getString(TOKEN_KEY)");
            m243constructorimpl = Result.m243constructorimpl(new ak.a(string, string2, (!jSONObject.has("sandboxEnabled") || jSONObject.isNull("sandboxEnabled")) ? false : jSONObject.getBoolean("sandboxEnabled")));
        } catch (Throwable th) {
            Result.Companion companion2 = Result.Companion;
            m243constructorimpl = Result.m243constructorimpl(ResultKt.createFailure(th));
        }
        Throwable d4 = Result.d(m243constructorimpl);
        if (d4 == null) {
            return (ak.a) m243constructorimpl;
        }
        StringBuilder sb = new StringBuilder("Error deserialization of anonymous session. ");
        sb.append("Message: " + d4.getMessage());
        String sb2 = sb.toString();
        Intrinsics.checkNotNullExpressionValue(sb2, "StringBuilder().apply(builderAction).toString()");
        RuStorePaymentException.RuStorePaymentCommonException throwable = new RuStorePaymentException.RuStorePaymentCommonException(sb2, null, 2, null);
        y7 y7Var = nVar.f44665a;
        y7Var.getClass();
        Intrinsics.checkNotNullParameter(throwable, "throwable");
        u3.e.i(y7Var.f45263a, throwable, null, 2, null);
        throw throwable;
    }
}
