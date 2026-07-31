package com.chartboost.sdk.impl;

import com.applovin.impl.sdk.utils.JsonUtils;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.json.JSONObject;

/* loaded from: classes15.dex */
public abstract class s1 {
    public static final Function1 a = a.b;

    public static final class a extends Lambda implements Function1 {
        public static final a b = new a();

        public a() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final sg invoke(m1 it) {
            JSONObject jSONObject;
            String str = JsonUtils.EMPTY_JSON;
            Intrinsics.checkNotNullParameter(it, "it");
            try {
                String string = it.i().getString("config", JsonUtils.EMPTY_JSON);
                if (string != null) {
                    str = string;
                }
                jSONObject = new JSONObject(str);
            } catch (Exception e) {
                xb.b("Error reading config from shared preferences", e);
                jSONObject = new JSONObject();
            }
            return new sg(jSONObject);
        }
    }
}
