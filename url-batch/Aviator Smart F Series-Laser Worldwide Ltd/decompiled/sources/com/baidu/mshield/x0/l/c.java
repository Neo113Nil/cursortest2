package com.baidu.mshield.x0.l;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import android.util.Base64;
import cn.hutool.core.util.l;
import com.baidu.mshield.ac.F;
import com.baidu.mshield.x0.d.d;

/* loaded from: classes2.dex */
public class c {

    /* renamed from: a, reason: collision with root package name */
    public SharedPreferences f8494a;

    /* renamed from: b, reason: collision with root package name */
    public SharedPreferences.Editor f8495b;

    /* renamed from: c, reason: collision with root package name */
    public SharedPreferences f8496c;

    /* renamed from: d, reason: collision with root package name */
    public SharedPreferences.Editor f8497d;

    public c(Context context) {
        try {
            SharedPreferences platformSharedSharedPreferences = F.getInstance().getPlatformSharedSharedPreferences(context);
            this.f8494a = platformSharedSharedPreferences;
            this.f8495b = platformSharedSharedPreferences.edit();
            SharedPreferences platformPrivateSharedPreferences = F.getInstance().getPlatformPrivateSharedPreferences(context);
            this.f8496c = platformPrivateSharedPreferences;
            this.f8497d = platformPrivateSharedPreferences.edit();
        } catch (Throwable th) {
            d.a(th);
        }
    }

    public String a() {
        return this.f8494a.getString("s_h_d_id", "");
    }

    public String b() {
        return this.f8494a.getString("rpnewuid", "");
    }

    public String c() {
        String string = this.f8494a.getString("rpnewuidn", "");
        if (TextUtils.isEmpty(string)) {
            return "";
        }
        try {
            return new String(com.baidu.mshield.b.f.a.a(Base64.decode(string, 10), com.baidu.mshield.b.f.a.a(24)), l.UTF_8);
        } catch (Throwable th) {
            d.a(th);
            return "";
        }
    }

    public String d() {
        return this.f8494a.getString("xytk", "");
    }

    public void e(String str) {
        this.f8495b.putString("xytk2", str);
        this.f8495b.apply();
    }

    public void f(String str) {
        this.f8495b.putString("sgud", str);
        this.f8495b.commit();
    }

    public void a(String str) {
        this.f8495b.putString("rpnewuid", str);
        this.f8495b.commit();
    }

    public void b(String str) {
        if (TextUtils.isEmpty(str)) {
            this.f8495b.putString("rpnewuidn", "");
            this.f8495b.commit();
            return;
        }
        try {
            this.f8495b.putString("rpnewuidn", new String(Base64.encode(com.baidu.mshield.b.f.a.b(str.getBytes(l.UTF_8), com.baidu.mshield.b.f.a.a(24)), 10), l.UTF_8));
            this.f8495b.commit();
        } catch (Throwable th) {
            d.a(th);
        }
    }

    public void d(String str) {
        this.f8495b.putString("xytk", str);
        this.f8495b.apply();
    }

    public String e() {
        return this.f8494a.getString("xytk2", "");
    }

    public String f() {
        return this.f8494a.getString("sgud", "");
    }

    public void c(String str) {
        this.f8497d.putString("p_s_p_c", str);
        this.f8497d.commit();
    }
}
