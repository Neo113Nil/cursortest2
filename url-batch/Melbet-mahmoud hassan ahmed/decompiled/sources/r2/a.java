package r2;

import androidx.annotation.RecentlyNonNull;
import com.google.android.gms.internal.ads.cv;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class a {

    /* renamed from: a, reason: collision with root package name */
    private final int f21124a;

    /* renamed from: b, reason: collision with root package name */
    private final String f21125b;

    /* renamed from: c, reason: collision with root package name */
    private final String f21126c;

    /* renamed from: d, reason: collision with root package name */
    private final a f21127d;

    public a(int i7, @RecentlyNonNull String str, @RecentlyNonNull String str2) {
        this(i7, str, str2, null);
    }

    public a(int i7, @RecentlyNonNull String str, @RecentlyNonNull String str2, a aVar) {
        this.f21124a = i7;
        this.f21125b = str;
        this.f21126c = str2;
        this.f21127d = aVar;
    }

    public int a() {
        return this.f21124a;
    }

    public String b() {
        return this.f21126c;
    }

    public String c() {
        return this.f21125b;
    }

    public final cv d() {
        a aVar = this.f21127d;
        return new cv(this.f21124a, this.f21125b, this.f21126c, aVar == null ? null : new cv(aVar.f21124a, aVar.f21125b, aVar.f21126c, null, null), null);
    }

    @RecentlyNonNull
    public JSONObject e() {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("Code", this.f21124a);
        jSONObject.put("Message", this.f21125b);
        jSONObject.put("Domain", this.f21126c);
        a aVar = this.f21127d;
        jSONObject.put("Cause", aVar == null ? "null" : aVar.e());
        return jSONObject;
    }

    @RecentlyNonNull
    public String toString() {
        try {
            return e().toString(2);
        } catch (JSONException unused) {
            return "Error forming toString output.";
        }
    }
}
