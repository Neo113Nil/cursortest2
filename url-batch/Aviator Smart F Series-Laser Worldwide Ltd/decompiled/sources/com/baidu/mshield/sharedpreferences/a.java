package com.baidu.mshield.sharedpreferences;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.text.TextUtils;
import com.baidu.mshield.utility.g;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes2.dex */
public class a {

    /* renamed from: a, reason: collision with root package name */
    public static a f8370a;

    /* renamed from: b, reason: collision with root package name */
    public SharedPreferences f8371b;

    /* renamed from: c, reason: collision with root package name */
    public SharedPreferences.Editor f8372c;

    /* renamed from: d, reason: collision with root package name */
    public SharedPreferences f8373d;

    /* renamed from: e, reason: collision with root package name */
    public SharedPreferences.Editor f8374e;

    /* renamed from: f, reason: collision with root package name */
    public SharedPreferences f8375f;

    /* renamed from: g, reason: collision with root package name */
    public SharedPreferences.Editor f8376g;

    /* renamed from: h, reason: collision with root package name */
    public Context f8377h;

    /* renamed from: i, reason: collision with root package name */
    public int f8378i;

    /* renamed from: j, reason: collision with root package name */
    public String f8379j = null;

    /* renamed from: k, reason: collision with root package name */
    public Map<String, SharedPreferences> f8380k = new HashMap();

    public a(Context context) {
        this.f8377h = context;
        this.f8378i = com.baidu.mshield.utility.a.h(context);
        com.baidu.mshield.b.c.a.b("checking platformName:mshield_SOFIRE");
        i();
        c cVar = new c(this.f8377h, this.f8378i == 1 ? context.getSharedPreferences("leroadmshieldcfg", 0) : null, "leroadmshieldcfg", false, this.f8378i);
        this.f8371b = cVar;
        this.f8372c = cVar.edit();
        c cVar2 = new c(this.f8377h, (this.f8378i == 1 && TextUtils.isEmpty(this.f8379j)) ? context.getSharedPreferences("leroadcfg", 0) : null, "leroadcfg", true, this.f8378i, this.f8379j);
        this.f8373d = cVar2;
        this.f8374e = cVar2.edit();
        c cVar3 = new c(this.f8377h, this.f8378i == 1 ? context.getSharedPreferences("msre_po_rt", 0) : null, "msre_po_rt", false, this.f8378i);
        this.f8375f = cVar3;
        this.f8376g = cVar3.edit();
    }

    public int A() {
        return this.f8371b.getInt("wi_fa_pu_cl", 0);
    }

    public long B() {
        return this.f8375f.getLong("re_net_pu_de", 0L);
    }

    public String C() {
        return this.f8375f.getString("re_net_ali2_version", "");
    }

    public int D() {
        return this.f8375f.getInt("re_net_dy_lt", 50);
    }

    public int E() {
        return this.f8375f.getInt("g_r_d_d_n", 0);
    }

    public int F() {
        return this.f8375f.getInt("re_net_wt", 3);
    }

    public long G() {
        return this.f8375f.getLong("re_last_ofline_time", 0L);
    }

    public int H() {
        return this.f8375f.getInt("re_net_one_lt", 5);
    }

    public int I() {
        return this.f8375f.getInt("re_net_over", 7);
    }

    public int J() {
        if ("com.baidu.BaiduMap.meizu".equals(this.f8377h.getPackageName())) {
            return this.f8375f.getInt("re_net_hr", 24);
        }
        int i8 = this.f8375f.getInt("re_net_hr", 3);
        try {
            String[] i9 = com.baidu.mshield.utility.a.i(this.f8377h);
            if (i9.length == 2 && !TextUtils.isEmpty(i9[0]) && !TextUtils.isEmpty(i9[1]) && "200080".equals(i9[0])) {
                if ("com.baidu.BaiduMap".equals(this.f8377h.getPackageName()) && i8 < 24) {
                    return 24;
                }
            }
        } catch (Throwable unused) {
        }
        return i8;
    }

    public String K() {
        return this.f8371b.getString("svi_n_wm", "");
    }

    public String a() {
        return this.f8371b.getString("svi_wm", "");
    }

    public long b() {
        long j8 = this.f8371b.getLong("se_ae_fd", 0L);
        if (j8 != 0) {
            return j8;
        }
        long currentTimeMillis = System.currentTimeMillis();
        k();
        return currentTimeMillis;
    }

    public long c() {
        return this.f8375f.getLong("re_day_b_t", 0L);
    }

    public long d() {
        return this.f8375f.getLong("re_day_len", 0L);
    }

