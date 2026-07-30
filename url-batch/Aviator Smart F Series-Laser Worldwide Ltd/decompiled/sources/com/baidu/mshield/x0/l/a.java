package com.baidu.mshield.x0.l;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import androidx.exifinterface.media.ExifInterface;
import com.baidu.mshield.x0.d.d;
import com.my.lib.data.ErrorCode;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public class a {

    /* renamed from: a, reason: collision with root package name */
    public SharedPreferences f8484a;

    /* renamed from: b, reason: collision with root package name */
    public SharedPreferences.Editor f8485b;

    /* renamed from: c, reason: collision with root package name */
    public SharedPreferences f8486c;

    /* renamed from: d, reason: collision with root package name */
    public SharedPreferences f8487d;

    /* renamed from: e, reason: collision with root package name */
    public SharedPreferences.Editor f8488e;

    public a(Context context) {
        try {
            SharedPreferences sharedPreferences = context.getSharedPreferences("msgzpfc", 4);
            this.f8484a = sharedPreferences;
            this.f8485b = sharedPreferences.edit();
            this.f8486c = context.getSharedPreferences("msre_po_rt", 4);
            SharedPreferences sharedPreferences2 = context.getSharedPreferences("msfffppcfg", 4);
            this.f8487d = sharedPreferences2;
            this.f8488e = sharedPreferences2.edit();
        } catch (Throwable th) {
            d.a(th);
        }
    }

    public void a(String str, String str2) {
        this.f8485b.putString(str, str2);
        this.f8485b.commit();
    }

    public void b(String str, String str2) {
        this.f8485b.putString(str, str2);
        this.f8485b.commit();
    }

    public String c(String str) {
        return this.f8484a.getString(str, "");
    }

    public void d(int i8) {
        this.f8485b.putInt("pl_p_p_itl", i8);
        this.f8485b.commit();
    }

    public void e(int i8) {
        this.f8485b.putInt("rst", i8);
        this.f8485b.commit();
    }

    public void f(long j8) {
        this.f8488e.putLong("g_u_tk_ti", j8);
        this.f8488e.apply();
    }

    public void g(String str) {
        this.f8485b.putString("se-s-v", str);
        this.f8485b.commit();
    }

    public long h() {
        return this.f8484a.getLong("l_apd_ti", 0L);
    }

    public long i() {
        return this.f8484a.getLong("la_ice_in_t", 0L);
    }

    public long j() {
        return this.f8484a.getLong("pl_l_p_p_t", 0L);
    }

    public String k() {
        return this.f8486c.getString("re_a_lc", "");
    }

    public int l() {
        JSONObject optJSONObject;
        try {
            String c8 = c("plc62");
            if (!TextUtils.isEmpty(c8) && (optJSONObject = new JSONObject(c8).optJSONObject(ExifInterface.GPS_MEASUREMENT_3D)) != null) {
                return optJSONObject.optInt("2", 1);
            }
        } catch (Throwable th) {
            d.a(th);
        }
        return 1;
    }

    public int m() {
        return this.f8484a.getInt("pl_p_p_itl", com.crrepa.band.my.device.customkey.util.c.MAX_GOAL_TIME);
    }

    public long n() {
        return this.f8484a.getLong("s_al_tri_t", 0L);
    }

    public long o() {
        return this.f8487d.getLong("g_u_tk_ti", 0L);
    }

    public String p() {
        return this.f8484a.getString("xgz_wl_sha1", "");
    }

    public void c(long j8) {
        this.f8485b.putLong("pl_l_p_p_t", j8);
        this.f8485b.commit();
    }

    public void a(boolean z7) {
        this.f8485b.putBoolean("s_ph_pl", z7);
        this.f8485b.putLong("s_p_p_t", System.currentTimeMillis());
        this.f8485b.commit();
    }

    public String b(String str) {
        return this.f8484a.getString(str, "");
    }

    public String d(String str) {
        return this.f8484a.getString("re_net_ali4_" + str, "");
    }

    public List<b> e() {
        String string = this.f8486c.getString("re_con", "");
        com.baidu.mshield.b.c.a.b("re_con==" + string);
        if (TextUtils.isEmpty(string)) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        try {
            for (String str : string.split("\\|\\|")) {
                if (!TextUtils.isEmpty(str)) {
                    b a8 = b.a(str);
                    if (a8 == null) {
                        com.baidu.mshield.b.c.a.b("re_con==empty");
                    } else {
                        com.baidu.mshield.b.c.a.b("re_con==" + a8.toString());
                        arrayList.add(a8);
                    }
                }
            }
        } catch (Throwable th) {
            d.a(th);
        }
        return arrayList;
    }

    public void f(int i8) {
        this.f8485b.putInt("wm_d_c_s", i8);
        this.f8485b.commit();
    }

    public void g(int i8) {
        this.f8485b.putInt("wm_in_ma_cco", i8);
        this.f8485b.commit();
    }

    public void b(int i8) {
        this.f8485b.putInt("cloud_sw", i8);
        this.f8485b.commit();
    }

    public void c(String str, String str2) {
        this.f8485b.putString("re_net_ali4_" + str, str2);
        this.f8485b.commit();
    }

    public void d(long j8) {
        this.f8485b.putLong("po_fe_su_la_tm", j8);
        this.f8485b.commit();
    }

    public void f(String str) {
        this.f8485b.putString("a_de_ti_in_tm", str);
        this.f8485b.commit();
    }

    public int g() {
        JSONObject optJSONObject;
        try {
            String c8 = c("plc03");
            if (!TextUtils.isEmpty(c8) && (optJSONObject = new JSONObject(c8).optJSONObject(ErrorCode.PARAMETER_ERROR)) != null) {
                return optJSONObject.optInt("1", 1);
            }
        } catch (Throwable th) {
            d.a(th);
        }
        return 1;
    }

    public String a() {
        return this.f8486c.getString("li_pk_s", "");
    }

    public int b() {
        return this.f8484a.getInt("apd_inte", 24);
    }

    public String c() {
        return this.f8486c.getString("re_a_cv", "");
    }

    public boolean d() {
        return this.f8484a.getInt("cloud_sw", 0) == 1;
    }

    public String a(String str) {
        return this.f8486c.getString("al_da" + str, "");
    }

    public void b(long j8) {
        this.f8485b.putLong("la_ice_in_t", j8);
        this.f8485b.commit();
    }

    public void c(int i8) {
        this.f8485b.putInt("ice_inv_int", i8);
        this.f8485b.commit();
    }

    public int f() {
        return this.f8484a.getInt("ice_inv_int", 60);
    }

    public void a(int i8) {
        this.f8485b.putInt("apd_inte", i8);
        this.f8485b.commit();
    }

    public void a(long j8) {
        this.f8485b.putLong("l_apd_ti", j8);
        this.f8485b.commit();
    }

    public void e(long j8) {
        this.f8485b.putLong("s_al_tri_t", j8);
        this.f8485b.commit();
    }

    public void e(String str) {
        this.f8485b.putString("apd_taid", str);
        this.f8485b.commit();
    }
}
