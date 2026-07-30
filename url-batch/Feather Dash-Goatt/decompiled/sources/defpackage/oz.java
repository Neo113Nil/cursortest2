package defpackage;

import android.content.Context;
import android.text.TextUtils;
import java.util.Arrays;

/* compiled from: r8-map-id-dd5e919efaf02f4d8ff55d6a5e2559a4e7180bda542179c0d9d8fc6a077876b4 */
/* loaded from: classes.dex */
public final class oz {
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final String f;
    public final String g;

    public oz(String str, String str2, String str3, String str4, String str5, String str6, String str7) {
        int i = re1.a;
        if (str == null || str.trim().isEmpty()) {
            dd0.j("ApplicationId must be set.");
            throw null;
        }
        this.b = str;
        this.a = str2;
        this.c = str3;
        this.d = str4;
        this.e = str5;
        this.f = str6;
        this.g = str7;
    }

    public static oz a(Context context) {
        c51 c51Var = new c51(context);
        String g = c51Var.g("google_app_id");
        if (TextUtils.isEmpty(g)) {
            return null;
        }
        return new oz(g, c51Var.g("google_api_key"), c51Var.g("firebase_database_url"), c51Var.g("ga_trackingId"), c51Var.g("gcm_defaultSenderId"), c51Var.g("google_storage_bucket"), c51Var.g("project_id"));
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof oz)) {
            return false;
        }
        oz ozVar = (oz) obj;
        return xa0.m(this.b, ozVar.b) && xa0.m(this.a, ozVar.a) && xa0.m(this.c, ozVar.c) && xa0.m(this.d, ozVar.d) && xa0.m(this.e, ozVar.e) && xa0.m(this.f, ozVar.f) && xa0.m(this.g, ozVar.g);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.b, this.a, this.c, this.d, this.e, this.f, this.g});
    }

    public final String toString() {
        yw ywVar = new yw(this);
        ywVar.g(this.b, "applicationId");
        ywVar.g(this.a, "apiKey");
        ywVar.g(this.c, "databaseUrl");
        ywVar.g(this.e, "gcmSenderId");
        ywVar.g(this.f, "storageBucket");
        ywVar.g(this.g, "projectId");
        return ywVar.toString();
    }
}
