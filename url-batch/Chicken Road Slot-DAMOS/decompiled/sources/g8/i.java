package g8;

import android.content.Context;
import android.text.TextUtils;
import c6.l;
import c7.c0;
import java.util.Arrays;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    public final String f4313a;

    /* renamed from: b, reason: collision with root package name */
    public final String f4314b;

    /* renamed from: c, reason: collision with root package name */
    public final String f4315c;

    /* renamed from: d, reason: collision with root package name */
    public final String f4316d;

    /* renamed from: e, reason: collision with root package name */
    public final String f4317e;

    /* renamed from: f, reason: collision with root package name */
    public final String f4318f;
    public final String g;

    /* renamed from: h, reason: collision with root package name */
    public final String f4319h;

    public i(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8) {
        int i3 = g7.c.f4285a;
        c0.i("ApplicationId must be set.", true ^ (str == null || str.trim().isEmpty()));
        this.f4314b = str;
        this.f4313a = str2;
        this.f4315c = str3;
        this.f4316d = str4;
        this.f4317e = str5;
        this.f4318f = str6;
        this.g = str7;
        this.f4319h = str8;
    }

    public static i a(Context context) {
        l lVar = new l(context);
        String f3 = lVar.f("google_app_id");
        if (TextUtils.isEmpty(f3)) {
            return null;
        }
        return new i(f3, lVar.f("google_api_key"), lVar.f("firebase_database_url"), lVar.f("ga_trackingId"), lVar.f("gcm_defaultSenderId"), lVar.f("google_storage_bucket"), lVar.f("recaptcha_site_key"), lVar.f("project_id"));
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof i)) {
            return false;
        }
        i iVar = (i) obj;
        return c0.k(this.f4314b, iVar.f4314b) && c0.k(this.f4313a, iVar.f4313a) && c0.k(this.f4315c, iVar.f4315c) && c0.k(this.f4316d, iVar.f4316d) && c0.k(this.f4317e, iVar.f4317e) && c0.k(this.f4318f, iVar.f4318f) && c0.k(this.g, iVar.g) && c0.k(this.f4319h, iVar.f4319h);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f4314b, this.f4313a, this.f4315c, this.f4316d, this.f4317e, this.f4318f, this.g, this.f4319h});
    }

    public final String toString() {
        c6.e eVar = new c6.e(this);
        eVar.e(this.f4314b, "applicationId");
        eVar.e(this.f4313a, "apiKey");
        eVar.e(this.f4315c, "databaseUrl");
        eVar.e(this.f4317e, "gcmSenderId");
        eVar.e(this.f4318f, "storageBucket");
        eVar.e(this.g, "recaptchaSiteKey");
        eVar.e(this.f4319h, "projectId");
        return eVar.toString();
    }
}
