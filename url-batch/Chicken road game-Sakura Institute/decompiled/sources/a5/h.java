package a5;

import android.content.Context;
import android.text.TextUtils;
import java.util.Arrays;
import m4.o;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    public final String f512a;

    /* renamed from: b, reason: collision with root package name */
    public final String f513b;

    /* renamed from: c, reason: collision with root package name */
    public final String f514c;

    /* renamed from: d, reason: collision with root package name */
    public final String f515d;

    /* renamed from: e, reason: collision with root package name */
    public final String f516e;

    /* renamed from: f, reason: collision with root package name */
    public final String f517f;

    /* renamed from: g, reason: collision with root package name */
    public final String f518g;

    public h(String str, String str2, String str3, String str4, String str5, String str6, String str7) {
        int i7 = q4.a.f7512a;
        if (str == null || str.trim().isEmpty()) {
            throw new IllegalStateException("ApplicationId must be set.");
        }
        this.f513b = str;
        this.f512a = str2;
        this.f514c = str3;
        this.f515d = str4;
        this.f516e = str5;
        this.f517f = str6;
        this.f518g = str7;
    }

    public static h a(Context context) {
        androidx.room.c cVar = new androidx.room.c(context);
        String v5 = cVar.v("google_app_id");
        if (TextUtils.isEmpty(v5)) {
            return null;
        }
        return new h(v5, cVar.v("google_api_key"), cVar.v("firebase_database_url"), cVar.v("ga_trackingId"), cVar.v("gcm_defaultSenderId"), cVar.v("google_storage_bucket"), cVar.v("project_id"));
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        return o.f(this.f513b, hVar.f513b) && o.f(this.f512a, hVar.f512a) && o.f(this.f514c, hVar.f514c) && o.f(this.f515d, hVar.f515d) && o.f(this.f516e, hVar.f516e) && o.f(this.f517f, hVar.f517f) && o.f(this.f518g, hVar.f518g);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f513b, this.f512a, this.f514c, this.f515d, this.f516e, this.f517f, this.f518g});
    }

    public final String toString() {
        androidx.room.c cVar = new androidx.room.c(this);
        cVar.l(this.f513b, "applicationId");
        cVar.l(this.f512a, "apiKey");
        cVar.l(this.f514c, "databaseUrl");
        cVar.l(this.f516e, "gcmSenderId");
        cVar.l(this.f517f, "storageBucket");
        cVar.l(this.f518g, "projectId");
        return cVar.toString();
    }
}
