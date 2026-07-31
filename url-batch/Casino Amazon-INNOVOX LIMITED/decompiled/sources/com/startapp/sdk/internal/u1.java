package com.startapp.sdk.internal;

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
import androidx.core.app.NotificationCompat;
import com.facebook.react.uimanager.ViewProps;
import com.startapp.sdk.adsbase.model.AdPreferences;
import com.startapp.sdk.adsbase.remoteconfig.MetaData;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
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

/* compiled from: Sta */
/* loaded from: classes3.dex */
public abstract class u1 {
    public static final Collection m0;
    public String A;
    public String B;
    public String C;
    public String D;
    public String E;
    public String F;
    public String G;
    public String H;
    public String I;
    public String J;
    public final String K;
    public int L;
    public int M;
    public float N;
    public Boolean O;
    public final int P;
    public String Q;
    public String R;
    public int S;
    public boolean T;
    public boolean U;
    public boolean V;
    public boolean W;
    public String X;
    public String Y;
    public final int Z;

    /* renamed from: a, reason: collision with root package name */
    public String f446a;
    public Long a0;
    public String b;
    public Integer b0;
    public String c;
    public Boolean c0;
    public final TreeMap d;
    public Boolean d0;
    public Map e;
    public Boolean e0;
    public String f;
    public Boolean f0;
    public h0 g;
    public r0 g0;
    public String h;
    public boolean h0;
    public String i;
    public Integer i0;
    public String j;
    public Long j0;
    public String k;
    public Boolean k0;
    public String l;
    public String l0;
    public String m;
    public String n;
    public gb o;
    public j9 p;
    public Boolean q;
    public Boolean r;
    public String s;
    public boolean t;
    public int u;
    public String v;
    public String w;
    public String x;
    public String y;
    public String z;

    static {
        ArrayList arrayList = new ArrayList();
        int i = Build.VERSION.SDK_INT;
        if (i >= 28) {
            arrayList.add(23);
        }
        if (i >= 26) {
            arrayList.add(22);
        }
        arrayList.add(3);
        arrayList.add(4);
        arrayList.add(7);
        arrayList.add(8);
        m0 = Collections.unmodifiableCollection(arrayList);
    }

    public u1(int i) {
        new HashMap();
        this.c = "5.3.2";
        this.d = new TreeMap();
        this.K = "android";
        this.P = 3;
        this.Z = i;
    }