    public String e() {
        return this.f8373d.getString("xytk", "");
    }

    public String f() {
        return this.f8373d.getString("sgud", "");
    }

    public int g() {
        return this.f8375f.getInt("up_nu_co", 50);
    }

    public int h() {
        return this.f8375f.getInt("up_nu_li", 100);
    }

    public void i() {
        Bundle bundle = new Bundle();
        bundle.putString("operation", "querySharedHandler");
        Bundle a8 = g.a(this.f8377h, "CallPreferences", bundle, false, "3.5.8.0", true);
        if (a8 != null) {
            this.f8379j = a8.getString("handle_platform");
            com.baidu.mshield.b.c.a.b("get can handle shared platform:" + this.f8379j);
        }
    }

    public void j() {
        this.f8372c.putLong("pu_cl_fd", System.currentTimeMillis());
        this.f8372c.commit();
    }

    public void k() {
        this.f8372c.putLong("se_ae_fd", System.currentTimeMillis());
        this.f8372c.commit();
    }

    public void l(String str) {
        this.f8374e.putString("rpmacadd", str);
        this.f8374e.commit();
    }

    public void m(String str) {
        this.f8374e.putString("xytk_m", str);
        this.f8374e.apply();
    }

    public void n(int i8) {
        this.f8376g.putInt("up_nu_co", i8);
        this.f8376g.commit();
    }

    public void o(String str) {
        this.f8374e.putString("sgud", str);
        this.f8374e.commit();
    }

    public List<com.baidu.mshield.rp.b.a> p() {
        com.baidu.mshield.rp.b.a a8;
        String string = this.f8375f.getString("re_con", "");
        if (TextUtils.isEmpty(string)) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (String str : string.split("\\|\\|")) {
            if (!TextUtils.isEmpty(str) && (a8 = com.baidu.mshield.rp.b.a.a(str)) != null) {
                arrayList.add(a8);
            }
        }
        return arrayList;
    }

    public String q() {
        return this.f8373d.getString("xyusec", "");
    }

    public String r() {
        return this.f8373d.getString("xygls", "");
    }

    public String s() {
        return this.f8373d.getString("rpiiem", "");
    }

    public String t() {
        return this.f8375f.getString("re_a_lc", "");
    }

    public String u() {
        return this.f8373d.getString("rpmacadd", "");
    }

    public String v() {
        return this.f8373d.getString("xytk_m", "");
    }

    public SharedPreferences w() {
        return this.f8371b;
    }

    public SharedPreferences x() {
        return this.f8373d;
    }

    public long y() {
        long j8 = this.f8371b.getLong("pu_cl_fd", 0L);
        if (j8 != 0) {
            return j8;
        }
        long currentTimeMillis = System.currentTimeMillis();
        j();
        return currentTimeMillis;
    }

    public int z() {
        return this.f8371b.getInt("mo_fa_pu_cl", 0);
    }

    public static synchronized a a(Context context) {
        synchronized (a.class) {
            if (context == null) {
                return f8370a;
            }
            if (f8370a == null) {
                f8370a = new a(context);
            }
            return f8370a;
        }
    }

