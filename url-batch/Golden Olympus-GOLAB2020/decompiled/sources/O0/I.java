package O0;

import android.text.TextUtils;
import java.io.UnsupportedEncodingException;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class I {

    /* renamed from: a, reason: collision with root package name */
    private String f1117a;

    /* renamed from: b, reason: collision with root package name */
    private String f1118b;

    /* renamed from: c, reason: collision with root package name */
    private String f1119c;

    /* renamed from: d, reason: collision with root package name */
    private List f1120d;

    /* renamed from: e, reason: collision with root package name */
    private String f1121e;

    public I(String str, String str2, String str3, List list, String str4) {
        this.f1117a = str;
        this.f1118b = str2;
        this.f1119c = str3;
        this.f1120d = list;
        this.f1121e = str4;
    }

    private String a(String str, String str2) {
        String str3;
        String g4 = AbstractC0403c.g(str, str2);
        if (TextUtils.isEmpty(g4)) {
            j0.c("hmsSdk", "No report address,TAG : %s,TYPE: %s ", str, str2);
            return "";
        }
        if ("oper".equals(str2)) {
            str3 = "{url}/common/hmshioperqrt";
        } else if ("maint".equals(str2)) {
            str3 = "{url}/common/hmshimaintqrt";
        } else {
            if (!"diffprivacy".equals(str2)) {
                return "";
            }
            str3 = "{url}/common/common2";
        }
        return str3.replace("{url}", g4);
    }

    private byte[] c(C0423x c0423x) {
        String str;
        try {
            JSONObject a4 = c0423x.a();
            if (a4 != null) {
                return H.g(a4.toString().getBytes("UTF-8"));
            }
            j0.l("hmsSdk", "uploadEvents is null");
            return new byte[0];
        } catch (UnsupportedEncodingException unused) {
            str = "sendData(): getBytes - Unsupported coding format!!";
            j0.l("hmsSdk", str);
            return new byte[0];
        } catch (JSONException unused2) {
            str = "uploadEvents to json error";
            j0.l("hmsSdk", str);
            return new byte[0];
        }
    }

    private void d() {
        if (AbstractC0408h.c(Y.q(), "backup_event", 5242880)) {
            j0.j("hmsSdk", "backup file reach max limited size, delete it");
            AbstractC0413m.d(Y.q(), "backup_event", new String[0]);
            return;
        }
        JSONArray e4 = e();
        String e5 = P.e(this.f1117a, this.f1118b, this.f1121e);
        j0.h("hmsSdk", "Update data cached into backup,spKey: " + e5);
        AbstractC0413m.g(Y.q(), "backup_event", e5, e4.toString());
    }

    private JSONArray e() {
        JSONArray jSONArray = new JSONArray();
        Iterator it = this.f1120d.iterator();
        while (it.hasNext()) {
            try {
                jSONArray.put(((C0406f) it.next()).h());
            } catch (JSONException unused) {
                j0.h("hmsSdk", "handleEvents: json error,Abandon this data");
            }
        }
        return jSONArray;
    }

    private C0423x f() {
        return F.f(this.f1120d, this.f1117a, this.f1118b, this.f1121e, this.f1119c);
    }

    public void b() {
        String a4 = a(this.f1117a, this.f1118b);
        if (TextUtils.isEmpty(a4) && !"preins".equals(this.f1118b)) {
            j0.l("hmsSdk", "collectUrl is empty");
            return;
        }
        if (!"_hms_config_tag".equals(this.f1117a) && !"_openness_config_tag".equals(this.f1117a)) {
            d();
        }
        C0423x f4 = f();
        if (f4 == null) {
            C0405e.d().b(new C0412l(this.f1120d, this.f1117a, this.f1121e, this.f1118b));
            return;
        }
        byte[] c4 = c(f4);
        if (c4.length == 0) {
            j0.l("hmsSdk", "request body is empty");
        } else {
            C0405e.c().b(new C0418s(c4, a4, this.f1117a, this.f1118b, this.f1121e, this.f1120d));
        }
    }
}
