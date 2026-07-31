package com.chartboost.sdk.impl;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* loaded from: classes14.dex */
public interface w {

    public static final class a {
        public static String a(w wVar, JSONObject receiver, String error, String response) {
            Intrinsics.checkNotNullParameter(receiver, "$receiver");
            Intrinsics.checkNotNullParameter(error, "error");
            Intrinsics.checkNotNullParameter(response, "response");
            try {
                receiver.put("error", error);
                receiver.put("response", response);
            } catch (Exception e) {
                xb.b("Cannot create error json for the event", e);
            }
            String jSONObject = receiver.toString();
            Intrinsics.checkNotNullExpressionValue(jSONObject, "toString(...)");
            return jSONObject;
        }
    }

    void a(tb tbVar, Function1 function1);
}
