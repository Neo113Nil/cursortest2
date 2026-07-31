package O0;

import android.content.Context;
import java.util.LinkedHashMap;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: O0.t, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0419t {

    /* renamed from: c, reason: collision with root package name */
    private static C0419t f1256c;

    /* renamed from: a, reason: collision with root package name */
    private Context f1257a;

    /* renamed from: b, reason: collision with root package name */
    private final Object f1258b = new Object();

    private C0419t() {
    }

    public static C0419t a() {
        if (f1256c == null) {
            g();
        }
        return f1256c;
    }

    private JSONObject b(Map map) {
        JSONObject jSONObject = new JSONObject();
        if (map != null) {
            try {
                for (Map.Entry entry : map.entrySet()) {
                    jSONObject.put((String) entry.getKey(), entry.getValue());
                }
            } catch (JSONException unused) {
                j0.e("hmsSdk", "Exception occured when transferring bundle to json");
            }
        }
        return jSONObject;
    }

    private static synchronized void g() {
        synchronized (C0419t.class) {
            if (f1256c == null) {
                f1256c = new C0419t();
            }
        }
    }

    public void c(Context context) {
        synchronized (this.f1258b) {
            try {
                if (this.f1257a == null) {
                    this.f1257a = context;
                    C0416p.a().b(context);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void d(String str, int i4) {
        C0416p.a().c(str, i4);
    }

    public void e(String str, int i4, String str2, LinkedHashMap linkedHashMap) {
        C0416p.a().d(str, i4, str2, b(linkedHashMap));
    }

    public void f(String str, Context context, String str2, String str3) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("_constants", str3);
            C0416p.a().d(str, 0, str2, jSONObject);
        } catch (JSONException unused) {
            j0.m("hmsSdk", "onEvent():JSON structure Exception!");
        }
    }

    public void h(String str, int i4, String str2, LinkedHashMap linkedHashMap) {
        C0416p.a().e(str, i4, str2, b(linkedHashMap), System.currentTimeMillis());
    }
}
