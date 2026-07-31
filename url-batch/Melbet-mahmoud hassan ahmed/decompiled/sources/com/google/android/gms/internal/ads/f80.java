package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.app.ActivityManager;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.View;
import com.google.android.gms.internal.ads.cv0;
import com.google.android.gms.internal.ads.da0;
import com.google.android.gms.internal.ads.eu0;
import com.google.android.gms.internal.ads.gv0;
import com.google.android.gms.internal.ads.kv0;
import com.google.android.gms.internal.ads.nv0;
import com.google.android.gms.internal.ads.pi1;
import com.google.android.gms.internal.ads.pv0;
import com.google.android.gms.internal.ads.vt0;
import com.google.android.gms.internal.ads.yu;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public final class f80<T extends yu & vt0 & eu0 & da0 & cv0 & gv0 & kv0 & pi1 & nv0 & pv0> implements t70<T> {

    /* renamed from: a, reason: collision with root package name */
    private final y2.b f5028a;

    /* renamed from: b, reason: collision with root package name */
    private final wv1 f5029b;

    /* renamed from: c, reason: collision with root package name */
    private final xw2 f5030c;

    /* renamed from: e, reason: collision with root package name */
    private final yf0 f5032e;

    /* renamed from: f, reason: collision with root package name */
    private final o42 f5033f;

    /* renamed from: g, reason: collision with root package name */
    private z2.w f5034g = null;

    /* renamed from: d, reason: collision with root package name */
    private final oo0 f5031d = new oo0(null);

    public f80(y2.b bVar, yf0 yf0Var, o42 o42Var, wv1 wv1Var, xw2 xw2Var) {
        this.f5028a = bVar;
        this.f5032e = yf0Var;
        this.f5033f = o42Var;
        this.f5029b = wv1Var;
        this.f5030c = xw2Var;
    }

    public static int b(Map<String, String> map) {
        String str = map.get("o");
        if (str == null) {
            return -1;
        }
        if ("p".equalsIgnoreCase(str)) {
            return 7;
        }
        if ("l".equalsIgnoreCase(str)) {
            return 6;
        }
        if ("c".equalsIgnoreCase(str)) {
            return y2.t.r().g();
        }
        return -1;
    }

    static Uri c(Context context, gb gbVar, Uri uri, View view, Activity activity) {
        if (gbVar == null) {
            return uri;
        }
        try {
            return gbVar.e(uri) ? gbVar.a(uri, context, view, activity) : uri;
        } catch (hb unused) {
            return uri;
        } catch (Exception e7) {
            y2.t.p().s(e7, "OpenGmsgHandler.maybeAddClickSignalsToUri");
            return uri;
        }
    }

    static Uri d(Uri uri) {
        try {
            if (uri.getQueryParameter("aclk_ms") != null) {
                return uri.buildUpon().appendQueryParameter("aclk_upms", String.valueOf(SystemClock.uptimeMillis())).build();
            }
        } catch (UnsupportedOperationException e7) {
            String valueOf = String.valueOf(uri.toString());
            io0.e(valueOf.length() != 0 ? "Error adding click uptime parameter to url: ".concat(valueOf) : new String("Error adding click uptime parameter to url: "), e7);
        }
        return uri;
    }

    public static boolean f(Map<String, String> map) {
        return "1".equals(map.get("custom_close"));
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x00dc, code lost:
    
        if (com.google.android.gms.internal.ads.e80.c(r11, r5, r6, r7) == null) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x011f, code lost:
    
        r11 = r15;
     */
    /* JADX WARN: Removed duplicated region for block: B:14:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00cc  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void h(T t6, Map<String, String> map, boolean z6, String str, boolean z7) {
        Uri.Builder scheme;
        ResolveInfo d7;
        List<ActivityManager.RunningAppProcessInfo> runningAppProcesses;
        ResolveInfo c7;
        boolean z8 = true;
        i(true);
        T t7 = t6;
        Context context = t7.getContext();
        gb I = t7.I();
        View c02 = t7.c0();
        ActivityManager activityManager = (ActivityManager) context.getSystemService("activity");
        String str2 = map.get("u");
        Intent intent = null;
        Uri uri = null;
        if (!TextUtils.isEmpty(str2)) {
            Uri d8 = d(c(context, I, Uri.parse(str2), c02, null));
            boolean parseBoolean = Boolean.parseBoolean(map.get("use_first_package"));
            boolean parseBoolean2 = Boolean.parseBoolean(map.get("use_running_process"));
            if (!Boolean.parseBoolean(map.get("use_custom_tabs"))) {
                if (!((Boolean) sw.c().b(m10.f8156a3)).booleanValue()) {
                    z8 = false;
                }
            }
            if ("http".equalsIgnoreCase(d8.getScheme())) {
                scheme = d8.buildUpon().scheme("https");
            } else {
                if ("https".equalsIgnoreCase(d8.getScheme())) {
                    scheme = d8.buildUpon().scheme("http");
                }
                ArrayList arrayList = new ArrayList();
                Intent a7 = e80.a(d8, context, I, c02);
                Intent a8 = e80.a(uri, context, I, c02);
                if (z8) {
                    y2.t.q();
                    a3.g2.c0(context, a7);
                    y2.t.q();
                    a3.g2.c0(context, a8);
                }
                d7 = e80.d(a7, arrayList, context, I, c02);
                if (d7 == null) {
                    intent = e80.b(a7, d7, context, I, c02);
                } else {
                    if (a8 != null && (c7 = e80.c(a8, context, I, c02)) != null) {
                        intent = e80.b(a7, c7, context, I, c02);
                    }
                    if (arrayList.size() != 0) {
                        if (parseBoolean2 && activityManager != null && (runningAppProcesses = activityManager.getRunningAppProcesses()) != null) {
                            int size = arrayList.size();
                            int i7 = 0;
                            loop0: while (i7 < size) {
                                ResolveInfo resolveInfo = (ResolveInfo) arrayList.get(i7);
                                Iterator<ActivityManager.RunningAppProcessInfo> it = runningAppProcesses.iterator();
                                do {
                                    int i8 = i7 + 1;
                                    if (it.hasNext()) {
                                    }
                                } while (!it.next().processName.equals(resolveInfo.activityInfo.packageName));
                                intent = e80.b(a7, resolveInfo, context, I, c02);
                                break loop0;
                            }
                        }
                        if (parseBoolean) {
                            intent = e80.b(a7, (ResolveInfo) arrayList.get(0), context, I, c02);
                        }
                    }
                    intent = a7;
                }
            }
            uri = scheme.build();
            ArrayList arrayList2 = new ArrayList();
            Intent a72 = e80.a(d8, context, I, c02);
            Intent a82 = e80.a(uri, context, I, c02);
            if (z8) {
            }
            d7 = e80.d(a72, arrayList2, context, I, c02);
            if (d7 == null) {
            }
        }
        if (!z6 || this.f5033f == null || intent == null || !j(t6, t7.getContext(), intent.getData().toString(), str)) {
            try {
                t6.E(new z2.f(intent, this.f5034g), z7);
            } catch (ActivityNotFoundException e7) {
                io0.g(e7.getMessage());
            }
        }
    }

    private final void i(boolean z6) {
        yf0 yf0Var = this.f5032e;
        if (yf0Var != null) {
            yf0Var.h(z6);
        }
    }

    private final boolean j(T t6, Context context, String str, String str2) {
        String str3;
        y2.t.q();
        boolean j7 = a3.g2.j(context);
        y2.t.q();
        a3.x0 e7 = a3.g2.e(context);
        wv1 wv1Var = this.f5029b;
        if (wv1Var != null) {
            w42.t6(context, wv1Var, this.f5030c, this.f5033f, str2, "offline_open");
        }
        T t7 = t6;
        boolean z6 = t7.w().i() && t7.j() == null;
        if (j7) {
            this.f5033f.w(this.f5031d, str2);
            return false;
        }
        y2.t.q();
        if (j.h.b(context).a() && e7 != null && !z6) {
            if (((Boolean) sw.c().b(m10.f8223i6)).booleanValue()) {
                if (t7.w().i()) {
                    w42.v6(t7.j(), null, e7, this.f5033f, this.f5029b, this.f5030c, str2, str);
                } else {
                    t6.c1(e7, this.f5033f, this.f5029b, this.f5030c, str2, str, y2.t.r().g());
                }
                wv1 wv1Var2 = this.f5029b;
                if (wv1Var2 != null) {
                    w42.t6(context, wv1Var2, this.f5030c, this.f5033f, str2, "dialog_impression");
                }
                t6.M();
                return true;
            }
        }
        this.f5033f.h(str2);
        if (this.f5029b != null) {
            HashMap hashMap = new HashMap();
            y2.t.q();
            if (!j.h.b(context).a()) {
                str3 = "notifications_disabled";
            } else if (e7 == null) {
                str3 = "work_manager_unavailable";
            } else {
                if (((Boolean) sw.c().b(m10.f8223i6)).booleanValue()) {
                    if (z6) {
                        str3 = "fullscreen_no_activity";
                    }
                    w42.u6(context, this.f5029b, this.f5030c, this.f5033f, str2, "dialog_not_shown", hashMap);
                } else {
                    str3 = "notification_flow_disabled";
                }
            }
            hashMap.put("dialog_not_shown_reason", str3);
            w42.u6(context, this.f5029b, this.f5030c, this.f5033f, str2, "dialog_not_shown", hashMap);
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void k(int i7) {
        if (this.f5029b == null) {
            return;
        }
        if (((Boolean) sw.c().b(m10.f8287q6)).booleanValue()) {
            xw2 xw2Var = this.f5030c;
            ww2 b7 = ww2.b("cct_action");
            b7.a("cct_open_status", k20.a(i7));
            xw2Var.a(b7);
            return;
        }
        vv1 a7 = this.f5029b.a();
        a7.b("action", "cct_action");
        a7.b("cct_open_status", k20.a(i7));
        a7.f();
    }

    @Override // com.google.android.gms.internal.ads.t70
    /* renamed from: e, reason: merged with bridge method [inline-methods] */
    public final void a(T t6, Map<String, String> map) {
        String str;
        boolean z6;
        HashMap hashMap;
        Object obj;
        T t7 = t6;
        String c7 = rm0.c(map.get("u"), t7.getContext(), true);
        String str2 = map.get("a");
        if (str2 == null) {
            io0.g("Action missing from an open GMSG.");
            return;
        }
        y2.b bVar = this.f5028a;
        if (bVar != null && !bVar.c()) {
            this.f5028a.b(c7);
            return;
        }
        rr2 A = t7.A();
        ur2 D = t7.D();
        boolean z7 = false;
        if (A == null || D == null) {
            str = "";
            z6 = false;
        } else {
            z6 = A.f11380g0;
            str = D.f12947b;
        }
        boolean z8 = (((Boolean) sw.c().b(m10.k7)).booleanValue() && map.containsKey("sc") && map.get("sc").equals("0")) ? false : true;
        if ("expand".equalsIgnoreCase(str2)) {
            if (t7.N0()) {
                io0.g("Cannot expand WebView that is already expanded.");
                return;
            } else {
                i(false);
                t6.p0(f(map), b(map), z8);
                return;
            }
        }
        if ("webapp".equalsIgnoreCase(str2)) {
            i(false);
            if (c7 != null) {
                t6.S0(f(map), b(map), c7, z8);
                return;
            } else {
                t6.R0(f(map), b(map), map.get("html"), map.get("baseurl"), z8);
                return;
            }
        }
        if ("chrome_custom_tab".equalsIgnoreCase(str2)) {
            Context context = t7.getContext();
            if (((Boolean) sw.c().b(m10.f8172c3)).booleanValue()) {
                if (!((Boolean) sw.c().b(m10.f8220i3)).booleanValue()) {
                    if (((Boolean) sw.c().b(m10.f8204g3)).booleanValue()) {
                        String str3 = (String) sw.c().b(m10.f8212h3);
                        if (!str3.isEmpty() && context != null) {
                            String packageName = context.getPackageName();
                            Iterator<String> it = z43.c(b43.b(';')).d(str3).iterator();
                            while (it.hasNext()) {
                                if (it.next().equals(packageName)) {
                                }
                            }
                        }
                    }
                    z7 = true;
                    break;
                }
                a3.r1.k("User opt out chrome custom tab.");
            }
            boolean g7 = l20.g(t7.getContext());
            if (z7) {
                if (g7) {
                    i(true);
                    if (TextUtils.isEmpty(c7)) {
                        io0.g("Cannot open browser with null or empty url");
                        k(7);
                        return;
                    }
                    Uri d7 = d(c(t7.getContext(), t7.I(), Uri.parse(c7), t7.c0(), t7.j()));
                    if (z6 && this.f5033f != null && j(t6, t7.getContext(), d7.toString(), str)) {
                        return;
                    }
                    this.f5034g = new c80(this);
                    t6.E(new z2.f(null, d7.toString(), null, null, null, null, null, null, x3.b.B3(this.f5034g).asBinder(), true), z8);
                    return;
                }
                k(4);
            }
            map.put("use_first_package", "true");
            map.put("use_running_process", "true");
            h(t6, map, z6, str, z8);
            return;
        }
        if ("app".equalsIgnoreCase(str2) && "true".equalsIgnoreCase(map.get("system_browser"))) {
            h(t6, map, z6, str, z8);
            return;
        }
        if ("open_app".equalsIgnoreCase(str2)) {
            if (((Boolean) sw.c().b(m10.Z5)).booleanValue()) {
                i(true);
                String str4 = map.get("p");
                if (str4 == null) {
                    io0.g("Package name missing from open app action.");
                    return;
                }
                if (z6 && this.f5033f != null && j(t6, t7.getContext(), str4, str)) {
                    return;
                }
                PackageManager packageManager = t7.getContext().getPackageManager();
                if (packageManager == null) {
                    io0.g("Cannot get package manager from open app action.");
                    return;
                }
                Intent launchIntentForPackage = packageManager.getLaunchIntentForPackage(str4);
                if (launchIntentForPackage != null) {
                    t6.E(new z2.f(launchIntentForPackage, this.f5034g), z8);
                    return;
                }
                return;
            }
            return;
        }
        i(true);
        String str5 = map.get("intent_url");
        Intent intent = null;
        if (!TextUtils.isEmpty(str5)) {
            try {
                intent = Intent.parseUri(str5, 0);
            } catch (URISyntaxException e7) {
                String valueOf = String.valueOf(str5);
                io0.e(valueOf.length() != 0 ? "Error parsing the url: ".concat(valueOf) : new String("Error parsing the url: "), e7);
            }
        }
        Intent intent2 = intent;
        if (intent2 != null && intent2.getData() != null) {
            Uri data = intent2.getData();
            if (!Uri.EMPTY.equals(data)) {
                Uri d8 = d(c(t7.getContext(), t7.I(), data, t7.c0(), t7.j()));
                if (!TextUtils.isEmpty(intent2.getType())) {
                    if (((Boolean) sw.c().b(m10.f8159a6)).booleanValue()) {
                        intent2.setDataAndType(d8, intent2.getType());
                    }
                }
                intent2.setData(d8);
            }
        }
        boolean z9 = ((Boolean) sw.c().b(m10.f8255m6)).booleanValue() && "intent_async".equalsIgnoreCase(str2) && map.containsKey("event_id");
        HashMap hashMap2 = new HashMap();
        if (z9) {
            hashMap = hashMap2;
            obj = "p";
            this.f5034g = new d80(this, z8, t6, hashMap2, map);
            z8 = false;
        } else {
            hashMap = hashMap2;
            obj = "p";
        }
        if (intent2 != null) {
            if (!z6 || this.f5033f == null || !j(t6, t7.getContext(), intent2.getData().toString(), str)) {
                t6.E(new z2.f(intent2, this.f5034g), z8);
                return;
            } else {
                if (z9) {
                    HashMap hashMap3 = hashMap;
                    hashMap3.put(map.get("event_id"), Boolean.TRUE);
                    t6.t("openIntentAsync", hashMap3);
                    return;
                }
                return;
            }
        }
        HashMap hashMap4 = hashMap;
        if (!TextUtils.isEmpty(c7)) {
            c7 = d(c(t7.getContext(), t7.I(), Uri.parse(c7), t7.c0(), t7.j())).toString();
        }
        if (!z6 || this.f5033f == null || !j(t6, t7.getContext(), c7, str)) {
            t6.E(new z2.f(map.get("i"), c7, map.get("m"), map.get(obj), map.get("c"), map.get("f"), map.get("e"), this.f5034g), z8);
        } else if (z9) {
            hashMap4.put(map.get("event_id"), Boolean.TRUE);
            t6.t("openIntentAsync", hashMap4);
        }
    }
}
