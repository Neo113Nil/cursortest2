package q1;

import U1.C0080a;
import android.app.UiModeManager;
import android.os.Build;
import android.webkit.WebView;
import j1.C1052a;
import j1.EnumC1054c;
import j1.i;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import k1.C1078b;
import l.t0;
import l1.InterfaceC1104a;
import n1.h;
import org.json.JSONArray;
import org.json.JSONObject;
import u1.C1221a;

/* renamed from: q1.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC1180a {

    /* renamed from: a, reason: collision with root package name */
    public final String f10229a;

    /* renamed from: c, reason: collision with root package name */
    public C1052a f10231c;

    /* renamed from: d, reason: collision with root package name */
    public C1078b f10232d;
    public long f = System.nanoTime();

    /* renamed from: e, reason: collision with root package name */
    public int f10233e = 1;

    /* renamed from: b, reason: collision with root package name */
    public C1221a f10230b = new C1221a(null);

    public AbstractC1180a(String str) {
        this.f10229a = str;
    }

    public static JSONArray a(List list) {
        JSONArray jSONArray = new JSONArray();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ((l1.c) ((InterfaceC1104a) it.next())).getClass();
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

    public void b(i iVar, t0 t0Var) {
        c(iVar, t0Var, null);
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
    public final void c(i iVar, t0 t0Var, JSONObject jSONObject) {
        char c3;
        String str;
        String str2;
        String str3 = iVar.f9546h;
        JSONObject jSONObject2 = new JSONObject();
        r1.b.b(jSONObject2, "environment", "app");
        r1.b.b(jSONObject2, "adSessionType", (EnumC1054c) t0Var.f9914g);
        JSONObject jSONObject3 = new JSONObject();
        r1.b.b(jSONObject3, "deviceType", Build.MANUFACTURER + "; " + Build.MODEL);
        r1.b.b(jSONObject3, "osVersion", Integer.toString(Build.VERSION.SDK_INT));
        r1.b.b(jSONObject3, "os", "Android");
        r1.b.b(jSONObject2, "deviceInfo", jSONObject3);
        UiModeManager uiModeManager = C2.b.f223a;
        if (uiModeManager != null) {
            int currentModeType = uiModeManager.getCurrentModeType();
            c3 = 1;
            if (currentModeType == 1) {
                c3 = 2;
            }
            if (c3 != 1) {
                str = "ctv";
            } else if (c3 == 2) {
                str = "mobile";
            } else {
                if (c3 != 3) {
                    throw null;
                }
                str = "other";
            }
            r1.b.b(jSONObject2, "deviceCategory", str);
            JSONArray jSONArray = new JSONArray();
            jSONArray.put("clid");
            jSONArray.put("vlid");
            r1.b.b(jSONObject2, "supports", jSONArray);
            JSONObject jSONObject4 = new JSONObject();
            ((C0080a) t0Var.f9909a).getClass();
            r1.b.b(jSONObject4, "partnerName", "Startio");
            r1.b.b(jSONObject4, "partnerVersion", "5.3.0");
            r1.b.b(jSONObject2, "omidNativeInfo", jSONObject4);
            JSONObject jSONObject5 = new JSONObject();
            r1.b.b(jSONObject5, "libraryVersion", "1.6.0-Startio");
            r1.b.b(jSONObject5, "appId", h.f10158b.f10159a.getApplicationContext().getPackageName());
            r1.b.b(jSONObject2, "app", jSONObject5);
            str2 = (String) t0Var.f;
            if (str2 != null) {
                r1.b.b(jSONObject2, "customReferenceData", str2);
            }
            JSONObject jSONObject6 = new JSONObject();
            for (j1.h hVar : Collections.unmodifiableList((ArrayList) t0Var.f9911c)) {
                r1.b.b(jSONObject6, hVar.f9537a, hVar.f9539c);
            }
            n1.i.f10160a.a(g(), "startSession", str3, jSONObject2, jSONObject6, jSONObject);
        }
        c3 = 3;
        if (c3 != 1) {
        }
        r1.b.b(jSONObject2, "deviceCategory", str);
        JSONArray jSONArray2 = new JSONArray();
        jSONArray2.put("clid");
        jSONArray2.put("vlid");
        r1.b.b(jSONObject2, "supports", jSONArray2);
        JSONObject jSONObject42 = new JSONObject();
        ((C0080a) t0Var.f9909a).getClass();
        r1.b.b(jSONObject42, "partnerName", "Startio");
        r1.b.b(jSONObject42, "partnerVersion", "5.3.0");
        r1.b.b(jSONObject2, "omidNativeInfo", jSONObject42);
        JSONObject jSONObject52 = new JSONObject();
        r1.b.b(jSONObject52, "libraryVersion", "1.6.0-Startio");
        r1.b.b(jSONObject52, "appId", h.f10158b.f10159a.getApplicationContext().getPackageName());
        r1.b.b(jSONObject2, "app", jSONObject52);
        str2 = (String) t0Var.f;
        if (str2 != null) {
        }
        JSONObject jSONObject62 = new JSONObject();
        while (r7.hasNext()) {
        }
        n1.i.f10160a.a(g(), "startSession", str3, jSONObject2, jSONObject62, jSONObject);
    }

    public final void d(String str, JSONObject jSONObject) {
        n1.i.f10160a.a(g(), "publishMediaEvent", str, jSONObject, this.f10229a);
    }

    public final void e(Date date) {
        if (date == null) {
            return;
        }
        JSONObject jSONObject = new JSONObject();
        r1.b.b(jSONObject, "timestamp", Long.valueOf(date.getTime()));
        n1.i.f10160a.a(g(), "setLastActivity", jSONObject);
    }

    public void f() {
        this.f10230b.clear();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final WebView g() {
        return (WebView) this.f10230b.get();
    }

    public void h() {
    }
}
