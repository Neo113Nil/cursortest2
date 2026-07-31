package ru.rustore.sdk.pay.internal;

import com.ironsource.b9;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;
import ru.rustore.sdk.reactive.single.Single;
import ru.rustore.sdk.reactive.single.SingleFlatMapKt;
import ru.rustore.sdk.reactive.single.SingleMapKt;

/* loaded from: classes3.dex */
public final class r7 {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    public final oc f44891a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    public final ic f44892b;

    public static final class a extends kotlin.jvm.internal.s implements Function1<u7, List<? extends hc>> {
        public a() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Object obj) {
            u7 response = (u7) obj;
            Intrinsics.checkNotNullParameter(response, "response");
            ic icVar = r7.this.f44892b;
            String jsonString = response.f45085c;
            icVar.getClass();
            Intrinsics.checkNotNullParameter(jsonString, "jsonString");
            List createListBuilder = CollectionsKt.createListBuilder();
            JSONObject jSONObject = new JSONObject(jsonString).getJSONObject(b9.h.f15438E0);
            Iterator<String> keys = jSONObject.keys();
            while (keys.hasNext()) {
                String keyId = keys.next();
                Intrinsics.checkNotNullExpressionValue(keyId, "keyId");
                String string = jSONObject.getString(keyId);
                Intrinsics.checkNotNullExpressionValue(string, "jsonResponse.getString(keyId)");
                createListBuilder.add(new hc(keyId, string));
            }
            return CollectionsKt.build(createListBuilder);
        }
    }

    public r7(@NotNull oc publicKeyHttpClient, @NotNull ic publicKeyDtoDeserializer) {
        Intrinsics.checkNotNullParameter(publicKeyHttpClient, "publicKeyHttpClient");
        Intrinsics.checkNotNullParameter(publicKeyDtoDeserializer, "publicKeyDtoDeserializer");
        this.f44891a = publicKeyHttpClient;
        this.f44892b = publicKeyDtoDeserializer;
    }

    @NotNull
    public final Single<List<hc>> a() {
        oc ocVar = this.f44891a;
        bk bkVar = ocVar.f44731b.f44445a;
        bkVar.getClass();
        return SingleMapKt.map(SingleFlatMapKt.flatMap(SingleMapKt.map(bkVar.a(new jk(bkVar)), jc.f44373a), new nc(ocVar)), new a());
    }
}
