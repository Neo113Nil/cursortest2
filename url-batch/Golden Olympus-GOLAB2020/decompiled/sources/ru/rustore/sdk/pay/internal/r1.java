package ru.rustore.sdk.pay.internal;

import com.ironsource.b9;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class r1 extends kotlin.jvm.internal.s implements Function1<u7, List<? extends k1>> {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ s1 f44875a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r1(s1 s1Var) {
        super(1);
        this.f44875a = s1Var;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        u7 response = (u7) obj;
        Intrinsics.checkNotNullParameter(response, "response");
        t1 t1Var = this.f44875a.f44951b;
        String jsonString = response.f45085c;
        Intrinsics.checkNotNullParameter(jsonString, "jsonString");
        List createListBuilder = CollectionsKt.createListBuilder();
        JSONArray jSONArray = new JSONObject(jsonString).getJSONArray(b9.h.f15438E0);
        int length = jSONArray.length();
        for (int i4 = 0; i4 < length; i4++) {
            JSONObject jSONObject = jSONArray.getJSONObject(i4);
            String string = jSONObject.getString("name");
            Intrinsics.checkNotNullExpressionValue(string, "getString(NAME_KEY)");
            String string2 = jSONObject.getString("logoUrl");
            Intrinsics.checkNotNullExpressionValue(string2, "getString(LOGO_URL_KEY)");
            String string3 = jSONObject.getString("packageName");
            Intrinsics.checkNotNullExpressionValue(string3, "getString(PACKAGE_NAME_KEY)");
            String string4 = jSONObject.getString("schema");
            Intrinsics.checkNotNullExpressionValue(string4, "getString(SCHEMA_KEY)");
            createListBuilder.add(new k1(string, string2, string3, string4));
        }
        return CollectionsKt.build(createListBuilder);
    }
}
