package com.baidu.mshield.x6.b;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import com.baidu.mshield.x6.f.f;

/* loaded from: classes2.dex */
public class b {

    /* renamed from: a, reason: collision with root package name */
    public static String f8501a = "kship";

    /* renamed from: b, reason: collision with root package name */
    public static String f8502b = "kshinp";

    /* renamed from: c, reason: collision with root package name */
    public static String f8503c = "krti";

    /* renamed from: d, reason: collision with root package name */
    public static String f8504d = "ksdci";

    /* renamed from: e, reason: collision with root package name */
    public static String f8505e = "kwfi";

    /* renamed from: f, reason: collision with root package name */
    public static String f8506f = "kbti";

    /* renamed from: g, reason: collision with root package name */
    public static String f8507g = "kssi";

    /* renamed from: h, reason: collision with root package name */
    public static String f8508h = "ktpti";

    /* renamed from: i, reason: collision with root package name */
    public static String f8509i = "kusbi";

    /* renamed from: j, reason: collision with root package name */
    public static String f8510j = "kdkdi";

    /* renamed from: k, reason: collision with root package name */
    public static String f8511k = "kcpui";

    /* renamed from: l, reason: collision with root package name */
    public static String f8512l = "ksci";

    /* renamed from: m, reason: collision with root package name */
    public static String f8513m = "kfstl";

    /* renamed from: n, reason: collision with root package name */
    public static String f8514n = "kvti";

    /* renamed from: o, reason: collision with root package name */
    public static String f8515o = "kvtij";

    /* renamed from: p, reason: collision with root package name */
    public static String f8516p = "kopgl";

    /* renamed from: q, reason: collision with root package name */
    public static String f8517q = "kpalwp";

    /* renamed from: r, reason: collision with root package name */
    public static String f8518r = "kstafac";

    /* renamed from: s, reason: collision with root package name */
    public static String f8519s = "ksglcid";

    /* renamed from: t, reason: collision with root package name */
    public static String f8520t = "kshwoaid";

    /* renamed from: u, reason: collision with root package name */
    public static String f8521u = "kxceck";

    /* renamed from: v, reason: collision with root package name */
    public SharedPreferences f8522v;

    /* renamed from: w, reason: collision with root package name */
    public SharedPreferences.Editor f8523w;

    @SuppressLint({"InlinedApi"})
    public b(Context context) {
        try {
            SharedPreferences sharedPreferences = context.getSharedPreferences("msfffppcfg", 4);
            this.f8522v = sharedPreferences;
            this.f8523w = sharedPreferences.edit();
        } catch (Throwable th) {
            f.b(th);
        }
    }

    public String A() {
        return this.f8522v.getString("global_xid", "");
    }

    public String B() {
        return this.f8522v.getString("h_ca_to_in", "");
    }

    public boolean C() {
        return this.f8522v.getBoolean("kicfr", false);
    }

    public long D() {
        return this.f8522v.getLong("l_bd_r_t", 0L);
    }

    public String E() {
        return this.f8522v.getString("g_l_p_tar", "");
    }

    public int F() {
        return this.f8522v.getInt("l_to_re_re", 0);
    }

    public String G() {
        return this.f8522v.getString("l_to_re_t_re", "");
    }

    public int H() {
        return this.f8522v.getInt("s_to_re_co", 0);
    }

    public long I() {
        return this.f8522v.getLong("s_to_re_ot", 0L);
    }

    public int J() {
        return this.f8522v.getInt("s_zid_lc_s", 1);
    }

    public long K() {
        return this.f8522v.getLong("s_zid_lc_t", 0L);
    }

    public String L() {
        return this.f8522v.getString("g_ma_m", "");
    }

    public String M() {
        return this.f8522v.getString("g_mo_m", "");
    }

    public String N() {
        return this.f8522v.getString("m_s_i_cc_id", "");
    }

    public String O() {
        return this.f8522v.getString("m_s_i_id", "");
    }

    public String P() {
        return this.f8522v.getString("g_b_o_b_s", "");
    }

    public String Q() {
        return this.f8522v.getString("global_o_xid", "");
    }

    public boolean a() {
        return this.f8522v.getBoolean("s_ai_n_c_f", false);
    }

    public int b() {
        return this.f8522v.getInt("s_pc_al_i", 360);
    }

