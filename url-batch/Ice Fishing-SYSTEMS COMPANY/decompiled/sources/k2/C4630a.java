package k2;

import org.json.JSONException;
import org.json.JSONObject;
import q2.C4927z0;

/* renamed from: k2.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C4630a {

    /* renamed from: a, reason: collision with root package name */
    public final int f38688a;

    /* renamed from: b, reason: collision with root package name */
    public final String f38689b;

    /* renamed from: c, reason: collision with root package name */
    public final String f38690c;

    /* renamed from: d, reason: collision with root package name */
    public final C4630a f38691d;

    public C4630a(int i, String str, String str2, C4630a c4630a) {
        this.f38688a = i;
        this.f38689b = str;
        this.f38690c = str2;
        this.f38691d = c4630a;
    }

    public final C4927z0 a() {
        C4630a c4630a = this.f38691d;
        return new C4927z0(this.f38688a, this.f38689b, this.f38690c, c4630a == null ? null : new C4927z0(c4630a.f38688a, c4630a.f38689b, c4630a.f38690c, null, null), null);
    }

    public JSONObject b() {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("Code", this.f38688a);
        jSONObject.put("Message", this.f38689b);
        jSONObject.put("Domain", this.f38690c);
        C4630a c4630a = this.f38691d;
        if (c4630a == null) {
            jSONObject.put("Cause", "null");
            return jSONObject;
        }
        jSONObject.put("Cause", c4630a.b());
        return jSONObject;
    }

    public String toString() {
        try {
            return b().toString(2);
        } catch (JSONException unused) {
            return "Error forming toString output.";
        }
    }
}
