package com.applovin.impl.sdk.ad;

import android.net.Uri;
import com.applovin.impl.adview.g;
import com.tapjoy.TapjoyConstants;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class a extends g {
    public a(JSONObject jSONObject, JSONObject jSONObject2, b bVar, com.applovin.impl.sdk.j jVar) {
        super(jSONObject, jSONObject2, bVar, jVar);
    }

    private String ax() {
        return getStringFromAdObject("stream_url", "");
    }

    private void b(String str) {
        try {
            synchronized (this.adObjectLock) {
                this.adObject.put("backup_stream_url", str);
            }
        } catch (Throwable unused) {
        }
    }

    public String a() {
        String a2;
        synchronized (this.adObjectLock) {
            a2 = com.applovin.impl.sdk.e.f.a(this.adObject, "html", (String) null, this.sdk);
        }
        return a2;
    }

    public void a(Uri uri) {
        try {
            synchronized (this.adObjectLock) {
                this.adObject.put("video", uri.toString());
            }
        } catch (Throwable unused) {
        }
    }

    public void a(String str) {
        try {
            synchronized (this.adObjectLock) {
                this.adObject.put("html", str);
            }
        } catch (Throwable unused) {
        }
    }

    @Override // com.applovin.impl.sdk.ad.g
    public boolean b() {
        return this.adObject.has("stream_url");
    }

    public void c() {
        synchronized (this.adObjectLock) {
            Object remove = this.adObject.remove("stream_url");
            if (remove instanceof String) {
                b((String) remove);
            }
        }
    }

    public boolean d() {
        String stringFromAdObject = getStringFromAdObject("backup_stream_url", null);
        try {
            synchronized (this.adObjectLock) {
                this.adObject.put("stream_url", stringFromAdObject);
            }
        } catch (Throwable unused) {
        }
        return b();
    }

    @Override // com.applovin.impl.sdk.ad.g
    public Uri e() {
        String ax = ax();
        if (com.applovin.impl.sdk.e.i.b(ax)) {
            return Uri.parse(ax);
        }
        String f = f();
        if (com.applovin.impl.sdk.e.i.b(f)) {
            return Uri.parse(f);
        }
        return null;
    }

    public String f() {
        return getStringFromAdObject("video", "");
    }

    @Override // com.applovin.impl.sdk.ad.g
    public Uri g() {
        String stringFromAdObject = getStringFromAdObject(TapjoyConstants.TJC_CLICK_URL, "");
        if (com.applovin.impl.sdk.e.i.b(stringFromAdObject)) {
            return Uri.parse(stringFromAdObject);
        }
        return null;
    }

    @Override // com.applovin.impl.sdk.ad.g
    public Uri h() {
        String stringFromAdObject = getStringFromAdObject("video_click_url", "");
        return com.applovin.impl.sdk.e.i.b(stringFromAdObject) ? Uri.parse(stringFromAdObject) : g();
    }

    @Override // com.applovin.impl.sdk.AppLovinAdBase
    public boolean hasVideoUrl() {
        return e() != null;
    }

    public float i() {
        return getFloatFromAdObject("mraid_close_delay_graphic", 0.0f);
    }

    public boolean j() {
        return getBooleanFromAdObject("close_button_graphic_hidden", false);
    }

    public boolean k() {
        if (this.adObject.has("close_button_expandable_hidden")) {
            return getBooleanFromAdObject("close_button_expandable_hidden", false);
        }
        return true;
    }

    public g.a l() {
        return a(getIntFromAdObject("expandable_style", g.a.Invisible.ordinal()));
    }
}
