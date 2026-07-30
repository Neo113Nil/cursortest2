package com.google.android.gms.internal.ads;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.os.IBinder;
import android.preference.PreferenceManager;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.WindowManager;
import com.anythink.expressad.advanced.js.NativeAdvancedJsUtils;
import java.io.File;
import java.io.IOException;
import java.net.URISyntaxException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import s2.BinderC4996d;

/* renamed from: com.google.android.gms.internal.ads.Vb, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2820Vb implements InterfaceC2990bc {

    /* renamed from: u, reason: collision with root package name */
    public static final /* synthetic */ C2820Vb f28262u = new C2820Vb(20);

    /* renamed from: v, reason: collision with root package name */
    public static final /* synthetic */ C2820Vb f28263v = new C2820Vb(21);

    /* renamed from: w, reason: collision with root package name */
    public static final /* synthetic */ C2820Vb f28264w = new C2820Vb(22);

    /* renamed from: x, reason: collision with root package name */
    public static final /* synthetic */ C2820Vb f28265x = new C2820Vb(23);

    /* renamed from: y, reason: collision with root package name */
    public static final /* synthetic */ C2820Vb f28266y = new C2820Vb(24);

    /* renamed from: z, reason: collision with root package name */
    public static final /* synthetic */ C2820Vb f28267z = new C2820Vb(27);

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f28268n;

    public /* synthetic */ C2820Vb(int i) {
        this.f28268n = i;
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00df  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void a(Object obj, Map map) {
        AbstractC2791Tg abstractC2791Tg;
        C2638Kg c2638Kg;
        AbstractC2791Tg abstractC2791Tg2;
        InterfaceC3858rh interfaceC3858rh = (InterfaceC3858rh) obj;
        if (u2.i.j(3)) {
            JSONObject jSONObject = new JSONObject(map);
            jSONObject.remove("google.afma.Notify_dt");
            u2.i.a("Precache GMSG: ".concat(jSONObject.toString()));
        }
        C2672Mg c2672Mg = p2.j.f39798C.f39799A;
        if (map.containsKey("abort")) {
            if (c2672Mg.a(interfaceC3858rh)) {
                return;
            }
            u2.i.f("Precache abort but no precache task running.");
            return;
        }
        String str = (String) map.get("src");
        Integer b9 = b("periodicReportIntervalMs", map);
        b("exoPlayerRenderingIntervalMs", map);
        b("exoPlayerIdleIntervalMs", map);
        C4235yg c4235yg = new C4235yg((String) map.get("flags"));
        C2638Kg c2638Kg2 = null;
        if (str != null) {
            String[] strArr = {str};
            String str2 = (String) map.get("demuxed");
            if (str2 != null) {
                try {
                    JSONArray jSONArray = new JSONArray(str2);
                    String[] strArr2 = new String[jSONArray.length()];
                    for (int i = 0; i < jSONArray.length(); i++) {
                        strArr2[i] = jSONArray.getString(i);
                    }
                    strArr = strArr2;
                } catch (JSONException unused) {
                    u2.i.f("Malformed demuxed URL list for precache: ".concat(str2));
                    strArr = null;
                }
            }
            if (strArr == null) {
                strArr = new String[]{str};
            }
            if (c4235yg.f35372k) {
                Iterator it = c2672Mg.f26358n.iterator();
                while (it.hasNext()) {
                    c2638Kg = (C2638Kg) it.next();
                    if (c2638Kg.f25997v == interfaceC3858rh && str.equals(c2638Kg.f25999x)) {
                        break;
                    }
                }
                c2638Kg = null;
                if (c2638Kg == null) {
                    u2.i.f("Precache task is already running.");
                    return;
                }
                if (interfaceC3858rh.j() == null) {
                    u2.i.f("Precache requires a dependency provider.");
                    return;
                }
                Integer b10 = b("player", map);
                if (b10 == null) {
                    b10 = 0;
                }
                if (b9 != null) {
                    interfaceC3858rh.I0(b9.intValue());
                }
                int intValue = b10.intValue();
                Object obj2 = interfaceC3858rh.j().f2953v;
                if (intValue > 0) {
                    int i4 = C3267gh.f31035O.get();
                    if (i4 < c4235yg.f35369g) {
                        C2859Xg c2859Xg = new C2859Xg(interfaceC3858rh);
                        C3267gh c3267gh = new C3267gh(interfaceC3858rh.getContext(), c4235yg, (InterfaceC3858rh) c2859Xg.f27799v.get(), null);
                        int i9 = t2.C.f40822b;
                        u2.i.e("ExoPlayerAdapter initialized.");
                        c2859Xg.f28664w = c3267gh;
                        c3267gh.f31038C = c2859Xg;
                        abstractC2791Tg2 = c2859Xg;
                    } else {
                        if (((Boolean) q2.r.f40116e.f40119c.a(AbstractC3368ia.f31779s)).booleanValue()) {
                            i4 = C2842Wg.f28428H.get();
                        }
                        abstractC2791Tg2 = i4 < c4235yg.f35364b ? new C2842Wg(interfaceC3858rh, c4235yg) : new C2825Vg(interfaceC3858rh);
                    }
                } else {
                    C2808Ug c2808Ug = new C2808Ug(interfaceC3858rh);
                    File cacheDir = c2808Ug.f27797n.getCacheDir();
                    if (cacheDir == null) {
                        int i10 = t2.C.f40822b;
                        u2.i.f("Context.getCacheDir() returned null");
                    } else {
                        File file = new File(new File(cacheDir, "admobVideoStreams").getPath());
                        c2808Ug.f28057w = file;
                        if (!file.isDirectory() && !file.mkdirs()) {
                            String valueOf = String.valueOf(file.getAbsolutePath());
                            int i11 = t2.C.f40822b;
                            u2.i.f("Could not create preload cache directory at ".concat(valueOf));
                            c2808Ug.f28057w = null;
                        } else if (!file.setReadable(true, false) || !file.setExecutable(true, false)) {
                            String valueOf2 = String.valueOf(file.getAbsolutePath());
                            int i12 = t2.C.f40822b;
                            u2.i.f("Could not set cache file permissions at ".concat(valueOf2));
                            c2808Ug.f28057w = null;
                        }
                    }
                    abstractC2791Tg2 = c2808Ug;
                }
                new C2638Kg(interfaceC3858rh, abstractC2791Tg2, str, strArr).l();
                abstractC2791Tg = abstractC2791Tg2;
            } else {
                Iterator it2 = c2672Mg.f26358n.iterator();
                while (it2.hasNext()) {
                    c2638Kg = (C2638Kg) it2.next();
                    if (c2638Kg.f25997v == interfaceC3858rh) {
                        break;
                    }
                }
                c2638Kg = null;
                if (c2638Kg == null) {
                }
            }
        } else {
            Iterator it3 = c2672Mg.f26358n.iterator();
            while (true) {
                if (!it3.hasNext()) {
                    break;
                }
                C2638Kg c2638Kg3 = (C2638Kg) it3.next();
                if (c2638Kg3.f25997v == interfaceC3858rh) {
                    c2638Kg2 = c2638Kg3;
                    break;
                }
            }
            if (c2638Kg2 == null) {
                u2.i.f("Precache must specify a source.");
                return;
            }
            abstractC2791Tg = c2638Kg2.f25998w;
        }
        Integer b11 = b("minBufferMs", map);
        if (b11 != null) {
            abstractC2791Tg.h(b11.intValue());
        }
        Integer b12 = b("maxBufferMs", map);
        if (b12 != null) {
            abstractC2791Tg.f(b12.intValue());
        }
        Integer b13 = b("bufferForPlaybackMs", map);
        if (b13 != null) {
            abstractC2791Tg.i(b13.intValue());
        }
        Integer b14 = b("bufferForPlaybackAfterRebufferMs", map);
        if (b14 != null) {
            abstractC2791Tg.j(b14.intValue());
        }
    }

    public static final Integer b(String str, Map map) {
        if (!map.containsKey(str)) {
            return null;
        }
        try {
            return Integer.valueOf(Integer.parseInt((String) map.get(str)));
        } catch (NumberFormatException unused) {
            String str2 = (String) map.get(str);
            String q6 = com.anythink.basead.b.c.i.q(new StringBuilder(str.length() + 39 + String.valueOf(str2).length()), "Precache invalid numeric parameter '", str, "': ", str2);
            int i = t2.C.f40822b;
            u2.i.f(q6);
            return null;
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(15:89|90|91|(12:130|131|132|(10:96|(1:98)|99|(1:101)|102|(1:104)|105|(1:107)|108|(2:110|(1:112)))|113|114|115|(1:117)(1:126)|118|119|121|122)(1:93)|94|(0)|113|114|115|(0)(0)|118|119|121|122|87) */
    /* JADX WARN: Code restructure failed: missing block: B:123:0x0352, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:124:0x0353, code lost:
    
        r1 = t2.C.f40822b;
        u2.i.d("Error constructing openable urls response.", r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:128:0x033a, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:129:0x033b, code lost:
    
        p2.j.f39798C.f39808h.d(r1.toString(), r0);
        r0 = null;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:117:0x0349  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x034c  */
    /* JADX WARN: Removed duplicated region for block: B:344:0x06f2  */
    /* JADX WARN: Removed duplicated region for block: B:346:0x0700  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x02e9  */
    @Override // com.google.android.gms.internal.ads.InterfaceC2990bc
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void g(Object obj, Map map) {
        JSONObject i;
        JSONObject o9;
        C4086vt c4086vt;
        C4086vt c4086vt2;
        C4086vt c4086vt3;
        String str;
        String str2;
        C2631Jq c2631Jq;
        char c4;
        int i4;
        String optString;
        String optString2;
        String optString3;
        String optString4;
        String optString5;
        String optString6;
        String optString7;
        Intent parseUri;
        BinderC2554Fh binderC2554Fh;
        char c9 = 0;
        int i9 = 0;
        int i10 = 1;
        switch (this.f28268n) {
            case 0:
                InterfaceC3858rh interfaceC3858rh = (InterfaceC3858rh) obj;
                WindowManager windowManager = (WindowManager) interfaceC3858rh.getContext().getSystemService("window");
                t2.G g9 = p2.j.f39798C.f39803c;
                DisplayMetrics displayMetrics = new DisplayMetrics();
                windowManager.getDefaultDisplay().getMetrics(displayMetrics);
                int i11 = displayMetrics.widthPixels;
                int i12 = displayMetrics.heightPixels;
                int[] iArr = new int[2];
                HashMap hashMap = new HashMap();
                ((View) interfaceC3858rh).getLocationInWindow(iArr);
                hashMap.put("xInPixels", Integer.valueOf(iArr[0]));
                com.anythink.basead.b.c.i.y(iArr[1], hashMap, "yInPixels", i11, "windowWidthInPixels");
                hashMap.put("windowHeightInPixels", Integer.valueOf(i12));
                interfaceC3858rh.a("locationReady", hashMap);
                int i13 = t2.C.f40822b;
                u2.i.f("GET LOCATION COMPILED");
                return;
            case 1:
                InterfaceC3858rh interfaceC3858rh2 = (InterfaceC3858rh) obj;
                InterfaceC3152eb a12 = interfaceC3858rh2.a1();
                if (a12 == null || (i = a12.i()) == null) {
                    interfaceC3858rh2.c("nativeAdViewSignalsReady", new JSONObject());
                    return;
                } else {
                    interfaceC3858rh2.c("nativeAdViewSignalsReady", i);
                    return;
                }
            case 2:
                InterfaceC3858rh interfaceC3858rh3 = (InterfaceC3858rh) obj;
                InterfaceC3152eb a13 = interfaceC3858rh3.a1();
                if (a13 == null || (o9 = a13.o()) == null) {
                    interfaceC3858rh3.c("nativeClickMetaReady", new JSONObject());
                    return;
                } else {
                    interfaceC3858rh3.c("nativeClickMetaReady", o9);
                    return;
                }
            case 3:
                InterfaceC3858rh interfaceC3858rh4 = (InterfaceC3858rh) obj;
                W w9 = p2.j.f39798C.f39818s;
                Context context = interfaceC3858rh4.getContext();
                synchronized (w9) {
                    w9.f28335d = interfaceC3858rh4;
                    if (!w9.a(context)) {
                        w9.c("Unable to bind", "on_play_store_bind");
                        return;
                    }
                    HashMap hashMap2 = new HashMap();
                    hashMap2.put(NativeAdvancedJsUtils.f18064p, "fetch_completed");
                    w9.d(hashMap2, "on_play_store_bind");
                    return;
                }
            case 4:
                InterfaceC3858rh interfaceC3858rh5 = (InterfaceC3858rh) obj;
                if (TextUtils.isEmpty((CharSequence) map.get(com.anythink.expressad.videocommon.e.b.f22565u))) {
                    t2.C.k("Missing App Id, cannot show LMD Overlay without it");
                    return;
                }
                DA da = new DA();
                da.f24349c = 8388691;
                byte b9 = (byte) (da.f24353g | 1);
                da.f24350d = -1.0f;
                da.f24353g = (byte) (((byte) (((byte) (b9 | 2)) | 4)) | 8);
                da.f24348b = (String) map.get(com.anythink.expressad.videocommon.e.b.f22565u);
                da.f24351e = interfaceC3858rh5.getWidth();
                da.f24353g = (byte) (da.f24353g | 16);
                IBinder windowToken = interfaceC3858rh5.b0().getWindowToken();
                if (windowToken == null) {
                    throw new NullPointerException("Null windowToken");
                }
                da.f24347a = windowToken;
                if (map.containsKey("gravityX") && map.containsKey("gravityY")) {
                    da.f24349c = Integer.parseInt((String) map.get("gravityX")) | Integer.parseInt((String) map.get("gravityY"));
                    da.f24353g = (byte) (da.f24353g | 1);
                } else {
                    da.f24349c = 81;
                    da.f24353g = (byte) (da.f24353g | 1);
                }
                if (map.containsKey("verticalMargin")) {
                    da.f24350d = Float.parseFloat((String) map.get("verticalMargin"));
                    da.f24353g = (byte) (da.f24353g | 2);
                } else {
                    da.f24350d = 0.02f;
                    da.f24353g = (byte) (da.f24353g | 2);
                }
                if (map.containsKey("enifd")) {
                    da.f24352f = (String) map.get("enifd");
                }
                try {
                    p2.j.f39798C.f39818s.b(interfaceC3858rh5, da.a());
                    return;
                } catch (NullPointerException e6) {
                    p2.j.f39798C.f39808h.d("DefaultGmsgHandlers.ShowLMDOverlay", e6);
                    t2.C.k("Missing parameters for LMD Overlay show request");
                    return;
                }
            case 5:
                W w10 = p2.j.f39798C.f39818s;
                if (!w10.f28332a || (c4086vt = (C4086vt) w10.f28336e) == null) {
                    t2.C.k("LastMileDelivery not connected");
                    return;
                } else {
                    ((IA) c4086vt.f34886u).a(w10.e(), (h8.d) w10.f28337f, 1);
                    w10.d(new HashMap(), "onLMDOverlayExpand");
                    return;
                }
            case 6:
                W w11 = p2.j.f39798C.f39818s;
                if (!w11.f28332a || (c4086vt2 = (C4086vt) w11.f28336e) == null) {
                    t2.C.k("LastMileDelivery not connected");
                    return;
                } else {
                    ((IA) c4086vt2.f34886u).a(w11.e(), (h8.d) w11.f28337f, 2);
                    w11.d(new HashMap(), "onLMDOverlayCollapse");
                    return;
                }
            case 7:
                W w12 = p2.j.f39798C.f39818s;
                if (!w12.f28332a || (c4086vt3 = (C4086vt) w12.f28336e) == null) {
                    t2.C.k("LastMileDelivery not connected");
                    return;
                }
                if (!((Boolean) q2.r.f40116e.f40119c.a(AbstractC3368ia.Vc)).booleanValue() || TextUtils.isEmpty((String) w12.f28334c)) {
                    String str3 = (String) w12.f28333b;
                    if (str3 != null) {
                        str2 = str3;
                        str = null;
                        CA ca = new CA(str2, str);
                        h8.d dVar = (h8.d) w12.f28337f;
                        IA ia = (IA) c4086vt3.f34886u;
                        c2631Jq = ia.f25534a;
                        if (c2631Jq != null) {
                            IA.f25532c.c("error: %s", "Play Store not found.");
                            return;
                        } else {
                            if (IA.c(dVar, "Failed to apply OverlayDisplayDismissRequest: missing appId and sessionToken.", Arrays.asList(str2, str))) {
                                c2631Jq.a(new LA(c2631Jq, new RunnableC3771q0(ia, ca, dVar, 11), 0));
                                return;
                            }
                            return;
                        }
                    }
                    w12.c("Missing session token and/or appId", "onLMDupdate");
                    str = null;
                } else {
                    str = (String) w12.f28334c;
                }
                str2 = null;
                CA ca2 = new CA(str2, str);
                h8.d dVar2 = (h8.d) w12.f28337f;
                IA ia2 = (IA) c4086vt3.f34886u;
                c2631Jq = ia2.f25534a;
                if (c2631Jq != null) {
                }
                break;
            case 8:
                InterfaceC3858rh interfaceC3858rh6 = (InterfaceC3858rh) obj;
                try {
                    Tx f6 = Tx.f(interfaceC3858rh6.getContext());
                    f6.getClass();
                    synchronized (Tx.class) {
                        f6.c(false);
                    }
                    Ux.f(interfaceC3858rh6.getContext()).g();
                    Vx.k(interfaceC3858rh6.getContext()).s();
                    return;
                } catch (IOException e9) {
                    p2.j.f39798C.f39808h.d("DefaultGmsgHandlers.ResetPaid", e9);
                    return;
                }
            case 9:
                InterfaceC3858rh interfaceC3858rh7 = (InterfaceC3858rh) obj;
                try {
                    String str4 = (String) map.get("enabled");
                    C2820Vb c2820Vb = AbstractC2935ac.f29210a;
                    if (!AbstractC3035cL.D("true", str4) && !AbstractC3035cL.D("false", str4)) {
                        return;
                    }
                    Rx g10 = Rx.g(interfaceC3858rh7.getContext());
                    boolean parseBoolean = Boolean.parseBoolean(str4);
                    g10.getClass();
                    synchronized (Rx.class) {
                        ((C2593Hm) g10.f27448u).j(Boolean.valueOf(parseBoolean), "paidv2_user_option");
                    }
                    return;
                } catch (IOException e10) {
                    p2.j.f39798C.f39808h.d("DefaultGmsgHandlers.SetPaidv2PersonalizationEnabled", e10);
                    return;
                }
            case 10:
                InterfaceC3858rh interfaceC3858rh8 = (InterfaceC3858rh) obj;
                try {
                    JSONObject jSONObject = new JSONObject((String) map.get("args"));
                    Iterator<String> keys = jSONObject.keys();
                    SharedPreferences.Editor edit = PreferenceManager.getDefaultSharedPreferences(interfaceC3858rh8.getContext()).edit();
                    while (keys.hasNext()) {
                        String next = keys.next();
                        Object obj2 = jSONObject.get(next);
                        if (obj2 instanceof Integer) {
                            edit.putInt(next, ((Integer) obj2).intValue());
                        } else if (obj2 instanceof Long) {
                            edit.putLong(next, ((Long) obj2).longValue());
                        } else if (obj2 instanceof Double) {
                            edit.putFloat(next, ((Double) obj2).floatValue());
                        } else if (obj2 instanceof Float) {
                            edit.putFloat(next, ((Float) obj2).floatValue());
                        } else if (obj2 instanceof Boolean) {
                            edit.putBoolean(next, ((Boolean) obj2).booleanValue());
                        } else if (obj2 instanceof String) {
                            edit.putString(next, (String) obj2);
                        }
                    }
                    edit.apply();
                    return;
                } catch (JSONException e11) {
                    p2.j.f39798C.f39808h.d("GMSG write local storage KV pairs handler", e11);
                    return;
                }
            case 11:
                InterfaceC3858rh interfaceC3858rh9 = (InterfaceC3858rh) obj;
                try {
                    JSONArray jSONArray = new JSONArray((String) map.get("args"));
                    SharedPreferences.Editor edit2 = PreferenceManager.getDefaultSharedPreferences(interfaceC3858rh9.getContext()).edit();
                    for (int i14 = 0; i14 < jSONArray.length(); i14++) {
                        edit2.remove(jSONArray.getString(i14));
                    }
                    edit2.apply();
                    return;
                } catch (JSONException e12) {
                    p2.j.f39798C.f39808h.d("GMSG clear local storage keys handler", e12);
                    return;
                }
            case 12:
                InterfaceC3858rh interfaceC3858rh10 = (InterfaceC3858rh) obj;
                if (interfaceC3858rh10.l0() != null) {
                    ((BinderC3655nt) interfaceC3858rh10.l0()).G3(3);
                }
                BinderC4996d w02 = interfaceC3858rh10.w0();
                if (w02 != null) {
                    w02.z();
                    return;
                }
                BinderC4996d C0 = interfaceC3858rh10.C0();
                if (C0 != null) {
                    C0.z();
                    return;
                } else {
                    int i15 = t2.C.f40822b;
                    u2.i.f("A GMSG tried to close something that wasn't an overlay.");
                    return;
                }
            case 13:
                ((InterfaceC3858rh) obj).t0("1".equals(map.get("custom_close")));
                return;
            case 14:
                String valueOf = String.valueOf((String) map.get(com.anythink.expressad.foundation.h.k.f19794g));
                int i16 = t2.C.f40822b;
                u2.i.e("Received log message: ".concat(valueOf));
                return;
            case 15:
                InterfaceC3152eb a14 = ((InterfaceC3858rh) obj).a1();
                if (a14 != null) {
                    a14.mo0a();
                    return;
                }
                return;
            case 16:
                ((InterfaceC3858rh) obj).h1(!Boolean.parseBoolean((String) map.get("disabled")));
                return;
            case 17:
                InterfaceC3858rh interfaceC3858rh11 = (InterfaceC3858rh) obj;
                String str5 = (String) map.get(NativeAdvancedJsUtils.f18064p);
                if (com.anythink.expressad.foundation.d.d.co.equals(str5)) {
                    interfaceC3858rh11.y();
                    return;
                } else {
                    if (com.anythink.expressad.foundation.d.d.cp.equals(str5)) {
                        interfaceC3858rh11.t();
                        return;
                    }
                    return;
                }
            case 18:
                InterfaceC3858rh interfaceC3858rh12 = (InterfaceC3858rh) obj;
                if (map.containsKey(com.anythink.expressad.foundation.d.d.cg)) {
                    C2588Hh j02 = interfaceC3858rh12.j0();
                    synchronized (j02.f25409w) {
                    }
                    j02.f25402W++;
                    j02.E();
                    return;
                }
                if (map.containsKey("stop")) {
                    r0.f25402W--;
                    interfaceC3858rh12.j0().E();
                    return;
                }
                if (map.containsKey(com.anythink.expressad.f.a.b.dP)) {
                    C2588Hh j03 = interfaceC3858rh12.j0();
                    C2914a9 c2914a9 = j03.f25407u;
                    if (c2914a9 != null) {
                        c2914a9.b(10005);
                    }
                    j03.f25401V = true;
                    j03.f25387G = 10004;
                    j03.f25388H = "Page loaded delay cancel.";
                    j03.E();
                    j03.f25405n.destroy();
                    return;
                }
                return;
            case 19:
                InterfaceC3858rh interfaceC3858rh13 = (InterfaceC3858rh) obj;
                if (map.containsKey(com.anythink.expressad.foundation.d.d.cg)) {
                    interfaceC3858rh13.L0(true);
                }
                if (map.containsKey("stop")) {
                    interfaceC3858rh13.L0(false);
                    return;
                }
                return;
            case 20:
                InterfaceC3858rh interfaceC3858rh14 = (InterfaceC3858rh) obj;
                C2820Vb c2820Vb2 = AbstractC2935ac.f29210a;
                if (!((Boolean) q2.r.f40116e.f40119c.a(AbstractC3368ia.t9)).booleanValue()) {
                    int i17 = t2.C.f40822b;
                    u2.i.f("canOpenAppGmsgHandler disabled.");
                    return;
                }
                String str6 = (String) map.get("package_name");
                if (TextUtils.isEmpty(str6)) {
                    int i18 = t2.C.f40822b;
                    u2.i.f("Package name missing in canOpenApp GMSG.");
                    return;
                }
                HashMap hashMap3 = new HashMap();
                Boolean valueOf2 = Boolean.valueOf(interfaceC3858rh14.getContext().getPackageManager().getLaunchIntentForPackage(str6) != null);
                hashMap3.put(str6, valueOf2);
                StringBuilder sb = new StringBuilder(String.valueOf(str6).length() + 13 + valueOf2.toString().length());
                sb.append("/canOpenApp;");
                sb.append(str6);
                sb.append(";");
                sb.append(valueOf2);
                t2.C.k(sb.toString());
                interfaceC3858rh14.a("openableApp", hashMap3);
                return;
            case 21:
                InterfaceC3858rh interfaceC3858rh15 = (InterfaceC3858rh) obj;
                C2820Vb c2820Vb3 = AbstractC2935ac.f29210a;
                PackageManager packageManager = interfaceC3858rh15.getContext().getPackageManager();
                try {
                    try {
                        JSONArray jSONArray2 = new JSONObject((String) map.get("data")).getJSONArray("intents");
                        JSONObject jSONObject2 = new JSONObject();
                        int i19 = 0;
                        while (i19 < jSONArray2.length()) {
                            try {
                                JSONObject jSONObject3 = jSONArray2.getJSONObject(i19);
                                optString = jSONObject3.optString("id");
                                optString2 = jSONObject3.optString("u");
                                optString3 = jSONObject3.optString("i");
                                optString4 = jSONObject3.optString(com.anythink.expressad.f.a.b.dI);
                                optString5 = jSONObject3.optString("p");
                                optString6 = jSONObject3.optString("c");
                                optString7 = jSONObject3.optString("intent_url");
                            } catch (JSONException e13) {
                                c4 = c9;
                                i4 = i9;
                                int i20 = t2.C.f40822b;
                                u2.i.d("Error parsing the intent data.", e13);
                            }
                            if (TextUtils.isEmpty(optString7)) {
                                i4 = i9;
                            } else {
                                try {
                                    parseUri = Intent.parseUri(optString7, i9);
                                    i4 = i9;
                                } catch (URISyntaxException e14) {
                                    String valueOf3 = String.valueOf(optString7);
                                    int i21 = t2.C.f40822b;
                                    i4 = i9;
                                    u2.i.d("Error parsing the url: ".concat(valueOf3), e14);
                                }
                                if (parseUri == null) {
                                    parseUri = new Intent();
                                    if (!TextUtils.isEmpty(optString2)) {
                                        parseUri.setData(Uri.parse(optString2));
                                    }
                                    if (!TextUtils.isEmpty(optString3)) {
                                        parseUri.setAction(optString3);
                                    }
                                    if (!TextUtils.isEmpty(optString4)) {
                                        parseUri.setType(optString4);
                                    }
                                    if (!TextUtils.isEmpty(optString5)) {
                                        parseUri.setPackage(optString5);
                                    }
                                    if (!TextUtils.isEmpty(optString6)) {
                                        String[] split = optString6.split("/", 2);
                                        if (split.length == 2) {
                                            parseUri.setComponent(new ComponentName(split[i4], split[1]));
                                        }
                                    }
                                }
                                Intent intent = parseUri;
                                c4 = 0;
                                ResolveInfo resolveInfo = packageManager.resolveActivity(intent, com.anythink.basead.exoplayer.b.aX);
                                jSONObject2.put(optString, resolveInfo == null ? 1 : i4);
                                i19++;
                                c9 = c4;
                                i9 = i4;
                            }
                            parseUri = null;
                            if (parseUri == null) {
                            }
                            Intent intent2 = parseUri;
                            c4 = 0;
                            ResolveInfo resolveInfo2 = packageManager.resolveActivity(intent2, com.anythink.basead.exoplayer.b.aX);
                            jSONObject2.put(optString, resolveInfo2 == null ? 1 : i4);
                            i19++;
                            c9 = c4;
                            i9 = i4;
                        }
                        interfaceC3858rh15.c("openableIntents", jSONObject2);
                        return;
                    } catch (JSONException unused) {
                        interfaceC3858rh15.c("openableIntents", new JSONObject());
                        return;
                    }
                } catch (JSONException unused2) {
                    interfaceC3858rh15.c("openableIntents", new JSONObject());
                    return;
                }
            case 22:
                InterfaceC3858rh interfaceC3858rh16 = (InterfaceC3858rh) obj;
                C2820Vb c2820Vb4 = AbstractC2935ac.f29210a;
                String str7 = (String) map.get("u");
                if (str7 == null) {
                    int i22 = t2.C.f40822b;
                    u2.i.f("URL missing from httpTrack GMSG.");
                    return;
                } else if (!((Boolean) q2.r.f40116e.f40119c.a(AbstractC3368ia.f31668g)).booleanValue() || !str7.isEmpty()) {
                    new t2.v(interfaceC3858rh16.getContext(), interfaceC3858rh16.w().f41217n, str7, interfaceC3858rh16.J() != null ? interfaceC3858rh16.J().f28184x0 : null).l();
                    return;
                } else {
                    int i23 = t2.C.f40822b;
                    u2.i.f("URL is empty from httpTrack GMSG.");
                    return;
                }
            case 23:
                InterfaceC3858rh interfaceC3858rh17 = (InterfaceC3858rh) obj;
                C2820Vb c2820Vb5 = AbstractC2935ac.f29210a;
                String str8 = (String) map.get("tx");
                String str9 = (String) map.get("ty");
                String str10 = (String) map.get("td");
                try {
                    int parseInt = Integer.parseInt(str8);
                    int parseInt2 = Integer.parseInt(str9);
                    int parseInt3 = Integer.parseInt(str10);
                    C3348i7 S02 = interfaceC3858rh17.S0();
                    if (S02 != null) {
                        S02.f31319b.a(parseInt, parseInt2, parseInt3);
                        return;
                    }
                    return;
                } catch (NumberFormatException unused3) {
                    int i24 = t2.C.f40822b;
                    u2.i.f("Could not parse touch parameters from gmsg.");
                    return;
                }
            case 24:
                InterfaceC3858rh interfaceC3858rh18 = (InterfaceC3858rh) obj;
                C2820Vb c2820Vb6 = AbstractC2935ac.f29210a;
                String str11 = (String) map.get("urls");
                if (TextUtils.isEmpty(str11)) {
                    int i25 = t2.C.f40822b;
                    u2.i.f("URLs missing in canOpenURLs GMSG.");
                    return;
                }
                String[] split2 = str11.split(",");
                HashMap hashMap4 = new HashMap();
                PackageManager packageManager2 = interfaceC3858rh18.getContext().getPackageManager();
                int length = split2.length;
                int i26 = 0;
                while (i26 < length) {
                    String str12 = split2[i26];
                    String[] split3 = str12.split(";", 2);
                    Boolean valueOf4 = Boolean.valueOf(packageManager2.resolveActivity(new Intent(split3.length > i10 ? split3[i10].trim() : "android.intent.action.VIEW", Uri.parse(split3[0].trim())), com.anythink.basead.exoplayer.b.aX) != null ? i10 : 0);
                    hashMap4.put(str12, valueOf4);
                    int i27 = i10;
                    StringBuilder sb2 = new StringBuilder(str12.length() + 14 + valueOf4.toString().length());
                    sb2.append("/canOpenURLs;");
                    sb2.append(str12);
                    sb2.append(";");
                    sb2.append(valueOf4);
                    t2.C.k(sb2.toString());
                    i26++;
                    i10 = i27;
                }
                interfaceC3858rh18.a("openableURLs", hashMap4);
                return;
            case 25:
                InterfaceC3858rh interfaceC3858rh19 = (InterfaceC3858rh) obj;
                BinderC2554Fh g11 = interfaceC3858rh19.g();
                if (g11 == null) {
                    try {
                        BinderC2554Fh binderC2554Fh2 = new BinderC2554Fh(interfaceC3858rh19, Float.parseFloat((String) map.get("duration")), "1".equals(map.get("customControlsAllowed")), "1".equals(map.get("clickToExpandAllowed")));
                        interfaceC3858rh19.e1(binderC2554Fh2);
                        binderC2554Fh = binderC2554Fh2;
                    } catch (NullPointerException e15) {
                        e = e15;
                        int i28 = t2.C.f40822b;
                        u2.i.d("Unable to parse videoMeta message.", e);
                        p2.j.f39798C.f39808h.d("VideoMetaGmsgHandler.onGmsg", e);
                        return;
                    } catch (NumberFormatException e16) {
                        e = e16;
                        int i282 = t2.C.f40822b;
                        u2.i.d("Unable to parse videoMeta message.", e);
                        p2.j.f39798C.f39808h.d("VideoMetaGmsgHandler.onGmsg", e);
                        return;
                    }
                } else {
                    binderC2554Fh = g11;
                }
                float parseFloat = Float.parseFloat((String) map.get("duration"));
                boolean equals = "1".equals(map.get("muted"));
                float parseFloat2 = Float.parseFloat((String) map.get("currentTime"));
                int parseInt4 = Integer.parseInt((String) map.get("playbackState"));
                if (parseInt4 >= 0 && parseInt4 <= 3) {
                    i9 = parseInt4;
                }
                String str13 = (String) map.get("aspectRatio");
                float parseFloat3 = TextUtils.isEmpty(str13) ? 0.0f : Float.parseFloat(str13);
                if (u2.i.j(3)) {
                    StringBuilder sb3 = new StringBuilder(String.valueOf(parseFloat2).length() + 45 + String.valueOf(parseFloat).length() + 13 + String.valueOf(equals).length() + 19 + String.valueOf(i9).length() + 17 + String.valueOf(str13).length());
                    sb3.append("Video Meta GMSG: currentTime : ");
                    sb3.append(parseFloat2);
                    sb3.append(" , duration : ");
                    sb3.append(parseFloat);
                    sb3.append(" , isMuted : ");
                    sb3.append(equals);
                    sb3.append(" , playbackState : ");
                    sb3.append(i9);
                    sb3.append(" , aspectRatio : ");
                    sb3.append(str13);
                    u2.i.a(sb3.toString());
                }
                binderC2554Fh.I3(parseFloat2, parseFloat, i9, equals, parseFloat3);
                return;
            case 26:
                a(obj, map);
                return;
            default:
                int i29 = t2.C.f40822b;
                u2.i.a("Show native ad policy validator overlay.");
                ((InterfaceC3858rh) obj).b0().setVisibility(0);
                return;
        }
    }
}
