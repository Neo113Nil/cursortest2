package com.startapp.sdk.internal;

import E.AbstractC0005f;
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
    public static final Collection f7885m0;

    /* renamed from: A, reason: collision with root package name */
    public String f7886A;

    /* renamed from: B, reason: collision with root package name */
    public String f7887B;

    /* renamed from: C, reason: collision with root package name */
    public String f7888C;

    /* renamed from: D, reason: collision with root package name */
    public String f7889D;

    /* renamed from: E, reason: collision with root package name */
    public String f7890E;

    /* renamed from: F, reason: collision with root package name */
    public String f7891F;

    /* renamed from: G, reason: collision with root package name */
    public String f7892G;

    /* renamed from: H, reason: collision with root package name */
    public String f7893H;

    /* renamed from: I, reason: collision with root package name */
    public String f7894I;

    /* renamed from: J, reason: collision with root package name */
    public String f7895J;

    /* renamed from: K, reason: collision with root package name */
    public final String f7896K;
    public int L;

    /* renamed from: M, reason: collision with root package name */
    public int f7897M;

    /* renamed from: N, reason: collision with root package name */
    public float f7898N;

    /* renamed from: O, reason: collision with root package name */
    public Boolean f7899O;

    /* renamed from: P, reason: collision with root package name */
    public final int f7900P;

    /* renamed from: Q, reason: collision with root package name */
    public String f7901Q;

    /* renamed from: R, reason: collision with root package name */
    public String f7902R;

    /* renamed from: S, reason: collision with root package name */
    public int f7903S;

    /* renamed from: T, reason: collision with root package name */
    public boolean f7904T;

    /* renamed from: U, reason: collision with root package name */
    public boolean f7905U;

    /* renamed from: V, reason: collision with root package name */
    public boolean f7906V;

    /* renamed from: W, reason: collision with root package name */
    public boolean f7907W;

    /* renamed from: X, reason: collision with root package name */
    public String f7908X;

    /* renamed from: Y, reason: collision with root package name */
    public String f7909Y;

    /* renamed from: Z, reason: collision with root package name */
    public final int f7910Z;

    /* renamed from: a, reason: collision with root package name */
    public String f7911a;

    /* renamed from: a0, reason: collision with root package name */
    public Long f7912a0;

    /* renamed from: b, reason: collision with root package name */
    public String f7913b;

    /* renamed from: b0, reason: collision with root package name */
    public Integer f7914b0;

    /* renamed from: c, reason: collision with root package name */
    public String f7915c;

    /* renamed from: c0, reason: collision with root package name */
    public Boolean f7916c0;

    /* renamed from: d, reason: collision with root package name */
    public final TreeMap f7917d;

    /* renamed from: d0, reason: collision with root package name */
    public Boolean f7918d0;

    /* renamed from: e, reason: collision with root package name */
    public Map f7919e;

    /* renamed from: e0, reason: collision with root package name */
    public Boolean f7920e0;

    /* renamed from: f, reason: collision with root package name */
    public String f7921f;

    /* renamed from: f0, reason: collision with root package name */
    public Boolean f7922f0;

    /* renamed from: g, reason: collision with root package name */
    public k0 f7923g;

    /* renamed from: g0, reason: collision with root package name */
    public u0 f7924g0;

    /* renamed from: h, reason: collision with root package name */
    public String f7925h;

    /* renamed from: h0, reason: collision with root package name */
    public boolean f7926h0;

    /* renamed from: i, reason: collision with root package name */
    public String f7927i;

    /* renamed from: i0, reason: collision with root package name */
    public Integer f7928i0;

    /* renamed from: j, reason: collision with root package name */
    public String f7929j;

    /* renamed from: j0, reason: collision with root package name */
    public Long f7930j0;

    /* renamed from: k, reason: collision with root package name */
    public String f7931k;

    /* renamed from: k0, reason: collision with root package name */
    public Boolean f7932k0;

    /* renamed from: l, reason: collision with root package name */
    public String f7933l;

    /* renamed from: l0, reason: collision with root package name */
    public String f7934l0;

    /* renamed from: m, reason: collision with root package name */
    public String f7935m;
    public String n;
    public zb o;

    /* renamed from: p, reason: collision with root package name */
    public ca f7936p;

    /* renamed from: q, reason: collision with root package name */
    public Boolean f7937q;

    /* renamed from: r, reason: collision with root package name */
    public Boolean f7938r;

    /* renamed from: s, reason: collision with root package name */
    public String f7939s;

    /* renamed from: t, reason: collision with root package name */
    public boolean f7940t;

    /* renamed from: u, reason: collision with root package name */
    public int f7941u;
    public String v;

    /* renamed from: w, reason: collision with root package name */
    public String f7942w;

    /* renamed from: x, reason: collision with root package name */
    public String f7943x;

    /* renamed from: y, reason: collision with root package name */
    public String f7944y;
    public String z;

    static {
        ArrayList arrayList = new ArrayList();
        int i4 = Build.VERSION.SDK_INT;
        if (i4 >= 28) {
            arrayList.add(23);
        }
        if (i4 >= 26) {
            arrayList.add(22);
        }
        arrayList.add(3);
        arrayList.add(4);
        arrayList.add(7);
        arrayList.add(8);
        f7885m0 = Collections.unmodifiableCollection(arrayList);
    }

    public y1(int i4) {
        new HashMap();
        this.f7915c = "5.3.0";
        this.f7917d = new TreeMap();
        this.f7896K = ConstantDeviceInfo.APP_PLATFORM;
        this.f7900P = 3;
        this.f7910Z = i4;
    }

    public Set a() {
        return Collections.EMPTY_SET;
    }

    public boolean b() {
        return false;
    }

    public final void c(Context context) {
        if (this.f7913b == null) {
            q0 q0Var = (q0) com.startapp.sdk.components.a.a(context).f6572m.a();
            String str = q0Var.f7468c;
            if (str == null) {
                synchronized (q0Var.f7466a) {
                    try {
                        str = q0Var.f7468c;
                        if (str == null) {
                            str = q0Var.f7467b.getString("c88d4eab540fab77", null);
                        }
                    } finally {
                    }
                }
            }
            this.f7911a = str;
            this.f7913b = q0Var.a();
        }
        this.f7925h = context.getPackageName();
    }

    public final void d(Context context) {
        int i4;
        e6 e6Var;
        this.f7939s = rd.a(context);
        String str = ((vh) com.startapp.sdk.components.a.a(context).f6566g.a()).f7767h;
        this.f7893H = str;
        this.v = str;
        try {
            e6Var = ((f6) com.startapp.sdk.components.a.a(context).f6577t.a()).f6899e;
        } catch (Throwable th) {
            if (!si.a(th, RemoteException.class)) {
                d9.a(th);
            }
        }
        if (e6Var != null) {
            i4 = e6Var.a();
            this.f7941u = i4;
        }
        i4 = -1;
        this.f7941u = i4;
    }

    public final void e(Context context) {
        jh jhVar = (jh) ((mh) com.startapp.sdk.components.a.a(context).f6565f.a()).b();
        Object opt = jhVar.f7161a.opt(String.valueOf(7));
        if ((opt instanceof Number ? ((Number) opt).intValue() : 0) == 5) {
            this.f7942w = jhVar.a(8);
            this.f7943x = jhVar.a(9);
            this.f7944y = jhVar.a(15);
            this.z = jhVar.a(16);
        }
        Object opt2 = jhVar.f7161a.opt(String.valueOf(10));
        int intValue = opt2 instanceof Number ? ((Number) opt2).intValue() : 0;
        if (intValue != 0 && intValue != 2) {
            this.f7886A = jhVar.a(11);
            this.f7887B = jhVar.a(12);
        }
        this.f7888C = jhVar.a(4);
        this.f7889D = jhVar.a(3);
        this.f7890E = jhVar.a(5);
        this.f7891F = jhVar.a(1);
        this.f7892G = jhVar.a(2);
        this.f7894I = jhVar.a(13);
        Object opt3 = jhVar.f7161a.opt(String.valueOf(14));
        this.f7940t = (opt3 instanceof Number ? ((Number) opt3).intValue() : 0) == 1;
    }

    public final void f(Context context) {
        com.startapp.sdk.components.a a3 = com.startapp.sdk.components.a.a(context);
        g6 g6Var = (g6) a3.f6569j.a();
        if (g6Var.b()) {
            int hashCode = ((com.startapp.sdk.common.advertisingid.b) g6Var.f6974c.a()).a().f7169a.hashCode();
            if (!((sf) g6Var.f6973b.a()).contains("advIdHash") || ((sf) g6Var.f6973b.a()).getInt("advIdHash", 0) != hashCode) {
                rf edit = ((sf) g6Var.f6973b.a()).edit();
                if (edit.f7533b.containsKey("consentType")) {
                    edit.f7535d = true;
                }
                edit.f7532a.remove("consentType");
                if (edit.f7533b.containsKey("consentTimestamp")) {
                    edit.f7535d = true;
                }
                edit.f7532a.remove("consentTimestamp");
                edit.a("advIdHash", Integer.valueOf(hashCode));
                edit.f7532a.putInt("advIdHash", hashCode);
                edit.apply();
            }
        }
        this.f7928i0 = (g6Var.b() && ((sf) g6Var.f6973b.a()).contains("consentType")) ? Integer.valueOf(((sf) g6Var.f6973b.a()).getInt("consentType", -1)) : null;
        this.f7930j0 = (g6Var.b() && ((sf) g6Var.f6973b.a()).contains("consentTimestamp")) ? Long.valueOf(((sf) g6Var.f6973b.a()).getLong("consentTimestamp", 0L)) : null;
        this.f7932k0 = (g6Var.b() && ((sf) g6Var.f6973b.a()).contains("consentApc")) ? Boolean.valueOf(((sf) g6Var.f6973b.a()).getBoolean("consentApc", false)) : null;
        this.f7934l0 = ((sf) a3.f6548H.a()).getString("IABTCF_TCString", null);
    }

    public final void a(Context context) {
        if (MetaData.E().s()) {
            return;
        }
        this.f7923g = ((com.startapp.sdk.common.advertisingid.b) com.startapp.sdk.components.a.a(context).f6567h.a()).a();
        try {
            this.f7929j = ((fa) com.startapp.sdk.components.a.a(context).f6570k.a()).a();
        } catch (Throwable th) {
            d9.a(th);
        }
        try {
            this.f7919e = ((sf) com.startapp.sdk.components.a.a(context).f6549I.a()).getAll();
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
        boolean z4;
        Resources resources;
        String string;
        DisplayMetrics displayMetrics;
        NetworkInfo activeNetworkInfo;
        this.f7901Q = mg.f7288d.f7289a;
        this.f7935m = Build.MANUFACTURER;
        this.f7933l = Build.MODEL;
        this.n = Integer.toString(Build.VERSION.SDK_INT);
        if (adPreferences != null) {
            this.f7921f = adPreferences.getAge(context);
        }
        this.f7927i = ((xg) ((yg) com.startapp.sdk.components.a.a(context).o.a()).b()).f7882a;
        int i4 = p0.f7428a;
        boolean z5 = false;
        try {
            str = context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionName;
        } catch (Throwable unused) {
            str = null;
        }
        this.f7902R = str;
        this.f7903S = p0.a(context);
        try {
            z = true;
        } catch (Throwable unused2) {
        }
        this.f7905U = z4;
        try {
            z5 = u6.a(context);
        } catch (Throwable unused3) {
        }
        this.f7906V = z5;
        ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
        this.f7938r = (connectivityManager == null && p0.a(context, "android.permission.ACCESS_NETWORK_STATE") && (activeNetworkInfo = connectivityManager.getActiveNetworkInfo()) != null && activeNetworkInfo.isConnected()) ? Boolean.valueOf(activeNetworkInfo.isRoaming()) : null;
        this.f7907W = si.d(context);
        this.f7926h0 = si.e(context);
        resources = context.getResources();
        if (resources != null && (displayMetrics = resources.getDisplayMetrics()) != null) {
            this.L = displayMetrics.widthPixels;
            this.f7897M = displayMetrics.heightPixels;
            this.f7898N = displayMetrics.density;
        }
        com.startapp.sdk.components.a a3 = com.startapp.sdk.components.a.a(context);
        this.o = (zb) ((ac) a3.f6563d.a()).b();
        this.f7936p = (ca) ((ea) a3.f6564e.a()).b();
        sf sfVar = (sf) a3.f6547G.a();
        this.f7908X = sfVar.getString("USER_CONSENT_PERSONALIZED_ADS_SERVING", null);
        TreeMap treeMap = this.f7917d;
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
        this.f7899O = Boolean.valueOf(si.c(context));
        this.f7899O = Boolean.valueOf(si.c(context));
        this.f7906V = z5;
        ConnectivityManager connectivityManager2 = (ConnectivityManager) context.getSystemService("connectivity");
        this.f7938r = (connectivityManager2 == null && p0.a(context, "android.permission.ACCESS_NETWORK_STATE") && (activeNetworkInfo = connectivityManager2.getActiveNetworkInfo()) != null && activeNetworkInfo.isConnected()) ? Boolean.valueOf(activeNetworkInfo.isRoaming()) : null;
        this.f7907W = si.d(context);
        this.f7926h0 = si.e(context);
        resources = context.getResources();
        if (resources != null) {
            this.L = displayMetrics.widthPixels;
            this.f7897M = displayMetrics.heightPixels;
            this.f7898N = displayMetrics.density;
        }
        com.startapp.sdk.components.a a32 = com.startapp.sdk.components.a.a(context);
        this.o = (zb) ((ac) a32.f6563d.a()).b();
        this.f7936p = (ca) ((ea) a32.f6564e.a()).b();
        sf sfVar2 = (sf) a32.f6547G.a();
        this.f7908X = sfVar2.getString("USER_CONSENT_PERSONALIZED_ADS_SERVING", null);
        TreeMap treeMap2 = this.f7917d;
        string = sfVar2.getString("sharedPrefsWrappers", null);
        if (string != null) {
        }
        this.f7899O = Boolean.valueOf(si.c(context));
        z = false;
        this.f7937q = Boolean.valueOf(z);
        this.f7904T = p0.b(context);
        try {
            z4 = we.a(context);
        } catch (Throwable unused5) {
            z4 = false;
        }
        this.f7905U = z4;
        z5 = u6.a(context);
        this.f7906V = z5;
        ConnectivityManager connectivityManager22 = (ConnectivityManager) context.getSystemService("connectivity");
        this.f7938r = (connectivityManager22 == null && p0.a(context, "android.permission.ACCESS_NETWORK_STATE") && (activeNetworkInfo = connectivityManager22.getActiveNetworkInfo()) != null && activeNetworkInfo.isConnected()) ? Boolean.valueOf(activeNetworkInfo.isRoaming()) : null;
        this.f7907W = si.d(context);
        this.f7926h0 = si.e(context);
        resources = context.getResources();
        if (resources != null) {
        }
        com.startapp.sdk.components.a a322 = com.startapp.sdk.components.a.a(context);
        this.o = (zb) ((ac) a322.f6563d.a()).b();
        this.f7936p = (ca) ((ea) a322.f6564e.a()).b();
        sf sfVar22 = (sf) a322.f6547G.a();
        this.f7908X = sfVar22.getString("USER_CONSENT_PERSONALIZED_ADS_SERVING", null);
        TreeMap treeMap22 = this.f7917d;
        string = sfVar22.getString("sharedPrefsWrappers", null);
        if (string != null) {
        }
        this.f7899O = Boolean.valueOf(si.c(context));
    }

    public final void a(Context context, AdPreferences adPreferences) {
        try {
            this.f7924g0 = (u0) com.startapp.sdk.components.a.a(context).f6556Q.a();
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
            this.f7931k = ng.a(context);
        } catch (Throwable th4) {
            d9.a(th4);
        }
        try {
            this.f7895J = ((ef) com.startapp.sdk.components.a.a(context).f6568i.a()).a(this);
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
        byte[] bytes = ebVar.f6851b.toString().getBytes();
        String str = null;
        if (z) {
            try {
                WeakHashMap weakHashMap = si.f7575a;
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(byteArrayOutputStream);
                gZIPOutputStream.write(bytes);
                gZIPOutputStream.flush();
                gZIPOutputStream.close();
                bytes = byteArrayOutputStream.toByteArray();
                str = "gzip";
            } catch (IOException e4) {
                d9.a(e4);
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
        return AbstractC0005f.z(str, mdVar2);
    }

    public void a(se seVar) {
        Map map = this.f7919e;
        if (map != null) {
            for (Map.Entry entry : map.entrySet()) {
                seVar.a((String) entry.getKey(), entry.getValue(), false, true);
            }
        }
        seVar.a("publisherId", this.f7911a, false, true);
        seVar.a("productId", this.f7913b, b(), true);
        seVar.a("os", this.f7896K, true, true);
        seVar.a("sdkVersion", this.f7915c, false, true);
        seVar.a("flavor", 1023, false, true);
        TreeMap treeMap = this.f7917d;
        if (treeMap != null && !treeMap.isEmpty()) {
            String str = "";
            for (String str2 : this.f7917d.keySet()) {
                StringBuilder sb = new StringBuilder();
                sb.append(str);
                sb.append(str2);
                sb.append(StringUtils.PROCESS_POSTFIX_DELIMITER);
                str = AbstractC0005f.q(sb, (String) this.f7917d.get(str2), ";");
            }
            seVar.a("frameworksData", str.substring(0, str.length() - 1), false, false);
        }
        seVar.a("packageId", this.f7925h, false, true);
        seVar.a("installerPkg", this.f7927i, false, true);
        seVar.a("age", this.f7921f, false, true);
        k0 k0Var = this.f7923g;
        if (k0Var != null) {
            seVar.a("userAdvertisingId", k0Var.f7169a, false, true);
            boolean z = this.f7923g.f7171c;
            if (z) {
                seVar.a("limat", Boolean.valueOf(z), false, true);
            }
            seVar.a("advertisingIdSource", this.f7923g.f7170b, false, true);
        }
        String str3 = this.f7929j;
        if (str3 != null) {
            seVar.a("duid", str3, false, true);
        }
        String str4 = this.f7931k;
        if (str4 != null) {
            seVar.a("vendorId", str4, false, true);
        }
        seVar.a(CommonUrlParts.MODEL, this.f7933l, false, true);
        seVar.a(CommonUrlParts.MANUFACTURER, this.f7935m, false, true);
        seVar.a("deviceVersion", this.n, false, true);
        zb zbVar = this.o;
        if (zbVar != null) {
            seVar.a(CommonUrlParts.LOCALE, zbVar.f8032a, false, true);
            int i4 = this.f7910Z;
            if (i4 == 4 || i4 == 2) {
                seVar.a("localeList", this.o.f8033b, false, true);
            }
        }
        int i5 = this.f7910Z;
        if (i5 == 4 || i5 == 2) {
            seVar.a("inputLangs", this.f7936p, false, true);
        }
        seVar.a("isp", this.f7942w, false, true);
        seVar.a("ispName", this.f7943x, false, true);
        seVar.a("ispCarrId", this.f7944y, false, true);
        seVar.a("ispCarrIdName", this.z, false, true);
        seVar.a("netOper", this.f7886A, false, true);
        seVar.a("networkOperName", this.f7887B, false, true);
        seVar.a("cid", this.f7888C, false, true);
        seVar.a("lac", this.f7889D, false, true);
        seVar.a("tac", this.f7890E, false, true);
        seVar.a("blat", this.f7891F, false, true);
        seVar.a("blon", this.f7892G, false, true);
        seVar.a("subPublisherId", null, false, true);
        seVar.a("subProductId", null, false, true);
        seVar.a("retryCount", null, false, true);
        seVar.a("roaming", this.f7938r, false, true);
        seVar.a("grid", this.f7939s, false, true);
        if (this.f7940t) {
            seVar.a("c5g", "1", false, false);
        }
        int i6 = this.f7941u;
        if (i6 >= 0) {
            seVar.a("transport", String.valueOf(i6), false, false);
        }
        if (this.f7926h0) {
            seVar.a("tv", Boolean.TRUE, false, false);
        }
        seVar.a("silev", this.v, false, true);
        seVar.a("cellSignalLevel", this.f7893H, false, true);
        seVar.a("cellTimingAdv", this.f7894I, false, true);
        seVar.a("outsource", this.f7937q, false, true);
        seVar.a("width", String.valueOf(this.L), false, true);
        seVar.a("height", String.valueOf(this.f7897M), false, true);
        seVar.a("density", String.valueOf(this.f7898N), false, true);
        seVar.a("fgApp", this.f7899O, false, true);
        seVar.a("sdkId", String.valueOf(this.f7900P), true, true);
        seVar.a("clientSessionId", this.f7901Q, false, true);
        seVar.a("appVersion", this.f7902R, false, true);
        seVar.a("appCode", Integer.valueOf(this.f7903S), false, true);
        seVar.a("timeSinceBoot", Long.valueOf(SystemClock.elapsedRealtime()), false, true);
        seVar.a("udbg", Boolean.valueOf(this.f7904T), false, true);
        seVar.a("root", Boolean.valueOf(this.f7905U), false, true);
        seVar.a("smltr", Boolean.valueOf(this.f7906V), false, true);
        seVar.a("isddbg", Boolean.valueOf(this.f7907W), false, true);
        seVar.a("pas", this.f7908X, false, true);
        seVar.a("prm", this.f7909Y, false, false);
        seVar.a("free", this.f7912a0, false, false);
        seVar.a("chr", this.f7916c0, false, false);
        seVar.a("blp", this.f7914b0, false, false);
        seVar.a("hs", this.f7918d0, false, false);
        seVar.a("lpm", this.f7920e0, false, false);
        seVar.a("dm", this.f7922f0, false, false);
        seVar.a("ct", this.f7928i0, false, true);
        seVar.a("tsc", this.f7930j0, false, true);
        seVar.a("apc", this.f7932k0, false, true);
        seVar.a("IABTCF_TCString", this.f7934l0, false, true);
        u0 u0Var = this.f7924g0;
        if (u0Var != null) {
            long j4 = 0;
            if (u0Var.f7640d > 0) {
                u0Var.f7637a.getClass();
                j4 = SystemClock.elapsedRealtime() - u0Var.f7640d;
            }
            seVar.a("appSessionDuration", Long.valueOf(j4 / 1000), false, false);
        }
        seVar.a("rsc", this.f7895J, false, true);
    }

    public final void b(Context context) {
        boolean z;
        try {
            this.f7912a0 = Long.valueOf(new StatFs(Environment.getRootDirectory().getAbsolutePath()).getFreeBytes());
        } catch (Throwable th) {
            d9.a(th);
        }
        boolean z4 = true;
        try {
            this.f7916c0 = null;
            this.f7914b0 = null;
            Intent registerReceiver = context.registerReceiver(null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
            if (registerReceiver != null) {
                if (registerReceiver.hasExtra("status")) {
                    int intExtra = registerReceiver.getIntExtra("status", -1);
                    if (intExtra != 2 && intExtra != 5) {
                        z = false;
                        this.f7916c0 = Boolean.valueOf(z);
                    }
                    z = true;
                    this.f7916c0 = Boolean.valueOf(z);
                }
                if (registerReceiver.hasExtra("level") && registerReceiver.hasExtra("scale")) {
                    int intExtra2 = registerReceiver.getIntExtra("level", -1);
                    int intExtra3 = registerReceiver.getIntExtra("scale", -1);
                    if (intExtra2 >= 0 && intExtra3 > 0) {
                        this.f7914b0 = Integer.valueOf((intExtra2 * 100) / intExtra3);
                    }
                }
            }
        } catch (Throwable th2) {
            d9.a(th2);
        }
        try {
            this.f7918d0 = null;
            Object systemService = context.getSystemService("audio");
            if (systemService instanceof AudioManager) {
                AudioDeviceInfo[] devices = ((AudioManager) systemService).getDevices(2);
                if (devices != null) {
                    for (AudioDeviceInfo audioDeviceInfo : devices) {
                        if (audioDeviceInfo != null && f7885m0.contains(Integer.valueOf(audioDeviceInfo.getType()))) {
                            break;
                        }
                    }
                }
                z4 = false;
                this.f7918d0 = Boolean.valueOf(z4);
            }
        } catch (Throwable th3) {
            d9.a(th3);
        }
        try {
            this.f7920e0 = null;
            Object systemService2 = context.getSystemService("power");
            if (systemService2 instanceof PowerManager) {
                this.f7920e0 = Boolean.valueOf(((PowerManager) systemService2).isPowerSaveMode());
            }
        } catch (Throwable th4) {
            d9.a(th4);
        }
        try {
            this.f7922f0 = null;
            int i4 = context.getResources().getConfiguration().uiMode & 48;
            if (i4 == 32) {
                this.f7922f0 = Boolean.TRUE;
            } else if (i4 == 16) {
                this.f7922f0 = Boolean.FALSE;
            }
        } catch (Throwable th5) {
            d9.a(th5);
        }
    }
}
