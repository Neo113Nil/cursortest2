package ru.rustore.sdk.pay.internal;

import kotlin.Result;
import kotlin.ResultKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;
import ru.rustore.sdk.pay.internal.ak;
import ru.rustore.sdk.pay.model.RuStorePaymentException;
import ru.rustore.sdk.pay.model.Url;

/* loaded from: classes3.dex */
public final class rk extends kotlin.jvm.internal.s implements Function0<ak.c> {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ tk f44932a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f44933b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Url f44934c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rk(tk tkVar, String str, Url url) {
        super(0);
        this.f44932a = tkVar;
        this.f44933b = str;
        this.f44934c = url;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        Object m243constructorimpl;
        zn znVar = this.f44932a.f45045a;
        String jsonString = this.f44933b;
        Url authUrl = this.f44934c;
        znVar.getClass();
        Intrinsics.checkNotNullParameter(jsonString, "jsonString");
        Intrinsics.checkNotNullParameter(authUrl, "authUrl");
        try {
            Result.Companion companion = Result.Companion;
            JSONObject jSONObject = new JSONObject(jsonString);
            String string = jSONObject.getString("url");
            String string2 = jSONObject.getString("jwe");
            boolean z4 = (!jSONObject.has("sandboxEnabled") || jSONObject.isNull("sandboxEnabled")) ? false : jSONObject.getBoolean("sandboxEnabled");
            dn a4 = zn.a(jSONObject);
            Intrinsics.checkNotNullExpressionValue(string, "getString(PAYMENT_BASE_URL_KEY)");
            Intrinsics.checkNotNullExpressionValue(string2, "getString(TOKEN_KEY)");
            m243constructorimpl = Result.m243constructorimpl(new ak.c(string, string2, z4, a4, authUrl));
        } catch (Throwable th) {
            Result.Companion companion2 = Result.Companion;
            m243constructorimpl = Result.m243constructorimpl(ResultKt.createFailure(th));
        }
        Throwable d4 = Result.d(m243constructorimpl);
        if (d4 == null) {
            return (ak.c) m243constructorimpl;
        }
        StringBuilder sb = new StringBuilder("Error deserialization of web session. ");
        sb.append("Message: " + d4.getMessage());
        String sb2 = sb.toString();
        Intrinsics.checkNotNullExpressionValue(sb2, "StringBuilder().apply(builderAction).toString()");
        RuStorePaymentException.RuStorePaymentCommonException throwable = new RuStorePaymentException.RuStorePaymentCommonException(sb2, null, 2, null);
        y7 y7Var = znVar.f45847a;
        y7Var.getClass();
        Intrinsics.checkNotNullParameter(throwable, "throwable");
        u3.e.i(y7Var.f45263a, throwable, null, 2, null);
        throw throwable;
    }
}
