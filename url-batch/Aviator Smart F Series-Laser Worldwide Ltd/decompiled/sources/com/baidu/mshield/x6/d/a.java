package com.baidu.mshield.x6.d;

import android.content.Context;
import android.os.Handler;
import android.text.TextUtils;
import android.util.Base64;
import com.baidu.mshield.b.d.c;
import com.baidu.mshield.b.f.e;
import com.baidu.mshield.x6.f.f;
import com.baidu.mshield.x6.f.h;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public class a extends com.baidu.mshield.b.d.a {

    /* renamed from: c, reason: collision with root package name */
    public b f8526c;

    public a(Context context, Handler handler) {
        super(context, handler);
        this.f8316b = context;
        this.f8526c = b.a(context);
    }

    public String a(String str) {
        com.baidu.mshield.x6.b.b bVar;
        String a8;
        String c8;
        try {
            bVar = new com.baidu.mshield.x6.b.b(this.f8316b);
            try {
                try {
                    try {
                        a8 = h.a(16);
                        c8 = this.f8526c.c(a8);
                    } catch (c unused) {
                        com.baidu.mshield.b.c.a.a("getCheckZipResponse:NetworkErrorWrongResponseCodeException");
                        if (bVar.F() == 0) {
                            bVar.d(-3);
                        }
                        return "";
                    }
                } catch (Throwable th) {
                    f.b(th);
                    return "";
                }
            } catch (InterruptedException e8) {
                bVar.m(0);
                f.b(e8);
                return "";
            }
        } catch (Throwable th2) {
            f.b(th2);
        }
        if (TextUtils.isEmpty(c8)) {
            return "";
        }
        String a9 = a(c8, h.b(com.baidu.mshield.b.a.c.a(str.getBytes()), a8.getBytes()));
        com.baidu.mshield.b.c.a.a("getCheckZipResponse:" + a9);
        if (TextUtils.isEmpty(a9)) {
            return "";
        }
        bVar.j("");
        bVar.a(0);
        bVar.w("");
        bVar.i(0);
        bVar.x("");
        bVar.m(1);
        try {
            JSONObject jSONObject = new JSONObject(a9);
            String string = jSONObject.getString("data");
            com.baidu.mshield.b.c.a.a("dataStr:" + string);
            String string2 = jSONObject.getString("skey");
            if (string != null && string2 != null) {
                String str2 = new String(h.a(Base64.decode(string, 0), h.c(Base64.decode(string2.getBytes(), 0), e.a(com.baidu.mshield.utility.c.b(this.f8316b)).getBytes())));
                com.baidu.mshield.b.c.a.a("dataDecrypt:" + str2);
                return str2;
            }
            return "";
        } catch (Throwable th3) {
            f.b(th3);
            if (bVar.F() == 0) {
                bVar.d(-3);
            }
            return "";
        }
    }

    public String b(String str) {
        String a8;
        String a9;
        try {
            try {
                a8 = h.a(16);
                a9 = this.f8526c.a(a8);
            } catch (Throwable th) {
                f.b(th);
                return "";
            }
        } catch (Throwable th2) {
            f.b(th2);
        }
        if (TextUtils.isEmpty(a9)) {
            return "";
        }
        String a10 = a(a9, h.b(com.baidu.mshield.b.a.c.a(str.getBytes()), a8.getBytes()));
        com.baidu.mshield.b.c.a.a("getBdid:" + a10);
        if (TextUtils.isEmpty(a10)) {
            return "";
        }
        try {
            JSONObject jSONObject = new JSONObject(a10);
            String string = jSONObject.getString("data");
            com.baidu.mshield.b.c.a.a("dataStr:" + string);
            String string2 = jSONObject.getString("skey");
            if (string != null && string2 != null) {
                String str2 = new String(h.a(Base64.decode(string, 0), h.c(Base64.decode(string2.getBytes(), 0), e.a(com.baidu.mshield.utility.c.b(this.f8316b)).getBytes())));
                com.baidu.mshield.b.c.a.a("dataDecrypt:" + str2);
                return str2;
            }
            return "";
        } catch (Throwable th3) {
            f.b(th3);
            return "";
        }
    }

    public String c(String str) {
        String str2;
        String a8;
        String b8;
        try {
            try {
                a8 = h.a(16);
                b8 = this.f8526c.b(a8);
            } catch (Throwable th) {
                f.b(th);
                str2 = "";
            }
            if (TextUtils.isEmpty(b8)) {
                return "";
            }
            byte[] b9 = h.b(com.baidu.mshield.b.a.c.a(str.getBytes()), a8.getBytes());
            com.baidu.mshield.b.c.a.a("getCharacter:" + b8);
            str2 = a(b8, b9);
            com.baidu.mshield.b.c.a.a("getCharacter resp:" + str2);
            if (TextUtils.isEmpty(str2)) {
                return "";
            }
            try {
                JSONObject jSONObject = new JSONObject(str2);
                String optString = jSONObject.optString("skey");
                String str3 = new String(h.a(Base64.decode(jSONObject.optString("data").getBytes(), 0), h.c(Base64.decode(optString.getBytes(), 0), e.a(com.baidu.mshield.utility.c.b(this.f8316b)).getBytes())));
                if (TextUtils.isEmpty(str3)) {
                    return "";
                }
                com.baidu.mshield.b.c.a.a("getCharacter sdata:" + str3);
                return str3;
            } catch (Throwable th2) {
                f.b(th2);
                return "";
            }
        } catch (Throwable th3) {
            f.b(th3);
            return "";
        }
    }
}
