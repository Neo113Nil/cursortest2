package V1;

import H1.o;
import android.content.Context;
import android.text.TextUtils;
import java.util.Arrays;
import y.t;

/* loaded from: classes.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    public final String f4178a;

    /* renamed from: b, reason: collision with root package name */
    public final String f4179b;

    /* renamed from: c, reason: collision with root package name */
    public final String f4180c;

    /* renamed from: d, reason: collision with root package name */
    public final String f4181d;

    /* renamed from: e, reason: collision with root package name */
    public final String f4182e;

    /* renamed from: f, reason: collision with root package name */
    public final String f4183f;

    /* renamed from: g, reason: collision with root package name */
    public final String f4184g;

    public h(String str, String str2, String str3, String str4, String str5, String str6, String str7) {
        int i2 = L1.a.f3528a;
        if (str == null || str.trim().isEmpty()) {
            throw new IllegalStateException("ApplicationId must be set.");
        }
        this.f4179b = str;
        this.f4178a = str2;
        this.f4180c = str3;
        this.f4181d = str4;
        this.f4182e = str5;
        this.f4183f = str6;
        this.f4184g = str7;
    }

    public static h a(Context context) {
        t tVar = new t(context);
        String q2 = tVar.q("google_app_id");
        if (TextUtils.isEmpty(q2)) {
            return null;
        }
        return new h(q2, tVar.q("google_api_key"), tVar.q("firebase_database_url"), tVar.q("ga_trackingId"), tVar.q("gcm_defaultSenderId"), tVar.q("google_storage_bucket"), tVar.q("project_id"));
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        return o.f(this.f4179b, hVar.f4179b) && o.f(this.f4178a, hVar.f4178a) && o.f(this.f4180c, hVar.f4180c) && o.f(this.f4181d, hVar.f4181d) && o.f(this.f4182e, hVar.f4182e) && o.f(this.f4183f, hVar.f4183f) && o.f(this.f4184g, hVar.f4184g);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f4179b, this.f4178a, this.f4180c, this.f4181d, this.f4182e, this.f4183f, this.f4184g});
    }

    public final String toString() {
        t tVar = new t(this);
        tVar.h(this.f4179b, "applicationId");
        tVar.h(this.f4178a, "apiKey");
        tVar.h(this.f4180c, "databaseUrl");
        tVar.h(this.f4182e, "gcmSenderId");
        tVar.h(this.f4183f, "storageBucket");
        tVar.h(this.f4184g, "projectId");
        return tVar.toString();
    }
}
