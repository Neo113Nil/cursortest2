package P1;

import P0.l;
import android.content.Context;
import android.text.TextUtils;
import java.util.Arrays;
import t1.u;
import x1.AbstractC1001c;

/* loaded from: classes.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    public final String f2279a;

    /* renamed from: b, reason: collision with root package name */
    public final String f2280b;

    /* renamed from: c, reason: collision with root package name */
    public final String f2281c;

    /* renamed from: d, reason: collision with root package name */
    public final String f2282d;

    /* renamed from: e, reason: collision with root package name */
    public final String f2283e;

    /* renamed from: f, reason: collision with root package name */
    public final String f2284f;

    /* renamed from: g, reason: collision with root package name */
    public final String f2285g;

    /* renamed from: h, reason: collision with root package name */
    public final String f2286h;

    public h(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8) {
        int i2 = AbstractC1001c.f8326a;
        u.h("ApplicationId must be set.", true ^ (str == null || str.trim().isEmpty()));
        this.f2280b = str;
        this.f2279a = str2;
        this.f2281c = str3;
        this.f2282d = str4;
        this.f2283e = str5;
        this.f2284f = str6;
        this.f2285g = str7;
        this.f2286h = str8;
    }

    public static h a(Context context) {
        l lVar = new l(context);
        String b7 = lVar.b("google_app_id");
        if (TextUtils.isEmpty(b7)) {
            return null;
        }
        return new h(b7, lVar.b("google_api_key"), lVar.b("firebase_database_url"), lVar.b("ga_trackingId"), lVar.b("gcm_defaultSenderId"), lVar.b("google_storage_bucket"), lVar.b("recaptcha_site_key"), lVar.b("project_id"));
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        return u.i(this.f2280b, hVar.f2280b) && u.i(this.f2279a, hVar.f2279a) && u.i(this.f2281c, hVar.f2281c) && u.i(this.f2282d, hVar.f2282d) && u.i(this.f2283e, hVar.f2283e) && u.i(this.f2284f, hVar.f2284f) && u.i(this.f2285g, hVar.f2285g) && u.i(this.f2286h, hVar.f2286h);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f2280b, this.f2279a, this.f2281c, this.f2282d, this.f2283e, this.f2284f, this.f2285g, this.f2286h});
    }

    public final String toString() {
        P0.e eVar = new P0.e(this);
        eVar.l(this.f2280b, "applicationId");
        eVar.l(this.f2279a, "apiKey");
        eVar.l(this.f2281c, "databaseUrl");
        eVar.l(this.f2283e, "gcmSenderId");
        eVar.l(this.f2284f, "storageBucket");
        eVar.l(this.f2285g, "recaptchaSiteKey");
        eVar.l(this.f2286h, "projectId");
        return eVar.toString();
    }
}
