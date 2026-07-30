package com.google.android.gms.internal.ads;

import com.anythink.expressad.atsignalcommon.commonwebview.ToolBar;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.google.android.gms.internal.ads.gd, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3263gd {

    /* renamed from: a, reason: collision with root package name */
    public final List f31031a;

    public C3263gd(JSONObject jSONObject) {
        if (u2.i.j(2)) {
            t2.C.k("Mediation Response JSON: ".concat(String.valueOf(jSONObject.toString(2))));
        }
        JSONArray jSONArray = jSONObject.getJSONArray("ad_networks");
        ArrayList arrayList = new ArrayList(jSONArray.length());
        int i = -1;
        for (int i4 = 0; i4 < jSONArray.length(); i4++) {
            try {
                C3209fd c3209fd = new C3209fd(jSONArray.getJSONObject(i4));
                com.anythink.expressad.foundation.g.a.f.f19281e.equalsIgnoreCase(c3209fd.f30736c);
                arrayList.add(c3209fd);
                if (i < 0) {
                    Iterator it = c3209fd.f30734a.iterator();
                    while (true) {
                        if (it.hasNext()) {
                            if (((String) it.next()).equals("com.google.ads.mediation.admob.AdMobAdapter")) {
                                i = i4;
                                break;
                            }
                        } else {
                            break;
                        }
                    }
                }
            } catch (JSONException unused) {
            }
        }
        jSONArray.length();
        this.f31031a = Collections.unmodifiableList(arrayList);
        jSONObject.optString("qdata");
        jSONObject.optInt("fs_model_type", -1);
        jSONObject.optLong("timeout_ms", -1L);
        JSONObject optJSONObject = jSONObject.optJSONObject("settings");
        if (optJSONObject != null) {
            optJSONObject.optLong("ad_network_timeout_millis", -1L);
            C2837Wb c2837Wb = p2.j.f39798C.f39821v;
            C2837Wb.h("click_urls", optJSONObject);
            C2837Wb.h("imp_urls", optJSONObject);
            C2837Wb.h("downloaded_imp_urls", optJSONObject);
            C2837Wb.h("nofill_urls", optJSONObject);
            C2837Wb.h("remote_ping_urls", optJSONObject);
            optJSONObject.optBoolean("render_in_browser", false);
            optJSONObject.optLong(ToolBar.REFRESH, -1L);
            C2938af.a(optJSONObject.optJSONArray("rewards"));
            optJSONObject.optBoolean("use_displayed_impression", false);
            optJSONObject.optBoolean("allow_pub_rendered_attribution", false);
            optJSONObject.optBoolean("allow_pub_owned_ad_view", false);
            optJSONObject.optBoolean("allow_custom_click_gesture", false);
        }
    }
}
