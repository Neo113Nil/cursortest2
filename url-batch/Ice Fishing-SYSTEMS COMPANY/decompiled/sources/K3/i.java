package K3;

import O2.w;
import S0.l;
import S0.s;
import android.content.Context;
import android.text.TextUtils;
import java.util.Arrays;

/* loaded from: classes2.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    public final String f1636a;

    /* renamed from: b, reason: collision with root package name */
    public final String f1637b;

    /* renamed from: c, reason: collision with root package name */
    public final String f1638c;

    /* renamed from: d, reason: collision with root package name */
    public final String f1639d;

    /* renamed from: e, reason: collision with root package name */
    public final String f1640e;

    /* renamed from: f, reason: collision with root package name */
    public final String f1641f;

    /* renamed from: g, reason: collision with root package name */
    public final String f1642g;

    public i(String str, String str2, String str3, String str4, String str5, String str6, String str7) {
        int i = S2.c.f2974a;
        w.j("ApplicationId must be set.", true ^ (str == null || str.trim().isEmpty()));
        this.f1637b = str;
        this.f1636a = str2;
        this.f1638c = str3;
        this.f1639d = str4;
        this.f1640e = str5;
        this.f1641f = str6;
        this.f1642g = str7;
    }

    public static i a(Context context) {
        s sVar = new s(context);
        String e6 = sVar.e("google_app_id");
        if (TextUtils.isEmpty(e6)) {
            return null;
        }
        return new i(e6, sVar.e("google_api_key"), sVar.e("firebase_database_url"), sVar.e("ga_trackingId"), sVar.e("gcm_defaultSenderId"), sVar.e("google_storage_bucket"), sVar.e("project_id"));
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof i)) {
            return false;
        }
        i iVar = (i) obj;
        return w.l(this.f1637b, iVar.f1637b) && w.l(this.f1636a, iVar.f1636a) && w.l(this.f1638c, iVar.f1638c) && w.l(this.f1639d, iVar.f1639d) && w.l(this.f1640e, iVar.f1640e) && w.l(this.f1641f, iVar.f1641f) && w.l(this.f1642g, iVar.f1642g);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f1637b, this.f1636a, this.f1638c, this.f1639d, this.f1640e, this.f1641f, this.f1642g});
    }

    public final String toString() {
        l lVar = new l(this);
        lVar.j(this.f1637b, "applicationId");
        lVar.j(this.f1636a, "apiKey");
        lVar.j(this.f1638c, "databaseUrl");
        lVar.j(this.f1640e, "gcmSenderId");
        lVar.j(this.f1641f, "storageBucket");
        lVar.j(this.f1642g, "projectId");
        return lVar.toString();
    }
}
