package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.text.TextUtils;
import com.google.ads.mediation.AbstractAdViewAdapter;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes.dex */
public abstract class i82<AdT> implements a52<AdT> {
    private static Bundle d(Bundle bundle) {
        return bundle == null ? new Bundle() : new Bundle(bundle);
    }

    @Override // com.google.android.gms.internal.ads.a52
    public final cc3<AdT> a(ds2 ds2Var, rr2 rr2Var) {
        String optString = rr2Var.f11400w.optString(AbstractAdViewAdapter.AD_UNIT_ID_PARAMETER, "");
        ks2 ks2Var = ds2Var.f4312a.f2953a;
        is2 is2Var = new is2();
        is2Var.E(ks2Var);
        is2Var.H(optString);
        Bundle d7 = d(ks2Var.f7618d.f7655r);
        Bundle d8 = d(d7.getBundle("com.google.ads.mediation.admob.AdMobAdapter"));
        d8.putInt("gw", 1);
        String optString2 = rr2Var.f11400w.optString("mad_hac", null);
        if (optString2 != null) {
            d8.putString("mad_hac", optString2);
        }
        String optString3 = rr2Var.f11400w.optString("adJson", null);
        if (optString3 != null) {
            d8.putString("_ad", optString3);
        }
        d8.putBoolean("_noRefresh", true);
        Iterator<String> keys = rr2Var.E.keys();
        while (keys.hasNext()) {
            String next = keys.next();
            String optString4 = rr2Var.E.optString(next, null);
            if (next != null) {
                d8.putString(next, optString4);
            }
        }
        d7.putBundle("com.google.ads.mediation.admob.AdMobAdapter", d8);
        kv kvVar = ks2Var.f7618d;
        is2Var.d(new kv(kvVar.f7643f, kvVar.f7644g, d8, kvVar.f7646i, kvVar.f7647j, kvVar.f7648k, kvVar.f7649l, kvVar.f7650m, kvVar.f7651n, kvVar.f7652o, kvVar.f7653p, kvVar.f7654q, d7, kvVar.f7656s, kvVar.f7657t, kvVar.f7658u, kvVar.f7659v, kvVar.f7660w, kvVar.f7661x, kvVar.f7662y, kvVar.f7663z, kvVar.A, kvVar.B, kvVar.C));
        ks2 f7 = is2Var.f();
        Bundle bundle = new Bundle();
        ur2 ur2Var = ds2Var.f4313b.f3934b;
        Bundle bundle2 = new Bundle();
        bundle2.putStringArrayList("nofill_urls", new ArrayList<>(ur2Var.f12946a));
        bundle2.putInt("refresh_interval", ur2Var.f12948c);
        bundle2.putString("gws_query_id", ur2Var.f12947b);
        bundle.putBundle("parent_common_config", bundle2);
        String str = ds2Var.f4312a.f2953a.f7620f;
        Bundle bundle3 = new Bundle();
        bundle3.putString("initial_ad_unit_id", str);
        bundle3.putString("allocation_id", rr2Var.f11401x);
        bundle3.putStringArrayList("click_urls", new ArrayList<>(rr2Var.f11371c));
        bundle3.putStringArrayList("imp_urls", new ArrayList<>(rr2Var.f11373d));
        bundle3.putStringArrayList("manual_tracking_urls", new ArrayList<>(rr2Var.f11394q));
        bundle3.putStringArrayList("fill_urls", new ArrayList<>(rr2Var.f11391n));
        bundle3.putStringArrayList("video_start_urls", new ArrayList<>(rr2Var.f11381h));
        bundle3.putStringArrayList("video_reward_urls", new ArrayList<>(rr2Var.f11383i));
        bundle3.putStringArrayList("video_complete_urls", new ArrayList<>(rr2Var.f11385j));
        bundle3.putString("transaction_id", rr2Var.f11387k);
        bundle3.putString("valid_from_timestamp", rr2Var.f11389l);
        bundle3.putBoolean("is_closable_area_disabled", rr2Var.M);
        if (rr2Var.f11390m != null) {
            Bundle bundle4 = new Bundle();
            bundle4.putInt("rb_amount", rr2Var.f11390m.f14706g);
            bundle4.putString("rb_type", rr2Var.f11390m.f14705f);
            bundle3.putParcelableArray("rewards", new Bundle[]{bundle4});
        }
        bundle.putBundle("parent_ad_config", bundle3);
        return c(f7, bundle);
    }

    @Override // com.google.android.gms.internal.ads.a52
    public final boolean b(ds2 ds2Var, rr2 rr2Var) {
        return !TextUtils.isEmpty(rr2Var.f11400w.optString(AbstractAdViewAdapter.AD_UNIT_ID_PARAMETER, ""));
    }

    protected abstract cc3<AdT> c(ks2 ks2Var, Bundle bundle);
}
