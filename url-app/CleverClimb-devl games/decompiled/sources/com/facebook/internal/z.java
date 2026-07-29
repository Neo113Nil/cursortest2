package com.facebook.internal;

import android.os.Bundle;
import com.tapjoy.TJAdUnitConstants;
import com.tapjoy.TapjoyConstants;
import java.util.Collection;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: ServerProtocol.java */
/* loaded from: classes.dex */
public final class z {

    /* renamed from: a, reason: collision with root package name */
    public static final Collection<String> f6212a = ab.a("service_disabled", "AndroidAuthKillSwitchException");

    /* renamed from: b, reason: collision with root package name */
    public static final Collection<String> f6213b = ab.a("access_denied", "OAuthAccessDeniedException");

    /* renamed from: c, reason: collision with root package name */
    private static final String f6214c = "com.facebook.internal.z";

    public static final String d() {
        return "v2.6";
    }

    public static final String a() {
        return String.format("m.%s", com.facebook.l.e());
    }

    public static final String b() {
        return String.format("https://graph.%s", com.facebook.l.e());
    }

    public static final String c() {
        return String.format("https://graph-video.%s", com.facebook.l.e());
    }

    public static Bundle a(String str, int i, Bundle bundle) {
        String d2 = com.facebook.l.d(com.facebook.l.f());
        if (ab.a(d2)) {
            return null;
        }
        Bundle bundle2 = new Bundle();
        bundle2.putString("android_key_hash", d2);
        bundle2.putString(TapjoyConstants.TJC_APP_ID, com.facebook.l.i());
        bundle2.putInt("version", i);
        bundle2.putString(TJAdUnitConstants.String.DISPLAY, "touch");
        Bundle bundle3 = new Bundle();
        bundle3.putString("action_id", str);
        if (bundle == null) {
            bundle = new Bundle();
        }
        try {
            JSONObject a2 = d.a(bundle3);
            JSONObject a3 = d.a(bundle);
            if (a2 != null && a3 != null) {
                bundle2.putString("bridge_args", a2.toString());
                bundle2.putString("method_args", a3.toString());
                return bundle2;
            }
            return null;
        } catch (JSONException e) {
            t.a(com.facebook.u.DEVELOPER_ERRORS, 6, f6214c, "Error creating Url -- " + e);
            return null;
        }
    }
}
