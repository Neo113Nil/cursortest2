package O0;

import android.content.Context;
import android.text.TextUtils;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: O0.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C0402b implements InterfaceRunnableC0421v {

    /* renamed from: b, reason: collision with root package name */
    private Context f1163b = Y.q();

    /* renamed from: c, reason: collision with root package name */
    private String f1164c;

    /* renamed from: d, reason: collision with root package name */
    private JSONObject f1165d;

    /* renamed from: e, reason: collision with root package name */
    private String f1166e;

    /* renamed from: f, reason: collision with root package name */
    private String f1167f;

    /* renamed from: g, reason: collision with root package name */
    private String f1168g;

    /* renamed from: h, reason: collision with root package name */
    private String f1169h;

    /* renamed from: i, reason: collision with root package name */
    private Boolean f1170i;

    public C0402b(String str, JSONObject jSONObject, String str2, String str3, long j4) {
        this.f1164c = str;
        this.f1165d = jSONObject;
        this.f1166e = str2;
        this.f1167f = str3;
        this.f1168g = String.valueOf(j4);
        if (r0.i(str2, "oper")) {
            V b4 = p0.c().b(str2, j4);
            this.f1169h = b4.a();
            this.f1170i = Boolean.valueOf(b4.f());
        }
    }

    @Override // java.lang.Runnable
    public void run() {
        JSONArray jSONArray;
        j0.b("hmsSdk", "Begin to run EventRecordTask...");
        int o4 = Y.o();
        int l4 = AbstractC0403c.l(this.f1166e, this.f1167f);
        if (AbstractC0408h.c(this.f1163b, "stat_v2_1", o4 * 1048576)) {
            j0.h("hmsSdk", "stat sp file reach max limited size, delete it");
            AbstractC0413m.d(this.f1163b, "stat_v2_1", new String[0]);
            return;
        }
        C0406f c0406f = new C0406f();
        c0406f.e(this.f1164c);
        c0406f.b(this.f1165d.toString());
        c0406f.i(this.f1167f);
        c0406f.g(this.f1168g);
        c0406f.k(this.f1169h);
        Boolean bool = this.f1170i;
        c0406f.j(bool == null ? null : String.valueOf(bool));
        try {
            JSONObject h4 = c0406f.h();
            String d4 = P.d(this.f1166e, this.f1167f);
            String b4 = AbstractC0413m.b(this.f1163b, "stat_v2_1", d4, "");
            try {
                jSONArray = !TextUtils.isEmpty(b4) ? new JSONArray(b4) : new JSONArray();
            } catch (JSONException unused) {
                j0.j("hmsSdk", "Cached data corrupted: stat_v2_1");
                jSONArray = new JSONArray();
            }
            jSONArray.put(h4);
            AbstractC0413m.g(this.f1163b, "stat_v2_1", d4, jSONArray.toString());
            if (jSONArray.toString().length() > l4 * 1024) {
                C0416p.a().f(this.f1166e, this.f1167f);
            }
        } catch (JSONException unused2) {
            j0.l("hmsSdk", "eventRecord toJson error! The record failed.");
        }
    }
}
