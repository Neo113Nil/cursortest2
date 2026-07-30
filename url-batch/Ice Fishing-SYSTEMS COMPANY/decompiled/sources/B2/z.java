package B2;

import O.j0;
import O.n0;
import a.AbstractC0415a;
import android.animation.ValueAnimator;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.os.Handler;
import android.text.TextUtils;
import android.util.Log;
import android.util.Pair;
import android.view.View;
import android.webkit.CookieManager;
import android.webkit.WebView;
import androidx.work.impl.background.systemalarm.ConstraintProxy$BatteryChargingProxy;
import androidx.work.impl.background.systemalarm.ConstraintProxy$BatteryNotLowProxy;
import androidx.work.impl.background.systemalarm.ConstraintProxy$NetworkStateProxy;
import androidx.work.impl.background.systemalarm.ConstraintProxy$StorageNotLowProxy;
import androidx.work.impl.background.systemalarm.ConstraintProxyUpdateReceiver;
import com.anythink.core.api.ATSDK;
import com.anythink.expressad.advanced.js.NativeAdvancedJsUtils;
import com.facebook.ads.AudienceNetworkAds;
import com.google.android.gms.internal.ads.C3381io;
import com.google.android.gms.internal.ads.InterfaceC3858rh;
import com.google.android.gms.internal.ads.W;
import com.google.android.gms.internal.consent_sdk.C4313b;
import com.google.android.gms.internal.consent_sdk.C4317c;
import com.google.android.gms.internal.consent_sdk.C4325e;
import com.google.android.gms.internal.consent_sdk.C4329f;
import com.google.android.gms.internal.consent_sdk.C4349k;
import com.google.android.gms.internal.consent_sdk.C4357m;
import com.google.android.gms.internal.consent_sdk.C4361n;
import com.google.android.gms.internal.consent_sdk.C4365o;
import com.google.android.gms.internal.consent_sdk.C4399w2;
import com.google.android.gms.internal.consent_sdk.RunnableC4337h;
import com.google.android.gms.internal.consent_sdk.RunnableC4353l;
import com.google.android.gms.internal.consent_sdk.Z2;
import com.icefishing.icefishingliveapp.SplashActivity;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;
import k2.C4635f;
import k2.C4636g;
import k2.EnumC4631b;
import k4.InterfaceC4657l;
import m.c1;
import m1.C4776c;
import org.json.JSONException;
import org.json.JSONObject;
import q2.C4903n;

