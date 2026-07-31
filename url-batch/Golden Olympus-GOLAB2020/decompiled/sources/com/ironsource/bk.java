package com.ironsource;

import android.app.ActivityManager;
import android.content.Context;
import android.text.TextUtils;
import com.ironsource.mediationsdk.IronSource;
import com.ironsource.mediationsdk.WaterfallConfiguration;
import java.util.HashMap;
import org.jetbrains.annotations.NotNull;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public class bk {

    /* renamed from: a, reason: collision with root package name */
    ke f15615a = new ke();

    public void a(int i4) {
        this.f15615a.a(ge.f16458g0, Integer.valueOf(i4));
    }

    public void b(int i4) {
        if (i4 >= 0) {
            this.f15615a.a(ge.f16420Q0, Integer.valueOf(i4));
        }
    }

    public void c(int i4) {
        this.f15615a.a(ge.f16452e0, Integer.valueOf(i4));
    }

    public void d(String str) {
        this.f15615a.a(com.ironsource.mediationsdk.metadata.a.f17683i, str);
    }

    public void e(String str) {
        this.f15615a.a(ge.f16434X0, str);
    }

    public void f(String str) {
        this.f15615a.a(ge.f16384A, str);
    }

    public void g(String str) {
        this.f15615a.a(ge.f16441a1, str);
    }

    public void h(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        this.f15615a.a(ge.f16449d0, str);
    }

    public void a(Context context) {
        this.f15615a.a(context);
    }

    public void b(Context context) {
        of f4 = nm.S().f();
        ActivityManager.MemoryInfo z4 = f4.z(context);
        this.f15615a.a(ge.f16505w, f4.c(z4));
        this.f15615a.a(ge.f16508x, f4.b(z4));
    }

    public void c(String str) {
        this.f15615a.a(ge.f16406J0, str);
    }

    public void a(@NotNull hg hgVar) {
        try {
            HashMap hashMap = new HashMap();
            hashMap.put(ge.f16393D, hgVar.a());
            hashMap.put(ge.f16390C, hgVar.b());
            hashMap.put(ge.f16427U, hgVar.c());
            this.f15615a.a(hashMap);
        } catch (Exception e4) {
            o9.d().a(e4);
        }
    }

    public void b(String str) {
        this.f15615a.a(ge.f16402H0, str);
    }

    public void a(@NotNull IronSource.AD_UNIT ad_unit, WaterfallConfiguration waterfallConfiguration) {
        JSONObject jSONObject = new JSONObject();
        if (waterfallConfiguration != null) {
            try {
                jSONObject.put(ge.f16492r1, waterfallConfiguration.getFloor());
                jSONObject.put(ge.f16495s1, waterfallConfiguration.getCeiling());
            } catch (JSONException e4) {
                o9.d().a(e4);
            }
        }
        if (jSONObject.length() == 0) {
            this.f15615a.a(ge.f16489q1, C1591x2.a(ad_unit));
        } else {
            this.f15615a.a(ge.f16489q1, jSONObject, C1591x2.a(ad_unit));
        }
    }

    public void b(JSONObject jSONObject) {
        this.f15615a.a(ge.f16447c1, (Object) jSONObject);
    }

    public void a(Boolean bool) {
        this.f15615a.a(ge.f16422R0, bool);
    }

    public void b(boolean z4) {
        this.f15615a.a("gpi", Boolean.valueOf(z4));
    }

    public void a(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        this.f15615a.a(ge.f16412M0, str);
    }

    public void a(JSONObject jSONObject) {
        this.f15615a.a(ge.f16499u, (Object) jSONObject);
    }

    public void a(boolean z4) {
        this.f15615a.a(ge.f16416O0, Boolean.valueOf(z4));
    }
}
