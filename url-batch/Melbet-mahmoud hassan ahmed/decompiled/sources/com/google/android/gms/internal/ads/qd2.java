package com.google.android.gms.internal.ads;

import android.location.Location;
import android.os.Bundle;
import android.text.TextUtils;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

/* loaded from: classes.dex */
public final class qd2 implements hj2<Bundle> {

    /* renamed from: a, reason: collision with root package name */
    final ks2 f10658a;

    /* renamed from: b, reason: collision with root package name */
    private final long f10659b;

    public qd2(ks2 ks2Var, long j7) {
        r3.o.j(ks2Var, "the targeting must not be null");
        this.f10658a = ks2Var;
        this.f10659b = j7;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0159  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0167  */
    /* JADX WARN: Removed duplicated region for block: B:44:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x015b  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0055  */
    @Override // com.google.android.gms.internal.ads.hj2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final /* bridge */ /* synthetic */ void c(Bundle bundle) {
        Location location;
        String str;
        Bundle bundle2 = bundle;
        kv kvVar = this.f10658a.f7618d;
        bundle2.putInt("http_timeout_millis", kvVar.B);
        bundle2.putString("slotname", this.f10658a.f7620f);
        int i7 = this.f10658a.f7629o.f15240a;
        int i8 = i7 - 1;
        if (i7 == 0) {
            throw null;
        }
        if (i8 != 1) {
            str = i8 == 2 ? "is_rewarded_interstitial" : "is_new_rewarded";
            bundle2.putLong("start_signals_timestamp", this.f10659b);
            vs2.g(bundle2, "cust_age", new SimpleDateFormat("yyyyMMdd", Locale.US).format(new Date(kvVar.f7644g)), kvVar.f7644g == -1);
            vs2.b(bundle2, "extras", kvVar.f7645h);
            vs2.f(bundle2, "cust_gender", Integer.valueOf(kvVar.f7646i), kvVar.f7646i == -1);
            vs2.d(bundle2, "kw", kvVar.f7647j);
            vs2.f(bundle2, "tag_for_child_directed_treatment", Integer.valueOf(kvVar.f7649l), kvVar.f7649l == -1);
            if (kvVar.f7648k) {
                bundle2.putBoolean("test_request", true);
            }
            vs2.f(bundle2, "d_imp_hdr", 1, kvVar.f7643f < 2 && kvVar.f7650m);
            String str2 = kvVar.f7651n;
            vs2.g(bundle2, "ppid", str2, kvVar.f7643f < 2 && !TextUtils.isEmpty(str2));
            location = kvVar.f7653p;
            if (location != null) {
                Float valueOf = Float.valueOf(location.getAccuracy() * 1000.0f);
                Long valueOf2 = Long.valueOf(location.getTime() * 1000);
                Long valueOf3 = Long.valueOf((long) (location.getLatitude() * 1.0E7d));
                Long valueOf4 = Long.valueOf((long) (location.getLongitude() * 1.0E7d));
                Bundle bundle3 = new Bundle();
                bundle3.putFloat("radius", valueOf.floatValue());
                bundle3.putLong("lat", valueOf3.longValue());
                bundle3.putLong("long", valueOf4.longValue());
                bundle3.putLong("time", valueOf2.longValue());
                bundle2.putBundle("uule", bundle3);
            }
            vs2.c(bundle2, "url", kvVar.f7654q);
            vs2.d(bundle2, "neighboring_content_urls", kvVar.A);
            vs2.b(bundle2, "custom_targeting", kvVar.f7656s);
            vs2.d(bundle2, "category_exclusions", kvVar.f7657t);
            vs2.c(bundle2, "request_agent", kvVar.f7658u);
            vs2.c(bundle2, "request_pkg", kvVar.f7659v);
            vs2.e(bundle2, "is_designed_for_families", Boolean.valueOf(kvVar.f7660w), kvVar.f7643f < 7);
            if (kvVar.f7643f < 8) {
                vs2.f(bundle2, "tag_for_under_age_of_consent", Integer.valueOf(kvVar.f7662y), kvVar.f7662y != -1);
                vs2.c(bundle2, "max_ad_content_rating", kvVar.f7663z);
                return;
            }
            return;
        }
        bundle2.putBoolean(str, true);
        bundle2.putLong("start_signals_timestamp", this.f10659b);
        vs2.g(bundle2, "cust_age", new SimpleDateFormat("yyyyMMdd", Locale.US).format(new Date(kvVar.f7644g)), kvVar.f7644g == -1);
        vs2.b(bundle2, "extras", kvVar.f7645h);
        vs2.f(bundle2, "cust_gender", Integer.valueOf(kvVar.f7646i), kvVar.f7646i == -1);
        vs2.d(bundle2, "kw", kvVar.f7647j);
        vs2.f(bundle2, "tag_for_child_directed_treatment", Integer.valueOf(kvVar.f7649l), kvVar.f7649l == -1);
        if (kvVar.f7648k) {
        }
        vs2.f(bundle2, "d_imp_hdr", 1, kvVar.f7643f < 2 && kvVar.f7650m);
        String str22 = kvVar.f7651n;
        vs2.g(bundle2, "ppid", str22, kvVar.f7643f < 2 && !TextUtils.isEmpty(str22));
        location = kvVar.f7653p;
        if (location != null) {
        }
        vs2.c(bundle2, "url", kvVar.f7654q);
        vs2.d(bundle2, "neighboring_content_urls", kvVar.A);
        vs2.b(bundle2, "custom_targeting", kvVar.f7656s);
        vs2.d(bundle2, "category_exclusions", kvVar.f7657t);
        vs2.c(bundle2, "request_agent", kvVar.f7658u);
        vs2.c(bundle2, "request_pkg", kvVar.f7659v);
        vs2.e(bundle2, "is_designed_for_families", Boolean.valueOf(kvVar.f7660w), kvVar.f7643f < 7);
        if (kvVar.f7643f < 8) {
        }
    }
}