/* loaded from: classes.dex */
public final /* synthetic */ class z implements Runnable {

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f320n;

    /* renamed from: u, reason: collision with root package name */
    public Object f321u;

    /* renamed from: v, reason: collision with root package name */
    public Object f322v;

    /* renamed from: w, reason: collision with root package name */
    public Object f323w;

    public /* synthetic */ z(int i) {
        this.f320n = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Object obj;
        boolean z8;
        int i;
        h3.n d2;
        JSONObject jSONObject;
        i8.m mVar;
        S0.i iVar;
        switch (this.f320n) {
            case 0:
                C0267a c0267a = (C0267a) this.f321u;
                p2.j.f39798C.f39806f.getClass();
                CookieManager x3 = W3.e.x();
                boolean acceptThirdPartyCookies = x3 != null ? x3.acceptThirdPartyCookies(c0267a.f202b) : false;
                Bundle bundle = (Bundle) this.f322v;
                bundle.putBoolean("accept_3p_cookie", acceptThirdPartyCookies);
                E2.a.a(c0267a.f201a, EnumC4631b.BANNER, new C4636g((C4635f) new C4635f(1).e(bundle)), (w) this.f323w);
                return;
            case 1:
                E e6 = (E) this.f321u;
                e6.getClass();
                Object obj2 = this.f322v;
                boolean z9 = false;
                if (obj2 instanceof WebView) {
                    p2.j.f39798C.f39806f.getClass();
                    CookieManager x9 = W3.e.x();
                    if (x9 != null) {
                        z9 = x9.acceptThirdPartyCookies((WebView) obj2);
                    }
                }
                HashMap hashMap = e6.f156a;
                Boolean valueOf = Boolean.valueOf(z9);
                G g9 = (G) hashMap.get(valueOf);
                Pair pair = (Pair) this.f323w;
                if (g9 != null) {
                    p2.j.f39798C.f39810k.getClass();
                    if (g9.f169c > System.currentTimeMillis()) {
                        e6.e(g9, pair, true);
                        return;
                    }
                }
                HashMap hashMap2 = e6.f157b;
                List list = (List) hashMap2.get(valueOf);
                if (list == null) {
                    list = new ArrayList();
                    hashMap2.put(valueOf, list);
                }
                list.add(pair);
                return;
            case 2:
                C3381io c3381io = (C3381io) this.f321u;
                c3381io.getClass();
                ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap(c3381io.f31998a);
                String str = (String) this.f322v;
                if (!TextUtils.isEmpty(NativeAdvancedJsUtils.f18064p) && !TextUtils.isEmpty(str)) {
                    concurrentHashMap.put(NativeAdvancedJsUtils.f18064p, str);
                }
                int i4 = 0;
                while (true) {
                    Pair[] pairArr = (Pair[]) this.f323w;
                    if (i4 >= pairArr.length) {
                        c3381io.b(concurrentHashMap);
                        return;
                    }
                    Pair pair2 = pairArr[i4];
                    String str2 = (String) pair2.first;
                    String str3 = (String) pair2.second;
                    if (!TextUtils.isEmpty(str2) && !TextUtils.isEmpty(str3)) {
                        concurrentHashMap.put(str2, str3);
                    }
                    i4++;
                }
                break;
            case 3:
                try {
                    z8 = ((Boolean) ((U0.k) this.f323w).get()).booleanValue();
                } catch (InterruptedException | ExecutionException unused) {
                    z8 = true;
                }
                ((K0.f) this.f321u).b((S0.j) this.f322v, z8);
                return;
            case 4:
                K2.a aVar = (K2.a) this.f322v;
                Intent intent = aVar.f1565n;
                String stringExtra = intent.getStringExtra("google.message_id");
                if (stringExtra == null) {
                    stringExtra = intent.getStringExtra("message_id");
                }
                if (TextUtils.isEmpty(stringExtra)) {
                    d2 = AbstractC0415a.r(null);
                } else {
                    Bundle bundle2 = new Bundle();
                    Intent intent2 = aVar.f1565n;
                    String stringExtra2 = intent2.getStringExtra("google.message_id");
                    if (stringExtra2 == null) {
                        stringExtra2 = intent2.getStringExtra("message_id");
                    }
                    bundle2.putString("google.message_id", stringExtra2);
                    Intent intent3 = aVar.f1565n;
                    Integer valueOf2 = intent3.hasExtra("google.product_id") ? Integer.valueOf(intent3.getIntExtra("google.product_id", 0)) : null;
                    if (valueOf2 != null) {
                        bundle2.putInt("google.product_id", valueOf2.intValue());
                    }
                    bundle2.putBoolean("supports_message_handled", true);
                    K2.n c4 = K2.n.c((Context) this.f321u);
                    synchronized (c4) {
                        i = c4.f1604a;
                        c4.f1604a = i + 1;
                    }
                    d2 = c4.d(new K2.l(i, 2, bundle2, 0));
                }
                d2.a(K2.h.f1582u, new I0.j(8, (CountDownLatch) this.f323w));
                return;
            case 5:
                try {
                    obj = ((L.d) this.f321u).call();
                } catch (Exception unused2) {
                    obj = null;
                }
                ((Handler) this.f323w).post(new RunnableC0272f(12, (L.e) this.f322v, obj));
                return;
            case 6:
                BroadcastReceiver.PendingResult pendingResult = (BroadcastReceiver.PendingResult) this.f323w;
                Context context = (Context) this.f322v;
                Intent intent4 = (Intent) this.f321u;
                try {
                    boolean booleanExtra = intent4.getBooleanExtra("KEY_BATTERY_NOT_LOW_PROXY_ENABLED", false);
                    boolean booleanExtra2 = intent4.getBooleanExtra("KEY_BATTERY_CHARGING_PROXY_ENABLED", false);
                    boolean booleanExtra3 = intent4.getBooleanExtra("KEY_STORAGE_NOT_LOW_PROXY_ENABLED", false);
                    boolean booleanExtra4 = intent4.getBooleanExtra("KEY_NETWORK_STATE_PROXY_ENABLED", false);
                    J0.s.d().a(ConstraintProxyUpdateReceiver.f5494a, "Updating proxies: (BatteryNotLowProxy (" + booleanExtra + "), BatteryChargingProxy (" + booleanExtra2 + "), StorageNotLowProxy (" + booleanExtra3 + "), NetworkStateProxy (" + booleanExtra4 + "), ");
                    T0.j.a(context, ConstraintProxy$BatteryNotLowProxy.class, booleanExtra);
                    T0.j.a(context, ConstraintProxy$BatteryChargingProxy.class, booleanExtra2);
                    T0.j.a(context, ConstraintProxy$StorageNotLowProxy.class, booleanExtra3);
                    T0.j.a(context, ConstraintProxy$NetworkStateProxy.class, booleanExtra4);
                    return;
                } finally {
                    pendingResult.finish();
                }
            case 7:
                j0.h((View) this.f321u, (S0.e) this.f322v);
                ((ValueAnimator) this.f323w).start();
                return;
            case 8:
                ((K0.p) this.f321u).f1535f.h((K0.j) this.f322v, (Y2.e) this.f323w);
                return;
            case 9:
                String str4 = (String) this.f321u;
                if (TextUtils.isEmpty(str4)) {
                    Log.d("UserMessagingPlatform", "Error on action: empty action name");
                    return;
                }
                String lowerCase = str4.toLowerCase();
                String str5 = (String) this.f322v;
                if (TextUtils.isEmpty(str5)) {
                    jSONObject = new JSONObject();
                } else {
                    try {
                        jSONObject = new JSONObject(str5);
                    } catch (JSONException unused3) {
                        Log.d("UserMessagingPlatform", "Action[" + lowerCase + "]: failed to parse args: " + str5);
                        return;
                    }
                }
                Log.d("UserMessagingPlatform", "Action[" + lowerCase + "]: " + jSONObject.toString());
                int i9 = 0;
                while (true) {
                    com.google.android.gms.internal.consent_sdk.D[] dArr = (com.google.android.gms.internal.consent_sdk.D[]) this.f323w;
                    if (i9 >= dArr.length) {
                        return;
                    }
                    com.google.android.gms.internal.consent_sdk.D d3 = dArr[i9];
                    FutureTask futureTask = new FutureTask(new CallableC0271e(d3, lowerCase, jSONObject, 4));
                    d3.mo10a().execute(futureTask);
                    try {
                    } catch (InterruptedException e9) {
                        Log.d("UserMessagingPlatform", "Thread interrupted for Action[" + lowerCase + "]: ", e9);
                    } catch (ExecutionException e10) {
                        Log.d("UserMessagingPlatform", D.y.k("Failed to run Action[", lowerCase, "]: "), e10.getCause());
                    }
                    if (((Boolean) futureTask.get()).booleanValue()) {
                        return;
                    } else {
                        i9++;
                    }
                }
            case 10:
                RunnableC4337h runnableC4337h = new RunnableC4337h(2, (I3.d) this.f322v);
                C4313b c4313b = (C4313b) this.f321u;
                ((Handler) c4313b.f35812b).post(runnableC4337h);
                if (((K2.o) this.f323w).f1609b != 2) {
                    C4361n c4361n = (C4361n) c4313b.f35815e;
                    C4365o c4365o = (C4365o) c4361n.f35887b.get();
                    if (c4365o == null) {
                        Log.e("UserMessagingPlatform", "Failed to load and cache a form due to null consent form resources.");
                        return;
                    }
                    C4317c c4317c = (C4317c) c4361n.f35886a.d();
                    c4317c.getClass();
                    C4313b c4313b2 = c4317c.f35819a;
                    Z2 a9 = Z2.a(new C4325e((C4399w2) c4313b2.f35812b, 2));
                    C4399w2 c4399w2 = new C4399w2(8, c4365o);
                    C4399w2 c4399w22 = new C4399w2(7);
                    C4399w2 c4399w23 = (C4399w2) c4313b2.f35812b;
                    Z2 z22 = (Z2) c4313b2.f35816f;
                    C4329f c4329f = (C4329f) c4313b2.i;
                    Z2 z23 = (Z2) c4313b2.f35813c;
                    Z2 a10 = Z2.a(new c1(c4399w23, (Z2) c4313b2.f35814d, a9, z23, c4399w2, new C4357m(a9, new C4903n(c4399w23, a9, z22, c4329f, c4399w22, z23, 3)), (Z2) c4313b2.f35817g));
                    if (((Z2) c4399w22.f35944u) != null) {
                        throw new IllegalStateException();
                    }
                    c4399w22.f35944u = a10;
                    C4349k c4349k = (C4349k) c4399w22.d();
                    c4349k.f35869m = true;
                    com.google.android.gms.internal.consent_sdk.C.f35655a.post(new RunnableC4353l(0, c4361n, c4349k));
                    return;
                }
                return;
            case 11:
                synchronized (((C4776c) this.f321u).f39565w) {
                }
                com.bumptech.glide.manager.n nVar = (com.bumptech.glide.manager.n) this.f322v;
                if (((l1.g) nVar.f23620w) == null) {
                    C4776c c4776c = (C4776c) this.f321u;
                    String str6 = (String) nVar.f23618u;
                    c4776c.getClass();
                    synchronized (c4776c.f39560F) {
                        iVar = c4776c.f39561G;
                    }
                    if (iVar != null) {
                        try {
                            SharedPreferences.Editor edit = k4.m.f38788d.edit();
                            edit.putString("response", new JSONObject(str6).toString());
                            edit.apply();
                            edit.commit();
                        } catch (JSONException e11) {
                            e11.printStackTrace();
                            ((h4.c) iVar.f2901u).E();
                        }
                        k4.m e12 = k4.m.e((SplashActivity) iVar.f2902v);
                        h8.d dVar = new h8.d(1, iVar);
                        SharedPreferences.Editor editor = e12.f38810a;
                        String string = k4.m.f38788d.getString("response", "");
                        if (!string.isEmpty()) {
                            try {
                                JSONObject jSONObject2 = new JSONObject(string);
                                k4.m.f38790f = jSONObject2.getInt("splash_inter");
                                k4.m.i = jSONObject2.getInt("link_redirect");
                                k4.m.f38791g = jSONObject2.getInt("splash_redirect");
                                k4.m.f38806w = jSONObject2.getString("link1");
                                k4.m.f38807x = jSONObject2.getString("link2");
                                k4.m.f38808y = jSONObject2.getString("link3");
                                jSONObject2.getString("livetv");
                                k4.m.f38800q = jSONObject2.getString("topon_appid");
                                k4.m.f38801r = jSONObject2.getString("topon_appkey");
                                k4.m.f38802s = jSONObject2.getString("topon_banner");
                                k4.m.f38803t = jSONObject2.getString("topon_inter1");
                                jSONObject2.getString("topon_inter2");
                                k4.m.f38804u = jSONObject2.getString("topon_native");
                                k4.m.f38772E = jSONObject2.getInt("topon_showStatus");
                                k4.m.f38793j = jSONObject2.getInt("admob_showAdStatus");
                                jSONObject2.getString("AppID");
                                k4.m.f38794k = jSONObject2.getString("Admob_Banner");
                                k4.m.f38795l = jSONObject2.getString("Admob_Interstitial");
                                k4.m.f38796m = jSONObject2.getString("Admob_Native");
                                k4.m.f38792h = jSONObject2.getInt("adposition");
                                k4.m.f38775H = jSONObject2.getString("FB_banner");
                                k4.m.f38778L = jSONObject2.getString("FB_nativebanner");
                                k4.m.f38776I = jSONObject2.getString("FB_inter1");
                                k4.m.J = jSONObject2.getString("FB_inter2");
                                k4.m.f38777K = jSONObject2.getString("FB_native");
                                k4.m.f38773F = jSONObject2.getInt("FB_showAdStatus");
                                k4.m.f38774G = jSONObject2.getInt("FB_bannernative");
                                editor.putInt("adposition", k4.m.f38792h);
                                editor.commit();
                                ATSDK.init(k4.m.f38789e, k4.m.f38800q, k4.m.f38801r);
                                AudienceNetworkAds.initialize(k4.m.f38789e);
                                dVar.n();
                                InterfaceC4657l interfaceC4657l = k4.m.f38768A;
                                if (interfaceC4657l != null) {
                                    interfaceC4657l.OnCall();
                                    k4.m.f38768A = null;
                                }
                            } catch (JSONException e13) {
                                e13.printStackTrace();
                            }
                        }
                    }
                } else {
                    C4776c c4776c2 = (C4776c) this.f321u;
                    synchronized (c4776c2.f39565w) {
                        mVar = c4776c2.f39566x;
                    }
                    if (mVar != null) {
                        ((h4.c) mVar.f38384n).E();
                    }
                }
                if (((com.bumptech.glide.manager.n) this.f322v).f23617n) {
                    ((C4776c) this.f321u).a("intermediate-response");
                } else {
                    ((C4776c) this.f321u).b("done");
                }
                h3.l lVar = (h3.l) this.f323w;
                if (lVar != null) {
                    lVar.run();
                    return;
                }
                return;
            default:
                InterfaceC3858rh interfaceC3858rh = (InterfaceC3858rh) ((W) this.f321u).f28335d;
                if (interfaceC3858rh != null) {
                    interfaceC3858rh.a((String) this.f322v, (HashMap) this.f323w);
                    return;
                }
                return;
        }
    }

    public /* synthetic */ z(Object obj, Object obj2, Object obj3, int i) {
        this.f320n = i;
        this.f321u = obj;
        this.f322v = obj2;
        this.f323w = obj3;
    }

    public z(View view, n0 n0Var, S0.e eVar, ValueAnimator valueAnimator) {
        this.f320n = 7;
        this.f321u = view;
        this.f322v = eVar;
        this.f323w = valueAnimator;
    }
}
