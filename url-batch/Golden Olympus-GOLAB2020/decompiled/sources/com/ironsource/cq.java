package com.ironsource;

import java.util.Iterator;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;

@Metadata
/* loaded from: classes2.dex */
public final class cq {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final Map<String, ao> f15785a;

    @Metadata
    static final class a extends kotlin.jvm.internal.s implements Function1<String, Pair<? extends String, ? extends ao>> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ JSONObject f15786a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(JSONObject jSONObject) {
            super(1);
            this.f15786a = jSONObject;
        }

        @Override // kotlin.jvm.functions.Function1
        @NotNull
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Pair<String, ao> invoke(String networkName) {
            Intrinsics.checkNotNullExpressionValue(networkName, "networkName");
            JSONObject jSONObject = this.f15786a.getJSONObject(networkName);
            Intrinsics.checkNotNullExpressionValue(jSONObject, "providerSettings.getJSONObject(networkName)");
            return TuplesKt.to(networkName, new ao(networkName, jSONObject));
        }
    }

    public cq(@NotNull JSONObject providerSettings) {
        Intrinsics.checkNotNullParameter(providerSettings, "providerSettings");
        Iterator<String> keys = providerSettings.keys();
        Intrinsics.checkNotNullExpressionValue(keys, "providerSettings\n          .keys()");
        Map<String, ao> map = MapsKt.toMap(kotlin.sequences.k.y(kotlin.sequences.k.c(keys), new a(providerSettings)));
        this.f15785a = map;
        for (Map.Entry<String, ao> entry : map.entrySet()) {
            entry.getKey();
            ao value = entry.getValue();
            if (b(value)) {
                value.b(a(value));
            }
        }
    }

    private final ao a(ao aoVar) {
        return this.f15785a.get(aoVar.h());
    }

    private final boolean b(ao aoVar) {
        return aoVar.o() && aoVar.l().length() > 0;
    }

    @NotNull
    public final Map<String, ao> a() {
        return this.f15785a;
    }
}