    public String c() {
        return this.f8522v.getString("re_stc_s_t", "");
    }

    public String d() {
        return this.f8522v.getString("g_rn_m", "");
    }

    public String e() {
        return this.f8522v.getString("g_rv_m", "");
    }

    public boolean f() {
        return this.f8522v.getBoolean("s_s_c_f", false);
    }

    public String g() {
        try {
            String string = this.f8522v.getString("tk_rm_py", "");
            return TextUtils.isEmpty(string) ? "" : f.a(string);
        } catch (Throwable th) {
            f.b(th);
            return "";
        }
    }

    public String h() {
        return this.f8522v.getString("s_to_dy_d", "");
    }

    public int i() {
        return this.f8522v.getInt("s_to_dy_op", 0);
    }

    public String j() {
        return this.f8522v.getString("s_to_re_d", "");
    }

    public int k() {
        return this.f8522v.getInt("s_to_re_li", 10);
    }

    public boolean l() {
        return this.f8522v.getBoolean("is_x_r_f_2_1_0", false);
    }

    public int m() {
        return this.f8522v.getInt("s_zid_cf", 0);
    }

    public boolean n() {
        return this.f8522v.getBoolean("s_z_d_c_f", false);
    }

    public int o() {
        return this.f8522v.getInt("g_z_c_f_q", 60);
    }

    public void p() {
        b("tk_rm_py");
    }

    public final void q() {
        try {
            this.f8523w.commit();
        } catch (Throwable th) {
            f.b(th);
        }
    }

    public void r(String str) {
        this.f8523w.putString("pu_py_t", str);
        this.f8523w.commit();
    }

    public String s() {
        return this.f8522v.getString("g_bu_m", "");
    }

    public void t(String str) {
        this.f8523w.putString("g_rn_m", str);
        q();
    }

    public void u(String str) {
        this.f8523w.putString("g_rv_m", str);
        q();
    }

    public void v(String str) {
        try {
            if (TextUtils.isEmpty(str)) {
                return;
            }
            this.f8523w.putString("tk_rm_py", f.b(str));
            this.f8523w.commit();
        } catch (Throwable th) {
            f.b(th);
        }
    }

    public void w(String str) {
        this.f8523w.putString("s_to_dy_d", str);
        q();
    }

    public void x(String str) {
        this.f8523w.putString("s_to_re_d", str);
        q();
    }

    public void y(String str) {
        this.f8523w.putString("g_l_b_x_v", str);
        q();
    }

    public boolean z() {
        return this.f8522v.getBoolean("i_ft_tm_z", true);
    }

    public void a(String str, String str2) {
        this.f8523w.putString(str, str2);
        q();
    }

    public void b(long j8) {
        this.f8523w.putLong("s_to_re_ot", j8);
        q();
    }

    public void c(int i8) {
        this.f8523w.putInt("k_em_t_a", i8);
        q();
    }

    public void d(boolean z7) {
        this.f8523w.putBoolean("s_s_c_f", z7);
        q();
    }

    public void e(boolean z7) {
        this.f8523w.putBoolean("is_sim_changed_today", z7);
        q();
    }

    public void f(boolean z7) {
        this.f8523w.putBoolean("is_x_r_f_2_1_0", z7);
        q();
    }

    public void h(int i8) {
        this.f8523w.putInt("s_sd_al_i", i8);
        q();
    }

    public void i(String str) {
        this.f8523w.putString("global_xid", str);
        q();
    }

    public void j(String str) {
        this.f8523w.putString("h_ca_to_in", str);
        q();
    }

    public void k(String str) {
        this.f8523w.putString("g_b_z_o_c_t_d", str);
        q();
    }

    public void l(int i8) {
        this.f8523w.putInt("g_z_c_f_q", i8);
        q();
    }

    public void m(int i8) {
        this.f8523w.putInt("y_z_c_s", i8);
        q();
    }

    public void n(String str) {
        this.f8523w.putString("m_s_i_cc_id", str);
        q();
    }

    public void o(String str) {
        this.f8523w.putString("m_s_i_id", str);
        q();
    }

    public void p(String str) {
        this.f8523w.putString("g_b_o_b_s", str);
        q();
    }

