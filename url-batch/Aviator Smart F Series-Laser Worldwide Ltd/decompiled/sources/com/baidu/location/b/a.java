package com.baidu.location.b;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Build;
import android.text.TextUtils;
import android.util.Base64;
import com.baidu.ar.util.SystemInfoUtil;
import com.baidu.lbsapi.auth.LBSAuthManager;
import com.baidu.location.BDLocation;
import com.baidu.location.Jni;
import com.baidu.location.LocationClientOption;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public class a {

    /* renamed from: a, reason: collision with root package name */
    private static String f4433a = "BDLocConfigManager";
    public int A;
    public int B;
    public int C;
    private String D;
    private b E;
    private boolean F;
    private String G;
    private String H;
    private String I;
    private Context J;

    /* renamed from: b, reason: collision with root package name */
    private SharedPreferences f4434b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f4435c;

    /* renamed from: d, reason: collision with root package name */
    public int f4436d;

    /* renamed from: e, reason: collision with root package name */
    private long f4437e;

    /* renamed from: f, reason: collision with root package name */
    public double f4438f;

    /* renamed from: g, reason: collision with root package name */
    public int f4439g;

    /* renamed from: h, reason: collision with root package name */
    public int f4440h;

    /* renamed from: i, reason: collision with root package name */
    public double f4441i;

    /* renamed from: j, reason: collision with root package name */
    public int f4442j;

    /* renamed from: k, reason: collision with root package name */
    public int f4443k;

    /* renamed from: l, reason: collision with root package name */
    public int f4444l;

    /* renamed from: m, reason: collision with root package name */
    public int f4445m;

    /* renamed from: n, reason: collision with root package name */
    public int f4446n;

    /* renamed from: o, reason: collision with root package name */
    public int f4447o;

    /* renamed from: p, reason: collision with root package name */
    public double[] f4448p;

    /* renamed from: q, reason: collision with root package name */
    public int f4449q;

    /* renamed from: r, reason: collision with root package name */
    public int f4450r;

    /* renamed from: s, reason: collision with root package name */
    public int f4451s;

    /* renamed from: t, reason: collision with root package name */
    public int f4452t;

    /* renamed from: u, reason: collision with root package name */
    public int f4453u;

    /* renamed from: v, reason: collision with root package name */
    public float f4454v;

    /* renamed from: w, reason: collision with root package name */
    public float f4455w;

    /* renamed from: x, reason: collision with root package name */
    public int f4456x;

    /* renamed from: y, reason: collision with root package name */
    public int[] f4457y;

    /* renamed from: z, reason: collision with root package name */
    public int f4458z;

    class b extends com.baidu.location.e.g {

        /* renamed from: o, reason: collision with root package name */
        String f4459o = null;

        /* renamed from: p, reason: collision with root package name */
        boolean f4460p = false;

        public b() {
            this.f5229g = new HashMap();
        }

        @Override // com.baidu.location.e.g
        public void a() {
            this.f5226d = 2;
            String encode = Jni.encode(this.f4459o);
            this.f4459o = null;
            this.f5229g.put("qt", "conf");
            this.f5229g.put("req", encode);
        }

        public void a(String str) {
            if (this.f4460p) {
                return;
            }
            this.f4460p = true;
            this.f4459o = str;
            b(com.baidu.location.e.e.f5204c);
        }

        @Override // com.baidu.location.e.g
        public void a(boolean z7) {
            if (z7 && this.f5227e != null) {
                try {
                    new JSONObject(this.f5227e);
                    if (a.this.f4434b != null) {
                        SharedPreferences.Editor edit = a.this.f4434b.edit();
                        edit.putString(a.f4433a + "_newConfig", Base64.encodeToString(com.baidu.location.e.i.a(this.f5227e.getBytes()), 0));
                        edit.apply();
                    }
                } catch (Exception e8) {
                    e8.printStackTrace();
                }
            }
            Map<String, Object> map = this.f5229g;
            if (map != null) {
                map.clear();
            }
            this.f4460p = false;
        }
    }

    private static class c {

        /* renamed from: a, reason: collision with root package name */
        public static final a f4462a = new a();
    }

    private a() {
        this.f4434b = null;
        this.f4435c = false;
        this.f4436d = 16;
        this.f4437e = 300L;
        this.f4438f = 0.75d;
        this.f4439g = 0;
        this.f4440h = 1;
        this.f4441i = -0.10000000149011612d;
        this.f4442j = 0;
        this.f4443k = 1;
        this.f4444l = 1;
        this.f4445m = 10;
        this.f4446n = 3;
        this.f4447o = 40;
        this.f4449q = 1;
        this.f4450r = 0;
        this.f4451s = 1;
        this.f4452t = 1;
        this.f4453u = 0;
        this.f4454v = 0.2f;
        this.f4455w = 0.8f;
        this.f4456x = 0;
        this.f4457y = null;
        this.f4458z = 8;
        this.A = 4000;
        this.B = 1;
        this.C = 1;
        this.D = null;
        this.E = null;
        this.F = false;
        this.G = null;
        this.H = null;
        this.I = null;
        this.J = null;
    }

    private String c() {
        StringBuilder sb = new StringBuilder();
        sb.append("v9.653|");
        sb.append(this.H);
        sb.append(b5.b.VERTICAL);
        String str = Build.MODEL;
        sb.append(str);
        sb.append("&cu=");
        sb.append(this.H);
        sb.append("&mb=");
        sb.append(str);
        return sb.toString();
    }

    public static a a() {
        return c.f4462a;
    }

    public synchronized void a(double d8, double d9, String str) {
        String encodeToString;
        SharedPreferences sharedPreferences;
        try {
            if (this.I == null && str != null) {
                try {
                    if (!str.equals("bd09")) {
                        if (str.equals("wgs84mc")) {
                        }
                        String format = String.format(Locale.US, "%.5f|%.5f", Double.valueOf(d9), Double.valueOf(d8));
                        this.I = format;
                        encodeToString = Base64.encodeToString(format.getBytes(cn.hutool.core.util.l.UTF_8), 0);
                        if (encodeToString != null && (sharedPreferences = this.f4434b) != null) {
                            SharedPreferences.Editor edit = sharedPreferences.edit();
                            edit.putString(f4433a + "_loc", encodeToString);
                            edit.apply();
                        }
                    }
                    double[] coorEncrypt = Jni.coorEncrypt(d9, d8, BDLocation.BDLOCATION_BD09_TO_GCJ02);
                    double d10 = coorEncrypt[1];
                    double d11 = coorEncrypt[0];
                    d8 = d10;
                    d9 = d11;
                    String format2 = String.format(Locale.US, "%.5f|%.5f", Double.valueOf(d9), Double.valueOf(d8));
                    this.I = format2;
                    encodeToString = Base64.encodeToString(format2.getBytes(cn.hutool.core.util.l.UTF_8), 0);
                    if (encodeToString != null) {
                        SharedPreferences.Editor edit2 = sharedPreferences.edit();
                        edit2.putString(f4433a + "_loc", encodeToString);
                        edit2.apply();
                    }
                } catch (Exception unused) {
                    this.I = null;
                }
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public synchronized void a(Context context, LocationClientOption locationClientOption, String str) {
        try {
            if (!this.F && context != null) {
                this.F = true;
                this.J = context;
                if (locationClientOption == null) {
                    locationClientOption = new LocationClientOption();
                }
                this.G = context.getPackageName();
                n.a().a(this.J);
                try {
                    this.H = LBSAuthManager.getInstance(context).getCUID();
                } catch (Throwable unused) {
                    this.H = null;
                }
                if (this.f4434b == null) {
                    this.f4434b = context.getSharedPreferences(f4433a + "BDLocConfig", 0);
                }
                SharedPreferences sharedPreferences = this.f4434b;
                if (sharedPreferences != null) {
                    long j8 = sharedPreferences.getLong(f4433a + "_lastCheckTime", 0L);
                    String string = this.f4434b.getString(f4433a + "_config", "");
                    String string2 = this.f4434b.getString(f4433a + "_newConfig", "");
                    if (!TextUtils.isEmpty(string2)) {
                        a(new String(com.baidu.location.e.i.b(Base64.decode(string2, 0))));
                    } else if (!TextUtils.isEmpty(string)) {
                        a(string);
                        SharedPreferences.Editor edit = this.f4434b.edit();
                        edit.remove(f4433a + "_config");
                        edit.apply();
                    }
                    if (Math.abs((System.currentTimeMillis() / 1000) - j8) > this.f4437e) {
                        long currentTimeMillis = System.currentTimeMillis() / 1000;
                        SharedPreferences.Editor edit2 = this.f4434b.edit();
                        edit2.putLong(f4433a + "_lastCheckTime", currentTimeMillis);
                        edit2.apply();
                        a(locationClientOption);
                    }
                }
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    private void a(LocationClientOption locationClientOption) {
        String str = "&ver=" + com.baidu.location.e.i.f5283o + "&usr=" + c() + "&app=" + this.G + "&prod=" + locationClientOption.prodName + "&newwf=1";
        String str2 = Build.VERSION.RELEASE;
        if (str2 != null && str2.length() > 6) {
            str2 = str2.substring(0, 6);
        }
        String str3 = str + "&sv=" + str2;
        String b8 = com.baidu.location.e.i.b("ro.miui.ui.version.name");
        if (!TextUtils.isEmpty(b8)) {
            str3 = str3 + "&miui=" + b8;
        }
        String j8 = com.baidu.location.e.i.j();
        if (!TextUtils.isEmpty(j8)) {
            str3 = str3 + "&mtk=" + j8;
        }
        SharedPreferences a8 = u.a(this.J);
        String string = a8 != null ? a8.getString("mapcity", null) : null;
        if (!TextUtils.isEmpty(string)) {
            str3 = str3 + "&city=" + string;
        }
        String str4 = (str3 + "&sdk=9.653") + "&stp=1";
        String string2 = this.f4434b.getString(f4433a + "_loc", null);
        if (!TextUtils.isEmpty(string2)) {
            try {
                str4 = str4 + "&loc=" + new String(Base64.decode(string2, 0), cn.hutool.core.util.l.UTF_8);
            } catch (Exception unused) {
            }
        }
        String str5 = str4 + "&cnloc=" + n.a().b();
        if (this.E == null) {
            this.E = new b();
        }
        this.E.a(str5);
    }

    private void a(String str) {
        try {
            JSONObject jSONObject = new JSONObject(str);
            if (jSONObject.has("is_check_Per") && jSONObject.getInt("is_check_Per") > 0) {
                this.f4435c = true;
            }
            if (jSONObject.has("wfnum")) {
                this.f4436d = jSONObject.getInt("wfnum");
            }
            if (jSONObject.has("freq")) {
                this.f4437e = jSONObject.getLong("freq");
            }
            if (jSONObject.has("wfsm")) {
                this.f4438f = jSONObject.getDouble("wfsm");
            }
            if (jSONObject.has("idmoc")) {
                this.f4439g = jSONObject.getInt("idmoc");
            }
            if (jSONObject.has("gnmcrm")) {
                this.f4441i = jSONObject.getDouble("gnmcrm");
            }
            if (jSONObject.has("gnmcon")) {
                this.f4442j = jSONObject.getInt("gnmcon");
            }
            if (jSONObject.has("lpcs")) {
                this.f4440h = jSONObject.getInt("lpcs");
            }
            if (jSONObject.has("iupl")) {
                this.f4443k = jSONObject.getInt("iupl");
            }
            if (jSONObject.has("opetco")) {
                this.f4444l = jSONObject.getInt("opetco");
            }
            if (jSONObject.has("ct")) {
                this.f4445m = jSONObject.getInt("ct");
            }
            if (jSONObject.has("suci")) {
                this.f4446n = jSONObject.getInt("suci");
            }
            if (jSONObject.has("smn")) {
                this.f4447o = jSONObject.getInt("smn");
            }
            if (jSONObject.has("bcar")) {
                a(jSONObject);
            }
            if (jSONObject.has("ums")) {
                this.f4449q = jSONObject.getInt("ums");
            }
            if (jSONObject.has("hpdts")) {
                this.f4450r = jSONObject.getInt("hpdts");
            }
            if (jSONObject.has("oldts")) {
                this.f4451s = jSONObject.getInt("oldts");
            }
            if (jSONObject.has("nlp_loc_coarse")) {
                this.f4452t = jSONObject.optInt("nlp_loc_coarse");
            }
            if (jSONObject.has("new_loc_cache_switch")) {
                this.f4453u = jSONObject.optInt("new_loc_cache_switch");
            }
            if (jSONObject.has("nc_same_rate")) {
                this.f4454v = (float) jSONObject.optDouble("nc_same_rate", 0.8d);
            }
            if (jSONObject.has("cl_str_change_rate")) {
                this.f4455w = (float) jSONObject.optDouble("cl_str_change_rate", 0.2d);
            }
            if (jSONObject.has("cl_list_switch")) {
                this.f4456x = jSONObject.optInt("cl_list_switch", 0);
            }
            if (jSONObject.has("cl_str_switch")) {
                String[] split = jSONObject.optString("cl_str_switch", "").split(SystemInfoUtil.COMMA);
                this.f4457y = new int[split.length];
                int i8 = 0;
                for (String str2 : split) {
                    this.f4457y[i8] = 0;
                    if (str2.length() > 0) {
                        try {
                            this.f4457y[i8] = Integer.parseInt(str2);
                        } catch (Throwable unused) {
                        }
                    }
                    i8++;
                }
            }
            if (jSONObject.has("cell_number")) {
                this.f4458z = jSONObject.optInt("cell_number", 10);
            }
            if (jSONObject.has("loc_str_length")) {
                this.A = jSONObject.optInt("loc_str_length", 4000);
            }
            if (jSONObject.has("loc_to_foreground")) {
                this.B = jSONObject.optInt("loc_to_foreground", 1);
            }
            if (jSONObject.has("hils")) {
                this.C = jSONObject.optInt("hils", 1);
            }
            this.D = str;
        } catch (Exception e8) {
            e8.printStackTrace();
        }
    }

    public void a(JSONObject jSONObject) {
        JSONArray jSONArray;
        if (jSONObject != null) {
            double[] dArr = this.f4448p;
            if (dArr != null && dArr.length > 0) {
                this.f4448p = null;
            }
            try {
                if (!jSONObject.has("bcar") || (jSONArray = jSONObject.getJSONArray("bcar")) == null || jSONArray.length() <= 0) {
                    return;
                }
                if (this.f4448p == null) {
                    this.f4448p = new double[jSONArray.length() * 4];
                }
                int i8 = 0;
                for (int i9 = 0; i9 < jSONArray.length(); i9++) {
                    this.f4448p[i8] = jSONArray.getJSONObject(i9).getDouble("x1");
                    this.f4448p[i8 + 1] = jSONArray.getJSONObject(i9).getDouble("y1");
                    int i10 = i8 + 3;
                    this.f4448p[i8 + 2] = jSONArray.getJSONObject(i9).getDouble("x2");
                    i8 += 4;
                    this.f4448p[i10] = jSONArray.getJSONObject(i9).getDouble("y2");
                }
            } catch (Exception unused) {
            }
        }
    }
}
