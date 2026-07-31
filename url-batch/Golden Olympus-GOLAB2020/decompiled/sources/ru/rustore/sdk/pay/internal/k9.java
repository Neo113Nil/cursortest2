package ru.rustore.sdk.pay.internal;

import com.ironsource.b9;
import java.util.Map;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.json.JSONObject;
import ru.rustore.sdk.pay.internal.ki;
import ru.rustore.sdk.pay.model.PurchaseId;
import ru.rustore.sdk.pay.model.SdkTheme;
import ru.rustore.sdk.pay.model.Url;

/* loaded from: classes3.dex */
public final class k9 extends kotlin.jvm.internal.s implements Function0<ki.b> {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ q9 f44426a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Url f44427b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Url f44428c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Url f44429d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ String f44430e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ String f44431f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ PurchaseId f44432g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ SdkTheme f44433h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k9(q9 q9Var, Url url, Url url2, Url url3, String str, String str2, PurchaseId purchaseId, SdkTheme sdkTheme) {
        super(0);
        this.f44426a = q9Var;
        this.f44427b = url;
        this.f44428c = url2;
        this.f44429d = url3;
        this.f44430e = str;
        this.f44431f = str2;
        this.f44432g = purchaseId;
        this.f44433h = sdkTheme;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        q9 q9Var = this.f44426a;
        Url url = this.f44427b;
        Url url2 = this.f44428c;
        Url url3 = this.f44429d;
        String str = this.f44430e;
        String str2 = this.f44431f;
        q9Var.getClass();
        JSONObject jSONObject = new JSONObject(MapsKt.mapOf(TuplesKt.to("paymentMethod", str2)));
        JSONObject jSONObject2 = new JSONObject(MapsKt.mapOf(TuplesKt.to("deviceId", q9Var.f44815b.a())));
        Pair pair = TuplesKt.to("paymentMethod", jSONObject);
        Pair pair2 = TuplesKt.to("backUrl", url != null ? url.getValue() : null);
        Pair pair3 = TuplesKt.to("successUrl", url2 != null ? url2.getValue() : null);
        Pair pair4 = TuplesKt.to("failUrl", url3 != null ? url3.getValue() : null);
        if (str == null) {
            str = null;
        }
        String jSONObject3 = new JSONObject(MapsKt.mapOf(pair, pair2, pair3, pair4, TuplesKt.to("bindingId", str), TuplesKt.to(b9.h.f15441G, jSONObject2))).toString();
        Intrinsics.checkNotNullExpressionValue(jSONObject3, "JSONObject(\n            …  ),\n        ).toString()");
        String G3 = StringsKt.G(jSONObject3, "\\", "", false, 4, null);
        SdkTheme sdkTheme = this.f44433h;
        Map createMapBuilder = MapsKt.createMapBuilder();
        if (sdkTheme != null) {
            createMapBuilder.put("Sdk-UI-Theme", sdkTheme.name());
        }
        return new ki.b("api/v1/purchases/" + this.f44432g.getValue() + "/payment", MapsKt.build(createMapBuilder), G3);
    }
}
