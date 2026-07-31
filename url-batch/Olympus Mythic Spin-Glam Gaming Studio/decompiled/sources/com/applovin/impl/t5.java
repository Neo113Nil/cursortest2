package com.applovin.impl;

import android.app.ActivityManager;
import android.net.Uri;
import android.os.SystemClock;
import com.applovin.impl.d6;
import com.applovin.impl.sdk.l;
import com.applovin.impl.sdk.utils.CollectionUtils;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.impl.u4;
import com.applovin.impl.v;
import com.applovin.sdk.AppLovinSdk;
import com.facebook.gamingservices.cloudgaming.internal.SDKAnalyticsEvents;
import com.google.android.gms.security.ProviderInstaller;
import com.pubmatic.sdk.openwrap.core.POBConstants;
import com.safedk.android.utils.SdksMapping;
import io.appmetrica.analytics.networktasks.internal.CommonUrlParts;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes8.dex */
public class t5 extends i5 {
    private static final AtomicBoolean j = new AtomicBoolean();
    private final int g;
    private final Object h;
    private b i;

    public interface b {
        void a(JSONObject jSONObject);
    }

    private class c extends i5 {
        public c(com.applovin.impl.sdk.k kVar) {
            super("TaskTimeoutFetchBasicSettings", kVar, true);
        }

        @Override // java.lang.Runnable
        public void run() {
            if (t5.this.i != null) {
                if (com.applovin.impl.sdk.o.a()) {
                    this.c.b(this.b, "Timing out fetch basic settings...");
                }
                t5.this.a(new JSONObject());
            }
        }
    }

    public t5(int i, com.applovin.impl.sdk.k kVar, b bVar) {
        super("TaskFetchBasicSettings", kVar, true);
        this.h = new Object();
        this.g = i;
        this.i = bVar;
    }

    private HashMap b(String str) {
        return a(str, 0L, 0, null, null);
    }

    private String f() {
        return r0.a((String) this.a.a(x4.k0), "5.0/i", b());
    }

    private String g() {
        return r0.a((String) this.a.a(x4.j0), "5.0/i", b());
    }