    public void s(String str) {
        this.f8523w.putString("re_stc_s_t", str);
        this.f8523w.commit();
    }

    public void q(String str) {
        this.f8523w.putString("global_o_xid", str);
        q();
    }

    public String r() {
        return this.f8522v.getString("g_a_i_m", "");
    }

    public String t() {
        return this.f8522v.getString("g_bvr_m", "");
    }

    public String u() {
        return this.f8522v.getString("g_b_g_b_s", "");
    }

    public int w() {
        return this.f8522v.getInt("s_c_f_o_ttc", 10);
    }

    public String x() {
        return this.f8522v.getString("g_d_d_v", "");
    }

    public String y() {
        return this.f8522v.getString("g_e_s_m", "");
    }

    public String a(String str) {
        return this.f8522v.getString(str, "");
    }

    public void b(int i8) {
        this.f8523w.putInt("s_c_f_o_ttc", i8);
        q();
    }

    public void c(String str) {
        this.f8523w.putString("g_a_i_m", str);
        q();
    }

    public void d(long j8) {
        this.f8523w.putLong("g_u_tk_ti", j8);
        this.f8523w.commit();
    }

    public void e(String str) {
        this.f8523w.putString("g_bvr_m", str);
        q();
    }

    public void f(String str) {
        this.f8523w.putString("g_b_g_b_s", str);
        q();
    }

    public void h(String str) {
        this.f8523w.putString("g_e_s_m", str);
        this.f8523w.commit();
    }

    public void i(int i8) {
        this.f8523w.putInt("s_to_dy_op", i8);
        q();
    }

    public void j(int i8) {
        this.f8523w.putInt("s_to_re_li", i8);
        q();
    }

    public void k(int i8) {
        this.f8523w.putInt("s_zid_cf", i8);
        q();
    }

    public void l(String str) {
        this.f8523w.putString("g_ma_m", str);
        q();
    }

    public void m(String str) {
        this.f8523w.putString("g_mo_m", str);
        q();
    }

    public void a(boolean z7) {
        this.f8523w.putBoolean("i_ft_tm_z", z7);
        q();
    }

    public void g(boolean z7) {
        this.f8523w.putBoolean("s_z_d_c_f", z7);
        q();
    }

    public void b(String str) {
        try {
            if (TextUtils.isEmpty(this.f8522v.getString(str, ""))) {
                return;
            }
            this.f8523w.remove(str);
            q();
        } catch (Throwable th) {
            f.b(th);
        }
    }

    public void c(boolean z7) {
        this.f8523w.putBoolean("s_ai_n_c_f", z7);
        q();
    }

    public void d(String str) {
        this.f8523w.putString("g_bu_m", str);
        q();
    }

    public void e(int i8) {
        this.f8523w.putInt("s_to_re_co", i8);
        q();
    }

    public void f(int i8) {
        this.f8523w.putInt("s_nc_al_i", i8);
        q();
    }

    public int v() {
        return this.f8522v.getInt("s_c_f_o_qec", 0);
    }

    public void a(long j8) {
        this.f8523w.putLong("l_bd_r_t", j8);
        q();
    }

    public void g(int i8) {
        this.f8523w.putInt("s_pc_al_i", i8);
        q();
    }

    public void c(long j8) {
        this.f8523w.putLong("s_zid_lc_t", j8);
        q();
    }

    public void d(int i8) {
        this.f8523w.putInt("l_to_re_re", i8);
        q();
        a(System.currentTimeMillis(), i8 > 0 ? 1 : 0);
    }

    public void a(long j8, boolean z7) {
        String str = z7 ? "1" : "0";
        try {
            this.f8523w.putString("g_l_p_tar", j8 + "#" + str);
            q();
        } catch (Throwable th) {
            f.b(th);
        }
    }

    public void g(String str) {
        this.f8523w.putString("g_d_d_v", str);
        q();
    }

    public void b(boolean z7) {
        this.f8523w.putBoolean("kicfr", z7);
        q();
    }

    public void a(int i8) {
        this.f8523w.putInt("s_c_f_o_qec", i8);
        q();
    }

    public void a(long j8, int i8) {
        try {
            this.f8523w.putString("l_to_re_t_re", j8 + "#" + i8);
            q();
        } catch (Throwable th) {
            f.b(th);
        }
    }
}