    public Set a() {
        return Collections.EMPTY_SET;
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
        this.Q = vf.d.f470a;
        this.m = Build.MANUFACTURER;
        this.l = Build.MODEL;
        this.n = Integer.toString(Build.VERSION.SDK_INT);
        if (adPreferences != null) {
            this.f = adPreferences.getAge(context);
        }
        this.i = ((gg) ((hg) com.startapp.sdk.components.a.a(context).n.a()).b()).f253a;
        int i = m0.f327a;
        boolean z3 = false;
        try {
            str = context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionName;
        } catch (Throwable unused) {
            str = null;
        }
        this.R = str;
        this.S = m0.a(context);
        try {
            z = true;
        } catch (Throwable unused2) {
        }
        this.U = z2;
        try {
            z3 = t6.a(context);
        } catch (Throwable unused3) {
        }
        this.V = z3;
        ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
        this.r = (connectivityManager == null && m0.a(context, "android.permission.ACCESS_NETWORK_STATE") && (activeNetworkInfo = connectivityManager.getActiveNetworkInfo()) != null && activeNetworkInfo.isConnected()) ? Boolean.valueOf(activeNetworkInfo.isRoaming()) : null;
        this.W = zh.d(context);
        this.h0 = zh.e(context);
        resources = context.getResources();
        if (resources != null && (displayMetrics = resources.getDisplayMetrics()) != null) {
            this.L = displayMetrics.widthPixels;
            this.M = displayMetrics.heightPixels;
            this.N = displayMetrics.density;
        }
        com.startapp.sdk.components.a a2 = com.startapp.sdk.components.a.a(context);
        this.o = (gb) ((hb) a2.c.a()).b();
        this.p = (j9) ((l9) a2.d.a()).b();
        af afVar = (af) a2.G.a();
        this.X = afVar.getString("USER_CONSENT_PERSONALIZED_ADS_SERVING", null);
        TreeMap treeMap = this.d;
        string = afVar.getString("sharedPrefsWrappers", null);
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
        this.O = Boolean.valueOf(zh.c(context));
        this.O = Boolean.valueOf(zh.c(context));
        this.V = z3;
        ConnectivityManager connectivityManager2 = (ConnectivityManager) context.getSystemService("connectivity");
        this.r = (connectivityManager2 == null && m0.a(context, "android.permission.ACCESS_NETWORK_STATE") && (activeNetworkInfo = connectivityManager2.getActiveNetworkInfo()) != null && activeNetworkInfo.isConnected()) ? Boolean.valueOf(activeNetworkInfo.isRoaming()) : null;
        this.W = zh.d(context);
        this.h0 = zh.e(context);
        resources = context.getResources();
        if (resources != null) {
            this.L = displayMetrics.widthPixels;
            this.M = displayMetrics.heightPixels;
            this.N = displayMetrics.density;
        }
        com.startapp.sdk.components.a a22 = com.startapp.sdk.components.a.a(context);
        this.o = (gb) ((hb) a22.c.a()).b();
        this.p = (j9) ((l9) a22.d.a()).b();
        af afVar2 = (af) a22.G.a();
        this.X = afVar2.getString("USER_CONSENT_PERSONALIZED_ADS_SERVING", null);
        TreeMap treeMap2 = this.d;
        string = afVar2.getString("sharedPrefsWrappers", null);
        if (string != null) {
        }
        this.O = Boolean.valueOf(zh.c(context));
        z = false;
        this.q = Boolean.valueOf(z);
        this.T = m0.b(context);
        try {
            z2 = fe.a(context);
        } catch (Throwable unused5) {
            z2 = false;
        }
        this.U = z2;
        z3 = t6.a(context);
        this.V = z3;
        ConnectivityManager connectivityManager22 = (ConnectivityManager) context.getSystemService("connectivity");
        this.r = (connectivityManager22 == null && m0.a(context, "android.permission.ACCESS_NETWORK_STATE") && (activeNetworkInfo = connectivityManager22.getActiveNetworkInfo()) != null && activeNetworkInfo.isConnected()) ? Boolean.valueOf(activeNetworkInfo.isRoaming()) : null;
        this.W = zh.d(context);
        this.h0 = zh.e(context);
        resources = context.getResources();
        if (resources != null) {
        }
        com.startapp.sdk.components.a a222 = com.startapp.sdk.components.a.a(context);
        this.o = (gb) ((hb) a222.c.a()).b();
        this.p = (j9) ((l9) a222.d.a()).b();
        af afVar22 = (af) a222.G.a();
        this.X = afVar22.getString("USER_CONSENT_PERSONALIZED_ADS_SERVING", null);
        TreeMap treeMap22 = this.d;
        string = afVar22.getString("sharedPrefsWrappers", null);
        if (string != null) {
        }
        this.O = Boolean.valueOf(zh.c(context));
    }

    public boolean b() {
        return false;
    }

    public final void c(Context context) {
        if (this.b == null) {
            n0 n0Var = (n0) com.startapp.sdk.components.a.a(context).l.a();
            String str = n0Var.c;
            if (str == null) {
                synchronized (n0Var.f343a) {
                    str = n0Var.c;
                    if (str == null) {
                        str = n0Var.b.getString("c88d4eab540fab77", null);
                    }
                }
            }
            this.f446a = str;
            this.b = n0Var.a();
        }
        this.h = context.getPackageName();
    }

    public final void d(Context context) {
        int i;
        v5 v5Var;
        this.s = dd.a(context);
        String str = ((eh) com.startapp.sdk.components.a.a(context).f.a()).h;
        this.H = str;
        this.v = str;
        try {
            v5Var = ((w5) com.startapp.sdk.components.a.a(context).t.a()).e;
        } catch (Throwable th) {
            if (!zh.a(th, RemoteException.class)) {
                n8.a(th);
            }
        }
        if (v5Var != null) {
            i = v5Var.a();
            this.u = i;
        }
        i = -1;
        this.u = i;
    }

