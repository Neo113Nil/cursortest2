package com.google.android.gms.internal.ads;

import android.app.Application;
import android.app.Dialog;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Handler;
import android.text.TextUtils;
import android.util.Log;
import com.anythink.expressad.advanced.js.NativeAdvancedJsUtils;
import com.google.android.gms.internal.consent_sdk.C4313b;
import com.google.android.gms.internal.consent_sdk.C4333g;
import com.google.android.gms.internal.consent_sdk.C4341i;
import com.google.android.gms.internal.consent_sdk.C4345j;
import com.google.android.gms.internal.consent_sdk.C4349k;
import com.google.android.gms.internal.consent_sdk.C4354l0;
import com.google.android.gms.internal.consent_sdk.C4357m;
import com.google.android.gms.internal.consent_sdk.C4361n;
import com.google.android.gms.internal.consent_sdk.C4399w2;
import com.google.android.gms.internal.consent_sdk.C4400x;
import com.google.android.gms.internal.consent_sdk.RunnableC4369p;
import java.util.Objects;
import java.util.Queue;
import java.util.concurrent.Executor;
import org.json.JSONObject;
import u2.C5107a;

/* renamed from: com.google.android.gms.internal.ads.yh, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final /* synthetic */ class C4236yh implements BD, com.google.android.gms.internal.consent_sdk.D, com.google.android.gms.internal.consent_sdk.a3 {

    /* renamed from: A, reason: collision with root package name */
    public final Object f35376A;

    /* renamed from: n, reason: collision with root package name */
    public final Object f35377n;

    /* renamed from: u, reason: collision with root package name */
    public final Object f35378u;

    /* renamed from: v, reason: collision with root package name */
    public final Object f35379v;

    /* renamed from: w, reason: collision with root package name */
    public final Object f35380w;

    /* renamed from: x, reason: collision with root package name */
    public final Object f35381x;

    /* renamed from: y, reason: collision with root package name */
    public final Object f35382y;

    /* renamed from: z, reason: collision with root package name */
    public final Object f35383z;

    public /* synthetic */ C4236yh(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8) {
        this.f35377n = obj;
        this.f35378u = obj2;
        this.f35379v = obj3;
        this.f35380w = obj4;
        this.f35381x = obj5;
        this.f35382y = obj6;
        this.f35383z = obj7;
        this.f35376A = obj8;
    }

    @Override // com.google.android.gms.internal.ads.BD, com.google.android.gms.internal.ads.InterfaceC3404jB
    public J3.a a() {
        C2837Wb c2837Wb = p2.j.f39798C.f39804d;
        W2.b bVar = new W2.b(0, 0, 0);
        C2914a9 c2914a9 = new C2914a9();
        Context context = (Context) this.f35377n;
        C5107a c5107a = (C5107a) this.f35379v;
        S0.s sVar = (S0.s) this.f35380w;
        C3280gu c3280gu = (C3280gu) this.f35382y;
        InterfaceC3858rh g9 = C2837Wb.g(sVar, bVar, context, (C3348i7) this.f35378u, c2914a9, null, (C3165eo) this.f35383z, (BinderC2949aq) this.f35381x, null, null, null, c3280gu, "", c5107a, false, false);
        W8 w82 = new W8(g9);
        g9.j0().f25412z = new C4182xh(w82, 0);
        g9.loadUrl((String) this.f35376A);
        return w82;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // com.google.android.gms.internal.consent_sdk.D
    public boolean b(String str, JSONObject jSONObject) {
        char c4;
        char c9 = 65535;
        int i = 3;
        switch (str.hashCode()) {
            case -1370505102:
                if (str.equals("load_complete")) {
                    c4 = 0;
                    break;
                }
                c4 = 65535;
                break;
            case -278739366:
                if (str.equals("configure_app_assets")) {
                    c4 = 3;
                    break;
                }
                c4 = 65535;
                break;
            case 150940456:
                if (str.equals("browser")) {
                    c4 = 2;
                    break;
                }
                c4 = 65535;
                break;
            case 1671672458:
                if (str.equals("dismiss")) {
                    c4 = 1;
                    break;
                }
                c4 = 65535;
                break;
            default:
                c4 = 65535;
                break;
        }
        C4349k c4349k = (C4349k) this.f35383z;
        if (c4 == 0) {
            C4345j c4345j = (C4345j) c4349k.f35866j.getAndSet(null);
            if (c4345j != null) {
                if (!c4349k.f35869m && !c4349k.f35870n) {
                    C4400x c4400x = c4349k.f35863f;
                    c4400x.a((Queue) c4400x.f35951g.get(), 4, 5, null);
                }
                c4345j.a(c4349k);
                return true;
            }
        } else if (c4 == 1) {
            String optString = jSONObject.optString("status");
            switch (optString.hashCode()) {
                case -954325659:
                    if (optString.equals("CONSENT_SIGNAL_NON_PERSONALIZED_ADS")) {
                        c9 = 3;
                        break;
                    }
                    break;
                case -258041904:
                    if (optString.equals("personalized")) {
                        c9 = 0;
                        break;
                    }
                    break;
                case 429411856:
                    if (optString.equals("CONSENT_SIGNAL_SUFFICIENT")) {
                        c9 = 4;
                        break;
                    }
                    break;
                case 467888915:
                    if (optString.equals("CONSENT_SIGNAL_PERSONALIZED_ADS")) {
                        c9 = 1;
                        break;
                    }
                    break;
                case 1666911234:
                    if (optString.equals("non_personalized")) {
                        c9 = 2;
                        break;
                    }
                    break;
                case 1725474845:
                    if (optString.equals("CONSENT_SIGNAL_NOT_REQUIRED")) {
                        c9 = 5;
                        break;
                    }
                    break;
            }
            if (c9 != 0 && c9 != 1 && c9 != 2 && c9 != 3 && c9 != 4) {
                if (c9 != 5) {
                    C4354l0 c4354l0 = new C4354l0(1, "We are getting something wrong with the webview.");
                    Dialog dialog = c4349k.f35864g;
                    if (dialog != null) {
                        dialog.dismiss();
                        c4349k.f35864g = null;
                    }
                    c4349k.f35859b.f35905a = null;
                    C4341i c4341i = (C4341i) c4349k.f35868l.getAndSet(null);
                    if (c4341i != null) {
                        c4341i.f35848u.f35858a.unregisterActivityLifecycleCallbacks(c4341i);
                    }
                    I3.b bVar = (I3.b) c4349k.f35867k.getAndSet(null);
                    if (bVar != null) {
                        c4349k.d(c4354l0);
                        bVar.onConsentFormDismissed(c4354l0.a());
                        return true;
                    }
                } else {
                    i = 1;
                }
            }
            Dialog dialog2 = c4349k.f35864g;
            if (dialog2 != null) {
                dialog2.dismiss();
                c4349k.f35864g = null;
            }
            c4349k.f35859b.f35905a = null;
            C4341i c4341i2 = (C4341i) c4349k.f35868l.getAndSet(null);
            if (c4341i2 != null) {
                c4341i2.f35848u.f35858a.unregisterActivityLifecycleCallbacks(c4341i2);
            }
            I3.b bVar2 = (I3.b) c4349k.f35867k.getAndSet(null);
            if (bVar2 != null) {
                c4349k.f35860c.f35840b.edit().putInt("consent_status", i).commit();
                bVar2.onConsentFormDismissed(null);
                return true;
            }
        } else {
            if (c4 != 2) {
                if (c4 != 3) {
                    return false;
                }
                ((com.google.android.gms.internal.consent_sdk.B) this.f35380w).execute(new RunnableC4369p(this, 1));
                return true;
            }
            String optString2 = jSONObject.optString("url");
            if (TextUtils.isEmpty(optString2)) {
                Log.d("UserMessagingPlatform", "Action[browser]: empty url.");
            }
            Uri parse = Uri.parse(optString2);
            if (parse.getScheme() == null) {
                Log.d("UserMessagingPlatform", "Action[browser]: empty scheme: ".concat(String.valueOf(optString2)));
            }
            try {
                ((com.google.android.gms.internal.consent_sdk.r) this.f35378u).startActivity(new Intent("android.intent.action.VIEW", parse));
                return true;
            } catch (ActivityNotFoundException e6) {
                Log.d("UserMessagingPlatform", "Action[browser]: can not open url: ".concat(String.valueOf(optString2)), e6);
            }
        }
        return true;
    }

    @Override // com.google.android.gms.internal.consent_sdk.b3
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public C4313b d() {
        Application application = (Application) ((C4399w2) this.f35377n).f35944u;
        Handler handler = com.google.android.gms.internal.consent_sdk.C.f35655a;
        com.google.android.gms.internal.consent_sdk.E.c(handler);
        com.google.android.gms.internal.consent_sdk.B b9 = com.google.android.gms.internal.consent_sdk.C.f35656b;
        com.google.android.gms.internal.consent_sdk.E.c(b9);
        C4333g c4333g = (C4333g) ((com.google.android.gms.internal.consent_sdk.Z2) this.f35379v).d();
        C4361n c4361n = (C4361n) ((com.google.android.gms.internal.consent_sdk.Z2) this.f35380w).d();
        C4357m a9 = ((com.google.android.gms.internal.consent_sdk.E1) this.f35381x).a();
        S0.i l9 = ((f4.p) this.f35382y).l();
        com.google.android.gms.internal.consent_sdk.O o9 = (com.google.android.gms.internal.consent_sdk.O) ((com.google.android.gms.internal.consent_sdk.Z2) this.f35383z).d();
        C4400x c4400x = (C4400x) ((com.google.android.gms.internal.consent_sdk.Z2) this.f35376A).d();
        C4313b c4313b = new C4313b();
        c4313b.f35811a = application;
        c4313b.f35812b = handler;
        c4313b.f35813c = b9;
        c4313b.f35814d = c4333g;
        c4313b.f35815e = c4361n;
        c4313b.f35816f = a9;
        c4313b.f35817g = l9;
        c4313b.f35818h = o9;
        c4313b.i = c4400x;
        return c4313b;
    }

    public void e(String str) {
        Log.d("UserMessagingPlatform", "Receive consent action: ".concat(String.valueOf(str)));
        Uri parse = Uri.parse(str);
        String queryParameter = parse.getQueryParameter(NativeAdvancedJsUtils.f18064p);
        String queryParameter2 = parse.getQueryParameter("args");
        com.google.android.gms.internal.consent_sdk.D[] dArr = {this, (S0.i) this.f35382y};
        com.google.android.gms.internal.consent_sdk.O o9 = (com.google.android.gms.internal.consent_sdk.O) this.f35381x;
        o9.getClass();
        o9.f35746a.execute(new B2.z(queryParameter, queryParameter2, dArr, 9));
    }

    @Override // com.google.android.gms.internal.consent_sdk.D
    /* renamed from: a, reason: collision with other method in class */
    public Executor mo10a() {
        final Handler handler = (Handler) this.f35379v;
        Objects.requireNonNull(handler);
        return new Executor() { // from class: com.google.android.gms.internal.consent_sdk.s
            @Override // java.util.concurrent.Executor
            public final void execute(Runnable runnable) {
                handler.post(runnable);
            }
        };
    }
}
