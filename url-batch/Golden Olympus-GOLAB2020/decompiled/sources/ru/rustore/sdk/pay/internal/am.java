package ru.rustore.sdk.pay.internal;

import com.ironsource.b9;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class am extends kotlin.jvm.internal.s implements Function1<u7, xe> {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ cm f43837a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public am(cm cmVar) {
        super(1);
        this.f43837a = cmVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        u7 response = (u7) obj;
        Intrinsics.checkNotNullParameter(response, "response");
        ye yeVar = this.f43837a.f43939c;
        String jsonString = response.f45085c;
        yeVar.getClass();
        Intrinsics.checkNotNullParameter(jsonString, "jsonString");
        String string = new JSONObject(jsonString).getJSONObject(b9.h.f15438E0).getString("purchaseId");
        Intrinsics.checkNotNullExpressionValue(string, "jsonResponse.getString(PURCHASE_ID_KEY)");
        return new xe(string);
    }
}