    public SharedPreferences c(String str) {
        SharedPreferences sharedPreferences;
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            synchronized (this.f8380k) {
                try {
                    sharedPreferences = this.f8380k.get(str);
                    if (sharedPreferences == null) {
                        c cVar = new c(this.f8377h, this.f8378i == 1 ? this.f8377h.getSharedPreferences(str, 0) : null, str, false, this.f8378i);
                        this.f8380k.put(str, cVar);
                        sharedPreferences = cVar;
                    }
                } finally {
                }
            }
            return sharedPreferences;
        } catch (Throwable th) {
            com.baidu.mshield.utility.a.a(th);
            return null;
        }
    }

    public void d(String str, String str2) {
        this.f8372c.putString("svi_n_wm", str + "-" + str2);
        this.f8372c.commit();
    }

    public void e(int i8) {
        this.f8372c.putInt("wi_fa_pu_cl", i8);
        this.f8372c.commit();
    }

    public void f(int i8) {
        this.f8376g.putInt("re_net_dy_lt", i8);
        this.f8376g.commit();
    }

    public void g(String str) {
        this.f8374e.putString("rpandid", str);
        this.f8374e.commit();
    }

    public void h(String str) {
        this.f8374e.putString("xyus", str);
        this.f8374e.commit();
    }

    public void j(String str) {
        this.f8374e.putString("xygls", str);
        this.f8374e.commit();
    }

    public void k(String str) {
        this.f8374e.putString("rpiiem", str);
        this.f8374e.commit();
    }

    public void l(int i8) {
        this.f8376g.putInt("re_net_hr_bc", i8);
        this.f8376g.commit();
    }

    public String m() {
        return this.f8373d.getString("rpandid", "");
    }

    public void n(String str) {
        this.f8376g.putString("re_net_ali2_version", str);
        this.f8376g.commit();
    }

    public void o(int i8) {
        this.f8376g.putInt("up_nu_li", i8);
        this.f8376g.commit();
    }

    public void b(int i8) {
        this.f8372c.putInt("mo_fa_pu_ap", i8);
        this.f8372c.commit();
    }

    public void d(int i8) {
        this.f8372c.putInt("mo_fa_pu_cl", i8);
        this.f8372c.commit();
    }

    public boolean e(String str) {
        return this.f8375f.getBoolean("re_net_ins_" + str, false);
    }

    public void f(String str) {
        this.f8376g.putString("li_pk_s", str);
        this.f8376g.commit();
    }

    public void g(int i8) {
        this.f8376g.putInt("g_r_d_d_n", i8);
        this.f8376g.commit();
    }

    public void h(int i8) {
        this.f8376g.putInt("re_net_wt", i8);
        this.f8376g.commit();
    }

    public void m(int i8) {
        this.f8376g.putInt("re_net_hr", i8);
        this.f8376g.commit();
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public Bundle a(Bundle bundle) {
        String string;
        try {
            string = bundle.getString("operation");
        } catch (Throwable th) {
            com.baidu.mshield.utility.a.a(th);
        }
        if (TextUtils.isEmpty(string)) {
            return null;
        }
        if ("querySharedHandler".equals(string)) {
            Bundle bundle2 = new Bundle();
            bundle2.putString("handle_platform", "mshield");
            return bundle2;
        }
        String string2 = bundle.getString("pref_name");
        if (TextUtils.isEmpty(string2)) {
            return null;
        }
        String string3 = bundle.getString("key");
        if (TextUtils.isEmpty(string3)) {
            return null;
        }
        com.baidu.mshield.b.c.a.b("handleRemoteCall:" + string + "_" + string2 + "_" + string3);
        SharedPreferences a8 = a(string2);
        char c8 = 0;
        if (string.startsWith("get")) {
            String string4 = bundle.getString("defult_value");
            if (!"getString".equals(string) && TextUtils.isEmpty(string4)) {
                return null;
            }
            com.baidu.mshield.b.c.a.b("handleRemoteCall get:" + string + "_defValue=" + string4);
            if (a8 == null) {
                return null;
            }
            Bundle bundle3 = new Bundle();
            switch (string.hashCode()) {
                case -1249359687:
                    if (string.equals("getInt")) {
                        c8 = 1;
                        break;
                    }
                    c8 = 65535;
                    break;
                case -75354382:
                    if (string.equals("getLong")) {
                        c8 = 2;
                        break;
                    }
                    c8 = 65535;
                    break;
                case 804029191:
                    if (string.equals("getString")) {
                        break;
                    }
                    c8 = 65535;
                    break;
                case 1101572082:
                    if (string.equals("getBoolean")) {
                        c8 = 4;
                        break;
                    }
                    c8 = 65535;
                    break;
                case 1953351846:
                    if (string.equals("getFloat")) {
                        c8 = 3;
                        break;
                    }
                    c8 = 65535;
                    break;
                default:
                    c8 = 65535;
                    break;
            }
            if (c8 == 0) {
                bundle3.putString("result", a8.getString(string3, string4));
            } else if (c8 == 1) {
                bundle3.putInt("result", a8.getInt(string3, Integer.parseInt(string4)));
            } else if (c8 == 2) {
                bundle3.putLong("result", a8.getLong(string3, Long.parseLong(string4)));
            } else if (c8 == 3) {
                bundle3.putFloat("result", a8.getFloat(string3, Float.parseFloat(string4)));
            } else if (c8 == 4) {
                bundle3.putBoolean("result", a8.getBoolean(string3, Boolean.parseBoolean(string4)));
            }
            return bundle3;
        }
        if (string.startsWith("put")) {
            SharedPreferences.Editor edit = a8.edit();
            com.baidu.mshield.b.c.a.b("handleRemoteCall put:" + string);
            switch (string.hashCode()) {
                case -976920992:
                    if (string.equals("putInt")) {
                        c8 = 1;
                        break;
                    }
                    c8 = 65535;
                    break;
                case -462997504:
                    if (string.equals("putString")) {
                        break;
                    }
                    c8 = 65535;
                    break;
                case -219689429:
                    if (string.equals("putLong")) {
                        c8 = 2;
                        break;
                    }
                    c8 = 65535;
                    break;
                case 478450201:
                    if (string.equals("putBoolean")) {
                        c8 = 4;
                        break;
                    }
                    c8 = 65535;
                    break;
                case 1773932685:
                    if (string.equals("putFloat")) {
                        c8 = 3;
                        break;
                    }
                    c8 = 65535;
                    break;
                default:
                    c8 = 65535;
                    break;
            }
            if (c8 == 0) {
                edit.putString(string3, bundle.getString("value"));
            } else if (c8 == 1) {
                edit.putInt(string3, bundle.getInt("value"));
            } else if (c8 == 2) {
                edit.putLong(string3, bundle.getLong("value"));
            } else if (c8 == 3) {
                edit.putFloat(string3, bundle.getFloat("value"));
            } else if (c8 == 4) {
                edit.putBoolean(string3, bundle.getBoolean("value"));
            }
            edit.apply();
        }
        return null;
    }

    public void j(int i8) {
        this.f8376g.putInt("re_net_one_lt", i8);
        this.f8376g.commit();
    }

    public void k(int i8) {
        this.f8376g.putInt("re_net_over", i8);
        this.f8376g.commit();
    }

    public int l() {
        return this.f8371b.getInt("mo_ae_fa_ct", 0);
    }

    public String n() {
        return this.f8373d.getString("xyus", "");
    }

    public String o() {
        return this.f8375f.getString("re_a_cv", "");
    }

    public void b(long j8) {
        this.f8376g.putLong("re_last_ofline_time", j8);
        this.f8376g.commit();
    }

    public String d(String str) {
        return this.f8375f.getString("re_net_ali2_" + str, "");
    }

    public void i(int i8) {
        this.f8376g.putInt("re_net_ty", i8);
        this.f8376g.commit();
    }

    public void d(long j8) {
        this.f8376g.putLong("re_day_len", j8);
        this.f8376g.commit();
    }

    public String b(String str) {
        return this.f8375f.getString("al_da" + str, "");
    }

    public void i(String str) {
        this.f8374e.putString("xyusec", str);
        this.f8374e.commit();
    }

    public void b(String str, String str2) {
        this.f8376g.putString("in_da" + str, str2);
        this.f8376g.commit();
    }

    public void c(int i8) {
        this.f8372c.putInt("wi_fa_pu_ap", i8);
        this.f8372c.commit();
    }

    public void c(String str, String str2) {
        this.f8376g.putString("re_net_ali2_" + str, str2);
        this.f8376g.commit();
    }

    public void c(long j8) {
        this.f8376g.putLong("re_day_b_t", j8);
        this.f8376g.commit();
    }

    public final SharedPreferences a(String str) {
        return str.equals("leroadmshieldcfg") ? this.f8371b : str.equals("leroadcfg") ? this.f8373d : str.equals("msre_po_rt") ? this.f8375f : c(str);
    }

    public void a(int i8) {
        this.f8372c.putInt("mo_ae_fa_ct", i8);
        this.f8372c.commit();
    }

    public void a(com.baidu.mshield.rp.b.a aVar) {
        if (aVar == null) {
            return;
        }
        String string = this.f8375f.getString("re_con", "");
        this.f8376g.putString("re_con", string + "||" + com.baidu.mshield.rp.b.a.a(aVar));
        this.f8376g.commit();
    }

    public void a(List<com.baidu.mshield.rp.b.a> list, com.baidu.mshield.rp.b.a aVar) {
        int indexOf;
        com.baidu.mshield.rp.b.a aVar2;
        if (aVar == null || list == null || (indexOf = list.indexOf(aVar)) == -1 || (aVar2 = list.get(indexOf)) == null) {
            return;
        }
        this.f8376g.putString("re_con", this.f8375f.getString("re_con", "").replace(com.baidu.mshield.rp.b.a.a(aVar2), com.baidu.mshield.rp.b.a.a(aVar)));
        this.f8376g.commit();
    }

    public void a(String str, boolean z7) {
        this.f8376g.putBoolean("re_net_ins_" + str, z7);
        this.f8376g.commit();
    }

    public void a(long j8) {
        this.f8376g.putLong("re_net_pu_de", j8);
        this.f8376g.commit();
    }

    public void a(String str, String str2) {
        this.f8376g.putString("al_da" + str, str2);
        this.f8376g.commit();
    }
}
