package ru.rustore.sdk.pay.internal;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.TuplesKt;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.json.JSONObject;
import ru.rustore.sdk.pay.internal.ki;
import ru.rustore.sdk.pay.model.ProductId;
import ru.rustore.sdk.pay.model.RuStorePaymentException;

/* loaded from: classes3.dex */
public final class kb extends kotlin.jvm.internal.s implements Function0<ki.b> {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ nb f44443a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ List<ProductId> f44444b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kb(nb nbVar, List<ProductId> list) {
        super(0);
        this.f44443a = nbVar;
        this.f44444b = list;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        nb nbVar = this.f44443a;
        if (nbVar.f44685a == null) {
            throw new RuStorePaymentException.RuStorePayInvalidConsoleAppId(null, null, 3, null);
        }
        StringBuilder sb = new StringBuilder();
        sb.append("public/v1/apps/" + nbVar.f44685a.getValue() + '/');
        sb.append("products/searches/active-products");
        String sb2 = sb.toString();
        Intrinsics.checkNotNullExpressionValue(sb2, "StringBuilder().apply(builderAction).toString()");
        nb nbVar2 = this.f44443a;
        List<ProductId> list = this.f44444b;
        nbVar2.getClass();
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(((ProductId) it.next()).getValue());
        }
        String jSONObject = new JSONObject(MapsKt.mapOf(TuplesKt.to("productIds", arrayList))).toString();
        Intrinsics.checkNotNullExpressionValue(jSONObject, "JSONObject(\n            … }),\n        ).toString()");
        return new ki.b(sb2, MapsKt.emptyMap(), StringsKt.G(jSONObject, "\\", "", false, 4, null));
    }
}
