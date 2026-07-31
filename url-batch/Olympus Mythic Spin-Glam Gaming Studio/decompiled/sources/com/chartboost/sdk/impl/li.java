package com.chartboost.sdk.impl;

import com.chartboost.sdk.Mediation;
import com.chartboost.sdk.impl.c0;
import com.chartboost.sdk.impl.ci;
import com.facebook.gamingservices.cloudgaming.internal.SDKAnalyticsEvents;
import com.safedk.android.analytics.events.BrandSafetyEvent;
import java.util.Locale;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.json.JSONObject;

/* loaded from: classes10.dex */
public final class li {
    public final Function0 a;

    public static final class a extends Lambda implements Function0 {
        public static final a b = new a();

        public a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final JSONObject mo4828invoke() {
            return new JSONObject();
        }
    }

    public li(Function0 jsonFactory) {
        Intrinsics.checkNotNullParameter(jsonFactory, "jsonFactory");
        this.a = jsonFactory;
    }

    public /* synthetic */ li(Function0 function0, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? a.b : function0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final JSONObject b(JSONObject jSONObject, pi piVar) {
        JSONObject jSONObject2;
        try {
            Result.Companion companion = Result.INSTANCE;
            jSONObject.put("event_name", piVar.f().getValue());
            jSONObject.put("event_message", piVar.e());
            jSONObject.put("event_type", piVar.l().name());
            jSONObject.put("event_timestamp", piVar.j());
            JSONObject put = jSONObject.put("event_latency", piVar.b());
            if (put == null) {
                put = jSONObject;
            }
            jSONObject2 = Result.m8023constructorimpl(put);
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            jSONObject2 = Result.m8023constructorimpl(ResultKt.createFailure(th));
        }
        Throwable m8026exceptionOrNullimpl = Result.m8026exceptionOrNullimpl(jSONObject2);
        if (m8026exceptionOrNullimpl != null) {
            xb.b("Cannot generate tracking body data: ", m8026exceptionOrNullimpl);
        }
        if (Result.m8026exceptionOrNullimpl(jSONObject2) == null) {
            jSONObject = jSONObject2;
        }
        return jSONObject;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final JSONObject c(JSONObject jSONObject, pi piVar) {
        JSONObject jSONObject2;
        JSONObject jSONObject3;
        try {
            Result.Companion companion = Result.INSTANCE;
            Mediation d = piVar.d();
            if (d != null) {
                jSONObject.put("mediation_sdk", d.mediationType);
                jSONObject.put("mediation_sdk_version", d.libraryVersion);
                jSONObject3 = jSONObject.put("mediation_sdk_adapter_version", d.adapterVersion);
            } else {
                jSONObject3 = null;
            }
            if (jSONObject3 == null) {
                jSONObject3 = jSONObject;
            }
            jSONObject2 = Result.m8023constructorimpl(jSONObject3);
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            jSONObject2 = Result.m8023constructorimpl(ResultKt.createFailure(th));
        }
        Throwable m8026exceptionOrNullimpl = Result.m8026exceptionOrNullimpl(jSONObject2);
        if (m8026exceptionOrNullimpl != null) {
            xb.b("Cannot generate tracking body data: ", m8026exceptionOrNullimpl);
        }
        if (Result.m8026exceptionOrNullimpl(jSONObject2) == null) {
            jSONObject = jSONObject2;
        }
        return jSONObject;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00a1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final JSONObject a(JSONObject jSONObject, pi piVar) {
        JSONObject jSONObject2;
        Throwable m8026exceptionOrNullimpl;
        ci k;
        String str;
        ci k2;
        ci k3;
        ci k4;
        JSONObject jSONObject3;
        ci.AdSize c;
        try {
            Result.Companion companion = Result.INSTANCE;
            String lowerCase = piVar.a().toLowerCase(Locale.ROOT);
            Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
            jSONObject.put("ad_type", lowerCase);
            k = piVar.k();
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            jSONObject2 = Result.m8023constructorimpl(ResultKt.createFailure(th));
        }
        if (k != null) {
            str = k.b();
            if (str == null) {
            }
            jSONObject.put("ad_impression_id", str);
            k2 = piVar.k();
            if (k2 != null || (r1 = k2.a()) == null) {
                String str2 = "missing creative id";
            }
            jSONObject.put("ad_creative_id", str2);
            jSONObject.put("ad_location_id", piVar.c());
            k3 = piVar.k();
            if (k3 != null || (r1 = k3.g()) == null) {
                String str3 = "";
            }
            jSONObject.put("template_url", str3);
            k4 = piVar.k();
            if (k4 != null || (c = k4.c()) == null) {
                jSONObject3 = null;
            } else {
                jSONObject.put("ad_height", c.getHeight());
                jSONObject3 = jSONObject.put("ad_width", c.getWidth());
            }
            if (jSONObject3 == null) {
                jSONObject3 = jSONObject;
            }
            jSONObject2 = Result.m8023constructorimpl(jSONObject3);
            m8026exceptionOrNullimpl = Result.m8026exceptionOrNullimpl(jSONObject2);
            if (m8026exceptionOrNullimpl != null) {
                xb.b("Cannot generate tracking body data: ", m8026exceptionOrNullimpl);
            }
            if (Result.m8026exceptionOrNullimpl(jSONObject2) == null) {
                jSONObject = jSONObject2;
            }
            return jSONObject;
        }
        str = "missing impression id";
        jSONObject.put("ad_impression_id", str);
        k2 = piVar.k();
        if (k2 != null) {
        }
        String str22 = "missing creative id";
        jSONObject.put("ad_creative_id", str22);
        jSONObject.put("ad_location_id", piVar.c());
        k3 = piVar.k();
        if (k3 != null) {
        }
        String str32 = "";
        jSONObject.put("template_url", str32);
        k4 = piVar.k();
        if (k4 != null) {
        }
        jSONObject3 = null;
        if (jSONObject3 == null) {
        }
        jSONObject2 = Result.m8023constructorimpl(jSONObject3);
        m8026exceptionOrNullimpl = Result.m8026exceptionOrNullimpl(jSONObject2);
        if (m8026exceptionOrNullimpl != null) {
        }
        if (Result.m8026exceptionOrNullimpl(jSONObject2) == null) {
        }
        return jSONObject;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final JSONObject b(JSONObject jSONObject, j7 j7Var) {
        JSONObject jSONObject2;
        try {
            Result.Companion companion = Result.INSTANCE;
            jSONObject.put("app_id", j7Var.a());
            JSONObject put = jSONObject.put("chartboost_sdk_version", j7Var.g());
            if (put == null) {
                put = jSONObject;
            }
            jSONObject2 = Result.m8023constructorimpl(put);
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            jSONObject2 = Result.m8023constructorimpl(ResultKt.createFailure(th));
        }
        Throwable m8026exceptionOrNullimpl = Result.m8026exceptionOrNullimpl(jSONObject2);
        if (m8026exceptionOrNullimpl != null) {
            xb.b("Cannot generate tracking body data: ", m8026exceptionOrNullimpl);
        }
        if (Result.m8026exceptionOrNullimpl(jSONObject2) == null) {
            jSONObject = jSONObject2;
        }
        return jSONObject;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final JSONObject c(JSONObject jSONObject, j7 j7Var) {
        JSONObject jSONObject2;
        try {
            Result.Companion companion = Result.INSTANCE;
            jSONObject.put(SDKAnalyticsEvents.PARAMETER_SESSION_ID, j7Var.B());
            JSONObject put = jSONObject.put("session_count", j7Var.z());
            if (put == null) {
                put = jSONObject;
            }
            jSONObject2 = Result.m8023constructorimpl(put);
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            jSONObject2 = Result.m8023constructorimpl(ResultKt.createFailure(th));
        }
        Throwable m8026exceptionOrNullimpl = Result.m8026exceptionOrNullimpl(jSONObject2);
        if (m8026exceptionOrNullimpl != null) {
            xb.b("Cannot generate tracking body data: ", m8026exceptionOrNullimpl);
        }
        if (Result.m8026exceptionOrNullimpl(jSONObject2) == null) {
            jSONObject = jSONObject2;
        }
        return jSONObject;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final JSONObject a(JSONObject jSONObject, j7 j7Var) {
        JSONObject jSONObject2;
        try {
            Result.Companion companion = Result.INSTANCE;
            jSONObject.put("device_id", j7Var.m());
            jSONObject.put("device_make", j7Var.p());
            jSONObject.put("device_model", j7Var.q());
            jSONObject.put("device_os_version", j7Var.t());
            jSONObject.put("device_platform", j7Var.u());
            jSONObject.put("device_country", j7Var.l());
            jSONObject.put("device_connection_type", j7Var.k());
            JSONObject put = jSONObject.put(BrandSafetyEvent.aw, j7Var.s());
            if (put == null) {
                put = jSONObject;
            }
            jSONObject2 = Result.m8023constructorimpl(put);
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            jSONObject2 = Result.m8023constructorimpl(ResultKt.createFailure(th));
        }
        Throwable m8026exceptionOrNullimpl = Result.m8026exceptionOrNullimpl(jSONObject2);
        if (m8026exceptionOrNullimpl != null) {
            xb.b("Cannot generate tracking body data: ", m8026exceptionOrNullimpl);
        }
        if (Result.m8026exceptionOrNullimpl(jSONObject2) == null) {
            jSONObject = jSONObject2;
        }
        return jSONObject;
    }

    public final int b(j7 j7Var, String str) {
        if (Intrinsics.areEqual(str, c0.b.g.b())) {
            return j7Var.D();
        }
        if (Intrinsics.areEqual(str, c0.c.g.b())) {
            return j7Var.E();
        }
        if (Intrinsics.areEqual(str, c0.a.g.b())) {
            return j7Var.C();
        }
        return 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final JSONObject a(JSONObject jSONObject, j7 j7Var, String str) {
        JSONObject jSONObject2;
        try {
            Result.Companion companion = Result.INSTANCE;
            JSONObject put = jSONObject.put("payload", a(j7Var, str));
            if (put == null) {
                put = jSONObject;
            }
            jSONObject2 = Result.m8023constructorimpl(put);
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            jSONObject2 = Result.m8023constructorimpl(ResultKt.createFailure(th));
        }
        Throwable m8026exceptionOrNullimpl = Result.m8026exceptionOrNullimpl(jSONObject2);
        if (m8026exceptionOrNullimpl != null) {
            xb.b("Cannot generate tracking body data: ", m8026exceptionOrNullimpl);
        }
        if (Result.m8026exceptionOrNullimpl(jSONObject2) == null) {
            jSONObject = jSONObject2;
        }
        return jSONObject;
    }

    public final String a(pi event, j7 environment) {
        Intrinsics.checkNotNullParameter(event, "event");
        Intrinsics.checkNotNullParameter(environment, "environment");
        String jSONObject = a(a(a(c(c(b(b((JSONObject) this.a.mo4828invoke(), environment), event), environment), event), event), environment), environment, event.a()).toString();
        Intrinsics.checkNotNullExpressionValue(jSONObject, "toString(...)");
        return jSONObject;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final JSONObject a(j7 j7Var, String str) {
        JSONObject jSONObject;
        JSONObject jSONObject2 = (JSONObject) this.a.mo4828invoke();
        try {
            Result.Companion companion = Result.INSTANCE;
            jSONObject2.put("device_battery_level", j7Var.i());
            jSONObject2.put("device_charging_status", j7Var.j());
            jSONObject2.put("device_language", j7Var.n());
            jSONObject2.put("device_timezone", j7Var.w());
            jSONObject2.put("device_volume", j7Var.y());
            jSONObject2.put("device_mute", j7Var.r());
            jSONObject2.put("device_audio_output", j7Var.h());
            jSONObject2.put("device_storage", j7Var.v());
            jSONObject2.put("device_low_memory_warning", j7Var.o());
            jSONObject2.put("device_up_time", j7Var.x());
            jSONObject2.put("chartboost_sdk_autocache_enabled", j7Var.b());
            jSONObject2.put("chartboost_sdk_gdpr", j7Var.e());
            jSONObject2.put("chartboost_sdk_ccpa", j7Var.c());
            jSONObject2.put("chartboost_sdk_coppa", j7Var.d());
            jSONObject2.put("chartboost_sdk_lgpd", j7Var.f());
            jSONObject2.put("session_duration", j7Var.A());
            JSONObject put = jSONObject2.put("session_impression_count", b(j7Var, str));
            if (put == null) {
                put = jSONObject2;
            }
            jSONObject = Result.m8023constructorimpl(put);
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            jSONObject = Result.m8023constructorimpl(ResultKt.createFailure(th));
        }
        Throwable m8026exceptionOrNullimpl = Result.m8026exceptionOrNullimpl(jSONObject);
        if (m8026exceptionOrNullimpl != null) {
            xb.b("Cannot generate tracking body data: ", m8026exceptionOrNullimpl);
        }
        if (Result.m8026exceptionOrNullimpl(jSONObject) == null) {
            jSONObject2 = jSONObject;
        }
        return jSONObject2;
    }
}
