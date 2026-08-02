package M2;

import F2.i;
import J2.h;
import O3.l;
import android.app.UiModeManager;
import android.os.Build;
import android.webkit.WebView;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import k.q0;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes.dex */
public abstract class a {

    /* renamed from: a, reason: collision with root package name */
    public final String f1749a;

    /* renamed from: c, reason: collision with root package name */
    public F2.a f1751c;

    /* renamed from: d, reason: collision with root package name */
    public G2.b f1752d;

    /* renamed from: f, reason: collision with root package name */
    public long f1754f = System.nanoTime();

    /* renamed from: e, reason: collision with root package name */
    public int f1753e = 1;

    /* renamed from: b, reason: collision with root package name */
    public Q2.a f1750b = new Q2.a(null);

    public a(String str) {
        this.f1749a = str;
    }

    public static JSONArray a(List list) {
        JSONArray jSONArray = new JSONArray();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ((H2.c) ((H2.a) it.next())).getClass();
            for (String str : Collections.singletonList("1.0")) {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("mechanism", "FireTVFOSDAT");
                jSONObject.put("executionEnvironment", "NATIVE");
                jSONObject.put("version", str);
                jSONArray.put(jSONObject);
            }
        }
        return jSONArray;
    }

    public void b(i iVar, q0 q0Var) {
        c(iVar, q0Var, null);
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x005c, code lost:
    
        if (r1 != 4) goto L10;
     */
    /* JADX WARN: Removed duplicated region for block: B:16:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00ef A[LOOP:0: B:18:0x00e9->B:20:0x00ef, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0065  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void c(i iVar, q0 q0Var, JSONObject jSONObject) {
        char c4;
        String str;
        String str2;
        String str3 = iVar.f788h;
        JSONObject jSONObject2 = new JSONObject();
        N2.b.b(jSONObject2, "environment", "app");
        N2.b.b(jSONObject2, "adSessionType", (F2.c) q0Var.f14088g);
        JSONObject jSONObject3 = new JSONObject();
        N2.b.b(jSONObject3, "deviceType", Build.MANUFACTURER + "; " + Build.MODEL);
        N2.b.b(jSONObject3, "osVersion", Integer.toString(Build.VERSION.SDK_INT));
        N2.b.b(jSONObject3, "os", "Android");
        N2.b.b(jSONObject2, "deviceInfo", jSONObject3);
        UiModeManager uiModeManager = l.f2077a;
        if (uiModeManager != null) {
            int currentModeType = uiModeManager.getCurrentModeType();
            c4 = 1;
            if (currentModeType == 1) {
                c4 = 2;
            }
            if (c4 != 1) {
                str = "ctv";
            } else if (c4 == 2) {
                str = "mobile";
            } else {
                if (c4 != 3) {
                    throw null;
                }
                str = "other";
            }
            N2.b.b(jSONObject2, "deviceCategory", str);
            JSONArray jSONArray = new JSONArray();
            jSONArray.put("clid");
            jSONArray.put("vlid");
            N2.b.b(jSONObject2, "supports", jSONArray);
            JSONObject jSONObject4 = new JSONObject();
            ((a2.i) q0Var.f14082a).getClass();
            N2.b.b(jSONObject4, "partnerName", "Startio");
            N2.b.b(jSONObject4, "partnerVersion", "5.3.0");
            N2.b.b(jSONObject2, "omidNativeInfo", jSONObject4);
            JSONObject jSONObject5 = new JSONObject();
            N2.b.b(jSONObject5, "libraryVersion", "1.6.0-Startio");
            N2.b.b(jSONObject5, "appId", h.f1183b.f1184a.getApplicationContext().getPackageName());
            N2.b.b(jSONObject2, "app", jSONObject5);
            str2 = (String) q0Var.f14087f;
            if (str2 != null) {
                N2.b.b(jSONObject2, "customReferenceData", str2);
            }
            JSONObject jSONObject6 = new JSONObject();
            for (F2.h hVar : Collections.unmodifiableList((ArrayList) q0Var.f14084c)) {
                N2.b.b(jSONObject6, hVar.f778a, hVar.f780c);
            }
            J2.i.f1185a.a(g(), "startSession", str3, jSONObject2, jSONObject6, jSONObject);
        }
        c4 = 3;
        if (c4 != 1) {
        }
        N2.b.b(jSONObject2, "deviceCategory", str);
        JSONArray jSONArray2 = new JSONArray();
        jSONArray2.put("clid");
        jSONArray2.put("vlid");
        N2.b.b(jSONObject2, "supports", jSONArray2);
        JSONObject jSONObject42 = new JSONObject();
        ((a2.i) q0Var.f14082a).getClass();
        N2.b.b(jSONObject42, "partnerName", "Startio");
        N2.b.b(jSONObject42, "partnerVersion", "5.3.0");
        N2.b.b(jSONObject2, "omidNativeInfo", jSONObject42);
        JSONObject jSONObject52 = new JSONObject();
        N2.b.b(jSONObject52, "libraryVersion", "1.6.0-Startio");
        N2.b.b(jSONObject52, "appId", h.f1183b.f1184a.getApplicationContext().getPackageName());
        N2.b.b(jSONObject2, "app", jSONObject52);
        str2 = (String) q0Var.f14087f;
        if (str2 != null) {
        }
        JSONObject jSONObject62 = new JSONObject();
        while (r7.hasNext()) {
        }
        J2.i.f1185a.a(g(), "startSession", str3, jSONObject2, jSONObject62, jSONObject);
    }

    public final void d(String str, JSONObject jSONObject) {
        J2.i.f1185a.a(g(), "publishMediaEvent", str, jSONObject, this.f1749a);
    }

    public final void e(Date date) {
        if (date == null) {
            return;
        }
        JSONObject jSONObject = new JSONObject();
        N2.b.b(jSONObject, "timestamp", Long.valueOf(date.getTime()));
        J2.i.f1185a.a(g(), "setLastActivity", jSONObject);
    }

    public void f() {
        this.f1750b.clear();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final WebView g() {
        return (WebView) this.f1750b.get();
    }

    public void h() {
    }
}
