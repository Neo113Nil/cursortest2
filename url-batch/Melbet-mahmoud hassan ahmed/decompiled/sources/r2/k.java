package r2;

import android.os.Bundle;
import androidx.annotation.RecentlyNonNull;
import androidx.annotation.RecentlyNullable;
import com.google.android.gms.internal.ads.cv;
import com.google.android.gms.internal.ads.tv;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class k {

    /* renamed from: a, reason: collision with root package name */
    private final tv f21164a;

    /* renamed from: b, reason: collision with root package name */
    private final a f21165b;

    private k(tv tvVar) {
        this.f21164a = tvVar;
        cv cvVar = tvVar.f12385h;
        this.f21165b = cvVar == null ? null : cvVar.c();
    }

    public static k e(tv tvVar) {
        if (tvVar != null) {
            return new k(tvVar);
        }
        return null;
    }

    @RecentlyNullable
    public a a() {
        return this.f21165b;
    }

    @RecentlyNonNull
    public String b() {
        return this.f21164a.f12383f;
    }

    @RecentlyNonNull
    public Bundle c() {
        return this.f21164a.f12386i;
    }

    public long d() {
        return this.f21164a.f12384g;
    }

    @RecentlyNonNull
    public final JSONObject f() {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("Adapter", this.f21164a.f12383f);
        jSONObject.put("Latency", this.f21164a.f12384g);
        JSONObject jSONObject2 = new JSONObject();
        for (String str : this.f21164a.f12386i.keySet()) {
            jSONObject2.put(str, this.f21164a.f12386i.get(str));
        }
        jSONObject.put("Credentials", jSONObject2);
        a aVar = this.f21165b;
        jSONObject.put("Ad Error", aVar == null ? "null" : aVar.e());
        return jSONObject;
    }

    @RecentlyNonNull
    public String toString() {
        try {
            return f().toString(2);
        } catch (JSONException unused) {
            return "Error forming toString output.";
        }
    }
}