    /* JADX WARN: Can't wrap try/catch for region: R(43:0|1|2|3|(39:5|(1:7)|8|(1:10)|11|(1:13)|14|(1:16)|17|(1:19)|20|(1:22)(1:78)|(1:26)|27|(1:29)|30|(1:32)|33|(1:35)|36|37|(1:39)|41|(1:47)|48|(1:53)|54|(1:56)|57|(1:59)|60|(1:62)|63|(1:65)|66|(1:70)|71|(1:73)|75)|79|8|(0)|11|(0)|14|(0)|17|(0)|20|(0)(0)|(2:24|26)|27|(0)|30|(0)|33|(0)|36|37|(0)|41|(3:43|45|47)|48|(2:51|53)|54|(0)|57|(0)|60|(0)|63|(0)|66|(2:68|70)|71|(0)|75) */
    /* JADX WARN: Removed duplicated region for block: B:10:0x00a1 A[Catch: JSONException -> 0x0062, TryCatch #0 {JSONException -> 0x0062, blocks: (B:3:0x0041, B:5:0x0053, B:8:0x0072, B:10:0x00a1, B:11:0x00a6, B:13:0x00ae, B:14:0x00b3, B:16:0x013d, B:17:0x0145, B:19:0x0151, B:20:0x0159, B:22:0x0161, B:24:0x016f, B:26:0x0175, B:27:0x0186, B:29:0x019c, B:30:0x01a1, B:32:0x0227, B:33:0x022c, B:35:0x023c, B:41:0x027d, B:43:0x02b9, B:45:0x02c3, B:47:0x02cb, B:48:0x02d4, B:51:0x02f0, B:53:0x02f8, B:54:0x0306, B:56:0x0316, B:57:0x0321, B:59:0x0331, B:60:0x033c, B:62:0x034c, B:63:0x0357, B:65:0x036e, B:66:0x0374, B:68:0x0380, B:70:0x0386, B:71:0x038b, B:73:0x03ab, B:79:0x0065), top: B:2:0x0041 }] */
    /* JADX WARN: Removed duplicated region for block: B:13:0x00ae A[Catch: JSONException -> 0x0062, TryCatch #0 {JSONException -> 0x0062, blocks: (B:3:0x0041, B:5:0x0053, B:8:0x0072, B:10:0x00a1, B:11:0x00a6, B:13:0x00ae, B:14:0x00b3, B:16:0x013d, B:17:0x0145, B:19:0x0151, B:20:0x0159, B:22:0x0161, B:24:0x016f, B:26:0x0175, B:27:0x0186, B:29:0x019c, B:30:0x01a1, B:32:0x0227, B:33:0x022c, B:35:0x023c, B:41:0x027d, B:43:0x02b9, B:45:0x02c3, B:47:0x02cb, B:48:0x02d4, B:51:0x02f0, B:53:0x02f8, B:54:0x0306, B:56:0x0316, B:57:0x0321, B:59:0x0331, B:60:0x033c, B:62:0x034c, B:63:0x0357, B:65:0x036e, B:66:0x0374, B:68:0x0380, B:70:0x0386, B:71:0x038b, B:73:0x03ab, B:79:0x0065), top: B:2:0x0041 }] */
    /* JADX WARN: Removed duplicated region for block: B:16:0x013d A[Catch: JSONException -> 0x0062, TryCatch #0 {JSONException -> 0x0062, blocks: (B:3:0x0041, B:5:0x0053, B:8:0x0072, B:10:0x00a1, B:11:0x00a6, B:13:0x00ae, B:14:0x00b3, B:16:0x013d, B:17:0x0145, B:19:0x0151, B:20:0x0159, B:22:0x0161, B:24:0x016f, B:26:0x0175, B:27:0x0186, B:29:0x019c, B:30:0x01a1, B:32:0x0227, B:33:0x022c, B:35:0x023c, B:41:0x027d, B:43:0x02b9, B:45:0x02c3, B:47:0x02cb, B:48:0x02d4, B:51:0x02f0, B:53:0x02f8, B:54:0x0306, B:56:0x0316, B:57:0x0321, B:59:0x0331, B:60:0x033c, B:62:0x034c, B:63:0x0357, B:65:0x036e, B:66:0x0374, B:68:0x0380, B:70:0x0386, B:71:0x038b, B:73:0x03ab, B:79:0x0065), top: B:2:0x0041 }] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0151 A[Catch: JSONException -> 0x0062, TryCatch #0 {JSONException -> 0x0062, blocks: (B:3:0x0041, B:5:0x0053, B:8:0x0072, B:10:0x00a1, B:11:0x00a6, B:13:0x00ae, B:14:0x00b3, B:16:0x013d, B:17:0x0145, B:19:0x0151, B:20:0x0159, B:22:0x0161, B:24:0x016f, B:26:0x0175, B:27:0x0186, B:29:0x019c, B:30:0x01a1, B:32:0x0227, B:33:0x022c, B:35:0x023c, B:41:0x027d, B:43:0x02b9, B:45:0x02c3, B:47:0x02cb, B:48:0x02d4, B:51:0x02f0, B:53:0x02f8, B:54:0x0306, B:56:0x0316, B:57:0x0321, B:59:0x0331, B:60:0x033c, B:62:0x034c, B:63:0x0357, B:65:0x036e, B:66:0x0374, B:68:0x0380, B:70:0x0386, B:71:0x038b, B:73:0x03ab, B:79:0x0065), top: B:2:0x0041 }] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0161 A[Catch: JSONException -> 0x0062, TryCatch #0 {JSONException -> 0x0062, blocks: (B:3:0x0041, B:5:0x0053, B:8:0x0072, B:10:0x00a1, B:11:0x00a6, B:13:0x00ae, B:14:0x00b3, B:16:0x013d, B:17:0x0145, B:19:0x0151, B:20:0x0159, B:22:0x0161, B:24:0x016f, B:26:0x0175, B:27:0x0186, B:29:0x019c, B:30:0x01a1, B:32:0x0227, B:33:0x022c, B:35:0x023c, B:41:0x027d, B:43:0x02b9, B:45:0x02c3, B:47:0x02cb, B:48:0x02d4, B:51:0x02f0, B:53:0x02f8, B:54:0x0306, B:56:0x0316, B:57:0x0321, B:59:0x0331, B:60:0x033c, B:62:0x034c, B:63:0x0357, B:65:0x036e, B:66:0x0374, B:68:0x0380, B:70:0x0386, B:71:0x038b, B:73:0x03ab, B:79:0x0065), top: B:2:0x0041 }] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x019c A[Catch: JSONException -> 0x0062, TryCatch #0 {JSONException -> 0x0062, blocks: (B:3:0x0041, B:5:0x0053, B:8:0x0072, B:10:0x00a1, B:11:0x00a6, B:13:0x00ae, B:14:0x00b3, B:16:0x013d, B:17:0x0145, B:19:0x0151, B:20:0x0159, B:22:0x0161, B:24:0x016f, B:26:0x0175, B:27:0x0186, B:29:0x019c, B:30:0x01a1, B:32:0x0227, B:33:0x022c, B:35:0x023c, B:41:0x027d, B:43:0x02b9, B:45:0x02c3, B:47:0x02cb, B:48:0x02d4, B:51:0x02f0, B:53:0x02f8, B:54:0x0306, B:56:0x0316, B:57:0x0321, B:59:0x0331, B:60:0x033c, B:62:0x034c, B:63:0x0357, B:65:0x036e, B:66:0x0374, B:68:0x0380, B:70:0x0386, B:71:0x038b, B:73:0x03ab, B:79:0x0065), top: B:2:0x0041 }] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0227 A[Catch: JSONException -> 0x0062, TryCatch #0 {JSONException -> 0x0062, blocks: (B:3:0x0041, B:5:0x0053, B:8:0x0072, B:10:0x00a1, B:11:0x00a6, B:13:0x00ae, B:14:0x00b3, B:16:0x013d, B:17:0x0145, B:19:0x0151, B:20:0x0159, B:22:0x0161, B:24:0x016f, B:26:0x0175, B:27:0x0186, B:29:0x019c, B:30:0x01a1, B:32:0x0227, B:33:0x022c, B:35:0x023c, B:41:0x027d, B:43:0x02b9, B:45:0x02c3, B:47:0x02cb, B:48:0x02d4, B:51:0x02f0, B:53:0x02f8, B:54:0x0306, B:56:0x0316, B:57:0x0321, B:59:0x0331, B:60:0x033c, B:62:0x034c, B:63:0x0357, B:65:0x036e, B:66:0x0374, B:68:0x0380, B:70:0x0386, B:71:0x038b, B:73:0x03ab, B:79:0x0065), top: B:2:0x0041 }] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x023c A[Catch: JSONException -> 0x0062, TRY_LEAVE, TryCatch #0 {JSONException -> 0x0062, blocks: (B:3:0x0041, B:5:0x0053, B:8:0x0072, B:10:0x00a1, B:11:0x00a6, B:13:0x00ae, B:14:0x00b3, B:16:0x013d, B:17:0x0145, B:19:0x0151, B:20:0x0159, B:22:0x0161, B:24:0x016f, B:26:0x0175, B:27:0x0186, B:29:0x019c, B:30:0x01a1, B:32:0x0227, B:33:0x022c, B:35:0x023c, B:41:0x027d, B:43:0x02b9, B:45:0x02c3, B:47:0x02cb, B:48:0x02d4, B:51:0x02f0, B:53:0x02f8, B:54:0x0306, B:56:0x0316, B:57:0x0321, B:59:0x0331, B:60:0x033c, B:62:0x034c, B:63:0x0357, B:65:0x036e, B:66:0x0374, B:68:0x0380, B:70:0x0386, B:71:0x038b, B:73:0x03ab, B:79:0x0065), top: B:2:0x0041 }] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x025e A[Catch: all -> 0x027d, TRY_LEAVE, TryCatch #1 {all -> 0x027d, blocks: (B:37:0x024b, B:39:0x025e), top: B:36:0x024b }] */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0316 A[Catch: JSONException -> 0x0062, TryCatch #0 {JSONException -> 0x0062, blocks: (B:3:0x0041, B:5:0x0053, B:8:0x0072, B:10:0x00a1, B:11:0x00a6, B:13:0x00ae, B:14:0x00b3, B:16:0x013d, B:17:0x0145, B:19:0x0151, B:20:0x0159, B:22:0x0161, B:24:0x016f, B:26:0x0175, B:27:0x0186, B:29:0x019c, B:30:0x01a1, B:32:0x0227, B:33:0x022c, B:35:0x023c, B:41:0x027d, B:43:0x02b9, B:45:0x02c3, B:47:0x02cb, B:48:0x02d4, B:51:0x02f0, B:53:0x02f8, B:54:0x0306, B:56:0x0316, B:57:0x0321, B:59:0x0331, B:60:0x033c, B:62:0x034c, B:63:0x0357, B:65:0x036e, B:66:0x0374, B:68:0x0380, B:70:0x0386, B:71:0x038b, B:73:0x03ab, B:79:0x0065), top: B:2:0x0041 }] */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0331 A[Catch: JSONException -> 0x0062, TryCatch #0 {JSONException -> 0x0062, blocks: (B:3:0x0041, B:5:0x0053, B:8:0x0072, B:10:0x00a1, B:11:0x00a6, B:13:0x00ae, B:14:0x00b3, B:16:0x013d, B:17:0x0145, B:19:0x0151, B:20:0x0159, B:22:0x0161, B:24:0x016f, B:26:0x0175, B:27:0x0186, B:29:0x019c, B:30:0x01a1, B:32:0x0227, B:33:0x022c, B:35:0x023c, B:41:0x027d, B:43:0x02b9, B:45:0x02c3, B:47:0x02cb, B:48:0x02d4, B:51:0x02f0, B:53:0x02f8, B:54:0x0306, B:56:0x0316, B:57:0x0321, B:59:0x0331, B:60:0x033c, B:62:0x034c, B:63:0x0357, B:65:0x036e, B:66:0x0374, B:68:0x0380, B:70:0x0386, B:71:0x038b, B:73:0x03ab, B:79:0x0065), top: B:2:0x0041 }] */
    /* JADX WARN: Removed duplicated region for block: B:62:0x034c A[Catch: JSONException -> 0x0062, TryCatch #0 {JSONException -> 0x0062, blocks: (B:3:0x0041, B:5:0x0053, B:8:0x0072, B:10:0x00a1, B:11:0x00a6, B:13:0x00ae, B:14:0x00b3, B:16:0x013d, B:17:0x0145, B:19:0x0151, B:20:0x0159, B:22:0x0161, B:24:0x016f, B:26:0x0175, B:27:0x0186, B:29:0x019c, B:30:0x01a1, B:32:0x0227, B:33:0x022c, B:35:0x023c, B:41:0x027d, B:43:0x02b9, B:45:0x02c3, B:47:0x02cb, B:48:0x02d4, B:51:0x02f0, B:53:0x02f8, B:54:0x0306, B:56:0x0316, B:57:0x0321, B:59:0x0331, B:60:0x033c, B:62:0x034c, B:63:0x0357, B:65:0x036e, B:66:0x0374, B:68:0x0380, B:70:0x0386, B:71:0x038b, B:73:0x03ab, B:79:0x0065), top: B:2:0x0041 }] */
    /* JADX WARN: Removed duplicated region for block: B:65:0x036e A[Catch: JSONException -> 0x0062, TryCatch #0 {JSONException -> 0x0062, blocks: (B:3:0x0041, B:5:0x0053, B:8:0x0072, B:10:0x00a1, B:11:0x00a6, B:13:0x00ae, B:14:0x00b3, B:16:0x013d, B:17:0x0145, B:19:0x0151, B:20:0x0159, B:22:0x0161, B:24:0x016f, B:26:0x0175, B:27:0x0186, B:29:0x019c, B:30:0x01a1, B:32:0x0227, B:33:0x022c, B:35:0x023c, B:41:0x027d, B:43:0x02b9, B:45:0x02c3, B:47:0x02cb, B:48:0x02d4, B:51:0x02f0, B:53:0x02f8, B:54:0x0306, B:56:0x0316, B:57:0x0321, B:59:0x0331, B:60:0x033c, B:62:0x034c, B:63:0x0357, B:65:0x036e, B:66:0x0374, B:68:0x0380, B:70:0x0386, B:71:0x038b, B:73:0x03ab, B:79:0x0065), top: B:2:0x0041 }] */
    /* JADX WARN: Removed duplicated region for block: B:73:0x03ab A[Catch: JSONException -> 0x0062, TRY_LEAVE, TryCatch #0 {JSONException -> 0x0062, blocks: (B:3:0x0041, B:5:0x0053, B:8:0x0072, B:10:0x00a1, B:11:0x00a6, B:13:0x00ae, B:14:0x00b3, B:16:0x013d, B:17:0x0145, B:19:0x0151, B:20:0x0159, B:22:0x0161, B:24:0x016f, B:26:0x0175, B:27:0x0186, B:29:0x019c, B:30:0x01a1, B:32:0x0227, B:33:0x022c, B:35:0x023c, B:41:0x027d, B:43:0x02b9, B:45:0x02c3, B:47:0x02cb, B:48:0x02d4, B:51:0x02f0, B:53:0x02f8, B:54:0x0306, B:56:0x0316, B:57:0x0321, B:59:0x0331, B:60:0x033c, B:62:0x034c, B:63:0x0357, B:65:0x036e, B:66:0x0374, B:68:0x0380, B:70:0x0386, B:71:0x038b, B:73:0x03ab, B:79:0x0065), top: B:2:0x0041 }] */
    /* JADX WARN: Removed duplicated region for block: B:78:0x016c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    protected JSONObject e() {
        com.applovin.impl.sdk.k kVar;
        x4 x4Var;
        List list;
        List list2;
        List<String> adUnitIds;
        Object obj;
        Object obj2;
        v.a f;
        l.b H;
        List b2;
        Map k0;
        ActivityManager activityManager;
        JSONObject jSONObject = new JSONObject();
        try {
            kVar = this.a;
            x4Var = x4.z5;
        } catch (JSONException e) {
            if (com.applovin.impl.sdk.o.a()) {
                this.c.a(this.b, "Failed to create JSON body", e);
            }
            this.a.D().a(this.b, "createJSONBody", e);
        }
        if (!((Boolean) kVar.a(x4Var)).booleanValue()) {
            if (((Boolean) this.a.a(x4Var)).booleanValue()) {
            }
            jSONObject.put("sdk_version", AppLovinSdk.VERSION);
            JsonUtils.putStringIfValid(jSONObject, "ad_review_sdk_version", j.b());
            jSONObject.put("init_count", this.g);
            jSONObject.put("server_installed_at", this.a.a(x4.o));
            if (this.a.C0()) {
                jSONObject.put("first_install", true);
            }
            if (!this.a.z0()) {
                jSONObject.put("first_install_v2", true);
            }
            JsonUtils.putStringIfValid(jSONObject, "process_name", n7.c(a()));
            JsonUtils.putBooleanIfValid(jSONObject, "is_main_process", n7.i(a()));
            JsonUtils.putStringIfValid(jSONObject, "plugin_version", (String) this.a.a(x4.L3));
            JsonUtils.putStringIfValid(jSONObject, "mediation_provider", this.a.V());
            JsonUtils.putStringIfValid(jSONObject, "mediation_provider_v2", this.a.C());
            jSONObject.put(SdksMapping.KEY_INSTALLED_MEDIATION_ADAPTERS, w3.b(this.a));
            Map G = this.a.A().G();
            jSONObject.put("package_name", G.get("package_name"));
            jSONObject.put("app_version", G.get("app_version"));
            jSONObject.put("debug", G.get("debug"));
            jSONObject.put("tg", G.get("tg"));
            jSONObject.put("target_sdk", G.get("target_sdk"));
            jSONObject.put(SDKAnalyticsEvents.PARAMETER_SESSION_ID, G.get(SDKAnalyticsEvents.PARAMETER_SESSION_ID));
            list = (List) G.get("application_start_info");
            if (!CollectionUtils.isEmpty(list)) {
                JsonUtils.putJsonArray(jSONObject, "application_start_info", new JSONArray((Collection) list));
            }
            list2 = (List) G.get("application_exit_info");
            if (!CollectionUtils.isEmpty(list2)) {
                JsonUtils.putJsonArray(jSONObject, "application_exit_info", new JSONArray((Collection) list2));
            }
            adUnitIds = this.a.J() == null ? this.a.J().getAdUnitIds() : null;
            if (adUnitIds != null && adUnitIds.size() > 0) {
                List<String> removeTrimmedEmptyStrings = CollectionUtils.removeTrimmedEmptyStrings(adUnitIds);
                jSONObject.put("ad_unit_ids", CollectionUtils.implode(removeTrimmedEmptyStrings, removeTrimmedEmptyStrings.size()));
            }
            jSONObject.put("IABTCF_TCString", G.get("IABTCF_TCString"));
            jSONObject.put(POBConstants.DEFAULT_SHARED_PREFERENCE_GDPR_STATE_KEY, G.get(POBConstants.DEFAULT_SHARED_PREFERENCE_GDPR_STATE_KEY));
            obj = G.get("IABTCF_AddtlConsent");
            if (obj instanceof String) {
                JsonUtils.putStringIfValid(jSONObject, "IABTCF_AddtlConsent", (String) obj);
            }
            jSONObject.put("consent_flow_info", this.a.x().b());
            Map N = this.a.A().N();
            jSONObject.put("platform", N.get("platform"));
            jSONObject.put("os", N.get("os"));
            jSONObject.put(CommonUrlParts.LOCALE, N.get(CommonUrlParts.LOCALE));
            jSONObject.put("brand", N.get("brand"));
            jSONObject.put("brand_name", N.get("brand_name"));
            jSONObject.put("hardware", N.get("hardware"));
            jSONObject.put("model", N.get("model"));
            jSONObject.put("revision", N.get("revision"));
            jSONObject.put("is_tablet", N.get("is_tablet"));
            jSONObject.put("screen_size_in", N.get("screen_size_in"));
            jSONObject.put("supported_abis", N.get("supported_abis"));
            obj2 = N.get("video_decoders");
            if (obj2 != null) {
                jSONObject.put("video_decoders", obj2);
            }
            if (((Boolean) this.a.a(x4.W3)).booleanValue()) {
                jSONObject.put("mtl", this.a.m0().getLastTrimMemoryLevel());
            }
            activityManager = (ActivityManager) com.applovin.impl.sdk.k.o().getSystemService("activity");
            ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
            if (activityManager != null) {
                activityManager.getMemoryInfo(memoryInfo);
                jSONObject.put("fm", memoryInfo.availMem);
                jSONObject.put("tm", memoryInfo.totalMem);
                jSONObject.put("lmt", memoryInfo.threshold);
                jSONObject.put("lm", memoryInfo.lowMemory);
            }
            f = this.a.A().f();
            jSONObject.put("dnt", f.c());
            jSONObject.put("dnt_code", f.b().b());
            Boolean b3 = p0.c().b(a());
            if (((Boolean) this.a.a(x4.G3)).booleanValue() && StringUtils.isValidString(f.a()) && !Boolean.TRUE.equals(b3)) {
                jSONObject.put("idfa", f.a());
            }
            H = this.a.A().H();
            if (((Boolean) this.a.a(x4.z3)).booleanValue() && H != null && !Boolean.TRUE.equals(b3)) {
                jSONObject.put("idfv", H.a);
                jSONObject.put("idfv_scope", H.b);
            }
            if (((Boolean) this.a.a(x4.C3)).booleanValue()) {
                jSONObject.put("compass_random_token", this.a.u());
            }
            if (((Boolean) this.a.a(x4.E3)).booleanValue()) {
                jSONObject.put("applovin_random_token", this.a.h0());
            }
            if (((Boolean) this.a.a(x4.I3)).booleanValue()) {
                JsonUtils.putStringIfValid(jSONObject, "art", this.a.r());
            }
            JsonUtils.putStringIfValid(jSONObject, "eventid", this.a.E());
            if (this.a.s0().c()) {
                jSONObject.put("test_mode", true);
            }
            b2 = this.a.s0().b();
            if (b2 != null && !b2.isEmpty()) {
                jSONObject.put("test_mode_networks", b2);
            }
            jSONObject.put("sdk_extra_parameters", new JSONObject(this.a.n0().getExtraParameters()));
            k0 = this.a.k0();
            if (!CollectionUtils.isEmpty(k0)) {
                jSONObject.put("segments", new JSONObject(k0));
            }
            return jSONObject;
        }
        jSONObject.put(com.safedk.android.analytics.brandsafety.m.x, UUID.randomUUID().toString());
        jSONObject.put("sdk_version", AppLovinSdk.VERSION);
        JsonUtils.putStringIfValid(jSONObject, "ad_review_sdk_version", j.b());
        jSONObject.put("init_count", this.g);
        jSONObject.put("server_installed_at", this.a.a(x4.o));
        if (this.a.C0()) {
        }
        if (!this.a.z0()) {
        }
        JsonUtils.putStringIfValid(jSONObject, "process_name", n7.c(a()));
        JsonUtils.putBooleanIfValid(jSONObject, "is_main_process", n7.i(a()));
        JsonUtils.putStringIfValid(jSONObject, "plugin_version", (String) this.a.a(x4.L3));
        JsonUtils.putStringIfValid(jSONObject, "mediation_provider", this.a.V());
        JsonUtils.putStringIfValid(jSONObject, "mediation_provider_v2", this.a.C());
        jSONObject.put(SdksMapping.KEY_INSTALLED_MEDIATION_ADAPTERS, w3.b(this.a));
        Map G2 = this.a.A().G();
        jSONObject.put("package_name", G2.get("package_name"));
        jSONObject.put("app_version", G2.get("app_version"));
        jSONObject.put("debug", G2.get("debug"));
        jSONObject.put("tg", G2.get("tg"));
        jSONObject.put("target_sdk", G2.get("target_sdk"));
        jSONObject.put(SDKAnalyticsEvents.PARAMETER_SESSION_ID, G2.get(SDKAnalyticsEvents.PARAMETER_SESSION_ID));
        list = (List) G2.get("application_start_info");
        if (!CollectionUtils.isEmpty(list)) {
        }
        list2 = (List) G2.get("application_exit_info");
        if (!CollectionUtils.isEmpty(list2)) {
        }
        if (this.a.J() == null) {
        }
        if (adUnitIds != null) {
            List<String> removeTrimmedEmptyStrings2 = CollectionUtils.removeTrimmedEmptyStrings(adUnitIds);
            jSONObject.put("ad_unit_ids", CollectionUtils.implode(removeTrimmedEmptyStrings2, removeTrimmedEmptyStrings2.size()));
        }
        jSONObject.put("IABTCF_TCString", G2.get("IABTCF_TCString"));
        jSONObject.put(POBConstants.DEFAULT_SHARED_PREFERENCE_GDPR_STATE_KEY, G2.get(POBConstants.DEFAULT_SHARED_PREFERENCE_GDPR_STATE_KEY));
        obj = G2.get("IABTCF_AddtlConsent");
        if (obj instanceof String) {
        }
        jSONObject.put("consent_flow_info", this.a.x().b());
        Map N2 = this.a.A().N();
        jSONObject.put("platform", N2.get("platform"));
        jSONObject.put("os", N2.get("os"));
        jSONObject.put(CommonUrlParts.LOCALE, N2.get(CommonUrlParts.LOCALE));
        jSONObject.put("brand", N2.get("brand"));
        jSONObject.put("brand_name", N2.get("brand_name"));
        jSONObject.put("hardware", N2.get("hardware"));
        jSONObject.put("model", N2.get("model"));
        jSONObject.put("revision", N2.get("revision"));
        jSONObject.put("is_tablet", N2.get("is_tablet"));
        jSONObject.put("screen_size_in", N2.get("screen_size_in"));
        jSONObject.put("supported_abis", N2.get("supported_abis"));
        obj2 = N2.get("video_decoders");
        if (obj2 != null) {
        }
        if (((Boolean) this.a.a(x4.W3)).booleanValue()) {
        }
        activityManager = (ActivityManager) com.applovin.impl.sdk.k.o().getSystemService("activity");
        ActivityManager.MemoryInfo memoryInfo2 = new ActivityManager.MemoryInfo();
        if (activityManager != null) {
        }
        f = this.a.A().f();
        jSONObject.put("dnt", f.c());
        jSONObject.put("dnt_code", f.b().b());
        Boolean b32 = p0.c().b(a());
        if (((Boolean) this.a.a(x4.G3)).booleanValue()) {
            jSONObject.put("idfa", f.a());
        }
        H = this.a.A().H();
        if (((Boolean) this.a.a(x4.z3)).booleanValue()) {
            jSONObject.put("idfv", H.a);
            jSONObject.put("idfv_scope", H.b);
        }
        if (((Boolean) this.a.a(x4.C3)).booleanValue()) {
        }
        if (((Boolean) this.a.a(x4.E3)).booleanValue()) {
        }
        if (((Boolean) this.a.a(x4.I3)).booleanValue()) {
        }
        JsonUtils.putStringIfValid(jSONObject, "eventid", this.a.E());
        if (this.a.s0().c()) {
        }
        b2 = this.a.s0().b();
        if (b2 != null) {
            jSONObject.put("test_mode_networks", b2);
        }
        jSONObject.put("sdk_extra_parameters", new JSONObject(this.a.n0().getExtraParameters()));
        k0 = this.a.k0();
        if (!CollectionUtils.isEmpty(k0)) {
        }
        return jSONObject;
    }

    protected Map h() {
        HashMap hashMap = new HashMap();
        if (!((Boolean) this.a.a(x4.A5)).booleanValue() && !((Boolean) this.a.a(x4.z5)).booleanValue()) {
            hashMap.put(com.safedk.android.analytics.brandsafety.m.x, UUID.randomUUID().toString());
        }
        if (!((Boolean) this.a.a(x4.k5)).booleanValue()) {
            hashMap.put("sdk_key", this.a.i0());
        }
        CollectionUtils.putStringIfValid("connectEventKey", this.a.q(), hashMap);
        Boolean b2 = p0.b().b(a());
        if (b2 != null) {
            hashMap.put("huc", b2.toString());
        }
        Boolean b3 = p0.c().b(a());
        if (b3 != null) {
            hashMap.put("aru", b3.toString());
        }
        Boolean b4 = p0.a().b(a());
        if (b4 != null) {
            hashMap.put("dns", b4.toString());
        }
        return hashMap;
    }

    @Override // java.lang.Runnable
    public void run() {
        if (!o0.i() && j.compareAndSet(false, true)) {
            try {
                ProviderInstaller.installIfNeeded(com.applovin.impl.sdk.k.o());
            } catch (Throwable th) {
                if (com.applovin.impl.sdk.o.a()) {
                    this.c.a(this.b, "Cannot update security provider", th);
                }
            }
        }
        this.a.v0().d(d2.g, b(g()));
        long elapsedRealtime = SystemClock.elapsedRealtime();
        com.applovin.impl.sdk.network.a a2 = com.applovin.impl.sdk.network.a.a(this.a).b(g()).a(f()).b(h()).a(e()).b(((Boolean) this.a.a(x4.L5)).booleanValue()).c("POST").a((Object) new JSONObject()).a(((Integer) this.a.a(x4.c3)).intValue()).b(((Integer) this.a.a(x4.f3)).intValue()).c(((Integer) this.a.a(x4.b3)).intValue()).e(((Boolean) this.a.a(x4.o3)).booleanValue()).a(u4.a.a(((Integer) this.a.a(x4.p5)).intValue())).f(true).a();
        this.a.q0().a(new c(this.a), d6.b.TIMEOUT, ((Integer) this.a.a(r3)).intValue() + 250);
        a aVar = new a(a2, this.a, d(), elapsedRealtime);
        aVar.c(x4.j0);
        aVar.b(x4.k0);
        this.a.q0().a(aVar);
    }

    class a extends l6 {
        final /* synthetic */ long m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(com.applovin.impl.sdk.network.a aVar, com.applovin.impl.sdk.k kVar, boolean z, long j) {
            super(aVar, kVar, z);
            this.m = j;
        }

        @Override // com.applovin.impl.l6, com.applovin.impl.q0.e
        public void a(String str, JSONObject jSONObject, int i) {
            long elapsedRealtime = SystemClock.elapsedRealtime() - this.m;
            t5.this.a(jSONObject);
            this.a.v0().d(d2.h, t5.this.a(str, elapsedRealtime, i, jSONObject, null));
        }

        @Override // com.applovin.impl.l6, com.applovin.impl.q0.e
        public void a(String str, int i, String str2, JSONObject jSONObject) {
            if (com.applovin.impl.sdk.o.a()) {
                this.c.b(this.b, "Unable to fetch basic SDK settings: server returned " + i);
            }
            long elapsedRealtime = SystemClock.elapsedRealtime() - this.m;
            t5.this.a(jSONObject != null ? jSONObject : new JSONObject());
            this.a.v0().d(d2.i, t5.this.a(str, elapsedRealtime, i, jSONObject, str2));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public HashMap a(String str, long j2, int i, JSONObject jSONObject, String str2) {
        Uri build = Uri.parse(str).buildUpon().clearQuery().build();
        JSONObject jSONObject2 = new JSONObject();
        JsonUtils.putString(jSONObject2, "domain", build.getHost());
        if (jSONObject != null) {
            JSONArray jSONArray = JsonUtils.getJSONArray(jSONObject, "signal_providers", null);
            JSONArray jSONArray2 = JsonUtils.getJSONArray(jSONObject, "auto_init_adapters", null);
            if (jSONArray != null) {
                JsonUtils.putInt(jSONObject2, "signal_provider_count", jSONArray.length());
            }
            if (jSONArray2 != null) {
                JsonUtils.putInt(jSONObject2, "auto_init_adapter_count", jSONArray2.length());
            }
        }
        HashMap hashMap = new HashMap();
        hashMap.put("attempt_number", Integer.toString(this.g));
        hashMap.put("error_message", str2);
        hashMap.put("url", build.toString());
        hashMap.put("details", jSONObject2.toString());
        hashMap.put("duration_ms", Long.toString(j2));
        hashMap.put("code", Integer.toString(i));
        return hashMap;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(JSONObject jSONObject) {
        b bVar;
        synchronized (this.h) {
            bVar = this.i;
            this.i = null;
        }
        if (bVar != null) {
            bVar.a(jSONObject);
        }
    }
}
