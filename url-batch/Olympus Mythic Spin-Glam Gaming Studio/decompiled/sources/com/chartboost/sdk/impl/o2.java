package com.chartboost.sdk.impl;

import android.content.Context;
import android.os.Build;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.SortedMap;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.sequences.SequencesKt;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public final class o2 {
    public static final a h = new a(null);
    public final Context a;
    public final i2 b;
    public final y2 c;
    public final AtomicReference d;
    public final he e;
    public final bf f;
    public final zg g;

    public o2(Context context, i2 base64Wrapper, y2 identity, AtomicReference sdkConfiguration, he openMeasurementManager, bf privacyApi, zg session) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(base64Wrapper, "base64Wrapper");
        Intrinsics.checkNotNullParameter(identity, "identity");
        Intrinsics.checkNotNullParameter(sdkConfiguration, "sdkConfiguration");
        Intrinsics.checkNotNullParameter(openMeasurementManager, "openMeasurementManager");
        Intrinsics.checkNotNullParameter(privacyApi, "privacyApi");
        Intrinsics.checkNotNullParameter(session, "session");
        this.a = context;
        this.b = base64Wrapper;
        this.c = identity;
        this.d = sdkConfiguration;
        this.e = openMeasurementManager;
        this.f = privacyApi;
        this.g = session;
    }

    public final String a() {
        List listOf = CollectionsKt.listOf((Object[]) new bi[]{new t9(this.c), new be(this.d, this.e), new q6(this.a, this.c, m6.d.a()), new m5(), new df(this.f), new bh(this.g)});
        Map mapOf = MapsKt.mapOf(TuplesKt.to("package", this.a.getPackageName()), TuplesKt.to("token_version", "1.2"), TuplesKt.to("android_api_level", Integer.valueOf(Build.VERSION.SDK_INT)));
        ArrayList arrayList = new ArrayList();
        Iterator it = listOf.iterator();
        while (it.hasNext()) {
            JSONObject a2 = ((bi) it.next()).a();
            Iterator<String> keys = a2.keys();
            Intrinsics.checkNotNullExpressionValue(keys, "keys(...)");
            CollectionsKt.addAll(arrayList, SequencesKt.map(SequencesKt.asSequence(keys), new b(a2)));
        }
        SortedMap sortedMap = MapsKt.toSortedMap(MapsKt.plus(mapOf, arrayList));
        JSONObject jSONObject = new JSONObject();
        for (Map.Entry entry : sortedMap.entrySet()) {
            jSONObject.put((String) entry.getKey(), entry.getValue());
        }
        i2 i2Var = this.b;
        String jSONObject2 = jSONObject.toString();
        Intrinsics.checkNotNullExpressionValue(jSONObject2, "toString(...)");
        return i2Var.c(jSONObject2);
    }

    public static final class a {
        public a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public static final class b extends Lambda implements Function1 {
        public final /* synthetic */ JSONObject b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(JSONObject jSONObject) {
            super(1);
            this.b = jSONObject;
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Pair invoke(String str) {
            return TuplesKt.to(str, this.b.get(str));
        }
    }
}
