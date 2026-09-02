package m1;

import U0.t;
import android.content.Context;
import android.text.TextUtils;
import java.util.Arrays;
import u0.C0675e;
import u0.C0682l;

/* loaded from: classes.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    public final String f5439a;

    /* renamed from: b, reason: collision with root package name */
    public final String f5440b;

    /* renamed from: c, reason: collision with root package name */
    public final String f5441c;

    /* renamed from: d, reason: collision with root package name */
    public final String f5442d;

    /* renamed from: e, reason: collision with root package name */
    public final String f5443e;

    /* renamed from: f, reason: collision with root package name */
    public final String f5444f;

    /* renamed from: g, reason: collision with root package name */
    public final String f5445g;

    public i(String str, String str2, String str3, String str4, String str5, String str6, String str7) {
        int i7 = Y0.c.f3090a;
        t.h("ApplicationId must be set.", true ^ (str == null || str.trim().isEmpty()));
        this.f5440b = str;
        this.f5439a = str2;
        this.f5441c = str3;
        this.f5442d = str4;
        this.f5443e = str5;
        this.f5444f = str6;
        this.f5445g = str7;
    }

    public static i a(Context context) {
        C0682l c0682l = new C0682l(context, 8);
        String k4 = c0682l.k("google_app_id");
        if (TextUtils.isEmpty(k4)) {
            return null;
        }
        return new i(k4, c0682l.k("google_api_key"), c0682l.k("firebase_database_url"), c0682l.k("ga_trackingId"), c0682l.k("gcm_defaultSenderId"), c0682l.k("google_storage_bucket"), c0682l.k("project_id"));
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof i)) {
            return false;
        }
        i iVar = (i) obj;
        return t.i(this.f5440b, iVar.f5440b) && t.i(this.f5439a, iVar.f5439a) && t.i(this.f5441c, iVar.f5441c) && t.i(this.f5442d, iVar.f5442d) && t.i(this.f5443e, iVar.f5443e) && t.i(this.f5444f, iVar.f5444f) && t.i(this.f5445g, iVar.f5445g);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f5440b, this.f5439a, this.f5441c, this.f5442d, this.f5443e, this.f5444f, this.f5445g});
    }

    public final String toString() {
        C0675e c0675e = new C0675e(this);
        c0675e.b(this.f5440b, "applicationId");
        c0675e.b(this.f5439a, "apiKey");
        c0675e.b(this.f5441c, "databaseUrl");
        c0675e.b(this.f5443e, "gcmSenderId");
        c0675e.b(this.f5444f, "storageBucket");
        c0675e.b(this.f5445g, "projectId");
        return c0675e.toString();
    }
}
