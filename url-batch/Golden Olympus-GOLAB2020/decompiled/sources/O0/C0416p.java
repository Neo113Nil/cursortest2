package O0;

import android.content.Context;
import android.text.TextUtils;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;
import ru.rustore.sdk.user.profile.UserProfileProvider;

/* renamed from: O0.p, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C0416p {

    /* renamed from: b, reason: collision with root package name */
    private static C0416p f1242b;

    /* renamed from: c, reason: collision with root package name */
    private static Map f1243c = new HashMap();

    /* renamed from: a, reason: collision with root package name */
    private Context f1244a;

    public static C0416p a() {
        return h();
    }

    private static synchronized C0416p h() {
        C0416p c0416p;
        synchronized (C0416p.class) {
            try {
                if (f1242b == null) {
                    f1242b = new C0416p();
                }
                c0416p = f1242b;
            } catch (Throwable th) {
                throw th;
            }
        }
        return c0416p;
    }

    private void i(Context context) {
        String j4 = S.j(context);
        Y.b(j4);
        if (!Z.b().a()) {
            j0.h("hmsSdk", "userManager.isUserUnlocked() == false");
            return;
        }
        String b4 = AbstractC0413m.b(context, "global_v2", "app_ver", "");
        AbstractC0413m.g(context, "global_v2", "app_ver", j4);
        Y.d(b4);
        if (TextUtils.isEmpty(b4)) {
            j0.h("hmsSdk", "app ver is first save!");
        } else {
            if (b4.equals(j4)) {
                return;
            }
            j0.h("hmsSdk", "the appVers are different!");
            a().g("", "alltype", b4);
        }
    }

    public void b(Context context) {
        this.f1244a = context;
        i(context);
        d0.e().d().q(S.c());
    }

    public void c(String str, int i4) {
        if (this.f1244a == null) {
            j0.l("hmsSdk", "onReport() null context or SDK was not init.");
        } else {
            j0.b("hmsSdk", "onReport: Before calling runtaskhandler()");
            g(str, P.c(i4), Y.m());
        }
    }

    public void d(String str, int i4, String str2, JSONObject jSONObject) {
        long currentTimeMillis = System.currentTimeMillis();
        if (2 == i4) {
            currentTimeMillis = P.a("yyyy-MM-dd", currentTimeMillis);
        }
        C0405e.d().b(new C0402b(str2, jSONObject, str, P.c(i4), currentTimeMillis));
    }

    public void e(String str, int i4, String str2, JSONObject jSONObject, long j4) {
        new A(str, P.c(i4), str2, jSONObject.toString(), j4).a();
    }

    public void f(String str, String str2) {
        if (!AbstractC0403c.b(str, str2)) {
            j0.h("hmsSdk", "auto report is closed tag:" + str);
            return;
        }
        long k4 = AbstractC0403c.k(str, str2);
        long currentTimeMillis = System.currentTimeMillis();
        if (currentTimeMillis - k4 <= UserProfileProvider.SERVICE_CONNECTION_TIMEOUT_MS) {
            j0.m("hmsSdk", "autoReport timeout. interval < 30s ");
            return;
        }
        j0.b("hmsSdk", "begin to call onReport!");
        AbstractC0403c.a(str, str2, currentTimeMillis);
        g(str, str2, Y.m());
    }

    public void g(String str, String str2, String str3) {
        Context context = this.f1244a;
        if (context == null) {
            j0.l("hmsSdk", "onReport() null context or SDK was not init.");
            return;
        }
        String d4 = b0.d(context);
        if (AbstractC0403c.f(str, str2) && !"WIFI".equals(d4)) {
            j0.h("hmsSdk", "strNetworkType is :" + d4);
            return;
        }
        if ("unknown".equals(d4) || "none".equals(d4) || "2G".equals(d4)) {
            j0.l("hmsSdk", "The network is bad.");
        } else {
            C0405e.d().b(new i0(str, str2, str3));
        }
    }
}
