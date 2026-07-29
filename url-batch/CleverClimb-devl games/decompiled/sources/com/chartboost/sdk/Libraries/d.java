package com.chartboost.sdk.Libraries;

import android.content.ContentResolver;
import android.content.Context;
import android.os.Build;
import android.os.Looper;
import android.provider.Settings;
import android.util.Base64;
import com.chartboost.sdk.impl.ar;
import com.chartboost.sdk.impl.as;
import com.tapjoy.TapjoyConstants;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class d {

    /* renamed from: a, reason: collision with root package name */
    private int f3574a = -1;

    /* renamed from: b, reason: collision with root package name */
    private String f3575b = null;

    /* renamed from: c, reason: collision with root package name */
    private final String f3576c;

    public static class a {

        /* renamed from: a, reason: collision with root package name */
        public final int f3577a;

        /* renamed from: b, reason: collision with root package name */
        public final String f3578b;

        /* renamed from: c, reason: collision with root package name */
        public final String f3579c;

        /* renamed from: d, reason: collision with root package name */
        public final String f3580d;

        public a(int i, String str, String str2, String str3) {
            this.f3577a = i;
            this.f3578b = str;
            this.f3579c = str2;
            this.f3580d = str3;
        }
    }

    public d(Context context) {
        this.f3576c = ar.b(context);
    }

    public synchronized a a() {
        if (Looper.myLooper() == Looper.getMainLooper() && !"robolectric".equals(Build.FINGERPRINT)) {
            CBLogging.b("CBIdentity", "I must be called from a background thread");
            return null;
        }
        if (b()) {
            c();
        } else {
            a(com.chartboost.sdk.i.m);
        }
        String str = this.f3575b;
        JSONObject jSONObject = new JSONObject();
        if (this.f3576c != null && str == null) {
            e.a(jSONObject, "uuid", this.f3576c);
        }
        if (str != null) {
            e.a(jSONObject, "gaid", str);
        }
        return new a(this.f3574a, Base64.encodeToString(jSONObject.toString().getBytes(), 0), str != null ? "000000000" : this.f3576c, str);
    }

    private static boolean b() {
        return !"Amazon".equalsIgnoreCase(Build.MANUFACTURER);
    }

    private void c() {
        if (as.a(com.chartboost.sdk.i.m)) {
            com.chartboost.sdk.Libraries.a aVar = new com.chartboost.sdk.Libraries.a(com.chartboost.sdk.i.m);
            this.f3574a = aVar.f3569a;
            this.f3575b = aVar.f3570b;
        }
    }

    private void a(Context context) {
        try {
            ContentResolver contentResolver = context.getContentResolver();
            if (!(Settings.Secure.getInt(contentResolver, "limit_ad_tracking") != 0)) {
                String string = Settings.Secure.getString(contentResolver, TapjoyConstants.TJC_ADVERTISING_ID);
                if ("00000000-0000-0000-0000-000000000000".equals(string)) {
                    this.f3574a = 1;
                    this.f3575b = null;
                } else {
                    this.f3574a = 0;
                    this.f3575b = string;
                }
            } else {
                this.f3574a = 1;
                this.f3575b = null;
            }
        } catch (Settings.SettingNotFoundException unused) {
            this.f3574a = -1;
            this.f3575b = null;
        }
    }
}
