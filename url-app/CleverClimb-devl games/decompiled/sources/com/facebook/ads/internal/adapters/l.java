package com.facebook.ads.internal.adapters;

import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import android.widget.RelativeLayout;
import com.facebook.ads.AdError;
import com.facebook.ads.AudienceNetworkActivity;
import com.facebook.ads.CacheFlag;
import com.facebook.ads.internal.q.c.d;
import com.facebook.ads.internal.view.e.c.d;
import java.util.ArrayList;
import java.util.EnumSet;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class l extends u implements com.facebook.ads.internal.q.a.o<Bundle> {
    static final /* synthetic */ boolean e = !l.class.desiredAssertionStatus();

    /* renamed from: a, reason: collision with root package name */
    protected com.facebook.ads.internal.m.c f4953a;

    /* renamed from: b, reason: collision with root package name */
    protected com.facebook.ads.internal.view.e.b f4954b;

    /* renamed from: c, reason: collision with root package name */
    protected JSONObject f4955c;

    /* renamed from: d, reason: collision with root package name */
    protected Context f4956d;
    private com.facebook.ads.a.a j;
    private String k;
    private com.facebook.ads.internal.view.e.d m;
    private String n;
    private com.facebook.ads.internal.d.b p;
    private final com.facebook.ads.internal.j.f<com.facebook.ads.internal.view.e.b.b> f = new com.facebook.ads.internal.j.f<com.facebook.ads.internal.view.e.b.b>() { // from class: com.facebook.ads.internal.adapters.l.1
        @Override // com.facebook.ads.internal.j.f
        public Class<com.facebook.ads.internal.view.e.b.b> a() {
            return com.facebook.ads.internal.view.e.b.b.class;
        }

        @Override // com.facebook.ads.internal.j.f
        public void a(com.facebook.ads.internal.view.e.b.b bVar) {
            if (l.this.j == null) {
                return;
            }
            l.this.j.d(l.this);
        }
    };
    private final com.facebook.ads.internal.j.f<com.facebook.ads.internal.view.e.b.l> g = new com.facebook.ads.internal.j.f<com.facebook.ads.internal.view.e.b.l>() { // from class: com.facebook.ads.internal.adapters.l.2
        @Override // com.facebook.ads.internal.j.f
        public Class<com.facebook.ads.internal.view.e.b.l> a() {
            return com.facebook.ads.internal.view.e.b.l.class;
        }

        @Override // com.facebook.ads.internal.j.f
        public void a(com.facebook.ads.internal.view.e.b.l lVar) {
            l.this.l = true;
            if (l.this.j != null) {
                l.this.j.a(l.this);
            }
        }
    };
    private final com.facebook.ads.internal.j.f<com.facebook.ads.internal.view.e.b.d> h = new com.facebook.ads.internal.j.f<com.facebook.ads.internal.view.e.b.d>() { // from class: com.facebook.ads.internal.adapters.l.3
        @Override // com.facebook.ads.internal.j.f
        public Class<com.facebook.ads.internal.view.e.b.d> a() {
            return com.facebook.ads.internal.view.e.b.d.class;
        }

        @Override // com.facebook.ads.internal.j.f
        public void a(com.facebook.ads.internal.view.e.b.d dVar) {
            if (l.this.j == null) {
                return;
            }
            l.this.j.a(l.this, AdError.INTERNAL_ERROR);
        }
    };
    private final com.facebook.ads.internal.j.f<com.facebook.ads.internal.view.e.b.a> i = new com.facebook.ads.internal.j.f<com.facebook.ads.internal.view.e.b.a>() { // from class: com.facebook.ads.internal.adapters.l.4
        @Override // com.facebook.ads.internal.j.f
        public Class<com.facebook.ads.internal.view.e.b.a> a() {
            return com.facebook.ads.internal.view.e.b.a.class;
        }

        @Override // com.facebook.ads.internal.j.f
        public void a(com.facebook.ads.internal.view.e.b.a aVar) {
            if (l.this.j != null) {
                l.this.j.b(l.this);
            }
        }
    };
    private boolean l = false;
    private boolean o = false;

    private void a(Context context, com.facebook.ads.a.a aVar, JSONObject jSONObject, com.facebook.ads.internal.m.c cVar, Bundle bundle, EnumSet<CacheFlag> enumSet) {
        this.f4956d = context;
        this.j = aVar;
        this.f4953a = cVar;
        this.f4955c = jSONObject;
        this.l = false;
        JSONObject jSONObject2 = jSONObject.getJSONObject("video");
        this.n = jSONObject.optString("ct");
        this.f4954b = new com.facebook.ads.internal.view.e.b(context);
        a();
        this.f4954b.getEventBus().a(this.f, this.g, this.h, this.i);
        ArrayList arrayList = new ArrayList();
        arrayList.add(new com.facebook.ads.internal.b.b(1.0E-7d, -1.0d, 0.001d, false) { // from class: com.facebook.ads.internal.adapters.l.5
            @Override // com.facebook.ads.internal.b.b
            protected void a(boolean z, boolean z2, com.facebook.ads.internal.b.c cVar2) {
                l.this.f();
            }
        });
        if (bundle != null) {
            this.m = new com.facebook.ads.internal.view.e.c(context, cVar, this.f4954b, arrayList, this.n, bundle.getBundle("logger"));
        } else {
            this.m = new com.facebook.ads.internal.view.e.c(context, cVar, this.f4954b, arrayList, this.n);
        }
        this.j.a(this, this.f4954b);
        this.k = jSONObject2.getString((com.facebook.ads.internal.q.c.d.c(context) == d.a.MOBILE_INTERNET && jSONObject2.has("videoHDURL") && !jSONObject2.isNull("videoHDURL")) ? "videoHDURL" : AudienceNetworkActivity.VIDEO_URL);
        if (!enumSet.contains(CacheFlag.VIDEO)) {
            this.f4954b.setVideoURI(h());
            return;
        }
        this.p = new com.facebook.ads.internal.d.b(context);
        this.p.a(this.k);
        this.p.a(new com.facebook.ads.internal.d.a() { // from class: com.facebook.ads.internal.adapters.l.6
            @Override // com.facebook.ads.internal.d.a
            public void a() {
                l.this.f4954b.setVideoURI(l.this.h());
            }

            @Override // com.facebook.ads.internal.d.a
            public void b() {
                l.this.f4954b.setVideoURI(l.this.h());
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public String h() {
        String str = "";
        if (this.p != null && this.k != null) {
            str = this.p.b(this.k);
        }
        return TextUtils.isEmpty(str) ? this.k : str;
    }

    protected void a() {
        if (!e && this.f4956d == null) {
            throw new AssertionError();
        }
        if (!e && this.f4955c == null) {
            throw new AssertionError();
        }
        JSONObject optJSONObject = this.f4955c.optJSONObject("text");
        if (optJSONObject == null) {
            optJSONObject = new JSONObject();
        }
        this.f4954b.a(new com.facebook.ads.internal.view.e.c.k(this.f4956d));
        com.facebook.ads.internal.view.e.c.l lVar = new com.facebook.ads.internal.view.e.c.l(this.f4956d);
        this.f4954b.a(lVar);
        this.f4954b.a(new com.facebook.ads.internal.view.e.c.d(lVar, d.a.INVSIBLE));
        this.f4954b.a(new com.facebook.ads.internal.view.e.c.b(this.f4956d));
        String b2 = b();
        if (b2 != null) {
            com.facebook.ads.internal.view.e.c.c cVar = new com.facebook.ads.internal.view.e.c.c(this.f4956d, b2);
            RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
            layoutParams.addRule(12);
            layoutParams.addRule(9);
            cVar.setLayoutParams(layoutParams);
            cVar.setCountdownTextColor(-1);
            this.f4954b.a(cVar);
        }
        if (this.f4955c.has("cta") && !this.f4955c.isNull("cta")) {
            JSONObject jSONObject = this.f4955c.getJSONObject("cta");
            com.facebook.ads.internal.view.e.c.e eVar = new com.facebook.ads.internal.view.e.c.e(this.f4956d, jSONObject.getString("url"), this.f4953a, this.n, jSONObject.getString("text"));
            RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-2, -2);
            layoutParams2.addRule(10);
            layoutParams2.addRule(11);
            eVar.setLayoutParams(layoutParams2);
            this.f4954b.a(eVar);
        }
        String d2 = d();
        if (!TextUtils.isEmpty(d2)) {
            this.f4954b.a(new com.facebook.ads.internal.view.e.c.a(this.f4956d, d2, this.n, new float[]{0.0f, 0.0f, 8.0f, 0.0f}));
        }
        int c2 = c();
        if (c2 > 0) {
            com.facebook.ads.internal.view.e.c.i iVar = new com.facebook.ads.internal.view.e.c.i(this.f4956d, c2, optJSONObject.optString("skipAdIn", "Skip Ad in"), optJSONObject.optString("skipAd", "Skip Ad"));
            RelativeLayout.LayoutParams layoutParams3 = new RelativeLayout.LayoutParams(-2, -2);
            layoutParams3.addRule(12);
            layoutParams3.addRule(11);
            iVar.setLayoutParams(layoutParams3);
            iVar.setPadding(0, 0, 0, 30);
            this.f4954b.a(iVar);
        }
    }

    public final void a(Context context, com.facebook.ads.a.a aVar, com.facebook.ads.internal.m.c cVar, Bundle bundle, EnumSet<CacheFlag> enumSet) {
        try {
            a(context, aVar, new JSONObject(bundle.getString("ad_response")), cVar, bundle, enumSet);
        } catch (JSONException unused) {
            aVar.a(this, AdError.INTERNAL_ERROR);
        }
    }

    @Override // com.facebook.ads.internal.adapters.u
    public final void a(Context context, com.facebook.ads.a.a aVar, Map<String, Object> map, com.facebook.ads.internal.m.c cVar, EnumSet<CacheFlag> enumSet) {
        try {
            a(context, aVar, (JSONObject) map.get("data"), cVar, null, enumSet);
        } catch (JSONException unused) {
            aVar.a(this, AdError.INTERNAL_ERROR);
        }
    }

    protected String b() {
        if (!e && this.f4955c == null) {
            throw new AssertionError();
        }
        try {
            JSONObject jSONObject = this.f4955c.getJSONObject("capabilities");
            if (jSONObject.has("countdown") && !jSONObject.isNull("countdown")) {
                JSONObject jSONObject2 = jSONObject.getJSONObject("countdown");
                if (jSONObject2.has("format")) {
                    return jSONObject2.optString("format");
                }
            }
            return null;
        } catch (Exception e2) {
            Log.w(String.valueOf(l.class), "Invalid JSON", e2);
            return null;
        }
    }

    protected int c() {
        if (!e && this.f4955c == null) {
            throw new AssertionError();
        }
        try {
            JSONObject jSONObject = this.f4955c.getJSONObject("capabilities");
            if (jSONObject.has("skipButton") && !jSONObject.isNull("skipButton")) {
                JSONObject jSONObject2 = jSONObject.getJSONObject("skipButton");
                if (jSONObject2.has("skippableSeconds")) {
                    return jSONObject2.getInt("skippableSeconds");
                }
            }
            return -1;
        } catch (Exception e2) {
            Log.w(String.valueOf(l.class), "Invalid JSON", e2);
            return -1;
        }
    }

    protected String d() {
        if (!e && this.f4955c == null) {
            throw new AssertionError();
        }
        try {
            JSONObject jSONObject = this.f4955c.getJSONObject("capabilities");
            if (jSONObject.has("adChoices") && !jSONObject.isNull("adChoices")) {
                JSONObject jSONObject2 = jSONObject.getJSONObject("adChoices");
                if (jSONObject2.has("url")) {
                    return jSONObject2.getString("url");
                }
            }
            return null;
        } catch (Exception e2) {
            Log.w(String.valueOf(l.class), "Invalid JSON", e2);
            return null;
        }
    }

    @Override // com.facebook.ads.internal.adapters.u
    public boolean e() {
        if (!this.l || this.f4954b == null) {
            return false;
        }
        if (this.m.l() > 0) {
            this.f4954b.a(this.m.l());
        }
        this.f4954b.a(com.facebook.ads.internal.view.e.a.a.AUTO_STARTED);
        return true;
    }

    protected void f() {
        if (this.f4953a == null || this.o) {
            return;
        }
        this.o = true;
        this.f4953a.a(this.n, new HashMap());
        if (this.j != null) {
            this.j.c(this);
        }
    }

    @Override // com.facebook.ads.internal.q.a.o
    public Bundle g() {
        if (this.m == null || this.f4955c == null) {
            return null;
        }
        Bundle bundle = new Bundle();
        bundle.putBundle("logger", this.m.g());
        bundle.putString("ad_response", this.f4955c.toString());
        return bundle;
    }

    @Override // com.facebook.ads.internal.adapters.AdAdapter
    public void onDestroy() {
        if (this.f4954b != null) {
            this.f4954b.f();
            this.f4954b.k();
        }
        this.j = null;
        this.f4953a = null;
        this.k = null;
        this.l = false;
        this.n = null;
        this.f4954b = null;
        this.m = null;
        this.f4955c = null;
        this.f4956d = null;
        this.o = false;
    }
}
