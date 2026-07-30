package com.baidu.xclient.gdid;

import android.content.SharedPreferences;
import android.text.TextUtils;
import android.util.Base64;
import com.baidu.platform.comapi.map.MapBundleKey;
import com.google.android.exoplayer2.upstream.CmcdHeadersFactory;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public class e {

    /* renamed from: a, reason: collision with root package name */
    public static String f10731a = "sec_gd_config_mshield";

    /* renamed from: b, reason: collision with root package name */
    public static volatile e f10732b;

    /* renamed from: c, reason: collision with root package name */
    public SharedPreferences f10733c;

    /* renamed from: d, reason: collision with root package name */
    public SharedPreferences.Editor f10734d;

    public e() {
        SharedPreferences sharedPreferences = d.f10722b.getSharedPreferences(f10731a, 0);
        this.f10733c = sharedPreferences;
        this.f10734d = sharedPreferences.edit();
    }

    public static e e() {
        if (f10732b == null) {
            synchronized (e.class) {
                try {
                    if (f10732b == null) {
                        f10732b = new e();
                    }
                } finally {
                }
            }
        }
        return f10732b;
    }

    public int A() {
        return b("k_b_app_l_idx", 0);
    }

    public int a() {
        return b("k_f_p_idx", 0);
    }

    public int b() {
        return b("k_b_f_p_idx", 0);
    }

    public void c(int i8) {
        if (i8 <= 0) {
            return;
        }
        a("k_t_a_p", i8);
    }

    public void d() {
        a("k_is_rp_mgc", !c());
    }

    public long f() {
        return b("k_last_pull_pl_t", 0L);
    }

    public long g() {
        return b("k_pull_p_itl", com.baidu.xclient.gdid.i.a.f10744b * 8);
    }

    public long h() {
        return b("k_last_re_fing_t", 0L);
    }

    public long i() {
        return b("k_re_fing_itl", com.baidu.xclient.gdid.i.a.f10745c);
    }

    public String j() {
        return b("k_cu_p_ver_n", "");
    }

    public String k() {
        String b8 = b("k_ply_s_n", "");
        if (!TextUtils.isEmpty(b8)) {
            return new String(Base64.decode(b8, 1));
        }
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("e", 1);
            jSONObject.put(CmcdHeadersFactory.STREAM_TYPE_LIVE, 1);
            jSONObject.put("p", ".zqobbx.pa");
            jSONObject.put(CmcdHeadersFactory.OBJECT_TYPE_INIT_SEGMENT, 1);
            jSONObject.put("m", 0);
            jSONObject.put("w", 1);
            jSONObject.put("s", 1);
            jSONObject.put("c", 0);
            jSONObject.put("y", 20);
            jSONObject.put(MapBundleKey.MapObjKey.OBJ_SS_ARROW_Z, 20);
            jSONObject.put("x", 0);
            jSONObject.put("u", 0);
            jSONObject.put("g", 20);
            jSONObject.put("n", 0);
            jSONObject.put("t", 0);
            jSONObject.put("q", 0);
            jSONObject.put("9", "");
            jSONObject.put("10", "");
        } catch (Throwable th) {
            com.baidu.xclient.gdid.k.d.a(th);
        }
        return jSONObject.toString();
    }

    public long l() {
        return b("k_last_alm_t", 0L);
    }

    public long m() {
        return b("k_alm_itl", com.baidu.xclient.gdid.i.a.f10744b);
    }

    public long n() {
        return b("k_last_pi_t", 0L);
    }

    public long o() {
        return b("K_pi_itl", com.baidu.xclient.gdid.i.a.f10744b * 12);
    }

    public String p() {
        return b("k_ext_id4", "");
    }

    public String q() {
        return b("k_gu_all", "");
    }

    public String r() {
        return b("k_rep_al", "");
    }

    public String s() {
        return b("k_rep_f_if", "");
    }

    public String t() {
        return b("k_n_g_d", "");
    }

    public String u() {
        return b("k_ext_j", "");
    }

    public boolean v() {
        return y() == 3;
    }

    public boolean w() {
        int y7 = y();
        return y7 == 3 || y7 == 1;
    }

    public boolean x() {
        int y7 = y();
        return y7 == 3 || y7 == 2;
    }

    public int y() {
        return b("k_mdl_sw", 3);
    }

    public int z() {
        return b("k_app_l_idx", 0);
    }

    public void a(int i8) {
        a("k_mdl_sw", i8);
    }

    public final int b(String str, int i8) {
        return this.f10733c.getInt(str, i8);
    }

    public void c(long j8) {
        a("k_last_re_fing_t", j8);
    }

    public void d(int i8) {
        if (i8 < 0) {
            return;
        }
        a("k_t_ca_p", i8);
    }

    public void e(int i8) {
        if (i8 < 0) {
            return;
        }
        a("l_td_t_s", i8 != 0);
    }

    public void f(int i8) {
        if (i8 < 0) {
            return;
        }
        a("k_t_m_s_s", i8 != 0);
    }

    public void g(int i8) {
        a("k_app_l_idx", i8);
    }

    public void h(int i8) {
        a("k_b_app_l_idx", i8);
    }

    public void i(int i8) {
        a("k_f_p_idx", i8);
    }

    public void j(int i8) {
        a("k_b_f_p_idx", i8);
    }

    public void k(boolean z7) {
        a("k_is_rp_lp", z7);
    }

    public void l(boolean z7) {
        a("k_is_rp_dnp", z7);
    }

    public void a(long j8) {
        a("k_last_pull_pl_t", j8);
    }

    public final long b(String str, long j8) {
        return this.f10733c.getLong(str, j8);
    }

    public void c(String str) {
        a("k_gu_all", str);
    }

    public void d(long j8) {
        if (j8 <= 0) {
            return;
        }
        a("k_re_fing_itl", j8);
    }

    public void e(long j8) {
        a("k_last_alm_t", j8);
    }

    public void f(long j8) {
        if (j8 <= 0) {
            return;
        }
        a("k_alm_itl", j8);
    }

    public void g(long j8) {
        a("k_last_pi_t", j8);
    }

    public void h(long j8) {
        if (j8 <= 0) {
            return;
        }
        a("K_pi_itl", j8);
    }

    public void i(boolean z7) {
        a("k_is_rep_wf", z7);
    }

    public void j(boolean z7) {
        a("k_ig_u_a", z7);
    }

    public void a(String str) {
        a("k_cu_p_ver_n", str);
    }

    public final String b(String str, String str2) {
        return this.f10733c.getString(str, str2);
    }

    public void c(boolean z7) {
        a("k_is_rep_im_e", z7);
    }

    public void d(String str) {
        a("k_rep_al", str);
    }

    public void e(String str) {
        a("k_rep_f_if", str);
    }

    public void f(String str) {
        a("k_last_ds_d", str);
    }

    public void g(String str) {
        a("k_gd_p", str);
    }

    public void h(boolean z7) {
        a("k_is_rep_o_i", z7);
    }

    public final void a(String str, int i8) {
        this.f10734d.putInt(str, i8);
        this.f10734d.commit();
    }

    public void b(int i8) {
        if (i8 <= 0) {
            return;
        }
        a("k_t_c_p", i8);
    }

    public boolean c() {
        return b("k_is_rp_mgc", false);
    }

    public void d(boolean z7) {
        a("k_is_rp_rg_crc", z7);
    }

    public void e(boolean z7) {
        a("k_is_rep_lc_4_p", z7);
    }

    public void f(boolean z7) {
        a("k_is_rep_ad", z7);
    }

    public void g(boolean z7) {
        a("k_is_rep_im_c", z7);
    }

    public final void a(String str, long j8) {
        this.f10734d.putLong(str, j8);
        this.f10734d.commit();
    }

    public void b(long j8) {
        if (j8 <= 0) {
            return;
        }
        a("k_pull_p_itl", j8);
    }

    public final void a(String str, String str2) {
        this.f10734d.putString(str, str2);
        this.f10734d.commit();
    }

    public void b(String str) {
        a("k_ply_s_n", str);
    }

    public final void a(String str, boolean z7) {
        this.f10734d.putBoolean(str, z7);
        this.f10734d.commit();
    }

    public void b(boolean z7) {
        a("k_is_rep_im_m", z7);
    }

    public void a(boolean z7) {
        a("k_is_rep_m", z7);
    }

    public final boolean b(String str, boolean z7) {
        return this.f10733c.getBoolean(str, z7);
    }
}