    public final void e(Context context) {
        sg sgVar = (sg) ((vg) com.startapp.sdk.components.a.a(context).e.a()).b();
        Object opt = sgVar.f425a.opt(String.valueOf(7));
        if ((opt instanceof Number ? ((Number) opt).intValue() : 0) == 5) {
            this.w = sgVar.a(8);
            this.x = sgVar.a(9);
            this.y = sgVar.a(15);
            this.z = sgVar.a(16);
        }
        Object opt2 = sgVar.f425a.opt(String.valueOf(10));
        int intValue = opt2 instanceof Number ? ((Number) opt2).intValue() : 0;
        if (intValue != 0 && intValue != 2) {
            this.A = sgVar.a(11);
            this.B = sgVar.a(12);
        }
        this.C = sgVar.a(4);
        this.D = sgVar.a(3);
        this.E = sgVar.a(5);
        this.F = sgVar.a(1);
        this.G = sgVar.a(2);
        this.I = sgVar.a(13);
        Object opt3 = sgVar.f425a.opt(String.valueOf(14));
        this.t = (opt3 instanceof Number ? ((Number) opt3).intValue() : 0) == 1;
    }

    public final void f(Context context) {
        com.startapp.sdk.components.a a2 = com.startapp.sdk.components.a.a(context);
        x5 x5Var = (x5) a2.i.a();
        if (x5Var.c()) {
            int hashCode = ((com.startapp.sdk.common.advertisingid.b) x5Var.c.a()).a().f255a.hashCode();
            if (!((af) x5Var.b.a()).contains("advIdHash") || ((af) x5Var.b.a()).getInt("advIdHash", 0) != hashCode) {
                ze edit = ((af) x5Var.b.a()).edit();
                if (edit.b.containsKey("consentType")) {
                    edit.d = true;
                }
                edit.f526a.remove("consentType");
                if (edit.b.containsKey("consentTimestamp")) {
                    edit.d = true;
                }
                edit.f526a.remove("consentTimestamp");
                edit.putInt("advIdHash", hashCode).apply();
            }
        }
        this.i0 = (x5Var.c() && ((af) x5Var.b.a()).contains("consentType")) ? Integer.valueOf(((af) x5Var.b.a()).getInt("consentType", -1)) : null;
        this.j0 = (x5Var.c() && ((af) x5Var.b.a()).contains("consentTimestamp")) ? Long.valueOf(((af) x5Var.b.a()).getLong("consentTimestamp", 0L)) : null;
        this.k0 = (x5Var.c() && ((af) x5Var.b.a()).contains("consentApc")) ? Boolean.valueOf(((af) x5Var.b.a()).getBoolean("consentApc", false)) : null;
        this.l0 = ((af) a2.H.a()).getString("IABTCF_TCString", null);
    }

    public final void a(Context context) {
        if (MetaData.A().r()) {
            return;
        }
        this.g = ((com.startapp.sdk.common.advertisingid.b) com.startapp.sdk.components.a.a(context).g.a()).a();
        try {
            this.j = ((m9) com.startapp.sdk.components.a.a(context).j.a()).a();
        } catch (Throwable th) {
            n8.a(th);
        }
        try {
            this.e = ((af) com.startapp.sdk.components.a.a(context).I.a()).getAll();
        } catch (Throwable th2) {
            n8.a(th2);
        }
    }

    public final void a(Context context, AdPreferences adPreferences) {
        try {
            this.g0 = (r0) com.startapp.sdk.components.a.a(context).P.a();
        } catch (Throwable th) {
            n8.a(th);
        }
        c(context);
        try {
            b(context, adPreferences);
        } catch (Throwable unused) {
        }
        try {
            d(context);
        } catch (Throwable th2) {
            n8.a(th2);
        }
        try {
            e(context);
        } catch (Throwable th3) {
            n8.a(th3);
        }
        try {
            this.k = wf.a(context);
        } catch (Throwable th4) {
            n8.a(th4);
        }
        try {
            this.J = ((me) com.startapp.sdk.components.a.a(context).h.a()).a(this);
        } catch (Throwable th5) {
            n8.a(th5);
        }
        try {
            a(context);
        } catch (Throwable th6) {
            n8.a(th6);
        }
        try {
            b(context);
        } catch (Throwable th7) {
            n8.a(th7);
        }
        try {
            f(context);
        } catch (Throwable th8) {
            n8.a(th8);
        }
    }

    public final b8 a(boolean z) {
        la laVar = new la(a());
        a(laVar);
        byte[] bytes = laVar.b.toString().getBytes();
        String str = null;
        if (z) {
            try {
                WeakHashMap weakHashMap = zh.f528a;
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(byteArrayOutputStream);
                gZIPOutputStream.write(bytes);
                gZIPOutputStream.flush();
                gZIPOutputStream.close();
                bytes = byteArrayOutputStream.toByteArray();
                str = "gzip";
            } catch (IOException e) {
                n8.a(e);
            }
        }
        return new b8(bytes, "application/json", str);
    }

