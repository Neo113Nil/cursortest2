package com.chartboost.sdk.impl;

import android.content.Context;
import android.os.BatteryManager;
import android.os.Build;
import com.pubmatic.sdk.openwrap.core.POBConstants;
import io.appmetrica.analytics.networktasks.internal.CommonUrlParts;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public final class q6 implements bi {
    public static final a e = new a(null);
    public final Context a;
    public final y2 b;
    public final l6 c;
    public final String d;

    public q6(Context context, y2 identity, l6 l6Var) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(identity, "identity");
        this.a = context;
        this.b = identity;
        this.c = l6Var;
        this.d = "device";
    }

    public static final class a {
        public a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Override // com.chartboost.sdk.impl.bi
    public JSONObject a() {
        s9 h = this.b.h();
        Double b = b();
        y3 a2 = new z3().a(this.a);
        String b2 = k5.g(this.a).b();
        l6 l6Var = this.c;
        Integer valueOf = l6Var != null ? Integer.valueOf(l6Var.f()) : null;
        l6 l6Var2 = this.c;
        Integer valueOf2 = l6Var2 != null ? Integer.valueOf(l6Var2.e()) : null;
        l6 l6Var3 = this.c;
        Integer valueOf3 = l6Var3 != null ? Integer.valueOf(l6Var3.j()) : null;
        String f = k7.a.f();
        int i = h.f() == xi.e ? 1 : 0;
        String str = Build.MANUFACTURER;
        String str2 = Build.MODEL;
        String str3 = "Android " + Build.VERSION.RELEASE;
        l6 l6Var4 = this.c;
        Float valueOf4 = l6Var4 != null ? Float.valueOf(l6Var4.h()) : null;
        String a3 = kj.b.a();
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("battery_level", b);
        jSONObject.put("carrier", a2 != null ? a2.d() : null);
        jSONObject.put("connection_type", b2);
        jSONObject.put(CommonUrlParts.DEVICE_TYPE, valueOf);
        jSONObject.put("display_height", valueOf2);
        jSONObject.put("display_width", valueOf3);
        jSONObject.put(POBConstants.KEY_LANGUAGE, f);
        jSONObject.put("lmt", i);
        jSONObject.put("make", str);
        jSONObject.put("model", str2);
        jSONObject.put("os", "Android");
        jSONObject.put(CommonUrlParts.OS_VERSION, str3);
        jSONObject.put("pixel_ratio", valueOf4);
        jSONObject.put("user_agent", a3);
        return jSONObject;
    }

    public final Double b() {
        int intProperty;
        try {
            Object systemService = this.a.getSystemService("batterymanager");
            BatteryManager batteryManager = systemService instanceof BatteryManager ? (BatteryManager) systemService : null;
            if (batteryManager == null || (intProperty = batteryManager.getIntProperty(4)) < 0 || intProperty >= 101) {
                return null;
            }
            return Double.valueOf(intProperty / 100.0d);
        } catch (Exception unused) {
            return null;
        }
    }
}
