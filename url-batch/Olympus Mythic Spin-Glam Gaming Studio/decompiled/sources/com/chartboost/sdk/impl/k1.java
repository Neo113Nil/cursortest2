package com.chartboost.sdk.impl;

import android.text.TextUtils;
import android.util.Base64;
import com.chartboost.sdk.Analytics;
import com.facebook.gamingservices.cloudgaming.internal.SDKConstants;
import java.util.Arrays;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;
import kotlin.text.Charsets;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class k1 {
    public final ug a;
    public final i3 b;
    public final gg c;
    public final p7 d;
    public final zg e;

    public /* synthetic */ class a {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[Analytics.IAPType.values().length];
            try {
                iArr[Analytics.IAPType.GOOGLE_PLAY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Analytics.IAPType.AMAZON.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            a = iArr;
        }
    }

    public k1(ug sdkInitializer, i3 networkService, gg requestBodyBuilder, p7 eventTracker, zg session) {
        Intrinsics.checkNotNullParameter(sdkInitializer, "sdkInitializer");
        Intrinsics.checkNotNullParameter(networkService, "networkService");
        Intrinsics.checkNotNullParameter(requestBodyBuilder, "requestBodyBuilder");
        Intrinsics.checkNotNullParameter(eventTracker, "eventTracker");
        Intrinsics.checkNotNullParameter(session, "session");
        this.a = sdkInitializer;
        this.b = networkService;
        this.c = requestBodyBuilder;
        this.d = eventTracker;
        this.e = session;
    }

    public final JSONObject b(String str, String str2) {
        if (str != null && str.length() != 0 && str2 != null && str2.length() != 0) {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("purchaseData", str);
            jSONObject.put("purchaseSignature", str2);
            jSONObject.put("type", Analytics.IAPType.GOOGLE_PLAY.ordinal());
            return jSONObject;
        }
        xb.b("Null object is passed for for purchase data or purchase signature", (Throwable) null, 2, (Object) null);
        return new JSONObject();
    }

    public final JSONObject a(String str, String str2) {
        if (str != null && str.length() != 0 && str2 != null && str2.length() != 0) {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(SDKConstants.PARAM_USER_ID, str);
            jSONObject.put(SDKConstants.PARAM_PURCHASE_TOKEN, str2);
            jSONObject.put("type", Analytics.IAPType.AMAZON.ordinal());
            return jSONObject;
        }
        xb.b("Null object is passed for for amazon user id or amazon purchase token", (Throwable) null, 2, (Object) null);
        return new JSONObject();
    }

    public final boolean a() {
        return this.a.a();
    }

    public final void a(JSONObject jSONObject) {
        StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
        String format = String.format(Locale.US, "%s%s", Arrays.copyOf(new Object[]{"/post-install-event/", "iap"}, 2));
        Intrinsics.checkNotNullExpressionValue(format, "format(...)");
        k3 k3Var = new k3("https://live.chartboost.com", format, this.c.a(), af.e, "iap", null, this.d, this.e);
        k3Var.a("iap", jSONObject);
        k3Var.s = true;
        this.b.a(k3Var);
    }

    public final void a(JSONArray jSONArray) {
        k3 k3Var = new k3("https://live.chartboost.com", "/post-install-event/tracking", this.c.a(), af.e, "tracking", null, this.d, this.e);
        k3Var.a("track_info", jSONArray);
        k3Var.s = true;
        this.b.a(k3Var);
    }

    public final void a(String productID, String title, String description, String price, String currency, String str, String str2, String str3, String str4, Analytics.IAPType iapType) {
        JSONObject b;
        Intrinsics.checkNotNullParameter(productID, "productID");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(description, "description");
        Intrinsics.checkNotNullParameter(price, "price");
        Intrinsics.checkNotNullParameter(currency, "currency");
        Intrinsics.checkNotNullParameter(iapType, "iapType");
        try {
            if (!a()) {
                xb.b("You need call Chartboost.startWithAppId() before tracking in-app purchases", (Throwable) null, 2, (Object) null);
                return;
            }
            float a2 = a(price);
            if (a2 == -1.0f) {
                return;
            }
            int i = a.a[iapType.ordinal()];
            if (i == 1) {
                b = b(str, str2);
            } else if (i == 2) {
                b = a(str3, str4);
            } else {
                throw new NoWhenBranchMatchedException();
            }
            if (b.length() == 0) {
                xb.b("Error while parsing the receipt to a JSON Object", (Throwable) null, 2, (Object) null);
                return;
            }
            String jSONObject = b.toString();
            Intrinsics.checkNotNullExpressionValue(jSONObject, "toString(...)");
            byte[] bytes = jSONObject.getBytes(Charsets.UTF_8);
            Intrinsics.checkNotNullExpressionValue(bytes, "getBytes(...)");
            String encodeToString = Base64.encodeToString(bytes, 2);
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("localized-title", title);
            jSONObject2.put("localized-description", description);
            jSONObject2.put("price", Float.valueOf(a2));
            jSONObject2.put("currency", currency);
            jSONObject2.put(SDKConstants.PARAM_PRODUCT_ID, productID);
            jSONObject2.put("receipt", encodeToString);
            a(jSONObject2);
        } catch (Exception e) {
            xb.b("", e);
        }
    }

    public final void a(String eventLabel, Analytics.LevelType type, int i, int i2, String description, long j) {
        Intrinsics.checkNotNullParameter(eventLabel, "eventLabel");
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(description, "description");
        try {
            if (!a()) {
                xb.b("You need call Chartboost.startWithAppId() before tracking in-app purchases", (Throwable) null, 2, (Object) null);
                return;
            }
            if (eventLabel.length() == 0) {
                xb.b("Invalid value: event label cannot be empty or null", (Throwable) null, 2, (Object) null);
                return;
            }
            if (i >= 0 && i2 >= 0) {
                if (description.length() == 0) {
                    xb.b("Invalid value: description cannot be empty or null", (Throwable) null, 2, (Object) null);
                    return;
                }
                JSONArray jSONArray = new JSONArray();
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("event_label", eventLabel);
                jSONObject.put("event_field", type.getLevelType());
                jSONObject.put("main_level", i);
                jSONObject.put("sub_level", i2);
                jSONObject.put("description", description);
                jSONObject.put("timestamp", j);
                jSONObject.put("data_type", "level_info");
                jSONArray.put(jSONObject);
                a(jSONArray);
                return;
            }
            xb.b("Invalid value: Level number should be > 0", (Throwable) null, 2, (Object) null);
        } catch (Exception e) {
            xb.b("", e);
        }
    }

    public final float a(String str) {
        try {
            Matcher matcher = Pattern.compile("(\\d+\\.\\d+)|(\\d+)").matcher(str);
            matcher.find();
            String group = matcher.group();
            if (TextUtils.isEmpty(group)) {
                xb.b("Invalid price object", (Throwable) null, 2, (Object) null);
                return -1.0f;
            }
            Intrinsics.checkNotNull(group);
            return Float.parseFloat(group);
        } catch (IllegalStateException e) {
            xb.b("Invalid price object", e);
            return -1.0f;
        }
    }
}