    public final void b(Context context) {
        boolean z;
        try {
            this.a0 = Long.valueOf(new StatFs(Environment.getRootDirectory().getAbsolutePath()).getFreeBytes());
        } catch (Throwable th) {
            n8.a(th);
        }
        boolean z2 = true;
        try {
            this.c0 = null;
            this.b0 = null;
            Intent registerReceiver = context.registerReceiver(null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
            if (registerReceiver != null) {
                if (registerReceiver.hasExtra(NotificationCompat.CATEGORY_STATUS)) {
                    int intExtra = registerReceiver.getIntExtra(NotificationCompat.CATEGORY_STATUS, -1);
                    if (intExtra != 2 && intExtra != 5) {
                        z = false;
                        this.c0 = Boolean.valueOf(z);
                    }
                    z = true;
                    this.c0 = Boolean.valueOf(z);
                }
                if (registerReceiver.hasExtra("level") && registerReceiver.hasExtra("scale")) {
                    int intExtra2 = registerReceiver.getIntExtra("level", -1);
                    int intExtra3 = registerReceiver.getIntExtra("scale", -1);
                    if (intExtra2 >= 0 && intExtra3 > 0) {
                        this.b0 = Integer.valueOf((intExtra2 * 100) / intExtra3);
                    }
                }
            }
        } catch (Throwable th2) {
            n8.a(th2);
        }
        try {
            this.d0 = null;
            Object systemService = context.getSystemService("audio");
            if (systemService instanceof AudioManager) {
                AudioDeviceInfo[] devices = ((AudioManager) systemService).getDevices(2);
                if (devices != null) {
                    for (AudioDeviceInfo audioDeviceInfo : devices) {
                        if (audioDeviceInfo != null && m0.contains(Integer.valueOf(audioDeviceInfo.getType()))) {
                            break;
                        }
                    }
                }
                z2 = false;
                this.d0 = Boolean.valueOf(z2);
            }
        } catch (Throwable th3) {
            n8.a(th3);
        }
        try {
            this.e0 = null;
            Object systemService2 = context.getSystemService("power");
            if (systemService2 instanceof PowerManager) {
                this.e0 = Boolean.valueOf(((PowerManager) systemService2).isPowerSaveMode());
            }
        } catch (Throwable th4) {
            n8.a(th4);
        }
        try {
            this.f0 = null;
            int i = context.getResources().getConfiguration().uiMode & 48;
            if (i == 32) {
                this.f0 = Boolean.TRUE;
            } else if (i == 16) {
                this.f0 = Boolean.FALSE;
            }
        } catch (Throwable th5) {
            n8.a(th5);
        }
    }

    public final String a(String str) {
        uc ucVar = new uc(a());
        a(ucVar);
        String ucVar2 = ucVar.toString();
        if (str.contains("?") && ucVar2.startsWith("?")) {
            return str + "&" + ucVar2.substring(1);
        }
        return str + ucVar2;
    }

    public void a(be beVar) {
        Map map = this.e;
        if (map != null) {
            for (Map.Entry entry : map.entrySet()) {
                beVar.a((String) entry.getKey(), entry.getValue(), false, true);
            }
        }
        beVar.a("publisherId", this.f446a, false, true);
        beVar.a("productId", this.b, b(), true);
        beVar.a("os", this.K, true, true);
        beVar.a("sdkVersion", this.c, false, true);
        beVar.a("flavor", 1023, false, true);
        TreeMap treeMap = this.d;
        if (treeMap != null && !treeMap.isEmpty()) {
            String str = "";
            for (String str2 : this.d.keySet()) {
                str = str + str2 + StringUtils.PROCESS_POSTFIX_DELIMITER + ((String) this.d.get(str2)) + ";";
            }
            beVar.a("frameworksData", str.substring(0, str.length() - 1), false, false);
        }
        beVar.a("packageId", this.h, false, true);
        beVar.a("installerPkg", this.i, false, true);
        beVar.a("age", this.f, false, true);
        h0 h0Var = this.g;
        if (h0Var != null) {
            beVar.a("userAdvertisingId", h0Var.f255a, false, true);
            boolean z = this.g.c;
            if (z) {
                beVar.a("limat", Boolean.valueOf(z), false, true);
            }
            beVar.a("advertisingIdSource", this.g.b, false, true);
        }
        String str3 = this.j;
        if (str3 != null) {
            beVar.a("duid", str3, false, true);
        }
        String str4 = this.k;
        if (str4 != null) {
            beVar.a("vendorId", str4, false, true);
        }
        beVar.a(CommonUrlParts.MODEL, this.l, false, true);
        beVar.a(CommonUrlParts.MANUFACTURER, this.m, false, true);
        beVar.a("deviceVersion", this.n, false, true);
        gb gbVar = this.o;
        if (gbVar != null) {
            beVar.a("locale", gbVar.f251a, false, true);
            int i = this.Z;
            if (i == 4 || i == 2) {
                beVar.a("localeList", this.o.b, false, true);
            }
        }
        int i2 = this.Z;
        if (i2 == 4 || i2 == 2) {
            beVar.a("inputLangs", this.p, false, true);
        }
        beVar.a("isp", this.w, false, true);
        beVar.a("ispName", this.x, false, true);
        beVar.a("ispCarrId", this.y, false, true);
        beVar.a("ispCarrIdName", this.z, false, true);
        beVar.a("netOper", this.A, false, true);
        beVar.a("networkOperName", this.B, false, true);
        beVar.a("cid", this.C, false, true);
        beVar.a("lac", this.D, false, true);
        beVar.a("tac", this.E, false, true);
        beVar.a("blat", this.F, false, true);
        beVar.a("blon", this.G, false, true);
        beVar.a("subPublisherId", null, false, true);
        beVar.a("subProductId", null, false, true);
        beVar.a("retryCount", null, false, true);
        beVar.a("roaming", this.r, false, true);
        beVar.a("grid", this.s, false, true);
        if (this.t) {
            beVar.a("c5g", "1", false, false);
        }
        int i3 = this.u;
        if (i3 >= 0) {
            beVar.a(NotificationCompat.CATEGORY_TRANSPORT, String.valueOf(i3), false, false);
        }
        if (this.h0) {
            beVar.a("tv", Boolean.TRUE, false, false);
        }
        beVar.a("silev", this.v, false, true);
        beVar.a("cellSignalLevel", this.H, false, true);
        beVar.a("cellTimingAdv", this.I, false, true);
        beVar.a("outsource", this.q, false, true);
        beVar.a(ViewProps.WIDTH, String.valueOf(this.L), false, true);
        beVar.a(ViewProps.HEIGHT, String.valueOf(this.M), false, true);
        beVar.a("density", String.valueOf(this.N), false, true);
        beVar.a("fgApp", this.O, false, true);
        beVar.a("sdkId", String.valueOf(this.P), true, true);
        beVar.a("clientSessionId", this.Q, false, true);
        beVar.a("appVersion", this.R, false, true);
        beVar.a("appCode", Integer.valueOf(this.S), false, true);
        beVar.a("timeSinceBoot", Long.valueOf(SystemClock.elapsedRealtime()), false, true);
        beVar.a("udbg", Boolean.valueOf(this.T), false, true);
        beVar.a("root", Boolean.valueOf(this.U), false, true);
        beVar.a("smltr", Boolean.valueOf(this.V), false, true);
        beVar.a("isddbg", Boolean.valueOf(this.W), false, true);
        beVar.a("pas", this.X, false, true);
        beVar.a("prm", this.Y, false, false);
        beVar.a("free", this.a0, false, false);
        beVar.a("chr", this.c0, false, false);
        beVar.a("blp", this.b0, false, false);
        beVar.a("hs", this.d0, false, false);
        beVar.a("lpm", this.e0, false, false);
        beVar.a("dm", this.f0, false, false);
        beVar.a("ct", this.i0, false, true);
        beVar.a("tsc", this.j0, false, true);
        beVar.a("apc", this.k0, false, true);
        beVar.a("IABTCF_TCString", this.l0, false, true);
        r0 r0Var = this.g0;
        if (r0Var != null) {
            long j = 0;
            if (r0Var.d > 0) {
                r0Var.f397a.getClass();
                j = SystemClock.elapsedRealtime() - r0Var.d;
            }
            beVar.a("appSessionDuration", Long.valueOf(j / 1000), false, false);
        }
        beVar.a("rsc", this.J, false, true);
    }
}
