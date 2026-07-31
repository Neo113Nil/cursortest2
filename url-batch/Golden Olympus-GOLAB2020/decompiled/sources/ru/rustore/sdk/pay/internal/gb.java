package ru.rustore.sdk.pay.internal;

import com.ironsource.b9;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class gb extends kotlin.jvm.internal.s implements Function1<u7, List<? extends ib>> {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ hb f44168a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gb(hb hbVar) {
        super(1);
        this.f44168a = hbVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i4;
        String str;
        int i5;
        dl dlVar;
        u7 response = (u7) obj;
        Intrinsics.checkNotNullParameter(response, "response");
        jb jbVar = this.f44168a.f44232b;
        String jsonString = response.f45085c;
        jbVar.getClass();
        Intrinsics.checkNotNullParameter(jsonString, "jsonString");
        List createListBuilder = CollectionsKt.createListBuilder();
        JSONArray jSONArray = new JSONObject(jsonString).getJSONArray(b9.h.f15438E0);
        int i6 = 0;
        for (int length = jSONArray.length(); i6 < length; length = i4) {
            JSONObject fromJson$lambda$1$lambda$0 = jSONArray.getJSONObject(i6);
            String string = fromJson$lambda$1$lambda$0.getString("productId");
            Intrinsics.checkNotNullExpressionValue(string, "getString(PRODUCT_ID_KEY)");
            String string2 = fromJson$lambda$1$lambda$0.getString("type");
            Intrinsics.checkNotNullExpressionValue(string2, "getString(PRODUCT_TYPE_KEY)");
            String string3 = fromJson$lambda$1$lambda$0.getString("amountLabel");
            Intrinsics.checkNotNullExpressionValue(string3, "getString(AMOUNT_LABEL_KEY)");
            Integer valueOf = fromJson$lambda$1$lambda$0.has("price") ? Integer.valueOf(fromJson$lambda$1$lambda$0.getInt("price")) : null;
            String string4 = fromJson$lambda$1$lambda$0.getString("currency");
            Intrinsics.checkNotNullExpressionValue(string4, "getString(CURRENCY_KEY)");
            String string5 = fromJson$lambda$1$lambda$0.getString("imageUrl");
            Intrinsics.checkNotNullExpressionValue(string5, "getString(IMAGE_URL_KEY)");
            Intrinsics.checkNotNullExpressionValue(fromJson$lambda$1$lambda$0, "fromJson$lambda$1$lambda$0");
            String a4 = d7.a(fromJson$lambda$1$lambda$0, "promoImageUrl");
            String string6 = fromJson$lambda$1$lambda$0.getString(b9.h.f15436D0);
            JSONArray jSONArray2 = jSONArray;
            Intrinsics.checkNotNullExpressionValue(string6, "getString(TITLE_KEY)");
            String a5 = d7.a(fromJson$lambda$1$lambda$0, "description");
            Intrinsics.checkNotNullParameter(fromJson$lambda$1$lambda$0, "<this>");
            Intrinsics.checkNotNullParameter("subscriptionInfo", b9.h.f15463W);
            JSONObject jSONObject = (!fromJson$lambda$1$lambda$0.has("subscriptionInfo") || fromJson$lambda$1$lambda$0.isNull("subscriptionInfo")) ? null : fromJson$lambda$1$lambda$0.getJSONObject("subscriptionInfo");
            if (jSONObject != null) {
                JSONArray jSONArray3 = jSONObject.getJSONArray("periods");
                ArrayList arrayList = new ArrayList();
                int length2 = jSONArray3.length();
                i4 = length;
                int i7 = 0;
                while (i7 < length2) {
                    String str2 = a4;
                    JSONObject periodObject = jSONArray3.getJSONObject(i7);
                    JSONArray jSONArray4 = jSONArray3;
                    int i8 = i7;
                    String string7 = periodObject.getString("period");
                    int i9 = i6;
                    Intrinsics.checkNotNullExpressionValue(string7, "periodObject.getString(PERIOD_TYPE_KEY)");
                    String string8 = periodObject.getString(IronSourceConstants.EVENTS_DURATION);
                    int i10 = length2;
                    Intrinsics.checkNotNullExpressionValue(string8, "periodObject.getString(DURATION_KEY)");
                    Intrinsics.checkNotNullExpressionValue(periodObject, "periodObject");
                    arrayList.add(new fl(string7, string8, d7.a(periodObject, "currency"), periodObject.has("price") ? Integer.valueOf(periodObject.getInt("price")) : null));
                    i7 = i8 + 1;
                    a4 = str2;
                    jSONArray3 = jSONArray4;
                    i6 = i9;
                    length2 = i10;
                }
                str = a4;
                i5 = i6;
                dlVar = new dl(arrayList);
            } else {
                i4 = length;
                str = a4;
                i5 = i6;
                dlVar = null;
            }
            createListBuilder.add(new ib(string, string2, string3, valueOf, string4, string5, str, string6, a5, dlVar));
            i6 = i5 + 1;
            jSONArray = jSONArray2;
        }
        return CollectionsKt.build(createListBuilder);
    }
}
