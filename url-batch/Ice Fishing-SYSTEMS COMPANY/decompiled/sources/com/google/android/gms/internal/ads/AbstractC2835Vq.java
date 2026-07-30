package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.text.TextUtils;
import com.google.ads.mediation.AbstractAdViewAdapter;
import java.util.ArrayList;
import java.util.Iterator;
import n2.C4805a;
import n2.C4808d;
import org.json.JSONObject;

/* renamed from: com.google.android.gms.internal.ads.Vq, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC2835Vq implements InterfaceC3436jq {
    @Override // com.google.android.gms.internal.ads.InterfaceC3436jq
    public final J3.a a(C2953au c2953au, Ut ut) {
        JSONObject jSONObject = ut.f28179v;
        String optString = jSONObject.optString(AbstractAdViewAdapter.AD_UNIT_ID_PARAMETER, "");
        C3226fu c3226fu = (C3226fu) c2953au.f29348a.f26393u;
        C3171eu c3171eu = new C3171eu();
        c3171eu.f30543o.f1421u = c3226fu.f30912p.f1421u;
        q2.d1 d1Var = c3226fu.f30901d;
        c3171eu.f30530a = d1Var;
        c3171eu.f30531b = c3226fu.f30903f;
        c3171eu.f30552x = c3226fu.f30920x;
        String str = c3226fu.f30904g;
        c3171eu.f30532c = str;
        c3171eu.f30533d = c3226fu.f30898a;
        c3171eu.f30535f = c3226fu.f30905h;
        c3171eu.f30536g = c3226fu.i;
        c3171eu.f30537h = c3226fu.f30906j;
        c3171eu.i = c3226fu.f30907k;
        C4805a c4805a = c3226fu.f30909m;
        c3171eu.f30538j = c4805a;
        if (c4805a != null) {
            c3171eu.f30534e = c4805a.f39629n;
        }
        C4808d c4808d = c3226fu.f30910n;
        c3171eu.f30539k = c4808d;
        if (c4808d != null) {
            c3171eu.f30534e = c4808d.f39637n;
            c3171eu.f30540l = c4808d.f39638u;
        }
        c3171eu.f30544p = c3226fu.f30913q;
        c3171eu.f30545q = c3226fu.f30914r;
        c3171eu.f30546r = c3226fu.f30900c;
        c3171eu.f30547s = c3226fu.f30915s;
        c3171eu.f30548t = c3226fu.f30916t;
        c3171eu.f30549u.set(c3226fu.f30917u.get());
        c3171eu.f30551w = c3226fu.f30919w;
        c3171eu.f30532c = optString;
        c3171eu.f30550v = true;
        Bundle bundle = d1Var.f40013F;
        Bundle bundle2 = bundle == null ? new Bundle() : new Bundle(bundle);
        Bundle bundle3 = bundle2.getBundle("com.google.ads.mediation.admob.AdMobAdapter");
        Bundle bundle4 = bundle3 == null ? new Bundle() : new Bundle(bundle3);
        bundle4.putInt("gw", 1);
        String optString2 = jSONObject.optString("mad_hac", null);
        if (optString2 != null) {
            bundle4.putString("mad_hac", optString2);
        }
        String optString3 = jSONObject.optString("adJson", null);
        if (optString3 != null) {
            bundle4.putString("_ad", optString3);
        }
        bundle4.putBoolean("_noRefresh", true);
        JSONObject jSONObject2 = ut.f28112D;
        Iterator<String> keys = jSONObject2.keys();
        while (keys.hasNext()) {
            String next = keys.next();
            String optString4 = jSONObject2.optString(next, null);
            if (next != null) {
                bundle4.putString(next, optString4);
            }
        }
        bundle2.putBundle("com.google.ads.mediation.admob.AdMobAdapter", bundle4);
        c3171eu.f30530a = new q2.d1(d1Var.f40029n, d1Var.f40030u, bundle4, d1Var.f40032w, d1Var.f40033x, d1Var.f40034y, d1Var.f40035z, d1Var.f40008A, d1Var.f40009B, d1Var.f40010C, d1Var.f40011D, d1Var.f40012E, bundle2, d1Var.f40014G, d1Var.f40015H, d1Var.f40016I, d1Var.J, d1Var.f40017K, d1Var.f40018L, d1Var.f40019M, d1Var.f40020N, d1Var.f40021O, d1Var.f40022P, d1Var.f40023Q, d1Var.f40024R, d1Var.f40025S, d1Var.f40026T, d1Var.f40027U);
        c3171eu.f30551w = ut.f28121H0;
        C3226fu a9 = c3171eu.a();
        Bundle bundle5 = new Bundle();
        C2518Df c2518Df = c2953au.f29349b;
        Bundle bundle6 = new Bundle();
        Wt wt = (Wt) c2518Df.f24454v;
        bundle6.putStringArrayList("nofill_urls", new ArrayList<>(wt.f28490a));
        bundle6.putInt("refresh_interval", wt.f28492c);
        bundle6.putString("gws_query_id", wt.f28491b);
        bundle5.putBundle("parent_common_config", bundle6);
        Bundle bundle7 = new Bundle();
        bundle7.putString("initial_ad_unit_id", str);
        bundle7.putString("allocation_id", ut.f28181w);
        bundle7.putString("ad_source_name", ut.f28116F);
        bundle7.putStringArrayList("click_urls", new ArrayList<>(ut.f28143c));
        bundle7.putStringArrayList("imp_urls", new ArrayList<>(ut.f28145d));
        bundle7.putStringArrayList("manual_tracking_urls", new ArrayList<>(ut.f28167p));
        bundle7.putStringArrayList("fill_urls", new ArrayList<>(ut.f28162m));
        bundle7.putStringArrayList("video_start_urls", new ArrayList<>(ut.f28151g));
        bundle7.putStringArrayList("video_reward_urls", new ArrayList<>(ut.f28153h));
        bundle7.putStringArrayList("video_complete_urls", new ArrayList<>(ut.i));
        bundle7.putString("transaction_id", ut.f28156j);
        bundle7.putString("valid_from_timestamp", ut.f28158k);
        bundle7.putBoolean("is_closable_area_disabled", ut.f28129P);
        bundle7.putString("recursive_server_response_data", ut.f28166o0);
        bundle7.putBoolean("is_analytics_logging_enabled", ut.f28136W);
        C2938af c2938af = ut.f28160l;
        if (c2938af != null) {
            Bundle bundle8 = new Bundle();
            bundle8.putInt("rb_amount", c2938af.f29240u);
            bundle8.putString("rb_type", c2938af.f29239n);
            bundle7.putParcelableArray("rewards", new Bundle[]{bundle8});
        }
        bundle5.putBundle("parent_ad_config", bundle7);
        return c(a9, bundle5, ut, c2953au);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3436jq
    public final boolean b(C2953au c2953au, Ut ut) {
        return !TextUtils.isEmpty(ut.f28179v.optString(AbstractAdViewAdapter.AD_UNIT_ID_PARAMETER, ""));
    }

    public abstract Ku c(C3226fu c3226fu, Bundle bundle, Ut ut, C2953au c2953au);
}
