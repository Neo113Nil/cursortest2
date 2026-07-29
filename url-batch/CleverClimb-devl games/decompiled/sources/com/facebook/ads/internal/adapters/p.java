package com.facebook.ads.internal.adapters;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.provider.Settings;
import android.support.v4.content.LocalBroadcastManager;
import android.text.TextUtils;
import com.facebook.ads.AdError;
import com.facebook.ads.AdSettings;
import com.facebook.ads.AudienceNetworkActivity;
import com.facebook.ads.internal.settings.a;
import java.util.Iterator;
import java.util.Map;
import java.util.UUID;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class p extends ae {

    /* renamed from: d, reason: collision with root package name */
    private Context f4987d;
    private af e;
    private String g;
    private String h;
    private long i;
    private ad j;
    private ag k;

    /* renamed from: c, reason: collision with root package name */
    private final String f4986c = UUID.randomUUID().toString();
    private boolean f = false;

    private void c() {
        LocalBroadcastManager.getInstance(this.f4987d).registerReceiver(this.k, this.k.a());
    }

    private void d() {
        if (this.k != null) {
            try {
                LocalBroadcastManager.getInstance(this.f4987d).unregisterReceiver(this.k);
            } catch (Exception unused) {
            }
        }
    }

    private String e() {
        if (this.f4898a == null) {
            return null;
        }
        String urlPrefix = AdSettings.getUrlPrefix();
        Uri parse = Uri.parse((urlPrefix == null || urlPrefix.isEmpty()) ? "https://www.facebook.com/audience_network/server_side_reward" : String.format("https://www.%s.facebook.com/audience_network/server_side_reward", urlPrefix));
        Uri.Builder builder = new Uri.Builder();
        builder.scheme(parse.getScheme());
        builder.authority(parse.getAuthority());
        builder.path(parse.getPath());
        builder.query(parse.getQuery());
        builder.fragment(parse.getFragment());
        builder.appendQueryParameter(com.umeng.analytics.pro.b.I, this.f4898a.getUserID());
        builder.appendQueryParameter("pc", this.f4898a.getCurrency());
        builder.appendQueryParameter("ptid", this.f4986c);
        builder.appendQueryParameter("appid", this.g);
        return builder.build().toString();
    }

    @Override // com.facebook.ads.internal.adapters.ae
    public int a() {
        if (this.j == null) {
            return -1;
        }
        return this.j.m();
    }

    @Override // com.facebook.ads.internal.adapters.ae
    public void a(Context context, af afVar, Map<String, Object> map, final boolean z) {
        this.f4987d = context;
        this.e = afVar;
        this.f = false;
        this.h = (String) map.get(AudienceNetworkActivity.PLACEMENT_ID);
        this.i = ((Long) map.get(AudienceNetworkActivity.REQUEST_TIME)).longValue();
        this.g = this.h != null ? this.h.split("_")[0] : "";
        this.j = ad.a((JSONObject) map.get("data"));
        if (TextUtils.isEmpty(this.j.a())) {
            this.e.a(this, AdError.INTERNAL_ERROR);
            return;
        }
        this.k = new ag(this.f4986c, this, afVar);
        c();
        final com.facebook.ads.internal.d.b bVar = new com.facebook.ads.internal.d.b(context);
        bVar.a(this.j.a());
        bVar.a(this.j.i(), -1, -1);
        bVar.a(this.j.j(), -1, -1);
        bVar.a(this.j.i(), -1, -1);
        Iterator<String> it = this.j.o().iterator();
        while (it.hasNext()) {
            bVar.a(it.next(), -1, -1);
        }
        bVar.a(new com.facebook.ads.internal.d.a() { // from class: com.facebook.ads.internal.adapters.p.1
            private void c() {
                p.this.f = true;
                p.this.e.a(p.this);
                p.this.j.b(bVar.b(p.this.j.a()));
            }

            @Override // com.facebook.ads.internal.d.a
            public void a() {
                c();
            }

            @Override // com.facebook.ads.internal.d.a
            public void b() {
                if (z) {
                    p.this.e.a(p.this, AdError.CACHE_ERROR);
                } else {
                    c();
                }
            }
        });
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x006e  */
    @Override // com.facebook.ads.internal.adapters.ae
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean b() {
        String str;
        int i;
        if (!this.f) {
            return false;
        }
        String e = e();
        this.j.a(e);
        Intent intent = new Intent(this.f4987d, (Class<?>) AudienceNetworkActivity.class);
        intent.putExtra(AudienceNetworkActivity.VIEW_TYPE, a.EnumC0351a.REWARDED_VIDEO);
        intent.putExtra("rewardedVideoAdDataBundle", this.j);
        intent.putExtra(AudienceNetworkActivity.AUDIENCE_NETWORK_UNIQUE_ID_EXTRA, this.f4986c);
        intent.putExtra(AudienceNetworkActivity.REWARD_SERVER_URL, e);
        intent.putExtra(AudienceNetworkActivity.PLACEMENT_ID, this.h);
        intent.putExtra(AudienceNetworkActivity.REQUEST_TIME, this.i);
        if (this.f4899b == -1 || Settings.System.getInt(this.f4987d.getContentResolver(), "accelerometer_rotation", 0) == 1) {
            if (!com.facebook.ads.internal.l.a.k(this.f4987d)) {
                str = AudienceNetworkActivity.PREDEFINED_ORIENTATION_KEY;
                i = 6;
            }
            if (!(this.f4987d instanceof Activity)) {
                intent.setFlags(intent.getFlags() | 268435456);
            }
            this.f4987d.startActivity(intent);
            return true;
        }
        str = AudienceNetworkActivity.PREDEFINED_ORIENTATION_KEY;
        i = this.f4899b;
        intent.putExtra(str, i);
        if (!(this.f4987d instanceof Activity)) {
        }
        this.f4987d.startActivity(intent);
        return true;
    }

    @Override // com.facebook.ads.internal.adapters.AdAdapter
    public void onDestroy() {
        d();
    }
}
