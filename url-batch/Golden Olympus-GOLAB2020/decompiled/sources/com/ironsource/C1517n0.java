package com.ironsource;

import android.app.Activity;
import android.text.TextUtils;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.ironsource.n0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C1517n0 {

    /* renamed from: a, reason: collision with root package name */
    private final C1454e2 f18265a;

    public C1517n0(C1454e2 c1454e2) {
        this.f18265a = c1454e2;
    }

    public void a() {
        this.f18265a.a(EnumC1433b2.SESSION_CAPPED, null);
    }

    public void b(String str) {
        a(str, (String) null);
    }

    public void c(String str) {
        HashMap hashMap = new HashMap();
        hashMap.put("placement", str);
        this.f18265a.a(EnumC1433b2.AD_DISMISS_SCREEN, hashMap);
    }

    public void d(String str) {
        HashMap hashMap = new HashMap();
        if (!TextUtils.isEmpty(str)) {
            hashMap.put("placement", str);
        }
        this.f18265a.a(EnumC1433b2.AD_ENDED, hashMap);
    }

    public void e(String str) {
        HashMap hashMap = new HashMap();
        if (!TextUtils.isEmpty(str)) {
            hashMap.put("placement", str);
        }
        this.f18265a.a(EnumC1433b2.AD_INFO_CHANGED, hashMap);
    }

    public void f(String str) {
        HashMap hashMap = new HashMap();
        hashMap.put("placement", str);
        this.f18265a.a(EnumC1433b2.AD_LEFT_APPLICATION, hashMap);
    }

    public void g(String str) {
        HashMap hashMap = new HashMap();
        if (!TextUtils.isEmpty(str)) {
            hashMap.put("placement", str);
        }
        this.f18265a.a(EnumC1433b2.AD_OPENED, hashMap);
    }

    public void h(String str) {
        HashMap hashMap = new HashMap();
        hashMap.put("placement", str);
        this.f18265a.a(EnumC1433b2.AD_PRESENT_SCREEN, hashMap);
    }

    public void i(String str) {
        HashMap hashMap = new HashMap();
        if (!TextUtils.isEmpty(str)) {
            hashMap.put("placement", str);
        }
        this.f18265a.a(EnumC1433b2.AD_STARTED, hashMap);
    }

    public void j(String str) {
        HashMap hashMap = new HashMap();
        hashMap.put("placement", str);
        this.f18265a.a(EnumC1433b2.AD_VIEW_BOUND, hashMap);
    }

    public void k(String str) {
        HashMap hashMap = new HashMap();
        if (!TextUtils.isEmpty(str)) {
            hashMap.put("placement", str);
        }
        this.f18265a.a(EnumC1433b2.AD_VISIBLE, hashMap);
    }

    public void l(String str) {
        HashMap hashMap = new HashMap();
        if (!TextUtils.isEmpty(str)) {
            hashMap.put("placement", str);
        }
        this.f18265a.a(EnumC1433b2.SHOW_AD_SUCCESS, hashMap);
    }

    public void a(Activity activity, String str) {
        HashMap hashMap = new HashMap();
        if (!TextUtils.isEmpty(str)) {
            hashMap.put("placement", str);
        }
        if (activity != null) {
            hashMap.put(IronSourceConstants.EVENTS_EXT1, IronSourceConstants.EVENTS_INIT_CONTEXT_FLOW);
        }
        this.f18265a.a(EnumC1433b2.SHOW_AD, hashMap);
    }

    public void b(String str, String str2) {
        HashMap hashMap = new HashMap();
        hashMap.put("placement", str);
        if (!TextUtils.isEmpty(str2)) {
            hashMap.put("reason", str2);
        }
        this.f18265a.a(EnumC1433b2.PLACEMENT_CAPPED, hashMap);
    }

    public void a(String str) {
        HashMap hashMap = new HashMap();
        if (!TextUtils.isEmpty(str)) {
            hashMap.put("placement", str);
        }
        this.f18265a.a(EnumC1433b2.AD_CLICKED, hashMap);
    }

    public void a(String str, int i4, String str2, String str3) {
        HashMap hashMap = new HashMap();
        if (!TextUtils.isEmpty(str)) {
            hashMap.put("placement", str);
        }
        hashMap.put("errorCode", Integer.valueOf(i4));
        hashMap.put("reason", str2);
        if (!TextUtils.isEmpty(str3)) {
            hashMap.put(IronSourceConstants.EVENTS_EXT1, str3);
        }
        this.f18265a.a(EnumC1433b2.SHOW_AD_FAILED, hashMap);
    }

    public void a(String str, String str2) {
        HashMap hashMap = new HashMap();
        if (!TextUtils.isEmpty(str)) {
            hashMap.put("placement", str);
        }
        if (!TextUtils.isEmpty(str2)) {
            hashMap.put(IronSourceConstants.EVENTS_EXT1, str2);
        }
        this.f18265a.a(EnumC1433b2.AD_CLOSED, hashMap);
    }

    public void a(String str, String str2, int i4, long j4, String str3, long j5, Map<String, Object> map, String str4) {
        HashMap hashMap = new HashMap();
        if (!TextUtils.isEmpty(str)) {
            hashMap.put("placement", str);
        }
        hashMap.put(IronSourceConstants.EVENTS_REWARD_NAME, str2);
        hashMap.put(IronSourceConstants.EVENTS_REWARD_AMOUNT, Integer.valueOf(i4));
        hashMap.put("transId", str3);
        if (j5 != 0) {
            hashMap.put(IronSourceConstants.EVENTS_DURATION, Long.valueOf(j5));
        }
        if (map != null) {
            hashMap.putAll(map);
        }
        if (!TextUtils.isEmpty(str4)) {
            hashMap.put(IronSourceConstants.EVENTS_DYNAMIC_USER_ID, str4);
        }
        this.f18265a.a(EnumC1433b2.AD_REWARDED, hashMap, j4);
    }

    public void a(String str, String str2, boolean z4) {
        HashMap hashMap = new HashMap();
        hashMap.put("isMultipleAdUnits", 1);
        hashMap.put("placement", str);
        if (!TextUtils.isEmpty(str2)) {
            hashMap.put("reason", str2);
        }
        hashMap.put(IronSourceConstants.EVENTS_EXT1, z4 ? com.ironsource.mediationsdk.metadata.a.f17681g : "false");
        hashMap.put(IronSourceConstants.EVENTS_PROVIDER, "Mediation");
        this.f18265a.a(EnumC1433b2.CHECK_PLACEMENT_CAPPED, hashMap);
    }

    public void a(boolean z4) {
        HashMap hashMap = new HashMap();
        hashMap.put("status", z4 ? com.ironsource.mediationsdk.metadata.a.f17681g : "false");
        this.f18265a.a(EnumC1433b2.SHOW_AD_CHANCE, hashMap);
    }
}
