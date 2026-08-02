package com.startapp.sdk.internal;

import E1.AbstractC0033i;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.res.Resources;
import android.media.AudioDeviceInfo;
import android.media.AudioManager;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Build;
import android.os.Environment;
import android.os.PowerManager;
import android.os.RemoteException;
import android.os.StatFs;
import android.os.SystemClock;
import android.util.DisplayMetrics;
import com.startapp.sdk.adsbase.model.AdPreferences;
import com.startapp.sdk.adsbase.remoteconfig.MetaData;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import io.appmetrica.analytics.coreutils.internal.system.ConstantDeviceInfo;
import io.appmetrica.analytics.networktasks.internal.CommonUrlParts;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.WeakHashMap;
import java.util.zip.GZIPOutputStream;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public abstract class y1 {

    /* renamed from: m0, reason: collision with root package name */
    public static final Collection f4739m0;

    /* renamed from: A, reason: collision with root package name */
    public String f4740A;

    /* renamed from: B, reason: collision with root package name */
    public String f4741B;

    /* renamed from: C, reason: collision with root package name */
    public String f4742C;

    /* renamed from: D, reason: collision with root package name */
    public String f4743D;

    /* renamed from: E, reason: collision with root package name */
    public String f4744E;

    /* renamed from: F, reason: collision with root package name */
    public String f4745F;

    /* renamed from: G, reason: collision with root package name */
    public String f4746G;

    /* renamed from: H, reason: collision with root package name */
    public String f4747H;

    /* renamed from: I, reason: collision with root package name */
    public String f4748I;

    /* renamed from: J, reason: collision with root package name */
    public String f4749J;

    /* renamed from: K, reason: collision with root package name */
    public final String f4750K;
    public int L;

    /* renamed from: M, reason: collision with root package name */
    public int f4751M;

    /* renamed from: N, reason: collision with root package name */
    public float f4752N;

    /* renamed from: O, reason: collision with root package name */
    public Boolean f4753O;

    /* renamed from: P, reason: collision with root package name */
    public final int f4754P;

    /* renamed from: Q, reason: collision with root package name */
    public String f4755Q;

    /* renamed from: R, reason: collision with root package name */
    public String f4756R;

    /* renamed from: S, reason: collision with root package name */
    public int f4757S;

    /* renamed from: T, reason: collision with root package name */
    public boolean f4758T;

    /* renamed from: U, reason: collision with root package name */
    public boolean f4759U;

    /* renamed from: V, reason: collision with root package name */
    public boolean f4760V;

    /* renamed from: W, reason: collision with root package name */
    public boolean f4761W;

    /* renamed from: X, reason: collision with root package name */
    public String f4762X;

    /* renamed from: Y, reason: collision with root package name */
    public String f4763Y;

    /* renamed from: Z, reason: collision with root package name */
    public final int f4764Z;

    /* renamed from: a, reason: collision with root package name */
    public String f4765a;

    /* renamed from: a0, reason: collision with root package name */
    public Long f4766a0;

    /* renamed from: b, reason: collision with root package name */
    public String f4767b;

    /* renamed from: b0, reason: collision with root package name */
    public Integer f4768b0;

    /* renamed from: c, reason: collision with root package name */
    public String f4769c;

    /* renamed from: c0, reason: collision with root package name */
    public Boolean f4770c0;

    /* renamed from: d, reason: collision with root package name */
    public final TreeMap f4771d;

    /* renamed from: d0, reason: collision with root package name */
    public Boolean f4772d0;

    /* renamed from: e, reason: collision with root package name */
    public Map f4773e;

    /* renamed from: e0, reason: collision with root package name */
    public Boolean f4774e0;
    public String f;

    /* renamed from: f0, reason: collision with root package name */
    public Boolean f4775f0;

    /* renamed from: g, reason: collision with root package name */
    public k0 f4776g;

    /* renamed from: g0, reason: collision with root package name */
    public u0 f4777g0;

    /* renamed from: h, reason: collision with root package name */
    public String f4778h;

    /* renamed from: h0, reason: collision with root package name */
    public boolean f4779h0;

    /* renamed from: i, reason: collision with root package name */
    public String f4780i;

    /* renamed from: i0, reason: collision with root package name */
    public Integer f4781i0;

    /* renamed from: j, reason: collision with root package name */
    public String f4782j;

    /* renamed from: j0, reason: collision with root package name */
    public Long f4783j0;

    /* renamed from: k, reason: collision with root package name */
    public String f4784k;

    /* renamed from: k0, reason: collision with root package name */
    public Boolean f4785k0;

    /* renamed from: l, reason: collision with root package name */
    public String f4786l;
    public String l0;

    /* renamed from: m, reason: collision with root package name */
    public String f4787m;

    /* renamed from: n, reason: collision with root package name */
    public String f4788n;
    public zb o;

    /* renamed from: p, reason: collision with root package name */
    public ca f4789p;

    /* renamed from: q, reason: collision with root package name */
    public Boolean f4790q;

    /* renamed from: r, reason: collision with root package name */
    public Boolean f4791r;

    /* renamed from: s, reason: collision with root package name */
    public String f4792s;

    /* renamed from: t, reason: collision with root package name */
    public boolean f4793t;

    /* renamed from: u, reason: collision with root package name */
    public int f4794u;
    public String v;

    /* renamed from: w, reason: collision with root package name */
    public String f4795w;

    /* renamed from: x, reason: collision with root package name */
    public String f4796x;

    /* renamed from: y, reason: collision with root package name */
    public String f4797y;
    public String z;

    static {
        ArrayList arrayList = new ArrayList();
        int i3 = Build.VERSION.SDK_INT;
        if (i3 >= 28) {
            arrayList.add(23);
        }
        if (i3 >= 26) {
            arrayList.add(22);
        }
        arrayList.add(3);
        arrayList.add(4);
        arrayList.add(7);
        arrayList.add(8);
        f4739m0 = Collections.unmodifiableCollection(arrayList);
    }

    public y1(int i3) {
        new HashMap();
        this.f4769c = "5.3.0";
        this.f4771d = new TreeMap();
        this.f4750K = ConstantDeviceInfo.APP_PLATFORM;
        this.f4754P = 3;
        this.f4764Z = i3;
    }

    public Set a() {
        return Collections.EMPTY_SET;
    }

    public boolean b() {
        return false;
    }

    public final void c(Context context) {
        if (this.f4767b == null) {
            q0 q0Var = (q0) com.startapp.sdk.components.a.a(context).f3473m.a();
            String str = q0Var.f4332c;
            if (str == null) {
                synchronized (q0Var.f4330a) {
                    try {
                        str = q0Var.f4332c;
                        if (str == null) {
                            str = q0Var.f4331b.getString("c88d4eab540fab77", null);
                        }
                    } finally {
                    }
                }
            }
            this.f4765a = str;
            this.f4767b = q0Var.a();
        }
        this.f4778h = context.getPackageName();
    }

    public final void d(Context context) {
        int i3;
        e6 e6Var;
        this.f4792s = rd.a(context);
        String str = ((vh) com.startapp.sdk.components.a.a(context).f3467g.a()).f4624h;
        this.f4747H = str;
        this.v = str;
        try {
            e6Var = ((f6) com.startapp.sdk.components.a.a(context).f3479t.a()).f3782e;
        } catch (Throwable th) {
            if (!si.a(th, RemoteException.class)) {
                d9.a(th);
            }
        }
        if (e6Var != null) {
            i3 = e6Var.a();
            this.f4794u = i3;
        }
        i3 = -1;
        this.f4794u = i3;
    }

    public final void e(Context context) {
        jh jhVar = (jh) ((mh) com.startapp.sdk.components.a.a(context).f.a()).b();
        Object opt = jhVar.f4033a.opt(String.valueOf(7));
        if ((opt instanceof Number ? ((Number) opt).intValue() : 0) == 5) {
            this.f4795w = jhVar.a(8);
            this.f4796x = jhVar.a(9);
            this.f4797y = jhVar.a(15);
            this.z = jhVar.a(16);
        }
        Object opt2 = jhVar.f4033a.opt(String.valueOf(10));
        int intValue = opt2 instanceof Number ? ((Number) opt2).intValue() : 0;
        if (intValue != 0 && intValue != 2) {
            this.f4740A = jhVar.a(11);
            this.f4741B = jhVar.a(12);
        }
        this.f4742C = jhVar.a(4);
        this.f4743D = jhVar.a(3);
        this.f4744E = jhVar.a(5);
        this.f4745F = jhVar.a(1);
        this.f4746G = jhVar.a(2);
        this.f4748I = jhVar.a(13);
        Object opt3 = jhVar.f4033a.opt(String.valueOf(14));
        this.f4793t = (opt3 instanceof Number ? ((Number) opt3).intValue() : 0) == 1;
    }

    public final void f(Context context) {
        com.startapp.sdk.components.a a3 = com.startapp.sdk.components.a.a(context);
        g6 g6Var = (g6) a3.f3470j.a();
        if (g6Var.b()) {
            int hashCode = ((com.startapp.sdk.common.advertisingid.b) g6Var.f3855c.a()).a().f4041a.hashCode();
            if (!((sf) g6Var.f3854b.a()).contains("advIdHash") || ((sf) g6Var.f3854b.a()).getInt("advIdHash", 0) != hashCode) {
                rf edit = ((sf) g6Var.f3854b.a()).edit();
                if (edit.f4396b.containsKey("consentType")) {
                    edit.f4398d = true;
                }
                edit.f4395a.remove("consentType");
                if (edit.f4396b.containsKey("consentTimestamp")) {
                    edit.f4398d = true;
                }
                edit.f4395a.remove("consentTimestamp");
                edit.a("advIdHash", Integer.valueOf(hashCode));
                edit.f4395a.putInt("advIdHash", hashCode);
                edit.apply();
            }
        }
        this.f4781i0 = (g6Var.b() && ((sf) g6Var.f3854b.a()).contains("consentType")) ? Integer.valueOf(((sf) g6Var.f3854b.a()).getInt("consentType", -1)) : null;
        this.f4783j0 = (g6Var.b() && ((sf) g6Var.f3854b.a()).contains("consentTimestamp")) ? Long.valueOf(((sf) g6Var.f3854b.a()).getLong("consentTimestamp", 0L)) : null;
        this.f4785k0 = (g6Var.b() && ((sf) g6Var.f3854b.a()).contains("consentApc")) ? Boolean.valueOf(((sf) g6Var.f3854b.a()).getBoolean("consentApc", false)) : null;
        this.l0 = ((sf) a3.f3450H.a()).getString("IABTCF_TCString", null);
    }

    public final void a(Context context) {
        if (MetaData.E().s()) {
            return;
        }
        this.f4776g = ((com.startapp.sdk.common.advertisingid.b) com.startapp.sdk.components.a.a(context).f3468h.a()).a();
        try {
            this.f4782j = ((fa) com.startapp.sdk.components.a.a(context).f3471k.a()).a();
        } catch (Throwable th) {
            d9.a(th);
        }
        try {
            this.f4773e = ((sf) com.startapp.sdk.components.a.a(context).f3451I.a()).getAll();
        } catch (Throwable th2) {
            d9.a(th2);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x005b, code lost:
    
        if (android.provider.Settings.Secure.getInt(r5.getContentResolver(), "install_non_market_apps") == 1) goto L15;
     */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0106 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void b(Context context, AdPreferences adPreferences) {
        String str;
        boolean z;
        boolean z2;
        Resources resources;
        String string;
        DisplayMetrics displayMetrics;
        NetworkInfo activeNetworkInfo;
        this.f4755Q = mg.f4159d.f4160a;
        this.f4787m = Build.MANUFACTURER;
        this.f4786l = Build.MODEL;
        this.f4788n = Integer.toString(Build.VERSION.SDK_INT);
        if (adPreferences != null) {
            this.f = adPreferences.getAge(context);
        }
        this.f4780i = ((xg) ((yg) com.startapp.sdk.components.a.a(context).o.a()).b()).f4736a;
        int i3 = p0.f4293a;
        boolean z3 = false;
        try {
            str = context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionName;
        } catch (Throwable unused) {
            str = null;
        }
        this.f4756R = str;
        this.f4757S = p0.a(context);
        try {
            z = true;
        } catch (Throwable unused2) {
        }
        this.f4759U = z2;
        try {
            z3 = u6.a(context);
        } catch (Throwable unused3) {
        }
        this.f4760V = z3;
        ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
        this.f4791r = (connectivityManager == null && p0.a(context, "android.permission.ACCESS_NETWORK_STATE") && (activeNetworkInfo = connectivityManager.getActiveNetworkInfo()) != null && activeNetworkInfo.isConnected()) ? Boolean.valueOf(activeNetworkInfo.isRoaming()) : null;
        this.f4761W = si.d(context);
        this.f4779h0 = si.e(context);
        resources = context.getResources();
        if (resources != null && (displayMetrics = resources.getDisplayMetrics()) != null) {
            this.L = displayMetrics.widthPixels;
            this.f4751M = displayMetrics.heightPixels;
            this.f4752N = displayMetrics.density;
        }
        com.startapp.sdk.components.a a3 = com.startapp.sdk.components.a.a(context);
        this.o = (zb) ((ac) a3.f3465d.a()).b();
        this.f4789p = (ca) ((ea) a3.f3466e.a()).b();
        sf sfVar = (sf) a3.f3449G.a();
        this.f4762X = sfVar.getString("USER_CONSENT_PERSONALIZED_ADS_SERVING", null);
        TreeMap treeMap = this.f4771d;
        string = sfVar.getString("sharedPrefsWrappers", null);
        if (string != null) {
            try {
                JSONObject jSONObject = new JSONObject(string);
                Iterator<String> keys = jSONObject.keys();
                while (keys.hasNext()) {
                    String next = keys.next();
                    treeMap.put(next, (String) jSONObject.get(next));
                }
            } catch (JSONException unused4) {
            }
        }
        this.f4753O = Boolean.valueOf(si.c(context));
        this.f4753O = Boolean.valueOf(si.c(context));
        this.f4760V = z3;
        ConnectivityManager connectivityManager2 = (ConnectivityManager) context.getSystemService("connectivity");
        this.f4791r = (connectivityManager2 == null && p0.a(context, "android.permission.ACCESS_NETWORK_STATE") && (activeNetworkInfo = connectivityManager2.getActiveNetworkInfo()) != null && activeNetworkInfo.isConnected()) ? Boolean.valueOf(activeNetworkInfo.isRoaming()) : null;
        this.f4761W = si.d(context);
        this.f4779h0 = si.e(context);
        resources = context.getResources();
        if (resources != null) {
            this.L = displayMetrics.widthPixels;
            this.f4751M = displayMetrics.heightPixels;
            this.f4752N = displayMetrics.density;
        }
        com.startapp.sdk.components.a a32 = com.startapp.sdk.components.a.a(context);
        this.o = (zb) ((ac) a32.f3465d.a()).b();
        this.f4789p = (ca) ((ea) a32.f3466e.a()).b();
        sf sfVar2 = (sf) a32.f3449G.a();
        this.f4762X = sfVar2.getString("USER_CONSENT_PERSONALIZED_ADS_SERVING", null);
        TreeMap treeMap2 = this.f4771d;
        string = sfVar2.getString("sharedPrefsWrappers", null);
        if (string != null) {
        }
        this.f4753O = Boolean.valueOf(si.c(context));
        z = false;
        this.f4790q = Boolean.valueOf(z);
        this.f4758T = p0.b(context);
        try {
            z2 = we.a(context);
        } catch (Throwable unused5) {
            z2 = false;
        }
        this.f4759U = z2;
        z3 = u6.a(context);
        this.f4760V = z3;
        ConnectivityManager connectivityManager22 = (ConnectivityManager) context.getSystemService("connectivity");
        this.f4791r = (connectivityManager22 == null && p0.a(context, "android.permission.ACCESS_NETWORK_STATE") && (activeNetworkInfo = connectivityManager22.getActiveNetworkInfo()) != null && activeNetworkInfo.isConnected()) ? Boolean.valueOf(activeNetworkInfo.isRoaming()) : null;
        this.f4761W = si.d(context);
        this.f4779h0 = si.e(context);
        resources = context.getResources();
        if (resources != null) {
        }
        com.startapp.sdk.components.a a322 = com.startapp.sdk.components.a.a(context);
        this.o = (zb) ((ac) a322.f3465d.a()).b();
        this.f4789p = (ca) ((ea) a322.f3466e.a()).b();
        sf sfVar22 = (sf) a322.f3449G.a();
        this.f4762X = sfVar22.getString("USER_CONSENT_PERSONALIZED_ADS_SERVING", null);
        TreeMap treeMap22 = this.f4771d;
        string = sfVar22.getString("sharedPrefsWrappers", null);
        if (string != null) {
        }
        this.f4753O = Boolean.valueOf(si.c(context));
    }

    public final void a(Context context, AdPreferences adPreferences) {
        try {
            this.f4777g0 = (u0) com.startapp.sdk.components.a.a(context).f3458Q.a();
        } catch (Throwable th) {
            d9.a(th);
        }
        c(context);
        try {
            b(context, adPreferences);
        } catch (Throwable unused) {
        }
        try {
            d(context);
        } catch (Throwable th2) {
            d9.a(th2);
        }
        try {
            e(context);
        } catch (Throwable th3) {
            d9.a(th3);
        }
        try {
            this.f4784k = ng.a(context);
        } catch (Throwable th4) {
            d9.a(th4);
        }
        try {
            this.f4749J = ((ef) com.startapp.sdk.components.a.a(context).f3469i.a()).a(this);
        } catch (Throwable th5) {
            d9.a(th5);
        }
        try {
            a(context);
        } catch (Throwable th6) {
            d9.a(th6);
        }
        try {
            b(context);
        } catch (Throwable th7) {
            d9.a(th7);
        }
        try {
            f(context);
        } catch (Throwable th8) {
            d9.a(th8);
        }
    }

    public final q8 a(boolean z) {
        eb ebVar = new eb(a());
        a(ebVar);
        byte[] bytes = ebVar.f3737b.toString().getBytes();
        String str = null;
        if (z) {
            try {
                WeakHashMap weakHashMap = si.f4438a;
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(byteArrayOutputStream);
                gZIPOutputStream.write(bytes);
                gZIPOutputStream.flush();
                gZIPOutputStream.close();
                bytes = byteArrayOutputStream.toByteArray();
                str = "gzip";
            } catch (IOException e3) {
                d9.a(e3);
            }
        }
        return new q8(bytes, "application/json", str);
    }

    public final String a(String str) {
        md mdVar = new md(a());
        a(mdVar);
        String mdVar2 = mdVar.toString();
        if (str.contains("?") && mdVar2.startsWith("?")) {
            return str + "&" + mdVar2.substring(1);
        }
        return AbstractC0033i.s(str, mdVar2);
    }

    public void a(se seVar) {
        Map map = this.f4773e;
        if (map != null) {
            for (Map.Entry entry : map.entrySet()) {
                seVar.a((String) entry.getKey(), entry.getValue(), false, true);
            }
        }
        seVar.a("publisherId", this.f4765a, false, true);
        seVar.a("productId", this.f4767b, b(), true);
        seVar.a("os", this.f4750K, true, true);
        seVar.a("sdkVersion", this.f4769c, false, true);
        seVar.a("flavor", 1023, false, true);
        TreeMap treeMap = this.f4771d;
        if (treeMap != null && !treeMap.isEmpty()) {
            String str = "";
            for (String str2 : this.f4771d.keySet()) {
                StringBuilder sb = new StringBuilder();
                sb.append(str);
                sb.append(str2);
                sb.append(StringUtils.PROCESS_POSTFIX_DELIMITER);
                str = AbstractC0033i.m(sb, (String) this.f4771d.get(str2), ";");
            }
            seVar.a("frameworksData", str.substring(0, str.length() - 1), false, false);
        }
        seVar.a("packageId", this.f4778h, false, true);
        seVar.a("installerPkg", this.f4780i, false, true);
        seVar.a("age", this.f, false, true);
        k0 k0Var = this.f4776g;
        if (k0Var != null) {
            seVar.a("userAdvertisingId", k0Var.f4041a, false, true);
            boolean z = this.f4776g.f4043c;
            if (z) {
                seVar.a("limat", Boolean.valueOf(z), false, true);
            }
            seVar.a("advertisingIdSource", this.f4776g.f4042b, false, true);
        }
        String str3 = this.f4782j;
        if (str3 != null) {
            seVar.a("duid", str3, false, true);
        }
        String str4 = this.f4784k;
        if (str4 != null) {
            seVar.a("vendorId", str4, false, true);
        }
        seVar.a(CommonUrlParts.MODEL, this.f4786l, false, true);
        seVar.a(CommonUrlParts.MANUFACTURER, this.f4787m, false, true);
        seVar.a("deviceVersion", this.f4788n, false, true);
        zb zbVar = this.o;
        if (zbVar != null) {
            seVar.a(CommonUrlParts.LOCALE, zbVar.f4881a, false, true);
            int i3 = this.f4764Z;
            if (i3 == 4 || i3 == 2) {
                seVar.a("localeList", this.o.f4882b, false, true);
            }
        }
        int i4 = this.f4764Z;
        if (i4 == 4 || i4 == 2) {
            seVar.a("inputLangs", this.f4789p, false, true);
        }
        seVar.a("isp", this.f4795w, false, true);
        seVar.a("ispName", this.f4796x, false, true);
        seVar.a("ispCarrId", this.f4797y, false, true);
        seVar.a("ispCarrIdName", this.z, false, true);
        seVar.a("netOper", this.f4740A, false, true);
        seVar.a("networkOperName", this.f4741B, false, true);
        seVar.a("cid", this.f4742C, false, true);
        seVar.a("lac", this.f4743D, false, true);
        seVar.a("tac", this.f4744E, false, true);
        seVar.a("blat", this.f4745F, false, true);
        seVar.a("blon", this.f4746G, false, true);
        seVar.a("subPublisherId", null, false, true);
        seVar.a("subProductId", null, false, true);
        seVar.a("retryCount", null, false, true);
        seVar.a("roaming", this.f4791r, false, true);
        seVar.a("grid", this.f4792s, false, true);
        if (this.f4793t) {
            seVar.a("c5g", "1", false, false);
        }
        int i5 = this.f4794u;
        if (i5 >= 0) {
            seVar.a("transport", String.valueOf(i5), false, false);
        }
        if (this.f4779h0) {
            seVar.a("tv", Boolean.TRUE, false, false);
        }
        seVar.a("silev", this.v, false, true);
        seVar.a("cellSignalLevel", this.f4747H, false, true);
        seVar.a("cellTimingAdv", this.f4748I, false, true);
        seVar.a("outsource", this.f4790q, false, true);
        seVar.a("width", String.valueOf(this.L), false, true);
        seVar.a("height", String.valueOf(this.f4751M), false, true);
        seVar.a("density", String.valueOf(this.f4752N), false, true);
        seVar.a("fgApp", this.f4753O, false, true);
        seVar.a("sdkId", String.valueOf(this.f4754P), true, true);
        seVar.a("clientSessionId", this.f4755Q, false, true);
        seVar.a("appVersion", this.f4756R, false, true);
        seVar.a("appCode", Integer.valueOf(this.f4757S), false, true);
        seVar.a("timeSinceBoot", Long.valueOf(SystemClock.elapsedRealtime()), false, true);
        seVar.a("udbg", Boolean.valueOf(this.f4758T), false, true);
        seVar.a("root", Boolean.valueOf(this.f4759U), false, true);
        seVar.a("smltr", Boolean.valueOf(this.f4760V), false, true);
        seVar.a("isddbg", Boolean.valueOf(this.f4761W), false, true);
        seVar.a("pas", this.f4762X, false, true);
        seVar.a("prm", this.f4763Y, false, false);
        seVar.a("free", this.f4766a0, false, false);
        seVar.a("chr", this.f4770c0, false, false);
        seVar.a("blp", this.f4768b0, false, false);
        seVar.a("hs", this.f4772d0, false, false);
        seVar.a("lpm", this.f4774e0, false, false);
        seVar.a("dm", this.f4775f0, false, false);
        seVar.a("ct", this.f4781i0, false, true);
        seVar.a("tsc", this.f4783j0, false, true);
        seVar.a("apc", this.f4785k0, false, true);
        seVar.a("IABTCF_TCString", this.l0, false, true);
        u0 u0Var = this.f4777g0;
        if (u0Var != null) {
            long j3 = 0;
            if (u0Var.f4501d > 0) {
                u0Var.f4498a.getClass();
                j3 = SystemClock.elapsedRealtime() - u0Var.f4501d;
            }
            seVar.a("appSessionDuration", Long.valueOf(j3 / 1000), false, false);
        }
        seVar.a("rsc", this.f4749J, false, true);
    }

    public final void b(Context context) {
        boolean z;
        try {
            this.f4766a0 = Long.valueOf(new StatFs(Environment.getRootDirectory().getAbsolutePath()).getFreeBytes());
        } catch (Throwable th) {
            d9.a(th);
        }
        boolean z2 = true;
        try {
            this.f4770c0 = null;
            this.f4768b0 = null;
            Intent registerReceiver = context.registerReceiver(null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
            if (registerReceiver != null) {
                if (registerReceiver.hasExtra("status")) {
                    int intExtra = registerReceiver.getIntExtra("status", -1);
                    if (intExtra != 2 && intExtra != 5) {
                        z = false;
                        this.f4770c0 = Boolean.valueOf(z);
                    }
                    z = true;
                    this.f4770c0 = Boolean.valueOf(z);
                }
                if (registerReceiver.hasExtra("level") && registerReceiver.hasExtra("scale")) {
                    int intExtra2 = registerReceiver.getIntExtra("level", -1);
                    int intExtra3 = registerReceiver.getIntExtra("scale", -1);
                    if (intExtra2 >= 0 && intExtra3 > 0) {
                        this.f4768b0 = Integer.valueOf((intExtra2 * 100) / intExtra3);
                    }
                }
            }
        } catch (Throwable th2) {
            d9.a(th2);
        }
        try {
            this.f4772d0 = null;
            Object systemService = context.getSystemService("audio");
            if (systemService instanceof AudioManager) {
                AudioDeviceInfo[] devices = ((AudioManager) systemService).getDevices(2);
                if (devices != null) {
                    for (AudioDeviceInfo audioDeviceInfo : devices) {
                        if (audioDeviceInfo != null && f4739m0.contains(Integer.valueOf(audioDeviceInfo.getType()))) {
                            break;
                        }
                    }
                }
                z2 = false;
                this.f4772d0 = Boolean.valueOf(z2);
            }
        } catch (Throwable th3) {
            d9.a(th3);
        }
        try {
            this.f4774e0 = null;
            Object systemService2 = context.getSystemService("power");
            if (systemService2 instanceof PowerManager) {
                this.f4774e0 = Boolean.valueOf(((PowerManager) systemService2).isPowerSaveMode());
            }
        } catch (Throwable th4) {
            d9.a(th4);
        }
        try {
            this.f4775f0 = null;
            int i3 = context.getResources().getConfiguration().uiMode & 48;
            if (i3 == 32) {
                this.f4775f0 = Boolean.TRUE;
            } else if (i3 == 16) {
                this.f4775f0 = Boolean.FALSE;
            }
        } catch (Throwable th5) {
            d9.a(th5);
        }
    }
}
