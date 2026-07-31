package com.chartboost.sdk.impl;

import com.chartboost.sdk.impl.e3;
import com.chartboost.sdk.internal.Model.CBError;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.text.Charsets;
import kotlinx.serialization.json.Json;
import kotlinx.serialization.json.JsonBuilder;
import kotlinx.serialization.json.JsonKt;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes10.dex */
public final class me extends k3 {
    public static final b v = new b(null);
    public static final Json w = JsonKt.Json$default(null, a.b, 1, null);
    public final boolean u;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public me(vd networkParameters, b0 adParameters, he heVar, p7 eventTracker, zg session, boolean z) {
        super(method, endpoint, path, r4, priority, (String) null, networkParameters.f, eventTracker, session);
        JSONObject h;
        Intrinsics.checkNotNullParameter(networkParameters, "networkParameters");
        Intrinsics.checkNotNullParameter(adParameters, "adParameters");
        Intrinsics.checkNotNullParameter(eventTracker, "eventTracker");
        Intrinsics.checkNotNullParameter(session, "session");
        e3.c method = networkParameters.a;
        Intrinsics.checkNotNullExpressionValue(method, "method");
        String endpoint = networkParameters.b;
        Intrinsics.checkNotNullExpressionValue(endpoint, "endpoint");
        String path = networkParameters.c;
        Intrinsics.checkNotNullExpressionValue(path, "path");
        ig igVar = networkParameters.d;
        af priority = networkParameters.e;
        Intrinsics.checkNotNullExpressionValue(priority, "priority");
        this.u = z;
        if (z) {
            ig requestBodyFields = networkParameters.d;
            Intrinsics.checkNotNullExpressionValue(requestBodyFields, "requestBodyFields");
            BidRequest a2 = new oe(requestBodyFields, adParameters, heVar).a();
            Json json = w;
            json.getSerializersModule();
            h = new JSONObject(json.encodeToString(BidRequest.INSTANCE.serializer(), a2));
        } else {
            h = new ne(networkParameters.d, adParameters, heVar).h();
            Intrinsics.checkNotNull(h);
        }
        a(h);
    }

    @Override // com.chartboost.sdk.impl.k3
    public void f() {
    }

    public static final class b {
        public b() {
        }

        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public static final class a extends Lambda implements Function1 {
        public static final a b = new a();

        public a() {
            super(1);
        }

        public final void a(JsonBuilder Json) {
            Intrinsics.checkNotNullParameter(Json, "$this$Json");
            Json.setEncodeDefaults(true);
            Json.setIgnoreUnknownKeys(true);
            Json.setPrettyPrint(false);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((JsonBuilder) obj);
            return Unit.INSTANCE;
        }
    }

    @Override // com.chartboost.sdk.impl.k3, com.chartboost.sdk.impl.e3
    public g3 a(h3 h3Var) {
        byte[] bArr;
        try {
            if (h3Var != null) {
                bArr = h3Var.a();
                if (bArr == null) {
                }
                return g3.c.a(new JSONObject(new String(bArr, Charsets.UTF_8)));
            }
            bArr = new byte[0];
            return g3.c.a(new JSONObject(new String(bArr, Charsets.UTF_8)));
        } catch (JSONException e) {
            xb.b("parseServerResponse", e);
            return g3.c.a(new CBError(CBError.Internal.HTTP_NOT_FOUND, "No Bid"));
        }
    }
}
