package com.baidu.mshield.rp.e.a;

import android.content.Context;
import android.text.TextUtils;
import com.baidu.mshield.utility.d;
import com.google.android.exoplayer2.upstream.CmcdHeadersFactory;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public class a {

    /* renamed from: a, reason: collision with root package name */
    public Context f8363a;

    public a(Context context) {
        this.f8363a = context;
    }

    public boolean a(String str, String str2, String str3) {
        String str4;
        if (TextUtils.isEmpty(str)) {
            return true;
        }
        com.baidu.mshield.b.c.a.b("report from" + str3);
        com.baidu.mshield.b.c.a.b("sj-trigger report" + str);
        try {
            if (TextUtils.isEmpty(str2)) {
                str4 = null;
            } else {
                str4 = "&topic=" + str2;
            }
            String str5 = str4;
            String str6 = com.baidu.mshield.utility.a.f(this.f8363a) + "p/1/r";
            com.baidu.mshield.b.c.a.b("sj-trigger report" + str6);
            String a8 = d.a(this.f8363a, str6, str, false, false, str5);
            if (TextUtils.isEmpty(a8)) {
                return false;
            }
            return new JSONObject(a8).getInt("response") == 1;
        } catch (Throwable th) {
            com.baidu.mshield.utility.a.a(th);
            return true;
        }
    }

    public void a() {
        try {
            JSONObject jSONObject = new JSONObject(d.a(this.f8363a, com.baidu.mshield.utility.a.f(this.f8363a) + "p/1/rs", false, true)).getJSONObject("c");
            com.baidu.mshield.sharedpreferences.a a8 = com.baidu.mshield.sharedpreferences.a.a(this.f8363a);
            int optInt = jSONObject.optInt("n");
            if (optInt > 0) {
                a8.i(optInt);
            }
            int optInt2 = jSONObject.optInt(CmcdHeadersFactory.OBJECT_TYPE_INIT_SEGMENT);
            if (optInt2 > 0) {
                a8.m(optInt2);
            }
            int optInt3 = jSONObject.optInt("i2");
            if (optInt3 > 0) {
                a8.l(optInt3);
            }
            int optInt4 = jSONObject.optInt("w");
            if (optInt4 > 0) {
                a8.h(optInt4);
            }
            if (jSONObject.optInt("s1") > 0) {
                a8.j(jSONObject.optInt("s1"));
            }
            int optInt5 = jSONObject.optInt("s2");
            if (optInt5 > 0) {
                a8.f(optInt5);
            }
            int optInt6 = jSONObject.optInt("t");
            if (optInt6 > 0) {
                a8.k(optInt6);
            }
            int optInt7 = jSONObject.optInt("l1");
            if (optInt7 > 0) {
                a8.n(optInt7);
            }
            int optInt8 = jSONObject.optInt("l2");
            if (optInt8 > 0) {
                a8.o(optInt8);
            }
        } catch (Throwable th) {
            com.baidu.mshield.utility.a.a(th);
        }
    }
}
