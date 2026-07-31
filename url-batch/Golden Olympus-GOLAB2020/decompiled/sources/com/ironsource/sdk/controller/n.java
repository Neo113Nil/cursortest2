package com.ironsource.sdk.controller;

import android.app.Activity;
import android.content.Context;
import com.ironsource.fh;
import com.ironsource.ig;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.o9;
import com.ironsource.sdk.controller.InterfaceC1562f;
import com.ironsource.sdk.controller.l;
import com.ironsource.t9;
import com.ironsource.u9;
import com.ironsource.v9;
import com.ironsource.va;
import java.util.Map;
import org.jetbrains.annotations.Nullable;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public class n implements l {

    /* renamed from: a, reason: collision with root package name */
    private final ig f19281a;

    /* renamed from: b, reason: collision with root package name */
    private final String f19282b;

    class a implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ l.a f19283a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ InterfaceC1562f.c f19284b;

        a(l.a aVar, InterfaceC1562f.c cVar) {
            this.f19283a = aVar;
            this.f19284b = cVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                if (this.f19283a == null) {
                    return;
                }
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("success", false);
                jSONObject.put("reason", n.this.f19282b);
                this.f19283a.a(new InterfaceC1562f.a(this.f19284b.f(), jSONObject));
            } catch (JSONException e4) {
                o9.d().a(e4);
                IronLog.INTERNAL.error(e4.toString());
            }
        }
    }

    class b implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ v9 f19286a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ va f19287b;

        b(v9 v9Var, va vaVar) {
            this.f19286a = v9Var;
            this.f19287b = vaVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f19286a.a(fh.e.RewardedVideo, this.f19287b.h(), n.this.f19282b);
        }
    }

    class c implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ v9 f19289a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ JSONObject f19290b;

        c(v9 v9Var, JSONObject jSONObject) {
            this.f19289a = v9Var;
            this.f19290b = jSONObject;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f19289a.d(this.f19290b.optString("demandSourceName"), n.this.f19282b);
        }
    }

    class d implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ u9 f19292a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ va f19293b;

        d(u9 u9Var, va vaVar) {
            this.f19292a = u9Var;
            this.f19293b = vaVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f19292a.a(fh.e.Interstitial, this.f19293b.h(), n.this.f19282b);
        }
    }

    class e implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ u9 f19295a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f19296b;

        e(u9 u9Var, String str) {
            this.f19295a = u9Var;
            this.f19296b = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f19295a.c(this.f19296b, n.this.f19282b);
        }
    }

    class f implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ u9 f19298a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ va f19299b;

        f(u9 u9Var, va vaVar) {
            this.f19298a = u9Var;
            this.f19299b = vaVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f19298a.c(this.f19299b.h(), n.this.f19282b);
        }
    }

    class g implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ u9 f19301a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ JSONObject f19302b;

        g(u9 u9Var, JSONObject jSONObject) {
            this.f19301a = u9Var;
            this.f19302b = jSONObject;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f19301a.b(this.f19302b.optString("demandSourceName"), n.this.f19282b);
        }
    }

    class h implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ u9 f19304a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ va f19305b;

        h(u9 u9Var, va vaVar) {
            this.f19304a = u9Var;
            this.f19305b = vaVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f19304a.b(this.f19305b.h(), n.this.f19282b);
        }
    }

    class i implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ t9 f19307a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Map f19308b;

        i(t9 t9Var, Map map) {
            this.f19307a = t9Var;
            this.f19308b = map;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f19307a.a((String) this.f19308b.get("demandSourceName"), n.this.f19282b);
        }
    }

    class j implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ t9 f19310a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ JSONObject f19311b;

        j(t9 t9Var, JSONObject jSONObject) {
            this.f19310a = t9Var;
            this.f19311b = jSONObject;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f19310a.a(this.f19311b.optString("demandSourceName"), n.this.f19282b);
        }
    }

    n(String str, ig igVar) {
        this.f19281a = igVar;
        this.f19282b = str;
    }

    @Override // com.ironsource.sdk.controller.l
    public void b(Context context) {
    }

    @Override // com.ironsource.sdk.controller.l
    public void d() {
    }

    @Override // com.ironsource.sdk.controller.l
    public void destroy() {
    }

    @Override // com.ironsource.sdk.controller.l
    public void e() {
    }

    @Override // com.ironsource.sdk.controller.l
    public void f() {
    }

    @Override // com.ironsource.sdk.controller.l
    public fh.c g() {
        return fh.c.Native;
    }

    @Override // com.ironsource.sdk.controller.l
    public void a() {
    }

    @Override // com.ironsource.sdk.controller.l
    public void b(va vaVar) {
    }

    @Override // com.ironsource.sdk.controller.l
    public void a(Activity activity) {
    }

    @Override // com.ironsource.sdk.controller.l
    public void b(va vaVar, Map<String, String> map, u9 u9Var) {
        if (u9Var != null) {
            a(new f(u9Var, vaVar));
        }
    }

    @Override // com.ironsource.sdk.controller.l
    public void a(Context context) {
    }

    @Override // com.ironsource.sdk.controller.l
    public void b(JSONObject jSONObject) {
    }

    @Override // com.ironsource.sdk.controller.l
    public void a(InterfaceC1562f.c cVar, @Nullable l.a aVar) {
        a(new a(aVar, cVar));
    }

    @Override // com.ironsource.sdk.controller.l
    public void a(va vaVar) {
    }

    @Override // com.ironsource.sdk.controller.l
    public void a(va vaVar, Map<String, String> map, t9 t9Var) {
        if (t9Var != null) {
            a(new i(t9Var, map));
        }
    }

    @Override // com.ironsource.sdk.controller.l
    public void a(va vaVar, Map<String, String> map, u9 u9Var) {
        if (u9Var != null) {
            a(new h(u9Var, vaVar));
        }
    }

    void a(Runnable runnable) {
        ig igVar = this.f19281a;
        if (igVar != null) {
            igVar.c(runnable);
        }
    }

    @Override // com.ironsource.sdk.controller.l
    public void a(String str, u9 u9Var) {
        if (u9Var != null) {
            a(new e(u9Var, str));
        }
    }

    @Override // com.ironsource.sdk.controller.l
    public void a(String str, String str2, va vaVar, t9 t9Var) {
        if (t9Var != null) {
            t9Var.a(fh.e.Banner, vaVar.h(), this.f19282b);
        }
    }

    @Override // com.ironsource.sdk.controller.l
    public void a(String str, String str2, va vaVar, u9 u9Var) {
        if (u9Var != null) {
            a(new d(u9Var, vaVar));
        }
    }

    @Override // com.ironsource.sdk.controller.l
    public void a(String str, String str2, va vaVar, v9 v9Var) {
        if (v9Var != null) {
            a(new b(v9Var, vaVar));
        }
    }

    @Override // com.ironsource.sdk.controller.l
    public void a(JSONObject jSONObject) {
    }

    @Override // com.ironsource.sdk.controller.l
    public void a(JSONObject jSONObject, t9 t9Var) {
        if (t9Var != null) {
            a(new j(t9Var, jSONObject));
        }
    }

    @Override // com.ironsource.sdk.controller.l
    public void a(JSONObject jSONObject, u9 u9Var) {
        if (u9Var != null) {
            a(new g(u9Var, jSONObject));
        }
    }

    @Override // com.ironsource.sdk.controller.l
    public void a(JSONObject jSONObject, v9 v9Var) {
        if (v9Var != null) {
            a(new c(v9Var, jSONObject));
        }
    }

    @Override // com.ironsource.sdk.controller.l
    public boolean a(String str) {
        return false;
    }
}
